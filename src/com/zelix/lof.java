/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class lof {
    private String D;
    private boolean j;
    private static final long a = prr.a((long)7662767377735375764L, (long)-519761960834323587L, MethodHandles.lookup().lookupClass()).a(116022031233275L);

    String A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)2120779514627818795L, (long)l);
    }

    lof(long l, String string) {
        l = a ^ l;
        m44.a("u", (Object)this, (String)string, (long)5016872153997729242L, (long)l);
    }

    boolean B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("q", (Object)this, (long)1489360430337867009L, (long)l);
    }

    void j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        l = a ^ l;
        m44.a("t", (Object)this, (boolean)bl, (long)-1523267012184095882L, (long)l);
    }

    lof(String string, boolean bl, int n, char c, int n2) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ a;
        m44.a("s", (Object)this, (String)string, (long)-8178048215419676988L, (long)l);
        m44.a("s", (Object)this, (boolean)bl, (long)-7801590289117005295L, (long)l);
    }
}
