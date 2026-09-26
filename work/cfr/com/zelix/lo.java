/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.zn;

public class lo
extends l7 {
    public lo(int n10) {
        super(n10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void F(zn var1_1, lkc var2_2, long var3_3) {
        v0 = var3_3;
        var5_4 = v0 ^ 0L;
        var7_5 = v0 ^ 48288077451185L;
        var10_6 = this.y(var7_5);
        var11_7 = 0;
        var9_8 = m44.a("h", (long)-3779571992638565438L, (long)var3_3);
        while (var11_7 < var10_6) {
            this.g(var11_7).F(this, var2_2, var5_4);
            ++var11_7;
lbl11:
            // 2 sources

            ** while (var9_8 != null)
lbl12:
            // 1 sources

        }
lbl13:
        // 2 sources

        if (var3_3 <= 0L) ** GOTO lbl11
    }
}

