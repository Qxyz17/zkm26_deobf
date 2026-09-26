/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bn;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class uc {
    String a;
    bn i;
    private static final long b = prr.a((long)2955619301759365238L, (long)-8885400415827999763L, MethodHandles.lookup().lookupClass()).a(90675370559880L);

    uc(short s, String string, bn bn2, short s2, int n) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        m44.a("p", (Object)this, (String)string, (long)-7765921057528300488L, (long)l);
        m44.a("p", (Object)this, (bn)bn2, (long)-8524363682938194535L, (long)l);
    }
}
