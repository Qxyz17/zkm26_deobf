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
    private static final long a = prr.a((long)-1280126704040947040L, (long)-2142177640861052505L, MethodHandles.lookup().lookupClass()).a(75735079975575L);

    public int b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lm8 lm82 = this;
        CallSite callSite = m44.a("v", (Object)lm82, (long)5467622811797547698L, (long)l);
        m44.a("t", (Object)lm82, (int)(callSite + true), (long)5467622811797547698L, (long)l);
        return (int)callSite;
    }

    public int V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        lm8 lm82 = this;
        m44.a("u", (Object)lm82, (int)(m44.a("w", (Object)lm82, (long)3938896580220786683L, (long)l) + n), (long)3938896580220786683L, (long)l);
        return (int)m44.a("w", (Object)this, (long)3938896580220786683L, (long)l);
    }

    public int f(long l) {
        lm8 lm82 = this;
        reference v1 = m44.a("p", (Object)lm82, (long)-5138948153205581316L, (long)l) + true;
        m44.a("r", (Object)lm82, (int)v1, (long)-5138948153205581316L, (long)l);
        return (int)v1;
    }

    public lm8(long l, bn bn2) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x792E111FAD1DL;
        long l4 = l2 ^ 0x146600EA4FL;
        this.t = bn2;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("s", (Object)this, (int)m44.a("p", (Object)bn2, (Object)objectArray, (long)8006030566097688359L, (long)l), (long)8414926285459477909L, (long)l);
        m44.a("s", (Object)this, (int)m44.a("q", (Object)this, (long)8414926285459477909L, (long)l), (long)8633560933469866976L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        this.l = m44.a("p", (Object)bn2, (Object)objectArray2, (long)8281717120558466364L, (long)l);
    }

    public int U(long l) {
        return (int)m44.a("t", (Object)this, (long)-41941229552968136L, (long)l);
    }
}
