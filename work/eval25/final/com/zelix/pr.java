package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pr extends py {
   xe[] Z;
   private Map T;
   int m;
   private w v;
   private static final long a = ess.a(7514929054476544419L, -4949139398176607599L, MethodHandles.lookup().lookupClass()).a(46357690759586L);
   private static final String e;

   public pr(String var1, h8 var2, xe[] var3, long var4, _uo var6) {
      var4 = a ^ var4;
      long var7 = var4 ^ 27453759656806L;
      long var9 = var4 ^ 58011542662800L;
      super(var1, var9, var2, var6);
      x44.a<"o">(this, new Object[]{var3, var7}, 8268765011245147039L, var4);
   }

   public int V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -5398486103922973244L, var2);
   }

   public w i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -2181911869481666476L, var2);
   }

   public String x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 69177432170807L;
      xe[] var10000 = x44.a<"m">(this, -153685386440813042L, var2);
      int var10003 = x44.a<"m">(this, -1964737700048508573L, var2);
      x44.a<"r">(this, var10003 + 1, -1964737700048508573L, var2);
      return x44.a<"i">(var10000[var10003], new Object[]{var4}, -498702124219783098L, var2);
   }

   void T(Object[] param1) {
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
      // 004: checkcast [Lcom/zelix/xe;
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/pr.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 38149696239669
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 79451117732875
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 69737326886638
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 89190338238263
      // 033: lxor
      // 034: lstore 11
      // 036: pop2
      // 037: aload 0
      // 038: new com/zelix/w
      // 03b: dup
      // 03c: lload 9
      // 03e: invokespecial com/zelix/w.<init> (J)V
      // 041: ldc2_w 3631407908175932297
      // 044: lload 3
      // 045: invokedynamic p (Ljava/lang/Object;Lcom/zelix/w;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: new java/util/ArrayList
      // 04d: dup
      // 04e: invokespecial java/util/ArrayList.<init> ()V
      // 051: astore 14
      // 053: ldc2_w 3796325785210038455
      // 056: lload 3
      // 057: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 2
      // 05d: astore 15
      // 05f: astore 13
      // 061: aload 15
      // 063: arraylength
      // 064: istore 16
      // 066: bipush 0
      // 067: istore 17
      // 069: iload 17
      // 06b: iload 16
      // 06d: if_icmpge 150
      // 070: aload 15
      // 072: iload 17
      // 074: aaload
      // 075: astore 18
      // 077: aload 13
      // 079: ifnonnull 1c0
      // 07c: aload 18
      // 07e: instanceof com/zelix/md
      // 081: aload 13
      // 083: ifnonnull 147
      // 086: goto 093
      // 089: ldc2_w 3962055460161798508
      // 08c: lload 3
      // 08d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: ifeq 131
      // 096: goto 0a3
      // 099: ldc2_w 3962055460161798508
      // 09c: lload 3
      // 09d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: aload 18
      // 0a5: checkcast com/zelix/md
      // 0a8: astore 19
      // 0aa: aload 19
      // 0ac: lload 5
      // 0ae: bipush 1
      // 0af: anewarray 233
      // 0b2: dup_x2
      // 0b3: dup_x2
      // 0b4: pop
      // 0b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w 2970192168601386007
      // 0be: lload 3
      // 0bf: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: astore 20
      // 0c6: aload 13
      // 0c8: lload 3
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: iflt 106
      // 0ce: ifnonnull 104
      // 0d1: aload 20
      // 0d3: ifnull 10f
      // 0d6: goto 0e3
      // 0d9: ldc2_w 3962055460161798508
      // 0dc: lload 3
      // 0dd: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: ldc2_w 3631407908175932297
      // 0e7: lload 3
      // 0e8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: lload 11
      // 0ef: aload 20
      // 0f1: aload 19
      // 0f3: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 0f6: pop
      // 0f7: goto 104
      // 0fa: ldc2_w 3962055460161798508
      // 0fd: lload 3
      // 0fe: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 13
      // 106: lload 3
      // 107: lconst_0
      // 108: lcmp
      // 109: ifle 128
      // 10c: ifnull 126
      // 10f: aload 14
      // 111: aload 19
      // 113: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 118: pop
      // 119: goto 126
      // 11c: ldc2_w 3962055460161798508
      // 11f: lload 3
      // 120: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: aload 13
      // 128: lload 3
      // 129: lconst_0
      // 12a: lcmp
      // 12b: ifle 14d
      // 12e: ifnull 148
      // 131: aload 14
      // 133: aload 18
      // 135: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 13a: goto 147
      // 13d: ldc2_w 3962055460161798508
      // 140: lload 3
      // 141: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: pop
      // 148: iinc 17 1
      // 14b: aload 13
      // 14d: ifnull 069
      // 150: aload 0
      // 151: aload 14
      // 153: invokeinterface java/util/List.size ()I 1
      // 158: ldc2_w 3749175836116542679
      // 15b: lload 3
      // 15c: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: aload 0
      // 162: aload 0
      // 163: ldc2_w 3749175836116542679
      // 166: lload 3
      // 167: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: anewarray 59
      // 16f: ldc2_w 2967751938594833148
      // 172: lload 3
      // 173: invokedynamic p (Ljava/lang/Object;[Lcom/zelix/xe;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: aload 0
      // 179: aload 14
      // 17b: aload 0
      // 17c: ldc2_w 2967751938594833148
      // 17f: lload 3
      // 180: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/xe; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 18a: checkcast [Lcom/zelix/xe;
      // 18d: ldc2_w 2967751938594833148
      // 190: lload 3
      // 191: invokedynamic p (Ljava/lang/Object;[Lcom/zelix/xe;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: aload 0
      // 197: aconst_null
      // 198: ldc2_w 3360711437687875078
      // 19b: lload 3
      // 19c: invokedynamic p (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: aload 0
      // 1a2: lload 7
      // 1a4: bipush 1
      // 1a5: anewarray 233
      // 1a8: dup_x2
      // 1a9: dup_x2
      // 1aa: pop
      // 1ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ae: bipush 0
      // 1af: swap
      // 1b0: aastore
      // 1b1: ldc2_w 3669662567299517040
      // 1b4: lload 3
      // 1b5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: lload 3
      // 1bb: lconst_0
      // 1bc: lcmp
      // 1bd: ifle 1c0
      // 1c0: return
   }

   public int M(Object[] param1) {
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
      // 00e: checkcast com/zelix/ab
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/pr.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 32394214868885
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 125093485268761
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 25986930399044
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 161222943761
      // 033: lxor
      // 034: lstore 11
      // 036: pop2
      // 037: ldc2_w -5866690517979090291
      // 03a: lload 3
      // 03b: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: astore 13
      // 042: aload 0
      // 043: ldc2_w -5433114655745115076
      // 046: lload 3
      // 047: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 13
      // 04e: ifnonnull 1d8
      // 051: ifnonnull 1ce
      // 054: goto 061
      // 057: ldc2_w -5997076938047693994
      // 05a: lload 3
      // 05b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: aload 0
      // 062: lload 11
      // 064: bipush 1
      // 065: anewarray 233
      // 068: dup_x2
      // 069: dup_x2
      // 06a: pop
      // 06b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06e: bipush 0
      // 06f: swap
      // 070: aastore
      // 071: ldc2_w -6202108985623294078
      // 074: lload 3
      // 075: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: ldc2_w -5281596382731182780
      // 07d: lload 3
      // 07e: invokedynamic r (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: aload 0
      // 084: ldc2_w -6314244047914176077
      // 087: lload 3
      // 088: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: bipush 0
      // 08e: anewarray 233
      // 091: ldc2_w -6121496256251763481
      // 094: lload 3
      // 095: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 09f: astore 14
      // 0a1: aload 14
      // 0a3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a8: ifeq 128
      // 0ab: aload 14
      // 0ad: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b2: checkcast java/util/Map$Entry
      // 0b5: astore 15
      // 0b7: aload 15
      // 0b9: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0be: checkcast com/zelix/md
      // 0c1: astore 16
      // 0c3: aload 15
      // 0c5: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0ca: checkcast java/util/Set
      // 0cd: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d2: aload 13
      // 0d4: lload 3
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 220
      // 0da: ifnonnull 21e
      // 0dd: astore 17
      // 0df: aload 17
      // 0e1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e6: ifeq 11d
      // 0e9: aload 17
      // 0eb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f0: checkcast com/zelix/md
      // 0f3: astore 18
      // 0f5: aload 0
      // 0f6: ldc2_w -5281596382731182780
      // 0f9: lload 3
      // 0fa: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: aload 18
      // 101: aload 16
      // 103: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 108: checkcast com/zelix/md
      // 10b: astore 19
      // 10d: aload 13
      // 10f: ifnonnull 0a1
      // 112: aload 13
      // 114: lload 3
      // 115: lconst_0
      // 116: lcmp
      // 117: ifle 0ca
      // 11a: ifnull 0df
      // 11d: aload 13
      // 11f: lload 3
      // 120: lconst_0
      // 121: lcmp
      // 122: iflt 0f0
      // 125: ifnull 0a1
      // 128: aload 0
      // 129: aload 0
      // 12a: ldc2_w -5891366157245874451
      // 12d: lload 3
      // 12e: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: i2d
      // 134: ldc2_w 1.5
      // 137: dmul
      // 138: d2i
      // 139: lload 9
      // 13b: bipush 2
      // 13c: anewarray 233
      // 13f: dup_x2
      // 140: dup_x2
      // 141: pop
      // 142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145: bipush 1
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14d: bipush 0
      // 14e: swap
      // 14f: aastore
      // 150: ldc2_w -6248883553318555916
      // 153: lload 3
      // 154: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: ldc2_w -5433114655745115076
      // 15c: lload 3
      // 15d: invokedynamic r (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: bipush 0
      // 163: lload 3
      // 164: lconst_0
      // 165: lcmp
      // 166: iflt 0a8
      // 169: istore 14
      // 16b: iload 14
      // 16d: aload 0
      // 16e: ldc2_w -5891366157245874451
      // 171: lload 3
      // 172: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: if_icmpge 1ce
      // 17a: lload 3
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: iflt 1b6
      // 180: aload 0
      // 181: ldc2_w -5433114655745115076
      // 184: lload 3
      // 185: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: aload 0
      // 18b: ldc2_w -5542377992757339962
      // 18e: lload 3
      // 18f: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/xe; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: iload 14
      // 196: aaload
      // 197: aload 0
      // 198: ldc2_w -5326167404458976516
      // 19b: lload 3
      // 19c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_uo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: iload 14
      // 1a3: lload 5
      // 1a5: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 1a8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1ad: aload 13
      // 1af: ifnonnull 21a
      // 1b2: pop
      // 1b3: iinc 14 1
      // 1b6: aload 13
      // 1b8: ifnull 16b
      // 1bb: lload 3
      // 1bc: lconst_0
      // 1bd: lcmp
      // 1be: iflt 17a
      // 1c1: goto 1ce
      // 1c4: ldc2_w -5997076938047693994
      // 1c7: lload 3
      // 1c8: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: ldc2_w -5433114655745115076
      // 1d2: lload 3
      // 1d3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: aload 2
      // 1d9: aload 13
      // 1db: ifnonnull 211
      // 1de: instanceof com/zelix/md
      // 1e1: ifeq 214
      // 1e4: goto 1f1
      // 1e7: ldc2_w -5997076938047693994
      // 1ea: lload 3
      // 1eb: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: aload 2
      // 1f2: checkcast com/zelix/md
      // 1f5: aload 0
      // 1f6: ldc2_w -5281596382731182780
      // 1f9: lload 3
      // 1fa: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: lload 7
      // 201: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 204: goto 211
      // 207: ldc2_w -5997076938047693994
      // 20a: lload 3
      // 20b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: athrow
      // 211: goto 215
      // 214: aload 2
      // 215: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 21a: astore 14
      // 21c: aload 14
      // 21e: aload 13
      // 220: ifnonnull 235
      // 223: ifnull 23c
      // 226: goto 233
      // 229: ldc2_w -5997076938047693994
      // 22c: lload 3
      // 22d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: aload 14
      // 235: checkcast java/lang/Integer
      // 238: invokevirtual java/lang/Integer.intValue ()I
      // 23b: ireturn
      // 23c: new java/lang/IllegalArgumentException
      // 23f: dup
      // 240: new java/lang/StringBuilder
      // 243: dup
      // 244: invokespecial java/lang/StringBuilder.<init> ()V
      // 247: getstatic com/zelix/pr.e Ljava/lang/String;
      // 24a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24d: aload 0
      // 24e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 251: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 254: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 257: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 25a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 25d: athrow
   }

   public xe H(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return x44.a<"j">(this, 7706464855798268193L, var3)[var2];
   }

   public boolean I(Object[] param1) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/pr.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -5641803284440142420
      // 15: lload 2
      // 16: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w -5381027653980964726
      // 21: lload 2
      // 22: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 4
      // 29: ifnonnull 54
      // 2c: aload 0
      // 2d: ldc2_w -5684470224078904884
      // 30: lload 2
      // 31: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: if_icmpge 57
      // 39: goto 46
      // 3c: ldc2_w -5483405710435892105
      // 3f: lload 2
      // 40: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: goto 54
      // 4a: ldc2_w -5483405710435892105
      // 4d: lload 2
      // 4e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   public void P(Object[] var1) {
      xe[] var2 = (xe[])var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 125389032977697L;
      long var7 = var3 ^ 116692159941323L;
      x44.a<"h">(this, new Object[]{var2, var5}, 1479405014247097816L, var3);
      this.o();
      x44.a<"h">(this, new Object[]{var7}, 1042025731667683794L, var3);
   }

   static {
      long var0 = a ^ 79393367468014L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0016ìÕÙ\u0013x\u0010\u0092\u0092éÙ,r\u0092é\u0005\t\u0003ïqßE4Ð".getBytes("ISO-8859-1"));
      String var5 = c(var4).intern();
      byte var10001 = -1;
      e = var5;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
}
