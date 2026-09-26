/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._0;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.us;
import java.lang.invoke.MethodHandles;

public class s3
extends sz
implements us {
    private static final long b = prr.a((long)-4028011533336507525L, (long)-4425722096498203970L, MethodHandles.lookup().lookupClass()).a(250336826221579L);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void W(Object[] var1_1) {
        block14: {
            block17: {
                block15: {
                    block16: {
                        block13: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (_0)var1_1[1];
                            v0 = var2_2 = s3.b ^ var2_2;
                            var5_4 = v0 ^ 10364709709142L;
                            var7_5 = v0 ^ 51684611111535L;
                            var9_6 = v0 ^ 24000985808479L;
                            var11_7 = m44.a("m", (long)-2021268687078294075L, (long)var2_2);
                            try {
                                try {
                                    try {
                                        v1 /* !! */  = var4_3;
                                        if (var11_7 != null) break block13;
                                        if (v1 /* !! */  == this.i) break block14;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("m", (Object)v2, (long)-2062883129930568424L, (long)var2_2);
                                    }
                                    v3 = this;
                                    v4 = var11_7;
                                    if (var2_2 >= 0L) {
                                        if (v4 != null) break block15;
                                    }
                                    ** GOTO lbl50
                                }
                                catch (n9 v5) {
                                    throw m44.a("m", (Object)v5, (long)-2062883129930568424L, (long)var2_2);
                                }
                                v1 /* !! */  = v3.i;
                            }
                            catch (n9 v6) {
                                throw m44.a("m", (Object)v6, (long)-2062883129930568424L, (long)var2_2);
                            }
                        }
                        try {
                            if (var2_2 >= 0L) {
                                if (v1 /* !! */  == null) break block16;
                                v1 /* !! */  = this.i;
                            }
                            v7 = new Object[2];
                            v7[1] = var5_4;
                            v7[0] = this;
                            m44.a("r", (Object)v1 /* !! */ , (Object)v7, (long)-2116827059534595699L, (long)var2_2);
                        }
                        catch (n9 v8) {
                            throw m44.a("m", (Object)v8, (long)-2062883129930568424L, (long)var2_2);
                        }
                    }
                    super.Z(var9_6, (Object)var4_3);
                    v3 = var4_3;
                }
                try {
                    v4 = var11_7;
lbl50:
                    // 2 sources

                    if (v4 != null) break block17;
                    if (v3 == null) break block14;
                }
                catch (n9 v9) {
                    throw m44.a("m", (Object)v9, (long)-2062883129930568424L, (long)var2_2);
                }
                v3 = var4_3;
            }
            v10 = new Object[2];
            v10[1] = var7_5;
            v10[0] = this;
            m44.a("r", (Object)v3, (Object)v10, (long)-161972455743598872L, (long)var2_2);
        }
    }

    public _0 g(Object[] objectArray) {
        return (_0)super.t();
    }

    public void D(Object[] objectArray) {
        _0 _02 = (_0)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = b ^ l) ^ 0x5E7A759CB1DCL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = _02;
        objectArray2[0] = l2;
        m44.a("v", (Object)((Object)this), (Object)objectArray2, (long)2280641922196160382L, (long)l);
    }

    public void x(m m2, Object object, Object object2, Object object3, long l) {
        long l2 = l ^ 0x17F8D50A9A23L;
        this.I();
        this.T(l2, object, object2, object3);
    }

    public s3(long l) {
        long l2 = (l = b ^ l) ^ 0x17EF2A9EA654L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        super(n, (short)n2, (char)n3);
    }

    public void Z(long l, Object object) {
        long l2 = l ^ 0x4BAE5FA70F83L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = (_0)object;
        m44.a("u", (Object)((Object)this), (Object)objectArray, (long)6490056303481984939L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
