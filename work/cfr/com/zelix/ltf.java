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

public class ltf
extends l7t {
    private static final long a = prr.a(-3768929869207050264L, -280081330301649336L, MethodHandles.lookup().lookupClass()).a(143105992858243L);

    public lpm j(Object[] objectArray) {
        block5: {
            lmu lmu2;
            block4: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x459B9E287703L;
                CallSite callSite = m44.a("m", (long)-7778353629022776117L, (long)l10);
                try {
                    try {
                        lmu2 = this;
                        if (callSite == false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        if (m44.a("r", (Object)lmu2, (Object)objectArray2, (long)-7495772830849045072L, (long)l10) <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-7839100378143311609L, (long)l10);
                    }
                    lmu2 = this.V(0);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-7839100378143311609L, (long)l10);
                }
            }
            return (lpm)lmu2;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void M(Object[] var1_1) {
        var5_2 = (lmu)var1_1[0];
        var2_3 = (lqu)var1_1[1];
        var3_4 = (Long)var1_1[2];
        v0 = var3_4;
        var6_5 = v0 ^ 78419313187334L;
        var8_6 = v0 ^ 0L;
        v1 = new Object[1];
        v1[0] = var6_5;
        var11_7 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var3_4);
        var10_8 = m44.a("h", (long)-6823249310977527178L, (long)var3_4);
        var12_9 = 0;
        while (var12_9 < var11_7) {
            v2 = new Object[3];
            v2[2] = var8_6;
            v2[1] = var2_3;
            v2[0] = this;
            m44.a("w", (Object)this.V(var12_9), (Object)v2, (long)-6656114929610942631L, (long)var3_4);
            ++var12_9;
lbl23:
            // 2 sources

            ** while (var10_8 != false)
lbl24:
            // 1 sources

        }
lbl25:
        // 2 sources

        if (var3_4 < 0L) ** GOTO lbl23
    }

    public ltf(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x3356D471CDCDL;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

