/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cu;
import com.zelix.eg;
import com.zelix.iz;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class i3
extends iz {
    private static final long a = prr.a((long)5598741825327164434L, (long)1417914056412995684L, MethodHandles.lookup().lookupClass()).a(3938194846520L);

    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x666EA479D1E2L;
        long l4 = l2 ^ 0L;
        long l5 = l2 ^ 0x438151CBC490L;
        long l6 = l2 ^ 0x4C0CA03AEA09L;
        long l7 = l2 ^ 0x2330CFBCD258L;
        long l8 = l2 ^ 0xD114EECFF18L;
        long l9 = l2 ^ 0x125FA2249C8AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l8;
        CallSite callSite = m44.a("s", (Object)((Object)this), (Object)objectArray3, (long)-2335512638144966344L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l7;
        objectArray4[0] = 0;
        cu cu2 = (cu)m44.a("s", (Object)((Object)this), (Object)objectArray4, (long)-4291289277163198093L, (long)l);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l5;
        CallSite callSite2 = m44.a("s", (Object)cu2, (Object)objectArray5, (long)-2825268223272677467L, (long)l);
        CallSite callSite3 = m44.a("l", (long)-4080326000156175076L, (long)l);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l5;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l9;
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = m44.a("s", (Object)cu2, (Object)objectArray7, (long)-4402197106715016903L, (long)l);
        objectArray8[1] = l6;
        objectArray8[0] = m44.a("s", (Object)cu2, (Object)objectArray6, (long)-2825268223272677467L, (long)l);
        m44.a("s", (Object)ue2, (Object)objectArray8, (long)-2828181898927211309L, (long)l);
        CallSite callSite4 = callSite3;
        for (int i = 1; i < callSite; ++i) {
            Object[] objectArray9 = new Object[2];
            objectArray9[1] = l7;
            objectArray9[0] = i;
            eg eg2 = (eg)m44.a("s", (Object)((Object)this), (Object)objectArray9, (long)-4291289277163198093L, (long)l);
            Object[] objectArray10 = new Object[3];
            objectArray10[2] = ue2;
            objectArray10[1] = callSite2;
            objectArray10[0] = l3;
            m44.a("s", (Object)eg2, (Object)objectArray10, (long)-2755378496115729062L, (long)l);
            if (callSite4 != false) continue;
        }
    }

    public i3(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x7DE2C9310102L;
        super(n, l2);
    }
}
