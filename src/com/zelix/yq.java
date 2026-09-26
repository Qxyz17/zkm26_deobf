/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l6x;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class yq {
    private String R;
    private String l;
    private boolean f;
    private l6x B;
    private yq Z;
    private static final long a = prr.a((long)-4728683658431820279L, (long)-2506157847118967160L, MethodHandles.lookup().lookupClass()).a(43080461459565L);

    String e() {
        return this.R;
    }

    String H(Object[] objectArray) {
        return this.l;
    }

    yq(String string, String string2) {
        this.l = string;
        this.R = string2;
    }

    boolean R() {
        return this.f;
    }

    void m(Object[] objectArray) {
        String string = (String)objectArray[0];
        this.l = string;
    }

    String P(Object[] objectArray) {
        String string;
        StringBuilder stringBuilder;
        block14: {
            yq yq2;
            block12: {
                block13: {
                    String string2;
                    CallSite callSite;
                    long l;
                    block11: {
                        yq yq3;
                        block9: {
                            block10: {
                                l = (Long)objectArray[0];
                                l = a ^ l;
                                callSite = m44.a("o", (long)-2008961318853234439L, (long)l);
                                try {
                                    try {
                                        stringBuilder = new StringBuilder();
                                        yq3 = this;
                                        if (callSite != false) break block9;
                                        if (yq3.l != null) break block10;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("o", (Object)((Object)n92), (long)-2134454137416279499L, (long)l);
                                    }
                                    string2 = "";
                                    break block11;
                                }
                                catch (n9 n93) {
                                    throw m44.a("o", (Object)((Object)n93), (long)-2134454137416279499L, (long)l);
                                }
                            }
                            yq3 = this;
                        }
                        string2 = yq3.l;
                    }
                    try {
                        try {
                            if (l >= 0L) {
                                stringBuilder = stringBuilder.append(string2);
                                yq2 = this;
                                if (callSite != false) break block12;
                                string2 = yq2.R;
                            }
                            if (string2 != null) break block13;
                        }
                        catch (n9 n94) {
                            throw m44.a("o", (Object)((Object)n94), (long)-2134454137416279499L, (long)l);
                        }
                        string = "";
                        break block14;
                    }
                    catch (n9 n95) {
                        throw m44.a("o", (Object)((Object)n95), (long)-2134454137416279499L, (long)l);
                    }
                }
                yq2 = this;
            }
            string = yq2.R;
        }
        return stringBuilder.append(string).toString();
    }

    void Q(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        this.f = bl;
    }

    yq l(Object[] objectArray) {
        return this.Z;
    }

    void I(Object[] objectArray) {
        yq yq2 = (yq)objectArray[0];
        this.Z = yq2;
    }

    void v(Object[] objectArray) {
        String string = (String)objectArray[0];
        this.R = string;
    }

    void X(short s, int n, char c, l6x l6x2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ a;
        m44.a("w", (Object)this, (l6x)l6x2, (long)-6086436270077871326L, (long)l);
    }

    boolean g(long l) {
        boolean bl;
        block6: {
            block5: {
                yq yq2;
                CallSite callSite;
                block4: {
                    l = a ^ l;
                    callSite = m44.a("k", (long)9095756933378222813L, (long)l);
                    try {
                        yq2 = this.Z;
                        if (callSite != false) break block4;
                        if (yq2 == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)8666271120405430289L, (long)l);
                    }
                    yq2 = this;
                }
                try {
                    bl = yq2.f;
                    if (callSite != false) break block6;
                    if (bl) break block5;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)8666271120405430289L, (long)l);
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    yq(String string, String string2, boolean bl) {
        this.l = string;
        this.R = string2;
        this.f = bl;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
