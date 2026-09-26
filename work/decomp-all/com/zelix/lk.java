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
    private static final long a = prr.a((long)8630617226392143166L, (long)6635007852696936628L, MethodHandles.lookup().lookupClass()).a(106143901107476L);

    public lk(int n) {
        super(n);
    }

    void M(long l, String string) {
        long l2 = (l = a ^ l) ^ 0x67A2B13B27D0L;
        this.r.add(this.L.q(l2, Integer.parseInt(string)));
    }

    public void F(zn zn2, lkc lkc2, long l) {
        block8: {
            long l2 = l;
            long l3 = l2 ^ 0L;
            long l4 = l2 ^ 0x34E09E9B0711L;
            int n = (int)(l4 >>> 32);
            int n2 = (int)(l4 << 32 >>> 56);
            int n3 = (int)(l4 << 40 >>> 40);
            long l5 = l2 ^ 0x2BEAF1B40FB1L;
            this.L = lkc2;
            int n4 = this.y(l5);
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
            this.r = new ArrayList(n4 - 1);
            int n5 = 0;
            block2: while (n5 < n4) {
                try {
                    this.g(n5).F((zn)this, lkc2, l3);
                    ++n5;
                    do {
                        CallSite callSite2 = callSite;
                        if (l >= 0L) {
                            if (callSite2 != null) break block8;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-2954736958926325703L, (long)l);
                }
            }
            if (lkc2.C()) {
                jp jp2 = (jp)zn2;
                for (int i = 0; i < this.r.size(); ++i) {
                    jp2.W((Integer)this.r.get(i), this.s, n, (byte)n2, n3);
                    if (callSite == null) continue;
                }
            }
        }
    }

    void H(long l, String string) {
        long l2 = (l = a ^ l) ^ 0x58035682C5BCL;
        this.s = this.L.q(l2, Integer.parseInt(string));
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
