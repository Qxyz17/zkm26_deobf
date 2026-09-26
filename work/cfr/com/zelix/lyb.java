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
    private static final long d = prr.a(4805538133306519892L, 3018759310020755265L, MethodHandles.lookup().lookupClass()).a(53073903512314L);

    public lyb(long l10, int n10) {
        long l11 = (l10 = d ^ l10) ^ 0x8F3F14EDD3L;
        long l12 = l11 >>> 16;
        int n11 = (int)(l11 << 48 >>> 48);
        super(l12, (char)n11, n10);
    }

    @Override
    public boolean q(short s10, Set set, int n10, int n11) {
        boolean bl2;
        block9: {
            long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
            long l11 = l10 ^ 0L;
            int n12 = (int)(l11 >>> 48);
            int n13 = (int)(l11 << 16 >>> 32);
            int n14 = (int)(l11 << 48 >>> 48);
            int n15 = this.r.length;
            int n16 = 0;
            CallSite callSite = m44.a("o", (long)6776100058742951217L, (long)l10);
            while (n16 < n15) {
                CallSite callSite2;
                block7: {
                    block8: {
                        block10: {
                            h h10 = (h)((Object)this.r[n16]);
                            try {
                                try {
                                    try {
                                        callSite2 = callSite;
                                        if (n10 <= 0) break block7;
                                        if (callSite2 != false) break block8;
                                        bl2 = h10.q((short)n12, set, n13, n14);
                                        if (callSite != false) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("o", (Object)n92, (long)6365328273127446547L, (long)l10);
                                    }
                                    if (bl2) break block10;
                                }
                                catch (n9 n93) {
                                    throw m44.a("o", (Object)n93, (long)6365328273127446547L, (long)l10);
                                }
                                return false;
                            }
                            catch (n9 n94) {
                                throw m44.a("o", (Object)n94, (long)6365328273127446547L, (long)l10);
                            }
                        }
                        ++n16;
                    }
                    callSite2 = callSite;
                }
                if (callSite2 == false) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static n9 c(n9 n92) {
        return n92;
    }
}

