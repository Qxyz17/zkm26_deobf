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
    private static final long a = prr.a((long)-3072565119473119526L, (long)-2570079599089290796L, MethodHandles.lookup().lookupClass()).a(67655858172347L);

    public Set X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this.c, (long)-3902777503259491075L, (long)l);
    }

    public boolean E(Object object) {
        return this.c.containsKey(object);
    }

    public void V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("v", (Object)this.c, (long)-2247047719854091672L, (long)l);
    }

    public dl() {
        this.c = new IdentityHashMap();
    }

    public Object i(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return m44.a("u", (Object)this.c, (Object)object, (long)8976452699413555845L, (long)l);
    }

    public int D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("v", (Object)this.c, (long)-5082402992264174568L, (long)l);
    }

    public dl(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x5344C872C2FCL;
        int n2 = (int)(l2 >>> 32);
        int n3 = (int)(l2 << 32 >>> 48);
        int n4 = (int)(l2 << 48 >>> 48);
        this.c = new IdentityHashMap(cf.x((int)n, (int)n2, (char)((char)n3), (short)((short)n4)));
    }

    public Object c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        l = a ^ l;
        return m44.a("s", (Object)this.c, (Object)object, (long)-4510404529976169587L, (long)l);
    }

    public Object b(Object[] objectArray) {
        Object object = objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        Object object2 = objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l = ((long)n << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ a;
        return m44.a("q", (Object)this.c, (Object)object, (Object)object2, (long)2135716290064484500L, (long)l);
    }

    public boolean j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("v", (Object)this.c, (long)9051233733102240275L, (long)l);
    }
}
