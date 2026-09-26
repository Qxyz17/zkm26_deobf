/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import javax.swing.JTextField;

public class id
extends JTextField {
    boolean L;
    private static final long a = prr.a(-4994015965936505799L, 8173379163674278037L, MethodHandles.lookup().lookupClass()).a(128260273012129L);

    public boolean D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("u", (Object)this, (long)2225892681072674919L, (long)l10);
    }

    @Override
    public void setText(String string) {
        long l10 = a ^ 0x1EF28C1F3B93L;
        m44.a("w", (Object)this, (boolean)true, (long)-7017788015596140513L, (long)l10);
        super.setText(string);
        m44.a("w", (Object)this, (boolean)false, (long)-7017788015596140513L, (long)l10);
    }
}

