package com.zelix;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xq {
   boolean J;
   private static String q;
   private ArrayList r;
   boolean O;
   private String u;
   private static final long a = ess.a(-1326770951009944737L, 5809486293738603319L, MethodHandles.lookup().lookupClass()).a(74240012410408L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   void B(Object[] var1) {
      PrintWriter var5 = (PrintWriter)var1[0];
      _f2 var7 = (_f2)var1[1];
      Map var6 = (Map)var1[2];
      w var2 = (w)var1[3];
      long var3 = (Long)var1[4];
      w var8 = (w)var1[5];
      var3 = a ^ var3;
      long var9 = var3 ^ 84643398247823L;
      String[] var10000 = x44.a<"s">(-707397215937305683L, var3);
      var5.println(x44.a<"o">(this, -1266913667556139709L, var3));
      Set var12 = x44.a<"m">(this, new Object[]{var9, x44.a<"o">(this, -1266913667556139709L, var3), var7, var6, var2, var8}, -1207624041332096089L, var3);
      String[] var11 = var10000;

      try {
         if (var12 != null) {
            x44.a<"p">(this, new ArrayList(var12), -1401840595195871868L, var3);
         }
      } catch (gj var17) {
         throw x44.a<"s">(var17, -1468023723227251149L, var3);
      }

      label49:
      for (String var14 : x44.a<"o">(this, -1401840595195871868L, var3)) {
         try {
            var5.println(var14);
         } catch (gj var16) {
            boolean var10001 = false;
            throw x44.a<"s">(var16, -1468023723227251149L, var3);
         }

         while (true) {
            try {
               var10000 = var11;
               if (var3 > 0L) {
                  if (var11 == null) {
                     return;
                  }

                  var10000 = var11;
               }

               if (var10000 != null) {
                  break;
               }
            } catch (gj var15) {
               boolean var21 = false;
               throw x44.a<"s">(var15, -1468023723227251149L, var3);
            }

            if (var3 >= 0L) {
               break label49;
            }
         }
      }

      x44.a<"k">(var5, -1433569133057253411L, var3);
   }

   boolean S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      String[] var4 = x44.a<"w">(-24046859272984023L, var2);

      try {
         int var10000 = x44.a<"k">(this, -1941076593807608832L, var2).size();
         if (var4 == null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"w">(var5, -2151374496507594825L, var2);
      }

      return (boolean)0;
   }

   private Set q(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/String
      // 012: astore 7
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/_f2
      // 01a: astore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/Map
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/w
      // 029: astore 3
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/w
      // 030: astore 8
      // 032: pop
      // 033: getstatic com/zelix/xq.a J
      // 036: lload 4
      // 038: lxor
      // 039: lstore 4
      // 03b: lload 4
      // 03d: dup2
      // 03e: ldc2_w 65299001574691
      // 041: lxor
      // 042: lstore 9
      // 044: dup2
      // 045: ldc2_w 73519208275345
      // 048: lxor
      // 049: lstore 11
      // 04b: dup2
      // 04c: ldc2_w 5458735387658
      // 04f: lxor
      // 050: lstore 13
      // 052: pop2
      // 053: aload 6
      // 055: invokeinterface java/util/Map.size ()I 1
      // 05a: lload 13
      // 05c: invokestatic com/zelix/sh.Q (IJ)I
      // 05f: lload 11
      // 061: bipush 2
      // 062: anewarray 403
      // 065: dup_x2
      // 066: dup_x2
      // 067: pop
      // 068: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06b: bipush 1
      // 06c: swap
      // 06d: aastore
      // 06e: dup_x1
      // 06f: swap
      // 070: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 073: bipush 0
      // 074: swap
      // 075: aastore
      // 076: ldc2_w -2048340705425693663
      // 079: lload 4
      // 07b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: astore 16
      // 082: ldc2_w -1834773598110682358
      // 085: lload 4
      // 087: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: aload 2
      // 08d: invokevirtual com/zelix/_f2.x ()Ljava/lang/String;
      // 090: astore 17
      // 092: astore 15
      // 094: aload 0
      // 095: aload 15
      // 097: ifnull 0cd
      // 09a: ldc2_w -1950062490154696398
      // 09d: lload 4
      // 09f: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: ifeq 0d3
      // 0a7: goto 0b5
      // 0aa: ldc2_w -358094533434708332
      // 0ad: lload 4
      // 0af: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: aload 16
      // 0b7: aload 17
      // 0b9: aload 2
      // 0ba: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0bf: goto 0cd
      // 0c2: ldc2_w -358094533434708332
      // 0c5: lload 4
      // 0c7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: pop
      // 0ce: aload 15
      // 0d0: ifnonnull 184
      // 0d3: aload 6
      // 0d5: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0da: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0df: astore 18
      // 0e1: aload 18
      // 0e3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e8: ifeq 184
      // 0eb: aload 18
      // 0ed: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f2: checkcast java/util/Map$Entry
      // 0f5: astore 19
      // 0f7: aload 19
      // 0f9: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0fe: checkcast java/lang/String
      // 101: astore 20
      // 103: aload 20
      // 105: aload 17
      // 107: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10a: lload 4
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: ifle 15d
      // 111: aload 15
      // 113: ifnull 15d
      // 116: ifne 17f
      // 119: goto 127
      // 11c: ldc2_w -358094533434708332
      // 11f: lload 4
      // 121: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 20
      // 129: aload 15
      // 12b: ifnull 17e
      // 12e: goto 13c
      // 131: ldc2_w -358094533434708332
      // 134: lload 4
      // 136: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: aload 7
      // 13e: ldc "\\"
      // 140: ldc "/"
      // 142: ldc2_w -154490191246346060
      // 145: lload 4
      // 147: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 14f: goto 15d
      // 152: ldc2_w -358094533434708332
      // 155: lload 4
      // 157: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: ifeq 17f
      // 160: aload 16
      // 162: aload 20
      // 164: aload 19
      // 166: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 16b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 170: goto 17e
      // 173: ldc2_w -358094533434708332
      // 176: lload 4
      // 178: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: pop
      // 17f: aload 15
      // 181: ifnonnull 0e1
      // 184: aconst_null
      // 185: astore 18
      // 187: aload 16
      // 189: invokeinterface java/util/Map.size ()I 1
      // 18e: aload 15
      // 190: ifnull 1cb
      // 193: ifne 1b1
      // 196: goto 1a4
      // 199: ldc2_w -358094533434708332
      // 19c: lload 4
      // 19e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: aconst_null
      // 1a5: areturn
      // 1a6: ldc2_w -358094533434708332
      // 1a9: lload 4
      // 1ab: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: athrow
      // 1b1: aload 16
      // 1b3: aload 15
      // 1b5: ifnull 479
      // 1b8: invokeinterface java/util/Map.size ()I 1
      // 1bd: goto 1cb
      // 1c0: ldc2_w -358094533434708332
      // 1c3: lload 4
      // 1c5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: bipush 1
      // 1cc: if_icmple 460
      // 1cf: aload 16
      // 1d1: invokeinterface java/util/Map.size ()I 1
      // 1d6: lload 13
      // 1d8: invokestatic com/zelix/sh.Q (IJ)I
      // 1db: lload 11
      // 1dd: bipush 2
      // 1de: anewarray 403
      // 1e1: dup_x2
      // 1e2: dup_x2
      // 1e3: pop
      // 1e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e7: bipush 1
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ef: bipush 0
      // 1f0: swap
      // 1f1: aastore
      // 1f2: ldc2_w -2048340705425693663
      // 1f5: lload 4
      // 1f7: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: astore 19
      // 1fe: aload 16
      // 200: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 205: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 20a: astore 20
      // 20c: aload 20
      // 20e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 213: ifeq 300
      // 216: aload 20
      // 218: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21d: checkcast java/util/Map$Entry
      // 220: astore 21
      // 222: aload 21
      // 224: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 229: checkcast java/lang/String
      // 22c: astore 22
      // 22e: aload 21
      // 230: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 235: checkcast com/zelix/_f2
      // 238: astore 23
      // 23a: aload 0
      // 23b: ldc2_w -275586270564143837
      // 23e: lload 4
      // 240: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 248: aload 15
      // 24a: ifnull 458
      // 24d: astore 24
      // 24f: aload 24
      // 251: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 256: ifeq 2e8
      // 259: aload 24
      // 25b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 260: checkcast java/lang/String
      // 263: astore 25
      // 265: aload 25
      // 267: ldc "/"
      // 269: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 26c: aload 15
      // 26e: ifnull 2b7
      // 271: bipush -1
      // 272: aload 15
      // 274: ifnull 34c
      // 277: goto 285
      // 27a: ldc2_w -358094533434708332
      // 27d: lload 4
      // 27f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: athrow
      // 285: if_icmpne 2e3
      // 288: goto 296
      // 28b: ldc2_w -358094533434708332
      // 28e: lload 4
      // 290: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: athrow
      // 296: aload 25
      // 298: sipush 6935
      // 29b: ldc2_w 7571595040646045232
      // 29e: lload 4
      // 2a0: lxor
      // 2a1: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a6: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 2a9: goto 2b7
      // 2ac: ldc2_w -358094533434708332
      // 2af: lload 4
      // 2b1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: athrow
      // 2b7: ifne 2e3
      // 2ba: aload 3
      // 2bb: lload 9
      // 2bd: aload 23
      // 2bf: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 2c2: astore 26
      // 2c4: aload 26
      // 2c6: aload 25
      // 2c8: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 2cd: ifne 2e3
      // 2d0: aload 15
      // 2d2: ifnonnull 20c
      // 2d5: goto 2e3
      // 2d8: ldc2_w -358094533434708332
      // 2db: lload 4
      // 2dd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: athrow
      // 2e3: aload 15
      // 2e5: ifnonnull 24f
      // 2e8: aload 19
      // 2ea: aload 22
      // 2ec: aload 23
      // 2ee: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2f3: pop
      // 2f4: aload 15
      // 2f6: lload 4
      // 2f8: lconst_0
      // 2f9: lcmp
      // 2fa: iflt 260
      // 2fd: ifnonnull 20c
      // 300: aload 19
      // 302: invokeinterface java/util/Map.size ()I 1
      // 307: lload 4
      // 309: lconst_0
      // 30a: lcmp
      // 30b: ifle 213
      // 30e: aload 15
      // 310: ifnull 34b
      // 313: ifne 331
      // 316: goto 324
      // 319: ldc2_w -358094533434708332
      // 31c: lload 4
      // 31e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: athrow
      // 324: aconst_null
      // 325: areturn
      // 326: ldc2_w -358094533434708332
      // 329: lload 4
      // 32b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: athrow
      // 331: aload 19
      // 333: aload 15
      // 335: ifnull 458
      // 338: invokeinterface java/util/Map.size ()I 1
      // 33d: goto 34b
      // 340: ldc2_w -358094533434708332
      // 343: lload 4
      // 345: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34a: athrow
      // 34b: bipush 1
      // 34c: if_icmple 43f
      // 34f: new java/lang/StringBuilder
      // 352: dup
      // 353: invokespecial java/lang/StringBuilder.<init> ()V
      // 356: astore 20
      // 358: aload 20
      // 35a: sipush 9716
      // 35d: ldc2_w 4838815457297703125
      // 360: lload 4
      // 362: lxor
      // 363: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36b: pop
      // 36c: aload 20
      // 36e: sipush 24261
      // 371: ldc2_w 7338749199875595239
      // 374: lload 4
      // 376: lxor
      // 377: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37f: pop
      // 380: aload 20
      // 382: aload 7
      // 384: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 387: pop
      // 388: aload 20
      // 38a: sipush 24464
      // 38d: ldc2_w 8001224573289323184
      // 390: lload 4
      // 392: lxor
      // 393: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39b: pop
      // 39c: bipush 0
      // 39d: istore 21
      // 39f: aload 19
      // 3a1: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 3a6: astore 22
      // 3a8: aload 22
      // 3aa: invokeinterface java/util/Set.size ()I 1
      // 3af: istore 23
      // 3b1: aload 22
      // 3b3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 3b8: astore 24
      // 3ba: aload 24
      // 3bc: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3c1: ifeq 42b
      // 3c4: aload 24
      // 3c6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3cb: checkcast java/lang/String
      // 3ce: astore 25
      // 3d0: aload 20
      // 3d2: aload 25
      // 3d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d7: pop
      // 3d8: lload 4
      // 3da: lconst_0
      // 3db: lcmp
      // 3dc: ifle 3ef
      // 3df: aload 20
      // 3e1: ldc "'"
      // 3e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e6: aload 15
      // 3e8: ifnull 425
      // 3eb: pop
      // 3ec: iinc 21 1
      // 3ef: iload 21
      // 3f1: iload 23
      // 3f3: if_icmpge 426
      // 3f6: goto 404
      // 3f9: ldc2_w -358094533434708332
      // 3fc: lload 4
      // 3fe: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 403: athrow
      // 404: aload 20
      // 406: sipush 1495
      // 409: ldc2_w 5685101604391715060
      // 40c: lload 4
      // 40e: lxor
      // 40f: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 417: goto 425
      // 41a: ldc2_w -358094533434708332
      // 41d: lload 4
      // 41f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 424: athrow
      // 425: pop
      // 426: aload 15
      // 428: ifnonnull 3ba
      // 42b: new com/zelix/_sf
      // 42e: dup
      // 42f: aload 20
      // 431: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 434: invokespecial com/zelix/_sf.<init> (Ljava/lang/String;)V
      // 437: lload 4
      // 439: lconst_0
      // 43a: lcmp
      // 43b: ifle 3cb
      // 43e: athrow
      // 43f: aload 16
      // 441: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 446: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 44b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 450: checkcast java/util/Map$Entry
      // 453: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 458: checkcast com/zelix/_f2
      // 45b: astore 18
      // 45d: goto 47e
      // 460: aload 16
      // 462: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 467: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 46c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 471: checkcast java/util/Map$Entry
      // 474: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 479: checkcast com/zelix/_f2
      // 47c: astore 18
      // 47e: new java/util/TreeSet
      // 481: dup
      // 482: invokespecial java/util/TreeSet.<init> ()V
      // 485: astore 19
      // 487: aload 3
      // 488: lload 9
      // 48a: aload 18
      // 48c: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 48f: astore 20
      // 491: aload 20
      // 493: aload 15
      // 495: ifnull 4ca
      // 498: ifnull 4c1
      // 49b: goto 4a9
      // 49e: ldc2_w -358094533434708332
      // 4a1: lload 4
      // 4a3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a8: athrow
      // 4a9: aload 19
      // 4ab: aload 20
      // 4ad: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 4b2: pop
      // 4b3: goto 4c1
      // 4b6: ldc2_w -358094533434708332
      // 4b9: lload 4
      // 4bb: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c0: athrow
      // 4c1: aload 8
      // 4c3: lload 9
      // 4c5: aload 18
      // 4c7: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 4ca: astore 21
      // 4cc: lload 4
      // 4ce: lconst_0
      // 4cf: lcmp
      // 4d0: iflt 4e2
      // 4d3: aload 21
      // 4d5: ifnull 4f0
      // 4d8: aload 19
      // 4da: aload 21
      // 4dc: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 4e1: pop
      // 4e2: goto 4f0
      // 4e5: ldc2_w -358094533434708332
      // 4e8: lload 4
      // 4ea: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ef: athrow
      // 4f0: aload 19
      // 4f2: areturn
   }

   static {
      long var14 = a ^ 10691194283378L;
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[5];
      int var10 = 0;
      String var9 = "-\u0015¨xÆ¦{\u0081O\u009e\u0011\u008a¡\u008bÓ\u0012PT\u0012ß½\u008cøîH/}ø\u0015Ó»ñ\u0099H\"\u0018Ñ8kW±\u0001¬¦câ~\u009e\u0080 \\\u008dÆj\u001aè\u0086$jK&\u008d\u001c\u0000×\u009c>PçKy²\u0091A\u008b¹h5\u0089°9Z«\u001aªøÿ?h°/)¿Yo\u0081ø\u0010t\u0010\u0083\u008c\u001c×BO¸\u0007Z©\u0085ÕC\u0089";
      int var11 = "-\u0015¨xÆ¦{\u0081O\u009e\u0011\u008a¡\u008bÓ\u0012PT\u0012ß½\u008cøîH/}ø\u0015Ó»ñ\u0099H\"\u0018Ñ8kW±\u0001¬¦câ~\u009e\u0080 \\\u008dÆj\u001aè\u0086$jK&\u008d\u001c\u0000×\u009c>PçKy²\u0091A\u008b¹h5\u0089°9Z«\u001aªøÿ?h°/)¿Yo\u0081ø\u0010t\u0010\u0083\u008c\u001c×BO¸\u0007Z©\u0085ÕC\u0089"
         .length();
      char var8 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var9.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var13).intern();
            switch (var10001) {
               case 0:
                  var12[var10++] = var26;
                  if ((var17 += var8) >= var11) {
                     b = var12;
                     c = new String[5];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 8276465584673023882L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)((int)(var2 >>> 56)),
                           (byte)((int)(var2 >>> 48)),
                           (byte)((int)(var2 >>> 40)),
                           (byte)((int)(var2 >>> 32)),
                           (byte)((int)(var2 >>> 24)),
                           (byte)((int)(var2 >>> 16)),
                           (byte)((int)(var2 >>> 8)),
                           (byte)((int)var2)
                        }
                     );
                     long var30 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     e = var30;
                     x44.a<"p">("&", 210781380662289327L, var14);
                     return;
                  }

                  var8 = var9.charAt(var17);
                  break;
               default:
                  var12[var10++] = var26;
                  if ((var17 += var8) < var11) {
                     var8 = var9.charAt(var17);
                     continue label37;
                  }

                  var9 = "Å\u0085FàÞÑê¢Ò4´\u0094Â¸hí\u0010{¹èDùå\u0081\r\u001dØØf^B\"\u0093";
                  var11 = "Å\u0085FàÞÑê¢Ò4´\u0094Â¸hí\u0010{¹èDùå\u0081\r\u001dØØf^B\"\u0093".length();
                  var8 = 16;
                  var17 = -1;
            }

            var18 = var9.substring(++var17, var17 + var8);
            var10001 = 0;
         }
      }
   }

   xq(short param1, int param2, char param3, BufferedReader param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 48
      // 012: lshl
      // 013: bipush 48
      // 015: lushr
      // 016: lor
      // 017: getstatic com/zelix/xq.a J
      // 01a: lxor
      // 01b: lstore 5
      // 01d: ldc2_w -8732299836279844013
      // 020: lload 5
      // 022: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aload 0
      // 028: invokespecial java/lang/Object.<init> ()V
      // 02b: astore 7
      // 02d: aload 0
      // 02e: new java/util/ArrayList
      // 031: dup
      // 032: invokespecial java/util/ArrayList.<init> ()V
      // 035: ldc2_w -7172585980405035654
      // 038: lload 5
      // 03a: invokedynamic v (Ljava/lang/Object;Ljava/util/ArrayList;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: bipush 0
      // 040: istore 8
      // 042: aload 4
      // 044: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 047: dup
      // 048: astore 9
      // 04a: ifnull 1c5
      // 04d: aload 7
      // 04f: ifnull 1d1
      // 052: aload 9
      // 054: ldc ""
      // 056: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 059: aload 7
      // 05b: iload 1
      // 05c: iflt 0bd
      // 05f: ifnull 0bb
      // 062: goto 070
      // 065: ldc2_w -7251083085807939891
      // 068: lload 5
      // 06a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: ifeq 0ac
      // 073: goto 081
      // 076: ldc2_w -7251083085807939891
      // 079: lload 5
      // 07b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: iload 8
      // 083: ifne 0ab
      // 086: goto 094
      // 089: ldc2_w -7251083085807939891
      // 08c: lload 5
      // 08e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: aload 7
      // 096: ifnonnull 042
      // 099: iload 3
      // 09a: iflt 04d
      // 09d: goto 0ab
      // 0a0: ldc2_w -7251083085807939891
      // 0a3: lload 5
      // 0a5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: return
      // 0ac: aload 9
      // 0ae: ldc2_w -6928517017612386661
      // 0b1: lload 5
      // 0b3: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bb: aload 7
      // 0bd: iload 1
      // 0be: iflt 100
      // 0c1: ifnull 0fe
      // 0c4: ifeq 0fc
      // 0c7: goto 0d5
      // 0ca: ldc2_w -7251083085807939891
      // 0cd: lload 5
      // 0cf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: iload 8
      // 0d7: ifne 0fb
      // 0da: goto 0e8
      // 0dd: ldc2_w -7251083085807939891
      // 0e0: lload 5
      // 0e2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 7
      // 0ea: ifnonnull 042
      // 0ed: goto 0fb
      // 0f0: ldc2_w -7251083085807939891
      // 0f3: lload 5
      // 0f5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: return
      // 0fc: iload 8
      // 0fe: aload 7
      // 100: iload 3
      // 101: ifle 135
      // 104: ifnull 133
      // 107: ifne 12d
      // 10a: goto 118
      // 10d: ldc2_w -7251083085807939891
      // 110: lload 5
      // 112: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: bipush 1
      // 119: istore 8
      // 11b: aload 0
      // 11c: aload 9
      // 11e: ldc2_w -7019573803183706691
      // 121: lload 5
      // 123: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: aload 7
      // 12a: ifnonnull 042
      // 12d: aload 9
      // 12f: bipush 0
      // 130: invokevirtual java/lang/String.charAt (I)C
      // 133: aload 7
      // 135: ifnull 1bb
      // 138: getstatic com/zelix/xq.e J
      // 13b: l2i
      // 13c: if_icmpne 1ab
      // 13f: goto 14d
      // 142: ldc2_w -7251083085807939891
      // 145: lload 5
      // 147: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: aload 0
      // 14e: ldc2_w -7172585980405035654
      // 151: lload 5
      // 153: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: aload 0
      // 159: ldc2_w -7172585980405035654
      // 15c: lload 5
      // 15e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: invokevirtual java/util/ArrayList.size ()I
      // 166: bipush 1
      // 167: isub
      // 168: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 16b: checkcast java/lang/String
      // 16e: astore 10
      // 170: new java/lang/StringBuilder
      // 173: dup
      // 174: invokespecial java/lang/StringBuilder.<init> ()V
      // 177: aload 10
      // 179: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17c: aload 9
      // 17e: bipush 1
      // 17f: aload 9
      // 181: invokevirtual java/lang/String.length ()I
      // 184: bipush 1
      // 185: isub
      // 186: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 189: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 18f: astore 11
      // 191: aload 0
      // 192: ldc2_w -7172585980405035654
      // 195: lload 5
      // 197: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: aload 11
      // 19e: iload 3
      // 19f: ifle 1b8
      // 1a2: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1a5: pop
      // 1a6: aload 7
      // 1a8: ifnonnull 042
      // 1ab: aload 0
      // 1ac: ldc2_w -7172585980405035654
      // 1af: lload 5
      // 1b1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: aload 9
      // 1b8: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1bb: pop
      // 1bc: iload 1
      // 1bd: iflt 1d1
      // 1c0: aload 7
      // 1c2: ifnonnull 042
      // 1c5: aload 0
      // 1c6: bipush 1
      // 1c7: ldc2_w -7066986307833061547
      // 1ca: lload 5
      // 1cc: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: return
   }

   void i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"r">(this, true, -6702767057764923609L, var2);
   }

   boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 3337288948080061672L, var2);
   }

   private static gj a(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26644;
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
            throw new RuntimeException("com/zelix/xq", var10);
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
         throw new RuntimeException("com/zelix/xq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
