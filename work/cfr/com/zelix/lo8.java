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
    private static final long a = prr.a(-4565036486943233323L, -4952291771234324367L, MethodHandles.lookup().lookupClass()).a(145685454235675L);

    lo8(Frame frame, String string, String string2) {
        this.j = frame;
        this.y = string;
        this.h = string2;
    }

    @Override
    public void run() {
        long l10 = a ^ 0x7B4319B949A8L;
        long l11 = l10 ^ 0x6272FEBFE907L;
        new lbc((Frame)((Object)m44.a("p", (Object)this, (long)4317038113076242688L, (long)l10)), (String)((Object)m44.a("p", (Object)this, (long)4055402407202207158L, (long)l10)), l11, (String)((Object)m44.a("p", (Object)this, (long)2837722570808933217L, (long)l10)));
    }
}

