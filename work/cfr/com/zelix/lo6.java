/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bn;
import com.zelix.m44;
import com.zelix.n0;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class lo6
implements Comparator {
    final n0 n;
    private static final long a = prr.a(-5764449908065447493L, -637088111256541744L, MethodHandles.lookup().lookupClass()).a(202289006157242L);

    public int Q(Object[] objectArray) {
        int n10;
        block4: {
            int n11;
            block5: {
                long l10 = (Long)objectArray[0];
                bn bn2 = (bn)objectArray[1];
                bn bn3 = (bn)objectArray[2];
                l10 = a ^ l10;
                n11 = bn2.m().toLowerCase().compareTo(bn3.m().toLowerCase());
                CallSite callSite = m44.a("l", (long)-6609746045017209847L, (long)l10);
                try {
                    try {
                        n10 = n11;
                        if (callSite != null) break block4;
                        if (n10 != 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-5023796442226532470L, (long)l10);
                    }
                    return bn2.B().toLowerCase().compareTo(bn3.B().toLowerCase());
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-5023796442226532470L, (long)l10);
                }
            }
            n10 = n11;
        }
        return n10;
    }

    lo6(n0 n02) {
        this.n = n02;
    }

    public int compare(Object object, Object object2) {
        long l10 = a ^ 0x6BBE60445604L;
        long l11 = l10 ^ 0x6ABFDB6F94FL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (bn)object2;
        objectArray[1] = (bn)object;
        objectArray[0] = l11;
        return (int)m44.a("v", (Object)this, (Object)objectArray, (long)-3588535950329292950L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

