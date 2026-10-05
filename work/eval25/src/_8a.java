package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class _8a {
   private ArrayList F;
   private static final long a = ess.a(-8680222675661700534L, -4213978523428097587L, MethodHandles.lookup().lookupClass()).a(268599238367150L);

   Enumeration i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return Collections.enumeration(x44.a<"n">(this, 1866616711561993095L, var2));
   }

   boolean s(Object[] param1) {
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
      // 004: checkcast com/zelix/_8a
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/_8a.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: aload 4
      // 01c: ldc2_w 6341342090230602336
      // 01f: lload 2
      // 020: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: astore 6
      // 027: ldc2_w 6372627629748134129
      // 02a: lload 2
      // 02b: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: bipush 0
      // 031: istore 7
      // 033: astore 5
      // 035: iload 7
      // 037: aload 0
      // 038: ldc2_w 6341342090230602336
      // 03b: lload 2
      // 03c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: invokevirtual java/util/ArrayList.size ()I
      // 044: if_icmpge 1c3
      // 047: aload 0
      // 048: ldc2_w 6341342090230602336
      // 04b: lload 2
      // 04c: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: iload 7
      // 053: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 056: checkcast java/util/HashSet
      // 059: astore 8
      // 05b: aload 6
      // 05d: iload 7
      // 05f: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 062: checkcast java/util/HashSet
      // 065: astore 9
      // 067: aconst_null
      // 068: astore 10
      // 06a: aconst_null
      // 06b: astore 11
      // 06d: aconst_null
      // 06e: astore 12
      // 070: aconst_null
      // 071: astore 13
      // 073: iload 7
      // 075: aload 5
      // 077: ifnull 1c4
      // 07a: ifle 0ae
      // 07d: goto 08a
      // 080: ldc2_w 6607152525461328570
      // 083: lload 2
      // 084: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: athrow
      // 08a: aload 0
      // 08b: ldc2_w 6341342090230602336
      // 08e: lload 2
      // 08f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: iload 7
      // 096: bipush 1
      // 097: isub
      // 098: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 09b: checkcast java/util/HashSet
      // 09e: astore 10
      // 0a0: aload 6
      // 0a2: iload 7
      // 0a4: bipush 1
      // 0a5: isub
      // 0a6: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0a9: checkcast java/util/HashSet
      // 0ac: astore 11
      // 0ae: iload 7
      // 0b0: aload 0
      // 0b1: ldc2_w 6341342090230602336
      // 0b4: lload 2
      // 0b5: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: invokevirtual java/util/ArrayList.size ()I
      // 0bd: bipush 1
      // 0be: isub
      // 0bf: if_icmpge 0e6
      // 0c2: aload 0
      // 0c3: ldc2_w 6341342090230602336
      // 0c6: lload 2
      // 0c7: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: iload 7
      // 0ce: bipush 1
      // 0cf: iadd
      // 0d0: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0d3: checkcast java/util/HashSet
      // 0d6: astore 12
      // 0d8: aload 6
      // 0da: iload 7
      // 0dc: bipush 1
      // 0dd: iadd
      // 0de: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0e1: checkcast java/util/HashSet
      // 0e4: astore 13
      // 0e6: aload 8
      // 0e8: aload 5
      // 0ea: lload 2
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: iflt 119
      // 0f0: ifnull 117
      // 0f3: aload 9
      // 0f5: invokevirtual java/util/HashSet.equals (Ljava/lang/Object;)Z
      // 0f8: ifne 1bb
      // 0fb: goto 108
      // 0fe: ldc2_w 6607152525461328570
      // 101: lload 2
      // 102: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 10
      // 10a: goto 117
      // 10d: ldc2_w 6607152525461328570
      // 110: lload 2
      // 111: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 5
      // 119: lload 2
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: ifle 165
      // 11f: ifnull 15d
      // 122: ifnull 15b
      // 125: goto 132
      // 128: ldc2_w 6607152525461328570
      // 12b: lload 2
      // 12c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: aload 10
      // 134: aload 11
      // 136: invokevirtual java/util/HashSet.equals (Ljava/lang/Object;)Z
      // 139: aload 5
      // 13b: ifnull 1ba
      // 13e: goto 14b
      // 141: ldc2_w 6607152525461328570
      // 144: lload 2
      // 145: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: ifeq 1ac
      // 14e: goto 15b
      // 151: ldc2_w 6607152525461328570
      // 154: lload 2
      // 155: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: aload 12
      // 15d: lload 2
      // 15e: lconst_0
      // 15f: lcmp
      // 160: ifle 17a
      // 163: aload 5
      // 165: ifnull 17a
      // 168: ifnull 1bb
      // 16b: goto 178
      // 16e: ldc2_w 6607152525461328570
      // 171: lload 2
      // 172: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: aload 12
      // 17a: aload 13
      // 17c: invokevirtual java/util/HashSet.equals (Ljava/lang/Object;)Z
      // 17f: aload 5
      // 181: ifnull 1ba
      // 184: ifeq 1ac
      // 187: goto 194
      // 18a: ldc2_w 6607152525461328570
      // 18d: lload 2
      // 18e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: aload 5
      // 196: lload 2
      // 197: lconst_0
      // 198: lcmp
      // 199: ifle 1c0
      // 19c: ifnonnull 1bb
      // 19f: goto 1ac
      // 1a2: ldc2_w 6607152525461328570
      // 1a5: lload 2
      // 1a6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: bipush 0
      // 1ad: goto 1ba
      // 1b0: ldc2_w 6607152525461328570
      // 1b3: lload 2
      // 1b4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: ireturn
      // 1bb: iinc 7 1
      // 1be: aload 5
      // 1c0: ifnonnull 035
      // 1c3: bipush 1
      // 1c4: ireturn
   }

   void L(Object[] var1) {
      _8a var2 = (_8a)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      int[] var10000 = x44.a<"u">(849021135034020681L, var3);
      int var6 = 0;
      int[] var5 = var10000;

      while (var6 < x44.a<"i">(this, 844620788879837656L, var3).size()) {
         HashSet var7 = (HashSet)x44.a<"i">(this, 844620788879837656L, var3).get(var6);
         x44.a<"m">(var7, (Collection)x44.a<"i">(var2, 844620788879837656L, var3).get(var6), 1723704125424348227L, var3);
         var6++;
         if (var5 == null) {
            break;
         }
      }
   }

   int N(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, 1325138145395003395L, var2).size();
   }

   _8a(y8 var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 59010752072343L;
      long var6 = var2 ^ 74515934353644L;
      super();
      int[] var10000 = x44.a<"v">(-3973549942591606694L, var2);
      x44.a<"u">(this, new ArrayList(), -3986816543884703029L, var2);
      int[] var8 = var10000;
      Enumeration var9 = x44.a<"n">(var1, new Object[]{var6}, -3821239746341596742L, var2);

      while (var9.hasMoreElements()) {
         HashSet var10 = x44.a<"v">(new Object[]{var4}, -3849477713954978977L, var2);
         var10.add(var9.nextElement());
         x44.a<"j">(this, -3986816543884703029L, var2).add(var10);
         if (var8 == null) {
            break;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }
}
