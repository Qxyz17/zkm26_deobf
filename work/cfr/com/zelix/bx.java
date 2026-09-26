/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.Reader;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class bx
implements Serializable {
    private final String a;
    private transient Reader b;
    private static final long c = prr.a(63550478134614852L, -794690771777685618L, MethodHandles.lookup().lookupClass()).a(157378914328026L);

    public Reader b() {
        long l10 = c ^ 0x16F498FC8D27L;
        return m44.a("w", (Object)this, (long)2303838380533553943L, (long)l10);
    }

    public bx(String string) {
        this.a = string;
    }

    public void a(Reader reader) {
        long l10 = c ^ 0x582DC17AB18DL;
        m44.a("w", (Object)this, (Reader)reader, (long)2545288141852059581L, (long)l10);
    }

    public String a() {
        long l10 = c ^ 0xC51E177356CL;
        return m44.a("t", (Object)this, (long)-4979116460278815114L, (long)l10);
    }
}

