/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fj;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lpg;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Vector;

public class ltw
extends l7t
implements fj {
    Vector j;
    private static final long a = prr.a(-4363137586187891401L, -8021746907137277448L, MethodHandles.lookup().lookupClass()).a(88774452688995L);

    Enumeration L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)m44.a("u", (Object)this, (long)-7050610857896005337L, (long)l10), (long)-8680329299696284121L, (long)l10);
    }

    @Override
    public int W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (int)m44.a("p", (Object)((lpg)((Object)m44.a("q", (Object)this, (long)-7371748982460747190L, (long)l10))), (Object)objectArray2, (long)-8956320021576209384L, (long)l10);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l10 = (Long)objectArray[2];
            long l11 = l10;
            long l12 = l11 ^ 0L;
            long l13 = l11 ^ 0x47526B4E5A06L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
            int n10 = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l10);
            block2: while (n10 < callSite) {
                ltv ltv2 = (ltv)this.V(n10);
                try {
                    Object[] objectArray3 = new Object[3];
                    objectArray3[2] = l12;
                    objectArray3[1] = lqu2;
                    objectArray3[0] = this;
                    m44.a("w", (Object)ltv2, (Object)objectArray3, (long)-6856998191809611518L, (long)l10);
                    do {
                        if (l10 > 0L) {
                            lmu2 = this;
                            if (callSite2 == false) break block6;
                            m44.a("w", (Object)m44.a("v", (Object)lmu2, (long)-6700170103069307900L, (long)l10), (Object)ltv2, (long)-6533049731853432553L, (long)l10);
                            ++n10;
                        }
                        if (callSite2 != false) continue block2;
                    } while (l10 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-6551206706887674376L, (long)l10);
                }
            }
            lmu2 = lmu3;
        }
        lpg lpg2 = (lpg)lmu2;
    }

    public ltw(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x510BA615CCBEL;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
        m44.a("v", (Object)this, new Vector(), (long)-3119185780360873034L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("u", (Object)((lpg)((Object)m44.a("t", (Object)this, (long)-1905289058653761929L, (long)l10))), (Object)objectArray2, (long)-442679973440737089L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

