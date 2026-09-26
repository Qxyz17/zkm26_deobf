/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.wa;
import java.lang.invoke.MethodHandles;

public class nu
implements Runnable {
    final wa F;
    private static final long a = prr.a((long)2545838820856810154L, (long)1156334995897755675L, MethodHandles.lookup().lookupClass()).a(235419026313665L);

    nu(wa wa2) {
        this.F = wa2;
    }

    @Override
    public void run() {
        long l = a ^ 0x298CE6EE33F5L;
        long l2 = l ^ 0x2DDFBC54F799L;
        Object[] objectArray = new Object[2];
        objectArray[1] = m44.a("s", (Object)this, (long)-3242590214736140341L, (long)l);
        objectArray[0] = l2;
        m44.a("m", (Object)objectArray, (long)-2950176315894773124L, (long)l);
    }
}
