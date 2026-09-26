/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e2;
import com.zelix.m44;
import com.zelix.u6;
import javax.swing.event.DocumentEvent;

public class ub
extends u6 {
    final e2 U;

    public void B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        DocumentEvent documentEvent = (DocumentEvent)objectArray[1];
        long l2 = l ^ 0x7C0A5335956L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)((Object)this), (long)-7936059443061773485L, (long)l), (long)-7528020796614594584L, (long)l), (long)-8524716127246394078L, (long)l);
        objectArray2[0] = l2;
        m44.a("v", (Object)m44.a("w", (Object)((Object)this), (long)-7936059443061773485L, (long)l), (Object)objectArray2, (long)-8393211412705159053L, (long)l);
    }

    ub(e2 e22) {
        this.U = e22;
    }
}
