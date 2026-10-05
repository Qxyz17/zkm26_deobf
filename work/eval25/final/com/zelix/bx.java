package com.zelix;

import java.io.Reader;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class bx implements Serializable {
   private final String a;
   private transient Reader b;
   private static final long c = ess.a(1636239620679115547L, 1493376518986014919L, MethodHandles.lookup().lookupClass()).a(86255653334918L);

   public Reader b() {
      long var1 = c ^ 63381867777133L;
      return x44.a<"i">(this, 881880592864515978L, var1);
   }

   public bx(String var1) {
      this.a = var1;
   }

   public String a() {
      long var1 = c ^ 70999076211483L;
      return x44.a<"o">(this, 5333216177561225475L, var1);
   }

   public void a(Reader var1) {
      long var2 = c ^ 112364956814817L;
      x44.a<"r">(this, var1, -3625030269123111418L, var2);
   }
}
