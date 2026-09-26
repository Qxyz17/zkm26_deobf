/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.lth;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lw1
extends lt9 {
    private static final long a = prr.a(-8921951190465160826L, -1264193698053211788L, MethodHandles.lookup().lookupClass()).a(248987629752993L);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x2586F16CA37FL;
        lth lth2 = (lth)((Object)m44.a("v", (Object)this, (long)-4632680904528735155L, (long)l10));
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("w", (Object)this, (Object)new Object[0], (long)-4968184746715213117L, (long)l10);
        objectArray2[0] = l11;
        m44.a("w", (Object)lth2, (Object)objectArray2, (long)-5066796863955391765L, (long)l10);
    }

    public lw1(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x80B521D7921L;
        super(n10, l11);
    }
}

