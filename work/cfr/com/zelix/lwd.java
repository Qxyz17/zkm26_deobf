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
    private static final long a = prr.a(7268181662768008979L, 4859617368218990537L, MethodHandles.lookup().lookupClass()).a(215841572518928L);

    public lwd(int n10, short s10, int n11, int n12) {
        long l10 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x3B11311DA581L;
        super(n11, l11);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x3C212F01A890L;
        long l13 = l11 ^ 0L;
        lwl lwl2 = (lwl)this.V(0);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l13;
        objectArray2[1] = lqu2;
        objectArray2[0] = this;
        m44.a("w", (Object)lwl2, (Object)objectArray2, (long)-6393942317858302839L, (long)l10);
        CallSite callSite = m44.a("w", (Object)lwl2, (Object)new Object[0], (long)-4968184746715213117L, (long)l10);
        ltb ltb2 = (ltb)lmu2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = (String)((Object)m44.a("l", (long)-5178602363818409232L, (long)l10)) + (String)((Object)callSite);
        objectArray3[0] = l12;
        m44.a("w", (Object)ltb2, (Object)objectArray3, (long)-6504114854036947639L, (long)l10);
    }
}

