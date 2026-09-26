/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.iq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.prr;
import com.zelix.r_;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class rl
extends r_ {
    iq l;
    boolean B;
    private static final long b = prr.a((long)-2552604324627991202L, (long)4096171942665097207L, MethodHandles.lookup().lookupClass()).a(87457823555829L);

    /*
     * Unable to fully structure code
     */
    public void R(Object[] var1_1) {
        var4_2 = (List)var1_1[0];
        var2_3 = (Long)var1_1[1];
        var2_3 = rl.b ^ var2_3;
        var6_4 = var4_2.size();
        var7_5 = 0;
        var5_6 = m44.a("k", (long)-5334063936538656471L, (long)var2_3);
        while (var7_5 < var6_4) {
            this.Y.add(var4_2.get(var7_5));
            ++var7_5;
lbl12:
            // 2 sources

            ** while (var5_6 != null)
lbl13:
            // 1 sources

        }
lbl14:
        // 2 sources

        if (var2_3 < 0L) ** GOTO lbl12
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void U(Object[] objectArray) {
        int n;
        ArrayList arrayList;
        CallSite callSite;
        long l;
        block22: {
            List list;
            block21: {
                int n2;
                block20: {
                    int n3;
                    list = (List)objectArray[0];
                    l = (Long)objectArray[1];
                    l = b ^ l;
                    callSite = m44.a("i", (long)-2198937858270882389L, (long)l);
                    try {
                        n3 = this.Y.size();
                        if (callSite != null) break block20;
                        if (n3 != 0) break block21;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-439131420738172123L, (long)l);
                    }
                    n3 = n2 = 0;
                }
                block10: while (n2 < list.size()) {
                    try {
                        this.Y.add(list.get(n2));
                        ++n2;
                        do {
                            CallSite callSite2 = callSite;
                            if (l > 0L) {
                                if (callSite2 != null) return;
                                callSite2 = callSite;
                            }
                            if (callSite2 == null) continue block10;
                        } while (l <= 0L);
                        break;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)((Object)n93), (long)-439131420738172123L, (long)l);
                    }
                }
                if (callSite == null) return;
            }
            arrayList = new ArrayList(this.Y.size() + list.size());
            n = 0;
            block12: while (n < list.size()) {
                try {
                    arrayList.add(list.get(n));
                    ++n;
                    while (l > 0L && callSite == null) {
                        if (callSite == null) continue block12;
                        if (l < 0L) continue;
                        break block12;
                    }
                    break block22;
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)((Object)n94), (long)-439131420738172123L, (long)l);
                }
            }
            n = 0;
        }
        try {
            do {
                try {
                    int n4 = n;
                    if (l >= 0L) {
                        if (n4 >= this.Y.size()) break;
                        n4 = arrayList.add(this.Y.get(n)) ? 1 : 0;
                    }
                    ++n;
                    if (callSite != null) return;
                }
                catch (n9 n95) {
                    throw m44.a("i", (Object)((Object)n95), (long)-439131420738172123L, (long)l);
                }
            } while (callSite == null || l <= 0L);
        }
        catch (n9 n96) {
            throw m44.a("i", (Object)((Object)n96), (long)-439131420738172123L, (long)l);
        }
        this.Y = arrayList;
    }

    public iq G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("p", (Object)((Object)this), (long)8186061900670931537L, (long)l);
    }

    public rl(boolean bl, iq iq2, oz oz2, int n, int n2, int n3, long l) {
        long l2 = (l = b ^ l) ^ 0x498ECDAFE4E6L;
        super(oz2, n, n2, l2, n3);
        this.B = bl;
        m44.a("u", (Object)((Object)this), (iq)iq2, (long)8666553902937512846L, (long)l);
    }

    public boolean D(Object[] objectArray) {
        return this.B;
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
