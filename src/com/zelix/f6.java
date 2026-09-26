/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.f5;
import com.zelix.lku;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class f6
implements Comparator {
    final lku C;
    private static final long a = prr.a((long)3256641519142974051L, (long)-1537464920152868230L, MethodHandles.lookup().lookupClass()).a(191519465924889L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x66E30785ACB6L;
        long l2 = l ^ 0x2F7F0BC68CFFL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (f5)object2;
        objectArray[1] = l2;
        objectArray[0] = (f5)object;
        return (int)m44.a("w", (Object)this, (Object)objectArray, (long)4864554159371557489L, (long)l);
    }

    public int l(Object[] objectArray) {
        f5 f52 = (f5)objectArray[0];
        long l = (Long)objectArray[1];
        f5 f53 = (f5)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x2765A5690F56L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l2;
        return (int)(m44.a("q", (Object)f52, (Object)objectArray2, (long)3919807082491194277L, (long)l) - m44.a("q", (Object)f53, (Object)objectArray3, (long)3919807082491194277L, (long)l));
    }

    f6(lku lku2) {
        this.C = lku2;
    }
}
