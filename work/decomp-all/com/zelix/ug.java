/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.u6;
import com.zelix.wf;
import java.lang.invoke.CallSite;
import javax.swing.event.DocumentEvent;

public class ug
extends u6 {
    final wf W;

    public void B(Object[] objectArray) {
        block12: {
            CallSite callSite;
            long l;
            block10: {
                l = (Long)objectArray[0];
                DocumentEvent documentEvent = (DocumentEvent)objectArray[1];
                long l2 = l ^ 0x39FDFF205DF5L;
                CallSite callSite2 = m44.a("i", (long)-8285448744989295628L, (long)l);
                try {
                    block11: {
                        try {
                            try {
                                try {
                                    try {
                                        callSite = m44.a("w", (Object)((Object)this), (long)-7751209692445711548L, (long)l);
                                        if (callSite2 != null) break block10;
                                        Object[] objectArray2 = new Object[2];
                                        objectArray2[1] = callSite;
                                        objectArray2[0] = l2;
                                        if (((String)((Object)m44.a("v", (Object)m44.a("i", (Object)objectArray2, (long)-8472427769215725938L, (long)l), (long)-8524716127246394078L, (long)l))).trim().length() <= 0) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("i", (Object)((Object)n92), (long)-7864476311769655428L, (long)l);
                                    }
                                    callSite = m44.a("w", (Object)((Object)this), (long)-7751209692445711548L, (long)l);
                                    if (callSite2 != null) break block10;
                                }
                                catch (n9 n93) {
                                    throw m44.a("i", (Object)((Object)n93), (long)-7864476311769655428L, (long)l);
                                }
                                if (l < 0L) break block10;
                                if (((String)((Object)m44.a("v", (Object)m44.a("w", (Object)callSite, (long)-7755158855606968285L, (long)l), (long)-8635802925193769609L, (long)l))).trim().length() <= 0) break block11;
                            }
                            catch (n9 n94) {
                                throw m44.a("i", (Object)((Object)n94), (long)-7864476311769655428L, (long)l);
                            }
                            m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)((Object)this), (long)-7751209692445711548L, (long)l), (long)-8597210069511836366L, (long)l), (boolean)true, (long)-8013359239977934292L, (long)l);
                            if (callSite2 == null) break block12;
                        }
                        catch (n9 n95) {
                            throw m44.a("i", (Object)((Object)n95), (long)-7864476311769655428L, (long)l);
                        }
                    }
                    callSite = m44.a("w", (Object)((Object)this), (long)-7751209692445711548L, (long)l);
                }
                catch (n9 n96) {
                    throw m44.a("i", (Object)((Object)n96), (long)-7864476311769655428L, (long)l);
                }
            }
            m44.a("v", (Object)m44.a("w", (Object)callSite, (long)-8597210069511836366L, (long)l), (boolean)false, (long)-8013359239977934292L, (long)l);
        }
    }

    ug(wf wf2) {
        this.W = wf2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
