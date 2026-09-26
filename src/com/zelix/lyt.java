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
    private static final long a = prr.a((long)-7429799866596530799L, (long)8241900798742948850L, MethodHandles.lookup().lookupClass()).a(50624004121713L);

    boolean V(Object[] objectArray) {
        boolean bl;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                long l2 = l ^ 0x7AC03D42C83FL;
                dd dd2 = (dd)this.V(0);
                CallSite callSite = m44.a("j", (long)-3018269578021960412L, (long)l);
                try {
                    try {
                        bl = dd2 instanceof laf;
                        if (callSite != false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-2957836392393726513L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    return (boolean)m44.a("u", (Object)((laf)dd2), (Object)objectArray2, (long)-2917180242621223624L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-2957836392393726513L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)this.V(0), (Object)objectArray2, (long)-6656114929610942631L, (long)l);
    }

    public lyt(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x688F1B41484CL;
        long l3 = l2 >>> 32;
        int n2 = (int)(l2 << 32 >>> 32);
        super(l3, n, n2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
