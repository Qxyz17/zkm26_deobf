/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

public class zr {
    protected boolean e;

    public void I(boolean bl) {
        this.e = bl;
    }

    public zr(boolean bl) {
        this.e = bl;
    }

    public boolean S() {
        return this.e;
    }

    public zr() {
        this(false);
    }

    public Object clone() {
        return new zr(this.e);
    }
}
