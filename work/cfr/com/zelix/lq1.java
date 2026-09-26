/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lb8;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.event.ActionEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class lq1
extends AbstractAction {
    final lb8 m;
    private static final long a = prr.a(-7572937613726556995L, -2977488573880313086L, MethodHandles.lookup().lookupClass()).a(12494750268596L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = a ^ 0x295856BCB876L;
                l10 = l11 ^ 0x174C14DF37C4L;
                CallSite callSite2 = m44.a("o", (long)-3740523247681182862L, (long)l11);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)-3618662654992663692L, (long)l11);
                        if (callSite2 == null) break block4;
                        if (m44.a("p", (Object)callSite, (long)-3989856811399058328L, (long)l11) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-3658637059084292100L, (long)l11);
                    }
                    callSite = m44.a("q", (Object)this, (long)-3618662654992663692L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-3658637059084292100L, (long)l11);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            m44.a("p", (Object)callSite, (Object)objectArray, (long)-4004419596884496162L, (long)l11);
        }
    }

    lq1(lb8 lb82) {
        this.m = lb82;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

