/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.ts;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class g5
implements Iterator {
    final ts z;
    private int G;
    private static final long a = prr.a((long)4080271047613056986L, (long)-4907467999177166299L, MethodHandles.lookup().lookupClass()).a(159213469730000L);

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    g5(ts ts2) {
        this.z = ts2;
    }

    @Override
    public boolean hasNext() {
        Object object;
        block4: {
            block5: {
                long l = a ^ 0x36215B4CBAD0L;
                long l2 = l ^ 0x176297DF9A31L;
                CallSite callSite = m44.a("h", (long)-4211317569338090568L, (long)l);
                try {
                    try {
                        object = m44.a("v", (Object)this, (long)-2408901177256751734L, (long)l);
                        if (callSite != null) break block4;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = m44.a("v", (Object)this, (long)-4318137205573561860L, (long)l);
                        objectArray[0] = l2;
                        if (object >= ((CallSite)m44.a("h", (Object)objectArray, (long)-2451782071042094214L, (long)l)).length) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw m44.a("h", (Object)unsupportedOperationException, (long)-4576194360429830795L, (long)l);
                    }
                    object = true;
                    break block4;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw m44.a("h", (Object)unsupportedOperationException, (long)-4576194360429830795L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public Object next() {
        long l = a ^ 0x177ED0165698L;
        long l2 = l ^ 0x363D1C857679L;
        Object[] objectArray = new Object[2];
        objectArray[1] = m44.a("v", (Object)this, (long)2907852325105778100L, (long)l);
        objectArray[0] = l2;
        CallSite callSite = m44.a("h", (Object)objectArray, (long)3580823970142201650L, (long)l);
        g5 g52 = this;
        CallSite callSite2 = m44.a("v", (Object)g52, (long)3664237381043462594L, (long)l);
        m44.a("t", (Object)g52, (int)(callSite2 + true), (long)3664237381043462594L, (long)l);
        return callSite[callSite2];
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}
