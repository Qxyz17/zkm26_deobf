/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.lt9;
import com.zelix.m44;
import com.zelix.mn;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lwe
extends lt9
implements dd {
    private static final long d = prr.a((long)-6397699160438584186L, (long)3873589078834457342L, MethodHandles.lookup().lookupClass()).a(250023038696059L);

    public lwe(int n, long l) {
        long l2 = (l = d ^ l) ^ 0xCB8D360F314L;
        super(n, l2);
    }

    public final boolean i(char c, int n, short s, String string) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        long l2 = l ^ 0x3737528C0D12L;
        return mn.R((String)string, (long)l2, (String)this.b);
    }

    public final String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return this.b;
    }

    boolean l(Object[] objectArray) {
        boolean bl;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = d ^ l;
                CallSite callSite = m44.a("j", (long)8782809752097257764L, (long)l);
                try {
                    try {
                        bl = this.b.indexOf("*");
                        if (callSite == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)7393778664040949483L, (long)l);
                    }
                    bl = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)7393778664040949483L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
