/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lkv;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class lq9 {
    private final ArrayList i;
    private final lkv J;
    private static final long a = prr.a((long)7313866633817000656L, (long)7774858459710782675L, MethodHandles.lookup().lookupClass()).a(82510227021230L);

    ArrayList D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)this, (long)3434473128998834049L, (long)l);
    }

    lkv n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("p", (Object)this, (long)1112073775406963467L, (long)l);
    }

    lq9(int n, long l, String string, boolean bl) {
        long l2 = (l = a ^ l) ^ 0x5CBC0D8F6C1BL;
        this.i = new ArrayList(n);
        this.J = new lkv(bl, l2, string, 5);
    }
}
