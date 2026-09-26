/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class s
implements Serializable {
    private int a;
    private int b;
    private static final long c = prr.a((long)5389839111835228926L, (long)8424200734290360564L, MethodHandles.lookup().lookupClass()).a(164739917105526L);

    public s(int n, int n2) {
        long l = c ^ 0x6C78D46899E8L;
        m44.a("u", (Object)this, (int)n, (long)773037325243288441L, (long)l);
        m44.a("u", (Object)this, (int)n2, (long)577613229884682947L, (long)l);
    }

    public int a() {
        long l = c ^ 0xD61B4880438L;
        return (int)m44.a("w", (Object)this, (long)-7536210737046350167L, (long)l);
    }

    public int b() {
        long l = c ^ 0x70DD1D91CFC7L;
        return (int)m44.a("p", (Object)this, (long)6785522253530326252L, (long)l);
    }
}
