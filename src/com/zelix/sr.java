/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.m44;
import com.zelix.o9;
import com.zelix.prr;
import com.zelix.sv;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class sr
extends sv {
    int Z;
    Map L;
    o9 E;
    private static final long d = prr.a((long)1814974302805320162L, (long)4079667048444680744L, MethodHandles.lookup().lookupClass()).a(216582592141181L);

    sr(String string, long l, _4 _42, byte by, o9 o92) {
        long l2 = (l << 8 | (long)by << 56 >>> 56) ^ d;
        long l3 = l2 ^ 0x41DB00873683L;
        super(string, _42, l3);
        m44.a("s", (Object)((Object)this), (o9)o92, (long)-7517712211246253415L, (long)l2);
    }

    public final void i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = d ^ l;
        m44.a("u", (Object)((Object)this), (int)0, (long)-2235625406917581079L, (long)l);
    }
}
