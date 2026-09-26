/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lj;
import com.zelix.lkc;
import com.zelix.ll;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.zn;
import java.lang.invoke.CallSite;

public class ly
extends lj {
    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        block6: {
            long l11 = l10;
            long l12 = l11 ^ 0L;
            long l13 = l11 ^ 0x57CA1905B406L;
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
                    } while (l10 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-3307400999634877632L, (long)l10);
                }
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = m44.a("v", (Object)this, (long)-3437322662414892366L, (long)l10);
            objectArray[1] = m44.a("v", (Object)this, (long)-3547190844732187394L, (long)l10);
            objectArray[0] = l13;
            m44.a("w", (Object)((ll)zn2), (Object)objectArray, (long)-2967946960052629939L, (long)l10);
        }
    }

    public ly(int n10) {
        super(n10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

