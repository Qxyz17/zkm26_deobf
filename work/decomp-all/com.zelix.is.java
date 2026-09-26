package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class is extends oz {
   private static final is[] d;
   private static final long a = prr.a(3244972557013813165L, 1300793954113393562L, MethodHandles.lookup().lookupClass()).a(46796093893056L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public final boolean I(Object[] param1) {
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
      // 0c: ldc2_w -7914293985127998986
      // 0f: lload 2
      // 10: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: getfield com/zelix/is.X I
      // 1b: iload 4
      // 1d: ifeq 63
      // 20: tableswitch 66 2 8 54 54 54 54 54 54 54
      // 4c: ldc2_w -8226242938229767047
      // 4f: lload 2
      // 50: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: bipush 1
      // 57: ireturn
      // 58: ldc2_w -8226242938229767047
      // 5b: lload 2
      // 5c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
   }

   public static is Z(int var0) {
      return d[var0];
   }

   private hz i(Object[] var1) {
      int var7 = (Integer)var1[0];
      v7[] var4 = (v7[])var1[1];
      v7[] var5 = (v7[])var1[2];
      v7 var10 = (v7)var1[3];
      v7 var9 = (v7)var1[4];
      fb var8 = (fb)var1[5];
      long var2 = (Long)var1[6];
      Set var6 = (Set)var1[7];
      var2 = a ^ var2;
      long var11 = var2 ^ 71906973876570L;
      long var13 = var2 ^ 42877418416566L;
      v7[] var15 = v7.I(var7 - 1, var13);
      System.arraycopy(var4, 0, var15, 0, var7 - 2);
      var15[var7 - 2] = var9;
      return new hz(var15, var5, var11, var8, var6);
   }

   static {
      long var20 = a ^ 39734476457177L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "/Y×éíúFE\u0007H8Ä»÷\u0017Úþí´qæ\u0086rp§}jN\\\u0098\"\u001dX\u001eÜH\u0091\u008fË\u0081Ñ\u0013\"§Çe\u0095Ã\u0010\u001e~Æ\u001bí\u0001\u001d\u0085A`\u0006Ê¸\\wµ\u0010%ò\u0010ói\u0082ÖUßoïY?*cs";
      int var17 = "/Y×éíúFE\u0007H8Ä»÷\u0017Úþí´qæ\u0086rp§}jN\\\u0098\"\u001dX\u001eÜH\u0091\u008fË\u0081Ñ\u0013\"§Çe\u0095Ã\u0010\u001e~Æ\u001bí\u0001\u001d\u0085A`\u0006Ê¸\\wµ\u0010%ò\u0010ói\u0082ÖUßoïY?*cs"
         .length();
      char var14 = '0';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[5];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[199];
                     int var3 = 0;
                     String var4 = "~b#\u001boÃøé\u0011§\u001c¥F\u00111$\u0006\u000bs\u0093øÐ,o*¢CzÝ\u007fm\u0082;ÿÊ\u001c\u0093þ\u0084û\u001d©Ã\tã\u0080\u0087W÷MRUÓM×\u0012\tWßµøù$y\u000b\u009d¸ª]\u0006\u008eì\u0015«³îþ¾´À\u0092\u001fö\u0017\u0095a§\rad\r»W½t~à\f¥\u000ep\u0091²3\u0015L¥kV/åþ\u0097^Á\u001f§ã\u0005ì÷Àðh\u001c\n>\u0093\u008f©¾W¸\u0084ö*²9OÓ\u0092¯a\u009c\u001b\u0011Öf=\u0082Þ¸lãÑUS<À²E\u0013ÞS+\u0091\u0090µ\u0082kVãjG{»A6Óh\u001e\u008e³Ø8bø)P2\u0012ýÇ:0\u0096óç§}ènäÍe\u0087U\u001c\u0085±\u0002\u008cô}3ÿ\u0010îqxÚGêôôÖï²X]>}BDvÖðÔ8h@Áíâ®{\u0081Ü¢vÛÔ\u0003flõÑ\u0004\u0001\u0015;ü=Gr\u0096HÆ4Z\tèºc\u0086\\ wh\u000fqK|\u0090\r2\u0013\u0085EÒa}\u008a×ÈqhÒ~jßÖU?\u0014\u0081jK\u008cj\u008bMÙ¶\nzç\f\u0084(\u0007\u00960O\u00928\u0095Y%ý[Ê\u008a¯¶Î\u008d\n¾:µ.\u0096ÊY\u0001\u0097û\u009f)\bù\u0005*\bmD¨¬æ\u0084âóú\u007ffÀÄ¹F÷§ù¡MX\u0082\\]\u0088\u009cë\u001bS\u008f,¯Éë?zÀãÆÁIî ÜÑà\u0094,\u0001¸\u000fØ\u0090\u0083ÛZ¸/qu\u000b«5P\u009bbîÖ- ãj\u001f.Ì\r\u001ct\u0092RÝ7\u0002o.ÏûYV°è8\u0099ºBóÏ.\u0081\u0010\u0093\f·×8ù¸\u008f½\u0098¡ý®?spµ<\u0085,AÝE¥¡ä#|(\u008c¹\u009dGóöU2U1hY°Ú\u001f\b\u009cQê\u0099>!×\u0097\u008a8úO1÷ûînï¢ô§Á\u0096w4`\u0093\u009bÃ|\rSkØ\u0085x\u009e²k!`]r»ä½30«\u008e\u009aÄWÁX\fkÒîÔð¿¨ \u0001¤Ë\u008dy\u0092¨VÓ\u0018X\u0010\u00ad>,\u007f\u001c~ér(ÙëÍ¿9Ä\u009f{\u0006ùX\u009e¨+.\u0095\u008dì/\u0018\u001f\u0005\u009a«\u000e¼P+=f\u0082?ä¥\u009dº¼/ÿ\u009cÜj\u0006st?åÉ®\t¥y\u000báÄW\u0000:_>\u0083º%\u009aþ\u0010?²\u0002\u0094¸ÇØÉè}\u0091d\u0001\r\u0011J\u008c.\u0093^>\u0006¸\\Î\u008a\u0011Cø©\u001c\të\u0010\u0016\u008aÚ\u00042*°\u0095²ÉþK.\u0018¾Ï§Ï´¬\u00ad\u0018GÄ¥rÁá\u0080{\u007fümg}a\u0012¡,bU¥iV\u00892tÊ\u0016Ñ4¢·\u0004\u0095ûyF;+Üÿ:Ë\u008a '$ª\u000f©\u0014\u0084¨\u0002\u001fÛ\u008c\u0087\u0092Í%\u0087\rúWy\u0099Ã?M\u0095½Åh(¸J_ð\\_(\u0081\u008f:\u000f\u0099\u0015TÚjX]i´®\u00ad~ÖçI\u000b\u0002\u008bG\u0006Ý{\u0092\u0088*\u0084g\u0004\u0092!KÖÒ\u0098\u000fêY\u001b'\u0080Ë\u008c=9\u008a\u007fíbeÁÎÇRÐýM\u0096H\fL&2mÀøÊ2\u001cÒ@Ç\u0088ØÐY<ÿ\u0012Mð{»\u0007;¤'L\u0087\u008c6Ç\u0095\u0015\u0094éõéÊ¤D\u0085Ò§\u009b\u0000øôÑ\u001cýÀÍÛ\u000b\"\u0088ZZÕH_\u0096±¸¬\u0003\u0002\u0091\u0096qÌ¦?±¢ÞP×\u0018\u001c Q2n0vé\u0019](Ç\u009bÛæÜp\u0085ìâ¢/D/¥\u0001Ó\u001d3\u001aÛ?ü\u008a:~_Û\u0082\u000eª5²Xãe@Æ7\u001bÁO\u001cÓ<\u008bBìiê\u007ffey\u0014HÄÌ\u0097ë\u0094Ù\u0099wÒ%p¸ez\nÄC¥ú\u0005H\u008c)\u001dë%\u009daö\u009aÅF\u0011k\"\u001cZ³\u001aR8t\u0095\u0094D\n\u000bêÔÕ\u0014(¢ýè2ækÈ{\u0003Â¹\u0098\u0012Ç\u009e*\u0083Ø\u0005\u0012\u0097\u001c*\u001f\u0013\u007fwëÓ°M\u008aáZ\u0002\u0090µ7]\nÚ9ceOøä6\u0016\u0092)Z\tÄûWrQÌã¢Z\u008aPÆ\u0005Ì/\b~~ó\u0007\u0083\u001e\u008f\f#ä\u0083\\¹i\u000e\u0002§\u0003\u0000Í\u0091d3\u0004\u0098ç\u0006°æþiä\u009c£s¥Ñk\u0016û\u0014;y çY[g¼¸\u00046z\"eáa£\u0003\u0090\u001c-Î\u0092òBTÚU\u007fµüØ-\u008bP`-\u008aó¤`=d\u0096AÓK^è?p#(êÀ\t×ä?,\u0096uC\u008cªû\u008d\u0083\u0003\u001c\u0018\rÜ\u0007æ\u0090Ü,æ\u0011ñ£\u001cü\r&qä\u0014åÀ¤\u0082Ój×òD¼ãÄW\u0086yÒ¦\r\u001eòÆziwØS¨O²\u0006xs³\u001c\u0002\u0085\u000b0\u00903\u0088\u009b\u00ad\u0006¶\u0087¶&§ßDÛ³\u000bÉO5\u0098]gAôj·\"ð¦\u001eÞÓV´íç\u009586PäåÇüª'\u0006÷z\u0003\u009f\u001aq\u0006#å\u0092ÝZ-Vh\u008d*K/±\u0087{?¦\u001cÈ«â<\u0089<o7P\u001b\u009f\u0083ëÖq{\u0015\"ÌÝèrÿâå$â.eîEá'} \u009aBK&)pQñ\u008d\u0096b+\u0082ß\u0095]\u009f´\u0019¤*í\u0004\tò\u009a2øÇà/1qú9!\u001esó\u009d\u007fI·\u0090\u0018{èÆ!8\\\u0004«\u0092\fE¶\u008fëwË>RYp\u001e}°\u0099 nñQ\u009eT\u009bÑùsG\u0003ÓÅòº|~ËqcÊqÉ\u009dÑÃ¿øE\u0002ÿZ_]¢WÁ\u000fuz´wp\u008d\u0091G|è6Âuµ\u0011\u008df\u0080ø¨yÅB\u0096hpþ\b¾¿\u009d¹¤¬\u0086\u0007nD\r\u000e7\u001cdH.\t£\u0015\u0014YwyÐ\u0098ºuõ.ßv\u0013»\u0012ä7B#Ýç\u0085Á5³ú²";
                     int var5 = "~b#\u001boÃøé\u0011§\u001c¥F\u00111$\u0006\u000bs\u0093øÐ,o*¢CzÝ\u007fm\u0082;ÿÊ\u001c\u0093þ\u0084û\u001d©Ã\tã\u0080\u0087W÷MRUÓM×\u0012\tWßµøù$y\u000b\u009d¸ª]\u0006\u008eì\u0015«³îþ¾´À\u0092\u001fö\u0017\u0095a§\rad\r»W½t~à\f¥\u000ep\u0091²3\u0015L¥kV/åþ\u0097^Á\u001f§ã\u0005ì÷Àðh\u001c\n>\u0093\u008f©¾W¸\u0084ö*²9OÓ\u0092¯a\u009c\u001b\u0011Öf=\u0082Þ¸lãÑUS<À²E\u0013ÞS+\u0091\u0090µ\u0082kVãjG{»A6Óh\u001e\u008e³Ø8bø)P2\u0012ýÇ:0\u0096óç§}ènäÍe\u0087U\u001c\u0085±\u0002\u008cô}3ÿ\u0010îqxÚGêôôÖï²X]>}BDvÖðÔ8h@Áíâ®{\u0081Ü¢vÛÔ\u0003flõÑ\u0004\u0001\u0015;ü=Gr\u0096HÆ4Z\tèºc\u0086\\ wh\u000fqK|\u0090\r2\u0013\u0085EÒa}\u008a×ÈqhÒ~jßÖU?\u0014\u0081jK\u008cj\u008bMÙ¶\nzç\f\u0084(\u0007\u00960O\u00928\u0095Y%ý[Ê\u008a¯¶Î\u008d\n¾:µ.\u0096ÊY\u0001\u0097û\u009f)\bù\u0005*\bmD¨¬æ\u0084âóú\u007ffÀÄ¹F÷§ù¡MX\u0082\\]\u0088\u009cë\u001bS\u008f,¯Éë?zÀãÆÁIî ÜÑà\u0094,\u0001¸\u000fØ\u0090\u0083ÛZ¸/qu\u000b«5P\u009bbîÖ- ãj\u001f.Ì\r\u001ct\u0092RÝ7\u0002o.ÏûYV°è8\u0099ºBóÏ.\u0081\u0010\u0093\f·×8ù¸\u008f½\u0098¡ý®?spµ<\u0085,AÝE¥¡ä#|(\u008c¹\u009dGóöU2U1hY°Ú\u001f\b\u009cQê\u0099>!×\u0097\u008a8úO1÷ûînï¢ô§Á\u0096w4`\u0093\u009bÃ|\rSkØ\u0085x\u009e²k!`]r»ä½30«\u008e\u009aÄWÁX\fkÒîÔð¿¨ \u0001¤Ë\u008dy\u0092¨VÓ\u0018X\u0010\u00ad>,\u007f\u001c~ér(ÙëÍ¿9Ä\u009f{\u0006ùX\u009e¨+.\u0095\u008dì/\u0018\u001f\u0005\u009a«\u000e¼P+=f\u0082?ä¥\u009dº¼/ÿ\u009cÜj\u0006st?åÉ®\t¥y\u000báÄW\u0000:_>\u0083º%\u009aþ\u0010?²\u0002\u0094¸ÇØÉè}\u0091d\u0001\r\u0011J\u008c.\u0093^>\u0006¸\\Î\u008a\u0011Cø©\u001c\të\u0010\u0016\u008aÚ\u00042*°\u0095²ÉþK.\u0018¾Ï§Ï´¬\u00ad\u0018GÄ¥rÁá\u0080{\u007fümg}a\u0012¡,bU¥iV\u00892tÊ\u0016Ñ4¢·\u0004\u0095ûyF;+Üÿ:Ë\u008a '$ª\u000f©\u0014\u0084¨\u0002\u001fÛ\u008c\u0087\u0092Í%\u0087\rúWy\u0099Ã?M\u0095½Åh(¸J_ð\\_(\u0081\u008f:\u000f\u0099\u0015TÚjX]i´®\u00ad~ÖçI\u000b\u0002\u008bG\u0006Ý{\u0092\u0088*\u0084g\u0004\u0092!KÖÒ\u0098\u000fêY\u001b'\u0080Ë\u008c=9\u008a\u007fíbeÁÎÇRÐýM\u0096H\fL&2mÀøÊ2\u001cÒ@Ç\u0088ØÐY<ÿ\u0012Mð{»\u0007;¤'L\u0087\u008c6Ç\u0095\u0015\u0094éõéÊ¤D\u0085Ò§\u009b\u0000øôÑ\u001cýÀÍÛ\u000b\"\u0088ZZÕH_\u0096±¸¬\u0003\u0002\u0091\u0096qÌ¦?±¢ÞP×\u0018\u001c Q2n0vé\u0019](Ç\u009bÛæÜp\u0085ìâ¢/D/¥\u0001Ó\u001d3\u001aÛ?ü\u008a:~_Û\u0082\u000eª5²Xãe@Æ7\u001bÁO\u001cÓ<\u008bBìiê\u007ffey\u0014HÄÌ\u0097ë\u0094Ù\u0099wÒ%p¸ez\nÄC¥ú\u0005H\u008c)\u001dë%\u009daö\u009aÅF\u0011k\"\u001cZ³\u001aR8t\u0095\u0094D\n\u000bêÔÕ\u0014(¢ýè2ækÈ{\u0003Â¹\u0098\u0012Ç\u009e*\u0083Ø\u0005\u0012\u0097\u001c*\u001f\u0013\u007fwëÓ°M\u008aáZ\u0002\u0090µ7]\nÚ9ceOøä6\u0016\u0092)Z\tÄûWrQÌã¢Z\u008aPÆ\u0005Ì/\b~~ó\u0007\u0083\u001e\u008f\f#ä\u0083\\¹i\u000e\u0002§\u0003\u0000Í\u0091d3\u0004\u0098ç\u0006°æþiä\u009c£s¥Ñk\u0016û\u0014;y çY[g¼¸\u00046z\"eáa£\u0003\u0090\u001c-Î\u0092òBTÚU\u007fµüØ-\u008bP`-\u008aó¤`=d\u0096AÓK^è?p#(êÀ\t×ä?,\u0096uC\u008cªû\u008d\u0083\u0003\u001c\u0018\rÜ\u0007æ\u0090Ü,æ\u0011ñ£\u001cü\r&qä\u0014åÀ¤\u0082Ój×òD¼ãÄW\u0086yÒ¦\r\u001eòÆziwØS¨O²\u0006xs³\u001c\u0002\u0085\u000b0\u00903\u0088\u009b\u00ad\u0006¶\u0087¶&§ßDÛ³\u000bÉO5\u0098]gAôj·\"ð¦\u001eÞÓV´íç\u009586PäåÇüª'\u0006÷z\u0003\u009f\u001aq\u0006#å\u0092ÝZ-Vh\u008d*K/±\u0087{?¦\u001cÈ«â<\u0089<o7P\u001b\u009f\u0083ëÖq{\u0015\"ÌÝèrÿâå$â.eîEá'} \u009aBK&)pQñ\u008d\u0096b+\u0082ß\u0095]\u009f´\u0019¤*í\u0004\tò\u009a2øÇà/1qú9!\u001esó\u009d\u007fI·\u0090\u0018{èÆ!8\\\u0004«\u0092\fE¶\u008fëwË>RYp\u001e}°\u0099 nñQ\u009eT\u009bÑùsG\u0003ÓÅòº|~ËqcÊqÉ\u009dÑÃ¿øE\u0002ÿZ_]¢WÁ\u000fuz´wp\u008d\u0091G|è6Âuµ\u0011\u008df\u0080ø¨yÅB\u0096hpþ\b¾¿\u009d¹¤¬\u0086\u0007nD\r\u000e7\u001cdH.\t£\u0015\u0014YwyÐ\u0098ºuõ.ßv\u0013»\u0012ä7B#Ýç\u0085Á5³ú²"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    g = var6;
                                    h = new Integer[199];
                                    d = new is[c<"b">(19263, 378631531213417401L ^ var20)];
                                    d[0] = new is(0);
                                    d[1] = new is(1);
                                    d[2] = new is(2);
                                    d[3] = new is(3);
                                    d[4] = new is(4);
                                    d[5] = new is(5);
                                    d[c<"b">(27312, 2356267612373371599L ^ var20)] = new is(c<"b">(27312, 2356267612373371599L ^ var20));
                                    d[c<"b">(9295, 4395991081467642938L ^ var20)] = new is(c<"b">(23699, 2169738986591091928L ^ var20));
                                    d[c<"b">(22965, 263479549640047020L ^ var20)] = new is(c<"b">(20703, 4145043197260820717L ^ var20));
                                    d[c<"b">(27385, 2261484214412167799L ^ var20)] = new is(c<"b">(5112, 6260860617976132584L ^ var20));
                                    d[c<"b">(6318, 2105015416431917064L ^ var20)] = new is(c<"b">(7576, 116200686144208182L ^ var20));
                                    d[c<"b">(9887, 5994186739789465104L ^ var20)] = new is(c<"b">(23741, 2866474511679388850L ^ var20));
                                    d[c<"b">(21371, 8658311102317065141L ^ var20)] = new is(c<"b">(28968, 8008116988028571982L ^ var20));
                                    d[c<"b">(14357, 190212073964804286L ^ var20)] = new is(c<"b">(5338, 101247532372046936L ^ var20));
                                    d[c<"b">(4754, 5737970092536214033L ^ var20)] = new is(c<"b">(6907, 8837788839370701360L ^ var20));
                                    d[c<"b">(4116, 2506197743563550745L ^ var20)] = new is(c<"b">(29903, 29091554357564588L ^ var20));
                                    d[c<"b">(13610, 8082143443087234320L ^ var20)] = new is(c<"b">(6040, 1108261256642082719L ^ var20));
                                    d[c<"b">(6854, 8962279167770802763L ^ var20)] = new is(c<"b">(14030, 7574625048895493780L ^ var20));
                                    d[c<"b">(2632, 2067259096166574684L ^ var20)] = new is(c<"b">(21523, 7156665276430939147L ^ var20));
                                    d[c<"b">(32024, 9011191453092470147L ^ var20)] = new is(c<"b">(10843, 6781764097119226433L ^ var20));
                                    d[c<"b">(13046, 6709587598594708211L ^ var20)] = new is(c<"b">(4244, 4354692119232655360L ^ var20));
                                    d[c<"b">(5045, 3069709594250228631L ^ var20)] = new is(c<"b">(28338, 3119598371677163023L ^ var20));
                                    d[c<"b">(17008, 267996215889191650L ^ var20)] = new is(c<"b">(20052, 4394846537367678672L ^ var20));
                                    d[c<"b">(27539, 8208210838505736996L ^ var20)] = new is(c<"b">(26628, 161026125662701728L ^ var20));
                                    d[c<"b">(23, 8965315009226416263L ^ var20)] = new is(c<"b">(6755, 5421177602034875098L ^ var20));
                                    d[c<"b">(16939, 2713804906180207104L ^ var20)] = new is(c<"b">(30350, 7463952559027181124L ^ var20));
                                    d[c<"b">(16022, 795019410377317902L ^ var20)] = new is(c<"b">(19830, 1786606432231321037L ^ var20));
                                    d[c<"b">(17192, 8687291024212878114L ^ var20)] = new is(c<"b">(32600, 491029956789624607L ^ var20));
                                    d[c<"b">(20845, 7315616067734958566L ^ var20)] = new is(c<"b">(8694, 8981351443443810719L ^ var20));
                                    d[c<"b">(28642, 7011572277713686354L ^ var20)] = new is(c<"b">(27460, 3479767615032183615L ^ var20));
                                    d[c<"b">(21963, 3065058764226065750L ^ var20)] = new is(c<"b">(21355, 6932433445814465285L ^ var20));
                                    d[c<"b">(12628, 6819134605312856330L ^ var20)] = new is(c<"b">(3143, 2667666176427076655L ^ var20));
                                    d[c<"b">(26929, 9215346146729380233L ^ var20)] = new is(c<"b">(12009, 2624186055165316816L ^ var20));
                                    d[c<"b">(5431, 4674431466210899249L ^ var20)] = new is(c<"b">(764, 3275797682919776948L ^ var20));
                                    d[c<"b">(30781, 338186161136883818L ^ var20)] = new is(c<"b">(28190, 8078859244615978599L ^ var20));
                                    d[c<"b">(74, 2044267368359960806L ^ var20)] = new is(c<"b">(30362, 889385756279559880L ^ var20));
                                    d[c<"b">(29330, 2211524313188323990L ^ var20)] = new is(c<"b">(20400, 6054538897782829041L ^ var20));
                                    d[c<"b">(32486, 8367919498545028848L ^ var20)] = new is(c<"b">(5441, 7558508877376468464L ^ var20));
                                    d[c<"b">(18190, 7586369750372313008L ^ var20)] = new is(c<"b">(29663, 1563775545295164339L ^ var20));
                                    d[c<"b">(12006, 1491525468887682639L ^ var20)] = new is(c<"b">(21904, 5640931887961765164L ^ var20));
                                    d[c<"b">(13973, 3205024713138083328L ^ var20)] = new is(c<"b">(20400, 5814148485913669505L ^ var20));
                                    d[c<"b">(25432, 7608780227026437102L ^ var20)] = new is(c<"b">(12957, 3368038682746688204L ^ var20));
                                    d[c<"b">(1359, 7053971922320238061L ^ var20)] = new is(c<"b">(22126, 6398408949940156109L ^ var20));
                                    d[c<"b">(5075, 8746603568176509867L ^ var20)] = new is(c<"b">(28939, 2823248462215762330L ^ var20));
                                    d[c<"b">(12950, 8859291805062075098L ^ var20)] = new is(c<"b">(1346, 5805355856671647086L ^ var20));
                                    d[c<"b">(14046, 4828257820204930730L ^ var20)] = new is(c<"b">(6636, 4170485274059389365L ^ var20));
                                    d[c<"b">(4265, 2594407184784371930L ^ var20)] = new is(c<"b">(3814, 5271040092011441748L ^ var20));
                                    d[c<"b">(13027, 5925916564476662520L ^ var20)] = new is(c<"b">(20137, 3954997244686364313L ^ var20));
                                    d[c<"b">(22025, 300545128949020277L ^ var20)] = new is(c<"b">(29311, 8805636215683175091L ^ var20));
                                    d[c<"b">(5652, 1382639560272033390L ^ var20)] = new is(c<"b">(19641, 6400650886934686887L ^ var20));
                                    d[c<"b">(31818, 6983217021329628374L ^ var20)] = new is(c<"b">(1484, 857132031140078956L ^ var20));
                                    d[c<"b">(4793, 458341069323416126L ^ var20)] = new is(c<"b">(14823, 8205155818370439562L ^ var20));
                                    d[c<"b">(15879, 43849874912812570L ^ var20)] = new is(c<"b">(22572, 4355241379716626544L ^ var20));
                                    d[c<"b">(18775, 5031253954692442486L ^ var20)] = new is(c<"b">(22543, 5276169242582644815L ^ var20));
                                    d[c<"b">(24782, 1712817150307844275L ^ var20)] = new is(c<"b">(13303, 3156599972373173237L ^ var20));
                                    d[c<"b">(18276, 7773071166236059474L ^ var20)] = new is(c<"b">(31589, 655785377512151897L ^ var20));
                                    d[c<"b">(24968, 7498789349550571980L ^ var20)] = new is(c<"b">(8556, 277567759447458054L ^ var20));
                                    d[c<"b">(17202, 191952356805043033L ^ var20)] = new is(c<"b">(25864, 6719494675310200167L ^ var20));
                                    d[c<"b">(11388, 3333091224242982114L ^ var20)] = new is(c<"b">(19656, 7148468427028458743L ^ var20));
                                    d[c<"b">(12253, 5001134694261788563L ^ var20)] = new is(c<"b">(3321, 3915251827907538116L ^ var20));
                                    d[c<"b">(24861, 8529850896025108871L ^ var20)] = new is(c<"b">(1508, 1067020179431433552L ^ var20));
                                    d[c<"b">(30052, 6771143441696642536L ^ var20)] = new is(c<"b">(20899, 7382256161134539116L ^ var20));
                                    d[c<"b">(9482, 4440898299027129757L ^ var20)] = new is(c<"b">(26845, 8983325520582789232L ^ var20));
                                    d[c<"b">(20900, 6209860447001997601L ^ var20)] = new is(c<"b">(14818, 3954501180807715149L ^ var20));
                                    d[c<"b">(15517, 2517238605647486164L ^ var20)] = new is(c<"b">(8030, 4889299687785119613L ^ var20));
                                    d[c<"b">(21514, 7629042164571632835L ^ var20)] = new is(c<"b">(25770, 1430303274487039027L ^ var20));
                                    d[c<"b">(22697, 2487530715342043199L ^ var20)] = new is(c<"b">(8149, 8098422049114210301L ^ var20));
                                    d[c<"b">(4012, 2885724215185387502L ^ var20)] = new is(c<"b">(7201, 6344128732892937217L ^ var20));
                                    d[c<"b">(8853, 661935460145562175L ^ var20)] = new is(c<"b">(12659, 4009851030434451744L ^ var20));
                                    d[c<"b">(11993, 5249380909379423825L ^ var20)] = new is(c<"b">(28998, 9039141808706900293L ^ var20));
                                    d[c<"b">(20912, 7186004586404114903L ^ var20)] = new is(c<"b">(27589, 2534288337060285399L ^ var20));
                                    d[c<"b">(8731, 7954500186542572053L ^ var20)] = new is(c<"b">(15779, 7531527791121079776L ^ var20));
                                    d[c<"b">(31963, 5962616061308558427L ^ var20)] = new is(c<"b">(28180, 8529390689591086671L ^ var20));
                                    d[c<"b">(29414, 1884332249758716487L ^ var20)] = new is(c<"b">(12738, 1685651348412109128L ^ var20));
                                    d[c<"b">(21665, 2538455959388812470L ^ var20)] = new is(c<"b">(13743, 5681786822095803778L ^ var20));
                                    d[c<"b">(2946, 8781161373513526146L ^ var20)] = new is(c<"b">(805, 6521717927301587832L ^ var20));
                                    d[c<"b">(690, 7663954844770640540L ^ var20)] = new is(c<"b">(4633, 6842391214470705697L ^ var20));
                                    d[c<"b">(10547, 4867082256412838221L ^ var20)] = new is(c<"b">(24806, 1677872274886115537L ^ var20));
                                    d[c<"b">(26334, 1754334993833477839L ^ var20)] = new is(c<"b">(28691, 4168634827902931020L ^ var20));
                                    d[c<"b">(6639, 5869773045203876287L ^ var20)] = new is(c<"b">(327, 1289755116168454497L ^ var20));
                                    d[c<"b">(17971, 7822232693844960954L ^ var20)] = new is(c<"b">(27837, 3084295086517701640L ^ var20));
                                    d[c<"b">(17233, 2322683911195091838L ^ var20)] = new is(c<"b">(17674, 4469760573092849002L ^ var20));
                                    d[c<"b">(26450, 6917843468604950375L ^ var20)] = new is(c<"b">(22674, 33914557704796250L ^ var20));
                                    d[c<"b">(31591, 5607374152719064052L ^ var20)] = new is(c<"b">(5823, 4002523585996470005L ^ var20));
                                    d[c<"b">(9214, 3591766834124030856L ^ var20)] = new is(c<"b">(21684, 3164413972135015435L ^ var20));
                                    d[c<"b">(9446, 8683730959117976726L ^ var20)] = new is(c<"b">(2939, 9163321219261606691L ^ var20));
                                    d[c<"b">(21859, 8628215323222734332L ^ var20)] = new is(c<"b">(29273, 3805322887191450158L ^ var20));
                                    d[c<"b">(6964, 9125846868316699505L ^ var20)] = new is(c<"b">(27675, 1650061264003288071L ^ var20));
                                    d[c<"b">(18040, 7272593106127513291L ^ var20)] = new is(c<"b">(14410, 452524706999179359L ^ var20));
                                    d[c<"b">(13279, 1705627381565100987L ^ var20)] = new is(c<"b">(26782, 2142451828844841160L ^ var20));
                                    d[c<"b">(27517, 7147192424570014553L ^ var20)] = new is(c<"b">(11927, 3440692364797120172L ^ var20));
                                    d[c<"b">(29576, 5753199782051664777L ^ var20)] = new is(c<"b">(18399, 2513606338842453975L ^ var20));
                                    d[c<"b">(22911, 5031976298282580440L ^ var20)] = new is(c<"b">(19368, 8484935308351105948L ^ var20));
                                    d[c<"b">(8883, 4811889176397644474L ^ var20)] = new is(c<"b">(9834, 1957563816070841919L ^ var20));
                                    d[c<"b">(16488, 4716237625138307163L ^ var20)] = new is(c<"b">(13032, 9191991213018976962L ^ var20));
                                    d[c<"b">(2372, 4439850488061077797L ^ var20)] = new is(c<"b">(12787, 8113367406879511032L ^ var20));
                                    d[c<"b">(9348, 953917316818896097L ^ var20)] = new is(c<"b">(28667, 8654364958428450740L ^ var20));
                                    d[c<"b">(15982, 6725004155784699604L ^ var20)] = new is(c<"b">(28370, 5987596295330877164L ^ var20));
                                    d[c<"b">(19110, 9173726632686250639L ^ var20)] = new is(c<"b">(27170, 772003898792987182L ^ var20));
                                    d[c<"b">(8170, 8951743045331075021L ^ var20)] = new is(c<"b">(24527, 100946539462786946L ^ var20));
                                    d[c<"b">(19163, 3390286404695157374L ^ var20)] = new is(c<"b">(31565, 8042474199971126079L ^ var20));
                                    d[c<"b">(11848, 6047644221735177952L ^ var20)] = new is(c<"b">(30771, 531818907395315734L ^ var20));
                                    d[c<"b">(20838, 8274724166395228533L ^ var20)] = new is(c<"b">(29131, 5094493135265583434L ^ var20));
                                    d[c<"b">(22081, 6184655750643611143L ^ var20)] = new is(c<"b">(17650, 1428950239443051686L ^ var20));
                                    d[c<"b">(26943, 5971441161832778016L ^ var20)] = new is(c<"b">(19487, 1219980059314089085L ^ var20));
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = ".è¯\"ãò£´²Ä¼ç|Ä\u000eû";
                                 var5 = ".è¯\"ãò£´²Ä¼ç|Ä\u000eû".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "÷DM\u0098?\u0094ìod\u0016Ù\u0090\u0000víÓ3ÿã\u0002OñT{1ÃËáî\u0095*,óòÓ¦P¢zºy¤Ä\u0016\u001e¡\u0086²¥V\u0017Õ\u000b+\u0001Z8óEbJÊÅG¼:Ò,W½Ð\u0092\u001eØ\u0090Ø\u009e¼\u0092²,å|þÐ\u009cQ\u0084ª¢Û\u0012âx\u0011µæ¦#¨\u0091ß\u0092ä\u000f=zEá×rÜ\u0084";
                  var17 = "÷DM\u0098?\u0094ìod\u0016Ù\u0090\u0000víÓ3ÿã\u0002OñT{1ÃËáî\u0095*,óòÓ¦P¢zºy¤Ä\u0016\u001e¡\u0086²¥V\u0017Õ\u000b+\u0001Z8óEbJÊÅG¼:Ò,W½Ð\u0092\u001eØ\u0090Ø\u009e¼\u0092²,å|þÐ\u009cQ\u0084ª¢Û\u0012âx\u0011µæ¦#¨\u0091ß\u0092ä\u000f=zEá×rÜ\u0084"
                     .length();
                  var14 = '8';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public boolean S(Object[] param1) {
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
      // 00e: ldc2_w 79611262144211
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w 2641312395773210491
      // 018: lload 2
      // 019: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: istore 6
      // 020: aload 0
      // 021: getfield com/zelix/is.X I
      // 024: iload 6
      // 026: ifeq 37e
      // 029: tableswitch 807 0 191 793 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 805 805 805 805 805 805 805 805 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 807 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 793 793 793 793 793 793 807 807 807 807 807 807 807 807 807 807 807 807 805 793
      // 338: ldc2_w 4277178905182696180
      // 33b: lload 2
      // 33c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: bipush 0
      // 343: ireturn
      // 344: ldc2_w 4277178905182696180
      // 347: lload 2
      // 348: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34d: athrow
      // 34e: bipush 1
      // 34f: ireturn
      // 350: lload 4
      // 352: bipush 0
      // 353: aload 0
      // 354: getfield com/zelix/is.X I
      // 357: bipush 3
      // 358: anewarray 384
      // 35b: dup_x1
      // 35c: swap
      // 35d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 360: bipush 2
      // 361: swap
      // 362: aastore
      // 363: dup_x1
      // 364: swap
      // 365: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 368: bipush 1
      // 369: swap
      // 36a: aastore
      // 36b: dup_x2
      // 36c: dup_x2
      // 36d: pop
      // 36e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 371: bipush 0
      // 372: swap
      // 373: aastore
      // 374: ldc2_w 4476319811685712864
      // 377: lload 2
      // 378: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: bipush 0
      // 37e: ireturn
   }

   public boolean U(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -4736840665482381712
      // 03: lload 1
      // 04: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 3
      // 0a: aload 0
      // 0b: getfield com/zelix/is.X I
      // 0e: iload 3
      // 0f: ifne 4f
      // 12: tableswitch 60 172 177 48 48 48 48 48 48
      // 38: ldc2_w -4724282258416601152
      // 3b: lload 1
      // 3c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: bipush 1
      // 43: ireturn
      // 44: ldc2_w -4724282258416601152
      // 47: lload 1
      // 48: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
   }

   public final boolean v(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 6
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/v7
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 4
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 2
      // 028: pop
      // 029: lload 4
      // 02b: dup2
      // 02c: ldc2_w 51028714778232
      // 02f: lxor
      // 030: lstore 7
      // 032: pop2
      // 033: ldc2_w -2604110477085223953
      // 036: lload 4
      // 038: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: istore 9
      // 03f: aload 0
      // 040: getfield com/zelix/is.X I
      // 043: iload 9
      // 045: ifne 477
      // 048: tableswitch 1024 0 191 795 795 795 795 795 795 795 795 795 795 795 795 795 795 795 795 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 795 1024 1024 1024 1024 1024 1024 1024 912 966 912 966 912 912 912 912 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 808 808 808 808 808 808 808 808 860 860 795 795 795 795 795 795 795 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 912 966 1024 966 912 966 912 912 966 912 966 966 912 966 912 912 912 912 912 912 912 912 912 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1020 1020 1020 1020 1020 1022 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 1024 912 1020
      // 358: ldc2_w -2598311438013459873
      // 35b: lload 4
      // 35d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: athrow
      // 363: bipush 0
      // 364: ireturn
      // 365: ldc2_w -2598311438013459873
      // 368: lload 4
      // 36a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36f: athrow
      // 370: iload 6
      // 372: iload 9
      // 374: lload 4
      // 376: lconst_0
      // 377: lcmp
      // 378: ifle 37f
      // 37b: ifne 39f
      // 37e: iload 2
      // 37f: if_icmplt 3a2
      // 382: goto 390
      // 385: ldc2_w -2598311438013459873
      // 388: lload 4
      // 38a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: athrow
      // 390: bipush 1
      // 391: goto 39f
      // 394: ldc2_w -2598311438013459873
      // 397: lload 4
      // 399: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39e: athrow
      // 39f: goto 3a3
      // 3a2: bipush 0
      // 3a3: ireturn
      // 3a4: iload 6
      // 3a6: iload 9
      // 3a8: lload 4
      // 3aa: lconst_0
      // 3ab: lcmp
      // 3ac: iflt 3b3
      // 3af: ifne 3d3
      // 3b2: iload 2
      // 3b3: if_icmplt 3d6
      // 3b6: goto 3c4
      // 3b9: ldc2_w -2598311438013459873
      // 3bc: lload 4
      // 3be: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c3: athrow
      // 3c4: bipush 1
      // 3c5: goto 3d3
      // 3c8: ldc2_w -2598311438013459873
      // 3cb: lload 4
      // 3cd: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d2: athrow
      // 3d3: goto 3d7
      // 3d6: bipush 0
      // 3d7: ireturn
      // 3d8: iload 6
      // 3da: iload 9
      // 3dc: lload 4
      // 3de: lconst_0
      // 3df: lcmp
      // 3e0: ifle 3e9
      // 3e3: ifne 409
      // 3e6: iload 2
      // 3e7: bipush 1
      // 3e8: isub
      // 3e9: if_icmplt 40c
      // 3ec: goto 3fa
      // 3ef: ldc2_w -2598311438013459873
      // 3f2: lload 4
      // 3f4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f9: athrow
      // 3fa: bipush 1
      // 3fb: goto 409
      // 3fe: ldc2_w -2598311438013459873
      // 401: lload 4
      // 403: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 408: athrow
      // 409: goto 40d
      // 40c: bipush 0
      // 40d: ireturn
      // 40e: iload 6
      // 410: iload 9
      // 412: lload 4
      // 414: lconst_0
      // 415: lcmp
      // 416: ifle 41f
      // 419: ifne 43f
      // 41c: iload 2
      // 41d: bipush 2
      // 41e: isub
      // 41f: if_icmplt 442
      // 422: goto 430
      // 425: ldc2_w -2598311438013459873
      // 428: lload 4
      // 42a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42f: athrow
      // 430: bipush 1
      // 431: goto 43f
      // 434: ldc2_w -2598311438013459873
      // 437: lload 4
      // 439: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43e: athrow
      // 43f: goto 443
      // 442: bipush 0
      // 443: ireturn
      // 444: bipush 1
      // 445: ireturn
      // 446: bipush 0
      // 447: ireturn
      // 448: lload 7
      // 44a: bipush 0
      // 44b: aload 0
      // 44c: getfield com/zelix/is.X I
      // 44f: bipush 3
      // 450: anewarray 384
      // 453: dup_x1
      // 454: swap
      // 455: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 458: bipush 2
      // 459: swap
      // 45a: aastore
      // 45b: dup_x1
      // 45c: swap
      // 45d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 460: bipush 1
      // 461: swap
      // 462: aastore
      // 463: dup_x2
      // 464: dup_x2
      // 465: pop
      // 466: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 469: bipush 0
      // 46a: swap
      // 46b: aastore
      // 46c: ldc2_w -2399166085678439605
      // 46f: lload 4
      // 471: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 476: bipush 0
      // 477: ireturn
   }

   public boolean i(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast [Lcom/zelix/v7;
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Integer
      // 019: invokevirtual java/lang/Integer.intValue ()I
      // 01c: istore 5
      // 01e: pop
      // 01f: lload 2
      // 020: dup2
      // 021: ldc2_w 45858699082125
      // 024: lxor
      // 025: lstore 6
      // 027: dup2
      // 028: ldc2_w 5473300506487
      // 02b: lxor
      // 02c: dup2
      // 02d: bipush 32
      // 02f: lushr
      // 030: l2i
      // 031: istore 8
      // 033: dup2
      // 034: bipush 32
      // 036: lshl
      // 037: bipush 56
      // 039: lushr
      // 03a: l2i
      // 03b: istore 9
      // 03d: dup2
      // 03e: bipush 40
      // 040: lshl
      // 041: bipush 40
      // 043: lushr
      // 044: l2i
      // 045: istore 10
      // 047: pop2
      // 048: dup2
      // 049: ldc2_w 27441686013735
      // 04c: lxor
      // 04d: lstore 11
      // 04f: pop2
      // 050: ldc2_w 5812548473880828057
      // 053: lload 2
      // 054: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: aload 4
      // 05b: arraylength
      // 05c: istore 14
      // 05e: istore 13
      // 060: iload 14
      // 062: bipush 1
      // 063: isub
      // 064: istore 15
      // 066: aload 0
      // 067: getfield com/zelix/is.X I
      // 06a: iload 13
      // 06c: ifne 531
      // 06f: tableswitch 1134 87 95 1132 1132 59 118 170 339 506 673 1080
      // 0a0: ldc2_w 5802594380364519721
      // 0a3: lload 2
      // 0a4: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: iload 5
      // 0ac: iload 13
      // 0ae: ifne 0e0
      // 0b1: goto 0be
      // 0b4: ldc2_w 5802594380364519721
      // 0b7: lload 2
      // 0b8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: iload 15
      // 0c0: bipush 1
      // 0c1: isub
      // 0c2: if_icmplt 0e3
      // 0c5: goto 0d2
      // 0c8: ldc2_w 5802594380364519721
      // 0cb: lload 2
      // 0cc: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: bipush 1
      // 0d3: goto 0e0
      // 0d6: ldc2_w 5802594380364519721
      // 0d9: lload 2
      // 0da: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: goto 0e4
      // 0e3: bipush 0
      // 0e4: ireturn
      // 0e5: iload 5
      // 0e7: iload 13
      // 0e9: lload 2
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: iflt 0f6
      // 0ef: ifne 114
      // 0f2: iload 15
      // 0f4: bipush 2
      // 0f5: isub
      // 0f6: if_icmplt 117
      // 0f9: goto 106
      // 0fc: ldc2_w 5802594380364519721
      // 0ff: lload 2
      // 100: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 1
      // 107: goto 114
      // 10a: ldc2_w 5802594380364519721
      // 10d: lload 2
      // 10e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: goto 118
      // 117: bipush 0
      // 118: ireturn
      // 119: aload 4
      // 11b: iload 15
      // 11d: bipush 1
      // 11e: isub
      // 11f: aaload
      // 120: lload 6
      // 122: bipush 1
      // 123: anewarray 384
      // 126: dup_x2
      // 127: dup_x2
      // 128: pop
      // 129: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12c: bipush 0
      // 12d: swap
      // 12e: aastore
      // 12f: ldc2_w 6217779498841542644
      // 132: lload 2
      // 133: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: iload 13
      // 13a: lload 2
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: iflt 192
      // 140: ifne 190
      // 143: ifeq 18e
      // 146: goto 153
      // 149: ldc2_w 5802594380364519721
      // 14c: lload 2
      // 14d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: athrow
      // 153: iload 5
      // 155: iload 13
      // 157: ifne 189
      // 15a: goto 167
      // 15d: ldc2_w 5802594380364519721
      // 160: lload 2
      // 161: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: iload 15
      // 169: bipush 2
      // 16a: isub
      // 16b: if_icmplt 18c
      // 16e: goto 17b
      // 171: ldc2_w 5802594380364519721
      // 174: lload 2
      // 175: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: bipush 1
      // 17c: goto 189
      // 17f: ldc2_w 5802594380364519721
      // 182: lload 2
      // 183: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: goto 18d
      // 18c: bipush 0
      // 18d: ireturn
      // 18e: iload 5
      // 190: iload 13
      // 192: lload 2
      // 193: lconst_0
      // 194: lcmp
      // 195: iflt 19f
      // 198: ifne 1bd
      // 19b: iload 15
      // 19d: bipush 3
      // 19e: isub
      // 19f: if_icmplt 1c0
      // 1a2: goto 1af
      // 1a5: ldc2_w 5802594380364519721
      // 1a8: lload 2
      // 1a9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: bipush 1
      // 1b0: goto 1bd
      // 1b3: ldc2_w 5802594380364519721
      // 1b6: lload 2
      // 1b7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: athrow
      // 1bd: goto 1c1
      // 1c0: bipush 0
      // 1c1: ireturn
      // 1c2: aload 4
      // 1c4: iload 15
      // 1c6: aaload
      // 1c7: lload 6
      // 1c9: bipush 1
      // 1ca: anewarray 384
      // 1cd: dup_x2
      // 1ce: dup_x2
      // 1cf: pop
      // 1d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d3: bipush 0
      // 1d4: swap
      // 1d5: aastore
      // 1d6: ldc2_w 6217779498841542644
      // 1d9: lload 2
      // 1da: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: iload 13
      // 1e1: lload 2
      // 1e2: lconst_0
      // 1e3: lcmp
      // 1e4: iflt 239
      // 1e7: ifne 237
      // 1ea: ifeq 235
      // 1ed: goto 1fa
      // 1f0: ldc2_w 5802594380364519721
      // 1f3: lload 2
      // 1f4: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: athrow
      // 1fa: iload 5
      // 1fc: iload 13
      // 1fe: ifne 230
      // 201: goto 20e
      // 204: ldc2_w 5802594380364519721
      // 207: lload 2
      // 208: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: iload 15
      // 210: bipush 1
      // 211: isub
      // 212: if_icmplt 233
      // 215: goto 222
      // 218: ldc2_w 5802594380364519721
      // 21b: lload 2
      // 21c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: bipush 1
      // 223: goto 230
      // 226: ldc2_w 5802594380364519721
      // 229: lload 2
      // 22a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: goto 234
      // 233: bipush 0
      // 234: ireturn
      // 235: iload 5
      // 237: iload 13
      // 239: lload 2
      // 23a: lconst_0
      // 23b: lcmp
      // 23c: ifle 246
      // 23f: ifne 264
      // 242: iload 15
      // 244: bipush 3
      // 245: isub
      // 246: if_icmplt 267
      // 249: goto 256
      // 24c: ldc2_w 5802594380364519721
      // 24f: lload 2
      // 250: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: bipush 1
      // 257: goto 264
      // 25a: ldc2_w 5802594380364519721
      // 25d: lload 2
      // 25e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: athrow
      // 264: goto 268
      // 267: bipush 0
      // 268: ireturn
      // 269: aload 4
      // 26b: iload 15
      // 26d: aaload
      // 26e: lload 6
      // 270: bipush 1
      // 271: anewarray 384
      // 274: dup_x2
      // 275: dup_x2
      // 276: pop
      // 277: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27a: bipush 0
      // 27b: swap
      // 27c: aastore
      // 27d: ldc2_w 6217779498841542644
      // 280: lload 2
      // 281: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: iload 13
      // 288: lload 2
      // 289: lconst_0
      // 28a: lcmp
      // 28b: iflt 2e0
      // 28e: ifne 2de
      // 291: ifeq 2dc
      // 294: goto 2a1
      // 297: ldc2_w 5802594380364519721
      // 29a: lload 2
      // 29b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: athrow
      // 2a1: iload 5
      // 2a3: iload 13
      // 2a5: ifne 2d7
      // 2a8: goto 2b5
      // 2ab: ldc2_w 5802594380364519721
      // 2ae: lload 2
      // 2af: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: athrow
      // 2b5: iload 15
      // 2b7: bipush 2
      // 2b8: isub
      // 2b9: if_icmplt 2da
      // 2bc: goto 2c9
      // 2bf: ldc2_w 5802594380364519721
      // 2c2: lload 2
      // 2c3: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: athrow
      // 2c9: bipush 1
      // 2ca: goto 2d7
      // 2cd: ldc2_w 5802594380364519721
      // 2d0: lload 2
      // 2d1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: athrow
      // 2d7: goto 2db
      // 2da: bipush 0
      // 2db: ireturn
      // 2dc: iload 5
      // 2de: iload 13
      // 2e0: lload 2
      // 2e1: lconst_0
      // 2e2: lcmp
      // 2e3: ifle 2ed
      // 2e6: ifne 30b
      // 2e9: iload 15
      // 2eb: bipush 4
      // 2ec: isub
      // 2ed: if_icmplt 30e
      // 2f0: goto 2fd
      // 2f3: ldc2_w 5802594380364519721
      // 2f6: lload 2
      // 2f7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: athrow
      // 2fd: bipush 1
      // 2fe: goto 30b
      // 301: ldc2_w 5802594380364519721
      // 304: lload 2
      // 305: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: athrow
      // 30b: goto 30f
      // 30e: bipush 0
      // 30f: ireturn
      // 310: aload 4
      // 312: iload 15
      // 314: aaload
      // 315: lload 6
      // 317: bipush 1
      // 318: anewarray 384
      // 31b: dup_x2
      // 31c: dup_x2
      // 31d: pop
      // 31e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 321: bipush 0
      // 322: swap
      // 323: aastore
      // 324: ldc2_w 6217779498841542644
      // 327: lload 2
      // 328: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: iload 13
      // 32f: lload 2
      // 330: lconst_0
      // 331: lcmp
      // 332: ifle 41f
      // 335: ifne 41d
      // 338: ifeq 3fe
      // 33b: goto 348
      // 33e: ldc2_w 5802594380364519721
      // 341: lload 2
      // 342: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: athrow
      // 348: aload 4
      // 34a: iload 15
      // 34c: bipush 1
      // 34d: isub
      // 34e: aaload
      // 34f: lload 6
      // 351: bipush 1
      // 352: anewarray 384
      // 355: dup_x2
      // 356: dup_x2
      // 357: pop
      // 358: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 35b: bipush 0
      // 35c: swap
      // 35d: aastore
      // 35e: ldc2_w 6217779498841542644
      // 361: lload 2
      // 362: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: iload 13
      // 369: lload 2
      // 36a: lconst_0
      // 36b: lcmp
      // 36c: ifle 3ce
      // 36f: ifne 3cc
      // 372: goto 37f
      // 375: ldc2_w 5802594380364519721
      // 378: lload 2
      // 379: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37e: athrow
      // 37f: ifeq 3ca
      // 382: goto 38f
      // 385: ldc2_w 5802594380364519721
      // 388: lload 2
      // 389: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: athrow
      // 38f: iload 5
      // 391: iload 13
      // 393: ifne 3c5
      // 396: goto 3a3
      // 399: ldc2_w 5802594380364519721
      // 39c: lload 2
      // 39d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a2: athrow
      // 3a3: iload 15
      // 3a5: bipush 2
      // 3a6: isub
      // 3a7: if_icmplt 3c8
      // 3aa: goto 3b7
      // 3ad: ldc2_w 5802594380364519721
      // 3b0: lload 2
      // 3b1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: athrow
      // 3b7: bipush 1
      // 3b8: goto 3c5
      // 3bb: ldc2_w 5802594380364519721
      // 3be: lload 2
      // 3bf: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c4: athrow
      // 3c5: goto 3c9
      // 3c8: bipush 0
      // 3c9: ireturn
      // 3ca: iload 5
      // 3cc: iload 13
      // 3ce: lload 2
      // 3cf: lconst_0
      // 3d0: lcmp
      // 3d1: ifle 3db
      // 3d4: ifne 3f9
      // 3d7: iload 15
      // 3d9: bipush 3
      // 3da: isub
      // 3db: if_icmplt 3fc
      // 3de: goto 3eb
      // 3e1: ldc2_w 5802594380364519721
      // 3e4: lload 2
      // 3e5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ea: athrow
      // 3eb: bipush 1
      // 3ec: goto 3f9
      // 3ef: ldc2_w 5802594380364519721
      // 3f2: lload 2
      // 3f3: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f8: athrow
      // 3f9: goto 3fd
      // 3fc: bipush 0
      // 3fd: ireturn
      // 3fe: aload 4
      // 400: iload 15
      // 402: bipush 2
      // 403: isub
      // 404: aaload
      // 405: lload 6
      // 407: bipush 1
      // 408: anewarray 384
      // 40b: dup_x2
      // 40c: dup_x2
      // 40d: pop
      // 40e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 411: bipush 0
      // 412: swap
      // 413: aastore
      // 414: ldc2_w 6217779498841542644
      // 417: lload 2
      // 418: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41d: iload 13
      // 41f: lload 2
      // 420: lconst_0
      // 421: lcmp
      // 422: ifle 477
      // 425: ifne 475
      // 428: ifeq 473
      // 42b: goto 438
      // 42e: ldc2_w 5802594380364519721
      // 431: lload 2
      // 432: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 437: athrow
      // 438: iload 5
      // 43a: iload 13
      // 43c: ifne 46e
      // 43f: goto 44c
      // 442: ldc2_w 5802594380364519721
      // 445: lload 2
      // 446: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44b: athrow
      // 44c: iload 15
      // 44e: bipush 4
      // 44f: isub
      // 450: if_icmplt 471
      // 453: goto 460
      // 456: ldc2_w 5802594380364519721
      // 459: lload 2
      // 45a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45f: athrow
      // 460: bipush 1
      // 461: goto 46e
      // 464: ldc2_w 5802594380364519721
      // 467: lload 2
      // 468: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46d: athrow
      // 46e: goto 472
      // 471: bipush 0
      // 472: ireturn
      // 473: iload 5
      // 475: iload 13
      // 477: lload 2
      // 478: lconst_0
      // 479: lcmp
      // 47a: iflt 484
      // 47d: ifne 4a2
      // 480: iload 15
      // 482: bipush 5
      // 483: isub
      // 484: if_icmplt 4a5
      // 487: goto 494
      // 48a: ldc2_w 5802594380364519721
      // 48d: lload 2
      // 48e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 493: athrow
      // 494: bipush 1
      // 495: goto 4a2
      // 498: ldc2_w 5802594380364519721
      // 49b: lload 2
      // 49c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a1: athrow
      // 4a2: goto 4a6
      // 4a5: bipush 0
      // 4a6: ireturn
      // 4a7: iload 5
      // 4a9: iload 13
      // 4ab: lload 2
      // 4ac: lconst_0
      // 4ad: lcmp
      // 4ae: ifle 4b8
      // 4b1: ifne 4d6
      // 4b4: iload 15
      // 4b6: bipush 1
      // 4b7: isub
      // 4b8: if_icmplt 4d9
      // 4bb: goto 4c8
      // 4be: ldc2_w 5802594380364519721
      // 4c1: lload 2
      // 4c2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c7: athrow
      // 4c8: bipush 1
      // 4c9: goto 4d6
      // 4cc: ldc2_w 5802594380364519721
      // 4cf: lload 2
      // 4d0: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d5: athrow
      // 4d6: goto 4da
      // 4d9: bipush 0
      // 4da: ireturn
      // 4db: bipush 0
      // 4dc: ireturn
      // 4dd: bipush 0
      // 4de: bipush 1
      // 4df: anewarray 16
      // 4e2: dup
      // 4e3: bipush 0
      // 4e4: new java/lang/StringBuilder
      // 4e7: dup
      // 4e8: invokespecial java/lang/StringBuilder.<init> ()V
      // 4eb: aload 0
      // 4ec: getfield com/zelix/is.X I
      // 4ef: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4f2: ldc " "
      // 4f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f7: aload 0
      // 4f8: iload 8
      // 4fa: iload 9
      // 4fc: i2b
      // 4fd: iload 10
      // 4ff: bipush 3
      // 500: anewarray 384
      // 503: dup_x1
      // 504: swap
      // 505: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 508: bipush 2
      // 509: swap
      // 50a: aastore
      // 50b: dup_x1
      // 50c: swap
      // 50d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 510: bipush 1
      // 511: swap
      // 512: aastore
      // 513: dup_x1
      // 514: swap
      // 515: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 518: bipush 0
      // 519: swap
      // 51a: aastore
      // 51b: ldc2_w 6316184289690517726
      // 51e: lload 2
      // 51f: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 524: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 527: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 52a: aastore
      // 52b: lload 11
      // 52d: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 530: bipush 0
      // 531: ireturn
   }

   public boolean d(Object[] param1) {
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
      // 00e: ldc2_w 40351557209919
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w -388614089625603416
      // 018: lload 2
      // 019: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: istore 6
      // 020: aload 0
      // 021: getfield com/zelix/is.X I
      // 024: iload 6
      // 026: ifne 37e
      // 029: tableswitch 807 0 191 793 793 793 793 793 793 793 793 793 805 805 793 793 793 805 805 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 793 805 793 805 793 793 793 793 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 793 805 807 805 793 805 793 793 805 793 805 805 793 805 793 793 793 793 793 793 793 793 793 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 793 793 793 793 793 793 807 807 807 807 807 807 807 807 807 807 807 807 793 793
      // 338: ldc2_w -380559282190503144
      // 33b: lload 2
      // 33c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: bipush 0
      // 343: ireturn
      // 344: ldc2_w -380559282190503144
      // 347: lload 2
      // 348: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34d: athrow
      // 34e: bipush 1
      // 34f: ireturn
      // 350: lload 4
      // 352: bipush 0
      // 353: aload 0
      // 354: getfield com/zelix/is.X I
      // 357: bipush 3
      // 358: anewarray 384
      // 35b: dup_x1
      // 35c: swap
      // 35d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 360: bipush 2
      // 361: swap
      // 362: aastore
      // 363: dup_x1
      // 364: swap
      // 365: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 368: bipush 1
      // 369: swap
      // 36a: aastore
      // 36b: dup_x2
      // 36c: dup_x2
      // 36d: pop
      // 36e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 371: bipush 0
      // 372: swap
      // 373: aastore
      // 374: ldc2_w -3525094111854068
      // 377: lload 2
      // 378: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: bipush 0
      // 37e: ireturn
   }

   public String l(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 62838192416743L;
      int var4 = (int)((var2 ^ 62838192416743L) >>> 32);
      int var5 = (int)((var2 ^ 62838192416743L) << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      byte var10002 = (byte)var5;
      Object[] var10005 = new Object[]{null, null, var6};
      var10005[1] = Integer.valueOf(var10002);
      var10005[0] = var4;
      return m44.a<"s">(this, var10005, -7550383759637692338L, var2);
   }

   public boolean Y(long param1, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 112513883725833
      // 005: lxor
      // 006: lstore 5
      // 008: pop2
      // 009: ldc2_w 6173625216586931614
      // 00c: lload 1
      // 00d: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 012: istore 7
      // 014: aload 0
      // 015: getfield com/zelix/is.X I
      // 018: iload 7
      // 01a: ifne 409
      // 01d: tableswitch 958 0 191 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 854 905 854 905 854 854 854 854 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 805 805 805 805 805 805 805 805 805 805 793 793 793 793 793 793 793 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 854 905 958 905 854 905 854 854 905 854 905 905 854 905 854 854 854 854 854 854 854 854 854 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 958 956 956 956 956 956 956 958 958 958 958 958 958 958 958 958 958 958 958 854 956
      // 32c: ldc2_w 6161409994591247406
      // 32f: lload 1
      // 330: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: athrow
      // 336: bipush 0
      // 337: ireturn
      // 338: ldc2_w 6161409994591247406
      // 33b: lload 1
      // 33c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: iload 3
      // 343: iload 7
      // 345: lload 1
      // 346: lconst_0
      // 347: lcmp
      // 348: ifle 350
      // 34b: ifne 36e
      // 34e: iload 4
      // 350: if_icmplt 371
      // 353: goto 360
      // 356: ldc2_w 6161409994591247406
      // 359: lload 1
      // 35a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: athrow
      // 360: bipush 1
      // 361: goto 36e
      // 364: ldc2_w 6161409994591247406
      // 367: lload 1
      // 368: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: athrow
      // 36e: goto 372
      // 371: bipush 0
      // 372: ireturn
      // 373: iload 3
      // 374: iload 7
      // 376: lload 1
      // 377: lconst_0
      // 378: lcmp
      // 379: iflt 383
      // 37c: ifne 3a1
      // 37f: iload 4
      // 381: bipush 1
      // 382: isub
      // 383: if_icmplt 3a4
      // 386: goto 393
      // 389: ldc2_w 6161409994591247406
      // 38c: lload 1
      // 38d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: athrow
      // 393: bipush 1
      // 394: goto 3a1
      // 397: ldc2_w 6161409994591247406
      // 39a: lload 1
      // 39b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a0: athrow
      // 3a1: goto 3a5
      // 3a4: bipush 0
      // 3a5: ireturn
      // 3a6: iload 3
      // 3a7: iload 7
      // 3a9: lload 1
      // 3aa: lconst_0
      // 3ab: lcmp
      // 3ac: ifle 3b6
      // 3af: ifne 3d4
      // 3b2: iload 4
      // 3b4: bipush 2
      // 3b5: isub
      // 3b6: if_icmplt 3d7
      // 3b9: goto 3c6
      // 3bc: ldc2_w 6161409994591247406
      // 3bf: lload 1
      // 3c0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c5: athrow
      // 3c6: bipush 1
      // 3c7: goto 3d4
      // 3ca: ldc2_w 6161409994591247406
      // 3cd: lload 1
      // 3ce: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d3: athrow
      // 3d4: goto 3d8
      // 3d7: bipush 0
      // 3d8: ireturn
      // 3d9: bipush 1
      // 3da: ireturn
      // 3db: lload 5
      // 3dd: bipush 0
      // 3de: aload 0
      // 3df: getfield com/zelix/is.X I
      // 3e2: bipush 3
      // 3e3: anewarray 384
      // 3e6: dup_x1
      // 3e7: swap
      // 3e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3eb: bipush 2
      // 3ec: swap
      // 3ed: aastore
      // 3ee: dup_x1
      // 3ef: swap
      // 3f0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3f3: bipush 1
      // 3f4: swap
      // 3f5: aastore
      // 3f6: dup_x2
      // 3f7: dup_x2
      // 3f8: pop
      // 3f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3fc: bipush 0
      // 3fd: swap
      // 3fe: aastore
      // 3ff: ldc2_w 5820123057703906618
      // 402: lload 1
      // 403: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 408: bipush 0
      // 409: ireturn
   }

   public hz n(hz param1, boolean param2, char param3, int param4, boolean param5, loj param6, char param7, String param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: iload 3
      // 0001: i2l
      // 0002: bipush 48
      // 0004: lshl
      // 0005: iload 4
      // 0007: i2l
      // 0008: bipush 32
      // 000a: lshl
      // 000b: bipush 16
      // 000d: lushr
      // 000e: lor
      // 000f: iload 7
      // 0011: i2l
      // 0012: bipush 48
      // 0014: lshl
      // 0015: bipush 48
      // 0017: lushr
      // 0018: lor
      // 0019: lstore 9
      // 001b: lload 9
      // 001d: dup2
      // 001e: ldc2_w 107136982824698
      // 0021: lxor
      // 0022: lstore 11
      // 0024: dup2
      // 0025: ldc2_w 140131781258221
      // 0028: lxor
      // 0029: dup2
      // 002a: bipush 32
      // 002c: lushr
      // 002d: l2i
      // 002e: istore 13
      // 0030: dup2
      // 0031: bipush 32
      // 0033: lshl
      // 0034: bipush 48
      // 0036: lushr
      // 0037: l2i
      // 0038: istore 14
      // 003a: dup2
      // 003b: bipush 48
      // 003d: lshl
      // 003e: bipush 48
      // 0040: lushr
      // 0041: l2i
      // 0042: istore 15
      // 0044: pop2
      // 0045: dup2
      // 0046: ldc2_w 6215624408093
      // 0049: lxor
      // 004a: lstore 16
      // 004c: dup2
      // 004d: ldc2_w 114161761794490
      // 0050: lxor
      // 0051: lstore 18
      // 0053: dup2
      // 0054: ldc2_w 332116234582
      // 0057: lxor
      // 0058: lstore 20
      // 005a: dup2
      // 005b: ldc2_w 132718511451653
      // 005e: lxor
      // 005f: lstore 22
      // 0061: dup2
      // 0062: ldc2_w 27627800384924
      // 0065: lxor
      // 0066: lstore 24
      // 0068: dup2
      // 0069: ldc2_w 20550113089628
      // 006c: lxor
      // 006d: dup2
      // 006e: bipush 32
      // 0070: lushr
      // 0071: l2i
      // 0072: istore 26
      // 0074: dup2
      // 0075: bipush 32
      // 0077: lshl
      // 0078: bipush 48
      // 007a: lushr
      // 007b: l2i
      // 007c: istore 27
      // 007e: dup2
      // 007f: bipush 48
      // 0081: lshl
      // 0082: bipush 48
      // 0084: lushr
      // 0085: l2i
      // 0086: istore 28
      // 0088: pop2
      // 0089: dup2
      // 008a: ldc2_w 65811635556040
      // 008d: lxor
      // 008e: dup2
      // 008f: bipush 8
      // 0091: lushr
      // 0092: lstore 29
      // 0094: dup2
      // 0095: bipush 56
      // 0097: lshl
      // 0098: bipush 56
      // 009a: lushr
      // 009b: l2i
      // 009c: istore 31
      // 009e: pop2
      // 009f: dup2
      // 00a0: ldc2_w 76706529798630
      // 00a3: lxor
      // 00a4: lstore 32
      // 00a6: pop2
      // 00a7: ldc2_w -2575428984604371855
      // 00aa: lload 9
      // 00ac: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00b1: new com/zelix/lby
      // 00b4: dup
      // 00b5: lload 29
      // 00b7: aload 8
      // 00b9: iload 31
      // 00bb: i2b
      // 00bc: invokespecial com/zelix/lby.<init> (JLjava/lang/String;B)V
      // 00bf: astore 35
      // 00c1: istore 34
      // 00c3: aload 1
      // 00c4: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 00c7: astore 36
      // 00c9: aload 1
      // 00ca: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 00cd: astore 37
      // 00cf: aload 1
      // 00d0: lload 16
      // 00d2: invokevirtual com/zelix/hz.k (J)Ljava/util/Set;
      // 00d5: astore 38
      // 00d7: aconst_null
      // 00d8: astore 39
      // 00da: aload 37
      // 00dc: arraylength
      // 00dd: istore 40
      // 00df: aload 1
      // 00e0: invokevirtual com/zelix/hz.j ()Lcom/zelix/fb;
      // 00e3: astore 42
      // 00e5: aload 0
      // 00e6: getfield com/zelix/is.X I
      // 00e9: iload 34
      // 00eb: ifne 1446
      // 00ee: tableswitch 4951 0 191 793 822 870 870 870 870 870 870 870 896 896 922 922 922 948 948 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 974 1065 1156 1247 1338 1405 1496 1587 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 1846 1678 1720 1762 1804 1846 1846 1846 1888 2003 2277 2329 2418 2643 2813 3058 3636 3704 3756 3860 3902 3704 3756 3860 3902 3704 3756 3860 3902 3704 3756 3860 3902 3704 3756 3860 3902 3944 3962 3980 3998 3704 3808 3704 3808 3704 3808 3704 3756 3704 3756 3704 3756 4951 4016 4066 4116 4166 4216 4266 4316 4366 4416 4466 4516 4566 3944 3944 3944 4616 4673 4673 4730 4730 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4787 4803 4819 4835 4851 4867 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4951 4883 4933
      // 03fc: ldc2_w -2562941633481894463
      // 03ff: lload 9
      // 0401: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0406: athrow
      // 0407: new com/zelix/hz
      // 040a: dup
      // 040b: aload 37
      // 040d: aload 36
      // 040f: lload 18
      // 0411: aload 42
      // 0413: aload 38
      // 0415: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0418: areturn
      // 0419: ldc2_w -2562941633481894463
      // 041c: lload 9
      // 041e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0423: athrow
      // 0424: iload 40
      // 0426: bipush 1
      // 0427: iadd
      // 0428: lload 20
      // 042a: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 042d: astore 39
      // 042f: aload 37
      // 0431: bipush 0
      // 0432: aload 39
      // 0434: bipush 0
      // 0435: iload 40
      // 0437: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 043a: aload 39
      // 043c: iload 40
      // 043e: getstatic com/zelix/v7.L Lcom/zelix/v7;
      // 0441: aastore
      // 0442: new com/zelix/hz
      // 0445: dup
      // 0446: aload 39
      // 0448: aload 36
      // 044a: lload 18
      // 044c: aload 42
      // 044e: aload 38
      // 0450: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0453: areturn
      // 0454: aload 0
      // 0455: iload 40
      // 0457: iload 13
      // 0459: aload 37
      // 045b: iload 14
      // 045d: i2c
      // 045e: aload 36
      // 0460: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 0463: iload 15
      // 0465: i2c
      // 0466: aload 42
      // 0468: aload 38
      // 046a: invokespecial com/zelix/is.F (II[Lcom/zelix/v7;C[Lcom/zelix/v7;Lcom/zelix/v7;CLcom/zelix/fb;Ljava/util/Set;)Lcom/zelix/hz;
      // 046d: areturn
      // 046e: aload 0
      // 046f: iload 40
      // 0471: iload 13
      // 0473: aload 37
      // 0475: iload 14
      // 0477: i2c
      // 0478: aload 36
      // 047a: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 047d: iload 15
      // 047f: i2c
      // 0480: aload 42
      // 0482: aload 38
      // 0484: invokespecial com/zelix/is.F (II[Lcom/zelix/v7;C[Lcom/zelix/v7;Lcom/zelix/v7;CLcom/zelix/fb;Ljava/util/Set;)Lcom/zelix/hz;
      // 0487: areturn
      // 0488: aload 0
      // 0489: iload 40
      // 048b: iload 13
      // 048d: aload 37
      // 048f: iload 14
      // 0491: i2c
      // 0492: aload 36
      // 0494: getstatic com/zelix/v7.V Lcom/zelix/v7;
      // 0497: iload 15
      // 0499: i2c
      // 049a: aload 42
      // 049c: aload 38
      // 049e: invokespecial com/zelix/is.F (II[Lcom/zelix/v7;C[Lcom/zelix/v7;Lcom/zelix/v7;CLcom/zelix/fb;Ljava/util/Set;)Lcom/zelix/hz;
      // 04a1: areturn
      // 04a2: aload 0
      // 04a3: iload 40
      // 04a5: iload 13
      // 04a7: aload 37
      // 04a9: iload 14
      // 04ab: i2c
      // 04ac: aload 36
      // 04ae: getstatic com/zelix/v7.z Lcom/zelix/v7;
      // 04b1: iload 15
      // 04b3: i2c
      // 04b4: aload 42
      // 04b6: aload 38
      // 04b8: invokespecial com/zelix/is.F (II[Lcom/zelix/v7;C[Lcom/zelix/v7;Lcom/zelix/v7;CLcom/zelix/fb;Ljava/util/Set;)Lcom/zelix/hz;
      // 04bb: areturn
      // 04bc: aload 0
      // 04bd: iload 40
      // 04bf: aload 37
      // 04c1: aload 36
      // 04c3: ldc2_w -2685094912730738687
      // 04c6: lload 9
      // 04c8: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04cd: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 04d0: aload 42
      // 04d2: lload 22
      // 04d4: aload 38
      // 04d6: bipush 8
      // 04d8: anewarray 384
      // 04db: dup_x1
      // 04dc: swap
      // 04dd: bipush 7
      // 04df: swap
      // 04e0: aastore
      // 04e1: dup_x2
      // 04e2: dup_x2
      // 04e3: pop
      // 04e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04e7: bipush 6
      // 04e9: swap
      // 04ea: aastore
      // 04eb: dup_x1
      // 04ec: swap
      // 04ed: bipush 5
      // 04ee: swap
      // 04ef: aastore
      // 04f0: dup_x1
      // 04f1: swap
      // 04f2: bipush 4
      // 04f3: swap
      // 04f4: aastore
      // 04f5: dup_x1
      // 04f6: swap
      // 04f7: bipush 3
      // 04f8: swap
      // 04f9: aastore
      // 04fa: dup_x1
      // 04fb: swap
      // 04fc: bipush 2
      // 04fd: swap
      // 04fe: aastore
      // 04ff: dup_x1
      // 0500: swap
      // 0501: bipush 1
      // 0502: swap
      // 0503: aastore
      // 0504: dup_x1
      // 0505: swap
      // 0506: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0509: bipush 0
      // 050a: swap
      // 050b: aastore
      // 050c: ldc2_w -4526786223673986754
      // 050f: lload 9
      // 0511: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0516: areturn
      // 0517: aload 0
      // 0518: iload 40
      // 051a: aload 37
      // 051c: aload 36
      // 051e: ldc2_w -4276299815129050482
      // 0521: lload 9
      // 0523: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0528: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 052b: aload 42
      // 052d: lload 22
      // 052f: aload 38
      // 0531: bipush 8
      // 0533: anewarray 384
      // 0536: dup_x1
      // 0537: swap
      // 0538: bipush 7
      // 053a: swap
      // 053b: aastore
      // 053c: dup_x2
      // 053d: dup_x2
      // 053e: pop
      // 053f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0542: bipush 6
      // 0544: swap
      // 0545: aastore
      // 0546: dup_x1
      // 0547: swap
      // 0548: bipush 5
      // 0549: swap
      // 054a: aastore
      // 054b: dup_x1
      // 054c: swap
      // 054d: bipush 4
      // 054e: swap
      // 054f: aastore
      // 0550: dup_x1
      // 0551: swap
      // 0552: bipush 3
      // 0553: swap
      // 0554: aastore
      // 0555: dup_x1
      // 0556: swap
      // 0557: bipush 2
      // 0558: swap
      // 0559: aastore
      // 055a: dup_x1
      // 055b: swap
      // 055c: bipush 1
      // 055d: swap
      // 055e: aastore
      // 055f: dup_x1
      // 0560: swap
      // 0561: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0564: bipush 0
      // 0565: swap
      // 0566: aastore
      // 0567: ldc2_w -4526786223673986754
      // 056a: lload 9
      // 056c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0571: areturn
      // 0572: aload 0
      // 0573: iload 40
      // 0575: aload 37
      // 0577: aload 36
      // 0579: ldc2_w -2696236755442465475
      // 057c: lload 9
      // 057e: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0583: getstatic com/zelix/v7.V Lcom/zelix/v7;
      // 0586: aload 42
      // 0588: lload 22
      // 058a: aload 38
      // 058c: bipush 8
      // 058e: anewarray 384
      // 0591: dup_x1
      // 0592: swap
      // 0593: bipush 7
      // 0595: swap
      // 0596: aastore
      // 0597: dup_x2
      // 0598: dup_x2
      // 0599: pop
      // 059a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 059d: bipush 6
      // 059f: swap
      // 05a0: aastore
      // 05a1: dup_x1
      // 05a2: swap
      // 05a3: bipush 5
      // 05a4: swap
      // 05a5: aastore
      // 05a6: dup_x1
      // 05a7: swap
      // 05a8: bipush 4
      // 05a9: swap
      // 05aa: aastore
      // 05ab: dup_x1
      // 05ac: swap
      // 05ad: bipush 3
      // 05ae: swap
      // 05af: aastore
      // 05b0: dup_x1
      // 05b1: swap
      // 05b2: bipush 2
      // 05b3: swap
      // 05b4: aastore
      // 05b5: dup_x1
      // 05b6: swap
      // 05b7: bipush 1
      // 05b8: swap
      // 05b9: aastore
      // 05ba: dup_x1
      // 05bb: swap
      // 05bc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05bf: bipush 0
      // 05c0: swap
      // 05c1: aastore
      // 05c2: ldc2_w -4526786223673986754
      // 05c5: lload 9
      // 05c7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05cc: areturn
      // 05cd: aload 0
      // 05ce: iload 40
      // 05d0: aload 37
      // 05d2: aload 36
      // 05d4: ldc2_w -4377280227960044877
      // 05d7: lload 9
      // 05d9: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05de: getstatic com/zelix/v7.z Lcom/zelix/v7;
      // 05e1: aload 42
      // 05e3: lload 22
      // 05e5: aload 38
      // 05e7: bipush 8
      // 05e9: anewarray 384
      // 05ec: dup_x1
      // 05ed: swap
      // 05ee: bipush 7
      // 05f0: swap
      // 05f1: aastore
      // 05f2: dup_x2
      // 05f3: dup_x2
      // 05f4: pop
      // 05f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05f8: bipush 6
      // 05fa: swap
      // 05fb: aastore
      // 05fc: dup_x1
      // 05fd: swap
      // 05fe: bipush 5
      // 05ff: swap
      // 0600: aastore
      // 0601: dup_x1
      // 0602: swap
      // 0603: bipush 4
      // 0604: swap
      // 0605: aastore
      // 0606: dup_x1
      // 0607: swap
      // 0608: bipush 3
      // 0609: swap
      // 060a: aastore
      // 060b: dup_x1
      // 060c: swap
      // 060d: bipush 2
      // 060e: swap
      // 060f: aastore
      // 0610: dup_x1
      // 0611: swap
      // 0612: bipush 1
      // 0613: swap
      // 0614: aastore
      // 0615: dup_x1
      // 0616: swap
      // 0617: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 061a: bipush 0
      // 061b: swap
      // 061c: aastore
      // 061d: ldc2_w -4526786223673986754
      // 0620: lload 9
      // 0622: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0627: areturn
      // 0628: iload 40
      // 062a: bipush 1
      // 062b: isub
      // 062c: lload 20
      // 062e: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0631: astore 39
      // 0633: aload 37
      // 0635: bipush 0
      // 0636: aload 39
      // 0638: bipush 0
      // 0639: iload 40
      // 063b: bipush 2
      // 063c: isub
      // 063d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0640: aload 39
      // 0642: iload 40
      // 0644: bipush 2
      // 0645: isub
      // 0646: aload 37
      // 0648: iload 40
      // 064a: bipush 2
      // 064b: isub
      // 064c: aaload
      // 064d: iload 26
      // 064f: iload 27
      // 0651: i2c
      // 0652: iload 28
      // 0654: i2c
      // 0655: invokevirtual com/zelix/v7.s (ICC)Lcom/zelix/v7;
      // 0658: aastore
      // 0659: new com/zelix/hz
      // 065c: dup
      // 065d: aload 39
      // 065f: aload 36
      // 0661: lload 18
      // 0663: aload 42
      // 0665: aload 38
      // 0667: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 066a: areturn
      // 066b: aload 0
      // 066c: iload 40
      // 066e: aload 37
      // 0670: aload 36
      // 0672: ldc2_w -4062691724886274712
      // 0675: lload 9
      // 0677: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067c: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 067f: aload 42
      // 0681: lload 22
      // 0683: aload 38
      // 0685: bipush 8
      // 0687: anewarray 384
      // 068a: dup_x1
      // 068b: swap
      // 068c: bipush 7
      // 068e: swap
      // 068f: aastore
      // 0690: dup_x2
      // 0691: dup_x2
      // 0692: pop
      // 0693: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0696: bipush 6
      // 0698: swap
      // 0699: aastore
      // 069a: dup_x1
      // 069b: swap
      // 069c: bipush 5
      // 069d: swap
      // 069e: aastore
      // 069f: dup_x1
      // 06a0: swap
      // 06a1: bipush 4
      // 06a2: swap
      // 06a3: aastore
      // 06a4: dup_x1
      // 06a5: swap
      // 06a6: bipush 3
      // 06a7: swap
      // 06a8: aastore
      // 06a9: dup_x1
      // 06aa: swap
      // 06ab: bipush 2
      // 06ac: swap
      // 06ad: aastore
      // 06ae: dup_x1
      // 06af: swap
      // 06b0: bipush 1
      // 06b1: swap
      // 06b2: aastore
      // 06b3: dup_x1
      // 06b4: swap
      // 06b5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06b8: bipush 0
      // 06b9: swap
      // 06ba: aastore
      // 06bb: ldc2_w -4526786223673986754
      // 06be: lload 9
      // 06c0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c5: areturn
      // 06c6: aload 0
      // 06c7: iload 40
      // 06c9: aload 37
      // 06cb: aload 36
      // 06cd: ldc2_w -2638797400477528472
      // 06d0: lload 9
      // 06d2: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d7: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 06da: aload 42
      // 06dc: lload 22
      // 06de: aload 38
      // 06e0: bipush 8
      // 06e2: anewarray 384
      // 06e5: dup_x1
      // 06e6: swap
      // 06e7: bipush 7
      // 06e9: swap
      // 06ea: aastore
      // 06eb: dup_x2
      // 06ec: dup_x2
      // 06ed: pop
      // 06ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06f1: bipush 6
      // 06f3: swap
      // 06f4: aastore
      // 06f5: dup_x1
      // 06f6: swap
      // 06f7: bipush 5
      // 06f8: swap
      // 06f9: aastore
      // 06fa: dup_x1
      // 06fb: swap
      // 06fc: bipush 4
      // 06fd: swap
      // 06fe: aastore
      // 06ff: dup_x1
      // 0700: swap
      // 0701: bipush 3
      // 0702: swap
      // 0703: aastore
      // 0704: dup_x1
      // 0705: swap
      // 0706: bipush 2
      // 0707: swap
      // 0708: aastore
      // 0709: dup_x1
      // 070a: swap
      // 070b: bipush 1
      // 070c: swap
      // 070d: aastore
      // 070e: dup_x1
      // 070f: swap
      // 0710: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0713: bipush 0
      // 0714: swap
      // 0715: aastore
      // 0716: ldc2_w -4526786223673986754
      // 0719: lload 9
      // 071b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0720: areturn
      // 0721: aload 0
      // 0722: iload 40
      // 0724: aload 37
      // 0726: aload 36
      // 0728: ldc2_w -2390258588030115756
      // 072b: lload 9
      // 072d: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0732: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 0735: aload 42
      // 0737: lload 22
      // 0739: aload 38
      // 073b: bipush 8
      // 073d: anewarray 384
      // 0740: dup_x1
      // 0741: swap
      // 0742: bipush 7
      // 0744: swap
      // 0745: aastore
      // 0746: dup_x2
      // 0747: dup_x2
      // 0748: pop
      // 0749: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 074c: bipush 6
      // 074e: swap
      // 074f: aastore
      // 0750: dup_x1
      // 0751: swap
      // 0752: bipush 5
      // 0753: swap
      // 0754: aastore
      // 0755: dup_x1
      // 0756: swap
      // 0757: bipush 4
      // 0758: swap
      // 0759: aastore
      // 075a: dup_x1
      // 075b: swap
      // 075c: bipush 3
      // 075d: swap
      // 075e: aastore
      // 075f: dup_x1
      // 0760: swap
      // 0761: bipush 2
      // 0762: swap
      // 0763: aastore
      // 0764: dup_x1
      // 0765: swap
      // 0766: bipush 1
      // 0767: swap
      // 0768: aastore
      // 0769: dup_x1
      // 076a: swap
      // 076b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 076e: bipush 0
      // 076f: swap
      // 0770: aastore
      // 0771: ldc2_w -4526786223673986754
      // 0774: lload 9
      // 0776: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077b: areturn
      // 077c: iload 40
      // 077e: bipush 3
      // 077f: isub
      // 0780: lload 20
      // 0782: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0785: astore 39
      // 0787: aload 37
      // 0789: bipush 0
      // 078a: aload 39
      // 078c: bipush 0
      // 078d: iload 40
      // 078f: bipush 3
      // 0790: isub
      // 0791: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0794: new com/zelix/hz
      // 0797: dup
      // 0798: aload 39
      // 079a: aload 36
      // 079c: lload 18
      // 079e: aload 42
      // 07a0: aload 38
      // 07a2: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 07a5: areturn
      // 07a6: iload 40
      // 07a8: bipush 3
      // 07a9: isub
      // 07aa: lload 20
      // 07ac: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 07af: astore 39
      // 07b1: aload 37
      // 07b3: bipush 0
      // 07b4: aload 39
      // 07b6: bipush 0
      // 07b7: iload 40
      // 07b9: bipush 3
      // 07ba: isub
      // 07bb: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 07be: new com/zelix/hz
      // 07c1: dup
      // 07c2: aload 39
      // 07c4: aload 36
      // 07c6: lload 18
      // 07c8: aload 42
      // 07ca: aload 38
      // 07cc: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 07cf: areturn
      // 07d0: iload 40
      // 07d2: bipush 3
      // 07d3: isub
      // 07d4: lload 20
      // 07d6: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 07d9: astore 39
      // 07db: aload 37
      // 07dd: bipush 0
      // 07de: aload 39
      // 07e0: bipush 0
      // 07e1: iload 40
      // 07e3: bipush 3
      // 07e4: isub
      // 07e5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 07e8: new com/zelix/hz
      // 07eb: dup
      // 07ec: aload 39
      // 07ee: aload 36
      // 07f0: lload 18
      // 07f2: aload 42
      // 07f4: aload 38
      // 07f6: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 07f9: areturn
      // 07fa: iload 40
      // 07fc: bipush 3
      // 07fd: isub
      // 07fe: lload 20
      // 0800: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0803: astore 39
      // 0805: aload 37
      // 0807: bipush 0
      // 0808: aload 39
      // 080a: bipush 0
      // 080b: iload 40
      // 080d: bipush 3
      // 080e: isub
      // 080f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0812: new com/zelix/hz
      // 0815: dup
      // 0816: aload 39
      // 0818: aload 36
      // 081a: lload 18
      // 081c: aload 42
      // 081e: aload 38
      // 0820: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0823: areturn
      // 0824: iload 40
      // 0826: bipush 3
      // 0827: isub
      // 0828: lload 20
      // 082a: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 082d: astore 39
      // 082f: aload 37
      // 0831: bipush 0
      // 0832: aload 39
      // 0834: bipush 0
      // 0835: iload 40
      // 0837: bipush 3
      // 0838: isub
      // 0839: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 083c: new com/zelix/hz
      // 083f: dup
      // 0840: aload 39
      // 0842: aload 36
      // 0844: lload 18
      // 0846: aload 42
      // 0848: aload 38
      // 084a: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 084d: areturn
      // 084e: iload 40
      // 0850: bipush 1
      // 0851: isub
      // 0852: iload 34
      // 0854: ifne 089b
      // 0857: ifge 0897
      // 085a: goto 0868
      // 085d: ldc2_w -2562941633481894463
      // 0860: lload 9
      // 0862: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0867: athrow
      // 0868: new com/zelix/au
      // 086b: dup
      // 086c: sipush 23865
      // 086f: ldc2_w 4465099407223603951
      // 0872: lload 9
      // 0874: lxor
      // 0875: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/is.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087a: sipush 24202
      // 087d: ldc2_w 5948288490541662558
      // 0880: lload 9
      // 0882: lxor
      // 0883: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/is.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0888: invokespecial com/zelix/au.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 088b: athrow
      // 088c: ldc2_w -2562941633481894463
      // 088f: lload 9
      // 0891: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0896: athrow
      // 0897: iload 40
      // 0899: bipush 1
      // 089a: isub
      // 089b: lload 20
      // 089d: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 08a0: astore 39
      // 08a2: aload 37
      // 08a4: bipush 0
      // 08a5: aload 39
      // 08a7: bipush 0
      // 08a8: iload 40
      // 08aa: bipush 1
      // 08ab: isub
      // 08ac: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 08af: new com/zelix/hz
      // 08b2: dup
      // 08b3: aload 39
      // 08b5: aload 36
      // 08b7: lload 18
      // 08b9: aload 42
      // 08bb: aload 38
      // 08bd: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 08c0: areturn
      // 08c1: iload 40
      // 08c3: bipush 1
      // 08c4: isub
      // 08c5: iload 34
      // 08c7: iload 4
      // 08c9: iflt 091d
      // 08cc: ifne 091b
      // 08cf: ifge 090f
      // 08d2: goto 08e0
      // 08d5: ldc2_w -2562941633481894463
      // 08d8: lload 9
      // 08da: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08df: athrow
      // 08e0: new com/zelix/au
      // 08e3: dup
      // 08e4: sipush 550
      // 08e7: ldc2_w 2381987277075684852
      // 08ea: lload 9
      // 08ec: lxor
      // 08ed: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/is.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f2: sipush 18752
      // 08f5: ldc2_w 4796655245902403223
      // 08f8: lload 9
      // 08fa: lxor
      // 08fb: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/is.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0900: invokespecial com/zelix/au.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0903: athrow
      // 0904: ldc2_w -2562941633481894463
      // 0907: lload 9
      // 0909: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090e: athrow
      // 090f: aload 37
      // 0911: iload 40
      // 0913: bipush 1
      // 0914: isub
      // 0915: aaload
      // 0916: lload 24
      // 0918: invokestatic com/zelix/hz.I (Lcom/zelix/v7;J)Z
      // 091b: iload 34
      // 091d: iload 7
      // 091f: ifle 0966
      // 0922: ifne 0964
      // 0925: ifeq 0960
      // 0928: goto 0936
      // 092b: ldc2_w -2562941633481894463
      // 092e: lload 9
      // 0930: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0935: athrow
      // 0936: iload 40
      // 0938: bipush 1
      // 0939: isub
      // 093a: lload 20
      // 093c: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 093f: astore 39
      // 0941: aload 37
      // 0943: bipush 0
      // 0944: aload 39
      // 0946: bipush 0
      // 0947: iload 40
      // 0949: bipush 1
      // 094a: isub
      // 094b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 094e: new com/zelix/hz
      // 0951: dup
      // 0952: aload 39
      // 0954: aload 36
      // 0956: lload 18
      // 0958: aload 42
      // 095a: aload 38
      // 095c: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 095f: areturn
      // 0960: iload 40
      // 0962: bipush 2
      // 0963: isub
      // 0964: iload 34
      // 0966: ifne 09ad
      // 0969: ifge 09a9
      // 096c: goto 097a
      // 096f: ldc2_w -2562941633481894463
      // 0972: lload 9
      // 0974: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0979: athrow
      // 097a: new com/zelix/au
      // 097d: dup
      // 097e: sipush 14368
      // 0981: ldc2_w 20016594516912117
      // 0984: lload 9
      // 0986: lxor
      // 0987: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/is.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098c: sipush 18752
      // 098f: ldc2_w 4796655245902403223
      // 0992: lload 9
      // 0994: lxor
      // 0995: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/is.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099a: invokespecial com/zelix/au.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 099d: athrow
      // 099e: ldc2_w -2562941633481894463
      // 09a1: lload 9
      // 09a3: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a8: athrow
      // 09a9: iload 40
      // 09ab: bipush 2
      // 09ac: isub
      // 09ad: lload 20
      // 09af: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 09b2: astore 39
      // 09b4: aload 37
      // 09b6: bipush 0
      // 09b7: aload 39
      // 09b9: bipush 0
      // 09ba: iload 40
      // 09bc: bipush 2
      // 09bd: isub
      // 09be: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 09c1: new com/zelix/hz
      // 09c4: dup
      // 09c5: aload 39
      // 09c7: aload 36
      // 09c9: lload 18
      // 09cb: aload 42
      // 09cd: aload 38
      // 09cf: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 09d2: areturn
      // 09d3: iload 40
      // 09d5: bipush 1
      // 09d6: iadd
      // 09d7: lload 20
      // 09d9: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 09dc: astore 39
      // 09de: aload 37
      // 09e0: bipush 0
      // 09e1: aload 39
      // 09e3: bipush 0
      // 09e4: iload 40
      // 09e6: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 09e9: aload 39
      // 09eb: iload 40
      // 09ed: aload 37
      // 09ef: iload 40
      // 09f1: bipush 1
      // 09f2: isub
      // 09f3: aaload
      // 09f4: aastore
      // 09f5: new com/zelix/hz
      // 09f8: dup
      // 09f9: aload 39
      // 09fb: aload 36
      // 09fd: lload 18
      // 09ff: aload 42
      // 0a01: aload 38
      // 0a03: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0a06: areturn
      // 0a07: iload 40
      // 0a09: bipush 1
      // 0a0a: iadd
      // 0a0b: lload 20
      // 0a0d: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0a10: astore 39
      // 0a12: aload 39
      // 0a14: arraylength
      // 0a15: istore 41
      // 0a17: aload 37
      // 0a19: bipush 0
      // 0a1a: aload 39
      // 0a1c: bipush 0
      // 0a1d: iload 40
      // 0a1f: bipush 2
      // 0a20: isub
      // 0a21: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a24: aload 39
      // 0a26: iload 41
      // 0a28: bipush 3
      // 0a29: isub
      // 0a2a: aload 37
      // 0a2c: iload 40
      // 0a2e: bipush 1
      // 0a2f: isub
      // 0a30: aaload
      // 0a31: aastore
      // 0a32: aload 39
      // 0a34: iload 41
      // 0a36: bipush 2
      // 0a37: isub
      // 0a38: aload 37
      // 0a3a: iload 40
      // 0a3c: bipush 2
      // 0a3d: isub
      // 0a3e: aaload
      // 0a3f: aastore
      // 0a40: aload 39
      // 0a42: iload 41
      // 0a44: bipush 1
      // 0a45: isub
      // 0a46: aload 37
      // 0a48: iload 40
      // 0a4a: bipush 1
      // 0a4b: isub
      // 0a4c: aaload
      // 0a4d: aastore
      // 0a4e: new com/zelix/hz
      // 0a51: dup
      // 0a52: aload 39
      // 0a54: aload 36
      // 0a56: lload 18
      // 0a58: aload 42
      // 0a5a: aload 38
      // 0a5c: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0a5f: areturn
      // 0a60: iload 40
      // 0a62: bipush 1
      // 0a63: iadd
      // 0a64: lload 20
      // 0a66: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0a69: astore 39
      // 0a6b: aload 39
      // 0a6d: arraylength
      // 0a6e: istore 41
      // 0a70: iload 3
      // 0a71: iflt 0b2f
      // 0a74: aload 37
      // 0a76: iload 40
      // 0a78: bipush 2
      // 0a79: isub
      // 0a7a: iload 34
      // 0a7c: ifne 0b27
      // 0a7f: aaload
      // 0a80: lload 24
      // 0a82: invokestatic com/zelix/hz.I (Lcom/zelix/v7;J)Z
      // 0a85: ifeq 0aea
      // 0a88: goto 0a96
      // 0a8b: ldc2_w -2562941633481894463
      // 0a8e: lload 9
      // 0a90: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a95: athrow
      // 0a96: aload 37
      // 0a98: bipush 0
      // 0a99: aload 39
      // 0a9b: bipush 0
      // 0a9c: iload 40
      // 0a9e: bipush 2
      // 0a9f: isub
      // 0aa0: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0aa3: aload 39
      // 0aa5: iload 41
      // 0aa7: bipush 3
      // 0aa8: isub
      // 0aa9: aload 37
      // 0aab: iload 40
      // 0aad: bipush 1
      // 0aae: isub
      // 0aaf: aaload
      // 0ab0: aastore
      // 0ab1: aload 39
      // 0ab3: iload 41
      // 0ab5: bipush 2
      // 0ab6: isub
      // 0ab7: aload 37
      // 0ab9: iload 40
      // 0abb: bipush 2
      // 0abc: isub
      // 0abd: aaload
      // 0abe: aastore
      // 0abf: aload 39
      // 0ac1: iload 41
      // 0ac3: bipush 1
      // 0ac4: isub
      // 0ac5: aload 37
      // 0ac7: iload 40
      // 0ac9: bipush 1
      // 0aca: isub
      // 0acb: aaload
      // 0acc: aastore
      // 0acd: new com/zelix/hz
      // 0ad0: dup
      // 0ad1: aload 39
      // 0ad3: aload 36
      // 0ad5: lload 18
      // 0ad7: aload 42
      // 0ad9: aload 38
      // 0adb: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0ade: areturn
      // 0adf: ldc2_w -2562941633481894463
      // 0ae2: lload 9
      // 0ae4: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae9: athrow
      // 0aea: aload 37
      // 0aec: bipush 0
      // 0aed: aload 39
      // 0aef: bipush 0
      // 0af0: iload 40
      // 0af2: bipush 3
      // 0af3: isub
      // 0af4: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0af7: aload 39
      // 0af9: iload 41
      // 0afb: bipush 4
      // 0afc: isub
      // 0afd: aload 37
      // 0aff: iload 40
      // 0b01: bipush 1
      // 0b02: isub
      // 0b03: aaload
      // 0b04: aastore
      // 0b05: aload 39
      // 0b07: iload 41
      // 0b09: bipush 3
      // 0b0a: isub
      // 0b0b: aload 37
      // 0b0d: iload 40
      // 0b0f: bipush 3
      // 0b10: isub
      // 0b11: aaload
      // 0b12: aastore
      // 0b13: aload 39
      // 0b15: iload 41
      // 0b17: bipush 2
      // 0b18: isub
      // 0b19: aload 37
      // 0b1b: iload 40
      // 0b1d: bipush 2
      // 0b1e: isub
      // 0b1f: aaload
      // 0b20: aastore
      // 0b21: aload 39
      // 0b23: iload 41
      // 0b25: bipush 1
      // 0b26: isub
      // 0b27: aload 37
      // 0b29: iload 40
      // 0b2b: bipush 1
      // 0b2c: isub
      // 0b2d: aaload
      // 0b2e: aastore
      // 0b2f: new com/zelix/hz
      // 0b32: dup
      // 0b33: aload 39
      // 0b35: aload 36
      // 0b37: lload 18
      // 0b39: aload 42
      // 0b3b: aload 38
      // 0b3d: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0b40: areturn
      // 0b41: aload 37
      // 0b43: iload 3
      // 0b44: iflt 0bab
      // 0b47: iload 40
      // 0b49: bipush 1
      // 0b4a: isub
      // 0b4b: aaload
      // 0b4c: lload 24
      // 0b4e: invokestatic com/zelix/hz.I (Lcom/zelix/v7;J)Z
      // 0b51: iload 34
      // 0b53: ifne 0ba6
      // 0b56: ifeq 0ba2
      // 0b59: goto 0b67
      // 0b5c: ldc2_w -2562941633481894463
      // 0b5f: lload 9
      // 0b61: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b66: athrow
      // 0b67: iload 40
      // 0b69: bipush 1
      // 0b6a: iadd
      // 0b6b: lload 20
      // 0b6d: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0b70: astore 39
      // 0b72: aload 39
      // 0b74: arraylength
      // 0b75: istore 41
      // 0b77: aload 37
      // 0b79: bipush 0
      // 0b7a: aload 39
      // 0b7c: bipush 0
      // 0b7d: iload 40
      // 0b7f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0b82: aload 39
      // 0b84: iload 41
      // 0b86: bipush 1
      // 0b87: isub
      // 0b88: aload 37
      // 0b8a: iload 40
      // 0b8c: bipush 1
      // 0b8d: isub
      // 0b8e: aaload
      // 0b8f: aastore
      // 0b90: new com/zelix/hz
      // 0b93: dup
      // 0b94: aload 39
      // 0b96: aload 36
      // 0b98: lload 18
      // 0b9a: aload 42
      // 0b9c: aload 38
      // 0b9e: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0ba1: areturn
      // 0ba2: iload 40
      // 0ba4: bipush 2
      // 0ba5: iadd
      // 0ba6: lload 20
      // 0ba8: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0bab: astore 39
      // 0bad: aload 39
      // 0baf: arraylength
      // 0bb0: istore 41
      // 0bb2: aload 37
      // 0bb4: bipush 0
      // 0bb5: aload 39
      // 0bb7: bipush 0
      // 0bb8: iload 40
      // 0bba: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0bbd: aload 39
      // 0bbf: iload 41
      // 0bc1: bipush 2
      // 0bc2: isub
      // 0bc3: aload 37
      // 0bc5: iload 40
      // 0bc7: bipush 2
      // 0bc8: isub
      // 0bc9: aaload
      // 0bca: aastore
      // 0bcb: aload 39
      // 0bcd: iload 41
      // 0bcf: bipush 1
      // 0bd0: isub
      // 0bd1: aload 37
      // 0bd3: iload 40
      // 0bd5: bipush 1
      // 0bd6: isub
      // 0bd7: aaload
      // 0bd8: aastore
      // 0bd9: new com/zelix/hz
      // 0bdc: dup
      // 0bdd: aload 39
      // 0bdf: aload 36
      // 0be1: lload 18
      // 0be3: aload 42
      // 0be5: aload 38
      // 0be7: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0bea: areturn
      // 0beb: aload 37
      // 0bed: iload 4
      // 0bef: ifle 0c74
      // 0bf2: iload 40
      // 0bf4: bipush 1
      // 0bf5: isub
      // 0bf6: aaload
      // 0bf7: lload 24
      // 0bf9: invokestatic com/zelix/hz.I (Lcom/zelix/v7;J)Z
      // 0bfc: iload 34
      // 0bfe: ifne 0c6f
      // 0c01: ifeq 0c6b
      // 0c04: goto 0c12
      // 0c07: ldc2_w -2562941633481894463
      // 0c0a: lload 9
      // 0c0c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c11: athrow
      // 0c12: iload 40
      // 0c14: bipush 1
      // 0c15: iadd
      // 0c16: lload 20
      // 0c18: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0c1b: astore 39
      // 0c1d: aload 39
      // 0c1f: arraylength
      // 0c20: istore 41
      // 0c22: aload 37
      // 0c24: bipush 0
      // 0c25: aload 39
      // 0c27: bipush 0
      // 0c28: iload 40
      // 0c2a: bipush 2
      // 0c2b: isub
      // 0c2c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0c2f: aload 39
      // 0c31: iload 41
      // 0c33: bipush 3
      // 0c34: isub
      // 0c35: aload 37
      // 0c37: iload 40
      // 0c39: bipush 1
      // 0c3a: isub
      // 0c3b: aaload
      // 0c3c: aastore
      // 0c3d: aload 39
      // 0c3f: iload 41
      // 0c41: bipush 2
      // 0c42: isub
      // 0c43: aload 37
      // 0c45: iload 40
      // 0c47: bipush 2
      // 0c48: isub
      // 0c49: aaload
      // 0c4a: aastore
      // 0c4b: aload 39
      // 0c4d: iload 41
      // 0c4f: bipush 1
      // 0c50: isub
      // 0c51: aload 37
      // 0c53: iload 40
      // 0c55: bipush 1
      // 0c56: isub
      // 0c57: aaload
      // 0c58: aastore
      // 0c59: new com/zelix/hz
      // 0c5c: dup
      // 0c5d: aload 39
      // 0c5f: aload 36
      // 0c61: lload 18
      // 0c63: aload 42
      // 0c65: aload 38
      // 0c67: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0c6a: areturn
      // 0c6b: iload 40
      // 0c6d: bipush 2
      // 0c6e: iadd
      // 0c6f: lload 20
      // 0c71: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0c74: astore 39
      // 0c76: aload 39
      // 0c78: arraylength
      // 0c79: istore 41
      // 0c7b: aload 37
      // 0c7d: bipush 0
      // 0c7e: aload 39
      // 0c80: bipush 0
      // 0c81: iload 40
      // 0c83: bipush 3
      // 0c84: isub
      // 0c85: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0c88: aload 39
      // 0c8a: iload 41
      // 0c8c: bipush 5
      // 0c8d: isub
      // 0c8e: aload 37
      // 0c90: iload 40
      // 0c92: bipush 2
      // 0c93: isub
      // 0c94: aaload
      // 0c95: aastore
      // 0c96: aload 39
      // 0c98: iload 41
      // 0c9a: bipush 4
      // 0c9b: isub
      // 0c9c: aload 37
      // 0c9e: iload 40
      // 0ca0: bipush 1
      // 0ca1: isub
      // 0ca2: aaload
      // 0ca3: aastore
      // 0ca4: aload 39
      // 0ca6: iload 41
      // 0ca8: bipush 3
      // 0ca9: isub
      // 0caa: aload 37
      // 0cac: iload 40
      // 0cae: bipush 3
      // 0caf: isub
      // 0cb0: aaload
      // 0cb1: aastore
      // 0cb2: aload 39
      // 0cb4: iload 41
      // 0cb6: bipush 2
      // 0cb7: isub
      // 0cb8: aload 37
      // 0cba: iload 40
      // 0cbc: bipush 2
      // 0cbd: isub
      // 0cbe: aaload
      // 0cbf: aastore
      // 0cc0: aload 39
      // 0cc2: iload 41
      // 0cc4: bipush 1
      // 0cc5: isub
      // 0cc6: aload 37
      // 0cc8: iload 40
      // 0cca: bipush 1
      // 0ccb: isub
      // 0ccc: aaload
      // 0ccd: aastore
      // 0cce: new com/zelix/hz
      // 0cd1: dup
      // 0cd2: aload 39
      // 0cd4: aload 36
      // 0cd6: lload 18
      // 0cd8: aload 42
      // 0cda: aload 38
      // 0cdc: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0cdf: areturn
      // 0ce0: aload 37
      // 0ce2: iload 40
      // 0ce4: bipush 1
      // 0ce5: isub
      // 0ce6: aaload
      // 0ce7: lload 24
      // 0ce9: invokestatic com/zelix/hz.I (Lcom/zelix/v7;J)Z
      // 0cec: iload 34
      // 0cee: iload 4
      // 0cf0: iflt 0e09
      // 0cf3: ifne 0e07
      // 0cf6: ifeq 0dfb
      // 0cf9: goto 0d07
      // 0cfc: ldc2_w -2562941633481894463
      // 0cff: lload 9
      // 0d01: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d06: athrow
      // 0d07: aload 37
      // 0d09: iload 3
      // 0d0a: iflt 0d9d
      // 0d0d: iload 40
      // 0d0f: bipush 2
      // 0d10: isub
      // 0d11: aaload
      // 0d12: lload 24
      // 0d14: invokestatic com/zelix/hz.I (Lcom/zelix/v7;J)Z
      // 0d17: iload 34
      // 0d19: ifne 0d98
      // 0d1c: goto 0d2a
      // 0d1f: ldc2_w -2562941633481894463
      // 0d22: lload 9
      // 0d24: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d29: athrow
      // 0d2a: ifeq 0d94
      // 0d2d: goto 0d3b
      // 0d30: ldc2_w -2562941633481894463
      // 0d33: lload 9
      // 0d35: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3a: athrow
      // 0d3b: iload 40
      // 0d3d: bipush 1
      // 0d3e: iadd
      // 0d3f: lload 20
      // 0d41: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0d44: astore 39
      // 0d46: aload 39
      // 0d48: arraylength
      // 0d49: istore 41
      // 0d4b: aload 37
      // 0d4d: bipush 0
      // 0d4e: aload 39
      // 0d50: bipush 0
      // 0d51: iload 40
      // 0d53: bipush 2
      // 0d54: isub
      // 0d55: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0d58: aload 39
      // 0d5a: iload 41
      // 0d5c: bipush 3
      // 0d5d: isub
      // 0d5e: aload 37
      // 0d60: iload 40
      // 0d62: bipush 1
      // 0d63: isub
      // 0d64: aaload
      // 0d65: aastore
      // 0d66: aload 39
      // 0d68: iload 41
      // 0d6a: bipush 2
      // 0d6b: isub
      // 0d6c: aload 37
      // 0d6e: iload 40
      // 0d70: bipush 2
      // 0d71: isub
      // 0d72: aaload
      // 0d73: aastore
      // 0d74: aload 39
      // 0d76: iload 41
      // 0d78: bipush 1
      // 0d79: isub
      // 0d7a: aload 37
      // 0d7c: iload 40
      // 0d7e: bipush 1
      // 0d7f: isub
      // 0d80: aaload
      // 0d81: aastore
      // 0d82: new com/zelix/hz
      // 0d85: dup
      // 0d86: aload 39
      // 0d88: aload 36
      // 0d8a: lload 18
      // 0d8c: aload 42
      // 0d8e: aload 38
      // 0d90: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0d93: areturn
      // 0d94: iload 40
      // 0d96: bipush 1
      // 0d97: iadd
      // 0d98: lload 20
      // 0d9a: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0d9d: astore 39
      // 0d9f: aload 39
      // 0da1: arraylength
      // 0da2: istore 41
      // 0da4: aload 37
      // 0da6: bipush 0
      // 0da7: aload 39
      // 0da9: bipush 0
      // 0daa: iload 40
      // 0dac: bipush 3
      // 0dad: isub
      // 0dae: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0db1: aload 39
      // 0db3: iload 41
      // 0db5: bipush 4
      // 0db6: isub
      // 0db7: aload 37
      // 0db9: iload 40
      // 0dbb: bipush 1
      // 0dbc: isub
      // 0dbd: aaload
      // 0dbe: aastore
      // 0dbf: aload 39
      // 0dc1: iload 41
      // 0dc3: bipush 3
      // 0dc4: isub
      // 0dc5: aload 37
      // 0dc7: iload 40
      // 0dc9: bipush 3
      // 0dca: isub
      // 0dcb: aaload
      // 0dcc: aastore
      // 0dcd: aload 39
      // 0dcf: iload 41
      // 0dd1: bipush 2
      // 0dd2: isub
      // 0dd3: aload 37
      // 0dd5: iload 40
      // 0dd7: bipush 2
      // 0dd8: isub
      // 0dd9: aaload
      // 0dda: aastore
      // 0ddb: aload 39
      // 0ddd: iload 41
      // 0ddf: bipush 1
      // 0de0: isub
      // 0de1: aload 37
      // 0de3: iload 40
      // 0de5: bipush 1
      // 0de6: isub
      // 0de7: aaload
      // 0de8: aastore
      // 0de9: new com/zelix/hz
      // 0dec: dup
      // 0ded: aload 39
      // 0def: aload 36
      // 0df1: lload 18
      // 0df3: aload 42
      // 0df5: aload 38
      // 0df7: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0dfa: areturn
      // 0dfb: aload 37
      // 0dfd: iload 40
      // 0dff: bipush 3
      // 0e00: isub
      // 0e01: aaload
      // 0e02: lload 24
      // 0e04: invokestatic com/zelix/hz.I (Lcom/zelix/v7;J)Z
      // 0e07: iload 34
      // 0e09: ifne 0e96
      // 0e0c: ifeq 0e92
      // 0e0f: goto 0e1d
      // 0e12: ldc2_w -2562941633481894463
      // 0e15: lload 9
      // 0e17: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1c: athrow
      // 0e1d: iload 40
      // 0e1f: bipush 2
      // 0e20: iadd
      // 0e21: lload 20
      // 0e23: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0e26: astore 39
      // 0e28: aload 39
      // 0e2a: arraylength
      // 0e2b: istore 41
      // 0e2d: aload 37
      // 0e2f: bipush 0
      // 0e30: aload 39
      // 0e32: bipush 0
      // 0e33: iload 40
      // 0e35: bipush 3
      // 0e36: isub
      // 0e37: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0e3a: aload 39
      // 0e3c: iload 41
      // 0e3e: bipush 5
      // 0e3f: isub
      // 0e40: aload 37
      // 0e42: iload 40
      // 0e44: bipush 2
      // 0e45: isub
      // 0e46: aaload
      // 0e47: aastore
      // 0e48: aload 39
      // 0e4a: iload 41
      // 0e4c: bipush 4
      // 0e4d: isub
      // 0e4e: aload 37
      // 0e50: iload 40
      // 0e52: bipush 1
      // 0e53: isub
      // 0e54: aaload
      // 0e55: aastore
      // 0e56: aload 39
      // 0e58: iload 41
      // 0e5a: bipush 3
      // 0e5b: isub
      // 0e5c: aload 37
      // 0e5e: iload 40
      // 0e60: bipush 3
      // 0e61: isub
      // 0e62: aaload
      // 0e63: aastore
      // 0e64: aload 39
      // 0e66: iload 41
      // 0e68: bipush 2
      // 0e69: isub
      // 0e6a: aload 37
      // 0e6c: iload 40
      // 0e6e: bipush 2
      // 0e6f: isub
      // 0e70: aaload
      // 0e71: aastore
      // 0e72: aload 39
      // 0e74: iload 41
      // 0e76: bipush 1
      // 0e77: isub
      // 0e78: aload 37
      // 0e7a: iload 40
      // 0e7c: bipush 1
      // 0e7d: isub
      // 0e7e: aaload
      // 0e7f: aastore
      // 0e80: new com/zelix/hz
      // 0e83: dup
      // 0e84: aload 39
      // 0e86: aload 36
      // 0e88: lload 18
      // 0e8a: aload 42
      // 0e8c: aload 38
      // 0e8e: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0e91: areturn
      // 0e92: iload 40
      // 0e94: bipush 2
      // 0e95: iadd
      // 0e96: lload 20
      // 0e98: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0e9b: astore 39
      // 0e9d: aload 39
      // 0e9f: arraylength
      // 0ea0: istore 41
      // 0ea2: aload 37
      // 0ea4: bipush 0
      // 0ea5: aload 39
      // 0ea7: bipush 0
      // 0ea8: iload 40
      // 0eaa: bipush 4
      // 0eab: isub
      // 0eac: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0eaf: aload 39
      // 0eb1: iload 41
      // 0eb3: sipush 27895
      // 0eb6: ldc2_w 4116442572411835457
      // 0eb9: lload 9
      // 0ebb: lxor
      // 0ebc: invokedynamic b (IJ)I bsm=com/zelix/is.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec1: isub
      // 0ec2: aload 37
      // 0ec4: iload 40
      // 0ec6: bipush 2
      // 0ec7: isub
      // 0ec8: aaload
      // 0ec9: aastore
      // 0eca: aload 39
      // 0ecc: iload 41
      // 0ece: bipush 5
      // 0ecf: isub
      // 0ed0: aload 37
      // 0ed2: iload 40
      // 0ed4: bipush 1
      // 0ed5: isub
      // 0ed6: aaload
      // 0ed7: aastore
      // 0ed8: aload 39
      // 0eda: iload 41
      // 0edc: bipush 4
      // 0edd: isub
      // 0ede: aload 37
      // 0ee0: iload 40
      // 0ee2: bipush 4
      // 0ee3: isub
      // 0ee4: aaload
      // 0ee5: aastore
      // 0ee6: aload 39
      // 0ee8: iload 41
      // 0eea: bipush 3
      // 0eeb: isub
      // 0eec: aload 37
      // 0eee: iload 40
      // 0ef0: bipush 3
      // 0ef1: isub
      // 0ef2: aaload
      // 0ef3: aastore
      // 0ef4: aload 39
      // 0ef6: iload 41
      // 0ef8: bipush 2
      // 0ef9: isub
      // 0efa: aload 37
      // 0efc: iload 40
      // 0efe: bipush 2
      // 0eff: isub
      // 0f00: aaload
      // 0f01: aastore
      // 0f02: aload 39
      // 0f04: iload 41
      // 0f06: bipush 1
      // 0f07: isub
      // 0f08: aload 37
      // 0f0a: iload 40
      // 0f0c: bipush 1
      // 0f0d: isub
      // 0f0e: aaload
      // 0f0f: aastore
      // 0f10: new com/zelix/hz
      // 0f13: dup
      // 0f14: aload 39
      // 0f16: aload 36
      // 0f18: lload 18
      // 0f1a: aload 42
      // 0f1c: aload 38
      // 0f1e: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0f21: areturn
      // 0f22: iload 40
      // 0f24: lload 20
      // 0f26: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0f29: astore 39
      // 0f2b: aload 37
      // 0f2d: bipush 0
      // 0f2e: aload 39
      // 0f30: bipush 0
      // 0f31: iload 40
      // 0f33: bipush 2
      // 0f34: isub
      // 0f35: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f38: aload 39
      // 0f3a: iload 40
      // 0f3c: bipush 2
      // 0f3d: isub
      // 0f3e: aload 37
      // 0f40: iload 40
      // 0f42: bipush 1
      // 0f43: isub
      // 0f44: aaload
      // 0f45: aastore
      // 0f46: aload 39
      // 0f48: iload 40
      // 0f4a: bipush 1
      // 0f4b: isub
      // 0f4c: aload 37
      // 0f4e: iload 40
      // 0f50: bipush 2
      // 0f51: isub
      // 0f52: aaload
      // 0f53: aastore
      // 0f54: new com/zelix/hz
      // 0f57: dup
      // 0f58: aload 39
      // 0f5a: aload 36
      // 0f5c: lload 18
      // 0f5e: aload 42
      // 0f60: aload 38
      // 0f62: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0f65: areturn
      // 0f66: iload 40
      // 0f68: bipush 1
      // 0f69: isub
      // 0f6a: lload 20
      // 0f6c: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0f6f: astore 39
      // 0f71: aload 37
      // 0f73: bipush 0
      // 0f74: aload 39
      // 0f76: bipush 0
      // 0f77: iload 40
      // 0f79: bipush 2
      // 0f7a: isub
      // 0f7b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f7e: aload 39
      // 0f80: iload 40
      // 0f82: bipush 2
      // 0f83: isub
      // 0f84: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 0f87: aastore
      // 0f88: new com/zelix/hz
      // 0f8b: dup
      // 0f8c: aload 39
      // 0f8e: aload 36
      // 0f90: lload 18
      // 0f92: aload 42
      // 0f94: aload 38
      // 0f96: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0f99: areturn
      // 0f9a: iload 40
      // 0f9c: bipush 1
      // 0f9d: isub
      // 0f9e: lload 20
      // 0fa0: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0fa3: astore 39
      // 0fa5: aload 37
      // 0fa7: bipush 0
      // 0fa8: aload 39
      // 0faa: bipush 0
      // 0fab: iload 40
      // 0fad: bipush 2
      // 0fae: isub
      // 0faf: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0fb2: aload 39
      // 0fb4: iload 40
      // 0fb6: bipush 2
      // 0fb7: isub
      // 0fb8: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 0fbb: aastore
      // 0fbc: new com/zelix/hz
      // 0fbf: dup
      // 0fc0: aload 39
      // 0fc2: aload 36
      // 0fc4: lload 18
      // 0fc6: aload 42
      // 0fc8: aload 38
      // 0fca: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 0fcd: areturn
      // 0fce: iload 40
      // 0fd0: bipush 1
      // 0fd1: isub
      // 0fd2: lload 20
      // 0fd4: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 0fd7: astore 39
      // 0fd9: aload 37
      // 0fdb: bipush 0
      // 0fdc: aload 39
      // 0fde: bipush 0
      // 0fdf: iload 40
      // 0fe1: bipush 2
      // 0fe2: isub
      // 0fe3: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0fe6: aload 39
      // 0fe8: iload 40
      // 0fea: bipush 2
      // 0feb: isub
      // 0fec: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 0fef: aastore
      // 0ff0: new com/zelix/hz
      // 0ff3: dup
      // 0ff4: aload 39
      // 0ff6: aload 36
      // 0ff8: lload 18
      // 0ffa: aload 42
      // 0ffc: aload 38
      // 0ffe: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1001: areturn
      // 1002: iload 40
      // 1004: bipush 1
      // 1005: isub
      // 1006: lload 20
      // 1008: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 100b: astore 39
      // 100d: aload 37
      // 100f: bipush 0
      // 1010: aload 39
      // 1012: bipush 0
      // 1013: iload 40
      // 1015: bipush 1
      // 1016: isub
      // 1017: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 101a: new com/zelix/hz
      // 101d: dup
      // 101e: aload 39
      // 1020: aload 36
      // 1022: lload 18
      // 1024: aload 42
      // 1026: aload 38
      // 1028: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 102b: areturn
      // 102c: iload 40
      // 102e: bipush 1
      // 102f: isub
      // 1030: lload 20
      // 1032: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 1035: astore 39
      // 1037: aload 37
      // 1039: bipush 0
      // 103a: aload 39
      // 103c: bipush 0
      // 103d: iload 40
      // 103f: bipush 1
      // 1040: isub
      // 1041: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1044: new com/zelix/hz
      // 1047: dup
      // 1048: aload 39
      // 104a: aload 36
      // 104c: lload 18
      // 104e: aload 42
      // 1050: aload 38
      // 1052: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1055: areturn
      // 1056: new com/zelix/hz
      // 1059: dup
      // 105a: aload 37
      // 105c: aload 36
      // 105e: lload 18
      // 1060: aload 42
      // 1062: aload 38
      // 1064: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1067: areturn
      // 1068: new com/zelix/hz
      // 106b: dup
      // 106c: aload 37
      // 106e: aload 36
      // 1070: lload 18
      // 1072: aload 42
      // 1074: aload 38
      // 1076: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1079: areturn
      // 107a: new com/zelix/hz
      // 107d: dup
      // 107e: aload 37
      // 1080: aload 36
      // 1082: lload 18
      // 1084: aload 42
      // 1086: aload 38
      // 1088: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 108b: areturn
      // 108c: new com/zelix/hz
      // 108f: dup
      // 1090: aload 37
      // 1092: aload 36
      // 1094: lload 18
      // 1096: aload 42
      // 1098: aload 38
      // 109a: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 109d: areturn
      // 109e: iload 40
      // 10a0: lload 20
      // 10a2: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 10a5: astore 39
      // 10a7: aload 37
      // 10a9: bipush 0
      // 10aa: aload 39
      // 10ac: bipush 0
      // 10ad: iload 40
      // 10af: bipush 1
      // 10b0: isub
      // 10b1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 10b4: aload 39
      // 10b6: iload 40
      // 10b8: bipush 1
      // 10b9: isub
      // 10ba: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 10bd: aastore
      // 10be: new com/zelix/hz
      // 10c1: dup
      // 10c2: aload 39
      // 10c4: aload 36
      // 10c6: lload 18
      // 10c8: aload 42
      // 10ca: aload 38
      // 10cc: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 10cf: areturn
      // 10d0: iload 40
      // 10d2: lload 20
      // 10d4: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 10d7: astore 39
      // 10d9: aload 37
      // 10db: bipush 0
      // 10dc: aload 39
      // 10de: bipush 0
      // 10df: iload 40
      // 10e1: bipush 1
      // 10e2: isub
      // 10e3: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 10e6: aload 39
      // 10e8: iload 40
      // 10ea: bipush 1
      // 10eb: isub
      // 10ec: getstatic com/zelix/v7.V Lcom/zelix/v7;
      // 10ef: aastore
      // 10f0: new com/zelix/hz
      // 10f3: dup
      // 10f4: aload 39
      // 10f6: aload 36
      // 10f8: lload 18
      // 10fa: aload 42
      // 10fc: aload 38
      // 10fe: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1101: areturn
      // 1102: iload 40
      // 1104: lload 20
      // 1106: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 1109: astore 39
      // 110b: aload 37
      // 110d: bipush 0
      // 110e: aload 39
      // 1110: bipush 0
      // 1111: iload 40
      // 1113: bipush 1
      // 1114: isub
      // 1115: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1118: aload 39
      // 111a: iload 40
      // 111c: bipush 1
      // 111d: isub
      // 111e: getstatic com/zelix/v7.z Lcom/zelix/v7;
      // 1121: aastore
      // 1122: new com/zelix/hz
      // 1125: dup
      // 1126: aload 39
      // 1128: aload 36
      // 112a: lload 18
      // 112c: aload 42
      // 112e: aload 38
      // 1130: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1133: areturn
      // 1134: iload 40
      // 1136: lload 20
      // 1138: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 113b: astore 39
      // 113d: aload 37
      // 113f: bipush 0
      // 1140: aload 39
      // 1142: bipush 0
      // 1143: iload 40
      // 1145: bipush 1
      // 1146: isub
      // 1147: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 114a: aload 39
      // 114c: iload 40
      // 114e: bipush 1
      // 114f: isub
      // 1150: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 1153: aastore
      // 1154: new com/zelix/hz
      // 1157: dup
      // 1158: aload 39
      // 115a: aload 36
      // 115c: lload 18
      // 115e: aload 42
      // 1160: aload 38
      // 1162: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1165: areturn
      // 1166: iload 40
      // 1168: lload 20
      // 116a: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 116d: astore 39
      // 116f: aload 37
      // 1171: bipush 0
      // 1172: aload 39
      // 1174: bipush 0
      // 1175: iload 40
      // 1177: bipush 1
      // 1178: isub
      // 1179: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 117c: aload 39
      // 117e: iload 40
      // 1180: bipush 1
      // 1181: isub
      // 1182: getstatic com/zelix/v7.V Lcom/zelix/v7;
      // 1185: aastore
      // 1186: new com/zelix/hz
      // 1189: dup
      // 118a: aload 39
      // 118c: aload 36
      // 118e: lload 18
      // 1190: aload 42
      // 1192: aload 38
      // 1194: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1197: areturn
      // 1198: iload 40
      // 119a: lload 20
      // 119c: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 119f: astore 39
      // 11a1: aload 37
      // 11a3: bipush 0
      // 11a4: aload 39
      // 11a6: bipush 0
      // 11a7: iload 40
      // 11a9: bipush 1
      // 11aa: isub
      // 11ab: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 11ae: aload 39
      // 11b0: iload 40
      // 11b2: bipush 1
      // 11b3: isub
      // 11b4: getstatic com/zelix/v7.z Lcom/zelix/v7;
      // 11b7: aastore
      // 11b8: new com/zelix/hz
      // 11bb: dup
      // 11bc: aload 39
      // 11be: aload 36
      // 11c0: lload 18
      // 11c2: aload 42
      // 11c4: aload 38
      // 11c6: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 11c9: areturn
      // 11ca: iload 40
      // 11cc: lload 20
      // 11ce: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 11d1: astore 39
      // 11d3: aload 37
      // 11d5: bipush 0
      // 11d6: aload 39
      // 11d8: bipush 0
      // 11d9: iload 40
      // 11db: bipush 1
      // 11dc: isub
      // 11dd: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 11e0: aload 39
      // 11e2: iload 40
      // 11e4: bipush 1
      // 11e5: isub
      // 11e6: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 11e9: aastore
      // 11ea: new com/zelix/hz
      // 11ed: dup
      // 11ee: aload 39
      // 11f0: aload 36
      // 11f2: lload 18
      // 11f4: aload 42
      // 11f6: aload 38
      // 11f8: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 11fb: areturn
      // 11fc: iload 40
      // 11fe: lload 20
      // 1200: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 1203: astore 39
      // 1205: aload 37
      // 1207: bipush 0
      // 1208: aload 39
      // 120a: bipush 0
      // 120b: iload 40
      // 120d: bipush 1
      // 120e: isub
      // 120f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1212: aload 39
      // 1214: iload 40
      // 1216: bipush 1
      // 1217: isub
      // 1218: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 121b: aastore
      // 121c: new com/zelix/hz
      // 121f: dup
      // 1220: aload 39
      // 1222: aload 36
      // 1224: lload 18
      // 1226: aload 42
      // 1228: aload 38
      // 122a: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 122d: areturn
      // 122e: iload 40
      // 1230: lload 20
      // 1232: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 1235: astore 39
      // 1237: aload 37
      // 1239: bipush 0
      // 123a: aload 39
      // 123c: bipush 0
      // 123d: iload 40
      // 123f: bipush 1
      // 1240: isub
      // 1241: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1244: aload 39
      // 1246: iload 40
      // 1248: bipush 1
      // 1249: isub
      // 124a: getstatic com/zelix/v7.z Lcom/zelix/v7;
      // 124d: aastore
      // 124e: new com/zelix/hz
      // 1251: dup
      // 1252: aload 39
      // 1254: aload 36
      // 1256: lload 18
      // 1258: aload 42
      // 125a: aload 38
      // 125c: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 125f: areturn
      // 1260: iload 40
      // 1262: lload 20
      // 1264: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 1267: astore 39
      // 1269: aload 37
      // 126b: bipush 0
      // 126c: aload 39
      // 126e: bipush 0
      // 126f: iload 40
      // 1271: bipush 1
      // 1272: isub
      // 1273: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1276: aload 39
      // 1278: iload 40
      // 127a: bipush 1
      // 127b: isub
      // 127c: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 127f: aastore
      // 1280: new com/zelix/hz
      // 1283: dup
      // 1284: aload 39
      // 1286: aload 36
      // 1288: lload 18
      // 128a: aload 42
      // 128c: aload 38
      // 128e: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1291: areturn
      // 1292: iload 40
      // 1294: lload 20
      // 1296: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 1299: astore 39
      // 129b: aload 37
      // 129d: bipush 0
      // 129e: aload 39
      // 12a0: bipush 0
      // 12a1: iload 40
      // 12a3: bipush 1
      // 12a4: isub
      // 12a5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 12a8: aload 39
      // 12aa: iload 40
      // 12ac: bipush 1
      // 12ad: isub
      // 12ae: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 12b1: aastore
      // 12b2: new com/zelix/hz
      // 12b5: dup
      // 12b6: aload 39
      // 12b8: aload 36
      // 12ba: lload 18
      // 12bc: aload 42
      // 12be: aload 38
      // 12c0: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 12c3: areturn
      // 12c4: iload 40
      // 12c6: lload 20
      // 12c8: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 12cb: astore 39
      // 12cd: aload 37
      // 12cf: bipush 0
      // 12d0: aload 39
      // 12d2: bipush 0
      // 12d3: iload 40
      // 12d5: bipush 1
      // 12d6: isub
      // 12d7: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 12da: aload 39
      // 12dc: iload 40
      // 12de: bipush 1
      // 12df: isub
      // 12e0: getstatic com/zelix/v7.V Lcom/zelix/v7;
      // 12e3: aastore
      // 12e4: new com/zelix/hz
      // 12e7: dup
      // 12e8: aload 39
      // 12ea: aload 36
      // 12ec: lload 18
      // 12ee: aload 42
      // 12f0: aload 38
      // 12f2: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 12f5: areturn
      // 12f6: iload 40
      // 12f8: bipush 1
      // 12f9: isub
      // 12fa: lload 20
      // 12fc: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 12ff: astore 39
      // 1301: aload 39
      // 1303: arraylength
      // 1304: istore 41
      // 1306: aload 37
      // 1308: bipush 0
      // 1309: aload 39
      // 130b: bipush 0
      // 130c: iload 40
      // 130e: bipush 2
      // 130f: isub
      // 1310: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1313: aload 39
      // 1315: iload 41
      // 1317: bipush 1
      // 1318: isub
      // 1319: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 131c: aastore
      // 131d: new com/zelix/hz
      // 1320: dup
      // 1321: aload 39
      // 1323: aload 36
      // 1325: lload 18
      // 1327: aload 42
      // 1329: aload 38
      // 132b: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 132e: areturn
      // 132f: iload 40
      // 1331: bipush 1
      // 1332: isub
      // 1333: lload 20
      // 1335: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 1338: astore 39
      // 133a: aload 39
      // 133c: arraylength
      // 133d: istore 41
      // 133f: aload 37
      // 1341: bipush 0
      // 1342: aload 39
      // 1344: bipush 0
      // 1345: iload 40
      // 1347: bipush 2
      // 1348: isub
      // 1349: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 134c: aload 39
      // 134e: iload 41
      // 1350: bipush 1
      // 1351: isub
      // 1352: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 1355: aastore
      // 1356: new com/zelix/hz
      // 1359: dup
      // 135a: aload 39
      // 135c: aload 36
      // 135e: lload 18
      // 1360: aload 42
      // 1362: aload 38
      // 1364: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1367: areturn
      // 1368: iload 40
      // 136a: bipush 1
      // 136b: isub
      // 136c: lload 20
      // 136e: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 1371: astore 39
      // 1373: aload 39
      // 1375: arraylength
      // 1376: istore 41
      // 1378: aload 37
      // 137a: bipush 0
      // 137b: aload 39
      // 137d: bipush 0
      // 137e: iload 40
      // 1380: bipush 2
      // 1381: isub
      // 1382: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1385: aload 39
      // 1387: iload 41
      // 1389: bipush 1
      // 138a: isub
      // 138b: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 138e: aastore
      // 138f: new com/zelix/hz
      // 1392: dup
      // 1393: aload 39
      // 1395: aload 36
      // 1397: lload 18
      // 1399: aload 42
      // 139b: aload 38
      // 139d: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 13a0: areturn
      // 13a1: new com/zelix/hz
      // 13a4: dup
      // 13a5: aload 36
      // 13a7: aload 42
      // 13a9: lload 11
      // 13ab: aload 38
      // 13ad: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;Lcom/zelix/fb;JLjava/util/Set;)V
      // 13b0: areturn
      // 13b1: new com/zelix/hz
      // 13b4: dup
      // 13b5: aload 36
      // 13b7: aload 42
      // 13b9: lload 11
      // 13bb: aload 38
      // 13bd: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;Lcom/zelix/fb;JLjava/util/Set;)V
      // 13c0: areturn
      // 13c1: new com/zelix/hz
      // 13c4: dup
      // 13c5: aload 36
      // 13c7: aload 42
      // 13c9: lload 11
      // 13cb: aload 38
      // 13cd: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;Lcom/zelix/fb;JLjava/util/Set;)V
      // 13d0: areturn
      // 13d1: new com/zelix/hz
      // 13d4: dup
      // 13d5: aload 36
      // 13d7: aload 42
      // 13d9: lload 11
      // 13db: aload 38
      // 13dd: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;Lcom/zelix/fb;JLjava/util/Set;)V
      // 13e0: areturn
      // 13e1: new com/zelix/hz
      // 13e4: dup
      // 13e5: aload 36
      // 13e7: aload 42
      // 13e9: lload 11
      // 13eb: aload 38
      // 13ed: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;Lcom/zelix/fb;JLjava/util/Set;)V
      // 13f0: areturn
      // 13f1: new com/zelix/hz
      // 13f4: dup
      // 13f5: aload 36
      // 13f7: aload 42
      // 13f9: lload 11
      // 13fb: aload 38
      // 13fd: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;Lcom/zelix/fb;JLjava/util/Set;)V
      // 1400: areturn
      // 1401: iload 40
      // 1403: lload 20
      // 1405: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 1408: astore 39
      // 140a: aload 37
      // 140c: bipush 0
      // 140d: aload 39
      // 140f: bipush 0
      // 1410: iload 40
      // 1412: bipush 1
      // 1413: isub
      // 1414: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1417: aload 39
      // 1419: iload 40
      // 141b: bipush 1
      // 141c: isub
      // 141d: getstatic com/zelix/v7.B Lcom/zelix/v7;
      // 1420: aastore
      // 1421: new com/zelix/hz
      // 1424: dup
      // 1425: aload 39
      // 1427: aload 36
      // 1429: lload 18
      // 142b: aload 42
      // 142d: aload 38
      // 142f: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1432: areturn
      // 1433: new com/zelix/hz
      // 1436: dup
      // 1437: aload 37
      // 1439: aload 36
      // 143b: lload 18
      // 143d: aload 42
      // 143f: aload 38
      // 1441: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1444: areturn
      // 1445: bipush 0
      // 1446: aload 0
      // 1447: getfield com/zelix/is.X I
      // 144a: lload 32
      // 144c: dup2_x2
      // 144d: pop2
      // 144e: bipush 3
      // 144f: anewarray 384
      // 1452: dup_x1
      // 1453: swap
      // 1454: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1457: bipush 2
      // 1458: swap
      // 1459: aastore
      // 145a: dup_x1
      // 145b: swap
      // 145c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 145f: bipush 1
      // 1460: swap
      // 1461: aastore
      // 1462: dup_x2
      // 1463: dup_x2
      // 1464: pop
      // 1465: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1468: bipush 0
      // 1469: swap
      // 146a: aastore
      // 146b: ldc2_w -2798397269065866027
      // 146e: lload 9
      // 1470: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1475: aconst_null
      // 1476: areturn
   }

   private is(int var1) {
      super(var1);
   }

   public final boolean e(long param1, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: bipush 32
      // 003: lshl
      // 004: iload 3
      // 005: i2l
      // 006: bipush 32
      // 008: lshl
      // 009: bipush 32
      // 00b: lushr
      // 00c: lor
      // 00d: lstore 4
      // 00f: lload 4
      // 011: dup2
      // 012: ldc2_w 131013425808676
      // 015: lxor
      // 016: lstore 6
      // 018: pop2
      // 019: ldc2_w -1116877179038697293
      // 01c: lload 4
      // 01e: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: istore 8
      // 025: aload 0
      // 026: getfield com/zelix/is.X I
      // 029: iload 8
      // 02b: ifne 385
      // 02e: tableswitch 808 0 191 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 793 793 793 793 793 793 793 793 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 808 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 806 806 806 806 806 806 808 808 808 808 808 808 808 808 808 808 808 808 793 806
      // 33c: ldc2_w -1104322207950980861
      // 33f: lload 4
      // 341: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: athrow
      // 347: bipush 1
      // 348: ireturn
      // 349: ldc2_w -1104322207950980861
      // 34c: lload 4
      // 34e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 353: athrow
      // 354: bipush 0
      // 355: ireturn
      // 356: lload 6
      // 358: bipush 0
      // 359: aload 0
      // 35a: getfield com/zelix/is.X I
      // 35d: bipush 3
      // 35e: anewarray 384
      // 361: dup_x1
      // 362: swap
      // 363: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 366: bipush 2
      // 367: swap
      // 368: aastore
      // 369: dup_x1
      // 36a: swap
      // 36b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 36e: bipush 1
      // 36f: swap
      // 370: aastore
      // 371: dup_x2
      // 372: dup_x2
      // 373: pop
      // 374: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 377: bipush 0
      // 378: swap
      // 379: aastore
      // 37a: ldc2_w -727284718132344809
      // 37d: lload 4
      // 37f: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 384: bipush 1
      // 385: ireturn
   }

   public final int H(Object[] param1) {
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
      // 004: checkcast [Lcom/zelix/v7;
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 2
      // 01e: pop
      // 01f: lload 2
      // 020: dup2
      // 021: ldc2_w 67737034982540
      // 024: lxor
      // 025: lstore 6
      // 027: dup2
      // 028: ldc2_w 18504140888694
      // 02b: lxor
      // 02c: dup2
      // 02d: bipush 32
      // 02f: lushr
      // 030: l2i
      // 031: istore 8
      // 033: dup2
      // 034: bipush 32
      // 036: lshl
      // 037: bipush 56
      // 039: lushr
      // 03a: l2i
      // 03b: istore 9
      // 03d: dup2
      // 03e: bipush 40
      // 040: lshl
      // 041: bipush 40
      // 043: lushr
      // 044: l2i
      // 045: istore 10
      // 047: pop2
      // 048: dup2
      // 049: ldc2_w 14136036366886
      // 04c: lxor
      // 04d: lstore 11
      // 04f: pop2
      // 050: aload 5
      // 052: arraylength
      // 053: istore 14
      // 055: ldc2_w 3637682383613983143
      // 058: lload 2
      // 059: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: iload 14
      // 060: bipush 1
      // 061: isub
      // 062: istore 15
      // 064: istore 13
      // 066: aload 0
      // 067: getfield com/zelix/is.X I
      // 06a: iload 13
      // 06c: ifeq adb
      // 06f: tableswitch 2583 87 95 2580 2580 59 115 273 712 916 1384 2485
      // 0a0: ldc2_w 3280838202873701416
      // 0a3: lload 2
      // 0a4: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: iload 4
      // 0ac: iload 13
      // 0ae: ifeq 0e1
      // 0b1: goto 0be
      // 0b4: ldc2_w 3280838202873701416
      // 0b7: lload 2
      // 0b8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: iload 15
      // 0c0: if_icmpne 0df
      // 0c3: goto 0d0
      // 0c6: ldc2_w 3280838202873701416
      // 0c9: lload 2
      // 0ca: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: iload 4
      // 0d2: bipush 1
      // 0d3: isub
      // 0d4: ireturn
      // 0d5: ldc2_w 3280838202873701416
      // 0d8: lload 2
      // 0d9: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: iload 4
      // 0e1: ireturn
      // 0e2: iload 4
      // 0e4: lload 2
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: ifle 146
      // 0ea: iload 15
      // 0ec: iload 13
      // 0ee: ifeq 145
      // 0f1: if_icmpeq 135
      // 0f4: goto 101
      // 0f7: ldc2_w 3280838202873701416
      // 0fa: lload 2
      // 0fb: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: iload 4
      // 103: iload 15
      // 105: bipush 1
      // 106: isub
      // 107: lload 2
      // 108: lconst_0
      // 109: lcmp
      // 10a: iflt 165
      // 10d: iload 13
      // 10f: ifeq 165
      // 112: goto 11f
      // 115: ldc2_w 3280838202873701416
      // 118: lload 2
      // 119: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: lload 2
      // 120: lconst_0
      // 121: lcmp
      // 122: iflt 14b
      // 125: if_icmpne 147
      // 128: goto 135
      // 12b: ldc2_w 3280838202873701416
      // 12e: lload 2
      // 12f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: iload 4
      // 137: bipush 1
      // 138: goto 145
      // 13b: ldc2_w 3280838202873701416
      // 13e: lload 2
      // 13f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: isub
      // 146: ireturn
      // 147: iload 4
      // 149: iload 13
      // 14b: lload 2
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: ifle 158
      // 151: ifeq 17f
      // 154: iload 15
      // 156: bipush 2
      // 157: isub
      // 158: goto 165
      // 15b: ldc2_w 3280838202873701416
      // 15e: lload 2
      // 15f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: lload 2
      // 166: lconst_0
      // 167: lcmp
      // 168: iflt 171
      // 16b: if_icmpne 17d
      // 16e: iload 4
      // 170: bipush 1
      // 171: iadd
      // 172: ireturn
      // 173: ldc2_w 3280838202873701416
      // 176: lload 2
      // 177: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: iload 4
      // 17f: ireturn
      // 180: aload 5
      // 182: iload 15
      // 184: bipush 1
      // 185: isub
      // 186: aaload
      // 187: lload 6
      // 189: bipush 1
      // 18a: anewarray 384
      // 18d: dup_x2
      // 18e: dup_x2
      // 18f: pop
      // 190: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 193: bipush 0
      // 194: swap
      // 195: aastore
      // 196: ldc2_w 3118999670634279669
      // 199: lload 2
      // 19a: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: iload 13
      // 1a1: lload 2
      // 1a2: lconst_0
      // 1a3: lcmp
      // 1a4: iflt 26f
      // 1a7: ifeq 26d
      // 1aa: ifeq 26b
      // 1ad: goto 1ba
      // 1b0: ldc2_w 3280838202873701416
      // 1b3: lload 2
      // 1b4: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: iload 4
      // 1bc: lload 2
      // 1bd: lconst_0
      // 1be: lcmp
      // 1bf: ifle 231
      // 1c2: iload 15
      // 1c4: iload 13
      // 1c6: ifeq 230
      // 1c9: goto 1d6
      // 1cc: ldc2_w 3280838202873701416
      // 1cf: lload 2
      // 1d0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: athrow
      // 1d6: lload 2
      // 1d7: lconst_0
      // 1d8: lcmp
      // 1d9: ifle 223
      // 1dc: if_icmpeq 220
      // 1df: goto 1ec
      // 1e2: ldc2_w 3280838202873701416
      // 1e5: lload 2
      // 1e6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: iload 4
      // 1ee: iload 15
      // 1f0: bipush 1
      // 1f1: isub
      // 1f2: lload 2
      // 1f3: lconst_0
      // 1f4: lcmp
      // 1f5: ifle 250
      // 1f8: iload 13
      // 1fa: ifeq 250
      // 1fd: goto 20a
      // 200: ldc2_w 3280838202873701416
      // 203: lload 2
      // 204: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: lload 2
      // 20b: lconst_0
      // 20c: lcmp
      // 20d: ifle 236
      // 210: if_icmpne 232
      // 213: goto 220
      // 216: ldc2_w 3280838202873701416
      // 219: lload 2
      // 21a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: athrow
      // 220: iload 4
      // 222: bipush 1
      // 223: goto 230
      // 226: ldc2_w 3280838202873701416
      // 229: lload 2
      // 22a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: isub
      // 231: ireturn
      // 232: iload 4
      // 234: iload 13
      // 236: lload 2
      // 237: lconst_0
      // 238: lcmp
      // 239: iflt 243
      // 23c: ifeq 26a
      // 23f: iload 15
      // 241: bipush 2
      // 242: isub
      // 243: goto 250
      // 246: ldc2_w 3280838202873701416
      // 249: lload 2
      // 24a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: athrow
      // 250: lload 2
      // 251: lconst_0
      // 252: lcmp
      // 253: iflt 25c
      // 256: if_icmpne 268
      // 259: iload 4
      // 25b: bipush 1
      // 25c: iadd
      // 25d: ireturn
      // 25e: ldc2_w 3280838202873701416
      // 261: lload 2
      // 262: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 267: athrow
      // 268: iload 4
      // 26a: ireturn
      // 26b: iload 4
      // 26d: iload 15
      // 26f: iload 13
      // 271: ifeq 2fc
      // 274: if_icmpeq 2ec
      // 277: goto 284
      // 27a: ldc2_w 3280838202873701416
      // 27d: lload 2
      // 27e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: athrow
      // 284: iload 4
      // 286: lload 2
      // 287: lconst_0
      // 288: lcmp
      // 289: iflt 2fd
      // 28c: iload 15
      // 28e: bipush 1
      // 28f: isub
      // 290: iload 13
      // 292: ifeq 2fc
      // 295: goto 2a2
      // 298: ldc2_w 3280838202873701416
      // 29b: lload 2
      // 29c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: athrow
      // 2a2: lload 2
      // 2a3: lconst_0
      // 2a4: lcmp
      // 2a5: iflt 2ef
      // 2a8: if_icmpeq 2ec
      // 2ab: goto 2b8
      // 2ae: ldc2_w 3280838202873701416
      // 2b1: lload 2
      // 2b2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: iload 4
      // 2ba: iload 15
      // 2bc: bipush 2
      // 2bd: isub
      // 2be: lload 2
      // 2bf: lconst_0
      // 2c0: lcmp
      // 2c1: ifle 31c
      // 2c4: iload 13
      // 2c6: ifeq 31c
      // 2c9: goto 2d6
      // 2cc: ldc2_w 3280838202873701416
      // 2cf: lload 2
      // 2d0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: athrow
      // 2d6: lload 2
      // 2d7: lconst_0
      // 2d8: lcmp
      // 2d9: ifle 302
      // 2dc: if_icmpne 2fe
      // 2df: goto 2ec
      // 2e2: ldc2_w 3280838202873701416
      // 2e5: lload 2
      // 2e6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: athrow
      // 2ec: iload 4
      // 2ee: bipush 1
      // 2ef: goto 2fc
      // 2f2: ldc2_w 3280838202873701416
      // 2f5: lload 2
      // 2f6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: athrow
      // 2fc: isub
      // 2fd: ireturn
      // 2fe: iload 4
      // 300: iload 13
      // 302: lload 2
      // 303: lconst_0
      // 304: lcmp
      // 305: ifle 30f
      // 308: ifeq 336
      // 30b: iload 15
      // 30d: bipush 3
      // 30e: isub
      // 30f: goto 31c
      // 312: ldc2_w 3280838202873701416
      // 315: lload 2
      // 316: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: athrow
      // 31c: lload 2
      // 31d: lconst_0
      // 31e: lcmp
      // 31f: ifle 328
      // 322: if_icmpne 334
      // 325: iload 4
      // 327: bipush 2
      // 328: iadd
      // 329: ireturn
      // 32a: ldc2_w 3280838202873701416
      // 32d: lload 2
      // 32e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: athrow
      // 334: iload 4
      // 336: ireturn
      // 337: aload 5
      // 339: iload 15
      // 33b: aaload
      // 33c: lload 6
      // 33e: bipush 1
      // 33f: anewarray 384
      // 342: dup_x2
      // 343: dup_x2
      // 344: pop
      // 345: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 348: bipush 0
      // 349: swap
      // 34a: aastore
      // 34b: ldc2_w 3118999670634279669
      // 34e: lload 2
      // 34f: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 354: iload 13
      // 356: lload 2
      // 357: lconst_0
      // 358: lcmp
      // 359: iflt 3b1
      // 35c: ifeq 3a9
      // 35f: ifeq 3a7
      // 362: goto 36f
      // 365: ldc2_w 3280838202873701416
      // 368: lload 2
      // 369: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36e: athrow
      // 36f: iload 4
      // 371: iload 13
      // 373: ifeq 3a6
      // 376: goto 383
      // 379: ldc2_w 3280838202873701416
      // 37c: lload 2
      // 37d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 382: athrow
      // 383: iload 15
      // 385: if_icmpne 3a4
      // 388: goto 395
      // 38b: ldc2_w 3280838202873701416
      // 38e: lload 2
      // 38f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 394: athrow
      // 395: iload 4
      // 397: bipush 1
      // 398: isub
      // 399: ireturn
      // 39a: ldc2_w 3280838202873701416
      // 39d: lload 2
      // 39e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a3: athrow
      // 3a4: iload 4
      // 3a6: ireturn
      // 3a7: iload 4
      // 3a9: lload 2
      // 3aa: lconst_0
      // 3ab: lcmp
      // 3ac: iflt 3ff
      // 3af: iload 15
      // 3b1: iload 13
      // 3b3: ifeq 3fe
      // 3b6: if_icmpeq 3ee
      // 3b9: goto 3c6
      // 3bc: ldc2_w 3280838202873701416
      // 3bf: lload 2
      // 3c0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c5: athrow
      // 3c6: iload 4
      // 3c8: iload 13
      // 3ca: ifeq 402
      // 3cd: goto 3da
      // 3d0: ldc2_w 3280838202873701416
      // 3d3: lload 2
      // 3d4: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d9: athrow
      // 3da: iload 15
      // 3dc: bipush 1
      // 3dd: isub
      // 3de: if_icmpne 400
      // 3e1: goto 3ee
      // 3e4: ldc2_w 3280838202873701416
      // 3e7: lload 2
      // 3e8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ed: athrow
      // 3ee: iload 4
      // 3f0: bipush 2
      // 3f1: goto 3fe
      // 3f4: ldc2_w 3280838202873701416
      // 3f7: lload 2
      // 3f8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fd: athrow
      // 3fe: isub
      // 3ff: ireturn
      // 400: iload 4
      // 402: ireturn
      // 403: aload 5
      // 405: iload 15
      // 407: aaload
      // 408: lload 6
      // 40a: bipush 1
      // 40b: anewarray 384
      // 40e: dup_x2
      // 40f: dup_x2
      // 410: pop
      // 411: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 414: bipush 0
      // 415: swap
      // 416: aastore
      // 417: ldc2_w 3118999670634279669
      // 41a: lload 2
      // 41b: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: iload 13
      // 422: lload 2
      // 423: lconst_0
      // 424: lcmp
      // 425: ifle 4f0
      // 428: ifeq 4ee
      // 42b: ifeq 4ec
      // 42e: goto 43b
      // 431: ldc2_w 3280838202873701416
      // 434: lload 2
      // 435: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43a: athrow
      // 43b: iload 4
      // 43d: lload 2
      // 43e: lconst_0
      // 43f: lcmp
      // 440: ifle 4b2
      // 443: iload 15
      // 445: iload 13
      // 447: ifeq 4b1
      // 44a: goto 457
      // 44d: ldc2_w 3280838202873701416
      // 450: lload 2
      // 451: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: athrow
      // 457: lload 2
      // 458: lconst_0
      // 459: lcmp
      // 45a: iflt 4a4
      // 45d: if_icmpeq 4a1
      // 460: goto 46d
      // 463: ldc2_w 3280838202873701416
      // 466: lload 2
      // 467: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46c: athrow
      // 46d: iload 4
      // 46f: iload 15
      // 471: bipush 1
      // 472: isub
      // 473: lload 2
      // 474: lconst_0
      // 475: lcmp
      // 476: ifle 4d1
      // 479: iload 13
      // 47b: ifeq 4d1
      // 47e: goto 48b
      // 481: ldc2_w 3280838202873701416
      // 484: lload 2
      // 485: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48a: athrow
      // 48b: lload 2
      // 48c: lconst_0
      // 48d: lcmp
      // 48e: ifle 4b7
      // 491: if_icmpne 4b3
      // 494: goto 4a1
      // 497: ldc2_w 3280838202873701416
      // 49a: lload 2
      // 49b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a0: athrow
      // 4a1: iload 4
      // 4a3: bipush 1
      // 4a4: goto 4b1
      // 4a7: ldc2_w 3280838202873701416
      // 4aa: lload 2
      // 4ab: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b0: athrow
      // 4b1: isub
      // 4b2: ireturn
      // 4b3: iload 4
      // 4b5: iload 13
      // 4b7: lload 2
      // 4b8: lconst_0
      // 4b9: lcmp
      // 4ba: iflt 4c4
      // 4bd: ifeq 4eb
      // 4c0: iload 15
      // 4c2: bipush 2
      // 4c3: isub
      // 4c4: goto 4d1
      // 4c7: ldc2_w 3280838202873701416
      // 4ca: lload 2
      // 4cb: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d0: athrow
      // 4d1: lload 2
      // 4d2: lconst_0
      // 4d3: lcmp
      // 4d4: ifle 4dd
      // 4d7: if_icmpne 4e9
      // 4da: iload 4
      // 4dc: bipush 1
      // 4dd: iadd
      // 4de: ireturn
      // 4df: ldc2_w 3280838202873701416
      // 4e2: lload 2
      // 4e3: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e8: athrow
      // 4e9: iload 4
      // 4eb: ireturn
      // 4ec: iload 4
      // 4ee: iload 15
      // 4f0: iload 13
      // 4f2: ifeq 57d
      // 4f5: if_icmpeq 56d
      // 4f8: goto 505
      // 4fb: ldc2_w 3280838202873701416
      // 4fe: lload 2
      // 4ff: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 504: athrow
      // 505: iload 4
      // 507: lload 2
      // 508: lconst_0
      // 509: lcmp
      // 50a: iflt 57e
      // 50d: iload 15
      // 50f: bipush 1
      // 510: isub
      // 511: iload 13
      // 513: ifeq 57d
      // 516: goto 523
      // 519: ldc2_w 3280838202873701416
      // 51c: lload 2
      // 51d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 522: athrow
      // 523: lload 2
      // 524: lconst_0
      // 525: lcmp
      // 526: ifle 570
      // 529: if_icmpeq 56d
      // 52c: goto 539
      // 52f: ldc2_w 3280838202873701416
      // 532: lload 2
      // 533: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 538: athrow
      // 539: iload 4
      // 53b: iload 15
      // 53d: bipush 2
      // 53e: isub
      // 53f: iload 13
      // 541: lload 2
      // 542: lconst_0
      // 543: lcmp
      // 544: iflt 587
      // 547: ifeq 585
      // 54a: goto 557
      // 54d: ldc2_w 3280838202873701416
      // 550: lload 2
      // 551: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 556: athrow
      // 557: lload 2
      // 558: lconst_0
      // 559: lcmp
      // 55a: ifle 583
      // 55d: if_icmpne 57f
      // 560: goto 56d
      // 563: ldc2_w 3280838202873701416
      // 566: lload 2
      // 567: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56c: athrow
      // 56d: iload 4
      // 56f: bipush 2
      // 570: goto 57d
      // 573: ldc2_w 3280838202873701416
      // 576: lload 2
      // 577: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57c: athrow
      // 57d: isub
      // 57e: ireturn
      // 57f: iload 4
      // 581: iload 15
      // 583: bipush 3
      // 584: isub
      // 585: iload 13
      // 587: ifeq 5d2
      // 58a: if_icmpeq 5c2
      // 58d: goto 59a
      // 590: ldc2_w 3280838202873701416
      // 593: lload 2
      // 594: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 599: athrow
      // 59a: iload 4
      // 59c: iload 13
      // 59e: ifeq 5d6
      // 5a1: goto 5ae
      // 5a4: ldc2_w 3280838202873701416
      // 5a7: lload 2
      // 5a8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ad: athrow
      // 5ae: iload 15
      // 5b0: bipush 4
      // 5b1: isub
      // 5b2: if_icmpne 5d4
      // 5b5: goto 5c2
      // 5b8: ldc2_w 3280838202873701416
      // 5bb: lload 2
      // 5bc: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c1: athrow
      // 5c2: iload 4
      // 5c4: bipush 1
      // 5c5: goto 5d2
      // 5c8: ldc2_w 3280838202873701416
      // 5cb: lload 2
      // 5cc: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d1: athrow
      // 5d2: iadd
      // 5d3: ireturn
      // 5d4: iload 4
      // 5d6: ireturn
      // 5d7: aload 5
      // 5d9: iload 15
      // 5db: aaload
      // 5dc: lload 6
      // 5de: bipush 1
      // 5df: anewarray 384
      // 5e2: dup_x2
      // 5e3: dup_x2
      // 5e4: pop
      // 5e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e8: bipush 0
      // 5e9: swap
      // 5ea: aastore
      // 5eb: ldc2_w 3118999670634279669
      // 5ee: lload 2
      // 5ef: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f4: iload 13
      // 5f6: lload 2
      // 5f7: lconst_0
      // 5f8: lcmp
      // 5f9: iflt 7f4
      // 5fc: ifeq 7f2
      // 5ff: ifeq 7d3
      // 602: goto 60f
      // 605: ldc2_w 3280838202873701416
      // 608: lload 2
      // 609: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60e: athrow
      // 60f: aload 5
      // 611: iload 15
      // 613: bipush 1
      // 614: isub
      // 615: aaload
      // 616: lload 6
      // 618: bipush 1
      // 619: anewarray 384
      // 61c: dup_x2
      // 61d: dup_x2
      // 61e: pop
      // 61f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 622: bipush 0
      // 623: swap
      // 624: aastore
      // 625: ldc2_w 3118999670634279669
      // 628: lload 2
      // 629: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62e: iload 13
      // 630: lload 2
      // 631: lconst_0
      // 632: lcmp
      // 633: iflt 70b
      // 636: ifeq 709
      // 639: goto 646
      // 63c: ldc2_w 3280838202873701416
      // 63f: lload 2
      // 640: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 645: athrow
      // 646: ifeq 707
      // 649: goto 656
      // 64c: ldc2_w 3280838202873701416
      // 64f: lload 2
      // 650: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 655: athrow
      // 656: iload 4
      // 658: lload 2
      // 659: lconst_0
      // 65a: lcmp
      // 65b: iflt 6cd
      // 65e: iload 15
      // 660: iload 13
      // 662: ifeq 6cc
      // 665: goto 672
      // 668: ldc2_w 3280838202873701416
      // 66b: lload 2
      // 66c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 671: athrow
      // 672: lload 2
      // 673: lconst_0
      // 674: lcmp
      // 675: ifle 6bf
      // 678: if_icmpeq 6bc
      // 67b: goto 688
      // 67e: ldc2_w 3280838202873701416
      // 681: lload 2
      // 682: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 687: athrow
      // 688: iload 4
      // 68a: iload 15
      // 68c: bipush 1
      // 68d: isub
      // 68e: lload 2
      // 68f: lconst_0
      // 690: lcmp
      // 691: ifle 6ec
      // 694: iload 13
      // 696: ifeq 6ec
      // 699: goto 6a6
      // 69c: ldc2_w 3280838202873701416
      // 69f: lload 2
      // 6a0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a5: athrow
      // 6a6: lload 2
      // 6a7: lconst_0
      // 6a8: lcmp
      // 6a9: iflt 6d2
      // 6ac: if_icmpne 6ce
      // 6af: goto 6bc
      // 6b2: ldc2_w 3280838202873701416
      // 6b5: lload 2
      // 6b6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6bb: athrow
      // 6bc: iload 4
      // 6be: bipush 1
      // 6bf: goto 6cc
      // 6c2: ldc2_w 3280838202873701416
      // 6c5: lload 2
      // 6c6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6cb: athrow
      // 6cc: isub
      // 6cd: ireturn
      // 6ce: iload 4
      // 6d0: iload 13
      // 6d2: lload 2
      // 6d3: lconst_0
      // 6d4: lcmp
      // 6d5: ifle 6df
      // 6d8: ifeq 706
      // 6db: iload 15
      // 6dd: bipush 2
      // 6de: isub
      // 6df: goto 6ec
      // 6e2: ldc2_w 3280838202873701416
      // 6e5: lload 2
      // 6e6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6eb: athrow
      // 6ec: lload 2
      // 6ed: lconst_0
      // 6ee: lcmp
      // 6ef: ifle 6f8
      // 6f2: if_icmpne 704
      // 6f5: iload 4
      // 6f7: bipush 1
      // 6f8: iadd
      // 6f9: ireturn
      // 6fa: ldc2_w 3280838202873701416
      // 6fd: lload 2
      // 6fe: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 703: athrow
      // 704: iload 4
      // 706: ireturn
      // 707: iload 4
      // 709: iload 15
      // 70b: iload 13
      // 70d: ifeq 798
      // 710: if_icmpeq 788
      // 713: goto 720
      // 716: ldc2_w 3280838202873701416
      // 719: lload 2
      // 71a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71f: athrow
      // 720: iload 4
      // 722: lload 2
      // 723: lconst_0
      // 724: lcmp
      // 725: iflt 799
      // 728: iload 15
      // 72a: bipush 1
      // 72b: isub
      // 72c: iload 13
      // 72e: ifeq 798
      // 731: goto 73e
      // 734: ldc2_w 3280838202873701416
      // 737: lload 2
      // 738: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73d: athrow
      // 73e: lload 2
      // 73f: lconst_0
      // 740: lcmp
      // 741: iflt 78b
      // 744: if_icmpeq 788
      // 747: goto 754
      // 74a: ldc2_w 3280838202873701416
      // 74d: lload 2
      // 74e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 753: athrow
      // 754: iload 4
      // 756: iload 15
      // 758: bipush 2
      // 759: isub
      // 75a: lload 2
      // 75b: lconst_0
      // 75c: lcmp
      // 75d: ifle 7b8
      // 760: iload 13
      // 762: ifeq 7b8
      // 765: goto 772
      // 768: ldc2_w 3280838202873701416
      // 76b: lload 2
      // 76c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 771: athrow
      // 772: lload 2
      // 773: lconst_0
      // 774: lcmp
      // 775: iflt 79e
      // 778: if_icmpne 79a
      // 77b: goto 788
      // 77e: ldc2_w 3280838202873701416
      // 781: lload 2
      // 782: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 787: athrow
      // 788: iload 4
      // 78a: bipush 1
      // 78b: goto 798
      // 78e: ldc2_w 3280838202873701416
      // 791: lload 2
      // 792: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 797: athrow
      // 798: isub
      // 799: ireturn
      // 79a: iload 4
      // 79c: iload 13
      // 79e: lload 2
      // 79f: lconst_0
      // 7a0: lcmp
      // 7a1: iflt 7ab
      // 7a4: ifeq 7d2
      // 7a7: iload 15
      // 7a9: bipush 3
      // 7aa: isub
      // 7ab: goto 7b8
      // 7ae: ldc2_w 3280838202873701416
      // 7b1: lload 2
      // 7b2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b7: athrow
      // 7b8: lload 2
      // 7b9: lconst_0
      // 7ba: lcmp
      // 7bb: iflt 7c4
      // 7be: if_icmpne 7d0
      // 7c1: iload 4
      // 7c3: bipush 2
      // 7c4: iadd
      // 7c5: ireturn
      // 7c6: ldc2_w 3280838202873701416
      // 7c9: lload 2
      // 7ca: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7cf: athrow
      // 7d0: iload 4
      // 7d2: ireturn
      // 7d3: aload 5
      // 7d5: iload 15
      // 7d7: bipush 2
      // 7d8: isub
      // 7d9: aaload
      // 7da: lload 6
      // 7dc: bipush 1
      // 7dd: anewarray 384
      // 7e0: dup_x2
      // 7e1: dup_x2
      // 7e2: pop
      // 7e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7e6: bipush 0
      // 7e7: swap
      // 7e8: aastore
      // 7e9: ldc2_w 3118999670634279669
      // 7ec: lload 2
      // 7ed: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f2: iload 13
      // 7f4: lload 2
      // 7f5: lconst_0
      // 7f6: lcmp
      // 7f7: ifle 90f
      // 7fa: ifeq 90d
      // 7fd: ifeq 90b
      // 800: goto 80d
      // 803: ldc2_w 3280838202873701416
      // 806: lload 2
      // 807: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80c: athrow
      // 80d: iload 4
      // 80f: iload 15
      // 811: iload 13
      // 813: ifeq 8b1
      // 816: goto 823
      // 819: ldc2_w 3280838202873701416
      // 81c: lload 2
      // 81d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 822: athrow
      // 823: lload 2
      // 824: lconst_0
      // 825: lcmp
      // 826: ifle 8a4
      // 829: if_icmpeq 8a1
      // 82c: goto 839
      // 82f: ldc2_w 3280838202873701416
      // 832: lload 2
      // 833: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 838: athrow
      // 839: iload 4
      // 83b: lload 2
      // 83c: lconst_0
      // 83d: lcmp
      // 83e: iflt 8b2
      // 841: iload 15
      // 843: bipush 1
      // 844: isub
      // 845: iload 13
      // 847: ifeq 8b1
      // 84a: goto 857
      // 84d: ldc2_w 3280838202873701416
      // 850: lload 2
      // 851: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 856: athrow
      // 857: lload 2
      // 858: lconst_0
      // 859: lcmp
      // 85a: iflt 8a4
      // 85d: if_icmpeq 8a1
      // 860: goto 86d
      // 863: ldc2_w 3280838202873701416
      // 866: lload 2
      // 867: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86c: athrow
      // 86d: iload 4
      // 86f: iload 15
      // 871: bipush 2
      // 872: isub
      // 873: iload 13
      // 875: lload 2
      // 876: lconst_0
      // 877: lcmp
      // 878: iflt 8bb
      // 87b: ifeq 8b9
      // 87e: goto 88b
      // 881: ldc2_w 3280838202873701416
      // 884: lload 2
      // 885: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88a: athrow
      // 88b: lload 2
      // 88c: lconst_0
      // 88d: lcmp
      // 88e: ifle 8b7
      // 891: if_icmpne 8b3
      // 894: goto 8a1
      // 897: ldc2_w 3280838202873701416
      // 89a: lload 2
      // 89b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a0: athrow
      // 8a1: iload 4
      // 8a3: bipush 2
      // 8a4: goto 8b1
      // 8a7: ldc2_w 3280838202873701416
      // 8aa: lload 2
      // 8ab: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b0: athrow
      // 8b1: isub
      // 8b2: ireturn
      // 8b3: iload 4
      // 8b5: iload 15
      // 8b7: bipush 3
      // 8b8: isub
      // 8b9: iload 13
      // 8bb: ifeq 906
      // 8be: if_icmpeq 8f6
      // 8c1: goto 8ce
      // 8c4: ldc2_w 3280838202873701416
      // 8c7: lload 2
      // 8c8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8cd: athrow
      // 8ce: iload 4
      // 8d0: iload 13
      // 8d2: ifeq 90a
      // 8d5: goto 8e2
      // 8d8: ldc2_w 3280838202873701416
      // 8db: lload 2
      // 8dc: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e1: athrow
      // 8e2: iload 15
      // 8e4: bipush 4
      // 8e5: isub
      // 8e6: if_icmpne 908
      // 8e9: goto 8f6
      // 8ec: ldc2_w 3280838202873701416
      // 8ef: lload 2
      // 8f0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f5: athrow
      // 8f6: iload 4
      // 8f8: bipush 1
      // 8f9: goto 906
      // 8fc: ldc2_w 3280838202873701416
      // 8ff: lload 2
      // 900: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 905: athrow
      // 906: iadd
      // 907: ireturn
      // 908: iload 4
      // 90a: ireturn
      // 90b: iload 4
      // 90d: iload 15
      // 90f: iload 13
      // 911: ifeq 9ca
      // 914: if_icmpeq 9ba
      // 917: goto 924
      // 91a: ldc2_w 3280838202873701416
      // 91d: lload 2
      // 91e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 923: athrow
      // 924: iload 4
      // 926: iload 15
      // 928: bipush 1
      // 929: isub
      // 92a: iload 13
      // 92c: ifeq 9ca
      // 92f: goto 93c
      // 932: ldc2_w 3280838202873701416
      // 935: lload 2
      // 936: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93b: athrow
      // 93c: lload 2
      // 93d: lconst_0
      // 93e: lcmp
      // 93f: ifle 9bd
      // 942: if_icmpeq 9ba
      // 945: goto 952
      // 948: ldc2_w 3280838202873701416
      // 94b: lload 2
      // 94c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 951: athrow
      // 952: iload 4
      // 954: lload 2
      // 955: lconst_0
      // 956: lcmp
      // 957: iflt 9cb
      // 95a: iload 15
      // 95c: bipush 2
      // 95d: isub
      // 95e: iload 13
      // 960: ifeq 9ca
      // 963: goto 970
      // 966: ldc2_w 3280838202873701416
      // 969: lload 2
      // 96a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96f: athrow
      // 970: lload 2
      // 971: lconst_0
      // 972: lcmp
      // 973: iflt 9bd
      // 976: if_icmpeq 9ba
      // 979: goto 986
      // 97c: ldc2_w 3280838202873701416
      // 97f: lload 2
      // 980: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 985: athrow
      // 986: iload 4
      // 988: iload 15
      // 98a: bipush 3
      // 98b: isub
      // 98c: iload 13
      // 98e: lload 2
      // 98f: lconst_0
      // 990: lcmp
      // 991: iflt 9d4
      // 994: ifeq 9d2
      // 997: goto 9a4
      // 99a: ldc2_w 3280838202873701416
      // 99d: lload 2
      // 99e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a3: athrow
      // 9a4: lload 2
      // 9a5: lconst_0
      // 9a6: lcmp
      // 9a7: ifle 9d0
      // 9aa: if_icmpne 9cc
      // 9ad: goto 9ba
      // 9b0: ldc2_w 3280838202873701416
      // 9b3: lload 2
      // 9b4: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b9: athrow
      // 9ba: iload 4
      // 9bc: bipush 2
      // 9bd: goto 9ca
      // 9c0: ldc2_w 3280838202873701416
      // 9c3: lload 2
      // 9c4: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c9: athrow
      // 9ca: isub
      // 9cb: ireturn
      // 9cc: iload 4
      // 9ce: iload 15
      // 9d0: bipush 4
      // 9d1: isub
      // 9d2: iload 13
      // 9d4: ifeq a1f
      // 9d7: if_icmpeq a0f
      // 9da: goto 9e7
      // 9dd: ldc2_w 3280838202873701416
      // 9e0: lload 2
      // 9e1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e6: athrow
      // 9e7: iload 4
      // 9e9: iload 13
      // 9eb: ifeq a23
      // 9ee: goto 9fb
      // 9f1: ldc2_w 3280838202873701416
      // 9f4: lload 2
      // 9f5: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9fa: athrow
      // 9fb: iload 15
      // 9fd: bipush 5
      // 9fe: isub
      // 9ff: if_icmpne a21
      // a02: goto a0f
      // a05: ldc2_w 3280838202873701416
      // a08: lload 2
      // a09: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0e: athrow
      // a0f: iload 4
      // a11: bipush 2
      // a12: goto a1f
      // a15: ldc2_w 3280838202873701416
      // a18: lload 2
      // a19: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1e: athrow
      // a1f: iadd
      // a20: ireturn
      // a21: iload 4
      // a23: ireturn
      // a24: iload 4
      // a26: iload 15
      // a28: lload 2
      // a29: lconst_0
      // a2a: lcmp
      // a2b: iflt a70
      // a2e: iload 13
      // a30: ifeq a70
      // a33: if_icmpne a52
      // a36: goto a43
      // a39: ldc2_w 3280838202873701416
      // a3c: lload 2
      // a3d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a42: athrow
      // a43: iload 15
      // a45: bipush 1
      // a46: isub
      // a47: ireturn
      // a48: ldc2_w 3280838202873701416
      // a4b: lload 2
      // a4c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a51: athrow
      // a52: iload 4
      // a54: iload 13
      // a56: lload 2
      // a57: lconst_0
      // a58: lcmp
      // a59: iflt a63
      // a5c: ifeq a82
      // a5f: iload 15
      // a61: bipush 1
      // a62: isub
      // a63: goto a70
      // a66: ldc2_w 3280838202873701416
      // a69: lload 2
      // a6a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6f: athrow
      // a70: if_icmpne a80
      // a73: iload 15
      // a75: ireturn
      // a76: ldc2_w 3280838202873701416
      // a79: lload 2
      // a7a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7f: athrow
      // a80: iload 4
      // a82: ireturn
      // a83: iload 4
      // a85: ireturn
      // a86: bipush 0
      // a87: bipush 1
      // a88: anewarray 16
      // a8b: dup
      // a8c: bipush 0
      // a8d: new java/lang/StringBuilder
      // a90: dup
      // a91: invokespecial java/lang/StringBuilder.<init> ()V
      // a94: aload 0
      // a95: getfield com/zelix/is.X I
      // a98: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // a9b: ldc " "
      // a9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // aa0: aload 0
      // aa1: iload 8
      // aa3: iload 9
      // aa5: i2b
      // aa6: iload 10
      // aa8: bipush 3
      // aa9: anewarray 384
      // aac: dup_x1
      // aad: swap
      // aae: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ab1: bipush 2
      // ab2: swap
      // ab3: aastore
      // ab4: dup_x1
      // ab5: swap
      // ab6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ab9: bipush 1
      // aba: swap
      // abb: aastore
      // abc: dup_x1
      // abd: swap
      // abe: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ac1: bipush 0
      // ac2: swap
      // ac3: aastore
      // ac4: ldc2_w 3073297777090330079
      // ac7: lload 2
      // ac8: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // acd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ad0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ad3: aastore
      // ad4: lload 11
      // ad6: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // ad9: iload 4
      // adb: ireturn
   }

   public boolean n(Object[] param1) {
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
      // 0c: ldc2_w -1726575179703049259
      // 0f: lload 2
      // 10: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: getfield com/zelix/is.X I
      // 1b: iload 4
      // 1d: ifeq 53
      // 20: lookupswitch 50 2 9 38 10 38
      // 3c: ldc2_w -579348992700465574
      // 3f: lload 2
      // 40: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: ireturn
      // 48: ldc2_w -579348992700465574
      // 4b: lload 2
      // 4c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
   }

   public int[] E(v7[] param1, long param2, v7[] param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: dup2
      // 002: ldc2_w 100980699652084
      // 005: lxor
      // 006: lstore 6
      // 008: dup2
      // 009: ldc2_w 98200899273591
      // 00c: lxor
      // 00d: lstore 8
      // 00f: pop2
      // 010: ldc2_w -1656266284442967329
      // 013: lload 2
      // 014: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 019: aload 1
      // 01a: arraylength
      // 01b: bipush 1
      // 01c: isub
      // 01d: istore 12
      // 01f: aload 4
      // 021: arraylength
      // 022: istore 13
      // 024: iload 13
      // 026: bipush 1
      // 027: isub
      // 028: istore 14
      // 02a: istore 10
      // 02c: aload 0
      // 02d: getfield com/zelix/is.X I
      // 030: iload 10
      // 032: ifeq 81e
      // 035: tableswitch 2024 87 95 1979 1979 61 121 217 546 767 1077 1891
      // 068: ldc2_w -648651686411059376
      // 06b: lload 2
      // 06c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: iload 5
      // 074: iload 10
      // 076: ifeq 84f
      // 079: goto 086
      // 07c: ldc2_w -648651686411059376
      // 07f: lload 2
      // 080: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: iload 12
      // 088: if_icmpne 84e
      // 08b: goto 098
      // 08e: ldc2_w -648651686411059376
      // 091: lload 2
      // 092: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: bipush 2
      // 099: newarray 10
      // 09b: astore 11
      // 09d: aload 11
      // 09f: bipush 0
      // 0a0: iload 12
      // 0a2: iastore
      // 0a3: aload 11
      // 0a5: bipush 1
      // 0a6: iload 12
      // 0a8: bipush 1
      // 0a9: iadd
      // 0aa: iastore
      // 0ab: aload 11
      // 0ad: areturn
      // 0ae: iload 5
      // 0b0: iload 12
      // 0b2: iload 10
      // 0b4: ifeq 0fd
      // 0b7: if_icmpne 0df
      // 0ba: goto 0c7
      // 0bd: ldc2_w -648651686411059376
      // 0c0: lload 2
      // 0c1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: bipush 2
      // 0c8: newarray 10
      // 0ca: astore 11
      // 0cc: aload 11
      // 0ce: bipush 0
      // 0cf: iload 12
      // 0d1: bipush 1
      // 0d2: isub
      // 0d3: iastore
      // 0d4: aload 11
      // 0d6: bipush 1
      // 0d7: iload 12
      // 0d9: bipush 1
      // 0da: iadd
      // 0db: iastore
      // 0dc: aload 11
      // 0de: areturn
      // 0df: iload 5
      // 0e1: iload 10
      // 0e3: lload 2
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: ifle 0f0
      // 0e9: ifeq 84f
      // 0ec: iload 12
      // 0ee: bipush 1
      // 0ef: isub
      // 0f0: goto 0fd
      // 0f3: ldc2_w -648651686411059376
      // 0f6: lload 2
      // 0f7: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: if_icmpne 84e
      // 100: bipush 1
      // 101: newarray 10
      // 103: astore 11
      // 105: aload 11
      // 107: bipush 0
      // 108: iload 12
      // 10a: iastore
      // 10b: aload 11
      // 10d: areturn
      // 10e: aload 1
      // 10f: iload 12
      // 111: bipush 1
      // 112: isub
      // 113: aaload
      // 114: lload 6
      // 116: bipush 1
      // 117: anewarray 384
      // 11a: dup_x2
      // 11b: dup_x2
      // 11c: pop
      // 11d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 120: bipush 0
      // 121: swap
      // 122: aastore
      // 123: ldc2_w -1139252509296776819
      // 126: lload 2
      // 127: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: iload 10
      // 12e: lload 2
      // 12f: lconst_0
      // 130: lcmp
      // 131: iflt 1b8
      // 134: ifeq 1b6
      // 137: ifeq 1b4
      // 13a: goto 147
      // 13d: ldc2_w -648651686411059376
      // 140: lload 2
      // 141: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: iload 5
      // 149: iload 12
      // 14b: iload 10
      // 14d: ifeq 1a3
      // 150: goto 15d
      // 153: ldc2_w -648651686411059376
      // 156: lload 2
      // 157: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: if_icmpne 185
      // 160: goto 16d
      // 163: ldc2_w -648651686411059376
      // 166: lload 2
      // 167: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: bipush 2
      // 16e: newarray 10
      // 170: astore 11
      // 172: aload 11
      // 174: bipush 0
      // 175: iload 12
      // 177: bipush 1
      // 178: isub
      // 179: iastore
      // 17a: aload 11
      // 17c: bipush 1
      // 17d: iload 12
      // 17f: bipush 1
      // 180: iadd
      // 181: iastore
      // 182: aload 11
      // 184: areturn
      // 185: iload 5
      // 187: iload 10
      // 189: lload 2
      // 18a: lconst_0
      // 18b: lcmp
      // 18c: iflt 196
      // 18f: ifeq 84f
      // 192: iload 12
      // 194: bipush 1
      // 195: isub
      // 196: goto 1a3
      // 199: ldc2_w -648651686411059376
      // 19c: lload 2
      // 19d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: if_icmpne 84e
      // 1a6: bipush 1
      // 1a7: newarray 10
      // 1a9: astore 11
      // 1ab: aload 11
      // 1ad: bipush 0
      // 1ae: iload 12
      // 1b0: iastore
      // 1b1: aload 11
      // 1b3: areturn
      // 1b4: iload 5
      // 1b6: iload 12
      // 1b8: lload 2
      // 1b9: lconst_0
      // 1ba: lcmp
      // 1bb: iflt 209
      // 1be: iload 10
      // 1c0: ifeq 209
      // 1c3: if_icmpne 1eb
      // 1c6: goto 1d3
      // 1c9: ldc2_w -648651686411059376
      // 1cc: lload 2
      // 1cd: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: athrow
      // 1d3: bipush 2
      // 1d4: newarray 10
      // 1d6: astore 11
      // 1d8: aload 11
      // 1da: bipush 0
      // 1db: iload 12
      // 1dd: bipush 2
      // 1de: isub
      // 1df: iastore
      // 1e0: aload 11
      // 1e2: bipush 1
      // 1e3: iload 12
      // 1e5: bipush 1
      // 1e6: iadd
      // 1e7: iastore
      // 1e8: aload 11
      // 1ea: areturn
      // 1eb: iload 5
      // 1ed: iload 10
      // 1ef: lload 2
      // 1f0: lconst_0
      // 1f1: lcmp
      // 1f2: ifle 1fc
      // 1f5: ifeq 248
      // 1f8: iload 12
      // 1fa: bipush 1
      // 1fb: isub
      // 1fc: goto 209
      // 1ff: ldc2_w -648651686411059376
      // 202: lload 2
      // 203: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: lload 2
      // 20a: lconst_0
      // 20b: lcmp
      // 20c: iflt 216
      // 20f: if_icmpeq 23a
      // 212: iload 5
      // 214: iload 10
      // 216: ifeq 84f
      // 219: goto 226
      // 21c: ldc2_w -648651686411059376
      // 21f: lload 2
      // 220: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: athrow
      // 226: iload 12
      // 228: bipush 2
      // 229: isub
      // 22a: if_icmpne 84e
      // 22d: goto 23a
      // 230: ldc2_w -648651686411059376
      // 233: lload 2
      // 234: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: athrow
      // 23a: bipush 1
      // 23b: goto 248
      // 23e: ldc2_w -648651686411059376
      // 241: lload 2
      // 242: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: athrow
      // 248: newarray 10
      // 24a: astore 11
      // 24c: aload 11
      // 24e: bipush 0
      // 24f: iload 5
      // 251: bipush 1
      // 252: iadd
      // 253: iastore
      // 254: aload 11
      // 256: areturn
      // 257: aload 1
      // 258: iload 12
      // 25a: aaload
      // 25b: lload 6
      // 25d: bipush 1
      // 25e: anewarray 384
      // 261: dup_x2
      // 262: dup_x2
      // 263: pop
      // 264: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 267: bipush 0
      // 268: swap
      // 269: aastore
      // 26a: ldc2_w -1139252509296776819
      // 26d: lload 2
      // 26e: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: iload 10
      // 275: lload 2
      // 276: lconst_0
      // 277: lcmp
      // 278: iflt 2ce
      // 27b: ifeq 2cc
      // 27e: ifeq 2ca
      // 281: goto 28e
      // 284: ldc2_w -648651686411059376
      // 287: lload 2
      // 288: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: athrow
      // 28e: iload 5
      // 290: iload 10
      // 292: ifeq 84f
      // 295: goto 2a2
      // 298: ldc2_w -648651686411059376
      // 29b: lload 2
      // 29c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: athrow
      // 2a2: iload 12
      // 2a4: if_icmpne 84e
      // 2a7: goto 2b4
      // 2aa: ldc2_w -648651686411059376
      // 2ad: lload 2
      // 2ae: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: athrow
      // 2b4: bipush 2
      // 2b5: newarray 10
      // 2b7: astore 11
      // 2b9: aload 11
      // 2bb: bipush 0
      // 2bc: iload 5
      // 2be: iastore
      // 2bf: aload 11
      // 2c1: bipush 1
      // 2c2: iload 5
      // 2c4: bipush 1
      // 2c5: iadd
      // 2c6: iastore
      // 2c7: aload 11
      // 2c9: areturn
      // 2ca: iload 5
      // 2cc: iload 10
      // 2ce: lload 2
      // 2cf: lconst_0
      // 2d0: lcmp
      // 2d1: ifle 2d9
      // 2d4: ifeq 31f
      // 2d7: iload 12
      // 2d9: if_icmpeq 311
      // 2dc: goto 2e9
      // 2df: ldc2_w -648651686411059376
      // 2e2: lload 2
      // 2e3: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: athrow
      // 2e9: iload 5
      // 2eb: iload 10
      // 2ed: ifeq 84f
      // 2f0: goto 2fd
      // 2f3: ldc2_w -648651686411059376
      // 2f6: lload 2
      // 2f7: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: athrow
      // 2fd: iload 12
      // 2ff: bipush 1
      // 300: isub
      // 301: if_icmpne 84e
      // 304: goto 311
      // 307: ldc2_w -648651686411059376
      // 30a: lload 2
      // 30b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: athrow
      // 311: bipush 2
      // 312: goto 31f
      // 315: ldc2_w -648651686411059376
      // 318: lload 2
      // 319: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: athrow
      // 31f: newarray 10
      // 321: astore 11
      // 323: aload 11
      // 325: bipush 0
      // 326: iload 5
      // 328: iastore
      // 329: aload 11
      // 32b: bipush 1
      // 32c: iload 5
      // 32e: bipush 2
      // 32f: iadd
      // 330: iastore
      // 331: aload 11
      // 333: areturn
      // 334: aload 1
      // 335: iload 12
      // 337: aaload
      // 338: lload 6
      // 33a: bipush 1
      // 33b: anewarray 384
      // 33e: dup_x2
      // 33f: dup_x2
      // 340: pop
      // 341: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 344: bipush 0
      // 345: swap
      // 346: aastore
      // 347: ldc2_w -1139252509296776819
      // 34a: lload 2
      // 34b: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: iload 10
      // 352: lload 2
      // 353: lconst_0
      // 354: lcmp
      // 355: ifle 3de
      // 358: ifeq 3dc
      // 35b: ifeq 3da
      // 35e: goto 36b
      // 361: ldc2_w -648651686411059376
      // 364: lload 2
      // 365: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: athrow
      // 36b: iload 5
      // 36d: iload 12
      // 36f: iload 10
      // 371: ifeq 3c7
      // 374: goto 381
      // 377: ldc2_w -648651686411059376
      // 37a: lload 2
      // 37b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: athrow
      // 381: if_icmpne 3a9
      // 384: goto 391
      // 387: ldc2_w -648651686411059376
      // 38a: lload 2
      // 38b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 390: athrow
      // 391: bipush 2
      // 392: newarray 10
      // 394: astore 11
      // 396: aload 11
      // 398: bipush 0
      // 399: iload 5
      // 39b: bipush 1
      // 39c: isub
      // 39d: iastore
      // 39e: aload 11
      // 3a0: bipush 1
      // 3a1: iload 5
      // 3a3: bipush 1
      // 3a4: iadd
      // 3a5: iastore
      // 3a6: aload 11
      // 3a8: areturn
      // 3a9: iload 5
      // 3ab: iload 10
      // 3ad: lload 2
      // 3ae: lconst_0
      // 3af: lcmp
      // 3b0: ifle 3ba
      // 3b3: ifeq 84f
      // 3b6: iload 12
      // 3b8: bipush 1
      // 3b9: isub
      // 3ba: goto 3c7
      // 3bd: ldc2_w -648651686411059376
      // 3c0: lload 2
      // 3c1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: athrow
      // 3c7: if_icmpne 84e
      // 3ca: bipush 1
      // 3cb: newarray 10
      // 3cd: astore 11
      // 3cf: aload 11
      // 3d1: bipush 0
      // 3d2: iload 5
      // 3d4: bipush 1
      // 3d5: iadd
      // 3d6: iastore
      // 3d7: aload 11
      // 3d9: areturn
      // 3da: iload 5
      // 3dc: iload 10
      // 3de: lload 2
      // 3df: lconst_0
      // 3e0: lcmp
      // 3e1: ifle 3e9
      // 3e4: ifeq 422
      // 3e7: iload 12
      // 3e9: if_icmpeq 421
      // 3ec: goto 3f9
      // 3ef: ldc2_w -648651686411059376
      // 3f2: lload 2
      // 3f3: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f8: athrow
      // 3f9: iload 5
      // 3fb: iload 12
      // 3fd: bipush 1
      // 3fe: isub
      // 3ff: iload 10
      // 401: ifeq 457
      // 404: goto 411
      // 407: ldc2_w -648651686411059376
      // 40a: lload 2
      // 40b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 410: athrow
      // 411: if_icmpne 439
      // 414: goto 421
      // 417: ldc2_w -648651686411059376
      // 41a: lload 2
      // 41b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: athrow
      // 421: bipush 2
      // 422: newarray 10
      // 424: astore 11
      // 426: aload 11
      // 428: bipush 0
      // 429: iload 5
      // 42b: bipush 1
      // 42c: isub
      // 42d: iastore
      // 42e: aload 11
      // 430: bipush 1
      // 431: iload 5
      // 433: bipush 2
      // 434: iadd
      // 435: iastore
      // 436: aload 11
      // 438: areturn
      // 439: iload 5
      // 43b: iload 10
      // 43d: lload 2
      // 43e: lconst_0
      // 43f: lcmp
      // 440: ifle 44a
      // 443: ifeq 84f
      // 446: iload 12
      // 448: bipush 2
      // 449: isub
      // 44a: goto 457
      // 44d: ldc2_w -648651686411059376
      // 450: lload 2
      // 451: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: athrow
      // 457: if_icmpne 84e
      // 45a: bipush 1
      // 45b: newarray 10
      // 45d: astore 11
      // 45f: aload 11
      // 461: bipush 0
      // 462: iload 5
      // 464: bipush 2
      // 465: iadd
      // 466: iastore
      // 467: aload 11
      // 469: areturn
      // 46a: aload 1
      // 46b: iload 12
      // 46d: aaload
      // 46e: lload 6
      // 470: bipush 1
      // 471: anewarray 384
      // 474: dup_x2
      // 475: dup_x2
      // 476: pop
      // 477: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 47a: bipush 0
      // 47b: swap
      // 47c: aastore
      // 47d: ldc2_w -1139252509296776819
      // 480: lload 2
      // 481: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 486: iload 10
      // 488: lload 2
      // 489: lconst_0
      // 48a: lcmp
      // 48b: ifle 619
      // 48e: ifeq 617
      // 491: ifeq 5f9
      // 494: goto 4a1
      // 497: ldc2_w -648651686411059376
      // 49a: lload 2
      // 49b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a0: athrow
      // 4a1: aload 1
      // 4a2: iload 12
      // 4a4: bipush 1
      // 4a5: isub
      // 4a6: aaload
      // 4a7: lload 6
      // 4a9: bipush 1
      // 4aa: anewarray 384
      // 4ad: dup_x2
      // 4ae: dup_x2
      // 4af: pop
      // 4b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b3: bipush 0
      // 4b4: swap
      // 4b5: aastore
      // 4b6: ldc2_w -1139252509296776819
      // 4b9: lload 2
      // 4ba: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bf: iload 10
      // 4c1: lload 2
      // 4c2: lconst_0
      // 4c3: lcmp
      // 4c4: ifle 55a
      // 4c7: ifeq 558
      // 4ca: goto 4d7
      // 4cd: ldc2_w -648651686411059376
      // 4d0: lload 2
      // 4d1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d6: athrow
      // 4d7: ifeq 556
      // 4da: goto 4e7
      // 4dd: ldc2_w -648651686411059376
      // 4e0: lload 2
      // 4e1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e6: athrow
      // 4e7: iload 5
      // 4e9: iload 12
      // 4eb: iload 10
      // 4ed: ifeq 543
      // 4f0: goto 4fd
      // 4f3: ldc2_w -648651686411059376
      // 4f6: lload 2
      // 4f7: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fc: athrow
      // 4fd: if_icmpne 525
      // 500: goto 50d
      // 503: ldc2_w -648651686411059376
      // 506: lload 2
      // 507: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50c: athrow
      // 50d: bipush 2
      // 50e: newarray 10
      // 510: astore 11
      // 512: aload 11
      // 514: bipush 0
      // 515: iload 5
      // 517: bipush 1
      // 518: isub
      // 519: iastore
      // 51a: aload 11
      // 51c: bipush 1
      // 51d: iload 5
      // 51f: bipush 1
      // 520: iadd
      // 521: iastore
      // 522: aload 11
      // 524: areturn
      // 525: iload 5
      // 527: iload 10
      // 529: lload 2
      // 52a: lconst_0
      // 52b: lcmp
      // 52c: ifle 536
      // 52f: ifeq 84f
      // 532: iload 12
      // 534: bipush 1
      // 535: isub
      // 536: goto 543
      // 539: ldc2_w -648651686411059376
      // 53c: lload 2
      // 53d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 542: athrow
      // 543: if_icmpne 84e
      // 546: bipush 1
      // 547: newarray 10
      // 549: astore 11
      // 54b: aload 11
      // 54d: bipush 0
      // 54e: iload 5
      // 550: bipush 1
      // 551: iadd
      // 552: iastore
      // 553: aload 11
      // 555: areturn
      // 556: iload 5
      // 558: iload 12
      // 55a: lload 2
      // 55b: lconst_0
      // 55c: lcmp
      // 55d: iflt 5ab
      // 560: iload 10
      // 562: ifeq 5ab
      // 565: if_icmpne 58d
      // 568: goto 575
      // 56b: ldc2_w -648651686411059376
      // 56e: lload 2
      // 56f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 574: athrow
      // 575: bipush 2
      // 576: newarray 10
      // 578: astore 11
      // 57a: aload 11
      // 57c: bipush 0
      // 57d: iload 5
      // 57f: bipush 2
      // 580: isub
      // 581: iastore
      // 582: aload 11
      // 584: bipush 1
      // 585: iload 5
      // 587: bipush 1
      // 588: iadd
      // 589: iastore
      // 58a: aload 11
      // 58c: areturn
      // 58d: iload 5
      // 58f: iload 10
      // 591: lload 2
      // 592: lconst_0
      // 593: lcmp
      // 594: iflt 59e
      // 597: ifeq 5ea
      // 59a: iload 12
      // 59c: bipush 1
      // 59d: isub
      // 59e: goto 5ab
      // 5a1: ldc2_w -648651686411059376
      // 5a4: lload 2
      // 5a5: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5aa: athrow
      // 5ab: lload 2
      // 5ac: lconst_0
      // 5ad: lcmp
      // 5ae: ifle 5b8
      // 5b1: if_icmpeq 5dc
      // 5b4: iload 5
      // 5b6: iload 10
      // 5b8: ifeq 84f
      // 5bb: goto 5c8
      // 5be: ldc2_w -648651686411059376
      // 5c1: lload 2
      // 5c2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c7: athrow
      // 5c8: iload 12
      // 5ca: bipush 2
      // 5cb: isub
      // 5cc: if_icmpne 84e
      // 5cf: goto 5dc
      // 5d2: ldc2_w -648651686411059376
      // 5d5: lload 2
      // 5d6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5db: athrow
      // 5dc: bipush 1
      // 5dd: goto 5ea
      // 5e0: ldc2_w -648651686411059376
      // 5e3: lload 2
      // 5e4: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e9: athrow
      // 5ea: newarray 10
      // 5ec: astore 11
      // 5ee: aload 11
      // 5f0: bipush 0
      // 5f1: iload 5
      // 5f3: bipush 1
      // 5f4: iadd
      // 5f5: iastore
      // 5f6: aload 11
      // 5f8: areturn
      // 5f9: aload 1
      // 5fa: iload 12
      // 5fc: bipush 2
      // 5fd: isub
      // 5fe: aaload
      // 5ff: lload 6
      // 601: bipush 1
      // 602: anewarray 384
      // 605: dup_x2
      // 606: dup_x2
      // 607: pop
      // 608: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 60b: bipush 0
      // 60c: swap
      // 60d: aastore
      // 60e: ldc2_w -1139252509296776819
      // 611: lload 2
      // 612: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 617: iload 10
      // 619: lload 2
      // 61a: lconst_0
      // 61b: lcmp
      // 61c: ifle 6cb
      // 61f: ifeq 6c9
      // 622: ifeq 6c7
      // 625: goto 632
      // 628: ldc2_w -648651686411059376
      // 62b: lload 2
      // 62c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 631: athrow
      // 632: iload 5
      // 634: iload 10
      // 636: ifeq 681
      // 639: goto 646
      // 63c: ldc2_w -648651686411059376
      // 63f: lload 2
      // 640: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 645: athrow
      // 646: iload 12
      // 648: if_icmpeq 680
      // 64b: goto 658
      // 64e: ldc2_w -648651686411059376
      // 651: lload 2
      // 652: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 657: athrow
      // 658: iload 5
      // 65a: iload 12
      // 65c: bipush 1
      // 65d: isub
      // 65e: iload 10
      // 660: ifeq 6b6
      // 663: goto 670
      // 666: ldc2_w -648651686411059376
      // 669: lload 2
      // 66a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66f: athrow
      // 670: if_icmpne 698
      // 673: goto 680
      // 676: ldc2_w -648651686411059376
      // 679: lload 2
      // 67a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67f: athrow
      // 680: bipush 2
      // 681: newarray 10
      // 683: astore 11
      // 685: aload 11
      // 687: bipush 0
      // 688: iload 5
      // 68a: bipush 1
      // 68b: isub
      // 68c: iastore
      // 68d: aload 11
      // 68f: bipush 1
      // 690: iload 5
      // 692: bipush 2
      // 693: iadd
      // 694: iastore
      // 695: aload 11
      // 697: areturn
      // 698: iload 5
      // 69a: iload 10
      // 69c: lload 2
      // 69d: lconst_0
      // 69e: lcmp
      // 69f: ifle 6a9
      // 6a2: ifeq 84f
      // 6a5: iload 12
      // 6a7: bipush 2
      // 6a8: isub
      // 6a9: goto 6b6
      // 6ac: ldc2_w -648651686411059376
      // 6af: lload 2
      // 6b0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b5: athrow
      // 6b6: if_icmpne 84e
      // 6b9: bipush 1
      // 6ba: newarray 10
      // 6bc: astore 11
      // 6be: aload 11
      // 6c0: bipush 0
      // 6c1: iload 12
      // 6c3: iastore
      // 6c4: aload 11
      // 6c6: areturn
      // 6c7: iload 5
      // 6c9: iload 10
      // 6cb: lload 2
      // 6cc: lconst_0
      // 6cd: lcmp
      // 6ce: iflt 6d6
      // 6d1: ifeq 715
      // 6d4: iload 12
      // 6d6: if_icmpeq 714
      // 6d9: goto 6e6
      // 6dc: ldc2_w -648651686411059376
      // 6df: lload 2
      // 6e0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e5: athrow
      // 6e6: iload 5
      // 6e8: iload 12
      // 6ea: bipush 1
      // 6eb: isub
      // 6ec: lload 2
      // 6ed: lconst_0
      // 6ee: lcmp
      // 6ef: ifle 74a
      // 6f2: iload 10
      // 6f4: ifeq 74a
      // 6f7: goto 704
      // 6fa: ldc2_w -648651686411059376
      // 6fd: lload 2
      // 6fe: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 703: athrow
      // 704: if_icmpne 72c
      // 707: goto 714
      // 70a: ldc2_w -648651686411059376
      // 70d: lload 2
      // 70e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 713: athrow
      // 714: bipush 2
      // 715: newarray 10
      // 717: astore 11
      // 719: aload 11
      // 71b: bipush 0
      // 71c: iload 5
      // 71e: bipush 2
      // 71f: isub
      // 720: iastore
      // 721: aload 11
      // 723: bipush 1
      // 724: iload 5
      // 726: bipush 2
      // 727: iadd
      // 728: iastore
      // 729: aload 11
      // 72b: areturn
      // 72c: iload 5
      // 72e: iload 10
      // 730: lload 2
      // 731: lconst_0
      // 732: lcmp
      // 733: iflt 73d
      // 736: ifeq 789
      // 739: iload 12
      // 73b: bipush 2
      // 73c: isub
      // 73d: goto 74a
      // 740: ldc2_w -648651686411059376
      // 743: lload 2
      // 744: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 749: athrow
      // 74a: lload 2
      // 74b: lconst_0
      // 74c: lcmp
      // 74d: iflt 757
      // 750: if_icmpeq 77b
      // 753: iload 5
      // 755: iload 10
      // 757: ifeq 84f
      // 75a: goto 767
      // 75d: ldc2_w -648651686411059376
      // 760: lload 2
      // 761: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 766: athrow
      // 767: iload 12
      // 769: bipush 3
      // 76a: isub
      // 76b: if_icmpne 84e
      // 76e: goto 77b
      // 771: ldc2_w -648651686411059376
      // 774: lload 2
      // 775: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77a: athrow
      // 77b: bipush 1
      // 77c: goto 789
      // 77f: ldc2_w -648651686411059376
      // 782: lload 2
      // 783: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 788: athrow
      // 789: newarray 10
      // 78b: astore 11
      // 78d: aload 11
      // 78f: bipush 0
      // 790: iload 5
      // 792: bipush 2
      // 793: iadd
      // 794: iastore
      // 795: aload 11
      // 797: areturn
      // 798: iload 5
      // 79a: iload 12
      // 79c: iload 10
      // 79e: ifeq 7df
      // 7a1: if_icmpne 7c1
      // 7a4: goto 7b1
      // 7a7: ldc2_w -648651686411059376
      // 7aa: lload 2
      // 7ab: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b0: athrow
      // 7b1: bipush 1
      // 7b2: newarray 10
      // 7b4: astore 11
      // 7b6: aload 11
      // 7b8: bipush 0
      // 7b9: iload 12
      // 7bb: bipush 1
      // 7bc: isub
      // 7bd: iastore
      // 7be: aload 11
      // 7c0: areturn
      // 7c1: iload 5
      // 7c3: iload 10
      // 7c5: lload 2
      // 7c6: lconst_0
      // 7c7: lcmp
      // 7c8: ifle 7d2
      // 7cb: ifeq 84f
      // 7ce: iload 12
      // 7d0: bipush 1
      // 7d1: isub
      // 7d2: goto 7df
      // 7d5: ldc2_w -648651686411059376
      // 7d8: lload 2
      // 7d9: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7de: athrow
      // 7df: if_icmpne 84e
      // 7e2: bipush 1
      // 7e3: newarray 10
      // 7e5: astore 11
      // 7e7: aload 11
      // 7e9: bipush 0
      // 7ea: iload 12
      // 7ec: iastore
      // 7ed: aload 11
      // 7ef: areturn
      // 7f0: iload 5
      // 7f2: iload 10
      // 7f4: lload 2
      // 7f5: lconst_0
      // 7f6: lcmp
      // 7f7: ifle 7ff
      // 7fa: ifeq 84f
      // 7fd: iload 14
      // 7ff: if_icmple 84e
      // 802: goto 80f
      // 805: ldc2_w -648651686411059376
      // 808: lload 2
      // 809: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80e: athrow
      // 80f: bipush 0
      // 810: newarray 10
      // 812: areturn
      // 813: ldc2_w -648651686411059376
      // 816: lload 2
      // 817: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81c: athrow
      // 81d: bipush 0
      // 81e: aload 0
      // 81f: getfield com/zelix/is.X I
      // 822: lload 8
      // 824: dup2_x2
      // 825: pop2
      // 826: bipush 3
      // 827: anewarray 384
      // 82a: dup_x1
      // 82b: swap
      // 82c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 82f: bipush 2
      // 830: swap
      // 831: aastore
      // 832: dup_x1
      // 833: swap
      // 834: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 837: bipush 1
      // 838: swap
      // 839: aastore
      // 83a: dup_x2
      // 83b: dup_x2
      // 83c: pop
      // 83d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 840: bipush 0
      // 841: swap
      // 842: aastore
      // 843: ldc2_w -884108430113649084
      // 846: lload 2
      // 847: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84c: aconst_null
      // 84d: areturn
      // 84e: bipush 1
      // 84f: newarray 10
      // 851: astore 11
      // 853: aload 11
      // 855: bipush 0
      // 856: iload 5
      // 858: iastore
      // 859: aload 11
      // 85b: areturn
   }

   private hz F(int var1, int var2, v7[] var3, char var4, v7[] var5, v7 var6, char var7, fb var8, Set var9) {
      long var10 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      long var12 = var10 ^ 77653865612466L;
      long var14 = var10 ^ 36529703152734L;
      v7[] var16 = v7.I(var1 + 1, var14);
      System.arraycopy(var3, 0, var16, 0, var1);
      var16[var1] = var6;
      return new hz(var16, var5, var12, var8, var9);
   }

   public void h(Object[] param1) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/io/PrintWriter
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 111883434377042
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 9522033084411
      // 027: lxor
      // 028: dup2
      // 029: bipush 32
      // 02b: lushr
      // 02c: l2i
      // 02d: istore 8
      // 02f: dup2
      // 030: bipush 32
      // 032: lshl
      // 033: bipush 56
      // 035: lushr
      // 036: l2i
      // 037: istore 9
      // 039: dup2
      // 03a: bipush 40
      // 03c: lshl
      // 03d: bipush 40
      // 03f: lushr
      // 040: l2i
      // 041: istore 10
      // 043: pop2
      // 044: pop2
      // 045: new java/lang/StringBuilder
      // 048: dup
      // 049: sipush 6636
      // 04c: ldc2_w 4170503119701986582
      // 04f: lload 3
      // 050: lxor
      // 051: invokedynamic b (IJ)I bsm=com/zelix/is.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: invokespecial java/lang/StringBuilder.<init> (I)V
      // 059: astore 12
      // 05b: ldc2_w -1142121718372861931
      // 05e: lload 3
      // 05f: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: aload 0
      // 065: iload 8
      // 067: iload 9
      // 069: i2b
      // 06a: iload 10
      // 06c: bipush 3
      // 06d: anewarray 384
      // 070: dup_x1
      // 071: swap
      // 072: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 075: bipush 2
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07d: bipush 1
      // 07e: swap
      // 07f: aastore
      // 080: dup_x1
      // 081: swap
      // 082: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 085: bipush 0
      // 086: swap
      // 087: aastore
      // 088: ldc2_w -636251684499120046
      // 08b: lload 3
      // 08c: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: astore 13
      // 093: istore 11
      // 095: aload 12
      // 097: aload 13
      // 099: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09c: pop
      // 09d: aload 0
      // 09e: lload 6
      // 0a0: bipush 1
      // 0a1: anewarray 384
      // 0a4: dup_x2
      // 0a5: dup_x2
      // 0a6: pop
      // 0a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0aa: bipush 0
      // 0ab: swap
      // 0ac: aastore
      // 0ad: ldc2_w -1388346946909084418
      // 0b0: lload 3
      // 0b1: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: astore 14
      // 0b8: iload 11
      // 0ba: ifne 11b
      // 0bd: aload 14
      // 0bf: invokevirtual java/lang/String.length ()I
      // 0c2: ifle 0f9
      // 0c5: goto 0d2
      // 0c8: ldc2_w -1149833478183208539
      // 0cb: lload 3
      // 0cc: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 12
      // 0d4: new java/lang/StringBuilder
      // 0d7: dup
      // 0d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0db: ldc "\t"
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: aload 14
      // 0e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: pop
      // 0ec: goto 0f9
      // 0ef: ldc2_w -1149833478183208539
      // 0f2: lload 3
      // 0f3: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 5
      // 0fb: new java/lang/StringBuilder
      // 0fe: dup
      // 0ff: invokespecial java/lang/StringBuilder.<init> ()V
      // 102: aload 2
      // 103: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 109: aload 2
      // 10a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 110: aload 12
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 115: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 118: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 11b: return
   }

   public boolean L(Object[] param1) {
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
      // 00e: ldc2_w 20142373158991
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w 8497003223765482968
      // 018: lload 2
      // 019: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: istore 6
      // 020: aload 0
      // 021: getfield com/zelix/is.X I
      // 024: iload 6
      // 026: ifne 380
      // 029: tableswitch 809 0 191 793 805 805 805 805 805 805 805 805 805 805 805 805 805 805 805 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 807 807 807 807 807 807 807 807 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 793 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 809 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 807 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 809 793 793 793 793 793 793 809 809 809 809 809 809 809 809 809 809 809 809 807 793
      // 338: ldc2_w 8486978228929051752
      // 33b: lload 2
      // 33c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: bipush 0
      // 343: ireturn
      // 344: ldc2_w 8486978228929051752
      // 347: lload 2
      // 348: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34d: athrow
      // 34e: bipush 1
      // 34f: ireturn
      // 350: bipush 0
      // 351: ireturn
      // 352: lload 4
      // 354: bipush 0
      // 355: aload 0
      // 356: getfield com/zelix/is.X I
      // 359: bipush 3
      // 35a: anewarray 384
      // 35d: dup_x1
      // 35e: swap
      // 35f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 362: bipush 2
      // 363: swap
      // 364: aastore
      // 365: dup_x1
      // 366: swap
      // 367: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 36a: bipush 1
      // 36b: swap
      // 36c: aastore
      // 36d: dup_x2
      // 36e: dup_x2
      // 36f: pop
      // 370: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 373: bipush 0
      // 374: swap
      // 375: aastore
      // 376: ldc2_w 8107410687680925052
      // 379: lload 2
      // 37a: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37f: bipush 0
      // 380: ireturn
   }

   public final boolean T(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 117643026164941
      // 005: lxor
      // 006: lstore 3
      // 007: pop2
      // 008: ldc2_w -4127002360064176795
      // 00b: lload 1
      // 00c: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: istore 5
      // 013: aload 0
      // 014: getfield com/zelix/is.X I
      // 017: iload 5
      // 019: ifeq 371
      // 01c: tableswitch 808 0 191 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 806 806 806 806 806 806 806 806 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 808 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 806 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 808 794 794 794 794 794 794 808 808 808 808 808 808 808 808 808 808 808 808 806 794
      // 32c: ldc2_w -2790625294099312406
      // 32f: lload 1
      // 330: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: athrow
      // 336: bipush 1
      // 337: ireturn
      // 338: ldc2_w -2790625294099312406
      // 33b: lload 1
      // 33c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: bipush 0
      // 343: ireturn
      // 344: lload 3
      // 345: bipush 0
      // 346: aload 0
      // 347: getfield com/zelix/is.X I
      // 34a: bipush 3
      // 34b: anewarray 384
      // 34e: dup_x1
      // 34f: swap
      // 350: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 353: bipush 2
      // 354: swap
      // 355: aastore
      // 356: dup_x1
      // 357: swap
      // 358: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 35b: bipush 1
      // 35c: swap
      // 35d: aastore
      // 35e: dup_x2
      // 35f: dup_x2
      // 360: pop
      // 361: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 364: bipush 0
      // 365: swap
      // 366: aastore
      // 367: ldc2_w -2593730613096029698
      // 36a: lload 1
      // 36b: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: bipush 0
      // 371: ireturn
   }

   public boolean Y(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 2585411058771602386
      // 03: lload 1
      // 04: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 3
      // 0a: aload 0
      // 0b: getfield com/zelix/is.X I
      // 0e: iload 3
      // 0f: ifne 5b
      // 12: tableswitch 72 87 95 60 60 60 60 60 60 60 60 60
      // 44: ldc2_w 2579893511853402722
      // 47: lload 1
      // 48: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: bipush 1
      // 4f: ireturn
      // 50: ldc2_w 2579893511853402722
      // 53: lload 1
      // 54: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: bipush 0
      // 5b: ireturn
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21805;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/is", var10);
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
         throw new RuntimeException("com/zelix/is" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12854;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/is", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/is" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
