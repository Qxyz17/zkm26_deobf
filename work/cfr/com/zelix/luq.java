/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gs;
import com.zelix.lmc;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import com.zelix.sz;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public class luq
extends lmc {
    final mq u;
    private static final long a = prr.a(5224095302387305209L, 2256627026209171324L, MethodHandles.lookup().lookupClass()).a(135881411859052L);

    luq(mq mq2) {
        this.u = mq2;
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x24FB2D7AD9B5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5271267815089173920L, (long)l10), (Object)objectArray2, (long)6119582912316436286L, (long)l10);
    }

    public void V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        gs[] gsArray = (gs[])objectArray[1];
        lqw[] lqwArray = (lqw[])objectArray[2];
        gs[] gsArray2 = (gs[])objectArray[3];
        gs[] gsArray3 = (gs[])objectArray[4];
        gs[] gsArray4 = (gs[])objectArray[5];
        sz sz2 = (sz)objectArray[6];
        long l11 = (l10 = a ^ l10) ^ 0x56630DBDECDCL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = 2;
        objectArray2[4] = m44.a("h", (boolean)m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-2024612207371395232L, (long)l10), (long)-1993240588394682132L, (long)l10), (long)-2114357550610709644L, (long)l10), (long)-160701848820800108L, (long)l10);
        objectArray2[3] = l11;
        objectArray2[2] = sz2;
        objectArray2[1] = gsArray;
        objectArray2[0] = m44.a("v", (Object)this, (long)-2024612207371395232L, (long)l10);
        m44.a("h", (Object)objectArray2, (long)-2117460420288391560L, (long)l10);
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
        long l11 = l10 ^ 0x2B82BF436666L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = (Set)object8;
        objectArray2[7] = (Boolean)object7;
        objectArray2[6] = (sz)object6;
        objectArray2[5] = (gs[])object5;
        objectArray2[4] = (gs[])object4;
        objectArray2[3] = l11;
        objectArray2[2] = (gs[])object3;
        objectArray2[1] = (lqw[])object2;
        objectArray2[0] = (gs[])object;
        m44.a("q", (Object)this, (Object)objectArray2, (long)2391194591084118340L, (long)l10);
    }

    public void Y(Object[] objectArray) {
        gs[] gsArray = (gs[])objectArray[0];
        lqw[] lqwArray = (lqw[])objectArray[1];
        gs[] gsArray2 = (gs[])objectArray[2];
        long l10 = (Long)objectArray[3];
        gs[] gsArray3 = (gs[])objectArray[4];
        gs[] gsArray4 = (gs[])objectArray[5];
        sz sz2 = (sz)objectArray[6];
        Boolean bl2 = (Boolean)objectArray[7];
        Set set = (Set)objectArray[8];
        long l11 = (l10 = a ^ l10) ^ 0x172249E8CC0BL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = 1;
        objectArray2[4] = bl2;
        objectArray2[3] = l11;
        objectArray2[2] = sz2;
        objectArray2[1] = gsArray;
        objectArray2[0] = m44.a("q", (Object)this, (long)-4381896137529851977L, (long)l10);
        m44.a("o", (Object)objectArray2, (long)-4446735402118154577L, (long)l10);
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
        long l11 = l10 ^ 0x3A6D957C1820L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = (sz)object6;
        objectArray2[5] = (gs[])object5;
        objectArray2[4] = (gs[])object4;
        objectArray2[3] = (gs[])object3;
        objectArray2[2] = (lqw[])object2;
        objectArray2[1] = (gs[])object;
        objectArray2[0] = l11;
        m44.a("p", (Object)this, (Object)objectArray2, (long)9142205737714097026L, (long)l10);
    }
}

