package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface pc {
   String[] F;

   static {
      long var9 = ess.a(-6177174323577120134L, -4999926781571156874L, MethodHandles.lookup().lookupClass()).a(114929790524349L) ^ 69216883860710L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[78];
      int var6 = 0;
      String var5 = "\u0000i¸h×\u001eÌ\u009eÅíLã¤Ä/<3óO\u008c£úªÝ\u0010ö\u009c\rOæÄp½@\u009a ÇR¡*\u008e\u0010Ý#\r±\u0082\u0012µ.\u0000úêq|ØH\u0091 âÃ\u0003\r\u009e(\u009bS\u001eÃÆ\u0092)E\u0000µú\u008aÇÖ\u0097ûM?\u0005\u0082&\u001d±öÔg\b\b\u0083oè\u0092Z^\u0089\bY_]§·v|Ñ\b\u0001r¹_é\u0013ó\u0086\u0018\u009e¿`\\<Ø[)e´\u0016\u009ej\u0092\u0091µE\u008f|è+å\u009aï\b1)<\u009c\u0019\u0006i=\u0010À\u0089¿%^Ê\u008dóxû\u001aæ-Ë'\u0099\u0010\u0012\u008fLj4Pì\u0089t¯¦\u0019í\u008f\\N\b[êZË\u008eÿ\u009eu\u0010öI}éxáü×HÇY\b\u001aH\u00866\u0010h\u001d\u0014\u008e>£\u008e\u008c\u008d¢z\u008a%\\³C\u0018\u009e¿`\\<Ø[)e´\u0016\u009ej\u0092\u0091µ¶ÕjÜaQ\u009cé\bÐ¸\u009eì\n\b\u008cË\b\u0094\u0091ý¨¤w«H\bh³\u009e\u009fÓß@9\bEYAÄ\u008cª>\u0019\bÝ*Hy \u000b:\u001c\u0010ÓÎ¾\t\u0099\u0084O\u0007ä\u008aFQ@Ó\u0019_\b\u0001r¹_é\u0013ó\u0086\u0010x\u001dÐoL\u000eS\u001f0o2\u008f³æ\u0082Û\u0018.\u0013Ì®¤¼=d\u0019«ù`¡k×·Mæ\u0015ð\u008a\u000f\"À\u0010ìÕQïóB=tÖ¼\u0017øìMÅ÷\u0010¼W|\r\u0082û± MNc\u0093\u0090U\u008e½\u0018ñ\b\u00034¿â<·Ê\"éEfO\u0000ÁmùC\u0010\u0096Èß8\b\u0095T:óéAÓ\u0005\bp±r4öhß\u009e\u0010úxúë¹Ã@\u0095Û\u0083\" À\u0093ûF\u0018\u009a½\u0087mÎñ\u0081\u0005ÈU[\u008e¿©D\t\u0096\u0002Y9íÄç¥\u0018\u009e¿`\\<Ø[)ÁHGÚ\u00ad¥\u0010\u0004Q+\u0081©\u001c\u0088#A\b\u0006FÒ\u001cé\u0002qÿ\bÎEXMuaZ1\bcû\u009f\u0098\u009e¯ \u008b\b²e±IFJ\u0096|\u0010§\rÖ\u008ez·¤\u0094¬ó~¦Ê¥n\u0088\u0010Í\u00971:\u0000¿e\u001bö\u0003\u0005\nv\u0081Bµ\b\u0017²\u001e\t%n\u001e\u0014\u0010\u009dJð\u00adÑ!m\u0018Î\u0083\u0093\u009f\u0005¸+ã\u0018±×JÜ}ã\u00adqÂùJ\u0003<ÖÞ\u0087ÄüDåß#\u0011Æ\b÷ÞY ,«FM\u00105\u0082\u008eÙ\u0002Ò§gäDCT\u009e±\u0001\u0007\u0010Ì\u0013ÎÖá$\u0011÷`Íå69þÇë\u0010*ì%.£\u008d¢J5Ú\u009ciª\u0085^\u007f\u0010¤r¢×~Ðüò\u0082R\u0083øÏØðå\beÌyÎà}{ñ\u00102+ärº¼«ú\u0086îñE\n\tñX \u0015·\u008c;çb;Y\u008eáË\u0087ò¼¸-D\u0096\u0018m«Ò@B4\u0015Z\u008e-¯i\u000b\bh\u0097!~¿\u009dW\u009a\u0010ÙQ\bë=yZýÄseõ\u009cÔ$í\b\u008dí\u008f(ù\u008e\rù\b®¨|¶SX\u0082d\bá\u0092ûô£\u00926²\u0010\u0081\u00043\u001f\"\u00119O\f\u00ad×u%'Çg\bZûâ½-¥{\b\bü\u0087l·M\u009a\u0016ù\u0010Ðt@&kÔØ\u00adcåÐ\u0001ôVnÙ\b&A\u00ad¯÷BÙN\u0010bÔÍÇÓ\u0093\u009b\u008f\u009cÐ:¥8CôS\u0010ztÊÉ\u0016P|\u000f\u0097\fËû/\u0012\u0002õ\u0010éø\u0098iT\u008b6\u0017\u0001\u008d×\u0099\u0007c\u008ag\u0010XÙü\u0015î\u0080Å.ÉÎa:Ê\u0013T³\u0018\u0000i¸h×\u001eÌ\u009eÅíLã¤Ä/<\u0096¥_íª`þ\u0013\bh\u0097!~¿\u009dW\u009a\b^¦¶,îõ®q\u0010èak\u0015¡\u001a¼]Ä\u0086B7ÛË})\u0010¹?Û\u0097\u009aõ\u001ew\u009fÞä\u000f6\u008fûÛ\b×L30û\u0087\u001eo\bì±¼*áÞ¨*\u0010+\u008d¸Ç¯0\u009dÌ2cY=ÌP;Ò\u0018ã@$Ü\fû5\u001bw´/ó\u0013/\u009fl\u0014\u007f\u008bw\u001b+³g\u0010ÿ\u0090=$\u008a\u0091\u001dÅÜ=\u008dã\tì©A\u0010J\u0099üÂ÷¥=q¾ V1'¹ÁÉ\u0018¦\u0093ÞxÂ¡z!äÖ\u000e©>\u0081=gX°ÇÕZÒ:\u0019\u00184Æív²\u008am\u0007\u0002\u0099\u0019¼3a\u001eS\u0014÷¦\u0096cg#]";
      int var7 = "\u0000i¸h×\u001eÌ\u009eÅíLã¤Ä/<3óO\u008c£úªÝ\u0010ö\u009c\rOæÄp½@\u009a ÇR¡*\u008e\u0010Ý#\r±\u0082\u0012µ.\u0000úêq|ØH\u0091 âÃ\u0003\r\u009e(\u009bS\u001eÃÆ\u0092)E\u0000µú\u008aÇÖ\u0097ûM?\u0005\u0082&\u001d±öÔg\b\b\u0083oè\u0092Z^\u0089\bY_]§·v|Ñ\b\u0001r¹_é\u0013ó\u0086\u0018\u009e¿`\\<Ø[)e´\u0016\u009ej\u0092\u0091µE\u008f|è+å\u009aï\b1)<\u009c\u0019\u0006i=\u0010À\u0089¿%^Ê\u008dóxû\u001aæ-Ë'\u0099\u0010\u0012\u008fLj4Pì\u0089t¯¦\u0019í\u008f\\N\b[êZË\u008eÿ\u009eu\u0010öI}éxáü×HÇY\b\u001aH\u00866\u0010h\u001d\u0014\u008e>£\u008e\u008c\u008d¢z\u008a%\\³C\u0018\u009e¿`\\<Ø[)e´\u0016\u009ej\u0092\u0091µ¶ÕjÜaQ\u009cé\bÐ¸\u009eì\n\b\u008cË\b\u0094\u0091ý¨¤w«H\bh³\u009e\u009fÓß@9\bEYAÄ\u008cª>\u0019\bÝ*Hy \u000b:\u001c\u0010ÓÎ¾\t\u0099\u0084O\u0007ä\u008aFQ@Ó\u0019_\b\u0001r¹_é\u0013ó\u0086\u0010x\u001dÐoL\u000eS\u001f0o2\u008f³æ\u0082Û\u0018.\u0013Ì®¤¼=d\u0019«ù`¡k×·Mæ\u0015ð\u008a\u000f\"À\u0010ìÕQïóB=tÖ¼\u0017øìMÅ÷\u0010¼W|\r\u0082û± MNc\u0093\u0090U\u008e½\u0018ñ\b\u00034¿â<·Ê\"éEfO\u0000ÁmùC\u0010\u0096Èß8\b\u0095T:óéAÓ\u0005\bp±r4öhß\u009e\u0010úxúë¹Ã@\u0095Û\u0083\" À\u0093ûF\u0018\u009a½\u0087mÎñ\u0081\u0005ÈU[\u008e¿©D\t\u0096\u0002Y9íÄç¥\u0018\u009e¿`\\<Ø[)ÁHGÚ\u00ad¥\u0010\u0004Q+\u0081©\u001c\u0088#A\b\u0006FÒ\u001cé\u0002qÿ\bÎEXMuaZ1\bcû\u009f\u0098\u009e¯ \u008b\b²e±IFJ\u0096|\u0010§\rÖ\u008ez·¤\u0094¬ó~¦Ê¥n\u0088\u0010Í\u00971:\u0000¿e\u001bö\u0003\u0005\nv\u0081Bµ\b\u0017²\u001e\t%n\u001e\u0014\u0010\u009dJð\u00adÑ!m\u0018Î\u0083\u0093\u009f\u0005¸+ã\u0018±×JÜ}ã\u00adqÂùJ\u0003<ÖÞ\u0087ÄüDåß#\u0011Æ\b÷ÞY ,«FM\u00105\u0082\u008eÙ\u0002Ò§gäDCT\u009e±\u0001\u0007\u0010Ì\u0013ÎÖá$\u0011÷`Íå69þÇë\u0010*ì%.£\u008d¢J5Ú\u009ciª\u0085^\u007f\u0010¤r¢×~Ðüò\u0082R\u0083øÏØðå\beÌyÎà}{ñ\u00102+ärº¼«ú\u0086îñE\n\tñX \u0015·\u008c;çb;Y\u008eáË\u0087ò¼¸-D\u0096\u0018m«Ò@B4\u0015Z\u008e-¯i\u000b\bh\u0097!~¿\u009dW\u009a\u0010ÙQ\bë=yZýÄseõ\u009cÔ$í\b\u008dí\u008f(ù\u008e\rù\b®¨|¶SX\u0082d\bá\u0092ûô£\u00926²\u0010\u0081\u00043\u001f\"\u00119O\f\u00ad×u%'Çg\bZûâ½-¥{\b\bü\u0087l·M\u009a\u0016ù\u0010Ðt@&kÔØ\u00adcåÐ\u0001ôVnÙ\b&A\u00ad¯÷BÙN\u0010bÔÍÇÓ\u0093\u009b\u008f\u009cÐ:¥8CôS\u0010ztÊÉ\u0016P|\u000f\u0097\fËû/\u0012\u0002õ\u0010éø\u0098iT\u008b6\u0017\u0001\u008d×\u0099\u0007c\u008ag\u0010XÙü\u0015î\u0080Å.ÉÎa:Ê\u0013T³\u0018\u0000i¸h×\u001eÌ\u009eÅíLã¤Ä/<\u0096¥_íª`þ\u0013\bh\u0097!~¿\u009dW\u009a\b^¦¶,îõ®q\u0010èak\u0015¡\u001a¼]Ä\u0086B7ÛË})\u0010¹?Û\u0097\u009aõ\u001ew\u009fÞä\u000f6\u008fûÛ\b×L30û\u0087\u001eo\bì±¼*áÞ¨*\u0010+\u008d¸Ç¯0\u009dÌ2cY=ÌP;Ò\u0018ã@$Ü\fû5\u001bw´/ó\u0013/\u009fl\u0014\u007f\u008bw\u001b+³g\u0010ÿ\u0090=$\u008a\u0091\u001dÅÜ=\u008dã\tì©A\u0010J\u0099üÂ÷¥=q¾ V1'¹ÁÉ\u0018¦\u0093ÞxÂ¡z!äÖ\u000e©>\u0081=gX°ÇÕZÒ:\u0019\u00184Æív²\u008am\u0007\u0002\u0099\u0019¼3a\u001eS\u0014÷¦\u0096cg#]"
         .length();
      char var4 = 24;
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
                     F = new String[]{
                        var0[34],
                        var0[51],
                        var0[35],
                        var0[52],
                        var0[4],
                        var0[38],
                        var0[69],
                        var0[14],
                        var0[5],
                        var0[40],
                        var0[64],
                        var0[49],
                        var0[31],
                        var0[24],
                        var0[68],
                        var0[17],
                        var0[18],
                        var0[32],
                        var0[11],
                        var0[19],
                        var0[46],
                        var0[15],
                        var0[55],
                        var0[41],
                        var0[56],
                        var0[76],
                        var0[28],
                        var0[33],
                        var0[8],
                        var0[65],
                        var0[77],
                        var0[16],
                        var0[58],
                        var0[53],
                        var0[39],
                        var0[60],
                        var0[42],
                        var0[10],
                        var0[20],
                        var0[1],
                        var0[54],
                        var0[44],
                        var0[43],
                        var0[9],
                        var0[73],
                        var0[61],
                        var0[12],
                        var0[66],
                        var0[62],
                        var0[2],
                        var0[13],
                        var0[72],
                        var0[25],
                        var0[37],
                        var0[45],
                        var0[22],
                        var0[59],
                        var0[67],
                        var0[36],
                        var0[47],
                        var0[70],
                        var0[29],
                        var0[57],
                        var0[50],
                        var0[71],
                        var0[75],
                        var0[26],
                        var0[0],
                        var0[63],
                        var0[30],
                        var0[3],
                        var0[48],
                        var0[21],
                        var0[6],
                        var0[7],
                        var0[23],
                        var0[74],
                        var0[27]
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

                  var5 = "\u00902úVê;è_\b»\nÞ\u0018-ò#e";
                  var7 = "\u00902úVê;è_\b»\nÞ\u0018-ò#e".length();
                  var4 = '\b';
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
