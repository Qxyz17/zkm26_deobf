/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rg;
import com.zelix.vp;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class et
implements Comparator {
    final vp c;
    private static final long a = prr.a((long)-4961634115678941064L, (long)2788999537028502585L, MethodHandles.lookup().lookupClass()).a(163146641923900L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x12611CADE33FL;
        long l2 = l ^ 0x3449ED7FFBB6L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (lq0)object2;
        objectArray[1] = l2;
        objectArray[0] = (lq0)object;
        return (int)m44.a("q", (Object)this, (Object)objectArray, (long)2276501052250693087L, (long)l);
    }

    public int U(Object[] objectArray) {
        int n;
        block2: {
            int n2;
            block3: {
                lq0 lq02 = (lq0)objectArray[0];
                long l = (Long)objectArray[1];
                lq0 lq03 = (lq0)objectArray[2];
                long l2 = (l = a ^ l) ^ 0x748EDBAC69B8L;
                lq0 lq04 = lq02;
                lq0 lq05 = lq03;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                CallSite callSite = m44.a("q", (Object)((rg)lq04.D()), (Object)objectArray2, (long)1556088421905549890L, (long)l);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l2;
                CallSite callSite2 = m44.a("q", (Object)((rg)lq05.D()), (Object)objectArray3, (long)1556088421905549890L, (long)l);
                n2 = ((String)((Object)callSite)).compareTo((String)((Object)callSite2));
                CallSite callSite3 = m44.a("n", (long)1662482602266431324L, (long)l);
                try {
                    n = n2;
                    if (callSite3 != null) break block2;
                    if (n != 0) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)((Object)n92), (long)1073376610759233563L, (long)l);
                }
                String string = (String)lq04.S();
                String string2 = (String)lq05.S();
                return string.compareTo(string2);
            }
            n = n2;
        }
        return n;
    }

    et(vp vp2) {
        this.c = vp2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
