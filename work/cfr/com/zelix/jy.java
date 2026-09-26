/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jj;
import com.zelix.lbq;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.rt;
import com.zelix.zn;

public class jy
extends jj
implements lbq,
rt {
    private String f;
    private String h;

    public jy(int n10) {
        super(n10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void k(Object[] var1_1) {
        block11: {
            block10: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (lkc)var1_1[1];
                v0 = var2_2;
                var5_4 = v0 ^ 108865596880192L;
                var7_5 = v0 ^ 135377473409288L;
                var9_6 = m44.a("j", (long)7374193648435527192L, (long)var2_2);
                try {
                    try {
                        v1 = m44.a("t", (Object)this, (long)7220190905432509931L, (long)var2_2);
                        if (var9_6 != null) break block10;
                        if (v1 != null) {
                        }
                        ** GOTO lbl37
                    }
                    catch (n9 v2) {
                        throw m44.a("j", (Object)v2, (long)8754311964635898830L, (long)var2_2);
                    }
                    v1 = m44.a("t", (Object)this, (long)7220190905432509931L, (long)var2_2);
                }
                catch (n9 v3) {
                    throw m44.a("j", (Object)v3, (long)8754311964635898830L, (long)var2_2);
                }
            }
            try {
                try {
                    if (v1.length() <= 0) ** GOTO lbl37
                    v4 = new Object[3];
                    v4[2] = var7_5;
                    v4[1] = m44.a("t", (Object)this, (long)7220190905432509931L, (long)var2_2);
                    v4[0] = m44.a("t", (Object)this, (long)8958661792600182300L, (long)var2_2);
                    m44.a("u", (Object)var4_3, (Object)v4, (long)8845215725739138629L, (long)var2_2);
                    if (var9_6 != null) {
                    }
                    break block11;
                }
                catch (n9 v5) {
                    throw m44.a("j", (Object)v5, (long)8754311964635898830L, (long)var2_2);
                }
lbl37:
                // 3 sources

                v6 = new Object[2];
                v6[1] = m44.a("t", (Object)this, (long)8958661792600182300L, (long)var2_2);
                v6[0] = var5_4;
                m44.a("u", (Object)var4_3, (Object)v6, (long)7275426249645390718L, (long)var2_2);
            }
            catch (n9 v7) {
                throw m44.a("j", (Object)v7, (long)8754311964635898830L, (long)var2_2);
            }
        }
    }

    @Override
    public void U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)this, (String)string, (long)-1722923940382844327L, (long)l10);
    }

    @Override
    public void I(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("r", (Object)this, (String)string, (long)5237416727090012535L, (long)l10);
    }

    @Override
    protected void O(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        int n10 = (Integer)objectArray[2];
        long l10 = (Long)objectArray[3];
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

