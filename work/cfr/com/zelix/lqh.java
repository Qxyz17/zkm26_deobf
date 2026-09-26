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
    private static final long a = prr.a(-5624463353452790320L, 128873031238121557L, MethodHandles.lookup().lookupClass()).a(96070183512668L);

    public Set Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x6051C9289903L;
        return ((l6q)((Object)m44.a("r", (Object)this, (long)201127044675709707L, (long)l10))).D(l11);
    }

    public Set I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x3C28784F2F3BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("r", (Object)m44.a("s", (Object)this, (long)5092386859723976554L, (long)l10), (Object)objectArray2, (long)5086071454975674221L, (long)l10);
    }

    public lqh(boolean bl2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x4D1AB10145D3L;
        m44.a("s", (Object)this, (l6q)new l6q(l11, bl2), (long)-4214885447564563392L, (long)l10);
    }

    public void F(Object object, Object object2, Object object3, long l10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x26C9DBC76E26L;
        int n10 = (int)(l12 >>> 32);
        long l13 = l12 << 32 >>> 32;
        long l14 = l11 ^ 0x58DCC0F1968BL;
        lq0 lq02 = new lq0(object2, n10, l13, object3);
        ((l6q)((Object)m44.a("r", (Object)this, (long)-12771823240129005L, (long)l10))).t(object, lq02, l14);
    }

    public List i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x2DB15383D9EAL;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        return ((l6q)((Object)m44.a("r", (Object)this, (long)6148166497467104403L, (long)l10))).t((char)n10, object, n11, (short)n12);
    }

    public lqh(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x7B118D902132L;
        this(false, l11);
    }

    public boolean s(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x7ECAC540D19L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("t", (Object)m44.a("u", (Object)this, (long)6268365904244244284L, (long)l10), (Object)objectArray2, (long)5583395029661387501L, (long)l10);
    }

    public int o(Object[] objectArray) {
        int n10;
        block3: {
            long l10 = (Long)objectArray[0];
            long l11 = (l10 = a ^ l10) ^ 0x18CB845EE3C5L;
            int n11 = 0;
            CallSite callSite = m44.a("j", (long)7069561285290327082L, (long)l10);
            for (Map.Entry entry : ((l6q)((Object)m44.a("t", (Object)this, (long)8650556582375510477L, (long)l10))).D(l11)) {
                if (l10 > 0L) {
                    n10 = n11 + ((List)entry.getValue()).size();
                    if (callSite != null) break block3;
                    n11 = n10;
                }
                if (callSite == null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    public int q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x5DBE106C5FEDL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (int)m44.a("r", (Object)m44.a("s", (Object)this, (long)-7727080299081024254L, (long)l10), (Object)objectArray2, (long)-8186107924542706331L, (long)l10);
    }

    public Enumeration O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x5F4969E3918CL;
        long l13 = l11 ^ 0x760663B1E9F6L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        return new l68(l13, (Collection)((Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)-568392813656780323L, (long)l10), (Object)objectArray2, (long)-566828568303568422L, (long)l10)));
    }

    public lqh(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x5B6E73C5F763L;
        int n11 = (int)(l11 >>> 48);
        int n12 = (int)(l11 << 16 >>> 32);
        int n13 = (int)(l11 << 48 >>> 48);
        this((short)n11, n10, false, n12, (short)n13);
    }

    public lqh(short s10, int n10, boolean bl2, int n11, short s11) {
        long l10 = ((long)s10 << 48 | (long)n11 << 32 >>> 16 | (long)s11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x75A61CD4279BL;
        m44.a("r", (Object)this, (l6q)new l6q(n10, bl2, l11), (long)3864297048357903457L, (long)l10);
    }

    public void x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x1095489E1D57L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)6438993813293166746L, (long)l10), (Object)objectArray2, (long)6677016412828922117L, (long)l10);
    }
}

