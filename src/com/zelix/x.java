/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bf;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class x
implements Comparator {
    private static final long a = prr.a((long)-1383501932591737862L, (long)-8943747428587932163L, MethodHandles.lookup().lookupClass()).a(1404310053973L);

    x() {
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x50D9D8A2A2CEL;
        long l2 = l ^ 0x77A4A0CDF5DBL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (bf)object2;
        objectArray[1] = (bf)object;
        objectArray[0] = l2;
        return (int)m44.a("r", (Object)this, (Object)objectArray, (long)8494567045771822374L, (long)l);
    }

    public int k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        bf bf2 = (bf)objectArray[1];
        bf bf3 = (bf)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x460991870AEDL;
        String string = bf2.d(l2);
        String string2 = bf3.d(l2);
        return string.compareTo(string2);
    }
}
