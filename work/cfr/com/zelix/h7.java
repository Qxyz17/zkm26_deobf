/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t3;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class h7
implements ItemListener {
    final t3 Q;
    private static final long a = prr.a(5102519439730362183L, 8850975985380174135L, MethodHandles.lookup().lookupClass()).a(42664966118984L);

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block9: {
            CallSite callSite;
            long l10;
            block10: {
                CallSite callSite2;
                block8: {
                    l10 = a ^ 0x11DEA532D977L;
                    CallSite callSite3 = m44.a("p", (Object)itemEvent, (long)-3775955609505316891L, (long)l10);
                    callSite2 = m44.a("o", (long)-3151837424845086030L, (long)l10);
                    try {
                        try {
                            if (callSite2 != null) break block8;
                            if (callSite3 != m44.a("q", (Object)m44.a("q", (Object)this, (long)-3971839202496559254L, (long)l10), (long)-3252149734955381165L, (long)l10)) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)-3525912629234172161L, (long)l10);
                        }
                        m44.a("p", (Object)m44.a("q", (Object)m44.a("q", (Object)this, (long)-3971839202496559254L, (long)l10), (long)-3900881371387138016L, (long)l10), (boolean)m44.a("p", (Object)m44.a("q", (Object)m44.a("q", (Object)this, (long)-3971839202496559254L, (long)l10), (long)-3252149734955381165L, (long)l10), (long)-3941958226411838820L, (long)l10), (long)-2901888590290880456L, (long)l10);
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)-3525912629234172161L, (long)l10);
                    }
                }
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)-3971839202496559254L, (long)l10);
                        if (callSite2 != null) break block10;
                        if (m44.a("p", (Object)m44.a("q", (Object)callSite, (long)-3252149734955381165L, (long)l10), (long)-3941958226411838820L, (long)l10) != false) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)n94, (long)-3525912629234172161L, (long)l10);
                    }
                    callSite = m44.a("q", (Object)this, (long)-3971839202496559254L, (long)l10);
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)n95, (long)-3525912629234172161L, (long)l10);
                }
            }
            m44.a("p", (Object)m44.a("q", (Object)callSite, (long)-3900881371387138016L, (long)l10), (int)0, (int)0, (long)-3754181218995545017L, (long)l10);
        }
    }

    h7(t3 t32) {
        this.Q = t32;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

