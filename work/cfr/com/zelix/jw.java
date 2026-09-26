/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ja;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class jw
extends ja {
    private static final long b = prr.a(-7010017143327354900L, 2612238277444687358L, MethodHandles.lookup().lookupClass()).a(271205956658579L);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void k(Object[] objectArray) {
        block5: {
            jw jw2;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                lkc lkc2 = (lkc)objectArray[1];
                l10 = l11 ^ 0x50CD0923CCDDL;
                CallSite callSite = m44.a("j", (long)7374193648435527192L, (long)l11);
                try {
                    try {
                        jw2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("t", (Object)jw2, (long)7300947376774249410L, (long)l11) == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)8653262172819659567L, (long)l11);
                    }
                    jw2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)8653262172819659567L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = m44.a("t", (Object)this, (long)6932199952998774191L, (long)l11);
            objectArray2[1] = m44.a("t", (Object)this, (long)7300947376774249410L, (long)l11);
            objectArray2[0] = l10;
            m44.a("u", (Object)m44.a("t", (Object)jw2, (long)8871810686016648836L, (long)l11), (Object)objectArray2, (long)9039033130630569386L, (long)l11);
        }
    }

    public jw(int n10, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x6B51743E65FBL;
        super(n10, l11);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

