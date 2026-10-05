package com.zelix;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;

public class _ys extends PrintWriter {
   private HashMap K;
   private static final long a = ess.a(8760246922084160621L, 3223961181868674430L, MethodHandles.lookup().lookupClass()).a(263277102565260L);

   public _ys(int var1, short var2, OutputStream var3, char var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 109173945956654L;
      super(var3);
      x44.a<"u">(this, x44.a<"v">(new Object[]{var7}, 3806330938490409661L, var5), 3086645906273056474L, var5);
   }

   @Override
   public void println(String var1) {
      long var2 = a ^ 19415543490812L;
      Object var4 = x44.a<"n">(this, -6941765977479838810L, var2).put(var1, var1);

      try {
         if (var4 == null) {
            super.println(var1);
         }
      } catch (gj var5) {
         throw x44.a<"r">(var5, -9199971578311463353L, var2);
      }
   }

   public _ys(Writer var1, boolean var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 98112504547907L;
      super(var1, var2);
      x44.a<"p">(this, x44.a<"s">(new Object[]{var5}, 558437157412528592L, var3), 1853445005112149431L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
