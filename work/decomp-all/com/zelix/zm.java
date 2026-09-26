/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.q2;
import com.zelix.zj;
import java.lang.invoke.MethodHandles;

public class zm
extends zj {
    private static final long a = prr.a((long)4185174143912657202L, (long)6454934121473135907L, MethodHandles.lookup().lookupClass()).a(36897894998198L);

    public zm(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x6F65CA284053L;
        super(l2, n);
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x301A57292283L;
        long l5 = l2 ^ 0x4D8052C494B9L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        q2 q22 = (q2)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1797704930665120443L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-1785247222142810516L, (long)l);
        objectArray4[0] = l4;
        m44.a("r", (Object)q22, (Object)objectArray4, (long)-179123977251323611L, (long)l);
    }
}
