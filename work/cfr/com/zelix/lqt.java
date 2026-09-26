/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tx;
import java.awt.event.ActionEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class lqt
extends AbstractAction {
    final tx H;
    private static final long a = prr.a(7770824024702586730L, 6788358560808157937L, MethodHandles.lookup().lookupClass()).a(274940394803536L);

    lqt(tx tx2) {
        this.H = tx2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = a ^ 0x640C9FD1C8E5L;
                l10 = l11 ^ 0x15BC0E9D32FBL;
                CallSite callSite2 = m44.a("m", (long)-5900653331985268360L, (long)l11);
                try {
                    try {
                        callSite = m44.a("s", (Object)this, (long)-5846477954572921267L, (long)l11);
                        if (callSite2 == null) break block4;
                        if (m44.a("r", (Object)callSite, (long)-5588121728065904062L, (long)l11) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-6129483801201962811L, (long)l11);
                    }
                    callSite = m44.a("s", (Object)this, (long)-5846477954572921267L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-6129483801201962811L, (long)l11);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            m44.a("r", (Object)callSite, (Object)objectArray, (long)-5593327287724609008L, (long)l11);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

