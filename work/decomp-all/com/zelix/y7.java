/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zh;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class y7 {
    private ArrayList H;
    private static final long a = prr.a((long)-8766980365915430956L, (long)6227733474612288195L, MethodHandles.lookup().lookupClass()).a(87046527844033L);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean d(Object[] var1_1) {
        block25: {
            var2_2 = (y7)var1_1[0];
            var3_3 = (Long)var1_1[1];
            var3_3 = y7.a ^ var3_3;
            var6_4 = m44.a("t", (Object)var2_2, (long)-8587239874040825811L, (long)var3_3);
            var7_5 = 0;
            var5_6 = m44.a("j", (long)-7696439086587953588L, (long)var3_3);
            while (var7_5 < m44.a("t", (Object)this, (long)-8587239874040825811L, (long)var3_3).size()) {
                block28: {
                    block29: {
                        block32: {
                            block33: {
                                block30: {
                                    block31: {
                                        block27: {
                                            block26: {
                                                var8_7 = (HashSet)m44.a("t", (Object)this, (long)-8587239874040825811L, (long)var3_3).get(var7_5);
                                                var9_8 = (HashSet)var6_4.get(var7_5);
                                                var10_9 = null;
                                                var11_10 = null;
                                                var12_11 = null;
                                                var13_12 = null;
                                                try {
                                                    v0 = var7_5;
                                                    if (var5_6 == false) break block25;
                                                    if (v0 <= 0) break block26;
                                                }
                                                catch (n9 v1) {
                                                    throw m44.a("j", (Object)v1, (long)-8439804113328084285L, (long)var3_3);
                                                }
                                                var10_9 = (HashSet)m44.a("t", (Object)this, (long)-8587239874040825811L, (long)var3_3).get(var7_5 - 1);
                                                var11_10 = (HashSet)var6_4.get(var7_5 - 1);
                                            }
                                            if (var7_5 < m44.a("t", (Object)this, (long)-8587239874040825811L, (long)var3_3).size() - 1) {
                                                var12_11 = (HashSet)m44.a("t", (Object)this, (long)-8587239874040825811L, (long)var3_3).get(var7_5 + 1);
                                                var13_12 = (HashSet)var6_4.get(var7_5 + 1);
                                            }
                                            try {
                                                try {
                                                    v2 = var8_7;
                                                    v3 = var5_6;
                                                    if (var3_3 > 0L) {
                                                        if (v3 == false) break block27;
                                                        v4 /* !! */  = v2.equals(var9_8);
                                                        if (var3_3 <= 0L) break block28;
                                                        if (v4 /* !! */ ) break block29;
                                                    }
                                                    ** GOTO lbl50
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("j", (Object)v5, (long)-8439804113328084285L, (long)var3_3);
                                                }
                                                v2 = var10_9;
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("j", (Object)v6, (long)-8439804113328084285L, (long)var3_3);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    v3 = var5_6;
lbl50:
                                                    // 2 sources

                                                    if (var3_3 >= 0L) {
                                                        if (v3 == false) break block30;
                                                        if (v2 == null) break block31;
                                                    }
                                                    ** GOTO lbl73
                                                }
                                                catch (n9 v7) {
                                                    throw m44.a("j", (Object)v7, (long)-8439804113328084285L, (long)var3_3);
                                                }
                                                v8 = var10_9.equals(var11_10);
                                                if (var5_6 == false) break block32;
                                            }
                                            catch (n9 v9) {
                                                throw m44.a("j", (Object)v9, (long)-8439804113328084285L, (long)var3_3);
                                            }
                                            if (v8) {
                                            }
                                            ** GOTO lbl95
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("j", (Object)v10, (long)-8439804113328084285L, (long)var3_3);
                                        }
                                    }
                                    v2 = var12_11;
                                }
                                try {
                                    if (var3_3 < 0L) break block33;
                                    v3 = var5_6;
lbl73:
                                    // 2 sources

                                    if (v3 == false) break block33;
                                    if (v2 == null) break block29;
                                }
                                catch (n9 v11) {
                                    throw m44.a("j", (Object)v11, (long)-8439804113328084285L, (long)var3_3);
                                }
                                v2 = var12_11;
                            }
                            try {
                                block34: {
                                    try {
                                        try {
                                            v8 = v2.equals(var13_12);
                                            if (var5_6 == false) break block32;
                                            if (!v8) break block34;
                                        }
                                        catch (n9 v12) {
                                            throw m44.a("j", (Object)v12, (long)-8439804113328084285L, (long)var3_3);
                                        }
                                        v4 /* !! */  = var5_6;
                                        if (var3_3 <= 0L) break block28;
                                        if (v4 /* !! */ ) break block29;
                                    }
                                    catch (n9 v13) {
                                        throw m44.a("j", (Object)v13, (long)-8439804113328084285L, (long)var3_3);
                                    }
                                }
                                v8 = false;
                            }
                            catch (n9 v14) {
                                throw m44.a("j", (Object)v14, (long)-8439804113328084285L, (long)var3_3);
                            }
                        }
                        return v8;
                    }
                    ++var7_5;
                    v4 /* !! */  = var5_6;
                }
                if (v4 /* !! */ ) continue;
            }
            v0 = 1;
        }
        return (boolean)v0;
    }

    y7(long l, zh zh2) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x43DF9BC0C154L;
        long l4 = l2 ^ 0x10B245B6965DL;
        CallSite callSite = m44.a("k", (long)8622587162057891029L, (long)l);
        m44.a("w", (Object)this, new ArrayList(), (long)7659122062682364596L, (long)l);
        CallSite callSite2 = callSite;
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        CallSite callSite3 = m44.a("t", (Object)zh2, (Object)objectArray, (long)7881219002930440979L, (long)l);
        while (callSite3.hasMoreElements()) {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            CallSite callSite4 = m44.a("k", (Object)objectArray2, (long)7885952709123904755L, (long)l);
            ((HashSet)((Object)callSite4)).add(callSite3.nextElement());
            ((ArrayList)((Object)m44.a("u", (Object)this, (long)7659122062682364596L, (long)l))).add(callSite4);
            if (callSite2 != false) continue;
        }
    }

    Enumeration b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return Collections.enumeration(m44.a("t", (Object)this, (long)-4175986845516581131L, (long)l));
    }

    void G(Object[] objectArray) {
        y7 y72 = (y7)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        CallSite callSite = m44.a("m", (long)5951966627927792415L, (long)l);
        for (int i = 0; i < ((ArrayList)((Object)m44.a("s", (Object)this, (long)6277165422252992482L, (long)l))).size(); ++i) {
            HashSet hashSet = (HashSet)((ArrayList)((Object)m44.a("s", (Object)this, (long)6277165422252992482L, (long)l))).get(i);
            m44.a("r", (Object)hashSet, (Object)((Collection)((ArrayList)((Object)m44.a("s", (Object)y72, (long)6277165422252992482L, (long)l))).get(i)), (long)5863403873135943298L, (long)l);
            if (callSite == false) continue;
        }
    }

    int u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return ((ArrayList)((Object)m44.a("s", (Object)this, (long)-4148730974995499374L, (long)l))).size();
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
