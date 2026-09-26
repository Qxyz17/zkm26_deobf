/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o4;
import com.zelix.prr;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ch
implements MouseListener {
    final o4 j;
    private static final long a = prr.a(-436347647555395706L, -4657495359223802321L, MethodHandles.lookup().lookupClass()).a(94525952351125L);

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        block5: {
            CallSite callSite;
            long l10;
            block4: {
                l10 = a ^ 0x744BF6EA42B6L;
                long l11 = l10 ^ 0x5BE56E36D729L;
                CallSite callSite2 = m44.a("h", (long)-4608936287101030547L, (long)l10);
                try {
                    try {
                        callSite = m44.a("v", (Object)this, (long)-4413052138474817499L, (long)l10);
                        if (callSite2 == null) break block4;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = callSite;
                        objectArray[0] = l11;
                        if (m44.a("h", (Object)objectArray, (long)-2642835308869666994L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-2484286313155370606L, (long)l10);
                    }
                    callSite = m44.a("v", (Object)this, (long)-4413052138474817499L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-2484286313155370606L, (long)l10);
                }
            }
            m44.a("w", (Object)callSite, (long)-4513600231927056942L, (long)l10);
        }
    }

    ch(o4 o42) {
        this.j = o42;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        block5: {
            CallSite callSite;
            long l10;
            block4: {
                l10 = a ^ 0x2390D7F9DC9DL;
                long l11 = l10 ^ 0xC3E4F254902L;
                CallSite callSite2 = m44.a("k", (long)6783145645302411590L, (long)l10);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)6695418527328609806L, (long)l10);
                        if (callSite2 == null) break block4;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = callSite;
                        objectArray[0] = l11;
                        if (m44.a("k", (Object)objectArray, (long)5006195819207272805L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)4876656335901556665L, (long)l10);
                    }
                    callSite = m44.a("u", (Object)this, (long)6695418527328609806L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)4876656335901556665L, (long)l10);
                }
            }
            m44.a("t", (Object)callSite, (long)6879019027693202425L, (long)l10);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

