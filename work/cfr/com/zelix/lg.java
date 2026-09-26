/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.ll;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.vx;
import com.zelix.zn;
import java.lang.invoke.CallSite;

public class lg
extends l7
implements vx {
    private String q;

    @Override
    public void v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("q", (Object)this, (String)string, (long)-6395903007965639040L, (long)l10);
    }

    public lg(int n10) {
        super(n10);
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        block6: {
            long l11 = l10;
            long l12 = l11 ^ 0L;
            long l13 = l11 ^ 0x170C6382CB5L;
            long l14 = l11 ^ 0x2BEAF1B40FB1L;
            int n10 = this.y(l14);
            int n11 = 0;
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
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
                    throw m44.a("h", (Object)n92, (long)-3502312678598674059L, (long)l10);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = m44.a("v", (Object)this, (long)-3560022703477659867L, (long)l10);
            objectArray[0] = l13;
            m44.a("w", (Object)((ll)zn2), (Object)objectArray, (long)-3166262933173309630L, (long)l10);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

