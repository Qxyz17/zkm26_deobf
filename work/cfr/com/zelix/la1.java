/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class la1
extends l7t {
    private static final long a = prr.a(667009716250302463L, 6912136146056537211L, MethodHandles.lookup().lookupClass()).a(121358879178076L);

    @Override
    public void M(Object[] objectArray) {
        block5: {
            Object object;
            lmu lmu2;
            long l10;
            block4: {
                lmu lmu3 = (lmu)objectArray[0];
                lqu lqu2 = (lqu)objectArray[1];
                l10 = (Long)objectArray[2];
                long l11 = l10 ^ 0L;
                lmu2 = this.V(0);
                CallSite callSite = m44.a("h", (long)-5113628074367501874L, (long)l10);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l11;
                objectArray2[1] = lqu2;
                objectArray2[0] = this;
                m44.a("w", (Object)lmu2, (Object)objectArray2, (long)-6656114929610942631L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        object = m44.a("v", (Object)this, (long)-4632680904528735155L, (long)l10);
                        if (callSite2 == false) break block4;
                        if (!(object instanceof ltv)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-4724596610340074181L, (long)l10);
                    }
                    object = lmu3;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-4724596610340074181L, (long)l10);
                }
            }
            m44.a("w", (Object)((ltv)object), (Object)new Object[]{(lyt)lmu2}, (long)-4737621221817374426L, (long)l10);
        }
    }

    public la1(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x192B89F3309AL;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

