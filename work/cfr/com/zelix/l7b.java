/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7k;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class l7b
extends l7k {
    private static final long b = prr.a(-7295472573797986376L, -203291213582718458L, MethodHandles.lookup().lookupClass()).a(15863810793777L);

    public l7b(long l10, int n10) {
        long l11 = (l10 = b ^ l10) ^ 0x7A2E04F77859L;
        super(l11, n10);
    }

    public void K(Object[] objectArray) {
        long l10;
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l11 = l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ b;
        long l12 = l11 ^ 0x10BD7C6C8838L;
        long l13 = l11 ^ 0x323E365F5869L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        ltv ltv2 = (ltv)((Object)m44.a("w", (Object)this, (Object)objectArray2, (long)-5354282349256501383L, (long)l10));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        m44.a("w", (Object)ltv2, (Object)objectArray3, (long)-5964524053303072363L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l10;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l10 = (Long)objectArray[2];
            long l11 = l10;
            long l12 = l11 ^ 0x47526B4E5A06L;
            long l13 = l11 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l12;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
            int n10 = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l10);
            block2: while (n10 < callSite) {
                try {
                    do {
                        if (l10 > 0L) {
                            lmu2 = this.V(n10);
                            if (callSite2 == false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l13;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l10);
                            ++n10;
                        }
                        if (callSite2 != false) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-6451646361951068175L, (long)l10);
                }
            }
            lmu2 = lmu3;
        }
        ltv ltv2 = (ltv)lmu2;
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)this, (long)-6574729874872504201L, (long)l10)}, (long)-4893124778935084462L, (long)l10);
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)this, (long)-4899374515864533261L, (long)l10)}, (long)-6842293807610043356L, (long)l10);
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)this, (long)-6346277956614322605L, (long)l10)}, (long)-5143028011138218640L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

