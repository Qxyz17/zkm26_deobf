/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lu4;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class luv
extends lu4 {
    final mu Z;
    private static final long a = prr.a(-5832869810206096185L, -6354120727373243755L, MethodHandles.lookup().lookupClass()).a(215438923901209L);

    luv(char c10, int n10, mu mu2, short s10) {
        long l10 = ((long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x5622DB1091A5L;
        this.Z = mu2;
        super(l11);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void r(Object[] objectArray) {
        block8: {
            CallSite callSite;
            long l10;
            long l11;
            block6: {
                l11 = (Long)objectArray[0];
                long l12 = l11;
                long l13 = l12 ^ 0x3727E79420BEL;
                l10 = l12 ^ 0x3D220AAEB809L;
                CallSite callSite2 = m44.a("h", (long)5561146463333268445L, (long)l11);
                try {
                    block7: {
                        try {
                            try {
                                callSite = m44.a("v", (Object)this, (long)5698235578073677309L, (long)l11);
                                if (callSite2 != null) break block6;
                                if (m44.a("v", (Object)callSite, (long)6067494058380801140L, (long)l11) != null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)5965537326760926669L, (long)l11);
                            }
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l13;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)5698235578073677309L, (long)l11), (Object)objectArray2, (long)5234313834680001603L, (long)l11);
                            if (callSite2 == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)5965537326760926669L, (long)l11);
                        }
                    }
                    callSite = m44.a("v", (Object)this, (long)5698235578073677309L, (long)l11);
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)n94, (long)5965537326760926669L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = m44.a("v", (Object)m44.a("v", (Object)this, (long)5698235578073677309L, (long)l11), (long)6067494058380801140L, (long)l11);
            objectArray3[0] = l10;
            m44.a("w", (Object)callSite, (Object)objectArray3, (long)6301689176653217008L, (long)l11);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

