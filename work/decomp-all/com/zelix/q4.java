/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.q3;
import com.zelix.vd;
import com.zelix.zl;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class q4
extends vd {
    private static final long a = prr.a((long)-5139344520595186831L, (long)66691864374409889L, MethodHandles.lookup().lookupClass()).a(258390526063528L);

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x64D55CBDDDD5L;
        long l5 = l2 ^ 0x4D8052C494B9L;
        long l6 = l2 ^ 0L;
        long l7 = l2 ^ 0x6FA91C253D16L;
        long l8 = l2 ^ 0x5586F9DF3179L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        q3 q32 = (q3)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1797704930665120443L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l8;
        Object object = m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-2296489199898713612L, (long)l);
        CallSite callSite = m44.a("m", (long)-1921333740741510316L, (long)l);
        for (int i = 0; i < object; ++i) {
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l7;
            objectArray4[0] = i;
            zl zl2 = (zl)m44.a("r", (Object)((Object)this), (Object)objectArray4, (long)-1931359190408154321L, (long)l);
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = lqq2;
            objectArray5[1] = l6;
            objectArray5[0] = this;
            m44.a("r", (Object)zl2, (Object)objectArray5, (long)-87131634187452354L, (long)l);
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l5;
            Object[] objectArray7 = new Object[2];
            objectArray7[1] = m44.a("r", (Object)zl2, (Object)objectArray6, (long)-1785247222142810516L, (long)l);
            objectArray7[0] = l4;
            m44.a("r", (Object)q32, (Object)objectArray7, (long)-526743712102184974L, (long)l);
            if (callSite == null) continue;
        }
    }

    public q4(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x2BB7D084A5B1L;
        super(l2, n);
    }
}
