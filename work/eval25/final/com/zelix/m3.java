package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ListIterator;

public class m3 implements ListIterator {
   final _ov d;
   private ListIterator Q;
   private static final long a = ess.a(835296274370046449L, 5367606539151834343L, MethodHandles.lookup().lookupClass()).a(155509256133511L);

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object previous() {
      long var1 = a ^ 121268634540080L;
      return x44.a<"k">(this, -1813460885783680783L, var1).previous();
   }

   @Override
   public void set(Object var1) {
      throw new UnsupportedOperationException();
   }

   public m3(_ov var1, long var2) {
      var2 = a ^ var2;
      this.d = var1;
      super();
      x44.a<"v">(
         this,
         x44.a<"m">(x44.a<"u">(new Object[]{x44.a<"i">(this, 7323692959539361885L, var2)}, 8706751624633547060L, var2), 6924401034593496451L, var2),
         8851616335266051315L,
         var2
      );
      x44.a<"v">(this, x44.a<"m">(x44.a<"u">(new Object[]{var1}, 8706751624633547060L, var2), 6924401034593496451L, var2), 8851616335266051315L, var2);
   }

   @Override
   public int nextIndex() {
      long var1 = a ^ 134953500867445L;
      return x44.a<"j">(x44.a<"n">(this, 5012609846635449268L, var1), 6624781709929329358L, var1);
   }

   public m3(char var1, _ov var2, int var3, long var4) {
      long var6 = ((long)var1 << 48 | var4 << 16 >>> 16) ^ a;
      this.d = var2;
      super();
      x44.a<"v">(
         this,
         x44.a<"m">(x44.a<"u">(new Object[]{x44.a<"i">(this, -1989774655391008355L, var6)}, -498626362444154636L, var6), -2172855418932270013L, var6),
         -353708873710078669L,
         var6
      );
      x44.a<"v">(this, x44.a<"m">(x44.a<"u">(new Object[]{var2}, -498626362444154636L, var6), var3, -1878180701146846020L, var6), -353708873710078669L, var6);
   }

   @Override
   public boolean hasPrevious() {
      long var1 = a ^ 69663124214717L;
      return x44.a<"n">(this, 7879078325835785084L, var1).hasPrevious();
   }

   @Override
   public void add(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int previousIndex() {
      long var1 = a ^ 62793701359345L;
      return x44.a<"n">(x44.a<"j">(this, -4606023834302329296L, var1), -2501792938510722077L, var1);
   }

   @Override
   public Object next() {
      long var1 = a ^ 107127175248020L;
      return x44.a<"o">(this, 5075914996560939093L, var1).next();
   }

   @Override
   public boolean hasNext() {
      long var1 = a ^ 120456241477954L;
      return x44.a<"i">(this, 5163175935332436355L, var1).hasNext();
   }
}
