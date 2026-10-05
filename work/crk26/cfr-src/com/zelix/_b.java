/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class _b {
    private final String J;
    private final String r;
    private final String s;
    private final lbt v;
    private static final long a = prr.a(-1840515387512316228L, -1312332680270558791L, MethodHandles.lookup().lookupClass()).a(88998941798680L);

    public String d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)this, (long)3482084823361751231L, (long)l10);
    }

    public lbt c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("w", (Object)this, (long)-8625712094128227051L, (long)l10);
    }

    public _b(String string, lbt lbt2, String string2, String string3, long l10) {
        String string4;
        block10: {
            block11: {
                String string5;
                CallSite callSite;
                block8: {
                    block9: {
                        l10 = a ^ l10;
                        CallSite callSite2 = m44.a("k", (long)-4174176948187388322L, (long)l10);
                        this.s = string;
                        callSite = callSite2;
                        try {
                            try {
                                this.v = lbt2;
                                _b _b2 = this;
                                string5 = string2;
                                if (callSite != null) break block8;
                                if (string5 == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)n92, (long)-4572195394971295234L, (long)l10);
                            }
                            string5 = string2.toLowerCase();
                            break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)n93, (long)-4572195394971295234L, (long)l10);
                        }
                    }
                    string5 = null;
                }
                try {
                    try {
                        _b2.r = string5;
                        _b _b3 = this;
                        string4 = string3;
                        if (callSite != null) break block10;
                        if (string4 == null) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)n94, (long)-4572195394971295234L, (long)l10);
                    }
                    string4 = string3.toLowerCase();
                    break block10;
                }
                catch (n9 n95) {
                    throw m44.a("k", (Object)n95, (long)-4572195394971295234L, (long)l10);
                }
            }
            string4 = null;
        }
        _b3.J = string4;
    }

    public String W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)1170613216370704568L, (long)l10);
    }

    public String P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)-8914877641986435348L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

