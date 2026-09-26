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
    private static final long b = prr.a((long)-7295472573797986376L, (long)-203291213582718458L, MethodHandles.lookup().lookupClass()).a(15863810793777L);

    public l7b(long l, int n) {
        long l2 = (l = b ^ l) ^ 0x7A2E04F77859L;
        super(l2, n);
    }

    public void K(Object[] objectArray) {
        long l;
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l2 = l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        long l3 = l2 ^ 0x10BD7C6C8838L;
        long l4 = l2 ^ 0x323E365F5869L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        ltv ltv2 = (ltv)m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-5354282349256501383L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        m44.a("w", (Object)ltv2, (Object)objectArray3, (long)-5964524053303072363L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l = (Long)objectArray[2];
            long l2 = l;
            long l3 = l2 ^ 0x47526B4E5A06L;
            long l4 = l2 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
            int n = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l);
            block2: while (n < callSite) {
                try {
                    do {
                        if (l > 0L) {
                            lmu2 = this.V(n);
                            if (callSite2 == false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l4;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l);
                            ++n;
                        }
                        if (callSite2 != false) continue block2;
                    } while (l < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-6451646361951068175L, (long)l);
                }
            }
            lmu2 = lmu3;
        }
        ltv ltv2 = (ltv)lmu2;
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)((Object)this), (long)-6574729874872504201L, (long)l)}, (long)-4893124778935084462L, (long)l);
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)((Object)this), (long)-4899374515864533261L, (long)l)}, (long)-6842293807610043356L, (long)l);
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)((Object)this), (long)-6346277956614322605L, (long)l)}, (long)-5143028011138218640L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
