/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.av;
import com.zelix.kd;
import com.zelix.m44;
import com.zelix.prr;
import java.awt.Frame;
import java.lang.invoke.MethodHandles;

public class af
extends av {
    final kd z;
    private static final long a = prr.a((long)-3934245727080688522L, (long)-7528582907704607310L, MethodHandles.lookup().lookupClass()).a(210593166382118L);

    af(kd kd2) {
        this.z = kd2;
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x35C4AC4203E4L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (Frame)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)4507007144033859986L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        m44.a("h", (int)0, (long)6202265067069529093L, (long)l);
    }

    public void U(Object[] objectArray) {
        Frame frame = (Frame)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x99DA113F3E3L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = frame;
        m44.a("v", (Object)m44.a("w", (Object)((Object)this), (long)5662302839888826702L, (long)l), (Object)objectArray2, (long)6018259312339763874L, (long)l);
    }
}
