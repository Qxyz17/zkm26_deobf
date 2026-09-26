/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.JPanel;

public class lkm
extends JPanel {
    private static final long a = prr.a((long)8677321796940283092L, (long)4000712592578927204L, MethodHandles.lookup().lookupClass()).a(185030657463649L);

    public lkm(boolean bl, long l, boolean bl2) {
        long l2 = (l = a ^ l) ^ 0x730A73622131L;
        this(bl, bl2, 1, 1, l2);
    }

    public lkm(boolean bl, boolean bl2, int n, int n2, long l) {
        block12: {
            boolean bl3;
            CallSite callSite;
            block10: {
                l = a ^ l;
                CallSite callSite2 = m44.a("j", (long)-6794827874663592233L, (long)l);
                callSite = callSite2;
                try {
                    block11: {
                        try {
                            try {
                                bl3 = bl;
                                if (callSite == null) break block10;
                                if (!bl3) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)((Object)n92), (long)-6707083709724206335L, (long)l);
                            }
                            m44.a("u", (Object)this, (Object)m44.a("j", (Object)m44.a("j", (long)-6579976508215755674L, (long)l), (Object)m44.a("j", (int)n2, (int)n, (int)n2, (int)n, (long)-5014277065732432424L, (long)l), (long)-6355890577714660892L, (long)l), (long)-4655330287890796894L, (long)l);
                            if (callSite != null) break block12;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)((Object)n93), (long)-6707083709724206335L, (long)l);
                        }
                    }
                    bl3 = bl2;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)((Object)n94), (long)-6707083709724206335L, (long)l);
                }
            }
            try {
                block13: {
                    try {
                        if (!bl3) break block13;
                        m44.a("u", (Object)this, (Object)m44.a("j", (Object)m44.a("j", (long)-6826241769510942440L, (long)l), (Object)m44.a("j", (int)n2, (int)n, (int)n2, (int)n, (long)-5014277065732432424L, (long)l), (long)-6355890577714660892L, (long)l), (long)-4655330287890796894L, (long)l);
                        if (callSite != null) break block12;
                    }
                    catch (n9 n95) {
                        throw m44.a("j", (Object)((Object)n95), (long)-6707083709724206335L, (long)l);
                    }
                }
                m44.a("u", (Object)this, (Object)m44.a("j", (Object)m44.a("j", (long)-6691145692868174358L, (long)l), (Object)m44.a("j", (int)n2, (int)n, (int)n2, (int)n, (long)-5014277065732432424L, (long)l), (long)-6355890577714660892L, (long)l), (long)-4655330287890796894L, (long)l);
            }
            catch (n9 n96) {
                throw m44.a("j", (Object)((Object)n96), (long)-6707083709724206335L, (long)l);
            }
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
