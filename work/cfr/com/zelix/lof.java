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
    private static final long a = prr.a(7662767377735375764L, -519761960834323587L, MethodHandles.lookup().lookupClass()).a(116022031233275L);

    String A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)2120779514627818795L, (long)l10);
    }

    lof(long l10, String string) {
        l10 = a ^ l10;
        m44.a("u", (Object)this, (String)string, (long)5016872153997729242L, (long)l10);
    }

    boolean B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("q", (Object)this, (long)1489360430337867009L, (long)l10);
    }

    void j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        l10 = a ^ l10;
        m44.a("t", (Object)this, (boolean)bl2, (long)-1523267012184095882L, (long)l10);
    }

    lof(String string, boolean bl2, int n10, char c10, int n11) {
        long l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)n11 << 48 >>> 48) ^ a;
        m44.a("s", (Object)this, (String)string, (long)-8178048215419676988L, (long)l10);
        m44.a("s", (Object)this, (boolean)bl2, (long)-7801590289117005295L, (long)l10);
    }
}

