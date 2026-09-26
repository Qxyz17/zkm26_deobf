/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class _s
implements Serializable {
    private int b;
    private int a;
    private static final long c = prr.a(-7869630224243340186L, 7256594313340487240L, MethodHandles.lookup().lookupClass()).a(175040387260291L);

    public _s(int n10, int n11) {
        long l10 = c ^ 0x3389738090AAL;
        m44.a("s", (Object)this, (int)n10, (long)6231839065222121512L, (long)l10);
        m44.a("s", (Object)this, (int)n11, (long)5421981283650351934L, (long)l10);
    }

    public int b() {
        long l10 = c ^ 0x6C2412E2EA7DL;
        return (int)m44.a("v", (Object)this, (long)3219140462184362751L, (long)l10);
    }

    public int a() {
        long l10 = c ^ 0x274FAFB11D43L;
        return (int)m44.a("p", (Object)this, (long)-4118634737982357801L, (long)l10);
    }
}

