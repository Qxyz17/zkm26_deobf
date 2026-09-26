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
    private static final long a = prr.a((long)-4363137586187891401L, (long)-8021746907137277448L, MethodHandles.lookup().lookupClass()).a(88774452688995L);

    Enumeration L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-7050610857896005337L, (long)l), (long)-8680329299696284121L, (long)l);
    }

    public int W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (int)m44.a("p", (Object)((lpg)m44.a("q", (Object)((Object)this), (long)-7371748982460747190L, (long)l)), (Object)objectArray2, (long)-8956320021576209384L, (long)l);
    }

    public void M(Object[] objectArray) {
        Object object;
        block6: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = l;
            long l3 = l2 ^ 0L;
            long l4 = l2 ^ 0x47526B4E5A06L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
            int n = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l);
            block2: while (n < callSite) {
                ltv ltv2 = (ltv)this.V(n);
                try {
                    Object[] objectArray3 = new Object[3];
                    objectArray3[2] = l3;
                    objectArray3[1] = lqu2;
                    objectArray3[0] = this;
                    m44.a("w", (Object)ltv2, (Object)objectArray3, (long)-6856998191809611518L, (long)l);
                    do {
                        if (l > 0L) {
                            object = this;
                            if (callSite2 == false) break block6;
                            m44.a("w", (Object)m44.a("v", (Object)object, (long)-6700170103069307900L, (long)l), (Object)ltv2, (long)-6533049731853432553L, (long)l);
                            ++n;
                        }
                        if (callSite2 != false) continue block2;
                    } while (l <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-6551206706887674376L, (long)l);
                }
            }
            object = lmu2;
        }
        lpg lpg2 = (lpg)object;
    }

    public ltw(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x510BA615CCBEL;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
        m44.a("v", (Object)((Object)this), new Vector(), (long)-3119185780360873034L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("u", (Object)((lpg)m44.a("t", (Object)((Object)this), (long)-1905289058653761929L, (long)l)), (Object)objectArray2, (long)-442679973440737089L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
