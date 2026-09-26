/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lq5;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ph;
import com.zelix.prr;
import com.zelix.zj;
import java.lang.invoke.MethodHandles;

public class zp
extends zj
implements lq5 {
    private boolean H;
    private static final long a = prr.a((long)7430239539122887244L, (long)-4822185958413240317L, MethodHandles.lookup().lookupClass()).a(161922183673424L);

    public void X(Object[] objectArray) {
        String string;
        StringBuilder stringBuilder;
        ph ph2;
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x78A41727EC46L;
        long l5 = l2 ^ 0x4D8052C494B9L;
        long l6 = l2 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = lqq2;
        objectArray2[1] = l6;
        objectArray2[0] = fu2;
        super.X(objectArray2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        ph ph3 = (ph)m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-1797704930665120443L, (long)l);
        try {
            ph2 = ph3;
            stringBuilder = new StringBuilder();
            string = m44.a("s", (Object)((Object)this), (long)-2292655829126453331L, (long)l) != false ? "!" : "";
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)((Object)n92), (long)-1881543644355102828L, (long)l);
        }
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l5;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = stringBuilder.append(string).append((String)((Object)m44.a("r", (Object)((Object)this), (Object)objectArray4, (long)-1785247222142810516L, (long)l))).toString();
        objectArray5[0] = l4;
        m44.a("r", (Object)ph2, (Object)objectArray5, (long)-2244527092477690433L, (long)l);
    }

    public void S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        m44.a("s", (Object)((Object)this), (boolean)true, (long)2635983196929958679L, (long)l);
    }

    public zp(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x247BFBFAC40AL;
        super(l2, n);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
