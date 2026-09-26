/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.b7;
import com.zelix.f8;
import com.zelix.gs;
import com.zelix.h1;
import com.zelix.kw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.tt;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;

public class _r
extends _f {
    private final String J;
    private b7 Xe;
    private String f;
    private static final long db = prr.a((long)2646929953661202669L, (long)-904660697605029256L, MethodHandles.lookup().lookupClass()).a(245351566407099L);

    public void QA(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = db ^ l) ^ 0x3DA454FEEE9DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = hashMap;
        m44.a("w", (Object)this.m, (Object)objectArray2, (long)8979288759600749460L, (long)l);
    }

    public String H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = db ^ l;
        return m44.a("r", (Object)((Object)this), (long)-3665874603064144279L, (long)l);
    }

    public _r(h1 h12, gs gs2, short s, sz sz2, int n, tt tt2, PrintWriter printWriter, PrintWriter printWriter2, char c, f8 f82) {
        block11: {
            long l;
            long l2 = l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ db;
            long l3 = l2 ^ 0x1ABBF88D2414L;
            long l4 = l3 >>> 8;
            int n2 = (int)(l3 << 56 >>> 56);
            long l5 = l2 ^ 0x743E99757E69L;
            CallSite callSite = m44.a("o", (long)-5812280284760048719L, (long)l);
            super(h12, l4, gs2, sz2, (byte)n2, tt2, printWriter, printWriter2, f82);
            CallSite callSite2 = callSite;
            kw[] kwArray = this.w;
            int n3 = kwArray.length;
            int n4 = 0;
            while (n4 < n3) {
                CallSite callSite3;
                block12: {
                    block13: {
                        kw kw2 = kwArray[n4];
                        try {
                            block14: {
                                try {
                                    try {
                                        try {
                                            callSite3 = callSite2;
                                            if (c > '\u0000') {
                                                if (callSite3 != false) break block11;
                                                callSite3 = callSite2;
                                            }
                                            if (c < '\u0000') break block12;
                                            if (callSite3 != false) break block13;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("o", (Object)((Object)n92), (long)-5877298667896359394L, (long)l);
                                        }
                                        if (n <= 0) break block13;
                                        if (!(kw2 instanceof b7)) break block14;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("o", (Object)((Object)n93), (long)-5877298667896359394L, (long)l);
                                    }
                                    m44.a("s", (Object)((Object)this), (b7)((b7)kw2), (long)-6255345814427959452L, (long)l);
                                    if (s < 0) break block11;
                                    if (callSite2 == false) break;
                                }
                                catch (n9 n94) {
                                    throw m44.a("o", (Object)((Object)n94), (long)-5877298667896359394L, (long)l);
                                }
                            }
                            ++n4;
                        }
                        catch (n9 n95) {
                            throw m44.a("o", (Object)((Object)n95), (long)-5877298667896359394L, (long)l);
                        }
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 == false) continue;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l5;
            m44.a("s", (Object)((Object)this), (String)((Object)m44.a("p", (Object)m44.a("q", (Object)((Object)this), (long)-6255345814427959452L, (long)l), (Object)objectArray, (long)-5388487781550291719L, (long)l)), (long)-5398906151715981734L, (long)l);
            this.J = m44.a("q", (Object)((Object)this), (long)-5398906151715981734L, (long)l);
            if (n > 0) {
                // empty if block
            }
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
