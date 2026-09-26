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
    private static final long a = prr.a(-7169302347509980258L, 955158252114136250L, MethodHandles.lookup().lookupClass()).a(67399250786614L);

    public int v(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                int n10 = (Integer)objectArray[0];
                int n11 = (Integer)objectArray[1];
                int n12 = (Integer)objectArray[2];
                long l10 = ((long)n10 << 48 | (long)n11 << 48 >>> 16 | (long)n12 << 32 >>> 32) ^ a;
                CallSite callSite2 = m44.a("i", (long)-6987600381300211407L, (long)l10);
                try {
                    try {
                        callSite = m44.a("w", (Object)this, (long)-7210786642748672494L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-9158827491095536407L, (long)l10);
                    }
                    callSite = m44.a("w", (Object)this, (long)-7210786642748672494L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-9158827491095536407L, (long)l10);
                }
            }
            return callSite.size();
        }
        return 0;
    }

    public abstract int p(Object[] var1);

    public v8 K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x5E7C33204416L;
        long l13 = l11 ^ 0x11AB541E09BAL;
        try {
            if (m44.a("t", (Object)this, (long)7709405502902535937L, (long)l10) == null) {
                return new v8(l12);
            }
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)n92, (long)8211788740365708794L, (long)l10);
        }
        return new v8((Map)((Object)m44.a("t", (Object)this, (long)7709405502902535937L, (long)l10)), l13);
    }

    public void r(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("l", (long)7668037128715400284L, (long)l10);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)7963343381561901951L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)8469045151460419972L, (long)l10);
                    }
                    callSite = m44.a("r", (Object)this, (long)7963343381561901951L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)8469045151460419972L, (long)l10);
                }
            }
            callSite.clear();
        }
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

