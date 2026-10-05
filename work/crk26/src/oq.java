package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class oq implements ff {
   final wc j;
   sp T;
   wa W;
   lqu c;
   mh s;
   private static final long a = prr.a(2917271474100014271L, -6596247275331476823L, MethodHandles.lookup().lookupClass()).a(256130324678551L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   abstract void A(Object[] var1);

   abstract String L(Object[] var1);

   void C(Object[] param1) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/e_
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/oq.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 73076605004078
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 32925514034359
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 138067991547158
      // 034: lxor
      // 035: lstore 10
      // 037: dup2
      // 038: ldc2_w 46810337285670
      // 03b: lxor
      // 03c: lstore 12
      // 03e: pop2
      // 03f: ldc2_w 4844835772236707276
      // 042: lload 3
      // 043: invokedynamic i (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: aload 5
      // 04a: invokevirtual java/lang/Integer.intValue ()I
      // 04d: istore 15
      // 04f: astore 14
      // 051: aload 14
      // 053: ifnonnull 0eb
      // 056: iload 15
      // 058: bipush 1
      // 059: if_icmpne 175
      // 05c: goto 069
      // 05f: ldc2_w 5013157237289515689
      // 062: lload 3
      // 063: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: athrow
      // 069: aload 0
      // 06a: new com/zelix/sp
      // 06d: dup
      // 06e: ldc2_w 4903476772426912305
      // 071: lload 3
      // 072: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: aload 0
      // 078: lload 6
      // 07a: bipush 1
      // 07b: anewarray 70
      // 07e: dup_x2
      // 07f: dup_x2
      // 080: pop
      // 081: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 084: bipush 0
      // 085: swap
      // 086: aastore
      // 087: ldc2_w 5092995403960779937
      // 08a: lload 3
      // 08b: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: invokespecial com/zelix/sp.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 093: ldc2_w 6516379156450517934
      // 096: lload 3
      // 097: invokedynamic u (Ljava/lang/Object;Lcom/zelix/sp;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: aload 0
      // 09d: ldc2_w 6432901381150140620
      // 0a0: lload 3
      // 0a1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/wc; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: lload 12
      // 0a8: ldc2_w 4903476772426912305
      // 0ab: lload 3
      // 0ac: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: sipush 17547
      // 0b4: ldc2_w 7951885781403802790
      // 0b7: lload 3
      // 0b8: lxor
      // 0b9: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/oq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: bipush 3
      // 0bf: anewarray 70
      // 0c2: dup_x1
      // 0c3: swap
      // 0c4: bipush 2
      // 0c5: swap
      // 0c6: aastore
      // 0c7: dup_x1
      // 0c8: swap
      // 0c9: bipush 1
      // 0ca: swap
      // 0cb: aastore
      // 0cc: dup_x2
      // 0cd: dup_x2
      // 0ce: pop
      // 0cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d2: bipush 0
      // 0d3: swap
      // 0d4: aastore
      // 0d5: ldc2_w 6575041361815217412
      // 0d8: lload 3
      // 0d9: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: goto 0eb
      // 0e1: ldc2_w 5013157237289515689
      // 0e4: lload 3
      // 0e5: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: new java/lang/StringBuilder
      // 0ef: dup
      // 0f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f3: sipush 7710
      // 0f6: ldc2_w 7709917551634925113
      // 0f9: lload 3
      // 0fa: lxor
      // 0fb: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/oq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 103: aload 0
      // 104: lload 8
      // 106: bipush 1
      // 107: anewarray 70
      // 10a: dup_x2
      // 10b: dup_x2
      // 10c: pop
      // 10d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: ldc2_w 6693861437389021863
      // 116: lload 3
      // 117: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11f: sipush 5398
      // 122: ldc2_w 2526048373000457522
      // 125: lload 3
      // 126: lxor
      // 127: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/oq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 132: aload 0
      // 133: ldc2_w 4663576342307166871
      // 136: lload 3
      // 137: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/wa; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: lload 10
      // 13e: dup2_x1
      // 13f: pop2
      // 140: aload 0
      // 141: ldc2_w 6516379156450517934
      // 144: lload 3
      // 145: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/sp; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: aload 2
      // 14b: bipush 5
      // 14c: anewarray 70
      // 14f: dup_x1
      // 150: swap
      // 151: bipush 4
      // 152: swap
      // 153: aastore
      // 154: dup_x1
      // 155: swap
      // 156: bipush 3
      // 157: swap
      // 158: aastore
      // 159: dup_x1
      // 15a: swap
      // 15b: bipush 2
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x2
      // 15f: dup_x2
      // 160: pop
      // 161: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 164: bipush 1
      // 165: swap
      // 166: aastore
      // 167: dup_x1
      // 168: swap
      // 169: bipush 0
      // 16a: swap
      // 16b: aastore
      // 16c: ldc2_w 6795598880740933070
      // 16f: lload 3
      // 170: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: return
   }

   abstract void v(Object[] var1);

   abstract String m(Object[] var1);

   public final void K(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 136277637284919L;
      m44.a<"v">(m44.a<"w">(this, -5530405002684552849L, var2), true, -5424795226137413254L, var2);
      m44.a<"v">(m44.a<"w">(this, -5530405002684552849L, var2), -6274082374985334182L, var2);
      wa var10000 = m44.a<"w">(this, -5530405002684552849L, var2);
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = false;
      m44.a<"v">(var10000, var10004, -6080203568311472692L, var2);
   }

   final void h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 113376646086663L;
      long var6 = var2 ^ 58532269610449L;
      long var8 = var2 ^ 104974186046567L;
      long var10 = var2 ^ 59721297410136L;
      long var12 = var2 ^ 120031866638792L;
      lm2 var14 = new lm2(this);
      List var15 = null;

      try {
         var15 = m44.a<"q">(m44.a<"p">(this, -7757606096327111048L, var2), new Object[]{var6}, -8328802506303662434L, var2);
      } catch (u3 var17) {
         new lbc(
            m44.a<"p">(this, -7757606096327111048L, var2),
            a<"l">(9325, 1106159248410978476L ^ var2),
            var4,
            a<"l">(20166, 1634657995514102273L ^ var2)
               + cf.a(m44.a<"q">(var17, new Object[]{var8}, -7501618294460739393L, var2))
               + a<"l">(6204, 4165624673100043514L ^ var2)
         );
      } catch (u2 var18) {
         new lbc(
            m44.a<"p">(this, -7757606096327111048L, var2),
            a<"l">(17958, 7028457475596045029L ^ var2),
            var4,
            a<"l">(6423, 3766469146846369239L ^ var2) + m44.a<"q">(var18, -7838279641254777377L, var2) + "'"
         );
      }

      new tr(
         a<"l">(19468, 1291251068207972549L ^ var2)
            + m44.a<"q">(this, new Object[]{var10}, -8643968853520091576L, var2)
            + a<"l">(7880, 1849382046493086220L ^ var2),
         m44.a<"p">(this, -7757606096327111048L, var2),
         m44.a<"p">(this, -8238937375851135965L, var2),
         m44.a<"p">(this, -8388631081025273597L, var2),
         var12,
         var15,
         m44.a<"p">(this, -8437069974083462763L, var2),
         var14
      );
   }

   public oq(wa var1, mh var2, long var3, lqu var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 9153723034089L;
      long var8 = var3 ^ 70222476925599L;
      super();
      m44.a<"s">(this, var1, 2206339755269948593L, var3);
      m44.a<"s">(this, var2, 98116501458160586L, var3);
      m44.a<"s">(this, var5, 9162803068834652L, var3);
      m44.a<"p">(var1, false, 1831050631471273124L, var3);
      Object[] var10004 = new Object[]{null, var6};
      var10004[0] = true;
      m44.a<"p">(var1, var10004, 450558645726003218L, var3);
      this.j = m44.a<"o">(m44.a<"k">(1885461839894072343L, var3), a<"l">(13172, 5997302048113800568L ^ var3), 1848118696627080643L, var3);
      m44.a<"p">(this, new Object[]{var8}, 1996028855629455080L, var3);
   }

   static {
      long var0 = a ^ 22480767492560L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "\u007f8ß×«\u0007{JÕ¿VHXºD\u001a\u001f\u0017\nÕ¨\u0097×±`\u0080Ûo\u0017Þâé(³Ùl1µ\u009cÏÉÑÜ\u008dO\u00ad°\u001cj5\u0012ÚË7\u00838+\u0016\u0005ú_1ê¬Ã<|~\u0002\u001a\r\u0000\u0091tQÿà\u001eÃ\u009c-<\u0091l\u000ezþÎ\u0089\r-\u0088)Ä\u000bXÑ\u008d\u0010²%\u0000\u009bX\":\u008a\u0096Q´PÒßX?\u0017p\rhHÀ\u0018¡\u0098y`ö\rôÝãC\u001e\u00ad/¿\u0019ÓjÓã|<Ãý\u00ad\u0018µ\u009cÊø\u0088ô\"þbCéógðuMQ`HpC\u0085Ì\" þr\u0089\u0093\u0083/c`^\f\u001c¯\u000b\u0088´Ñä\u0095â\u008c\u0005¦ð/!÷a\u0006º\u00868U(\tô\u0096Ð\u008a\u0096Å\u0085q(Y\u0017\u001e\u0002h`\fÀÄÙ\u0082|\u001b½Æ[Ø®óàá\u001d¦ÞµZ\u0091ë\u0011\bX\u00875Á\nxêÝ³ª\n¡;À²\u0004Xe(>åiV p\u008cñ\u0005t\nUÿTÁ\n~o\u0088¼1GÜya=ÍÞ?(\u0004¬\u008d=\u00014\u009bh\u0085\u0001¡l\u0097<\u0001zÁ\u000f\u0013'´a\u0002Üw\u001aE\u009eÖj½\u001cª@ö7Ë{\u0001ÿ ô·\u0085¬\u0006iüU$Í\u000f\u0094\u0017Ê?uH\u009e´\u008e.0]Õ\u0082Ó~ÿÌ.\u0004ã(]ì*\u00ad\rì¶gìA\u0089Ü}\nAIDp¢\u008d®o@Ö\u00adUA\u0091VO]-\nS¨\u0017müó¬";
      int var8 = "\u007f8ß×«\u0007{JÕ¿VHXºD\u001a\u001f\u0017\nÕ¨\u0097×±`\u0080Ûo\u0017Þâé(³Ùl1µ\u009cÏÉÑÜ\u008dO\u00ad°\u001cj5\u0012ÚË7\u00838+\u0016\u0005ú_1ê¬Ã<|~\u0002\u001a\r\u0000\u0091tQÿà\u001eÃ\u009c-<\u0091l\u000ezþÎ\u0089\r-\u0088)Ä\u000bXÑ\u008d\u0010²%\u0000\u009bX\":\u008a\u0096Q´PÒßX?\u0017p\rhHÀ\u0018¡\u0098y`ö\rôÝãC\u001e\u00ad/¿\u0019ÓjÓã|<Ãý\u00ad\u0018µ\u009cÊø\u0088ô\"þbCéógðuMQ`HpC\u0085Ì\" þr\u0089\u0093\u0083/c`^\f\u001c¯\u000b\u0088´Ñä\u0095â\u008c\u0005¦ð/!÷a\u0006º\u00868U(\tô\u0096Ð\u008a\u0096Å\u0085q(Y\u0017\u001e\u0002h`\fÀÄÙ\u0082|\u001b½Æ[Ø®óàá\u001d¦ÞµZ\u0091ë\u0011\bX\u00875Á\nxêÝ³ª\n¡;À²\u0004Xe(>åiV p\u008cñ\u0005t\nUÿTÁ\n~o\u0088¼1GÜya=ÍÞ?(\u0004¬\u008d=\u00014\u009bh\u0085\u0001¡l\u0097<\u0001zÁ\u000f\u0013'´a\u0002Üw\u001aE\u009eÖj½\u001cª@ö7Ë{\u0001ÿ ô·\u0085¬\u0006iüU$Í\u000f\u0094\u0017Ê?uH\u009e´\u008e.0]Õ\u0082Ó~ÿÌ.\u0004ã(]ì*\u00ad\rì¶gìA\u0089Ü}\nAIDp¢\u008d®o@Ö\u00adUA\u0091VO]-\nS¨\u0017müó¬"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[11];
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

                  var6 = "ÌØÖð\u0082»ß¸\u0004V\u0094\u001c\u0017öJóS)RWÎ\u0011k\u0013ZêïªéF\u0095\u001b®¬K\u0081ìcrX\u0018 Å|Ì´0\u000f£%,z\u0005¢\u0006áæ^6\u0082|X;ôï";
                  var8 = "ÌØÖð\u0082»ß¸\u0004V\u0094\u001c\u0017öJóS)RWÎ\u0011k\u0013ZêïªéF\u0095\u001b®¬K\u0081ìcrX\u0018 Å|Ì´0\u000f£%,z\u0005¢\u0006áæ^6\u0082|X;ôï"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static n9 b(n9 var0) {
      return var0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4760;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/oq", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/oq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
