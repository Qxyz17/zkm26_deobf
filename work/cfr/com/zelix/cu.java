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
    private static final long a = prr.a(1471787210132175411L, -7400261933462910174L, MethodHandles.lookup().lookupClass()).a(52699337387660L);

    @Override
    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
    }

    public cu(int n10, int n11, int n12, int n13) {
        long l10 = ((long)n11 << 32 | (long)n12 << 48 >>> 32 | (long)n13 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x11F12C3EEA7L;
        int n14 = (int)(l11 >>> 32);
        long l12 = l11 << 32 >>> 32;
        super(n10, n14, l12);
    }
}

