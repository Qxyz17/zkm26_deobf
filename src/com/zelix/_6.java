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
    private static final long a = prr.a((long)-3151061462990620974L, (long)436015114937406629L, MethodHandles.lookup().lookupClass()).a(256884312981985L);

    public _v C(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x28B574EA5C71L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = string2;
        objectArray2[2] = true;
        objectArray2[1] = l2;
        objectArray2[0] = string;
        return m44.a("q", (Object)this, (Object)objectArray2, (long)3398842224313437036L, (long)l);
    }

    public _v s(Object[] objectArray) {
        String string = (String)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x301E97A22342L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = null;
        objectArray2[2] = bl;
        objectArray2[1] = l2;
        objectArray2[0] = string;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)5771367686139638879L, (long)l);
    }

    public _v E(String string, Integer n, long l, String string2, l6z l6z2) {
        long l2 = (l = a ^ l) ^ 0x649CCF3E1084L;
        return this.a(string, n, true, string2, l2, l6z2);
    }

    public _v g(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        l6z l6z2 = (l6z)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x5E623B546811L;
        return this.a(string, null, true, string2, l2, l6z2);
    }

    public _v L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x300069CA26E4L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = null;
        objectArray2[2] = true;
        objectArray2[1] = l2;
        objectArray2[0] = string;
        return m44.a("t", (Object)this, (Object)objectArray2, (long)6178380462708060665L, (long)l);
    }

    public _v G(Object[] objectArray) {
        String string = (String)objectArray[0];
        Integer n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x602A48ED6B18L;
        return this.n(string, n, l2, true, null);
    }

    public _v a(String string, Integer n, boolean bl, String string2, long l, l6z l6z2) {
        _v _v2;
        int n2;
        int n3;
        int n4;
        block6: {
            _v _v3;
            block8: {
                block7: {
                    long l2 = l = a ^ l;
                    long l3 = l2 ^ 0x3F5A9114AD4AL;
                    long l4 = l2 ^ 0x269587CD6983L;
                    long l5 = l2 ^ 0x5664BD169531L;
                    n4 = (int)(l5 >>> 48);
                    n3 = (int)(l5 << 16 >>> 48);
                    n2 = (int)(l5 << 32 >>> 32);
                    long l6 = l2 ^ 0x2246152B9DADL;
                    int n5 = (int)(l6 >>> 48);
                    int n6 = (int)(l6 << 16 >>> 48);
                    int n7 = (int)(l6 << 32 >>> 32);
                    _v2 = l62.G((long)l3, (String)string);
                    CallSite callSite = m44.a("k", (long)2515884219836809894L, (long)l);
                    try {
                        try {
                            try {
                                if (_v2 == null) break block6;
                                if (n == null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)((Object)n92), (long)4577356047989983902L, (long)l);
                            }
                            _v3 = _v2;
                            if (callSite != null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)((Object)n93), (long)4577356047989983902L, (long)l);
                        }
                        if (!_v3.P((char)n5, (short)n6, n7)) break block7;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)((Object)n94), (long)4577356047989983902L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = n;
                    objectArray[0] = l4;
                    CallSite callSite2 = m44.a("t", (Object)_v2, (Object)objectArray, (long)4278523815894656790L, (long)l);
                    return callSite2;
                }
                _v3 = _v2;
            }
            return _v3;
        }
        _v2 = this.L.V(string, n, (short)n4, bl, string2, (char)n3, l6z2, n2);
        return _v2;
    }

    public _v K(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        String string2 = (String)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x106997DC569CL;
        return this.a(string, null, bl, string2, l2, null);
    }

    public _6(em em2) {
        this.L = em2;
    }

    public _v g(String string, Integer n, long l, String string2) {
        long l2 = (l = a ^ l) ^ 0x339DEDF97208L;
        return this.n(string, n, l2, true, string2);
    }

    public _v n(String string, Integer n, long l, boolean bl, String string2) {
        long l2 = (l = a ^ l) ^ 0x1B215E58EAE4L;
        return this.a(string, n, bl, string2, l2, null);
    }

    public void Q(Object[] objectArray) {
        block5: {
            em em2;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = (l2 = a ^ l2) ^ 0x238EC44BEF0EL;
                CallSite callSite = m44.a("h", (long)5672572006412463861L, (long)l2);
                try {
                    try {
                        em2 = this.L;
                        if (callSite != null) break block4;
                        if (em2 == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)6040796476471617229L, (long)l2);
                    }
                    em2 = this.L;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)6040796476471617229L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            m44.a("w", (Object)em2, (Object)objectArray2, (long)5491715830404731373L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
