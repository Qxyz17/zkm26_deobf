/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lks;
import com.zelix.m44;
import com.zelix.o6;
import com.zelix.prr;
import com.zelix.vu;
import com.zelix.wn;
import com.zelix.xr;
import com.zelix.xv;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class vo
extends vu {
    private int s;
    private static final long a = prr.a((long)2436424489613422612L, (long)190737186979255649L, MethodHandles.lookup().lookupClass()).a(262080927769553L);

    vo(wn wn2, byte by, lks lks2, long l) {
        long l2;
        long l3 = l2 = ((long)by << 56 | l << 8 >>> 8) ^ a;
        long l4 = l3 ^ 0x4C78FDCF9CCAL;
        long l5 = l3 ^ 0x6097E0F52D8FL;
        long l6 = l3 ^ 0x3A918A4DB73L;
        CallSite callSite = m44.a("j", (long)-6777711278245868916L, (long)l2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        m44.a("v", (Object)((Object)this), (xv[])new xv[m44.a("u", (Object)wn2, (Object)objectArray, (long)-5140811528487223094L, (long)l2)], (long)-5132178179890658530L, (long)l2);
        CallSite callSite2 = callSite;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        CallSite callSite3 = m44.a("u", (Object)wn2, (Object)objectArray2, (long)-6608869838056813712L, (long)l2);
        while (callSite3.hasMoreElements()) {
            o6 o62 = (o6)callSite3.nextElement();
            xr xr2 = new xr(l6, o62, lks2);
            CallSite callSite4 = m44.a("t", (Object)((Object)this), (long)-5132178179890658530L, (long)l2);
            vo vo2 = this;
            CallSite callSite5 = m44.a("t", (Object)((Object)vo2), (long)-6813204027722278635L, (long)l2);
            m44.a("v", (Object)((Object)vo2), (int)(callSite5 + true), (long)-6813204027722278635L, (long)l2);
            callSite4[callSite5] = xr2;
            if (callSite2 != false) continue;
        }
    }
}
