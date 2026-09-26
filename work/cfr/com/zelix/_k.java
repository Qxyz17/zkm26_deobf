/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._v;
import com.zelix.cf;
import com.zelix.da;
import com.zelix.g;
import com.zelix.iv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _k
implements iv {
    final da j;
    private static final String[] a;
    private static final String[] b;
    private static final Map c;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;

    @Override
    public boolean u(Object[] objectArray) {
        boolean bl2;
        CallSite callSite;
        long l10;
        block10: {
            CallSite callSite2;
            block11: {
                g g10 = (g)objectArray[0];
                _f _f2 = (_f)objectArray[1];
                l10 = (Long)objectArray[2];
                _v _v2 = (_v)objectArray[3];
                String string = (String)objectArray[4];
                String string2 = (String)objectArray[5];
                sz sz2 = (sz)objectArray[6];
                long l11 = l10;
                long l12 = l11 ^ 0x3C13A293C48DL;
                long l13 = l11 ^ 0x15D80663952EL;
                long l14 = l11 ^ 0x2CA671CFBECCL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l12;
                CallSite callSite3 = m44.a("q", (Object)g10, (Object)objectArray2, (long)-1953401534560592576L, (long)l10);
                CallSite callSite4 = m44.a("n", (long)-1773720719779729471L, (long)l10);
                Object[] objectArray3 = new Object[4];
                objectArray3[3] = l13;
                objectArray3[2] = string2;
                objectArray3[1] = _v2;
                objectArray3[0] = _f2;
                callSite2 = m44.a("q", (Object)m44.a("p", (Object)this, (long)-2265543015335773932L, (long)l10), (Object)objectArray3, (long)-466899829387579020L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                callSite = callSite2;
                                if (callSite4 == null) break block10;
                                if (callSite == null) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)-160922381447470849L, (long)l10);
                            }
                            callSite = callSite2;
                            if (l10 <= 0L || callSite4 == null) break block10;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)-160922381447470849L, (long)l10);
                        }
                        if (((String)((Object)callSite)).equals(string2)) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)n94, (long)-160922381447470849L, (long)l10);
                    }
                    sz2.Z(l14, callSite2);
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)n95, (long)-160922381447470849L, (long)l10);
                }
            }
            callSite = callSite2;
        }
        try {
            bl2 = callSite != null;
        }
        catch (n9 n96) {
            throw m44.a("n", (Object)n96, (long)-160922381447470849L, (long)l10);
        }
        return bl2;
    }

    _k(da da2) {
        this.j = da2;
    }

    @Override
    public void o(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        g g10 = (g)objectArray[1];
        _f _f2 = (_f)objectArray[2];
        String string = (String)objectArray[3];
        sz sz2 = (sz)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x61229673DBE1L;
        long l13 = l11 ^ 0x6E4B5649275CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        sz2.Z(l13, m44.a("q", (Object)_f2, (Object)objectArray2, (long)7061070509558093766L, (long)l10));
    }

    @Override
    public void c(Object[] objectArray) {
        g g10 = (g)objectArray[0];
        long l10 = (Long)objectArray[1];
        _f _f2 = (_f)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x77491BBF09CCL;
        long l13 = l11 ^ 0x6893C3235AE8L;
        long l14 = l11 ^ 0x5C825D15B0D4L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("p", (Object)g10, (Object)objectArray2, (long)3000898176040095745L, (long)l10);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = _f2.I(l13);
        objectArray3[0] = l14;
        m44.a("p", (Object)g10, (Object)objectArray3, (long)3377858805835023572L, (long)l10);
    }

    @Override
    public void J(Object[] objectArray) {
        g g10 = (g)objectArray[0];
        _f _f2 = (_f)objectArray[1];
        String string = (String)objectArray[2];
        sz sz2 = (sz)objectArray[3];
        long l10 = (Long)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x478F8EC11CA2L;
        long l13 = l11 ^ 0x47F6894D940DL;
        long l14 = l11 ^ 0x48E64EFBE01FL;
        String string2 = (String)sz2.t();
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = string2;
        objectArray3[1] = m44.a("r", (Object)_f2, (Object)objectArray2, (long)-6431473854899515259L, (long)l10);
        objectArray3[0] = l13;
        CallSite callSite = m44.a("r", (Object)m44.a("s", (Object)this, (long)-4729825374274361401L, (long)l10), (Object)objectArray3, (long)-4677574999767252935L, (long)l10);
        try {
            if (!((String)((Object)callSite)).equals(string2)) {
                sz2.Z(l14, callSite);
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)-6694832076818104788L, (long)l10);
        }
    }

    @Override
    public void s(Object[] objectArray) {
        block9: {
            Object object;
            long l10;
            long l11;
            g g10;
            block8: {
                int n10;
                CallSite callSite;
                long l12;
                long l13;
                _f _f2;
                block6: {
                    block7: {
                        g10 = (g)objectArray[0];
                        _f2 = (_f)objectArray[1];
                        String string = (String)objectArray[2];
                        String string2 = (String)objectArray[3];
                        l11 = (Long)objectArray[4];
                        long l14 = l11;
                        long l15 = l14 ^ 0x1FBA84F7F646L;
                        long l16 = l14 ^ 0x4A574F2D88L;
                        l13 = l14 ^ 0x315EC8782C28L;
                        l12 = l14 ^ 0x359B3970FFL;
                        l10 = l14 ^ 0x3424050F9AC3L;
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = string2;
                        objectArray2[1] = _f2.h(l15);
                        objectArray2[0] = l16;
                        callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)565500121974693442L, (long)l11), (Object)objectArray2, (long)473069202054494652L, (long)l11);
                        CallSite callSite2 = m44.a("h", (long)14735224398252183L, (long)l11);
                        try {
                            try {
                                try {
                                    n10 = _f2.I(l12).equals(string);
                                    if (callSite2 == null) break block6;
                                    if (n10 == 0) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)n92, (long)1914709403041204137L, (long)l11);
                                }
                                object = string2;
                                if (l11 < 0L) break block8;
                                n10 = ((String)object).equals(callSite) ? 1 : 0;
                                if (callSite2 == null) break block6;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)n93, (long)1914709403041204137L, (long)l11);
                            }
                            if (n10 != 0) break block9;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)n94, (long)1914709403041204137L, (long)l11);
                        }
                    }
                    n10 = 3;
                }
                String[] stringArray = new String[n10];
                stringArray[0] = _f2.I(l12);
                stringArray[1] = ".";
                stringArray[2] = callSite;
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l13;
                objectArray3[0] = stringArray;
                object = m44.a("h", (Object)objectArray3, (long)558695296651425050L, (long)l11);
            }
            String string = object;
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = string;
            objectArray4[0] = l10;
            m44.a("w", (Object)g10, (Object)objectArray4, (long)358027416010157763L, (long)l11);
        }
    }

    @Override
    public void d(Object[] objectArray) {
        block4: {
            g g10 = (g)objectArray[0];
            long l10 = (Long)objectArray[1];
            _f _f2 = (_f)objectArray[2];
            String string = (String)objectArray[3];
            long l11 = l10;
            long l12 = l11 ^ 0x66D40137BFC0L;
            long l13 = l11 ^ 0x79081251393CL;
            long l14 = l11 ^ 0x3D1FA93BA50BL;
            long l15 = l11 ^ 0x13F620D06899L;
            long l16 = l11 ^ 0x6A343CC6347EL;
            long l17 = l11 ^ 0x795DD503ECA1L;
            long l18 = l11 ^ 0x5690BD5E0660L;
            long l19 = l11 ^ 0x24A4F7EA3402L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            CallSite callSite = m44.a("p", (Object)g10, (Object)objectArray2, (long)1825464991026962673L, (long)l10);
            CallSite callSite2 = m44.a("o", (long)1932958469397516912L, (long)l10);
            sz sz2 = new sz(string, l14);
            try {
                Object object;
                try {
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l12;
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l15;
                    objectArray4[0] = m44.a("q", (Object)this, (long)2107237924101276837L, (long)l10);
                    Object[] objectArray5 = new Object[6];
                    objectArray5[5] = sz2;
                    objectArray5[4] = string;
                    objectArray5[3] = l18;
                    objectArray5[2] = callSite;
                    objectArray5[1] = (String)cf.J(l16, _f2.h(l17), (Map)((Object)m44.a("o", (Object)objectArray4, (long)2017662134356669668L, (long)l10)));
                    objectArray5[0] = m44.a("p", (Object)_f2, (Object)objectArray3, (long)422478277227459559L, (long)l10);
                    m44.a("p", (Object)m44.a("q", (Object)this, (long)2107237924101276837L, (long)l10), (Object)objectArray5, (long)239251219185222874L, (long)l10);
                    object = ((String)sz2.t()).equals(string);
                    if (callSite2 == null || object) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)32946771062365518L, (long)l10);
                }
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = (String)sz2.t();
                objectArray6[1] = string;
                objectArray6[0] = l19;
                object = m44.a("p", (Object)g10, (Object)objectArray6, (long)2167307678730928181L, (long)l10);
            }
            catch (n9 n93) {
                throw m44.a("o", (Object)n93, (long)32946771062365518L, (long)l10);
            }
        }
    }

    @Override
    public boolean F(Object[] objectArray) {
        boolean bl2;
        CallSite callSite;
        long l10;
        block8: {
            CallSite callSite2;
            block9: {
                g g10 = (g)objectArray[0];
                _f _f2 = (_f)objectArray[1];
                String string = (String)objectArray[2];
                l10 = (Long)objectArray[3];
                String string2 = (String)objectArray[4];
                sz sz2 = (sz)objectArray[5];
                long l11 = l10;
                long l12 = l11 ^ 0x4C79CEE75E3DL;
                long l13 = l11 ^ 0x1CF73FAAE5DL;
                long l14 = l11 ^ 0x53A5DD81D8C1L;
                long l15 = l11 ^ 0x7D14565CD732L;
                long l16 = l11 ^ 0xEF7F0D95B2CL;
                long l17 = l11 ^ 0x43100EDDA280L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l14;
                CallSite callSite3 = m44.a("u", (Object)g10, (Object)objectArray2, (long)-529049737433579252L, (long)l10);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l12;
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = m44.a("t", (Object)this, (long)-233268985391930024L, (long)l10);
                objectArray4[0] = l16;
                Object[] objectArray5 = new Object[5];
                objectArray5[4] = 0;
                objectArray5[3] = m44.a("j", (Object)objectArray4, (long)-117760432970207933L, (long)l10);
                objectArray5[2] = string2;
                objectArray5[1] = l13;
                objectArray5[0] = m44.a("u", (Object)_f2, (Object)objectArray3, (long)-2008082697755897318L, (long)l10);
                callSite2 = m44.a("u", (Object)m44.a("t", (Object)this, (long)-233268985391930024L, (long)l10), (Object)objectArray5, (long)-2284348203612865690L, (long)l10);
                CallSite callSite4 = m44.a("j", (long)-347316132361440371L, (long)l10);
                try {
                    try {
                        try {
                            callSite = callSite2;
                            if (callSite4 == null) break block8;
                            if (callSite == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)n92, (long)-2195462744197825357L, (long)l10);
                        }
                        callSite = callSite2;
                        if (l10 < 0L || callSite4 == null) break block8;
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)n93, (long)-2195462744197825357L, (long)l10);
                    }
                    if (((String)((Object)callSite)).equals(string2)) break block9;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)n94, (long)-2195462744197825357L, (long)l10);
                }
                Object[] objectArray6 = new Object[2];
                objectArray6[1] = l15;
                objectArray6[0] = new String[]{String.valueOf((char)_k.b("e", (int)15338, (long)(0xC174CBBAEEA9631L ^ l10))), callSite2};
                CallSite callSite5 = m44.a("j", (Object)objectArray6, (long)-226677365467378176L, (long)l10);
                sz2.Z(l17, callSite5);
            }
            callSite = callSite2;
        }
        try {
            bl2 = callSite != null;
        }
        catch (n9 n95) {
            throw m44.a("j", (Object)n95, (long)-2195462744197825357L, (long)l10);
        }
        return bl2;
    }

    @Override
    public boolean G(Object[] objectArray) {
        boolean bl2;
        CallSite callSite;
        long l10;
        block10: {
            CallSite callSite2;
            block11: {
                g g10 = (g)objectArray[0];
                _v _v2 = (_v)objectArray[1];
                String string = (String)objectArray[2];
                String string2 = (String)objectArray[3];
                int n10 = (Integer)objectArray[4];
                sz sz2 = (sz)objectArray[5];
                long l11 = (Long)objectArray[6];
                long l12 = l10 = (long)n10 << 56 | l11 << 8 >>> 8;
                long l13 = l12 ^ 0x4ADAF6E0A632L;
                long l14 = l12 ^ 0x272778880D22L;
                int n11 = (int)(l14 >>> 32);
                int n12 = (int)(l14 << 32 >>> 48);
                int n13 = (int)(l14 << 48 >>> 48);
                long l15 = l12 ^ 0x5A6F25BCDC73L;
                long l16 = l12 ^ 0x6919710E8714L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l13;
                CallSite callSite3 = m44.a("v", (Object)g10, (Object)objectArray2, (long)-8765296327763197953L, (long)l10);
                sz sz3 = new sz(n11, (short)n12, (char)n13);
                CallSite callSite4 = m44.a("i", (long)-8800864153423835778L, (long)l10);
                Object[] objectArray3 = new Object[6];
                objectArray3[5] = sz3;
                objectArray3[4] = 0;
                objectArray3[3] = _k.a("o", (int)14821, (long)(0x1F48572E593814FL ^ l10));
                objectArray3[2] = l16;
                objectArray3[1] = string2;
                objectArray3[0] = _v2;
                callSite2 = m44.a("v", (Object)m44.a("w", (Object)this, (long)-9065646643550331989L, (long)l10), (Object)objectArray3, (long)-7075720915155074495L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                callSite = callSite2;
                                if (callSite4 == null) break block10;
                                if (callSite == null) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)n92, (long)-6954895676688137664L, (long)l10);
                            }
                            callSite = callSite2;
                            if (l11 < 0L || callSite4 == null) break block10;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)n93, (long)-6954895676688137664L, (long)l10);
                        }
                        if (((String)((Object)callSite)).equals(string2)) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("i", (Object)n94, (long)-6954895676688137664L, (long)l10);
                    }
                    sz2.Z(l15, callSite2);
                }
                catch (n9 n95) {
                    throw m44.a("i", (Object)n95, (long)-6954895676688137664L, (long)l10);
                }
            }
            callSite = callSite2;
        }
        try {
            bl2 = callSite != null;
        }
        catch (n9 n96) {
            throw m44.a("i", (Object)n96, (long)-6954895676688137664L, (long)l10);
        }
        return bl2;
    }

    @Override
    public boolean X(Object[] objectArray) {
        boolean bl2;
        CallSite callSite;
        long l10;
        block8: {
            CallSite callSite2;
            block9: {
                l10 = (Long)objectArray[0];
                g g10 = (g)objectArray[1];
                String string = (String)objectArray[2];
                String string2 = (String)objectArray[3];
                sz sz2 = (sz)objectArray[4];
                long l11 = l10;
                long l12 = l11 ^ 0x6C8E98F23F0AL;
                long l13 = l11 ^ 0x173169A941AL;
                int n10 = (int)(l13 >>> 32);
                int n11 = (int)(l13 << 32 >>> 48);
                int n12 = (int)(l13 << 48 >>> 48);
                long l14 = l11 ^ 0x423F132F30F9L;
                long l15 = l11 ^ 0x6B7804ED07FBL;
                long l16 = l11 ^ 0x31DCB5AABCE7L;
                long l17 = l11 ^ 0x7C3B4BAE454BL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l12;
                CallSite callSite3 = m44.a("v", (Object)g10, (Object)objectArray2, (long)2261738549985535687L, (long)l10);
                CallSite callSite4 = m44.a("i", (long)2082117656439592006L, (long)l10);
                sz sz3 = new sz(n10, (short)n11, (char)n12);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = m44.a("w", (Object)this, (long)1947943439096791699L, (long)l10);
                objectArray3[0] = l16;
                Object[] objectArray4 = new Object[6];
                objectArray4[5] = l15;
                objectArray4[4] = sz3;
                objectArray4[3] = 0;
                objectArray4[2] = _k.a("o", (int)923, (long)(0xA0FA4A1E87F2208L ^ l10));
                objectArray4[1] = m44.a("i", (Object)objectArray3, (long)1843835549853747848L, (long)l10);
                objectArray4[0] = string2;
                callSite2 = m44.a("v", (Object)m44.a("w", (Object)this, (long)1947943439096791699L, (long)l10), (Object)objectArray4, (long)293552548635739475L, (long)l10);
                try {
                    try {
                        try {
                            callSite = callSite2;
                            if (callSite4 == null) break block8;
                            if (callSite == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)n92, (long)451232353860721528L, (long)l10);
                        }
                        callSite = callSite2;
                        if (l10 <= 0L || callSite4 == null) break block8;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)n93, (long)451232353860721528L, (long)l10);
                    }
                    if (((String)((Object)callSite)).equals(string2)) break block9;
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)n94, (long)451232353860721528L, (long)l10);
                }
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = l14;
                objectArray5[0] = new String[]{String.valueOf((char)_k.b("e", (int)19015, (long)(0x6646943786EE0055L ^ l10))), callSite2};
                CallSite callSite5 = m44.a("i", (Object)objectArray5, (long)1950499578746890699L, (long)l10);
                sz2.Z(l17, callSite5);
            }
            callSite = callSite2;
        }
        try {
            bl2 = callSite != null;
        }
        catch (n9 n95) {
            throw m44.a("i", (Object)n95, (long)451232353860721528L, (long)l10);
        }
        return bl2;
    }

    @Override
    public void I(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x38C5D9168579L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = string2;
        objectArray2[0] = string;
        m44.a("t", (Object)m44.a("u", (Object)m44.a("u", (Object)this, (long)7469864260788338225L, (long)l10), (long)8806322242631501249L, (long)l10), (Object)objectArray2, (long)8805760387781269169L, (long)l10);
    }

    @Override
    public void R(Object[] objectArray) {
        block6: {
            CallSite callSite;
            CallSite callSite2;
            String string;
            long l10;
            sz sz2;
            long l11;
            block5: {
                l11 = (Long)objectArray[0];
                g g10 = (g)objectArray[1];
                _f _f2 = (_f)objectArray[2];
                String string2 = (String)objectArray[3];
                sz2 = (sz)objectArray[4];
                long l12 = l11;
                long l13 = l12 ^ 0x74E6F0652381L;
                long l14 = l12 ^ 0x39504D78D3E1L;
                l10 = l12 ^ 0x7B8F305FDF3CL;
                string = (String)sz2.t();
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l13;
                Object[] objectArray3 = new Object[5];
                objectArray3[4] = (int)_k.b("e", (int)7161, (long)(0x5669C8EF62594B98L ^ l11));
                objectArray3[3] = m44.a("j", (long)-9029328331756517806L, (long)l11);
                objectArray3[2] = string;
                objectArray3[1] = l14;
                objectArray3[0] = m44.a("q", (Object)_f2, (Object)objectArray2, (long)-7377489978422153306L, (long)l11);
                callSite2 = m44.a("q", (Object)m44.a("p", (Object)this, (long)-9115431293472253724L, (long)l11), (Object)objectArray3, (long)-7066035706718058790L, (long)l11);
                CallSite callSite3 = m44.a("n", (long)-8749881311262994895L, (long)l11);
                try {
                    callSite = callSite2;
                    if (callSite3 == null) break block5;
                    if (callSite == null) break block6;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-7191088778638163697L, (long)l11);
                }
                callSite = callSite2;
            }
            try {
                if (!((String)((Object)callSite)).equals(string)) {
                    sz2.Z(l10, callSite2);
                }
            }
            catch (n9 n93) {
                throw m44.a("n", (Object)n93, (long)-7191088778638163697L, (long)l11);
            }
        }
    }

    @Override
    public void f(Object[] objectArray) {
        g g10 = (g)objectArray[0];
        _f _f2 = (_f)objectArray[1];
        long l10 = (Long)objectArray[2];
    }

    @Override
    public void S(Object[] objectArray) {
        char c10;
        CallSite callSite;
        CallSite callSite2;
        long l10;
        sz sz2;
        long l11;
        block23: {
            CallSite callSite3;
            block24: {
                CallSite callSite4;
                Object object;
                Object object2;
                long l12;
                long l13;
                block22: {
                    int n10;
                    int n11;
                    int n12;
                    block21: {
                        Object object3;
                        Object object4;
                        long l14;
                        block19: {
                            String string;
                            block20: {
                                CallSite callSite5;
                                block17: {
                                    long l15;
                                    long l16;
                                    block18: {
                                        g g10 = (g)objectArray[0];
                                        String string2 = (String)objectArray[1];
                                        l11 = (Long)objectArray[2];
                                        string = (String)objectArray[3];
                                        sz2 = (sz)objectArray[4];
                                        long l17 = l11;
                                        l16 = l17 ^ 0x4FC2889D575BL;
                                        l15 = l17 ^ 0x349860CDA7BDL;
                                        long l18 = l17 ^ 0x76C4E4492813L;
                                        long l19 = l17 ^ 0x77371C3283B5L;
                                        l10 = l17 ^ 0x736EC3EE7F2FL;
                                        l13 = l17 ^ 0x7A697E975854L;
                                        l14 = l17 ^ 0x1EC212F7E59AL;
                                        l12 = l17 ^ 0x3D0A0047CD12L;
                                        Object[] objectArray2 = new Object[2];
                                        objectArray2[1] = l19;
                                        objectArray2[0] = m44.a("s", (Object)this, (long)2408426796378421495L, (long)l11);
                                        CallSite callSite6 = m44.a("m", (Object)objectArray2, (long)2593468517871651029L, (long)l11);
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l18;
                                        objectArray3[0] = m44.a("s", (Object)this, (long)2408426796378421495L, (long)l11);
                                        Object[] objectArray4 = new Object[2];
                                        objectArray4[1] = m44.a("m", (Object)objectArray3, (long)2410000576814898280L, (long)l11);
                                        objectArray4[0] = l13;
                                        CallSite callSite7 = m44.a("r", (Object)m44.a("s", (Object)m44.a("s", (Object)this, (long)2408426796378421495L, (long)l11), (long)2390688698201381231L, (long)l11), (Object)objectArray4, (long)4359579132407543791L, (long)l11);
                                        Object[] objectArray5 = new Object[2];
                                        objectArray5[1] = l15;
                                        objectArray5[0] = callSite7;
                                        object2 = m44.a("m", (Object)objectArray5, (long)2567371138959841403L, (long)l11);
                                        callSite2 = m44.a("m", (long)2774540281484586530L, (long)l11);
                                        try {
                                            callSite5 = object2;
                                            if (callSite2 == null) break block17;
                                            if (callSite5 != null) break block18;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("m", (Object)n92, (long)4334457608678678812L, (long)l11);
                                        }
                                        object2 = "";
                                    }
                                    Object[] objectArray6 = new Object[2];
                                    objectArray6[1] = m44.a("s", (Object)this, (long)2408426796378421495L, (long)l11);
                                    objectArray6[0] = l16;
                                    Object[] objectArray7 = new Object[2];
                                    objectArray7[1] = l15;
                                    objectArray7[0] = m44.a("m", (Object)objectArray6, (long)2575006480054181177L, (long)l11);
                                    callSite5 = m44.a("m", (Object)objectArray7, (long)2567371138959841403L, (long)l11);
                                }
                                object4 = callSite5;
                                try {
                                    object3 = object4;
                                    if (callSite2 == null) break block19;
                                    if (object3 != null) break block20;
                                }
                                catch (n9 n93) {
                                    throw m44.a("m", (Object)n93, (long)4334457608678678812L, (long)l11);
                                }
                                object4 = "";
                            }
                            object3 = string.substring(1);
                        }
                        callSite3 = object3;
                        Object[] objectArray8 = new Object[3];
                        objectArray8[2] = l14;
                        objectArray8[1] = object4;
                        objectArray8[0] = callSite3;
                        object = m44.a("m", (Object)objectArray8, (long)4487458900099565331L, (long)l11);
                        n12 = ((String)object).indexOf((int)_k.b("e", (int)3845, (long)(0x22328193EA3E7F72L ^ l11)));
                        try {
                            try {
                                n11 = n12;
                                n10 = -1;
                                if (callSite2 == null) break block21;
                                if (n11 <= n10) break block22;
                            }
                            catch (n9 n94) {
                                throw m44.a("m", (Object)n94, (long)4334457608678678812L, (long)l11);
                            }
                            n11 = n12;
                            n10 = ((String)object).length() - 1;
                        }
                        catch (n9 n95) {
                            throw m44.a("m", (Object)n95, (long)4334457608678678812L, (long)l11);
                        }
                    }
                    if (n11 < n10) {
                        object = ((String)object).substring(n12 + 1);
                    }
                }
                Object[] objectArray9 = new Object[2];
                objectArray9[1] = object;
                objectArray9[0] = l13;
                callSite = callSite4 = m44.a("r", (Object)m44.a("s", (Object)m44.a("s", (Object)this, (long)2408426796378421495L, (long)l11), (long)2390688698201381231L, (long)l11), (Object)objectArray9, (long)4359579132407543791L, (long)l11);
                try {
                    c10 = ((String)((Object)callSite3)).charAt(0);
                    if (l11 < 0L || callSite2 == null) break block23;
                    if (c10 == _k.b("e", (int)3968, (long)(0x7A9F9C47DB6DFFF0L ^ l11))) break block24;
                }
                catch (n9 n96) {
                    throw m44.a("m", (Object)n96, (long)4334457608678678812L, (long)l11);
                }
                Object[] objectArray10 = new Object[3];
                objectArray10[2] = callSite4;
                objectArray10[1] = l12;
                objectArray10[0] = object2;
                callSite = m44.a("m", (Object)objectArray10, (long)2454047566331327299L, (long)l11);
            }
            c10 = (char)(((String)((Object)callSite)).equals(callSite3) ? 1 : 0);
        }
        try {
            if (c10 == '\u0000') {
                sz2.Z(l10, (char)_k.b("e", (int)21287, (long)(0x677B9C3DF6CDA352L ^ l11)) + (String)((Object)callSite));
            }
        }
        catch (n9 n97) {
            throw m44.a("m", (Object)n97, (long)4334457608678678812L, (long)l11);
        }
        try {
            if (l11 >= 0L && callSite2 == null) {
                m44.a("m", "Sp4uHb", (long)4130395067436816593L, (long)l11);
            }
        }
        catch (n9 n98) {
            throw m44.a("m", (Object)n98, (long)4334457608678678812L, (long)l11);
        }
    }

    @Override
    public void V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        g g10 = (g)objectArray[1];
        _f _f2 = (_f)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x149FCED61335L;
        long l13 = l11 ^ 0xB43DDB095C9L;
        long l14 = l11 ^ 0x20889B1A2CD1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        CallSite callSite = m44.a("u", (Object)g10, (Object)objectArray2, (long)-5359238514779927548L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = m44.a("u", (Object)_f2, (Object)objectArray3, (long)-6257325574355181806L, (long)l10);
        objectArray4[0] = l14;
        m44.a("u", (Object)g10, (Object)objectArray4, (long)-5555774371186386735L, (long)l10);
    }

    @Override
    public void e(Object[] objectArray) {
        block12: {
            Object object;
            String[] stringArray;
            sz sz2;
            long l10;
            long l11;
            long l12;
            String string;
            g g10;
            block13: {
                long l13;
                _f _f2;
                block14: {
                    int n10;
                    CallSite callSite;
                    long l14;
                    String string2;
                    block10: {
                        block11: {
                            g10 = (g)objectArray[0];
                            _f2 = (_f)objectArray[1];
                            string = (String)objectArray[2];
                            string2 = (String)objectArray[3];
                            l12 = (Long)objectArray[4];
                            String string3 = (String)objectArray[5];
                            long l15 = l12;
                            l13 = l15 ^ 0x1F70A4CD4012L;
                            long l16 = l15 ^ 0xACB7ABC6EEL;
                            long l17 = l15 ^ 0x44BB0CC15AD9L;
                            long l18 = l15 ^ 0x6A52852A974BL;
                            long l19 = l15 ^ 0x1390993CCBACL;
                            long l20 = l15 ^ 0xF970F91373L;
                            l11 = l15 ^ 0x2E1D3C76C91DL;
                            long l21 = l15 ^ 0x2F3418A4F9B2L;
                            l10 = l15 ^ 0x5D005210CBD0L;
                            l14 = l15 ^ 0x1F766F3795CAL;
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l16;
                            CallSite callSite2 = m44.a("r", (Object)g10, (Object)objectArray2, (long)-1835459735232962781L, (long)l12);
                            callSite = m44.a("m", (long)-1945195669648085598L, (long)l12);
                            sz2 = new sz(string3, l17);
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = l18;
                            objectArray3[0] = m44.a("s", (Object)this, (long)-2095282003070731401L, (long)l12);
                            String string4 = (String)cf.J(l19, _f2.h(l20), (Map)((Object)m44.a("m", (Object)objectArray3, (long)-2030467428052432074L, (long)l12)));
                            try {
                                try {
                                    try {
                                        Object[] objectArray4 = new Object[1];
                                        objectArray4[0] = l13;
                                        Object[] objectArray5 = new Object[6];
                                        objectArray5[5] = sz2;
                                        objectArray5[4] = string3;
                                        objectArray5[3] = l21;
                                        objectArray5[2] = callSite2;
                                        objectArray5[1] = string4;
                                        objectArray5[0] = m44.a("r", (Object)_f2, (Object)objectArray4, (long)-428254944721843147L, (long)l12);
                                        m44.a("r", (Object)m44.a("s", (Object)this, (long)-2095282003070731401L, (long)l12), (Object)objectArray5, (long)-251211932795159800L, (long)l12);
                                        n10 = ((String)sz2.t()).equals(string3);
                                        if (callSite == null) break block10;
                                        if (n10 == 0) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("m", (Object)n92, (long)-24922298073881956L, (long)l12);
                                    }
                                    n10 = _f2.h(l20).equals(string4) ? 1 : 0;
                                    if (l12 < 0L || callSite == null) break block10;
                                }
                                catch (n9 n93) {
                                    throw m44.a("m", (Object)n93, (long)-24922298073881956L, (long)l12);
                                }
                                if (n10 != 0) break block12;
                            }
                            catch (n9 n94) {
                                throw m44.a("m", (Object)n94, (long)-24922298073881956L, (long)l12);
                            }
                        }
                        n10 = 3;
                    }
                    try {
                        try {
                            String[] stringArray2 = new String[n10];
                            String[] stringArray3 = stringArray2;
                            stringArray = stringArray2;
                            int n11 = 0;
                            object = string2;
                            if (callSite == null) break block13;
                            if (((String)object).indexOf((int)_k.b("e", (int)28078, (long)(0x7491FD7B205D5E5DL ^ l12))) != -1) break block14;
                        }
                        catch (n9 n95) {
                            throw m44.a("m", (Object)n95, (long)-24922298073881956L, (long)l12);
                        }
                        object = _f2.I(l14);
                        break block13;
                    }
                    catch (n9 n96) {
                        throw m44.a("m", (Object)n96, (long)-24922298073881956L, (long)l12);
                    }
                }
                Object[] objectArray6 = new Object[1];
                objectArray6[0] = l13;
                object = m44.a("r", (Object)_f2, (Object)objectArray6, (long)-428254944721843147L, (long)l12);
            }
            stringArray3[n11] = object;
            stringArray[1] = ".";
            stringArray[2] = (String)sz2.t();
            Object[] objectArray7 = new Object[2];
            objectArray7[1] = l11;
            objectArray7[0] = stringArray;
            CallSite callSite = m44.a("m", (Object)objectArray7, (long)-2092488093090705361L, (long)l12);
            Object[] objectArray8 = new Object[3];
            objectArray8[2] = callSite;
            objectArray8[1] = string;
            objectArray8[0] = l10;
            m44.a("r", (Object)g10, (Object)objectArray8, (long)-2179272189428023321L, (long)l12);
        }
    }

    @Override
    public void D(Object[] objectArray) {
        g g10 = (g)objectArray[0];
        long l10 = (Long)objectArray[1];
        _f _f2 = (_f)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x674088762BDEL;
        long l13 = l11 ^ 0x789C9B10AD22L;
        long l14 = l11 ^ 0x3C8B207A3115L;
        long l15 = l11 ^ 0x1262A991FC87L;
        long l16 = l11 ^ 0x6BA0B587A060L;
        long l17 = l11 ^ 0x78C95C4278BFL;
        long l18 = l11 ^ 0x5704341F927EL;
        long l19 = l11 ^ 0x5357DDBA143AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        CallSite callSite = m44.a("v", (Object)g10, (Object)objectArray2, (long)-8265412462185843473L, (long)l10);
        sz sz2 = new sz(callSite, l14);
        try {
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l12;
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l15;
            objectArray4[0] = m44.a("w", (Object)this, (long)-8565731941359791941L, (long)l10);
            Object[] objectArray5 = new Object[6];
            objectArray5[5] = sz2;
            objectArray5[4] = callSite;
            objectArray5[3] = l18;
            objectArray5[2] = callSite;
            objectArray5[1] = (String)cf.J(l16, _f2.h(l17), (Map)((Object)m44.a("i", (Object)objectArray4, (long)-8638418030170971910L, (long)l10)));
            objectArray5[0] = m44.a("v", (Object)_f2, (Object)objectArray3, (long)-7943522541673928711L, (long)l10);
            m44.a("v", (Object)m44.a("w", (Object)this, (long)-8565731941359791941L, (long)l10), (Object)objectArray5, (long)-7543533620030549820L, (long)l10);
            if (!((String)sz2.t()).equals(callSite)) {
                Object[] objectArray6 = new Object[2];
                objectArray6[1] = (String)sz2.t();
                objectArray6[0] = l19;
                m44.a("v", (Object)g10, (Object)objectArray6, (long)-8498680098594529222L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)-7752087501440120496L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _k.c = new HashMap<K, V>(13);
                    var11 = prr.a(-7504754724766606259L, 2035770654309432633L, MethodHandles.lookup().lookupClass()).a(55946040767635L) ^ 99254587311582L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var20_3 = new String[2];
                    var18_4 = 0;
                    var17_5 = "@\u00f3\u000e\u0092.\u008d\u00a5\u0092\u001fW\\cl(\u00f1\u0014\u00d0tmt9f\u0003\u00b9U\u00a6M\u00d2\u008bc.\u0097#\u0094\u009bf5\u00da\u00ee\u00c3 \u00bbr\u00e2\u008576\u0081\u00b7\u000eJ\u00bcC\u00e9f\u0019\u00bf\u0015xs\u00c4m<\u00a0\u00a5\u008b|\u00b2\u008c\u00c4\u00f9\th";
                    var19_6 = "@\u00f3\u000e\u0092.\u008d\u00a5\u0092\u001fW\\cl(\u00f1\u0014\u00d0tmt9f\u0003\u00b9U\u00a6M\u00d2\u008bc.\u0097#\u0094\u009bf5\u00da\u00ee\u00c3 \u00bbr\u00e2\u008576\u0081\u00b7\u000eJ\u00bcC\u00e9f\u0019\u00bf\u0015xs\u00c4m<\u00a0\u00a5\u008b|\u00b2\u008c\u00c4\u00f9\th".length();
                    var16_7 = 40;
                    var15_8 = -1;
lbl19:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = _k.a(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                _k.a = var20_3;
                _k.b = new String[2];
                _k.f = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[7];
                var3_13 = 0;
                var4_14 = "\u00cb$\u00be\t\u00fa\u0006@\u009bS\u008fl\u000b\u00e5pFU`)\u00e6:\u0007@Q\u00d8\n@<5\u00be\u00c6\u00fa'a\u008e8+\b\u0007hh";
                var5_15 = "\u00cb$\u00be\t\u00fa\u0006@\u009bS\u008fl\u000b\u00e5pFU`)\u00e6:\u0007@Q\u00d8\n@<5\u00be\u00c6\u00fa'a\u008e8+\b\u0007hh".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl57:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00b8j\u00ba\u0082\u00f8\f=\u0094\u00ec\u00d0\u00cb=\u00e4\u00e8\u00dd\u00da";
                    var5_15 = "\u00b8j\u00ba\u0082\u00f8\f=\u0094\u00ec\u00d0\u00cb=\u00e4\u00e8\u00dd\u00da".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl70:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl83:
                // 1 sources

                ** continue;
            }
        }
        _k.d = var6_12;
        _k.e = new Integer[7];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3734;
        if (b[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])c.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    c.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_k", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = a[n11].getBytes("ISO-8859-1");
            _k.b[n11] = _k.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return b[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = _k.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/_k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5CB4;
        if (e[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_k", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _k.e[n11] = n12;
        }
        return e[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = _k.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/_k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_k.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(_k.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

