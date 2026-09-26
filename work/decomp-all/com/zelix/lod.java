/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.loi;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lod
extends loi
implements Comparable {
    private final String F;
    private static final long a = prr.a((long)4892400668860506326L, (long)8999837197849231554L, MethodHandles.lookup().lookupClass()).a(165646080367734L);

    public String k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-590836248516353892L, (long)l);
    }

    public boolean equals(Object object) {
        boolean bl;
        block28: {
            block29: {
                boolean bl2;
                block38: {
                    block31: {
                        block35: {
                            Object object2;
                            lod lod2;
                            CallSite callSite;
                            long l;
                            block37: {
                                block36: {
                                    block33: {
                                        block32: {
                                            boolean bl3;
                                            block30: {
                                                l = a ^ 0x7949B1DDF38BL;
                                                callSite = m44.a("k", (long)5942337231390886457L, (long)l);
                                                try {
                                                    bl = object instanceof lod;
                                                    if (callSite != null) break block28;
                                                    if (!bl) break block29;
                                                }
                                                catch (n9 n92) {
                                                    throw m44.a("k", (Object)((Object)n92), (long)5545571267707711253L, (long)l);
                                                }
                                                lod2 = (lod)object;
                                                try {
                                                    try {
                                                        try {
                                                            bl3 = this.w.equals(lod2.w);
                                                            if (callSite != null) break block30;
                                                            if (!bl3) break block31;
                                                        }
                                                        catch (n9 n93) {
                                                            throw m44.a("k", (Object)((Object)n93), (long)5545571267707711253L, (long)l);
                                                        }
                                                        object2 = m44.a("u", (Object)this, (long)5981503980832523346L, (long)l);
                                                        if (callSite != null) break block32;
                                                    }
                                                    catch (n9 n94) {
                                                        throw m44.a("k", (Object)((Object)n94), (long)5545571267707711253L, (long)l);
                                                    }
                                                    bl3 = ((String)object2).equals(m44.a("u", (Object)lod2, (long)5981503980832523346L, (long)l));
                                                }
                                                catch (n9 n95) {
                                                    throw m44.a("k", (Object)((Object)n95), (long)5545571267707711253L, (long)l);
                                                }
                                            }
                                            try {
                                                if (!bl3) break block31;
                                                object2 = this.D;
                                            }
                                            catch (n9 n96) {
                                                throw m44.a("k", (Object)((Object)n96), (long)5545571267707711253L, (long)l);
                                            }
                                        }
                                        try {
                                            block34: {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite != null) break block33;
                                                            if (object2 != null) break block34;
                                                        }
                                                        catch (n9 n97) {
                                                            throw m44.a("k", (Object)((Object)n97), (long)5545571267707711253L, (long)l);
                                                        }
                                                        object2 = lod2.D;
                                                        if (callSite != null) break block33;
                                                    }
                                                    catch (n9 n98) {
                                                        throw m44.a("k", (Object)((Object)n98), (long)5545571267707711253L, (long)l);
                                                    }
                                                    if (object2 == null) break block35;
                                                }
                                                catch (n9 n99) {
                                                    throw m44.a("k", (Object)((Object)n99), (long)5545571267707711253L, (long)l);
                                                }
                                            }
                                            object2 = this.D;
                                        }
                                        catch (n9 n910) {
                                            throw m44.a("k", (Object)((Object)n910), (long)5545571267707711253L, (long)l);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite != null) break block36;
                                            if (object2 == null) break block31;
                                        }
                                        catch (n9 n911) {
                                            throw m44.a("k", (Object)((Object)n911), (long)5545571267707711253L, (long)l);
                                        }
                                        object2 = lod2.D;
                                    }
                                    catch (n9 n912) {
                                        throw m44.a("k", (Object)((Object)n912), (long)5545571267707711253L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite != null) break block37;
                                        if (object2 == null) break block31;
                                    }
                                    catch (n9 n913) {
                                        throw m44.a("k", (Object)((Object)n913), (long)5545571267707711253L, (long)l);
                                    }
                                    object2 = this.D;
                                }
                                catch (n9 n914) {
                                    throw m44.a("k", (Object)((Object)n914), (long)5545571267707711253L, (long)l);
                                }
                            }
                            try {
                                bl2 = ((String)object2).equals(lod2.D);
                                if (callSite != null) break block38;
                                if (!bl2) break block31;
                            }
                            catch (n9 n915) {
                                throw m44.a("k", (Object)((Object)n915), (long)5545571267707711253L, (long)l);
                            }
                        }
                        bl2 = true;
                        break block38;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        String string;
        long l;
        block4: {
            block5: {
                l = a ^ 0x9C50AEE11C0L;
                CallSite callSite = m44.a("h", (long)-5747687452671072142L, (long)l);
                try {
                    try {
                        string = this.D;
                        if (callSite != null) break block4;
                        if (string != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-5855063094624563874L, (long)l);
                    }
                    return this.w.hashCode() ^ ((String)((Object)m44.a("v", (Object)this, (long)-5671753073049442791L, (long)l))).hashCode();
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-5855063094624563874L, (long)l);
                }
            }
            string = this.w;
        }
        return string.hashCode() ^ ((String)((Object)m44.a("v", (Object)this, (long)-5671753073049442791L, (long)l))).hashCode() ^ this.D.hashCode();
    }

    lod(String string, String string2, String string3, int n) {
        super(string, string3, n);
        this.F = string2;
    }

    /*
     * Unable to fully structure code
     */
    public final int y(Object[] var1_1) {
        block20: {
            block21: {
                block17: {
                    block18: {
                        block19: {
                            block15: {
                                block16: {
                                    var2_2 = (Long)var1_1[0];
                                    var4_3 = (lod)var1_1[1];
                                    var2_2 = lod.a ^ var2_2;
                                    var6_4 = this.w.compareTo(var4_3.w);
                                    var5_5 = m44.a("o", (long)3268246900281488661L, (long)var2_2);
                                    try {
                                        try {
                                            v0 = var6_4;
                                            if (var5_5 != null) break block15;
                                            if (v0 == 0) break block16;
                                        }
                                        catch (n9 v1) {
                                            throw m44.a("o", (Object)v1, (long)3736187415404597305L, (long)var2_2);
                                        }
                                        return var6_4;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("o", (Object)v2, (long)3736187415404597305L, (long)var2_2);
                                    }
                                }
                                v0 = var6_4 = m44.a("q", (Object)this, (long)3183722964012432254L, (long)var2_2).compareTo((String)m44.a("q", (Object)var4_3, (long)3183722964012432254L, (long)var2_2));
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (var5_5 != null) break block17;
                                            if (v0 != 0) break block18;
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("o", (Object)v3, (long)3736187415404597305L, (long)var2_2);
                                        }
                                        v4 = this.D;
                                        v5 = var5_5;
                                        if (var2_2 >= 0L) {
                                            if (v5 != null) break block19;
                                        }
                                        ** GOTO lbl49
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("o", (Object)v6, (long)3736187415404597305L, (long)var2_2);
                                    }
                                    if (v4 == null) break block18;
                                }
                                catch (n9 v7) {
                                    throw m44.a("o", (Object)v7, (long)3736187415404597305L, (long)var2_2);
                                }
                                v4 = var4_3.D;
                            }
                            catch (n9 v8) {
                                throw m44.a("o", (Object)v8, (long)3736187415404597305L, (long)var2_2);
                            }
                        }
                        try {
                            v5 = var5_5;
lbl49:
                            // 2 sources

                            if (v5 != null) break block20;
                            if (v4 != null) break block21;
                        }
                        catch (n9 v9) {
                            throw m44.a("o", (Object)v9, (long)3736187415404597305L, (long)var2_2);
                        }
                    }
                    v0 = var6_4;
                }
                return v0;
            }
            v4 = this.D;
        }
        return v4.compareTo(var4_3.D);
    }

    public int compareTo(Object object) {
        long l = a ^ 0x5066835C565DL;
        long l2 = l ^ 0x6D4259749DL;
        Object[] objectArray = new Object[2];
        objectArray[1] = (lod)object;
        objectArray[0] = l2;
        return (int)m44.a("r", (Object)this, (Object)objectArray, (long)-650117611746849539L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
