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
    private static final long a = prr.a(217534878103418302L, 2232933648663913843L, MethodHandles.lookup().lookupClass()).a(236703701728519L);

    lkw(int n10, s9 s92, wa wa2, char c10, int n11) {
        long l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)n11 << 48 >>> 48) ^ a;
        m44.a("q", (Object)this, (wa)wa2, (long)-2139520876969281922L, (long)l10);
        m44.a("q", (Object)this, (s9)s92, (long)-523650369569013655L, (long)l10);
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        CallSite callSite;
        CallSite callSite2;
        long l10;
        long l11;
        long l12;
        block3: {
            block4: {
                long l13 = l12 = a ^ 0x3D7C44FB31FCL;
                l11 = l13 ^ 0x6E4D8DDD696FL;
                l10 = l13 ^ 0x7C7CA5952E7CL;
                CallSite callSite3 = m44.a("h", (long)123010993770821445L, (long)l12);
                try {
                    callSite2 = m44.a("w", (Object)listSelectionEvent, (long)188219811824102374L, (long)l12);
                    if (callSite3 != null) break block3;
                    if (callSite2 == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)1943007033237723609L, (long)l12);
                }
                return;
            }
            callSite2 = m44.a("w", (Object)((JList)((Object)m44.a("w", (Object)listSelectionEvent, (long)386998858849927138L, (long)l12))), (long)1901945653679991311L, (long)l12);
        }
        if ((callSite = callSite2) > -1) {
            Object[] objectArray = new Object[2];
            objectArray[1] = l10;
            objectArray[0] = (int)callSite;
            CallSite callSite4 = m44.a("w", (Object)m44.a("v", (Object)this, (long)458955015267663500L, (long)l12), (Object)objectArray, (long)1872974652975703223L, (long)l12);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = callSite4;
            objectArray2[0] = l11;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)2066012026295634075L, (long)l12), (Object)objectArray2, (long)1757152613673673709L, (long)l12);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

