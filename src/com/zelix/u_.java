/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.u6;
import com.zelix.wd;
import java.lang.invoke.CallSite;
import javax.swing.event.DocumentEvent;

public class u_
extends u6 {
    final wd R;

    u_(wd wd2) {
        this.R = wd2;
    }

    public void B(Object[] objectArray) {
        block8: {
            CallSite callSite;
            long l;
            block6: {
                l = (Long)objectArray[0];
                DocumentEvent documentEvent = (DocumentEvent)objectArray[1];
                CallSite callSite2 = m44.a("i", (long)-8285448744989295628L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                callSite = m44.a("w", (Object)((Object)this), (long)-7753706451580959046L, (long)l);
                                if (callSite2 != null) break block6;
                                if (((String)((Object)m44.a("v", (Object)m44.a("w", (Object)callSite, (long)-8536051275407155000L, (long)l), (long)-8635802925193769609L, (long)l))).trim().length() <= 0) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)((Object)n92), (long)-7858731502659749866L, (long)l);
                            }
                            m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)((Object)this), (long)-7753706451580959046L, (long)l), (long)-7965400687306424987L, (long)l), (boolean)true, (long)-8013359239977934292L, (long)l);
                            if (callSite2 == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)((Object)n93), (long)-7858731502659749866L, (long)l);
                        }
                    }
                    callSite = m44.a("w", (Object)((Object)this), (long)-7753706451580959046L, (long)l);
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)((Object)n94), (long)-7858731502659749866L, (long)l);
                }
            }
            m44.a("v", (Object)m44.a("w", (Object)callSite, (long)-7965400687306424987L, (long)l), (boolean)false, (long)-8013359239977934292L, (long)l);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
