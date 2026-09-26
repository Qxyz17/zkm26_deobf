/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbg;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ne
implements ActionListener {
    final lbg W;
    private static final long a = prr.a(2890891054585175904L, 3186477174314557748L, MethodHandles.lookup().lookupClass()).a(198802560666808L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block11: {
            CallSite callSite;
            CallSite callSite2;
            long l10;
            long l11;
            block9: {
                long l12 = l11 = a ^ 0x815F6AC5E03L;
                long l13 = l12 ^ 0x693B61D53A0BL;
                l10 = l12 ^ 0x55AB610F37DAL;
                CallSite callSite3 = m44.a("w", (Object)actionEvent, (long)-2365119506619503815L, (long)l11);
                CallSite callSite4 = m44.a("h", (long)-4478403649095766339L, (long)l11);
                try {
                    block10: {
                        try {
                            try {
                                callSite2 = callSite3;
                                callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-2436390737668513912L, (long)l11), (long)-4372199088037022507L, (long)l11);
                                if (callSite4 == null) break block9;
                                if (callSite2 != callSite) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)-4249893961031828885L, (long)l11);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l13;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-2436390737668513912L, (long)l11), (Object)objectArray, (long)-2832536228945606966L, (long)l11);
                            if (callSite4 != null) break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)-4249893961031828885L, (long)l11);
                        }
                    }
                    callSite2 = callSite3;
                    callSite = m44.a("v", (Object)m44.a("v", (Object)this, (long)-2436390737668513912L, (long)l11), (long)-2457049249255318161L, (long)l11);
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)n94, (long)-4249893961031828885L, (long)l11);
                }
            }
            try {
                if (callSite2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l10;
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)-2436390737668513912L, (long)l11), (Object)objectArray, (long)-2848186164646582250L, (long)l11);
                }
            }
            catch (n9 n95) {
                throw m44.a("h", (Object)n95, (long)-4249893961031828885L, (long)l11);
            }
        }
    }

    ne(lbg lbg2) {
        this.W = lbg2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

