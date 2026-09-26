/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tn;
import java.awt.event.ActionEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class mx
extends AbstractAction {
    final tn G;
    private static final long a = prr.a(7681342239129018301L, 574613446093091681L, MethodHandles.lookup().lookupClass()).a(81594672052218L);

    mx(tn tn2) {
        this.G = tn2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = a ^ 0x3B584CAC7935L;
                l10 = l11 ^ 0x7EC256474559L;
                CallSite callSite2 = m44.a("n", (long)-1077700109873149957L, (long)l11);
                try {
                    try {
                        callSite = m44.a("p", (Object)this, (long)-715031813808477518L, (long)l11);
                        if (callSite2 != null) break block4;
                        if (m44.a("q", (Object)callSite, (long)-1624613607780516703L, (long)l11) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-610768858732614834L, (long)l11);
                    }
                    callSite = m44.a("p", (Object)this, (long)-715031813808477518L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-610768858732614834L, (long)l11);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            m44.a("q", (Object)callSite, (Object)objectArray, (long)-881716196092189999L, (long)l11);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

