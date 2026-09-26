/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7q;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class l7o
extends l7q {
    private String j;
    private static final long b = prr.a((long)4906199565598801782L, (long)8953340390893825225L, MethodHandles.lookup().lookupClass()).a(219063172355245L);

    public l7o(long l, int n) {
        long l2 = (l = b ^ l) ^ 0x5FD5A58CCB84L;
        super(n, l2);
    }

    public void Y(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = b ^ l;
        m44.a("v", (Object)((Object)this), (String)string, (long)-2919906303610810068L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l;
        long l2;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l2 = (Long)objectArray[2];
            long l3 = l2;
            long l4 = l3 ^ 0x47526B4E5A06L;
            long l5 = l3 ^ 0L;
            l = l3 ^ 0x3E0F01F35A34L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l2);
            int n = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l2);
            block2: while (n < callSite) {
                try {
                    do {
                        if (l2 > 0L) {
                            lmu2 = this.V(n);
                            if (callSite2 == false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l5;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l2);
                            ++n;
                        }
                        if (callSite2 != false) continue block2;
                    } while (l2 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-6825763510291866475L, (long)l2);
                }
            }
            lmu2 = lmu3;
        }
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = m44.a("v", (Object)((Object)this), (long)-4724265767275333594L, (long)l2);
        objectArray4[0] = l;
        m44.a("w", (Object)ltv2, (Object)objectArray4, (long)-6638410914078896463L, (long)l2);
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)((Object)this), (long)-4899374515864533261L, (long)l2)}, (long)-6842293807610043356L, (long)l2);
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)((Object)this), (long)-6346277956614322605L, (long)l2)}, (long)-5143028011138218640L, (long)l2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
