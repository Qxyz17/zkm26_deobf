/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.lyp;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class lyw
extends lyp
implements dd {
    private static final long e = prr.a((long)4014824983144665624L, (long)-8391183719247325711L, MethodHandles.lookup().lookupClass()).a(103674248667690L);

    public final boolean i(char c, int n, short s, String string) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        long l2 = l ^ 0L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        dd dd2 = (dd)this.V(0);
        boolean bl = dd2.i((char)n2, n3, (short)n4, string);
        return bl;
    }

    public lyw(char c, int n, long l) {
        long l2 = ((long)c << 48 | l << 16 >>> 16) ^ e;
        long l3 = l2 ^ 0x60C1F94E05C8L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 48);
        int n4 = (int)(l3 << 32 >>> 32);
        super((short)n2, (short)n3, n, n4);
    }
}
