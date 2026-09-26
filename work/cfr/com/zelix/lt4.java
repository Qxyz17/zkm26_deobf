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
    private static final long a = prr.a(6810580387591438671L, -1365292769451559731L, MethodHandles.lookup().lookupClass()).a(102152546133425L);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x3210E7DB4AF1L;
        long l13 = l11 ^ 0x47526B4E5A06L;
        long l14 = l11 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l14;
        objectArray3[1] = lqu2;
        objectArray3[0] = this;
        m44.a("w", (Object)this.V(0), (Object)objectArray3, (long)-6656114929610942631L, (long)l10);
        ltv ltv2 = (ltv)lmu2;
        try {
            if (m44.a("v", (Object)this, (long)-4684389972815666493L, (long)l10) != null) {
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = m44.a("v", (Object)this, (long)-4684389972815666493L, (long)l10);
                objectArray4[0] = l12;
                m44.a("w", (Object)ltv2, (Object)objectArray4, (long)-4693340913386989991L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)n92, (long)-6916446651521714720L, (long)l10);
        }
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)this, (String)string, (long)-8157470892941798668L, (long)l10);
    }

    public lt4(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x2BD1E7C4F413L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

