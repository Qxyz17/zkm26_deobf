/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.q9;
import com.zelix.v0;
import com.zelix.vd;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class zg
extends vd {
    private v0 j;
    private static final long a = prr.a((long)-5195007078987892002L, (long)1163265111125770837L, MethodHandles.lookup().lookupClass()).a(187297850640187L);

    v0 m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)((Object)this), (long)-3314888706323295247L, (long)l);
    }

    public zg(long l, int n, short s) {
        long l2 = (l << 16 | (long)s << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x2BC3B805BA48L;
        super(l3, n);
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0x6FA91C253D16L;
        long l5 = l2 ^ 0x5586F9DF3179L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        Object object = m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-2296489199898713612L, (long)l);
        CallSite callSite = m44.a("m", (long)-1921333740741510316L, (long)l);
        for (int i = 0; i < object; ++i) {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l4;
            objectArray3[0] = i;
            q9 q92 = (q9)m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-1931359190408154321L, (long)l);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = lqq2;
            objectArray4[1] = l3;
            objectArray4[0] = this;
            m44.a("r", (Object)q92, (Object)objectArray4, (long)-44022515452626930L, (long)l);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l4;
            objectArray5[0] = 0;
            m44.a("q", (Object)((Object)this), (v0)((v0)m44.a("r", (Object)q92, (Object)objectArray5, (long)-1931359190408154321L, (long)l)), (long)-1731849606351788551L, (long)l);
            if (callSite == null) continue;
        }
    }
}
