/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import javax.swing.JEditorPane;

public class l65
implements Runnable {
    final JEditorPane P;
    final String u;
    private static final long a = prr.a(-6893403094748070472L, -2904324482242622223L, MethodHandles.lookup().lookupClass()).a(182702074461358L);

    @Override
    public void run() {
        long l10 = a ^ 0x9D227137E0DL;
        long l11 = l10 ^ 0x2E0BED283CD5L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l11;
        objectArray[1] = m44.a("w", (Object)this, (long)5455780283321201543L, (long)l10);
        objectArray[0] = m44.a("w", (Object)this, (long)5546871421200030104L, (long)l10);
        m44.a("i", (Object)objectArray, (long)6059688393367818882L, (long)l10);
    }

    l65(JEditorPane jEditorPane, String string) {
        this.P = jEditorPane;
        this.u = string;
    }
}

