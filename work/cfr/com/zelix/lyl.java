/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.ly6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public abstract class lyl
extends ly6
implements dd {
    private static final long d = prr.a(7891919380379790556L, -5327604794422222326L, MethodHandles.lookup().lookupClass()).a(99457602302766L);

    @Override
    public boolean i(char c10, int n10, short s10, String string) {
        boolean bl2;
        block9: {
            long l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48;
            long l11 = l10 ^ 0L;
            int n11 = (int)(l11 >>> 48);
            int n12 = (int)(l11 << 16 >>> 32);
            int n13 = (int)(l11 << 48 >>> 48);
            int n14 = this.r.length;
            int n15 = 0;
            CallSite callSite = m44.a("i", (long)4736006086195462527L, (long)l10);
            while (n15 < n14) {
                CallSite callSite2;
                block7: {
                    block8: {
                        block10: {
                            dd dd2 = (dd)((Object)this.r[n15]);
                            try {
                                try {
                                    try {
                                        callSite2 = callSite;
                                        if (s10 <= 0) break block7;
                                        if (callSite2 == false) break block8;
                                        bl2 = dd2.i((char)n11, n12, (short)n13, string);
                                        if (callSite == false) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("i", (Object)n92, (long)6432484536064637845L, (long)l10);
                                    }
                                    if (bl2) break block10;
                                }
                                catch (n9 n93) {
                                    throw m44.a("i", (Object)n93, (long)6432484536064637845L, (long)l10);
                                }
                                return false;
                            }
                            catch (n9 n94) {
                                throw m44.a("i", (Object)n94, (long)6432484536064637845L, (long)l10);
                            }
                        }
                        ++n15;
                    }
                    callSite2 = callSite;
                }
                if (callSite2 != false) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    public lyl(long l10, int n10) {
        long l11 = (l10 = d ^ l10) ^ 0x5B1E2FAD65ADL;
        long l12 = l11 >>> 16;
        int n11 = (int)(l11 << 48 >>> 48);
        super(l12, (char)n11, n10);
    }

    private static n9 c(n9 n92) {
        return n92;
    }
}

