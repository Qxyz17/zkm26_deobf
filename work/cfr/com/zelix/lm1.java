/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gs;
import com.zelix.lmc;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.prr;
import com.zelix.sz;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public class lm1
extends lmc {
    final mu W;
    private static final long a = prr.a(-2475793015923902550L, -8863657909282438027L, MethodHandles.lookup().lookupClass()).a(159937296631076L);

    lm1(mu mu2) {
        this.W = mu2;
    }

    public void R(Object[] objectArray) {
        gs[] gsArray = (gs[])objectArray[0];
        lqw[] lqwArray = (lqw[])objectArray[1];
        gs[] gsArray2 = (gs[])objectArray[2];
        long l10 = (Long)objectArray[3];
        gs[] gsArray3 = (gs[])objectArray[4];
        gs[] gsArray4 = (gs[])objectArray[5];
        sz sz2 = (sz)objectArray[6];
        long l11 = (l10 = a ^ l10) ^ 0x32F59806DC7FL;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = 2;
        objectArray2[9] = null;
        objectArray2[8] = m44.a("m", (boolean)m44.a("r", (Object)m44.a("s", (Object)m44.a("s", (Object)this, (long)-3855300400801538354L, (long)l10), (long)-3926049648940088007L, (long)l10), (long)-3495633778173923679L, (long)l10), (long)-3454161825087584191L, (long)l10);
        objectArray2[7] = sz2;
        objectArray2[6] = null;
        objectArray2[5] = null;
        objectArray2[4] = l11;
        objectArray2[3] = null;
        objectArray2[2] = null;
        objectArray2[1] = gsArray;
        objectArray2[0] = m44.a("s", (Object)this, (long)-3855300400801538354L, (long)l10);
        m44.a("m", (Object)objectArray2, (long)-3597583332557707038L, (long)l10);
    }

    public void o(Object[] objectArray) {
        gs[] gsArray = (gs[])objectArray[0];
        lqw[] lqwArray = (lqw[])objectArray[1];
        gs[] gsArray2 = (gs[])objectArray[2];
        gs[] gsArray3 = (gs[])objectArray[3];
        gs[] gsArray4 = (gs[])objectArray[4];
        sz sz2 = (sz)objectArray[5];
        Boolean bl2 = (Boolean)objectArray[6];
        Set set = (Set)objectArray[7];
        long l10 = (Long)objectArray[8];
        long l11 = (l10 = a ^ l10) ^ 0x72C0FFCCB002L;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = 1;
        objectArray2[9] = set;
        objectArray2[8] = bl2;
        objectArray2[7] = sz2;
        objectArray2[6] = gsArray4;
        objectArray2[5] = gsArray3;
        objectArray2[4] = l11;
        objectArray2[3] = gsArray2;
        objectArray2[2] = lqwArray;
        objectArray2[1] = gsArray;
        objectArray2[0] = m44.a("v", (Object)this, (long)-6484488008014237005L, (long)l10);
        m44.a("h", (Object)objectArray2, (long)-6742010479880551265L, (long)l10);
    }

    @Override
    public void j(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        Object object2 = objectArray[2];
        Object object3 = objectArray[3];
        Object object4 = objectArray[4];
        Object object5 = objectArray[5];
        Object object6 = objectArray[6];
        long l11 = l10 ^ 0x3EA6618AF669L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = (sz)object6;
        objectArray2[5] = (gs[])object5;
        objectArray2[4] = (gs[])object4;
        objectArray2[3] = l11;
        objectArray2[2] = (gs[])object3;
        objectArray2[1] = (lqw[])object2;
        objectArray2[0] = (gs[])object;
        m44.a("p", (Object)this, (Object)objectArray2, (long)7013531418126788195L, (long)l10);
    }

    @Override
    public void w(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        Object object3 = objectArray[2];
        Object object4 = objectArray[3];
        Object object5 = objectArray[4];
        Object object6 = objectArray[5];
        Object object7 = objectArray[6];
        Object object8 = objectArray[7];
        long l10 = (Long)objectArray[8];
        long l11 = l10 ^ 0x2E3D682AC485L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = l11;
        objectArray2[7] = (Set)object8;
        objectArray2[6] = (Boolean)object7;
        objectArray2[5] = (sz)object6;
        objectArray2[4] = (gs[])object5;
        objectArray2[3] = (gs[])object4;
        objectArray2[2] = (gs[])object3;
        objectArray2[1] = (lqw[])object2;
        objectArray2[0] = (gs[])object;
        m44.a("q", (Object)this, (Object)objectArray2, (long)4090850148114935344L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5578306165627361755L, (long)l10), (Object)objectArray2, (long)5340913355038057039L, (long)l10);
    }
}

