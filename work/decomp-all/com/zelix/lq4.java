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
    private static final long b = prr.a((long)-2390253952636789069L, (long)-469129556088678286L, MethodHandles.lookup().lookupClass()).a(179212823114228L);

    public boolean equals(Object object) {
        boolean bl;
        block4: {
            block5: {
                long l = b ^ 0x386C8BDF711FL;
                CallSite callSite = m44.a("i", (long)-9087159718528060109L, (long)l);
                try {
                    try {
                        bl = object instanceof lq4;
                        if (callSite != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-7002473294293226791L, (long)l);
                    }
                    return ((String)((Object)m44.a("w", (Object)this, (long)-9203277399126481618L, (long)l))).equals(m44.a("w", (Object)((lq4)object), (long)-9203277399126481618L, (long)l));
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-7002473294293226791L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        long l = b ^ 0x5D4B24C94051L;
        return ((String)((Object)m44.a("q", (Object)this, (long)-5690009160549575584L, (long)l))).hashCode();
    }

    public boolean L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (boolean)m44.a("r", (Object)this, (long)7299733927812939472L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
