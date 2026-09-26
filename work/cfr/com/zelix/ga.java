/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.df;
import com.zelix.iq;
import com.zelix.lmt;
import com.zelix.m44;
import com.zelix.m7;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.se;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.HashSet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ga
implements lmt {
    private int B;
    private int e;
    final se j;
    private iq z;
    private int r;
    private iq d;
    private static final long a = prr.a(762427153594386948L, -8233503798853607988L, MethodHandles.lookup().lookupClass()).a(137527476984462L);

    ga(se se2) {
        this.j = se2;
    }

    int A(Object[] objectArray) {
        ga ga2;
        long l10;
        block8: {
            block9: {
                l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("m", (long)2561567369901078379L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                ga2 = this;
                                if (callSite != false) break block8;
                                if (m44.a("s", (Object)ga2, (long)2413130658609703173L, (long)l10) == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)n92, (long)2461076979151958104L, (long)l10);
                            }
                            ga2 = this;
                            if (callSite != false) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)n93, (long)2461076979151958104L, (long)l10);
                        }
                        if (m44.a("s", (Object)ga2, (long)4141250325536276954L, (long)l10) == null) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)n94, (long)2461076979151958104L, (long)l10);
                    }
                    return ((iq)((Object)m44.a("s", (Object)this, (long)4141250325536276954L, (long)l10))).B() - ((iq)((Object)m44.a("s", (Object)this, (long)2413130658609703173L, (long)l10))).B();
                }
                catch (n9 n95) {
                    throw m44.a("m", (Object)n95, (long)2461076979151958104L, (long)l10);
                }
            }
            ga2 = this;
        }
        return (int)(m44.a("s", (Object)ga2, (long)2491953288193358134L, (long)l10) - m44.a("s", (Object)this, (long)2568675645344592848L, (long)l10));
    }

    boolean t(Object[] objectArray) {
        boolean bl2;
        block8: {
            block7: {
                CallSite callSite;
                long l10;
                block6: {
                    l10 = (Long)objectArray[0];
                    l10 = a ^ l10;
                    CallSite callSite2 = m44.a("i", (long)8198946756345856128L, (long)l10);
                    try {
                        try {
                            callSite = m44.a("w", (Object)this, (long)7737562946576343833L, (long)l10);
                            if (callSite2 == false) break block6;
                            if (callSite == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)n92, (long)7510862286200715844L, (long)l10);
                        }
                        callSite = m44.a("w", (Object)this, (long)8315012943186938822L, (long)l10);
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)n93, (long)7510862286200715844L, (long)l10);
                    }
                }
                try {
                    if (callSite == null) break block7;
                    bl2 = true;
                    break block8;
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)n94, (long)7510862286200715844L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    void H(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("s", (Object)this, (int)n10, (long)-2093637855115155976L, (long)l10);
    }

    void m(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("w", (Object)this, (int)n10, (long)7078426185127391822L, (long)l10);
    }

    int i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("v", (Object)this, (long)-1171353488601388873L, (long)l10);
    }

    @Override
    public void X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l11 = l10 ^ 0x6F3E14B71D18L;
        long l12 = l11 >>> 16;
        int n10 = (int)(l11 << 48 >>> 48);
        df2.L(l12, (char)n10, m44.a("w", (Object)this, (long)-5239529859070836943L, (long)l10), this);
        df2.L(l12, (char)n10, m44.a("w", (Object)this, (long)-5815000422158362642L, (long)l10), this);
    }

    void n(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("u", (Object)this, (int)n10, (long)-7351735440261774758L, (long)l10);
    }

    int O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("s", (Object)this, (long)-7418093972010792584L, (long)l10);
    }

    @Override
    public m7 i(long l10) {
        return m44.a("k", (long)-5630875680699403115L, (long)l10);
    }

    boolean S(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                Object object2;
                block8: {
                    long l10 = (Long)objectArray[0];
                    HashSet hashSet = (HashSet)objectArray[1];
                    df df2 = (df)objectArray[2];
                    long l11 = l10 = a ^ l10;
                    long l12 = l11 ^ 0x3DDC736B7612L;
                    long l13 = l11 ^ 0x27450750CC2CL;
                    CallSite callSite = m44.a("m", (long)-4803996397875566157L, (long)l10);
                    try {
                        block9: {
                            try {
                                try {
                                    try {
                                        object2 = m44.a("r", (Object)hashSet, (Object)m44.a("s", (Object)this, (long)-4637180645352097827L, (long)l10), (long)-6490082859925435570L, (long)l10);
                                        if (callSite != false) break block8;
                                        if (object2 != false) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("m", (Object)n92, (long)-4827923462107435392L, (long)l10);
                                    }
                                    object = m44.a("r", (Object)hashSet, (Object)m44.a("s", (Object)this, (long)-6367834291426156798L, (long)l10), (long)-6490082859925435570L, (long)l10);
                                    if (callSite != false) break block10;
                                }
                                catch (n9 n93) {
                                    throw m44.a("m", (Object)n93, (long)-4827923462107435392L, (long)l10);
                                }
                                if (object == false) break block11;
                            }
                            catch (n9 n94) {
                                throw m44.a("m", (Object)n94, (long)-4827923462107435392L, (long)l10);
                            }
                        }
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = this;
                        objectArray2[1] = l12;
                        objectArray2[0] = m44.a("s", (Object)this, (long)-4637180645352097827L, (long)l10);
                        m44.a("r", (Object)df2, (Object)objectArray2, (long)-4974468108543241641L, (long)l10);
                        Object[] objectArray3 = new Object[3];
                        objectArray3[2] = this;
                        objectArray3[1] = l12;
                        objectArray3[0] = m44.a("s", (Object)this, (long)-6367834291426156798L, (long)l10);
                        m44.a("r", (Object)df2, (Object)objectArray3, (long)-4974468108543241641L, (long)l10);
                        Object[] objectArray4 = new Object[4];
                        objectArray4[3] = df2;
                        objectArray4[2] = l13;
                        objectArray4[1] = m44.a("s", (Object)this, (long)-4637180645352097827L, (long)l10);
                        objectArray4[0] = m44.a("s", (Object)this, (long)-4820290299530916964L, (long)l10);
                        m44.a("m", (Object)objectArray4, (long)-5113735595413069193L, (long)l10);
                        Object[] objectArray5 = new Object[4];
                        objectArray5[3] = df2;
                        objectArray5[2] = l13;
                        objectArray5[1] = m44.a("s", (Object)this, (long)-6367834291426156798L, (long)l10);
                        objectArray5[0] = m44.a("s", (Object)this, (long)-4820290299530916964L, (long)l10);
                        m44.a("m", (Object)objectArray5, (long)-5113735595413069193L, (long)l10);
                        object2 = true;
                    }
                    catch (n9 n95) {
                        throw m44.a("m", (Object)n95, (long)-4827923462107435392L, (long)l10);
                    }
                }
                return (boolean)object2;
            }
            object = false;
        }
        return (boolean)object;
    }

    int X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("p", (Object)this, (long)-4864342283853158435L, (long)l10);
    }

    @Override
    public void d(Integer n10, iq iq2, long l10) {
        block11: {
            ga ga2;
            block10: {
                int n11;
                CallSite callSite;
                block8: {
                    CallSite callSite2;
                    block9: {
                        callSite2 = m44.a("n", (long)5007958443125584951L, (long)l10);
                        try {
                            try {
                                callSite = m44.a("p", (Object)this, (long)6705544180848545147L, (long)l10);
                                n11 = n10;
                                if (callSite2 == false) break block8;
                                if (callSite != n11) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)6668886006514716403L, (long)l10);
                            }
                            m44.a("r", (Object)this, (iq)iq2, (long)6905721956618033070L, (long)l10);
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)6668886006514716403L, (long)l10);
                        }
                    }
                    try {
                        ga2 = this;
                        if (callSite2 == false) break block10;
                        callSite = m44.a("p", (Object)ga2, (long)6646774651982563229L, (long)l10);
                        n11 = n10;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)n94, (long)6668886006514716403L, (long)l10);
                    }
                }
                if (callSite != n11) break block11;
                ga2 = this;
            }
            m44.a("r", (Object)ga2, (iq)iq2, (long)5175631299000663921L, (long)l10);
        }
    }

    iq a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)this, (long)-4015151775610781633L, (long)l10);
    }

    @Override
    public String R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x39453448D933L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        CallSite callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)4467565444378807161L, (long)l10), (Object)objectArray2, (long)4396626819218710822L, (long)l10);
        return m44.a("w", (Object)callSite, (Object)new Object[0], (long)4156554025348197952L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

