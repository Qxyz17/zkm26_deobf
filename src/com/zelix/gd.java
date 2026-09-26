/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.in;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;

public class gd {
    private final in Z;
    private static String L;
    private final in l;
    private final Set E;
    private static final long a;

    public static void O(String string) {
        L = string;
    }

    /*
     * Unable to fully structure code
     */
    public final String j(Object[] var1_1) {
        block8: {
            block7: {
                var5_2 = (String)var1_1[0];
                var2_3 = (Boolean)var1_1[1];
                var3_4 = (Long)var1_1[2];
                v0 = var3_4 = gd.a ^ var3_4;
                var6_5 = v0 ^ 140508078208737L;
                var8_6 = v0 ^ 109303496797309L;
                var10_7 = m44.a("k", (long)-3693507800622465947L, (long)var3_4);
                if (!var2_3) break block7;
                var11_8 = m44.a("u", (Object)this, (long)-2975577310079644614L, (long)var3_4);
                v1 = var10_7;
                if (var3_4 < 0L) ** GOTO lbl20
                if (v1 == null) break block8;
            }
            var11_8 = m44.a("u", (Object)this, (long)-2884956477781796090L, (long)var3_4);
        }
        block0: while (true) {
            v1 = var5_2;
lbl20:
            // 2 sources

            if (v1 == null) ** GOTO lbl31
            v2 = new Object[2];
            v2[1] = var5_2;
            v2[0] = var8_6;
            v3 = m44.a("t", (Object)var11_8, (Object)v2, (long)-3788698848739639288L, (long)var3_4);
            do {
                var12_9 = v3;
                v4 = var10_7;
                do {
                    block9: {
                        if (v4 == null) break block9;
lbl31:
                        // 2 sources

                        v5 = new Object[1];
                        v5[0] = var6_5;
                        var12_9 = m44.a("t", (Object)var11_8, (Object)v5, (long)-3785346425728836577L, (long)var3_4);
                    }
                    if (!m44.a("u", (Object)this, (long)-3905103120990573944L, (long)var3_4).add(var12_9)) continue block0;
                    v4 = var12_9;
                } while (var3_4 <= 0L);
            } while (var10_7 != null);
            break;
        }
        return v4;
    }

    public gd(char[] cArray, char[] cArray2, long l, char[] cArray3, char[] cArray4, List list, boolean bl) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x5C71C5608962L;
        long l4 = l2 ^ 0x48227C0EDD13L;
        CallSite callSite = m44.a("m", (long)2375716594976395299L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        this.E = m44.a("m", (Object)objectArray, (long)2686000920964914373L, (long)l);
        this.l = new in(cArray, l4, cArray2, list, bl);
        this.Z = new in(cArray3, l4, cArray4, list, bl);
        CallSite callSite2 = callSite;
        try {
            if (m44.a("m", (long)2843003163471781453L, (long)l) == null) {
                m44.a("m", (Object)"IkXI2", (long)4314445052224829550L, (long)l);
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)((Object)n92), (long)2777507239881415106L, (long)l);
        }
    }

    public static String L() {
        return L;
    }

    static {
        a = prr.a((long)-5945837390679652317L, (long)-1984677149328556055L, MethodHandles.lookup().lookupClass()).a(173095889017117L);
        long l = a ^ 0xFE72BD789E7L;
        if (m44.a("l", (long)-4723868628073836886L, (long)l) != null) {
            m44.a("l", (Object)"rPEF6b", (long)-6532836504655304985L, (long)l);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
