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

public class jm
extends ja {
    String G;
    private static final long b = prr.a((long)219723926141539332L, (long)-1731159524547565470L, MethodHandles.lookup().lookupClass()).a(43204510206887L);

    protected void k(Object[] objectArray) {
        block10: {
            jm jm2;
            long l;
            long l2;
            block11: {
                CallSite callSite;
                block9: {
                    l2 = (Long)objectArray[0];
                    lkc lkc2 = (lkc)objectArray[1];
                    l = l2 ^ 0x1ED7C4F8C8F2L;
                    CallSite callSite2 = m44.a("j", (long)7374193648435527192L, (long)l2);
                    try {
                        try {
                            try {
                                callSite = m44.a("t", (Object)((Object)this), (long)7300947376774249410L, (long)l2);
                                if (callSite2 != null) break block9;
                                if (callSite == null) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)((Object)n92), (long)9020457919646456108L, (long)l2);
                            }
                            jm2 = this;
                            if (callSite2 != null) break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)((Object)n93), (long)9020457919646456108L, (long)l2);
                        }
                        callSite = m44.a("t", (Object)((Object)jm2), (long)8987493605002518918L, (long)l2);
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)((Object)n94), (long)9020457919646456108L, (long)l2);
                    }
                }
                try {
                    if (callSite == null) {
                        m44.a("v", (Object)((Object)this), (String)"", (long)8987493605002518918L, (long)l2);
                    }
                }
                catch (n9 n95) {
                    throw m44.a("j", (Object)((Object)n95), (long)9020457919646456108L, (long)l2);
                }
                jm2 = this;
            }
            Object[] objectArray2 = new Object[4];
            objectArray2[3] = l;
            objectArray2[2] = m44.a("t", (Object)((Object)this), (long)6932199952998774191L, (long)l2);
            objectArray2[1] = m44.a("t", (Object)((Object)this), (long)7300947376774249410L, (long)l2);
            objectArray2[0] = m44.a("t", (Object)((Object)this), (long)8987493605002518918L, (long)l2);
            m44.a("u", (Object)m44.a("t", (Object)((Object)jm2), (long)8871810686016648836L, (long)l2), (Object)objectArray2, (long)7153576437577966592L, (long)l2);
        }
    }

    void U(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = b ^ l;
        m44.a("u", (Object)((Object)this), (String)string, (long)-4655960056806514083L, (long)l);
    }

    public jm(int n, int n2, char c, int n3) {
        long l = ((long)n2 << 32 | (long)c << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        long l2 = l ^ 0x46FCE554534L;
        super(n, l2);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
