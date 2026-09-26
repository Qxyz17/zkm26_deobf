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
    private static final long a = prr.a((long)-8304726507174169525L, (long)-1569246659865484232L, MethodHandles.lookup().lookupClass()).a(16156004759868L);

    public boolean f() {
        long l = a ^ 0x6B2A67B295DBL;
        return (boolean)m44.a("u", (Object)((Object)this), (long)-5040910148211863327L, (long)l);
    }

    public boolean g() {
        long l = a ^ 0xA33C283132L;
        return (boolean)m44.a("t", (Object)((Object)this), (long)143970540076689995L, (long)l);
    }

    public void a(boolean bl, String string, boolean bl2) {
        long l = a ^ 0x2F82862B49C2L;
        m44.a("v", (Object)((Object)this), (boolean)bl, (long)7355031599747058936L, (long)l);
        if (m44.a("t", (Object)((Object)this), (long)7355031599747058936L, (long)l) != false) {
            m44.a("v", (Object)((Object)this), (String)string, (long)9154670514740846258L, (long)l);
            m44.a("v", (Object)((Object)this), (boolean)bl2, (long)8723282607265485499L, (long)l);
        } else {
            m44.a("v", (Object)((Object)this), null, (long)9154670514740846258L, (long)l);
        }
    }

    public String d() {
        long l = a ^ 0x67C5BB9A4B87L;
        return m44.a("q", (Object)((Object)this), (long)9029334706036923639L, (long)l);
    }

    public bh() {
        long l = a ^ 0x1DA57445FFF5L;
        long l2 = l ^ 0x65ECF898401L;
        long l3 = l2 >>> 8;
        int n = (int)(l2 << 56 >>> 56);
        super(l3, (byte)n);
        m44.a("q", (Object)((Object)this), (boolean)false, (long)-3448243963430110513L, (long)l);
    }

    public void a(int n) {
        long l = a ^ 0x2F5A7DE08B46L;
        m44.a("r", (Object)((Object)this), (int)n, (long)-5131295902178943668L, (long)l);
    }

    public int a() {
        long l = a ^ 0x191975667FE3L;
        return (int)m44.a("u", (Object)((Object)this), (long)5507004951017171433L, (long)l);
    }
}
