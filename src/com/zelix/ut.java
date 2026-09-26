/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class ut
implements Comparator {
    private static final long a = prr.a((long)8862158994207549383L, (long)-432222291951566342L, MethodHandles.lookup().lookupClass()).a(159292311644918L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x29DDDD6060DEL;
        long l2 = l ^ 0x29FA4D3B9AC9L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (ltv)object2;
        objectArray[1] = (ltv)object;
        objectArray[0] = l2;
        return (int)m44.a("u", (Object)this, (Object)objectArray, (long)757736555262437565L, (long)l);
    }

    public int w(Object[] objectArray) {
        CallSite callSite;
        block11: {
            CallSite callSite2;
            long l;
            ltv ltv2;
            ltv ltv3;
            long l2;
            block9: {
                CallSite callSite3;
                long l3;
                block10: {
                    l2 = (Long)objectArray[0];
                    ltv3 = (ltv)objectArray[1];
                    ltv2 = (ltv)objectArray[2];
                    long l4 = l2 = a ^ l2;
                    l3 = l4 ^ 0x72114EEE3207L;
                    l = l4 ^ 0xF5FAD64ADA6L;
                    callSite3 = m44.a("h", (long)-682035822173129138L, (long)l2);
                    try {
                        try {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l3;
                            callSite = m44.a("w", (Object)ltv3, (Object)objectArray2, (long)-1655488281121389847L, (long)l2);
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l3;
                            callSite2 = m44.a("w", (Object)ltv2, (Object)objectArray3, (long)-1655488281121389847L, (long)l2);
                            if (callSite3 == false) break block9;
                            if (callSite >= callSite2) break block10;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)((Object)n92), (long)-806906353439095980L, (long)l2);
                        }
                        return -1;
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)((Object)n93), (long)-806906353439095980L, (long)l2);
                    }
                }
                try {
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l3;
                    callSite = m44.a("w", (Object)ltv3, (Object)objectArray4, (long)-1655488281121389847L, (long)l2);
                    callSite2 = callSite3;
                    if (l2 < 0L) break block9;
                    if (callSite2 == false) break block11;
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l3;
                    callSite2 = m44.a("w", (Object)ltv2, (Object)objectArray5, (long)-1655488281121389847L, (long)l2);
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)((Object)n94), (long)-806906353439095980L, (long)l2);
                }
            }
            try {
                if (callSite > callSite2) {
                    return 1;
                }
            }
            catch (n9 n95) {
                throw m44.a("h", (Object)((Object)n95), (long)-806906353439095980L, (long)l2);
            }
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l;
            objectArray6[0] = ltv2;
            callSite = m44.a("w", (Object)ltv3, (Object)objectArray6, (long)-744544835930337450L, (long)l2);
        }
        return (int)callSite;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
