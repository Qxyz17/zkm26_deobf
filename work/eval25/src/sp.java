package com.zelix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

public class sp implements Serializable {
   public boolean k;
   public static final int Y = 1;
   public static final int aA = 1;
   public String f;
   public static final int dH = 0;
   public String di;
   private static final Map DY = new HashMap(13);
   public bx[] g;
   public static final int I = 0;
   public int o;
   public static final int N = 2;
   public static final int J = 1;
   public static final int Z = 2;
   public int r;
   private static final Map Dv = new HashMap(13);
   public int aC;
   public static final int K = 2;
   public String an;
   public boolean y;
   public static final int av = 0;
   public static final int aw = 3;
   public boolean A;
   public static final int d3 = 0;
   public static final int n = 4;
   public static final int W = 3;
   public static final String H = "ChangeLog.txt";
   public static final int dw = 1;
   public boolean ar;
   public String dE;
   public boolean j;
   public boolean l;
   public boolean dr;
   public boolean z;
   public static final int az = 3;
   public static final int dg = 1;
   public boolean dV;
   public int aj;
   public static final int M = 1;
   public int m;
   public String x;
   public static final int V = 2;
   public static final int d2 = 3;
   public static final int al = 0;
   public String ai;
   public String dv;
   public static final int dy = 2;
   public static final int au = 4;
   public static final String G = "z";
   public boolean w;
   public String dB;
   public static final int aa = 3;
   public int dZ;
   public static final int S = 5;
   public int B;
   public boolean D6;
   public Integer at;
   public static final int U = 1;
   public String v;
   public static final int Q = 2;
   public boolean s;
   public static final int ad = 2;
   public transient PrintWriter h;
   public int as;
   public static final int aB = 4;
   public int b;
   public String q;
   public static final int ap = 2;
   public boolean c;
   public static final int ah = 5;
   public boolean p;
   public static final int O = 0;
   public static final int ak = 1;
   public int dC;
   public int u;
   public String D;
   public boolean ay;
   public static final int X = 0;
   public static final int ao = 1;
   private static final Map DS = new HashMap(13);
   public static final int ab = 0;
   public int i;
   public String dN;
   public static final int ac = 1;
   public boolean e;
   public static final int aD = 4;
   public boolean d;
   public static final int d9 = 1;
   public static final int ax = 0;
   public static final int ae = 0;
   public static final int L = 0;
   public String t;
   public int d7;
   public static final int T = 0;
   public static final int db = 0;
   private static final Map D2 = new HashMap(13);
   public static final int ag = 0;
   public int C;
   private static final Map DR = new HashMap(13);
   public boolean E;
   transient boolean a;
   public static final int R = 2;
   public static final int P = 1;
   public int am;
   public zy F;
   public static final int af = 1;
   public static final int aq = 1;
   private static final long bb = ess.a(6498538643370466889L, 3766705136047616479L, MethodHandles.lookup().lookupClass()).a(50102564016432L);

   public void a(String var1, String var2) {
      long var3 = bb ^ 87138360007483L;
      File var5 = new File(var1, var2);
      if (!x44.a<"h">(var5, 5053628503754608862L, var3) || !x44.a<"h">(var5, 5157552477523526770L, var3) && x44.a<"h">(var5, 6715724612654830122L, var3)) {
         ObjectOutputStream var6 = null;

         try {
            FileOutputStream var7 = new FileOutputStream(var5);
            var6 = new ObjectOutputStream(var7);
            x44.a<"h">(var6, this, 6484972094637411111L, var3);
         } catch (IOException var16) {
         } finally {
            if (var6 != null) {
               try {
                  x44.a<"h">(var6, 4683199380353699476L, var3);
               } catch (IOException var15) {
               }
            }
         }
      }
   }

   public static String W(Integer var0) {
      long var1 = bb ^ 13187899548718L;
      return (String)x44.a<"l">(-6575050451414694958L, var1).get(var0);
   }

   public static String u(Integer var0) {
      long var1 = bb ^ 96428966718685L;
      return (String)x44.a<"o">(7592523573027636146L, var1).get(var0);
   }

   public static int P(String var0) {
      long var1 = bb ^ 61815981330644L;
      return (Integer)x44.a<"n">(582296911348086479L, var1).get(var0);
   }

   public sp(String var1, String var2) {
      long var3 = bb ^ 96345571228393L;
      super();
      x44.a<"q">(this, 1, -6893589549907030042L, var3);
      x44.a<"q">(this, 0, -4834103731546559012L, var3);
      x44.a<"q">(this, false, -5172061353105149992L, var3);
      x44.a<"q">(this, false, -5051405916401739889L, var3);
      x44.a<"q">(this, true, -5000095015131975777L, var3);
      x44.a<"q">(this, "ChangeLog.txt", -4686738093589980107L, var3);
      x44.a<"q">(this, 0, -6777115629091576621L, var3);
      x44.a<"q">(this, 0, -6845148678640769753L, var3);
      x44.a<"q">(this, 3, -4864877304391390837L, var3);
      x44.a<"q">(this, false, -6776259429723030450L, var3);
      x44.a<"q">(this, true, -6408147932229358005L, var3);
      x44.a<"q">(this, true, -4849147205133955602L, var3);
      x44.a<"q">(this, true, -6695658067092474254L, var3);
      x44.a<"q">(this, false, -6810598435414170213L, var3);
      x44.a<"q">(this, false, -5042825809720502669L, var3);
      x44.a<"q">(this, x44.a<"k">(-6444460415212715660L, var3), -6499935943020044655L, var3);
      x44.a<"q">(this, false, -6633218562774903818L, var3);
      x44.a<"q">(this, false, -6422694521627876373L, var3);
      x44.a<"q">(this, 0, -6433728330938974043L, var3);
      x44.a<"q">(this, false, -6517483644987214807L, var3);
      x44.a<"q">(this, false, -6506888902523098467L, var3);
      x44.a<"q">(this, 1, -6848336921577113358L, var3);
      x44.a<"q">(this, 0, -6446105048966626522L, var3);
      x44.a<"q">(this, 4, -6419930701486713697L, var3);
      x44.a<"q">(this, 0, -4648786075618934088L, var3);
      x44.a<"q">(this, 0, -4641759900930648218L, var3);
      x44.a<"q">(this, true, -4995874898002970484L, var3);
      x44.a<"q">(this, 1, -4852074956906061443L, var3);
      x44.a<"q">(this, false, -5174197539813862926L, var3);
      x44.a<"q">(this, false, -6636243514126833621L, var3);
      x44.a<"q">(this, false, -4621459414038194559L, var3);
      x44.a<"q">(this, true, -6692858239119427039L, var3);
      x44.a<"q">(this, 0, -6508887026495587232L, var3);
      x44.a<"q">(this, 1, -6395682737499296356L, var3);
      x44.a<"q">(this, 1, -4890381763811569811L, var3);
      File var5 = new File(var1, var2);
      if (x44.a<"j">(var5, -6345571079986614004L, var3) && !x44.a<"j">(var5, -6466792725704661600L, var3) && x44.a<"j">(var5, -5145171167099380377L, var3)) {
         ObjectInputStream var6 = null;

         try {
            FileInputStream var7 = new FileInputStream(var5);
            var6 = new ObjectInputStream(var7);
            sp var8 = (sp)x44.a<"j">(var6, -6446470876317434538L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6893589549907030042L, var3), -6893589549907030042L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6499935943020044655L, var3), -6499935943020044655L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6633218562774903818L, var3), -6633218562774903818L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6422694521627876373L, var3), -6422694521627876373L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6433728330938974043L, var3), -6433728330938974043L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4834103731546559012L, var3), -4834103731546559012L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -5172061353105149992L, var3), -5172061353105149992L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -5051405916401739889L, var3), -5051405916401739889L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -5000095015131975777L, var3), -5000095015131975777L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4693985893006709362L, var3), -4693985893006709362L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4686738093589980107L, var3), -4686738093589980107L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6777115629091576621L, var3), -6777115629091576621L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6845148678640769753L, var3), -6845148678640769753L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4864877304391390837L, var3), -4864877304391390837L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6776259429723030450L, var3), -6776259429723030450L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6408147932229358005L, var3), -6408147932229358005L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4849147205133955602L, var3), -4849147205133955602L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6695658067092474254L, var3), -6695658067092474254L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6810598435414170213L, var3), -6810598435414170213L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -5042825809720502669L, var3), -5042825809720502669L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -5174197539813862926L, var3), -5174197539813862926L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4663732697846393851L, var3), -4663732697846393851L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6517483644987214807L, var3), -6517483644987214807L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6506888902523098467L, var3), -6506888902523098467L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6848336921577113358L, var3), -6848336921577113358L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6446105048966626522L, var3), -6446105048966626522L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6419930701486713697L, var3), -6419930701486713697L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4648786075618934088L, var3), -4648786075618934088L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4641759900930648218L, var3), -4641759900930648218L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4995874898002970484L, var3), -4995874898002970484L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -5061899778686910782L, var3), -5061899778686910782L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6636243514126833621L, var3), -6636243514126833621L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4621459414038194559L, var3), -4621459414038194559L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6692858239119427039L, var3), -6692858239119427039L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4890381763811569811L, var3), -4890381763811569811L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4871319091362561890L, var3), -4871319091362561890L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6692287742555315938L, var3), -6692287742555315938L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4852074956906061443L, var3), -4852074956906061443L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6508887026495587232L, var3), -6508887026495587232L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6395682737499296356L, var3), -6395682737499296356L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6501045657866565394L, var3), -6501045657866565394L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -5149214021783586492L, var3), -5149214021783586492L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -5013822781113447355L, var3), -5013822781113447355L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -5081933185705233926L, var3), -5081933185705233926L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4664174480640479678L, var3), -4664174480640479678L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -4855392064350178292L, var3), -4855392064350178292L, var3);
            x44.a<"q">(this, x44.a<"n">(var8, -6902083009365365659L, var3), -6902083009365365659L, var3);
            x44.a<"q">(this, true, -6855264793694572861L, var3);
         } catch (IOException var24) {
         } catch (ClassNotFoundException var25) {
         } catch (ClassCastException var26) {
         } catch (g3 var27) {
            throw var27;
         } catch (Throwable var28) {
         } finally {
            if (var6 != null) {
               try {
                  x44.a<"j">(var6, -5075290621777627851L, var3);
               } catch (IOException var23) {
               }
            }
         }
      }
   }

   public sp() {
      long var1 = bb ^ 45522803607539L;
      super();
      x44.a<"s">(this, 1, 2112032176919278332L, var1);
      x44.a<"s">(this, 0, 140647893605503174L, var1);
      x44.a<"s">(this, false, 370240049542959810L, var1);
      x44.a<"s">(this, false, 360204209898187413L, var1);
      x44.a<"s">(this, true, 542233867522593413L, var1);
      x44.a<"s">(this, "ChangeLog.txt", 283483020508438831L, var1);
      x44.a<"s">(this, 0, 2083099523587643849L, var1);
      x44.a<"s">(this, 0, 2025312839809652797L, var1);
      x44.a<"s">(this, 3, 100773654159266961L, var1);
      x44.a<"s">(this, false, 2085058000240902484L, var1);
      x44.a<"s">(this, true, 1876824220996277073L, var1);
      x44.a<"s">(this, true, 121070009134625012L, var1);
      x44.a<"s">(this, true, 2165739602524818280L, var1);
      x44.a<"s">(this, false, 2045085072273119361L, var1);
      x44.a<"s">(this, false, 512907209793186665L, var1);
      x44.a<"s">(this, x44.a<"i">(1984631281487166574L, var1), 1788466118474245003L, var1);
      x44.a<"s">(this, false, 2227148881660210924L, var1);
      x44.a<"s">(this, false, 2000864440848768753L, var1);
      x44.a<"s">(this, 0, 1994163265697070527L, var1);
      x44.a<"s">(this, false, 1771957412045769011L, var1);
      x44.a<"s">(this, false, 1776843516210075527L, var1);
      x44.a<"s">(this, 1, 2157135288813585896L, var1);
      x44.a<"s">(this, 0, 1986275844250385980L, var1);
      x44.a<"s">(this, 4, 2016959306901432709L, var1);
      x44.a<"s">(this, 0, 172913007766421410L, var1);
      x44.a<"s">(this, 0, 184464179911322236L, var1);
      x44.a<"s">(this, true, 554339646913922454L, var1);
      x44.a<"s">(this, 1, 122592589731732583L, var1);
      x44.a<"s">(this, false, 372655308129201384L, var1);
      x44.a<"s">(this, false, 2232990914953827633L, var1);
      x44.a<"s">(this, false, 200192347699145627L, var1);
      x44.a<"s">(this, true, 2162939634956945211L, var1);
      x44.a<"s">(this, 0, 1779405066958094714L, var1);
      x44.a<"s">(this, 1, 1884623028248383622L, var1);
      x44.a<"s">(this, 1, 88842142066356855L, var1);
   }

   static {
      long var0 = bb ^ 3132758736535L;
      x44.a<"m">(7374504843846015116L, var0).put("none", 0);
      x44.a<"m">(7374504843846015116L, var0).put("light", 1);
      x44.a<"m">(7374504843846015116L, var0).put("normal", 2);
      x44.a<"m">(7374504843846015116L, var0).put("aggressive", 3);
      x44.a<"m">(7374504843846015116L, var0).put("extraAggressive", 4);
      x44.a<"m">(8868813194670477816L, var0).put(0, "none");
      x44.a<"m">(8868813194670477816L, var0).put(1, "light");
      x44.a<"m">(8868813194670477816L, var0).put(2, "normal");
      x44.a<"m">(8868813194670477816L, var0).put(3, "aggressive");
      x44.a<"m">(8868813194670477816L, var0).put(4, "extraAggressive");
      x44.a<"m">(8941001320612154638L, var0).put("none", 0);
      x44.a<"m">(8941001320612154638L, var0).put("light", 1);
      x44.a<"m">(8941001320612154638L, var0).put("heavy", 2);
      x44.a<"m">(9113512497503934827L, var0).put(0, "none");
      x44.a<"m">(9113512497503934827L, var0).put(1, "light");
      x44.a<"m">(9113512497503934827L, var0).put(2, "heavy");
      x44.a<"m">(7436878033986945808L, var0).put(x44.a<"l">(x44.a<"m">(7488599389387881306L, var0), 7432914548550302222L, var0), "none");
      x44.a<"m">(7436878033986945808L, var0).put(x44.a<"l">(x44.a<"m">(7295433549606355003L, var0), 7432914548550302222L, var0), "light");
      x44.a<"m">(7436878033986945808L, var0).put(x44.a<"l">(x44.a<"m">(7235222379428669239L, var0), 7432914548550302222L, var0), "normal");
      x44.a<"m">(7436878033986945808L, var0).put(x44.a<"l">(x44.a<"m">(8797833198675488900L, var0), 7432914548550302222L, var0), "aggressive");
      x44.a<"m">(7436878033986945808L, var0).put(x44.a<"l">(x44.a<"m">(8672513122414494834L, var0), 7323224800882360435L, var0), "heavy");
   }

   public boolean a() {
      long var1 = bb ^ 137890986166258L;
      return x44.a<"m">(this, 6757121502390522840L, var1);
   }

   public static int o(String var0) {
      long var1 = bb ^ 82903983657717L;
      return (Integer)x44.a<"o">(-3425382329002663572L, var1).get(var0);
   }

   public static String N(String var0) {
      long var1 = bb ^ 76366677951511L;
      return (String)x44.a<"m">(-7082650907003029104L, var1).get(var0);
   }
}
