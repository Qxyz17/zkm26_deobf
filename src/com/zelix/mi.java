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
    private static final long a = prr.a((long)-1726998895658683710L, (long)-1429691348717651690L, MethodHandles.lookup().lookupClass()).a(50868692273225L);

    public int compareTo(Object object) {
        long l = a ^ 0x2CF031772CAAL;
        long l2 = l ^ 0x5DFBB302066EL;
        return (int)m44.a("w", (Object)this, (Object)((mi)object), (long)l2, (long)2553091866130822305L, (long)l);
    }

    public int Q(mi mi2, long l) {
        float f;
        block10: {
            block11: {
                CallSite callSite;
                block8: {
                    block9: {
                        l = a ^ l;
                        callSite = m44.a("k", (long)2631601265495390899L, (long)l);
                        try {
                            try {
                                float f2 = this.g - mi2.g;
                                f = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
                                if (callSite != null) break block8;
                                if (f >= 0) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)((Object)n92), (long)4230087607843417923L, (long)l);
                            }
                            return -1;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)((Object)n93), (long)4230087607843417923L, (long)l);
                        }
                    }
                    float f3 = this.g - mi2.g;
                    f = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (f != false) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)((Object)n94), (long)4230087607843417923L, (long)l);
                    }
                    return 0;
                }
                catch (n9 n95) {
                    throw m44.a("k", (Object)((Object)n95), (long)4230087607843417923L, (long)l);
                }
            }
            f = 1.0f;
        }
        return (int)f;
    }

    public mi(long l, float f, Object object) {
        l = a ^ l;
        this.g = f;
        m44.a("u", (Object)this, (Object)object, (long)-497784117088311702L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
