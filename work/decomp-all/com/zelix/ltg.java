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
    private static final long a = prr.a((long)6427257313983901921L, (long)5574403033237862353L, MethodHandles.lookup().lookupClass()).a(228304072983224L);

    public ltg(int n, int n2, int n3, byte by) {
        long l = ((long)n2 << 32 | (long)n3 << 40 >>> 32 | (long)by << 56 >>> 56) ^ a;
        long l2 = l ^ 0x7902B155D58BL;
        int n4 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n4, n, l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l;
        long l2;
        long l3;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l3 = (Long)objectArray[2];
            long l4 = l3;
            l2 = l4 ^ 0x6352E8763037L;
            l = l4 ^ 0x5813AE03FECDL;
            long l5 = l4 ^ 0x47526B4E5A06L;
            long l6 = l4 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l5;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l3);
            int n = 0;
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l3);
            block2: while (n < callSite) {
                try {
                    do {
                        if (l3 > 0L) {
                            lmu2 = this.V(n);
                            if (callSite2 != false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l6;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l3);
                            ++n;
                        }
                        if (callSite2 == false) continue block2;
                    } while (l3 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-6543055260685920474L, (long)l3);
                }
            }
            lmu2 = lmu3;
        }
        lt8 lt82 = (lt8)lmu2;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = m44.a("v", (Object)((Object)this), (long)-4841426177051114401L, (long)l3);
        objectArray4[0] = l2;
        m44.a("w", (Object)lt82, (Object)objectArray4, (long)-4631235119437277631L, (long)l3);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l;
        objectArray5[0] = m44.a("v", (Object)((Object)this), (long)-4696872658624095145L, (long)l3);
        m44.a("w", (Object)lt82, (Object)objectArray5, (long)-6379273221439263247L, (long)l3);
    }

    public void W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lyt lyt2 = (lyt)objectArray[1];
        m44.a("s", (Object)((Object)this), (lyt)lyt2, (long)6045561586924171616L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)((Object)this), (String)string, (long)-8288681771543727000L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
