/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.laf;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lya;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lyt
extends lya {
    private static final long a = prr.a(-7429799866596530799L, 8241900798742948850L, MethodHandles.lookup().lookupClass()).a(50624004121713L);

    @Override
    boolean V(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 ^ 0x7AC03D42C83FL;
                dd dd2 = (dd)((Object)this.V(0));
                CallSite callSite = m44.a("j", (long)-3018269578021960412L, (long)l10);
                try {
                    try {
                        bl2 = dd2 instanceof laf;
                        if (callSite != false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-2957836392393726513L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    return (boolean)m44.a("u", (Object)((laf)((Object)dd2)), (Object)objectArray2, (long)-2917180242621223624L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-2957836392393726513L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)this.V(0), (Object)objectArray2, (long)-6656114929610942631L, (long)l10);
    }

    public lyt(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x688F1B41484CL;
        long l12 = l11 >>> 32;
        int n11 = (int)(l11 << 32 >>> 32);
        super(l12, n10, n11);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

