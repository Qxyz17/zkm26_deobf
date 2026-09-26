/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sd;
import java.lang.invoke.MethodHandles;

public class sz
extends sd {
    protected Object i;
    private static final long a = prr.a((long)270247079039543360L, (long)7962884933461762142L, MethodHandles.lookup().lookupClass()).a(182333850006565L);

    public sz H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x2DB456C10A58L;
        this.Z(l2, null);
        return this;
    }

    public sz(int n, short s, char c) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
        long l2 = l ^ 0x1ACC6046C2A2L;
        this.Z(l2, null);
    }

    public boolean a(long l) {
        boolean bl;
        l = a ^ l;
        try {
            bl = this.i == null;
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)((Object)n92), (long)6450148414104116388L, (long)l);
        }
        return bl;
    }

    public sz(Object object, long l) {
        long l2 = (l = a ^ l) ^ 0x33265544F585L;
        this.Z(l2, object);
    }

    public void Z(long l, Object object) {
        long l2 = l ^ 0x659C73DBFB35L;
        this.i = object;
        this.I();
        this.T(l2, object, null, null);
    }

    public Object t() {
        return this.i;
    }

    private static n9 d(n9 n92) {
        return n92;
    }
}
