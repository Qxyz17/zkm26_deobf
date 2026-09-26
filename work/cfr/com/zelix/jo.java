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

public class jo
extends jj
implements lbq,
rt {
    private String A;
    private String N;

    public jo(int n10) {
        super(n10);
    }

    @Override
    public void I(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("r", (Object)this, (String)string, (long)5375812603307878214L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void k(Object[] var1_1) {
        block11: {
            block9: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (lkc)var1_1[1];
                v0 = var3_2;
                v1 = v0 ^ 110751676517573L;
                var5_4 = (int)(v1 >>> 48);
                var6_5 = (int)(v1 << 16 >>> 32);
                var7_6 = (int)(v1 << 48 >>> 48);
                var8_7 = v0 ^ 5720202912539L;
                var10_8 = m44.a("j", (long)7374193648435527192L, (long)var3_2);
                try {
                    try {
                        v2 = m44.a("t", (Object)this, (long)7351834509481331674L, (long)var3_2);
                        if (var10_8 != null) break block9;
                        if (v2 != null) {
                        }
                        ** GOTO lbl41
                    }
                    catch (n9 v3) {
                        throw m44.a("j", (Object)v3, (long)7285313651496783216L, (long)var3_2);
                    }
                    v2 = m44.a("t", (Object)this, (long)7351834509481331674L, (long)var3_2);
                }
                catch (n9 v4) {
                    throw m44.a("j", (Object)v4, (long)7285313651496783216L, (long)var3_2);
                }
            }
            try {
                block10: {
                    try {
                        if (v2.length() <= 0) break block10;
                        v5 = new Object[3];
                        v5[2] = m44.a("t", (Object)this, (long)7351834509481331674L, (long)var3_2);
                        v5[1] = var8_7;
                        v5[0] = m44.a("t", (Object)this, (long)9218648034076938363L, (long)var3_2);
                        m44.a("u", (Object)var2_3, (Object)v5, (long)8898508124489347502L, (long)var3_2);
                        if (var10_8 == null) break block11;
                    }
                    catch (n9 v6) {
                        throw m44.a("j", (Object)v6, (long)7285313651496783216L, (long)var3_2);
                    }
                }
                v7 = new Object[4];
                v7[3] = (int)((short)var7_6);
                v7[2] = m44.a("t", (Object)this, (long)9218648034076938363L, (long)var3_2);
                v7[1] = var6_5;
                v7[0] = (int)((char)var5_4);
                m44.a("u", (Object)var2_3, (Object)v7, (long)8813212689798854458L, (long)var3_2);
            }
            catch (n9 v8) {
                throw m44.a("j", (Object)v8, (long)7285313651496783216L, (long)var3_2);
            }
        }
    }

    @Override
    protected void O(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        int n10 = (Integer)objectArray[2];
        long l10 = (Long)objectArray[3];
    }

    @Override
    public void U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)this, (String)string, (long)-1465278284417153986L, (long)l10);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

