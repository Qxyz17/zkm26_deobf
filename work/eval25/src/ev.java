package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ev {
   private final Map o;
   private static final long a = ess.a(6485316827735851389L, 4743624641354545205L, MethodHandles.lookup().lookupClass()).a(17835539505178L);

   public Set o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 90645063575126L;
      String var10000 = x44.a<"w">(4079875183124423066L, var2);
      HashSet var7 = x44.a<"w">(new Object[]{var4}, 2761427513259634590L, var2);
      String var6 = var10000;

      for (Entry var9 : x44.a<"k">(this, 2822687491479424644L, var2).entrySet()) {
         do {
            try {
               Object var10001 = var6;
               if (var2 > 0L) {
                  if (var6 != null) {
                     return var7;
                  }

                  var10001 = var9.getValue();
               }

               var7.add(var10001);
               if (var6 == null) {
                  break;
               }
            } catch (gj var10) {
               throw x44.a<"w">(var10, 4086392136166789346L, var2);
            }
         } while (var2 <= 0L);
         break;
      }

      return var7;
   }

   public boolean U(Object[] var1) {
      long var2 = (Long)var1[0];
      Object var4 = var1[1];
      var2 = a ^ var2;
      return x44.a<"o">(this, 5172419172295880288L, var2).containsKey(var4);
   }

   public ev(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 43071911093177L;
      super();
      this.o = x44.a<"q">(new Object[]{var3}, -5889149526664722390L, var1);
   }

   public _86 v(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return (_86)x44.a<"m">(this, -8959313448917112318L, var3).get(var2);
   }

   public Set a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"q">(x44.a<"m">(this, 3333295803137116138L, var2).entrySet(), 3925649000203144662L, var2);
   }

   public Set h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"p">(x44.a<"l">(this, 4797224368072469307L, var2).keySet(), 6533491664046956807L, var2);
   }

   public void i(Object[] param1) {
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
      // 004: checkcast java/lang/Object
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
      // 016: checkcast java/lang/Object
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/ev.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 50977735954985
      // 026: lxor
      // 027: lstore 6
      // 029: pop2
      // 02a: ldc2_w 8989622166541788613
      // 02d: lload 3
      // 02e: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: aload 0
      // 034: ldc2_w 7166104652276206299
      // 037: lload 3
      // 038: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 5
      // 03f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 044: checkcast com/zelix/_86
      // 047: astore 9
      // 049: astore 8
      // 04b: aload 0
      // 04c: ldc2_w 7166104652276206299
      // 04f: lload 3
      // 050: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: aload 2
      // 056: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 05b: checkcast com/zelix/_86
      // 05e: astore 10
      // 060: aload 9
      // 062: aload 8
      // 064: ifnonnull 108
      // 067: ifnonnull 0f9
      // 06a: goto 077
      // 06d: ldc2_w 9001264746469037245
      // 070: lload 3
      // 071: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 10
      // 079: aload 8
      // 07b: lload 3
      // 07c: lconst_0
      // 07d: lcmp
      // 07e: iflt 10a
      // 081: ifnonnull 108
      // 084: goto 091
      // 087: ldc2_w 9001264746469037245
      // 08a: lload 3
      // 08b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: ifnonnull 0f9
      // 094: goto 0a1
      // 097: ldc2_w 9001264746469037245
      // 09a: lload 3
      // 09b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: new com/zelix/_86
      // 0a4: dup
      // 0a5: lload 6
      // 0a7: invokespecial com/zelix/_86.<init> (J)V
      // 0aa: astore 11
      // 0ac: aload 11
      // 0ae: aload 5
      // 0b0: ldc2_w 9196705224632675338
      // 0b3: lload 3
      // 0b4: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: pop
      // 0ba: aload 11
      // 0bc: lload 3
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: ifle 0fb
      // 0c2: aload 2
      // 0c3: ldc2_w 9196705224632675338
      // 0c6: lload 3
      // 0c7: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: pop
      // 0cd: aload 0
      // 0ce: ldc2_w 7166104652276206299
      // 0d1: lload 3
      // 0d2: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: aload 5
      // 0d9: aload 11
      // 0db: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e0: pop
      // 0e1: aload 0
      // 0e2: ldc2_w 7166104652276206299
      // 0e5: lload 3
      // 0e6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: aload 2
      // 0ec: aload 11
      // 0ee: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0f3: pop
      // 0f4: aload 8
      // 0f6: ifnull 248
      // 0f9: aload 9
      // 0fb: goto 108
      // 0fe: ldc2_w 9001264746469037245
      // 101: lload 3
      // 102: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 8
      // 10a: ifnonnull 1d2
      // 10d: ifnull 1c3
      // 110: goto 11d
      // 113: ldc2_w 9001264746469037245
      // 116: lload 3
      // 117: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: aload 10
      // 11f: aload 8
      // 121: lload 3
      // 122: lconst_0
      // 123: lcmp
      // 124: iflt 1d4
      // 127: ifnonnull 1d2
      // 12a: goto 137
      // 12d: ldc2_w 9001264746469037245
      // 130: lload 3
      // 131: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: ifnull 1c3
      // 13a: goto 147
      // 13d: ldc2_w 9001264746469037245
      // 140: lload 3
      // 141: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: aload 10
      // 149: ldc2_w 8943834221792307249
      // 14c: lload 3
      // 14d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: astore 11
      // 154: aload 11
      // 156: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15b: ifeq 1b0
      // 15e: aload 11
      // 160: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 165: astore 12
      // 167: aload 0
      // 168: ldc2_w 7166104652276206299
      // 16b: lload 3
      // 16c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: aload 12
      // 173: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 178: pop
      // 179: aload 0
      // 17a: ldc2_w 7166104652276206299
      // 17d: lload 3
      // 17e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: aload 12
      // 185: aload 9
      // 187: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 18c: pop
      // 18d: aload 8
      // 18f: lload 3
      // 190: lconst_0
      // 191: lcmp
      // 192: ifle 1c0
      // 195: ifnonnull 1be
      // 198: aload 8
      // 19a: ifnull 154
      // 19d: lload 3
      // 19e: lconst_0
      // 19f: lcmp
      // 1a0: ifle 18d
      // 1a3: goto 1b0
      // 1a6: ldc2_w 9001264746469037245
      // 1a9: lload 3
      // 1aa: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: athrow
      // 1b0: aload 9
      // 1b2: aload 10
      // 1b4: ldc2_w 8686839022160125741
      // 1b7: lload 3
      // 1b8: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: pop
      // 1be: aload 8
      // 1c0: ifnull 248
      // 1c3: aload 9
      // 1c5: goto 1d2
      // 1c8: ldc2_w 9001264746469037245
      // 1cb: lload 3
      // 1cc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: aload 8
      // 1d4: ifnonnull 247
      // 1d7: ifnull 219
      // 1da: goto 1e7
      // 1dd: ldc2_w 9001264746469037245
      // 1e0: lload 3
      // 1e1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: athrow
      // 1e7: aload 9
      // 1e9: aload 2
      // 1ea: ldc2_w 9196705224632675338
      // 1ed: lload 3
      // 1ee: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: pop
      // 1f4: aload 0
      // 1f5: ldc2_w 7166104652276206299
      // 1f8: lload 3
      // 1f9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: aload 2
      // 1ff: aload 9
      // 201: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 206: pop
      // 207: aload 8
      // 209: ifnull 248
      // 20c: goto 219
      // 20f: ldc2_w 9001264746469037245
      // 212: lload 3
      // 213: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: athrow
      // 219: aload 10
      // 21b: aload 5
      // 21d: ldc2_w 9196705224632675338
      // 220: lload 3
      // 221: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: pop
      // 227: aload 0
      // 228: ldc2_w 7166104652276206299
      // 22b: lload 3
      // 22c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: aload 5
      // 233: aload 10
      // 235: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 23a: goto 247
      // 23d: ldc2_w 9001264746469037245
      // 240: lload 3
      // 241: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: athrow
      // 247: pop
      // 248: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
