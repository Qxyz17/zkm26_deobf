/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltg;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lti
extends l7t {
    private static final long a = prr.a(1002576478548477955L, -7281852561259621738L, MethodHandles.lookup().lookupClass()).a(144898723854066L);

    public lti(short s10, int n10, char c10, int n11) {
        long l10 = ((long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)c10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x5033888FB42BL;
        int n12 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n12, n11, l12);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x7D08332BED37L;
        long l13 = l11 ^ 0L;
        lmu lmu3 = this.V(0);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l13;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)lmu3, (Object)objectArray2, (long)-6656114929610942631L, (long)l10);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = (lyt)lmu3;
        objectArray3[0] = l12;
        m44.a("w", (Object)((ltg)lmu2), (Object)objectArray3, (long)-6388602217116760117L, (long)l10);
    }
}

