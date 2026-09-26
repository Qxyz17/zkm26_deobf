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
    private static final long b = prr.a(3925430122712118167L, -5639384252609942165L, MethodHandles.lookup().lookupClass()).a(267940758976353L);

    public final void h(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = b ^ l10;
        m44.a("t", (Object)this, (String)string, (long)-3167403726536346279L, (long)l10);
    }

    public final String S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("q", (Object)this, (long)4227806291055254526L, (long)l10);
    }

    public cm(int n10, int n11, long l10) {
        long l11 = ((long)n11 << 32 | l10 << 32 >>> 32) ^ b;
        long l12 = l11 ^ 0x79B0A945A403L;
        super(n10, l12);
    }

    public final String M(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("s", (Object)this, (long)7187532973938063003L, (long)l10);
    }

    public final void X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = b ^ l10;
        m44.a("s", (Object)this, (String)string, (long)55587614292268513L, (long)l10);
    }
}

