/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.wy;
import java.awt.event.ActionEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class c1
extends AbstractAction {
    final wy h;
    private static final long a = prr.a((long)2496752656253746506L, (long)-3224052421950762072L, MethodHandles.lookup().lookupClass()).a(56870884461737L);

    c1(wy wy2) {
        this.h = wy2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                l2 = a ^ 0x12C82685AB0DL;
                l = l2 ^ 0x5B98C6B3E625L;
                CallSite callSite2 = m44.a("j", (long)3645432513730593895L, (long)l2);
                try {
                    try {
                        callSite = m44.a("t", (Object)this, (long)3385989898936055445L, (long)l2);
                        if (callSite2 != null) break block4;
                        if (m44.a("u", (Object)callSite, (long)3268587887209747660L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)3404100316942221148L, (long)l2);
                    }
                    callSite = m44.a("t", (Object)this, (long)3385989898936055445L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)3404100316942221148L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            m44.a("u", (Object)callSite, (Object)objectArray, (long)3322406403758220383L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
