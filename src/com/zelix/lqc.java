/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._f;
import com.zelix.hf;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class lqc
implements Comparator {
    final hf L;
    private static final long a = prr.a((long)1643596525933191251L, (long)4771781467981305233L, MethodHandles.lookup().lookupClass()).a(96903179318942L);

    lqc(hf hf2) {
        this.L = hf2;
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x2407C7622C28L;
        long l2 = l ^ 0x4D7DC92EBF90L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (_4)object2;
        objectArray[1] = (_4)object;
        objectArray[0] = l2;
        return (int)m44.a("t", (Object)this, (Object)objectArray, (long)-2862617928010985267L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public int J(Object[] var1_1) {
        block30: {
            block31: {
                block28: {
                    block29: {
                        block26: {
                            block24: {
                                block25: {
                                    var4_2 = (Long)var1_1[0];
                                    var2_3 = (_4)var1_1[1];
                                    var3_4 = (_4)var1_1[2];
                                    var4_2 = lqc.a ^ var4_2;
                                    var6_5 = m44.a("o", (long)-7442635361172653830L, (long)var4_2);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v0 = var2_3 instanceof _f;
                                                    if (var6_5 != null) break block24;
                                                    if (v0 == 0) break block25;
                                                }
                                                catch (n9 v1) {
                                                    throw m44.a("o", (Object)v1, (long)-7126340385739210254L, (long)var4_2);
                                                }
                                                v0 = var3_4 instanceof _f;
                                                v2 = var6_5;
                                                if (var4_2 >= 0L) {
                                                    if (v2 != null) break block24;
                                                }
                                                ** GOTO lbl40
                                            }
                                            catch (n9 v3) {
                                                throw m44.a("o", (Object)v3, (long)-7126340385739210254L, (long)var4_2);
                                            }
                                            if (v0 != 0) break block25;
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("o", (Object)v4, (long)-7126340385739210254L, (long)var4_2);
                                        }
                                        return -1;
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("o", (Object)v5, (long)-7126340385739210254L, (long)var4_2);
                                    }
                                }
                                v0 = var2_3 instanceof _f;
                            }
                            try {
                                block27: {
                                    try {
                                        try {
                                            try {
                                                v2 = var6_5;
lbl40:
                                                // 2 sources

                                                if (var4_2 > 0L) {
                                                    if (v2 != null) break block26;
                                                    if (v0 == 0) break block27;
                                                }
                                                ** GOTO lbl66
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("o", (Object)v6, (long)-7126340385739210254L, (long)var4_2);
                                            }
                                            v7 = var3_4 instanceof _f;
                                            if (var6_5 != null) break block28;
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("o", (Object)v8, (long)-7126340385739210254L, (long)var4_2);
                                        }
                                        if (v7 != 0) break block29;
                                    }
                                    catch (n9 v9) {
                                        throw m44.a("o", (Object)v9, (long)-7126340385739210254L, (long)var4_2);
                                    }
                                }
                                v0 = var2_3 instanceof _f;
                            }
                            catch (n9 v10) {
                                throw m44.a("o", (Object)v10, (long)-7126340385739210254L, (long)var4_2);
                            }
                        }
                        try {
                            try {
                                try {
                                    v2 = var6_5;
lbl66:
                                    // 2 sources

                                    if (v2 != null) break block30;
                                    if (v0 != 0) break block31;
                                }
                                catch (n9 v11) {
                                    throw m44.a("o", (Object)v11, (long)-7126340385739210254L, (long)var4_2);
                                }
                                v0 = var3_4 instanceof _f;
                                if (var6_5 != null) break block30;
                            }
                            catch (n9 v12) {
                                throw m44.a("o", (Object)v12, (long)-7126340385739210254L, (long)var4_2);
                            }
                            if (v0 != 0) break block31;
                        }
                        catch (n9 v13) {
                            throw m44.a("o", (Object)v13, (long)-7126340385739210254L, (long)var4_2);
                        }
                    }
                    v7 = 0;
                }
                return v7;
            }
            v0 = 1;
        }
        return v0;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
