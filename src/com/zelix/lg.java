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

    public void v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("q", (Object)((Object)this), (String)string, (long)-6395903007965639040L, (long)l);
    }

    public lg(int n) {
        super(n);
    }

    public void F(zn zn2, lkc lkc2, long l) {
        block6: {
            long l2 = l;
            long l3 = l2 ^ 0L;
            long l4 = l2 ^ 0x170C6382CB5L;
            long l5 = l2 ^ 0x2BEAF1B40FB1L;
            int n = this.y(l5);
            int n2 = 0;
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
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
                    throw m44.a("h", (Object)((Object)n92), (long)-3502312678598674059L, (long)l);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = m44.a("v", (Object)((Object)this), (long)-3560022703477659867L, (long)l);
            objectArray[0] = l4;
            m44.a("w", (Object)((ll)zn2), (Object)objectArray, (long)-3166262933173309630L, (long)l);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
