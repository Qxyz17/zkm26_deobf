/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class lol
implements Map.Entry {
    private Object b;
    private Object r;
    private static final long a = prr.a(-7693005406948515897L, -6677508582031365127L, MethodHandles.lookup().lookupClass()).a(218966715640213L);

    public Object getKey() {
        long l10 = a ^ 0x3ADFCD59A1C5L;
        return m44.a("u", (Object)this, (long)9032905161285355404L, (long)l10);
    }

    public lol(long l10, lq0 lq02) {
        l10 = a ^ l10;
        m44.a("r", (Object)this, (Object)lq02.S(), (long)7270620350510063153L, (long)l10);
        m44.a("r", (Object)this, (Object)lq02.D(), (long)8794908383813724703L, (long)l10);
    }

    public Object getValue() {
        long l10 = a ^ 0x1D218A7FB550L;
        return m44.a("p", (Object)this, (long)8585497652859266871L, (long)l10);
    }

    @Override
    public boolean equals(Object object) {
        boolean bl2;
        block20: {
            block21: {
                boolean bl3;
                block31: {
                    block27: {
                        block30: {
                            CallSite callSite;
                            lol lol2;
                            CallSite callSite2;
                            long l10;
                            block28: {
                                block29: {
                                    block26: {
                                        block22: {
                                            block23: {
                                                boolean bl4;
                                                block25: {
                                                    block24: {
                                                        l10 = a ^ 0x64CE7BDDE6F8L;
                                                        callSite2 = m44.a("n", (long)4251406350111024438L, (long)l10);
                                                        try {
                                                            bl2 = object instanceof lol;
                                                            if (callSite2 != null) break block20;
                                                            if (!bl2) break block21;
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                                                        }
                                                        lol2 = (lol)object;
                                                        try {
                                                            try {
                                                                try {
                                                                    callSite = m44.a("p", (Object)this, (long)4208065691320877233L, (long)l10);
                                                                    if (callSite2 != null) break block22;
                                                                    if (callSite != null) break block23;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                                                                }
                                                                if (m44.a("p", (Object)lol2, (long)4208065691320877233L, (long)l10) != null) break block24;
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                                                            }
                                                            bl4 = true;
                                                            break block25;
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                                                        }
                                                    }
                                                    bl4 = false;
                                                }
                                                return bl4;
                                            }
                                            callSite = m44.a("p", (Object)this, (long)4208065691320877233L, (long)l10);
                                        }
                                        try {
                                            try {
                                                if (callSite2 != null) break block26;
                                                if (!callSite.equals(m44.a("p", (Object)lol2, (long)4208065691320877233L, (long)l10))) break block27;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                                            }
                                            callSite = m44.a("p", (Object)this, (long)2633947515644425375L, (long)l10);
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (callSite2 != null) break block28;
                                                if (callSite != null) break block29;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                                            }
                                            if (m44.a("p", (Object)lol2, (long)2633947515644425375L, (long)l10) != null) break block27;
                                            break block30;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                                        }
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                                    }
                                }
                                callSite = m44.a("p", (Object)this, (long)2633947515644425375L, (long)l10);
                            }
                            try {
                                bl3 = callSite.equals(m44.a("p", (Object)lol2, (long)2633947515644425375L, (long)l10));
                                if (callSite2 != null) break block31;
                                if (!bl3) break block27;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw m44.a("n", (Object)unsupportedOperationException, (long)2682954645282976393L, (long)l10);
                            }
                        }
                        bl3 = true;
                        break block31;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    public lol(long l10, Object object, Object object2) {
        l10 = a ^ l10;
        m44.a("t", (Object)this, (Object)object, (long)-3577979262161161073L, (long)l10);
        m44.a("t", (Object)this, (Object)object2, (long)-3408148575751126879L, (long)l10);
    }

    @Override
    public int hashCode() {
        int n10;
        int n11;
        block13: {
            CallSite callSite;
            block11: {
                long l10;
                block12: {
                    CallSite callSite2;
                    block10: {
                        CallSite callSite3;
                        block8: {
                            block9: {
                                l10 = a ^ 0x12C0A65FC957L;
                                callSite2 = m44.a("i", (long)1490534805710244505L, (long)l10);
                                try {
                                    try {
                                        callSite3 = m44.a("w", (Object)this, (long)1569921724855791390L, (long)l10);
                                        if (callSite2 != null) break block8;
                                        if (callSite3 != null) break block9;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw m44.a("i", (Object)unsupportedOperationException, (long)762431075972635942L, (long)l10);
                                    }
                                    n11 = 0;
                                    break block10;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw m44.a("i", (Object)unsupportedOperationException, (long)762431075972635942L, (long)l10);
                                }
                            }
                            callSite3 = m44.a("w", (Object)this, (long)1569921724855791390L, (long)l10);
                        }
                        n11 = callSite3.hashCode();
                    }
                    try {
                        try {
                            callSite = m44.a("w", (Object)this, (long)802449156953086768L, (long)l10);
                            if (callSite2 != null) break block11;
                            if (callSite != null) break block12;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw m44.a("i", (Object)unsupportedOperationException, (long)762431075972635942L, (long)l10);
                        }
                        n10 = 0;
                        break block13;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw m44.a("i", (Object)unsupportedOperationException, (long)762431075972635942L, (long)l10);
                    }
                }
                callSite = m44.a("w", (Object)this, (long)802449156953086768L, (long)l10);
            }
            n10 = callSite.hashCode();
        }
        return n11 ^ n10;
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

