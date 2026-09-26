/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lwe;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lwx
extends lwe {
    private static final long a = prr.a((long)2324705553098329894L, (long)-9043915021351107968L, MethodHandles.lookup().lookupClass()).a(84661850824139L);

    public lwx(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x3B22DE9CDF4EL;
        super(n, l2);
    }
}
