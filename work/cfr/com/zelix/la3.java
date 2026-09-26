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

public class la3
extends l7t {
    private static final long a = prr.a(5664315229347721685L, 1375059964881123430L, MethodHandles.lookup().lookupClass()).a(135515798875395L);

    public lpm n(Object[] objectArray) {
        block5: {
            lmu lmu2;
            block4: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x3D3278329F21L;
                CallSite callSite = m44.a("o", (long)7235464389988300625L, (long)l10);
                try {
                    try {
                        lmu2 = this;
                        if (callSite != false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        if (m44.a("p", (Object)lmu2, (Object)objectArray2, (long)9213189438097393042L, (long)l10) <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)7049125581956037836L, (long)l10);
                    }
                    lmu2 = this.V(0);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)7049125581956037836L, (long)l10);
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
        var2_2 = (lmu)var1_1[0];
        var3_3 = (lqu)var1_1[1];
        var4_4 = (Long)var1_1[2];
        v0 = var4_4;
        var6_5 = v0 ^ 78419313187334L;
        var8_6 = v0 ^ 0L;
        v1 = new Object[1];
        v1[0] = var6_5;
        var11_7 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var4_4);
        var10_8 = m44.a("h", (long)-5113628074367501874L, (long)var4_4);
        var12_9 = 0;
        while (var12_9 < var11_7) {
            v2 = new Object[3];
            v2[2] = var8_6;
            v2[1] = var3_3;
            v2[0] = this;
            m44.a("w", (Object)this.V(var12_9), (Object)v2, (long)-6656114929610942631L, (long)var4_4);
            ++var12_9;
lbl23:
            // 2 sources

            ** while (var10_8 == false)
lbl24:
            // 1 sources

        }
lbl25:
        // 2 sources

        if (var4_4 <= 0L) ** GOTO lbl23
    }

    public la3(int n10, short s10, int n11, int n12) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)n12 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x16F94019D45CL;
        int n13 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n13, n10, l12);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

