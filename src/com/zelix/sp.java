/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bx;
import com.zelix.m44;
import com.zelix.nn;
import com.zelix.prr;
import com.zelix.zy;
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

public class sp
implements Serializable {
    public boolean E;
    public static final int au = 4;
    public static final int dH = 0;
    public int u;
    public String ai;
    public static final int ac = 1;
    public int dC;
    public boolean w;
    public static final int dg = 1;
    public boolean A;
    public static final int U = 1;
    public String dE;
    public int B;
    public String dB;
    private static final Map r8;
    public static final int O = 0;
    public static final int dy = 2;
    public boolean y;
    public int i;
    public static final int ak = 1;
    public static final int ap = 2;
    public boolean d;
    public String D;
    public static final int d3 = 0;
    public String x;
    public int as;
    public static final int W = 3;
    public bx[] g;
    public static final String H = "ChangeLog.txt";
    public static final int P = 1;
    public static final int ao = 1;
    private static final Map rR;
    public static final int d2 = 3;
    public static final int ab = 0;
    public boolean e;
    public static final int K = 2;
    public int d7;
    public static final int S = 5;
    public boolean l;
    public String v;
    public static final int L = 0;
    public int am;
    public static final int R = 2;
    public static final int aB = 4;
    public static final int aq = 1;
    public String dv;
    private static final Map r7;
    public static final int az = 3;
    public static final int J = 1;
    public static final int db = 0;
    public zy F;
    public static final int ae = 0;
    public String f;
    public static final int ah = 5;
    public transient PrintWriter h;
    public int b;
    public int C;
    public static final int ag = 0;
    public boolean s;
    public static final int d9 = 1;
    public static final String G = "z";
    public boolean p;
    public static final int T = 0;
    public static final int I = 0;
    public static final int dw = 1;
    public String dN;
    public int r;
    public String t;
    public static final int Z = 2;
    public int m;
    public boolean j;
    public boolean c;
    transient boolean a;
    public static final int X = 0;
    public static final int aD = 4;
    public boolean z;
    private static final Map rg;
    public boolean dr;
    public static final int ax = 0;
    public static final int V = 2;
    public String an;
    public int aC;
    public Integer at;
    public static final int Q = 2;
    public int dZ;
    public boolean k;
    public static final int af = 1;
    public int aj;
    public boolean rd;
    public static final int ad = 2;
    public boolean dV;
    public static final int av = 0;
    public static final int n = 4;
    private static final Map rw;
    public static final int aa = 3;
    public static final int aw = 3;
    public String q;
    public String di;
    public static final int N = 2;
    public boolean ay;
    public static final int al = 0;
    public int o;
    public static final int aA = 1;
    public boolean ar;
    public static final int M = 1;
    public static final int Y = 1;
    private static final long bb;

    public static String p(Integer n) {
        long l = bb ^ 0x1064833EA839L;
        return (String)m44.a("k", (long)-207766980919939045L, (long)l).get(n);
    }

    public static String Z(Integer n) {
        long l = bb ^ 0x6BA8EA49B62EL;
        return (String)m44.a("l", (long)-1837622853394338877L, (long)l).get(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sp(String string, String string2) {
        long l = bb ^ 0x63072139B964L;
        m44.a("v", (Object)this, (int)1, (long)-981340580723068552L, (long)l);
        m44.a("v", (Object)this, (int)0, (long)-1037148661956884413L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-668747114548721303L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-1156043829113424304L, (long)l);
        m44.a("v", (Object)this, (boolean)true, (long)-1158142026605510532L, (long)l);
        m44.a("v", (Object)this, (String)H, (long)-951566365289976807L, (long)l);
        m44.a("v", (Object)this, (int)0, (long)-696083918475637156L, (long)l);
        m44.a("v", (Object)this, (int)0, (long)-1062010988584613588L, (long)l);
        m44.a("v", (Object)this, (int)3, (long)-1025906168718990564L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-1422058505837216345L, (long)l);
        m44.a("v", (Object)this, (boolean)true, (long)-1434168621131438058L, (long)l);
        m44.a("v", (Object)this, (boolean)true, (long)-623575753491781965L, (long)l);
        m44.a("v", (Object)this, (boolean)true, (long)-1586024937017736540L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-1356106130130595393L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-1044036395048961767L, (long)l);
        m44.a("v", (Object)this, (zy)m44.a("n", (long)-631608449115019195L, (long)l), (long)-955331075700549796L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-623506485040607520L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-1612924632652073814L, (long)l);
        m44.a("v", (Object)this, (int)0, (long)-1539735092681183788L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-638549907757688636L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-1126609040362627139L, (long)l);
        m44.a("v", (Object)this, (int)1, (long)-1001302500693176715L, (long)l);
        m44.a("v", (Object)this, (int)0, (long)-1673893518316704063L, (long)l);
        m44.a("v", (Object)this, (int)4, (long)-1538483020944242609L, (long)l);
        m44.a("v", (Object)this, (int)0, (long)-709711783595685102L, (long)l);
        m44.a("v", (Object)this, (int)0, (long)-1077105339775040908L, (long)l);
        m44.a("v", (Object)this, (boolean)true, (long)-1252573528690567182L, (long)l);
        m44.a("v", (Object)this, (int)1, (long)-1324429657508267097L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-776699544644861790L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-993679428361469831L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-1281587756938059175L, (long)l);
        m44.a("v", (Object)this, (boolean)true, (long)-1418976049282581856L, (long)l);
        m44.a("v", (Object)this, (int)0, (long)-633201950654332972L, (long)l);
        m44.a("v", (Object)this, (int)1, (long)-1194928158715431396L, (long)l);
        m44.a("v", (Object)this, (int)1, (long)-1190592382861192286L, (long)l);
        File file = new File(string, string2);
        if (m44.a("u", (Object)file, (long)-1238816393932707050L, (long)l) == false) return;
        if (m44.a("u", (Object)file, (long)-866272736266995584L, (long)l) != false) return;
        if (m44.a("u", (Object)file, (long)-983305035509914936L, (long)l) == false) return;
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            sp sp2 = (sp)((Object)m44.a("u", (Object)objectInputStream, (long)-592647338343015346L, (long)l));
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-981340580723068552L, (long)l), (long)-981340580723068552L, (long)l);
            m44.a("v", (Object)this, (zy)m44.a("t", (Object)sp2, (long)-955331075700549796L, (long)l), (long)-955331075700549796L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-623506485040607520L, (long)l), (long)-623506485040607520L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1612924632652073814L, (long)l), (long)-1612924632652073814L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1539735092681183788L, (long)l), (long)-1539735092681183788L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1037148661956884413L, (long)l), (long)-1037148661956884413L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-668747114548721303L, (long)l), (long)-668747114548721303L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1156043829113424304L, (long)l), (long)-1156043829113424304L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1158142026605510532L, (long)l), (long)-1158142026605510532L, (long)l);
            m44.a("v", (Object)this, (bx[])m44.a("t", (Object)sp2, (long)-788882532249593665L, (long)l), (long)-788882532249593665L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-951566365289976807L, (long)l)), (long)-951566365289976807L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-696083918475637156L, (long)l), (long)-696083918475637156L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1062010988584613588L, (long)l), (long)-1062010988584613588L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1025906168718990564L, (long)l), (long)-1025906168718990564L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1422058505837216345L, (long)l), (long)-1422058505837216345L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1434168621131438058L, (long)l), (long)-1434168621131438058L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-623575753491781965L, (long)l), (long)-623575753491781965L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1586024937017736540L, (long)l), (long)-1586024937017736540L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1356106130130595393L, (long)l), (long)-1356106130130595393L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1044036395048961767L, (long)l), (long)-1044036395048961767L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-776699544644861790L, (long)l), (long)-776699544644861790L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-1658830591518257753L, (long)l)), (long)-1658830591518257753L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-638549907757688636L, (long)l), (long)-638549907757688636L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1126609040362627139L, (long)l), (long)-1126609040362627139L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1001302500693176715L, (long)l), (long)-1001302500693176715L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1673893518316704063L, (long)l), (long)-1673893518316704063L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1538483020944242609L, (long)l), (long)-1538483020944242609L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-709711783595685102L, (long)l), (long)-709711783595685102L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1077105339775040908L, (long)l), (long)-1077105339775040908L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1252573528690567182L, (long)l), (long)-1252573528690567182L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-1345888189906644622L, (long)l)), (long)-1345888189906644622L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-993679428361469831L, (long)l), (long)-993679428361469831L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1281587756938059175L, (long)l), (long)-1281587756938059175L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)sp2, (long)-1418976049282581856L, (long)l), (long)-1418976049282581856L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1190592382861192286L, (long)l), (long)-1190592382861192286L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-1440726325099108516L, (long)l)), (long)-1440726325099108516L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-768594274916768764L, (long)l)), (long)-768594274916768764L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1324429657508267097L, (long)l), (long)-1324429657508267097L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-633201950654332972L, (long)l), (long)-633201950654332972L, (long)l);
            m44.a("v", (Object)this, (int)m44.a("t", (Object)sp2, (long)-1194928158715431396L, (long)l), (long)-1194928158715431396L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-1250738760318918845L, (long)l)), (long)-1250738760318918845L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-676088917064628481L, (long)l)), (long)-676088917064628481L, (long)l);
            m44.a("v", (Object)this, (Integer)((Object)m44.a("t", (Object)sp2, (long)-1107586171597771232L, (long)l)), (long)-1107586171597771232L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-1243873170220402807L, (long)l)), (long)-1243873170220402807L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-1672820996491009690L, (long)l)), (long)-1672820996491009690L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-1114359278376136400L, (long)l)), (long)-1114359278376136400L, (long)l);
            m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)sp2, (long)-583838860850455181L, (long)l)), (long)-583838860850455181L, (long)l);
            m44.a("v", (Object)this, (boolean)true, (long)-1418802440855887595L, (long)l);
            if (objectInputStream == null) return;
        }
        catch (IOException iOException) {
            if (objectInputStream == null) return;
            try {
                m44.a("u", (Object)objectInputStream, (long)-719986910111946196L, (long)l);
                return;
            }
            catch (IOException iOException2) {
                return;
            }
            catch (ClassNotFoundException classNotFoundException) {
                if (objectInputStream == null) return;
                try {
                    m44.a("u", (Object)objectInputStream, (long)-719986910111946196L, (long)l);
                    return;
                }
                catch (IOException iOException3) {
                    return;
                }
                catch (ClassCastException classCastException) {
                    if (objectInputStream == null) return;
                    try {
                        m44.a("u", (Object)objectInputStream, (long)-719986910111946196L, (long)l);
                        return;
                    }
                    catch (IOException iOException4) {
                        return;
                    }
                    catch (nn nn2) {
                        throw nn2;
                        catch (Throwable throwable) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            m44.a("u", (Object)objectInputStream, (long)-719986910111946196L, (long)l);
            return;
        }
        catch (IOException iOException) {
            return;
        }
        finally {
            if (objectInputStream != null) {
                try {
                    m44.a("u", objectInputStream, (long)-719986910111946196L, (long)l);
                }
                catch (IOException iOException) {}
            }
        }
    }

    public sp() {
        long l = bb ^ 0x20EA93253773L;
        m44.a("q", (Object)this, (int)1, (long)8968584532006535023L, (long)l);
        m44.a("q", (Object)this, (int)0, (long)9190735391229298260L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)8696277051631273854L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)7053670207871907911L, (long)l);
        m44.a("q", (Object)this, (boolean)true, (long)7060008259228716651L, (long)l);
        m44.a("q", (Object)this, (String)H, (long)8997093106544468494L, (long)l);
        m44.a("q", (Object)this, (int)0, (long)8664996810059235403L, (long)l);
        m44.a("q", (Object)this, (int)0, (long)9175443553110116155L, (long)l);
        m44.a("q", (Object)this, (int)3, (long)9211123665671023883L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)7085453862850753456L, (long)l);
        m44.a("q", (Object)this, (boolean)true, (long)7066021171378939393L, (long)l);
        m44.a("q", (Object)this, (boolean)true, (long)8741450361997355172L, (long)l);
        m44.a("q", (Object)this, (boolean)true, (long)7487811987606932659L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)7149859431252664232L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)9193418606746695438L, (long)l);
        m44.a("q", (Object)this, (zy)m44.a("i", (long)8731160933319157330L, (long)l), (long)8983195400049957195L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)8741381093663178999L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)7461055533426358973L, (long)l);
        m44.a("q", (Object)this, (int)0, (long)7257129664585688003L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)8733651551960307411L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)9100148558864945578L, (long)l);
        m44.a("q", (Object)this, (int)1, (long)8939059512546263138L, (long)l);
        m44.a("q", (Object)this, (int)0, (long)7409091380632084694L, (long)l);
        m44.a("q", (Object)this, (int)4, (long)7255710467387721304L, (long)l);
        m44.a("q", (Object)this, (int)0, (long)8660944390912623877L, (long)l);
        m44.a("q", (Object)this, (int)0, (long)9158660880342502499L, (long)l);
        m44.a("q", (Object)this, (boolean)true, (long)6956571511495580133L, (long)l);
        m44.a("q", (Object)this, (int)1, (long)7172525376020067760L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)8876550939476020917L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)8944991355004407406L, (long)l);
        m44.a("q", (Object)this, (boolean)false, (long)6926995084377009230L, (long)l);
        m44.a("q", (Object)this, (boolean)true, (long)7086848461146289335L, (long)l);
        m44.a("q", (Object)this, (int)0, (long)8728303474446791107L, (long)l);
        m44.a("q", (Object)this, (int)1, (long)7024912582158530571L, (long)l);
        m44.a("q", (Object)this, (int)1, (long)7020383274930888117L, (long)l);
    }

    public static int R(String string) {
        long l = bb ^ 0x393C5172736DL;
        return (Integer)m44.a("o", (long)2577610576858817272L, (long)l).get(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string, String string2) {
        File file = new File(string, string2);
        long l = bb ^ 0x693552BD7D9EL;
        if (m44.a("w", (Object)file, (long)3041298914561044460L, (long)l) != false && (m44.a("w", (Object)file, (long)3963286124326550650L, (long)l) != false || m44.a("w", (Object)file, (long)3871653530454879490L, (long)l) == false)) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        m44.a("w", (Object)objectOutputStream, (Object)this, (long)3965795233863829730L, (long)l);
        if (objectOutputStream == null) return;
        try {
            m44.a("w", (Object)objectOutputStream, (long)3299944905887879153L, (long)l);
            return;
        }
        catch (IOException iOException) {}
        return;
        catch (IOException iOException) {
            if (objectOutputStream == null) return;
            try {
                m44.a("w", (Object)objectOutputStream, (long)3299944905887879153L, (long)l);
                return;
            }
            catch (IOException iOException2) {}
            return;
            catch (Throwable throwable) {
                if (objectOutputStream == null) throw throwable;
                try {
                    m44.a("w", objectOutputStream, (long)3299944905887879153L, (long)l);
                    throw throwable;
                }
                catch (IOException iOException3) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    public static String h(String string) {
        long l = bb ^ 0x6C469BD95597L;
        return (String)m44.a("m", (long)445538224191043251L, (long)l).get(string);
    }

    public boolean a() {
        long l = bb ^ 0x1B7A867E97B4L;
        return (boolean)m44.a("t", (Object)this, (long)-4422782430938345531L, (long)l);
    }

    static {
        bb = prr.a((long)-6887721059965044715L, (long)-1773069449901474320L, MethodHandles.lookup().lookupClass()).a(72819424644747L);
        long l = bb ^ 0x16D30AE6C5C8L;
        rg = new HashMap(13);
        rw = new HashMap(13);
        r8 = new HashMap(13);
        rR = new HashMap(13);
        r7 = new HashMap(13);
        m44.a("j", (long)-8116135844866967976L, (long)l).put("none", 0);
        m44.a("j", (long)-8116135844866967976L, (long)l).put("light", 1);
        m44.a("j", (long)-8116135844866967976L, (long)l).put("normal", 2);
        m44.a("j", (long)-8116135844866967976L, (long)l).put("aggressive", 3);
        m44.a("j", (long)-8116135844866967976L, (long)l).put("extraAggressive", 4);
        m44.a("j", (long)-8003780821877105174L, (long)l).put(0, "none");
        m44.a("j", (long)-8003780821877105174L, (long)l).put(1, "light");
        m44.a("j", (long)-8003780821877105174L, (long)l).put(2, "normal");
        m44.a("j", (long)-8003780821877105174L, (long)l).put(3, "aggressive");
        m44.a("j", (long)-8003780821877105174L, (long)l).put(4, "extraAggressive");
        m44.a("j", (long)-7682950993975110563L, (long)l).put("none", 0);
        m44.a("j", (long)-7682950993975110563L, (long)l).put("light", 1);
        m44.a("j", (long)-7682950993975110563L, (long)l).put("heavy", 2);
        m44.a("j", (long)-7667080691600517083L, (long)l).put(0, "none");
        m44.a("j", (long)-7667080691600517083L, (long)l).put(1, "light");
        m44.a("j", (long)-7667080691600517083L, (long)l).put(2, "heavy");
        m44.a("j", (long)-7606117760661428500L, (long)l).put(m44.a("q", (Object)m44.a("j", (long)-7836350749206154409L, (long)l), (long)-8541286828765850228L, (long)l), "none");
        m44.a("j", (long)-7606117760661428500L, (long)l).put(m44.a("q", (Object)m44.a("j", (long)-8474188130304594363L, (long)l), (long)-8541286828765850228L, (long)l), "light");
        m44.a("j", (long)-7606117760661428500L, (long)l).put(m44.a("q", (Object)m44.a("j", (long)-7777149444931921405L, (long)l), (long)-8541286828765850228L, (long)l), "normal");
        m44.a("j", (long)-7606117760661428500L, (long)l).put(m44.a("q", (Object)m44.a("j", (long)-7921766876747477312L, (long)l), (long)-8541286828765850228L, (long)l), "aggressive");
        m44.a("j", (long)-7606117760661428500L, (long)l).put(m44.a("q", (Object)m44.a("j", (long)-8100512803574397690L, (long)l), (long)-7937098622555987965L, (long)l), "heavy");
    }

    public static int N(String string) {
        long l = bb ^ 0x45AADA40C118L;
        return (Integer)m44.a("j", (long)-8390801995706551672L, (long)l).get(string);
    }
}
