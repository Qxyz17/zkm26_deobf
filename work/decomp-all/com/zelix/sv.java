/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.d2;
import com.zelix.f_;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sd;
import com.zelix.us;
import java.lang.invoke.MethodHandles;

public class sv
extends sd
implements us,
f_ {
    String j;
    _4 p;
    private static final long f = prr.a((long)-8636219847166107498L, (long)-7072855557872777189L, MethodHandles.lookup().lookupClass()).a(140346300961044L);

    public _4 p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = f ^ l;
        return m44.a("r", (Object)((Object)this), (long)5885013016773692747L, (long)l);
    }

    sv(String string, _4 _42, long l) {
        l = f ^ l;
        m44.a("p", (Object)((Object)this), (String)string, (long)-1474008387570594658L, (long)l);
        m44.a("p", (Object)((Object)this), (_4)_42, (long)-624922065699787853L, (long)l);
    }

    public void N(Object[] objectArray) {
        m m2 = (m)objectArray[0];
        long l = (Long)objectArray[1];
        Object object = objectArray[2];
        Object object2 = objectArray[3];
        Object object3 = objectArray[4];
        long l2 = l ^ 0x4B8B6D1086F2L;
        this.I();
        this.T(l2, object, object2, object3);
    }

    String H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = f ^ l;
        return m44.a("t", (Object)((Object)this), (long)-6616618807984405704L, (long)l);
    }

    public void x(m m2, Object object, Object object2, Object object3, long l) {
        long l2 = l ^ 0x6DB16FE008E7L;
        new d2((f_)this, m2, object, object2, object3, l2);
    }
}
