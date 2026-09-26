/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ic;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.vj;
import java.lang.invoke.MethodHandles;

public class vy
extends vj {
    ic u;
    private static final long a = prr.a((long)8726088750768871703L, (long)1416649960632779255L, MethodHandles.lookup().lookupClass()).a(230305129344398L);

    vy(String string, ic ic2) {
        super(string);
        this.u = ic2;
    }

    public ic N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("r", (Object)((Object)this), (long)-5706169553376631247L, (long)l);
    }

    public boolean n(long l) {
        return false;
    }
}
