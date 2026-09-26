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
    private static final long d = prr.a((long)7891919380379790556L, (long)-5327604794422222326L, MethodHandles.lookup().lookupClass()).a(99457602302766L);

    public boolean i(char c, int n, short s, String string) {
        boolean bl;
        block9: {
            long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
            long l2 = l ^ 0L;
            int n2 = (int)(l2 >>> 48);
            int n3 = (int)(l2 << 16 >>> 32);
            int n4 = (int)(l2 << 48 >>> 48);
            int n5 = this.r.length;
            int n6 = 0;
            CallSite callSite = m44.a("i", (long)4736006086195462527L, (long)l);
            while (n6 < n5) {
                CallSite callSite2;
                block7: {
                    block8: {
                        block10: {
                            dd dd2 = (dd)this.r[n6];
                            try {
                                try {
                                    try {
                                        callSite2 = callSite;
                                        if (s <= 0) break block7;
                                        if (callSite2 == false) break block8;
                                        bl = dd2.i((char)n2, n3, (short)n4, string);
                                        if (callSite == false) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("i", (Object)((Object)n92), (long)6432484536064637845L, (long)l);
                                    }
                                    if (bl) break block10;
                                }
                                catch (n9 n93) {
                                    throw m44.a("i", (Object)((Object)n93), (long)6432484536064637845L, (long)l);
                                }
                                return false;
                            }
                            catch (n9 n94) {
                                throw m44.a("i", (Object)((Object)n94), (long)6432484536064637845L, (long)l);
                            }
                        }
                        ++n6;
                    }
                    callSite2 = callSite;
                }
                if (callSite2 != false) continue;
            }
            bl = true;
        }
        return bl;
    }

    public lyl(long l, int n) {
        long l2 = (l = d ^ l) ^ 0x5B1E2FAD65ADL;
        long l3 = l2 >>> 16;
        int n2 = (int)(l2 << 48 >>> 48);
        super(l3, (char)n2, n);
    }

    private static n9 c(n9 n92) {
        return n92;
    }
}
