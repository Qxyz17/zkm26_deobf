/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lj;
import com.zelix.lkc;
import com.zelix.ll;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lp
extends lj {
    private boolean a;
    private static final long b = prr.a(-5577576195164186238L, 8875632675867426342L, MethodHandles.lookup().lookupClass()).a(140475182435249L);

    public void T(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        m44.a("v", (Object)this, (boolean)true, (long)5668198511149927326L, (long)l10);
    }

    public lp(int n10) {
        super(n10);
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        block6: {
            long l11 = l10;
            long l12 = l11 ^ 0L;
            long l13 = l11 ^ 0x46DCB7B28E55L;
            long l14 = l11 ^ 0x2BEAF1B40FB1L;
            int n10 = this.y(l14);
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
                    throw m44.a("h", (Object)n92, (long)-2954937312509887259L, (long)l10);
                }
            }
            Object[] objectArray = new Object[4];
            objectArray[3] = (boolean)m44.a("v", (Object)this, (long)-3160559265915743980L, (long)l10);
            objectArray[2] = m44.a("v", (Object)this, (long)-3437322662414892366L, (long)l10);
            objectArray[1] = m44.a("v", (Object)this, (long)-3547190844732187394L, (long)l10);
            objectArray[0] = l13;
            m44.a("w", (Object)((ll)zn2), (Object)objectArray, (long)-3832753679129545219L, (long)l10);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

