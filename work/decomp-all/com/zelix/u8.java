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

public class u8
extends u6 {
    final wf a;

    public void B(Object[] objectArray) {
        block21: {
            CallSite callSite;
            long l;
            block19: {
                CallSite callSite2;
                long l2;
                block18: {
                    CallSite callSite3;
                    block16: {
                        l = (Long)objectArray[0];
                        DocumentEvent documentEvent = (DocumentEvent)objectArray[1];
                        l2 = l ^ 0x39FDFF205DF5L;
                        CallSite callSite4 = m44.a("i", (long)-8285448744989295628L, (long)l);
                        m44.a("u", (Object)m44.a("w", (Object)((Object)this), (long)-8105736991458494393L, (long)l), (boolean)true, (long)-8613072831304303682L, (long)l);
                        callSite2 = callSite4;
                        try {
                            block17: {
                                try {
                                    try {
                                        callSite3 = m44.a("w", (Object)((Object)this), (long)-8105736991458494393L, (long)l);
                                        if (callSite2 != null) break block16;
                                        Object[] objectArray2 = new Object[2];
                                        objectArray2[1] = callSite3;
                                        objectArray2[0] = l2;
                                        if (((String)((Object)m44.a("v", (Object)m44.a("i", (Object)objectArray2, (long)-8472427769215725938L, (long)l), (long)-8524716127246394078L, (long)l))).trim().length() <= 0) break block17;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("i", (Object)((Object)n92), (long)-7984076757674259100L, (long)l);
                                    }
                                    m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)((Object)this), (long)-8105736991458494393L, (long)l), (long)-8166707229031638563L, (long)l), (Object)" ", (long)-7540700885624481140L, (long)l);
                                    if (l < 0L || callSite2 == null) break block18;
                                }
                                catch (n9 n93) {
                                    throw m44.a("i", (Object)((Object)n93), (long)-7984076757674259100L, (long)l);
                                }
                            }
                            callSite3 = m44.a("w", (Object)((Object)this), (long)-8105736991458494393L, (long)l);
                        }
                        catch (n9 n94) {
                            throw m44.a("i", (Object)((Object)n94), (long)-7984076757674259100L, (long)l);
                        }
                    }
                    m44.a("v", (Object)m44.a("w", (Object)callSite3, (long)-8166707229031638563L, (long)l), (Object)m44.a("m", (long)-8442686341980616497L, (long)l), (long)-7540700885624481140L, (long)l);
                }
                try {
                    block20: {
                        try {
                            try {
                                try {
                                    try {
                                        callSite = m44.a("w", (Object)((Object)this), (long)-8105736991458494393L, (long)l);
                                        if (callSite2 != null) break block19;
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = callSite;
                                        objectArray3[0] = l2;
                                        if (((String)((Object)m44.a("v", (Object)m44.a("i", (Object)objectArray3, (long)-8472427769215725938L, (long)l), (long)-8524716127246394078L, (long)l))).trim().length() <= 0) break block20;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("i", (Object)((Object)n95), (long)-7984076757674259100L, (long)l);
                                    }
                                    callSite = m44.a("w", (Object)((Object)this), (long)-8105736991458494393L, (long)l);
                                    if (callSite2 != null) break block19;
                                }
                                catch (n9 n96) {
                                    throw m44.a("i", (Object)((Object)n96), (long)-7984076757674259100L, (long)l);
                                }
                                if (l < 0L) break block19;
                                if (((String)((Object)m44.a("v", (Object)m44.a("w", (Object)callSite, (long)-7755158855606968285L, (long)l), (long)-8635802925193769609L, (long)l))).trim().length() <= 0) break block20;
                            }
                            catch (n9 n97) {
                                throw m44.a("i", (Object)((Object)n97), (long)-7984076757674259100L, (long)l);
                            }
                            m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)((Object)this), (long)-8105736991458494393L, (long)l), (long)-8597210069511836366L, (long)l), (boolean)true, (long)-8013359239977934292L, (long)l);
                            if (callSite2 == null) break block21;
                        }
                        catch (n9 n98) {
                            throw m44.a("i", (Object)((Object)n98), (long)-7984076757674259100L, (long)l);
                        }
                    }
                    callSite = m44.a("w", (Object)((Object)this), (long)-8105736991458494393L, (long)l);
                }
                catch (n9 n99) {
                    throw m44.a("i", (Object)((Object)n99), (long)-7984076757674259100L, (long)l);
                }
            }
            m44.a("v", (Object)m44.a("w", (Object)callSite, (long)-8597210069511836366L, (long)l), (boolean)false, (long)-8013359239977934292L, (long)l);
        }
    }

    u8(wf wf2) {
        this.a = wf2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
