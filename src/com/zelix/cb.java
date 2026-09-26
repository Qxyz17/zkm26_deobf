/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cq;
import com.zelix.d;
import com.zelix.iz;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;

public class cb
extends iz
implements d {
    private String l;
    private static final long a = prr.a((long)-4556776719298062640L, (long)-5041732150906367429L, MethodHandles.lookup().lookupClass()).a(69903930539658L);

    public void t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("u", (Object)((Object)this), (String)string, (long)5709898885984039448L, (long)l);
    }

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x2223FC2B722DL;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        cq cq2 = (cq)rq2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = m44.a("r", (Object)((Object)this), (long)-4390769060891541963L, (long)l);
        m44.a("s", (Object)cq2, (Object)objectArray3, (long)-4189590524115729973L, (long)l);
    }

    public cb(int n, int n2, char c, char c2) {
        long l = ((long)n2 << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x56952DC81E53L;
        super(n, l2);
    }
}
