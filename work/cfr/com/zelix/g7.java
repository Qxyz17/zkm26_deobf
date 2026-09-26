/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public abstract class g7 {
    protected Object l;
    private static final long a = prr.a(4934099823017459823L, 2479422591241913785L, MethodHandles.lookup().lookupClass()).a(95183988263961L);

    public boolean equals(Object object) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = a ^ 0x7C0B5B44110DL;
                CallSite callSite = m44.a("l", (long)-5269818447118132807L, (long)l10);
                try {
                    try {
                        bl2 = object instanceof g7;
                        if (callSite == null) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-5306866121880154712L, (long)l10);
                    }
                    return m44.a("r", (Object)this, (long)-6168375276416082830L, (long)l10).equals(m44.a("r", (Object)((g7)object), (long)-6168375276416082830L, (long)l10));
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-5306866121880154712L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public Object x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("w", (Object)this, (long)8665118277409115735L, (long)l10);
    }

    public g7(Object object, long l10) {
        l10 = a ^ l10;
        m44.a("p", (Object)this, (Object)object, (long)-1225657279841724182L, (long)l10);
    }

    public abstract void D(Object[] var1);

    public String toString() {
        long l10 = a ^ 0x526226C995E9L;
        return m44.a("v", (Object)this, (long)3351145653213812886L, (long)l10).toString();
    }

    public int hashCode() {
        long l10 = a ^ 0x54276350152DL;
        return m44.a("r", (Object)this, (long)-5889108032750692270L, (long)l10).hashCode();
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

