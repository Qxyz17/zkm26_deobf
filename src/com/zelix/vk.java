/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lk6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class vk
implements Comparator {
    final lk6 J;
    private static final long a = prr.a((long)3569245152497739000L, (long)-113419870227215298L, MethodHandles.lookup().lookupClass()).a(195839448756469L);

    vk(lk6 lk62) {
        this.J = lk62;
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x373E52C3CD6AL;
        long l2 = l ^ 0x2F56578B57A0L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (String)object2;
        objectArray[1] = l2;
        objectArray[0] = (String)object;
        return (int)m44.a("w", (Object)this, (Object)objectArray, (long)-2250538737530961331L, (long)l);
    }

    public int t(Object[] objectArray) {
        int n;
        block11: {
            int n2;
            long l;
            block9: {
                CallSite callSite;
                String string;
                String string2;
                block10: {
                    string2 = (String)objectArray[0];
                    l = (Long)objectArray[1];
                    string = (String)objectArray[2];
                    l = a ^ l;
                    callSite = m44.a("m", (long)-7943219992679485048L, (long)l);
                    try {
                        try {
                            n = string2.length();
                            n2 = string.length();
                            if (callSite != null) break block9;
                            if (n != n2) break block10;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)((Object)n92), (long)-8286884869958269624L, (long)l);
                        }
                        return 0;
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)((Object)n93), (long)-8286884869958269624L, (long)l);
                    }
                }
                try {
                    n = string2.length();
                    if (callSite != null) break block11;
                    n2 = string.length();
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)((Object)n94), (long)-8286884869958269624L, (long)l);
                }
            }
            try {
                if (n < n2) {
                    return -1;
                }
            }
            catch (n9 n95) {
                throw m44.a("m", (Object)((Object)n95), (long)-8286884869958269624L, (long)l);
            }
            n = 1;
        }
        return n;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
