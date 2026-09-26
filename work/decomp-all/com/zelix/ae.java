/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.xt;
import java.lang.invoke.MethodHandles;

public class ae {
    private final String b;
    private final int v;
    private xt t;
    private static final long a = prr.a((long)2157436648989977542L, (long)7541824683692469084L, MethodHandles.lookup().lookupClass()).a(209720825784224L);

    ae(long l, int n, String string, xt xt2) {
        l = a ^ l;
        this(n, string);
        m44.a("u", (Object)this, (xt)xt2, (long)6418685985239705100L, (long)l);
    }

    xt S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-283797791929007344L, (long)l);
    }

    ae(int n, String string) {
        this.v = n;
        this.b = string;
    }

    String s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)8221922298668505391L, (long)l);
    }

    void l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("v", (Object)this, null, (long)-101113297878711929L, (long)l);
    }

    int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("p", (Object)this, (long)-5654614221880008571L, (long)l);
    }
}
