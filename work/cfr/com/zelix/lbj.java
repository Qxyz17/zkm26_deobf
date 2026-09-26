/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.om;
import com.zelix.prr;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lbj
extends MouseAdapter {
    final om J;
    private static final long a = prr.a(1010571803781029140L, 7418767808441304214L, MethodHandles.lookup().lookupClass()).a(95025728417121L);

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    lbj(om om2) {
        this.J = om2;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        long l10 = a ^ 0x141CF46254F9L;
        long l11 = l10 ^ 0x59B04C22E87CL;
        m44.a("v", (Object)m44.a("t", (Object)this, (long)-4651565953039886014L, (long)l10), (Cursor)((Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)-4651565953039886014L, (long)l10), (long)-4686722166419465363L, (long)l10)), (long)-5131418597414838919L, (long)l10);
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-4651565953039886014L, (long)l10), (Object)objectArray, (long)-6854153123900603514L, (long)l10);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        CallSite callSite;
        long l10;
        block4: {
            block5: {
                l10 = a ^ 0x3F85E870B21FL;
                CallSite callSite2 = m44.a("l", (long)5000663556529252865L, (long)l10);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)6454919338143219620L, (long)l10);
                        if (callSite2 == null) break block4;
                        if (m44.a("r", (Object)callSite, (long)6786821696794114975L, (long)l10) != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)4956720345407077071L, (long)l10);
                    }
                    m44.a("p", (Object)m44.a("r", (Object)this, (long)6454919338143219620L, (long)l10), (Cursor)new Cursor(0), (long)6786821696794114975L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)4956720345407077071L, (long)l10);
                }
            }
            callSite = m44.a("r", (Object)this, (long)6454919338143219620L, (long)l10);
        }
        m44.a("s", (Object)callSite, (Object)m44.a("r", (Object)m44.a("r", (Object)this, (long)6454919338143219620L, (long)l10), (long)6786821696794114975L, (long)l10), (long)4848602257754278474L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = a ^ 0x1A1D63CAA8D0L;
                l10 = l11 ^ 0x4983CC5DEF3AL;
                CallSite callSite2 = m44.a("k", (long)6893542743856967886L, (long)l11);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)4853577926662776171L, (long)l11);
                        if (callSite2 == null) break block4;
                        if (m44.a("u", (Object)callSite, (long)6886929870269380451L, (long)l11) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)6775361611080835072L, (long)l11);
                    }
                    m44.a("w", (Object)m44.a("u", (Object)this, (long)4853577926662776171L, (long)l11), (boolean)false, (long)6886929870269380451L, (long)l11);
                    callSite = m44.a("u", (Object)this, (long)4853577926662776171L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)6775361611080835072L, (long)l11);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = m44.a("t", (Object)mouseEvent, (long)6663119803133888402L, (long)l11);
            objectArray[0] = l10;
            m44.a("t", (Object)m44.a("u", (Object)callSite, (long)4732942989653504619L, (long)l11), (Object)objectArray, (long)4827969635265605673L, (long)l11);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

