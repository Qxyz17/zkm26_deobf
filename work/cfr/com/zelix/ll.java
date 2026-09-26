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
    private static final long c = prr.a(-8970883460184721917L, -6881476891537542284L, MethodHandles.lookup().lookupClass()).a(202452413563910L);

    public ll(int n10) {
        super(n10);
    }

    public void Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = c ^ l10;
        m44.a("t", (Object)this, (String)string, (long)6598143826684591775L, (long)l10);
    }

    public void n(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = c ^ l10;
        m44.a("p", (Object)this, (String)string, (long)-3887803637295072073L, (long)l10);
    }

    public void t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        l10 = c ^ l10;
        m44.a("w", (Object)this, (String)string, (long)-2440597638819238109L, (long)l10);
        m44.a("w", (Object)this, (String)string2, (long)-2711128329873965762L, (long)l10);
    }

    public void g(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = c ^ l10;
        m44.a("s", (Object)this, (String)string, (long)-2204928419592986400L, (long)l10);
    }

    public void h(Object[] objectArray) {
        block8: {
            ll ll2;
            boolean bl2;
            long l10;
            block6: {
                l10 = (Long)objectArray[0];
                String string = (String)objectArray[1];
                String string2 = (String)objectArray[2];
                bl2 = (Boolean)objectArray[3];
                l10 = c ^ l10;
                CallSite callSite = m44.a("h", (long)-1926323549568533238L, (long)l10);
                try {
                    block7: {
                        try {
                            try {
                                ll2 = this;
                                if (callSite != null) break block6;
                                if (m44.a("v", (Object)ll2, (long)-359823530341418361L, (long)l10) != null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)-2219788967721150914L, (long)l10);
                            }
                            m44.a("t", (Object)this, (String)string, (long)-359823530341418361L, (long)l10);
                            m44.a("t", (Object)this, (String)string2, (long)-2071393430472691193L, (long)l10);
                            m44.a("t", (Object)this, (boolean)bl2, (long)-565885803508399789L, (long)l10);
                            if (callSite == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)-2219788967721150914L, (long)l10);
                        }
                    }
                    ll2 = this;
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)n94, (long)-2219788967721150914L, (long)l10);
                }
            }
            m44.a("t", (Object)ll2, (boolean)bl2, (long)-565885803508399789L, (long)l10);
        }
    }

    public void w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = c ^ l10;
        m44.a("w", (Object)this, (String)string, (long)5947863434634849500L, (long)l10);
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        block10: {
            zn zn3;
            long l11;
            long l12;
            long l13;
            block11: {
                block12: {
                    long l14 = l10;
                    long l15 = l14 ^ 0L;
                    l13 = l14 ^ 0x59A5FD2F74E8L;
                    l12 = l14 ^ 0x72611D8244CCL;
                    l11 = l14 ^ 0x686D11A27676L;
                    long l16 = l14 ^ 0x2BEAF1B40FB1L;
                    int n10 = this.y(l16);
                    CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
                    int n11 = 0;
                    block6: while (n11 < n10) {
                        try {
                            this.g(n11).F(this, lkc2, l15);
                            ++n11;
                            do {
                                CallSite callSite2 = callSite;
                                if (l10 > 0L) {
                                    if (callSite2 != null) break block10;
                                    callSite2 = callSite;
                                }
                                if (callSite2 == null) continue block6;
                            } while (l10 <= 0L);
                            break;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)-3460550060706989834L, (long)l10);
                        }
                    }
                    try {
                        try {
                            if (l10 < 0L) break block10;
                            zn3 = this;
                            if (callSite != null) break block11;
                            if (m44.a("v", (Object)zn3, (long)-3041697918016809905L, (long)l10) != null) break block12;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)-3460550060706989834L, (long)l10);
                        }
                        m44.a("t", (Object)this, (String)((Object)m44.a("v", (Object)this, (long)-3838683395155641416L, (long)l10)), (long)-3041697918016809905L, (long)l10);
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)n94, (long)-3460550060706989834L, (long)l10);
                    }
                }
                zn3 = zn2;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l13;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l11;
            Object[] objectArray3 = new Object[11];
            objectArray3[10] = l12;
            objectArray3[9] = (boolean)m44.a("w", (Object)this, (Object)objectArray2, (long)-3577789133749037170L, (long)l10);
            objectArray3[8] = m44.a("v", (Object)this, (long)-3616390256736373881L, (long)l10);
            objectArray3[7] = m44.a("v", (Object)this, (long)-3767332667495334645L, (long)l10);
            objectArray3[6] = (boolean)m44.a("v", (Object)this, (long)-2959568230226710629L, (long)l10);
            objectArray3[5] = m44.a("v", (Object)this, (long)-3636376210018870065L, (long)l10);
            objectArray3[4] = m44.a("v", (Object)this, (long)-3041697918016809905L, (long)l10);
            objectArray3[3] = (int)m44.a("w", (Object)this, (Object)objectArray, (long)-3038110640191701118L, (long)l10);
            objectArray3[2] = m44.a("v", (Object)this, (long)-2902281019114769737L, (long)l10);
            objectArray3[1] = m44.a("v", (Object)this, (long)-3532190383954581083L, (long)l10);
            objectArray3[0] = m44.a("v", (Object)this, (long)-3838683395155641416L, (long)l10);
            m44.a("w", (Object)((jp)zn3), (Object)objectArray3, (long)-3124942462777517192L, (long)l10);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

