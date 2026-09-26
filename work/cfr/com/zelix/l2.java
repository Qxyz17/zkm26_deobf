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
    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        zn zn3;
        long l11;
        block6: {
            long l12 = l10;
            long l13 = l12 ^ 0L;
            l11 = l12 ^ 0x82D999FB350L;
            long l14 = l12 ^ 0x2BEAF1B40FB1L;
            int n10 = this.y(l14);
            int n11 = 0;
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
            block2: while (n11 < n10) {
                try {
                    do {
                        if (l10 > 0L) {
                            zn3 = this.g(n11);
                            if (callSite != null) break block6;
                            zn3.F(this, lkc2, l13);
                            ++n11;
                        }
                        if (callSite == null) continue block2;
                    } while (l10 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-2988209224226873983L, (long)l10);
                }
            }
            zn3 = zn2;
        }
        lp lp10 = (lp)zn3;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("w", (Object)lp10, (Object)objectArray, (long)-3380364966030950165L, (long)l10);
    }

    public l2(int n10) {
        super(n10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

