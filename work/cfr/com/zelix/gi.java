/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o4;
import com.zelix.prr;
import com.zelix.wa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class gi
implements ActionListener,
ListSelectionListener {
    wa H;
    private static final long a = prr.a(767170209413640303L, 3734761674593683693L, MethodHandles.lookup().lookupClass()).a(133280209807404L);

    gi(long l10, wa wa2) {
        l10 = a ^ l10;
        m44.a("w", (Object)this, (wa)wa2, (long)-8443708916318567401L, (long)l10);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        Object object;
        long l10;
        long l11;
        block7: {
            block8: {
                l11 = a ^ 0x761F6E95037AL;
                l10 = l11 ^ 0x16A415BFDD9DL;
                CallSite callSite = m44.a("m", (long)-3783011929535431312L, (long)l11);
                try {
                    try {
                        object = listSelectionEvent;
                        if (callSite != null) break block7;
                        if (m44.a("r", (Object)object, (long)-3987445428740972077L, (long)l11) == false) break block8;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-3304587141583076084L, (long)l11);
                    }
                    return;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-3304587141583076084L, (long)l11);
                }
            }
            object = m44.a("r", (Object)listSelectionEvent, (long)-3500446996342245929L, (long)l11);
        }
        o4 o42 = (o4)object;
        CallSite callSite = m44.a("r", (Object)o42, (long)-3985486696730047391L, (long)l11);
        try {
            if (callSite > -1) {
                Object[] objectArray = new Object[3];
                objectArray[2] = listSelectionEvent;
                objectArray[1] = (int)m44.a("r", (Object)o42, (long)-3985486696730047391L, (long)l11);
                objectArray[0] = l10;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-3479155556344479375L, (long)l11), (Object)objectArray, (long)-2901201094714055603L, (long)l11);
            }
        }
        catch (n9 n94) {
            throw m44.a("m", (Object)n94, (long)-3304587141583076084L, (long)l11);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

