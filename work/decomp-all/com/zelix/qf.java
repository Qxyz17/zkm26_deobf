/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.gv;
import com.zelix.lk4;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.q3;
import com.zelix.vd;
import com.zelix.zl;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qf
extends vd
implements lk4 {
    private Set K;
    private Set d;
    private Set D;
    private static final long a;
    private static final long[] c;
    private static final Integer[] e;
    private static final Map f;

    /*
     * Unable to fully structure code
     */
    public void X(Object[] var1_1) {
        var4_2 = (fu)var1_1[0];
        var2_3 = (Long)var1_1[1];
        var5_4 = (lqq)var1_1[2];
        v0 = var2_3;
        var6_5 = v0 ^ 85213539767481L;
        var8_6 = v0 ^ 122772112358678L;
        var10_7 = v0 ^ 0L;
        var12_8 = v0 ^ 94038206132601L;
        var15_9 = 0;
        var14_10 = m44.a("m", (long)-1921333740741510316L, (long)var2_3);
        do {
            block13: {
                block14: {
                    block12: {
                        v1 = new Object[1];
                        v1[0] = var12_8;
                        if (var15_9 >= m44.a("r", (Object)this, (Object)v1, (long)-2296489199898713612L, (long)var2_3)) break;
                        v2 = new Object[2];
                        v2[1] = var8_6;
                        v2[0] = var15_9;
                        var16_11 = m44.a("r", (Object)this, (Object)v2, (long)-1931359190408154321L, (long)var2_3);
                        try {
                            v3 = new Object[3];
                            v3[2] = var5_4;
                            v3[1] = var10_7;
                            v3[0] = this;
                            m44.a("r", (Object)var16_11, (Object)v3, (long)-1954679020144143401L, (long)var2_3);
                            v4 = var16_11 instanceof zl;
                            if (var14_10 != null) break block12;
                            if (v4) {
                            }
                            ** GOTO lbl48
                        }
                        catch (n9 v5) {
                            throw m44.a("m", (Object)v5, (long)-2261938229882942265L, (long)var2_3);
                        }
                        v6 = new Object[1];
                        v6[0] = var6_5;
                        var17_12 = m44.a("r", (Object)((zl)var16_11), (Object)v6, (long)-1785247222142810516L, (long)var2_3);
                        try {
                            try {
                                m44.a("s", (Object)this, (long)-2273258996601237185L, (long)var2_3).add(var17_12.trim());
                                v7 = var14_10;
                                if (var2_3 < 0L) continue;
                                if (v7 == null) break block13;
lbl48:
                                // 2 sources

                                v8 = var16_11;
                                if (var14_10 != null) break block14;
                            }
                            catch (n9 v9) {
                                throw m44.a("m", (Object)v9, (long)-2261938229882942265L, (long)var2_3);
                            }
                            v4 = v8 instanceof q3;
                        }
                        catch (n9 v10) {
                            throw m44.a("m", (Object)v10, (long)-2261938229882942265L, (long)var2_3);
                        }
                    }
                    if (!v4) break block13;
                    v8 = var16_11;
                }
                var17_12 = (q3)v8;
            }
            ++var15_9;
            v7 = var14_10;
        } while (v7 == null);
    }

    public Set Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0xF0321BC5DADL;
        return new gv((Collection)((Object)m44.a("s", (Object)((Object)this), (long)8860029141374176063L, (long)l)), l2);
    }

    /*
     * WARNING - void declaration
     */
    String v(Object[] objectArray) {
        String string;
        block12: {
            StringBuilder stringBuilder;
            block11: {
                Object object;
                CallSite callSite;
                long l;
                block10: {
                    l = (Long)objectArray[0];
                    l = a ^ l;
                    stringBuilder = new StringBuilder();
                    boolean n = false;
                    callSite = m44.a("o", (long)4088171474195900094L, (long)l);
                    try {
                        object = m44.a("p", (Object)m44.a("q", (Object)((Object)this), (long)4037607439062456278L, (long)l), (long)2494028238836400360L, (long)l);
                        if (callSite != null) break block10;
                        if (object != false) break block11;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)4427579693193384237L, (long)l);
                    }
                    object = false;
                }
                CallSite callSite2 = object;
                Iterator iterator = m44.a("q", (Object)((Object)this), (long)4037607439062456278L, (long)l).iterator();
                block8: while (iterator.hasNext()) {
                    Object object2 = iterator.next();
                    do {
                        CallSite callSite3;
                        block13: {
                            block14: {
                                void var6_6;
                                String string2;
                                block15: {
                                    string = (String)object2;
                                    if (l <= 0L) break block12;
                                    string2 = string;
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block8;
                                                callSite3 = callSite;
                                                if (l <= 0L) break block13;
                                                if (callSite3 != null) break block14;
                                            }
                                            catch (n9 n93) {
                                                throw m44.a("o", (Object)((Object)n93), (long)4427579693193384237L, (long)l);
                                            }
                                            if (l <= 0L) break block14;
                                            if (var6_6 <= 0) break block15;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("o", (Object)((Object)n94), (long)4427579693193384237L, (long)l);
                                        }
                                        stringBuilder.append((char)qf.a("t", (int)3403, (long)(0x57A2470C805F507CL ^ l)));
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("o", (Object)((Object)n95), (long)4427579693193384237L, (long)l);
                                    }
                                }
                                stringBuilder.append((char)qf.a("t", (int)27563, (long)(0x3B5727B810AC369FL ^ l)));
                                stringBuilder.append(string2);
                                stringBuilder.append((char)qf.a("t", (int)31291, (long)(0x4FB9D156ABE2A70BL ^ l)));
                                ++var6_6;
                            }
                            callSite3 = callSite;
                        }
                        if (callSite3 == null) continue block8;
                        object2 = stringBuilder.append((char)m44.a("k", (long)2610861215775626870L, (long)l));
                    } while (l <= 0L);
                }
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    String R(Object[] var1_1) {
        block42: {
            block36: {
                block37: {
                    block38: {
                        block35: {
                            block33: {
                                var2_2 = (Long)var1_1[0];
                                var2_2 = qf.a ^ var2_2;
                                var5_3 = new StringBuilder();
                                var6_4 = false;
                                var7_5 = m44.a("u", (Object)this, (long)-338427135785481727L, (long)var2_2).iterator();
                                var4_6 = m44.a("k", (long)-114730151478484886L, (long)var2_2);
                                while (var7_5.hasNext()) {
                                    block31: {
                                        block32: {
                                            block34: {
                                                var8_7 = (String)var7_5.next();
                                                try {
                                                    try {
                                                        try {
                                                            v0 = var4_6;
                                                            if (var2_2 < 0L) break block31;
                                                            if (v0 != null) break block32;
                                                            v1 /* !! */  = (CallSite)var6_4;
                                                            v2 = var4_6;
                                                            if (var2_2 > 0L) {
                                                                if (v2 != null) break block33;
                                                            }
                                                            ** GOTO lbl54
                                                        }
                                                        catch (n9 v3) {
                                                            throw m44.a("k", (Object)v3, (long)-313682393086322695L, (long)var2_2);
                                                        }
                                                        if (v1 /* !! */  <= 0) break block34;
                                                    }
                                                    catch (n9 v4) {
                                                        throw m44.a("k", (Object)v4, (long)-313682393086322695L, (long)var2_2);
                                                    }
                                                    var5_3.append((char)m44.a("o", (long)-2094213743810752350L, (long)var2_2));
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("k", (Object)v5, (long)-313682393086322695L, (long)var2_2);
                                                }
                                            }
                                            var5_3.append((char)qf.a("t", (int)31291, (long)(5744814758481060319L ^ var2_2)));
                                            var5_3.append(var8_7);
                                            var5_3.append((char)qf.a("t", (int)31291, (long)(5744814758481060319L ^ var2_2)));
                                            ++var6_4;
                                        }
                                        v0 = var4_6;
                                    }
                                    if (v0 == null) continue;
                                }
                                v6 = m44.a("u", (Object)this, (long)-399892709007881287L, (long)var2_2);
                                v7 = -1997083946001709508L;
                                v8 = var2_2;
                                if (var2_2 <= 0L) ** GOTO lbl66
                                v1 /* !! */  = m44.a("t", (Object)v6, (long)v7, (long)v8);
                            }
                            try {
                                try {
                                    v2 = var4_6;
lbl54:
                                    // 2 sources

                                    if (var2_2 >= 0L) {
                                        if (v2 != null) break block35;
                                        if (v1 /* !! */  != false) break block36;
                                    }
                                    ** GOTO lbl73
                                }
                                catch (n9 v9) {
                                    throw m44.a("k", (Object)v9, (long)-313682393086322695L, (long)var2_2);
                                }
                                var5_3.append((char)qf.a("t", (int)17122, (long)(5158356002560497920L ^ var2_2)));
                                v6 = m44.a("u", (Object)this, (long)-82180447227408126L, (long)var2_2);
                                v7 = -1997083946001709508L;
                                v8 = var2_2;
lbl66:
                                // 2 sources

                                v1 /* !! */  = m44.a("t", (Object)v6, (long)v7, (long)v8);
                            }
                            catch (n9 v10) {
                                throw m44.a("k", (Object)v10, (long)-313682393086322695L, (long)var2_2);
                            }
                        }
                        try {
                            v2 = var4_6;
lbl73:
                            // 2 sources

                            if (v2 != null) break block37;
                            if (v1 /* !! */  != false) break block38;
                        }
                        catch (n9 v11) {
                            throw m44.a("k", (Object)v11, (long)-313682393086322695L, (long)var2_2);
                        }
                        var6_4 = 0;
                        var7_5 = m44.a("u", (Object)this, (long)-82180447227408126L, (long)var2_2).iterator();
                        block25: while (var7_5.hasNext()) {
                            v12 /* !! */  = var7_5.next();
                            do {
                                block39: {
                                    block40: {
                                        block41: {
                                            var8_7 = (String)v12 /* !! */ ;
                                            try {
                                                try {
                                                    try {
                                                        v13 = var4_6;
                                                        if (var2_2 < 0L) break block39;
                                                        if (v13 != null) break block40;
                                                        v1 /* !! */  = (CallSite)var6_4;
                                                        if (var4_6 != null) break block37;
                                                    }
                                                    catch (n9 v14) {
                                                        throw m44.a("k", (Object)v14, (long)-313682393086322695L, (long)var2_2);
                                                    }
                                                    if (v1 /* !! */  <= 0) break block41;
                                                }
                                                catch (n9 v15) {
                                                    throw m44.a("k", (Object)v15, (long)-313682393086322695L, (long)var2_2);
                                                }
                                                var5_3.append((char)qf.a("t", (int)17471, (long)(9108782648771076058L ^ var2_2)));
                                            }
                                            catch (n9 v16) {
                                                throw m44.a("k", (Object)v16, (long)-313682393086322695L, (long)var2_2);
                                            }
                                        }
                                        var5_3.append((char)qf.a("t", (int)31291, (long)(5744814758481060319L ^ var2_2)));
                                        var5_3.append(var8_7);
                                        var5_3.append((char)qf.a("t", (int)31291, (long)(5744814758481060319L ^ var2_2)));
                                        ++var6_4;
                                    }
                                    v13 = var4_6;
                                }
                                if (v13 == null) continue block25;
                                v12 /* !! */  = var5_3.append((char)m44.a("o", (long)-2094213743810752350L, (long)var2_2));
                            } while (var2_2 <= 0L);
                        }
                    }
                    v1 /* !! */  = (CallSite)false;
                }
                var6_4 = v1 /* !! */ ;
                var7_5 = m44.a("u", (Object)this, (long)-399892709007881287L, (long)var2_2).iterator();
                block27: while (var7_5.hasNext()) {
                    v17 /* !! */  = var7_5.next();
                    do {
                        block43: {
                            block44: {
                                block45: {
                                    v18 = (String)v17 /* !! */ ;
                                    if (var2_2 < 0L) break block42;
                                    var8_7 = v18;
                                    try {
                                        try {
                                            try {
                                                if (var4_6 != null) break block27;
                                                v19 = var4_6;
                                                if (var2_2 < 0L) break block43;
                                                if (v19 != null) break block44;
                                            }
                                            catch (n9 v20) {
                                                throw m44.a("k", (Object)v20, (long)-313682393086322695L, (long)var2_2);
                                            }
                                            if (var2_2 < 0L) break block44;
                                            if (var6_4 <= 0) break block45;
                                        }
                                        catch (n9 v21) {
                                            throw m44.a("k", (Object)v21, (long)-313682393086322695L, (long)var2_2);
                                        }
                                        var5_3.append((char)qf.a("t", (int)17471, (long)(9108782648771076058L ^ var2_2)));
                                    }
                                    catch (n9 v22) {
                                        throw m44.a("k", (Object)v22, (long)-313682393086322695L, (long)var2_2);
                                    }
                                }
                                var5_3.append((char)qf.a("t", (int)31291, (long)(5744814758481060319L ^ var2_2)));
                                var5_3.append(var8_7);
                                var5_3.append((char)qf.a("t", (int)31291, (long)(5744814758481060319L ^ var2_2)));
                                ++var6_4;
                            }
                            v19 = var4_6;
                        }
                        if (v19 == null) continue block27;
                        v17 /* !! */  = var5_3.append((char)qf.a("t", (int)29733, (long)(4510799913999724484L ^ var2_2)));
                    } while (var2_2 < 0L);
                }
            }
            v18 = var5_3.toString();
        }
        return v18;
    }

    public boolean N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        return m44.a("v", (Object)((Object)this), (long)4050712060458358761L, (long)l).add(string);
    }

    boolean y(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("o", (long)1151917429960659454L, (long)l);
                try {
                    object = m44.a("p", (Object)m44.a("q", (Object)((Object)this), (long)1101132401481670806L, (long)l), (long)1575386853867337640L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)((Object)n92), (long)734536176864618093L, (long)l);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public boolean F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        return m44.a("s", (Object)((Object)this), (long)-5324040664426526761L, (long)l).add(string);
    }

    boolean G(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("l", (long)1227028389794860805L, (long)l);
                try {
                    object = m44.a("s", (Object)m44.a("r", (Object)((Object)this), (long)1521207228160468182L, (long)l), (long)803836330902366547L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)((Object)n92), (long)1498205400491128982L, (long)l);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public qf(int n, int n2, char c, int n3) {
        long l;
        long l2 = l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x38B9ED915ED6L;
        long l4 = l2 ^ 0x66FC0761CB37L;
        super(l3, n3);
        m44.a("t", (Object)((Object)this), (Set)new gv(l4), (long)-3542499070052106342L, (long)l);
        m44.a("t", (Object)((Object)this), (Set)new gv(l4), (long)-3799031627795651431L, (long)l);
        m44.a("t", (Object)((Object)this), (Set)new gv(l4), (long)-3465411892987412958L, (long)l);
    }

    public Set Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x7A4D0315F131L;
        return new gv((Collection)((Object)m44.a("w", (Object)((Object)this), (long)-2929678269036337637L, (long)l)), l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qf.a = prr.a((long)-7614078562542989073L, (long)8448760437128304453L, MethodHandles.lookup().lookupClass()).a(151251933674044L);
                qf.f = new HashMap<K, V>(13);
                var0 = qf.a ^ 62969592983501L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u00fe\u0098\u00a7\u00a2D\u0006z\u001b?g\f\u00a1N\u00db\u0089\u007f\u00ce\u0081\u00caL\u00d8\u00ee\u00bd\u009b\u00e28\u00d7\u0018\u001f0~\u00fa";
                var7_6 = "\u00fe\u0098\u00a7\u00a2D\u0006z\u001b?g\f\u00a1N\u00db\u0089\u007f\u00ce\u0081\u00caL\u00d8\u00ee\u00bd\u009b\u00e28\u00d7\u0018\u001f0~\u00fa".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "g\u00bc\u0002\u0000rF\u00a3\u0092\u00a5/\u0014o\u00fa\u008fx\u00e4";
                    var7_6 = "g\u00bc\u0002\u0000rF\u00a3\u0092\u00a5/\u0014o\u00fa\u008fx\u00e4".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        qf.c = var8_3;
        qf.e = new Integer[6];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x74CD;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/qf", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qf.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = qf.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/qf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
