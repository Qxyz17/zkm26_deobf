/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fr;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class nl {
    final fr y;
    private static final long a = prr.a((long)3907687718834819579L, (long)5470133915625688649L, MethodHandles.lookup().lookupClass()).a(84571524332303L);

    public nl(fr fr2) {
        this.y = fr2;
    }

    public boolean e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        l = a ^ l;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)-5194418788626426780L, (long)l), (Object)new Object[]{object}, (long)-5906075440254230421L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public l6q l(Object[] objectArray) {
        l6q l6q2;
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x6093CC9F35F0L;
        long l4 = l2 ^ 0x4BE6FEDF4FL;
        long l5 = l2 ^ 0x4BECF1078D88L;
        l6q l6q3 = new l6q(l3, (int)(m44.a("w", (Object)m44.a("v", (Object)this, (long)6853299551942573206L, (long)l), (Object)new Object[0], (long)4841467449716793034L, (long)l) * 2));
        CallSite callSite = m44.a("h", (long)6815696693170094240L, (long)l);
        Iterator iterator = m44.a("w", (Object)m44.a("v", (Object)this, (long)6853299551942573206L, (long)l), (Object)new Object[0], (long)4678150921817321931L, (long)l).iterator();
        block0: while (iterator.hasNext()) {
            CallSite callSite22;
            Map.Entry entry = (Map.Entry)iterator.next();
            Object object = entry.getValue();
            block1: while (true) {
                l6q l6q4;
                l6q2 = l6q4 = (l6q)object;
                if (callSite != null) return l6q2;
                block2: for (CallSite callSite22 : l6q2.D(l4)) {
                    do {
                        Map.Entry entry2 = (Map.Entry)((Object)callSite22);
                        l6q3.u(entry2.getKey(), (Collection)entry2.getValue(), l5);
                        if (callSite != null) continue block0;
                        object = callSite;
                        if (l <= 0L) continue block1;
                        if (object == null) continue block2;
                        callSite22 = callSite;
                    } while (l <= 0L);
                }
                break;
            }
            if (callSite22 == null) continue;
        }
        l6q2 = l6q3;
        return l6q2;
    }

    public l6q O(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                Object object = objectArray[0];
                long l = (Long)objectArray[1];
                long l2 = (l = a ^ l) ^ 0x18B1929D0583L;
                CallSite callSite2 = m44.a("v", (Object)m44.a("w", (Object)this, (long)7348411382718809719L, (long)l), (Object)new Object[]{object}, (long)8977215355519667366L, (long)l);
                CallSite callSite3 = m44.a("i", (long)7239319323749153345L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)8828012951191515233L, (long)l);
                    }
                    callSite = new l6q(l2, (l6q)callSite2);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)8828012951191515233L, (long)l);
                }
            }
            return callSite;
        }
        return null;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
