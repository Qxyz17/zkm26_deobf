package com.zelix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class as implements Serializable {
   private String c;
   private boolean f;
   private String o;
   private String g;
   private boolean k;
   private String d;
   private boolean K;
   private String a;
   private String b;
   private int j;
   public static final int p = 1;
   private s n;
   public static final int q = 2;
   private boolean l;
   private String e;
   private String h;
   private _s m;
   public static final int r = 3;
   private String i;
   private static final long s = ess.a(-5982096961307050417L, 3650658864823316499L, MethodHandles.lookup().lookupClass()).a(149594964375071L);

   public synchronized boolean k() {
      long var1 = s ^ 60803985446157L;
      return x44.a<"n">(this, 1075546571122745627L, var1);
   }

   public synchronized void L(boolean var1) {
      long var2 = s ^ 127487191374152L;
      x44.a<"t">(this, var1, 4756153862973528357L, var2);
   }

   public synchronized String m() {
      long var1 = s ^ 2058925364933L;
      return x44.a<"n">(this, -3466112763923432937L, var1);
   }

   public synchronized void a(boolean var1) {
      long var2 = s ^ 98068187822316L;
      x44.a<"p">(this, var1, -6564913203645963163L, var2);
   }

   public synchronized String e() {
      long var1 = s ^ 47350065597949L;
      return x44.a<"n">(this, 820614549694458931L, var1);
   }

   public synchronized void c(String var1) {
      long var2 = s ^ 39351491025529L;
      x44.a<"u">(this, var1, -2528946771237930057L, var2);
   }

   public synchronized void l() {
      long var1 = s ^ 110525117634015L;
      x44.a<"n">(this, x44.a<"l">(this, 1460172815751887098L, var1), x44.a<"l">(this, 1449916360744346196L, var1), 1216393186639206997L, var1);
   }

   public synchronized void V(boolean var1) {
      long var2 = s ^ 117991279673545L;
      x44.a<"u">(this, var1, -2654511432517618465L, var2);
   }

   public synchronized void e(String var1) {
      long var2 = s ^ 60397748309007L;
      x44.a<"s">(this, var1, 6141157352790428086L, var2);
   }

   public synchronized s c() {
      long var1 = s ^ 2702569252034L;
      return x44.a<"i">(this, 2627348799458090010L, var1);
   }

   public synchronized void d(String var1) {
      long var2 = s ^ 76526095186034L;
      x44.a<"v">(this, var1, 4060805703063699990L, var2);
   }

   public synchronized String a() {
      long var1 = s ^ 67524315435876L;
      return x44.a<"o">(this, -2997826692383422892L, var1);
   }

   public synchronized String d() {
      long var1 = s ^ 128833832909467L;
      return x44.a<"h">(this, 8920301953048433573L, var1);
   }

   public synchronized void b(boolean var1) {
      long var2 = s ^ 23396862812986L;
      x44.a<"v">(this, var1, 9167506697765530774L, var2);
   }

   public synchronized String f() {
      long var1 = s ^ 139796756007490L;
      return x44.a<"i">(this, -8472717886690054106L, var1);
   }

   public synchronized void a(String var1) {
      long var2 = s ^ 13951403118975L;
      x44.a<"s">(this, var1, 6088485544918369359L, var2);
   }

   public synchronized void a(int var1, int var2) {
      long var3 = s ^ 29071224172027L;
      x44.a<"w">(this, new _s(var1, var2), 7691534424388692573L, var3);
   }

   public synchronized _s b() {
      long var1 = s ^ 71374883032998L;
      return x44.a<"m">(this, -8583707695296444416L, var1);
   }

   public synchronized boolean j() {
      long var1 = s ^ 73321935609957L;
      return x44.a<"n">(this, 4352396081943506889L, var1);
   }

   private synchronized void a(String var1, String var2) {
      long var3 = s ^ 132552341908385L;
      File var5 = new File(var1, var2);
      if (!x44.a<"n">(var5, -1575018291143459624L, var3) || !x44.a<"n">(var5, -1471199558573070220L, var3) && x44.a<"n">(var5, -1065810939354268116L, var3)) {
         ObjectOutputStream var6 = null;

         try {
            FileOutputStream var7 = new FileOutputStream(var5);
            var6 = new ObjectOutputStream(var7);
            x44.a<"n">(var6, this, -722459755723053279L, var3);
         } catch (IOException var16) {
         } finally {
            if (var6 != null) {
               try {
                  x44.a<"n">(var6, -1371240074813087086L, var3);
               } catch (IOException var15) {
               }
            }
         }
      }
   }

   public synchronized void g(String var1) {
      long var2 = s ^ 52053960930924L;
      x44.a<"p">(this, var1, -5815050614383633730L, var2);
   }

   public synchronized String g() {
      long var1 = s ^ 123746210203146L;
      return x44.a<"i">(this, -2360870857663216717L, var1);
   }

   public synchronized void z(int var1) {
      long var2 = s ^ 113064881999609L;
      x44.a<"u">(this, var1, -4007537167331043896L, var2);
   }

   public as() {
      long var1 = s ^ 123678785447678L;
      super();
      x44.a<"r">(this, true, -4974622213072995721L, var1);
      x44.a<"r">(this, 1, -6889020318602707505L, var1);
      x44.a<"r">(this, true, -4972567731003659950L, var1);
      x44.a<"r">(this, true, -4819312462571531544L, var1);
      x44.a<"r">(this, new _s(0, 0), -6793473595276287656L, var1);
      x44.a<"r">(this, new s(400, 300), -6464277516306407898L, var1);
   }

   public synchronized void f(String var1) {
      long var2 = s ^ 35327403271209L;
      x44.a<"u">(this, var1, -5034577677825860939L, var2);
   }

   public synchronized String h() {
      long var1 = s ^ 94617845068708L;
      return x44.a<"o">(this, 7902938192491171128L, var1);
   }

   public synchronized int R() {
      long var1 = s ^ 63720844907305L;
      return x44.a<"j">(this, 6174999194684442648L, var1);
   }

   public synchronized boolean i() {
      long var1 = s ^ 117242191178535L;
      return x44.a<"l">(this, 8588238773945300910L, var1);
   }

   public synchronized void b(String var1) {
      long var2 = s ^ 88200667731098L;
      x44.a<"v">(this, var1, 1570175477024079268L, var2);
   }

   public synchronized void b(int var1, int var2) {
      long var3 = s ^ 118089240070658L;
      x44.a<"v">(this, new s(var1, var2), -3839777436881030438L, var3);
   }

   public synchronized boolean y() {
      long var1 = s ^ 114002888652164L;
      return x44.a<"o">(this, 7984131037775836649L, var1);
   }

   public as(String var1, String var2) {
      long var3 = s ^ 15220326942448L;
      super();
      x44.a<"t">(this, true, 6555247504461978233L, var3);
      x44.a<"t">(this, 1, 4641862316495756737L, var3);
      x44.a<"t">(this, true, 6553755972404775260L, var3);
      x44.a<"t">(this, true, 6705896621532738278L, var3);
      x44.a<"t">(this, new _s(0, 0), 4735190216236810582L, var3);
      x44.a<"t">(this, new s(400, 300), 5063233947295546920L, var3);
      x44.a<"t">(this, var2, 5129681811420475771L, var3);
      x44.a<"t">(this, var1, 5146763502037035989L, var3);
      File var5 = new File(var1, var2);
      if (x44.a<"o">(var5, 5149053001243562377L, var3) && !x44.a<"o">(var5, 5099282669702006053L, var3) && x44.a<"o">(var5, 6349427587648486882L, var3)) {
         ObjectInputStream var6 = null;

         try {
            FileInputStream var7 = new FileInputStream(var5);
            var6 = new ObjectInputStream(var7);
            as var8 = (as)x44.a<"o">(var6, 5047572224687300051L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 6753497939132057245L, var3), 6753497939132057245L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 5161195158994874318L, var3), 5161195158994874318L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 4895874864154858432L, var3), 4895874864154858432L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 5105016045629373588L, var3), 5105016045629373588L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 6555247504461978233L, var3), 6555247504461978233L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 6901481838148125513L, var3), 6901481838148125513L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 6904274168297613858L, var3), 6904274168297613858L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 6411080434962724972L, var3), 6411080434962724972L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 4642734382207428414L, var3), 4642734382207428414L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 4641862316495756737L, var3), 4641862316495756737L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 6553755972404775260L, var3), 6553755972404775260L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 6705896621532738278L, var3), 6705896621532738278L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 4735190216236810582L, var3), 4735190216236810582L, var3);
            x44.a<"t">(this, x44.a<"k">(var8, 5063233947295546920L, var3), 5063233947295546920L, var3);
         } catch (IOException var24) {
         } catch (ClassNotFoundException var25) {
         } catch (ClassCastException var26) {
         } catch (g3 var27) {
            throw var27;
         } catch (Throwable var28) {
         } finally {
            if (var6 != null) {
               try {
                  x44.a<"o">(var6, 6419299372315268528L, var3);
               } catch (IOException var23) {
               }
            }
         }
      }
   }
}
