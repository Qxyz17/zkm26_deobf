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

public abstract class yx implements wn {
   sp r;
   final wc l;
   u6 o;
   _ur U;
   xn e;
   private static final long a = ess.a(8654465182983886002L, -2891003152526474025L, MethodHandles.lookup().lookupClass()).a(23413073645376L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f = new HashMap(13);

   abstract void Z(Object[] var1);

   abstract void c(Object[] var1);

   void r(Object[] param1) {
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
      // 00c: checkcast com/zelix/eq
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: pop
      // 01c: getstatic com/zelix/yx.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 125594029269816
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 36265103127113
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 42858702998541
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 52283750284013
      // 03c: lxor
      // 03d: lstore 12
      // 03f: pop2
      // 040: ldc2_w 5244456028599465298
      // 043: lload 2
      // 044: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: aload 5
      // 04b: invokevirtual java/lang/Integer.intValue ()I
      // 04e: istore 15
      // 050: astore 14
      // 052: aload 14
      // 054: ifnull 0ec
      // 057: iload 15
      // 059: bipush 1
      // 05a: if_icmpne 175
      // 05d: goto 06a
      // 060: ldc2_w 5852646742327070044
      // 063: lload 2
      // 064: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: athrow
      // 06a: aload 0
      // 06b: new com/zelix/sp
      // 06e: dup
      // 06f: ldc2_w 5274996144913398005
      // 072: lload 2
      // 073: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: aload 0
      // 079: lload 8
      // 07b: bipush 1
      // 07c: anewarray 164
      // 07f: dup_x2
      // 080: dup_x2
      // 081: pop
      // 082: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 085: bipush 0
      // 086: swap
      // 087: aastore
      // 088: ldc2_w 5375072589105513234
      // 08b: lload 2
      // 08c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: invokespecial com/zelix/sp.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 094: ldc2_w 5608839782881636008
      // 097: lload 2
      // 098: invokedynamic q (Ljava/lang/Object;Lcom/zelix/sp;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: aload 0
      // 09e: ldc2_w 5910593640216314657
      // 0a1: lload 2
      // 0a2: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/wc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: lload 6
      // 0a9: ldc2_w 5274996144913398005
      // 0ac: lload 2
      // 0ad: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: sipush 11106
      // 0b5: ldc2_w 5247735139582458758
      // 0b8: lload 2
      // 0b9: lxor
      // 0ba: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/yx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: bipush 3
      // 0c0: anewarray 164
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: bipush 2
      // 0c6: swap
      // 0c7: aastore
      // 0c8: dup_x1
      // 0c9: swap
      // 0ca: bipush 1
      // 0cb: swap
      // 0cc: aastore
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w 5893399117669151397
      // 0d9: lload 2
      // 0da: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: goto 0ec
      // 0e2: ldc2_w 5852646742327070044
      // 0e5: lload 2
      // 0e6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: new java/lang/StringBuilder
      // 0f0: dup
      // 0f1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f4: sipush 32276
      // 0f7: ldc2_w 837352563081408250
      // 0fa: lload 2
      // 0fb: lxor
      // 0fc: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/yx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: aload 0
      // 105: lload 10
      // 107: bipush 1
      // 108: anewarray 164
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 0
      // 112: swap
      // 113: aastore
      // 114: ldc2_w 6007274182660054608
      // 117: lload 2
      // 118: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: sipush 26827
      // 123: ldc2_w 5572396261714458669
      // 126: lload 2
      // 127: lxor
      // 128: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/yx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 133: aload 0
      // 134: ldc2_w 5251994026593973003
      // 137: lload 2
      // 138: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/u6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: aload 0
      // 13e: ldc2_w 5608839782881636008
      // 141: lload 2
      // 142: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/sp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: aload 4
      // 149: lload 12
      // 14b: bipush 5
      // 14c: anewarray 164
      // 14f: dup_x2
      // 150: dup_x2
      // 151: pop
      // 152: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 155: bipush 4
      // 156: swap
      // 157: aastore
      // 158: dup_x1
      // 159: swap
      // 15a: bipush 3
      // 15b: swap
      // 15c: aastore
      // 15d: dup_x1
      // 15e: swap
      // 15f: bipush 2
      // 160: swap
      // 161: aastore
      // 162: dup_x1
      // 163: swap
      // 164: bipush 1
      // 165: swap
      // 166: aastore
      // 167: dup_x1
      // 168: swap
      // 169: bipush 0
      // 16a: swap
      // 16b: aastore
      // 16c: ldc2_w 5906483284599271558
      // 16f: lload 2
      // 170: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: return
   }

   final void g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 94189628038957L;
      long var6 = var2 ^ 91193722981633L;
      long var8 = var2 ^ 103533630792964L;
      long var10 = var2 ^ 74791030680759L;
      long var12 = var2 ^ 21110012876088L;
      _dg var14 = new _dg(this);
      List var15 = null;

      try {
         var15 = x44.a<"k">(x44.a<"o">(this, -2167449204231316990L, var2), new Object[]{var6}, -1786693559236432773L, var2);
      } catch (_sz var17) {
         new wf(
            x44.a<"o">(this, -2167449204231316990L, var2),
            a<"o">(32466, 4363827708768896816L ^ var2),
            var10,
            a<"o">(4523, 2800441823294957642L ^ var2)
               + sh.b(x44.a<"k">(var17, new Object[]{var12}, -1815002388735332733L, var2))
               + a<"o">(35, 6370863443324025287L ^ var2)
         );
      } catch (_s8 var18) {
         new wf(
            x44.a<"o">(this, -2167449204231316990L, var2),
            a<"o">(9037, 8348115779489077934L ^ var2),
            var10,
            a<"o">(23329, 4466982525648134852L ^ var2) + x44.a<"k">(var18, -71127184166352468L, var2) + "'"
         );
      }

      new u5(
         a<"o">(26002, 8569154030182194290L ^ var2)
            + x44.a<"k">(this, new Object[]{var8}, -407759549783705767L, var2)
            + a<"o">(21642, 5957186657520905572L ^ var2),
         x44.a<"o">(this, -2167449204231316990L, var2),
         x44.a<"o">(this, -355822532482602456L, var2),
         x44.a<"o">(this, -2082807390805307059L, var2),
         var15,
         x44.a<"o">(this, -25041530526742370L, var2),
         var14,
         var4
      );
   }

   public final void O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 92109173000293L;
      x44.a<"i">(x44.a<"m">(this, 6055635031699976160L, var2), true, 5507635054886308279L, var2);
      x44.a<"i">(x44.a<"m">(this, 6055635031699976160L, var2), 5726177327000774244L, var2);
      u6 var10000 = x44.a<"m">(this, 6055635031699976160L, var2);
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = false;
      x44.a<"i">(var10000, var10004, 6096988784438620361L, var2);
   }

   abstract String O(Object[] var1);

   abstract String k(Object[] var1);

   public yx(long var1, u6 var3, xn var4, _ur var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 124672629288245L;
      long var8 = var1 ^ 31594915566002L;
      super();
      x44.a<"r">(this, var3, -1055586840932595024L, var1);
      x44.a<"r">(this, var4, -888897408396049921L, var1);
      x44.a<"r">(this, var5, -1218951651031361492L, var1);
      x44.a<"i">(var3, false, -1639540884313903897L, var1);
      Object[] var10004 = new Object[]{null, var6};
      var10004[0] = true;
      x44.a<"i">(var3, var10004, -1023169953022306919L, var1);
      this.l = x44.a<"q">(x44.a<"h">(-1112506848178110130L, var1), a<"o">(12700, 9158142460307740872L ^ var1), -685678753944289603L, var1);
      x44.a<"i">(this, new Object[]{var8}, -1547959089999361935L, var1);
   }

   static {
      long var0 = a ^ 7454651807607L;
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
      String var6 = "hõ9¬\u009d\u0019\u008f\t#'Z\u00104\u0093ö\u0007gàÂÆkÄ\u009b\u0098zÃSg_6½9\u008c\u000bt1ìØpï qH±¥!{}\u0097öþ¿¥}l¿\u008cEï8\u0010]\"v7¶ \u009aµ©tË}P¤®Ä\u008e£N¢²\u0086µó4\u001c\tµ\u0085»8=eãU²\u0088»ZküèÊO¿\u007f\u0003\u009dLàs8Jp\u0081K¹\fñ¬¿\u0013ÿ³¾ç¹Â\u0019w\u0001,\u0002µ\"!\u001eÉÁpaU\u0002×k \fZÌE¬\u0002ï\u0018·'\u008b¯ÿ\u008e\u0094g\u0093¿HQ\u0007ð\u0012\u00ad\u009ar\u001dåoì;2\u0018\u009bë÷M\u007fAÆy±\u0089Jü\u00127|Û\u0002Y\u0081:É\n£ß ¤é°OH\nf\u0095ªÏÊÝ28\u0013åÞ\u007f¤æÆy¶í\u0003ízµÇ«À\u009a`§ÒÉ\u001er;ñ\fÂ\u0099q´=\u000f\u000b1z\u00adTNR\u0091^!+ü\fð\u000bb\u0003oè¬è\u0093÷©\u0013«Ä\u008eyK\u00187E^¬\u0019\u001a>v\u0012fJÂ\f\t@ÍaJ@\u0080H÷N¾\u008d¤K\u0097\u0014Á\u008cægVT\\\u0098ö^Ùw\u0080]á²'5;ø\u009eÁ(òû4\u0097\u008fìi\u0086DØ\u0093ÚÛ9\u0098NU^\u009cÝï}\u008cù\u009c\u0010ðæýLçîÏcT'\u001a@,4 Å®\u001fiú\u0098Þ\u0084×Û\u0002\u0085\u0093³6X«)y\u0088e\u0007G+¶D¯âé\u001a+@";
      int var8 = "hõ9¬\u009d\u0019\u008f\t#'Z\u00104\u0093ö\u0007gàÂÆkÄ\u009b\u0098zÃSg_6½9\u008c\u000bt1ìØpï qH±¥!{}\u0097öþ¿¥}l¿\u008cEï8\u0010]\"v7¶ \u009aµ©tË}P¤®Ä\u008e£N¢²\u0086µó4\u001c\tµ\u0085»8=eãU²\u0088»ZküèÊO¿\u007f\u0003\u009dLàs8Jp\u0081K¹\fñ¬¿\u0013ÿ³¾ç¹Â\u0019w\u0001,\u0002µ\"!\u001eÉÁpaU\u0002×k \fZÌE¬\u0002ï\u0018·'\u008b¯ÿ\u008e\u0094g\u0093¿HQ\u0007ð\u0012\u00ad\u009ar\u001dåoì;2\u0018\u009bë÷M\u007fAÆy±\u0089Jü\u00127|Û\u0002Y\u0081:É\n£ß ¤é°OH\nf\u0095ªÏÊÝ28\u0013åÞ\u007f¤æÆy¶í\u0003ízµÇ«À\u009a`§ÒÉ\u001er;ñ\fÂ\u0099q´=\u000f\u000b1z\u00adTNR\u0091^!+ü\fð\u000bb\u0003oè¬è\u0093÷©\u0013«Ä\u008eyK\u00187E^¬\u0019\u001a>v\u0012fJÂ\f\t@ÍaJ@\u0080H÷N¾\u008d¤K\u0097\u0014Á\u008cægVT\\\u0098ö^Ùw\u0080]á²'5;ø\u009eÁ(òû4\u0097\u008fìi\u0086DØ\u0093ÚÛ9\u0098NU^\u009cÝï}\u008cù\u009c\u0010ðæýLçîÏcT'\u001a@,4 Å®\u001fiú\u0098Þ\u0084×Û\u0002\u0085\u0093³6X«)y\u0088e\u0007G+¶D¯âé\u001a+@"
         .length();
      char var5 = '(';
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
                     c = var9;
                     d = new String[11];
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

                  var6 = "C¤ØJÆ¹jú¡Â]mÛ\u008dÍd³S\u001d%'¸ýÚ£ãÙìZ)ü§ _Íá\u0099\t-\u00026ÔÆè©g&\u0093©5¯I¦lXDb(\u009dÊ*\u0083]Xo";
                  var8 = "C¤ØJÆ¹jú¡Â]mÛ\u008dÍd³S\u001d%'¸ýÚ£ãÙìZ)ü§ _Íá\u0099\t-\u00026ÔÆè©g&\u0093©5¯I¦lXDb(\u009dÊ*\u0083]Xo".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj b(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19583;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/yx", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/yx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
