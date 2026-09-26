/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fq;
import com.zelix.l7;
import com.zelix.l_;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.zn;

public class l4
extends l7
implements fq {
    private String b;

    public void F(zn zn2, lkc lkc2, long l) {
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l5 = l2 ^ 0x63B6F626EEAAL;
        this.g(0).F((zn)this, lkc2, l3);
        Object[] objectArray = new Object[2];
        objectArray[1] = m44.a("v", (Object)((Object)this), (long)-2971066581402112081L, (long)l);
        objectArray[0] = l5;
        m44.a("w", (Object)((l_)zn2), (Object)objectArray, (long)-3848187609342570090L, (long)l);
    }

    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("t", (Object)((Object)this), (String)string, (long)881853720605422935L, (long)l);
    }

    public l4(int n) {
        super(n);
    }
}
