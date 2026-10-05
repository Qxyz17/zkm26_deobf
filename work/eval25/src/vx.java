package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class vx implements Map {
   Map w;
   private static final long a = ess.a(-7577289908671720966L, -8188025742786621140L, MethodHandles.lookup().lookupClass()).a(122009581234032L);

   @Override
   public Collection values() {
      long var1 = a ^ 24465974817678L;
      return x44.a<"m">(this, -6222956352894052833L, var1).values();
   }

   @Override
   public boolean isEmpty() {
      long var1 = a ^ 50424700667838L;
      return x44.a<"i">(x44.a<"m">(this, 6742915272151048751L, var1), 6529745756676390210L, var1);
   }

   @Override
   public boolean containsKey(Object var1) {
      long var2 = a ^ 30010201888100L;
      return x44.a<"o">(this, 1101573357204009205L, var2).containsKey(var1);
   }

   @Override
   public void putAll(Map var1) {
      long var2 = a ^ 97501308625841L;
      x44.a<"n">(x44.a<"j">(this, -460263505365563872L, var2), var1, -43175601974466494L, var2);
   }

   public wo L(Object[] var1) {
      Object var5 = var1[0];
      long var2 = (Long)var1[1];
      wo var4 = (wo)var1[2];
      var2 = a ^ var2;
      return x44.a<"k">(this, -378952907987811071L, var2).put(var5, var4);
   }

   @Override
   public boolean containsValue(Object var1) {
      long var2 = a ^ 18321245342459L;
      return x44.a<"l">(x44.a<"h">(this, 5825011132377837418L, var2), var1, 6197170343813510031L, var2);
   }

   public wo U(Object[] var1) {
      Object var4 = var1[0];
      Object var3 = var1[1];
      Object var2 = var1[2];
      long var5 = (Long)var1[3];
      var5 = a ^ var5;
      long var10001 = var5 ^ 20376311345309L;
      int var7 = (int)((var5 ^ 20376311345309L) >>> 48);
      int var8 = (int)((var5 ^ 20376311345309L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      wo var10 = new wo((short)var7, var3, var8, (short)var9, var2);
      return x44.a<"l">(this, 9136388944348873078L, var5).put(var4, var10);
   }

   public wo d(Object[] var1) {
      long var3 = (Long)var1[0];
      Object var2 = var1[1];
      var3 = a ^ var3;
      return (wo)x44.a<"m">(this, 8440825637006641823L, var3).get(var2);
   }

   public wo q(Object[] var1) {
      long var2 = (Long)var1[0];
      Object var4 = var1[1];
      var2 = a ^ var2;
      return (wo)x44.a<"m">(this, -6204844511117683105L, var2).remove(var4);
   }

   @Override
   public Object remove(Object var1) {
      long var2 = a ^ 63029941013653L;
      long var4 = var2 ^ 100231974891623L;
      return x44.a<"j">(this, new Object[]{var4, var1}, -3704897681520862262L, var2);
   }

   @Override
   public int size() {
      long var1 = a ^ 127549644314321L;
      return x44.a<"j">(this, -3675785655214132416L, var1).size();
   }

   @Override
   public Object get(Object var1) {
      long var2 = a ^ 103378572832177L;
      long var4 = var2 ^ 31367520193923L;
      return x44.a<"n">(this, new Object[]{var4, var1}, 2889912809424683252L, var2);
   }

   public vx(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 37656127699623L;
      super();
      x44.a<"t">(this, x44.a<"w">(new Object[]{var3}, 3988936543117365556L, var1), 3190230834444293113L, var1);
   }

   @Override
   public Object put(Object var1, Object var2) {
      long var3 = a ^ 88653561927691L;
      long var5 = var3 ^ 127849011410855L;
      return x44.a<"l">(this, new Object[]{var1, var5, (wo)var2}, 6637007252166903701L, var3);
   }

   @Override
   public Set keySet() {
      long var1 = a ^ 124868660007560L;
      return x44.a<"k">(this, -3988507035290421479L, var1).keySet();
   }

   @Override
   public void clear() {
      long var1 = a ^ 71826778528961L;
      x44.a<"j">(this, -4112691108870407856L, var1).clear();
   }

   @Override
   public Set entrySet() {
      long var1 = a ^ 30763347570673L;
      return x44.a<"j">(this, 3881139226227952224L, var1).entrySet();
   }
}
