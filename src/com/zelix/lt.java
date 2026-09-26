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
    public final void F(zn zn2, lkc lkc2, long l) {
        long l2 = l;
        long l3 = l2 ^ 0x196556782D45L;
        long l4 = l2 ^ 0x2BEAF1B40FB1L;
        ja ja2 = (ja)zn2;
        int n = this.y(l4);
        CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
        for (int i = 0; i < n; ++i) {
            String string = ((j6)this.g(i)).A();
            Object[] objectArray = new Object[2];
            objectArray[1] = string;
            objectArray[0] = l3;
            m44.a("w", (Object)ja2, (Object)objectArray, (long)-3603658252686610395L, (long)l);
            if (callSite == null) continue;
        }
    }

    public lt(int n) {
        super(n);
    }
}
