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

public class lr
extends l7
implements fq {
    private String s;

    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("t", (Object)((Object)this), (String)string, (long)627952078726853425L, (long)l);
    }

    public void F(zn zn2, lkc lkc2, long l) {
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0x322078C95170L;
        int n = (int)(l4 >>> 32);
        int n2 = (int)(l4 << 32 >>> 48);
        int n3 = (int)(l4 << 48 >>> 48);
        this.g(0).F((zn)this, lkc2, l3);
        Object[] objectArray = new Object[4];
        objectArray[3] = (int)((char)n3);
        objectArray[2] = n2;
        objectArray[1] = m44.a("v", (Object)((Object)this), (long)-3292499731387799095L, (long)l);
        objectArray[0] = n;
        m44.a("w", (Object)((l_)zn2), (Object)objectArray, (long)-3291297270823624882L, (long)l);
    }

    public lr(int n) {
        super(n);
    }
}
