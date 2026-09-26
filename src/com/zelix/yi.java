/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e_;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.wa;
import com.zelix.yf;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class yi
implements Runnable {
    final e_ B;
    final e_ E;
    final wa g;
    final lqu c;
    final yf y;
    final File C;
    private static final long a = prr.a((long)8632692555025731593L, (long)-9164525217178894778L, MethodHandles.lookup().lookupClass()).a(89529630881459L);

    yi(wa wa2, File file, yf yf2, lqu lqu2, e_ e_2, e_ e_3) {
        this.g = wa2;
        this.C = file;
        this.y = yf2;
        this.c = lqu2;
        this.E = e_2;
        this.B = e_3;
    }

    @Override
    public void run() {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                long l3 = l2 = a ^ 0x4709140CE676L;
                long l4 = l3 ^ 0xDE6ADFA6683L;
                long l5 = l3 ^ 0x29288BB6B303L;
                l = l3 ^ 0x18D5259A3C25L;
                CallSite callSite2 = m44.a("m", (long)8144814814296541176L, (long)l2);
                Object[] objectArray = new Object[2];
                objectArray[1] = m44.a("s", (Object)this, (long)7694960413709845564L, (long)l2);
                objectArray[0] = l5;
                Object[] objectArray2 = new Object[9];
                objectArray2[8] = l4;
                objectArray2[7] = m44.a("s", (Object)this, (long)7687305284658711322L, (long)l2);
                objectArray2[6] = m44.a("s", (Object)this, (long)8413311033033056158L, (long)l2);
                objectArray2[5] = m44.a("s", (Object)this, (long)8596184512174940566L, (long)l2);
                objectArray2[4] = m44.a("s", (Object)this, (long)8226753762262468572L, (long)l2);
                objectArray2[3] = null;
                objectArray2[2] = false;
                objectArray2[1] = false;
                objectArray2[0] = 1;
                m44.a("r", (Object)m44.a("m", (Object)objectArray, (long)7841474202169212093L, (long)l2), (Object)objectArray2, (long)8343237767652285441L, (long)l2);
                CallSite callSite3 = callSite2;
                try {
                    try {
                        callSite = m44.a("s", (Object)this, (long)8303773281906137798L, (long)l2);
                        if (callSite3 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)7553850458248028964L, (long)l2);
                    }
                    callSite = m44.a("s", (Object)this, (long)8303773281906137798L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)7553850458248028964L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            m44.a("r", (Object)callSite, (Object)objectArray, (long)8556142798902521329L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
