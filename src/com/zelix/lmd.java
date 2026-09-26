/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import com.zelix.sp;
import java.lang.invoke.MethodHandles;

public class lmd
extends lmc {
    final mu Z;
    private static final long a = prr.a((long)8391273565358002068L, (long)2273580708794637722L, MethodHandles.lookup().lookupClass()).a(110790954240572L);

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6121465332494307676L, (long)l), (Object)objectArray2, (long)5340913355038057039L, (long)l);
    }

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x1757DE7AD8B0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (Integer)object2;
        objectArray2[1] = (sp)object;
        objectArray2[0] = l2;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)6155267574803369327L, (long)l);
    }

    public void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        sp sp2 = (sp)objectArray[1];
        Integer n = (Integer)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x44CCA3CC2E21L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = n;
        objectArray2[2] = sp2;
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("w", (Object)((Object)this), (long)-7923367465536137307L, (long)l);
        m44.a("i", (Object)objectArray2, (long)-8036655313112112722L, (long)l);
    }

    lmd(mu mu2) {
        this.Z = mu2;
    }
}
