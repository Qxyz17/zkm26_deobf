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

public class st {
   private static final long a = ess.a(-4149445059240902330L, 6792793515115827001L, MethodHandles.lookup().lookupClass()).a(146959245057423L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void S(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: pop
      // 00c: getstatic com/zelix/st.a J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: lload 1
      // 013: dup2
      // 014: ldc2_w 109036583344786
      // 017: lxor
      // 018: lstore 3
      // 019: pop2
      // 01a: ldc2_w -5631741954336477760
      // 01d: lload 1
      // 01e: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: astore 5
      // 025: ldc2_w -5445990573063472589
      // 028: lload 1
      // 029: invokedynamic t (JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: astore 6
      // 030: aload 6
      // 032: aload 5
      // 034: ifnonnull 0a6
      // 037: sipush 6653
      // 03a: ldc2_w 1907269520785479452
      // 03d: lload 1
      // 03e: lxor
      // 03f: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/st.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: lload 3
      // 045: sipush 12803
      // 048: ldc2_w 5927716789272329443
      // 04b: lload 1
      // 04c: lxor
      // 04d: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/st.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: bipush 4
      // 053: anewarray 124
      // 056: dup_x1
      // 057: swap
      // 058: bipush 3
      // 059: swap
      // 05a: aastore
      // 05b: dup_x2
      // 05c: dup_x2
      // 05d: pop
      // 05e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 061: bipush 2
      // 062: swap
      // 063: aastore
      // 064: dup_x1
      // 065: swap
      // 066: bipush 1
      // 067: swap
      // 068: aastore
      // 069: dup_x1
      // 06a: swap
      // 06b: bipush 0
      // 06c: swap
      // 06d: aastore
      // 06e: ldc2_w -5978445966563671960
      // 071: lload 1
      // 072: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: sipush 3930
      // 07a: ldc2_w 6283773443775103416
      // 07d: lload 1
      // 07e: lxor
      // 07f: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/st.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 087: ifeq 0fb
      // 08a: goto 097
      // 08d: ldc2_w -5976286876812576911
      // 090: lload 1
      // 091: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/SecurityException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: aload 6
      // 099: goto 0a6
      // 09c: ldc2_w -5976286876812576911
      // 09f: lload 1
      // 0a0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/SecurityException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0ab: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0b0: astore 7
      // 0b2: aload 7
      // 0b4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b9: ifeq 0fb
      // 0bc: aload 7
      // 0be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c3: checkcast java/util/Map$Entry
      // 0c6: astore 8
      // 0c8: aload 5
      // 0ca: lload 1
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: ifle 0da
      // 0d0: ifnonnull 106
      // 0d3: aload 8
      // 0d5: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0da: checkcast java/lang/String
      // 0dd: ldc2_w -5558078291786154547
      // 0e0: lload 1
      // 0e1: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: ifnonnull 0f6
      // 0e9: goto 0f6
      // 0ec: ldc2_w -5976286876812576911
      // 0ef: lload 1
      // 0f0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/SecurityException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 5
      // 0f8: ifnull 0b2
      // 0fb: lload 1
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: ifle 106
      // 101: goto 106
      // 104: astore 6
      // 106: new java/io/File
      // 109: dup
      // 10a: sipush 23590
      // 10d: ldc2_w 6661139802081612485
      // 110: lload 1
      // 111: lxor
      // 112: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/st.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 11a: astore 6
      // 11c: aload 6
      // 11e: ldc2_w -6006080694186083750
      // 121: lload 1
      // 122: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: aload 5
      // 129: ifnonnull 154
      // 12c: ifeq 2a9
      // 12f: goto 13c
      // 132: ldc2_w -5976286876812576911
      // 135: lload 1
      // 136: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/SecurityException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: aload 6
      // 13e: ldc2_w -5974223296846614794
      // 141: lload 1
      // 142: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: goto 154
      // 14a: ldc2_w -5976286876812576911
      // 14d: lload 1
      // 14e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/SecurityException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: ifne 2a9
      // 157: new java/io/FileReader
      // 15a: dup
      // 15b: aload 6
      // 15d: invokespecial java/io/FileReader.<init> (Ljava/io/File;)V
      // 160: astore 7
      // 162: aconst_null
      // 163: astore 8
      // 165: new java/util/Properties
      // 168: dup
      // 169: invokespecial java/util/Properties.<init> ()V
      // 16c: astore 9
      // 16e: aload 9
      // 170: aload 7
      // 172: ldc2_w -6226478706422179155
      // 175: lload 1
      // 176: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: aload 9
      // 17d: ldc2_w -5497267383949643150
      // 180: lload 1
      // 181: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 18b: astore 10
      // 18d: aload 10
      // 18f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 194: ifeq 1df
      // 197: aload 10
      // 199: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 19e: checkcast java/lang/String
      // 1a1: astore 11
      // 1a3: aload 11
      // 1a5: aload 9
      // 1a7: aload 11
      // 1a9: ldc2_w -5610284079910377946
      // 1ac: lload 1
      // 1ad: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: ldc2_w -5413169916583546971
      // 1b5: lload 1
      // 1b6: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: pop
      // 1bc: aload 5
      // 1be: lload 1
      // 1bf: lconst_0
      // 1c0: lcmp
      // 1c1: iflt 1c9
      // 1c4: ifnonnull 289
      // 1c7: aload 5
      // 1c9: ifnull 18d
      // 1cc: lload 1
      // 1cd: lconst_0
      // 1ce: lcmp
      // 1cf: iflt 1bc
      // 1d2: goto 1df
      // 1d5: ldc2_w -5976286876812576911
      // 1d8: lload 1
      // 1d9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/SecurityException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 7
      // 1e1: ifnull 289
      // 1e4: aload 8
      // 1e6: ifnull 216
      // 1e9: goto 1f6
      // 1ec: ldc2_w -5976286876812576911
      // 1ef: lload 1
      // 1f0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/SecurityException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: aload 7
      // 1f8: ldc2_w -5527639798128765884
      // 1fb: lload 1
      // 1fc: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: goto 289
      // 204: astore 9
      // 206: aload 8
      // 208: aload 9
      // 20a: ldc2_w -5657222045971535749
      // 20d: lload 1
      // 20e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: goto 289
      // 216: aload 7
      // 218: ldc2_w -5527639798128765884
      // 21b: lload 1
      // 21c: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: goto 289
      // 224: astore 9
      // 226: aload 9
      // 228: astore 8
      // 22a: aload 9
      // 22c: athrow
      // 22d: astore 12
      // 22f: aload 7
      // 231: ifnull 286
      // 234: aload 8
      // 236: ifnull 26e
      // 239: goto 246
      // 23c: ldc2_w -5976286876812576911
      // 23f: lload 1
      // 240: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/SecurityException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: aload 7
      // 248: ldc2_w -5527639798128765884
      // 24b: lload 1
      // 24c: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: goto 286
      // 254: astore 13
      // 256: aload 8
      // 258: lload 1
      // 259: lconst_0
      // 25a: lcmp
      // 25b: iflt 288
      // 25e: aload 13
      // 260: ldc2_w -5657222045971535749
      // 263: lload 1
      // 264: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: aload 5
      // 26b: ifnull 286
      // 26e: aload 7
      // 270: ldc2_w -5527639798128765884
      // 273: lload 1
      // 274: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: goto 286
      // 27c: ldc2_w -5976286876812576911
      // 27f: lload 1
      // 280: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/SecurityException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: athrow
      // 286: aload 12
      // 288: athrow
      // 289: goto 2a9
      // 28c: astore 7
      // 28e: aload 7
      // 290: ldc2_w -5376649140802324745
      // 293: lload 1
      // 294: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: goto 2a9
      // 29c: astore 7
      // 29e: aload 7
      // 2a0: ldc2_w -6001116050592342410
      // 2a3: lload 1
      // 2a4: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: return
   }

   static {
      long var0 = a ^ 98356092492238L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "©ps\u0017Ô]Yè-ÔV\u00897|þ\u0086Øc\rÛf\u008e&U\u001b\u0093T\u001cf9²[ï\u0013ã\u0016¬\\;é<Ì-+´·±³º´\u0098V½}\u008dòZ5\u0005õÆwÆ_e8¸_©s[Ä\u008at¦\u0003´\u007f\u0019¥.\u0017ê~fÐò\u001a\u000fM\\3ó\u008f\r*{@I(csßñÔ\"v¬\u009dµßÞt>3\u009dkö©Ì²ì¥28\u0004É¢0\u0017V\u0088\u0090\u009fR¾\u008f¬É~]aX\u0099án1\u008eh\u0083&G\u0094FA-\u009aAU\u008cÞä\u0015I$-\u000b\u001c\u001f¡ÃòÕÙÙg\u0095Â}\u000fËì\u001a\u0019ÅP;Ë\u0097AN\u0098x1¬~\u000eõ©\u008a¦Æ½M{Õ\u0014YâmÓ\u0001Lõµÿ¼ÌÄ7\u009bçRl2°&Þ¶pf\u008d\u0004";
      int var8 = "©ps\u0017Ô]Yè-ÔV\u00897|þ\u0086Øc\rÛf\u008e&U\u001b\u0093T\u001cf9²[ï\u0013ã\u0016¬\\;é<Ì-+´·±³º´\u0098V½}\u008dòZ5\u0005õÆwÆ_e8¸_©s[Ä\u008at¦\u0003´\u007f\u0019¥.\u0017ê~fÐò\u001a\u000fM\\3ó\u008f\r*{@I(csßñÔ\"v¬\u009dµßÞt>3\u009dkö©Ì²ì¥28\u0004É¢0\u0017V\u0088\u0090\u009fR¾\u008f¬É~]aX\u0099án1\u008eh\u0083&G\u0094FA-\u009aAU\u008cÞä\u0015I$-\u000b\u001c\u001f¡ÃòÕÙÙg\u0095Â}\u000fËì\u001a\u0019ÅP;Ë\u0097AN\u0098x1¬~\u000eõ©\u008a¦Æ½M{Õ\u0014YâmÓ\u0001Lõµÿ¼ÌÄ7\u009bçRl2°&Þ¶pf\u008d\u0004"
         .length();
      char var5 = 16;
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
                     b = var9;
                     c = new String[4];
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

                  var6 = "ùM%ÞÚ\u0019ä<ª\u0012¬ø\u00014û\u001d(ÏñD8\u0089Í¬ï-¯fÛ\u0086¯gb×\u0082Eáè\u0080Z§\u0089Móoûn¯¦þÄ\bô\u0094Æ¯Y";
                  var8 = "ùM%ÞÚ\u0019ä<ª\u0012¬ø\u00014û\u001d(ÏñD8\u0089Í¬ï-¯fÛ\u0086¯gb×\u0082Eáè\u0080Z§\u0089Móoûn¯¦þÄ\bô\u0094Æ¯Y".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static SecurityException a(SecurityException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13903;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/st", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/st" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
