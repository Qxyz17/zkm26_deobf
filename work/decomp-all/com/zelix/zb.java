/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.ze;
import com.zelix.zj;
import java.lang.invoke.MethodHandles;

public class zb
extends zj {
    private static final long a = prr.a((long)-714688842475710884L, (long)6668067276067431434L, MethodHandles.lookup().lookupClass()).a(274644202699989L);

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x4D8052C494B9L;
        long l5 = l2 ^ 0x64FA240FB652L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        ze ze2 = (ze)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1797704930665120443L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-1785247222142810516L, (long)l);
        m44.a("r", (Object)ze2, (Object)objectArray4, (long)-290222434290801815L, (long)l);
    }

    public zb(int n, short s, int n2, short s2) {
        long l = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x6CCB8084A8A8L;
        super(l2, n);
    }
}
