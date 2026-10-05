package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class xu implements Comparable {
   private boolean T;
   Set R;
   private static final long a = ess.a(4602110402899453183L, 8414226247584885815L, MethodHandles.lookup().lookupClass()).a(47090089392995L);

   void f(Object[] var1) {
      long var2 = (Long)var1[0];
      ArrayList var4 = (ArrayList)var1[1];
   }

   void K(Object[] var1) {
      long var2 = (Long)var1[0];
      boolean var4 = (Boolean)var1[1];
      var2 = a ^ var2;
      x44.a<"p">(this, var4, 8025948652459142181L, var2);
   }

   void I(Object[] var1) {
      ArrayList var2 = (ArrayList)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 126760515566599L;
      long var7 = var3 ^ 82436399109307L;
      hk[] var10000 = x44.a<"u">(-3640858281802116767L, var3);
      x44.a<"m">(this, new Object[]{var5, var2}, -3090981736649131756L, var3);
      hk[] var9 = var10000;

      for (xg var11 : x44.a<"i">(this, -3985866059908834903L, var3)) {
         x44.a<"m">(var11, new Object[]{var2, var7}, -4004956860653516045L, var3);
         if (var9 != null) {
            break;
         }
      }
   }

   public abstract String v(Object[] var1);

   final void b(Object[] param1) {
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
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast [Ljava/lang/String;
      // 011: astore 6
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 3
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/util/Map
      // 023: astore 5
      // 025: pop
      // 026: getstatic com/zelix/xu.a J
      // 029: lload 3
      // 02a: lxor
      // 02b: lstore 3
      // 02c: lload 3
      // 02d: dup2
      // 02e: ldc2_w 18631034411386
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 130235618049160
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 34928880815393
      // 03f: lxor
      // 040: lstore 11
      // 042: dup2
      // 043: ldc2_w 82436399109307
      // 046: lxor
      // 047: lstore 13
      // 049: pop2
      // 04a: ldc2_w -6731722644122943860
      // 04d: lload 3
      // 04e: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: astore 15
      // 055: iload 2
      // 056: aload 6
      // 058: arraylength
      // 059: if_icmpge 23d
      // 05c: aload 6
      // 05e: iload 2
      // 05f: aaload
      // 060: astore 16
      // 062: aload 0
      // 063: ldc2_w -6394455428202924476
      // 066: lload 3
      // 067: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 071: astore 17
      // 073: aload 17
      // 075: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07a: ifeq 116
      // 07d: aload 17
      // 07f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 084: checkcast com/zelix/xg
      // 087: astore 18
      // 089: aload 15
      // 08b: ifnonnull 110
      // 08e: aload 16
      // 090: aload 15
      // 092: ifnonnull 135
      // 095: goto 0a2
      // 098: ldc2_w -4722779326326365431
      // 09b: lload 3
      // 09c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: aload 18
      // 0a4: lload 9
      // 0a6: bipush 1
      // 0a7: anewarray 172
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: ldc2_w -4920736440696762445
      // 0b6: lload 3
      // 0b7: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bf: ifeq 111
      // 0c2: goto 0cf
      // 0c5: ldc2_w -4722779326326365431
      // 0c8: lload 3
      // 0c9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: iinc 2 1
      // 0d2: aload 18
      // 0d4: iload 2
      // 0d5: aload 6
      // 0d7: lload 13
      // 0d9: aload 5
      // 0db: bipush 4
      // 0dc: anewarray 172
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: bipush 3
      // 0e2: swap
      // 0e3: aastore
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 2
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: bipush 1
      // 0f0: swap
      // 0f1: aastore
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f7: bipush 0
      // 0f8: swap
      // 0f9: aastore
      // 0fa: ldc2_w -6390850073277118081
      // 0fd: lload 3
      // 0fe: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: goto 110
      // 106: ldc2_w -4722779326326365431
      // 109: lload 3
      // 10a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: return
      // 111: aload 15
      // 113: ifnull 073
      // 116: aload 0
      // 117: lload 3
      // 118: lconst_0
      // 119: lcmp
      // 11a: iflt 084
      // 11d: lload 7
      // 11f: bipush 1
      // 120: anewarray 172
      // 123: dup_x2
      // 124: dup_x2
      // 125: pop
      // 126: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: ldc2_w -4978970412757642313
      // 12f: lload 3
      // 130: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: astore 17
      // 137: new java/lang/StringBuilder
      // 13a: dup
      // 13b: invokespecial java/lang/StringBuilder.<init> ()V
      // 13e: aload 17
      // 140: aload 15
      // 142: ifnonnull 179
      // 145: invokevirtual java/lang/String.length ()I
      // 148: ifle 17c
      // 14b: goto 158
      // 14e: ldc2_w -4722779326326365431
      // 151: lload 3
      // 152: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: athrow
      // 158: new java/lang/StringBuilder
      // 15b: dup
      // 15c: invokespecial java/lang/StringBuilder.<init> ()V
      // 15f: aload 17
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: ldc "/"
      // 166: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 169: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16c: goto 179
      // 16f: ldc2_w -4722779326326365431
      // 172: lload 3
      // 173: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: goto 17e
      // 17c: ldc ""
      // 17e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 181: aload 16
      // 183: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 186: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 189: astore 18
      // 18b: bipush 0
      // 18c: istore 19
      // 18e: aload 5
      // 190: lload 3
      // 191: lconst_0
      // 192: lcmp
      // 193: ifle 1ad
      // 196: aload 15
      // 198: ifnonnull 1ad
      // 19b: ifnull 1e7
      // 19e: goto 1ab
      // 1a1: ldc2_w -4722779326326365431
      // 1a4: lload 3
      // 1a5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: aload 5
      // 1ad: aload 18
      // 1af: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1b4: aload 15
      // 1b6: ifnonnull 1e5
      // 1b9: ifeq 1e7
      // 1bc: goto 1c9
      // 1bf: ldc2_w -4722779326326365431
      // 1c2: lload 3
      // 1c3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: aload 5
      // 1cb: aload 18
      // 1cd: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1d2: checkcast java/lang/Boolean
      // 1d5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1d8: goto 1e5
      // 1db: ldc2_w -4722779326326365431
      // 1de: lload 3
      // 1df: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: athrow
      // 1e5: istore 19
      // 1e7: new com/zelix/xg
      // 1ea: dup
      // 1eb: lload 11
      // 1ed: aload 0
      // 1ee: aload 16
      // 1f0: iload 19
      // 1f2: invokespecial com/zelix/xg.<init> (JLcom/zelix/xu;Ljava/lang/String;Z)V
      // 1f5: astore 20
      // 1f7: aload 0
      // 1f8: ldc2_w -6394455428202924476
      // 1fb: lload 3
      // 1fc: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: aload 20
      // 203: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 208: pop
      // 209: iinc 2 1
      // 20c: aload 20
      // 20e: iload 2
      // 20f: aload 6
      // 211: lload 13
      // 213: aload 5
      // 215: bipush 4
      // 216: anewarray 172
      // 219: dup_x1
      // 21a: swap
      // 21b: bipush 3
      // 21c: swap
      // 21d: aastore
      // 21e: dup_x2
      // 21f: dup_x2
      // 220: pop
      // 221: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 224: bipush 2
      // 225: swap
      // 226: aastore
      // 227: dup_x1
      // 228: swap
      // 229: bipush 1
      // 22a: swap
      // 22b: aastore
      // 22c: dup_x1
      // 22d: swap
      // 22e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 231: bipush 0
      // 232: swap
      // 233: aastore
      // 234: ldc2_w -6390850073277118081
      // 237: lload 3
      // 238: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: return
   }

   void L(Object[] var1) {
      Map var2 = (Map)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 82436399109307L;
      long var7 = var3 ^ 85330605492364L;
      x44.a<"n">(this, new Object[]{var2, var7}, 5321464057256030495L, var3);
      hk[] var10000 = x44.a<"v">(5609817657100980674L, var3);
      Iterator var10 = x44.a<"j">(this, 5191623627980380426L, var3).iterator();
      hk[] var9 = var10000;

      while (var10.hasNext()) {
         xg var11 = (xg)var10.next();
         x44.a<"n">(var11, new Object[]{var2, var5}, 6240030540593646129L, var3);
         if (var9 != null) {
            break;
         }
      }
   }

   abstract void D(Object[] var1);

   public final int p(Object[] var1) {
      long var2 = (Long)var1[0];
      xu var4 = (xu)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 7003540418272L;
      return x44.a<"j">(this, new Object[]{var5}, 5583674523789517869L, var2)
         .toLowerCase()
         .compareTo(x44.a<"j">(var4, new Object[]{var5}, 5583674523789517869L, var2).toLowerCase());
   }

   public xu(long var1) {
      var1 = a ^ var1;
      super();
      x44.a<"u">(this, new LinkedHashSet(), 4973169433141285890L, var1);
      x44.a<"u">(this, true, 4921580305582720776L, var1);
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 57600312356209L;
      long var4 = var2 ^ 43471020716296L;
      return x44.a<"i">(this, new Object[]{var4, (xu)var1}, 2999725081953175579L, var2);
   }

   public abstract boolean N(Object[] var1);

   public boolean U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 5620664703389404484L, var2);
   }

   private static gj b(gj var0) {
      return var0;
   }
}
