/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.nv;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public abstract class bh
extends nv {
    boolean c;
    protected transient int e;
    protected boolean d;
    protected String f;
    private static final long a = prr.a(-8304726507174169525L, -1569246659865484232L, MethodHandles.lookup().lookupClass()).a(16156004759868L);

    public boolean f() {
        long l10 = a ^ 0x6B2A67B295DBL;
        return (boolean)m44.a("u", (Object)this, (long)-5040910148211863327L, (long)l10);
    }

    public boolean g() {
        long l10 = a ^ 0xA33C283132L;
        return (boolean)m44.a("t", (Object)this, (long)143970540076689995L, (long)l10);
    }

    public void a(boolean bl2, String string, boolean bl3) {
        long l10 = a ^ 0x2F82862B49C2L;
        m44.a("v", (Object)this, (boolean)bl2, (long)7355031599747058936L, (long)l10);
        if (m44.a("t", (Object)this, (long)7355031599747058936L, (long)l10) != false) {
            m44.a("v", (Object)this, (String)string, (long)9154670514740846258L, (long)l10);
            m44.a("v", (Object)this, (boolean)bl3, (long)8723282607265485499L, (long)l10);
        } else {
            m44.a("v", (Object)this, null, (long)9154670514740846258L, (long)l10);
        }
    }

    public String d() {
        long l10 = a ^ 0x67C5BB9A4B87L;
        return m44.a("q", (Object)this, (long)9029334706036923639L, (long)l10);
    }

    public bh() {
        long l10 = a ^ 0x1DA57445FFF5L;
        long l11 = l10 ^ 0x65ECF898401L;
        long l12 = l11 >>> 8;
        int n10 = (int)(l11 << 56 >>> 56);
        super(l12, (byte)n10);
        m44.a("q", (Object)this, (boolean)false, (long)-3448243963430110513L, (long)l10);
    }

    public void a(int n10) {
        long l10 = a ^ 0x2F5A7DE08B46L;
        m44.a("r", (Object)this, (int)n10, (long)-5131295902178943668L, (long)l10);
    }

    public int a() {
        long l10 = a ^ 0x191975667FE3L;
        return (int)m44.a("u", (Object)this, (long)5507004951017171433L, (long)l10);
    }
}

