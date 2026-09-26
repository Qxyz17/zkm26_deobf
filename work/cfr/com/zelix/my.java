/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.loh;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.vp;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class my
implements Comparator {
    final vp I;
    private static final long a = prr.a(-5194916124283491120L, -8058017782460504313L, MethodHandles.lookup().lookupClass()).a(262303299314655L);

    my(vp vp2) {
        this.I = vp2;
    }

    public int x(long l10, loh loh2, loh loh3) {
        int n10;
        block4: {
            int n11;
            block5: {
                l10 = a ^ l10;
                loh loh4 = loh2;
                loh loh5 = loh3;
                String string = loh4.B();
                String string2 = loh5.B();
                String string3 = string.substring(string.indexOf(" ") + 1);
                CallSite callSite = m44.a("n", (long)-6094991114919791836L, (long)l10);
                String string4 = string2.substring(string2.indexOf(" ") + 1);
                n11 = string3.compareTo(string4);
                try {
                    try {
                        n10 = n11;
                        if (callSite != null) break block4;
                        if (n10 != 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-5324774436492002556L, (long)l10);
                    }
                    return string.compareTo(string2);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-5324774436492002556L, (long)l10);
                }
            }
            n10 = n11;
        }
        return n10;
    }

    public int compare(Object object, Object object2) {
        long l10 = a ^ 0x6BEE44C1D1F9L;
        long l11 = l10 ^ 0x23074A437508L;
        return this.x(l11, (loh)object, (loh)object2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

