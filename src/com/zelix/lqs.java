/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rv;
import java.awt.event.ActionEvent;
import java.lang.invoke.MethodHandles;
import javax.swing.AbstractAction;

public class lqs
extends AbstractAction {
    final rv i;
    private static final long a = prr.a((long)-5153078257111649350L, (long)3719982930515602675L, MethodHandles.lookup().lookupClass()).a(201441298958311L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        long l;
        long l2 = l = a ^ 0x44AAF6F60DD8L;
        long l3 = l2 ^ 0x5509CB303F4CL;
        long l4 = l2 ^ 0x23344564B8E7L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)-1390850548523052480L, (long)l), (Object)objectArray, (long)-908796080968140690L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        m44.a("p", (Object)m44.a("q", (Object)m44.a("q", (Object)this, (long)-1390850548523052480L, (long)l), (long)-733514215231837769L, (long)l), (Object)objectArray2, (long)-972850729630340813L, (long)l);
    }

    lqs(rv rv2) {
        this.i = rv2;
    }
}
