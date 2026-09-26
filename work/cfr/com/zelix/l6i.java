/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class l6i {
    private final String k;
    private final String C;
    private final String w;
    private final int Q;
    private static final long a = prr.a(-8009424149148428747L, 6108254748384924951L, MethodHandles.lookup().lookupClass()).a(62265185560855L);

    public boolean equals(Object object) {
        boolean bl2;
        block16: {
            block17: {
                boolean bl3;
                block22: {
                    block19: {
                        CallSite callSite;
                        long l10;
                        block21: {
                            l6i l6i2;
                            block20: {
                                block18: {
                                    l10 = a ^ 0x54EA5840035EL;
                                    callSite = m44.a("o", (long)4394960880172883122L, (long)l10);
                                    try {
                                        bl2 = object instanceof l6i;
                                        if (callSite != null) break block16;
                                        if (!bl2) break block17;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("o", (Object)n92, (long)4484721737108178483L, (long)l10);
                                    }
                                    l6i2 = (l6i)object;
                                    try {
                                        try {
                                            bl3 = this.Q;
                                            if (callSite != null) break block18;
                                            if (bl3 != l6i2.Q) break block19;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("o", (Object)n93, (long)4484721737108178483L, (long)l10);
                                        }
                                        bl3 = ((String)((Object)m44.a("q", (Object)this, (long)4240807019807593195L, (long)l10))).equals(m44.a("q", (Object)l6i2, (long)4240807019807593195L, (long)l10));
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("o", (Object)n94, (long)4484721737108178483L, (long)l10);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite != null) break block20;
                                        if (!bl3) break block19;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("o", (Object)n95, (long)4484721737108178483L, (long)l10);
                                    }
                                    bl3 = ((String)((Object)m44.a("q", (Object)this, (long)2666713805370374812L, (long)l10))).equals(m44.a("q", (Object)l6i2, (long)2666713805370374812L, (long)l10));
                                }
                                catch (n9 n96) {
                                    throw m44.a("o", (Object)n96, (long)4484721737108178483L, (long)l10);
                                }
                            }
                            try {
                                try {
                                    if (callSite != null) break block21;
                                    if (!bl3) break block19;
                                }
                                catch (n9 n97) {
                                    throw m44.a("o", (Object)n97, (long)4484721737108178483L, (long)l10);
                                }
                                bl3 = ((String)((Object)m44.a("q", (Object)this, (long)2648043103339028730L, (long)l10))).equals(m44.a("q", (Object)l6i2, (long)2648043103339028730L, (long)l10));
                            }
                            catch (n9 n98) {
                                throw m44.a("o", (Object)n98, (long)4484721737108178483L, (long)l10);
                            }
                        }
                        try {
                            if (callSite != null) break block22;
                            if (!bl3) break block19;
                        }
                        catch (n9 n99) {
                            throw m44.a("o", (Object)n99, (long)4484721737108178483L, (long)l10);
                        }
                        bl3 = true;
                        break block22;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public int hashCode() {
        return this.Q;
    }

    public l6i(String string, String string2, String string3) {
        this.k = string;
        this.C = string2;
        this.w = string3;
        this.Q = string.hashCode() ^ string2.hashCode() ^ string3.hashCode();
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

