/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.ltb;
import com.zelix.lwl;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lwd
extends lt9 {
    private static final long a = prr.a((long)7268181662768008979L, (long)4859617368218990537L, MethodHandles.lookup().lookupClass()).a(215841572518928L);

    public lwd(int n, short s, int n2, int n3) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x3B11311DA581L;
        super(n2, l2);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x3C212F01A890L;
        long l4 = l2 ^ 0L;
        lwl lwl2 = (lwl)this.V(0);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)lwl2, (Object)objectArray2, (long)-6393942317858302839L, (long)l);
        CallSite callSite = m44.a("w", (Object)lwl2, (Object)new Object[0], (long)-4968184746715213117L, (long)l);
        ltb ltb2 = (ltb)lmu2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = (String)((Object)m44.a("l", (long)-5178602363818409232L, (long)l)) + (String)((Object)callSite);
        objectArray3[0] = l3;
        m44.a("w", (Object)ltb2, (Object)objectArray3, (long)-6504114854036947639L, (long)l);
    }
}
