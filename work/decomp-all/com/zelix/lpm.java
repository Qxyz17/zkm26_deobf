/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e4;
import com.zelix.lpw;
import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Enumeration;

public abstract class lpm
extends lpw {
    private static final long g = prr.a((long)4607061708480299692L, (long)8234891998630342983L, MethodHandles.lookup().lookupClass()).a(72233855306784L);

    public lpm(int n, long l) {
        long l2 = (l = g ^ l) ^ 0x4C92C732271EL;
        super(n, l2);
    }

    /*
     * Unable to fully structure code
     */
    public final Enumeration g(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (var2_2 = lpm.g ^ var2_2) ^ 102155737004490L;
        var7_4 = m44.a("s", (Object)this, (long)1745121990176768293L, (long)var2_2).size();
        var8_5 = new ltv[var7_4];
        var9_6 = 0;
        var6_7 = m44.a("m", (long)186210485228503635L, (long)var2_2);
        while (var9_6 < var7_4) {
            var8_5[var9_6] = (ltv)m44.a("s", (Object)this, (long)1745121990176768293L, (long)var2_2).get(var9_6);
            ++var9_6;
lbl12:
            // 2 sources

            ** while (var6_7 == false)
lbl13:
            // 1 sources

        }
lbl14:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl12
        return new e4(var4_3, var8_5);
    }
}
