/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.id;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r3;
import com.zelix.u6;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.event.DocumentEvent;

public class ul
extends u6 {
    r3 h;
    id K;
    private static final long a = prr.a((long)-5111969907640049265L, (long)-59381876576764759L, MethodHandles.lookup().lookupClass()).a(139205755747854L);

    ul(r3 r32, id id2, long l) {
        l = a ^ l;
        m44.a("p", (Object)((Object)this), (r3)r32, (long)-4620539505167003714L, (long)l);
        m44.a("p", (Object)((Object)this), (id)id2, (long)-4808267442371809153L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void B(Object[] objectArray) {
        block5: {
            ul ul2;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                DocumentEvent documentEvent = (DocumentEvent)objectArray[1];
                long l3 = l2;
                l = l3 ^ 0x7C0A5335956L;
                long l4 = l3 ^ 0x24DB42A23F65L;
                CallSite callSite = m44.a("v", (Object)documentEvent, (long)-8046335462111006818L, (long)l2);
                CallSite callSite2 = m44.a("i", (long)-8285448744989295628L, (long)l2);
                try {
                    try {
                        ul2 = this;
                        if (callSite2 != null) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        if (m44.a("v", (Object)m44.a("w", (Object)((Object)ul2), (long)-8486838405007931646L, (long)l2), (Object)objectArray2, (long)-8097669855539881134L, (long)l2) != false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-7703653275782404346L, (long)l2);
                    }
                    ul2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-7703653275782404346L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = ((String)((Object)m44.a("v", (Object)m44.a("w", (Object)((Object)this), (long)-8486838405007931646L, (long)l2), (long)-7596804035385499068L, (long)l2))).trim();
            objectArray3[0] = l;
            m44.a("v", (Object)m44.a("w", (Object)((Object)ul2), (long)-8602543104675104573L, (long)l2), (Object)objectArray3, (long)-8532645828499250570L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
