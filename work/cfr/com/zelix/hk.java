/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._e;
import com.zelix._v;
import com.zelix.ai;
import com.zelix.b0;
import com.zelix.b1;
import com.zelix.b4;
import com.zelix.loe;
import com.zelix.lqu;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sh;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hk
implements ai {
    protected final PrintWriter k;
    protected final lqu t;
    protected final sh f;
    protected final List T;
    private static final long M;
    private static final String[] Z;
    private static final String[] ab;
    private static final Map bb;
    private static final long[] cb;
    private static final Integer[] db;
    private static final Map eb;

    public static String g(b4 b42, long l10) {
        long l11 = (l10 = M ^ l10) ^ 0x61F0677C48FAL;
        try {
            if (_e.vM) {
                return b42.m();
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)422092350772013305L, (long)l10);
        }
        return b42.d(l11);
    }

    public static String R(Object[] objectArray) {
        b1 b12 = (b1)objectArray[0];
        ai ai2 = (ai)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = M ^ l10) ^ 0x69B4CF06C564L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l11;
        objectArray2[2] = ai2;
        objectArray2[1] = true;
        objectArray2[0] = b12;
        return m44.a("m", (Object)objectArray2, (long)2437593600091472788L, (long)l10);
    }

    public static String e(_v _v2, long l10) {
        long l11 = l10 = M ^ l10;
        long l12 = l11 ^ 0x32200E44ACFEL;
        long l13 = l11 ^ 0x47267115FB9AL;
        try {
            if (_e.vM) {
                Object[] objectArray = new Object[1];
                objectArray[0] = l13;
                return m44.a("r", (Object)_v2, (Object)objectArray, (long)-5598408176436937037L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)-6324258216785328871L, (long)l10);
        }
        return _v2.T(l12);
    }

    @Override
    public final Set I(int n10, String string, Integer n11, boolean bl2, long l10) {
        long l11 = (long)n10 << 32 | l10 << 32 >>> 32;
        long l12 = l11 ^ 0L;
        int n12 = (int)(l12 >>> 32);
        long l13 = l12 << 32 >>> 32;
        return this.f.I(n12, string, n11, bl2, l13);
    }

    @Override
    public String E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l11;
        return m44.a("p", (Object)this.f, (Object)objectArray2, (long)1362443035715971078L, (long)l10);
    }

    @Override
    public final boolean y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("v", (Object)this.f, (Object)objectArray2, (long)5642954935516076992L, (long)l10);
    }

    @Override
    public final boolean v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        lyt lyt2 = (lyt)objectArray[3];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lyt2;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = l11;
        return (boolean)m44.a("p", (Object)this.f, (Object)objectArray2, (long)-4409807138191073663L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final String O(Object[] var0) {
        block33: {
            block31: {
                block32: {
                    block29: {
                        block30: {
                            block27: {
                                block28: {
                                    var4_1 = (_v)var0[0];
                                    var3_2 = (ai)var0[1];
                                    var1_3 = (Long)var0[2];
                                    var5_4 = ((Boolean)var0[3]).booleanValue();
                                    v0 = var1_3 = hk.M ^ var1_3;
                                    var6_5 = v0 ^ 17550500880214L;
                                    var8_6 = v0 ^ 66770613828444L;
                                    var10_7 = v0 ^ 95647002674210L;
                                    var12_8 = v0 ^ 100874021749385L;
                                    v1 = v0 ^ 101866862459741L;
                                    var14_9 = (int)(v1 >>> 48);
                                    var15_10 = (int)(v1 << 16 >>> 32);
                                    var16_11 = (int)(v1 << 48 >>> 48);
                                    var18_12 = new StringBuilder();
                                    var17_13 = m44.a("i", (long)8865386541299342148L, (long)var1_3);
                                    try {
                                        try {
                                            v2 /* !! */  = var5_4;
                                            if (var17_13 != null) break block27;
                                            if (v2 /* !! */  == 0) break block28;
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("i", (Object)v3, (long)6980482373088677373L, (long)var1_3);
                                        }
                                        v4 = new Object[2];
                                        v4[1] = var12_8;
                                        v4[0] = var3_2;
                                        var18_12.append((String)m44.a("v", (Object)var4_1, (Object)v4, (long)8841407135493844072L, (long)var1_3));
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("i", (Object)v5, (long)6980482373088677373L, (long)var1_3);
                                    }
                                }
                                v2 /* !! */  = var18_12.length();
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (var17_13 != null) break block29;
                                            if (v2 /* !! */  <= 0) break block30;
                                        }
                                        catch (n9 v6) {
                                            throw m44.a("i", (Object)v6, (long)6980482373088677373L, (long)var1_3);
                                        }
                                        v2 /* !! */  = (int)m44.a("v", (Object)var18_12, (int)(var18_12.length() - 1), (long)8819986457532880835L, (long)var1_3);
                                        v7 = var17_13;
                                        if (var1_3 >= 0L) {
                                            if (v7 != null) break block29;
                                        }
                                        ** GOTO lbl78
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("i", (Object)v8, (long)6980482373088677373L, (long)var1_3);
                                    }
                                    if (v2 /* !! */  == hk.d("l", (int)12513, (long)(3874804169811145261L ^ var1_3))) break block30;
                                }
                                catch (n9 v9) {
                                    throw m44.a("i", (Object)v9, (long)6980482373088677373L, (long)var1_3);
                                }
                                var18_12.append((char)hk.d("l", (int)30689, (long)(4520627340717258028L ^ var1_3)));
                            }
                            catch (n9 v10) {
                                throw m44.a("i", (Object)v10, (long)6980482373088677373L, (long)var1_3);
                            }
                        }
                        v11 = new Object[1];
                        v11[0] = var8_6;
                        var18_12.append((String)m44.a("v", (Object)var4_1, (Object)v11, (long)8951138601864973445L, (long)var1_3));
                        v2 /* !! */  = var18_12.length();
                    }
                    try {
                        try {
                            try {
                                try {
                                    v7 = var17_13;
lbl78:
                                    // 2 sources

                                    if (v7 != null) break block31;
                                    if (v2 /* !! */  <= 0) break block32;
                                }
                                catch (n9 v12) {
                                    throw m44.a("i", (Object)v12, (long)6980482373088677373L, (long)var1_3);
                                }
                                v2 /* !! */  = (int)m44.a("v", (Object)var18_12, (int)(var18_12.length() - 1), (long)8819986457532880835L, (long)var1_3);
                                if (var1_3 < 0L || var17_13 != null) break block31;
                            }
                            catch (n9 v13) {
                                throw m44.a("i", (Object)v13, (long)6980482373088677373L, (long)var1_3);
                            }
                            if (v2 /* !! */  == hk.d("l", (int)30689, (long)(4520627340717258028L ^ var1_3))) break block32;
                        }
                        catch (n9 v14) {
                            throw m44.a("i", (Object)v14, (long)6980482373088677373L, (long)var1_3);
                        }
                        var18_12.append((char)hk.d("l", (int)30689, (long)(4520627340717258028L ^ var1_3)));
                    }
                    catch (n9 v15) {
                        throw m44.a("i", (Object)v15, (long)6980482373088677373L, (long)var1_3);
                    }
                }
                try {
                    if (var1_3 >= 0L) {
                        v16 = new Object[1];
                        v16[0] = var10_7;
                        v17 = var18_12.append((String)m44.a("v", (Object)var4_1, (Object)v16, (long)7354166441738359587L, (long)var1_3));
                        if (var17_13 != null) break block33;
                    }
                    v2 /* !! */  = (int)m44.a("v", (Object)var4_1, (char)((char)var14_9), (int)var15_10, (short)((short)var16_11), (long)8841646116535390948L, (long)var1_3);
                }
                catch (n9 v18) {
                    throw m44.a("i", (Object)v18, (long)6980482373088677373L, (long)var1_3);
                }
            }
            try {
                if (v2 /* !! */  != 0) {
                    var18_12.append((String)hk.a("h", (int)16701, (long)(8600113576427480362L ^ var1_3)));
                    v19 = new Object[1];
                    v19[0] = var6_5;
                    var18_12.append((String)m44.a("v", (Object)var4_1, (Object)v19, (long)7298814248931513201L, (long)var1_3));
                    var18_12.append((char)hk.d("l", (int)19877, (long)(6300545525067403114L ^ var1_3)));
                }
            }
            catch (n9 v20) {
                throw m44.a("i", (Object)v20, (long)6980482373088677373L, (long)var1_3);
            }
            v17 = var18_12;
        }
        return v17.toString();
    }

    public static String P(Object[] objectArray) {
        StringBuilder stringBuilder;
        block13: {
            StringBuilder stringBuilder2;
            long l10;
            block14: {
                Object object;
                long l11;
                long l12;
                b1 b12;
                block11: {
                    CallSite callSite;
                    long l13;
                    long l14;
                    long l15;
                    block12: {
                        b12 = (b1)objectArray[0];
                        boolean bl2 = (Boolean)objectArray[1];
                        ai ai2 = (ai)objectArray[2];
                        l10 = (Long)objectArray[3];
                        long l16 = l10 = M ^ l10;
                        l12 = l16 ^ 0x4FE3B8708535L;
                        l15 = l16 ^ 0x23A7E1450BFFL;
                        long l17 = l16 ^ 0xE7853FB983L;
                        l14 = l16 ^ 0x56652C99AD70L;
                        l11 = l16 ^ 0x10BA43C4AB8DL;
                        l13 = l16 ^ 0x46E9379F71F4L;
                        stringBuilder = new StringBuilder();
                        callSite = m44.a("l", (long)5277477876319398257L, (long)l10);
                        try {
                            try {
                                object = bl2;
                                if (callSite != null) break block11;
                                if (!object) break block12;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)n92, (long)5974824832737394632L, (long)l10);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l17;
                            objectArray2[0] = ai2;
                            stringBuilder.append((String)((Object)m44.a("s", (Object)b12, (Object)objectArray2, (long)6025637232827177063L, (long)l10)));
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)n93, (long)5974824832737394632L, (long)l10);
                        }
                    }
                    try {
                        stringBuilder.append(b12.q(l14));
                        stringBuilder2 = stringBuilder.append((String)((Object)m44.a("s", (Object)b12, (long)l15, (long)5796433382624505184L, (long)l10)));
                        if (l10 <= 0L) break block13;
                        if (callSite != null) break block14;
                        object = b12.s(l13);
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)n94, (long)5974824832737394632L, (long)l10);
                    }
                }
                try {
                    block15: {
                        try {
                            if (l10 > 0L) {
                                if (object) break block15;
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l11;
                                object = m44.a("s", (Object)b12, (Object)objectArray3, (long)5238514382366012993L, (long)l10);
                            }
                            if (!object) break block13;
                        }
                        catch (n9 n95) {
                            throw m44.a("l", (Object)n95, (long)5974824832737394632L, (long)l10);
                        }
                    }
                    stringBuilder.append((String)((Object)hk.a("h", (int)7656, (long)(0xA2B9D710F228BCBL ^ l10))));
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l12;
                    objectArray4[0] = false;
                    stringBuilder.append(((String)((Object)m44.a("s", (Object)b12, (Object)objectArray4, (long)5507183008078386955L, (long)l10))).trim());
                }
                catch (n9 n96) {
                    throw m44.a("l", (Object)n96, (long)5974824832737394632L, (long)l10);
                }
            }
            stringBuilder2 = stringBuilder.append((char)hk.d("l", (int)17084, (long)(0x2E9838EBCC5F7247L ^ l10)));
        }
        return stringBuilder.toString();
    }

    public static final String w(Object[] objectArray) {
        _v _v2 = (_v)objectArray[0];
        long l10 = (Long)objectArray[1];
        ai ai2 = (ai)objectArray[2];
        long l11 = (l10 = M ^ l10) ^ 0x267DBDA629D0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = true;
        objectArray2[2] = l11;
        objectArray2[1] = ai2;
        objectArray2[0] = _v2;
        return m44.a("l", (Object)objectArray2, (long)-562177966151799392L, (long)l10);
    }

    @Override
    public boolean G(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        loe loe2 = (loe)objectArray[1];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = loe2;
        objectArray2[0] = l11;
        return (boolean)m44.a("w", (Object)this.f, (Object)objectArray2, (long)927881635674657621L, (long)l10);
    }

    @Override
    public final boolean b(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        lyt lyt2 = (lyt)objectArray[3];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lyt2;
        objectArray2[2] = string2;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return (boolean)m44.a("w", (Object)this.f, (Object)objectArray2, (long)-300033787295437526L, (long)l10);
    }

    public boolean s(Object[] objectArray) {
        Object object;
        block6: {
            block8: {
                block7: {
                    long l10 = (Long)objectArray[0];
                    long l11 = (l10 = M ^ l10) ^ 0xE85607A9B71L;
                    CallSite callSite = m44.a("j", (long)-8427555984644314297L, (long)l10);
                    try {
                        try {
                            try {
                                object = _e.vM;
                                if (callSite != null) break block6;
                                if (!object) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)-8008306311191036418L, (long)l10);
                            }
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l11;
                            object = m44.a("u", (Object)this.f, (Object)objectArray2, (long)-8376478435101634160L, (long)l10);
                            if (callSite != null) break block6;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)-8008306311191036418L, (long)l10);
                        }
                        if (object) break block8;
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)n94, (long)-8008306311191036418L, (long)l10);
                    }
                }
                object = true;
                break block6;
            }
            object = 0;
        }
        return object;
    }

    @Override
    public final boolean J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("t", (Object)this.f, (Object)objectArray2, (long)1202966579629165281L, (long)l10);
    }

    public hk(sh sh2, List list, long l10, lqu lqu2) {
        long l11 = (l10 = M ^ l10) ^ 0x266424CCD716L;
        this.f = sh2;
        this.T = list;
        this.t = lqu2;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        this.k = m44.a("u", (Object)lqu2, (Object)objectArray, (long)-5428339878548215172L, (long)l10);
    }

    @Override
    public final boolean K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = l11;
        return (boolean)m44.a("v", (Object)this.f, (Object)objectArray2, (long)-1170359217708483389L, (long)l10);
    }

    @Override
    public _6 Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("p", (Object)this.f, (Object)objectArray2, (long)-1838115007293849850L, (long)l10);
    }

    @Override
    public final boolean R(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        lyt lyt2 = (lyt)objectArray[3];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lyt2;
        objectArray2[2] = l11;
        objectArray2[1] = string2;
        objectArray2[0] = string;
        return (boolean)m44.a("s", (Object)this.f, (Object)objectArray2, (long)-2872742164421866511L, (long)l10);
    }

    @Override
    public final boolean j(String string, long l10, String string2) {
        long l11 = l10 ^ 0L;
        return (boolean)m44.a("u", (Object)this.f, (Object)string, (long)l11, (Object)string2, (long)5000789231140913199L, (long)l10);
    }

    @Override
    public final boolean n(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        lyt lyt2 = (lyt)objectArray[3];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lyt2;
        objectArray2[2] = l11;
        objectArray2[1] = string2;
        objectArray2[0] = string;
        return (boolean)m44.a("r", (Object)this.f, (Object)objectArray2, (long)-2987620073948038502L, (long)l10);
    }

    public static String d(long l10, b1 b12) {
        long l11 = (l10 = M ^ l10) ^ 0x2CE677F084DFL;
        try {
            if (_e.vM) {
                return b12.m();
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)n92, (long)1787613944086787564L, (long)l10);
        }
        return b12.Z(l11);
    }

    public static final String t(Object[] objectArray) {
        b4 b42 = (b4)objectArray[0];
        ai ai2 = (ai)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = M ^ l10) ^ 0x60520A31B62DL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l11;
        objectArray2[2] = ai2;
        objectArray2[1] = true;
        objectArray2[0] = b42;
        return m44.a("l", (Object)objectArray2, (long)552936876266539000L, (long)l10);
    }

    public static String U(b0 b02, byte by2, int n10, int n11) {
        long l10 = ((long)by2 << 56 | (long)n10 << 32 >>> 8 | (long)n11 << 40 >>> 40) ^ M;
        try {
            if (_e.vM) {
                return b02.B();
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)n92, (long)-4794469597939412908L, (long)l10);
        }
        return b02.V();
    }

    @Override
    public final boolean p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("q", (Object)this.f, (Object)objectArray2, (long)-1476676147422732836L, (long)l10);
    }

    @Override
    public final boolean Z(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = string2;
        objectArray2[0] = string;
        return (boolean)m44.a("u", (Object)this.f, (Object)objectArray2, (long)4982584624270769586L, (long)l10);
    }

    @Override
    public final boolean O(long l10, String string, String string2) {
        long l11 = l10 ^ 0L;
        return (boolean)m44.a("r", (Object)this.f, (long)l11, (Object)string, (Object)string2, (long)-8721257326477019735L, (long)l10);
    }

    public boolean x(Object[] objectArray) {
        Object object;
        block6: {
            block8: {
                block7: {
                    long l10 = (Long)objectArray[0];
                    long l11 = (l10 = M ^ l10) ^ 0x21BCE4599075L;
                    CallSite callSite = m44.a("l", (long)-2538605477384242039L, (long)l10);
                    try {
                        try {
                            try {
                                object = _e.vM;
                                if (callSite != null) break block6;
                                if (!object) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)n92, (long)-4102068521262372304L, (long)l10);
                            }
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l11;
                            object = m44.a("s", (Object)this.f, (Object)objectArray2, (long)-2433373020641784907L, (long)l10);
                            if (callSite != null) break block6;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)n93, (long)-4102068521262372304L, (long)l10);
                        }
                        if (object) break block8;
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)n94, (long)-4102068521262372304L, (long)l10);
                    }
                }
                object = true;
                break block6;
            }
            object = 0;
        }
        return object;
    }

    public static String a(int n10, _v _v2, int n11, char c10) {
        long l10;
        long l11 = l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)c10 << 48 >>> 48) ^ M;
        long l12 = l11 ^ 0x206C2C82E225L;
        long l13 = l11 ^ 0x63977570FD96L;
        try {
            if (_e.vM) {
                Object[] objectArray = new Object[1];
                objectArray[0] = l12;
                return m44.a("v", (Object)_v2, (Object)objectArray, (long)-8465748106493138181L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)-7509809707779392795L, (long)l10);
        }
        return _v2.I(l13);
    }

    protected final String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        _v _v2 = (_v)objectArray[1];
        long l11 = (l10 = M ^ l10) ^ 0x264B34B56689L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = true;
        objectArray2[2] = l11;
        objectArray2[1] = this.f;
        objectArray2[0] = _v2;
        return m44.a("m", (Object)objectArray2, (long)-5229877459965762823L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public static final String K(Object[] var0) {
        block28: {
            block26: {
                block25: {
                    block24: {
                        block22: {
                            block23: {
                                var2_1 = (b4)var0[0];
                                var5_2 = (Boolean)var0[1];
                                var1_3 = (ai)var0[2];
                                var3_4 = (Long)var0[3];
                                v0 = var3_4 = hk.M ^ var3_4;
                                var6_5 = v0 ^ 113651380499458L;
                                var8_6 = v0 ^ 62537962050835L;
                                var10_7 = v0 ^ 31546854798171L;
                                var12_8 = v0 ^ 81586036205480L;
                                var14_9 = v0 ^ 14211340689749L;
                                var16_10 = v0 ^ 74929679081397L;
                                var18_11 = v0 ^ 99779098065708L;
                                var21_12 = new StringBuilder();
                                var20_13 = m44.a("l", (long)280703653301281705L, (long)var3_4);
                                try {
                                    try {
                                        if (var20_13 != null) break block22;
                                        if (!var5_2) break block23;
                                    }
                                    catch (n9 v1) {
                                        throw m44.a("l", (Object)v1, (long)1743680104528344336L, (long)var3_4);
                                    }
                                    v2 = new Object[2];
                                    v2[1] = var10_7;
                                    v2[0] = var1_3;
                                    var21_12.append((String)m44.a("s", (Object)var2_1, (Object)v2, (long)1821496548520186559L, (long)var3_4));
                                }
                                catch (n9 v3) {
                                    throw m44.a("l", (Object)v3, (long)1743680104528344336L, (long)var3_4);
                                }
                            }
                            var21_12.append(var2_1.q(var12_8));
                        }
                        var22_14 = var2_1.B();
                        try {
                            try {
                                v4 = var20_13;
                                if (var3_4 < 0L) ** GOTO lbl57
                                if (v4 != null) break block24;
                                if (var22_14.length() == 1) {
                                }
                                ** GOTO lbl59
                            }
                            catch (n9 v5) {
                                throw m44.a("l", (Object)v5, (long)1743680104528344336L, (long)var3_4);
                            }
                            var21_12.append((String)m44.a("l", (Object)new Object[]{var22_14}, (long)107959335866305285L, (long)var3_4));
                        }
                        catch (n9 v6) {
                            throw m44.a("l", (Object)v6, (long)1743680104528344336L, (long)var3_4);
                        }
                    }
                    try {
                        if (var3_4 <= 0L) ** GOTO lbl77
                        v4 = var20_13;
lbl57:
                        // 2 sources

                        if (v4 == null) break block25;
lbl59:
                        // 2 sources

                        v7 = new Object[2];
                        v7[1] = var22_14;
                        v7[0] = var16_10;
                        var21_12.append((String)m44.a("l", (Object)v7, (long)216362641001168320L, (long)var3_4));
                    }
                    catch (n9 v8) {
                        throw m44.a("l", (Object)v8, (long)1743680104528344336L, (long)var3_4);
                    }
                }
                try {
                    block27: {
                        try {
                            try {
                                try {
                                    var21_12.append(" ");
                                    var21_12.append(var2_1.m());
lbl77:
                                    // 2 sources

                                    v9 = var2_1;
                                    if (var20_13 != null) break block26;
                                    if (v9.s(var18_11)) break block27;
                                }
                                catch (n9 v10) {
                                    throw m44.a("l", (Object)v10, (long)1743680104528344336L, (long)var3_4);
                                }
                                v9 = var2_1;
                                if (var20_13 != null) break block26;
                            }
                            catch (n9 v11) {
                                throw m44.a("l", (Object)v11, (long)1743680104528344336L, (long)var3_4);
                            }
                            v12 = new Object[1];
                            v12[0] = var14_9;
                            if (m44.a("s", (Object)v9, (Object)v12, (long)174212420403608729L, (long)var3_4) == false) break block28;
                        }
                        catch (n9 v13) {
                            throw m44.a("l", (Object)v13, (long)1743680104528344336L, (long)var3_4);
                        }
                    }
                    var21_12.append((String)hk.a("h", (int)7656, (long)(732821371449491731L ^ var3_4)));
                    v9 = var2_1;
                }
                catch (n9 v14) {
                    throw m44.a("l", (Object)v14, (long)1743680104528344336L, (long)var3_4);
                }
            }
            v15 = new Object[1];
            v15[0] = var6_5;
            var23_15 = m44.a("s", (Object)v9, (Object)v15, (long)304638081419075542L, (long)var3_4);
            var21_12.append((String)var23_15);
            var21_12.append(" ");
            var21_12.append(var2_1.d(var8_6));
            var21_12.append((char)hk.d("l", (int)17084, (long)(3357473917889558687L ^ var3_4)));
        }
        return var21_12.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    hk.M = prr.a(7177366778690166647L, -209205369419737204L, MethodHandles.lookup().lookupClass()).a(244765417065508L);
                    hk.bb = new HashMap<K, V>(13);
                    var11 = hk.M ^ 74325722930610L;
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
                    var17_5 = "\u0086H\u00d2\u00cd\u00b4\u00b6X\u0097_\u0092\u00a6?\u00b7\u00dfW\u0098\u0010v:\b\u00bc\u0082\u001e\u00b7B\u00c6\u00ff\u00d0>>\u0019\u0080\u0087";
                    var19_6 = "\u0086H\u00d2\u00cd\u00b4\u00b6X\u0097_\u0092\u00a6?\u00b7\u00dfW\u0098\u0010v:\b\u00bc\u0082\u001e\u00b7B\u00c6\u00ff\u00d0>>\u0019\u0080\u0087".length();
                    var16_7 = 16;
                    var15_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = hk.a(var21_9).intern();
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
                hk.Z = var20_3;
                hk.ab = new String[2];
                hk.eb = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\\\u00ca,\u00ffH;\u00ad4 \u00a9\u00f2\u00992_\u00f5e";
                var5_15 = "\\\u00ca,\u00ffH;\u00ad4 \u00a9\u00f2\u00992_\u00f5e".length();
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
lbl58:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u0096\b(\\\u00fb\u0085\u00e6(/\u00dfK\u00cb\u0005K%\u00dc";
                    var5_15 = "\u0096\b(\\\u00fb\u0085\u00e6(/\u00dfK\u00cb\u0005K%\u00dc".length();
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
lbl71:
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
lbl84:
                // 1 sources

                ** continue;
            }
        }
        hk.cb = var6_12;
        hk.db = new Integer[4];
    }

    private static n9 d(n9 n92) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5410;
        if (ab[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])bb.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    bb.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hk", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = Z[n11].getBytes("ISO-8859-1");
            hk.ab[n11] = hk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return ab[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = hk.a(n10, l10);
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
            throw new RuntimeException("com/zelix/hk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x72C9;
        if (db[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = cb[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hk", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hk.db[n11] = n12;
        }
        return db[n11];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = hk.d(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/hk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(hk.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

