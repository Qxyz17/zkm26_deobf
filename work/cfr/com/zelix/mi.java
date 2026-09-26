/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class mi
implements Comparable {
    public Object j;
    public float g;
    private static final long a = prr.a(-1726998895658683710L, -1429691348717651690L, MethodHandles.lookup().lookupClass()).a(50868692273225L);

    public int compareTo(Object object) {
        long l10 = a ^ 0x2CF031772CAAL;
        long l11 = l10 ^ 0x5DFBB302066EL;
        return (int)m44.a("w", (Object)this, (Object)((mi)object), (long)l11, (long)2553091866130822305L, (long)l10);
    }

    public int Q(mi mi2, long l10) {
        float f10;
        block10: {
            block11: {
                CallSite callSite;
                block8: {
                    block9: {
                        l10 = a ^ l10;
                        callSite = m44.a("k", (long)2631601265495390899L, (long)l10);
                        try {
                            try {
                                float f11 = this.g - mi2.g;
                                f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                if (callSite != null) break block8;
                                if (f10 >= 0) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)n92, (long)4230087607843417923L, (long)l10);
                            }
                            return -1;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)n93, (long)4230087607843417923L, (long)l10);
                        }
                    }
                    float f12 = this.g - mi2.g;
                    f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (f10 != false) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)n94, (long)4230087607843417923L, (long)l10);
                    }
                    return 0;
                }
                catch (n9 n95) {
                    throw m44.a("k", (Object)n95, (long)4230087607843417923L, (long)l10);
                }
            }
            f10 = 1.0f;
        }
        return (int)f10;
    }

    public mi(long l10, float f10, Object object) {
        l10 = a ^ l10;
        this.g = f10;
        m44.a("u", (Object)this, (Object)object, (long)-497784117088311702L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

