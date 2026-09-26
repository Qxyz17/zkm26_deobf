/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ja;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class jt
extends ja {
    private static final long b = prr.a((long)-7624662986423547368L, (long)5553329346572865377L, MethodHandles.lookup().lookupClass()).a(201450992632071L);

    public jt(long l, int n) {
        long l2 = (l = b ^ l) ^ 0x79E13144B82DL;
        super(n, l2);
    }

    protected void k(Object[] objectArray) {
        block5: {
            jt jt2;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                lkc lkc2 = (lkc)objectArray[1];
                l = l2 ^ 0x215E3D303965L;
                CallSite callSite = m44.a("j", (long)7374193648435527192L, (long)l2);
                try {
                    try {
                        jt2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("t", (Object)((Object)jt2), (long)7300947376774249410L, (long)l2) == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)7097697802344934297L, (long)l2);
                    }
                    jt2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)7097697802344934297L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l;
            objectArray2[1] = m44.a("t", (Object)((Object)this), (long)6932199952998774191L, (long)l2);
            objectArray2[0] = m44.a("t", (Object)((Object)this), (long)7300947376774249410L, (long)l2);
            m44.a("u", (Object)m44.a("t", (Object)((Object)jt2), (long)8871810686016648836L, (long)l2), (Object)objectArray2, (long)8906403094587438324L, (long)l2);
        }
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
