/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class r_
implements Comparable {
    int w;
    int N;
    int E;
    int x;
    List Y;
    private static final long a = prr.a((long)-4298597926716479563L, (long)3552629843325715717L, MethodHandles.lookup().lookupClass()).a(203299141955485L);

    public r_(List list, int n, char c, long l, int n2, int n3) {
        block4: {
            block5: {
                long l2 = ((long)c << 48 | l << 16 >>> 16) ^ a;
                this.E = 0;
                CallSite callSite = m44.a("j", (long)2411888389265085864L, (long)l2);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (list == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)4542832541728863322L, (long)l2);
                    }
                    this.Y = list;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)4542832541728863322L, (long)l2);
                }
            }
            this.w = n;
            this.N = n2;
            this.x = n3;
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean w(Object[] var1_1) {
        block16: {
            block17: {
                block13: {
                    var3_2 = (Integer)var1_1[0];
                    var4_3 = (Long)var1_1[1];
                    var2_4 = (List)var1_1[2];
                    var4_3 = r_.a ^ var4_3;
                    var7_5 = 0;
                    var8_6 = new ArrayList<oz>(this.Y.size() + var2_4.size());
                    var9_7 = this.Y.iterator();
                    var6_8 = m44.a("o", (long)2282721990762425213L, (long)var4_3);
                    while (var9_7.hasNext()) {
                        block14: {
                            block15: {
                                var10_9 = (oz)var9_7.next();
                                try {
                                    try {
                                        v0 = var10_9.q();
                                        v1 = var6_8;
                                        if (var4_3 >= 0L) {
                                            if (v1 != null) break block13;
                                            if (var6_8 != null) break block14;
                                        }
                                        ** GOTO lbl41
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("o", (Object)v2, (long)134551742497966735L, (long)var4_3);
                                    }
                                    if (v0 != var3_2) break block15;
                                }
                                catch (n9 v3) {
                                    throw m44.a("o", (Object)v3, (long)134551742497966735L, (long)var4_3);
                                }
                                var8_6.addAll(var2_4);
                                var7_5 = 1;
                            }
                            var8_6.add(var10_9);
                        }
                        if (var6_8 == null) continue;
                    }
                    if (var4_3 <= 0L) break block17;
                    v0 = var7_5;
                }
                try {
                    try {
                        v1 = var6_8;
lbl41:
                        // 2 sources

                        if (v1 != null) break block16;
                        if (v0 == 0) break block17;
                    }
                    catch (n9 v4) {
                        throw m44.a("o", (Object)v4, (long)134551742497966735L, (long)var4_3);
                    }
                    this.Y = var8_6;
                }
                catch (n9 v5) {
                    throw m44.a("o", (Object)v5, (long)134551742497966735L, (long)var4_3);
                }
            }
            v0 = var7_5;
        }
        return (boolean)v0;
    }

    public void A(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        this.x = n;
    }

    public final int Q(long l, r_ r_2) {
        int n;
        block20: {
            block21: {
                int n2;
                block24: {
                    int n3;
                    block22: {
                        CallSite callSite;
                        block23: {
                            block18: {
                                block19: {
                                    l = a ^ l;
                                    callSite = m44.a("h", (long)-5700723374743272398L, (long)l);
                                    try {
                                        try {
                                            n = this.w;
                                            n3 = r_2.w;
                                            if (callSite != null) break block18;
                                            if (n >= n3) break block19;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("h", (Object)((Object)n92), (long)-5867860607164422720L, (long)l);
                                        }
                                        return -1;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)((Object)n93), (long)-5867860607164422720L, (long)l);
                                    }
                                }
                                try {
                                    n = this.w;
                                    if (callSite != null) break block20;
                                    n3 = r_2.w;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)((Object)n94), (long)-5867860607164422720L, (long)l);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (l >= 0L) {
                                            if (n != n3) break block21;
                                            n2 = this.E;
                                            n3 = r_2.E;
                                        }
                                        if (l < 0L || callSite != null) break block22;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("h", (Object)((Object)n95), (long)-5867860607164422720L, (long)l);
                                    }
                                    if (n2 >= n3) break block23;
                                }
                                catch (n9 n96) {
                                    throw m44.a("h", (Object)((Object)n96), (long)-5867860607164422720L, (long)l);
                                }
                                return -1;
                            }
                            catch (n9 n97) {
                                throw m44.a("h", (Object)((Object)n97), (long)-5867860607164422720L, (long)l);
                            }
                        }
                        try {
                            n2 = this.E;
                            if (callSite != null) break block24;
                            n3 = r_2.E;
                        }
                        catch (n9 n98) {
                            throw m44.a("h", (Object)((Object)n98), (long)-5867860607164422720L, (long)l);
                        }
                    }
                    try {
                        if (n2 == n3) {
                            return 0;
                        }
                    }
                    catch (n9 n99) {
                        throw m44.a("h", (Object)((Object)n99), (long)-5867860607164422720L, (long)l);
                    }
                    n2 = 1;
                }
                return n2;
            }
            n = 1;
        }
        return n;
    }

    public r_(oz oz2, int n, int n2, long l, int n3) {
        block4: {
            block5: {
                l = a ^ l;
                this.E = 0;
                CallSite callSite = m44.a("l", (long)-7852361093337356330L, (long)l);
                try {
                    try {
                        this.Y = new ArrayList();
                        if (callSite != null) break block4;
                        if (oz2 == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)-8253670234618411484L, (long)l);
                    }
                    this.Y.add(oz2);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)-8253670234618411484L, (long)l);
                }
            }
            this.w = n;
            this.N = n2;
            this.x = n3;
        }
    }

    public int H() {
        return this.w;
    }

    public int z() {
        return this.x;
    }

    public int compareTo(Object object) {
        long l = a ^ 0xD5ECEBD7B54L;
        long l2 = l ^ 0x2C9D6E44D8CBL;
        return this.Q(l2, (r_)object);
    }

    public List V() {
        return this.Y;
    }

    public final void Z(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        this.E = n;
    }

    public int t() {
        return this.N;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
