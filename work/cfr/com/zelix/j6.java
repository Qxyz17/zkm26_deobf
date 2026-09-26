/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7;
import com.zelix.lkc;
import com.zelix.zn;

public abstract class j6
extends l7 {
    protected String T;

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
    }

    protected void A(String string) {
        this.T = string;
    }

    public j6(int n10) {
        super(n10);
    }

    protected String A() {
        return this.T;
    }
}

