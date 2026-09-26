/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7;
import com.zelix.l_;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.vx;
import com.zelix.zn;
import java.lang.invoke.CallSite;

public class lq
extends l7
implements vx {
    private String Y;

    public lq(int n10) {
        super(n10);
    }

    @Override
    public void v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("q", (Object)this, (String)string, (long)-4859118927319426085L, (long)l10);
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        block6: {
            long l11 = l10;
            long l12 = l11 ^ 0L;
            long l13 = l11 ^ 0x2BEAF1B40FB1L;
            long l14 = l11 ^ 0x2112530E5D63L;
            int n10 = this.y(l13);
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
            int n11 = 0;
            block2: while (n11 < n10) {
                try {
                    this.g(n11).F(this, lkc2, l12);
                    ++n11;
                    do {
                        CallSite callSite2 = callSite;
                        if (l10 >= 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-3975923905996119616L, (long)l10);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = m44.a("v", (Object)this, (long)-3083414076663532930L, (long)l10);
            objectArray[0] = l14;
            m44.a("w", (Object)((l_)zn2), (Object)objectArray, (long)-3528215532361112910L, (long)l10);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

