/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v8;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public abstract class hu {
    Map o;
    private static final long a = prr.a((long)-7169302347509980258L, (long)955158252114136250L, MethodHandles.lookup().lookupClass()).a(67399250786614L);

    public int v(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                int n = (Integer)objectArray[0];
                int n2 = (Integer)objectArray[1];
                int n3 = (Integer)objectArray[2];
                long l = ((long)n << 48 | (long)n2 << 48 >>> 16 | (long)n3 << 32 >>> 32) ^ a;
                CallSite callSite2 = m44.a("i", (long)-6987600381300211407L, (long)l);
                try {
                    try {
                        callSite = m44.a("w", (Object)this, (long)-7210786642748672494L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-9158827491095536407L, (long)l);
                    }
                    callSite = m44.a("w", (Object)this, (long)-7210786642748672494L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-9158827491095536407L, (long)l);
                }
            }
            return callSite.size();
        }
        return 0;
    }

    public abstract int p(Object[] var1);

    public v8 K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x5E7C33204416L;
        long l4 = l2 ^ 0x11AB541E09BAL;
        try {
            if (m44.a("t", (Object)this, (long)7709405502902535937L, (long)l) == null) {
                return new v8(l3);
            }
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)((Object)n92), (long)8211788740365708794L, (long)l);
        }
        return new v8((Map)((Object)m44.a("t", (Object)this, (long)7709405502902535937L, (long)l)), l4);
    }

    public void r(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite2 = m44.a("l", (long)7668037128715400284L, (long)l);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)7963343381561901951L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)8469045151460419972L, (long)l);
                    }
                    callSite = m44.a("r", (Object)this, (long)7963343381561901951L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)8469045151460419972L, (long)l);
                }
            }
            callSite.clear();
        }
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
