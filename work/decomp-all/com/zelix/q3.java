/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lk4;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.qf;
import com.zelix.vd;
import java.lang.invoke.MethodHandles;

public class q3
extends vd
implements lk4 {
    private static final long a = prr.a((long)-8414254982801119613L, (long)4306680052882191109L, MethodHandles.lookup().lookupClass()).a(59811521938433L);

    /*
     * Unable to fully structure code
     */
    public void X(Object[] var1_1) {
        var3_2 = (fu)var1_1[0];
        var4_3 = (Long)var1_1[1];
        var2_4 = (lqq)var1_1[2];
        v0 = var4_3;
        var6_5 = v0 ^ 122772112358678L;
        var8_6 = v0 ^ 0L;
        var10_7 = v0 ^ 94038206132601L;
        v1 = new Object[1];
        v1[0] = var10_7;
        var13_8 = m44.a("r", (Object)this, (Object)v1, (long)-2296489199898713612L, (long)var4_3);
        var12_9 = m44.a("m", (long)-1921333740741510316L, (long)var4_3);
        var14_10 = 0;
        while (var14_10 < var13_8) {
            v2 = new Object[2];
            v2[1] = var6_5;
            v2[0] = var14_10;
            v3 = new Object[3];
            v3[2] = var2_4;
            v3[1] = var8_6;
            v3[0] = this;
            m44.a("r", (Object)m44.a("r", (Object)this, (Object)v2, (long)-1931359190408154321L, (long)var4_3), (Object)v3, (long)-1954679020144143401L, (long)var4_3);
            ++var14_10;
lbl28:
            // 2 sources

            ** while (var12_9 != null)
lbl29:
            // 1 sources

        }
lbl30:
        // 2 sources

        if (var4_3 <= 0L) ** GOTO lbl28
    }

    public boolean N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x751274201184L;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        qf qf2 = (qf)m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)4240174468556742800L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = string;
        objectArray3[0] = l4;
        return (boolean)m44.a("w", (Object)qf2, (Object)objectArray3, (long)2686048967190680774L, (long)l);
    }

    public q3(int n, int n2, char c, short s) {
        long l = ((long)n2 << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x3C2F51362A50L;
        super(l2, n);
    }

    public boolean F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x7E1C4EB9B01L;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        qf qf2 = (qf)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-5738339343990593003L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = string;
        objectArray3[0] = l4;
        return (boolean)m44.a("r", (Object)qf2, (Object)objectArray3, (long)-5931595773588131196L, (long)l);
    }
}
