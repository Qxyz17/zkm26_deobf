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
    private static final long a = prr.a(-7645011639657829613L, 4599404679983403633L, MethodHandles.lookup().lookupClass()).a(240221719072505L);

    @Override
    public void M(Object[] objectArray) {
        block5: {
            CallSite callSite;
            lmu lmu2;
            long l10;
            block4: {
                lmu lmu3 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l10 = (Long)objectArray[2];
                long l11 = l10 ^ 0L;
                lmu2 = this.V(0);
                CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = l11;
                        objectArray2[1] = lqu2;
                        objectArray2[0] = this;
                        m44.a("w", (Object)lmu2, (Object)objectArray2, (long)-6656114929610942631L, (long)l10);
                        callSite = m44.a("v", (Object)this, (long)-4632680904528735155L, (long)l10);
                        if (callSite2 != false) break block4;
                        if (!(callSite instanceof ltv)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-6885842957083125239L, (long)l10);
                    }
                    callSite = m44.a("v", (Object)this, (long)-4632680904528735155L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-6885842957083125239L, (long)l10);
                }
            }
            m44.a("w", (Object)((ltv)((Object)callSite)), (Object)new Object[]{(lyt)lmu2}, (long)-5052410866110376138L, (long)l10);
        }
    }

    public ltk(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x6CD6A1CB335AL;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

