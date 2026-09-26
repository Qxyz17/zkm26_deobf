/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.vd;
import com.zelix.zs;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class q0
extends vd {
    private static final long a = prr.a((long)-2111578120786280470L, (long)-6854458559960328471L, MethodHandles.lookup().lookupClass()).a(61102846434154L);

    public q0(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x73EC4CBCC752L;
        super(l2, n);
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x29C30BDCEEA8L;
        long l5 = l2 ^ 0x64ACDC487927L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        zs zs2 = (zs)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1797704930665120443L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = "*";
        objectArray3[0] = l4;
        m44.a("r", (Object)zs2, (Object)objectArray3, (long)-88637396220146700L, (long)l);
        ArrayList<String> arrayList = new ArrayList<String>(1);
        arrayList.add("*");
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = arrayList;
        m44.a("r", (Object)zs2, (Object)objectArray4, (long)-2294563059060991216L, (long)l);
    }
}
