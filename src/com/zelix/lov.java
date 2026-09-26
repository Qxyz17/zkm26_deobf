/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ti;
import java.awt.event.ActionEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class lov
extends AbstractAction {
    final ti u;
    private static final long a = prr.a((long)2071424065547771739L, (long)5537513277185809844L, MethodHandles.lookup().lookupClass()).a(23171168578407L);

    lov(ti ti2) {
        this.u = ti2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            lov lov2;
            long l;
            long l2;
            block4: {
                l2 = a ^ 0x434B0D0207A8L;
                l = l2 ^ 0x2ED060CC0F6EL;
                CallSite callSite = m44.a("l", (long)-5289078180214095767L, (long)l2);
                try {
                    try {
                        lov2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("s", (Object)lov2, (long)-5545592328937644862L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)-5444790032152874374L, (long)l2);
                    }
                    lov2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)-5444790032152874374L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            m44.a("s", (Object)m44.a("r", (Object)lov2, (long)-5497446162963390527L, (long)l2), (Object)objectArray, (long)-5685274012735148076L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
