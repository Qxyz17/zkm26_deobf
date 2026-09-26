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
    private static final long b = prr.a(4906199565598801782L, 8953340390893825225L, MethodHandles.lookup().lookupClass()).a(219063172355245L);

    public l7o(long l10, int n10) {
        long l11 = (l10 = b ^ l10) ^ 0x5FD5A58CCB84L;
        super(n10, l11);
    }

    public void Y(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = b ^ l10;
        m44.a("v", (Object)this, (String)string, (long)-2919906303610810068L, (long)l10);
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
        long l11;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l11 = (Long)objectArray[2];
            long l12 = l11;
            long l13 = l12 ^ 0x47526B4E5A06L;
            long l14 = l12 ^ 0L;
            l10 = l12 ^ 0x3E0F01F35A34L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l11);
            int n10 = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l11);
            block2: while (n10 < callSite) {
                try {
                    do {
                        if (l11 > 0L) {
                            lmu2 = this.V(n10);
                            if (callSite2 == false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l14;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l11);
                            ++n10;
                        }
                        if (callSite2 != false) continue block2;
                    } while (l11 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-6825763510291866475L, (long)l11);
                }
            }
            lmu2 = lmu3;
        }
        ltv ltv2 = (ltv)lmu2;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = m44.a("v", (Object)this, (long)-4724265767275333594L, (long)l11);
        objectArray4[0] = l10;
        m44.a("w", (Object)ltv2, (Object)objectArray4, (long)-6638410914078896463L, (long)l11);
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)this, (long)-4899374515864533261L, (long)l11)}, (long)-6842293807610043356L, (long)l11);
        m44.a("w", (Object)ltv2, (Object)new Object[]{m44.a("v", (Object)this, (long)-6346277956614322605L, (long)l11)}, (long)-5143028011138218640L, (long)l11);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

