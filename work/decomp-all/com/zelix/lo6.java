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
    private static final long a = prr.a((long)-5764449908065447493L, (long)-637088111256541744L, MethodHandles.lookup().lookupClass()).a(202289006157242L);

    public int Q(Object[] objectArray) {
        int n;
        block4: {
            int n2;
            block5: {
                long l = (Long)objectArray[0];
                bn bn2 = (bn)objectArray[1];
                bn bn3 = (bn)objectArray[2];
                l = a ^ l;
                n2 = bn2.m().toLowerCase().compareTo(bn3.m().toLowerCase());
                CallSite callSite = m44.a("l", (long)-6609746045017209847L, (long)l);
                try {
                    try {
                        n = n2;
                        if (callSite != null) break block4;
                        if (n != 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)-5023796442226532470L, (long)l);
                    }
                    return bn2.B().toLowerCase().compareTo(bn3.B().toLowerCase());
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)-5023796442226532470L, (long)l);
                }
            }
            n = n2;
        }
        return n;
    }

    lo6(n0 n02) {
        this.n = n02;
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x6BBE60445604L;
        long l2 = l ^ 0x6ABFDB6F94FL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (bn)object2;
        objectArray[1] = (bn)object;
        objectArray[0] = l2;
        return (int)m44.a("v", (Object)this, (Object)objectArray, (long)-3588535950329292950L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
