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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class k5 extends ki {
   s8[] j;
   private static final long c = prr.a(-1064560571520232452L, 4129042447096962590L, MethodHandles.lookup().lookupClass()).a(113181474013383L);
   private static final String[] g;
   private static final String[] i;
   private static final Map k = new HashMap(13);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public s8 H(Object[] var1) {
      String var2 = (String)var1[0];
      boolean var3 = (Boolean)var1[1];
      long var4 = (Long)var1[2];
      var4 = c ^ var4;
      long var6 = var4 ^ 60761269928384L;
      long var8 = var4 ^ 117358529456601L;
      boolean var10 = m44.a<"k">(5152905208449078117L, var4);

      byte var10000;
      label65: {
         try {
            var10000 = m44.a<"u">(this, 5083331861247724637L, var4);
            if (var10) {
               break label65;
            }

            if (var10000 == 0) {
               return null;
            }
         } catch (n9 var15) {
            throw m44.a<"k">(var15, 5123983747149063419L, var4);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < m44.a<"u">(this, 6421530288437371129L, var4).length) {
         label55: {
            String var12;
            label54: {
               if (var3) {
                  var12 = m44.a<"t">(m44.a<"u">(this, 6421530288437371129L, var4)[var11], new Object[]{var8}, 4856762935194082381L, var4);
                  var17 = var10;
                  if (var4 <= 0L) {
                     break label55;
                  }

                  if (!var10) {
                     break label54;
                  }
               }

               var12 = m44.a<"t">(m44.a<"u">(this, 6421530288437371129L, var4)[var11], new Object[]{var6}, 6526755718473720527L, var4);
            }

            try {
               var17 = var2.equals(var12);
            } catch (n9 var14) {
               boolean var10001 = false;
               throw m44.a<"k">(var14, 5123983747149063419L, var4);
            }
         }

         label44: {
            try {
               if (var4 < 0L) {
                  break label44;
               }

               if (var17) {
                  return m44.a<"u">(this, 6421530288437371129L, var4)[var11];
               }
            } catch (n9 var13) {
               boolean var19 = false;
               throw m44.a<"k">(var13, 5123983747149063419L, var4);
            }

            var11++;
            var17 = var10;
         }

         if (var17) {
            break;
         }
      }

      return null;
   }

   k5(_4 param1, int param2, String param3, h1 param4, l6q param5, long param6, PrintWriter param8, String param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/k5.c J
      // 003: lload 6
      // 005: lxor
      // 006: lstore 6
      // 008: lload 6
      // 00a: dup2
      // 00b: ldc2_w 5805172079134
      // 00e: lxor
      // 00f: lstore 10
      // 011: dup2
      // 012: ldc2_w 44565501730765
      // 015: lxor
      // 016: lstore 12
      // 018: dup2
      // 019: ldc2_w 65180433689016
      // 01c: lxor
      // 01d: lstore 14
      // 01f: dup2
      // 020: ldc2_w 110046508466864
      // 023: lxor
      // 024: lstore 16
      // 026: dup2
      // 027: ldc2_w 28450391368796
      // 02a: lxor
      // 02b: lstore 18
      // 02d: dup2
      // 02e: ldc2_w 31171939378875
      // 031: lxor
      // 032: lstore 20
      // 034: pop2
      // 035: aload 0
      // 036: aload 1
      // 037: iload 2
      // 038: aload 3
      // 039: aload 4
      // 03b: lload 20
      // 03d: aload 5
      // 03f: invokespecial com/zelix/ki.<init> (Lcom/zelix/_4;ILjava/lang/String;Lcom/zelix/h1;JLcom/zelix/l6q;)V
      // 042: ldc2_w -4520268945323872244
      // 045: lload 6
      // 047: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 0
      // 04d: getfield com/zelix/k5.W I
      // 050: newarray 8
      // 052: astore 23
      // 054: aload 4
      // 056: aload 23
      // 058: invokevirtual com/zelix/h1.read ([B)I
      // 05b: pop
      // 05c: aload 23
      // 05e: bipush 0
      // 05f: lload 14
      // 061: bipush 3
      // 062: anewarray 501
      // 065: dup_x2
      // 066: dup_x2
      // 067: pop
      // 068: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06b: bipush 2
      // 06c: swap
      // 06d: aastore
      // 06e: dup_x1
      // 06f: swap
      // 070: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 073: bipush 1
      // 074: swap
      // 075: aastore
      // 076: dup_x1
      // 077: swap
      // 078: bipush 0
      // 079: swap
      // 07a: aastore
      // 07b: ldc2_w -2609903687279892721
      // 07e: lload 6
      // 080: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/h1; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: astore 24
      // 087: istore 22
      // 089: aload 0
      // 08a: iload 22
      // 08c: ifeq 235
      // 08f: getfield com/zelix/k5.W I
      // 092: bipush 2
      // 093: if_icmplt 21a
      // 096: goto 0a4
      // 099: ldc2_w -2773530283129275803
      // 09c: lload 6
      // 09e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 24
      // 0a6: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 0a9: istore 25
      // 0ab: aload 0
      // 0ac: iload 25
      // 0ae: anewarray 151
      // 0b1: ldc2_w -4070225807786426777
      // 0b4: lload 6
      // 0b6: invokedynamic q (Ljava/lang/Object;[Lcom/zelix/s8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: bipush 0
      // 0bc: istore 26
      // 0be: iload 26
      // 0c0: iload 25
      // 0c2: if_icmpge 207
      // 0c5: aload 0
      // 0c6: ldc2_w -4070225807786426777
      // 0c9: lload 6
      // 0cb: invokedynamic s (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: iload 26
      // 0d2: aload 0
      // 0d3: aload 24
      // 0d5: aload 5
      // 0d7: lload 16
      // 0d9: bipush 4
      // 0da: anewarray 501
      // 0dd: dup_x2
      // 0de: dup_x2
      // 0df: pop
      // 0e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e3: bipush 3
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x1
      // 0e7: swap
      // 0e8: bipush 2
      // 0e9: swap
      // 0ea: aastore
      // 0eb: dup_x1
      // 0ec: swap
      // 0ed: bipush 1
      // 0ee: swap
      // 0ef: aastore
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: bipush 0
      // 0f3: swap
      // 0f4: aastore
      // 0f5: ldc2_w -4595515983372374553
      // 0f8: lload 6
      // 0fa: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: aastore
      // 100: iload 22
      // 102: lload 6
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 10e
      // 109: ifeq 2a4
      // 10c: iload 22
      // 10e: lload 6
      // 110: lconst_0
      // 111: lcmp
      // 112: ifle 204
      // 115: ifeq 202
      // 118: goto 126
      // 11b: ldc2_w -2773530283129275803
      // 11e: lload 6
      // 120: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: aload 0
      // 127: ldc2_w -4070225807786426777
      // 12a: lload 6
      // 12c: invokedynamic s (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: iload 26
      // 133: aaload
      // 134: lload 10
      // 136: bipush 1
      // 137: anewarray 501
      // 13a: dup_x2
      // 13b: dup_x2
      // 13c: pop
      // 13d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 140: bipush 0
      // 141: swap
      // 142: aastore
      // 143: ldc2_w -4096322265639668959
      // 146: lload 6
      // 148: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: ifne 1ff
      // 150: goto 15e
      // 153: ldc2_w -2773530283129275803
      // 156: lload 6
      // 158: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: aload 0
      // 15f: bipush 0
      // 160: ldc2_w -2876142569746394429
      // 163: lload 6
      // 165: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: aload 0
      // 16b: aload 23
      // 16d: ldc2_w -2616954123239166031
      // 170: lload 6
      // 172: invokedynamic q (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: aload 8
      // 179: new java/lang/StringBuilder
      // 17c: dup
      // 17d: invokespecial java/lang/StringBuilder.<init> ()V
      // 180: sipush 9777
      // 183: ldc2_w 1941122729384797849
      // 186: lload 6
      // 188: lxor
      // 189: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 191: aload 0
      // 192: lload 18
      // 194: invokevirtual com/zelix/k5.f (J)Ljava/lang/String;
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19a: sipush 14519
      // 19d: ldc2_w 5532712021573859356
      // 1a0: lload 6
      // 1a2: lxor
      // 1a3: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ab: aload 9
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: sipush 3546
      // 1b3: ldc2_w 4340908169384775028
      // 1b6: lload 6
      // 1b8: lxor
      // 1b9: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c1: aload 0
      // 1c2: ldc2_w -4070225807786426777
      // 1c5: lload 6
      // 1c7: invokedynamic s (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: iload 26
      // 1ce: aaload
      // 1cf: lload 12
      // 1d1: bipush 1
      // 1d2: anewarray 501
      // 1d5: dup_x2
      // 1d6: dup_x2
      // 1d7: pop
      // 1d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1db: bipush 0
      // 1dc: swap
      // 1dd: aastore
      // 1de: ldc2_w -4545298696955891382
      // 1e1: lload 6
      // 1e3: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ee: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1f1: goto 1ff
      // 1f4: ldc2_w -2773530283129275803
      // 1f7: lload 6
      // 1f9: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: athrow
      // 1ff: iinc 26 1
      // 202: iload 22
      // 204: ifne 0be
      // 207: lload 6
      // 209: lconst_0
      // 20a: lcmp
      // 20b: ifle 2a4
      // 20e: iload 22
      // 210: lload 6
      // 212: lconst_0
      // 213: lcmp
      // 214: iflt 102
      // 217: ifne 298
      // 21a: aload 0
      // 21b: bipush 0
      // 21c: ldc2_w -2876142569746394429
      // 21f: lload 6
      // 221: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: aload 0
      // 227: goto 235
      // 22a: ldc2_w -2773530283129275803
      // 22d: lload 6
      // 22f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: aload 23
      // 237: ldc2_w -2616954123239166031
      // 23a: lload 6
      // 23c: invokedynamic q (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: aload 8
      // 243: new java/lang/StringBuilder
      // 246: dup
      // 247: invokespecial java/lang/StringBuilder.<init> ()V
      // 24a: sipush 6067
      // 24d: ldc2_w 1294637698845759262
      // 250: lload 6
      // 252: lxor
      // 253: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25b: aload 0
      // 25c: lload 18
      // 25e: invokevirtual com/zelix/k5.f (J)Ljava/lang/String;
      // 261: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 264: sipush 25877
      // 267: ldc2_w 1185709731850692023
      // 26a: lload 6
      // 26c: lxor
      // 26d: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 275: aload 9
      // 277: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27a: sipush 27477
      // 27d: ldc2_w 5083257679763221497
      // 280: lload 6
      // 282: lxor
      // 283: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28b: aload 0
      // 28c: getfield com/zelix/k5.W I
      // 28f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 292: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 295: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 298: aload 24
      // 29a: ldc2_w -4043059008024360241
      // 29d: lload 6
      // 29f: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a4: goto 337
      // 2a7: astore 25
      // 2a9: aload 0
      // 2aa: bipush 0
      // 2ab: ldc2_w -2876142569746394429
      // 2ae: lload 6
      // 2b0: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: aload 0
      // 2b6: aload 23
      // 2b8: ldc2_w -2616954123239166031
      // 2bb: lload 6
      // 2bd: invokedynamic q (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: aload 8
      // 2c4: new java/lang/StringBuilder
      // 2c7: dup
      // 2c8: invokespecial java/lang/StringBuilder.<init> ()V
      // 2cb: sipush 6067
      // 2ce: ldc2_w 1294637698845759262
      // 2d1: lload 6
      // 2d3: lxor
      // 2d4: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dc: aload 0
      // 2dd: lload 18
      // 2df: invokevirtual com/zelix/k5.f (J)Ljava/lang/String;
      // 2e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e5: sipush 25877
      // 2e8: ldc2_w 1185709731850692023
      // 2eb: lload 6
      // 2ed: lxor
      // 2ee: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f6: aload 9
      // 2f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fb: sipush 32192
      // 2fe: ldc2_w 6189110251568840039
      // 301: lload 6
      // 303: lxor
      // 304: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30c: aload 25
      // 30e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 311: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 314: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 317: aload 24
      // 319: ldc2_w -4043059008024360241
      // 31c: lload 6
      // 31e: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: goto 337
      // 326: astore 27
      // 328: aload 24
      // 32a: ldc2_w -4043059008024360241
      // 32d: lload 6
      // 32f: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: aload 27
      // 336: athrow
      // 337: return
   }

   public void z(gu var1, long var2) {
      long var4 = var2 ^ 113240848016893L;
      long var6 = var2 ^ 0L;
      byte var10000 = m44.a<"h">(5618762033536375070L, var2);
      var1.K(this.b, this, var4, this.H());
      boolean var8 = (boolean)var10000;

      label28: {
         try {
            var10000 = m44.a<"v">(this, 5544088189886891558L, var2);
            if (var8) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var10) {
            throw m44.a<"h">(var10, 5577459242913033856L, var2);
         }

         var10000 = 0;
      }

      int var9 = var10000;

      while (var9 < m44.a<"v">(this, 6009713364618816130L, var2).length) {
         m44.a<"w">(m44.a<"v">(this, 6009713364618816130L, var2)[var9], var1, var6, 5759007463919830180L, var2);
         var9++;
         if (var8) {
            break;
         }
      }
   }

   public void f(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 59800871386908L;
      boolean var6 = m44.a<"o">(1609736174550729393L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"q">(this, 1684269418671496585L, var2);
            if (var6) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var8) {
            throw m44.a<"o">(var8, 1641607591221966127L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < m44.a<"q">(this, 633317321873027373L, var2).length) {
         m44.a<"p">(m44.a<"q">(this, 633317321873027373L, var2)[var7], new Object[]{var4}, 1202945322579644177L, var2);
         var7++;
         if (var6) {
            break;
         }
      }
   }

   public void W(Object[] var1) {
      long var6 = (Long)var1[0];
      int var3 = (Integer)var1[1];
      int var5 = (Integer)var1[2];
      HashMap var2 = (HashMap)var1[3];
      HashMap var4 = (HashMap)var1[4];
      long var8 = var6 ^ 30282754797937L;
      boolean var10 = m44.a<"n">(7658353343727016719L, var6);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"p">(this, 8293039031803492800L, var6);
            if (!var10) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var12) {
            throw m44.a<"n">(var12, 8250973279195615590L, var6);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < m44.a<"p">(this, 7818406926218728804L, var6).length) {
         m44.a<"q">(m44.a<"p">(this, 7818406926218728804L, var6)[var11], new Object[]{var2, var8, var4}, 7642945798677133226L, var6);
         var11++;
         if (!var10) {
            break;
         }
      }
   }

   public void z(Object[] var1) {
      Set var2 = (Set)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 33028709459524L;
      boolean var7 = m44.a<"n">(-7259939807516176424L, var3);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"p">(this, -7334437805944123168L, var3);
            if (var7) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var9) {
            throw m44.a<"n">(var9, -7232423831822387130L, var3);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < m44.a<"p">(this, -8817886374936871868L, var3).length) {
         m44.a<"q">(m44.a<"p">(this, -8817886374936871868L, var3)[var8], new Object[]{var2, var5}, -7009903130217171486L, var3);
         var8++;
         if (var7) {
            break;
         }
      }
   }

   public void J(Object[] var1) {
      long var2 = (Long)var1[0];
      _u var6 = (_u)var1[1];
      _6 var7 = (_6)var1[2];
      l6z var5 = (l6z)var1[3];
      lqu var4 = (lqu)var1[4];
      long var8 = var2 ^ 52524380427751L;
      boolean var10 = m44.a<"o">(6212413212200665809L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"q">(this, 6286946463132720617L, var2);
            if (var10) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var12) {
            throw m44.a<"o">(var12, 6244288211242579279L, var2);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < m44.a<"q">(this, 5235994066928054605L, var2).length) {
         m44.a<"p">(m44.a<"q">(this, 5235994066928054605L, var2)[var11], new Object[]{var7, var5, var4, var8}, 6112248090225406784L, var2);
         var11++;
         if (var10) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   int g(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      long var6 = var4 ^ 105521851192230L;
      byte var8 = m44.a<"n">(-22607516224745753L, var4);

      label76: {
         try {
            byte var10000 = m44.a<"p">(this, -1801850721672025048L, var4);
            if (var8 == 0) {
               return var10000;
            }

            if (var10000 != 0) {
               break label76;
            }
         } catch (n9 var16) {
            throw m44.a<"n">(var16, -1771857333989915506L, var4);
         }

         return m44.a<"p">(this, -1925887157155409574L, var4).length;
      }

      int var9 = 2;
      s8[] var10 = m44.a<"p">(this, -474902214094815092L, var4);
      int var11 = var10.length;
      int var12 = 0;

      label47:
      while (var12 < var11) {
         s8 var13 = var10[var12];
         var9 += m44.a<"q">(var13, new Object[]{var6}, -2038153578928318179L, var4);

         try {
            var12++;
         } catch (n9 var15) {
            boolean var10001 = false;
            throw m44.a<"n">(var15, -1771857333989915506L, var4);
         }

         do {
            try {
               if (var3 < 0) {
                  return var8;
               }

               if (var8 == 0) {
                  return var9;
               }

               if (var8 != 0) {
                  continue label47;
               }
            } catch (n9 var14) {
               boolean var19 = false;
               throw m44.a<"n">(var14, -1771857333989915506L, var4);
            }
         } while (var2 <= 0);
         break;
      }

      this.W = var9;
      return var9;
   }

   protected void N(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/lqu
      // 021: astore 6
      // 023: pop
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 93420344099345
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 0
      // 030: lxor
      // 031: lstore 9
      // 033: pop2
      // 034: ldc2_w 1680553024964027930
      // 037: lload 2
      // 038: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 0
      // 03e: aload 4
      // 040: aload 5
      // 042: lload 9
      // 044: aload 6
      // 046: bipush 4
      // 047: anewarray 501
      // 04a: dup_x1
      // 04b: swap
      // 04c: bipush 3
      // 04d: swap
      // 04e: aastore
      // 04f: dup_x2
      // 050: dup_x2
      // 051: pop
      // 052: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 055: bipush 2
      // 056: swap
      // 057: aastore
      // 058: dup_x1
      // 059: swap
      // 05a: bipush 1
      // 05b: swap
      // 05c: aastore
      // 05d: dup_x1
      // 05e: swap
      // 05f: bipush 0
      // 060: swap
      // 061: aastore
      // 062: invokespecial com/zelix/ki.N ([Ljava/lang/Object;)V
      // 065: istore 11
      // 067: aload 0
      // 068: ldc2_w 1009829788873835733
      // 06b: lload 2
      // 06c: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: iload 11
      // 073: ifeq 0a4
      // 076: ifeq 121
      // 079: goto 086
      // 07c: ldc2_w 1122576785348209779
      // 07f: lload 2
      // 080: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: aload 4
      // 088: aload 0
      // 089: ldc2_w 1267172259769804913
      // 08c: lload 2
      // 08d: invokedynamic u (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: arraylength
      // 093: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 096: bipush 0
      // 097: goto 0a4
      // 09a: ldc2_w 1122576785348209779
      // 09d: lload 2
      // 09e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: istore 12
      // 0a6: iload 12
      // 0a8: aload 0
      // 0a9: ldc2_w 1267172259769804913
      // 0ac: lload 2
      // 0ad: invokedynamic u (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: arraylength
      // 0b3: if_icmpge 116
      // 0b6: aload 0
      // 0b7: ldc2_w 1267172259769804913
      // 0ba: lload 2
      // 0bb: invokedynamic u (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: iload 12
      // 0c2: aaload
      // 0c3: aload 4
      // 0c5: aload 5
      // 0c7: lload 7
      // 0c9: aload 6
      // 0cb: bipush 4
      // 0cc: anewarray 501
      // 0cf: dup_x1
      // 0d0: swap
      // 0d1: bipush 3
      // 0d2: swap
      // 0d3: aastore
      // 0d4: dup_x2
      // 0d5: dup_x2
      // 0d6: pop
      // 0d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0da: bipush 2
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x1
      // 0de: swap
      // 0df: bipush 1
      // 0e0: swap
      // 0e1: aastore
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w 1581219630668972309
      // 0ea: lload 2
      // 0eb: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: iinc 12 1
      // 0f3: iload 11
      // 0f5: lload 2
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: iflt 100
      // 0fb: ifeq 13d
      // 0fe: iload 11
      // 100: ifne 0a6
      // 103: lload 2
      // 104: lconst_0
      // 105: lcmp
      // 106: ifle 0f3
      // 109: goto 116
      // 10c: ldc2_w 1122576785348209779
      // 10f: lload 2
      // 110: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: athrow
      // 116: lload 2
      // 117: lconst_0
      // 118: lcmp
      // 119: ifle 130
      // 11c: iload 11
      // 11e: ifne 13d
      // 121: aload 4
      // 123: aload 0
      // 124: ldc2_w 988812052272789927
      // 127: lload 2
      // 128: invokedynamic u (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: invokevirtual java/io/DataOutputStream.write ([B)V
      // 130: goto 13d
      // 133: ldc2_w 1122576785348209779
      // 136: lload 2
      // 137: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: return
   }

   public void s(Object[] var1) {
      Set var6 = (Set)var1[0];
      Set var7 = (Set)var1[1];
      long var4 = (Long)var1[2];
      Set var3 = (Set)var1[3];
      Set var2 = (Set)var1[4];
      long var8 = var4 ^ 84600281795993L;
      boolean var10 = m44.a<"h">(2018094200126205257L, var4);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"v">(this, 382965665269731206L, var4);
            if (!var10) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var12) {
            throw m44.a<"h">(var12, 344246415871682336L, var4);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < m44.a<"v">(this, 1929464361503613730L, var4).length) {
         m44.a<"w">(m44.a<"v">(this, 1929464361503613730L, var4)[var11], new Object[]{var6, var7, var8, var3, var2}, 1839233746996432619L, var4);
         var11++;
         if (!var10) {
            break;
         }
      }
   }

   protected void c(Object[] param1) {
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
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 2
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 0
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 138122824747950
      // 01f: lxor
      // 020: lstore 7
      // 022: pop2
      // 023: ldc2_w 716282175763740856
      // 026: lload 3
      // 027: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: aload 0
      // 02d: lload 5
      // 02f: aload 2
      // 030: bipush 2
      // 031: anewarray 501
      // 034: dup_x1
      // 035: swap
      // 036: bipush 1
      // 037: swap
      // 038: aastore
      // 039: dup_x2
      // 03a: dup_x2
      // 03b: pop
      // 03c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03f: bipush 0
      // 040: swap
      // 041: aastore
      // 042: invokespecial com/zelix/ki.c ([Ljava/lang/Object;)V
      // 045: istore 9
      // 047: aload 0
      // 048: ldc2_w 1198408428474194551
      // 04b: lload 3
      // 04c: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: iload 9
      // 053: ifeq 083
      // 056: ifeq 0f1
      // 059: goto 066
      // 05c: ldc2_w 1240189093990675153
      // 05f: lload 3
      // 060: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: aload 2
      // 067: aload 0
      // 068: ldc2_w 1096589944709314259
      // 06b: lload 3
      // 06c: invokedynamic w (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: arraylength
      // 072: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 075: bipush 0
      // 076: goto 083
      // 079: ldc2_w 1240189093990675153
      // 07c: lload 3
      // 07d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: istore 10
      // 085: iload 10
      // 087: aload 0
      // 088: ldc2_w 1096589944709314259
      // 08b: lload 3
      // 08c: invokedynamic w (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: arraylength
      // 092: if_icmpge 0e6
      // 095: aload 0
      // 096: ldc2_w 1096589944709314259
      // 099: lload 3
      // 09a: invokedynamic w (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: iload 10
      // 0a1: aaload
      // 0a2: aload 2
      // 0a3: lload 7
      // 0a5: bipush 2
      // 0a6: anewarray 501
      // 0a9: dup_x2
      // 0aa: dup_x2
      // 0ab: pop
      // 0ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0af: bipush 1
      // 0b0: swap
      // 0b1: aastore
      // 0b2: dup_x1
      // 0b3: swap
      // 0b4: bipush 0
      // 0b5: swap
      // 0b6: aastore
      // 0b7: ldc2_w 1487391503694097298
      // 0ba: lload 3
      // 0bb: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: iinc 10 1
      // 0c3: iload 9
      // 0c5: lload 3
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: ifle 0d0
      // 0cb: ifeq 10c
      // 0ce: iload 9
      // 0d0: ifne 085
      // 0d3: lload 3
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 0c3
      // 0d9: goto 0e6
      // 0dc: ldc2_w 1240189093990675153
      // 0df: lload 3
      // 0e0: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: lload 3
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: ifle 0ff
      // 0ec: iload 9
      // 0ee: ifne 10c
      // 0f1: aload 2
      // 0f2: aload 0
      // 0f3: ldc2_w 1376640891870979845
      // 0f6: lload 3
      // 0f7: invokedynamic w (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: invokevirtual java/io/DataOutputStream.write ([B)V
      // 0ff: goto 10c
      // 102: ldc2_w 1240189093990675153
      // 105: lload 3
      // 106: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: return
   }

   int E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      return m44.a<"w">(this, -3623229992271858605L, var2).length;
   }

   public boolean l(Object[] param1) {
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
      // 004: checkcast com/zelix/hf
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/lqu
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/io/PrintWriter
      // 021: astore 2
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 138721227050887
      // 028: lxor
      // 029: dup2
      // 02a: bipush 32
      // 02c: lushr
      // 02d: lstore 7
      // 02f: dup2
      // 030: bipush 32
      // 032: lshl
      // 033: bipush 32
      // 035: lushr
      // 036: l2i
      // 037: istore 9
      // 039: pop2
      // 03a: dup2
      // 03b: ldc2_w 131438816045646
      // 03e: lxor
      // 03f: lstore 10
      // 041: dup2
      // 042: ldc2_w 30774151829103
      // 045: lxor
      // 046: lstore 12
      // 048: dup2
      // 049: ldc2_w 99147324161282
      // 04c: lxor
      // 04d: lstore 14
      // 04f: dup2
      // 050: ldc2_w 41473284262212
      // 053: lxor
      // 054: lstore 16
      // 056: dup2
      // 057: ldc2_w 98160926896858
      // 05a: lxor
      // 05b: lstore 18
      // 05d: pop2
      // 05e: ldc2_w 3105723213626104401
      // 061: lload 3
      // 062: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: istore 20
      // 069: aload 0
      // 06a: ldc2_w 3623315272531769502
      // 06d: lload 3
      // 06e: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: iload 20
      // 075: ifeq 302
      // 078: ifeq 301
      // 07b: goto 088
      // 07e: ldc2_w 3737716660332236856
      // 081: lload 3
      // 082: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: bipush 0
      // 089: istore 21
      // 08b: bipush 1
      // 08c: istore 22
      // 08e: new java/util/ArrayList
      // 091: dup
      // 092: invokespecial java/util/ArrayList.<init> ()V
      // 095: astore 23
      // 097: bipush 0
      // 098: istore 24
      // 09a: iload 24
      // 09c: aload 0
      // 09d: ldc2_w 3305323991637480506
      // 0a0: lload 3
      // 0a1: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: arraylength
      // 0a7: if_icmpge 2fe
      // 0aa: aload 0
      // 0ab: ldc2_w 3305323991637480506
      // 0ae: lload 3
      // 0af: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/s8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: iload 24
      // 0b6: aaload
      // 0b7: astore 25
      // 0b9: aload 25
      // 0bb: lload 18
      // 0bd: bipush 1
      // 0be: anewarray 501
      // 0c1: dup_x2
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c7: bipush 0
      // 0c8: swap
      // 0c9: aastore
      // 0ca: ldc2_w 3876096921676360311
      // 0cd: lload 3
      // 0ce: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: astore 26
      // 0d5: aload 5
      // 0d7: lload 12
      // 0d9: aload 26
      // 0db: bipush 2
      // 0dc: anewarray 501
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: bipush 1
      // 0e2: swap
      // 0e3: aastore
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 0
      // 0eb: swap
      // 0ec: aastore
      // 0ed: ldc2_w 3276387524263984760
      // 0f0: lload 3
      // 0f1: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: iload 20
      // 0f8: lload 3
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: iflt 103
      // 0fe: ifeq 300
      // 101: iload 20
      // 103: ifeq 2ae
      // 106: goto 113
      // 109: ldc2_w 3737716660332236856
      // 10c: lload 3
      // 10d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: ifeq 2a0
      // 116: goto 123
      // 119: ldc2_w 3737716660332236856
      // 11c: lload 3
      // 11d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 23
      // 125: aload 25
      // 127: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 12c: pop
      // 12d: bipush 0
      // 12e: istore 22
      // 130: new java/lang/StringBuilder
      // 133: dup
      // 134: invokespecial java/lang/StringBuilder.<init> ()V
      // 137: sipush 27593
      // 13a: ldc2_w 3867620203776622907
      // 13d: lload 3
      // 13e: lxor
      // 13f: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 147: aload 0
      // 148: bipush 0
      // 149: anewarray 501
      // 14c: ldc2_w 3989937957937176752
      // 14f: lload 3
      // 150: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 158: sipush 10028
      // 15b: lload 3
      // 15c: lconst_0
      // 15d: lcmp
      // 15e: ifle 181
      // 161: ldc2_w 2075507166247652824
      // 164: lload 3
      // 165: lxor
      // 166: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: iload 20
      // 16d: ifeq 1a0
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 173: aload 0
      // 174: bipush 0
      // 175: anewarray 501
      // 178: ldc2_w 3049029394425736856
      // 17b: lload 3
      // 17c: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: ifeq 1a3
      // 184: goto 191
      // 187: ldc2_w 3737716660332236856
      // 18a: lload 3
      // 18b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: ldc ""
      // 193: goto 1a0
      // 196: ldc2_w 3737716660332236856
      // 199: lload 3
      // 19a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: athrow
      // 1a0: goto 1de
      // 1a3: new java/lang/StringBuilder
      // 1a6: dup
      // 1a7: invokespecial java/lang/StringBuilder.<init> ()V
      // 1aa: ldc "'"
      // 1ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1af: aload 0
      // 1b0: lload 14
      // 1b2: bipush 1
      // 1b3: anewarray 501
      // 1b6: dup_x2
      // 1b7: dup_x2
      // 1b8: pop
      // 1b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bc: bipush 0
      // 1bd: swap
      // 1be: aastore
      // 1bf: ldc2_w 3860856797382688832
      // 1c2: lload 3
      // 1c3: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cb: sipush 27314
      // 1ce: ldc2_w 7140644482960572491
      // 1d1: lload 3
      // 1d2: lxor
      // 1d3: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1db: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e1: sipush 28773
      // 1e4: ldc2_w 8798762827152808605
      // 1e7: lload 3
      // 1e8: lxor
      // 1e9: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: aload 0
      // 1f2: lload 10
      // 1f4: invokevirtual com/zelix/k5.j (J)Ljava/lang/String;
      // 1f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fa: sipush 29657
      // 1fd: ldc2_w 6596061275058559266
      // 200: lload 3
      // 201: lxor
      // 202: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20a: aload 26
      // 20c: lload 7
      // 20e: iload 9
      // 210: invokevirtual com/zelix/_v.O (JI)Ljava/lang/String;
      // 213: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 216: sipush 17936
      // 219: ldc2_w 55186049251175655
      // 21c: lload 3
      // 21d: lxor
      // 21e: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/k5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 226: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 229: astore 27
      // 22b: iload 20
      // 22d: lload 3
      // 22e: lconst_0
      // 22f: lcmp
      // 230: iflt 297
      // 233: ifeq 295
      // 236: aload 6
      // 238: ldc2_w 2893779901937840739
      // 23b: lload 3
      // 23c: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: ifeq 28f
      // 244: goto 251
      // 247: ldc2_w 3737716660332236856
      // 24a: lload 3
      // 24b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: athrow
      // 251: aload 6
      // 253: lload 16
      // 255: bipush 1
      // 256: anewarray 501
      // 259: dup_x2
      // 25a: dup_x2
      // 25b: pop
      // 25c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25f: bipush 0
      // 260: swap
      // 261: aastore
      // 262: ldc2_w 3096412178331694126
      // 265: lload 3
      // 266: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: new java/lang/StringBuilder
      // 26e: dup
      // 26f: invokespecial java/lang/StringBuilder.<init> ()V
      // 272: ldc "\t"
      // 274: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 277: aload 27
      // 279: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27f: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 282: goto 28f
      // 285: ldc2_w 3737716660332236856
      // 288: lload 3
      // 289: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28e: athrow
      // 28f: aload 2
      // 290: aload 27
      // 292: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 295: iload 20
      // 297: lload 3
      // 298: lconst_0
      // 299: lcmp
      // 29a: iflt 2b2
      // 29d: ifne 2b0
      // 2a0: bipush 1
      // 2a1: goto 2ae
      // 2a4: ldc2_w 3737716660332236856
      // 2a7: lload 3
      // 2a8: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: athrow
      // 2ae: istore 21
      // 2b0: iload 21
      // 2b2: iload 20
      // 2b4: ifeq 2db
      // 2b7: ifeq 2f6
      // 2ba: goto 2c7
      // 2bd: ldc2_w 3737716660332236856
      // 2c0: lload 3
      // 2c1: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: athrow
      // 2c7: aload 23
      // 2c9: invokeinterface java/util/List.size ()I 1
      // 2ce: goto 2db
      // 2d1: ldc2_w 3737716660332236856
      // 2d4: lload 3
      // 2d5: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: athrow
      // 2db: anewarray 151
      // 2de: astore 27
      // 2e0: aload 0
      // 2e1: aload 23
      // 2e3: aload 27
      // 2e5: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 2ea: checkcast [Lcom/zelix/s8;
      // 2ed: ldc2_w 3305323991637480506
      // 2f0: lload 3
      // 2f1: invokedynamic t (Ljava/lang/Object;[Lcom/zelix/s8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: iinc 24 1
      // 2f9: iload 20
      // 2fb: ifne 09a
      // 2fe: iload 22
      // 300: ireturn
      // 301: bipush 0
      // 302: ireturn
   }

   public void K(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 7722732479311L;
      boolean var6 = m44.a<"i">(3278805135175146696L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"w">(this, 3805967349933800967L, var2);
            if (!var6) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var8) {
            throw m44.a<"i">(var8, 3838773698448365217L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < m44.a<"w">(this, 3118680622401966755L, var2).length) {
         m44.a<"v">(m44.a<"w">(this, 3118680622401966755L, var2)[var7], new Object[]{var4}, 3671261988123011746L, var2);
         var7++;
         if (!var6) {
            break;
         }
      }
   }

   public String[] w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 93977361316497L;
      byte var6 = m44.a<"j">(-6589934369084549693L, var2);

      label66: {
         try {
            byte var10000 = m44.a<"t">(this, -4766218671359166708L, var2);
            if (var6 == 0) {
               return new String[var10000];
            }

            if (var10000 != 0) {
               break label66;
            }
         } catch (n9 var10) {
            throw m44.a<"j">(var10, -4878121693876052054L, var2);
         }

         return new String[0];
      }

      String[] var7 = new String[m44.a<"t">(this, -6751817242533602392L, var2).length];
      int var8 = 0;

      while (var8 < m44.a<"t">(this, -6751817242533602392L, var2).length) {
         try {
            int var10001 = var6;
            if (var2 >= 0L) {
               if (var6 == 0) {
                  return var7;
               }

               var10001 = var8;
            }

            var7[var10001] = m44.a<"u">(m44.a<"t">(this, -6751817242533602392L, var2)[var8], new Object[]{var4}, -6790632718901847650L, var2);
            var8++;
            if (var6 != 0) {
               continue;
            }
         } catch (n9 var9) {
            throw m44.a<"j">(var9, -4878121693876052054L, var2);
         }

         if (var2 >= 0L) {
            break;
         }
      }

      return var7;
   }

   static {
      long var0 = c ^ 125187452763124L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = " \u0091âÉ|Ê\u0083\u0086²0\u0003Á\u0000CT0(\u0007\u001a\u0087?n\u008dEtH\u0081\u001e9Ùïw\u001cã\u0017uÀ\u0090ø\u0006\u0010À£\u0018\u009c¹&«S\u0087?'\b\b\u009d Ê )üä\u008eË,\n\u0081\u000bú\"dY\u0006áM©]\u008d\u0002\u001aUl\u008d¡õLöèø7\u0001\u0010ùÇZ\u0004 6\"åfè¹`_üÔú\u0010\u0093\rÙÛYÇkYá\týt~Ø5\u008c\u0010ÉÙ\u0019õ9·J[;_\u0099¼1G\\]\u0010böä®\u000eÊLÛ3¢³ã\u0096ØW\u0013 ¥Í?\u009b\u00adÚ\bO2\u008f_1cA\u0007\u0090\u0087ÜÏ*«O5Ø\u0002*\u0087\u0095Ø_ÏnP eóÆ©\u008dW¢ª\u0091í)ò\u008dÌ\u008fÉãü¼ÈnëÓþû\nð\fT\u0018£\u0000ìÈ½ñRIÖÇÖàÀ8Õ\u009b\u001eÔYA\u001aâ\u0088\u001fmqIËr®\u0006\u0003ZO´I{(©y·Þq©\u009fÒçêû(\rÁúB=\u001bD\r\"\u0018LÑi\u0019\u008fÜ\u001b\u001e!Â\u009c\tT#\u0003û\u001eMKPêNS\u008e\u009dgTß\u001c'\u0010\u000b\u00ad´ |\u0004FU7Þ§¢cÿ\u001b³";
      int var8 = " \u0091âÉ|Ê\u0083\u0086²0\u0003Á\u0000CT0(\u0007\u001a\u0087?n\u008dEtH\u0081\u001e9Ùïw\u001cã\u0017uÀ\u0090ø\u0006\u0010À£\u0018\u009c¹&«S\u0087?'\b\b\u009d Ê )üä\u008eË,\n\u0081\u000bú\"dY\u0006áM©]\u008d\u0002\u001aUl\u008d¡õLöèø7\u0001\u0010ùÇZ\u0004 6\"åfè¹`_üÔú\u0010\u0093\rÙÛYÇkYá\týt~Ø5\u008c\u0010ÉÙ\u0019õ9·J[;_\u0099¼1G\\]\u0010böä®\u000eÊLÛ3¢³ã\u0096ØW\u0013 ¥Í?\u009b\u00adÚ\bO2\u008f_1cA\u0007\u0090\u0087ÜÏ*«O5Ø\u0002*\u0087\u0095Ø_ÏnP eóÆ©\u008dW¢ª\u0091í)ò\u008dÌ\u008fÉãü¼ÈnëÓþû\nð\fT\u0018£\u0000ìÈ½ñRIÖÇÖàÀ8Õ\u009b\u001eÔYA\u001aâ\u0088\u001fmqIËr®\u0006\u0003ZO´I{(©y·Þq©\u009fÒçêû(\rÁúB=\u001bD\r\"\u0018LÑi\u0019\u008fÜ\u001b\u001e!Â\u009c\tT#\u0003û\u001eMKPêNS\u008e\u009dgTß\u001c'\u0010\u000b\u00ad´ |\u0004FU7Þ§¢cÿ\u001b³"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     i = new String[13];
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

                  var6 = "\u0015\u001c\u009bgjÉ\u0090_Íël:~V\u0015ñ\u0010h9ø\u0019\u0004gÃû¥m\u0091\u009e#~Î¶";
                  var8 = "\u0015\u001c\u009bgjÉ\u0090_Íël:~V\u0015ñ\u0010h9ø\u0019\u0004gÃû¥m\u0091\u009e#~Î¶".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4852;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/k5", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("com/zelix/k5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
