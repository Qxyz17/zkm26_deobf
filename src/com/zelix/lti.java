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
    private static final long a = prr.a((long)1002576478548477955L, (long)-7281852561259621738L, MethodHandles.lookup().lookupClass()).a(144898723854066L);

    public lti(short s, int n, char c, int n2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ a;
        long l2 = l ^ 0x5033888FB42BL;
        int n3 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n3, n2, l3);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x7D08332BED37L;
        long l4 = l2 ^ 0L;
        lmu lmu3 = this.V(0);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)lmu3, (Object)objectArray2, (long)-6656114929610942631L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = (lyt)lmu3;
        objectArray3[0] = l3;
        m44.a("w", (Object)((ltg)lmu2), (Object)objectArray3, (long)-6388602217116760117L, (long)l);
    }
}
