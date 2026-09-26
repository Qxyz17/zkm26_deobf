package com.zelix;

import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g1 implements Serializable, Map {
   private List k;
   private Map Q;
   private static final long a = prr.a(-3183997363906920569L, -2853850227343628565L, MethodHandles.lookup().lookupClass()).a(221345524546481L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public synchronized Object put(Object var1, Object var2) {
      long var3 = a ^ 13180026544799L;
      int var5 = (int)((var3 ^ 116015501861064L) >>> 32);
      long var6 = (var3 ^ 116015501861064L) << 32 >>> 32;
      String var10000 = m44.a<"j">(7722614236767024410L, var3);
      Object var9 = null;
      lq0 var10 = (lq0)m44.a<"t">(this, 7654307961249076569L, var3).get(var1);
      String var8 = var10000;

      label41: {
         try {
            if (var8 != null) {
               return var10;
            }

            if (var10 != null) {
               break label41;
            }
         } catch (IllegalArgumentException var13) {
            throw m44.a<"j">(var13, 8199257650217831755L, var3);
         }

         var10 = new lq0(var1, var5, var6, var2);

         try {
            m44.a<"t">(this, 7654307961249076569L, var3).put(var1, var10);
            m44.a<"t">(this, 7581299625385343289L, var3).add(var10);
            if (var8 == null) {
               return var9;
            }
         } catch (IllegalArgumentException var12) {
            boolean var10001 = false;
            throw m44.a<"j">(var12, 8199257650217831755L, var3);
         }
      }

      try {
         var10000 = (String)m44.a<"u">(var10, new Object[]{var2}, 7514212301670185227L, var3);
      } catch (IllegalArgumentException var11) {
         boolean var16 = false;
         throw m44.a<"j">(var11, 8199257650217831755L, var3);
      }

      return var10000;
   }

   @Override
   public synchronized void putAll(Map var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean isEmpty() {
      long var1 = a ^ 45165876639819L;
      return m44.a<"q">(m44.a<"p">(this, -1086015801662206067L, var1), -974345931530480069L, var1);
   }

   public synchronized Enumeration J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 39240723563312L;
      return Collections.enumeration(m44.a<"j">(this, new Object[]{var4}, -3496969412664618317L, var2));
   }

   public g1(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 17162974617574L;
      long var10001 = var2 ^ 82962078838790L;
      int var6 = (int)((var2 ^ 82962078838790L) >>> 32);
      int var7 = (int)((var2 ^ 82962078838790L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      super();
      int var10 = cf.x(var1, var6, (char)var7, (short)var8);
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var10;
      m44.a<"p">(this, m44.a<"l">(var10004, -2655079006353858873L, var2), -2868855459289585841L, var2);
      m44.a<"p">(this, new ArrayList(var1), -2656991331807818961L, var2);
   }

   public synchronized Object R(Object[] param1) {
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
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 3
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 2
      // 020: dup
      // 021: bipush 3
      // 022: aaload
      // 023: checkcast java/lang/Integer
      // 026: invokevirtual java/lang/Integer.intValue ()I
      // 029: istore 7
      // 02b: dup
      // 02c: bipush 4
      // 02d: aaload
      // 02e: checkcast java/lang/Object
      // 031: astore 5
      // 033: dup
      // 034: bipush 5
      // 035: aaload
      // 036: checkcast java/lang/Object
      // 039: astore 6
      // 03b: pop
      // 03c: iload 3
      // 03d: i2l
      // 03e: bipush 48
      // 040: lshl
      // 041: iload 2
      // 042: i2l
      // 043: bipush 32
      // 045: lshl
      // 046: bipush 16
      // 048: lushr
      // 049: lor
      // 04a: iload 7
      // 04c: i2l
      // 04d: bipush 48
      // 04f: lshl
      // 050: bipush 48
      // 052: lushr
      // 053: lor
      // 054: getstatic com/zelix/g1.a J
      // 057: lxor
      // 058: lstore 8
      // 05a: lload 8
      // 05c: dup2
      // 05d: ldc2_w 84797381612561
      // 060: lxor
      // 061: dup2
      // 062: bipush 32
      // 064: lushr
      // 065: l2i
      // 066: istore 10
      // 068: dup2
      // 069: bipush 32
      // 06b: lshl
      // 06c: bipush 32
      // 06e: lushr
      // 06f: lstore 11
      // 071: pop2
      // 072: pop2
      // 073: ldc2_w -6920598692494409277
      // 076: lload 8
      // 078: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: astore 13
      // 07f: iload 4
      // 081: aload 13
      // 083: ifnonnull 099
      // 086: iflt 0c4
      // 089: goto 097
      // 08c: ldc2_w -8858375989212038766
      // 08f: lload 8
      // 091: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: athrow
      // 097: iload 4
      // 099: aload 13
      // 09b: iload 7
      // 09d: iflt 134
      // 0a0: ifnonnull 12d
      // 0a3: aload 0
      // 0a4: ldc2_w -7066416873135616544
      // 0a7: lload 8
      // 0a9: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: invokeinterface java/util/List.size ()I 1
      // 0b3: if_icmplt 11b
      // 0b6: goto 0c4
      // 0b9: ldc2_w -8858375989212038766
      // 0bc: lload 8
      // 0be: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: athrow
      // 0c4: new java/lang/IllegalArgumentException
      // 0c7: dup
      // 0c8: new java/lang/StringBuilder
      // 0cb: dup
      // 0cc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0cf: sipush 25888
      // 0d2: ldc2_w 3149018305710351953
      // 0d5: lload 8
      // 0d7: lxor
      // 0d8: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/g1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: iload 4
      // 0e2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e5: sipush 21015
      // 0e8: ldc2_w 8460751108544024935
      // 0eb: lload 8
      // 0ed: lxor
      // 0ee: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/g1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f6: aload 0
      // 0f7: ldc2_w -7066416873135616544
      // 0fa: lload 8
      // 0fc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: invokeinterface java/util/List.size ()I 1
      // 106: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 109: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 10f: athrow
      // 110: ldc2_w -8858375989212038766
      // 113: lload 8
      // 115: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 0
      // 11c: ldc2_w -6998395815211572864
      // 11f: lload 8
      // 121: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: aload 5
      // 128: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 12d: iload 7
      // 12f: iflt 193
      // 132: aload 13
      // 134: ifnonnull 193
      // 137: ifeq 1ea
      // 13a: goto 148
      // 13d: ldc2_w -8858375989212038766
      // 140: lload 8
      // 142: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: athrow
      // 148: aload 0
      // 149: ldc2_w -6998395815211572864
      // 14c: lload 8
      // 14e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: aload 5
      // 155: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 15a: checkcast com/zelix/lq0
      // 15d: aload 13
      // 15f: ifnonnull 1bc
      // 162: goto 170
      // 165: ldc2_w -8858375989212038766
      // 168: lload 8
      // 16a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: athrow
      // 170: aload 0
      // 171: ldc2_w -7066416873135616544
      // 174: lload 8
      // 176: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: iload 4
      // 17d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 182: invokevirtual com/zelix/lq0.equals (Ljava/lang/Object;)Z
      // 185: goto 193
      // 188: ldc2_w -8858375989212038766
      // 18b: lload 8
      // 18d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: athrow
      // 193: ifeq 1bd
      // 196: aload 0
      // 197: ldc2_w -7066416873135616544
      // 19a: lload 8
      // 19c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: iload 4
      // 1a3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1a8: checkcast com/zelix/lq0
      // 1ab: invokevirtual com/zelix/lq0.D ()Ljava/lang/Object;
      // 1ae: goto 1bc
      // 1b1: ldc2_w -8858375989212038766
      // 1b4: lload 8
      // 1b6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: athrow
      // 1bc: areturn
      // 1bd: new java/lang/IllegalArgumentException
      // 1c0: dup
      // 1c1: new java/lang/StringBuilder
      // 1c4: dup
      // 1c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c8: ldc "'"
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cd: aload 5
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1d2: sipush 10194
      // 1d5: ldc2_w 3995809977050932385
      // 1d8: lload 8
      // 1da: lxor
      // 1db: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/g1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e6: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 1e9: athrow
      // 1ea: new com/zelix/lq0
      // 1ed: dup
      // 1ee: aload 5
      // 1f0: iload 10
      // 1f2: lload 11
      // 1f4: aload 6
      // 1f6: invokespecial com/zelix/lq0.<init> (Ljava/lang/Object;IJLjava/lang/Object;)V
      // 1f9: astore 14
      // 1fb: aload 0
      // 1fc: ldc2_w -7066416873135616544
      // 1ff: lload 8
      // 201: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: iload 4
      // 208: aload 14
      // 20a: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 20f: checkcast com/zelix/lq0
      // 212: astore 15
      // 214: aload 0
      // 215: ldc2_w -6998395815211572864
      // 218: lload 8
      // 21a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: aload 15
      // 221: invokevirtual com/zelix/lq0.S ()Ljava/lang/Object;
      // 224: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 229: checkcast com/zelix/lq0
      // 22c: astore 16
      // 22e: aload 0
      // 22f: ldc2_w -6998395815211572864
      // 232: lload 8
      // 234: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: aload 5
      // 23b: aload 14
      // 23d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 242: pop
      // 243: aload 16
      // 245: invokevirtual com/zelix/lq0.D ()Ljava/lang/Object;
      // 248: areturn
   }

   private List s(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var5 = m44.a<"r">(this, 698115005809580479L, var2).size();
      ArrayList var6 = new ArrayList();
      String var10000 = m44.a<"l">(840520060901266844L, var2);
      int var7 = 0;
      String var4 = var10000;

      label34:
      while (var7 < var5) {
         lq0 var8 = (lq0)m44.a<"r">(this, 698115005809580479L, var2).get(var7);

         do {
            try {
               Object var10001 = var4;
               if (var2 > 0L) {
                  if (var4 != null) {
                     return var6;
                  }

                  var10001 = var8.D();
               }

               var6.add(var10001);
               var7++;
               if (var4 == null) {
                  continue label34;
               }
            } catch (IllegalArgumentException var9) {
               throw m44.a<"l">(var9, 1247357826165124557L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var6;
   }

   @Override
   public synchronized boolean containsKey(Object var1) {
      long var2 = a ^ 113963093773718L;
      return m44.a<"u">(this, 4985762774841178704L, var2).containsKey(var1);
   }

   @Override
   public synchronized void clear() {
      long var1 = a ^ 56547237392674L;
      m44.a<"q">(this, -467063640097192220L, var1).clear();
      m44.a<"q">(this, -393194949394912636L, var1).clear();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public synchronized Object k(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      String var5 = m44.a<"j">(2108859868789474162L, var2);

      label41: {
         label33: {
            int var10000;
            label32: {
               try {
                  var10000 = var4;
                  if (var5 != null) {
                     break label32;
                  }

                  if (var4 < 0) {
                     break label33;
                  }
               } catch (IllegalArgumentException var9) {
                  throw m44.a<"j">(var9, 549875935008668451L, var2);
               }

               var10000 = var4;
            }

            try {
               if (var10000 < m44.a<"t">(this, 2260313934814531409L, var2).size()) {
                  break label41;
               }
            } catch (IllegalArgumentException var8) {
               boolean var10001 = false;
               throw m44.a<"j">(var8, 549875935008668451L, var2);
            }
         }

         try {
            throw new IllegalArgumentException(
               a<"m">(5350, 5060658838771569957L ^ var2)
                  + var4
                  + a<"m">(2635, 9147337222215437197L ^ var2)
                  + m44.a<"t">(this, 2260313934814531409L, var2).size()
            );
         } catch (IllegalArgumentException var7) {
            boolean var12 = false;
            throw m44.a<"j">(var7, 549875935008668451L, var2);
         }
      }

      lq0 var6 = (lq0)m44.a<"t">(this, 2260313934814531409L, var2).get(var4);
      return var6.S();
   }

   @Override
   public int size() {
      long var1 = a ^ 113496296503450L;
      return m44.a<"q">(this, 3689366265916711740L, var1).size();
   }

   public g1(short var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 130875601193583L;
      super();
      m44.a<"v">(this, m44.a<"j">(new Object[]{var6}, -1293673406410355991L, var4), -1262776878786178791L, var4);
      m44.a<"v">(this, new ArrayList(), -1335871167155094151L, var4);
   }

   @Override
   public synchronized Set entrySet() {
      long var1 = a ^ 55540264104776L;
      long var3 = var1 ^ 35964698184898L;
      long var10001 = var1 ^ 6175159741235L;
      int var5 = (int)((var1 ^ 6175159741235L) >>> 32);
      int var6 = (int)((var1 ^ 6175159741235L) << 32 >>> 40);
      int var7 = (int)(var10001 << 56 >>> 56);
      long var8 = var1 ^ 38120368555709L;
      ArrayList var12 = new ArrayList();
      String var10000 = m44.a<"m">(-361689003006237491L, var1);
      Iterator var13 = m44.a<"s">(this, -513103970430899986L, var1).iterator();
      String var11 = var10000;

      while (var13.hasNext()) {
         lq0 var14 = (lq0)var13.next();
         var12.add(new lol(var3, var14));
         if (var11 != null) {
            break;
         }
      }

      gv var10 = new gv(var12, var8);
      return new gk(var5, var10, var6, (byte)var7);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public synchronized Object j(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      String var5 = m44.a<"k">(-1205517596938735245L, var2);

      label41: {
         label33: {
            int var10000;
            label32: {
               try {
                  var10000 = var4;
                  if (var5 != null) {
                     break label32;
                  }

                  if (var4 < 0) {
                     break label33;
                  }
               } catch (IllegalArgumentException var10) {
                  throw m44.a<"k">(var10, -747450209104574174L, var2);
               }

               var10000 = var4;
            }

            try {
               if (var10000 < m44.a<"u">(this, -1342293359632204464L, var2).size()) {
                  break label41;
               }
            } catch (IllegalArgumentException var9) {
               boolean var10001 = false;
               throw m44.a<"k">(var9, -747450209104574174L, var2);
            }
         }

         try {
            throw new IllegalArgumentException(
               a<"m">(25888, 3149057862311614177L ^ var2)
                  + var4
                  + a<"m">(21015, 8460746684747424215L ^ var2)
                  + m44.a<"u">(this, -1342293359632204464L, var2).size()
            );
         } catch (IllegalArgumentException var8) {
            boolean var13 = false;
            throw m44.a<"k">(var8, -747450209104574174L, var2);
         }
      }

      lq0 var6 = (lq0)m44.a<"u">(this, -1342293359632204464L, var2).remove(var4);
      lq0 var7 = (lq0)m44.a<"u">(this, -1274369075877342928L, var2).remove(var6.S());
      return var7.D();
   }

   private List V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      String var10000 = m44.a<"i">(-3512956619108724471L, var2);
      int var5 = m44.a<"w">(this, -3664403983875662550L, var2).size();
      ArrayList var6 = new ArrayList();
      int var7 = 0;
      String var4 = var10000;

      label34:
      while (var7 < var5) {
         lq0 var8 = (lq0)m44.a<"w">(this, -3664403983875662550L, var2).get(var7);

         do {
            try {
               Object var10001 = var4;
               if (var2 >= 0L) {
                  if (var4 != null) {
                     return var6;
                  }

                  var10001 = var8.S();
               }

               var6.add(var10001);
               var7++;
               if (var4 == null) {
                  continue label34;
               }
            } catch (IllegalArgumentException var9) {
               throw m44.a<"i">(var9, -3036876067557676712L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var6;
   }

   @Override
   public synchronized Object clone() {
      long var1 = a ^ 47086785550705L;
      int var3 = (int)((var1 ^ 27475605264500L) >>> 56);
      long var4 = (var1 ^ 27475605264500L) << 8 >>> 8;
      return new g1((byte)var3, var4, this);
   }

   @Override
   public synchronized boolean containsValue(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/g1.a J
      // 03: ldc2_w 51687659885089
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -2625008945461672540
      // 0b: lload 2
      // 0c: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aload 0
      // 12: ldc2_w -2771953298638206585
      // 15: lload 2
      // 16: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: invokeinterface java/util/List.size ()I 1
      // 20: istore 5
      // 22: astore 4
      // 24: bipush 0
      // 25: istore 6
      // 27: iload 6
      // 29: iload 5
      // 2b: if_icmpge 88
      // 2e: aload 0
      // 2f: ldc2_w -2771953298638206585
      // 32: lload 2
      // 33: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: iload 6
      // 3a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3f: checkcast com/zelix/lq0
      // 42: astore 7
      // 44: aload 4
      // 46: ifnonnull 83
      // 49: aload 7
      // 4b: invokevirtual com/zelix/lq0.D ()Ljava/lang/Object;
      // 4e: aload 1
      // 4f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 52: aload 4
      // 54: ifnonnull 89
      // 57: goto 64
      // 5a: ldc2_w -4505928827302248971
      // 5d: lload 2
      // 5e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: ifeq 80
      // 67: goto 74
      // 6a: ldc2_w -4505928827302248971
      // 6d: lload 2
      // 6e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: bipush 1
      // 75: ireturn
      // 76: ldc2_w -4505928827302248971
      // 79: lload 2
      // 7a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: iinc 6 1
      // 83: aload 4
      // 85: ifnull 27
      // 88: bipush 0
      // 89: ireturn
   }

   @Override
   public synchronized Collection values() {
      long var1 = a ^ 80892435809701L;
      long var3 = var1 ^ 82991826976846L;
      return m44.a<"i">(this, new Object[]{var3}, 6051113168937135724L, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public g1(byte var1, long var2, g1 var4) {
      long var5 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
      int var7 = (int)((var5 ^ 76370720834720L) >>> 32);
      long var8 = (var5 ^ 76370720834720L) << 32 >>> 32;
      long var10 = var5 ^ 121440920998284L;
      String var10000 = m44.a<"j">(5711708154215420274L, var5);
      this(var4.size(), var10);
      g1 var13 = var4;
      synchronized (var4){} // $VF: monitorenter 
      String var12 = var10000;

      try {
         int var14 = m44.a<"u">(var4, 5890258965533868510L, var5);
         int var15 = 0;

         label82:
         while (var15 < var14) {
            lq0 var16 = (lq0)m44.a<"t">(var4, 5574896829093125457L, var5).get(var15);
            Object var17 = var16.S();
            Object var18 = var16.D();
            lq0 var19 = new lq0(var17, var7, var8, var18);

            try {
               m44.a<"t">(this, 5643499065222836529L, var5).put(var17, var19);
               m44.a<"t">(this, 5574896829093125457L, var5).add(var19);
               var15++;
            } catch (IllegalArgumentException var25) {
               boolean var10001 = false;
               throw m44.a<"j">(var25, 6170408207921080611L, var5);
            }

            while (true) {
               try {
                  var10000 = var12;
                  if (var2 > 0L) {
                     if (var12 != null) {
                        return;
                     }

                     var10000 = var12;
                  }

                  if (var10000 == null) {
                     break;
                  }
               } catch (IllegalArgumentException var24) {
                  boolean var29 = false;
                  throw m44.a<"j">(var24, 6170408207921080611L, var5);
               }

               if (var1 >= 0) {
                  break label82;
               }
            }
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   @Override
   public synchronized Object remove(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/g1.a J
      // 03: ldc2_w 118455147459479
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -422110227027991534
      // 0b: lload 2
      // 0c: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aconst_null
      // 12: astore 5
      // 14: astore 4
      // 16: aload 0
      // 17: ldc2_w -346230928281795503
      // 1a: lload 2
      // 1b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: aload 1
      // 21: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 26: checkcast com/zelix/lq0
      // 29: astore 6
      // 2b: aload 6
      // 2d: ifnull d1
      // 30: aload 0
      // 31: ldc2_w -558921820484032463
      // 34: lload 2
      // 35: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: invokeinterface java/util/List.size ()I 1
      // 3f: istore 7
      // 41: bipush 0
      // 42: istore 8
      // 44: iload 8
      // 46: iload 7
      // 48: if_icmpge ca
      // 4b: aload 0
      // 4c: ldc2_w -558921820484032463
      // 4f: lload 2
      // 50: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: iload 8
      // 57: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5c: checkcast com/zelix/lq0
      // 5f: astore 9
      // 61: aload 4
      // 63: ifnonnull c5
      // 66: aload 9
      // 68: invokevirtual com/zelix/lq0.S ()Ljava/lang/Object;
      // 6b: aload 4
      // 6d: ifnonnull cf
      // 70: goto 7d
      // 73: ldc2_w -2251240010247054269
      // 76: lload 2
      // 77: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: aload 1
      // 7e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 81: ifeq b5
      // 84: goto 91
      // 87: ldc2_w -2251240010247054269
      // 8a: lload 2
      // 8b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: aload 0
      // 92: ldc2_w -558921820484032463
      // 95: lload 2
      // 96: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: iload 8
      // 9d: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // a2: pop
      // a3: aload 4
      // a5: ifnull ca
      // a8: goto b5
      // ab: ldc2_w -2251240010247054269
      // ae: lload 2
      // af: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: iinc 8 1
      // b8: goto c5
      // bb: ldc2_w -2251240010247054269
      // be: lload 2
      // bf: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: athrow
      // c5: aload 4
      // c7: ifnull 44
      // ca: aload 6
      // cc: invokevirtual com/zelix/lq0.D ()Ljava/lang/Object;
      // cf: astore 5
      // d1: aload 5
      // d3: areturn
   }

   public int q(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/g1.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w -8540401843314452660
      // 1c: lload 3
      // 1d: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 5
      // 24: aload 0
      // 25: ldc2_w -8615445495243081969
      // 28: lload 3
      // 29: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: aload 2
      // 2f: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 34: aload 5
      // 36: ifnonnull c6
      // 39: ifeq c5
      // 3c: goto 49
      // 3f: ldc2_w -7809307610693587171
      // 42: lload 3
      // 43: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: ldc2_w -8403586435661374609
      // 4d: lload 3
      // 4e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: invokeinterface java/util/List.size ()I 1
      // 58: istore 6
      // 5a: bipush 0
      // 5b: istore 7
      // 5d: iload 7
      // 5f: iload 6
      // 61: if_icmpge c5
      // 64: aload 0
      // 65: ldc2_w -8403586435661374609
      // 68: lload 3
      // 69: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: iload 7
      // 70: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 75: checkcast com/zelix/lq0
      // 78: astore 8
      // 7a: aload 5
      // 7c: lload 3
      // 7d: lconst_0
      // 7e: lcmp
      // 7f: iflt c2
      // 82: ifnonnull c0
      // 85: aload 8
      // 87: invokevirtual com/zelix/lq0.S ()Ljava/lang/Object;
      // 8a: aload 2
      // 8b: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 8e: aload 5
      // 90: ifnonnull c6
      // 93: goto a0
      // 96: ldc2_w -7809307610693587171
      // 99: lload 3
      // 9a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: athrow
      // a0: ifeq bd
      // a3: goto b0
      // a6: ldc2_w -7809307610693587171
      // a9: lload 3
      // aa: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: athrow
      // b0: iload 7
      // b2: ireturn
      // b3: ldc2_w -7809307610693587171
      // b6: lload 3
      // b7: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: athrow
      // bd: iinc 7 1
      // c0: aload 5
      // c2: ifnull 5d
      // c5: bipush -1
      // c6: ireturn
   }

   @Override
   public synchronized Set keySet() {
      long var1 = a ^ 62723356979211L;
      return m44.a<"n">(m44.a<"p">(this, -527586919113586739L, var1).keySet(), -253007299567178159L, var1);
   }

   @Override
   public synchronized Object get(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/g1.a J
      // 03: ldc2_w 112090756827249
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -4484931337527107596
      // 0b: lload 2
      // 0c: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aload 0
      // 12: ldc2_w -4550889039292481609
      // 15: lload 2
      // 16: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aload 1
      // 1c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 21: checkcast com/zelix/lq0
      // 24: astore 5
      // 26: astore 4
      // 28: aload 5
      // 2a: aload 4
      // 2c: ifnonnull 50
      // 2f: ifnonnull 4b
      // 32: goto 3f
      // 35: ldc2_w -2654885815761377371
      // 38: lload 2
      // 39: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aconst_null
      // 40: areturn
      // 41: ldc2_w -2654885815761377371
      // 44: lload 2
      // 45: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 5
      // 4d: invokevirtual com/zelix/lq0.D ()Ljava/lang/Object;
      // 50: areturn
   }

   static {
      long var0 = a ^ 9512575976081L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "òb*E·Ùñô\u00193F0á Ç¦ÑC\u0082\u0098Úª\u008fp½\n\u0013d©½Â¯ãÀ^\u001d\u007f]-ï\u0010Õð\u0099`\u009c[i±1\u0095\u009bý,è\u0093\u0014\u0010\u0097\u008cW\u009c¥êÐÙë\u0092\u0084-5ºVÕ";
      int var8 = "òb*E·Ùñô\u00193F0á Ç¦ÑC\u0082\u0098Úª\u008fp½\n\u0013d©½Â¯ãÀ^\u001d\u007f]-ï\u0010Õð\u0099`\u009c[i±1\u0095\u009bý,è\u0093\u0014\u0010\u0097\u008cW\u009c¥êÐÙë\u0092\u0084-5ºVÕ"
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
                     b = var9;
                     c = new String[5];
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

                  var6 = "\u0012\u0098¢ßÅÏ\u0010-Ú:¼üJæ\u0012Ä\u008e¼¡£\u001cæ\u0081H\u0011qçS¯\u00adSí§oã¥\u0099Å$C(OTo,\u008es,®\u0084MPê®,\u0002î÷Ó\u007fZ2ëÛpÿeµ`\\\u0004¦É¡´\bÕ\u008eòQ¹";
                  var8 = "\u0012\u0098¢ßÅÏ\u0010-Ú:¼üJæ\u0012Ä\u008e¼¡£\u001cæ\u0081H\u0011qçS¯\u00adSí§oã¥\u0099Å$C(OTo,\u008es,®\u0084MPê®,\u0002î÷Ó\u007fZ2ëÛpÿeµ`\\\u0004¦É¡´\bÕ\u008eòQ¹"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4807;
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
            throw new RuntimeException("com/zelix/g1", var10);
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
         throw new RuntimeException("com/zelix/g1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
