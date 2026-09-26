/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.wt;
import java.lang.invoke.MethodHandles;
import java.net.URL;

public class lbx
implements Runnable {
    final URL o;
    final wt b;
    private static final long a = prr.a((long)-5447458664527634183L, (long)-125668039113997967L, MethodHandles.lookup().lookupClass()).a(68720448475818L);

    lbx(wt wt2, URL uRL) {
        this.b = wt2;
        this.o = uRL;
    }

    @Override
    public void run() {
        long l = a ^ 0x28EA9AC03C23L;
        long l2 = l ^ 0x54CD9D7D9283L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = m44.a("r", (Object)this, (long)-9180555538968579470L, (long)l);
        objectArray[0] = m44.a("r", (Object)this, (long)-7082681246216317764L, (long)l);
        m44.a("l", (Object)objectArray, (long)-7479324594901439775L, (long)l);
    }
}
