/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gs;
import com.zelix.lmc;
import com.zelix.lqd;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sz;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public class luj
extends lmc {
    final lqd h;
    private static final long a = prr.a(-6087840932708081211L, 12659812144978769L, MethodHandles.lookup().lookupClass()).a(26648438097680L);

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
        long l11 = l10 ^ 0xBE0204D575AL;
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
        m44.a("q", (Object)this, (Object)objectArray2, (long)4227837554564816821L, (long)l10);
    }

    public void z(Object[] objectArray) {
        gs[] gsArray = (gs[])objectArray[0];
        lqw[] lqwArray = (lqw[])objectArray[1];
        gs[] gsArray2 = (gs[])objectArray[2];
        gs[] gsArray3 = (gs[])objectArray[3];
        gs[] gsArray4 = (gs[])objectArray[4];
        sz sz2 = (sz)objectArray[5];
        Boolean bl2 = (Boolean)objectArray[6];
        Set set = (Set)objectArray[7];
        long l10 = (Long)objectArray[8];
        long l11 = (l10 = a ^ l10) ^ 0x646FE7B9BE30L;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = 1;
        objectArray2[8] = set;
        objectArray2[7] = bl2;
        objectArray2[6] = sz2;
        objectArray2[5] = gsArray3;
        objectArray2[4] = gsArray2;
        objectArray2[3] = lqwArray;
        objectArray2[2] = gsArray;
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("v", (Object)this, (long)1362269964836348128L, (long)l10);
        m44.a("h", (Object)objectArray2, (long)1553324886260250378L, (long)l10);
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
        long l11 = l10 ^ 0x2C82DFFA5C32L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = (sz)object6;
        objectArray2[5] = (gs[])object5;
        objectArray2[4] = (gs[])object4;
        objectArray2[3] = l11;
        objectArray2[2] = (gs[])object3;
        objectArray2[1] = (lqw[])object2;
        objectArray2[0] = (gs[])object;
        m44.a("p", (Object)this, (Object)objectArray2, (long)8696495081669534306L, (long)l10);
    }

    luj(lqd lqd2) {
        this.h = lqd2;
    }

    public void J(Object[] objectArray) {
        gs[] gsArray = (gs[])objectArray[0];
        lqw[] lqwArray = (lqw[])objectArray[1];
        gs[] gsArray2 = (gs[])objectArray[2];
        long l10 = (Long)objectArray[3];
        gs[] gsArray3 = (gs[])objectArray[4];
        gs[] gsArray4 = (gs[])objectArray[5];
        sz sz2 = (sz)objectArray[6];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x5CFD4CF317D1L;
        long l13 = l11 ^ 0x13A37664EBC9L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("w", (Object)this, (long)5124734207924139289L, (long)l10);
        objectArray2[0] = l12;
        Object[] objectArray3 = new Object[10];
        objectArray3[9] = 2;
        objectArray3[8] = null;
        objectArray3[7] = m44.a("i", (boolean)m44.a("v", (Object)m44.a("i", (Object)objectArray2, (long)5084143377608042550L, (long)l10), (long)4733615838640119917L, (long)l10), (long)6835469180832581261L, (long)l10);
        objectArray3[6] = sz2;
        objectArray3[5] = null;
        objectArray3[4] = null;
        objectArray3[3] = null;
        objectArray3[2] = gsArray;
        objectArray3[1] = l13;
        objectArray3[0] = m44.a("w", (Object)this, (long)5124734207924139289L, (long)l10);
        m44.a("i", (Object)objectArray3, (long)4645448780023177971L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3CEF0F11CCFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5676713469221436608L, (long)l10), (Object)objectArray2, (long)5437079250985013231L, (long)l10);
    }
}

