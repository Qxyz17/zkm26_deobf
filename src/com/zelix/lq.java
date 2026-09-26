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

    public lq(int n) {
        super(n);
    }

    public void v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("q", (Object)((Object)this), (String)string, (long)-4859118927319426085L, (long)l);
    }

    public void F(zn zn2, lkc lkc2, long l) {
        block6: {
            long l2 = l;
            long l3 = l2 ^ 0L;
            long l4 = l2 ^ 0x2BEAF1B40FB1L;
            long l5 = l2 ^ 0x2112530E5D63L;
            int n = this.y(l4);
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
            int n2 = 0;
            block2: while (n2 < n) {
                try {
                    this.g(n2).F((zn)this, lkc2, l3);
                    ++n2;
                    do {
                        CallSite callSite2 = callSite;
                        if (l >= 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-3975923905996119616L, (long)l);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = m44.a("v", (Object)((Object)this), (long)-3083414076663532930L, (long)l);
            objectArray[0] = l5;
            m44.a("w", (Object)((l_)zn2), (Object)objectArray, (long)-3528215532361112910L, (long)l);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
