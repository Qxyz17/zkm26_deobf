/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lt4
extends l7t
implements r5 {
    private String b;
    private static final long a = prr.a((long)6810580387591438671L, (long)-1365292769451559731L, MethodHandles.lookup().lookupClass()).a(102152546133425L);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x3210E7DB4AF1L;
        long l4 = l2 ^ 0x47526B4E5A06L;
        long l5 = l2 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l5;
        objectArray3[1] = lqu2;
        objectArray3[0] = this;
        m44.a("w", (Object)this.V(0), (Object)objectArray3, (long)-6656114929610942631L, (long)l);
        ltv ltv2 = (ltv)lmu2;
        try {
            if (m44.a("v", (Object)((Object)this), (long)-4684389972815666493L, (long)l) != null) {
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = m44.a("v", (Object)((Object)this), (long)-4684389972815666493L, (long)l);
                objectArray4[0] = l3;
                m44.a("w", (Object)ltv2, (Object)objectArray4, (long)-4693340913386989991L, (long)l);
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)((Object)n92), (long)-6916446651521714720L, (long)l);
        }
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)((Object)this), (String)string, (long)-8157470892941798668L, (long)l);
    }

    public lt4(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x2BD1E7C4F413L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
