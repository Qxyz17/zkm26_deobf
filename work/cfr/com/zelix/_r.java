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
    private static final long db = prr.a(2646929953661202669L, -904660697605029256L, MethodHandles.lookup().lookupClass()).a(245351566407099L);

    public void QA(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = db ^ l10) ^ 0x3DA454FEEE9DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = hashMap;
        m44.a("w", (Object)this.m, (Object)objectArray2, (long)8979288759600749460L, (long)l10);
    }

    public String H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = db ^ l10;
        return m44.a("r", (Object)this, (long)-3665874603064144279L, (long)l10);
    }

    public _r(h1 h12, gs gs2, short s10, sz sz2, int n10, tt tt2, PrintWriter printWriter, PrintWriter printWriter2, char c10, f8 f82) {
        block11: {
            long l10;
            long l11 = l10 = ((long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)c10 << 48 >>> 48) ^ db;
            long l12 = l11 ^ 0x1ABBF88D2414L;
            long l13 = l12 >>> 8;
            int n11 = (int)(l12 << 56 >>> 56);
            long l14 = l11 ^ 0x743E99757E69L;
            CallSite callSite = m44.a("o", (long)-5812280284760048719L, (long)l10);
            super(h12, l13, gs2, sz2, (byte)n11, tt2, printWriter, printWriter2, f82);
            CallSite callSite2 = callSite;
            kw[] kwArray = this.w;
            int n12 = kwArray.length;
            int n13 = 0;
            while (n13 < n12) {
                CallSite callSite3;
                block12: {
                    block13: {
                        kw kw2 = kwArray[n13];
                        try {
                            block14: {
                                try {
                                    try {
                                        try {
                                            callSite3 = callSite2;
                                            if (c10 > '\u0000') {
                                                if (callSite3 != false) break block11;
                                                callSite3 = callSite2;
                                            }
                                            if (c10 < '\u0000') break block12;
                                            if (callSite3 != false) break block13;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("o", (Object)n92, (long)-5877298667896359394L, (long)l10);
                                        }
                                        if (n10 <= 0) break block13;
                                        if (!(kw2 instanceof b7)) break block14;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("o", (Object)n93, (long)-5877298667896359394L, (long)l10);
                                    }
                                    m44.a("s", (Object)this, (b7)((b7)kw2), (long)-6255345814427959452L, (long)l10);
                                    if (s10 < 0) break block11;
                                    if (callSite2 == false) break;
                                }
                                catch (n9 n94) {
                                    throw m44.a("o", (Object)n94, (long)-5877298667896359394L, (long)l10);
                                }
                            }
                            ++n13;
                        }
                        catch (n9 n95) {
                            throw m44.a("o", (Object)n95, (long)-5877298667896359394L, (long)l10);
                        }
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 == false) continue;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l14;
            m44.a("s", (Object)this, (String)((Object)m44.a("p", (Object)m44.a("q", (Object)this, (long)-6255345814427959452L, (long)l10), (Object)objectArray, (long)-5388487781550291719L, (long)l10)), (long)-5398906151715981734L, (long)l10);
            this.J = m44.a("q", (Object)this, (long)-5398906151715981734L, (long)l10);
            if (n10 > 0) {
                // empty if block
            }
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

