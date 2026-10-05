package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class el implements Set {
   private final _u8 Y = new _u8();
   private static final long a = ess.a(-630483708374137068L, -5033941201155135298L, MethodHandles.lookup().lookupClass()).a(26775927208738L);

   @Override
   public Object[] toArray() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Iterator iterator() {
      long var1 = a ^ 60300998471069L;
      long var3 = var1 ^ 4330280893637L;
      return x44.a<"n">(this.Y, new Object[]{var3}, -2615114450607160604L, var1).iterator();
   }

   @Override
   public boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean remove(Object var1) {
      long var2 = a ^ 77045066631888L;
      long var4 = var2 ^ 108041830301730L;
      Object var6 = x44.a<"k">(this.Y, new Object[]{var4, var1}, 2344749367368837223L, var2);

      try {
         if (var6 != null) {
            return true;
         }
      } catch (UnsupportedOperationException var7) {
         throw x44.a<"s">(var7, 2572612142030560330L, var2);
      }

      return false;
   }

   @Override
   public boolean addAll(Collection var1) {
      long var2 = a ^ 123146475942035L;
      long var4 = var2 ^ 136582611521438L;
      boolean var7 = false;
      String var10000 = x44.a<"p">(363025498594548749L, var2);
      Iterator var8 = var1.iterator();
      String var6 = var10000;

      while (var8.hasNext()) {
         Object var9 = var8.next();
         Object var10 = x44.a<"h">(this.Y, new Object[]{var9, var4, var9}, 324600965167330171L, var2);
         if (var10 == null) {
            var7 = true;
         }

         if (var6 != null) {
            break;
         }
      }

      return var7;
   }

   public el(int var1) {
   }

   @Override
   public int size() {
      long var1 = a ^ 36970815496503L;
      long var3 = var1 ^ 127161517597878L;
      return x44.a<"l">(this.Y, new Object[]{var3}, 965660171920438985L, var1);
   }

   @Override
   public boolean containsAll(Collection param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/el.a J
      // 03: ldc2_w 101154781795708
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 2370743036679371234
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: aload 1
      // 12: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 17: astore 5
      // 19: astore 4
      // 1b: aload 5
      // 1d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 22: ifeq 65
      // 25: aload 5
      // 27: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c: astore 6
      // 2e: aload 0
      // 2f: getfield com/zelix/el.Y Lcom/zelix/_u8;
      // 32: aload 6
      // 34: invokevirtual com/zelix/_u8.T (Ljava/lang/Object;)Z
      // 37: aload 4
      // 39: ifnonnull 66
      // 3c: aload 4
      // 3e: ifnonnull 5f
      // 41: goto 4e
      // 44: ldc2_w 4332424296272266214
      // 47: lload 2
      // 48: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: ifne 60
      // 51: goto 5e
      // 54: ldc2_w 4332424296272266214
      // 57: lload 2
      // 58: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: bipush 0
      // 5f: ireturn
      // 60: aload 4
      // 62: ifnull 1b
      // 65: bipush 1
      // 66: ireturn
   }

   @Override
   public Object[] toArray(Object[] var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void clear() {
      long var1 = a ^ 37713924811804L;
      long var3 = var1 ^ 104767276724718L;
      x44.a<"o">(this.Y, new Object[]{var3}, 6863727410288776682L, var1);
   }

   public el() {
   }

   @Override
   public boolean add(Object var1) {
      long var2 = a ^ 5355741894469L;
      long var4 = var2 ^ 9784487651400L;
      Object var6 = x44.a<"n">(this.Y, new Object[]{var1, var4, var1}, -2065109314473831251L, var2);

      try {
         if (var6 == null) {
            return true;
         }
      } catch (UnsupportedOperationException var7) {
         throw x44.a<"v">(var7, -133274207733333537L, var2);
      }

      return false;
   }

   @Override
   public boolean isEmpty() {
      long var1 = a ^ 16609897489703L;
      long var3 = var1 ^ 65788538239478L;
      return x44.a<"l">(this.Y, new Object[]{var3}, 1141723410215046721L, var1);
   }

   @Override
   public boolean contains(Object var1) {
      return this.Y.T(var1);
   }

   @Override
   public boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}
