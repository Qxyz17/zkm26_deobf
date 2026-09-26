/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.h1;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.x8;
import java.lang.invoke.MethodHandles;

public abstract class kx
extends kw {
    byte[] T;
    boolean N;
    private static final long h = prr.a((long)-6269134319516989366L, (long)68858681514917006L, MethodHandles.lookup().lookupClass()).a(49836730146585L);

    kx(_4 _42, int n, long l, String string, h1 h12, l6q l6q2) {
        long l2 = (l = h ^ l) ^ 0x196EE0D477ACL;
        super(_42, n, string, l2, h12, l6q2);
        m44.a("t", (Object)((Object)this), (boolean)true, (long)660039814211224574L, (long)l);
    }

    public final boolean R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = h ^ l;
        return (boolean)m44.a("v", (Object)((Object)this), (long)-4823203541283342394L, (long)l);
    }

    kx(long l, _4 _42, x8 x82, int n) {
        l = h ^ l;
        super(_42, x82, n);
        m44.a("w", (Object)((Object)this), (boolean)true, (long)390558855578701757L, (long)l);
    }
}
