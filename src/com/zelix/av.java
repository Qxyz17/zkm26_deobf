/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ar;
import com.zelix.e_;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class av
implements e_ {
    private static av P;
    private static final long b;

    static {
        b = prr.a((long)3857612025437628356L, (long)-3365105013101868147L, MethodHandles.lookup().lookupClass()).a(33120408090261L);
        long l = b ^ 0x202BD8F02C4BL;
        m44.a("l", (av)new ar(), (long)-3629465743962540026L, (long)l);
    }

    public void w(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        Object object3 = objectArray[2];
        Object object4 = objectArray[3];
        Object object5 = objectArray[4];
        Object object6 = objectArray[5];
        Object object7 = objectArray[6];
        Object object8 = objectArray[7];
        long l = (Long)objectArray[8];
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
    }

    public void j(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        Object object2 = objectArray[2];
        Object object3 = objectArray[3];
        Object object4 = objectArray[4];
        Object object5 = objectArray[5];
        Object object6 = objectArray[6];
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
    }

    public static av p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("n", (long)-6979252045433755005L, (long)l);
    }

    public void W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        Object object2 = objectArray[2];
        Object object3 = objectArray[3];
    }
}
