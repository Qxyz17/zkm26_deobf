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
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ltk
extends l7t {
    private static final long a = prr.a((long)-7645011639657829613L, (long)4599404679983403633L, MethodHandles.lookup().lookupClass()).a(240221719072505L);

    public void M(Object[] objectArray) {
        block5: {
            CallSite callSite;
            lmu lmu2;
            long l;
            block4: {
                lmu lmu3 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l = (Long)objectArray[2];
                long l2 = l ^ 0L;
                lmu2 = this.V(0);
                CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l);
                try {
                    try {
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = l2;
                        objectArray2[1] = lqu2;
                        objectArray2[0] = this;
                        m44.a("w", (Object)lmu2, (Object)objectArray2, (long)-6656114929610942631L, (long)l);
                        callSite = m44.a("v", (Object)((Object)this), (long)-4632680904528735155L, (long)l);
                        if (callSite2 != false) break block4;
                        if (!(callSite instanceof ltv)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-6885842957083125239L, (long)l);
                    }
                    callSite = m44.a("v", (Object)((Object)this), (long)-4632680904528735155L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-6885842957083125239L, (long)l);
                }
            }
            m44.a("w", (Object)((ltv)callSite), (Object)new Object[]{(lyt)lmu2}, (long)-5052410866110376138L, (long)l);
        }
    }

    public ltk(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x6CD6A1CB335AL;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
