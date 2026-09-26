/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.b1;
import com.zelix.hy;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class yd
implements Comparator {
    final hy U;
    private static final long a = prr.a((long)3671322135097537985L, (long)-4118012944390278746L, MethodHandles.lookup().lookupClass()).a(175378287133412L);

    public int x(Object[] objectArray) {
        int n;
        block4: {
            long l;
            b1 b12;
            b1 b13;
            block5: {
                b13 = (b1)objectArray[0];
                long l2 = (Long)objectArray[1];
                b12 = (b1)objectArray[2];
                long l3 = l2 = a ^ l2;
                long l4 = l3 ^ 0x78B1D3DA5BECL;
                l = l3 ^ 0x2FAFF402B15L;
                int n2 = b13.h(l4).compareTo(b12.h(l4));
                CallSite callSite = m44.a("j", (long)-5993368781645296481L, (long)l2);
                try {
                    try {
                        n = n2;
                        if (callSite != null) break block4;
                        if (n == 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-5512064191886130673L, (long)l2);
                    }
                    return n2;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-5512064191886130673L, (long)l2);
                }
            }
            n = b13.Z(l).compareTo(b12.Z(l));
        }
        return n;
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x6B017F12A0ADL;
        long l2 = l ^ 0x3631FBC90770L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (b1)object2;
        objectArray[1] = l2;
        objectArray[0] = (b1)object;
        return (int)m44.a("w", (Object)this, (Object)objectArray, (long)5581230113489846233L, (long)l);
    }

    yd(hy hy2) {
        this.U = hy2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
