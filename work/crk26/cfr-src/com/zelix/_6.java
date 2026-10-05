/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._v;
import com.zelix.em;
import com.zelix.l62;
import com.zelix.l6z;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class _6 {
    em L;
    private static final long a = prr.a(-3151061462990620974L, 436015114937406629L, MethodHandles.lookup().lookupClass()).a(256884312981985L);

    public _v C(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x28B574EA5C71L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = string2;
        objectArray2[2] = true;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("q", (Object)this, (Object)objectArray2, (long)3398842224313437036L, (long)l10);
    }

    public _v s(Object[] objectArray) {
        String string = (String)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x301E97A22342L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = null;
        objectArray2[2] = bl2;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)5771367686139638879L, (long)l10);
    }

    public _v E(String string, Integer n10, long l10, String string2, l6z l6z2) {
        long l11 = (l10 = a ^ l10) ^ 0x649CCF3E1084L;
        return this.a(string, n10, true, string2, l11, l6z2);
    }

    public _v g(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        l6z l6z2 = (l6z)objectArray[2];
        long l10 = (Long)objectArray[3];
        long l11 = (l10 = a ^ l10) ^ 0x5E623B546811L;
        return this.a(string, null, true, string2, l11, l6z2);
    }

    public _v L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x300069CA26E4L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = null;
        objectArray2[2] = true;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("t", (Object)this, (Object)objectArray2, (long)6178380462708060665L, (long)l10);
    }

    public _v G(Object[] objectArray) {
        String string = (String)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x602A48ED6B18L;
        return this.n(string, n10, l11, true, null);
    }

    public _v a(String string, Integer n10, boolean bl2, String string2, long l10, l6z l6z2) {
        _v _v2;
        int n11;
        int n12;
        int n13;
        block6: {
            _v _v3;
            block8: {
                block7: {
                    long l11 = l10 = a ^ l10;
                    long l12 = l11 ^ 0x3F5A9114AD4AL;
                    long l13 = l11 ^ 0x269587CD6983L;
                    long l14 = l11 ^ 0x5664BD169531L;
                    n13 = (int)(l14 >>> 48);
                    n12 = (int)(l14 << 16 >>> 48);
                    n11 = (int)(l14 << 32 >>> 32);
                    long l15 = l11 ^ 0x2246152B9DADL;
                    int n14 = (int)(l15 >>> 48);
                    int n15 = (int)(l15 << 16 >>> 48);
                    int n16 = (int)(l15 << 32 >>> 32);
                    _v2 = l62.G(l12, string);
                    CallSite callSite = m44.a("k", (long)2515884219836809894L, (long)l10);
                    try {
                        try {
                            try {
                                if (_v2 == null) break block6;
                                if (n10 == null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)n92, (long)4577356047989983902L, (long)l10);
                            }
                            _v3 = _v2;
                            if (callSite != null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)n93, (long)4577356047989983902L, (long)l10);
                        }
                        if (!_v3.P((char)n14, (short)n15, n16)) break block7;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)n94, (long)4577356047989983902L, (long)l10);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = n10;
                    objectArray[0] = l13;
                    CallSite callSite2 = m44.a("t", (Object)_v2, (Object)objectArray, (long)4278523815894656790L, (long)l10);
                    return callSite2;
                }
                _v3 = _v2;
            }
            return _v3;
        }
        _v2 = this.L.V(string, n10, (short)n13, bl2, string2, (char)n12, l6z2, n11);
        return _v2;
    }

    public _v K(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        boolean bl2 = (Boolean)objectArray[2];
        String string2 = (String)objectArray[3];
        long l11 = (l10 = a ^ l10) ^ 0x106997DC569CL;
        return this.a(string, null, bl2, string2, l11, null);
    }

    public _6(em em2) {
        this.L = em2;
    }

    public _v g(String string, Integer n10, long l10, String string2) {
        long l11 = (l10 = a ^ l10) ^ 0x339DEDF97208L;
        return this.n(string, n10, l11, true, string2);
    }

    public _v n(String string, Integer n10, long l10, boolean bl2, String string2) {
        long l11 = (l10 = a ^ l10) ^ 0x1B215E58EAE4L;
        return this.a(string, n10, bl2, string2, l11, null);
    }

    public void Q(Object[] objectArray) {
        block5: {
            em em2;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = a ^ l11) ^ 0x238EC44BEF0EL;
                CallSite callSite = m44.a("h", (long)5672572006412463861L, (long)l11);
                try {
                    try {
                        em2 = this.L;
                        if (callSite != null) break block4;
                        if (em2 == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)6040796476471617229L, (long)l11);
                    }
                    em2 = this.L;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)6040796476471617229L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            m44.a("w", (Object)em2, (Object)objectArray2, (long)5491715830404731373L, (long)l11);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

