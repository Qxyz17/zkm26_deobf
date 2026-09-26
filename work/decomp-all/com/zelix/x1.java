/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class x1
implements Comparator {
    private static final x1 z;
    private static final long a;

    private x1() {
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x42FCEC17E8DAL;
        long l2 = l ^ 0x6423E5AF6306L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (String)object2;
        objectArray[1] = (String)object;
        objectArray[0] = l2;
        return (int)m44.a("v", (Object)this, (Object)objectArray, (long)-9044318275981491510L, (long)l);
    }

    static {
        a = prr.a((long)4880999881036470261L, (long)2314239601671783686L, MethodHandles.lookup().lookupClass()).a(100544880744914L);
        z = new x1();
    }

    public static x1 d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("k", (long)-8382317874043197384L, (long)l);
    }

    public int p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        l = a ^ l;
        return (int)m44.a("t", (Object)string, (Object)string2, (long)-8807041134298413567L, (long)l);
    }
}
