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
    private static final long a = prr.a((long)6351547198075532566L, (long)-1700943362001888834L, MethodHandles.lookup().lookupClass()).a(98923775630606L);

    public lt_(int n, short s, int n2, short s2) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x8C6787B1E48L;
        int n3 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n3, n2, l3);
    }

    public void M(Object[] objectArray) {
        block5: {
            CallSite callSite;
            lmu lmu2;
            long l;
            long l2;
            block4: {
                lmu lmu3 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l2 = (Long)objectArray[2];
                long l3 = l2;
                l = l3 ^ 0x7D08332BED37L;
                long l4 = l3 ^ 0L;
                CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l2);
                lmu2 = this.V(0);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l4;
                objectArray2[1] = lqu2;
                objectArray2[0] = this;
                m44.a("w", (Object)lmu2, (Object)objectArray2, (long)-6656114929610942631L, (long)l2);
                CallSite callSite3 = callSite2;
                try {
                    try {
                        callSite = m44.a("v", (Object)((Object)this), (long)-4632680904528735155L, (long)l2);
                        if (callSite3 != false) break block4;
                        if (!(callSite instanceof ltb)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-6515290546033822398L, (long)l2);
                    }
                    callSite = m44.a("v", (Object)((Object)this), (long)-4632680904528735155L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-6515290546033822398L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = (lyt)lmu2;
            objectArray3[0] = l;
            m44.a("w", (Object)((ltb)callSite), (Object)objectArray3, (long)-6373301371480721960L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
