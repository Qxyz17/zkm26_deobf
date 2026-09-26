/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l67;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.xt;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class l6j
extends l67 {
    private static final long a = prr.a((long)678006444100683939L, (long)1005618467263690610L, MethodHandles.lookup().lookupClass()).a(240383024278850L);

    public int hashCode() {
        block5: {
            CallSite callSite;
            block4: {
                long l = a ^ 0x13AF3DF910C6L;
                CallSite callSite2 = m44.a("k", (long)-1530787570724299247L, (long)l);
                try {
                    try {
                        callSite = m44.a("u", (Object)((Object)this), (long)-637168297000733491L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)-1336061113835236282L, (long)l);
                    }
                    callSite = m44.a("u", (Object)((Object)this), (long)-637168297000733491L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)-1336061113835236282L, (long)l);
                }
            }
            return callSite.hashCode() + 1;
        }
        return 0;
    }

    public String B(Object[] objectArray) {
        CallSite callSite;
        block13: {
            Object object;
            block10: {
                int n;
                block11: {
                    CallSite callSite2;
                    long l;
                    block12: {
                        CallSite callSite3;
                        long l2;
                        block9: {
                            l = (Long)objectArray[0];
                            l2 = l ^ 0x4CA1B49CCED9L;
                            object = null;
                            callSite2 = m44.a("j", (long)8962443080938850480L, (long)l);
                            try {
                                try {
                                    callSite3 = m44.a("t", (Object)((Object)this), (long)7028184294073885292L, (long)l);
                                    if (callSite2 != null) break block9;
                                    if (callSite3 == null) break block10;
                                }
                                catch (n9 n92) {
                                    throw m44.a("j", (Object)((Object)n92), (long)8922802740506313447L, (long)l);
                                }
                                callSite3 = m44.a("t", (Object)((Object)this), (long)7028184294073885292L, (long)l);
                            }
                            catch (n9 n93) {
                                throw m44.a("j", (Object)((Object)n93), (long)8922802740506313447L, (long)l);
                            }
                        }
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        object = m44.a("u", (Object)callSite3, (Object)objectArray2, (long)7106370711761731407L, (long)l);
                        int n2 = ((String)object).lastIndexOf("[");
                        try {
                            n = n2;
                            if (callSite2 != null) break block11;
                            if (n <= -1) break block12;
                        }
                        catch (n9 n94) {
                            throw m44.a("j", (Object)((Object)n94), (long)8922802740506313447L, (long)l);
                        }
                        object = ((String)object).substring(n2 + 1);
                    }
                    try {
                        callSite = object;
                        if (callSite2 != null) break block13;
                        n = ((String)((Object)callSite)).endsWith(";") ? 1 : 0;
                    }
                    catch (n9 n95) {
                        throw m44.a("j", (Object)((Object)n95), (long)8922802740506313447L, (long)l);
                    }
                }
                if (n != 0) {
                    object = ((String)object).substring(1, ((String)object).length() - 1);
                }
            }
            callSite = object;
        }
        return callSite;
    }

    public boolean equals(Object object) {
        boolean bl;
        block12: {
            block13: {
                boolean bl2;
                CallSite callSite;
                long l;
                block14: {
                    l6j l6j2;
                    block15: {
                        block17: {
                            CallSite callSite2;
                            block16: {
                                l = a ^ 0x525795836249L;
                                CallSite callSite3 = m44.a("l", (long)-7471809159204213602L, (long)l);
                                try {
                                    bl = object instanceof l6j;
                                    if (callSite3 != null) break block12;
                                    if (!bl) break block13;
                                }
                                catch (n9 n92) {
                                    throw m44.a("l", (Object)((Object)n92), (long)-6919188713333774647L, (long)l);
                                }
                                l6j2 = (l6j)((Object)object);
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = m44.a("r", (Object)((Object)this), (long)-8816056614795934142L, (long)l);
                                                if (callSite3 != null) break block14;
                                                if (callSite == null) break block15;
                                            }
                                            catch (n9 n93) {
                                                throw m44.a("l", (Object)((Object)n93), (long)-6919188713333774647L, (long)l);
                                            }
                                            callSite2 = m44.a("r", (Object)((Object)l6j2), (long)-8816056614795934142L, (long)l);
                                            if (callSite3 != null) break block16;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("l", (Object)((Object)n94), (long)-6919188713333774647L, (long)l);
                                        }
                                        if (callSite2 == null) break block17;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("l", (Object)((Object)n95), (long)-6919188713333774647L, (long)l);
                                    }
                                    callSite2 = m44.a("r", (Object)((Object)this), (long)-8816056614795934142L, (long)l);
                                }
                                catch (n9 n96) {
                                    throw m44.a("l", (Object)((Object)n96), (long)-6919188713333774647L, (long)l);
                                }
                            }
                            return callSite2.equals(m44.a("r", (Object)((Object)l6j2), (long)-8816056614795934142L, (long)l));
                        }
                        return false;
                    }
                    callSite = m44.a("r", (Object)((Object)l6j2), (long)-8816056614795934142L, (long)l);
                }
                try {
                    bl2 = callSite == null;
                }
                catch (n9 n97) {
                    throw m44.a("l", (Object)((Object)n97), (long)-6919188713333774647L, (long)l);
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public l6j(xt xt2, long l) {
        long l2 = (l = a ^ l) ^ 0x40D981EACAD4L;
        super(l2, xt2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
