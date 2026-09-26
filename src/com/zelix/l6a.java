/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rm;
import java.lang.invoke.MethodHandles;

public class l6a
implements Runnable {
    final rm Z;
    private static final long a = prr.a((long)8621033846085969255L, (long)-55738522827996614L, MethodHandles.lookup().lookupClass()).a(106750986981317L);

    l6a(rm rm2) {
        this.Z = rm2;
    }

    @Override
    public void run() {
        long l = a ^ 0x6D710DDEED48L;
        long l2 = l ^ 0x59CFF72565AEL;
        Object[] objectArray = new Object[2];
        objectArray[1] = m44.a("s", (Object)m44.a("s", (Object)this, (long)-2281442865249988024L, (long)l), (long)-1886387777964242866L, (long)l);
        objectArray[0] = l2;
        m44.a("r", (Object)m44.a("s", (Object)m44.a("s", (Object)this, (long)-2281442865249988024L, (long)l), (long)-194601739729736310L, (long)l), (Object)objectArray, (long)-490485836353611602L, (long)l);
    }
}
