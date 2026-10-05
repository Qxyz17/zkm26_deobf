package com.zelix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class qr implements Serializable {
   public boolean f;
   public boolean d;
   public boolean e;
   public boolean b;
   public boolean a;
   public boolean c;
   private static final long g = ess.a(8115557242092457667L, -7321107286648458663L, MethodHandles.lookup().lookupClass()).a(89667968948607L);

   public qr(String var1, String var2) {
      long var3 = g ^ 53974497123030L;
      super();
      x44.a<"s">(this, false, 6569454286887854366L, var3);
      x44.a<"s">(this, true, 6753624331654765976L, var3);
      x44.a<"s">(this, false, 4621993407288801786L, var3);
      x44.a<"s">(this, false, 6701126335738432869L, var3);
      x44.a<"s">(this, false, 6378567014622034581L, var3);
      x44.a<"s">(this, true, 6424665712561760866L, var3);
      File var5 = new File(var1, var2);
      if (x44.a<"h">(var5, 6753815174562122566L, var3) && !x44.a<"h">(var5, 6632405735559389162L, var3) && x44.a<"h">(var5, 4815176699936859949L, var3)) {
         ObjectInputStream var6 = null;

         try {
            FileInputStream var7 = new FileInputStream(var5);
            var6 = new ObjectInputStream(var7);
            qr var8 = (qr)x44.a<"h">(var6, 6684422957868926748L, var3);
            x44.a<"s">(this, x44.a<"l">(var8, 6569454286887854366L, var3), 6569454286887854366L, var3);
            x44.a<"s">(this, x44.a<"l">(var8, 6753624331654765976L, var3), 6753624331654765976L, var3);
            x44.a<"s">(this, x44.a<"l">(var8, 6701126335738432869L, var3), 6701126335738432869L, var3);
            x44.a<"s">(this, x44.a<"l">(var8, 4621993407288801786L, var3), 4621993407288801786L, var3);
            x44.a<"s">(this, x44.a<"l">(var8, 6378567014622034581L, var3), 6378567014622034581L, var3);
            x44.a<"s">(this, x44.a<"l">(var8, 6424665712561760866L, var3), 6424665712561760866L, var3);
         } catch (IOException var24) {
         } catch (ClassNotFoundException var25) {
         } catch (ClassCastException var26) {
         } catch (g3 var27) {
            throw var27;
         } catch (Throwable var28) {
         } finally {
            if (var6 != null) {
               try {
                  x44.a<"h">(var6, 4889411346470162303L, var3);
               } catch (IOException var23) {
               }
            }
         }
      }
   }

   public void a(String var1, String var2) {
      long var3 = g ^ 25827072211527L;
      File var5 = new File(var1, var2);
      if (!x44.a<"i">(var5, -203935812387623977L, var3) || !x44.a<"i">(var5, -244830951974404229L, var3) && x44.a<"i">(var5, -1857054416330217181L, var3)) {
         ObjectOutputStream var6 = null;

         try {
            FileOutputStream var7 = new FileOutputStream(var5);
            var6 = new ObjectOutputStream(var7);
            x44.a<"i">(var6, this, -2092380600444014546L, var3);
         } catch (IOException var16) {
         } finally {
            if (var6 != null) {
               try {
                  x44.a<"i">(var6, -290640321778453091L, var3);
               } catch (IOException var15) {
               }
            }
         }
      }
   }

   public qr() {
      long var1 = g ^ 100310959728057L;
      super();
      x44.a<"t">(this, false, 2613224625474854513L, var1);
      x44.a<"t">(this, true, 2510435330047533815L, var1);
      x44.a<"t">(this, false, 4561008077515523733L, var1);
      x44.a<"t">(this, false, 2562623815520694794L, var1);
      x44.a<"t">(this, false, 2876202339687237114L, var1);
      x44.a<"t">(this, true, 2758337401050191117L, var1);
   }
}
