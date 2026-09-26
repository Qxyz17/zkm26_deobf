/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lks;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.vu;
import com.zelix.xf;
import com.zelix.xv;
import com.zelix.y7;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.HashSet;

public class vq
extends vu {
    private static final long a = prr.a((long)520626481297048412L, (long)-2613829705853120707L, MethodHandles.lookup().lookupClass()).a(23845110327343L);

    vq(y7 y72, char c, char c2, lks lks2, int n) {
        long l;
        long l2 = l = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x2634EEB76C60L;
        long l4 = l2 ^ 0x730A8E4B6C07L;
        long l5 = l2 ^ 0x51E8996CC536L;
        CallSite callSite = m44.a("i", (long)3574692985355344615L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("u", (Object)((Object)this), (xv[])new xv[m44.a("v", (Object)y72, (Object)objectArray, (long)3773134767530090668L, (long)l)], (long)2931193508319187829L, (long)l);
        CallSite callSite2 = callSite;
        int n2 = 0;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite3 = m44.a("v", (Object)y72, (Object)objectArray2, (long)3003547427946252351L, (long)l);
        while (callSite3.hasMoreElements()) {
            HashSet hashSet = (HashSet)callSite3.nextElement();
            xf xf2 = new xf(hashSet, l5, lks2);
            m44.a("w", (Object)((Object)this), (long)2931193508319187829L, (long)l)[n2++] = xf2;
            if (callSite2 != false) continue;
        }
    }
}
