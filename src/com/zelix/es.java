/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._v;
import com.zelix.m44;
import com.zelix.m9;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r;
import com.zelix.rg;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class es {
    private rg H;
    private Set Y;
    private Map A;
    private m9 i;
    private r D;
    private static final long a = prr.a((long)-7361996497163897005L, (long)7613458181488428224L, MethodHandles.lookup().lookupClass()).a(221269057722392L);

    public boolean Q(Object[] objectArray) {
        _v _v2 = (_v)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x5885686C6EB4L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = _v2;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)-6880269784924578302L, (long)l), (Object)objectArray2, (long)-6422550781476689088L, (long)l);
    }

    public List d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        ArrayList arrayList = new ArrayList(m44.a("p", (Object)this, (long)-8786859797771095966L, (long)l));
        Collections.sort(arrayList);
        return arrayList;
    }

    public List D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x26A7D5707B3AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("u", (Object)m44.a("t", (Object)this, (long)6900463274842743109L, (long)l), (Object)objectArray2, (long)5133500058605739165L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    List g(Object[] objectArray) {
        ArrayList<CallSite> arrayList;
        long l = (Long)objectArray[0];
        l = a ^ l;
        ArrayList<CallSite> arrayList2 = new ArrayList<CallSite>(m44.a("w", (Object)this, (long)8489073092723587217L, (long)l).size());
        Iterator iterator = m44.a("w", (Object)this, (long)8489073092723587217L, (long)l).entrySet().iterator();
        CallSite callSite = m44.a("i", (long)7735981940524621707L, (long)l);
        block2: while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            try {
                do {
                    arrayList = arrayList2;
                    CallSite callSite2 = callSite;
                    if (l >= 0L) {
                        if (callSite2 != null) return arrayList;
                        callSite2 = entry.getValue();
                    }
                    arrayList.add(callSite2);
                    if (callSite == null) continue block2;
                } while (l < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("i", (Object)((Object)n92), (long)8631568677758011026L, (long)l);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public Set S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("o", (Object)m44.a("q", (Object)this, (long)6610539278712506915L, (long)l), (long)4716407356881245016L, (long)l);
    }

    public boolean V(Object[] objectArray) {
        _v _v2 = (_v)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x6551EB93EE27L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = _v2;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)8972320520152695298L, (long)l), (Object)objectArray2, (long)9206323802905594232L, (long)l);
    }

    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("j", (Object)m44.a("t", (Object)this, (long)4549394454977300814L, (long)l), (long)4278752004871121229L, (long)l);
    }

    void B(Object[] objectArray) {
        rg rg2 = (rg)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("r", (Object)this, (rg)rg2, (long)-4875447650255801582L, (long)l);
    }

    public void q(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        boolean bl = m44.a("u", (Object)this, (long)-78472388559458441L, (long)l).remove(object);
    }

    rg H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        return (rg)m44.a("u", (Object)this, (long)4111016739487216723L, (long)l).get(string);
    }

    public boolean Y(Object[] objectArray) {
        int n;
        block10: {
            block9: {
                es es2;
                CallSite callSite;
                long l;
                block8: {
                    l = (Long)objectArray[0];
                    l = a ^ l;
                    callSite = m44.a("i", (long)-4173775075171618109L, (long)l);
                    try {
                        try {
                            es2 = this;
                            if (callSite != null) break block8;
                            if (m44.a("w", (Object)es2, (long)-4559454474471796739L, (long)l) == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)((Object)n92), (long)-2701875266146456614L, (long)l);
                        }
                        es2 = this;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)((Object)n93), (long)-2701875266146456614L, (long)l);
                    }
                }
                try {
                    try {
                        n = m44.a("w", (Object)es2, (long)-2844234028287584807L, (long)l).size();
                        if (callSite != null) break block10;
                        if (n != m44.a("w", (Object)this, (long)-2690477078647264059L, (long)l).size()) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("i", (Object)((Object)n94), (long)-2701875266146456614L, (long)l);
                    }
                    n = 1;
                    break block10;
                }
                catch (n9 n95) {
                    throw m44.a("i", (Object)((Object)n95), (long)-2701875266146456614L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    rg t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)-7286590862220241500L, (long)l);
    }

    public Set q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x2FF19149DC90L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("p", (Object)m44.a("q", (Object)this, (long)7281835246945786760L, (long)l), (Object)objectArray2, (long)7293618831255252467L, (long)l);
    }

    void H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x69B35379D747L;
        Iterator iterator = m44.a("r", (Object)this, (long)-3308404574471421048L, (long)l).iterator();
        CallSite callSite = m44.a("l", (long)-3447884887728642826L, (long)l);
        while (iterator.hasNext()) {
            _v _v2 = (_v)iterator.next();
            String string = _v2.T(l2);
            m44.a("r", (Object)this, (long)-3702836292793582864L, (long)l).add(string);
            if (callSite == null) continue;
        }
    }

    void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        rg rg2 = (rg)objectArray[2];
        l = a ^ l;
        m44.a("r", (Object)this, (long)3785847267850516948L, (long)l).put(string, rg2);
    }

    /*
     * Unable to fully structure code
     */
    es(short var1_1, int var2_2, m9 var3_3, short var4_4) {
        v0 = var5_5 = ((long)var1_1 << 48 | (long)var2_2 << 32 >>> 16 | (long)var4_4 << 48 >>> 48) ^ es.a;
        var7_6 = v0 ^ 46300270982188L;
        var9_7 = v0 ^ 135093740714659L;
        var11_8 = v0 ^ 135950182542425L;
        var13_9 = v0 ^ 121961320300598L;
        super();
        v1 = m44.a("l", (long)-7753260784084623178L, (long)var5_5);
        v2 = new Object[1];
        v2[0] = var13_9;
        m44.a("p", (Object)this, (r)m44.a("l", (Object)v2, (long)-7635533739843594156L, (long)var5_5), (long)-7613780463344236600L, (long)var5_5);
        v3 = new Object[1];
        v3[0] = var9_7;
        m44.a("p", (Object)this, (Set)m44.a("l", (Object)v3, (long)-7599910994312040700L, (long)var5_5), (long)-8584803643758641488L, (long)var5_5);
        var15_10 = v1;
        v4 = new Object[1];
        v4[0] = var11_8;
        m44.a("p", (Object)this, (Map)m44.a("l", (Object)v4, (long)-8629461731746976545L, (long)var5_5), (long)-8434564856380110932L, (long)var5_5);
        m44.a("p", (Object)this, (m9)var3_3, (long)-7681637927612470301L, (long)var5_5);
        v5 = new Object[1];
        v5[0] = var7_6;
        var16_11 = m44.a("s", (Object)var3_3, (Object)v5, (long)-7745041214984953071L, (long)var5_5).iterator();
        while (var16_11.hasNext()) {
            m44.a("r", (Object)this, (long)-7613780463344236600L, (long)var5_5).addAll((Collection)var16_11.next());
lbl30:
            // 2 sources

            ** while (var15_10 != null)
lbl31:
            // 1 sources

        }
lbl32:
        // 2 sources

        if (var1_1 < 0) ** GOTO lbl30
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
