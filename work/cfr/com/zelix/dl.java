/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.IdentityHashMap;
import java.util.Set;

public class dl {
    private final IdentityHashMap c;
    private static final long a = prr.a(-3072565119473119526L, -2570079599089290796L, MethodHandles.lookup().lookupClass()).a(67655858172347L);

    public Set X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)this.c, (long)-3902777503259491075L, (long)l10);
    }

    public boolean E(Object object) {
        return this.c.containsKey(object);
    }

    public void V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        m44.a("v", (Object)this.c, (long)-2247047719854091672L, (long)l10);
    }

    public dl() {
        this.c = new IdentityHashMap();
    }

    public Object i(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return m44.a("u", (Object)this.c, (Object)object, (long)8976452699413555845L, (long)l10);
    }

    public int D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("v", (Object)this.c, (long)-5082402992264174568L, (long)l10);
    }

    public dl(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x5344C872C2FCL;
        int n11 = (int)(l11 >>> 32);
        int n12 = (int)(l11 << 32 >>> 48);
        int n13 = (int)(l11 << 48 >>> 48);
        this.c = new IdentityHashMap(cf.x(n10, n11, (char)n12, (short)n13));
    }

    public Object c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        l10 = a ^ l10;
        return m44.a("s", (Object)this.c, (Object)object, (long)-4510404529976169587L, (long)l10);
    }

    public Object b(Object[] objectArray) {
        Object object = objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        Object object2 = objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l10 = ((long)n10 << 48 | (long)n11 << 32 >>> 16 | (long)n12 << 48 >>> 48) ^ a;
        return m44.a("q", (Object)this.c, (Object)object, (Object)object2, (long)2135716290064484500L, (long)l10);
    }

    public boolean j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("v", (Object)this.c, (long)9051233733102240275L, (long)l10);
    }
}

