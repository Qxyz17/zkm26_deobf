/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.awt.Window;
import java.lang.invoke.MethodHandles;

public class ec
implements Runnable {
    final Window F;
    private static final long a = prr.a(7855488884350620900L, -5858980670729377876L, MethodHandles.lookup().lookupClass()).a(223410690827828L);

    @Override
    public void run() {
        long l10 = a ^ 0x20840B791824L;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)-5513468723099351808L, (long)l10), (long)-6332541070361983128L, (long)l10);
    }

    ec(Window window) {
        this.F = window;
    }
}

