/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.awt.Window;
import java.lang.invoke.MethodHandles;

public class mv
implements Runnable {
    final Window s;
    final boolean U;
    private static final long a = prr.a((long)2196656010795301109L, (long)4451084945376011014L, MethodHandles.lookup().lookupClass()).a(228362874557238L);

    @Override
    public void run() {
        long l = a ^ 0x7AF1110569F4L;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-246601889578497685L, (long)l), (boolean)m44.a("s", (Object)this, (long)-2116581906686298143L, (long)l), (long)-496736863840248332L, (long)l);
    }

    mv(Window window, boolean bl) {
        this.s = window;
        this.U = bl;
    }
}
