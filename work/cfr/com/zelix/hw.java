/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class hw
implements Enumeration {
    private Enumeration U;
    private static final long a = prr.a(-9156941245952110086L, 5902118729640742835L, MethodHandles.lookup().lookupClass()).a(273087245311623L);

    @Override
    public final boolean hasMoreElements() {
        long l10 = a ^ 0x582A68ECC32DL;
        return m44.a("v", (Object)this, (long)6148213718793029307L, (long)l10).hasMoreElements();
    }

    public hw(Enumeration enumeration, long l10) {
        block6: {
            l10 = a ^ l10;
            ArrayList arrayList = new ArrayList();
            CallSite callSite = m44.a("l", (long)-5455530928033977732L, (long)l10);
            block2: while (enumeration.hasMoreElements()) {
                try {
                    arrayList.add(enumeration.nextElement());
                    do {
                        CallSite callSite2 = callSite;
                        if (l10 > 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)-5427193239934099094L, (long)l10);
                }
            }
            m44.a("p", (Object)this, Collections.enumeration(arrayList), (long)-5893255020665078305L, (long)l10);
        }
    }

    public final Object nextElement() {
        long l10 = a ^ 0x23BA4CE25912L;
        return m44.a("q", (Object)this, (long)-3499951818558333820L, (long)l10).nextElement();
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

