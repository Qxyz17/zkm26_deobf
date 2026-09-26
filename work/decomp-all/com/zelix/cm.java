/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.iz;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class cm
extends iz {
    String J;
    String s;
    private static final long b = prr.a((long)3925430122712118167L, (long)-5639384252609942165L, MethodHandles.lookup().lookupClass()).a(267940758976353L);

    public final void h(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = b ^ l;
        m44.a("t", (Object)((Object)this), (String)string, (long)-3167403726536346279L, (long)l);
    }

    public final String S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("q", (Object)((Object)this), (long)4227806291055254526L, (long)l);
    }

    public cm(int n, int n2, long l) {
        long l2 = ((long)n2 << 32 | l << 32 >>> 32) ^ b;
        long l3 = l2 ^ 0x79B0A945A403L;
        super(n, l3);
    }

    public final String M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("s", (Object)((Object)this), (long)7187532973938063003L, (long)l);
    }

    public final void X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = b ^ l;
        m44.a("s", (Object)((Object)this), (String)string, (long)55587614292268513L, (long)l);
    }
}
