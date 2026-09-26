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
    private static final long a = prr.a(-6698760786555969763L, 1722993945249835266L, MethodHandles.lookup().lookupClass()).a(76480159605326L);

    public ltd(int n10, char c10, int n11, short s10) {
        long l10 = ((long)c10 << 48 | (long)n11 << 32 >>> 16 | (long)s10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0xFB1F7F01DC6L;
        int n12 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n12, n10, l12);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x2F2EC5E9A69L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        l7b l7b2 = (l7b)lmu2;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int)((char)n12);
        objectArray2[1] = (int)((short)n11);
        objectArray2[0] = n10;
        m44.a("w", (Object)l7b2, (Object)objectArray2, (long)-6625897965437412105L, (long)l10);
    }
}

