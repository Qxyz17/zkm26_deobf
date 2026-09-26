/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lbi;
import com.zelix.lq5;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zj;
import java.lang.invoke.MethodHandles;

public class za
extends zj
implements lq5 {
    private boolean m;
    private static final long a = prr.a((long)-2077005766908842891L, (long)-576211078874310110L, MethodHandles.lookup().lookupClass()).a(156335636906913L);

    public za(int n, long l) {
        long l2 = (l = a ^ l) ^ 0xA0F6BF21F78L;
        super(l2, n);
    }

    public void S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        m44.a("s", (Object)((Object)this), (boolean)true, (long)4295688018399226512L, (long)l);
    }

    public void X(Object[] objectArray) {
        String string;
        StringBuilder stringBuilder;
        lbi lbi2;
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x72894D06DF64L;
        long l5 = l2 ^ 0x4D8052C494B9L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        lbi lbi3 = (lbi)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1797704930665120443L, (long)l);
        try {
            lbi2 = lbi3;
            stringBuilder = new StringBuilder();
            string = m44.a("s", (Object)((Object)this), (long)-60970026360984022L, (long)l) != false ? "!" : "";
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)((Object)n92), (long)-2246730488954915025L, (long)l);
        }
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = stringBuilder.append(string).append((String)((Object)m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-1785247222142810516L, (long)l))).toString();
        objectArray4[0] = l4;
        m44.a("r", (Object)lbi2, (Object)objectArray4, (long)-101711727008098489L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
