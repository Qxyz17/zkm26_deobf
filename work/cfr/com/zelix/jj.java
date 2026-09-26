/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.zn;
import java.lang.invoke.CallSite;

public abstract class jj
extends l7 {
    protected lkc s;

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        block6: {
            long l11 = l10;
            long l12 = l11 ^ 0L;
            long l13 = l11 ^ 0x345D4B7995D6L;
            long l14 = l11 ^ 0x2BEAF1B40FB1L;
            long l15 = l11 ^ 0x2541A033ADDAL;
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
            m44.a("t", (Object)this, (lkc)lkc2, (long)-2970927071146353826L, (long)l10);
            CallSite callSite2 = callSite;
            int n10 = this.y(l14);
            Object[] objectArray = new Object[4];
            objectArray[3] = l13;
            objectArray[2] = n10;
            objectArray[1] = lkc2;
            objectArray[0] = zn2;
            m44.a("w", (Object)this, (Object)objectArray, (long)-3281847545335075878L, (long)l10);
            int n11 = 0;
            block2: while (n11 < n10) {
                try {
                    this.g(n11).F(this, lkc2, l12);
                    ++n11;
                    do {
                        CallSite callSite3 = callSite2;
                        if (l10 > 0L) {
                            if (callSite3 != null) break block6;
                            callSite3 = callSite2;
                        }
                        if (callSite3 == null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-3529604254849831430L, (long)l10);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = lkc2;
            objectArray2[0] = l15;
            m44.a("w", (Object)this, (Object)objectArray2, (long)-3606347389108561820L, (long)l10);
        }
    }

    protected abstract void O(Object[] var1);

    public jj(int n10) {
        super(n10);
    }

    protected abstract void k(Object[] var1);

    private static n9 a(n9 n92) {
        return n92;
    }
}

