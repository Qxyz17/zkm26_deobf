/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbc;
import com.zelix.m44;
import com.zelix.prr;
import java.awt.Frame;
import java.lang.invoke.MethodHandles;

public class lo8
implements Runnable {
    final Frame j;
    final String h;
    final String y;
    private static final long a = prr.a((long)-4565036486943233323L, (long)-4952291771234324367L, MethodHandles.lookup().lookupClass()).a(145685454235675L);

    lo8(Frame frame, String string, String string2) {
        this.j = frame;
        this.y = string;
        this.h = string2;
    }

    @Override
    public void run() {
        long l = a ^ 0x7B4319B949A8L;
        long l2 = l ^ 0x6272FEBFE907L;
        new lbc((Frame)((Object)m44.a("p", (Object)this, (long)4317038113076242688L, (long)l)), (String)((Object)m44.a("p", (Object)this, (long)4055402407202207158L, (long)l)), l2, (String)((Object)m44.a("p", (Object)this, (long)2837722570808933217L, (long)l)));
    }
}
