/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._s;
import com.zelix.m44;
import com.zelix.nn;
import com.zelix.prr;
import com.zelix.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class as
implements Serializable {
    private String e;
    private String h;
    private String c;
    private String i;
    private boolean l;
    private String a;
    private boolean B;
    private String g;
    public static final int q = 2;
    private boolean k;
    private int j;
    private String o;
    private s n;
    public static final int p = 1;
    private boolean f;
    private String b;
    private String d;
    private _s m;
    public static final int r = 3;
    private static final long s = prr.a((long)-756532480295147748L, (long)-2213433978184535521L, MethodHandles.lookup().lookupClass()).a(40263132638345L);

    public synchronized void a(boolean bl) {
        long l = s ^ 0x69C89D4736FDL;
        m44.a("s", (Object)this, (boolean)bl, (long)-5873851831249286429L, (long)l);
    }

    public synchronized void f(String string) {
        long l = s ^ 0x70DCF6D6291FL;
        m44.a("q", (Object)this, (String)string, (long)-6258534424851043232L, (long)l);
    }

    public synchronized boolean j() {
        long l = s ^ 0x15B3DA354905L;
        return (boolean)m44.a("q", (Object)this, (long)-3557164451697804804L, (long)l);
    }

    public synchronized void a(String string) {
        long l = s ^ 0x1DE8DEE2015FL;
        m44.a("q", (Object)this, (String)string, (long)-8731744560998452987L, (long)l);
    }

    public synchronized _s b() {
        long l = s ^ 0x7DA176E83E67L;
        return m44.a("s", (Object)this, (long)-6866454401487769536L, (long)l);
    }

    public synchronized void b(int n, int n2) {
        long l = s ^ 0x231CC7DF2B30L;
        m44.a("v", (Object)this, (s)new s(n, n2), (long)-5842321470553614414L, (long)l);
    }

    public synchronized String h() {
        long l = s ^ 0x48C56BC296EBL;
        return m44.a("w", (Object)this, (long)1644095339321856916L, (long)l);
    }

    public synchronized boolean k() {
        long l = s ^ 0x28FA7A56C504L;
        return (boolean)m44.a("p", (Object)this, (long)6669051615516646528L, (long)l);
    }

    public synchronized void e(String string) {
        long l = s ^ 0xC318F33FB6DL;
        m44.a("s", (Object)this, (String)string, (long)8979085988106920844L, (long)l);
    }

    public synchronized String f() {
        long l = s ^ 0x63BCDBCEC51DL;
        return m44.a("q", (Object)this, (long)4805812624046284051L, (long)l);
    }

    public synchronized void b(boolean bl) {
        long l = s ^ 0x2611F9CFB837L;
        m44.a("q", (Object)this, (boolean)bl, (long)4580260210926241998L, (long)l);
    }

    public synchronized String m() {
        long l = s ^ 0x44D1F8882DF3L;
        return m44.a("w", (Object)this, (long)-5407091603561504752L, (long)l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private synchronized void a(String string, String string2) {
        File file = new File(string, string2);
        long l = s ^ 0x4FB33FA1CB85L;
        if (m44.a("p", (Object)file, (long)5371646468846079827L, (long)l) != false && (m44.a("p", (Object)file, (long)6322871926159809733L, (long)l) != false || m44.a("p", (Object)file, (long)6126533080512073149L, (long)l) == false)) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        m44.a("p", (Object)objectOutputStream, (Object)this, (long)6320350177313450077L, (long)l);
        if (objectOutputStream == null) return;
        try {
            m44.a("p", (Object)objectOutputStream, (long)5581353395177058126L, (long)l);
            return;
        }
        catch (IOException iOException) {}
        return;
        catch (IOException iOException) {
            if (objectOutputStream == null) return;
            try {
                m44.a("p", (Object)objectOutputStream, (long)5581353395177058126L, (long)l);
                return;
            }
            catch (IOException iOException2) {}
            return;
            catch (Throwable throwable) {
                if (objectOutputStream == null) throw throwable;
                try {
                    m44.a("p", objectOutputStream, (long)5581353395177058126L, (long)l);
                    throw throwable;
                }
                catch (IOException iOException3) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    public synchronized void l(boolean bl) {
        long l = s ^ 0x7BF2F2C9D6E5L;
        m44.a("s", (Object)this, (boolean)bl, (long)5723063664727183201L, (long)l);
    }

    public synchronized void g(String string) {
        long l = s ^ 0x81896E6D2B0L;
        m44.a("v", (Object)this, (String)string, (long)5455383195540709203L, (long)l);
    }

    public synchronized void m(int n) {
        long l = s ^ 0x212885E8601DL;
        m44.a("s", (Object)this, (int)n, (long)-432229721319738770L, (long)l);
    }

    public synchronized String g() {
        long l = s ^ 0x6504D034697CL;
        return m44.a("p", (Object)this, (long)-1257218878337224291L, (long)l);
    }

    public synchronized void d(String string) {
        long l = s ^ 0x1C30552958BBL;
        m44.a("u", (Object)this, (String)string, (long)-2371195154150571851L, (long)l);
    }

    public synchronized s c() {
        long l = s ^ 0x6942B065376AL;
        return m44.a("v", (Object)this, (long)-5570480164280103960L, (long)l);
    }

    public synchronized void c(String string) {
        long l = s ^ 0x5F45CD237764L;
        m44.a("r", (Object)this, (String)string, (long)-632248929577063053L, (long)l);
    }

    public synchronized void b(String string) {
        long l = s ^ 0x82C3099A7AEL;
        m44.a("p", (Object)this, (String)string, (long)2447295350398728424L, (long)l);
    }

    public synchronized String d() {
        long l = s ^ 0x706C48B2F285L;
        return m44.a("q", (Object)this, (long)8421153406152895939L, (long)l);
    }

    public synchronized String a() {
        long l = s ^ 0x525EC11D3D26L;
        return m44.a("r", (Object)this, (long)-4995667211209945732L, (long)l);
    }

    public synchronized boolean i() {
        long l = s ^ 0x45765E431815L;
        return (boolean)m44.a("q", (Object)this, (long)-9181768305107540981L, (long)l);
    }

    public synchronized void a(int n, int n2) {
        long l = s ^ 0x3637B4C15B0L;
        m44.a("v", (Object)this, (_s)new _s(n, n2), (long)-8403142031466865769L, (long)l);
    }

    public synchronized boolean X() {
        long l = s ^ 0xB9CD8A313BL;
        return (boolean)m44.a("w", (Object)this, (long)-5678470413951873119L, (long)l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public as(String string, String string2) {
        long l = s ^ 0x7CAD908517EEL;
        m44.a("p", (Object)this, (boolean)true, (long)-8112962580607538192L, (long)l);
        m44.a("p", (Object)this, (int)1, (long)-8218166763407047267L, (long)l);
        m44.a("p", (Object)this, (boolean)true, (long)-8049901925156002025L, (long)l);
        m44.a("p", (Object)this, (boolean)true, (long)-8185451426163552662L, (long)l);
        m44.a("p", (Object)this, (_s)new _s(0, 0), (long)-8557836450491901495L, (long)l);
        m44.a("p", (Object)this, (s)new s(400, 300), (long)-7911214710960575636L, (long)l);
        m44.a("p", (Object)this, (String)string2, (long)-8181196013060835626L, (long)l);
        m44.a("p", (Object)this, (String)string, (long)-8410402994876768768L, (long)l);
        File file = new File(string, string2);
        if (m44.a("s", (Object)file, (long)-7574809251186896072L, (long)l) == false) return;
        if (m44.a("s", (Object)file, (long)-8370949693467836242L, (long)l) != false) return;
        if (m44.a("s", (Object)file, (long)-8469985207325795610L, (long)l) == false) return;
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            as as2 = (as)((Object)m44.a("s", (Object)objectInputStream, (long)-8077075703500659616L, (long)l));
            m44.a("p", (Object)this, (boolean)m44.a("r", (Object)as2, (long)-7500893429545932428L, (long)l), (long)-7500893429545932428L, (long)l);
            m44.a("p", (Object)this, (String)((Object)m44.a("r", (Object)as2, (long)-7946884503448352600L, (long)l)), (long)-7946884503448352600L, (long)l);
            m44.a("p", (Object)this, (String)((Object)m44.a("r", (Object)as2, (long)-8042305435826657356L, (long)l)), (long)-8042305435826657356L, (long)l);
            m44.a("p", (Object)this, (String)((Object)m44.a("r", (Object)as2, (long)-8051677403034546208L, (long)l)), (long)-8051677403034546208L, (long)l);
            m44.a("p", (Object)this, (boolean)m44.a("r", (Object)as2, (long)-8112962580607538192L, (long)l), (long)-8112962580607538192L, (long)l);
            m44.a("p", (Object)this, (String)((Object)m44.a("r", (Object)as2, (long)-8061601945741553905L, (long)l)), (long)-8061601945741553905L, (long)l);
            m44.a("p", (Object)this, (String)((Object)m44.a("r", (Object)as2, (long)-8148385386147276275L, (long)l)), (long)-8148385386147276275L, (long)l);
            m44.a("p", (Object)this, (String)((Object)m44.a("r", (Object)as2, (long)-7506317053639257455L, (long)l)), (long)-7506317053639257455L, (long)l);
            m44.a("p", (Object)this, (String)((Object)m44.a("r", (Object)as2, (long)-7515400455596913159L, (long)l)), (long)-7515400455596913159L, (long)l);
            m44.a("p", (Object)this, (int)m44.a("r", (Object)as2, (long)-8218166763407047267L, (long)l), (long)-8218166763407047267L, (long)l);
            m44.a("p", (Object)this, (boolean)m44.a("r", (Object)as2, (long)-8049901925156002025L, (long)l), (long)-8049901925156002025L, (long)l);
            m44.a("p", (Object)this, (boolean)m44.a("r", (Object)as2, (long)-8185451426163552662L, (long)l), (long)-8185451426163552662L, (long)l);
            m44.a("p", (Object)this, (_s)m44.a("r", (Object)as2, (long)-8557836450491901495L, (long)l), (long)-8557836450491901495L, (long)l);
            m44.a("p", (Object)this, (s)m44.a("r", (Object)as2, (long)-7911214710960575636L, (long)l), (long)-7911214710960575636L, (long)l);
            if (objectInputStream == null) return;
        }
        catch (IOException iOException) {
            if (objectInputStream == null) return;
            try {
                m44.a("s", (Object)objectInputStream, (long)-8202145999502388734L, (long)l);
                return;
            }
            catch (IOException iOException2) {
                return;
            }
            catch (ClassNotFoundException classNotFoundException) {
                if (objectInputStream == null) return;
                try {
                    m44.a("s", (Object)objectInputStream, (long)-8202145999502388734L, (long)l);
                    return;
                }
                catch (IOException iOException3) {
                    return;
                }
                catch (ClassCastException classCastException) {
                    if (objectInputStream == null) return;
                    try {
                        m44.a("s", (Object)objectInputStream, (long)-8202145999502388734L, (long)l);
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
            m44.a("s", (Object)objectInputStream, (long)-8202145999502388734L, (long)l);
            return;
        }
        catch (IOException iOException) {
            return;
        }
        finally {
            if (objectInputStream != null) {
                try {
                    m44.a("s", objectInputStream, (long)-8202145999502388734L, (long)l);
                }
                catch (IOException iOException) {}
            }
        }
    }

    public as() {
        long l = s ^ 0x50714CD9EB7EL;
        m44.a("p", (Object)this, (boolean)true, (long)8356670282651735904L, (long)l);
        m44.a("p", (Object)this, (int)1, (long)8170400546091399437L, (long)l);
        m44.a("p", (Object)this, (boolean)true, (long)7843348629083069319L, (long)l);
        m44.a("p", (Object)this, (boolean)true, (long)8284164355475534586L, (long)l);
        m44.a("p", (Object)this, (_s)new _s(0, 0), (long)8479250923335886169L, (long)l);
        m44.a("p", (Object)this, (s)new s(400, 300), (long)7972942534492379132L, (long)l);
    }

    public synchronized void Z(boolean bl) {
        long l = s ^ 0x91597B1CCA0L;
        m44.a("v", (Object)this, (boolean)bl, (long)5523960242757349946L, (long)l);
    }

    public synchronized void l() {
        long l = s ^ 0x56C360F18196L;
        m44.a("m", (Object)this, (Object)m44.a("r", (Object)this, (long)2103204560792815736L, (long)l), (Object)m44.a("r", (Object)this, (long)1733507609972842670L, (long)l), (long)1749989257379667581L, (long)l);
    }

    public synchronized String e() {
        long l = s ^ 0x128D931E6B71L;
        return m44.a("u", (Object)this, (long)-1500682487149547162L, (long)l);
    }

    public synchronized int t() {
        long l = s ^ 0x66511058C27CL;
        return (int)m44.a("p", (Object)this, (long)6368422073033707535L, (long)l);
    }
}
