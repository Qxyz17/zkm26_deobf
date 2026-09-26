/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ez;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class na
extends ez {
    private static final long b = prr.a((long)6811963044370406800L, (long)-8129632706172490338L, MethodHandles.lookup().lookupClass()).a(208063558645954L);

    /*
     * Unable to fully structure code
     */
    public na(short var1_1, short var2_2, int var3_3, boolean var4_4) {
        block9: {
            block8: {
                var5_5 = ((long)var1_1 << 48 | (long)var2_2 << 48 >>> 16 | (long)var3_3 << 32 >>> 32) ^ na.b;
                var7_6 = var5_5 ^ 113786866116125L;
                v0 = m44.a("n", (long)6813938846097863147L, (long)var5_5);
                super(var7_6);
                var9_7 = v0;
                try {
                    try {
                        if (var9_7 == null) break block8;
                        if (var4_4) {
                        }
                        ** GOTO lbl22
                    }
                    catch (n9 v1) {
                        throw m44.a("n", (Object)v1, (long)4757815931604759050L, (long)var5_5);
                    }
                    m44.a("q", (Object)this, (Object)m44.a("n", (long)6598670043205501786L, (long)var5_5), (long)6510890016594587123L, (long)var5_5);
                }
                catch (n9 v2) {
                    throw m44.a("n", (Object)v2, (long)4757815931604759050L, (long)var5_5);
                }
            }
            try {
                if (var1_1 < 0 || var9_7 != null) break block9;
lbl22:
                // 2 sources

                m44.a("q", (Object)this, (Object)m44.a("n", (long)6636145562625368790L, (long)var5_5), (long)6510890016594587123L, (long)var5_5);
            }
            catch (n9 v3) {
                throw m44.a("n", (Object)v3, (long)4757815931604759050L, (long)var5_5);
            }
        }
    }

    public void removeAll() {
        long l = b ^ 0x2AEDDCDCB226L;
        super.removeAll();
        m44.a("v", (Object)((Object)this), (long)2736014202911237992L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
