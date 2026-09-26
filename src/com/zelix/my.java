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
    private static final long a = prr.a((long)-5194916124283491120L, (long)-8058017782460504313L, MethodHandles.lookup().lookupClass()).a(262303299314655L);

    my(vp vp2) {
        this.I = vp2;
    }

    public int x(long l, loh loh2, loh loh3) {
        int n;
        block4: {
            int n2;
            block5: {
                l = a ^ l;
                loh loh4 = loh2;
                loh loh5 = loh3;
                String string = loh4.B();
                String string2 = loh5.B();
                String string3 = string.substring(string.indexOf(" ") + 1);
                CallSite callSite = m44.a("n", (long)-6094991114919791836L, (long)l);
                String string4 = string2.substring(string2.indexOf(" ") + 1);
                n2 = string3.compareTo(string4);
                try {
                    try {
                        n = n2;
                        if (callSite != null) break block4;
                        if (n != 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-5324774436492002556L, (long)l);
                    }
                    return string.compareTo(string2);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-5324774436492002556L, (long)l);
                }
            }
            n = n2;
        }
        return n;
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x6BEE44C1D1F9L;
        long l2 = l ^ 0x23074A437508L;
        return this.x(l2, (loh)object, (loh)object2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
