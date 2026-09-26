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
    private static final long a = prr.a(7313866633817000656L, 7774858459710782675L, MethodHandles.lookup().lookupClass()).a(82510227021230L);

    ArrayList D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("w", (Object)this, (long)3434473128998834049L, (long)l10);
    }

    lkv n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("p", (Object)this, (long)1112073775406963467L, (long)l10);
    }

    lq9(int n10, long l10, String string, boolean bl2) {
        long l11 = (l10 = a ^ l10) ^ 0x5CBC0D8F6C1BL;
        this.i = new ArrayList(n10);
        this.J = new lkv(bl2, l11, string, 5);
    }
}

