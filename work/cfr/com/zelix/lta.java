/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import com.zelix.u7;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lta
extends l7t
implements r5 {
    private lyu g;
    private String B;
    private static final long a = prr.a(-8110495845642476346L, 5695987557288841502L, MethodHandles.lookup().lookupClass()).a(245573598690100L);

    public lta(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x1B5687A8FA7L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)this, (String)string, (long)-8605931211563662304L, (long)l10);
    }

    void I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        lyu lyu2 = (lyu)objectArray[1];
        l10 = a ^ l10;
        m44.a("r", (Object)this, (lyu)lyu2, (long)-5155036105500885097L, (long)l10);
    }

    @Override
    public void M(Object[] objectArray) {
        lta lta2;
        u7 u72;
        long l10;
        long l11;
        block15: {
            block14: {
                lmu lmu2 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l11 = (Long)objectArray[2];
                long l12 = l11;
                l10 = l12 ^ 0x31F979E03278L;
                long l13 = l12 ^ 0x47526B4E5A06L;
                long l14 = l12 ^ 0L;
                long l15 = l12 ^ 0x3AFB6BE43428L;
                u72 = (u7)((Object)lmu2);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l13;
                CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l11);
                int n10 = 0;
                CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l11);
                block8: while (n10 < callSite) {
                    try {
                        Object[] objectArray3 = new Object[3];
                        objectArray3[2] = l14;
                        objectArray3[1] = lqu2;
                        objectArray3[0] = this;
                        m44.a("w", (Object)this.V(n10), (Object)objectArray3, (long)-6656114929610942631L, (long)l11);
                        ++n10;
                        do {
                            CallSite callSite3 = callSite2;
                            if (l11 > 0L) {
                                if (callSite3 == false) break block14;
                                callSite3 = callSite2;
                            }
                            if (callSite3 != false) continue block8;
                        } while (l11 <= 0L);
                        break;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-4977935084405522074L, (long)l11);
                    }
                }
                try {
                    try {
                        lta2 = this;
                        if (l11 < 0L || callSite2 == false) break block15;
                        if (m44.a("v", (Object)lta2, (long)-4896638982468174871L, (long)l11) == null) break block14;
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)n93, (long)-4977935084405522074L, (long)l11);
                    }
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l15;
                    objectArray4[0] = m44.a("v", (Object)this, (long)-4896638982468174871L, (long)l11);
                    m44.a("w", (Object)u72, (Object)objectArray4, (long)-4662190927521289739L, (long)l11);
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)n94, (long)-4977935084405522074L, (long)l11);
                }
            }
            lta2 = this;
        }
        try {
            if (m44.a("v", (Object)lta2, (long)-5141153119014800361L, (long)l11) != null) {
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = l10;
                objectArray5[0] = m44.a("v", (Object)this, (long)-5141153119014800361L, (long)l11);
                m44.a("w", (Object)u72, (Object)objectArray5, (long)-5024702472106274658L, (long)l11);
            }
        }
        catch (n9 n95) {
            throw m44.a("h", (Object)n95, (long)-4977935084405522074L, (long)l11);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

