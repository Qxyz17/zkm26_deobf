/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7k;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltb;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class l76
extends l7k {
    private static final long b = prr.a((long)-2582353731525194058L, (long)-8989775782089785406L, MethodHandles.lookup().lookupClass()).a(2883396861512L);

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
            l = l3 ^ 0x6B874B7BFF5DL;
            long l4 = l3 ^ 0x47526B4E5A06L;
            long l5 = l3 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l2);
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l2);
            int n = 0;
            block2: while (n < callSite) {
                try {
                    do {
                        if (l2 >= 0L) {
                            lmu2 = this.V(n);
                            if (callSite2 != false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l5;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l2);
                            ++n;
                        }
                        if (callSite2 == false) continue block2;
                    } while (l2 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-5165679677706233526L, (long)l2);
                }
            }
            lmu2 = lmu3;
        }
        ltb ltb2 = (ltb)lmu2;
        m44.a("w", (Object)ltb2, (Object)new Object[]{m44.a("v", (Object)((Object)this), (long)-6574729874872504201L, (long)l2)}, (long)-6468328683855459123L, (long)l2);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l;
        objectArray4[0] = m44.a("v", (Object)((Object)this), (long)-4899374515864533261L, (long)l2);
        m44.a("w", (Object)ltb2, (Object)objectArray4, (long)-6429553201347735543L, (long)l2);
        m44.a("w", (Object)ltb2, (Object)new Object[]{m44.a("v", (Object)((Object)this), (long)-6346277956614322605L, (long)l2)}, (long)-5033207724861500030L, (long)l2);
    }

    public l76(int n, short s, char c, int n2) {
        long l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ b;
        long l2 = l ^ 0x425D1455EB12L;
        super(l2, n);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
