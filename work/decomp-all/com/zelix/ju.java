/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jj;
import com.zelix.lbq;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rt;
import com.zelix.zn;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class ju
extends jj
implements lbq,
rt {
    private String b;
    private List g;
    private static final long a = prr.a((long)6352365748315987738L, (long)-7241458019541310036L, MethodHandles.lookup().lookupClass()).a(103479313996679L);

    protected void O(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        int n = (Integer)objectArray[2];
        long l = (Long)objectArray[3];
    }

    /*
     * Unable to fully structure code
     */
    protected void k(Object[] var1_1) {
        block11: {
            block9: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (lkc)var1_1[1];
                v0 = var3_2;
                var5_4 = v0 ^ 62627803564366L;
                var7_5 = v0 ^ 67132728216245L;
                var9_6 = m44.a("j", (long)7374193648435527192L, (long)var3_2);
                try {
                    try {
                        v1 = m44.a("t", (Object)this, (long)7260936413421658933L, (long)var3_2);
                        if (var9_6 != null) break block9;
                        if (v1 != null) {
                        }
                        ** GOTO lbl37
                    }
                    catch (n9 v2) {
                        throw m44.a("j", (Object)v2, (long)7435490010569202959L, (long)var3_2);
                    }
                    v1 = m44.a("t", (Object)this, (long)7260936413421658933L, (long)var3_2);
                }
                catch (n9 v3) {
                    throw m44.a("j", (Object)v3, (long)7435490010569202959L, (long)var3_2);
                }
            }
            try {
                block10: {
                    try {
                        if (v1.length() <= 0) break block10;
                        v4 = new Object[3];
                        v4[2] = m44.a("t", (Object)this, (long)7260936413421658933L, (long)var3_2);
                        v4[1] = var5_4;
                        v4[0] = m44.a("t", (Object)this, (long)8734372415156718367L, (long)var3_2);
                        m44.a("u", (Object)var2_3, (Object)v4, (long)7072933008163171724L, (long)var3_2);
                        if (var9_6 == null) break block11;
                    }
                    catch (n9 v5) {
                        throw m44.a("j", (Object)v5, (long)7435490010569202959L, (long)var3_2);
                    }
                }
                v6 = new Object[2];
                v6[1] = var7_5;
                v6[0] = m44.a("t", (Object)this, (long)8734372415156718367L, (long)var3_2);
                m44.a("u", (Object)var2_3, (Object)v6, (long)7476907973255785000L, (long)var3_2);
            }
            catch (n9 v7) {
                throw m44.a("j", (Object)v7, (long)7435490010569202959L, (long)var3_2);
            }
        }
    }

    public ju(int n, long l) {
        l = a ^ l;
        super(n);
        m44.a("v", (Object)((Object)this), new ArrayList(), (long)-7314216246641104809L, (long)l);
    }

    public void I(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        m44.a("r", (Object)((Object)this), (String)string, (long)5212996484544221097L, (long)l);
    }

    public void U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("q", (Object)((Object)this), (long)-1336504977461764262L, (long)l).add(string);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
