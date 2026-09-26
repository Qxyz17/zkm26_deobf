/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.nt;
import com.zelix.prr;
import com.zelix.rh;
import java.lang.invoke.MethodHandles;
import javax.swing.JFrame;

public class rn
extends rh {
    final nt z;
    private static final long a = prr.a((long)2120306134973928748L, (long)7547028666747763751L, MethodHandles.lookup().lookupClass()).a(141451379603408L);

    rn(char c, nt nt2, JFrame jFrame, String string, int n, boolean bl, int n2) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x621866D2776DL;
        int n3 = (int)(l2 >>> 32);
        int n4 = (int)(l2 << 32 >>> 48);
        int n5 = (int)(l2 << 48 >>> 48);
        this.z = nt2;
        super(n3, jFrame, string, (short)n4, bl, (char)n5);
    }
}
