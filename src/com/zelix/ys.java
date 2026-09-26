/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s1;
import com.zelix.wa;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ys
implements ListSelectionListener {
    s1 w;
    wa E;
    private static final long a = prr.a((long)2498378773179246582L, (long)636479363897172653L, MethodHandles.lookup().lookupClass()).a(164387945761749L);

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        long l3;
        long l4;
        block3: {
            block4: {
                long l5 = l4 = a ^ 0x3B0E4CF0C159L;
                l3 = l5 ^ 0x32D5124E4AD5L;
                l2 = l5 ^ 0x403D8425CC48L;
                l = l5 ^ 0x14D66D50A417L;
                CallSite callSite3 = m44.a("i", (long)-3065795316258135164L, (long)l4);
                try {
                    callSite2 = m44.a("v", (Object)listSelectionEvent, (long)-3000050100954546393L, (long)l4);
                    if (callSite3 != null) break block3;
                    if (callSite2 == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)((Object)n92), (long)-3696947059939385009L, (long)l4);
                }
                return;
            }
            callSite2 = m44.a("v", (Object)((JList)((Object)m44.a("v", (Object)listSelectionEvent, (long)-3341675499637773533L, (long)l4))), (long)-3556700482720465202L, (long)l4);
        }
        if ((callSite = callSite2) > -1) {
            Object[] objectArray = new Object[2];
            objectArray[1] = (int)callSite;
            objectArray[0] = l3;
            CallSite callSite4 = m44.a("v", (Object)m44.a("w", (Object)this, (long)-3600468099285701325L, (long)l4), (Object)objectArray, (long)-3402573482883845167L, (long)l4);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l2;
            objectArray3[1] = m44.a("v", (Object)m44.a("w", (Object)this, (long)-3600468099285701325L, (long)l4), (Object)objectArray2, (long)-2940810162571277355L, (long)l4);
            objectArray3[0] = callSite4;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)-3992598028816849171L, (long)l4), (Object)objectArray3, (long)-3061946238163679985L, (long)l4);
        }
    }

    ys(long l, s1 s12, wa wa2) {
        l = a ^ l;
        m44.a("p", (Object)this, (wa)wa2, (long)2648801173478279864L, (long)l);
        m44.a("p", (Object)this, (s1)s12, (long)2476292375946641766L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
