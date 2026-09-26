/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.us;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class _0
implements m {
    List e;
    private static String t;

    @Override
    public final void u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        us us2 = (us)objectArray[1];
        long l11 = l10 ^ 0x68943DF24D52L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = null;
        objectArray2[3] = null;
        objectArray2[2] = null;
        objectArray2[1] = l11;
        objectArray2[0] = us2;
        m44.a("v", (Object)this, (Object)objectArray2, (long)-7776666616326628220L, (long)l10);
    }

    @Override
    public synchronized void I() {
    }

    @Override
    public abstract void Y(Object[] var1);

    public static String F() {
        return t;
    }

    @Override
    public final void F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x791D211D4B68L;
        m44.a("p", (Object)this, (long)-119532066256813764L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("p", (Object)this, (Object)objectArray2, (long)-2261241216863030701L, (long)l10);
    }

    public static void p(String string) {
        t = string;
    }

    @Override
    public abstract void T(long var1, Object var3, Object var4, Object var5);

    @Override
    public final void A(Object[] objectArray) {
        us us2 = (us)objectArray[0];
        long l10 = (Long)objectArray[1];
        Object object = objectArray[2];
        Object object2 = objectArray[3];
        Object object3 = objectArray[4];
        long l11 = l10 ^ 0x71A21AA1F8D7L;
        us2.x(this, object, object2, object3, l11);
    }

    @Override
    public abstract void y(Object[] var1);

    @Override
    public void Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x5BB79E261300L;
        m44.a("p", (Object)this, (long)l11, null, null, null, (long)-6142994150793286957L, (long)l10);
    }

    static {
        long l10 = prr.a(-7058995606527760616L, 8319321540421551513L, MethodHandles.lookup().lookupClass()).a(168033742358280L) ^ 0x41568D429059L;
        if (m44.a("m", (long)-6324113776399183611L, (long)l10) == null) {
            m44.a("m", "InpWLb", (long)-5908136160327020671L, (long)l10);
        }
    }
}

