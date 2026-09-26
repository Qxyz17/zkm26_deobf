/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.vd;
import com.zelix.zc;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class qz
extends vd {
    private static final long a = prr.a((long)5383476873578520616L, (long)-9096019933098399209L, MethodHandles.lookup().lookupClass()).a(104714067989409L);

    public qz(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x28C0D3D76748L;
        super(l2, n);
    }

    public void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x11C7289DCC51L;
        long l4 = l2 ^ 0x29C30BDCEEA8L;
        long l5 = l2 ^ 0x5AABA4B76A51L;
        long l6 = l2 ^ 0x7E1AD7C06276L;
        long l7 = l2 ^ 0x1CBE48057BAL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        zc zc2 = (zc)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1797704930665120443L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        m44.a("r", (Object)zc2, (Object)objectArray3, (long)-134138340303571120L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l6;
        m44.a("r", (Object)zc2, (Object)objectArray4, (long)-49304948392126963L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = "*";
        objectArray5[0] = l4;
        m44.a("r", (Object)zc2, (Object)objectArray5, (long)-419148599705842551L, (long)l);
        ArrayList<String> arrayList = new ArrayList<String>(1);
        arrayList.add("*");
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = arrayList;
        objectArray6[0] = l7;
        m44.a("r", (Object)zc2, (Object)objectArray6, (long)-1878656899211516127L, (long)l);
    }
}
