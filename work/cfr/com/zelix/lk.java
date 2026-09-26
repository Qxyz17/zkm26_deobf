/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jp;
import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class lk
extends l7 {
    Integer s;
    lkc L;
    ArrayList r;
    private static final long a = prr.a(8630617226392143166L, 6635007852696936628L, MethodHandles.lookup().lookupClass()).a(106143901107476L);

    public lk(int n10) {
        super(n10);
    }

    void M(long l10, String string) {
        long l11 = (l10 = a ^ l10) ^ 0x67A2B13B27D0L;
        this.r.add(this.L.q(l11, Integer.parseInt(string)));
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        block8: {
            long l11 = l10;
            long l12 = l11 ^ 0L;
            long l13 = l11 ^ 0x34E09E9B0711L;
            int n10 = (int)(l13 >>> 32);
            int n11 = (int)(l13 << 32 >>> 56);
            int n12 = (int)(l13 << 40 >>> 40);
            long l14 = l11 ^ 0x2BEAF1B40FB1L;
            this.L = lkc2;
            int n13 = this.y(l14);
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
            this.r = new ArrayList(n13 - 1);
            int n14 = 0;
            block2: while (n14 < n13) {
                try {
                    this.g(n14).F(this, lkc2, l12);
                    ++n14;
                    do {
                        CallSite callSite2 = callSite;
                        if (l10 >= 0L) {
                            if (callSite2 != null) break block8;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-2954736958926325703L, (long)l10);
                }
            }
            if (lkc2.C()) {
                jp jp2 = (jp)zn2;
                for (int i10 = 0; i10 < this.r.size(); ++i10) {
                    jp2.W((Integer)this.r.get(i10), this.s, n10, (byte)n11, n12);
                    if (callSite == null) continue;
                }
            }
        }
    }

    void H(long l10, String string) {
        long l11 = (l10 = a ^ l10) ^ 0x58035682C5BCL;
        this.s = this.L.q(l11, Integer.parseInt(string));
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

