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
    private static final long e = prr.a(4014824983144665624L, -8391183719247325711L, MethodHandles.lookup().lookupClass()).a(103674248667690L);

    @Override
    public final boolean i(char c10, int n10, short s10, String string) {
        long l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n11 = (int)(l11 >>> 48);
        int n12 = (int)(l11 << 16 >>> 32);
        int n13 = (int)(l11 << 48 >>> 48);
        dd dd2 = (dd)((Object)this.V(0));
        boolean bl2 = dd2.i((char)n11, n12, (short)n13, string);
        return bl2;
    }

    public lyw(char c10, int n10, long l10) {
        long l11 = ((long)c10 << 48 | l10 << 16 >>> 16) ^ e;
        long l12 = l11 ^ 0x60C1F94E05C8L;
        int n11 = (int)(l12 >>> 48);
        int n12 = (int)(l12 << 16 >>> 48);
        int n13 = (int)(l12 << 32 >>> 32);
        super((short)n11, (short)n12, n10, n13);
    }
}

