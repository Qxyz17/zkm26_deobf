/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jp;
import com.zelix.lb;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ll
extends lb {
    private String Q;
    private String k;
    private String g;
    private boolean P;
    private String a;
    private String l;
    private String B;
    private String w;
    private static final long c = prr.a((long)-8970883460184721917L, (long)-6881476891537542284L, MethodHandles.lookup().lookupClass()).a(202452413563910L);

    public ll(int n) {
        super(n);
    }

    public void Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = c ^ l;
        m44.a("t", (Object)((Object)this), (String)string, (long)6598143826684591775L, (long)l);
    }

    public void n(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        m44.a("p", (Object)((Object)this), (String)string, (long)-3887803637295072073L, (long)l);
    }

    public void t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        l = c ^ l;
        m44.a("w", (Object)((Object)this), (String)string, (long)-2440597638819238109L, (long)l);
        m44.a("w", (Object)((Object)this), (String)string2, (long)-2711128329873965762L, (long)l);
    }

    public void g(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        m44.a("s", (Object)((Object)this), (String)string, (long)-2204928419592986400L, (long)l);
    }

    public void h(Object[] objectArray) {
        block8: {
            ll ll2;
            boolean bl;
            long l;
            block6: {
                l = (Long)objectArray[0];
                String string = (String)objectArray[1];
                String string2 = (String)objectArray[2];
                bl = (Boolean)objectArray[3];
                l = c ^ l;
                CallSite callSite = m44.a("h", (long)-1926323549568533238L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                ll2 = this;
                                if (callSite != null) break block6;
                                if (m44.a("v", (Object)((Object)ll2), (long)-359823530341418361L, (long)l) != null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-2219788967721150914L, (long)l);
                            }
                            m44.a("t", (Object)((Object)this), (String)string, (long)-359823530341418361L, (long)l);
                            m44.a("t", (Object)((Object)this), (String)string2, (long)-2071393430472691193L, (long)l);
                            m44.a("t", (Object)((Object)this), (boolean)bl, (long)-565885803508399789L, (long)l);
                            if (callSite == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-2219788967721150914L, (long)l);
                        }
                    }
                    ll2 = this;
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)((Object)n94), (long)-2219788967721150914L, (long)l);
                }
            }
            m44.a("t", (Object)((Object)ll2), (boolean)bl, (long)-565885803508399789L, (long)l);
        }
    }

    public void w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = c ^ l;
        m44.a("w", (Object)((Object)this), (String)string, (long)5947863434634849500L, (long)l);
    }

    public void F(zn zn2, lkc lkc2, long l) {
        block10: {
            ll ll2;
            long l2;
            long l3;
            long l4;
            block11: {
                block12: {
                    long l5 = l;
                    long l6 = l5 ^ 0L;
                    l4 = l5 ^ 0x59A5FD2F74E8L;
                    l3 = l5 ^ 0x72611D8244CCL;
                    l2 = l5 ^ 0x686D11A27676L;
                    long l7 = l5 ^ 0x2BEAF1B40FB1L;
                    int n = this.y(l7);
                    CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
                    int n2 = 0;
                    block6: while (n2 < n) {
                        try {
                            this.g(n2).F((zn)this, lkc2, l6);
                            ++n2;
                            do {
                                CallSite callSite2 = callSite;
                                if (l > 0L) {
                                    if (callSite2 != null) break block10;
                                    callSite2 = callSite;
                                }
                                if (callSite2 == null) continue block6;
                            } while (l <= 0L);
                            break;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)((Object)n92), (long)-3460550060706989834L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (l < 0L) break block10;
                            ll2 = this;
                            if (callSite != null) break block11;
                            if (m44.a("v", (Object)((Object)ll2), (long)-3041697918016809905L, (long)l) != null) break block12;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-3460550060706989834L, (long)l);
                        }
                        m44.a("t", (Object)((Object)this), (String)((Object)m44.a("v", (Object)((Object)this), (long)-3838683395155641416L, (long)l)), (long)-3041697918016809905L, (long)l);
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)((Object)n94), (long)-3460550060706989834L, (long)l);
                    }
                }
                ll2 = zn2;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l4;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            Object[] objectArray3 = new Object[11];
            objectArray3[10] = l3;
            objectArray3[9] = (boolean)m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-3577789133749037170L, (long)l);
            objectArray3[8] = m44.a("v", (Object)((Object)this), (long)-3616390256736373881L, (long)l);
            objectArray3[7] = m44.a("v", (Object)((Object)this), (long)-3767332667495334645L, (long)l);
            objectArray3[6] = (boolean)m44.a("v", (Object)((Object)this), (long)-2959568230226710629L, (long)l);
            objectArray3[5] = m44.a("v", (Object)((Object)this), (long)-3636376210018870065L, (long)l);
            objectArray3[4] = m44.a("v", (Object)((Object)this), (long)-3041697918016809905L, (long)l);
            objectArray3[3] = (int)m44.a("w", (Object)((Object)this), (Object)objectArray, (long)-3038110640191701118L, (long)l);
            objectArray3[2] = m44.a("v", (Object)((Object)this), (long)-2902281019114769737L, (long)l);
            objectArray3[1] = m44.a("v", (Object)((Object)this), (long)-3532190383954581083L, (long)l);
            objectArray3[0] = m44.a("v", (Object)((Object)this), (long)-3838683395155641416L, (long)l);
            m44.a("w", (Object)((jp)ll2), (Object)objectArray3, (long)-3124942462777517192L, (long)l);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
