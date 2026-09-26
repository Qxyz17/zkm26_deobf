/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l68;
import com.zelix.l6q;
import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class lqh {
    l6q X;
    private static final long a = prr.a((long)-5624463353452790320L, (long)128873031238121557L, MethodHandles.lookup().lookupClass()).a(96070183512668L);

    public Set Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x6051C9289903L;
        return m44.a("r", (Object)this, (long)201127044675709707L, (long)l).D(l2);
    }

    public Set I(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x3C28784F2F3BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)m44.a("s", (Object)this, (long)5092386859723976554L, (long)l), (Object)objectArray2, (long)5086071454975674221L, (long)l);
    }

    public lqh(boolean bl, long l) {
        long l2 = (l = a ^ l) ^ 0x4D1AB10145D3L;
        m44.a("s", (Object)this, (l6q)new l6q(l2, bl), (long)-4214885447564563392L, (long)l);
    }

    public void F(Object object, Object object2, Object object3, long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x26C9DBC76E26L;
        int n = (int)(l3 >>> 32);
        long l4 = l3 << 32 >>> 32;
        long l5 = l2 ^ 0x58DCC0F1968BL;
        lq0 lq02 = new lq0(object2, n, l4, object3);
        m44.a("r", (Object)this, (long)-12771823240129005L, (long)l).t(object, lq02, l5);
    }

    public List i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = (l = a ^ l) ^ 0x2DB15383D9EAL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        return m44.a("r", (Object)this, (long)6148166497467104403L, (long)l).t((char)n, object, n2, (short)n3);
    }

    public lqh(long l) {
        long l2 = (l = a ^ l) ^ 0x7B118D902132L;
        this(false, l2);
    }

    public boolean s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x7ECAC540D19L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (boolean)m44.a("t", (Object)m44.a("u", (Object)this, (long)6268365904244244284L, (long)l), (Object)objectArray2, (long)5583395029661387501L, (long)l);
    }

    public int o(Object[] objectArray) {
        int n;
        block3: {
            long l = (Long)objectArray[0];
            long l2 = (l = a ^ l) ^ 0x18CB845EE3C5L;
            int n2 = 0;
            CallSite callSite = m44.a("j", (long)7069561285290327082L, (long)l);
            for (Map.Entry entry : m44.a("t", (Object)this, (long)8650556582375510477L, (long)l).D(l2)) {
                if (l > 0L) {
                    n = n2 + ((List)entry.getValue()).size();
                    if (callSite != null) break block3;
                    n2 = n;
                }
                if (callSite == null) continue;
            }
            n = n2;
        }
        return n;
    }

    public int q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x5DBE106C5FEDL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (int)m44.a("r", (Object)m44.a("s", (Object)this, (long)-7727080299081024254L, (long)l), (Object)objectArray2, (long)-8186107924542706331L, (long)l);
    }

    public Enumeration O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x5F4969E3918CL;
        long l4 = l2 ^ 0x760663B1E9F6L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return new l68(l4, (Collection)((Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)-568392813656780323L, (long)l), (Object)objectArray2, (long)-566828568303568422L, (long)l)));
    }

    public lqh(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x5B6E73C5F763L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        this((short)n2, n, false, n3, (short)n4);
    }

    public lqh(short s, int n, boolean bl, int n2, short s2) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x75A61CD4279BL;
        m44.a("r", (Object)this, (l6q)new l6q(n, bl, l2), (long)3864297048357903457L, (long)l);
    }

    public void x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x1095489E1D57L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)6438993813293166746L, (long)l), (Object)objectArray2, (long)6677016412828922117L, (long)l);
    }
}
