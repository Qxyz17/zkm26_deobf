package com.zelix;

import java.io.PrintWriter;
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

public class c2 extends fw {
   private static final long a = ess.a(-1070383700807319497L, -1131028856785212032L, MethodHandles.lookup().lookupClass()).a(235641309978506L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var4 = (_ur)var1[2];
      long var6 = var2 ^ 1445808893670L;
      long var8 = var2 ^ 114633185681979L;
      long var10 = var2 ^ 29791420647726L;
      long var12 = var2 ^ 80521838856410L;
      int var10002 = x44.a<"i">(var4, new Object[]{var12}, 8706655031326303606L, var2);
      int var10003 = x44.a<"i">(var4, new Object[]{var8}, 7309659849235451010L, var2);
      Object[] var10007 = new Object[]{null, null, null, null, x44.a<"i">(var4, new Object[]{var10}, 7191208742915394367L, var2)};
      var10007[3] = var6;
      var10007[2] = var10003;
      var10007[1] = var10002;
      var10007[0] = var4;
      x44.a<"i">(this, var10007, 8669598839858646366L, var2);
   }

   public c2(char var1, int var2, int var3, char var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var10001 = var5 ^ 40821270525834L;
      int var7 = (int)((var5 ^ 40821270525834L) >>> 48);
      int var8 = (int)((var5 ^ 40821270525834L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      super((short)var7, (char)var8, var2, var9);
   }

   protected void Y(Object[] var1) {
      _ur var4 = (_ur)var1[0];
      int var2 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      long var6 = (Long)var1[3];
      int var5 = (Integer)var1[4];
      long var8 = var6 ^ 132123200400598L;
      long var10 = var6 ^ 60601649508817L;
      long var12 = var6 ^ 76201383151234L;
      PrintWriter var14 = x44.a<"o">(var4, new Object[]{var10}, -8328464867790394533L, var6);
      String var15 = x44.a<"w">(new Object[]{var8}, -7664607665609041399L, var6) + b<"j">(29217, 4817912016641975460L ^ var6);
      var14.println(var15);
      x44.a<"o">(x44.a<"n">(-7588631005175905587L, var6), var15, -8328637349100607116L, var6);
      x44.a<"o">(var4, new Object[]{var12}, -7602178237250299036L, var6);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"j">(18246, 4088854040566193025L ^ var2);
   }

   static {
      long var0 = a ^ 108729095383923L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u001dA÷\u008e¼¯-èõ\u0002\u000b&%ËÀ\u0081§n-\"dÏê9\u0082%k\f/\u000f\u0004I\u0094\u00967@³W5\u000b\u0016\u0012\u0007ñú\u0014\u0097z\u0095!þìP%è]ä\u0080Xøm\u0084t\u009cH\u0015/ì'ò¾\u0003\"\u0013}\u0098Î\u0007ï\u0094S¤×A®\u0099:Õê1È²àÐ!èñ3S q¤]³ü\r8XÞíÅö+\u009a·A:\u0095½\u008aQ;oR\u0097wµÎ\u008f\u0003\u0010Ã¶óÔ4Ö";
      int var8 = "\u001dA÷\u008e¼¯-èõ\u0002\u000b&%ËÀ\u0081§n-\"dÏê9\u0082%k\f/\u000f\u0004I\u0094\u00967@³W5\u000b\u0016\u0012\u0007ñú\u0014\u0097z\u0095!þìP%è]ä\u0080Xøm\u0084t\u009cH\u0015/ì'ò¾\u0003\"\u0013}\u0098Î\u0007ï\u0094S¤×A®\u0099:Õê1È²àÐ!èñ3S q¤]³ü\r8XÞíÅö+\u009a·A:\u0095½\u008aQ;oR\u0097wµÎ\u008f\u0003\u0010Ã¶óÔ4Ö"
         .length();
      char var5 = '@';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3912;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/c2", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/c2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
