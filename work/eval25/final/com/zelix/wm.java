package com.zelix;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public class wm implements Collection {
   private Object[] F;
   private static final long a = ess.a(-1819984731677677833L, 7764032307110394304L, MethodHandles.lookup().lookupClass()).a(28281973036245L);

   @Override
   public boolean containsAll(Collection var1) {
      long var2 = a ^ 119476232055815L;
      String var10000 = x44.a<"v">(-1220482227498060277L, var2);
      Iterator var5 = var1.iterator();
      String var4 = var10000;

      while (var5.hasNext()) {
         boolean var6 = x44.a<"n">(this, var5.next(), -1159910622223425833L, var2);

         while (!var6) {
            var6 = false;
            if (var4 == null) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean contains(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/wm.a J
      // 03: ldc2_w 23517619732793
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -4453637633208427723
      // 0b: lload 2
      // 0c: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: bipush 0
      // 12: istore 5
      // 14: astore 4
      // 16: iload 5
      // 18: aload 0
      // 19: ldc2_w -4350968154292978432
      // 1c: lload 2
      // 1d: invokedynamic l (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: arraylength
      // 23: if_icmpge 68
      // 26: aload 0
      // 27: ldc2_w -4350968154292978432
      // 2a: lload 2
      // 2b: invokedynamic l (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 5
      // 32: aaload
      // 33: aload 1
      // 34: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 37: aload 4
      // 39: ifnonnull 69
      // 3c: aload 4
      // 3e: ifnonnull 5f
      // 41: goto 4e
      // 44: ldc2_w -2531839538511640328
      // 47: lload 2
      // 48: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: ifeq 60
      // 51: goto 5e
      // 54: ldc2_w -2531839538511640328
      // 57: lload 2
      // 58: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: bipush 1
      // 5f: ireturn
      // 60: iinc 5 1
      // 63: aload 4
      // 65: ifnull 16
      // 68: bipush 0
      // 69: ireturn
   }

   public wm(int var1, int var2, Object[] var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      super();
      if (var3 == null) {
         throw new IllegalArgumentException();
      } else {
         x44.a<"v">(this, var3, 6040255889102990669L, var5);
      }
   }

   @Override
   public Object[] toArray(Object[] var1) {
      long var2 = a ^ 56231616923428L;
      String var4 = x44.a<"u">(4912484279237172520L, var2);

      int var10000;
      int var10001;
      label40: {
         label39: {
            try {
               var10000 = var1.length;
               var10001 = x44.a<"i">(this, 5008961301817850653L, var2).length;
               if (var4 != null) {
                  break label40;
               }

               if (var10000 >= var10001) {
                  break label39;
               }
            } catch (IllegalArgumentException var7) {
               throw x44.a<"u">(var7, 6539296054614560485L, var2);
            }

            var1 = (Object[])Array.newInstance(var1.getClass().getComponentType(), x44.a<"i">(this, 5008961301817850653L, var2).length);
         }

         try {
            System.arraycopy(x44.a<"i">(this, 5008961301817850653L, var2), 0, var1, 0, x44.a<"i">(this, 5008961301817850653L, var2).length);
            if (var4 != null) {
               return var1;
            }

            var10000 = var1.length;
            var10001 = x44.a<"i">(this, 5008961301817850653L, var2).length;
         } catch (IllegalArgumentException var6) {
            throw x44.a<"u">(var6, 6539296054614560485L, var2);
         }
      }

      try {
         if (var10000 > var10001) {
            var1[x44.a<"i">(this, 5008961301817850653L, var2).length] = null;
         }
      } catch (IllegalArgumentException var5) {
         throw x44.a<"u">(var5, 6539296054614560485L, var2);
      }

      return var1;
   }

   @Override
   public Iterator iterator() {
      return new l9(this);
   }

   @Override
   public boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int size() {
      long var1 = a ^ 861864305811L;
      return x44.a<"n">(this, -6470454203078207318L, var1).length;
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object[] toArray() {
      long var1 = a ^ 131233290851212L;
      return x44.a<"u">(new Object[]{x44.a<"i">(this, 1237121815699369909L, var1)}, 1180267449871871606L, var1);
   }

   @Override
   public boolean isEmpty() {
      long var1 = a ^ 49314676332722L;
      String var3 = x44.a<"s">(-2613572600595365186L, var1);

      try {
         int var10000 = x44.a<"o">(this, -2732145389254122357L, var1).length;
         if (var3 != null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"s">(var4, -4227155049666277005L, var1);
      }

      return (boolean)0;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
