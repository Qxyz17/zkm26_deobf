/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmw;
import com.zelix.m44;

public class z
implements lmw {
    private final String Y;

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public z(String string) {
        this.Y = string;
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public String U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8437604065468707979L, (long)l);
    }

    public String D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("r", (Object)this, (long)8569485970194176361L, (long)l);
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("t", (Object)this, (long)7332670563052816967L, (long)l);
    }

    public String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)258550957949348883L, (long)l);
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return -1;
    }
}
