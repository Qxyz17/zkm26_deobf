/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public abstract class u6
implements DocumentListener {
    private static final long b = prr.a((long)-1451238476083692746L, (long)-2420601772401789253L, MethodHandles.lookup().lookupClass()).a(106594321970680L);

    public abstract void B(Object[] var1);

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        long l = b ^ 0x145D49AA6C64L;
        long l2 = l ^ 0x4432C2A920AAL;
        Object[] objectArray = new Object[2];
        objectArray[1] = documentEvent;
        objectArray[0] = l2;
        m44.a("t", (Object)this, (Object)objectArray, (long)-5316922267029006379L, (long)l);
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        long l = b ^ 0x66F7F1DA6B83L;
        long l2 = l ^ 0x36987AD9274DL;
        Object[] objectArray = new Object[2];
        objectArray[1] = documentEvent;
        objectArray[0] = l2;
        m44.a("s", (Object)this, (Object)objectArray, (long)-5633706313093541838L, (long)l);
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        long l = b ^ 0x72B93C2C4B89L;
        long l2 = l ^ 0x22D6B72F0747L;
        Object[] objectArray = new Object[2];
        objectArray[1] = documentEvent;
        objectArray[0] = l2;
        m44.a("q", (Object)this, (Object)objectArray, (long)-7936721630668443592L, (long)l);
    }
}
