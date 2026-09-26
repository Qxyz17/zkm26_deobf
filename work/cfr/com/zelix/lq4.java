/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public abstract class lq4 {
    String F;
    boolean a;
    int V;
    private static final long b = prr.a(-2390253952636789069L, -469129556088678286L, MethodHandles.lookup().lookupClass()).a(179212823114228L);

    public boolean equals(Object object) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = b ^ 0x386C8BDF711FL;
                CallSite callSite = m44.a("i", (long)-9087159718528060109L, (long)l10);
                try {
                    try {
                        bl2 = object instanceof lq4;
                        if (callSite != null) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-7002473294293226791L, (long)l10);
                    }
                    return ((String)((Object)m44.a("w", (Object)this, (long)-9203277399126481618L, (long)l10))).equals(m44.a("w", (Object)((lq4)object), (long)-9203277399126481618L, (long)l10));
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-7002473294293226791L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public int hashCode() {
        long l10 = b ^ 0x5D4B24C94051L;
        return ((String)((Object)m44.a("q", (Object)this, (long)-5690009160549575584L, (long)l10))).hashCode();
    }

    public boolean L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (boolean)m44.a("r", (Object)this, (long)7299733927812939472L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

