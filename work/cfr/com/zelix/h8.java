/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._v;
import com.zelix.bf;
import com.zelix.bn;
import com.zelix.cf;
import com.zelix.e4;
import com.zelix.hk;
import com.zelix.l62;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sh;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class h8
extends hk {
    protected Map A;
    protected Map x;
    protected Map e;
    protected Map L;
    protected Map H;
    protected Map i;
    private static final long h = prr.a(1324747485954224115L, -3849378514035416537L, MethodHandles.lookup().lookupClass()).a(86711208817848L);

    public final boolean S(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = h ^ l10;
                CallSite callSite = m44.a("o", (long)7230004076312396826L, (long)l10);
                try {
                    bl2 = m44.a("q", (Object)this, (long)9151934540556821268L, (long)l10).size();
                    if (callSite != null) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)7110880499410564485L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean z(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                CallSite callSite = m44.a("i", (long)2335156559539552292L, (long)l10);
                try {
                    bl2 = this.L.size();
                    if (callSite != null) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)n92, (long)2778979088510169531L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public Enumeration B(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (var2_2 = h8.h ^ var2_2) ^ 131791258264936L;
        var7_4 = new bf[m44.a("q", (Object)this, (long)6397299713032199081L, (long)var2_2).size()];
        var8_5 = m44.a("q", (Object)this, (long)6397299713032199081L, (long)var2_2).keySet().iterator();
        var9_6 = 0;
        var6_7 = m44.a("o", (long)6459940332953745898L, (long)var2_2);
        while (var8_5.hasNext()) {
            var7_4[var9_6++] = (bf)var8_5.next();
lbl11:
            // 2 sources

            ** while (var6_7 != null)
lbl12:
            // 1 sources

        }
lbl13:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl11
        return new e4(var4_3, var7_4);
    }

    public final boolean B(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = h ^ l10;
                CallSite callSite = m44.a("l", (long)1361536724750529193L, (long)l10);
                try {
                    bl2 = m44.a("r", (Object)this, (long)892965070163665519L, (long)l10).size();
                    if (callSite != null) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)1449569925688656694L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public Enumeration V(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (var2_2 = h8.h ^ var2_2) ^ 130192931204253L;
        var7_4 = new bn[this.i.size()];
        var8_5 = this.i.keySet().iterator();
        var9_6 = 0;
        var6_7 = m44.a("j", (long)-3435313905350103009L, (long)var2_2);
        while (var8_5.hasNext()) {
            var7_4[var9_6++] = (bn)var8_5.next();
lbl11:
            // 2 sources

            ** while (var6_7 != null)
lbl12:
            // 1 sources

        }
lbl13:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl11
        return new e4(var4_3, var7_4);
    }

    public Enumeration s(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10;
        long l12 = l11 ^ 0x4B2559E79504L;
        long l13 = l11 ^ 0x2FB8D80B57EL;
        int n10 = (int)(l13 >>> 32);
        int n11 = (int)(l13 << 32 >>> 48);
        int n12 = (int)(l13 << 48 >>> 48);
        long l14 = l11 ^ 0x20BF689C500AL;
        int n13 = this.i.size() + this.L.size();
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l12;
        objectArray2[0] = cf.x(n13, n10, (char)n11, (short)n12);
        CallSite callSite = m44.a("l", (Object)objectArray2, (long)6415186866252369487L, (long)l10);
        callSite.addAll(this.i.keySet());
        callSite.addAll(this.L.keySet());
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l14;
        objectArray3[0] = callSite;
        return m44.a("l", (Object)objectArray3, (long)6689983746169545984L, (long)l10);
    }

    public final Enumeration a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = h ^ l10) ^ 0x55DF40815C6CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("t", (Object)this, (long)5470249642631276001L, (long)l10).keySet();
        return m44.a("j", (Object)objectArray2, (long)5814689889245964646L, (long)l10);
    }

    public final boolean t(Object[] objectArray) {
        block6: {
            l62 l622;
            long l10;
            long l11;
            block5: {
                l11 = (Long)objectArray[0];
                String string = (String)objectArray[1];
                l10 = (l11 = h ^ l11) ^ 0x7DC26413F27CL;
                l62 l623 = l62.t(string);
                CallSite callSite = m44.a("n", (long)8736735498130102643L, (long)l11);
                try {
                    l622 = l623;
                    if (callSite != null) break block5;
                    if (l622 == null) break block6;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)9207557625220393196L, (long)l11);
                }
                l622 = l623;
            }
            _f _f2 = l622.G(l10);
            try {
                if (_f2 != null) {
                    return m44.a("p", (Object)this, (long)7091778780043771517L, (long)l11).containsKey(_f2);
                }
            }
            catch (n9 n93) {
                throw m44.a("n", (Object)n93, (long)9207557625220393196L, (long)l11);
            }
        }
        return false;
    }

    public final Enumeration C(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = h ^ l10) ^ 0x2EABBF9825B2L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("r", (Object)this, (long)4026504581026491383L, (long)l10).keySet();
        return m44.a("l", (Object)objectArray2, (long)2985770904251191480L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public Enumeration n(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (var2_2 = h8.h ^ var2_2) ^ 83124513992718L;
        var7_4 = new bn[this.L.size()];
        var8_5 = this.L.keySet().iterator();
        var9_6 = 0;
        var6_7 = m44.a("i", (long)-8304517018721194868L, (long)var2_2);
        while (var8_5.hasNext()) {
            var7_4[var9_6++] = (bn)var8_5.next();
lbl11:
            // 2 sources

            ** while (var6_7 != null)
lbl12:
            // 1 sources

        }
lbl13:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl11
        return new e4(var4_3, var7_4);
    }

    public final boolean N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        _f _f2 = (_f)objectArray[1];
        l10 = h ^ l10;
        return m44.a("t", (Object)this, (long)-2942460221070034655L, (long)l10).containsKey(_f2);
    }

    public abstract boolean H(Object[] var1);

    public Enumeration N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10;
        long l12 = l11 ^ 0x3C65EED5E3BBL;
        long l13 = l11 ^ 0x75BB3AB2C3C1L;
        int n10 = (int)(l13 >>> 32);
        int n11 = (int)(l13 << 32 >>> 48);
        int n12 = (int)(l13 << 48 >>> 48);
        long l14 = l11 ^ 0x57FFDFAE26B5L;
        int n13 = m44.a("u", (Object)this, (long)3374317546139971005L, (long)l10).size() + m44.a("u", (Object)this, (long)3756581548823623480L, (long)l10).size();
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l12;
        objectArray2[0] = cf.x(n13, n10, (char)n11, (short)n12);
        CallSite callSite = m44.a("k", (Object)objectArray2, (long)3438539236025514224L, (long)l10);
        callSite.addAll(m44.a("u", (Object)this, (long)3374317546139971005L, (long)l10).keySet());
        callSite.addAll(m44.a("u", (Object)this, (long)3756581548823623480L, (long)l10).keySet());
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l14;
        objectArray3[0] = callSite;
        return m44.a("k", (Object)objectArray3, (long)3055955701959545791L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public Enumeration e(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (var2_2 = h8.h ^ var2_2) ^ 111940532874516L;
        var7_4 = new bf[m44.a("u", (Object)this, (long)-3870244859930490544L, (long)var2_2).size()];
        var8_5 = m44.a("u", (Object)this, (long)-3870244859930490544L, (long)var2_2).keySet().iterator();
        var6_6 = m44.a("k", (long)-3325271073880165994L, (long)var2_2);
        var9_7 = 0;
        while (var8_5.hasNext()) {
            var7_4[var9_7++] = (bf)var8_5.next();
lbl11:
            // 2 sources

            ** while (var6_6 != null)
lbl12:
            // 1 sources

        }
lbl13:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl11
        return new e4(var4_3, var7_4);
    }

    public boolean A(Object[] objectArray) {
        bf bf2 = (bf)objectArray[0];
        long l10 = (Long)objectArray[1];
        return m44.a("v", (Object)this, (long)5611629803571580558L, (long)l10).containsKey(bf2);
    }

    public Enumeration j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x43A3A032BF9BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("v", (Object)this.f, (Object)objectArray2, (long)-197694930659468342L, (long)l10);
    }

    public Enumeration W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = (l10 = h ^ l10) ^ 0x5A44ECD7FE13L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("t", (Object)this.f, (Object)objectArray2, (long)2032351546686642203L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean h(Object[] objectArray) {
        boolean bl2;
        block17: {
            boolean bl3;
            block18: {
                _f _f2 = (_f)objectArray[0];
                long l10 = (Long)objectArray[1];
                long l11 = l10 = h ^ l10;
                long l12 = l11 ^ 0x738A890116CAL;
                long l13 = l12 >>> 32;
                int n10 = (int)(l12 << 32 >>> 32);
                long l14 = l11 ^ 0x48073EF79BA5L;
                int n11 = (int)(l14 >>> 48);
                int n12 = (int)(l14 << 16 >>> 48);
                int n13 = (int)(l14 << 32 >>> 32);
                CallSite callSite = m44.a("k", (long)2657789119584683182L, (long)l10);
                try {
                    if (_f2 == null) {
                        return false;
                    }
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)2457438562549380401L, (long)l10);
                }
                bl3 = m44.a("u", (Object)this, (long)4590940983260095392L, (long)l10).containsKey(_f2);
                try {
                    try {
                        try {
                            bl2 = bl3;
                            if (callSite != null) break block17;
                            if (bl2) break block18;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)n93, (long)2457438562549380401L, (long)l10);
                        }
                        bl2 = _f2.P((char)n11, (short)n12, n13);
                        if (callSite != null) break block17;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)n94, (long)2457438562549380401L, (long)l10);
                    }
                    if (!bl2) break block18;
                }
                catch (n9 n95) {
                    throw m44.a("k", (Object)n95, (long)2457438562549380401L, (long)l10);
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = n10;
                objectArray2[0] = l13;
                Iterator iterator = m44.a("t", (Object)_f2, (Object)objectArray2, (long)4299408452019920734L, (long)l10).iterator();
                block14: while (iterator.hasNext()) {
                    _v _v2 = (_v)iterator.next();
                    bl3 = m44.a("u", (Object)this, (long)4590940983260095392L, (long)l10).containsKey(_v2);
                    try {
                        do {
                            block19: {
                                try {
                                    try {
                                        bl2 = bl3;
                                        if (callSite != null) break block17;
                                        if (!bl2) break block19;
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("k", (Object)n96, (long)2457438562549380401L, (long)l10);
                                    }
                                    if (callSite == null) break block14;
                                }
                                catch (n9 n97) {
                                    throw m44.a("k", (Object)n97, (long)2457438562549380401L, (long)l10);
                                }
                            }
                            if (callSite == null) continue block14;
                        } while (l10 <= 0L);
                        break;
                    }
                    catch (n9 n98) {
                        throw m44.a("k", (Object)n98, (long)2457438562549380401L, (long)l10);
                    }
                }
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public h8(sh sh2, List list, long l10, lqu lqu2) {
        long l11 = (l10 = h ^ l10) ^ 0x69C840D37273L;
        super(sh2, list, l11, lqu2);
    }

    public final boolean C(Object[] objectArray) {
        _f _f2 = (_f)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = h ^ l10;
        return m44.a("u", (Object)this, (long)4971471386627692776L, (long)l10).containsKey(_f2);
    }

    public boolean k(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                CallSite callSite = m44.a("h", (long)3501956904066437333L, (long)l10);
                try {
                    bl2 = m44.a("v", (Object)this, (long)3101027537928136723L, (long)l10).size();
                    if (callSite != null) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)3918620980754194762L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final Enumeration c(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = h ^ l10) ^ 0x4561A5D1E73L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l11;
        CallSite callSite = m44.a("u", (Object)this.f, (Object)objectArray2, (long)-3734778540787872199L, (long)l10);
        return callSite;
    }

    public boolean j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        bn bn2 = (bn)objectArray[1];
        return this.i.containsKey(bn2);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

