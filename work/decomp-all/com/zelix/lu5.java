/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gs;
import com.zelix.lmc;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.wa;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public class lu5
extends lmc {
    final wa i;
    private static final long a = prr.a((long)4940848753524801117L, (long)8029124040360150923L, MethodHandles.lookup().lookupClass()).a(251207506517192L);

    public void w(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        Object object3 = objectArray[2];
        Object object4 = objectArray[3];
        Object object5 = objectArray[4];
        Object object6 = objectArray[5];
        Object object7 = objectArray[6];
        Object object8 = objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = l ^ 0x3C83D65ED7C4L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = (Set)object8;
        objectArray2[7] = (Boolean)object7;
        objectArray2[6] = (sz)object6;
        objectArray2[5] = (gs[])object5;
        objectArray2[4] = (gs[])object4;
        objectArray2[3] = (gs[])object3;
        objectArray2[2] = (lqw[])object2;
        objectArray2[1] = l2;
        objectArray2[0] = (gs[])object;
        m44.a("q", (Object)((Object)this), (Object)objectArray2, (long)2804940581368953964L, (long)l);
    }

    public void M(Object[] objectArray) {
        gs[] gsArray = (gs[])objectArray[0];
        long l = (Long)objectArray[1];
        lqw[] lqwArray = (lqw[])objectArray[2];
        gs[] gsArray2 = (gs[])objectArray[3];
        gs[] gsArray3 = (gs[])objectArray[4];
        gs[] gsArray4 = (gs[])objectArray[5];
        sz sz2 = (sz)objectArray[6];
        Boolean bl = (Boolean)objectArray[7];
        Set set = (Set)objectArray[8];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x23A5FA520703L;
        long l4 = l2 ^ 0x5521CDE3004BL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = false;
        m44.a("r", (Object)m44.a("s", (Object)((Object)this), (long)-1295932726292381727L, (long)l), (Object)objectArray2, (long)-1681356388900524296L, (long)l);
        Object[] objectArray3 = new Object[9];
        objectArray3[8] = null;
        objectArray3[7] = set;
        objectArray3[6] = bl;
        objectArray3[5] = l4;
        objectArray3[4] = sz2;
        objectArray3[3] = gsArray3;
        objectArray3[2] = gsArray2;
        objectArray3[1] = lqwArray;
        objectArray3[0] = gsArray;
        m44.a("r", (Object)m44.a("s", (Object)((Object)this), (long)-1295932726292381727L, (long)l), (Object)objectArray3, (long)-622159048568435248L, (long)l);
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x56B22D5AB9DEL;
        long l4 = l2 ^ 0x6B1405C8C05L;
        long l5 = l2 ^ 0x703C0BA1C475L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = false;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5827263308629098812L, (long)l), (Object)objectArray2, (long)6230706247764054053L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("v", (Object)((Object)this), (long)5827263308629098812L, (long)l);
        objectArray3[0] = l5;
        Object[] objectArray4 = new Object[9];
        objectArray4[8] = null;
        objectArray4[7] = null;
        objectArray4[6] = m44.a("h", (boolean)m44.a("w", (Object)m44.a("h", (Object)objectArray3, (long)5364629396746696267L, (long)l), (long)5217460610967316916L, (long)l), (long)6270555837721874260L, (long)l);
        objectArray4[5] = null;
        objectArray4[4] = null;
        objectArray4[3] = null;
        objectArray4[2] = null;
        objectArray4[1] = m44.a("v", (Object)((Object)this), (long)5827263308629098812L, (long)l);
        objectArray4[0] = l4;
        m44.a("h", (Object)objectArray4, (long)5320848584793648394L, (long)l);
    }

    lu5(wa wa2) {
        this.i = wa2;
    }
}
