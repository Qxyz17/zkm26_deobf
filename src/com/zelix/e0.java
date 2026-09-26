/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sh;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class e0
implements Comparator {
    final sh m;
    private static final long a = prr.a((long)894211693465718598L, (long)5938049201005720975L, MethodHandles.lookup().lookupClass()).a(82069743552093L);

    e0(sh sh2) {
        this.m = sh2;
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x75BD7A4AB2ECL;
        Object[] objectArray = new Object[2];
        objectArray[1] = (lq0)object2;
        objectArray[0] = (lq0)object;
        return (int)m44.a("w", (Object)this, (Object)objectArray, (long)1982791167297884355L, (long)l);
    }

    public int L(Object[] objectArray) {
        lq0 lq02 = (lq0)objectArray[0];
        lq0 lq03 = (lq0)objectArray[1];
        return (Integer)lq02.D() - (Integer)lq03.D();
    }
}
