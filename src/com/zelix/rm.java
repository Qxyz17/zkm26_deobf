/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l6a;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.wd;
import java.lang.invoke.MethodHandles;

public class rm
extends Thread {
    Runnable s;
    final wd Y;
    String z;
    private static final long a = prr.a((long)6168583523512302508L, (long)-6164986549277363499L, MethodHandles.lookup().lookupClass()).a(79216445028922L);

    rm(int n, byte by, wd wd2, int n2) {
        long l = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ a;
        this.Y = wd2;
        m44.a("r", (Object)this, (Runnable)new l6a(this), (long)5603721115316992835L, (long)l);
    }

    @Override
    public void run() {
        long l = a ^ 0x61E11D6B960AL;
        long l2 = l ^ 0x582ECED6E56FL;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = null;
        objectArray[0] = m44.a("q", (Object)m44.a("p", (Object)m44.a("p", (Object)this, (long)-6305091028085622599L, (long)l), (long)-5211068537344024849L, (long)l), (long)-5332195234640497840L, (long)l);
        m44.a("r", (Object)this, (String)((Object)m44.a("n", (Object)objectArray, (long)-5772059449522820484L, (long)l)), (long)-5701196568078197379L, (long)l);
        m44.a("n", (Object)m44.a("p", (Object)this, (long)-5288257642953523173L, (long)l), (long)-5546089252387637931L, (long)l);
    }
}
