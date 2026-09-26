/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._g;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.us;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class zf
implements us {
    private _g f;
    private final boolean K;
    private s4 e;
    private Map b;
    private boolean r;
    private static final long a = prr.a((long)7799561010784513346L, (long)-4119499461467988828L, MethodHandles.lookup().lookupClass()).a(77730575346893L);

    static void f(Object[] objectArray) {
        zf zf2 = (zf)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x2ED2CA1993FCL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("o", (Object)zf2, (Object)objectArray2, (long)2436122099056456599L, (long)l);
    }

    public void x(m m2, Object object, Object object2, Object object3, long l) {
        long l2 = l ^ 0x113CFF3933EL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("m", (Object)this, (Object)objectArray, (long)2381550867273167701L, (long)l);
    }

    private void G(Object[] objectArray) {
        Object object;
        block15: {
            long l;
            long l2;
            block13: {
                long l3;
                block14: {
                    block10: {
                        zf zf2;
                        zf zf3;
                        block12: {
                            long l4;
                            long l5;
                            block11: {
                                l2 = (Long)objectArray[0];
                                long l6 = l2 = a ^ l2;
                                l5 = l6 ^ 0x499E303C8307L;
                                l3 = l6 ^ 0x32AD881C614CL;
                                l4 = l6 ^ 0x4FDA5A980560L;
                                long l7 = l6 ^ 0x3A4B7420380DL;
                                int n = (int)(l7 >>> 32);
                                int n2 = (int)(l7 << 32 >>> 48);
                                int n3 = (int)(l7 << 48 >>> 48);
                                CallSite callSite = m44.a("i", (long)-9151201135196380852L, (long)l2);
                                try {
                                    try {
                                        try {
                                            try {
                                                zf3 = this;
                                                if (callSite != null) break block10;
                                                if (m44.a("w", (Object)zf3, (long)-8743626362327469382L, (long)l2) != false) break block11;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("i", (Object)((Object)n92), (long)-9160721785855816574L, (long)l2);
                                            }
                                            zf3 = this;
                                            if (l2 < 0L || callSite != null) break block10;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("i", (Object)((Object)n93), (long)-9160721785855816574L, (long)l2);
                                        }
                                        if (l2 < 0L) break block12;
                                        if (m44.a("w", (Object)zf3, (long)-9105314906087348602L, (long)l2) == null) break block11;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("i", (Object)((Object)n94), (long)-9160721785855816574L, (long)l2);
                                    }
                                    Object[] objectArray2 = new Object[3];
                                    objectArray2[2] = (int)((char)n3);
                                    objectArray2[1] = n2;
                                    objectArray2[0] = n;
                                    m44.a("v", (Object)m44.a("w", (Object)this, (long)-9105314906087348602L, (long)l2), (Object)objectArray2, (long)-7448154940065160536L, (long)l2);
                                }
                                catch (n9 n95) {
                                    throw m44.a("i", (Object)((Object)n95), (long)-9160721785855816574L, (long)l2);
                                }
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l4;
                            m44.a("u", (Object)this, (_g)new _g((String)((Object)m44.a("v", (Object)m44.a("w", (Object)this, (long)-8730571145654847784L, (long)l2), (Object)objectArray3, (long)-8817268919529964339L, (long)l2)), l5, (boolean)m44.a("w", (Object)this, (long)-8777220867052286474L, (long)l2)), (long)-9105314906087348602L, (long)l2);
                            zf2 = this;
                        }
                        m44.a("u", (Object)zf2, (boolean)false, (long)-8743626362327469382L, (long)l2);
                        zf3 = this;
                    }
                    try {
                        l = -8953793744261632534L;
                        if (l2 < 0L) break block13;
                        if (m44.a("m", (long)l, (long)l2) == false) break block14;
                        object = new ConcurrentHashMap();
                        break block15;
                    }
                    catch (n9 n96) {
                        throw m44.a("i", (Object)((Object)n96), (long)-9160721785855816574L, (long)l2);
                    }
                }
                l = l3;
            }
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l;
            object = m44.a("i", (Object)objectArray4, (long)-8851623520716791350L, (long)l2);
        }
        zf3.b = object;
    }

    static s4 z(Object[] objectArray) {
        zf zf2 = (zf)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return m44.a("r", (Object)zf2, (long)-9166047125492027195L, (long)l);
    }

    public Integer V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x1BDF5062AD2CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("v", (Object)m44.a("w", (Object)this, (long)1742479125376018464L, (long)l), (Object)objectArray2, (long)1895003283078507580L, (long)l);
    }

    static _g v(Object[] objectArray) {
        zf zf2 = (zf)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return m44.a("q", (Object)zf2, (long)-5974796862409078224L, (long)l);
    }

    zf(long l, s4 s42, boolean bl) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x6612635361C3L;
        long l4 = l2 ^ 0x2FB0E2A897DBL;
        m44.a("u", (Object)this, (boolean)false, (long)4231258731478666922L, (long)l);
        m44.a("u", (Object)this, (s4)s42, (long)4235304013001853640L, (long)l);
        this.K = bl;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = this;
        m44.a("v", (Object)s42, (Object)objectArray, (long)4199624475709122888L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        m44.a("h", (Object)this, (Object)objectArray2, (long)2731953545779361712L, (long)l);
    }

    static Map w(zf zf2) {
        return zf2.b;
    }

    static boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        zf zf2 = (zf)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        l = a ^ l;
        boolean bl2 = bl;
        m44.a("r", (Object)zf2, (boolean)bl2, (long)3821055833247203605L, (long)l);
        return bl2;
    }

    public void W(Object[] objectArray) {
        block10: {
            zf zf2;
            block11: {
                CallSite callSite;
                long l;
                long l2;
                block8: {
                    block9: {
                        l2 = (Long)objectArray[0];
                        long l3 = l2 = a ^ l2;
                        l = l3 ^ 0xEAE224B85DDL;
                        long l4 = l3 ^ 0x6BAC0EB01B0CL;
                        int n = (int)(l4 >>> 32);
                        int n2 = (int)(l4 << 32 >>> 48);
                        int n3 = (int)(l4 << 48 >>> 48);
                        callSite = m44.a("h", (long)-6773071985822416307L, (long)l2);
                        try {
                            try {
                                zf2 = this;
                                if (callSite != null) break block8;
                                if (m44.a("v", (Object)zf2, (long)-6727747055335766649L, (long)l2) == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-6638369668699394173L, (long)l2);
                            }
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = (int)((char)n3);
                            objectArray2[1] = n2;
                            objectArray2[0] = n;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-6727747055335766649L, (long)l2), (Object)objectArray2, (long)-4925944668416884311L, (long)l2);
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-6638369668699394173L, (long)l2);
                        }
                    }
                    zf2 = this;
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (m44.a("v", (Object)zf2, (long)-6496558822635104807L, (long)l2) == null) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)((Object)n94), (long)-6638369668699394173L, (long)l2);
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l;
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-6496558822635104807L, (long)l2), (Object)objectArray3, (long)-4864541194913068401L, (long)l2);
                }
                catch (n9 n95) {
                    throw m44.a("h", (Object)((Object)n95), (long)-6638369668699394173L, (long)l2);
                }
            }
            zf2 = this;
        }
        zf2.b = null;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
