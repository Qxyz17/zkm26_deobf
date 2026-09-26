/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lkv;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class l6p {
    private final ArrayList x;
    private final lkv Q;
    private static final long a = prr.a(3420850444359542771L, -3167950628671965785L, MethodHandles.lookup().lookupClass()).a(197642456011848L);

    l6p(int n10, String string, boolean bl2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x18B0C499ECEBL;
        this.x = new ArrayList(n10);
        this.Q = new lkv(bl2, l11, string, 5);
    }

    lkv V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("u", (Object)this, (long)-7192084664230005506L, (long)l10);
    }

    ArrayList A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("p", (Object)this, (long)-3690584815075696301L, (long)l10);
    }
}

