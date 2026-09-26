/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cm;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class cu
extends cm {
    private static final long a = prr.a((long)1471787210132175411L, (long)-7400261933462910174L, MethodHandles.lookup().lookupClass()).a(52699337387660L);

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
    }

    public cu(int n, int n2, int n3, int n4) {
        long l = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x11F12C3EEA7L;
        int n5 = (int)(l2 >>> 32);
        long l3 = l2 << 32 >>> 32;
        super(n, n5, l3);
    }
}
