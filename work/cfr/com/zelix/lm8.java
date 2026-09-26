/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bn;
import com.zelix.lk7;
import com.zelix.lkv;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lm8
implements lk7 {
    private int K;
    private int i;
    private final bn t;
    private final lkv l;
    private static final long a = prr.a(-1280126704040947040L, -2142177640861052505L, MethodHandles.lookup().lookupClass()).a(75735079975575L);

    @Override
    public int b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        lm8 lm82 = this;
        CallSite callSite = m44.a("v", (Object)lm82, (long)5467622811797547698L, (long)l10);
        m44.a("t", (Object)lm82, (int)(callSite + true), (long)5467622811797547698L, (long)l10);
        return (int)callSite;
    }

    @Override
    public int V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        lm8 lm82 = this;
        m44.a("u", (Object)lm82, (int)(m44.a("w", (Object)lm82, (long)3938896580220786683L, (long)l10) + n10), (long)3938896580220786683L, (long)l10);
        return (int)m44.a("w", (Object)this, (long)3938896580220786683L, (long)l10);
    }

    @Override
    public int f(long l10) {
        lm8 lm82 = this;
        reference v12 = m44.a("p", (Object)lm82, (long)-5138948153205581316L, (long)l10) + true;
        m44.a("r", (Object)lm82, (int)v12, (long)-5138948153205581316L, (long)l10);
        return (int)v12;
    }

    public lm8(long l10, bn bn2) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x792E111FAD1DL;
        long l13 = l11 ^ 0x146600EA4FL;
        this.t = bn2;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        m44.a("s", (Object)this, (int)m44.a("p", (Object)bn2, (Object)objectArray, (long)8006030566097688359L, (long)l10), (long)8414926285459477909L, (long)l10);
        m44.a("s", (Object)this, (int)m44.a("q", (Object)this, (long)8414926285459477909L, (long)l10), (long)8633560933469866976L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        this.l = m44.a("p", (Object)bn2, (Object)objectArray2, (long)8281717120558466364L, (long)l10);
    }

    @Override
    public int U(long l10) {
        return (int)m44.a("t", (Object)this, (long)-41941229552968136L, (long)l10);
    }
}

