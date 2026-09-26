/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ac;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class y3
implements Runnable {
    final ac H;
    private static final long a = prr.a((long)-5286974943161253857L, (long)1434412034071481252L, MethodHandles.lookup().lookupClass()).a(172406739581721L);

    y3(ac ac2) {
        this.H = ac2;
    }

    @Override
    public void run() {
        long l = a ^ 0x596DE22A0FBCL;
        long l2 = l ^ 0x39BC8A93E088L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = m44.a("p", (Object)m44.a("p", (Object)this, (long)3584726071771470964L, (long)l), (long)3784847506892814716L, (long)l);
        m44.a("q", (Object)m44.a("p", (Object)m44.a("p", (Object)this, (long)3584726071771470964L, (long)l), (long)3884076603104704637L, (long)l), (Object)objectArray, (long)3881250242230151929L, (long)l);
    }
}
