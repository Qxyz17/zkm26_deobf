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
    private static final long d = prr.a(-6397699160438584186L, 3873589078834457342L, MethodHandles.lookup().lookupClass()).a(250023038696059L);

    public lwe(int n10, long l10) {
        long l11 = (l10 = d ^ l10) ^ 0xCB8D360F314L;
        super(n10, l11);
    }

    @Override
    public final boolean i(char c10, int n10, short s10, String string) {
        long l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48;
        long l11 = l10 ^ 0x3737528C0D12L;
        return mn.R(string, l11, this.b);
    }

    @Override
    public final String e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.b;
    }

    boolean l(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = d ^ l10;
                CallSite callSite = m44.a("j", (long)8782809752097257764L, (long)l10);
                try {
                    try {
                        bl2 = this.b.indexOf("*");
                        if (callSite == false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)7393778664040949483L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)7393778664040949483L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

