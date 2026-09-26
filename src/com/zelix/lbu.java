/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbg;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import javax.swing.JFrame;

public class lbu
implements Runnable {
    final JFrame W;
    final String d;
    final String F;
    final String M;
    private static final long a = prr.a((long)259071220761841226L, (long)5976718753562459467L, MethodHandles.lookup().lookupClass()).a(99464536785954L);

    lbu(JFrame jFrame, String string, String string2, String string3) {
        this.W = jFrame;
        this.F = string;
        this.d = string2;
        this.M = string3;
    }

    @Override
    public void run() {
        long l = a ^ 0x79CFBF32D595L;
        long l2 = l ^ 0x69735BC21673L;
        new lbg((JFrame)((Object)m44.a("w", (Object)this, (long)-4871026773762022885L, (long)l)), l2, (String)((Object)m44.a("w", (Object)this, (long)-4711762782058654276L, (long)l)), (String)((Object)m44.a("w", (Object)this, (long)-4768363723907417218L, (long)l)), (String)((Object)m44.a("w", (Object)this, (long)-4696586197888861978L, (long)l)));
    }
}
