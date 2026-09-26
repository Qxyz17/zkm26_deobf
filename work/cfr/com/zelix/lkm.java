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
    private static final long a = prr.a(8677321796940283092L, 4000712592578927204L, MethodHandles.lookup().lookupClass()).a(185030657463649L);

    public lkm(boolean bl2, long l10, boolean bl3) {
        long l11 = (l10 = a ^ l10) ^ 0x730A73622131L;
        this(bl2, bl3, 1, 1, l11);
    }

    public lkm(boolean bl2, boolean bl3, int n10, int n11, long l10) {
        block12: {
            boolean bl4;
            CallSite callSite;
            block10: {
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("j", (long)-6794827874663592233L, (long)l10);
                callSite = callSite2;
                try {
                    block11: {
                        try {
                            try {
                                bl4 = bl2;
                                if (callSite == null) break block10;
                                if (!bl4) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)-6707083709724206335L, (long)l10);
                            }
                            m44.a("u", (Object)this, (Object)m44.a("j", (Object)m44.a("j", (long)-6579976508215755674L, (long)l10), (Object)m44.a("j", (int)n11, (int)n10, (int)n11, (int)n10, (long)-5014277065732432424L, (long)l10), (long)-6355890577714660892L, (long)l10), (long)-4655330287890796894L, (long)l10);
                            if (callSite != null) break block12;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)-6707083709724206335L, (long)l10);
                        }
                    }
                    bl4 = bl3;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)n94, (long)-6707083709724206335L, (long)l10);
                }
            }
            try {
                block13: {
                    try {
                        if (!bl4) break block13;
                        m44.a("u", (Object)this, (Object)m44.a("j", (Object)m44.a("j", (long)-6826241769510942440L, (long)l10), (Object)m44.a("j", (int)n11, (int)n10, (int)n11, (int)n10, (long)-5014277065732432424L, (long)l10), (long)-6355890577714660892L, (long)l10), (long)-4655330287890796894L, (long)l10);
                        if (callSite != null) break block12;
                    }
                    catch (n9 n95) {
                        throw m44.a("j", (Object)n95, (long)-6707083709724206335L, (long)l10);
                    }
                }
                m44.a("u", (Object)this, (Object)m44.a("j", (Object)m44.a("j", (long)-6691145692868174358L, (long)l10), (Object)m44.a("j", (int)n11, (int)n10, (int)n11, (int)n10, (long)-5014277065732432424L, (long)l10), (long)-6355890577714660892L, (long)l10), (long)-4655330287890796894L, (long)l10);
            }
            catch (n9 n96) {
                throw m44.a("j", (Object)n96, (long)-6707083709724206335L, (long)l10);
            }
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

