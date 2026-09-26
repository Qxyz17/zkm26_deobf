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
    private static final long a = prr.a(-3296962277263945999L, -2333774247655466423L, MethodHandles.lookup().lookupClass()).a(245812804268876L);

    public j7(int n10) {
        super(n10);
    }

    @Override
    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("t", (Object)this, (String)string, (long)627330636423653668L, (long)l10);
    }

    public void u(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x1901C580B158L;
        jp jp2 = (jp)zn2;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("r", (Object)this, (long)4062420304565721584L, (long)l10);
        objectArray2[0] = l11;
        m44.a("s", (Object)jp2, (Object)objectArray2, (long)4321921791414573800L, (long)l10);
    }

    @Override
    public final void F(zn zn2, lkc lkc2, long l10) {
        block4: {
            long l11;
            block5: {
                long l12 = l10;
                long l13 = l12 ^ 0L;
                l11 = l12 ^ 0x30CB2257CD84L;
                l7 l710 = (l7)this.g(0);
                CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
                m44.a("w", (Object)l710, (Object)this, (Object)lkc2, (long)l13, (long)-2992767645021803645L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (!(l710 instanceof j6)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-3597137917596774299L, (long)l10);
                    }
                    m44.a("t", (Object)this, (String)((j6)l710).A(), (long)-3293004317305031716L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-3597137917596774299L, (long)l10);
                }
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = l11;
            objectArray[1] = lkc2;
            objectArray[0] = zn2;
            m44.a("w", (Object)this, (Object)objectArray, (long)-2981315852865587419L, (long)l10);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

