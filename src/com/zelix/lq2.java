/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ti;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lq2
extends MouseAdapter {
    final ti v;
    private static final long a = prr.a((long)-5745523668978217777L, (long)-3978374131773323750L, MethodHandles.lookup().lookupClass()).a(239843525904655L);

    lq2(ti ti2) {
        this.v = ti2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block9: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            long l3;
            block8: {
                long l4 = l3 = a ^ 0x15F5E1923B97L;
                l2 = l4 ^ 0x1C0BEC7FC2FEL;
                l = l4 ^ 0x4CDF2CAA03C3L;
                CallSite callSite3 = m44.a("m", (long)9214443059986106640L, (long)l3);
                try {
                    try {
                        callSite2 = m44.a("r", (Object)mouseEvent, (long)7383322141169633293L, (long)l3);
                        if (callSite3 != null) break block8;
                        if (callSite2 != 2) break block9;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)7138496726559320072L, (long)l3);
                    }
                    callSite2 = m44.a("r", (Object)m44.a("s", (Object)m44.a("s", (Object)this, (long)7189451362279435751L, (long)l3), (long)8827588711811290239L, (long)l3), (Object)m44.a("r", (Object)mouseEvent, (long)8826604901710143892L, (long)l3), (long)8774380779053931875L, (long)l3);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)7138496726559320072L, (long)l3);
                }
            }
            if ((callSite = callSite2) > -1) {
                gj gj2 = (gj)m44.a("r", (Object)m44.a("s", (Object)m44.a("s", (Object)this, (long)7189451362279435751L, (long)l3), (long)6952719142371593585L, (long)l3), (int)callSite, (long)8920952279479457664L, (long)l3);
                try {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    if (m44.a("r", (Object)gj2, (Object)objectArray, (long)7186348473820852980L, (long)l3) == false) {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        m44.a("r", (Object)m44.a("s", (Object)this, (long)7189451362279435751L, (long)l3), (Object)objectArray2, (long)7440791059661033544L, (long)l3);
                    }
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)((Object)n94), (long)7138496726559320072L, (long)l3);
                }
            }
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
