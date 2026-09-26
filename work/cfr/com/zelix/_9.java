/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.df;
import com.zelix.gu;
import com.zelix.iq;
import com.zelix.lmt;
import com.zelix.m44;
import com.zelix.m7;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class _9
extends _4
implements lmt {
    int H;
    boolean M = true;
    iq k;

    @Override
    public final void d(Integer n10, iq iq2, long l10) {
        this.k = iq2;
    }

    @Override
    public void X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l11 = l10 ^ 0x6F3E14B71D18L;
        long l12 = l11 >>> 16;
        int n10 = (int)(l11 << 48 >>> 48);
        df2.L(l12, (char)n10, this.k, this);
    }

    final boolean G(Object[] objectArray) {
        return this.M;
    }

    @Override
    abstract void z(gu var1, long var2);

    public abstract int y(char var1, long var2);

    public iq X(Object[] objectArray) {
        return this.k;
    }

    _9(_4 _42) {
        super(_42);
    }

    @Override
    public m7 i(long l10) {
        return m44.a("k", (long)-5829862097247894580L, (long)l10);
    }
}

