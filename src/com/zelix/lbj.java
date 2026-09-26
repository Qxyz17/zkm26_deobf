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
    private static final long a = prr.a((long)1010571803781029140L, (long)7418767808441304214L, MethodHandles.lookup().lookupClass()).a(95025728417121L);

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    lbj(om om2) {
        this.J = om2;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        long l = a ^ 0x141CF46254F9L;
        long l2 = l ^ 0x59B04C22E87CL;
        m44.a("v", (Object)m44.a("t", (Object)this, (long)-4651565953039886014L, (long)l), (Cursor)((Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)-4651565953039886014L, (long)l), (long)-4686722166419465363L, (long)l)), (long)-5131418597414838919L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-4651565953039886014L, (long)l), (Object)objectArray, (long)-6854153123900603514L, (long)l);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        CallSite callSite;
        long l;
        block4: {
            block5: {
                l = a ^ 0x3F85E870B21FL;
                CallSite callSite2 = m44.a("l", (long)5000663556529252865L, (long)l);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)6454919338143219620L, (long)l);
                        if (callSite2 == null) break block4;
                        if (m44.a("r", (Object)callSite, (long)6786821696794114975L, (long)l) != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)4956720345407077071L, (long)l);
                    }
                    m44.a("p", (Object)m44.a("r", (Object)this, (long)6454919338143219620L, (long)l), (Cursor)new Cursor(0), (long)6786821696794114975L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)4956720345407077071L, (long)l);
                }
            }
            callSite = m44.a("r", (Object)this, (long)6454919338143219620L, (long)l);
        }
        m44.a("s", (Object)callSite, (Object)m44.a("r", (Object)m44.a("r", (Object)this, (long)6454919338143219620L, (long)l), (long)6786821696794114975L, (long)l), (long)4848602257754278474L, (long)l);
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
            long l;
            long l2;
            block4: {
                l2 = a ^ 0x1A1D63CAA8D0L;
                l = l2 ^ 0x4983CC5DEF3AL;
                CallSite callSite2 = m44.a("k", (long)6893542743856967886L, (long)l2);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)4853577926662776171L, (long)l2);
                        if (callSite2 == null) break block4;
                        if (m44.a("u", (Object)callSite, (long)6886929870269380451L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)6775361611080835072L, (long)l2);
                    }
                    m44.a("w", (Object)m44.a("u", (Object)this, (long)4853577926662776171L, (long)l2), (boolean)false, (long)6886929870269380451L, (long)l2);
                    callSite = m44.a("u", (Object)this, (long)4853577926662776171L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)6775361611080835072L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = m44.a("t", (Object)mouseEvent, (long)6663119803133888402L, (long)l2);
            objectArray[0] = l;
            m44.a("t", (Object)m44.a("u", (Object)callSite, (long)4732942989653504619L, (long)l2), (Object)objectArray, (long)4827969635265605673L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
