/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lq3;
import com.zelix.lqu;
import com.zelix.lt8;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ltg
extends l7t
implements r5,
lq3 {
    private lyt P;
    private String C;
    private static final long a = prr.a(6427257313983901921L, 5574403033237862353L, MethodHandles.lookup().lookupClass()).a(228304072983224L);

    public ltg(int n10, int n11, int n12, byte by2) {
        long l10 = ((long)n11 << 32 | (long)n12 << 40 >>> 32 | (long)by2 << 56 >>> 56) ^ a;
        long l11 = l10 ^ 0x7902B155D58BL;
        int n13 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n13, n10, l12);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l10;
        long l11;
        long l12;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l12 = (Long)objectArray[2];
            long l13 = l12;
            l11 = l13 ^ 0x6352E8763037L;
            l10 = l13 ^ 0x5813AE03FECDL;
            long l14 = l13 ^ 0x47526B4E5A06L;
            long l15 = l13 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l14;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l12);
            int n10 = 0;
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l12);
            block2: while (n10 < callSite) {
                try {
                    do {
                        if (l12 > 0L) {
                            lmu2 = this.V(n10);
                            if (callSite2 != false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l15;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l12);
                            ++n10;
                        }
                        if (callSite2 == false) continue block2;
                    } while (l12 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-6543055260685920474L, (long)l12);
                }
            }
            lmu2 = lmu3;
        }
        lt8 lt82 = (lt8)lmu2;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = m44.a("v", (Object)this, (long)-4841426177051114401L, (long)l12);
        objectArray4[0] = l11;
        m44.a("w", (Object)lt82, (Object)objectArray4, (long)-4631235119437277631L, (long)l12);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l10;
        objectArray5[0] = m44.a("v", (Object)this, (long)-4696872658624095145L, (long)l12);
        m44.a("w", (Object)lt82, (Object)objectArray5, (long)-6379273221439263247L, (long)l12);
    }

    @Override
    public void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        lyt lyt2 = (lyt)objectArray[1];
        m44.a("s", (Object)this, (lyt)lyt2, (long)6045561586924171616L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)this, (String)string, (long)-8288681771543727000L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

