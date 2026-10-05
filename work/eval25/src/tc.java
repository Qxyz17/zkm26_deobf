package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class tc implements List {
   private ArrayList h;
   private static final long a = ess.a(-7143289334437297354L, 742093687925273636L, MethodHandles.lookup().lookupClass()).a(205201342458327L);

   @Override
   public boolean isEmpty() {
      long var1 = a ^ 14230603839189L;
      return x44.a<"l">(this.h, -2425107937754915581L, var1);
   }

   @Override
   public Object[] toArray(Object[] var1) {
      return this.h.toArray(var1);
   }

   @Override
   public boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int lastIndexOf(Object var1) {
      long var2 = a ^ 120619613709675L;
      return x44.a<"j">(this.h, var1, -7501041097939533561L, var2);
   }

   @Override
   public boolean contains(Object var1) {
      long var2 = a ^ 123400499914694L;
      return x44.a<"o">(this.h, var1, -8271962978880107066L, var2);
   }

   @Override
   public int indexOf(Object var1) {
      return this.h.indexOf(var1);
   }

   @Override
   public boolean containsAll(Collection var1) {
      long var2 = a ^ 22864454429929L;
      return x44.a<"h">(this.h, var1, -4579974241149589469L, var2);
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object set(int var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object remove(int var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int size() {
      return this.h.size();
   }

   @Override
   public void add(int var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean equals(Object var1) {
      return this.h.equals(var1);
   }

   @Override
   public List subList(int var1, int var2) {
      long var3 = a ^ 79405989488755L;
      return x44.a<"j">(this.h, var1, var2, 325251263581749233L, var3);
   }

   @Override
   public ListIterator listIterator() {
      return this.h.listIterator();
   }

   public tc(char param1, Enumeration param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic com/zelix/tc.a J
      // 1b: lxor
      // 1c: lstore 5
      // 1e: ldc2_w 6324905868470079170
      // 21: lload 5
      // 23: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: aload 0
      // 29: invokespecial java/lang/Object.<init> ()V
      // 2c: astore 7
      // 2e: aload 0
      // 2f: new java/util/ArrayList
      // 32: dup
      // 33: invokespecial java/util/ArrayList.<init> ()V
      // 36: putfield com/zelix/tc.h Ljava/util/ArrayList;
      // 39: aload 2
      // 3a: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 3f: ifeq 55
      // 42: aload 0
      // 43: getfield com/zelix/tc.h Ljava/util/ArrayList;
      // 46: aload 2
      // 47: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 4c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4f: pop
      // 50: aload 7
      // 52: ifnull 39
      // 55: iload 4
      // 57: ifle 50
      // 5a: return
   }

   @Override
   public Object[] toArray() {
      long var1 = a ^ 112584827144287L;
      return x44.a<"n">(this.h, -111666441141532866L, var1);
   }

   @Override
   public int hashCode() {
      return this.h.hashCode();
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Iterator iterator() {
      return this.h.iterator();
   }

   @Override
   public Object get(int var1) {
      return this.h.get(var1);
   }

   @Override
   public ListIterator listIterator(int var1) {
      long var2 = a ^ 88339410774831L;
      return x44.a<"n">(this.h, var1, 2235468738000981557L, var2);
   }

   @Override
   public boolean addAll(int var1, Collection var2) {
      throw new UnsupportedOperationException();
   }
}
