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

public class lty
extends l7t {
    private static final long a = prr.a((long)8234291218150547219L, (long)23074987150404100L, MethodHandles.lookup().lookupClass()).a(169254484489246L);

    public lpm x(Object[] objectArray) {
        block5: {
            lty lty2;
            block4: {
                long l = (Long)objectArray[0];
                long l2 = (l = a ^ l) ^ 0x21C53A621B6CL;
                CallSite callSite = m44.a("j", (long)-2295546700012637412L, (long)l);
                try {
                    try {
                        lty2 = this;
                        if (callSite != false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        if (m44.a("u", (Object)((Object)lty2), (Object)objectArray2, (long)-317840165357911585L, (long)l) <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-533493179508292202L, (long)l);
                    }
                    lty2 = this.V(0);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-533493179508292202L, (long)l);
                }
            }
            return (lpm)lty2;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void M(Object[] var1_1) {
        var2_2 = (lmu)var1_1[0];
        var5_3 = (lqu)var1_1[1];
        var3_4 = (Long)var1_1[2];
        v0 = var3_4;
        var6_5 = v0 ^ 78419313187334L;
        var8_6 = v0 ^ 0L;
        v1 = new Object[1];
        v1[0] = var6_5;
        var11_7 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var3_4);
        var10_8 = m44.a("h", (long)-5113628074367501874L, (long)var3_4);
        var12_9 = 0;
        while (var12_9 < var11_7) {
            v2 = new Object[3];
            v2[2] = var8_6;
            v2[1] = var5_3;
            v2[0] = this;
            m44.a("w", (Object)this.V(var12_9), (Object)v2, (long)-6656114929610942631L, (long)var3_4);
            ++var12_9;
lbl23:
            // 2 sources

            ** while (var10_8 == false)
lbl24:
            // 1 sources

        }
lbl25:
        // 2 sources

        if (var3_4 < 0L) ** GOTO lbl23
    }

    public lty(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x25312BD80DCAL;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
