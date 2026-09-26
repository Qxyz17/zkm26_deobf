/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.js;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class x_
extends js {
    private int k;
    private static final long a = prr.a((long)3114448090507799579L, (long)-3062422433556091223L, MethodHandles.lookup().lookupClass()).a(243932612890374L);

    public va A(long l) {
        return m44.a("i", (long)-5680746850511679551L, (long)l);
    }

    private x_(int n, int n2, short s, to to2, int n3, char c) {
        long l = ((long)n2 << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
        super(n, to2);
        m44.a("v", (Object)((Object)this), (int)n3, (long)45801996992444171L, (long)l);
    }

    public String z(char c, int n, short s) {
        return ((Object)((Object)this)).getClass().getName();
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
    }

    static x_ G(to to2, int n, char c, int n2, char c2) {
        x_ x_2;
        block18: {
            int n3;
            x_[] x_Array;
            block20: {
                block19: {
                    int n4;
                    int n5;
                    CallSite callSite;
                    int n6;
                    int n7;
                    int n8;
                    long l;
                    block16: {
                        l = ((long)c << 48 | (long)n2 << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ a;
                        long l2 = l ^ 0x116300B23DEDL;
                        n8 = (int)(l2 >>> 32);
                        n7 = (int)(l2 << 32 >>> 48);
                        n6 = (int)(l2 << 48 >>> 48);
                        callSite = m44.a("o", (long)7263178950922338863L, (long)l);
                        try {
                            block17: {
                                try {
                                    try {
                                        try {
                                            try {
                                                n5 = n;
                                                n4 = 1;
                                                if (callSite != false) break block16;
                                                if (n5 != n4) break block17;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("o", (Object)((Object)n92), (long)8817431984774748413L, (long)l);
                                            }
                                            x_2 = to2.r[0];
                                            if (callSite != false) break block18;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("o", (Object)((Object)n93), (long)8817431984774748413L, (long)l);
                                        }
                                        if (x_2 != null) break block19;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("o", (Object)((Object)n94), (long)8817431984774748413L, (long)l);
                                    }
                                    x_Array = to2.r;
                                    n3 = 0;
                                    if (n2 < 0) break block20;
                                    x_Array[n3] = new x_(0, n8, (short)n7, to2, 1, (char)n6);
                                    if (callSite == false) break block19;
                                }
                                catch (n9 n95) {
                                    throw m44.a("o", (Object)((Object)n95), (long)8817431984774748413L, (long)l);
                                }
                            }
                            n5 = n;
                            n4 = 2;
                        }
                        catch (n9 n96) {
                            throw m44.a("o", (Object)((Object)n96), (long)8817431984774748413L, (long)l);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n5 != n4) break block19;
                                x_2 = to2.r[1];
                                if (callSite != false) break block18;
                            }
                            catch (n9 n97) {
                                throw m44.a("o", (Object)((Object)n97), (long)8817431984774748413L, (long)l);
                            }
                            if (x_2 != null) break block19;
                        }
                        catch (n9 n98) {
                            throw m44.a("o", (Object)((Object)n98), (long)8817431984774748413L, (long)l);
                        }
                        to2.r[1] = new x_(0, n8, (short)n7, to2, 2, (char)n6);
                    }
                    catch (n9 n99) {
                        throw m44.a("o", (Object)((Object)n99), (long)8817431984774748413L, (long)l);
                    }
                }
                x_Array = to2.r;
                n3 = n - 1;
            }
            x_2 = x_Array[n3];
        }
        return x_2;
    }

    protected int x(long l) {
        return (int)m44.a("v", (Object)((Object)this), (long)7048347120556873337L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
