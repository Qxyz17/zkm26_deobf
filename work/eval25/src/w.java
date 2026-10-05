package com.zelix;

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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class w implements ry {
   protected int j;
   protected int J;
   protected final boolean t;
   Map D;
   private static final long b = ess.a(-2016531477628424131L, -5826135763759494049L, MethodHandles.lookup().lookupClass()).a(267341796791668L);
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);

   public w(long var1) {
      var1 = b ^ var1;
      long var3 = var1 ^ 31476686554546L;
      this(var3, a<"r">(8968, 2270524908527369950L ^ var1), a<"r">(2089, 7391072665351984637L ^ var1));
   }

   public w(int param1, int param2, byte param3, int param4, boolean param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: i2l
      // 02: bipush 56
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 8
      // 0d: lushr
      // 0e: lor
      // 0f: iload 6
      // 11: i2l
      // 12: bipush 40
      // 14: lshl
      // 15: bipush 40
      // 17: lushr
      // 18: lor
      // 19: getstatic com/zelix/w.b J
      // 1c: lxor
      // 1d: lstore 7
      // 1f: lload 7
      // 21: dup2
      // 22: ldc2_w 41036730780807
      // 25: lxor
      // 26: lstore 9
      // 28: dup2
      // 29: ldc2_w 52887195720367
      // 2c: lxor
      // 2d: lstore 11
      // 2f: pop2
      // 30: ldc2_w -1774233090709520796
      // 33: lload 7
      // 35: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: aload 0
      // 3b: invokespecial java/lang/Object.<init> ()V
      // 3e: astore 13
      // 40: aload 0
      // 41: iload 1
      // 42: lload 9
      // 44: invokestatic com/zelix/sh.Q (IJ)I
      // 47: putfield com/zelix/w.j I
      // 4a: aload 0
      // 4b: iload 2
      // 4c: lload 9
      // 4e: invokestatic com/zelix/sh.Q (IJ)I
      // 51: putfield com/zelix/w.J I
      // 54: aload 0
      // 55: aload 13
      // 57: ifnonnull a3
      // 5a: iload 5
      // 5c: putfield com/zelix/w.t Z
      // 5f: iload 5
      // 61: ifeq 94
      // 64: goto 72
      // 67: ldc2_w -1882460885557847543
      // 6a: lload 7
      // 6c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 0
      // 73: new java/util/concurrent/ConcurrentHashMap
      // 76: dup
      // 77: aload 0
      // 78: getfield com/zelix/w.j I
      // 7b: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 7e: putfield com/zelix/w.D Ljava/util/Map;
      // 81: aload 13
      // 83: ifnull ce
      // 86: goto 94
      // 89: ldc2_w -1882460885557847543
      // 8c: lload 7
      // 8e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: aload 0
      // 95: goto a3
      // 98: ldc2_w -1882460885557847543
      // 9b: lload 7
      // 9d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: athrow
      // a3: aload 0
      // a4: aload 0
      // a5: getfield com/zelix/w.j I
      // a8: lload 11
      // aa: dup2_x1
      // ab: pop2
      // ac: bipush 2
      // ad: anewarray 97
      // b0: dup_x1
      // b1: swap
      // b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b5: bipush 1
      // b6: swap
      // b7: aastore
      // b8: dup_x2
      // b9: dup_x2
      // ba: pop
      // bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // be: bipush 0
      // bf: swap
      // c0: aastore
      // c1: ldc2_w -1947439553603808906
      // c4: lload 7
      // c6: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: putfield com/zelix/w.D Ljava/util/Map;
      // ce: return
   }

   public Set i(Object[] var1) {
      Object var2 = var1[0];
      Set var3 = (Set)var1[1];
      return this.D.put(var2, var3);
   }

   public Set W(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.D.keySet();
   }

   public w(long var1, int var3, int var4) {
      var1 = b ^ var1;
      long var10001 = var1 ^ 47462481756108L;
      int var5 = (int)((var1 ^ 47462481756108L) >>> 56);
      int var6 = (int)((var1 ^ 47462481756108L) << 8 >>> 32);
      int var7 = (int)(var10001 << 40 >>> 40);
      this(var3, var4, (byte)var5, var6, false, var7);
   }

   protected w(Map var1, int var2, int var3, long var4, boolean var6) {
      var4 = b ^ var4;
      long var7 = var4 ^ 109178597045533L;
      super();
      this.D = var1;
      this.j = sh.Q(var2, var7);
      this.J = sh.Q(var3, var7);
      this.t = var6;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean u(long var1, Object var3, Object var4) {
      long var5 = var1 ^ 70891701657513L;
      String var10000 = x44.a<"t">(-5173057499830378191L, var1);
      Set var9 = (Set)this.D.get(var3);
      String var7 = var10000;

      label44: {
         try {
            if (var7 != null) {
               return var9.add(var4);
            }

            if (var9 != null) {
               break label44;
            }
         } catch (gj var12) {
            throw x44.a<"t">(var12, -4993062383188277924L, var1);
         }

         var9 = this.i(this.J, var5);
         if (var1 <= 0L) {
            return var9.add(var4);
         }

         var9.add(var4);
         this.D.put(var3, var9);
         boolean var8 = true;

         try {
            if (var7 == null) {
               return var8;
            }
         } catch (gj var11) {
            boolean var10001 = false;
            throw x44.a<"t">(var11, -4993062383188277924L, var1);
         }
      }

      try {
         var13 = var9;
      } catch (gj var10) {
         boolean var15 = false;
         throw x44.a<"t">(var10, -4993062383188277924L, var1);
      }

      return var13.add(var4);
   }

   public boolean R(long var1, Object var3) {
      return this.D.containsKey(var3);
   }

   private void G(Object[] param1) {
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
      // 00f: checkcast java/util/Set
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 3
      // 01a: pop
      // 01b: getstatic com/zelix/w.b J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 6239905393926
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 91793489682813
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: ldc2_w 495827625556123621
      // 037: lload 4
      // 039: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: aload 0
      // 03f: getfield com/zelix/w.D Ljava/util/Map;
      // 042: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 047: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 04c: astore 11
      // 04e: astore 10
      // 050: aload 11
      // 052: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 057: ifeq 147
      // 05a: aload 11
      // 05c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 061: checkcast java/util/Map$Entry
      // 064: astore 12
      // 066: aload 12
      // 068: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 06d: astore 13
      // 06f: aload 12
      // 071: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 076: checkcast java/util/Set
      // 079: astore 14
      // 07b: aload 0
      // 07c: aload 14
      // 07e: invokeinterface java/util/Set.size ()I 1
      // 083: lload 6
      // 085: invokestatic com/zelix/sh.Q (IJ)I
      // 088: lload 8
      // 08a: invokevirtual com/zelix/w.i (IJ)Ljava/util/Set;
      // 08d: astore 15
      // 08f: aload 14
      // 091: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 096: astore 16
      // 098: aload 16
      // 09a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09f: ifeq 100
      // 0a2: aload 16
      // 0a4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a9: astore 17
      // 0ab: aload 2
      // 0ac: aload 17
      // 0ae: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0b3: lload 4
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: iflt 126
      // 0ba: aload 10
      // 0bc: ifnonnull 126
      // 0bf: aload 10
      // 0c1: ifnonnull 0fa
      // 0c4: goto 0d2
      // 0c7: ldc2_w 315541360496819080
      // 0ca: lload 4
      // 0cc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: ifeq 0fb
      // 0d5: goto 0e3
      // 0d8: ldc2_w 315541360496819080
      // 0db: lload 4
      // 0dd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 15
      // 0e5: aload 17
      // 0e7: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0ec: goto 0fa
      // 0ef: ldc2_w 315541360496819080
      // 0f2: lload 4
      // 0f4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: pop
      // 0fb: aload 10
      // 0fd: ifnull 098
      // 100: aload 15
      // 102: lload 4
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 0a9
      // 109: aload 10
      // 10b: ifnonnull 141
      // 10e: ldc2_w 2284676894877603861
      // 111: lload 4
      // 113: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: goto 126
      // 11b: ldc2_w 315541360496819080
      // 11e: lload 4
      // 120: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: ifne 142
      // 129: aload 3
      // 12a: aload 13
      // 12c: aload 15
      // 12e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 133: goto 141
      // 136: ldc2_w 315541360496819080
      // 139: lload 4
      // 13b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: pop
      // 142: aload 10
      // 144: ifnull 050
      // 147: return
   }

   public int F(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.D.size();
   }

   @Override
   public Object clone() {
      long var1 = b ^ 12190169583485L;
      long var3 = var1 ^ 65864604467993L;
      return x44.a<"l">(this, new Object[]{var3}, -3455550068654150722L, var1);
   }

   public Set O(Object[] var1) {
      return this.D.entrySet();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final _y4 L(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 65633713029840L;
      long var6 = var2 ^ 93438557356562L;
      String var10000 = x44.a<"p">(-6732387786496754795L, var2);
      int var9 = this.D.size();
      _y4 var10 = new _y4(var9 * 2 + 1, this.t, var6);
      String var8 = var10000;

      label109: {
         label117: {
            try {
               var25 = this;
               if (var8 != null) {
                  break label109;
               }

               if (!this.t) {
                  break label117;
               }
            } catch (gj var18) {
               throw x44.a<"p">(var18, -6912656741764390920L, var2);
            }

            synchronized (this.D) {
               label102:
               for (Entry var13 : this.D.entrySet()) {
                  try {
                     var10.v(var4, var13.getKey(), (Collection)var13.getValue());
                  } catch (gj var20) {
                     boolean var10001 = false;
                     throw x44.a<"p">(var20, -6912656741764390920L, var2);
                  }

                  while (true) {
                     try {
                        var10000 = var8;
                        if (var2 > 0L) {
                           if (var8 != null) {
                              break label102;
                           }

                           var10000 = var8;
                        }

                        if (var10000 == null) {
                           break;
                        }
                     } catch (gj var19) {
                        boolean var30 = false;
                        throw x44.a<"p">(var19, -6912656741764390920L, var2);
                     }

                     if (var2 > 0L) {
                        break label102;
                     }
                  }
               }
            }

            try {
               if (var8 == null) {
                  return var10;
               }
            } catch (gj var17) {
               boolean var31 = false;
               throw x44.a<"p">(var17, -6912656741764390920L, var2);
            }
         }

         try {
            var25 = this;
         } catch (gj var16) {
            boolean var32 = false;
            throw x44.a<"p">(var16, -6912656741764390920L, var2);
         }
      }

      label66:
      for (Entry var24 : var25.D.entrySet()) {
         do {
            try {
               Object var33 = var8;
               if (var2 >= 0L) {
                  if (var8 != null) {
                     return var10;
                  }

                  var33 = var24.getKey();
               }

               var10.v(var4, var33, (Collection)var24.getValue());
               if (var8 == null) {
                  continue label66;
               }
            } catch (gj var15) {
               throw x44.a<"p">(var15, -6912656741764390920L, var2);
            }
         } while (var2 <= 0L);

         return var10;
      }

      return var10;
   }

   public boolean L(Object[] param1) {
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
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Object
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: bipush 0
      // 1c: istore 7
      // 1e: ldc2_w 1499029251879341513
      // 21: lload 3
      // 22: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: aload 0
      // 28: getfield com/zelix/w.D Ljava/util/Map;
      // 2b: aload 5
      // 2d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 32: checkcast java/util/Set
      // 35: astore 8
      // 37: astore 6
      // 39: aload 8
      // 3b: lload 3
      // 3c: lconst_0
      // 3d: lcmp
      // 3e: iflt 62
      // 41: aload 6
      // 43: ifnonnull 62
      // 46: ifnull 95
      // 49: goto 56
      // 4c: ldc2_w 1606958795549976996
      // 4f: lload 3
      // 50: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: aload 8
      // 58: aload 2
      // 59: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 5e: istore 7
      // 60: aload 8
      // 62: invokeinterface java/util/Set.size ()I 1
      // 67: aload 6
      // 69: ifnonnull 97
      // 6c: ifne 95
      // 6f: goto 7c
      // 72: ldc2_w 1606958795549976996
      // 75: lload 3
      // 76: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: aload 0
      // 7d: getfield com/zelix/w.D Ljava/util/Map;
      // 80: aload 5
      // 82: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 87: pop
      // 88: goto 95
      // 8b: ldc2_w 1606958795549976996
      // 8e: lload 3
      // 8f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: iload 7
      // 97: ireturn
   }

   public boolean l(char param1, short param2, Object param3, Object param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 5
      // 10: i2l
      // 11: bipush 32
      // 13: lshl
      // 14: bipush 32
      // 16: lushr
      // 17: lor
      // 18: lstore 6
      // 1a: ldc2_w -393850449576074356
      // 1d: lload 6
      // 1f: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: getfield com/zelix/w.D Ljava/util/Map;
      // 28: aload 3
      // 29: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2e: checkcast java/util/Set
      // 31: astore 9
      // 33: astore 8
      // 35: aload 9
      // 37: aload 8
      // 39: ifnonnull 5c
      // 3c: ifnonnull 5a
      // 3f: goto 4d
      // 42: ldc2_w -574124627498776607
      // 45: lload 6
      // 47: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: bipush 0
      // 4e: ireturn
      // 4f: ldc2_w -574124627498776607
      // 52: lload 6
      // 54: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 9
      // 5c: aload 4
      // 5e: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 63: ireturn
   }

   public w(long var1, boolean var3) {
      var1 = b ^ var1;
      long var10001 = var1 ^ 96016076514073L;
      int var4 = (int)((var1 ^ 96016076514073L) >>> 56);
      int var5 = (int)((var1 ^ 96016076514073L) << 8 >>> 32);
      int var6 = (int)(var10001 << 40 >>> 40);
      this(a<"r">(22766, 912959698180214953L ^ var1), a<"r">(1190, 3567521415875382502L ^ var1), (byte)var4, var5, var3, var6);
   }

   public w H(Object[] param1) {
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
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 127769992815256
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 79009814788523
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 90983622780543
      // 01f: lxor
      // 020: lstore 8
      // 022: pop2
      // 023: ldc2_w -7904720122329134264
      // 026: lload 2
      // 027: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: aload 0
      // 02d: getfield com/zelix/w.D Ljava/util/Map;
      // 030: invokeinterface java/util/Map.size ()I 1
      // 035: istore 11
      // 037: new com/zelix/w
      // 03a: dup
      // 03b: iload 11
      // 03d: bipush 2
      // 03e: imul
      // 03f: bipush 1
      // 040: iadd
      // 041: lload 4
      // 043: dup2_x1
      // 044: pop2
      // 045: aload 0
      // 046: getfield com/zelix/w.t Z
      // 049: invokespecial com/zelix/w.<init> (JIZ)V
      // 04c: astore 12
      // 04e: astore 10
      // 050: aload 0
      // 051: getfield com/zelix/w.D Ljava/util/Map;
      // 054: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 059: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 05e: astore 13
      // 060: aload 13
      // 062: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 067: ifeq 132
      // 06a: aload 13
      // 06c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 071: checkcast java/util/Map$Entry
      // 074: astore 14
      // 076: aload 14
      // 078: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 07d: checkcast java/util/Set
      // 080: astore 15
      // 082: aload 15
      // 084: invokeinterface java/util/Set.size ()I 1
      // 089: lload 6
      // 08b: invokestatic com/zelix/sh.Q (IJ)I
      // 08e: istore 16
      // 090: aload 0
      // 091: aload 10
      // 093: ifnonnull 134
      // 096: getfield com/zelix/w.t Z
      // 099: aload 10
      // 09b: ifnonnull 0dc
      // 09e: goto 0ab
      // 0a1: ldc2_w -8012953473791119579
      // 0a4: lload 2
      // 0a5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: ifeq 0da
      // 0ae: goto 0bb
      // 0b1: ldc2_w -8012953473791119579
      // 0b4: lload 2
      // 0b5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: new java/util/concurrent/ConcurrentHashMap
      // 0be: dup
      // 0bf: iload 16
      // 0c1: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 0c4: ldc2_w -8277680168118597484
      // 0c7: lload 2
      // 0c8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: goto 0fe
      // 0d0: ldc2_w -8012953473791119579
      // 0d3: lload 2
      // 0d4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: iload 16
      // 0dc: lload 8
      // 0de: dup2_x1
      // 0df: pop2
      // 0e0: bipush 2
      // 0e1: anewarray 97
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e9: bipush 1
      // 0ea: swap
      // 0eb: aastore
      // 0ec: dup_x2
      // 0ed: dup_x2
      // 0ee: pop
      // 0ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f2: bipush 0
      // 0f3: swap
      // 0f4: aastore
      // 0f5: ldc2_w -7741106975449868922
      // 0f8: lload 2
      // 0f9: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: astore 17
      // 100: aload 17
      // 102: aload 15
      // 104: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 109: pop
      // 10a: aload 12
      // 10c: aload 14
      // 10e: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 113: aload 17
      // 115: bipush 2
      // 116: anewarray 97
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 1
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x1
      // 11f: swap
      // 120: bipush 0
      // 121: swap
      // 122: aastore
      // 123: ldc2_w -8237381192778684016
      // 126: lload 2
      // 127: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: pop
      // 12d: aload 10
      // 12f: ifnull 060
      // 132: aload 12
      // 134: areturn
   }

   public boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = x44.a<"u">(2581955633079859920L, var2);

      try {
         int var10000 = this.D.size();
         if (var4 != null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"u">(var5, 2401682338821512893L, var2);
      }

      return (boolean)0;
   }

   public w(int var1, byte var2, int var3, int var4) {
      long var5 = ((long)var2 << 56 | (long)var3 << 32 >>> 8 | (long)var4 << 40 >>> 40) ^ b;
      long var7 = var5 ^ 38802993926387L;
      this(var7, var1, a<"r">(1190, 3567507192480156722L ^ var5));
   }

   public Enumeration z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 111250623215527L;
      Set var7 = this.i(a<"r">(27692, 5197422853481970910L ^ var2), var4);
      String var10000 = x44.a<"r">(-3441947707204056769L, var2);
      Iterator var8 = this.D.entrySet().iterator();
      String var6 = var10000;

      label34:
      while (var8.hasNext()) {
         Entry var9 = (Entry)var8.next();
         Set var10 = (Set)var9.getValue();

         do {
            try {
               if (var2 > 0L) {
                  if (var6 != null) {
                     return Collections.enumeration(var7);
                  }

                  var7.addAll(var10);
               }

               if (var6 == null) {
                  continue label34;
               }
            } catch (gj var11) {
               throw x44.a<"r">(var11, -3261959213292458670L, var2);
            }
         } while (var2 <= 0L);
         break;
      }

      return Collections.enumeration(var7);
   }

   public List d(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      Set var5 = (Set)this.D.get(var2);

      try {
         return var5 != null ? new ArrayList((Collection)this.D.get(var2)) : null;
      } catch (gj var6) {
         throw x44.a<"w">(var6, -2092392538140320481L, var3);
      }
   }

   Map J(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 2
      // 15: pop
      // 16: lload 3
      // 17: dup2
      // 18: ldc2_w 91672502443955
      // 1b: lxor
      // 1c: lstore 5
      // 1e: pop2
      // 1f: ldc2_w 9065632245024318667
      // 22: lload 3
      // 23: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: astore 7
      // 2a: aload 0
      // 2b: getfield com/zelix/w.t Z
      // 2e: aload 7
      // 30: ifnonnull 57
      // 33: ifeq 56
      // 36: goto 43
      // 39: ldc2_w 9173577172227604646
      // 3c: lload 3
      // 3d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: new java/util/concurrent/ConcurrentHashMap
      // 46: dup
      // 47: iload 2
      // 48: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 4b: areturn
      // 4c: ldc2_w 9173577172227604646
      // 4f: lload 3
      // 50: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: iload 2
      // 57: lload 5
      // 59: bipush 2
      // 5a: anewarray 97
      // 5d: dup_x2
      // 5e: dup_x2
      // 5f: pop
      // 60: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 63: bipush 1
      // 64: swap
      // 65: aastore
      // 66: dup_x1
      // 67: swap
      // 68: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6b: bipush 0
      // 6c: swap
      // 6d: aastore
      // 6e: ldc2_w 7039343124410951171
      // 71: lload 3
      // 72: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: areturn
   }

   public Enumeration D(Object[] var1) {
      long var2 = (Long)var1[0];
      return Collections.enumeration(this.D.keySet());
   }

   public void k(Object[] var1) {
      long var2 = (Long)var1[0];
      this.D.clear();
   }

   public Set N(long var1, Object var3) {
      return (Set)this.D.get(var3);
   }

   public w(long var1, int var3, boolean var4) {
      var1 = b ^ var1;
      long var10001 = var1 ^ 25004112320436L;
      int var5 = (int)((var1 ^ 25004112320436L) >>> 56);
      int var6 = (int)((var1 ^ 25004112320436L) << 8 >>> 32);
      int var7 = (int)(var10001 << 40 >>> 40);
      this(var3, a<"r">(1190, 3567449302349412427L ^ var1), (byte)var5, var6, var4, var7);
   }

   public Set I(Object[] var1) {
      long var3 = (Long)var1[0];
      Object var2 = var1[1];
      return (Set)this.D.remove(var2);
   }

   Set i(int param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 74443065250735
      // 05: lxor
      // 06: lstore 4
      // 08: pop2
      // 09: ldc2_w 7466084060566224536
      // 0c: lload 2
      // 0d: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: astore 6
      // 14: aload 0
      // 15: getfield com/zelix/w.t Z
      // 18: aload 6
      // 1a: ifnonnull 4a
      // 1d: ifeq 49
      // 20: goto 2d
      // 23: ldc2_w 7285790992337427189
      // 26: lload 2
      // 27: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: athrow
      // 2d: new java/util/concurrent/ConcurrentHashMap
      // 30: dup
      // 31: iload 1
      // 32: invokespecial java/util/concurrent/ConcurrentHashMap.<init> (I)V
      // 35: ldc2_w 8705410478988279108
      // 38: lload 2
      // 39: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: areturn
      // 3f: ldc2_w 7285790992337427189
      // 42: lload 2
      // 43: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: iload 1
      // 4a: lload 4
      // 4c: dup2_x1
      // 4d: pop2
      // 4e: bipush 2
      // 4f: anewarray 97
      // 52: dup_x1
      // 53: swap
      // 54: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 57: bipush 1
      // 58: swap
      // 59: aastore
      // 5a: dup_x2
      // 5b: dup_x2
      // 5c: pop
      // 5d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 60: bipush 0
      // 61: swap
      // 62: aastore
      // 63: ldc2_w 7008165289618759766
      // 66: lload 2
      // 67: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void X(Object[] var1) {
      long var3 = (Long)var1[0];
      Object[] var2 = (Object[])var1[1];
      long var5 = var3 ^ 120624497603552L;
      long var7 = var3 ^ 2314407449108L;
      long var9 = var3 ^ 25834162916800L;
      long var11 = var3 ^ 25638877414460L;
      String var10000 = x44.a<"r">(4175838712488141047L, var3);
      Object[] var10004 = new Object[]{null, sh.Q(var2.length, var7)};
      var10004[0] = var9;
      HashSet var14 = x44.a<"r">(var10004, 4552389328065379897L, var3);
      String var13 = var10000;
      Object[] var15 = var2;
      int var16 = var2.length;
      int var17 = 0;

      while (true) {
         if (var17 < var16) {
            Object var18 = var15[var17];
            boolean var19 = var14.add(var18);
            var17++;
            if (var13 == null) {
               continue;
            }
         }

         do {
            var10004 = new Object[]{null, sh.Q(this.D.size(), var7)};
            var10004[0] = var11;
            Map var27 = x44.a<"j">(this, var10004, 4209292538337267685L, var3);
            if (var3 > 0L) {
               Map var23 = var27;

               label37: {
                  label53: {
                     label35: {
                        try {
                           var28 = this;
                           if (var13 != null) {
                              break label53;
                           }

                           if (this.t) {
                              break label35;
                           }
                        } catch (gj var22) {
                           throw x44.a<"r">(var22, 4283768237938443418L, var3);
                        }

                        var28 = this;
                        break label53;
                     }

                     synchronized (this.D) {
                        x44.a<"l">(this, new Object[]{var5, var14, var23}, 2306164021511627567L, var3);
                        break label37;
                     }
                  }

                  x44.a<"l">(var28, new Object[]{var5, var14, var23}, 2306164021511627567L, var3);
               }

               this.D = var23;
               return;
            }

            Map var25 = var27;
            boolean var26 = var14.add(var25);
            var17++;
         } while (var13 == null);
      }
   }

   public void q(Object[] var1) {
      Object var5 = var1[0];
      long var2 = (Long)var1[1];
      Collection var4 = (Collection)var1[2];
      var2 = b ^ var2;
      long var6 = var2 ^ 107726325955185L;
      String var8 = x44.a<"u">(-9059841237144265920L, var2);

      Collection var10000;
      label28: {
         try {
            var10000 = var4;
            if (var8 != null) {
               break label28;
            }

            if (var4 == null) {
               return;
            }
         } catch (gj var11) {
            throw x44.a<"u">(var11, -9168073411751657683L, var2);
         }

         var10000 = var4;
      }

      for (Object var10 : var10000) {
         this.u(var6, var5, var10);
         if (var8 != null) {
            break;
         }
      }
   }

   static {
      long var0 = b ^ 65097439848901L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[5];
      int var5 = 0;
      String var6 = "F\u0014$\u0092@ç\u0089jÙ»¨~&O\u0012Uí\u007fÒÙ¹Ìb\u0098";
      int var7 = "F\u0014$\u0092@ç\u0089jÙ»¨~&O\u0012Uí\u007fÒÙ¹Ìb\u0098".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)((int)(var10 >>> 56)),
                  (byte)((int)(var10 >>> 48)),
                  (byte)((int)(var10 >>> 40)),
                  (byte)((int)(var10 >>> 32)),
                  (byte)((int)(var10 >>> 24)),
                  (byte)((int)(var10 >>> 16)),
                  (byte)((int)(var10 >>> 8)),
                  (byte)((int)var10)
               }
            );
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     c = var8;
                     d = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "ð\u0000U#*üN\u001f¤\u0095ùï\u0080íÌ¢";
                  var7 = "ð\u0000U#*üN\u001f¤\u0095ùï\u0080íÌ¢".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj b(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4626;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = c[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/w", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/w" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
