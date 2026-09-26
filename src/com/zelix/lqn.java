/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.wa;
import java.lang.invoke.MethodHandles;

public class lqn
implements Runnable {
    final wa d;
    private static final long a = prr.a((long)-1675366433601953237L, (long)-8553132486347718839L, MethodHandles.lookup().lookupClass()).a(61673197896442L);

    lqn(wa wa2) {
        this.d = wa2;
    }

    @Override
    public void run() {
        long l = a ^ 0x1E4B68323514L;
        long l2 = l ^ 0x116718E3AB29L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)6092641384144829926L, (long)l), (Object)objectArray, (long)5284464890239175646L, (long)l);
    }
}
