/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cn;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lqw
implements Comparable {
    private String S;
    private String W;
    private String d;
    private String v;
    private String n;
    private String H;
    private Vector T;
    private lqw F;
    private cn X;
    private long c;
    private static final long a = prr.a(-7436109554626212095L, 8467296357985626400L, MethodHandles.lookup().lookupClass()).a(233881648020313L);

    public lqw(String string, long l10, String string2, long l11, lqw lqw2) {
        block8: {
            block9: {
                block6: {
                    long l12 = (l11 = a ^ l11) ^ 0xE87D7B17FB9L;
                    CallSite callSite = m44.a("o", (long)2287636961446502279L, (long)l11);
                    m44.a("s", (Object)this, new Vector(), (long)104477862235932477L, (long)l11);
                    m44.a("s", (Object)this, (String)string, (long)1732044152290950276L, (long)l11);
                    m44.a("s", (Object)this, (String)string2, (long)2126723258644692753L, (long)l11);
                    m44.a("s", (Object)this, (lqw)lqw2, (long)1845593607760117819L, (long)l11);
                    CallSite callSite2 = callSite;
                    try {
                        lqw lqw3;
                        block7: {
                            try {
                                try {
                                    lqw3 = lqw2;
                                    if (callSite2 != false) break block6;
                                    if (lqw3 == null) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("o", (Object)n92, (long)2057336417229162469L, (long)l11);
                                }
                                this.W = lqw2.A() + "!" + string2;
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l12;
                                objectArray[0] = this;
                                m44.a("n", (Object)lqw2, (Object)objectArray, (long)1781162136378559893L, (long)l11);
                                if (l11 < 0L) break block8;
                                if (callSite2 == false) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("o", (Object)n93, (long)2057336417229162469L, (long)l11);
                            }
                        }
                        lqw3 = this;
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)n94, (long)2057336417229162469L, (long)l11);
                    }
                }
                lqw3.W = string2;
            }
            m44.a("s", (Object)this, (long)l10, (long)2299162196363580443L, (long)l11);
        }
    }

    public String p(Object[] objectArray) {
        lqw lqw2;
        long l10;
        block4: {
            block5: {
                l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x6FC3AEB53D6L;
                CallSite callSite = m44.a("k", (long)-5901047274182726109L, (long)l10);
                try {
                    try {
                        lqw2 = this;
                        if (callSite != false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        if (m44.a("t", (Object)lqw2, (Object)objectArray2, (long)-5586582392702240617L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)-5969180573540485567L, (long)l10);
                    }
                    return this.W;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)-5969180573540485567L, (long)l10);
                }
            }
            lqw2 = this;
        }
        return m44.a("u", (Object)lqw2, (long)-6041659164826251595L, (long)l10);
    }

    public lqw b(Object[] objectArray) {
        block10: {
            CallSite callSite;
            CallSite callSite2;
            long l10;
            String string;
            long l11;
            block9: {
                l11 = (Long)objectArray[0];
                string = (String)objectArray[1];
                l10 = (l11 = a ^ l11) ^ 0x522336911586L;
                callSite2 = m44.a("l", (long)-1802429625523804476L, (long)l11);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)-562945057671938434L, (long)l11);
                        if (callSite2 != false) break block9;
                        if (callSite == null) break block10;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-1887559175622705498L, (long)l11);
                    }
                    callSite = m44.a("r", (Object)this, (long)-562945057671938434L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-1887559175622705498L, (long)l11);
                }
            }
            CallSite callSite3 = m44.a("s", (Object)callSite, (long)-301479053826397937L, (long)l11);
            while (callSite3.hasNext()) {
                Object object;
                block12: {
                    block13: {
                        lqw lqw2;
                        block11: {
                            lqw lqw3 = (lqw)callSite3.next();
                            try {
                                try {
                                    lqw2 = lqw3;
                                    if (callSite2 != false) break block11;
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l10;
                                    object = ((String)((Object)m44.a("s", (Object)lqw2, (Object)objectArray2, (long)-545784559239953517L, (long)l11))).equals(string);
                                    if (l11 < 0L) break block12;
                                    if (!object) break block13;
                                }
                                catch (n9 n94) {
                                    throw m44.a("l", (Object)n94, (long)-1887559175622705498L, (long)l11);
                                }
                                lqw2 = lqw3;
                            }
                            catch (n9 n95) {
                                throw m44.a("l", (Object)n95, (long)-1887559175622705498L, (long)l11);
                            }
                        }
                        return lqw2;
                    }
                    object = callSite2;
                }
                if (!object) continue;
            }
        }
        return null;
    }

    public void w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        cn cn2 = (cn)objectArray[1];
        l10 = a ^ l10;
        m44.a("r", (Object)this, (cn)cn2, (long)-6167031222748545224L, (long)l10);
    }

    public boolean z(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = a ^ l11) ^ 0x48E98475275DL;
                CallSite callSite2 = m44.a("n", (long)7421540348670244142L, (long)l11);
                try {
                    try {
                        callSite = m44.a("p", (Object)this, (long)8764667828038380784L, (long)l11);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)7128174947289610628L, (long)l11);
                    }
                    callSite = m44.a("p", (Object)this, (long)8764667828038380784L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)7128174947289610628L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            return (boolean)m44.a("q", (Object)callSite, (Object)objectArray2, (long)7158332296192070426L, (long)l11);
        }
        return false;
    }

    public String A() {
        return this.W;
    }

    public lqw(String string, int n10, long l10, String string2, String string3, short s10, short s11, String string4) {
        long l11 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)s11 << 48 >>> 48) ^ a;
        m44.a("s", (Object)this, new Vector(), (long)5751941280706611613L, (long)l11);
        m44.a("s", (Object)this, (String)string, (long)6244622326315577892L, (long)l11);
        m44.a("s", (Object)this, (String)string2, (long)5990787614968951217L, (long)l11);
        m44.a("s", (Object)this, (long)l10, (long)5857052018058287803L, (long)l11);
        this.W = string2;
        m44.a("s", (Object)this, (String)string3, (long)5249125595567179495L, (long)l11);
        m44.a("s", (Object)this, (String)string4, (long)5968114227882475604L, (long)l11);
    }

    public int compareTo(Object object) {
        long l10 = a ^ 0x3653F22AC6B2L;
        long l11 = l10 ^ 0x323CB7005F9BL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = (lqw)object;
        return (int)m44.a("t", (Object)this, (Object)objectArray, (long)-178535244294175894L, (long)l10);
    }

    public long V(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ a;
        return (long)m44.a("q", (Object)this, (long)4422559388742727315L, (long)l10);
    }

    public cn O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)this, (long)-1563184136971927780L, (long)l10);
    }

    public String E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)5605924929890803531L, (long)l10);
    }

    public lqw(String string, long l10, String string2, long l11) {
        long l12 = (l11 = a ^ l11) ^ 0x2BCD53249DD2L;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 48);
        int n12 = (int)(l12 << 48 >>> 48);
        this(string, n10, l10, string2, null, (short)n11, (short)n12, null);
    }

    public String K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("u", (Object)this, (long)-2142137363244464204L, (long)l10);
    }

    public boolean q(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = a ^ l11) ^ 0xB93170A176AL;
                CallSite callSite2 = m44.a("n", (long)-5197530073938582514L, (long)l11);
                try {
                    try {
                        callSite = m44.a("p", (Object)this, (long)-6304361367922442800L, (long)l11);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-5490891704321578844L, (long)l11);
                    }
                    callSite = m44.a("p", (Object)this, (long)-6304361367922442800L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-5490891704321578844L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            return (boolean)m44.a("q", (Object)callSite, (Object)objectArray2, (long)-6324858702587826119L, (long)l11);
        }
        return false;
    }

    public void U(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (String)string, (long)-6029485051477915229L, (long)l10);
    }

    public String L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x34D0DBF69665L;
        int n10 = this.W.indexOf("!");
        try {
            if (n10 == -1) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l11;
                return m44.a("r", (Object)this, (Object)objectArray2, (long)-2952977796140217935L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)-3251874394144929353L, (long)l10);
        }
        return (String)((Object)m44.a("r", (Object)new File(this.W.substring(0, n10)), (long)-3004534841314788715L, (long)l10)) + this.W.substring(n10);
    }

    /*
     * Unable to fully structure code
     */
    public lqw A(Object[] var1_1) {
        block17: {
            block16: {
                block13: {
                    block15: {
                        block14: {
                            var2_2 = (Long)var1_1[0];
                            v0 = var2_2 = lqw.a ^ var2_2;
                            var4_3 = v0 ^ 51579414797646L;
                            var6_4 = v0 ^ 61510964491470L;
                            var8_5 = m44.a("o", (long)283452657173693399L, (long)var2_2);
                            try {
                                try {
                                    try {
                                        try {
                                            v1 = m44.a("q", (Object)this, (long)417861255931239531L, (long)var2_2);
                                            if (var8_5 != false) break block13;
                                            if (v1 == null) break block14;
                                        }
                                        catch (n9 v2) {
                                            throw m44.a("o", (Object)v2, (long)62337432611412917L, (long)var2_2);
                                        }
                                        v3 = new Object[1];
                                        v3[0] = var4_3;
                                        v1 = m44.a("p", (Object)m44.a("q", (Object)this, (long)417861255931239531L, (long)var2_2), (Object)v3, (long)2090982013619321742L, (long)var2_2);
                                        v4 = var8_5;
                                        if (var2_2 > 0L) {
                                            if (v4 != false) break block13;
                                        }
                                        ** GOTO lbl48
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("o", (Object)v5, (long)62337432611412917L, (long)var2_2);
                                    }
                                    if (var2_2 <= 0L) break block15;
                                    if (v1 == null) break block14;
                                }
                                catch (n9 v6) {
                                    throw m44.a("o", (Object)v6, (long)62337432611412917L, (long)var2_2);
                                }
                                v7 = new Object[1];
                                v7[0] = var6_4;
                                return m44.a("p", (Object)m44.a("q", (Object)this, (long)417861255931239531L, (long)var2_2), (Object)v7, (long)57945499104319468L, (long)var2_2);
                            }
                            catch (n9 v8) {
                                throw m44.a("o", (Object)v8, (long)62337432611412917L, (long)var2_2);
                            }
                        }
                        v9 = this;
                    }
                    v1 = m44.a("q", (Object)v9, (long)417861255931239531L, (long)var2_2);
                }
                try {
                    try {
                        v4 = var8_5;
lbl48:
                        // 2 sources

                        if (v4 != false) break block16;
                        if (v1 == null) break block17;
                    }
                    catch (n9 v10) {
                        throw m44.a("o", (Object)v10, (long)62337432611412917L, (long)var2_2);
                    }
                    v1 = m44.a("q", (Object)this, (long)417861255931239531L, (long)var2_2);
                }
                catch (n9 v11) {
                    throw m44.a("o", (Object)v11, (long)62337432611412917L, (long)var2_2);
                }
            }
            return v1;
        }
        return null;
    }

    public String Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("r", (Object)this, (long)-4212857796160182502L, (long)l10);
    }

    public lqw t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)this, (long)7803774439986591211L, (long)l10);
    }

    public String f(Object[] objectArray) {
        String string = (String)objectArray[0];
        return this.W + "!" + string;
    }

    public int O(Object[] objectArray) {
        lqw lqw2 = (lqw)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return (int)m44.a("q", this.A(), (Object)lqw2.A(), (long)-7551911570126547724L, (long)l10);
    }

    private void C(Object[] objectArray) {
        lqw lqw2 = (lqw)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        ((Vector)((Object)m44.a("v", (Object)this, (long)5333413669822155850L, (long)l10))).addElement(lqw2);
    }

    public Enumeration U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)m44.a("u", (Object)this, (long)398288713342780361L, (long)l10), (long)495751746674659151L, (long)l10);
    }

    public String X(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l10;
            block5: {
                l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("o", (long)3541978368739025655L, (long)l10);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)3580696087574549820L, (long)l10);
                        if (callSite2 == false) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)3834081116289003101L, (long)l10);
                    }
                    return m44.a("q", (Object)this, (long)3763856369791850153L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)3834081116289003101L, (long)l10);
                }
            }
            callSite = m44.a("q", (Object)this, (long)3580696087574549820L, (long)l10);
        }
        return callSite;
    }

    public boolean E(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("q", (Object)this, (long)7174710407635289696L, (long)l10) != null;
        }
        catch (n9 n92) {
            throw m44.a("o", (Object)n92, (long)7488662586614299781L, (long)l10);
        }
        return bl2;
    }

    public boolean y(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("u", (Object)this, (long)-3521540164880771449L, (long)l10) == null;
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)n92, (long)-3877312403801665191L, (long)l10);
        }
        return bl2;
    }

    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)new File((String)((Object)m44.a("p", (Object)this, (long)8176994642717545448L, (long)l10))), (long)8423627249871427646L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

