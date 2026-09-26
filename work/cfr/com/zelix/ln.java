/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fq;
import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.ll;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.zn;
import java.lang.invoke.CallSite;

public class ln
extends l7
implements fq {
    private String O;

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        block6: {
            long l11 = l10;
            long l12 = l11 ^ 0L;
            long l13 = l11 ^ 0x56B600B7A121L;
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
                        if (l10 > 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-3034461851299045727L, (long)l10);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l13;
            objectArray[0] = m44.a("v", (Object)this, (long)-2904261335160286027L, (long)l10);
            m44.a("w", (Object)((ll)zn2), (Object)objectArray, (long)-3094075201148650693L, (long)l10);
        }
    }

    public ln(int n10) {
        super(n10);
    }

    @Override
    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("t", (Object)this, (String)string, (long)957474882238172749L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

