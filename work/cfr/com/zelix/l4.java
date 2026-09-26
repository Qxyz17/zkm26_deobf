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

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0L;
        long l13 = l11 ^ 0x63B6F626EEAAL;
        this.g(0).F(this, lkc2, l12);
        Object[] objectArray = new Object[2];
        objectArray[1] = m44.a("v", (Object)this, (long)-2971066581402112081L, (long)l10);
        objectArray[0] = l13;
        m44.a("w", (Object)((l_)zn2), (Object)objectArray, (long)-3848187609342570090L, (long)l10);
    }

    @Override
    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("t", (Object)this, (String)string, (long)881853720605422935L, (long)l10);
    }

    public l4(int n10) {
        super(n10);
    }
}

