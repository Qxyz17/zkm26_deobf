/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._v;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lki {
    private final _v B;
    private final boolean a;
    private static final long b = prr.a((long)-2211972020730189942L, (long)4581589398988945840L, MethodHandles.lookup().lookupClass()).a(36502660711033L);

    public String toString() {
        long l = b ^ 0x61E293972AABL;
        long l2 = l ^ 0x4EAB65781F0FL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return m44.a("q", (Object)this, (Object)objectArray, (long)5640558797334543285L, (long)l);
    }

    public String R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x154175DA9AF4L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("t", (Object)m44.a("u", (Object)this, (long)2679875446996854913L, (long)l), (Object)objectArray2, (long)2371288502233667283L, (long)l);
    }

    public _v R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("t", (Object)this, (long)5886713246419688448L, (long)l);
    }

    public lki(_v _v2, boolean bl) {
        this.B = _v2;
        this.a = bl;
    }

    public boolean Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (boolean)m44.a("w", (Object)this, (long)-8818018540859930633L, (long)l);
    }
}
