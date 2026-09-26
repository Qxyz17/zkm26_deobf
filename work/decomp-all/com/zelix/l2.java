/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.lp;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.zn;
import java.lang.invoke.CallSite;

public class l2
extends l7 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void F(zn zn2, lkc lkc2, long l) {
        zn zn3;
        long l3;
        block6: {
            long l4 = l;
            long l5 = l4 ^ 0L;
            l3 = l4 ^ 0x82D999FB350L;
            long l6 = l4 ^ 0x2BEAF1B40FB1L;
            int n = this.y(l6);
            int n2 = 0;
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
            block2: while (n2 < n) {
                try {
                    do {
                        if (l > 0L) {
                            zn3 = this.g(n2);
                            if (callSite != null) break block6;
                            zn3.F((zn)this, lkc2, l5);
                            ++n2;
                        }
                        if (callSite == null) continue block2;
                    } while (l <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-2988209224226873983L, (long)l);
                }
            }
            zn3 = zn2;
        }
        lp lp2 = (lp)zn3;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("w", (Object)lp2, (Object)objectArray, (long)-3380364966030950165L, (long)l);
    }

    public l2(int n) {
        super(n);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
