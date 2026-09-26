/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ww;
import java.awt.event.ActionEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class lo_
extends AbstractAction {
    final ww E;
    private static final long a = prr.a(2303928099018769361L, -2566525613354374043L, MethodHandles.lookup().lookupClass()).a(8231549867091L);

    lo_(ww ww2) {
        this.E = ww2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = a ^ 0x1732B8912FEL;
                l10 = l11 ^ 0x2558F25F583BL;
                CallSite callSite2 = m44.a("n", (long)3217783245349618627L, (long)l11);
                try {
                    try {
                        callSite = m44.a("p", (Object)this, (long)3314946503262394270L, (long)l11);
                        if (callSite2 == null) break block4;
                        if (m44.a("q", (Object)callSite, (long)2885052904434346603L, (long)l11) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)3340660664627757873L, (long)l11);
                    }
                    callSite = m44.a("p", (Object)this, (long)3314946503262394270L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)3340660664627757873L, (long)l11);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            m44.a("q", (Object)callSite, (Object)objectArray, (long)3613117277019805455L, (long)l11);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

