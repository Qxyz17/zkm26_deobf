/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class y6 {
    private final boolean h;
    private String s;
    private final boolean m;
    private static final long a = prr.a((long)-712497584173177547L, (long)5344681171282235943L, MethodHandles.lookup().lookupClass()).a(150609866905823L);

    boolean P(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("p", (Object)this, (long)6978500061879918725L, (long)l);
    }

    void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        m44.a("p", (Object)this, (String)string, (long)3509627235703262164L, (long)l);
    }

    y6(String string, boolean bl, boolean bl2, long l) {
        l = a ^ l;
        m44.a("r", (Object)this, (String)string, (long)-4150468949872280314L, (long)l);
        this.m = bl;
        this.h = bl2;
    }

    boolean t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("t", (Object)this, (long)-8989764050392259626L, (long)l);
    }

    String k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-3452621601663751307L, (long)l);
    }
}
