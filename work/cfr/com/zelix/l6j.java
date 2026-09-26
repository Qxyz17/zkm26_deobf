/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.js;
import com.zelix.l67;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.xt;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class l6j
extends l67 {
    private static final long a = prr.a(678006444100683939L, 1005618467263690610L, MethodHandles.lookup().lookupClass()).a(240383024278850L);

    @Override
    public int hashCode() {
        block5: {
            CallSite callSite;
            block4: {
                long l10 = a ^ 0x13AF3DF910C6L;
                CallSite callSite2 = m44.a("k", (long)-1530787570724299247L, (long)l10);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)-637168297000733491L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)-1336061113835236282L, (long)l10);
                    }
                    callSite = m44.a("u", (Object)this, (long)-637168297000733491L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)-1336061113835236282L, (long)l10);
                }
            }
            return ((js)((Object)callSite)).hashCode() + 1;
        }
        return 0;
    }

    @Override
    public String B(Object[] objectArray) {
        CallSite callSite;
        block13: {
            Object object;
            block10: {
                int n10;
                block11: {
                    CallSite callSite2;
                    long l10;
                    block12: {
                        CallSite callSite3;
                        long l11;
                        block9: {
                            l10 = (Long)objectArray[0];
                            l11 = l10 ^ 0x4CA1B49CCED9L;
                            object = null;
                            callSite2 = m44.a("j", (long)8962443080938850480L, (long)l10);
                            try {
                                try {
                                    callSite3 = m44.a("t", (Object)this, (long)7028184294073885292L, (long)l10);
                                    if (callSite2 != null) break block9;
                                    if (callSite3 == null) break block10;
                                }
                                catch (n9 n92) {
                                    throw m44.a("j", (Object)n92, (long)8922802740506313447L, (long)l10);
                                }
                                callSite3 = m44.a("t", (Object)this, (long)7028184294073885292L, (long)l10);
                            }
                            catch (n9 n93) {
                                throw m44.a("j", (Object)n93, (long)8922802740506313447L, (long)l10);
                            }
                        }
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        object = m44.a("u", (Object)callSite3, (Object)objectArray2, (long)7106370711761731407L, (long)l10);
                        int n11 = ((String)object).lastIndexOf("[");
                        try {
                            n10 = n11;
                            if (callSite2 != null) break block11;
                            if (n10 <= -1) break block12;
                        }
                        catch (n9 n94) {
                            throw m44.a("j", (Object)n94, (long)8922802740506313447L, (long)l10);
                        }
                        object = ((String)object).substring(n11 + 1);
                    }
                    try {
                        callSite = object;
                        if (callSite2 != null) break block13;
                        n10 = ((String)((Object)callSite)).endsWith(";") ? 1 : 0;
                    }
                    catch (n9 n95) {
                        throw m44.a("j", (Object)n95, (long)8922802740506313447L, (long)l10);
                    }
                }
                if (n10 != 0) {
                    object = ((String)object).substring(1, ((String)object).length() - 1);
                }
            }
            callSite = object;
        }
        return callSite;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl2;
        block12: {
            block13: {
                boolean bl3;
                CallSite callSite;
                long l10;
                block14: {
                    l6j l6j2;
                    block15: {
                        block17: {
                            CallSite callSite2;
                            block16: {
                                l10 = a ^ 0x525795836249L;
                                CallSite callSite3 = m44.a("l", (long)-7471809159204213602L, (long)l10);
                                try {
                                    bl2 = object instanceof l6j;
                                    if (callSite3 != null) break block12;
                                    if (!bl2) break block13;
                                }
                                catch (n9 n92) {
                                    throw m44.a("l", (Object)n92, (long)-6919188713333774647L, (long)l10);
                                }
                                l6j2 = (l6j)object;
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = m44.a("r", (Object)this, (long)-8816056614795934142L, (long)l10);
                                                if (callSite3 != null) break block14;
                                                if (callSite == null) break block15;
                                            }
                                            catch (n9 n93) {
                                                throw m44.a("l", (Object)n93, (long)-6919188713333774647L, (long)l10);
                                            }
                                            callSite2 = m44.a("r", (Object)l6j2, (long)-8816056614795934142L, (long)l10);
                                            if (callSite3 != null) break block16;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("l", (Object)n94, (long)-6919188713333774647L, (long)l10);
                                        }
                                        if (callSite2 == null) break block17;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("l", (Object)n95, (long)-6919188713333774647L, (long)l10);
                                    }
                                    callSite2 = m44.a("r", (Object)this, (long)-8816056614795934142L, (long)l10);
                                }
                                catch (n9 n96) {
                                    throw m44.a("l", (Object)n96, (long)-6919188713333774647L, (long)l10);
                                }
                            }
                            return ((js)((Object)callSite2)).equals(m44.a("r", (Object)l6j2, (long)-8816056614795934142L, (long)l10));
                        }
                        return false;
                    }
                    callSite = m44.a("r", (Object)l6j2, (long)-8816056614795934142L, (long)l10);
                }
                try {
                    bl3 = callSite == null;
                }
                catch (n9 n97) {
                    throw m44.a("l", (Object)n97, (long)-6919188713333774647L, (long)l10);
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public l6j(xt xt2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x40D981EACAD4L;
        super(l11, xt2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

