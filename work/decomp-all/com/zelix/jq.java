/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jj;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.rt;
import com.zelix.zn;

public class jq
extends jj
implements rt {
    private String Z;

    protected void O(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        int n = (Integer)objectArray[2];
        long l = (Long)objectArray[3];
    }

    protected void k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
    }

    public jq(int n) {
        super(n);
    }

    public void I(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("r", (Object)((Object)this), (String)string, (long)5315510258549148754L, (long)l);
    }
}
