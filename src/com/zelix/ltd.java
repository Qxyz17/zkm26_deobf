/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7b;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ltd
extends l7t {
    private static final long a = prr.a((long)-6698760786555969763L, (long)1722993945249835266L, MethodHandles.lookup().lookupClass()).a(76480159605326L);

    public ltd(int n, char c, int n2, short s) {
        long l = ((long)c << 48 | (long)n2 << 32 >>> 16 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0xFB1F7F01DC6L;
        int n3 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n3, n, l3);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x2F2EC5E9A69L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        l7b l7b2 = (l7b)lmu2;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int)((char)n3);
        objectArray2[1] = (int)((short)n2);
        objectArray2[0] = n;
        m44.a("w", (Object)l7b2, (Object)objectArray2, (long)-6625897965437412105L, (long)l);
    }
}
