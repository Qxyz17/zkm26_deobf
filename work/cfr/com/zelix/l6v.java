/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r9;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodHandles;

public class l6v
implements ActionListener {
    final r9 s;
    private static final long a = prr.a(6402892395002375073L, 4532192268748715320L, MethodHandles.lookup().lookupClass()).a(38431148743667L);

    l6v(r9 r92) {
        this.s = r92;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        long l10 = a ^ 0x7A30C686020BL;
        long l11 = l10 ^ 0x73366018AAC9L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)7274655543067287816L, (long)l10), (Object)objectArray, (long)8744206703816073037L, (long)l10);
    }
}

