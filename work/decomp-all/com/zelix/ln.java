/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fq;
import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.ll;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.zn;
import java.lang.invoke.CallSite;

public class ln
extends l7
implements fq {
    private String O;

    public void F(zn zn2, lkc lkc2, long l) {
        block6: {
            long l2 = l;
            long l3 = l2 ^ 0L;
            long l4 = l2 ^ 0x56B600B7A121L;
            long l5 = l2 ^ 0x2BEAF1B40FB1L;
            int n = this.y(l5);
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
            int n2 = 0;
            block2: while (n2 < n) {
                try {
                    this.g(n2).F((zn)this, lkc2, l3);
                    ++n2;
                    do {
                        CallSite callSite2 = callSite;
                        if (l > 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-3034461851299045727L, (long)l);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l4;
            objectArray[0] = m44.a("v", (Object)((Object)this), (long)-2904261335160286027L, (long)l);
            m44.a("w", (Object)((ll)zn2), (Object)objectArray, (long)-3094075201148650693L, (long)l);
        }
    }

    public ln(int n) {
        super(n);
    }

    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("t", (Object)((Object)this), (String)string, (long)957474882238172749L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
