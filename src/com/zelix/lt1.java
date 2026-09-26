/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7k;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.MethodHandles;
import java.util.Vector;

public class lt1
extends l7t
implements r5 {
    Vector q;
    private static final long a = prr.a((long)-1827003661634368370L, (long)-4882836699407326855L, MethodHandles.lookup().lookupClass()).a(68015592440675L);

    public lt1(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x78A2285DAFC8L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
        m44.a("p", (Object)((Object)this), new Vector(), (long)-5241868275302371165L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void M(Object[] var1_1) {
        block8: {
            var2_2 = (lmu)var1_1[0];
            var5_3 = (lqu)var1_1[1];
            var3_4 = (Long)var1_1[2];
            v0 = var3_4;
            var6_5 = v0 ^ 140521162447009L;
            var8_6 = v0 ^ 78419313187334L;
            var10_7 = v0 ^ 0L;
            v1 = new Object[1];
            v1[0] = var8_6;
            var13_8 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var3_4);
            var12_9 = m44.a("h", (long)-6823249310977527178L, (long)var3_4);
            var14_10 = 0;
            block2: while (var14_10 < var13_8) {
                try {
                    do {
                        if (var3_4 > 0L) {
                            v2 = this.V(var14_10);
                            if (var12_9 != false) break block8;
                            v3 = new Object[3];
                            v3[2] = var10_7;
                            v3[1] = var5_3;
                            v3[0] = this;
                            m44.a("w", (Object)v2, (Object)v3, (long)-6656114929610942631L, (long)var3_4);
                            ++var14_10;
                        }
                        if (var12_9 == false) continue block2;
                    } while (var3_4 <= 0L);
                    break;
                }
                catch (n9 v4) {
                    throw m44.a("h", (Object)v4, (long)-6603743913873465264L, (long)var3_4);
                }
            }
            v2 = var2_2;
        }
        var14_11 = (l7k)v2;
        var15_12 = 0;
        while (var15_12 < m44.a("v", (Object)this, (long)-6663824418940033945L, (long)var3_4).size()) {
            v5 = new Object[2];
            v5[1] = var6_5;
            v5[0] = (String)m44.a("v", (Object)this, (long)-6663824418940033945L, (long)var3_4).elementAt(var15_12);
            m44.a("w", (Object)var14_11, (Object)v5, (long)-4828197048436069748L, (long)var3_4);
            ++var15_12;
lbl45:
            // 2 sources

            ** while (var12_9 != false)
lbl46:
            // 1 sources

        }
lbl47:
        // 2 sources

        if (var3_4 <= 0L) ** GOTO lbl45
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        ((Vector)((Object)m44.a("q", (Object)((Object)this), (long)-7804116183913376688L, (long)l))).addElement(string);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
