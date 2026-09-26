/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h;
import com.zelix.ly6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public abstract class lyb
extends ly6
implements h {
    private static final long d = prr.a((long)4805538133306519892L, (long)3018759310020755265L, MethodHandles.lookup().lookupClass()).a(53073903512314L);

    public lyb(long l, int n) {
        long l2 = (l = d ^ l) ^ 0x8F3F14EDD3L;
        long l3 = l2 >>> 16;
        int n2 = (int)(l2 << 48 >>> 48);
        super(l3, (char)n2, n);
    }

    public boolean q(short s, Set set, int n, int n2) {
        boolean bl;
        block9: {
            long l = (long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48;
            long l2 = l ^ 0L;
            int n3 = (int)(l2 >>> 48);
            int n4 = (int)(l2 << 16 >>> 32);
            int n5 = (int)(l2 << 48 >>> 48);
            int n6 = this.r.length;
            int n7 = 0;
            CallSite callSite = m44.a("o", (long)6776100058742951217L, (long)l);
            while (n7 < n6) {
                CallSite callSite2;
                block7: {
                    block8: {
                        block10: {
                            h h2 = (h)this.r[n7];
                            try {
                                try {
                                    try {
                                        callSite2 = callSite;
                                        if (n <= 0) break block7;
                                        if (callSite2 != false) break block8;
                                        bl = h2.q((short)n3, set, n4, n5);
                                        if (callSite != false) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("o", (Object)((Object)n92), (long)6365328273127446547L, (long)l);
                                    }
                                    if (bl) break block10;
                                }
                                catch (n9 n93) {
                                    throw m44.a("o", (Object)((Object)n93), (long)6365328273127446547L, (long)l);
                                }
                                return false;
                            }
                            catch (n9 n94) {
                                throw m44.a("o", (Object)((Object)n94), (long)6365328273127446547L, (long)l);
                            }
                        }
                        ++n7;
                    }
                    callSite2 = callSite;
                }
                if (callSite2 == false) continue;
            }
            bl = true;
        }
        return bl;
    }

    private static n9 c(n9 n92) {
        return n92;
    }
}
