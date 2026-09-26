/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s9;
import com.zelix.wa;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class lkw
implements ListSelectionListener {
    s9 C;
    wa L;
    private static final long a = prr.a((long)217534878103418302L, (long)2232933648663913843L, MethodHandles.lookup().lookupClass()).a(236703701728519L);

    lkw(int n, s9 s92, wa wa2, char c, int n2) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ a;
        m44.a("q", (Object)this, (wa)wa2, (long)-2139520876969281922L, (long)l);
        m44.a("q", (Object)this, (s9)s92, (long)-523650369569013655L, (long)l);
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        long l3;
        block3: {
            block4: {
                long l4 = l3 = a ^ 0x3D7C44FB31FCL;
                l2 = l4 ^ 0x6E4D8DDD696FL;
                l = l4 ^ 0x7C7CA5952E7CL;
                CallSite callSite3 = m44.a("h", (long)123010993770821445L, (long)l3);
                try {
                    callSite2 = m44.a("w", (Object)listSelectionEvent, (long)188219811824102374L, (long)l3);
                    if (callSite3 != null) break block3;
                    if (callSite2 == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)1943007033237723609L, (long)l3);
                }
                return;
            }
            callSite2 = m44.a("w", (Object)((JList)((Object)m44.a("w", (Object)listSelectionEvent, (long)386998858849927138L, (long)l3))), (long)1901945653679991311L, (long)l3);
        }
        if ((callSite = callSite2) > -1) {
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = (int)callSite;
            CallSite callSite4 = m44.a("w", (Object)m44.a("v", (Object)this, (long)458955015267663500L, (long)l3), (Object)objectArray, (long)1872974652975703223L, (long)l3);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = callSite4;
            objectArray2[0] = l2;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)2066012026295634075L, (long)l3), (Object)objectArray2, (long)1757152613673673709L, (long)l3);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
