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
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class w9 implements Serializable, Map {
   private Map H;
   private List a;
   private static final long b = ess.a(5421312557558082377L, 4144681856198870197L, MethodHandles.lookup().lookupClass()).a(265924748505725L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   @Override
   public synchronized void putAll(Map var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int size() {
      long var1 = b ^ 4007587824269L;
      return x44.a<"h">(this, -5015580394152377153L, var1).size();
   }

   public synchronized Enumeration z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 108429192903371L;
      return Collections.enumeration(x44.a<"o">(this, new Object[]{var4}, 5850800161313831373L, var2));
   }

   public w9(long var1, int var3) {
      var1 = b ^ var1;
      long var4 = var1 ^ 30765754225324L;
      long var6 = var1 ^ 103149115988791L;
      super();
      int var10001 = sh.Q(var3, var6);
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var10001;
      x44.a<"r">(this, x44.a<"q">(var10004, -1391737777062548708L, var1), -1716873050537427601L, var1);
      x44.a<"r">(this, new ArrayList(var3), -993031615430390558L, var1);
   }

   private List b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      int var5 = x44.a<"l">(this, 148917184265714891L, var2).size();
      String var10000 = x44.a<"p">(70320948451613181L, var2);
      ArrayList var6 = new ArrayList();
      String var4 = var10000;
      int var7 = 0;

      label34:
      while (var7 < var5) {
         wo var8 = (wo)x44.a<"l">(this, 148917184265714891L, var2).get(var7);

         do {
            try {
               Object var10001 = var4;
               if (var2 > 0L) {
                  if (var4 != null) {
                     return var6;
                  }

                  var10001 = var8.v();
               }

               var6.add(var10001);
               var7++;
               if (var4 == null) {
                  continue label34;
               }
            } catch (IllegalArgumentException var9) {
               throw x44.a<"p">(var9, 481081264951538090L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var6;
   }

   @Override
   public synchronized Collection values() {
      long var1 = b ^ 36144559243665L;
      long var3 = var1 ^ 135420772547869L;
      return x44.a<"n">(this, new Object[]{var3}, -5184094087547868606L, var1);
   }

   @Override
   public boolean isEmpty() {
      long var1 = b ^ 76752520989477L;
      return x44.a<"l">(x44.a<"h">(this, 3015485752072518810L, var1), 3594850563998029375L, var1);
   }

   public synchronized Object b(Object[] param1) {
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
      // 00a: istore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Object
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Object
      // 018: astore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Long
      // 020: invokevirtual java/lang/Long.longValue ()J
      // 023: lstore 5
      // 025: pop
      // 026: getstatic com/zelix/w9.b J
      // 029: lload 5
      // 02b: lxor
      // 02c: lstore 5
      // 02e: lload 5
      // 030: dup2
      // 031: ldc2_w 109386049116388
      // 034: lxor
      // 035: dup2
      // 036: bipush 48
      // 038: lushr
      // 039: l2i
      // 03a: istore 7
      // 03c: dup2
      // 03d: bipush 16
      // 03f: lshl
      // 040: bipush 32
      // 042: lushr
      // 043: l2i
      // 044: istore 8
      // 046: dup2
      // 047: bipush 48
      // 049: lshl
      // 04a: bipush 48
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 9
      // 050: pop2
      // 051: pop2
      // 052: ldc2_w 1258910088797489276
      // 055: lload 5
      // 057: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: astore 10
      // 05e: iload 3
      // 05f: aload 10
      // 061: ifnonnull 076
      // 064: iflt 0a3
      // 067: goto 075
      // 06a: ldc2_w 1669846268104155179
      // 06d: lload 5
      // 06f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: athrow
      // 075: iload 3
      // 076: aload 10
      // 078: lload 5
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: iflt 113
      // 07f: ifnonnull 10a
      // 082: aload 0
      // 083: ldc2_w 1409723346627587402
      // 086: lload 5
      // 088: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: invokeinterface java/util/List.size ()I 1
      // 092: if_icmplt 0f9
      // 095: goto 0a3
      // 098: ldc2_w 1669846268104155179
      // 09b: lload 5
      // 09d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: new java/lang/IllegalArgumentException
      // 0a6: dup
      // 0a7: new java/lang/StringBuilder
      // 0aa: dup
      // 0ab: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ae: sipush 24148
      // 0b1: ldc2_w 6992591096706318649
      // 0b4: lload 5
      // 0b6: lxor
      // 0b7: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/w9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: iload 3
      // 0c0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c3: sipush 5641
      // 0c6: ldc2_w 8248137441515014502
      // 0c9: lload 5
      // 0cb: lxor
      // 0cc: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/w9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d4: aload 0
      // 0d5: ldc2_w 1409723346627587402
      // 0d8: lload 5
      // 0da: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokeinterface java/util/List.size ()I 1
      // 0e4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ea: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ed: athrow
      // 0ee: ldc2_w 1669846268104155179
      // 0f1: lload 5
      // 0f3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: ldc2_w 685723506826255559
      // 0fd: lload 5
      // 0ff: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: aload 2
      // 105: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 10a: lload 5
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: ifle 170
      // 111: aload 10
      // 113: ifnonnull 170
      // 116: ifeq 1c5
      // 119: goto 127
      // 11c: ldc2_w 1669846268104155179
      // 11f: lload 5
      // 121: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 0
      // 128: ldc2_w 685723506826255559
      // 12b: lload 5
      // 12d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: aload 2
      // 133: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 138: checkcast com/zelix/wo
      // 13b: aload 10
      // 13d: ifnonnull 198
      // 140: goto 14e
      // 143: ldc2_w 1669846268104155179
      // 146: lload 5
      // 148: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 0
      // 14f: ldc2_w 1409723346627587402
      // 152: lload 5
      // 154: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: iload 3
      // 15a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 15f: invokevirtual com/zelix/wo.equals (Ljava/lang/Object;)Z
      // 162: goto 170
      // 165: ldc2_w 1669846268104155179
      // 168: lload 5
      // 16a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: athrow
      // 170: ifeq 199
      // 173: aload 0
      // 174: ldc2_w 1409723346627587402
      // 177: lload 5
      // 179: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: iload 3
      // 17f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 184: checkcast com/zelix/wo
      // 187: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 18a: goto 198
      // 18d: ldc2_w 1669846268104155179
      // 190: lload 5
      // 192: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: areturn
      // 199: new java/lang/IllegalArgumentException
      // 19c: dup
      // 19d: new java/lang/StringBuilder
      // 1a0: dup
      // 1a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a4: ldc "'"
      // 1a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a9: aload 2
      // 1aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1ad: sipush 24722
      // 1b0: ldc2_w 1431023513126076409
      // 1b3: lload 5
      // 1b5: lxor
      // 1b6: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/w9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c1: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 1c4: athrow
      // 1c5: new com/zelix/wo
      // 1c8: dup
      // 1c9: iload 7
      // 1cb: i2s
      // 1cc: aload 2
      // 1cd: iload 8
      // 1cf: iload 9
      // 1d1: i2s
      // 1d2: aload 4
      // 1d4: invokespecial com/zelix/wo.<init> (SLjava/lang/Object;ISLjava/lang/Object;)V
      // 1d7: astore 11
      // 1d9: aload 0
      // 1da: ldc2_w 1409723346627587402
      // 1dd: lload 5
      // 1df: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: iload 3
      // 1e5: aload 11
      // 1e7: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 1ec: checkcast com/zelix/wo
      // 1ef: astore 12
      // 1f1: aload 0
      // 1f2: ldc2_w 685723506826255559
      // 1f5: lload 5
      // 1f7: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: aload 12
      // 1fe: invokevirtual com/zelix/wo.v ()Ljava/lang/Object;
      // 201: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 206: checkcast com/zelix/wo
      // 209: astore 13
      // 20b: aload 0
      // 20c: ldc2_w 685723506826255559
      // 20f: lload 5
      // 211: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: aload 2
      // 217: aload 11
      // 219: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 21e: pop
      // 21f: aload 13
      // 221: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 224: areturn
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
      // 00: getstatic com/zelix/w9.b J
      // 03: ldc2_w 73315301127166
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 720170065955131642
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aload 0
      // 12: ldc2_w 798919715434132940
      // 15: lload 2
      // 16: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: invokeinterface java/util/List.size ()I 1
      // 20: istore 5
      // 22: bipush 0
      // 23: istore 6
      // 25: astore 4
      // 27: iload 6
      // 29: iload 5
      // 2b: if_icmpge 88
      // 2e: aload 0
      // 2f: ldc2_w 798919715434132940
      // 32: lload 2
      // 33: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: iload 6
      // 3a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3f: checkcast com/zelix/wo
      // 42: astore 7
      // 44: aload 4
      // 46: ifnonnull 83
      // 49: aload 7
      // 4b: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 4e: aload 1
      // 4f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 52: aload 4
      // 54: ifnonnull 89
      // 57: goto 64
      // 5a: ldc2_w 1128853748556380333
      // 5d: lload 2
      // 5e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: ifeq 80
      // 67: goto 74
      // 6a: ldc2_w 1128853748556380333
      // 6d: lload 2
      // 6e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: bipush 1
      // 75: ireturn
      // 76: ldc2_w 1128853748556380333
      // 79: lload 2
      // 7a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: iinc 6 1
      // 83: aload 4
      // 85: ifnull 27
      // 88: bipush 0
      // 89: ireturn
   }

   public int Q(Object[] param1) {
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
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/w9.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -8441203537078545442
      // 1d: lload 2
      // 1e: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 5
      // 25: aload 0
      // 26: ldc2_w -7915511820163217563
      // 29: lload 2
      // 2a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: aload 4
      // 31: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 36: aload 5
      // 38: ifnonnull c9
      // 3b: ifeq c8
      // 3e: goto 4b
      // 41: ldc2_w -8318673802919953527
      // 44: lload 2
      // 45: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 0
      // 4c: ldc2_w -8632826543518222616
      // 4f: lload 2
      // 50: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: invokeinterface java/util/List.size ()I 1
      // 5a: istore 6
      // 5c: bipush 0
      // 5d: istore 7
      // 5f: iload 7
      // 61: iload 6
      // 63: if_icmpge c8
      // 66: aload 0
      // 67: ldc2_w -8632826543518222616
      // 6a: lload 2
      // 6b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: iload 7
      // 72: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 77: checkcast com/zelix/wo
      // 7a: astore 8
      // 7c: aload 5
      // 7e: lload 2
      // 7f: lconst_0
      // 80: lcmp
      // 81: iflt c5
      // 84: ifnonnull c3
      // 87: aload 8
      // 89: invokevirtual com/zelix/wo.v ()Ljava/lang/Object;
      // 8c: aload 4
      // 8e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 91: aload 5
      // 93: ifnonnull c9
      // 96: goto a3
      // 99: ldc2_w -8318673802919953527
      // 9c: lload 2
      // 9d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: athrow
      // a3: ifeq c0
      // a6: goto b3
      // a9: ldc2_w -8318673802919953527
      // ac: lload 2
      // ad: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: iload 7
      // b5: ireturn
      // b6: ldc2_w -8318673802919953527
      // b9: lload 2
      // ba: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: athrow
      // c0: iinc 7 1
      // c3: aload 5
      // c5: ifnull 5f
      // c8: bipush -1
      // c9: ireturn
   }

   @Override
   public synchronized Set keySet() {
      long var1 = b ^ 30970018389698L;
      return x44.a<"s">(x44.a<"o">(this, 4341032108870248829L, var1).keySet(), 2542504067521501412L, var1);
   }

   @Override
   public synchronized boolean containsKey(Object var1) {
      long var2 = b ^ 7599028994948L;
      return x44.a<"i">(this, 7023481780050850875L, var2).containsKey(var1);
   }

   @Override
   public synchronized Object clone() {
      long var1 = b ^ 127244663848125L;
      long var3 = var1 ^ 19811049671923L;
      return new w9(var3, this);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public synchronized Object put(Object var1, Object var2) {
      long var3 = b ^ 4035344308655L;
      long var10001 = var3 ^ 35924523002419L;
      int var5 = (int)((var3 ^ 35924523002419L) >>> 48);
      int var6 = (int)((var3 ^ 35924523002419L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      String var10000 = x44.a<"v">(7183188485184518827L, var3);
      Object var9 = null;
      String var8 = var10000;
      wo var10 = (wo)x44.a<"j">(this, 8886567664960728592L, var3).get(var1);

      label41: {
         try {
            if (var8 != null) {
               return var10;
            }

            if (var10 != null) {
               break label41;
            }
         } catch (IllegalArgumentException var13) {
            throw x44.a<"v">(var13, 7348537059044971260L, var3);
         }

         var10 = new wo((short)var5, var1, var6, (short)var7, var2);

         try {
            x44.a<"j">(this, 8886567664960728592L, var3).put(var1, var10);
            x44.a<"j">(this, 7009593584696991645L, var3).add(var10);
            if (var8 == null) {
               return var9;
            }
         } catch (IllegalArgumentException var12) {
            boolean var16 = false;
            throw x44.a<"v">(var12, 7348537059044971260L, var3);
         }
      }

      try {
         var10000 = (String)x44.a<"n">(var10, new Object[]{var2}, 7222609596374780396L, var3);
      } catch (IllegalArgumentException var11) {
         boolean var17 = false;
         throw x44.a<"v">(var11, 7348537059044971260L, var3);
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public synchronized Object k(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      String var5 = x44.a<"w">(-7960408004595251070L, var2);

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
                  throw x44.a<"w">(var10, -7506934039692009259L, var2);
               }

               var10000 = var4;
            }

            try {
               if (var10000 < x44.a<"k">(this, -7823270436018491980L, var2).size()) {
                  break label41;
               }
            } catch (IllegalArgumentException var9) {
               boolean var10001 = false;
               throw x44.a<"w">(var9, -7506934039692009259L, var2);
            }
         }

         try {
            throw new IllegalArgumentException(
               a<"y">(24148, 6992634034501173703L ^ var2)
                  + var4
                  + a<"y">(5641, 8248125408157403544L ^ var2)
                  + x44.a<"k">(this, -7823270436018491980L, var2).size()
            );
         } catch (IllegalArgumentException var8) {
            boolean var13 = false;
            throw x44.a<"w">(var8, -7506934039692009259L, var2);
         }
      }

      wo var6 = (wo)x44.a<"k">(this, -7823270436018491980L, var2).remove(var4);
      wo var7 = (wo)x44.a<"k">(this, -8540422536595170247L, var2).remove(var6.v());
      return var7.G();
   }

   private List r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      String var10000 = x44.a<"w">(-5884291657303279790L, var2);
      int var5 = x44.a<"k">(this, -5999340003073371548L, var2).size();
      ArrayList var6 = new ArrayList();
      String var4 = var10000;
      int var7 = 0;

      label34:
      while (var7 < var5) {
         wo var8 = (wo)x44.a<"k">(this, -5999340003073371548L, var2).get(var7);

         do {
            try {
               Object var10001 = var4;
               if (var2 >= 0L) {
                  if (var4 != null) {
                     return var6;
                  }

                  var10001 = var8.G();
               }

               var6.add(var10001);
               var7++;
               if (var4 == null) {
                  continue label34;
               }
            } catch (IllegalArgumentException var9) {
               throw x44.a<"w">(var9, -6340439686026715387L, var2);
            }
         } while (var2 < 0L);
         break;
      }

      return var6;
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
      // 00: getstatic com/zelix/w9.b J
      // 03: ldc2_w 66117360191696
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 8273376775533128660
      // 0b: lload 2
      // 0c: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aload 0
      // 12: ldc2_w 7650579738766081903
      // 15: lload 2
      // 16: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aload 1
      // 1c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 21: checkcast com/zelix/wo
      // 24: astore 5
      // 26: astore 4
      // 28: aload 5
      // 2a: aload 4
      // 2c: ifnonnull 50
      // 2f: ifnonnull 4b
      // 32: goto 3f
      // 35: ldc2_w 8395835661020316547
      // 38: lload 2
      // 39: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aconst_null
      // 40: areturn
      // 41: ldc2_w 8395835661020316547
      // 44: lload 2
      // 45: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 5
      // 4d: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 50: areturn
   }

   public w9(long var1) {
      var1 = b ^ var1;
      long var3 = var1 ^ 84114093426414L;
      super();
      x44.a<"u">(this, x44.a<"v">(new Object[]{var3}, -8425423355810648707L, var1), -8125846183091955080L, var1);
      x44.a<"u">(this, new ArrayList(), -7696849685325321227L, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public w9(long var1, w9 var3) {
      var1 = b ^ var1;
      long var4 = var1 ^ 137639661009566L;
      long var10001 = var1 ^ 33881640938248L;
      int var6 = (int)((var1 ^ 33881640938248L) >>> 48);
      int var7 = (int)((var1 ^ 33881640938248L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      String var10000 = x44.a<"u">(-2119803844260267120L, var1);
      this(var4, var3.size());
      String var9 = var10000;
      synchronized (var3) {
         int var11 = x44.a<"m">(var3, -316605049017568190L, var1);
         int var12 = 0;

         label48:
         while (var12 < var11) {
            wo var13 = (wo)x44.a<"i">(var3, -2270893628056789338L, var1).get(var12);
            Object var14 = var13.v();
            Object var15 = var13.G();
            wo var16 = new wo((short)var6, var14, var7, (short)var8, var15);

            try {
               x44.a<"i">(this, -402983889146581205L, var1).put(var14, var16);
               x44.a<"i">(this, -2270893628056789338L, var1).add(var16);
               var12++;
            } catch (IllegalArgumentException var19) {
               boolean var24 = false;
               throw x44.a<"u">(var19, -1963567265816652857L, var1);
            }

            do {
               try {
                  var10000 = var9;
                  if (var1 >= 0L) {
                     if (var9 != null) {
                        return;
                     }

                     var10000 = var9;
                  }

                  if (var10000 == null) {
                     continue label48;
                  }
               } catch (IllegalArgumentException var18) {
                  boolean var25 = false;
                  throw x44.a<"u">(var18, -1963567265816652857L, var1);
               }
            } while (var1 < 0L);

            return;
         }
      }
   }

   @Override
   public synchronized void clear() {
      long var1 = b ^ 4088334237395L;
      x44.a<"n">(this, 6642649098312927596L, var1).clear();
      x44.a<"n">(this, 5060660761824508129L, var1).clear();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public synchronized Object v(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = b ^ var3;
      String var5 = x44.a<"q">(720784582936105732L, var3);

      label41: {
         label33: {
            int var10000;
            label32: {
               try {
                  var10000 = var2;
                  if (var5 != null) {
                     break label32;
                  }

                  if (var2 < 0) {
                     break label33;
                  }
               } catch (IllegalArgumentException var9) {
                  throw x44.a<"q">(var9, 888420347103034195L, var3);
               }

               var10000 = var2;
            }

            try {
               if (var10000 < x44.a<"m">(this, 641875260510959154L, var3).size()) {
                  break label41;
               }
            } catch (IllegalArgumentException var8) {
               boolean var10001 = false;
               throw x44.a<"q">(var8, 888420347103034195L, var3);
            }
         }

         try {
            throw new IllegalArgumentException(
               a<"y">(288, 938103189870839094L ^ var3) + var2 + a<"y">(1338, 5838431306857873710L ^ var3) + x44.a<"m">(this, 641875260510959154L, var3).size()
            );
         } catch (IllegalArgumentException var7) {
            boolean var12 = false;
            throw x44.a<"q">(var7, 888420347103034195L, var3);
         }
      }

      wo var6 = (wo)x44.a<"m">(this, 641875260510959154L, var3).get(var2);
      return var6.v();
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
      // 00: getstatic com/zelix/w9.b J
      // 03: ldc2_w 117789450791111
      // 06: lxor
      // 07: lstore 2
      // 08: aconst_null
      // 09: astore 5
      // 0b: ldc2_w -7870137840074126397
      // 0e: lload 2
      // 0f: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14: aload 0
      // 15: ldc2_w -8486181658705780872
      // 18: lload 2
      // 19: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 1
      // 1f: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 24: checkcast com/zelix/wo
      // 27: astore 6
      // 29: astore 4
      // 2b: aload 6
      // 2d: ifnull d1
      // 30: aload 0
      // 31: ldc2_w -8057084107070083339
      // 34: lload 2
      // 35: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: invokeinterface java/util/List.size ()I 1
      // 3f: istore 7
      // 41: bipush 0
      // 42: istore 8
      // 44: iload 8
      // 46: iload 7
      // 48: if_icmpge ca
      // 4b: aload 0
      // 4c: ldc2_w -8057084107070083339
      // 4f: lload 2
      // 50: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: iload 8
      // 57: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5c: checkcast com/zelix/wo
      // 5f: astore 9
      // 61: aload 4
      // 63: ifnonnull c5
      // 66: aload 9
      // 68: invokevirtual com/zelix/wo.v ()Ljava/lang/Object;
      // 6b: aload 4
      // 6d: ifnonnull cf
      // 70: goto 7d
      // 73: ldc2_w -7740747616136748140
      // 76: lload 2
      // 77: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: aload 1
      // 7e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 81: ifeq b5
      // 84: goto 91
      // 87: ldc2_w -7740747616136748140
      // 8a: lload 2
      // 8b: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: aload 0
      // 92: ldc2_w -8057084107070083339
      // 95: lload 2
      // 96: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: iload 8
      // 9d: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // a2: pop
      // a3: aload 4
      // a5: ifnull ca
      // a8: goto b5
      // ab: ldc2_w -7740747616136748140
      // ae: lload 2
      // af: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: athrow
      // b5: iinc 8 1
      // b8: goto c5
      // bb: ldc2_w -7740747616136748140
      // be: lload 2
      // bf: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: athrow
      // c5: aload 4
      // c7: ifnull 44
      // ca: aload 6
      // cc: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // cf: astore 5
      // d1: aload 5
      // d3: areturn
   }

   @Override
   public synchronized Set entrySet() {
      long var1 = b ^ 126939601171295L;
      long var3 = var1 ^ 1186517122821L;
      int var5 = (int)((var1 ^ 120442653417355L) >>> 32);
      int var6 = (int)((var1 ^ 120442653417355L) << 32 >>> 32);
      long var7 = var1 ^ 19845998901830L;
      String var10000 = x44.a<"v">(675468504279748699L, var1);
      ArrayList var10 = new ArrayList();
      String var9 = var10000;

      for (wo var12 : x44.a<"j">(this, 844254381060584813L, var1)) {
         var10.add(new e4(var3, var12));
         if (var9 != null) {
            break;
         }
      }

      return new sq(var7, new a3(var10, var5, var6));
   }

   static {
      long var0 = b ^ 94047820096784L;
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
      String var6 = "?z7/T\fOh\u0013vjdÔ¯¿²\u009c\u0017p6 \b\u0082\u00987\u0087t)üæ¶m¥\u0087ï}\b¨ «\u0010µÞ\u0017Ûc\u0011Ö©\u0011i\u0093¤u\u0098÷\u0005\u0010\u0099*\r0¤_\u001eð1R\u0015:&)z<";
      int var8 = "?z7/T\fOh\u0013vjdÔ¯¿²\u009c\u0017p6 \b\u0082\u00987\u0087t)üæ¶m¥\u0087ï}\b¨ «\u0010µÞ\u0017Ûc\u0011Ö©\u0011i\u0093¤u\u0098÷\u0005\u0010\u0099*\r0¤_\u001eð1R\u0015:&)z<"
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
                     c = var9;
                     d = new String[5];
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

                  var6 = "¤ëí·½\u008aNïAkkâ\u0081\u0003å\u009en\u0093\u0001#Iû\fG°®\u0017ÜÓ\u0084¿ôAqüWN\u0088Ø\u00ad(\\¬ññS²s6¿A\u007fÛ¯ç¯\u0002W\u0006&ö\u0080\u0016q®%\u0099x\u0091ê%V\u0013Ñf¶Ò¨â\u0099!";
                  var8 = "¤ëí·½\u008aNïAkkâ\u0081\u0003å\u009en\u0093\u0001#Iû\fG°®\u0017ÜÓ\u0084¿ôAqüWN\u0088Ø\u00ad(\\¬ññS²s6¿A\u007fÛ¯ç¯\u0002W\u0006&ö\u0080\u0016q®%\u0099x\u0091ê%V\u0013Ñf¶Ò¨â\u0099!"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7373;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/w9", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/w9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
