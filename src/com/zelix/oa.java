/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.be;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class oa
implements Comparator {
    private static final long a = prr.a((long)6784921839700098340L, (long)383141337618545970L, MethodHandles.lookup().lookupClass()).a(196168162473060L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x1303DB6E5C52L;
        long l2 = l ^ 0x195A0A8F3CA3L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (be)object2;
        objectArray[1] = (be)object;
        objectArray[0] = l2;
        return (int)m44.a("p", (Object)this, (Object)objectArray, (long)5185932559860861424L, (long)l);
    }

    public int O(Object[] objectArray) {
        int n;
        block4: {
            int n2;
            block5: {
                long l = (Long)objectArray[0];
                be be2 = (be)objectArray[1];
                be be3 = (be)objectArray[2];
                l = a ^ l;
                n2 = be2.t(0) - be3.t(0);
                CallSite callSite = m44.a("n", (long)7761827484396830544L, (long)l);
                try {
                    try {
                        n = n2;
                        if (callSite != false) break block4;
                        if (n != 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)7953754087428385206L, (long)l);
                    }
                    return be2.t(1) - be3.t(1);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)7953754087428385206L, (long)l);
                }
            }
            n = n2;
        }
        return n;
    }

    oa() {
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
