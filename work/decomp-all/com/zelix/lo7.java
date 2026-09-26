/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.g7;
import com.zelix.m44;
import com.zelix.ov;
import com.zelix.prr;
import java.awt.Component;
import java.lang.invoke.MethodHandles;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class lo7
extends DefaultListCellRenderer {
    final ov e;
    private static final long a = prr.a((long)4713235521819757400L, (long)-4071089088021385561L, MethodHandles.lookup().lookupClass()).a(278594993322441L);

    lo7(ov ov2) {
        this.e = ov2;
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
        long l = a ^ 0x3C716ACC5D3CL;
        long l2 = l ^ 0x73BB8B53162EL;
        super.getListCellRendererComponent((JList<?>)jList, object, n, bl, bl2);
        Object[] objectArray = new Object[7];
        objectArray[6] = bl2;
        objectArray[5] = bl;
        objectArray[4] = n;
        objectArray[3] = object;
        objectArray[2] = jList;
        objectArray[1] = this;
        objectArray[0] = l2;
        m44.a("r", (Object)((g7)object), (Object)objectArray, (long)528114588675312224L, (long)l);
        return this;
    }
}
