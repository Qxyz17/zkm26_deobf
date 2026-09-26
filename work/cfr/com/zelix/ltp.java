/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ltp
extends l7t
implements r5 {
    private String u;
    private static final long a = prr.a(-4685025139274217643L, 3437491811013558177L, MethodHandles.lookup().lookupClass()).a(39194396965095L);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void M(Object[] objectArray) {
        block22: {
            Object object;
            ltv ltv2;
            CallSite callSite;
            reference var13_8;
            long l10;
            long l11;
            block21: {
                lmu lmu2;
                block20: {
                    lmu lmu3 = (lmu)objectArray[0];
                    lqu lqu2 = (lqu)objectArray[1];
                    l11 = (Long)objectArray[2];
                    long l12 = l11;
                    l10 = l12 ^ 0x517A3F508D4CL;
                    long l13 = l12 ^ 0x47526B4E5A06L;
                    long l14 = l12 ^ 0L;
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l13;
                    var13_8 = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l11);
                    callSite = m44.a("h", (long)-6823249310977527178L, (long)l11);
                    int n10 = 0;
                    block12: while (n10 < var13_8) {
                        try {
                            do {
                                if (l11 >= 0L) {
                                    lmu2 = this.V(n10);
                                    if (callSite != false) break block20;
                                    Object[] objectArray3 = new Object[3];
                                    objectArray3[2] = l14;
                                    objectArray3[1] = lqu2;
                                    objectArray3[0] = this;
                                    m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l11);
                                    ++n10;
                                }
                                if (callSite == false) continue block12;
                            } while (l11 < 0L);
                            break;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)-6494708346813274187L, (long)l11);
                        }
                    }
                    lmu2 = lmu3;
                }
                ltv2 = (ltv)lmu2;
                try {
                    if (l11 >= 0L && m44.a("v", (Object)this, (long)-4625779496100747283L, (long)l11) != null) {
                        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)this, (long)-4625779496100747283L, (long)l11)}, (long)-4701569248695748766L, (long)l11);
                    }
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-6494708346813274187L, (long)l11);
                }
                try {
                    try {
                        object = var13_8;
                        Object object2 = callSite;
                        if (l11 >= 0L) {
                            if (object2 != false) break block21;
                            object2 = true;
                        }
                        if (object <= object2) break block22;
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)n94, (long)-6494708346813274187L, (long)l11);
                    }
                    object = false;
                }
                catch (n9 n95) {
                    throw m44.a("h", (Object)n95, (long)-6494708346813274187L, (long)l11);
                }
            }
            reference var15_12 = object;
            while (var15_12 < var13_8) {
                CallSite callSite2;
                block23: {
                    block24: {
                        block25: {
                            lmu lmu4 = this.V((int)var15_12);
                            try {
                                try {
                                    callSite2 = callSite;
                                    if (l11 < 0L) break block23;
                                    if (callSite2 != false) break block24;
                                    if (!(lmu4 instanceof lyt)) break block25;
                                }
                                catch (n9 n96) {
                                    throw m44.a("h", (Object)n96, (long)-6494708346813274187L, (long)l11);
                                }
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l10;
                                objectArray4[0] = (lyt)lmu4;
                                m44.a("w", (Object)ltv2, (Object)objectArray4, (long)-5046097686672250986L, (long)l11);
                            }
                            catch (n9 n97) {
                                throw m44.a("h", (Object)n97, (long)-6494708346813274187L, (long)l11);
                            }
                        }
                        ++var15_12;
                    }
                    callSite2 = callSite;
                }
                if (callSite2 == false) continue;
            }
        }
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)this, (String)string, (long)-8071983953988872230L, (long)l10);
    }

    public ltp(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x754D3ED07066L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

