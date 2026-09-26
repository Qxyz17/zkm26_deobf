/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltb;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lt_
extends l7t {
    private static final long a = prr.a(6351547198075532566L, -1700943362001888834L, MethodHandles.lookup().lookupClass()).a(98923775630606L);

    public lt_(int n10, short s10, int n11, short s11) {
        long l10 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)s11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x8C6787B1E48L;
        int n12 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n12, n11, l12);
    }

    @Override
    public void M(Object[] objectArray) {
        block5: {
            CallSite callSite;
            lmu lmu2;
            long l10;
            long l11;
            block4: {
                lmu lmu3 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l11 = (Long)objectArray[2];
                long l12 = l11;
                l10 = l12 ^ 0x7D08332BED37L;
                long l13 = l12 ^ 0L;
                CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l11);
                lmu2 = this.V(0);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l13;
                objectArray2[1] = lqu2;
                objectArray2[0] = this;
                m44.a("w", (Object)lmu2, (Object)objectArray2, (long)-6656114929610942631L, (long)l11);
                CallSite callSite3 = callSite2;
                try {
                    try {
                        callSite = m44.a("v", (Object)this, (long)-4632680904528735155L, (long)l11);
                        if (callSite3 != false) break block4;
                        if (!(callSite instanceof ltb)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-6515290546033822398L, (long)l11);
                    }
                    callSite = m44.a("v", (Object)this, (long)-4632680904528735155L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-6515290546033822398L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = (lyt)lmu2;
            objectArray3[0] = l10;
            m44.a("w", (Object)((ltb)((Object)callSite)), (Object)objectArray3, (long)-6373301371480721960L, (long)l11);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

