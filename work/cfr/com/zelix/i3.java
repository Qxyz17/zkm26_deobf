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
    private static final long a = prr.a(5598741825327164434L, 1417914056412995684L, MethodHandles.lookup().lookupClass()).a(3938194846520L);

    @Override
    public void o(Object[] objectArray) {
        rq rq2 = (rq)objectArray[0];
        ue ue2 = (ue)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x666EA479D1E2L;
        long l13 = l11 ^ 0L;
        long l14 = l11 ^ 0x438151CBC490L;
        long l15 = l11 ^ 0x4C0CA03AEA09L;
        long l16 = l11 ^ 0x2330CFBCD258L;
        long l17 = l11 ^ 0xD114EECFF18L;
        long l18 = l11 ^ 0x125FA2249C8AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l13;
        objectArray2[1] = ue2;
        objectArray2[0] = rq2;
        super.o(objectArray2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l17;
        CallSite callSite = m44.a("s", (Object)this, (Object)objectArray3, (long)-2335512638144966344L, (long)l10);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l16;
        objectArray4[0] = 0;
        cu cu2 = (cu)((Object)m44.a("s", (Object)this, (Object)objectArray4, (long)-4291289277163198093L, (long)l10));
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l14;
        CallSite callSite2 = m44.a("s", (Object)cu2, (Object)objectArray5, (long)-2825268223272677467L, (long)l10);
        CallSite callSite3 = m44.a("l", (long)-4080326000156175076L, (long)l10);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l14;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l18;
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = m44.a("s", (Object)cu2, (Object)objectArray7, (long)-4402197106715016903L, (long)l10);
        objectArray8[1] = l15;
        objectArray8[0] = m44.a("s", (Object)cu2, (Object)objectArray6, (long)-2825268223272677467L, (long)l10);
        m44.a("s", (Object)ue2, (Object)objectArray8, (long)-2828181898927211309L, (long)l10);
        CallSite callSite4 = callSite3;
        for (int i10 = 1; i10 < callSite; ++i10) {
            Object[] objectArray9 = new Object[2];
            objectArray9[1] = l16;
            objectArray9[0] = i10;
            eg eg2 = (eg)((Object)m44.a("s", (Object)this, (Object)objectArray9, (long)-4291289277163198093L, (long)l10));
            Object[] objectArray10 = new Object[3];
            objectArray10[2] = ue2;
            objectArray10[1] = callSite2;
            objectArray10[0] = l12;
            m44.a("s", (Object)eg2, (Object)objectArray10, (long)-2755378496115729062L, (long)l10);
            if (callSite4 != false) continue;
        }
    }

    public i3(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x7DE2C9310102L;
        super(n10, l11);
    }
}

