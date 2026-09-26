/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.j6;
import com.zelix.ja;
import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.zn;
import java.lang.invoke.CallSite;

public abstract class lt
extends l7 {
    @Override
    public final void F(zn zn2, lkc lkc2, long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0x196556782D45L;
        long l13 = l11 ^ 0x2BEAF1B40FB1L;
        ja ja2 = (ja)zn2;
        int n10 = this.y(l13);
        CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
        for (int i10 = 0; i10 < n10; ++i10) {
            String string = ((j6)this.g(i10)).A();
            Object[] objectArray = new Object[2];
            objectArray[1] = string;
            objectArray[0] = l12;
            m44.a("w", (Object)ja2, (Object)objectArray, (long)-3603658252686610395L, (long)l10);
            if (callSite == null) continue;
        }
    }

    public lt(int n10) {
        super(n10);
    }
}

