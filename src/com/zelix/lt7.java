/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lpm;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lt7
extends l7t {
    private static final long a = prr.a((long)222122676573501975L, (long)495909513794265050L, MethodHandles.lookup().lookupClass()).a(12792104480926L);

    public lpm r(Object[] objectArray) {
        block5: {
            lt7 lt72;
            block4: {
                long l = (Long)objectArray[0];
                long l2 = (l = a ^ l) ^ 0x149BCB595565L;
                CallSite callSite = m44.a("k", (long)-5895879115040981739L, (long)l);
                try {
                    try {
                        lt72 = this;
                        if (callSite != false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        if (m44.a("t", (Object)((Object)lt72), (Object)objectArray2, (long)-5359288696417366058L, (long)l) <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)-6125610857812735237L, (long)l);
                    }
                    lt72 = this.V(0);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)-6125610857812735237L, (long)l);
                }
            }
            return (lpm)lt72;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void M(Object[] var1_1) {
        var4_2 = (lmu)var1_1[0];
        var5_3 = (lqu)var1_1[1];
        var2_4 = (Long)var1_1[2];
        v0 = var2_4;
        var6_5 = v0 ^ 78419313187334L;
        var8_6 = v0 ^ 0L;
        v1 = new Object[1];
        v1[0] = var6_5;
        var11_7 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var2_4);
        var12_8 = 0;
        var10_9 = m44.a("h", (long)-6823249310977527178L, (long)var2_4);
        while (var12_8 < var11_7) {
            v2 = new Object[3];
            v2[2] = var8_6;
            v2[1] = var5_3;
            v2[0] = this;
            m44.a("w", (Object)this.V(var12_8), (Object)v2, (long)-6656114929610942631L, (long)var2_4);
            ++var12_8;
lbl23:
            // 2 sources

            ** while (var10_9 != false)
lbl24:
            // 1 sources

        }
lbl25:
        // 2 sources

        if (var2_4 <= 0L) ** GOTO lbl23
    }

    public lt7(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x7490C19B94EAL;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
