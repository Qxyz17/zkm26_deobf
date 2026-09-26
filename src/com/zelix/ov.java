/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lo7;
import com.zelix.m44;
import com.zelix.o4;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import javax.swing.ListModel;

public class ov
extends o4 {
    private static final long a = prr.a((long)-6799123644979074640L, (long)553960357932830935L, MethodHandles.lookup().lookupClass()).a(184014279936224L);

    public ov(ListModel listModel, long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x37F742908686L;
        long l4 = l2 ^ 0xCFD7503E64AL;
        super(listModel, l3);
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        m44.a("k", (Object)((Object)this), (Object)objectArray, (long)-5237812898139545053L, (long)l);
    }

    private void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("u", (Object)((Object)this), (Object)new lo7(this), (long)-7497267577948907788L, (long)l);
    }
}
