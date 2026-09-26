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

public class ltj
extends l7t {
    private static final long a = prr.a((long)8638179314810950755L, (long)-3022700537580518960L, MethodHandles.lookup().lookupClass()).a(275784964594349L);

    public lpm b(Object[] objectArray) {
        block5: {
            ltj ltj2;
            block4: {
                long l = (Long)objectArray[0];
                long l2 = (l = a ^ l) ^ 0xA68903EC664L;
                CallSite callSite = m44.a("j", (long)4408109095059582484L, (long)l);
                try {
                    try {
                        ltj2 = this;
                        if (callSite != false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        if (m44.a("u", (Object)((Object)ltj2), (Object)objectArray2, (long)2782914095423249623L, (long)l) <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)2337787253686861723L, (long)l);
                    }
                    ltj2 = this.V(0);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)2337787253686861723L, (long)l);
                }
            }
            return (lpm)ltj2;
        }
        return null;
    }

    public ltj(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x3283DFC2E632L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    /*
     * Unable to fully structure code
     */
    public void M(Object[] var1_1) {
        var3_2 = (lmu)var1_1[0];
        var2_3 = (lqu)var1_1[1];
        var4_4 = (Long)var1_1[2];
        v0 = var4_4;
        var6_5 = v0 ^ 78419313187334L;
        var8_6 = v0 ^ 0L;
        v1 = new Object[1];
        v1[0] = var6_5;
        var11_7 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var4_4);
        var12_8 = 0;
        var10_9 = m44.a("h", (long)-5113628074367501874L, (long)var4_4);
        while (var12_8 < var11_7) {
            v2 = new Object[3];
            v2[2] = var8_6;
            v2[1] = var2_3;
            v2[0] = this;
            m44.a("w", (Object)this.V(var12_8), (Object)v2, (long)-6656114929610942631L, (long)var4_4);
            ++var12_8;
lbl23:
            // 2 sources

            ** while (var10_9 == false)
lbl24:
            // 1 sources

        }
lbl25:
        // 2 sources

        if (var4_4 <= 0L) ** GOTO lbl23
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
