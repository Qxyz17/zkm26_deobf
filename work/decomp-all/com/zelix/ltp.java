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
    private static final long a = prr.a((long)-4685025139274217643L, (long)3437491811013558177L, MethodHandles.lookup().lookupClass()).a(39194396965095L);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void M(Object[] objectArray) {
        block22: {
            Object object;
            ltv ltv2;
            CallSite callSite;
            reference var13_8;
            long l;
            long l2;
            block21: {
                lmu lmu2;
                block20: {
                    lmu lmu3 = (lmu)objectArray[0];
                    lqu lqu2 = (lqu)objectArray[1];
                    l2 = (Long)objectArray[2];
                    long l3 = l2;
                    l = l3 ^ 0x517A3F508D4CL;
                    long l4 = l3 ^ 0x47526B4E5A06L;
                    long l5 = l3 ^ 0L;
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l4;
                    var13_8 = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l2);
                    callSite = m44.a("h", (long)-6823249310977527178L, (long)l2);
                    int n = 0;
                    block12: while (n < var13_8) {
                        try {
                            do {
                                if (l2 >= 0L) {
                                    lmu2 = this.V(n);
                                    if (callSite != false) break block20;
                                    Object[] objectArray3 = new Object[3];
                                    objectArray3[2] = l5;
                                    objectArray3[1] = lqu2;
                                    objectArray3[0] = this;
                                    m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l2);
                                    ++n;
                                }
                                if (callSite == false) continue block12;
                            } while (l2 < 0L);
                            break;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)((Object)n92), (long)-6494708346813274187L, (long)l2);
                        }
                    }
                    lmu2 = lmu3;
                }
                ltv2 = (ltv)lmu2;
                try {
                    if (l2 >= 0L && m44.a("v", (Object)((Object)this), (long)-4625779496100747283L, (long)l2) != null) {
                        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)((Object)this), (long)-4625779496100747283L, (long)l2)}, (long)-4701569248695748766L, (long)l2);
                    }
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-6494708346813274187L, (long)l2);
                }
                try {
                    try {
                        object = var13_8;
                        Object object2 = callSite;
                        if (l2 >= 0L) {
                            if (object2 != false) break block21;
                            object2 = true;
                        }
                        if (object <= object2) break block22;
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)((Object)n94), (long)-6494708346813274187L, (long)l2);
                    }
                    object = false;
                }
                catch (n9 n95) {
                    throw m44.a("h", (Object)((Object)n95), (long)-6494708346813274187L, (long)l2);
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
                                    if (l2 < 0L) break block23;
                                    if (callSite2 != false) break block24;
                                    if (!(lmu4 instanceof lyt)) break block25;
                                }
                                catch (n9 n96) {
                                    throw m44.a("h", (Object)((Object)n96), (long)-6494708346813274187L, (long)l2);
                                }
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l;
                                objectArray4[0] = (lyt)lmu4;
                                m44.a("w", (Object)ltv2, (Object)objectArray4, (long)-5046097686672250986L, (long)l2);
                            }
                            catch (n9 n97) {
                                throw m44.a("h", (Object)((Object)n97), (long)-6494708346813274187L, (long)l2);
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

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)((Object)this), (String)string, (long)-8071983953988872230L, (long)l);
    }

    public ltp(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x754D3ED07066L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
