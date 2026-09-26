/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fq;
import com.zelix.j6;
import com.zelix.jp;
import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class j7
extends l7
implements fq {
    protected String H;
    private static final long a = prr.a((long)-3296962277263945999L, (long)-2333774247655466423L, MethodHandles.lookup().lookupClass()).a(245812804268876L);

    public j7(int n) {
        super(n);
    }

    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("t", (Object)((Object)this), (String)string, (long)627330636423653668L, (long)l);
    }

    public void u(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x1901C580B158L;
        jp jp2 = (jp)zn2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("r", (Object)((Object)this), (long)4062420304565721584L, (long)l);
        objectArray2[0] = l2;
        m44.a("s", (Object)jp2, (Object)objectArray2, (long)4321921791414573800L, (long)l);
    }

    public final void F(zn zn2, lkc lkc2, long l) {
        block4: {
            long l2;
            block5: {
                long l3 = l;
                long l4 = l3 ^ 0L;
                l2 = l3 ^ 0x30CB2257CD84L;
                l7 l72 = (l7)this.g(0);
                CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
                m44.a("w", (Object)l72, (Object)((Object)this), (Object)lkc2, (long)l4, (long)-2992767645021803645L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (!(l72 instanceof j6)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-3597137917596774299L, (long)l);
                    }
                    m44.a("t", (Object)((Object)this), (String)((j6)l72).A(), (long)-3293004317305031716L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-3597137917596774299L, (long)l);
                }
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = l2;
            objectArray[1] = lkc2;
            objectArray[0] = zn2;
            m44.a("w", (Object)((Object)this), (Object)objectArray, (long)-2981315852865587419L, (long)l);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
