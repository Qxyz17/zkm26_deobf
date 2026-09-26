/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lke;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.Map;

public class log
implements Comparator {
    final lke P;
    private static final long a = prr.a(2080853505237481681L, -3452738339307199536L, MethodHandles.lookup().lookupClass()).a(128509245342880L);

    log(lke lke2) {
        this.P = lke2;
    }

    public int R(Object[] objectArray) {
        Map.Entry entry = (Map.Entry)objectArray[0];
        Map.Entry entry2 = (Map.Entry)objectArray[1];
        String string = (String)entry.getKey();
        String string2 = (String)entry2.getKey();
        return string.compareTo(string2);
    }

    public int compare(Object object, Object object2) {
        long l10 = a ^ 0x328D07B46B8CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = (Map.Entry)object2;
        objectArray[0] = (Map.Entry)object;
        return (int)m44.a("r", (Object)this, (Object)objectArray, (long)4618393462497574737L, (long)l10);
    }
}

