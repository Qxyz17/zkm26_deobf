/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rh;
import java.awt.event.ActionEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class lbm
extends AbstractAction {
    final rh I;
    private static final long a = prr.a((long)-3125707137712959674L, (long)3936158673194776537L, MethodHandles.lookup().lookupClass()).a(234217833470025L);

    lbm(rh rh2) {
        this.I = rh2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                l2 = a ^ 0x23D92F735FFCL;
                l = l2 ^ 0x6592ECAFEABAL;
                CallSite callSite2 = m44.a("i", (long)2769990175072815380L, (long)l2);
                try {
                    try {
                        callSite = m44.a("w", (Object)this, (long)2463403440457706853L, (long)l2);
                        if (callSite2 == null) break block4;
                        if (m44.a("v", (Object)callSite, (long)2697748951020687777L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)2549203249233717387L, (long)l2);
                    }
                    callSite = m44.a("w", (Object)this, (long)2463403440457706853L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)2549203249233717387L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            m44.a("v", (Object)callSite, (Object)objectArray, (long)4310221165878165354L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
