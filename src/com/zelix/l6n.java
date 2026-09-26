package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
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

public class l6n implements ai {
   private List i;
   private ol B;
   private sh L;
   private ol F;
   private lqu O;
   private static final long a = prr.a(562090608997077924L, 2334324880217109048L, MethodHandles.lookup().lookupClass()).a(267420210222168L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public final boolean v(Object[] var1) {
      long var4 = (Long)var1[0];
      String var3 = (String)var1[1];
      String var6 = (String)var1[2];
      lyt var2 = (lyt)var1[3];
      long var7 = var4 ^ 0L;
      return m44.a<"p">(m44.a<"q">(this, -2670712759473924849L, var4), new Object[]{var7, var3, var6, var2}, -4409807138191073663L, var4);
   }

   public final boolean R(Object[] var1) {
      String var4 = (String)var1[0];
      String var5 = (String)var1[1];
      long var2 = (Long)var1[2];
      lyt var6 = (lyt)var1[3];
      long var7 = var2 ^ 0L;
      return m44.a<"s">(m44.a<"r">(this, -2633311303215278956L, var2), new Object[]{var4, var5, var7, var6}, -2872742164421866511L, var2);
   }

   public Set I(int var1, String var2, Integer var3, boolean var4, long var5) {
      long var7 = (long)var1 << 32 | var5 << 32 >>> 32;
      int var9 = (int)((var7 ^ 0L) >>> 32);
      long var10 = (var7 ^ 0L) << 32 >>> 32;
      return m44.a<"u">(this, -5049759818786638325L, var7).I(var9, var2, var3, var4, var10);
   }

   public final boolean J(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return m44.a<"t">(m44.a<"u">(this, 1548098127159548571L, var2), new Object[]{var4}, 1202966579629165281L, var2);
   }

   public final boolean G(Object[] var1) {
      long var2 = (Long)var1[0];
      loe var4 = (loe)var1[1];
      long var5 = var2 ^ 0L;
      return m44.a<"w">(m44.a<"v">(this, 990985863802831392L, var2), new Object[]{var5, var4}, 927881635674657621L, var2);
   }

   public final boolean y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return m44.a<"v">(m44.a<"w">(this, 5310198668786239057L, var2), new Object[]{var4}, 5642954935516076992L, var2);
   }

   public l6n(sh param1, long param2, List param4, lqu param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/l6n.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 10011127115417
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 116532781474688
      // 012: lxor
      // 013: lstore 8
      // 015: dup2
      // 016: ldc2_w 123650322923872
      // 019: lxor
      // 01a: dup2
      // 01b: bipush 32
      // 01d: lushr
      // 01e: l2i
      // 01f: istore 10
      // 021: dup2
      // 022: bipush 32
      // 024: lshl
      // 025: bipush 48
      // 027: lushr
      // 028: l2i
      // 029: istore 11
      // 02b: dup2
      // 02c: bipush 48
      // 02e: lshl
      // 02f: bipush 48
      // 031: lushr
      // 032: l2i
      // 033: istore 12
      // 035: pop2
      // 036: dup2
      // 037: ldc2_w 38009452539367
      // 03a: lxor
      // 03b: lstore 13
      // 03d: pop2
      // 03e: aload 0
      // 03f: invokespecial java/lang/Object.<init> ()V
      // 042: aload 0
      // 043: new com/zelix/ol
      // 046: dup
      // 047: iload 10
      // 049: iload 11
      // 04b: i2s
      // 04c: iload 12
      // 04e: i2s
      // 04f: invokespecial com/zelix/ol.<init> (ISS)V
      // 052: ldc2_w 2211173204949292373
      // 055: lload 2
      // 056: invokedynamic r (Ljava/lang/Object;Lcom/zelix/ol;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: ldc2_w 2253843228058418955
      // 05e: lload 2
      // 05f: invokedynamic n (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: aload 0
      // 065: new com/zelix/ol
      // 068: dup
      // 069: iload 10
      // 06b: iload 11
      // 06d: i2s
      // 06e: iload 12
      // 070: i2s
      // 071: invokespecial com/zelix/ol.<init> (ISS)V
      // 074: ldc2_w 1924344411826257724
      // 077: lload 2
      // 078: invokedynamic r (Ljava/lang/Object;Lcom/zelix/ol;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: aload 0
      // 07e: aload 1
      // 07f: ldc2_w 1893466280508904870
      // 082: lload 2
      // 083: invokedynamic r (Ljava/lang/Object;Lcom/zelix/sh;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: aload 0
      // 089: aload 4
      // 08b: ldc2_w 1997653380185641951
      // 08e: lload 2
      // 08f: invokedynamic r (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: aload 0
      // 095: aload 5
      // 097: ldc2_w 2102249994101593345
      // 09a: lload 2
      // 09b: invokedynamic r (Ljava/lang/Object;Lcom/zelix/lqu;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: astore 15
      // 0a2: aload 15
      // 0a4: ifnonnull 0f6
      // 0a7: aload 1
      // 0a8: lload 6
      // 0aa: bipush 1
      // 0ab: anewarray 241
      // 0ae: dup_x2
      // 0af: dup_x2
      // 0b0: pop
      // 0b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b4: bipush 0
      // 0b5: swap
      // 0b6: aastore
      // 0b7: ldc2_w 1903775160628571161
      // 0ba: lload 2
      // 0bb: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: ifeq 10f
      // 0c3: goto 0d0
      // 0c6: ldc2_w 1737805019017417138
      // 0c9: lload 2
      // 0ca: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: lload 8
      // 0d3: bipush 1
      // 0d4: anewarray 241
      // 0d7: dup_x2
      // 0d8: dup_x2
      // 0d9: pop
      // 0da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dd: bipush 0
      // 0de: swap
      // 0df: aastore
      // 0e0: ldc2_w 1815187165906749264
      // 0e3: lload 2
      // 0e4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: goto 0f6
      // 0ec: ldc2_w 1737805019017417138
      // 0ef: lload 2
      // 0f0: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: lload 13
      // 0f9: bipush 1
      // 0fa: anewarray 241
      // 0fd: dup_x2
      // 0fe: dup_x2
      // 0ff: pop
      // 100: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 103: bipush 0
      // 104: swap
      // 105: aastore
      // 106: ldc2_w 25493430304607978
      // 109: lload 2
      // 10a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: return
   }

   public final boolean Z(Object[] var1) {
      String var5 = (String)var1[0];
      String var4 = (String)var1[1];
      long var2 = (Long)var1[2];
      long var6 = var2 ^ 0L;
      return m44.a<"u">(m44.a<"t">(this, 4745355506286890554L, var2), new Object[]{var5, var4, var6}, 4982584624270769586L, var2);
   }

   public String E(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 0L;
      return m44.a<"p">(m44.a<"q">(this, 975012964380951143L, var2), new Object[]{var5, var4}, 1362443035715971078L, var2);
   }

   private final void F(Object[] param1) {
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
      // 00c: getstatic com/zelix/l6n.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 81026575746181
      // 017: lxor
      // 018: dup2
      // 019: bipush 48
      // 01b: lushr
      // 01c: l2i
      // 01d: istore 4
      // 01f: dup2
      // 020: bipush 16
      // 022: lshl
      // 023: bipush 48
      // 025: lushr
      // 026: l2i
      // 027: istore 5
      // 029: dup2
      // 02a: bipush 32
      // 02c: lshl
      // 02d: bipush 32
      // 02f: lushr
      // 030: l2i
      // 031: istore 6
      // 033: pop2
      // 034: dup2
      // 035: ldc2_w 133801512362833
      // 038: lxor
      // 039: lstore 7
      // 03b: pop2
      // 03c: bipush 0
      // 03d: istore 10
      // 03f: ldc2_w -1847851634943490537
      // 042: lload 2
      // 043: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: aload 0
      // 049: ldc2_w -2115203183829308733
      // 04c: lload 2
      // 04d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: invokeinterface java/util/List.size ()I 1
      // 057: istore 11
      // 059: astore 9
      // 05b: bipush 0
      // 05c: istore 12
      // 05e: iload 12
      // 060: iload 11
      // 062: if_icmpge 14a
      // 065: aload 0
      // 066: ldc2_w -2115203183829308733
      // 069: lload 2
      // 06a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: iload 12
      // 071: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 076: checkcast com/zelix/lpg
      // 079: astore 13
      // 07b: aload 13
      // 07d: lload 7
      // 07f: bipush 1
      // 080: anewarray 241
      // 083: dup_x2
      // 084: dup_x2
      // 085: pop
      // 086: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: ldc2_w -518412775915808505
      // 08f: lload 2
      // 090: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: astore 14
      // 097: bipush 0
      // 098: istore 15
      // 09a: iload 15
      // 09c: aload 14
      // 09e: invokevirtual java/util/ArrayList.size ()I
      // 0a1: if_icmpge 13c
      // 0a4: new java/lang/StringBuilder
      // 0a7: dup
      // 0a8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ab: sipush 11606
      // 0ae: ldc2_w 688337338769425309
      // 0b1: lload 2
      // 0b2: lxor
      // 0b3: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/l6n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: iload 10
      // 0bd: iinc 10 1
      // 0c0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c6: astore 16
      // 0c8: aload 14
      // 0ca: iload 15
      // 0cc: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0cf: checkcast java/util/ArrayList
      // 0d2: astore 17
      // 0d4: bipush 0
      // 0d5: aload 9
      // 0d7: ifnonnull 060
      // 0da: istore 18
      // 0dc: iload 18
      // 0de: aload 17
      // 0e0: invokevirtual java/util/ArrayList.size ()I
      // 0e3: if_icmpge 134
      // 0e6: aload 17
      // 0e8: iload 18
      // 0ea: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0ed: checkcast com/zelix/ltv
      // 0f0: astore 19
      // 0f2: aload 0
      // 0f3: ldc2_w -1750786915644494775
      // 0f6: lload 2
      // 0f7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/ol; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: iload 4
      // 0fe: i2s
      // 0ff: iload 5
      // 101: i2c
      // 102: aload 16
      // 104: iload 6
      // 106: aload 19
      // 108: aload 19
      // 10a: invokevirtual com/zelix/ol.h (SCLjava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 10d: pop
      // 10e: iinc 18 1
      // 111: aload 9
      // 113: lload 2
      // 114: lconst_0
      // 115: lcmp
      // 116: iflt 139
      // 119: ifnonnull 137
      // 11c: aload 9
      // 11e: ifnull 0dc
      // 121: lload 2
      // 122: lconst_0
      // 123: lcmp
      // 124: ifle 111
      // 127: goto 134
      // 12a: ldc2_w -2233307445157271378
      // 12d: lload 2
      // 12e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: iinc 15 1
      // 137: aload 9
      // 139: ifnull 09a
      // 13c: iinc 12 1
      // 13f: aload 9
      // 141: lload 2
      // 142: lconst_0
      // 143: lcmp
      // 144: iflt 076
      // 147: ifnull 05e
      // 14a: lload 2
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: iflt 065
      // 150: return
   }

   public final boolean O(long var1, String var3, String var4) {
      long var5 = var1 ^ 0L;
      return m44.a<"r">(m44.a<"s">(this, -7138872382974110963L, var1), var5, var3, var4, -8721257326477019735L, var1);
   }

   public final boolean j(String var1, long var2, String var4) {
      long var5 = var2 ^ 0L;
      return m44.a<"u">(m44.a<"t">(this, 6776421293121049066L, var2), var1, var5, var4, 5000789231140913199L, var2);
   }

   public final boolean K(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      String var5 = (String)var1[2];
      long var6 = var3 ^ 0L;
      return m44.a<"v">(m44.a<"w">(this, -792167451073496351L, var3), new Object[]{var6, var2, var5}, -1170359217708483389L, var3);
   }

   public final boolean b(Object[] var1) {
      String var3 = (String)var1[0];
      long var4 = (Long)var1[1];
      String var6 = (String)var1[2];
      lyt var2 = (lyt)var1[3];
      long var7 = var4 ^ 0L;
      return m44.a<"w">(m44.a<"v">(this, -143957693466267168L, var4), new Object[]{var3, var7, var6, var2}, -300033787295437526L, var4);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var5 = ((long)var3 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 138207316108450L;
      long var9 = var5 ^ 36123655724446L;
      PrintWriter var12 = m44.a<"u">(m44.a<"t">(this, -6505267166658122347L, var5), new Object[]{var9}, -4746038528701505292L, var5);
      int[] var10000 = m44.a<"j">(-6353639300093065313L, var5);
      ArrayList var13 = new ArrayList();
      Enumeration var14 = m44.a<"u">(m44.a<"t">(this, -6468366906503467583L, var5), new Object[0], -5023675356173125178L, var5);
      int[] var11 = var10000;

      label103: {
         label86:
         while (true) {
            if (var14.hasMoreElements()) {
               String var15 = (String)var14.nextElement();

               try {
                  var25 = var13.add(var15);
                  if (var4 <= 0) {
                     break label103;
                  }
               } catch (n9 var22) {
                  boolean var10001 = false;
                  throw m44.a<"j">(var22, -6878693502473590490L, var5);
               }

               do {
                  try {
                     if (var11 != null) {
                        break label86;
                     }

                     if (var11 == null) {
                        continue label86;
                     }
                  } catch (n9 var21) {
                     boolean var28 = false;
                     throw m44.a<"j">(var21, -6878693502473590490L, var5);
                  }
               } while (var3 < 0);
            }

            Collections.sort(var13);
            var12.println(a<"e">(23575, 5775869859888296787L ^ var5));
            break;
         }

         var25 = 0;
      }

      int var23 = var25;

      while (var23 < var13.size()) {
         String var16 = (String)var13.get(var23);
         var12.println(a<"e">(3060, 5253481158341076150L ^ var5) + var16 + "\"");
         Map var17 = m44.a<"t">(this, -6468366906503467583L, var5).T(var16);
         Iterator var18 = var17.keySet().iterator();

         label61: {
            label60:
            while (true) {
               if (var18.hasNext()) {
                  try {
                     var12.println(
                        a<"e">(25175, 3893594964500991255L ^ var5) + m44.a<"u">((ltv)var18.next(), new Object[]{var7}, -6845689594085665955L, var5) + "\""
                     );
                  } catch (n9 var19) {
                     boolean var29 = false;
                     throw m44.a<"j">(var19, -6878693502473590490L, var5);
                  }

                  do {
                     try {
                        var10000 = var11;
                        if (var2 < 0) {
                           break label61;
                        }

                        if (var11 != null) {
                           break label60;
                        }

                        if (var11 == null) {
                           continue label60;
                        }
                     } catch (n9 var20) {
                        boolean var30 = false;
                        throw m44.a<"j">(var20, -6878693502473590490L, var5);
                     }
                  } while (var2 < 0);
               }

               var23++;
               break;
            }

            var10000 = var11;
         }

         if (var10000 != null) {
            break;
         }
      }
   }

   public PrintWriter T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 116231880292023L;
      return m44.a<"t">(m44.a<"u">(this, -3561805698799909188L, var2), new Object[]{var4}, -3095126922659066915L, var2);
   }

   private final void Q(Object[] param1) {
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
      // 00c: getstatic com/zelix/l6n.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 147747964078
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 130807229471192
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 48
      // 022: lushr
      // 023: l2i
      // 024: istore 6
      // 026: dup2
      // 027: bipush 16
      // 029: lshl
      // 02a: bipush 32
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 7
      // 030: dup2
      // 031: bipush 48
      // 033: lshl
      // 034: bipush 48
      // 036: lushr
      // 037: l2i
      // 038: istore 8
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 3147617667810
      // 03f: lxor
      // 040: dup2
      // 041: bipush 48
      // 043: lushr
      // 044: l2i
      // 045: istore 9
      // 047: dup2
      // 048: bipush 16
      // 04a: lshl
      // 04b: bipush 48
      // 04d: lushr
      // 04e: l2i
      // 04f: istore 10
      // 051: dup2
      // 052: bipush 32
      // 054: lshl
      // 055: bipush 32
      // 057: lushr
      // 058: l2i
      // 059: istore 11
      // 05b: pop2
      // 05c: dup2
      // 05d: ldc2_w 3365327117962
      // 060: lxor
      // 061: lstore 12
      // 063: dup2
      // 064: ldc2_w 129889483997634
      // 067: lxor
      // 068: lstore 14
      // 06a: dup2
      // 06b: ldc2_w 127197721222640
      // 06e: lxor
      // 06f: lstore 16
      // 071: dup2
      // 072: ldc2_w 57729220857469
      // 075: lxor
      // 076: lstore 18
      // 078: pop2
      // 079: ldc2_w 2899288844563138672
      // 07c: lload 2
      // 07d: invokedynamic m (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: new java/util/ArrayList
      // 085: dup
      // 086: invokespecial java/util/ArrayList.<init> ()V
      // 089: astore 21
      // 08b: astore 20
      // 08d: aload 0
      // 08e: ldc2_w 3014245148855525934
      // 091: lload 2
      // 092: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/ol; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: bipush 0
      // 098: anewarray 241
      // 09b: ldc2_w 3866147379021821481
      // 09e: lload 2
      // 09f: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: astore 22
      // 0a6: aload 22
      // 0a8: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 0ad: ifeq 0e7
      // 0b0: aload 22
      // 0b2: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 0b7: checkcast java/lang/String
      // 0ba: astore 23
      // 0bc: aload 21
      // 0be: aload 23
      // 0c0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0c3: lload 2
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 0ed
      // 0c9: pop
      // 0ca: aload 20
      // 0cc: ifnonnull 0ec
      // 0cf: aload 20
      // 0d1: ifnull 0a6
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: ifle 0ca
      // 0da: goto 0e7
      // 0dd: ldc2_w 3415692089450276553
      // 0e0: lload 2
      // 0e1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: aload 21
      // 0e9: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 0ec: bipush 0
      // 0ed: istore 23
      // 0ef: iload 23
      // 0f1: aload 21
      // 0f3: invokevirtual java/util/ArrayList.size ()I
      // 0f6: if_icmpge 41d
      // 0f9: aload 21
      // 0fb: iload 23
      // 0fd: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 100: checkcast java/lang/String
      // 103: astore 24
      // 105: aload 0
      // 106: ldc2_w 3014245148855525934
      // 109: lload 2
      // 10a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/ol; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: aload 24
      // 111: invokevirtual com/zelix/ol.T (Ljava/lang/Object;)Ljava/util/Map;
      // 114: astore 25
      // 116: aload 25
      // 118: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 11d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 122: astore 26
      // 124: aload 26
      // 126: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 12b: ifeq 40f
      // 12e: aload 26
      // 130: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 135: checkcast com/zelix/ltv
      // 138: astore 27
      // 13a: aload 27
      // 13c: lload 4
      // 13e: bipush 1
      // 13f: anewarray 241
      // 142: dup_x2
      // 143: dup_x2
      // 144: pop
      // 145: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: ldc2_w 3909543316984750609
      // 14e: lload 2
      // 14f: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: aload 20
      // 156: ifnonnull 0f1
      // 159: aload 20
      // 15b: lload 2
      // 15c: lconst_0
      // 15d: lcmp
      // 15e: ifle 156
      // 161: lload 2
      // 162: lconst_0
      // 163: lcmp
      // 164: iflt 212
      // 167: ifnonnull 20a
      // 16a: ifne 1f1
      // 16d: goto 17a
      // 170: ldc2_w 3415692089450276553
      // 173: lload 2
      // 174: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: aload 0
      // 17b: ldc2_w 3051088234937918074
      // 17e: lload 2
      // 17f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/lqu; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: new java/lang/StringBuilder
      // 187: dup
      // 188: invokespecial java/lang/StringBuilder.<init> ()V
      // 18b: sipush 20234
      // 18e: ldc2_w 821051561390239648
      // 191: lload 2
      // 192: lxor
      // 193: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/l6n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19b: aload 27
      // 19d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a0: sipush 23259
      // 1a3: ldc2_w 3974316127185599090
      // 1a6: lload 2
      // 1a7: lxor
      // 1a8: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/l6n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b3: bipush 1
      // 1b4: lload 16
      // 1b6: bipush 3
      // 1b7: anewarray 241
      // 1ba: dup_x2
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c0: bipush 2
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x1
      // 1c4: swap
      // 1c5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1c8: bipush 1
      // 1c9: swap
      // 1ca: aastore
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: bipush 0
      // 1ce: swap
      // 1cf: aastore
      // 1d0: ldc2_w 3421934177927748454
      // 1d3: lload 2
      // 1d4: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: aload 20
      // 1db: lload 2
      // 1dc: lconst_0
      // 1dd: lcmp
      // 1de: ifle 40c
      // 1e1: ifnull 404
      // 1e4: goto 1f1
      // 1e7: ldc2_w 3415692089450276553
      // 1ea: lload 2
      // 1eb: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: aload 27
      // 1f3: iload 6
      // 1f5: i2c
      // 1f6: iload 7
      // 1f8: iload 8
      // 1fa: invokevirtual com/zelix/ltv.u (CII)Z
      // 1fd: goto 20a
      // 200: ldc2_w 3415692089450276553
      // 203: lload 2
      // 204: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: lload 2
      // 20b: lconst_0
      // 20c: lcmp
      // 20d: iflt 2c3
      // 210: aload 20
      // 212: ifnonnull 2c3
      // 215: ifeq 29c
      // 218: goto 225
      // 21b: ldc2_w 3415692089450276553
      // 21e: lload 2
      // 21f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: athrow
      // 225: aload 0
      // 226: ldc2_w 3051088234937918074
      // 229: lload 2
      // 22a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/lqu; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: new java/lang/StringBuilder
      // 232: dup
      // 233: invokespecial java/lang/StringBuilder.<init> ()V
      // 236: sipush 24937
      // 239: ldc2_w 6794728792079647169
      // 23c: lload 2
      // 23d: lxor
      // 23e: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/l6n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 246: aload 27
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 24b: sipush 6828
      // 24e: ldc2_w 8059452785379621390
      // 251: lload 2
      // 252: lxor
      // 253: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/l6n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 25e: bipush 1
      // 25f: lload 16
      // 261: bipush 3
      // 262: anewarray 241
      // 265: dup_x2
      // 266: dup_x2
      // 267: pop
      // 268: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26b: bipush 2
      // 26c: swap
      // 26d: aastore
      // 26e: dup_x1
      // 26f: swap
      // 270: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 273: bipush 1
      // 274: swap
      // 275: aastore
      // 276: dup_x1
      // 277: swap
      // 278: bipush 0
      // 279: swap
      // 27a: aastore
      // 27b: ldc2_w 3421934177927748454
      // 27e: lload 2
      // 27f: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: aload 20
      // 286: lload 2
      // 287: lconst_0
      // 288: lcmp
      // 289: ifle 40c
      // 28c: ifnull 404
      // 28f: goto 29c
      // 292: ldc2_w 3415692089450276553
      // 295: lload 2
      // 296: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: athrow
      // 29c: aload 27
      // 29e: lload 18
      // 2a0: bipush 1
      // 2a1: anewarray 241
      // 2a4: dup_x2
      // 2a5: dup_x2
      // 2a6: pop
      // 2a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2aa: bipush 0
      // 2ab: swap
      // 2ac: aastore
      // 2ad: ldc2_w 3632856486540683524
      // 2b0: lload 2
      // 2b1: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: goto 2c3
      // 2b9: ldc2_w 3415692089450276553
      // 2bc: lload 2
      // 2bd: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: athrow
      // 2c3: ifeq 347
      // 2c6: aload 0
      // 2c7: ldc2_w 3051088234937918074
      // 2ca: lload 2
      // 2cb: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/lqu; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: new java/lang/StringBuilder
      // 2d3: dup
      // 2d4: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d7: sipush 24937
      // 2da: ldc2_w 6794728792079647169
      // 2dd: lload 2
      // 2de: lxor
      // 2df: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/l6n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e7: aload 27
      // 2e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2ec: sipush 6121
      // 2ef: ldc2_w 3691121617848121162
      // 2f2: lload 2
      // 2f3: lxor
      // 2f4: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/l6n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fc: ldc "+"
      // 2fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 301: sipush 30394
      // 304: ldc2_w 8539801990476846612
      // 307: lload 2
      // 308: lxor
      // 309: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/l6n.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 311: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 314: bipush 1
      // 315: lload 16
      // 317: bipush 3
      // 318: anewarray 241
      // 31b: dup_x2
      // 31c: dup_x2
      // 31d: pop
      // 31e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 321: bipush 2
      // 322: swap
      // 323: aastore
      // 324: dup_x1
      // 325: swap
      // 326: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 329: bipush 1
      // 32a: swap
      // 32b: aastore
      // 32c: dup_x1
      // 32d: swap
      // 32e: bipush 0
      // 32f: swap
      // 330: aastore
      // 331: ldc2_w 3421934177927748454
      // 334: lload 2
      // 335: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: goto 347
      // 33d: ldc2_w 3415692089450276553
      // 340: lload 2
      // 341: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: athrow
      // 347: lload 12
      // 349: bipush 1
      // 34a: anewarray 241
      // 34d: dup_x2
      // 34e: dup_x2
      // 34f: pop
      // 350: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 353: bipush 0
      // 354: swap
      // 355: aastore
      // 356: ldc2_w 3652077233721068333
      // 359: lload 2
      // 35a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: astore 28
      // 361: aload 27
      // 363: aload 0
      // 364: aload 28
      // 366: lload 14
      // 368: bipush 3
      // 369: anewarray 241
      // 36c: dup_x2
      // 36d: dup_x2
      // 36e: pop
      // 36f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 372: bipush 2
      // 373: swap
      // 374: aastore
      // 375: dup_x1
      // 376: swap
      // 377: bipush 1
      // 378: swap
      // 379: aastore
      // 37a: dup_x1
      // 37b: swap
      // 37c: bipush 0
      // 37d: swap
      // 37e: aastore
      // 37f: ldc2_w 3067225012108964527
      // 382: lload 2
      // 383: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 388: aload 28
      // 38a: aload 20
      // 38c: ifnonnull 3b7
      // 38f: ldc2_w 3649641020551192665
      // 392: lload 2
      // 393: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: ifle 404
      // 39b: goto 3a8
      // 39e: ldc2_w 3415692089450276553
      // 3a1: lload 2
      // 3a2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a7: athrow
      // 3a8: aload 28
      // 3aa: goto 3b7
      // 3ad: ldc2_w 3415692089450276553
      // 3b0: lload 2
      // 3b1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: athrow
      // 3b7: ldc2_w 3630547335183095835
      // 3ba: lload 2
      // 3bb: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c0: astore 29
      // 3c2: aload 29
      // 3c4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3c9: ifeq 404
      // 3cc: aload 29
      // 3ce: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3d3: checkcast com/zelix/_f
      // 3d6: astore 30
      // 3d8: aload 0
      // 3d9: ldc2_w 3301051264649807943
      // 3dc: lload 2
      // 3dd: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/ol; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: iload 9
      // 3e4: i2s
      // 3e5: iload 10
      // 3e7: i2c
      // 3e8: aload 24
      // 3ea: iload 11
      // 3ec: aload 30
      // 3ee: aload 30
      // 3f0: invokevirtual com/zelix/ol.h (SCLjava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 3f3: pop
      // 3f4: aload 20
      // 3f6: ifnonnull 124
      // 3f9: aload 20
      // 3fb: lload 2
      // 3fc: lconst_0
      // 3fd: lcmp
      // 3fe: ifle 135
      // 401: ifnull 3c2
      // 404: aload 20
      // 406: lload 2
      // 407: lconst_0
      // 408: lcmp
      // 409: iflt 41a
      // 40c: ifnull 124
      // 40f: iinc 23 1
      // 412: aload 20
      // 414: lload 2
      // 415: lconst_0
      // 416: lcmp
      // 417: ifle 135
      // 41a: ifnull 0ef
      // 41d: lload 2
      // 41e: lconst_0
      // 41f: lcmp
      // 420: ifle 0f9
      // 423: return
   }

   public final boolean p(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return m44.a<"q">(m44.a<"p">(this, -601592577566295994L, var2), new Object[]{var4}, -1476676147422732836L, var2);
   }

   public _6 Y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return m44.a<"p">(m44.a<"q">(this, -155382577525018057L, var2), new Object[]{var4}, -1838115007293849850L, var2);
   }

   public _p a(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var5 = ((long)var3 << 56 | (long)var2 << 32 >>> 8 | (long)var4 << 40 >>> 40) ^ a;
      long var7 = var5 ^ 92168762880279L;
      return new _p(var7, m44.a<"s">(this, -7203525354721117809L, var5));
   }

   public Enumeration D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 12978477239466L;
      return m44.a<"w">(m44.a<"v">(this, -3375285606678585656L, var2), new Object[]{var4}, -3571092904932693765L, var2);
   }

   public final boolean n(Object[] var1) {
      String var2 = (String)var1[0];
      String var6 = (String)var1[1];
      long var3 = (Long)var1[2];
      lyt var5 = (lyt)var1[3];
      long var7 = var3 ^ 0L;
      return m44.a<"r">(m44.a<"s">(this, -2930208697800845131L, var3), new Object[]{var2, var6, var7, var5}, -2987620073948038502L, var3);
   }

   public boolean D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(m44.a<"w">(this, 332011684978756790L, var2), 2148761538121779098L, var2);
   }

   static {
      long var0 = a ^ 41425292352466L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "\u009c\u008b:L\u0089ÿë¸\u0083**öÿ,4¾t2ßl\u007f\u001d\u0082¯,Cî+f\u0017\u0005\u0010\\\u0097Û\u0083ÛqÏ\"\u0018V\u009a%¡zx`Á¶Ý'1\\Ë\býHüC\u0086\u0087>_+\u008888¿u\u00993\u008e±!H!ã#øÛ¼Ç.Öß\u0019ËO(l\u0095\u0099\u000bk\u0087;Eè\u0012Ïú4Æ\u0003É3Ã`1Yí©¢ä\u0006à°³ðlãâ[ø\u0083^°Pu\u0097v\u009dü\u0084ñ÷WÃð\u008c&»ßT5UÅ\u008f\u0098½\u0004²O¡Ýçáñçßñ,\u0084WÞ½I\u009d\u0083_Æ\u000bw\u0007;@åù[T \u0014úsOö\u001c\u00182\u009b]ÚùíÌ£iNÓù\u009b Ðà§\b\u0092·s|g\u001dYçé\u0082;{Sìm¶¾sÚÄÎ7\u0094vëBS~\u0010¢`\tf\u008b\u00136¯y:\u0014]ç\u0091\u0095\u00028\u0099÷3\u001e_8\u0003ç\u0082|é|SBá·Ö\u0004©[£í-Sñ\tpá÷\u0090[¶oÿU,ø\u0000§vàw(4\u00847ë\u0098\u0092Ë¿\u001a'³Q²\u0010\u0013ÖÚ1=º/`MÑí\u0001LK/\u0085 7?{ïæF¾\u001aÙ\u009d?JË\nx\u0015\u0084\u008eDÍ9Ê\u0087øÐ9\u001c\"\u009c\u008aò¯";
      int var8 = "\u009c\u008b:L\u0089ÿë¸\u0083**öÿ,4¾t2ßl\u007f\u001d\u0082¯,Cî+f\u0017\u0005\u0010\\\u0097Û\u0083ÛqÏ\"\u0018V\u009a%¡zx`Á¶Ý'1\\Ë\býHüC\u0086\u0087>_+\u008888¿u\u00993\u008e±!H!ã#øÛ¼Ç.Öß\u0019ËO(l\u0095\u0099\u000bk\u0087;Eè\u0012Ïú4Æ\u0003É3Ã`1Yí©¢ä\u0006à°³ðlãâ[ø\u0083^°Pu\u0097v\u009dü\u0084ñ÷WÃð\u008c&»ßT5UÅ\u008f\u0098½\u0004²O¡Ýçáñçßñ,\u0084WÞ½I\u009d\u0083_Æ\u000bw\u0007;@åù[T \u0014úsOö\u001c\u00182\u009b]ÚùíÌ£iNÓù\u009b Ðà§\b\u0092·s|g\u001dYçé\u0082;{Sìm¶¾sÚÄÎ7\u0094vëBS~\u0010¢`\tf\u008b\u00136¯y:\u0014]ç\u0091\u0095\u00028\u0099÷3\u001e_8\u0003ç\u0082|é|SBá·Ö\u0004©[£í-Sñ\tpá÷\u0090[¶oÿU,ø\u0000§vàw(4\u00847ë\u0098\u0092Ë¿\u001a'³Q²\u0010\u0013ÖÚ1=º/`MÑí\u0001LK/\u0085 7?{ïæF¾\u001aÙ\u009d?JË\nx\u0015\u0084\u008eDÍ9Ê\u0087øÐ9\u001c\"\u009c\u008aò¯"
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
                     c = new String[10];
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

                  var6 = "@1æ{)ÿÛ\u00adÈ:~£\u001a²`Ôö[Ë®)£Ý\u001a\u0099\u001b-î\u0089hA\u0099@\u0007á Éê*ìui/Yù4\u008dNQ\u0015\u0016½}Ix\u009a\r®è[dO¸ô°ëÖV0u\u0012\u0016gv\u009fÂpÕ!Sx!Ã\u0005ùPÅ\u00933=\u0010çz\u008c'\u001dÌÝn\u009c\u008cÜô\u00ad>ghî\u009e\\èÔÒñ\u0097qN ¨\u0005\t±lm5Q+òþë\u0085ÃbÇ#çÕ7\u0081w4`Ü1=|@]-<\u009eEÌ<:\u000eR½¢\f¶f ×Å³\u009crê\u0085y-³¸¾4wK\u0011AÃ\r?¡ö\u0012\u000f'5©\u001d¡\u008aåö\u007f¾\u0084ôñ\u009c";
                  var8 = "@1æ{)ÿÛ\u00adÈ:~£\u001a²`Ôö[Ë®)£Ý\u001a\u0099\u001b-î\u0089hA\u0099@\u0007á Éê*ìui/Yù4\u008dNQ\u0015\u0016½}Ix\u009a\r®è[dO¸ô°ëÖV0u\u0012\u0016gv\u009fÂpÕ!Sx!Ã\u0005ùPÅ\u00933=\u0010çz\u008c'\u001dÌÝn\u009c\u008cÜô\u00ad>ghî\u009e\\èÔÒñ\u0097qN ¨\u0005\t±lm5Q+òþë\u0085ÃbÇ#çÕ7\u0081w4`Ü1=|@]-<\u009eEÌ<:\u000eR½¢\f¶f ×Å³\u009crê\u0085y-³¸¾4wK\u0011AÃ\r?¡ö\u0012\u000f'5©\u001d¡\u008aåö\u007f¾\u0084ôñ\u009c"
                     .length();
                  var5 = 'P';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 921;
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
            throw new RuntimeException("com/zelix/l6n", var10);
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
         throw new RuntimeException("com/zelix/l6n" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
