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
    private static final long b = prr.a((long)-5577576195164186238L, (long)8875632675867426342L, MethodHandles.lookup().lookupClass()).a(140475182435249L);

    public void T(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        m44.a("v", (Object)((Object)this), (boolean)true, (long)5668198511149927326L, (long)l);
    }

    public lp(int n) {
        super(n);
    }

    public void F(zn zn2, lkc lkc2, long l) {
        block6: {
            long l2 = l;
            long l3 = l2 ^ 0L;
            long l4 = l2 ^ 0x46DCB7B28E55L;
            long l5 = l2 ^ 0x2BEAF1B40FB1L;
            int n = this.y(l5);
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
                    throw m44.a("h", (Object)((Object)n92), (long)-2954937312509887259L, (long)l);
                }
            }
            Object[] objectArray = new Object[4];
            objectArray[3] = (boolean)m44.a("v", (Object)((Object)this), (long)-3160559265915743980L, (long)l);
            objectArray[2] = m44.a("v", (Object)((Object)this), (long)-3437322662414892366L, (long)l);
            objectArray[1] = m44.a("v", (Object)((Object)this), (long)-3547190844732187394L, (long)l);
            objectArray[0] = l4;
            m44.a("w", (Object)((ll)zn2), (Object)objectArray, (long)-3832753679129545219L, (long)l);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
