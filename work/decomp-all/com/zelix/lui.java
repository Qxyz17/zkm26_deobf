/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.as;
import com.zelix.lmc;
import com.zelix.lqd;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.wa;
import java.lang.invoke.MethodHandles;

public class lui
extends lmc {
    final wa G;
    private static final long a = prr.a((long)-8370065167282125759L, (long)-8276144205200014700L, MethodHandles.lookup().lookupClass()).a(197970249243004L);

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x56B22D5AB9DEL;
        long l4 = l2 ^ 0x7DF00FAAC8F2L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = false;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5565655387731140412L, (long)l), (Object)objectArray2, (long)6230706247764054053L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5565655387731140412L, (long)l), (Object)objectArray3, (long)5383093239249358332L, (long)l);
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x4BCCDE3014ABL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (Integer)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)2354466140456389930L, (long)l);
    }

    lui(wa wa2) {
        this.G = wa2;
    }

    /*
     * Unable to fully structure code
     */
    public void L(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Integer)var1_1[0];
                var3_3 = (Long)var1_1[1];
                v0 = var3_3 = lui.a ^ var3_3;
                v1 = v0 ^ 85951253819383L;
                var5_4 = (int)(v1 >>> 32);
                var6_5 = (int)(v1 << 32 >>> 48);
                var7_6 = (int)(v1 << 48 >>> 48);
                var8_7 = v0 ^ 40233605531241L;
                v2 = v0 ^ 425662256005L;
                var10_8 = (int)(v2 >>> 32);
                var11_9 = (int)(v2 << 32 >>> 48);
                var12_10 = (int)(v2 << 48 >>> 48);
                var13_11 = v0 ^ 92940166426568L;
                var15_12 = v0 ^ 98180093043535L;
                v3 = m44.a("m", (long)7390421857035161696L, (long)var3_3);
                v4 = new Object[1];
                v4[0] = var15_12;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)7385915127533352065L, (long)var3_3), (Object)v4, (long)6992316145948223041L, (long)var3_3);
                var18_13 = var2_2;
                var17_14 = v3;
                try {
                    v5 = var18_13;
                    v6 = m44.a("i", (long)7272644404358431133L, (long)var3_3);
                    if (var17_14 != null) break block8;
                    if (v5 == v6) {
                    }
                    ** GOTO lbl48
                }
                catch (n9 v7) {
                    throw m44.a("m", (Object)v7, (long)7265900177760220579L, (long)var3_3);
                }
                v8 = new Object[1];
                v8[0] = var8_7;
                var19_15 = m44.a("r", (Object)m44.a("s", (Object)this, (long)7385915127533352065L, (long)var3_3), (Object)v8, (long)9185821216520758180L, (long)var3_3);
                try {
                    v9 = new Object[2];
                    v9[1] = m44.a("s", (Object)this, (long)7385915127533352065L, (long)var3_3);
                    v9[0] = var13_11;
                    new mu((wa)m44.a("s", (Object)this, (long)7385915127533352065L, (long)var3_3), var10_8, (lqu)var19_15, (short)var11_9, var12_10, (as)m44.a("m", (Object)v9, (long)7048092426515209718L, (long)var3_3));
                    if (var17_14 == null) break block9;
lbl48:
                    // 2 sources

                    v5 = var18_13;
                    v6 = m44.a("i", (long)8919422326407355035L, (long)var3_3);
                }
                catch (n9 v10) {
                    throw m44.a("m", (Object)v10, (long)7265900177760220579L, (long)var3_3);
                }
            }
            try {
                if (v5 == v6) {
                    v11 = new Object[2];
                    v11[1] = m44.a("s", (Object)this, (long)7385915127533352065L, (long)var3_3);
                    v11[0] = var13_11;
                    new lqd((wa)m44.a("s", (Object)this, (long)7385915127533352065L, (long)var3_3), var5_4, (short)var6_5, (as)m44.a("m", (Object)v11, (long)7048092426515209718L, (long)var3_3), (short)var7_6);
                }
            }
            catch (n9 v12) {
                throw m44.a("m", (Object)v12, (long)7265900177760220579L, (long)var3_3);
            }
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
