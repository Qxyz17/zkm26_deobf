/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t2;
import java.awt.event.ActionEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class op
extends AbstractAction {
    final t2 e;
    private static final long a = prr.a((long)7768664475347398799L, (long)6955947351883920386L, MethodHandles.lookup().lookupClass()).a(72465825528022L);

    op(t2 t22) {
        this.e = t22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                l2 = a ^ 0x66B1E2CDB28CL;
                l = l2 ^ 0x378683B6D29CL;
                CallSite callSite2 = m44.a("k", (long)7527220630720945798L, (long)l2);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)7733600701416384107L, (long)l2);
                        if (callSite2 != null) break block4;
                        if (m44.a("t", (Object)callSite, (long)7944118564731760394L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)7751088923057775708L, (long)l2);
                    }
                    callSite = m44.a("u", (Object)this, (long)7733600701416384107L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)7751088923057775708L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            m44.a("t", (Object)callSite, (Object)objectArray, (long)8278251206702976597L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
