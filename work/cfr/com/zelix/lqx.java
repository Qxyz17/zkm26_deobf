/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.mn;
import com.zelix.nn;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.yv;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lqx {
    public static final String a;
    private static List Q;
    public static int x;
    public static final String z;
    public static boolean n;
    public static final char m;
    public static final String K;
    public static final String g;
    public static final String N;
    public static final String A;
    public static final File U;
    public static final char P;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map i;
    private static final long[] j;
    private static final Long[] k;
    private static final Map l;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void a(Object[] var0) {
        block36: {
            block33: {
                block37: {
                    var3_1 = (String)var0[0];
                    var5_2 = (Long)var0[1];
                    var1_3 = (String)var0[2];
                    var4_4 = (Integer)var0[3];
                    var2_5 = (Integer)var0[4];
                    var5_2 = lqx.b ^ var5_2;
                    var7_6 = m44.a("j", (long)2644267038925366410L, (long)var5_2);
                    try {
                        if (m44.a("u", (Object)new File(var3_1), (long)2603465795976747354L, (long)var5_2).equals(m44.a("u", (Object)new File(var1_3), (long)2603465795976747354L, (long)var5_2))) {
                            throw new IllegalArgumentException((String)lqx.a("j", (int)19614, (long)(6305436551195856172L ^ var5_2)) + (String)m44.a("u", (Object)new File(var3_1), (long)2603465795976747354L, (long)var5_2) + "'");
                        }
                    }
                    catch (IOException v0) {
                        throw m44.a("j", (Object)v0, (long)4132376690166833338L, (long)var5_2);
                    }
                    var8_7 = null;
                    var9_8 = null;
                    try {
                        var9_8 = var4_4 != null ? new BufferedInputStream(new FileInputStream(var3_1), var4_4) : new BufferedInputStream(new FileInputStream(var3_1));
                        var8_7 = var2_5 != null ? new BufferedOutputStream(new FileOutputStream(var1_3), var2_5) : new BufferedOutputStream(new FileOutputStream(var1_3));
                        var10_9 = m44.a("u", (Object)var9_8, (long)2585322997840852424L, (long)var5_2);
                        var11_12 = new byte[var10_9];
                        var12_13 = 0;
                        while (var12_13 < var10_9) {
                            block34: {
                                block35: {
                                    v1 = var9_8;
                                    v2 = var7_6;
                                    if (var5_2 < 0L) ** GOTO lbl100
                                    if (v2 != false) break block33;
                                    v3 = m44.a("u", (Object)v1, (Object)var11_12, (int)var12_13, (int)m44.a("j", (int)lqx.b("k", (int)12552, (long)(5368525305318251924L ^ var5_2)), (int)(var10_9 - var12_13), (long)2313291482797792549L, (long)var5_2), (long)2655059673779276504L, (long)var5_2);
                                    if (var5_2 < 0L) break block34;
                                    v4 /* !! */  = -1;
                                    if (var7_6 != false) break block35;
                                    try {
                                        block40: {
                                            if (v3 == v4 /* !! */ ) break;
                                            break block40;
                                            catch (IOException v5) {
                                                throw m44.a("j", (Object)v5, (long)4132376690166833338L, (long)var5_2);
                                            }
                                        }
                                        v6 = var12_13;
                                        v4 /* !! */  = (int)var13_14;
                                    }
                                    catch (IOException v7) {
                                        throw m44.a("j", (Object)v7, (long)4132376690166833338L, (long)var5_2);
                                    }
                                }
                                var12_13 = v6 + v4 /* !! */ ;
                                v3 = var7_6;
                            }
                            if (v3 == false) continue;
                        }
                        var8_7.write(var11_12);
                        if (var5_2 <= 0L) break block36;
                        if (var5_2 < 0L) break block37;
                        v8 = var8_7;
                        if (var7_6 != false) ** GOTO lbl91
                    }
                    catch (Throwable var14_15) {
                        block39: {
                            block38: {
                                try {
                                    if (var5_2 < 0L) break block38;
                                    v9 = var8_7;
                                    if (var7_6 == false) {
                                        if (v9 == null) break block38;
                                    }
                                    ** GOTO lbl66
                                }
                                catch (IOException v10) {
                                    throw m44.a("j", (Object)v10, (long)4132376690166833338L, (long)var5_2);
                                }
                                try {
                                    v9 = var8_7;
lbl66:
                                    // 2 sources

                                    m44.a("u", v9, (long)4072427203466009383L, (long)var5_2);
                                }
                                catch (IOException var15_16) {
                                    // empty catch block
                                }
                            }
                            try {
                                if (var5_2 <= 0L) break block39;
                                v11 = var9_8;
                                if (var7_6 == false) {
                                    if (v11 == null) break block39;
                                }
                                ** GOTO lbl82
                            }
                            catch (IOException v12) {
                                throw m44.a("j", (Object)v12, (long)4132376690166833338L, (long)var5_2);
                            }
                            try {
                                v11 = var9_8;
lbl82:
                                // 2 sources

                                m44.a("u", (Object)v11, (long)2497938476465799280L, (long)var5_2);
                            }
                            catch (IOException var15_17) {
                                // empty catch block
                            }
                        }
                        throw var14_15;
                    }
                    if (v8 == null) break block37;
                    try {
                        v8 = var8_7;
lbl91:
                        // 2 sources

                        m44.a("u", (Object)v8, (long)4072427203466009383L, (long)var5_2);
                    }
                    catch (IOException var10_10) {
                        // empty catch block
                    }
                }
                v1 = var9_8;
            }
            try {
                v2 = var7_6;
lbl100:
                // 2 sources

                if (v2 == false) {
                    if (v1 == null) break block36;
                }
                ** GOTO lbl108
            }
            catch (IOException v13) {
                throw m44.a("j", (Object)v13, (long)4132376690166833338L, (long)var5_2);
            }
            try {
                v1 = var9_8;
lbl108:
                // 2 sources

                m44.a("u", (Object)v1, (long)2497938476465799280L, (long)var5_2);
            }
            catch (IOException var10_11) {}
        }
    }

    public static boolean l(String string, long l10) {
        int n10;
        block21: {
            block22: {
                boolean bl2;
                block25: {
                    block26: {
                        CallSite callSite;
                        int n11;
                        block24: {
                            int n12;
                            block23: {
                                l10 = b ^ l10;
                                int n13 = string.length();
                                n11 = string.lastIndexOf((int)lqx.b("k", (int)26591, (long)(0x771FD1788AF00D7FL ^ l10)));
                                callSite = m44.a("o", (long)7102028967387652791L, (long)l10);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    n10 = n11;
                                                    if (callSite != false) break block21;
                                                    if (n10 <= 0) break block22;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                                                }
                                                n10 = n11;
                                                n12 = n13 - 4;
                                                if (callSite != false) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                                            }
                                            if (n10 == n12) break block24;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                                        }
                                        n10 = n11;
                                        if (callSite != false) break block21;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                                    }
                                    n12 = n13 - 5;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                                }
                            }
                            if (n10 != n12) break block22;
                        }
                        String string2 = string.substring(n11).toLowerCase();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            bl2 = string2.equals(lqx.a("j", (int)23285, (long)(0x551ECCC7693C5D45L ^ l10)));
                                            if (callSite != false) break block25;
                                            if (bl2) break block26;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                                        }
                                        bl2 = string2.equals(lqx.a("j", (int)17065, (long)(0xB096937ED70450CL ^ l10)));
                                        if (callSite != false) break block25;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                                    }
                                    if (bl2) break block26;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                                }
                                n10 = string2.endsWith((String)((Object)lqx.a("j", (int)16216, (long)(0x61865C1412AAB8EDL ^ l10)))) ? 1 : 0;
                                if (callSite != false) break block21;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                            }
                            if (n10 == 0) break block22;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("o", (Object)illegalArgumentException, (long)9179477194143491719L, (long)l10);
                        }
                    }
                    bl2 = true;
                }
                return bl2;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean k(Object[] var0) {
        block11: {
            block14: {
                block12: {
                    block13: {
                        var1_1 = (File)var0[0];
                        var2_2 = (Long)var0[1];
                        v0 = var2_2 = lqx.b ^ var2_2;
                        var4_3 = v0 ^ 48196567662670L;
                        var6_4 = v0 ^ 69448797151211L;
                        var8_5 = v0 ^ 83618873106189L;
                        var11_6 = m44.a("w", (Object)var1_1, (long)-799213151688484816L, (long)var2_2);
                        var10_7 = m44.a("h", (long)-835167959174387784L, (long)var2_2);
                        try {
                            try {
                                try {
                                    try {
                                        v1 = new Object[2];
                                        v1[1] = var11_6;
                                        v1[0] = var6_4;
                                        v2 /* !! */  = m44.a("h", (Object)v1, (long)-1537709408268614734L, (long)var2_2);
                                        if (var10_7 == false) break block11;
                                        if (v2 /* !! */  != false) break block12;
                                    }
                                    catch (IllegalArgumentException v3) {
                                        throw m44.a("h", (Object)v3, (long)-1251120417489520832L, (long)var2_2);
                                    }
                                    v2 /* !! */  = m44.a("h", (Object)var11_6, (long)var8_5, (long)-1356500797868982367L, (long)var2_2);
                                    v4 = var10_7;
                                    if (var2_2 > 0L) {
                                        if (v4 == false) break block13;
                                    }
                                    ** GOTO lbl48
                                }
                                catch (IllegalArgumentException v5) {
                                    throw m44.a("h", (Object)v5, (long)-1251120417489520832L, (long)var2_2);
                                }
                                if (v2 /* !! */  == false) break block14;
                            }
                            catch (IllegalArgumentException v6) {
                                throw m44.a("h", (Object)v6, (long)-1251120417489520832L, (long)var2_2);
                            }
                            v7 = new Object[2];
                            v7[1] = var4_3;
                            v7[0] = var1_1;
                            v2 /* !! */  = m44.a("h", (Object)v7, (long)-1209765401909692340L, (long)var2_2);
                        }
                        catch (IllegalArgumentException v8) {
                            throw m44.a("h", (Object)v8, (long)-1251120417489520832L, (long)var2_2);
                        }
                    }
                    try {
                        v4 = var10_7;
lbl48:
                        // 2 sources

                        if (v4 == false) break block11;
                        if (v2 /* !! */  == false) break block14;
                    }
                    catch (IllegalArgumentException v9) {
                        throw m44.a("h", (Object)v9, (long)-1251120417489520832L, (long)var2_2);
                    }
                }
                v2 /* !! */  = (CallSite)true;
                break block11;
            }
            v2 /* !! */  = (CallSite)false;
        }
        return (boolean)v2 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String R(Object[] var0) {
        block92: {
            block102: {
                block103: {
                    block116: {
                        block115: {
                            block113: {
                                block114: {
                                    block104: {
                                        block110: {
                                            block111: {
                                                block112: {
                                                    block109: {
                                                        block105: {
                                                            block106: {
                                                                block107: {
                                                                    block108: {
                                                                        block91: {
                                                                            block99: {
                                                                                block101: {
                                                                                    block100: {
                                                                                        block89: {
                                                                                            block90: {
                                                                                                block87: {
                                                                                                    block88: {
                                                                                                        var1_1 = (String)var0[0];
                                                                                                        var2_2 = (String)var0[1];
                                                                                                        var3_3 = (Long)var0[2];
                                                                                                        var5_4 = (var3_3 = lqx.b ^ var3_3) ^ 82545378364653L;
                                                                                                        var7_5 = m44.a("m", (long)1514639761510470973L, (long)var3_3);
                                                                                                        try {
                                                                                                            try {
                                                                                                                v0 = var1_1;
                                                                                                                if (var7_5 != false) break block87;
                                                                                                                if (v0 != null) break block88;
                                                                                                            }
                                                                                                            catch (IllegalArgumentException v1) {
                                                                                                                throw m44.a("m", (Object)v1, (long)643558168849781005L, (long)var3_3);
                                                                                                            }
                                                                                                            return null;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v2) {
                                                                                                            throw m44.a("m", (Object)v2, (long)643558168849781005L, (long)var3_3);
                                                                                                        }
                                                                                                    }
                                                                                                    v0 = var2_2;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var7_5 != false) break block89;
                                                                                                        if (v0 != null) break block90;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v3) {
                                                                                                        throw m44.a("m", (Object)v3, (long)643558168849781005L, (long)var3_3);
                                                                                                    }
                                                                                                    throw new IllegalArgumentException((String)lqx.a("j", (int)29306, (long)(8928124171445109328L ^ var3_3)) + var1_1 + (String)lqx.a("j", (int)9253, (long)(5324336313963435025L ^ var3_3)));
                                                                                                }
                                                                                                catch (IllegalArgumentException v4) {
                                                                                                    throw m44.a("m", (Object)v4, (long)643558168849781005L, (long)var3_3);
                                                                                                }
                                                                                            }
                                                                                            v0 = var1_1.trim();
                                                                                        }
                                                                                        var1_1 = v0;
                                                                                        var8_6 = new StringBuilder();
                                                                                        try {
                                                                                            v5 /* !! */  = var1_1.startsWith((String)lqx.a("j", (int)20639, (long)(1282217126485270671L ^ var3_3)));
                                                                                            v6 = var7_5;
                                                                                            if (var3_3 < 0L) ** GOTO lbl161
                                                                                            if (v6 != false) break block91;
                                                                                            if (v5 /* !! */  != '\u0000') {
                                                                                            }
                                                                                            ** GOTO lbl146
                                                                                        }
                                                                                        catch (IllegalArgumentException v7) {
                                                                                            throw m44.a("m", (Object)v7, (long)643558168849781005L, (long)var3_3);
                                                                                        }
                                                                                        var9_7 = var1_1;
                                                                                        var10_8 = var2_2;
                                                                                        while (var9_7.startsWith((String)lqx.a("j", (int)20639, (long)(1282217126485270671L ^ var3_3)))) {
                                                                                            block97: {
                                                                                                block98: {
                                                                                                    block96: {
                                                                                                        block93: {
                                                                                                            block94: {
                                                                                                                block95: {
                                                                                                                    v8 = new Object[2];
                                                                                                                    v8[1] = var5_4;
                                                                                                                    v8[0] = var10_8;
                                                                                                                    var11_9 = m44.a("m", (Object)v8, (long)644399548930962219L, (long)var3_3);
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v9 = var11_9;
                                                                                                                                v10 = var7_5;
                                                                                                                                if (var3_3 > 0L) {
                                                                                                                                    if (v10 != false) break block92;
                                                                                                                                    v10 = var7_5;
                                                                                                                                }
                                                                                                                                if (var3_3 >= 0L) {
                                                                                                                                    if (v10 != false) break block93;
                                                                                                                                }
                                                                                                                                ** GOTO lbl85
                                                                                                                            }
                                                                                                                            catch (IllegalArgumentException v11) {
                                                                                                                                throw m44.a("m", (Object)v11, (long)643558168849781005L, (long)var3_3);
                                                                                                                            }
                                                                                                                            if (var3_3 <= 0L) break block94;
                                                                                                                            if (v9 != null) break block95;
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException v12) {
                                                                                                                            throw m44.a("m", (Object)v12, (long)643558168849781005L, (long)var3_3);
                                                                                                                        }
                                                                                                                        throw new IllegalArgumentException((String)lqx.a("j", (int)14483, (long)(4769729839303149697L ^ var3_3)) + var2_2 + (String)lqx.a("j", (int)9211, (long)(2994856978742399946L ^ var3_3)) + var1_1 + (String)lqx.a("j", (int)9253, (long)(5324336313963435025L ^ var3_3)));
                                                                                                                    }
                                                                                                                    catch (IllegalArgumentException v13) {
                                                                                                                        throw m44.a("m", (Object)v13, (long)643558168849781005L, (long)var3_3);
                                                                                                                    }
                                                                                                                }
                                                                                                                v14 = var11_9;
                                                                                                            }
                                                                                                            var10_8 = v14;
                                                                                                            v15 = var9_7;
                                                                                                        }
                                                                                                        try {
                                                                                                            v10 = var7_5;
lbl85:
                                                                                                            // 2 sources

                                                                                                            if (v10 != false) break block96;
                                                                                                            if (v15.length() > 2) {
                                                                                                            }
                                                                                                            ** GOTO lbl96
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v16) {
                                                                                                            throw m44.a("m", (Object)v16, (long)643558168849781005L, (long)var3_3);
                                                                                                        }
                                                                                                        var9_7 = var9_7.substring(3);
                                                                                                        try {
                                                                                                            v17 = var7_5;
                                                                                                            if (var3_3 < 0L) break block97;
                                                                                                            if (v17 == false) break block98;
lbl96:
                                                                                                            // 2 sources

                                                                                                            v15 = "";
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v18) {
                                                                                                            throw m44.a("m", (Object)v18, (long)643558168849781005L, (long)var3_3);
                                                                                                        }
                                                                                                    }
                                                                                                    var9_7 = v15;
                                                                                                }
                                                                                                v17 = var7_5;
                                                                                            }
                                                                                            if (v17 == false) continue;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            var8_6.append(var10_8);
                                                                                                            v19 = var8_6;
                                                                                                            if (var7_5 != false) break block99;
                                                                                                            if (v19.length() <= 0) break block100;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v20) {
                                                                                                            throw m44.a("m", (Object)v20, (long)643558168849781005L, (long)var3_3);
                                                                                                        }
                                                                                                        v19 = var8_6;
                                                                                                        if (var3_3 <= 0L || var7_5 != false) break block99;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v21) {
                                                                                                        throw m44.a("m", (Object)v21, (long)643558168849781005L, (long)var3_3);
                                                                                                    }
                                                                                                    if (var3_3 < 0L) break block101;
                                                                                                    if (m44.a("r", (Object)v19, (int)(var8_6.length() - 1), (long)1005127942569959511L, (long)var3_3) == lqx.b("k", (int)16431, (long)(3858967177742048530L ^ var3_3))) break block100;
                                                                                                }
                                                                                                catch (IllegalArgumentException v22) {
                                                                                                    throw m44.a("m", (Object)v22, (long)643558168849781005L, (long)var3_3);
                                                                                                }
                                                                                                if (var9_7.length() <= 0) break block100;
                                                                                            }
                                                                                            catch (IllegalArgumentException v23) {
                                                                                                throw m44.a("m", (Object)v23, (long)643558168849781005L, (long)var3_3);
                                                                                            }
                                                                                            var8_6.append((char)lqx.b("k", (int)16431, (long)(3858967177742048530L ^ var3_3)));
                                                                                        }
                                                                                        catch (IllegalArgumentException v24) {
                                                                                            throw m44.a("m", (Object)v24, (long)643558168849781005L, (long)var3_3);
                                                                                        }
                                                                                    }
                                                                                    v25 = var8_6;
                                                                                }
                                                                                v19 = v25.append(var9_7);
                                                                            }
                                                                            try {
                                                                                if (var3_3 <= 0L) break block102;
                                                                                if (var7_5 == false) break block103;
lbl146:
                                                                                // 2 sources

                                                                                v5 /* !! */  = var1_1.startsWith(".");
                                                                            }
                                                                            catch (IllegalArgumentException v26) {
                                                                                throw m44.a("m", (Object)v26, (long)643558168849781005L, (long)var3_3);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v6 = var7_5;
lbl161:
                                                                                                            // 2 sources

                                                                                                            if (var3_3 <= 0L) ** GOTO lbl276
                                                                                                            if (v6 != false) break block104;
                                                                                                            if (v5 /* !! */  != '\u0000') {
                                                                                                            }
                                                                                                            ** GOTO lbl268
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v27) {
                                                                                                            throw m44.a("m", (Object)v27, (long)643558168849781005L, (long)var3_3);
                                                                                                        }
                                                                                                        v28 = var2_2;
                                                                                                        if (var7_5 != false) break block105;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v29) {
                                                                                                        throw m44.a("m", (Object)v29, (long)643558168849781005L, (long)var3_3);
                                                                                                    }
                                                                                                    if (var3_3 < 0L) break block105;
                                                                                                    if (v28.length() > 0) {
                                                                                                    }
                                                                                                    ** GOTO lbl217
                                                                                                }
                                                                                                catch (IllegalArgumentException v30) {
                                                                                                    throw m44.a("m", (Object)v30, (long)643558168849781005L, (long)var3_3);
                                                                                                }
                                                                                                var8_6.append(var2_2);
                                                                                                v9 = var1_1;
                                                                                                if (var7_5 != false) break block92;
                                                                                            }
                                                                                            catch (IllegalArgumentException v31) {
                                                                                                throw m44.a("m", (Object)v31, (long)643558168849781005L, (long)var3_3);
                                                                                            }
                                                                                            if (v9.length() <= 1) break block103;
                                                                                        }
                                                                                        catch (IllegalArgumentException v32) {
                                                                                            throw m44.a("m", (Object)v32, (long)643558168849781005L, (long)var3_3);
                                                                                        }
                                                                                        v19 = var8_6;
                                                                                        if (var3_3 < 0L || var7_5 != false) break block106;
                                                                                    }
                                                                                    catch (IllegalArgumentException v33) {
                                                                                        throw m44.a("m", (Object)v33, (long)643558168849781005L, (long)var3_3);
                                                                                    }
                                                                                    if (var3_3 <= 0L) break block107;
                                                                                    if (m44.a("r", (Object)v19, (int)(var8_6.length() - 1), (long)1005127942569959511L, (long)var3_3) != lqx.b("k", (int)16431, (long)(3858967177742048530L ^ var3_3))) break block108;
                                                                                }
                                                                                catch (IllegalArgumentException v34) {
                                                                                    throw m44.a("m", (Object)v34, (long)643558168849781005L, (long)var3_3);
                                                                                }
                                                                                if (var1_1.charAt(1) != lqx.b("k", (int)16431, (long)(3858967177742048530L ^ var3_3))) break block108;
                                                                            }
                                                                            catch (IllegalArgumentException v35) {
                                                                                throw m44.a("m", (Object)v35, (long)643558168849781005L, (long)var3_3);
                                                                            }
                                                                            m44.a("r", (Object)var8_6, (int)(var8_6.length() - 1), (long)1636678911228409370L, (long)var3_3);
                                                                        }
                                                                        catch (IllegalArgumentException v36) {
                                                                            throw m44.a("m", (Object)v36, (long)643558168849781005L, (long)var3_3);
                                                                        }
                                                                    }
                                                                    v37 = var8_6;
                                                                }
                                                                v19 = v37.append(var1_1.substring(1));
                                                            }
                                                            try {
                                                                if (var3_3 < 0L) break block102;
                                                                if (var7_5 == false) break block103;
lbl217:
                                                                // 2 sources

                                                                v28 = var1_1.substring(1);
                                                            }
                                                            catch (IllegalArgumentException v38) {
                                                                throw m44.a("m", (Object)v38, (long)643558168849781005L, (long)var3_3);
                                                            }
                                                        }
                                                        var9_7 = v28;
                                                        try {
                                                            try {
                                                                try {
                                                                    v5 /* !! */  = (char)var9_7.length();
                                                                    v39 = var7_5;
                                                                    if (var3_3 >= 0L) {
                                                                        if (v39 != false) break block109;
                                                                        if (v5 /* !! */  <= '\u0000') break block110;
                                                                    }
                                                                    ** GOTO lbl250
                                                                }
                                                                catch (IllegalArgumentException v40) {
                                                                    throw m44.a("m", (Object)v40, (long)643558168849781005L, (long)var3_3);
                                                                }
                                                                v41 = var9_7;
                                                                if (var3_3 < 0L) break block111;
                                                                v42 = 0;
                                                                if (var7_5 != false) break block112;
                                                            }
                                                            catch (IllegalArgumentException v43) {
                                                                throw m44.a("m", (Object)v43, (long)643558168849781005L, (long)var3_3);
                                                            }
                                                            v5 /* !! */  = v41.charAt(v42);
                                                        }
                                                        catch (IllegalArgumentException v44) {
                                                            throw m44.a("m", (Object)v44, (long)643558168849781005L, (long)var3_3);
                                                        }
                                                    }
                                                    try {
                                                        if (var3_3 < 0L) ** GOTO lbl266
                                                        v39 = lqx.b("k", (int)16431, (long)(3858967177742048530L ^ var3_3));
lbl250:
                                                        // 2 sources

                                                        if (v5 /* !! */  != v39) break block110;
                                                        v45 = var9_7;
                                                        v42 = 1;
                                                    }
                                                    catch (IllegalArgumentException v46) {
                                                        throw m44.a("m", (Object)v46, (long)643558168849781005L, (long)var3_3);
                                                    }
                                                }
                                                v41 = v45.substring(v42);
                                            }
                                            var9_7 = v41;
                                            var8_6.append(var9_7);
                                        }
                                        try {
                                            v5 /* !! */  = (char)var7_5;
lbl266:
                                            // 2 sources

                                            if (var3_3 < 0L) break block104;
                                            if (v5 /* !! */  == '\u0000') break block103;
lbl268:
                                            // 2 sources

                                            v5 /* !! */  = var1_1.charAt(0);
                                        }
                                        catch (IllegalArgumentException v47) {
                                            throw m44.a("m", (Object)v47, (long)643558168849781005L, (long)var3_3);
                                        }
                                    }
                                    try {
                                        try {
                                            v6 = var7_5;
lbl276:
                                            // 2 sources

                                            if (var3_3 > 0L) {
                                                if (v6 != false) break block113;
                                                if (v5 /* !! */  != lqx.b("k", (int)16431, (long)(3858967177742048530L ^ var3_3))) break block114;
                                            }
                                            ** GOTO lbl293
                                        }
                                        catch (IllegalArgumentException v48) {
                                            throw m44.a("m", (Object)v48, (long)643558168849781005L, (long)var3_3);
                                        }
                                        return var1_1;
                                    }
                                    catch (IllegalArgumentException v49) {
                                        throw m44.a("m", (Object)v49, (long)643558168849781005L, (long)var3_3);
                                    }
                                }
                                v5 /* !! */  = (char)var2_2.length();
                            }
                            try {
                                try {
                                    try {
                                        v6 = var7_5;
lbl293:
                                        // 2 sources

                                        if (var3_3 > 0L) {
                                            if (v6 != false) break block115;
                                            if (v5 /* !! */  <= '\u0000') break block116;
                                        }
                                        ** GOTO lbl314
                                    }
                                    catch (IllegalArgumentException v50) {
                                        throw m44.a("m", (Object)v50, (long)643558168849781005L, (long)var3_3);
                                    }
                                    var8_6.append(var2_2);
                                    v51 = var8_6;
                                    if (var7_5 != false) break block103;
                                }
                                catch (IllegalArgumentException v52) {
                                    throw m44.a("m", (Object)v52, (long)643558168849781005L, (long)var3_3);
                                }
                                v5 /* !! */  = (char)m44.a("r", (Object)v51, (int)(var8_6.length() - 1), (long)1005127942569959511L, (long)var3_3);
                            }
                            catch (IllegalArgumentException v53) {
                                throw m44.a("m", (Object)v53, (long)643558168849781005L, (long)var3_3);
                            }
                        }
                        try {
                            v6 = lqx.b("k", (int)16431, (long)(3858967177742048530L ^ var3_3));
lbl314:
                            // 2 sources

                            if (v5 /* !! */  != v6) {
                                var8_6.append((char)lqx.b("k", (int)16431, (long)(3858967177742048530L ^ var3_3)));
                            }
                        }
                        catch (IllegalArgumentException v54) {
                            throw m44.a("m", (Object)v54, (long)643558168849781005L, (long)var3_3);
                        }
                    }
                    v51 = var8_6.append(var1_1);
                }
                v19 = var8_6;
            }
            v9 = v19.toString();
        }
        return v9;
    }

    public static BufferedReader d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l11 = (l10 = b ^ l10) ^ 0x1EE7C967E473L;
        Object var7_5 = null;
        String string3 = string2;
        FileInputStream fileInputStream = new FileInputStream(string.trim());
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = var7_5;
        objectArray2[2] = string3;
        objectArray2[1] = fileInputStream;
        objectArray2[0] = l11;
        return m44.a("l", (Object)objectArray2, (long)4523915020940760885L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    private static List B(Object[] var0) {
        block46: {
            block47: {
                block45: {
                    block43: {
                        block44: {
                            block42: {
                                block55: {
                                    block54: {
                                        block41: {
                                            block53: {
                                                block52: {
                                                    var1_1 = (String)var0[0];
                                                    var4_2 = (Long)var0[1];
                                                    var2_3 = (String)var0[2];
                                                    var6_4 = (File)var0[3];
                                                    var3_5 = (sz)var0[4];
                                                    v0 = var4_2 = lqx.b ^ var4_2;
                                                    var7_6 = v0 ^ 1544140663642L;
                                                    var9_7 = v0 ^ 83350705424280L;
                                                    var11_8 = v0 ^ 130485404102514L;
                                                    var13_9 = v0 ^ 57884942793899L;
                                                    var16_10 = var1_1.lastIndexOf((String)m44.a("m", (long)-6663206912253745944L, (long)var4_2));
                                                    var15_11 = m44.a("i", (long)-4768981506508505623L, (long)var4_2);
                                                    if (var16_10 <= -1) break block52;
                                                    var17_12 = var1_1.substring(0, var16_10);
                                                    var18_13 = var1_1.substring(var16_10 + 1);
                                                    if (var4_2 < 0L || var15_11 == false) break block53;
                                                }
                                                var17_12 = null;
                                                var18_13 = var1_1;
                                            }
                                            try {
                                                v1 = var17_12;
                                                if (var15_11 != false) break block41;
                                                if (v1 == null) {
                                                }
                                                ** GOTO lbl34
                                            }
                                            catch (IllegalArgumentException v2) {
                                                throw m44.a("i", (Object)v2, (long)-6901105629013526055L, (long)var4_2);
                                            }
                                            var19_14 = var6_4;
                                            try {
                                                if (var15_11 == false) break block42;
lbl34:
                                                // 2 sources

                                                v1 = var17_12;
                                            }
                                            catch (IllegalArgumentException v3) {
                                                throw m44.a("i", (Object)v3, (long)-6901105629013526055L, (long)var4_2);
                                            }
                                        }
                                        v4 = new Object[2];
                                        v4[1] = var9_7;
                                        v4[0] = v1;
                                        if (m44.a("i", (Object)v4, (long)-6444122114904004132L, (long)var4_2) == false) break block54;
                                        v5 = new File(var6_4, var17_12);
                                        if (var4_2 < 0L) break block55;
                                        var19_14 = v5;
                                        if (var15_11 == false) break block42;
                                    }
                                    v5 = new File(var17_12);
                                }
                                var19_14 = v5;
                            }
                            var20_15 = new Vector<E>();
                            try {
                                try {
                                    v6 = m44.a("v", (Object)var19_14, (long)-4812783952459351827L, (long)var4_2);
                                    if (var4_2 < 0L || var15_11 != false) break block43;
                                    if (v6 == false) {
                                    }
                                    break block44;
                                }
                                catch (IllegalArgumentException v7) {
                                    throw m44.a("i", (Object)v7, (long)-6901105629013526055L, (long)var4_2);
                                }
                                var3_5.Z(var13_9, (String)lqx.a("j", (int)26308, (long)(2747165010815761981L ^ var4_2)) + (String)m44.a("v", (Object)var19_14, (long)-4809246182136201159L, (long)var4_2) + (String)lqx.a("j", (int)14006, (long)(8512310659570724454L ^ var4_2)));
                                return var20_15;
                            }
                            catch (IllegalArgumentException v8) {
                                throw m44.a("i", (Object)v8, (long)-6901105629013526055L, (long)var4_2);
                            }
                        }
                        try {
                            v9 = var19_14;
                            if (var15_11 != false) break block45;
                            v6 = m44.a("v", (Object)v9, (long)-6917184906112832645L, (long)var4_2);
                        }
                        catch (IllegalArgumentException v10) {
                            throw m44.a("i", (Object)v10, (long)-6901105629013526055L, (long)var4_2);
                        }
                    }
                    try {
                        if (v6 == false) {
                            var3_5.Z(var13_9, (String)lqx.a("j", (int)10190, (long)(5206193288698625833L ^ var4_2)) + (String)m44.a("v", (Object)var19_14, (long)-4809246182136201159L, (long)var4_2) + (String)lqx.a("j", (int)24537, (long)(5444326202650167101L ^ var4_2)));
                            return var20_15;
                        }
                    }
                    catch (IllegalArgumentException v11) {
                        throw m44.a("i", (Object)v11, (long)-6901105629013526055L, (long)var4_2);
                    }
                    v9 = var19_14;
                }
                var21_16 = m44.a("v", (Object)v9, (long)-6541170346665322355L, (long)var4_2);
                try {
                    try {
                        v12 = var21_16;
                        if (var15_11 != false) break block46;
                        if (v12 == null) {
                        }
                        break block47;
                    }
                    catch (IllegalArgumentException v13) {
                        throw m44.a("i", (Object)v13, (long)-6901105629013526055L, (long)var4_2);
                    }
                    var3_5.Z(var13_9, (String)lqx.a("j", (int)30468, (long)(3708577810930937844L ^ var4_2)) + (String)m44.a("v", (Object)var19_14, (long)-4809246182136201159L, (long)var4_2) + (String)lqx.a("j", (int)1768, (long)(7501015574232587786L ^ var4_2)));
                    return var20_15;
                }
                catch (IllegalArgumentException v14) {
                    throw m44.a("i", (Object)v14, (long)-6901105629013526055L, (long)var4_2);
                }
            }
            v12 = var21_16;
        }
        var22_17 = v12;
        var23_18 = ((CallSite)var22_17).length;
        var24_19 = 0;
        while (var24_19 < var23_18) {
            block48: {
                block49: {
                    block50: {
                        block51: {
                            var25_20 = var22_17[var24_19];
                            try {
                                try {
                                    try {
                                        try {
                                            v15 = var15_11;
                                            if (var4_2 <= 0L) break block48;
                                            if (v15 != false) break block49;
                                            if (m44.a("v", (Object)var25_20, (long)-6917184906112832645L, (long)var4_2) == false) break block50;
                                        }
                                        catch (IllegalArgumentException v16) {
                                            throw m44.a("i", (Object)v16, (long)-6901105629013526055L, (long)var4_2);
                                        }
                                        v17 = var25_20;
                                        if (var15_11 != false) break block51;
                                    }
                                    catch (IllegalArgumentException v18) {
                                        throw m44.a("i", (Object)v18, (long)-6901105629013526055L, (long)var4_2);
                                    }
                                    if (!mn.R((String)m44.a("v", (Object)v17, (long)-5011970120332421463L, (long)var4_2), var11_8, var18_13)) break block50;
                                }
                                catch (IllegalArgumentException v19) {
                                    throw m44.a("i", (Object)v19, (long)-6901105629013526055L, (long)var4_2);
                                }
                                v17 = var25_20;
                            }
                            catch (IllegalArgumentException v20) {
                                throw m44.a("i", (Object)v20, (long)-6901105629013526055L, (long)var4_2);
                            }
                        }
                        v21 = new Object[4];
                        v21[3] = var7_6;
                        v21[2] = var20_15;
                        v21[1] = var2_3;
                        v21[0] = v17;
                        m44.a("i", (Object)v21, (long)-6604783434122019429L, (long)var4_2);
                    }
                    ++var24_19;
                }
                v15 = var15_11;
            }
            if (v15 == false) continue;
        }
        return var20_15;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List t(Object[] var0) {
        block96: {
            block77: {
                block89: {
                    block90: {
                        block86: {
                            block85: {
                                block84: {
                                    block82: {
                                        block83: {
                                            block95: {
                                                block91: {
                                                    block93: {
                                                        block94: {
                                                            block92: {
                                                                block78: {
                                                                    block79: {
                                                                        block80: {
                                                                            block81: {
                                                                                block76: {
                                                                                    block73: {
                                                                                        block74: {
                                                                                            block75: {
                                                                                                block71: {
                                                                                                    var5_1 = (String)var0[0];
                                                                                                    var2_2 = (Long)var0[1];
                                                                                                    var4_3 = (File)var0[2];
                                                                                                    var6_4 = (sz)var0[3];
                                                                                                    var1_5 = (Boolean)var0[4];
                                                                                                    v0 = var2_2 = lqx.b ^ var2_2;
                                                                                                    var7_6 = v0 ^ 74830811422829L;
                                                                                                    var9_7 = v0 ^ 89897205126427L;
                                                                                                    var11_8 = v0 ^ 111582969878946L;
                                                                                                    var13_9 = v0 ^ 111322467778199L;
                                                                                                    var15_10 = v0 ^ 85893976456913L;
                                                                                                    var17_11 = v0 ^ 110609417566083L;
                                                                                                    var19_12 = v0 ^ 98933935333225L;
                                                                                                    var21_13 = v0 ^ 30729304624304L;
                                                                                                    v1 = new Object[1];
                                                                                                    v1[0] = var9_7;
                                                                                                    m44.a("u", (Object)var6_4, (Object)v1, (long)1289934632055271251L, (long)var2_2);
                                                                                                    var24_14 = new Vector<CallSite>();
                                                                                                    var23_15 = m44.a("j", (long)786639103505111354L, (long)var2_2);
                                                                                                    try {
                                                                                                        block72: {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (var23_15 == false) break block71;
                                                                                                                        if (var5_1 == null) break block72;
                                                                                                                    }
                                                                                                                    catch (IllegalArgumentException v2) {
                                                                                                                        throw m44.a("j", (Object)v2, (long)1162341749306788290L, (long)var2_2);
                                                                                                                    }
                                                                                                                    v3 = var5_1.trim();
                                                                                                                    if (var23_15 == false) break block73;
                                                                                                                }
                                                                                                                catch (IllegalArgumentException v4) {
                                                                                                                    throw m44.a("j", (Object)v4, (long)1162341749306788290L, (long)var2_2);
                                                                                                                }
                                                                                                                if (var2_2 <= 0L) break block74;
                                                                                                                if (v3.length() != 0) break block75;
                                                                                                            }
                                                                                                            catch (IllegalArgumentException v5) {
                                                                                                                throw m44.a("j", (Object)v5, (long)1162341749306788290L, (long)var2_2);
                                                                                                            }
                                                                                                        }
                                                                                                        var6_4.Z(var21_13, lqx.a("j", (int)28958, (long)(444162951568824799L ^ var2_2)));
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v6) {
                                                                                                        throw m44.a("j", (Object)v6, (long)1162341749306788290L, (long)var2_2);
                                                                                                    }
                                                                                                }
                                                                                                return var24_14;
                                                                                            }
                                                                                            v7 = var5_1;
                                                                                        }
                                                                                        v3 = v7.trim();
                                                                                    }
                                                                                    var25_16 = v3;
                                                                                    v8 = new Object[2];
                                                                                    v8[1] = var13_9;
                                                                                    v8[0] = var25_16;
                                                                                    var25_16 = m44.a("j", (Object)v8, (long)923118654409494423L, (long)var2_2);
                                                                                    v9 = new Object[3];
                                                                                    v9[2] = var4_3;
                                                                                    v9[1] = var11_8;
                                                                                    v9[0] = var25_16;
                                                                                    var25_16 = m44.a("j", (Object)v9, (long)916633730307021411L, (long)var2_2);
                                                                                    try {
                                                                                        try {
                                                                                            v10 = new Object[2];
                                                                                            v10[1] = var7_6;
                                                                                            v10[0] = var25_16;
                                                                                            v11 /* !! */  = m44.a("j", (Object)v10, (long)985871124032064953L, (long)var2_2);
                                                                                            if (var23_15 == false) break block76;
                                                                                            if (v11 /* !! */  == false) break block77;
                                                                                        }
                                                                                        catch (IllegalArgumentException v12) {
                                                                                            throw m44.a("j", (Object)v12, (long)1162341749306788290L, (long)var2_2);
                                                                                        }
                                                                                        v11 /* !! */  = (CallSite)var25_16.lastIndexOf((String)m44.a("n", (long)1413188869247636723L, (long)var2_2));
                                                                                    }
                                                                                    catch (IllegalArgumentException v13) {
                                                                                        throw m44.a("j", (Object)v13, (long)1162341749306788290L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                if ((var28_17 = v11 /* !! */ ) <= 0) break block91;
                                                                                var27_18 = var25_16.substring((int)(var28_17 + true), var25_16.length());
                                                                                var29_19 = var25_16.substring(0, (int)var28_17);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v14 /* !! */  = var1_5;
                                                                                            if (var23_15 == false) break block78;
                                                                                            if (!v14 /* !! */ ) break block79;
                                                                                        }
                                                                                        catch (IllegalArgumentException v15) {
                                                                                            throw m44.a("j", (Object)v15, (long)1162341749306788290L, (long)var2_2);
                                                                                        }
                                                                                        v16 = new Object[2];
                                                                                        v16[1] = var7_6;
                                                                                        v16[0] = var29_19;
                                                                                        v14 /* !! */  = m44.a("j", (Object)v16, (long)985871124032064953L, (long)var2_2);
                                                                                        if (var23_15 == false) break block78;
                                                                                    }
                                                                                    catch (IllegalArgumentException v17) {
                                                                                        throw m44.a("j", (Object)v17, (long)1162341749306788290L, (long)var2_2);
                                                                                    }
                                                                                    if (!v14 /* !! */ ) break block79;
                                                                                }
                                                                                catch (IllegalArgumentException v18) {
                                                                                    throw m44.a("j", (Object)v18, (long)1162341749306788290L, (long)var2_2);
                                                                                }
                                                                                var30_20 = var29_19.indexOf("*");
                                                                                var31_22 = var29_19.lastIndexOf((String)m44.a("n", (long)1413188869247636723L, (long)var2_2));
                                                                                try {
                                                                                    try {
                                                                                        v19 /* !! */  = var30_20;
                                                                                        v20 /* !! */  = var23_15;
                                                                                        if (var2_2 >= 0L) {
                                                                                            if (v20 /* !! */  == false) break block80;
                                                                                            v20 /* !! */  = (CallSite)var31_22;
                                                                                        }
                                                                                        if (v19 /* !! */  < v20 /* !! */ ) {
                                                                                        }
                                                                                        break block81;
                                                                                    }
                                                                                    catch (IllegalArgumentException v21) {
                                                                                        throw m44.a("j", (Object)v21, (long)1162341749306788290L, (long)var2_2);
                                                                                    }
                                                                                    var6_4.Z(var21_13, (String)lqx.a("j", (int)12319, (long)(4741621128318310642L ^ var2_2)) + (String)var29_19 + "'");
                                                                                    return var24_14;
                                                                                }
                                                                                catch (IllegalArgumentException v22) {
                                                                                    throw m44.a("j", (Object)v22, (long)1162341749306788290L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            v19 /* !! */  = (int)m44.a("n", (long)731597284830665195L, (long)var2_2);
                                                                        }
                                                                        if (v19 /* !! */  == 0) {
                                                                            var27_18 = m44.a("u", (Object)var27_18, (long)1186141274477199125L, (long)var2_2);
                                                                        }
                                                                        v23 = new Object[5];
                                                                        v23[4] = var6_4;
                                                                        v23[3] = var4_3;
                                                                        v23[2] = var27_18;
                                                                        v23[1] = var15_10;
                                                                        v23[0] = var29_19;
                                                                        return m44.a("j", (Object)v23, (long)1355559474315221530L, (long)var2_2);
                                                                    }
                                                                    v24 = new Object[2];
                                                                    v24[1] = var17_11;
                                                                    v24[0] = var29_19;
                                                                    v14 /* !! */  = m44.a("j", (Object)v24, (long)1624337406701525447L, (long)var2_2);
                                                                }
                                                                if (!v14 /* !! */ ) break block92;
                                                                var26_24 = new File(var4_3, (String)var29_19);
                                                                v25 = var23_15;
                                                                if (var2_2 < 0L) break block93;
                                                                if (v25 != false) break block94;
                                                            }
                                                            var26_24 = new File((String)var29_19);
                                                        }
                                                        v25 = var23_15;
                                                    }
                                                    if (var2_2 <= 0L) ** GOTO lbl165
                                                    if (v25 != false) break block95;
                                                }
                                                var26_24 = var4_3;
                                                var27_18 = var25_16;
                                            }
                                            try {
                                                v25 = m44.a("n", (long)731597284830665195L, (long)var2_2);
lbl165:
                                                // 2 sources

                                                v26 = var23_15;
                                                if (var2_2 >= 0L) {
                                                    if (v26 == false) break block82;
                                                    if (v25 != false) break block83;
                                                }
                                                ** GOTO lbl181
                                            }
                                            catch (IllegalArgumentException v27) {
                                                throw m44.a("j", (Object)v27, (long)1162341749306788290L, (long)var2_2);
                                            }
                                            var27_18 = m44.a("u", (Object)var27_18, (long)1186141274477199125L, (long)var2_2);
                                        }
                                        v25 = m44.a("u", (Object)var26_24, (long)1160265889342937952L, (long)var2_2);
                                    }
                                    try {
                                        try {
                                            try {
                                                v26 = var23_15;
lbl181:
                                                // 2 sources

                                                if (v26 == false) break block84;
                                                if (v25 != false) {
                                                }
                                                ** GOTO lbl254
                                            }
                                            catch (IllegalArgumentException v28) {
                                                throw m44.a("j", (Object)v28, (long)1162341749306788290L, (long)var2_2);
                                            }
                                            v29 = var26_24;
                                            if (var23_15 == false) break block85;
                                        }
                                        catch (IllegalArgumentException v30) {
                                            throw m44.a("j", (Object)v30, (long)1162341749306788290L, (long)var2_2);
                                        }
                                        v25 = m44.a("u", (Object)v29, (long)949873770209675510L, (long)var2_2);
                                    }
                                    catch (IllegalArgumentException v31) {
                                        throw m44.a("j", (Object)v31, (long)1162341749306788290L, (long)var2_2);
                                    }
                                }
                                if (v25 == false) ** GOTO lbl254
                                v29 = var26_24;
                            }
                            var29_19 = m44.a("u", (Object)v29, (long)1522840570488907926L, (long)var2_2);
                            if (var2_2 < 0L) break block86;
                            if (var29_19 == null) ** GOTO lbl243
                            for (var30_21 = 0; var30_21 < ((Object)var29_19).length; ++var30_21) {
                                block87: {
                                    block88: {
                                        var31_23 = m44.a("u", (Object)var29_19[var30_21], (long)750633208991475378L, (long)var2_2);
                                        try {
                                            try {
                                                v32 /* !! */  = var23_15;
                                                if (var2_2 <= 0L) ** GOTO lbl251
                                                if (!v32 /* !! */ ) break block86;
                                                v33 /* !! */  = m44.a("n", (long)731597284830665195L, (long)var2_2);
                                                v34 = var23_15;
                                                if (var2_2 >= 0L) {
                                                    if (v34 == false) break block87;
                                                }
                                                ** GOTO lbl229
                                            }
                                            catch (IllegalArgumentException v35) {
                                                throw m44.a("j", (Object)v35, (long)1162341749306788290L, (long)var2_2);
                                            }
                                            if (v33 /* !! */  != false) break block88;
                                        }
                                        catch (IllegalArgumentException v36) {
                                            throw m44.a("j", (Object)v36, (long)1162341749306788290L, (long)var2_2);
                                        }
                                        var31_23 = m44.a("u", (Object)var31_23, (long)1186141274477199125L, (long)var2_2);
                                    }
                                    v33 /* !! */  = (CallSite)mn.R((String)var31_23, var19_12, (String)var27_18);
                                }
                                try {
                                    try {
                                        v34 = var23_15;
lbl229:
                                        // 2 sources

                                        if (v34 == false || v33 /* !! */  == false) continue;
                                    }
                                    catch (IllegalArgumentException v37) {
                                        throw m44.a("j", (Object)v37, (long)1162341749306788290L, (long)var2_2);
                                    }
                                    v33 /* !! */  = (CallSite)var24_14.add(m44.a("u", (Object)var29_19[var30_21], (long)961816781065089058L, (long)var2_2));
                                    continue;
                                }
                                catch (IllegalArgumentException v38) {
                                    throw m44.a("j", (Object)v38, (long)1162341749306788290L, (long)var2_2);
                                }
                            }
                            try {
                                if (var2_2 <= 0L) break block86;
                                v32 /* !! */  = var23_15;
                                if (var2_2 <= 0L) ** GOTO lbl251
                                if (v32 /* !! */ ) break block86;
lbl243:
                                // 2 sources

                                var6_4.Z(var21_13, (String)lqx.a("j", (int)1732, (long)(573353633208692230L ^ var2_2)) + (String)m44.a("u", (Object)var26_24, (long)961816781065089058L, (long)var2_2) + (String)lqx.a("j", (int)24130, (long)(3837190465011824281L ^ var2_2)) + (String)var25_16 + "'");
                            }
                            catch (IllegalArgumentException v39) {
                                throw m44.a("j", (Object)v39, (long)1162341749306788290L, (long)var2_2);
                            }
                        }
                        try {
                            v32 /* !! */  = var23_15;
lbl251:
                            // 3 sources

                            if (var2_2 <= 0L) break block89;
                            if (v32 /* !! */ ) break block90;
lbl254:
                            // 3 sources

                            var6_4.Z(var21_13, "'" + (String)m44.a("u", (Object)var26_24, (long)961816781065089058L, (long)var2_2) + (String)lqx.a("j", (int)30929, (long)(6278304258042892305L ^ var2_2)) + (String)var25_16 + "'");
                        }
                        catch (IllegalArgumentException v40) {
                            throw m44.a("j", (Object)v40, (long)1162341749306788290L, (long)var2_2);
                        }
                    }
                    v32 /* !! */  = var23_15;
                }
                if (var2_2 <= 0L || v32 /* !! */ ) break block96;
            }
            var26_24 = new File((String)var25_16);
            v32 /* !! */  = var24_14.add(m44.a("u", (Object)var26_24, (long)961816781065089058L, (long)var2_2));
        }
        return var24_14;
    }

    public static String V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        File file = (File)objectArray[1];
        long l11 = (l10 = b ^ l10) ^ 0x59FB60849304L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = m44.a("m", (long)-4653053604852574702L, (long)l10);
        objectArray2[1] = l11;
        objectArray2[0] = file;
        return m44.a("i", (Object)objectArray2, (long)-6675911129771604870L, (long)l10);
    }

    public static byte[] T(Object[] objectArray) {
        byte[] byArray;
        block3: {
            int n10;
            long l10;
            long l11;
            InputStream inputStream;
            block2: {
                int n11 = (Integer)objectArray[0];
                inputStream = (InputStream)objectArray[1];
                int n12 = (Integer)objectArray[2];
                int n13 = (Integer)objectArray[3];
                int n14 = (Integer)objectArray[4];
                l11 = ((long)n11 << 32 | (long)n12 << 48 >>> 32 | (long)n14 << 48 >>> 48) ^ b;
                l10 = l11 ^ 0x65A3656E4180L;
                byArray = null;
                CallSite callSite = m44.a("o", (long)-2069654841970564225L, (long)l11);
                try {
                    n10 = n13;
                    if (callSite != false) break block2;
                    if (n10 <= 0) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-95578848254924977L, (long)l11);
                }
                n10 = n13;
            }
            byArray = new byte[n10];
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l10;
            objectArray2[1] = byArray;
            objectArray2[0] = inputStream;
            m44.a("o", (Object)objectArray2, (long)-171776941261760825L, (long)l11);
        }
        return byArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static BufferedReader h(Object[] var0) {
        block69: {
            block68: {
                block70: {
                    block66: {
                        block67: {
                            block65: {
                                block64: {
                                    block57: {
                                        block58: {
                                            block62: {
                                                block61: {
                                                    block60: {
                                                        block59: {
                                                            block55: {
                                                                block53: {
                                                                    block54: {
                                                                        block52: {
                                                                            var4_1 = (Long)var0[0];
                                                                            var3_2 = (InputStream)var0[1];
                                                                            var1_3 = (String)var0[2];
                                                                            var2_4 = (sz)var0[3];
                                                                            v0 = var4_1 = lqx.b ^ var4_1;
                                                                            var6_5 = v0 ^ 118560896952731L;
                                                                            var8_6 = v0 ^ 118707125677839L;
                                                                            v1 = v0 ^ 56893916331672L;
                                                                            var10_7 = (int)(v1 >>> 32);
                                                                            var11_8 = (int)(v1 << 32 >>> 48);
                                                                            var12_9 = (int)(v1 << 48 >>> 48);
                                                                            var13_10 = v0 ^ 89231831290479L;
                                                                            var16_11 = new PushbackInputStream(var3_2, (int)m44.a("i", (long)585219457037963617L, (long)var4_1));
                                                                            var15_12 = m44.a("m", (long)1456350213429561317L, (long)var4_1);
                                                                            var17_13 = null;
                                                                            var18_14 = null;
                                                                            try {
                                                                                try {
                                                                                    v2 = var1_3;
                                                                                    if (var15_12 == false) break block52;
                                                                                    if (v2 == null) break block53;
                                                                                }
                                                                                catch (IllegalArgumentException v3) {
                                                                                    throw m44.a("m", (Object)v3, (long)1080368567659763485L, (long)var4_1);
                                                                                }
                                                                                v2 = var1_3.trim();
                                                                            }
                                                                            catch (IllegalArgumentException v4) {
                                                                                throw m44.a("m", (Object)v4, (long)1080368567659763485L, (long)var4_1);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var15_12 == false) break block54;
                                                                                if (v2.length() <= 0) break block53;
                                                                            }
                                                                            catch (IllegalArgumentException v5) {
                                                                                throw m44.a("m", (Object)v5, (long)1080368567659763485L, (long)var4_1);
                                                                            }
                                                                            v2 = var1_3.trim();
                                                                        }
                                                                        catch (IllegalArgumentException v6) {
                                                                            throw m44.a("m", (Object)v6, (long)1080368567659763485L, (long)var4_1);
                                                                        }
                                                                    }
                                                                    var18_14 = v2;
                                                                }
                                                                var19_15 = 0;
                                                                try {
                                                                    block56: {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v7 = var18_14;
                                                                                            if (var15_12 == false) break block55;
                                                                                            if (v7 == null) break block56;
                                                                                        }
                                                                                        catch (IllegalArgumentException v8) {
                                                                                            throw m44.a("m", (Object)v8, (long)1080368567659763485L, (long)var4_1);
                                                                                        }
                                                                                        v7 = var18_14;
                                                                                        if (var15_12 == false) break block55;
                                                                                    }
                                                                                    catch (IllegalArgumentException v9) {
                                                                                        throw m44.a("m", (Object)v9, (long)1080368567659763485L, (long)var4_1);
                                                                                    }
                                                                                    if (var4_1 <= 0L) break block55;
                                                                                    if (v7.length() == 0) break block56;
                                                                                }
                                                                                catch (IllegalArgumentException v10) {
                                                                                    throw m44.a("m", (Object)v10, (long)1080368567659763485L, (long)var4_1);
                                                                                }
                                                                                v11 = var18_14;
                                                                                if (var15_12 == false) break block57;
                                                                            }
                                                                            catch (IllegalArgumentException v12) {
                                                                                throw m44.a("m", (Object)v12, (long)1080368567659763485L, (long)var4_1);
                                                                            }
                                                                            if (!v11.equals(lqx.a("j", (int)26184, (long)(4838403665114107994L ^ var4_1)))) break block58;
                                                                        }
                                                                        catch (IllegalArgumentException v13) {
                                                                            throw m44.a("m", (Object)v13, (long)1080368567659763485L, (long)var4_1);
                                                                        }
                                                                    }
                                                                    v14 = new Object[3];
                                                                    v14[2] = (int)m44.a("i", (long)585219457037963617L, (long)var4_1);
                                                                    v14[1] = var16_11;
                                                                    v14[0] = var8_6;
                                                                    v15 = new Object[2];
                                                                    v15[1] = m44.a("m", (Object)v14, (long)1534484738370157520L, (long)var4_1);
                                                                    v15[0] = var6_5;
                                                                    v7 = m44.a("m", (Object)v15, (long)1126286827743339328L, (long)var4_1);
                                                                }
                                                                catch (IllegalArgumentException v16) {
                                                                    throw m44.a("m", (Object)v16, (long)1080368567659763485L, (long)var4_1);
                                                                }
                                                            }
                                                            var20_16 = v7;
                                                            try {
                                                                v17 = var20_16;
                                                                v18 /* !! */  = var15_12;
                                                                if (var4_1 > 0L) {
                                                                    if (v18 /* !! */  == false) break block59;
                                                                    if (v17 == null) break block60;
                                                                }
                                                                ** GOTO lbl110
                                                            }
                                                            catch (IllegalArgumentException v19) {
                                                                throw m44.a("m", (Object)v19, (long)1080368567659763485L, (long)var4_1);
                                                            }
                                                            v17 = var20_16;
                                                        }
                                                        try {
                                                            v18 /* !! */  = (CallSite)26184;
lbl110:
                                                            // 2 sources

                                                            v20 = v17.equals(lqx.a("j", (int)v18 /* !! */ , (long)(4838403665114107994L ^ var4_1)));
                                                            if (var15_12 == false) break block61;
                                                            if (v20 == 0) break block60;
                                                        }
                                                        catch (IllegalArgumentException v21) {
                                                            throw m44.a("m", (Object)v21, (long)1080368567659763485L, (long)var4_1);
                                                        }
                                                        v20 = 1;
                                                        break block61;
                                                    }
                                                    v20 = 0;
                                                }
                                                var19_15 = v20;
                                                try {
                                                    block63: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v11 = var20_16;
                                                                                    if (var15_12 == false) break block57;
                                                                                    if (v11 == null) break block58;
                                                                                }
                                                                                catch (IllegalArgumentException v22) {
                                                                                    throw m44.a("m", (Object)v22, (long)1080368567659763485L, (long)var4_1);
                                                                                }
                                                                                v11 = var20_16;
                                                                                if (var15_12 == false) break block57;
                                                                            }
                                                                            catch (IllegalArgumentException v23) {
                                                                                throw m44.a("m", (Object)v23, (long)1080368567659763485L, (long)var4_1);
                                                                            }
                                                                            if (v11.length() <= 0) break block58;
                                                                        }
                                                                        catch (IllegalArgumentException v24) {
                                                                            throw m44.a("m", (Object)v24, (long)1080368567659763485L, (long)var4_1);
                                                                        }
                                                                        v25 = var18_14;
                                                                        if (var15_12 == false) break block62;
                                                                    }
                                                                    catch (IllegalArgumentException v26) {
                                                                        throw m44.a("m", (Object)v26, (long)1080368567659763485L, (long)var4_1);
                                                                    }
                                                                    if (var4_1 <= 0L) break block62;
                                                                    if (v25 == null) break block63;
                                                                }
                                                                catch (IllegalArgumentException v27) {
                                                                    throw m44.a("m", (Object)v27, (long)1080368567659763485L, (long)var4_1);
                                                                }
                                                                v11 = var18_14;
                                                                v28 = var15_12;
                                                                if (var4_1 >= 0L) {
                                                                    if (v28 == false) break block57;
                                                                }
                                                                ** GOTO lbl180
                                                            }
                                                            catch (IllegalArgumentException v29) {
                                                                throw m44.a("m", (Object)v29, (long)1080368567659763485L, (long)var4_1);
                                                            }
                                                            if (v11.length() != 0) break block58;
                                                        }
                                                        catch (IllegalArgumentException v30) {
                                                            throw m44.a("m", (Object)v30, (long)1080368567659763485L, (long)var4_1);
                                                        }
                                                    }
                                                    v25 = var20_16;
                                                }
                                                catch (IllegalArgumentException v31) {
                                                    throw m44.a("m", (Object)v31, (long)1080368567659763485L, (long)var4_1);
                                                }
                                            }
                                            var18_14 = v25;
                                        }
                                        v11 = var18_14;
                                    }
                                    try {
                                        if (var4_1 < 0L) break block64;
                                        v28 = var15_12;
lbl180:
                                        // 2 sources

                                        if (v28 == false) break block64;
                                        if (v11 == null) break block65;
                                    }
                                    catch (IllegalArgumentException v32) {
                                        throw m44.a("m", (Object)v32, (long)1080368567659763485L, (long)var4_1);
                                    }
                                    v11 = var18_14;
                                }
                                try {
                                    v33 = v11.length();
                                    if (var15_12 == false) break block66;
                                    if (v33 != 0) break block67;
                                }
                                catch (IllegalArgumentException v34) {
                                    throw m44.a("m", (Object)v34, (long)1080368567659763485L, (long)var4_1);
                                }
                            }
                            var17_13 = new BufferedReader(new InputStreamReader(var16_11));
                            break block70;
                        }
                        v33 = var19_15;
                    }
                    if (v33 != 0) {
                        v35 = new Object[5];
                        v35[4] = (int)((short)var12_9);
                        v35[3] = 3;
                        v35[2] = (int)((char)var11_8);
                        v35[1] = var16_11;
                        v35[0] = var10_7;
                        var20_16 = m44.a("m", (Object)v35, (long)1480874820259091510L, (long)var4_1);
                    }
                    var17_13 = new BufferedReader(new InputStreamReader((InputStream)var16_11, var18_14));
                }
                try {
                    v36 = var2_4;
                    if (var15_12 == false) break block68;
                    if (v36 == null) break block69;
                }
                catch (IllegalArgumentException v37) {
                    throw m44.a("m", (Object)v37, (long)1080368567659763485L, (long)var4_1);
                }
                v36 = var2_4;
            }
            v36.Z(var13_10, var18_14);
        }
        try {
            v38 = var17_13;
            if (var4_1 >= 0L && var15_12 == false) {
                m44.a("m", "VgZBrb", (long)1446286768586225041L, (long)var4_1);
            }
        }
        catch (IllegalArgumentException v39) {
            throw m44.a("m", (Object)v39, (long)1080368567659763485L, (long)var4_1);
        }
        return v38;
    }

    public static BufferedReader V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        InputStream inputStream = (InputStream)objectArray[1];
        long l11 = (l10 = b ^ l10) ^ 0x4228FB06EBBBL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = null;
        objectArray2[2] = null;
        objectArray2[1] = inputStream;
        objectArray2[0] = l11;
        return m44.a("l", (Object)objectArray2, (long)3530945738951055613L, (long)l10);
    }

    public static BufferedReader z(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = b ^ l10) ^ 0x2CCD88015A87L;
        Object var6_4 = null;
        String string2 = null;
        FileInputStream fileInputStream = new FileInputStream(string.trim());
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = var6_4;
        objectArray2[2] = string2;
        objectArray2[1] = fileInputStream;
        objectArray2[0] = l11;
        return m44.a("h", (Object)objectArray2, (long)-9206449915497223743L, (long)l10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean J(Object[] objectArray) {
        CallSite callSite;
        block13: {
            long l10 = (Long)objectArray[0];
            ZipFile zipFile = (ZipFile)objectArray[1];
            ZipEntry zipEntry = (ZipEntry)objectArray[2];
            long l11 = (l10 = b ^ l10) ^ 0x46C97F1096BAL;
            CallSite callSite2 = null;
            CallSite callSite3 = m44.a("l", (long)8359871926286939196L, (long)l10);
            try {
                callSite2 = m44.a("s", (Object)zipFile, (Object)zipEntry, (long)8563953859860976401L, (long)l10);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l11;
                objectArray2[0] = callSite2;
                callSite = m44.a("l", (Object)objectArray2, (long)8517205847701558877L, (long)l10);
            }
            catch (Throwable throwable) {
                block15: {
                    try {
                        CallSite callSite4;
                        block14: {
                            try {
                                callSite4 = callSite2;
                                if (callSite3 != false) break block14;
                                if (callSite4 == null) break block15;
                            }
                            catch (nn nn2) {
                                throw m44.a("l", (Object)nn2, (long)7633407103985774604L, (long)l10);
                            }
                            callSite4 = callSite2;
                        }
                        m44.a("s", (Object)callSite4, (long)7869611989791427478L, (long)l10);
                    }
                    catch (nn nn3) {
                        throw nn3;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
            try {
                CallSite callSite5;
                block12: {
                    try {
                        callSite5 = callSite2;
                        if (callSite3 != false) break block12;
                        if (callSite5 == null) break block13;
                    }
                    catch (nn nn4) {
                        throw m44.a("l", (Object)nn4, (long)7633407103985774604L, (long)l10);
                    }
                    callSite5 = callSite2;
                }
                m44.a("s", (Object)callSite5, (long)7869611989791427478L, (long)l10);
            }
            catch (nn nn5) {
                throw nn5;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return (boolean)callSite;
    }

    public static boolean R(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                String string = (String)objectArray[0];
                long l10 = (Long)objectArray[1];
                l10 = b ^ l10;
                CallSite callSite = m44.a("m", (long)2615906797004437405L, (long)l10);
                try {
                    try {
                        bl2 = string.indexOf("*");
                        if (callSite == false) break block4;
                        if (bl2 <= -1 != 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)4505379659942831973L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)4505379659942831973L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static String Z(Object[] objectArray) {
        String string;
        block14: {
            CallSite callSite;
            Object object;
            String string2;
            String string3;
            block18: {
                long l10;
                block16: {
                    int n10;
                    block17: {
                        block15: {
                            block19: {
                                string3 = (String)objectArray[0];
                                l10 = (Long)objectArray[1];
                                l10 = b ^ l10;
                                string3 = string3.trim();
                                CallSite callSite2 = m44.a("o", (long)8842730383736957287L, (long)l10);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            string = string3;
                                                            if (callSite2 == false) break block14;
                                                            if (string.length() <= 1) break block15;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw m44.a("o", (Object)illegalArgumentException, (long)6952559328765344159L, (long)l10);
                                                        }
                                                        string2 = string3;
                                                        object = '\u0000';
                                                        if (callSite2 == false) break block16;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw m44.a("o", (Object)illegalArgumentException, (long)6952559328765344159L, (long)l10);
                                                    }
                                                    if (l10 < 0L) break block17;
                                                    if (m44.a("o", (char)string2.charAt((int)object), (long)8756173028416881757L, (long)l10) == false) break block15;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("o", (Object)illegalArgumentException, (long)6952559328765344159L, (long)l10);
                                                }
                                                string2 = string3;
                                                object = 1;
                                                callSite = callSite2;
                                                if (l10 <= 0L) break block18;
                                                if (callSite == false) break block16;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("o", (Object)illegalArgumentException, (long)6952559328765344159L, (long)l10);
                                            }
                                            if (l10 < 0L) break block17;
                                            if (string2.charAt((int)object) != lqx.b("k", (int)13199, (long)(0x7B383C1337C8C623L ^ l10))) break block15;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("o", (Object)illegalArgumentException, (long)6952559328765344159L, (long)l10);
                                        }
                                        if (m44.a("k", (long)7273918783037247711L, (long)l10) != lqx.b("k", (int)30506, (long)(0x59FFB2708F5E8297L ^ l10))) break block19;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("o", (Object)illegalArgumentException, (long)6952559328765344159L, (long)l10);
                                    }
                                    return string3.replace((char)lqx.b("k", (int)16431, (long)(0x358DDD52F541B580L ^ l10)), (char)m44.a("k", (long)7273918783037247711L, (long)l10));
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("o", (Object)illegalArgumentException, (long)6952559328765344159L, (long)l10);
                                }
                            }
                            return string3;
                        }
                        string2 = string3 = string3.replace((char)lqx.b("k", (int)3155, (long)(0xE2FBA344DDFF9E4L ^ l10)), (char)m44.a("k", (long)7273918783037247711L, (long)l10));
                        n10 = 16431;
                    }
                    object = lqx.b("k", (int)n10, (long)(0x358DDD52F541B580L ^ l10));
                }
                callSite = m44.a("k", (long)7273918783037247711L, (long)l10);
            }
            string = string3 = string2.replace((char)object, (char)callSite);
        }
        return string;
    }

    /*
     * Exception decompiling
     */
    private static String t(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l11 = (l10 = b ^ l10) ^ 0x78A58B7BD373L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = null;
        objectArray2[3] = null;
        objectArray2[2] = string2;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        m44.a("k", (Object)objectArray2, (long)2424286251677058894L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int w(Object[] var0) {
        var1_1 = (InputStream)var0[0];
        var4_2 = (byte[])var0[1];
        var2_3 = (Long)var0[2];
        var2_3 = lqx.b ^ var2_3;
        var6_4 = 0;
        var5_5 = m44.a("m", (long)7785913454309534773L, (long)var2_3);
        block4: while (true) {
            if ((var7_6 = m44.a("r", (Object)var1_1, (Object)var4_2, (int)var6_4, (int)(var4_2.length - var6_4), (long)7758469185338185433L, (long)var2_3)) == -1) ** GOTO lbl13
            v0 /* !! */  = var6_4 = var6_4 + var7_6;
            while (true) {
                block9: {
                    block8: {
                        if (var5_5 == false) ** GOTO lbl26
lbl13:
                        // 2 sources

                        try {
                            v0 /* !! */  = var6_4;
lbl15:
                            // 2 sources

                            while (true) {
                                if (var5_5 != false) continue;
                                if (v0 /* !! */  != 0) break block8;
                                break;
                            }
                        }
                        catch (IllegalArgumentException v1) {
                            throw m44.a("m", (Object)v1, (long)8207365436310415365L, (long)var2_3);
                        }
                        var6_4 = -1;
                        try {
                            v0 /* !! */  = (int)var5_5;
                            if (var2_3 <= 0L) break block9;
                            if (v0 /* !! */  == 0) break block8;
lbl26:
                            // 2 sources

                            if (var6_4 < var4_2.length) continue block4;
                            if (var2_3 <= 0L) continue;
                        }
                        catch (IllegalArgumentException v2) {
                            throw m44.a("m", (Object)v2, (long)8207365436310415365L, (long)var2_3);
                        }
                    }
                    v0 /* !! */  = var6_4;
                }
                if (var5_5 == false) break block4;
            }
            break;
        }
        ** while (var2_3 <= 0L)
lbl37:
        // 1 sources

        return v0 /* !! */ ;
    }

    public static List h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("k", (long)-3631280078566338408L, (long)l10);
    }

    private static boolean H(Object[] objectArray) {
        Object object;
        block19: {
            block20: {
                int n10;
                block21: {
                    block22: {
                        InputStream inputStream = (InputStream)objectArray[0];
                        long l10 = (Long)objectArray[1];
                        long l11 = (l10 = b ^ l10) ^ 0x661309AA01F9L;
                        int n11 = (int)(l11 >>> 32);
                        int n12 = (int)(l11 << 32 >>> 48);
                        int n13 = (int)(l11 << 48 >>> 48);
                        CallSite callSite = m44.a("l", (long)3203216817686948940L, (long)l10);
                        try {
                            object = m44.a("s", (Object)inputStream, (long)3644204729756504986L, (long)l10);
                            if (callSite != false) break block19;
                            if (object < 4) break block20;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)3575691877386397820L, (long)l10);
                        }
                        Object[] objectArray2 = new Object[5];
                        objectArray2[4] = (int)((short)n13);
                        objectArray2[3] = 4;
                        objectArray2[2] = (int)((char)n12);
                        objectArray2[1] = inputStream;
                        objectArray2[0] = n11;
                        CallSite callSite2 = m44.a("l", (Object)objectArray2, (long)3164986415358094167L, (long)l10);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        n10 = callSite2[0] & lqx.b("k", (int)18260, (long)(0x7CEC548E900AE31AL ^ l10));
                                                        CallSite callSite3 = callSite;
                                                        if (l10 > 0L) {
                                                            if (callSite3 != false) break block21;
                                                            callSite3 = lqx.b("k", (int)11857, (long)(0x197362B39AA80A03L ^ l10));
                                                        }
                                                        if (n10 != callSite3) break block22;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw m44.a("l", (Object)illegalArgumentException, (long)3575691877386397820L, (long)l10);
                                                    }
                                                    n10 = callSite2[1] & lqx.b("k", (int)22908, (long)(0x660FCB788013FD24L ^ l10));
                                                    if (callSite != false) break block21;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("l", (Object)illegalArgumentException, (long)3575691877386397820L, (long)l10);
                                                }
                                                if (n10 != lqx.b("k", (int)6803, (long)(0x70FB15153CCB3EC5L ^ l10))) break block22;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("l", (Object)illegalArgumentException, (long)3575691877386397820L, (long)l10);
                                            }
                                            n10 = callSite2[2] & lqx.b("k", (int)22908, (long)(0x660FCB788013FD24L ^ l10));
                                            if (callSite != false) break block21;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("l", (Object)illegalArgumentException, (long)3575691877386397820L, (long)l10);
                                        }
                                        if (n10 != 3) break block22;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("l", (Object)illegalArgumentException, (long)3575691877386397820L, (long)l10);
                                    }
                                    n10 = callSite2[3] & lqx.b("k", (int)22908, (long)(0x660FCB788013FD24L ^ l10));
                                    if (callSite != false) break block21;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)3575691877386397820L, (long)l10);
                                }
                                if (n10 != 4) break block22;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)3575691877386397820L, (long)l10);
                            }
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)3575691877386397820L, (long)l10);
                        }
                    }
                    n10 = 0;
                }
                return n10 != 0;
            }
            object = false;
        }
        return (boolean)object;
    }

    public static String O(ZipFile zipFile, long l10, ZipEntry zipEntry) {
        l10 = b ^ l10;
        return (String)((Object)m44.a("q", (Object)zipFile, (long)8879855835469730360L, (long)l10)) + "!" + zipEntry.getName();
    }

    public static BufferedReader b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        File file = (File)objectArray[1];
        long l11 = (l10 = b ^ l10) ^ 0x40A7CDE3C0B2L;
        Object var6_4 = null;
        String string = null;
        FileInputStream fileInputStream = new FileInputStream(file);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = var6_4;
        objectArray2[2] = string;
        objectArray2[1] = fileInputStream;
        objectArray2[0] = l11;
        return m44.a("m", (Object)objectArray2, (long)1876157155791238132L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String N(Object[] var0) {
        block55: {
            block54: {
                block49: {
                    block50: {
                        block52: {
                            block53: {
                                block51: {
                                    block48: {
                                        block47: {
                                            block42: {
                                                block43: {
                                                    block45: {
                                                        block46: {
                                                            block44: {
                                                                var1_1 = (String)var0[0];
                                                                var2_2 = (Long)var0[1];
                                                                var2_2 = lqx.b ^ var2_2;
                                                                var4_3 = m44.a("j", (long)6278649605311289114L, (long)var2_2);
                                                                try {
                                                                    v0 = var1_1.length();
                                                                    v1 = 1;
                                                                    if (var4_3 != false) break block42;
                                                                    if (v0 <= v1) break block43;
                                                                }
                                                                catch (IllegalArgumentException v2) {
                                                                    throw m44.a("j", (Object)v2, (long)5388920775940887338L, (long)var2_2);
                                                                }
                                                                var5_4 = var1_1.charAt(var1_1.length() - 1);
                                                                try {
                                                                    try {
                                                                        v0 = var5_4;
                                                                        v3 /* !! */  = (CallSite)m44.a("n", (long)5293025368686382619L, (long)var2_2).charAt(0);
                                                                        v4 = var4_3;
                                                                        if (var2_2 > 0L) {
                                                                            if (v4 != false) break block44;
                                                                            if (v0 == v3 /* !! */ ) break block45;
                                                                        }
                                                                        ** GOTO lbl36
                                                                    }
                                                                    catch (IllegalArgumentException v5) {
                                                                        throw m44.a("j", (Object)v5, (long)5388920775940887338L, (long)var2_2);
                                                                    }
                                                                    v0 = var5_4;
                                                                    v3 /* !! */  = (CallSite)"/".charAt(0);
                                                                }
                                                                catch (IllegalArgumentException v6) {
                                                                    throw m44.a("j", (Object)v6, (long)5388920775940887338L, (long)var2_2);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    v4 = var4_3;
lbl36:
                                                                    // 2 sources

                                                                    if (var2_2 > 0L) {
                                                                        if (v4 != false) break block46;
                                                                        if (v0 == v3 /* !! */ ) break block45;
                                                                    }
                                                                    ** GOTO lbl51
                                                                }
                                                                catch (IllegalArgumentException v7) {
                                                                    throw m44.a("j", (Object)v7, (long)5388920775940887338L, (long)var2_2);
                                                                }
                                                                v0 = var5_4;
                                                                v3 /* !! */  = (CallSite)"\\".charAt(0);
                                                            }
                                                            catch (IllegalArgumentException v8) {
                                                                throw m44.a("j", (Object)v8, (long)5388920775940887338L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            v4 = var4_3;
lbl51:
                                                            // 2 sources

                                                            if (v4 != false) break block47;
                                                            if (v0 != v3 /* !! */ ) break block43;
                                                        }
                                                        catch (IllegalArgumentException v9) {
                                                            throw m44.a("j", (Object)v9, (long)5388920775940887338L, (long)var2_2);
                                                        }
                                                    }
                                                    var1_1 = var1_1.substring(0, var1_1.length() - 1);
                                                }
                                                v10 = var1_1.lastIndexOf((String)m44.a("n", (long)5293025368686382619L, (long)var2_2));
                                                v1 = v10;
                                                v0 = v10;
                                            }
                                            var5_4 = v1;
                                            try {
                                                v3 /* !! */  = var4_3;
                                                if (var2_2 < 0L) break block47;
                                                if (v3 /* !! */  != false) break block48;
                                                v3 /* !! */  = (CallSite)-1;
                                            }
                                            catch (IllegalArgumentException v11) {
                                                throw m44.a("j", (Object)v11, (long)5388920775940887338L, (long)var2_2);
                                            }
                                        }
                                        if (v0 > v3 /* !! */ ) ** GOTO lbl95
                                        v0 = var5_4 = var1_1.lastIndexOf("/");
                                        try {
                                            v12 /* !! */  = var4_3;
                                            if (var2_2 < 0L) ** GOTO lbl104
                                            if (v12 /* !! */  != false) break block48;
                                            if (v0 <= -1) {
                                            }
                                            ** GOTO lbl95
                                        }
                                        catch (IllegalArgumentException v13) {
                                            throw m44.a("j", (Object)v13, (long)5388920775940887338L, (long)var2_2);
                                        }
                                        v14 = var5_4 = var1_1.lastIndexOf("\\");
                                        try {
                                            try {
                                                v15 /* !! */  = var4_3;
                                                if (var2_2 > 0L) {
                                                    if (v15 /* !! */  != false) break block49;
                                                    v15 /* !! */  = (CallSite)-1;
                                                }
                                                if (v14 <= v15 /* !! */ ) break block50;
                                            }
                                            catch (IllegalArgumentException v16) {
                                                throw m44.a("j", (Object)v16, (long)5388920775940887338L, (long)var2_2);
                                            }
lbl95:
                                            // 3 sources

                                            v0 = var5_4;
                                        }
                                        catch (IllegalArgumentException v17) {
                                            throw m44.a("j", (Object)v17, (long)5388920775940887338L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                v12 /* !! */  = var4_3;
lbl104:
                                                // 2 sources

                                                if (var2_2 > 0L) {
                                                    if (v12 /* !! */  != false) break block51;
                                                    if (v0 != 0) break block52;
                                                }
                                                ** GOTO lbl123
                                            }
                                            catch (IllegalArgumentException v18) {
                                                throw m44.a("j", (Object)v18, (long)5388920775940887338L, (long)var2_2);
                                            }
                                            v19 = var1_1;
                                            if (var4_3 != false) break block53;
                                        }
                                        catch (IllegalArgumentException v20) {
                                            throw m44.a("j", (Object)v20, (long)5388920775940887338L, (long)var2_2);
                                        }
                                        v0 = v19.length();
                                    }
                                    catch (IllegalArgumentException v21) {
                                        throw m44.a("j", (Object)v21, (long)5388920775940887338L, (long)var2_2);
                                    }
                                }
                                try {
                                    v12 /* !! */  = (CallSite)true;
lbl123:
                                    // 2 sources

                                    if (v0 == v12 /* !! */ ) {
                                        return null;
                                    }
                                }
                                catch (IllegalArgumentException v22) {
                                    throw m44.a("j", (Object)v22, (long)5388920775940887338L, (long)var2_2);
                                }
                                v19 = var1_1.substring(0, var5_4 + 1);
                            }
                            return v19;
                        }
                        return var1_1.substring(0, var5_4);
                    }
                    try {
                        v23 = var1_1;
                        if (var4_3 != false) break block54;
                        v14 = v23.length();
                    }
                    catch (IllegalArgumentException v24) {
                        throw m44.a("j", (Object)v24, (long)5388920775940887338L, (long)var2_2);
                    }
                }
                if (v14 <= 0) break block55;
                v23 = "";
            }
            return v23;
        }
        return null;
    }

    public static boolean Y(Object[] objectArray) {
        Object object;
        block15: {
            block16: {
                Object object2;
                block17: {
                    block18: {
                        Object object3;
                        CallSite callSite;
                        long l10;
                        String string;
                        block13: {
                            block14: {
                                string = (String)objectArray[0];
                                l10 = (Long)objectArray[1];
                                l10 = b ^ l10;
                                callSite = m44.a("o", (long)-7892792138734890417L, (long)l10);
                                try {
                                    try {
                                        object3 = m44.a("k", (long)-8284617515839517855L, (long)l10);
                                        if (callSite != false) break block13;
                                        if (object3 != false) break block14;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("o", (Object)illegalArgumentException, (long)-8098493343821851009L, (long)l10);
                                    }
                                    return false;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("o", (Object)illegalArgumentException, (long)-8098493343821851009L, (long)l10);
                                }
                            }
                            object3 = string.lastIndexOf((int)lqx.b("k", (int)12077, (long)(0x22160A4E780B3564L ^ l10)));
                        }
                        CallSite callSite2 = object3;
                        try {
                            object = callSite2;
                            Object object4 = callSite;
                            if (l10 >= 0L) {
                                if (object4 != false) break block15;
                                object4 = -1;
                            }
                            if (object <= object4) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("o", (Object)illegalArgumentException, (long)-8098493343821851009L, (long)l10);
                        }
                        String string2 = string.substring((int)callSite2, string.length());
                        try {
                            try {
                                try {
                                    object2 = m44.a("p", string2, (Object)lqx.a("j", (int)20754, (long)(0x383B8D55D7AAA646L ^ l10)), (long)-8550384443288607158L, (long)l10);
                                    if (callSite != false) break block17;
                                    if (object2 != false) break block18;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("o", (Object)illegalArgumentException, (long)-8098493343821851009L, (long)l10);
                                }
                                object = m44.a("p", string2, (Object)lqx.a("j", (int)6384, (long)(0x4BE926D94963EFB9L ^ l10)), (long)-8550384443288607158L, (long)l10);
                                if (callSite != false) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("o", (Object)illegalArgumentException, (long)-8098493343821851009L, (long)l10);
                            }
                            if (object == false) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("o", (Object)illegalArgumentException, (long)-8098493343821851009L, (long)l10);
                        }
                    }
                    object2 = true;
                }
                return (boolean)object2;
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void b(Object[] var0) {
        var5_1 = (File)var0[0];
        var3_2 = (String)var0[1];
        var4_3 = (List)var0[2];
        var1_4 = (Long)var0[3];
        v0 = var1_4 = lqx.b ^ var1_4;
        var6_5 = v0 ^ 106967868559050L;
        var8_6 = v0 ^ 24755655838434L;
        var11_7 = m44.a("v", (Object)var5_1, (long)-4563984706922889955L, (long)var1_4);
        var10_8 = m44.a("i", (long)-2863923532119844743L, (long)var1_4);
        var12_9 = var11_7;
        var13_10 = ((CallSite)var12_9).length;
        var14_11 = 0;
        while (var14_11 < var13_10) {
            block16: {
                block17: {
                    block18: {
                        block19: {
                            block14: {
                                var15_12 = var12_9[var14_11];
                                try {
                                    block15: {
                                        try {
                                            try {
                                                v1 = var15_12;
                                                if (var10_8 != false) break block14;
                                                if (m44.a("v", (Object)v1, (long)-4210486505144512789L, (long)var1_4) == false) break block15;
                                            }
                                            catch (IllegalArgumentException v2) {
                                                throw m44.a("i", (Object)v2, (long)-4203484833625056183L, (long)var1_4);
                                            }
                                            v3 = new Object[4];
                                            v3[3] = var6_5;
                                            v3[2] = var4_3;
                                            v3[1] = var3_2;
                                            v3[0] = var15_12;
                                            m44.a("i", (Object)v3, (long)-4483482570863945717L, (long)var1_4);
                                            v4 = var10_8;
                                            if (var1_4 < 0L) break block16;
                                            if (v4 == false) break block17;
                                        }
                                        catch (IllegalArgumentException v5) {
                                            throw m44.a("i", (Object)v5, (long)-4203484833625056183L, (long)var1_4);
                                        }
                                    }
                                    v1 = var15_12;
                                }
                                catch (IllegalArgumentException v6) {
                                    throw m44.a("i", (Object)v6, (long)-4203484833625056183L, (long)var1_4);
                                }
                            }
                            var16_13 = m44.a("v", (Object)v1, (long)-2314419663623376071L, (long)var1_4);
                            try {
                                v7 /* !! */  = m44.a("m", (long)-2329371855771136928L, (long)var1_4);
                                v8 = var10_8;
                                if (var1_4 > 0L) {
                                    if (v8 != false) break block18;
                                    if (v7 /* !! */  != false) break block19;
                                }
                                ** GOTO lbl63
                            }
                            catch (IllegalArgumentException v9) {
                                throw m44.a("i", (Object)v9, (long)-4203484833625056183L, (long)var1_4);
                            }
                            var16_13 = m44.a("v", (Object)var16_13, (long)-4180103183002719586L, (long)var1_4);
                        }
                        v7 /* !! */  = (CallSite)mn.R((String)var16_13, var8_6, var3_2);
                    }
                    try {
                        try {
                            v8 = var10_8;
lbl63:
                            // 2 sources

                            if (v8 != false || v7 /* !! */  == false) break block17;
                        }
                        catch (IllegalArgumentException v10) {
                            throw m44.a("i", (Object)v10, (long)-4203484833625056183L, (long)var1_4);
                        }
                        v7 /* !! */  = (CallSite)var4_3.add(m44.a("v", (Object)var15_12, (long)-2823123385462807127L, (long)var1_4));
                    }
                    catch (IllegalArgumentException v11) {
                        throw m44.a("i", (Object)v11, (long)-4203484833625056183L, (long)var1_4);
                    }
                }
                ++var14_11;
                v4 = var10_8;
            }
            if (v4 == false) continue;
        }
    }

    public static byte[] g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        PushbackInputStream pushbackInputStream = (PushbackInputStream)objectArray[1];
        int n10 = (Integer)objectArray[2];
        long l11 = (l10 = b ^ l10) ^ 0x3DEB68CC9017L;
        CallSite callSite = m44.a("h", (long)3661500898989814504L, (long)l10);
        try {
            byte[] byArray;
            block4: {
                Object object;
                block5: {
                    byArray = new byte[n10];
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = l11;
                    objectArray2[1] = byArray;
                    objectArray2[0] = pushbackInputStream;
                    object = m44.a("h", (Object)objectArray2, (long)3173596828362835792L, (long)l10);
                    try {
                        if (callSite != false) break block4;
                        if (object != -1) break block5;
                    }
                    catch (IOException iOException) {
                        throw m44.a("h", (Object)iOException, (long)3403375254873814744L, (long)l10);
                    }
                    object = false;
                }
                m44.a("w", (Object)pushbackInputStream, (Object)byArray, (int)0, (int)object, (long)3009930862977106519L, (long)l10);
            }
            return byArray;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static File N(Object[] objectArray) {
        File file;
        block15: {
            PrintWriter printWriter;
            long l10;
            block10: {
                l10 = (Long)objectArray[0];
                String string = (String)objectArray[1];
                file = (File)objectArray[2];
                sz sz2 = (sz)objectArray[3];
                long l11 = (l10 = b ^ l10) ^ 0x64BE127B3126L;
                PrintWriter printWriter2 = null;
                CallSite callSite = m44.a("l", (long)8096483176029876324L, (long)l10);
                try {
                    printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(file)));
                    printWriter2.println(string);
                    m44.a("s", (Object)printWriter2, (long)8295958087590494156L, (long)l10);
                    printWriter = printWriter2;
                    if (callSite != false) break block10;
                }
                catch (IOException iOException) {
                    File file2;
                    block12: {
                        PrintWriter printWriter3;
                        block11: {
                            try {
                                sz2.Z(l11, m44.a("s", (Object)iOException, (long)7542075771076544570L, (long)l10));
                                file2 = null;
                            }
                            catch (Throwable throwable) {
                                block14: {
                                    PrintWriter printWriter4;
                                    block13: {
                                        try {
                                            printWriter4 = printWriter2;
                                            if (callSite != false) break block13;
                                            if (printWriter4 == null) break block14;
                                        }
                                        catch (IOException iOException2) {
                                            throw m44.a("l", (Object)iOException2, (long)7905797450650874964L, (long)l10);
                                        }
                                        printWriter4 = printWriter2;
                                    }
                                    m44.a("s", printWriter4, (long)8429033317471176334L, (long)l10);
                                }
                                throw throwable;
                            }
                            try {
                                printWriter3 = printWriter2;
                                if (callSite != false) break block11;
                                if (printWriter3 == null) break block12;
                            }
                            catch (IOException iOException3) {
                                throw m44.a("l", (Object)iOException3, (long)7905797450650874964L, (long)l10);
                            }
                            printWriter3 = printWriter2;
                        }
                        m44.a("s", (Object)printWriter3, (long)8429033317471176334L, (long)l10);
                    }
                    return file2;
                }
                if (printWriter == null) break block15;
                printWriter = printWriter2;
            }
            m44.a("s", (Object)printWriter, (long)8429033317471176334L, (long)l10);
        }
        return file;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static File H(Object[] var0) {
        block18: {
            var2_1 = (Long)var0[0];
            var1_2 = (BufferedInputStream)var0[1];
            var4_3 = (String)var0[2];
            var5_4 = (var2_1 = lqx.b ^ var2_1) ^ 71264932356046L;
            v0 = new Object[2];
            v0[1] = var4_3;
            v0[0] = var5_4;
            var8_5 = m44.a("i", (Object)v0, (long)251849383490654357L, (long)var2_1);
            var9_6 = null;
            var7_7 = m44.a("i", (long)2117125047096282801L, (long)var2_1);
            try {
                var9_6 = new BufferedOutputStream(new FileOutputStream((File)var8_5));
                var10_8 = m44.a("v", (Object)var1_2, (long)2095166235630013243L, (long)var2_1);
                var11_10 = new byte[lqx.b("k", (int)28587, (long)(519813247800868301L ^ var2_1))];
                var12_11 = false;
                var13_12 = 0;
                block12: while ((var12_11 = m44.a("v", (Object)var1_2, (Object)var11_10, (long)372295540891356287L, (long)var2_1)) != -1) {
                    var13_12 += var12_11;
                    try {
                        m44.a("v", (Object)var9_6, (Object)var11_10, (int)0, (int)var12_11, (long)545711642007640593L, (long)var2_1);
                        do {
                            v1 = var7_7;
                            if (var2_1 > 0L) {
                                if (v1 == false) break block18;
                                v1 = var7_7;
                            }
                            if (v1 != false) continue block12;
                        } while (var2_1 <= 0L);
                        ** break;
                    }
                    catch (IOException v2) {
                        throw m44.a("i", (Object)v2, (long)552334933168922185L, (long)var2_1);
                    }
                }
            }
            catch (Throwable var14_13) {
                block19: {
                    try {
                        if (var2_1 <= 0L) break block19;
                        v3 = var9_6;
                        if (var7_7 != false) {
                            if (v3 == null) break block19;
                        }
                        ** GOTO lbl46
                    }
                    catch (IOException v4) {
                        throw m44.a("i", (Object)v4, (long)552334933168922185L, (long)var2_1);
                    }
                    try {
                        v3 = var9_6;
lbl46:
                        // 2 sources

                        m44.a("v", (Object)v3, (long)465917990325954004L, (long)var2_1);
                    }
                    catch (IOException var15_14) {
                        // empty catch block
                    }
                }
                throw var14_13;
            }
lbl52:
            // 2 sources

            try {
                if (var2_1 < 0L) break block18;
                v5 = var9_6;
                if (var7_7 != false) {
                    if (v5 == null) break block18;
                }
                ** GOTO lbl63
            }
            catch (IOException v6) {
                throw m44.a("i", (Object)v6, (long)552334933168922185L, (long)var2_1);
            }
            try {
                v5 = var9_6;
lbl63:
                // 2 sources

                m44.a("v", (Object)v5, (long)465917990325954004L, (long)var2_1);
            }
            catch (IOException var10_9) {}
        }
        return var8_5;
    }

    public static BufferedReader Q(Object[] objectArray) {
        File file = (File)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string = (String)objectArray[2];
        long l11 = (l10 = b ^ l10) ^ 0x262BA533570AL;
        Object var7_5 = null;
        String string2 = string;
        FileInputStream fileInputStream = new FileInputStream(file);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = var7_5;
        objectArray2[2] = string2;
        objectArray2[1] = fileInputStream;
        objectArray2[0] = l11;
        return m44.a("m", (Object)objectArray2, (long)-8236779762460203956L, (long)l10);
    }

    public static String P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        byte[] byArray = (byte[])objectArray[1];
        long l11 = (l10 = b ^ l10) ^ 0x7EF6341E427CL;
        lb6 lb62 = new lb6();
        lb6 lb63 = new lb6();
        lb6 lb64 = new lb6();
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = lb62;
        objectArray2[3] = lb63;
        objectArray2[2] = lb64;
        objectArray2[1] = l11;
        objectArray2[0] = byArray;
        return m44.a("l", (Object)objectArray2, (long)7851759739304660155L, (long)l10);
    }

    public static boolean q(Object[] objectArray) {
        Object object;
        block13: {
            block14: {
                Object object2;
                CallSite callSite;
                long l10;
                String string;
                block11: {
                    block12: {
                        string = (String)objectArray[0];
                        l10 = (Long)objectArray[1];
                        l10 = b ^ l10;
                        callSite = m44.a("i", (long)6422415823965968665L, (long)l10);
                        try {
                            try {
                                object2 = m44.a("m", (long)6625855359471100647L, (long)l10);
                                if (callSite != false) break block11;
                                if (object2 != false) break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("i", (Object)illegalArgumentException, (long)4956903266844859689L, (long)l10);
                            }
                            return false;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("i", (Object)illegalArgumentException, (long)4956903266844859689L, (long)l10);
                        }
                    }
                    object2 = string.lastIndexOf((int)lqx.b("k", (int)26591, (long)(0x771FA9E5280A36D1L ^ l10)));
                }
                CallSite callSite2 = object2;
                try {
                    object = callSite2;
                    Object object3 = callSite;
                    if (l10 >= 0L) {
                        if (object3 != false) break block13;
                        object3 = -1;
                    }
                    if (object <= object3) break block14;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)4956903266844859689L, (long)l10);
                }
                String string2 = string.substring((int)callSite2, string.length());
                try {
                    try {
                        object = m44.a("v", string2, (Object)lqx.a("j", (int)32144, (long)(0x383F6FBF6C75C1A1L ^ l10)), (long)4756017615193861404L, (long)l10);
                        if (callSite != false) break block13;
                        if (object == false) break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)4956903266844859689L, (long)l10);
                    }
                    return true;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)4956903266844859689L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public static String X(Object[] objectArray) {
        File file = (File)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string = (String)objectArray[2];
        long l11 = (l10 = b ^ l10) ^ 0x6F624508F518L;
        FileInputStream fileInputStream = new FileInputStream(file);
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = null;
        objectArray2[3] = l11;
        objectArray2[2] = (long)(m44.a("p", (Object)fileInputStream, (long)-37734889424970127L, (long)l10) + lqx.b("k", (int)11620, (long)(0x757A7DF0621B44D2L ^ l10)));
        objectArray2[1] = string;
        objectArray2[0] = fileInputStream;
        return m44.a("o", (Object)objectArray2, (long)-2155708562135263687L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String J(Object[] var0) {
        block61: {
            block65: {
                block59: {
                    block60: {
                        block62: {
                            block63: {
                                block64: {
                                    block53: {
                                        block57: {
                                            block58: {
                                                block56: {
                                                    block55: {
                                                        block54: {
                                                            block51: {
                                                                block52: {
                                                                    block50: {
                                                                        var3_1 = (String)var0[0];
                                                                        var1_2 = (Long)var0[1];
                                                                        var4_3 = (File)var0[2];
                                                                        var1_2 = lqx.b ^ var1_2;
                                                                        var5_4 = m44.a("j", (long)-7304266905037366630L, (long)var1_2);
                                                                        try {
                                                                            if (var3_1 == null) {
                                                                                return null;
                                                                            }
                                                                        }
                                                                        catch (IllegalArgumentException v0) {
                                                                            throw m44.a("j", (Object)v0, (long)-8698294095035031894L, (long)var1_2);
                                                                        }
                                                                        try {
                                                                            v1 = var4_3;
                                                                            if (var5_4 != false) break block50;
                                                                            if (v1 == null) {
                                                                            }
                                                                            ** GOTO lbl26
                                                                        }
                                                                        catch (IllegalArgumentException v2) {
                                                                            throw m44.a("j", (Object)v2, (long)-8698294095035031894L, (long)var1_2);
                                                                        }
                                                                        var6_5 = m44.a("n", (long)-7032237502431642306L, (long)var1_2);
                                                                        var4_3 = m44.a("n", (long)-8728640740909657077L, (long)var1_2);
                                                                        try {
                                                                            if (var1_2 < 0L) break block51;
                                                                            if (var5_4 == false) break block52;
lbl26:
                                                                            // 2 sources

                                                                            v1 = var4_3;
                                                                        }
                                                                        catch (IllegalArgumentException v3) {
                                                                            throw m44.a("j", (Object)v3, (long)-8698294095035031894L, (long)var1_2);
                                                                        }
                                                                    }
                                                                    var6_5 = m44.a("u", (Object)v1, (long)-7336069713406826678L, (long)var1_2);
                                                                }
                                                                var3_1 = var3_1.trim();
                                                            }
                                                            var7_6 = new StringBuilder();
                                                            try {
                                                                v4 = var3_1.startsWith((String)lqx.a("j", (int)20639, (long)(1282200481288630056L ^ var1_2)) + (char)m44.a("n", (long)-7242551165366193159L, (long)var1_2));
                                                                if (var1_2 <= 0L || var5_4 != false) break block53;
                                                                if (v4) {
                                                                }
                                                                ** GOTO lbl114
                                                            }
                                                            catch (IllegalArgumentException v5) {
                                                                throw m44.a("j", (Object)v5, (long)-8698294095035031894L, (long)var1_2);
                                                            }
                                                            var8_7 = m44.a("u", (Object)var4_3, (long)-7180420332606644827L, (long)var1_2);
                                                            try {
                                                                try {
                                                                    v6 /* !! */  = var5_4;
                                                                    if (var1_2 <= 0L) ** GOTO lbl63
                                                                    if (v6 /* !! */  != false) break block54;
                                                                    if (var8_7 == null) {
                                                                    }
                                                                    ** GOTO lbl66
                                                                }
                                                                catch (IllegalArgumentException v7) {
                                                                    throw m44.a("j", (Object)v7, (long)-8698294095035031894L, (long)var1_2);
                                                                }
                                                                var7_6.append((String)var6_5);
                                                            }
                                                            catch (IllegalArgumentException v8) {
                                                                throw m44.a("j", (Object)v8, (long)-8698294095035031894L, (long)var1_2);
                                                            }
                                                        }
                                                        try {
                                                            v6 /* !! */  = var5_4;
lbl63:
                                                            // 2 sources

                                                            if (var1_2 > 0L) {
                                                                if (v6 /* !! */  == false) break block55;
                                                            }
                                                            ** GOTO lbl76
lbl66:
                                                            // 2 sources

                                                            var7_6.append((String)m44.a("u", (Object)var8_7, (long)-7336069713406826678L, (long)var1_2));
                                                        }
                                                        catch (IllegalArgumentException v9) {
                                                            throw m44.a("j", (Object)v9, (long)-8698294095035031894L, (long)var1_2);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                v6 /* !! */  = (CallSite)var3_1.length();
lbl76:
                                                                // 2 sources

                                                                v10 /* !! */  = 2;
                                                                if (var1_2 <= 0L || var5_4 != false) break block56;
                                                                if (v6 /* !! */  <= v10 /* !! */ ) break block57;
                                                            }
                                                            catch (IllegalArgumentException v11) {
                                                                throw m44.a("j", (Object)v11, (long)-8698294095035031894L, (long)var1_2);
                                                            }
                                                            v12 = var7_6;
                                                            if (var5_4 != false) break block57;
                                                        }
                                                        catch (IllegalArgumentException v13) {
                                                            throw m44.a("j", (Object)v13, (long)-8698294095035031894L, (long)var1_2);
                                                        }
                                                        v6 /* !! */  = m44.a("u", (Object)v12, (int)(var7_6.length() - 1), (long)-9055052559145029648L, (long)var1_2);
                                                        v10 /* !! */  = (int)m44.a("n", (long)-7242551165366193159L, (long)var1_2);
                                                    }
                                                    catch (IllegalArgumentException v14) {
                                                        throw m44.a("j", (Object)v14, (long)-8698294095035031894L, (long)var1_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var1_2 > 0L) {
                                                            if (v6 /* !! */  != v10 /* !! */ ) break block58;
                                                            v6 /* !! */  = (CallSite)var3_1.charAt(2);
                                                            v10 /* !! */  = (int)m44.a("n", (long)-7242551165366193159L, (long)var1_2);
                                                        }
                                                        if (v6 /* !! */  != v10 /* !! */ ) break block58;
                                                    }
                                                    catch (IllegalArgumentException v15) {
                                                        throw m44.a("j", (Object)v15, (long)-8698294095035031894L, (long)var1_2);
                                                    }
                                                    m44.a("u", (Object)var7_6, (int)(var7_6.length() - 1), (long)-7416947095275505219L, (long)var1_2);
                                                }
                                                catch (IllegalArgumentException v16) {
                                                    throw m44.a("j", (Object)v16, (long)-8698294095035031894L, (long)var1_2);
                                                }
                                            }
                                            v12 = var7_6.append(var3_1.substring(2));
                                        }
                                        try {
                                            try {
                                                if (var1_2 >= 0L && var5_4 == false) break block59;
lbl114:
                                                // 2 sources

                                                v17 = var3_1;
                                                if (var5_4 != false) break block60;
                                            }
                                            catch (IllegalArgumentException v18) {
                                                throw m44.a("j", (Object)v18, (long)-8698294095035031894L, (long)var1_2);
                                            }
                                            v4 = v17.startsWith("." + (char)m44.a("n", (long)-7242551165366193159L, (long)var1_2));
                                        }
                                        catch (IllegalArgumentException v19) {
                                            throw m44.a("j", (Object)v19, (long)-8698294095035031894L, (long)var1_2);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (v4) {
                                                                var7_6.append((String)var6_5);
                                                                v20 = var3_1;
                                                                if (var5_4 != false) break block61;
                                                            }
                                                            ** GOTO lbl170
                                                        }
                                                        catch (IllegalArgumentException v21) {
                                                            throw m44.a("j", (Object)v21, (long)-8698294095035031894L, (long)var1_2);
                                                        }
                                                        if (v20.length() <= 1) break block59;
                                                    }
                                                    catch (IllegalArgumentException v22) {
                                                        throw m44.a("j", (Object)v22, (long)-8698294095035031894L, (long)var1_2);
                                                    }
                                                    v23 = var7_6;
                                                    if (var1_2 < 0L || var5_4 != false) break block62;
                                                }
                                                catch (IllegalArgumentException v24) {
                                                    throw m44.a("j", (Object)v24, (long)-8698294095035031894L, (long)var1_2);
                                                }
                                                if (var1_2 <= 0L) break block63;
                                                if (m44.a("u", (Object)v23, (int)(var7_6.length() - 1), (long)-9055052559145029648L, (long)var1_2) != m44.a("n", (long)-7242551165366193159L, (long)var1_2)) break block64;
                                            }
                                            catch (IllegalArgumentException v25) {
                                                throw m44.a("j", (Object)v25, (long)-8698294095035031894L, (long)var1_2);
                                            }
                                            if (var3_1.charAt(1) != m44.a("n", (long)-7242551165366193159L, (long)var1_2)) break block64;
                                        }
                                        catch (IllegalArgumentException v26) {
                                            throw m44.a("j", (Object)v26, (long)-8698294095035031894L, (long)var1_2);
                                        }
                                        m44.a("u", (Object)var7_6, (int)(var7_6.length() - 1), (long)-7416947095275505219L, (long)var1_2);
                                    }
                                    catch (IllegalArgumentException v27) {
                                        throw m44.a("j", (Object)v27, (long)-8698294095035031894L, (long)var1_2);
                                    }
                                }
                                v28 = var7_6;
                            }
                            v23 = v28.append(var3_1.substring(1));
                        }
                        try {
                            if (var1_2 < 0L) break block65;
                            if (var5_4 == false) break block59;
lbl170:
                            // 2 sources

                            v17 = var3_1;
                        }
                        catch (IllegalArgumentException v29) {
                            throw m44.a("j", (Object)v29, (long)-8698294095035031894L, (long)var1_2);
                        }
                    }
                    return v17;
                }
                v23 = var7_6;
            }
            v20 = v23.toString();
        }
        return v20;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static File T(Object[] var0) {
        block12: {
            var2_1 = (Long)var0[0];
            var1_2 = (File)var0[1];
            var4_3 = (var2_1 = lqx.b ^ var2_1) ^ 67682302219886L;
            var7_4 = null;
            var6_5 = m44.a("m", (long)208679738613203677L, (long)var2_1);
            try {
                var7_4 = new BufferedInputStream(new FileInputStream(var1_2));
                v0 = new Object[3];
                v0[2] = m44.a("r", (Object)var1_2, (long)177449736870428429L, (long)var2_1);
                v0[1] = var7_4;
                v0[0] = var4_3;
                var8_6 = m44.a("m", (Object)v0, (long)287734382316211792L, (long)var2_1);
            }
            catch (Throwable var10_8) {
                block13: {
                    try {
                        if (var2_1 < 0L) break block13;
                        v1 = var7_4;
                        if (var6_5 == false) {
                            if (v1 == null) break block13;
                        }
                        ** GOTO lbl28
                    }
                    catch (IOException v2) {
                        throw m44.a("m", (Object)v2, (long)2237749660976973549L, (long)var2_1);
                    }
                    try {
                        v1 = var7_4;
lbl28:
                        // 2 sources

                        m44.a("r", (Object)v1, (long)359520572162532903L, (long)var2_1);
                    }
                    catch (IOException var11_9) {
                        // empty catch block
                    }
                }
                throw var10_8;
            }
            try {
                v3 = var7_4;
                if (var6_5 == false) {
                    if (v3 == null) break block12;
                }
                ** GOTO lbl44
            }
            catch (IOException v4) {
                throw m44.a("m", (Object)v4, (long)2237749660976973549L, (long)var2_1);
            }
            try {
                v3 = var7_4;
lbl44:
                // 2 sources

                m44.a("r", (Object)v3, (long)359520572162532903L, (long)var2_1);
            }
            catch (IOException var9_7) {
                // empty catch block
            }
        }
        return var8_6;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static File l(Object[] var0) {
        block12: {
            var4_1 = (ZipFile)var0[0];
            var1_2 = (ZipEntry)var0[1];
            var2_3 = (Long)var0[2];
            var5_4 = (var2_3 = lqx.b ^ var2_3) ^ 41786166224476L;
            var8_5 = null;
            var7_6 = m44.a("o", (long)-948154427950206225L, (long)var2_3);
            try {
                var8_5 = new BufferedInputStream((InputStream)m44.a("p", (Object)var4_1, (Object)var1_2, (long)-1150099048089332286L, (long)var2_3));
                v0 = new Object[3];
                v0[2] = (String)m44.a("p", (Object)var4_1, (long)-760288814387700623L, (long)var2_3) + "!" + var1_2.getName();
                v0[1] = var8_5;
                v0[0] = var5_4;
                var9_7 = m44.a("o", (Object)v0, (long)-879284486904005022L, (long)var2_3);
            }
            catch (Throwable var11_9) {
                block13: {
                    try {
                        if (var2_3 < 0L) break block13;
                        v1 = var8_5;
                        if (var7_6 == false) {
                            if (v1 == null) break block13;
                        }
                        ** GOTO lbl29
                    }
                    catch (IOException v2) {
                        throw m44.a("o", (Object)v2, (long)-1208074131044272417L, (long)var2_3);
                    }
                    try {
                        v1 = var8_5;
lbl29:
                        // 2 sources

                        m44.a("p", (Object)v1, (long)-806322996905142763L, (long)var2_3);
                    }
                    catch (IOException var12_10) {
                        // empty catch block
                    }
                }
                throw var11_9;
            }
            try {
                v3 = var8_5;
                if (var7_6 == false) {
                    if (v3 == null) break block12;
                }
                ** GOTO lbl45
            }
            catch (IOException v4) {
                throw m44.a("o", (Object)v4, (long)-1208074131044272417L, (long)var2_3);
            }
            try {
                v3 = var8_5;
lbl45:
                // 2 sources

                m44.a("p", (Object)v3, (long)-806322996905142763L, (long)var2_3);
            }
            catch (IOException var10_8) {
                // empty catch block
            }
        }
        return var9_7;
    }

    public static String r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        ZipFile zipFile = (ZipFile)objectArray[1];
        ZipEntry zipEntry = (ZipEntry)objectArray[2];
        String string = (String)objectArray[3];
        long l11 = (l10 = b ^ l10) ^ 0x2E8938F767EEL;
        CallSite callSite = m44.a("v", (Object)zipFile, (Object)zipEntry, (long)8193174136201696380L, (long)l10);
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = null;
        objectArray2[3] = l11;
        objectArray2[2] = (long)m44.a("v", (Object)zipEntry, (long)7927191976268727565L, (long)l10);
        objectArray2[1] = string;
        objectArray2[0] = callSite;
        return m44.a("i", (Object)objectArray2, (long)8134384455748371663L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public static String A(Object[] var0) {
        block12: {
            block13: {
                block11: {
                    block10: {
                        var5_1 = (String)var0[0];
                        var4_2 = (sz)var0[1];
                        var3_3 = (sz)var0[2];
                        var1_4 = (Long)var0[3];
                        var6_5 = (var1_4 = lqx.b ^ var1_4) ^ 43699589414737L;
                        var8_6 = m44.a("k", (long)-5112843053680088357L, (long)var1_4);
                        v0 = var9_7 = var5_1.lastIndexOf((String)m44.a("o", (long)-6882173654990117102L, (long)var1_4));
                        try {
                            try {
                                v1 = -1;
                                if (var8_6 == false) break block10;
                                if (v0 <= v1) {
                                }
                                ** GOTO lbl39
                            }
                            catch (IllegalArgumentException v2) {
                                throw m44.a("k", (Object)v2, (long)-6647229600919176669L, (long)var1_4);
                            }
                            v3 = var5_1;
                            if (var8_6 == false) break block11;
                        }
                        catch (IllegalArgumentException v4) {
                            throw m44.a("k", (Object)v4, (long)-6647229600919176669L, (long)var1_4);
                        }
                        v0 = var9_7 = v3.lastIndexOf("\\");
                        v1 = -1;
                    }
                    try {
                        if (v0 <= v1) {
                            v5 = var5_1;
                            if (var8_6 == false) break block12;
                        }
                        ** GOTO lbl39
                    }
                    catch (IllegalArgumentException v6) {
                        throw m44.a("k", (Object)v6, (long)-6647229600919176669L, (long)var1_4);
                    }
                    var9_7 = v5.lastIndexOf("/");
                    try {
                        if (var9_7 <= -1) break block13;
lbl39:
                        // 3 sources

                        var4_2.Z(var6_5, var5_1.substring(0, var9_7));
                        var3_3.Z(var6_5, var5_1.substring(var9_7 + 1));
                        v3 = var5_1.substring(var9_7, var9_7 + 1);
                    }
                    catch (IllegalArgumentException v7) {
                        throw m44.a("k", (Object)v7, (long)-6647229600919176669L, (long)var1_4);
                    }
                }
                return v3;
            }
            var4_2.Z(var6_5, "");
            var3_3.Z(var6_5, var5_1);
            v5 = "";
        }
        return v5;
    }

    /*
     * WARNING - void declaration
     */
    public static String y(Object[] objectArray) {
        Object object;
        long l10;
        block11: {
            StringBuilder stringBuilder;
            block9: {
                ZipEntry zipEntry;
                block10: {
                    ZipFile zipFile = (ZipFile)objectArray[0];
                    zipEntry = (ZipEntry)objectArray[1];
                    l10 = (Long)objectArray[2];
                    long l11 = (l10 = b ^ l10) ^ 0x1496D9647256L;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append((String)((Object)m44.a("t", (Object)zipFile, (long)-6255787966649892819L, (long)l10)));
                    File file = new File((String)((Object)m44.a("t", (Object)zipFile, (long)-6255787966649892819L, (long)l10)));
                    CallSite callSite = m44.a("k", (long)-5869480906706899277L, (long)l10);
                    try {
                        if (callSite != false) break block9;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = file;
                        if (m44.a("k", (Object)objectArray2, (long)-5510584099461414086L, (long)l10) == false) break block10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-5521379751147066749L, (long)l10);
                    }
                    CallSite callSite2 = m44.a("k", (Object)new Object[]{m44.a("t", (Object)file, (long)-5901854391682116765L, (long)l10)}, (long)-5962316569394909628L, (long)l10);
                    try {
                        try {
                            object = callSite2;
                            if (l10 <= 0L || callSite != false) break block11;
                            if (object == null) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)-5521379751147066749L, (long)l10);
                        }
                        stringBuilder.append((char)lqx.b("k", (int)17226, (long)(0x5B09CA741E76E5E0L ^ l10)));
                        stringBuilder.append((String)((Object)callSite2));
                        stringBuilder.append((char)lqx.b("k", (int)7072, (long)(0x37F3791A85693D0FL ^ l10)));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-5521379751147066749L, (long)l10);
                    }
                }
                stringBuilder.append("!");
                stringBuilder.append(zipEntry.getName());
            }
            object = stringBuilder.toString();
        }
        try {
            if (l10 > 0L && m44.a("k", (long)-5786504892114954613L, (long)l10) == null) {
                void var7_8;
                m44.a("k", (int)(++var7_8), (long)-5899437719933665168L, (long)l10);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("k", (Object)illegalArgumentException, (long)-5521379751147066749L, (long)l10);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean F(Object[] var0) {
        block42: {
            block43: {
                block46: {
                    block47: {
                        block44: {
                            block45: {
                                var1_1 = (Long)var0[0];
                                var3_2 = (String)var0[1];
                                var1_1 = lqx.b ^ var1_1;
                                var5_3 = var3_2.length();
                                var4_4 = m44.a("i", (long)7091210716869616209L, (long)var1_1);
                                try {
                                    v0 /* !! */  = var5_3;
                                    if (var4_4 != false) break block42;
                                    if (v0 /* !! */  <= 4) break block43;
                                }
                                catch (IllegalArgumentException v1) {
                                    throw m44.a("i", (Object)v1, (long)9188045807421548129L, (long)var1_1);
                                }
                                var6_5 = var3_2.substring(var5_3 - 4);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v2 /* !! */  = m44.a("v", var6_5, (Object)lqx.a("j", (int)1068, (long)(4736056795000472424L ^ var1_1)), (long)8739463139508311636L, (long)var1_1);
                                                                                            if (var4_4 != false) break block44;
                                                                                            if (v2 /* !! */  != false) break block45;
                                                                                        }
                                                                                        catch (IllegalArgumentException v3) {
                                                                                            throw m44.a("i", (Object)v3, (long)9188045807421548129L, (long)var1_1);
                                                                                        }
                                                                                        v2 /* !! */  = m44.a("v", var6_5, (Object)lqx.a("j", (int)9737, (long)(7846426669615260020L ^ var1_1)), (long)8739463139508311636L, (long)var1_1);
                                                                                        if (var4_4 != false) break block44;
                                                                                    }
                                                                                    catch (IllegalArgumentException v4) {
                                                                                        throw m44.a("i", (Object)v4, (long)9188045807421548129L, (long)var1_1);
                                                                                    }
                                                                                    if (v2 /* !! */  != false) break block45;
                                                                                }
                                                                                catch (IllegalArgumentException v5) {
                                                                                    throw m44.a("i", (Object)v5, (long)9188045807421548129L, (long)var1_1);
                                                                                }
                                                                                v2 /* !! */  = m44.a("v", var6_5, (Object)lqx.a("j", (int)24945, (long)(8447201917667960378L ^ var1_1)), (long)8739463139508311636L, (long)var1_1);
                                                                                if (var4_4 != false) break block44;
                                                                            }
                                                                            catch (IllegalArgumentException v6) {
                                                                                throw m44.a("i", (Object)v6, (long)9188045807421548129L, (long)var1_1);
                                                                            }
                                                                            if (v2 /* !! */  != false) break block45;
                                                                        }
                                                                        catch (IllegalArgumentException v7) {
                                                                            throw m44.a("i", (Object)v7, (long)9188045807421548129L, (long)var1_1);
                                                                        }
                                                                        v2 /* !! */  = m44.a("v", var6_5, (Object)lqx.a("j", (int)12132, (long)(1328639297219438635L ^ var1_1)), (long)8739463139508311636L, (long)var1_1);
                                                                        if (var4_4 != false) break block44;
                                                                    }
                                                                    catch (IllegalArgumentException v8) {
                                                                        throw m44.a("i", (Object)v8, (long)9188045807421548129L, (long)var1_1);
                                                                    }
                                                                    if (v2 /* !! */  != false) break block45;
                                                                }
                                                                catch (IllegalArgumentException v9) {
                                                                    throw m44.a("i", (Object)v9, (long)9188045807421548129L, (long)var1_1);
                                                                }
                                                                v2 /* !! */  = m44.a("v", var6_5, (Object)lqx.a("j", (int)24686, (long)(4154102587925129008L ^ var1_1)), (long)8739463139508311636L, (long)var1_1);
                                                                if (var4_4 != false) break block44;
                                                            }
                                                            catch (IllegalArgumentException v10) {
                                                                throw m44.a("i", (Object)v10, (long)9188045807421548129L, (long)var1_1);
                                                            }
                                                            if (v2 /* !! */  != false) break block45;
                                                        }
                                                        catch (IllegalArgumentException v11) {
                                                            throw m44.a("i", (Object)v11, (long)9188045807421548129L, (long)var1_1);
                                                        }
                                                        v2 /* !! */  = m44.a("v", var6_5, (Object)lqx.a("j", (int)10743, (long)(3620993151266893484L ^ var1_1)), (long)8739463139508311636L, (long)var1_1);
                                                        if (var4_4 != false) break block44;
                                                    }
                                                    catch (IllegalArgumentException v12) {
                                                        throw m44.a("i", (Object)v12, (long)9188045807421548129L, (long)var1_1);
                                                    }
                                                    if (v2 /* !! */  != false) break block45;
                                                }
                                                catch (IllegalArgumentException v13) {
                                                    throw m44.a("i", (Object)v13, (long)9188045807421548129L, (long)var1_1);
                                                }
                                                v2 /* !! */  = m44.a("v", var6_5, (Object)lqx.a("j", (int)23494, (long)(1644183278865472685L ^ var1_1)), (long)8739463139508311636L, (long)var1_1);
                                                if (var4_4 != false) break block44;
                                            }
                                            catch (IllegalArgumentException v14) {
                                                throw m44.a("i", (Object)v14, (long)9188045807421548129L, (long)var1_1);
                                            }
                                            if (v2 /* !! */  != false) break block45;
                                        }
                                        catch (IllegalArgumentException v15) {
                                            throw m44.a("i", (Object)v15, (long)9188045807421548129L, (long)var1_1);
                                        }
                                        v0 /* !! */  = (int)m44.a("v", var6_5, (Object)lqx.a("j", (int)6694, (long)(5818921988072217929L ^ var1_1)), (long)8739463139508311636L, (long)var1_1);
                                        v16 /* !! */  = var4_4;
                                        if (var1_1 >= 0L) {
                                            if (v16 /* !! */  != false) break block46;
                                        }
                                        ** GOTO lbl114
                                    }
                                    catch (IllegalArgumentException v17) {
                                        throw m44.a("i", (Object)v17, (long)9188045807421548129L, (long)var1_1);
                                    }
                                    if (v0 /* !! */  == 0) break block47;
                                }
                                catch (IllegalArgumentException v18) {
                                    throw m44.a("i", (Object)v18, (long)9188045807421548129L, (long)var1_1);
                                }
                            }
                            v2 /* !! */  = (CallSite)true;
                        }
                        return (boolean)v2 /* !! */ ;
                    }
                    v0 /* !! */  = var5_3;
                }
                try {
                    try {
                        try {
                            try {
                                v16 /* !! */  = var4_4;
lbl114:
                                // 2 sources

                                if (var1_1 >= 0L) {
                                    if (v16 /* !! */  != false) break block42;
                                    v16 /* !! */  = (CallSite)5;
                                }
                                if (v0 /* !! */  <= v16 /* !! */ ) break block43;
                            }
                            catch (IllegalArgumentException v19) {
                                throw m44.a("i", (Object)v19, (long)9188045807421548129L, (long)var1_1);
                            }
                            v0 /* !! */  = (int)m44.a("v", var3_2.substring(var5_3 - 5), (Object)lqx.a("j", (int)4127, (long)(3360418208847107941L ^ var1_1)), (long)8739463139508311636L, (long)var1_1);
                            if (var4_4 != false) break block42;
                        }
                        catch (IllegalArgumentException v20) {
                            throw m44.a("i", (Object)v20, (long)9188045807421548129L, (long)var1_1);
                        }
                        if (v0 /* !! */  == 0) break block43;
                    }
                    catch (IllegalArgumentException v21) {
                        throw m44.a("i", (Object)v21, (long)9188045807421548129L, (long)var1_1);
                    }
                    return true;
                }
                catch (IllegalArgumentException v22) {
                    throw m44.a("i", (Object)v22, (long)9188045807421548129L, (long)var1_1);
                }
            }
            v0 /* !! */  = 0;
        }
        return (boolean)v0 /* !! */ ;
    }

    public static File u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        sz sz2 = (sz)objectArray[2];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x3E74239BEA18L;
        long l13 = l11 ^ 0x1EFBD9C66832L;
        long l14 = l11 ^ 0x3B83542E15F4L;
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = sz2;
            objectArray3[2] = m44.a("n", (Object)objectArray2, (long)5984065297515245748L, (long)l10);
            objectArray3[1] = string;
            objectArray3[0] = l12;
            return m44.a("n", (Object)objectArray3, (long)6162772325355096227L, (long)l10);
        }
        catch (IOException iOException) {
            sz2.Z(l14, m44.a("q", (Object)iOException, (long)5510306740019408104L, (long)l10));
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block40: {
            block39: {
                block38: {
                    block37: {
                        block36: {
                            block35: {
                                lqx.b = prr.a(6093571050786677493L, 9105314479358642005L, MethodHandles.lookup().lookupClass()).a(113181565085658L);
                                var31 = lqx.b ^ 17070196675196L;
                                lqx.e = new HashMap<K, V>(13);
                                var22_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var31 >>> 56);
                                for (var23_2 = 1; var23_2 < 8; ++var23_2) {
                                    v2 = v2;
                                    v2[var23_2] = (byte)(var31 << var23_2 * 8 >>> 56);
                                }
                                var22_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var29_3 = new String[56];
                                var27_4 = 0;
                                var26_5 = "\u0017\u00d5\u0010\u008f\u00d2\u00d0\u00e2\u00f4L\u00d3yO\u00bd\u009d\u0094Y\u0010\r\r\u00ed\u00a0\u00c2a\u0011\u00c7~K/\nA\u00fe\u00b7\u00ed(,,\u00cfn\u008bT\u00f6\u00f3+B\u0088\u00da\u00a8t\u00da\u00ce4r\u00d4\u00e0klJ=\u00e0{\u00cf\u00e9?\u00d5\u00fe\u00dd\u00e4\u000b\u00fb\u0005\u00d2G\u0084\u00a2 \u00e3\u0093\u0092\u00b6b%x\u00f4e\u008f\u0011\u0097\u00d6B}[\u0012\u0018\u0094\u00cb\u0018\u00ebn;\u00e3G-\u00fcgha>H\u0011\u00b5>8B\u00ad\u00c3\u00f7#\u00baK\u00e42@G@-\u00d6\u00b2\u0016i\u000b\u00b3\u000f\u00b5B<\u000bW'\u00bdr\u00f1\u00e8\u00fc\u009e\u0090\u00c8&\u009d)p\u00e4\u00b1\u00ed\u000e\u0089\u0007\u00e1%(tc\u00d7gLs\u00d2\u00fc{\u00f1\u00e5[x\u009b2\u00eb\u00ca\u00e1+v\u00d5\u0010Q\u0014q\u000b\u00f8\u00f0\u00cf$\u00e9B\u00b5sv\u0007\u00cd<\u0010\u00c7\u00c4\u00f8\u00f5\u0093\u00b1\t\u009d\u00dc[\u008b\u00a3\n\u0083}\u00ab\u0010\u00fb\u00d0Q\u00c0\u0006JD\u00eaoHp\u0000d\u00b5;$\u0010x\u0091,m\u00963%\rEOW\u00f2V\u0090\u0097.\u0010F\b\u001f\u00cc\u0080j)\u0099\u0014\u00f8\u00a3\u001c\u00b1%\u0015f@\u00a5\u00a9f\u0091\u00de\u00c9Z1\u008e\u00af\u00f9\u00b5D\u0000\u0017(\u00bd\u0019oyN\u00f7.@\u0095\u0006\u00fc\u0099b8\u00eei\u00bc+:\u00ea\na\u00c4\u00d7\u00e6\u00b5|\u00b2\u0001\u00de\u001d\u008bX\u0096\u0090\u0000\u000f\u00ff\u000e\u00dd\u0083ZN\u00cc|>\u00bck \u00ac>\u0013=e6\u00e1m\u00f8I\u0097\u00cb+\u00a7\u0080\u0095\u000eP\u00cay\u001e\u0094@\u00b3\u00a0r\u0003\u00db\u00bf\u00faRuXV\u00b1~\u00d5X!}\u009c\u0083\\:\u001e\u00b1\u00db\n\u00fe\u00d8e\u00e5\u009aa\u001ck\u00e54\u00a1L\u00c2y^\u00c2?\u00faDOp\u00b9\u00de\u00c5<@\u00a5M5]\u00c8\u00a2K=\u0005\u00afNP\u0000\u00e9K\u00ac7f@\u00b8\u00ea}\u0006\u001c\u00b6\u00ec\u00956\u0080\u00c4\u00a3\u00f7\u0002\u00a3\u00c1&}\n\u000fQ5\u00abF;\u00bf\u0011\u008d\u00187Lt\u00b2\u0094u\u00ca\u0015\u008a5M\u0004\u00b5\u0019\u00d6\u0000\u00e7,\u00f8\u00ad\u0014\u00eb'_\u0010W\u009c2\u0003\u00f1\u00036\u009d\u00dd%\u0019\u001eT\u00efp\u008c\u0010\u0015\u001bQ\u009d}\u00d7\u00d3iZ\u00ea\u0080\u00fa#\u008c\fN\u0010\u00ab\u008b\u008a\u0016aV\u0093\u00e4\u00b1\u0080F\u00e3U%\u008e\u0096\u0010G\u0080\u008aLs\u0012\u00a7\u00f1\\\u00ef\u0005\u00b6ir2\u0094\u0010\u001d>\u00e0xg\u00e0\u0092\u00b9\u0084\u0082e\u00dd\u00d1m\u00a7\u00b5\u0010\u00fd\u00dd\u00cd\u0091\u0090\u00e9\u00f0\u00ee\u00fa5k8\u008bhP\u00e1\u0010\u00b9}\u0080\u001f\u0004^\u0085\u001a\u00cb\f\u00a3R\u00a7\u0005\u00bbn\u0010\u00fd\u00c8\u00c3\u00ec\u00ee\u00df\u00d2\u0092\u0089\u00d2\u00ec\u00b2\u0095\u008c\u00bel(Qq\u00b0\u00f8l\u001d\u0080\b\u00ef\u00f9\u00d3\u00a99\u0081Y\u001dK\u009f!^t\u00c8BvL)`\u00a9\u00ed\u0091\u0085\u0018\u00d9\u00ab\u00d7\u008a\u00ea\u00d5\u00e0\u0003HL]D/\u00c6\u00ee\u00e7^\u00fb\u00de\u001d\u00c3\u00a5\u00c7\u00d9\u00ba!\u00b4E\u00c5\u00c3\u00a8\u00ab;\u001bG\u009f\u00bd\u00b1\u00d2\u00ed\f\u00b4\u0000\u00d3B\u0081+\u008c\u0006\u00b2??\u0005\u009a\u00acD\u00bd\u00e5#\u0087\u00d1\u009f\u0081\u0011'\u00f9\u00fb\u0017C[#[\u00e9v\u00e4A2\u00fc\u009b\u0095\u00e3\u0010b\u00bcP\f8\u00ccBt\u00c0\u0010s=j\u00a9\u00a8\u0088\u0010v\u0087m\u00a9\u00af{\u00d0[\u00d1\u00c0(\u00a9t'u+\u0010\u00f2\u00817\u00a0\u00a2\u0012\u00a536\u001f\u0011C\u00a0\u00f6\u00f3\u001b\u0010\u00e8JW\u0098\u0016\"|\u00e3\u00de\u0087s:\u0097\u008c\u00c2\u0011\u00104\u0007\u00da\u001fI\u008d\u008e\u00df\u0092E\u0000\u0081\u0011o\u001dM\u0010\u0016\u001c&a\u0006\u00d5n\u00f8\u00f2A\u00b1\u001d\u00b3\u001e2\u00b1\u0010n$\u001f\u00bd\u00a0\u0001\u00c7\u0015C\u00de\u008eS\u00b6vgi\u0018\u0081\u00a7.\u00d7P#fi\u00e7F\u00be\u00df\u00d2\u00cd|\u00a6\u00a6>\u008a\u0000F\u00d4:G\u0010\u0098v\u00a0\u00a2\u00bd\u00ba\u0002]\u001f\u009f+\u00eb\u00eb\u00f5\u0015\u00de\u0010_\u00f9\u00d1\u00dd\u00bd\u00061\u0014f\u00ca\u009e\u001ah\u0010\u00ea\u00a5(%>Z\u00e3s\u001d[\u00b1\u009e\u00b7\u00ccR\u00ed\u00c9[\u00dd\u00d1\u00e0\u001c\u00b6;\u0002:\u00f0\u0011\u000b\u0080\"\u001f\u00ea\u00b0\u00bb\u00ca\u00f0D]\u001d\u0089\u009e\u000fP\u0015)\u00cd\u00d5\u008a\u00b9\u008ev\u00cd\u0091u\u00e1S^\u0015\u0014s\u00aa\u0019%\u00d4\u00a8\u00de\u000f\u0001\u00ea<\u008e\u00ca\u009e\u00ca\u009du@Y\u00e6DG\u008dC\u00cf\u00d3\u009b)\u00b0|\u0012\u00eb;\fp\u00f5Q\u00f5qkB\u00e5fF\u00e9\u00a8\u00c1\u00ef\u00f7\u00ad\u00da\u00ca1\u00eeg\u00d44\u0092\u001a\u001e\u00cc\u00de\u00e0\u008d\u0010;\u00f3<\u0094\u0016\u0094T a\u00ce\u00110\u00a2\u0087\u00ad\u0001\u0010O\u009c\u00ef\u00dbX\u00df\u00c5-`\u00c3\u00a2\u000b\u00b8\u00eb\u00d6\n \u000f\u0095\u001e(\u009an\u00db\u00c2^J\u00b5cFV\u001a\u00dfhO\u00dd\u0003\u00ed%)W\u00b3\u0089\u00abid\u00c8\u001f\u00ce\u0010eC;\\\u0080\u0084\u0019@\u009d*\u00b3\u00af\u00dd},u(\u00a8?2x\u0091(\u00e8\u00e4L\u0097\u00dc\u00dd\u00ae\u0099s1\u009f\u00c8C<\u0014\u0013\u001d\u00cd\u0017\u0090\u00fe\u00a5\u00af\u00bf\u0010\u0017\u00d0\u00c2\u00b2\u0014\u0095-\u00df\nP\u00efH\u00fe\u008f\u00bfui\u00a9n\u0082\"L\u001e\u00e0\u00d5\u00ec\u00da\u0017o\u0098_\u007fU\u00b6}6~(p\u00b1\u00aa\u00be6=\u000b\u00c6\u0087 Bx\u00ae\u009a2t\u00c2\u00d7\u009d\u00dd\u00bbW\u00ee\u00f1+^\u00dc\u008e\u00f4o\u00cf\u000f\u0006\u00ca\u00051,\u00cc\u00d9\u00b5\u0017\u00d8\u00db\u00c5\u00e9\\g\u0097\u00fb\u0081\u00fe\u00d0\u00105\u00f0\u00fb\u0003\u00fb\u00e0\u00ed\u00dam\u0096\u001b\u009b\u00e6\u0080\u00ea\u00df8\u00c0G\u00d1\u007f\t\u00f9\u008a\u001c\u00866\u00c2\u008d+\u00122o1\u0012\u00ef0\u0096\u0019:\u00a1\u00a3\n\u00c90\u001be\u0019T\u00c8m9\u0016\u0010\u001d\u00c8\u00a0\u00a0\r\u008aR\u001ay\u0004\u00bf$i\u00bdu:\u0089T\u008f\u0010\u00bc\u00fbb\u00feu\u00f2[\u00b6\u001e\u0099\u00ffy\u00b4\u00e0\u0085.\u0010\u00fcU\u00196\u00aa>\u0087\u00f6\u00af\u00fa\u00e8\u00bc\u00d8\u00ff\u00b1\u009f \u00efx\u009e.p\u0006\u0013\u0017\u00d6pL\u00ceH\u00b0\u007f\t\u00c4\u0004\u00af\u00ff\u00f5tk2\u00df)D\u00a0\u00b8\\\u00aa\u00a0\u0010\u0017\u0004\u0081\u00e0)4\u00fcK}\u00b8\u00d4\u00a5V\u00db\u00cf\u0017\u0010A~\u00d1\u000b.\u0087D2\u0083%\u0010\u0081\u0098>Ia\u0010\u00faL\u0019\u00b1\u009d\b\u00cf\u00faa\u00c3`\u0090J\u0085\u00e1T\u0010\u00f0:\u008d\u0018\u00ec{\u00b5?\u00b37\u0099\u00f0\u0001\u00f6\u00fe\u00ce \u00a8\u00daS\u00f9\u00ads\u00e7\u00b8\u0092h\n\n\u00ee\u00e8xa\u008c\u000f\u00b6\u00b3\u009d\u00c7\u00d2\u00d3)\u00ca\u0004\u00a7\u00a0\u00e4\u00b5O(>\u00e8\u0015?G\u00efHCT\u00d6c\u00bd\u00825\u00c1G\u00b9\u00c86\n+\u00e6\u00bd\u009c\u008dp\u00af\u009c\u0091\u00fa;\u0010\u00a0\\Jd\u00c8[\u00fd\u00fe\u0010$*\u00d9\u00f9\u00f9S\u008d\u0011K\u00f5\u0099\u00857\u00ae\u0010g";
                                var28_6 = "\u0017\u00d5\u0010\u008f\u00d2\u00d0\u00e2\u00f4L\u00d3yO\u00bd\u009d\u0094Y\u0010\r\r\u00ed\u00a0\u00c2a\u0011\u00c7~K/\nA\u00fe\u00b7\u00ed(,,\u00cfn\u008bT\u00f6\u00f3+B\u0088\u00da\u00a8t\u00da\u00ce4r\u00d4\u00e0klJ=\u00e0{\u00cf\u00e9?\u00d5\u00fe\u00dd\u00e4\u000b\u00fb\u0005\u00d2G\u0084\u00a2 \u00e3\u0093\u0092\u00b6b%x\u00f4e\u008f\u0011\u0097\u00d6B}[\u0012\u0018\u0094\u00cb\u0018\u00ebn;\u00e3G-\u00fcgha>H\u0011\u00b5>8B\u00ad\u00c3\u00f7#\u00baK\u00e42@G@-\u00d6\u00b2\u0016i\u000b\u00b3\u000f\u00b5B<\u000bW'\u00bdr\u00f1\u00e8\u00fc\u009e\u0090\u00c8&\u009d)p\u00e4\u00b1\u00ed\u000e\u0089\u0007\u00e1%(tc\u00d7gLs\u00d2\u00fc{\u00f1\u00e5[x\u009b2\u00eb\u00ca\u00e1+v\u00d5\u0010Q\u0014q\u000b\u00f8\u00f0\u00cf$\u00e9B\u00b5sv\u0007\u00cd<\u0010\u00c7\u00c4\u00f8\u00f5\u0093\u00b1\t\u009d\u00dc[\u008b\u00a3\n\u0083}\u00ab\u0010\u00fb\u00d0Q\u00c0\u0006JD\u00eaoHp\u0000d\u00b5;$\u0010x\u0091,m\u00963%\rEOW\u00f2V\u0090\u0097.\u0010F\b\u001f\u00cc\u0080j)\u0099\u0014\u00f8\u00a3\u001c\u00b1%\u0015f@\u00a5\u00a9f\u0091\u00de\u00c9Z1\u008e\u00af\u00f9\u00b5D\u0000\u0017(\u00bd\u0019oyN\u00f7.@\u0095\u0006\u00fc\u0099b8\u00eei\u00bc+:\u00ea\na\u00c4\u00d7\u00e6\u00b5|\u00b2\u0001\u00de\u001d\u008bX\u0096\u0090\u0000\u000f\u00ff\u000e\u00dd\u0083ZN\u00cc|>\u00bck \u00ac>\u0013=e6\u00e1m\u00f8I\u0097\u00cb+\u00a7\u0080\u0095\u000eP\u00cay\u001e\u0094@\u00b3\u00a0r\u0003\u00db\u00bf\u00faRuXV\u00b1~\u00d5X!}\u009c\u0083\\:\u001e\u00b1\u00db\n\u00fe\u00d8e\u00e5\u009aa\u001ck\u00e54\u00a1L\u00c2y^\u00c2?\u00faDOp\u00b9\u00de\u00c5<@\u00a5M5]\u00c8\u00a2K=\u0005\u00afNP\u0000\u00e9K\u00ac7f@\u00b8\u00ea}\u0006\u001c\u00b6\u00ec\u00956\u0080\u00c4\u00a3\u00f7\u0002\u00a3\u00c1&}\n\u000fQ5\u00abF;\u00bf\u0011\u008d\u00187Lt\u00b2\u0094u\u00ca\u0015\u008a5M\u0004\u00b5\u0019\u00d6\u0000\u00e7,\u00f8\u00ad\u0014\u00eb'_\u0010W\u009c2\u0003\u00f1\u00036\u009d\u00dd%\u0019\u001eT\u00efp\u008c\u0010\u0015\u001bQ\u009d}\u00d7\u00d3iZ\u00ea\u0080\u00fa#\u008c\fN\u0010\u00ab\u008b\u008a\u0016aV\u0093\u00e4\u00b1\u0080F\u00e3U%\u008e\u0096\u0010G\u0080\u008aLs\u0012\u00a7\u00f1\\\u00ef\u0005\u00b6ir2\u0094\u0010\u001d>\u00e0xg\u00e0\u0092\u00b9\u0084\u0082e\u00dd\u00d1m\u00a7\u00b5\u0010\u00fd\u00dd\u00cd\u0091\u0090\u00e9\u00f0\u00ee\u00fa5k8\u008bhP\u00e1\u0010\u00b9}\u0080\u001f\u0004^\u0085\u001a\u00cb\f\u00a3R\u00a7\u0005\u00bbn\u0010\u00fd\u00c8\u00c3\u00ec\u00ee\u00df\u00d2\u0092\u0089\u00d2\u00ec\u00b2\u0095\u008c\u00bel(Qq\u00b0\u00f8l\u001d\u0080\b\u00ef\u00f9\u00d3\u00a99\u0081Y\u001dK\u009f!^t\u00c8BvL)`\u00a9\u00ed\u0091\u0085\u0018\u00d9\u00ab\u00d7\u008a\u00ea\u00d5\u00e0\u0003HL]D/\u00c6\u00ee\u00e7^\u00fb\u00de\u001d\u00c3\u00a5\u00c7\u00d9\u00ba!\u00b4E\u00c5\u00c3\u00a8\u00ab;\u001bG\u009f\u00bd\u00b1\u00d2\u00ed\f\u00b4\u0000\u00d3B\u0081+\u008c\u0006\u00b2??\u0005\u009a\u00acD\u00bd\u00e5#\u0087\u00d1\u009f\u0081\u0011'\u00f9\u00fb\u0017C[#[\u00e9v\u00e4A2\u00fc\u009b\u0095\u00e3\u0010b\u00bcP\f8\u00ccBt\u00c0\u0010s=j\u00a9\u00a8\u0088\u0010v\u0087m\u00a9\u00af{\u00d0[\u00d1\u00c0(\u00a9t'u+\u0010\u00f2\u00817\u00a0\u00a2\u0012\u00a536\u001f\u0011C\u00a0\u00f6\u00f3\u001b\u0010\u00e8JW\u0098\u0016\"|\u00e3\u00de\u0087s:\u0097\u008c\u00c2\u0011\u00104\u0007\u00da\u001fI\u008d\u008e\u00df\u0092E\u0000\u0081\u0011o\u001dM\u0010\u0016\u001c&a\u0006\u00d5n\u00f8\u00f2A\u00b1\u001d\u00b3\u001e2\u00b1\u0010n$\u001f\u00bd\u00a0\u0001\u00c7\u0015C\u00de\u008eS\u00b6vgi\u0018\u0081\u00a7.\u00d7P#fi\u00e7F\u00be\u00df\u00d2\u00cd|\u00a6\u00a6>\u008a\u0000F\u00d4:G\u0010\u0098v\u00a0\u00a2\u00bd\u00ba\u0002]\u001f\u009f+\u00eb\u00eb\u00f5\u0015\u00de\u0010_\u00f9\u00d1\u00dd\u00bd\u00061\u0014f\u00ca\u009e\u001ah\u0010\u00ea\u00a5(%>Z\u00e3s\u001d[\u00b1\u009e\u00b7\u00ccR\u00ed\u00c9[\u00dd\u00d1\u00e0\u001c\u00b6;\u0002:\u00f0\u0011\u000b\u0080\"\u001f\u00ea\u00b0\u00bb\u00ca\u00f0D]\u001d\u0089\u009e\u000fP\u0015)\u00cd\u00d5\u008a\u00b9\u008ev\u00cd\u0091u\u00e1S^\u0015\u0014s\u00aa\u0019%\u00d4\u00a8\u00de\u000f\u0001\u00ea<\u008e\u00ca\u009e\u00ca\u009du@Y\u00e6DG\u008dC\u00cf\u00d3\u009b)\u00b0|\u0012\u00eb;\fp\u00f5Q\u00f5qkB\u00e5fF\u00e9\u00a8\u00c1\u00ef\u00f7\u00ad\u00da\u00ca1\u00eeg\u00d44\u0092\u001a\u001e\u00cc\u00de\u00e0\u008d\u0010;\u00f3<\u0094\u0016\u0094T a\u00ce\u00110\u00a2\u0087\u00ad\u0001\u0010O\u009c\u00ef\u00dbX\u00df\u00c5-`\u00c3\u00a2\u000b\u00b8\u00eb\u00d6\n \u000f\u0095\u001e(\u009an\u00db\u00c2^J\u00b5cFV\u001a\u00dfhO\u00dd\u0003\u00ed%)W\u00b3\u0089\u00abid\u00c8\u001f\u00ce\u0010eC;\\\u0080\u0084\u0019@\u009d*\u00b3\u00af\u00dd},u(\u00a8?2x\u0091(\u00e8\u00e4L\u0097\u00dc\u00dd\u00ae\u0099s1\u009f\u00c8C<\u0014\u0013\u001d\u00cd\u0017\u0090\u00fe\u00a5\u00af\u00bf\u0010\u0017\u00d0\u00c2\u00b2\u0014\u0095-\u00df\nP\u00efH\u00fe\u008f\u00bfui\u00a9n\u0082\"L\u001e\u00e0\u00d5\u00ec\u00da\u0017o\u0098_\u007fU\u00b6}6~(p\u00b1\u00aa\u00be6=\u000b\u00c6\u0087 Bx\u00ae\u009a2t\u00c2\u00d7\u009d\u00dd\u00bbW\u00ee\u00f1+^\u00dc\u008e\u00f4o\u00cf\u000f\u0006\u00ca\u00051,\u00cc\u00d9\u00b5\u0017\u00d8\u00db\u00c5\u00e9\\g\u0097\u00fb\u0081\u00fe\u00d0\u00105\u00f0\u00fb\u0003\u00fb\u00e0\u00ed\u00dam\u0096\u001b\u009b\u00e6\u0080\u00ea\u00df8\u00c0G\u00d1\u007f\t\u00f9\u008a\u001c\u00866\u00c2\u008d+\u00122o1\u0012\u00ef0\u0096\u0019:\u00a1\u00a3\n\u00c90\u001be\u0019T\u00c8m9\u0016\u0010\u001d\u00c8\u00a0\u00a0\r\u008aR\u001ay\u0004\u00bf$i\u00bdu:\u0089T\u008f\u0010\u00bc\u00fbb\u00feu\u00f2[\u00b6\u001e\u0099\u00ffy\u00b4\u00e0\u0085.\u0010\u00fcU\u00196\u00aa>\u0087\u00f6\u00af\u00fa\u00e8\u00bc\u00d8\u00ff\u00b1\u009f \u00efx\u009e.p\u0006\u0013\u0017\u00d6pL\u00ceH\u00b0\u007f\t\u00c4\u0004\u00af\u00ff\u00f5tk2\u00df)D\u00a0\u00b8\\\u00aa\u00a0\u0010\u0017\u0004\u0081\u00e0)4\u00fcK}\u00b8\u00d4\u00a5V\u00db\u00cf\u0017\u0010A~\u00d1\u000b.\u0087D2\u0083%\u0010\u0081\u0098>Ia\u0010\u00faL\u0019\u00b1\u009d\b\u00cf\u00faa\u00c3`\u0090J\u0085\u00e1T\u0010\u00f0:\u008d\u0018\u00ec{\u00b5?\u00b37\u0099\u00f0\u0001\u00f6\u00fe\u00ce \u00a8\u00daS\u00f9\u00ads\u00e7\u00b8\u0092h\n\n\u00ee\u00e8xa\u008c\u000f\u00b6\u00b3\u009d\u00c7\u00d2\u00d3)\u00ca\u0004\u00a7\u00a0\u00e4\u00b5O(>\u00e8\u0015?G\u00efHCT\u00d6c\u00bd\u00825\u00c1G\u00b9\u00c86\n+\u00e6\u00bd\u009c\u008dp\u00af\u009c\u0091\u00fa;\u0010\u00a0\\Jd\u00c8[\u00fd\u00fe\u0010$*\u00d9\u00f9\u00f9S\u008d\u0011K\u00f5\u0099\u00857\u00ae\u0010g".length();
                                var25_7 = 16;
                                var24_8 = -1;
lbl20:
                                // 2 sources

                                while (true) {
                                    v3 = ++var24_8;
                                    v4 = var26_5.substring(v3, v3 + var25_7);
                                    v5 = -1;
                                    break block35;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = lqx.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    var26_5 = "\u0010\u0093\u001d\u001e\u00d4\u00b2\u009eo\u00f9\u0092\u00cf+P\u0010\u0004\t\u0010\u008c\u00f6\u00fbn\u00d0\u00dd\u0012\b\u00eb0\u00a2\u00dc\u0012\u00e6\"\u00dc";
                                    var28_6 = "\u0010\u0093\u001d\u001e\u00d4\u00b2\u009eo\u00f9\u0092\u00cf+P\u0010\u0004\t\u0010\u008c\u00f6\u00fbn\u00d0\u00dd\u0012\b\u00eb0\u00a2\u00dc\u0012\u00e6\"\u00dc".length();
                                    var25_7 = 16;
                                    var24_8 = -1;
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var24_8;
                                        v4 = var26_5.substring(v6, v6 + var25_7);
                                        v5 = 0;
                                        break block35;
                                        break;
                                    }
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = lqx.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    break block36;
                                    break;
                                }
                            }
                            var30_9 = var22_1.doFinal(v4.getBytes("ISO-8859-1"));
                            switch (v5) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl51:
                                // 1 sources

                                ** continue;
                            }
                        }
                        lqx.c = var29_3;
                        lqx.d = new String[56];
                        lqx.i = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var31 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var31 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[24];
                        var14_13 = 0;
                        var15_14 = "\u00bdK\u0094\u00e8\u00ec\u00ae\u00ca\u00fb\u00d1\u0012G\u00d9\u00a9\u00bf\u009e\u00cd\u00c6\u0086g\u0098\u00e6[k\u00a4V\riT\u0091\b@\u00fe\\3F\u00b6\u00a5\u00a4\u00fc,g\u0014\u0086P\u00f5\u00d4TP\u00f6nY\t1\u00e2\u00ee\u00e1\u00d9\u00f9 lZ|\u001d\u0093]h\u0001\u0012`\u00ab5\u00d6\u0014\u0005\u001f\u00a2\u00cb\u0087\u00ee\u001b\u008f\u00beJ\u00a9?B\u00cd\u00a8\u008c\u00c7H\u00bf\u0005;:\u0091\u0015\u000f^\u0012H\u00a8\fz\u0019E\u00d5B\u00ef\u00e2\u00ff#\u00de\u0097R\u00f3H\u00d2\u00b2$\u0010Lj\u00f7\u0001\u0005\u00ae\u0015\u00e5\u00cd\u00b9\u00cd\u00e02\u008f\u00b2^E\u0017\\.\u001d\u00cdr\u00d1`\u009d\u0010=\u0096\u00b8l\u00a8o\u00c3Vi\u0087\u00e1\u00945g\u000bz<\u00dd\u0015d\u00cc\u00df\u0092H5 \f\u0098";
                        var16_15 = "\u00bdK\u0094\u00e8\u00ec\u00ae\u00ca\u00fb\u00d1\u0012G\u00d9\u00a9\u00bf\u009e\u00cd\u00c6\u0086g\u0098\u00e6[k\u00a4V\riT\u0091\b@\u00fe\\3F\u00b6\u00a5\u00a4\u00fc,g\u0014\u0086P\u00f5\u00d4TP\u00f6nY\t1\u00e2\u00ee\u00e1\u00d9\u00f9 lZ|\u001d\u0093]h\u0001\u0012`\u00ab5\u00d6\u0014\u0005\u001f\u00a2\u00cb\u0087\u00ee\u001b\u008f\u00beJ\u00a9?B\u00cd\u00a8\u008c\u00c7H\u00bf\u0005;:\u0091\u0015\u000f^\u0012H\u00a8\fz\u0019E\u00d5B\u00ef\u00e2\u00ff#\u00de\u0097R\u00f3H\u00d2\u00b2$\u0010Lj\u00f7\u0001\u0005\u00ae\u0015\u00e5\u00cd\u00b9\u00cd\u00e02\u008f\u00b2^E\u0017\\.\u001d\u00cdr\u00d1`\u009d\u0010=\u0096\u00b8l\u00a8o\u00c3Vi\u0087\u00e1\u00945g\u000bz<\u00dd\u0015d\u00cc\u00df\u0092H5 \f\u0098".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block37;
                            break;
                        }
lbl78:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u00ca\u00e3\u008c$\u00fa\u0097\u00d9b\u008f\u0087\u00e3\u00a2%O\u00a2l";
                            var16_15 = "\u00ca\u00e3\u008c$\u00fa\u0097\u00d9b\u008f\u0087\u00e3\u00a2%O\u00a2l".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block37;
                                break;
                            }
                            break;
                        }
lbl91:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block38;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v13) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl104:
                        // 1 sources

                        ** continue;
                    }
                }
                lqx.f = var17_12;
                lqx.h = new Integer[24];
                lqx.l = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var31 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var31 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "\fE!\b\n\u00c6A\u008d\u0002?GQT\u00f7\u0094q";
                var5_25 = "\fE!\b\n\u00c6A\u008d\u0002?GQT\u00f7\u0094q".length();
                var2_26 = 0;
                while (true) {
                    break block39;
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block40;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        lqx.j = var6_22;
        lqx.k = new Long[2];
        lqx.K = m44.a("i", (Object)lqx.a("j", (int)27565, (long)(8891984109965410480L ^ var31)), (long)-7896919434093594153L, (long)var31);
        lqx.U = new File((String)m44.a("m", (long)-8436582056272746051L, (long)var31));
        lqx.A = m44.a("i", (Object)lqx.a("j", (int)15991, (long)(9195585092190852435L ^ var31)), (long)-7896919434093594153L, (long)var31);
        lqx.m = m44.a("m", (long)-8036700374821759208L, (long)var31).charAt(0);
        lqx.g = m44.a("i", (Object)lqx.a("j", (int)4472, (long)(6549205243451734612L ^ var31)), (long)-7896919434093594153L, (long)var31);
        lqx.P = m44.a("m", (long)-7680245115132064108L, (long)var31).charAt(0);
        lqx.z = m44.a("i", (Object)lqx.a("j", (int)27732, (long)(5157461592754456405L ^ var31)), (Object)"\n", (long)-7510129362603576102L, (long)var31);
        lqx.a = m44.a("i", (Object)lqx.a("j", (int)19375, (long)(1498862424386445472L ^ var31)), (Object)lqx.a("j", (int)27212, (long)(347525961539551611L ^ var31)), (long)-7510129362603576102L, (long)var31);
        m44.a("j", (boolean)true, (long)-8517318968691500544L, (long)var31);
        lqx.N = m44.a("i", (Object)lqx.a("j", (int)14122, (long)(9041000615246584840L ^ var31)), (long)-7896919434093594153L, (long)var31);
        m44.a("j", (int)lqx.b("k", (int)20707, (long)(6160185930988279527L ^ var31)), (long)-7698033336408765355L, (long)var31);
        var33_30 = lqx.a("j", (int)30242, (long)(8949573292118908216L ^ var31));
        var34_31 = m44.a("v", (Object)var33_30, (long)-7810009863426212610L, (long)var31);
        var37_32 = 0;
        do {
            var35_33 = new File((String)var33_30 + var37_32 + (String)lqx.a("j", (int)28986, (long)(9222972863679732245L ^ var31)));
            var36_34 = new File((String)var34_31 + var37_32++ + (String)lqx.a("j", (int)23438, (long)(3268756145579208855L ^ var31)));
        } while (m44.a("v", (Object)var35_33, (long)-8158867254494786787L, (long)var31) != false || m44.a("v", (Object)var36_34, (long)-8158867254494786787L, (long)var31) != false);
        try {
            var38_35 = new PrintWriter(new FileWriter(var35_33), true);
            try {
                var38_35.println((String)var33_30);
                m44.a("v", (Object)var38_35, (long)-8260702340590026319L, (long)var31);
                m44.a("v", (Object)var38_35, (long)-8465414672848930573L, (long)var31);
                v19 = m44.a("v", (Object)var36_34, (long)-8158867254494786787L, (long)var31) == false;
            }
            catch (IOException v20) {
                throw m44.a("i", (Object)v20, (long)-7797358278165198295L, (long)var31);
            }
            m44.a("j", (boolean)v19, (long)-8517318968691500544L, (long)var31);
        }
        catch (IOException var38_36) {
            block42: {
                block41: {
                    try {
                        try {
                            try {
                                if (m44.a("m", (long)-7819590091501717462L, (long)var31).startsWith((String)lqx.a("j", (int)1076, (long)(8705183705700101950L ^ var31))) || m44.a("m", (long)-7819590091501717462L, (long)var31).startsWith((String)lqx.a("j", (int)23110, (long)(8226726110694257006L ^ var31)))) break block41;
                            }
                            catch (IOException v21) {
                                throw m44.a("i", (Object)v21, (long)-7797358278165198295L, (long)var31);
                            }
                            if (m44.a("m", (long)-7819590091501717462L, (long)var31).startsWith((String)lqx.a("j", (int)29072, (long)(1011910693706144419L ^ var31)))) break block41;
                        }
                        catch (IOException v22) {
                            throw m44.a("i", (Object)v22, (long)-7797358278165198295L, (long)var31);
                        }
                        v23 = true;
                        break block42;
                    }
                    catch (IOException v24) {
                        throw m44.a("i", (Object)v24, (long)-7797358278165198295L, (long)var31);
                    }
                }
                v23 = false;
            }
            m44.a("j", (boolean)v23, (long)-8517318968691500544L, (long)var31);
        }
        m44.a("v", (Object)var35_33, (long)-8239743046647401004L, (long)var31);
        if (m44.a("m", (long)-7943692072619681506L, (long)var31) != null) {
            m44.a("j", new ArrayList<E>(), (long)-8314452217615642210L, (long)var31);
            var38_35 = new StringTokenizer((String)m44.a("m", (long)-7943692072619681506L, (long)var31), ";");
            while (var38_35.hasMoreTokens()) {
                var39_37 = var38_35.nextToken();
                if (m44.a("m", (long)-8517318968691500544L, (long)var31) == false) {
                    var39_37 = var39_37.toLowerCase();
                }
                m44.a("m", (long)-8314452217615642210L, (long)var31).add(var39_37);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean i(Object[] var0) {
        block33: {
            block32: {
                block31: {
                    block30: {
                        var1_1 = (Long)var0[0];
                        var3_2 = (String)var0[1];
                        var4_3 = (var1_1 = lqx.b ^ var1_1) ^ 17871613758068L;
                        var7_4 = var3_2.lastIndexOf((int)lqx.b("k", (int)26591, (long)(8583828683828213543L ^ var1_1)));
                        var6_5 = m44.a("o", (long)-2308097406946227161L, (long)var1_1);
                        if (var7_4 > -1) {
                            block28: {
                                block29: {
                                    var8_6 = var3_2.substring(var7_4, var3_2.length());
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v0 /* !! */  = m44.a("p", (Object)var8_6, (Object)lqx.a("j", (int)14838, (long)(3077789708285707281L ^ var1_1)), (long)-4326112600257925910L, (long)var1_1);
                                                                if (var6_5 == false) break block28;
                                                                if (v0 /* !! */  != false) break block29;
                                                            }
                                                            catch (IllegalArgumentException v1) {
                                                                throw m44.a("o", (Object)v1, (long)-4234441300622222113L, (long)var1_1);
                                                            }
                                                            v0 /* !! */  = m44.a("p", (Object)var8_6, (Object)lqx.a("j", (int)23381, (long)(997849897779750534L ^ var1_1)), (long)-4326112600257925910L, (long)var1_1);
                                                            if (var6_5 == false) break block28;
                                                        }
                                                        catch (IllegalArgumentException v2) {
                                                            throw m44.a("o", (Object)v2, (long)-4234441300622222113L, (long)var1_1);
                                                        }
                                                        if (v0 /* !! */  != false) break block29;
                                                    }
                                                    catch (IllegalArgumentException v3) {
                                                        throw m44.a("o", (Object)v3, (long)-4234441300622222113L, (long)var1_1);
                                                    }
                                                    v0 /* !! */  = m44.a("p", (Object)var8_6, (Object)lqx.a("j", (int)3389, (long)(8235313344457289934L ^ var1_1)), (long)-4326112600257925910L, (long)var1_1);
                                                    if (var6_5 == false) break block28;
                                                }
                                                catch (IllegalArgumentException v4) {
                                                    throw m44.a("o", (Object)v4, (long)-4234441300622222113L, (long)var1_1);
                                                }
                                                if (v0 /* !! */  != false) break block29;
                                            }
                                            catch (IllegalArgumentException v5) {
                                                throw m44.a("o", (Object)v5, (long)-4234441300622222113L, (long)var1_1);
                                            }
                                            v0 /* !! */  = m44.a("p", (Object)var8_6, (Object)lqx.a("j", (int)4691, (long)(2366214267137175457L ^ var1_1)), (long)-4326112600257925910L, (long)var1_1);
                                            if (var6_5 == false) break block28;
                                        }
                                        catch (IllegalArgumentException v6) {
                                            throw m44.a("o", (Object)v6, (long)-4234441300622222113L, (long)var1_1);
                                        }
                                        if (v0 /* !! */  == false) break block30;
                                    }
                                    catch (IllegalArgumentException v7) {
                                        throw m44.a("o", (Object)v7, (long)-4234441300622222113L, (long)var1_1);
                                    }
                                }
                                v0 /* !! */  = (CallSite)true;
                            }
                            return (boolean)v0 /* !! */ ;
                        }
                    }
                    try {
                        v8 = m44.a("k", (long)-2708026608489871512L, (long)var1_1);
                        if (var6_5 == false) break block31;
                        if (v8 == null) break block32;
                    }
                    catch (IllegalArgumentException v9) {
                        throw m44.a("o", (Object)v9, (long)-4234441300622222113L, (long)var1_1);
                    }
                    v8 = m44.a("k", (long)-2708026608489871512L, (long)var1_1);
                }
                var8_6 = v8.iterator();
                while (var8_6.hasNext()) {
                    block35: {
                        block36: {
                            block37: {
                                block34: {
                                    var9_7 = (String)var8_6.next();
                                    try {
                                        try {
                                            try {
                                                v10 = var9_7.indexOf("*");
                                                v11 = var6_5;
                                                if (var1_1 > 0L) {
                                                    if (v11 == false) break block33;
                                                    v11 = var6_5;
                                                }
                                                if (var1_1 > 0L) {
                                                    if (v11 == false) break block34;
                                                }
                                                ** GOTO lbl93
                                            }
                                            catch (IllegalArgumentException v12) {
                                                throw m44.a("o", (Object)v12, (long)-4234441300622222113L, (long)var1_1);
                                            }
                                            if (var1_1 < 0L) break block35;
                                            if (v10 <= -1) break block36;
                                        }
                                        catch (IllegalArgumentException v13) {
                                            throw m44.a("o", (Object)v13, (long)-4234441300622222113L, (long)var1_1);
                                        }
                                        v14 = mn.R(var3_2, var4_3, var9_7);
                                    }
                                    catch (IllegalArgumentException v15) {
                                        throw m44.a("o", (Object)v15, (long)-4234441300622222113L, (long)var1_1);
                                    }
                                }
                                try {
                                    v11 = var6_5;
lbl93:
                                    // 2 sources

                                    if (v11 == false) break block37;
                                    if (!v14) break block36;
                                }
                                catch (IllegalArgumentException v16) {
                                    throw m44.a("o", (Object)v16, (long)-4234441300622222113L, (long)var1_1);
                                }
                                v14 = true;
                            }
                            return v14;
                        }
                        v17 = var6_5;
                    }
                    if (v17 != false) continue;
                }
            }
            v10 = 0;
        }
        return (boolean)v10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean P(Object[] objectArray) {
        CallSite callSite;
        block13: {
            File file = (File)objectArray[0];
            long l10 = (Long)objectArray[1];
            long l11 = (l10 = b ^ l10) ^ 0x639F1ADA5F72L;
            FileInputStream fileInputStream = null;
            CallSite callSite2 = m44.a("l", (long)-4977416887809201860L, (long)l10);
            try {
                fileInputStream = new FileInputStream(file);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l11;
                objectArray2[0] = fileInputStream;
                callSite = m44.a("l", (Object)objectArray2, (long)-4613070570879492203L, (long)l10);
            }
            catch (Throwable throwable) {
                block15: {
                    try {
                        FileInputStream fileInputStream2;
                        block14: {
                            try {
                                fileInputStream2 = fileInputStream;
                                if (callSite2 == false) break block14;
                                if (fileInputStream2 == null) break block15;
                            }
                            catch (nn nn2) {
                                throw m44.a("l", (Object)nn2, (long)-6906434924467111484L, (long)l10);
                            }
                            fileInputStream2 = fileInputStream;
                        }
                        m44.a("s", (Object)fileInputStream2, (long)-6841032601144660513L, (long)l10);
                    }
                    catch (nn nn3) {
                        throw nn3;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
            try {
                FileInputStream fileInputStream3;
                block12: {
                    try {
                        fileInputStream3 = fileInputStream;
                        if (callSite2 == false) break block12;
                        if (fileInputStream3 == null) break block13;
                    }
                    catch (nn nn4) {
                        throw m44.a("l", (Object)nn4, (long)-6906434924467111484L, (long)l10);
                    }
                    fileInputStream3 = fileInputStream;
                }
                m44.a("s", (Object)fileInputStream3, (long)-6841032601144660513L, (long)l10);
            }
            catch (nn nn5) {
                throw nn5;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     */
    public static String e(Object[] var0) {
        block49: {
            block48: {
                block45: {
                    block47: {
                        block46: {
                            block42: {
                                block44: {
                                    block43: {
                                        block39: {
                                            block40: {
                                                block41: {
                                                    block37: {
                                                        block38: {
                                                            var1_1 = (byte[])var0[0];
                                                            var3_2 = (Long)var0[1];
                                                            var2_3 = (lb6)var0[2];
                                                            var6_4 = (lb6)var0[3];
                                                            var5_5 = (lb6)var0[4];
                                                            var3_2 = lqx.b ^ var3_2;
                                                            var7_6 = m44.a("j", (long)-508242419180603190L, (long)var3_2);
                                                            try {
                                                                try {
                                                                    v0 = var1_1;
                                                                    if (var7_6 != false) break block37;
                                                                    if (v0 != null) break block38;
                                                                }
                                                                catch (IllegalArgumentException v1) {
                                                                    throw m44.a("j", (Object)v1, (long)-1938473778973475590L, (long)var3_2);
                                                                }
                                                                return null;
                                                            }
                                                            catch (IllegalArgumentException v2) {
                                                                throw m44.a("j", (Object)v2, (long)-1938473778973475590L, (long)var3_2);
                                                            }
                                                        }
                                                        v0 = var1_1;
                                                    }
                                                    try {
                                                        try {
                                                            v3 = v0.length;
                                                            if (var3_2 < 0L) break block39;
                                                            v4 = m44.a("n", (long)-2019854689937458554L, (long)var3_2);
                                                            if (var7_6 != false) break block40;
                                                            if (v3 == v4) break block41;
                                                        }
                                                        catch (IllegalArgumentException v5) {
                                                            throw m44.a("j", (Object)v5, (long)-1938473778973475590L, (long)var3_2);
                                                        }
                                                        throw new IllegalArgumentException((String)lqx.a("j", (int)19699, (long)(8736686383970701608L ^ var3_2)) + (int)m44.a("n", (long)-2019854689937458554L, (long)var3_2) + (String)lqx.a("j", (int)10930, (long)(8095495602602948460L ^ var3_2)) + var1_1.length);
                                                    }
                                                    catch (IllegalArgumentException v6) {
                                                        throw m44.a("j", (Object)v6, (long)-1938473778973475590L, (long)var3_2);
                                                    }
                                                }
                                                v7 = var1_1[0];
                                                v4 = lqx.b("k", (int)22908, (long)(7354250611710110114L ^ var3_2));
                                            }
                                            v3 = v7 & v4;
                                        }
                                        var8_7 = v3;
                                        var9_8 = var1_1[1] & lqx.b("k", (int)22908, (long)(7354250611710110114L ^ var3_2));
                                        var10_9 = var1_1[2] & lqx.b("k", (int)22908, (long)(7354250611710110114L ^ var3_2));
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v8 = var8_7;
                                                                v9 = lqx.b("k", (int)1290, (long)(3209644410548483541L ^ var3_2));
                                                                if (var7_6 != false) break block42;
                                                                if (v8 != v9) break block43;
                                                            }
                                                            catch (IllegalArgumentException v10) {
                                                                throw m44.a("j", (Object)v10, (long)-1938473778973475590L, (long)var3_2);
                                                            }
                                                            v8 = var9_8;
                                                            v9 = lqx.b("k", (int)31058, (long)(5515633480166738335L ^ var3_2));
                                                            if (var7_6 != false) break block42;
                                                        }
                                                        catch (IllegalArgumentException v11) {
                                                            throw m44.a("j", (Object)v11, (long)-1938473778973475590L, (long)var3_2);
                                                        }
                                                        if (var3_2 <= 0L) break block44;
                                                        if (v8 != v9) break block43;
                                                    }
                                                    catch (IllegalArgumentException v12) {
                                                        throw m44.a("j", (Object)v12, (long)-1938473778973475590L, (long)var3_2);
                                                    }
                                                    v8 = var10_9;
                                                    v9 = lqx.b("k", (int)23721, (long)(2244604240897354854L ^ var3_2));
                                                    v13 = var7_6;
                                                    if (var3_2 > 0L) {
                                                        if (v13 != false) break block42;
                                                    }
                                                    ** GOTO lbl99
                                                }
                                                catch (IllegalArgumentException v14) {
                                                    throw m44.a("j", (Object)v14, (long)-1938473778973475590L, (long)var3_2);
                                                }
                                                if (var3_2 < 0L) break block44;
                                                if (v8 != v9) break block43;
                                            }
                                            catch (IllegalArgumentException v15) {
                                                throw m44.a("j", (Object)v15, (long)-1938473778973475590L, (long)var3_2);
                                            }
                                            var2_3.P(3);
                                            var6_4.P(3);
                                            return lqx.a("j", (int)26184, (long)(4838382626620898237L ^ var3_2));
                                        }
                                        catch (IllegalArgumentException v16) {
                                            throw m44.a("j", (Object)v16, (long)-1938473778973475590L, (long)var3_2);
                                        }
                                    }
                                    v8 = var8_7;
                                    v17 = 22908;
                                }
                                v9 = lqx.b("k", (int)v17, (long)(7354250611710110114L ^ var3_2));
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            v13 = var7_6;
lbl99:
                                            // 2 sources

                                            if (v13 != false) break block45;
                                            if (v8 != v9) break block46;
                                        }
                                        catch (IllegalArgumentException v18) {
                                            throw m44.a("j", (Object)v18, (long)-1938473778973475590L, (long)var3_2);
                                        }
                                        v8 = var9_8;
                                        v9 = lqx.b("k", (int)31867, (long)(5557193679889992874L ^ var3_2));
                                        v19 = var7_6;
                                        if (var3_2 > 0L) {
                                            if (v19 != false) break block45;
                                        }
                                        ** GOTO lbl133
                                    }
                                    catch (IllegalArgumentException v20) {
                                        throw m44.a("j", (Object)v20, (long)-1938473778973475590L, (long)var3_2);
                                    }
                                    if (var3_2 <= 0L) break block47;
                                    if (v8 != v9) break block46;
                                }
                                catch (IllegalArgumentException v21) {
                                    throw m44.a("j", (Object)v21, (long)-1938473778973475590L, (long)var3_2);
                                }
                                var6_4.P(2);
                                var5_5.P(0);
                                return lqx.a("j", (int)23919, (long)(3526277308402942112L ^ var3_2));
                            }
                            catch (IllegalArgumentException v22) {
                                throw m44.a("j", (Object)v22, (long)-1938473778973475590L, (long)var3_2);
                            }
                        }
                        v8 = var8_7;
                        v23 = 19344;
                    }
                    v9 = lqx.b("k", (int)v23, (long)(4553384277256584030L ^ var3_2));
                }
                try {
                    try {
                        if (var3_2 < 0L) break block48;
                        v19 = var7_6;
lbl133:
                        // 2 sources

                        if (v19 != false) break block48;
                        if (v8 != v9) break block49;
                    }
                    catch (IllegalArgumentException v24) {
                        throw m44.a("j", (Object)v24, (long)-1938473778973475590L, (long)var3_2);
                    }
                    v8 = var9_8;
                    v9 = lqx.b("k", (int)22908, (long)(7354250611710110114L ^ var3_2));
                }
                catch (IllegalArgumentException v25) {
                    throw m44.a("j", (Object)v25, (long)-1938473778973475590L, (long)var3_2);
                }
            }
            try {
                if (v8 == v9) {
                    var6_4.P(2);
                    var5_5.P(1);
                    return lqx.a("j", (int)11300, (long)(4912934512361255385L ^ var3_2));
                }
            }
            catch (IllegalArgumentException v26) {
                throw m44.a("j", (Object)v26, (long)-1938473778973475590L, (long)var3_2);
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String F(Object[] var0) {
        block31: {
            block30: {
                block28: {
                    block29: {
                        block27: {
                            block26: {
                                block24: {
                                    block25: {
                                        var1_1 = (Long)var0[0];
                                        var3_2 = (String)var0[1];
                                        var1_1 = lqx.b ^ var1_1;
                                        var4_3 = m44.a("o", (long)2262952418164575415L, (long)var1_1);
                                        try {
                                            try {
                                                v0 = var3_2;
                                                if (var4_3 == false) break block24;
                                                if (v0 != null) break block25;
                                            }
                                            catch (IllegalArgumentException v1) {
                                                throw m44.a("o", (Object)v1, (long)408803428951432271L, (long)var1_1);
                                            }
                                            return null;
                                        }
                                        catch (IllegalArgumentException v2) {
                                            throw m44.a("o", (Object)v2, (long)408803428951432271L, (long)var1_1);
                                        }
                                    }
                                    v0 = var3_2.trim();
                                }
                                var5_4 = v0;
                                try {
                                    v3 /* !! */  = m44.a("k", (long)1844335098834596124L, (long)var1_1);
                                    v4 = lqx.b("k", (int)3155, (long)(1022199908953857076L ^ var1_1));
                                    if (var4_3 == false) break block26;
                                    if (v3 /* !! */  == v4) {
                                    }
                                    ** GOTO lbl36
                                }
                                catch (IllegalArgumentException v5) {
                                    throw m44.a("o", (Object)v5, (long)408803428951432271L, (long)var1_1);
                                }
                                v6 = var5_4.replace((char)lqx.b("k", (int)16431, (long)(3859006537645150288L ^ var1_1)), (char)m44.a("k", (long)1844335098834596124L, (long)var1_1));
                                if (var1_1 < 0L) ** GOTO lbl52
                                var5_4 = v6;
                                try {
                                    try {
                                        if (var4_3 != false) break block27;
lbl36:
                                        // 2 sources

                                        v3 /* !! */  = m44.a("k", (long)1844335098834596124L, (long)var1_1);
                                        if (var1_1 >= 0L && var4_3 != false) {
                                        }
                                        ** GOTO lbl53
                                    }
                                    catch (IllegalArgumentException v7) {
                                        throw m44.a("o", (Object)v7, (long)408803428951432271L, (long)var1_1);
                                    }
                                    v4 = lqx.b("k", (int)16431, (long)(3859006537645150288L ^ var1_1));
                                }
                                catch (IllegalArgumentException v8) {
                                    throw m44.a("o", (Object)v8, (long)408803428951432271L, (long)var1_1);
                                }
                            }
                            if (v3 /* !! */  == v4) {
                                var5_4 = var5_4.replace((char)lqx.b("k", (int)3155, (long)(1022199908953857076L ^ var1_1)), (char)m44.a("k", (long)1844335098834596124L, (long)var1_1));
                            }
                        }
                        do {
                            v6 = var5_4;
lbl52:
                            // 2 sources

                            v3 /* !! */  = (CallSite)v6.endsWith((String)m44.a("k", (long)437285596262531454L, (long)var1_1));
lbl53:
                            // 2 sources

                            try {
                                if (v3 /* !! */  == false) break;
lbl55:
                                // 2 sources

                                while (true) {
                                    v9 = var5_4.substring(0, var5_4.length() - m44.a("k", (long)437285596262531454L, (long)var1_1).length());
                                    v10 = var4_3;
                                    if (var1_1 < 0L) break block28;
                                    if (v10 == false) break block29;
                                    break;
                                }
                            }
                            catch (IllegalArgumentException v11) {
                                throw m44.a("o", (Object)v11, (long)408803428951432271L, (long)var1_1);
                            }
                            var5_4 = v9;
                        } while (var4_3 != false);
                        ** while (var1_1 <= 0L)
lbl66:
                        // 1 sources

                        v9 = var5_4;
                    }
                    v10 = m44.a("k", (long)1844335098834596124L, (long)var1_1);
                }
                var6_5 = v9.lastIndexOf((int)v10);
                try {
                    try {
                        v12 = var6_5;
                        v13 = -1;
                        if (var1_1 <= 0L || var4_3 == false) break block30;
                        if (v12 <= v13) break block31;
                    }
                    catch (IllegalArgumentException v14) {
                        throw m44.a("o", (Object)v14, (long)408803428951432271L, (long)var1_1);
                    }
                    v12 = var6_5;
                    v13 = var5_4.length() - 1;
                }
                catch (IllegalArgumentException v15) {
                    throw m44.a("o", (Object)v15, (long)408803428951432271L, (long)var1_1);
                }
            }
            try {
                if (v12 == v13) {
                    return var5_4.substring(0, var5_4.length() - 1);
                }
            }
            catch (IllegalArgumentException v16) {
                throw m44.a("o", (Object)v16, (long)408803428951432271L, (long)var1_1);
            }
            return var5_4.substring(var6_5 + 1);
        }
        return var5_4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean h(Object[] var0) {
        block32: {
            block33: {
                block30: {
                    block31: {
                        block28: {
                            block29: {
                                block27: {
                                    var1_1 = (String)var0[0];
                                    var2_2 = (Long)var0[1];
                                    var2_2 = lqx.b ^ var2_2;
                                    var4_3 = m44.a("k", (long)3783874785106834619L, (long)var2_2);
                                    try {
                                        try {
                                            v0 = var1_1;
                                            if (var4_3 != false) break block27;
                                            if (v0 != null) {
                                            }
                                            ** GOTO lbl31
                                        }
                                        catch (IllegalArgumentException v1) {
                                            throw m44.a("k", (Object)v1, (long)2983760619394412683L, (long)var2_2);
                                        }
                                        v0 = var1_1.trim();
                                    }
                                    catch (IllegalArgumentException v2) {
                                        throw m44.a("k", (Object)v2, (long)2983760619394412683L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        v3 = v0.length();
                                        v4 /* !! */  = var4_3;
                                        if (var2_2 > 0L) {
                                            if (v4 /* !! */  != false) break block28;
                                            if (v3 != false) break block29;
                                        }
                                        ** GOTO lbl41
                                    }
                                    catch (IllegalArgumentException v5) {
                                        throw m44.a("k", (Object)v5, (long)2983760619394412683L, (long)var2_2);
                                    }
lbl31:
                                    // 2 sources

                                    return false;
                                }
                                catch (IllegalArgumentException v6) {
                                    throw m44.a("k", (Object)v6, (long)2983760619394412683L, (long)var2_2);
                                }
                            }
                            var1_1 = var1_1.trim();
                            v3 = var1_1.charAt(0);
                        }
                        try {
                            try {
                                v4 /* !! */  = m44.a("o", (long)3307374124276734411L, (long)var2_2);
lbl41:
                                // 2 sources

                                if (var2_2 <= 0L || var4_3 != false) break block30;
                                if (v3 != v4 /* !! */ ) break block31;
                            }
                            catch (IllegalArgumentException v7) {
                                throw m44.a("k", (Object)v7, (long)2983760619394412683L, (long)var2_2);
                            }
                            return false;
                        }
                        catch (IllegalArgumentException v8) {
                            throw m44.a("k", (Object)v8, (long)2983760619394412683L, (long)var2_2);
                        }
                    }
                    try {
                        v3 = var1_1.length();
                        v4 /* !! */  = var4_3;
                        if (var2_2 <= 0L) break block30;
                        if (v4 /* !! */  != false) break block32;
                        v4 /* !! */  = (CallSite)true;
                    }
                    catch (IllegalArgumentException v9) {
                        throw m44.a("k", (Object)v9, (long)2983760619394412683L, (long)var2_2);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (var2_2 > 0L) {
                                        if (v3 <= v4 /* !! */ ) break block33;
                                        v3 = m44.a("k", (char)var1_1.charAt(0), (long)3499346784391155017L, (long)var2_2);
                                        v4 /* !! */  = var4_3;
                                    }
                                    if (v4 /* !! */  != false) break block32;
                                }
                                catch (IllegalArgumentException v10) {
                                    throw m44.a("k", (Object)v10, (long)2983760619394412683L, (long)var2_2);
                                }
                                if (v3 == false) break block33;
                            }
                            catch (IllegalArgumentException v11) {
                                throw m44.a("k", (Object)v11, (long)2983760619394412683L, (long)var2_2);
                            }
                            v3 = var1_1.charAt(1);
                            if (var4_3 != false) break block32;
                        }
                        catch (IllegalArgumentException v12) {
                            throw m44.a("k", (Object)v12, (long)2983760619394412683L, (long)var2_2);
                        }
                        if (v3 != lqx.b("k", (int)25033, (long)(6616698313326812513L ^ var2_2))) break block33;
                    }
                    catch (IllegalArgumentException v13) {
                        throw m44.a("k", (Object)v13, (long)2983760619394412683L, (long)var2_2);
                    }
                    return false;
                }
                catch (IllegalArgumentException v14) {
                    throw m44.a("k", (Object)v14, (long)2983760619394412683L, (long)var2_2);
                }
            }
            v3 = true;
        }
        return (boolean)v3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String E(Object[] var0) {
        block126: {
            block124: {
                block125: {
                    block132: {
                        block129: {
                            block130: {
                                block127: {
                                    block128: {
                                        block123: {
                                            block120: {
                                                block121: {
                                                    block114: {
                                                        block110: {
                                                            block111: {
                                                                block112: {
                                                                    block113: {
                                                                        block107: {
                                                                            block108: {
                                                                                block109: {
                                                                                    block105: {
                                                                                        block106: {
                                                                                            block104: {
                                                                                                block102: {
                                                                                                    block103: {
                                                                                                        var1_1 = (String)var0[0];
                                                                                                        var3_2 = (Long)var0[1];
                                                                                                        var2_3 = (String)var0[2];
                                                                                                        var3_2 = lqx.b ^ var3_2;
                                                                                                        var5_4 = m44.a("m", (long)4435261812186004917L, (long)var3_2);
                                                                                                        try {
                                                                                                            try {
                                                                                                                v0 /* !! */  = var1_1.equals(var2_3);
                                                                                                                if (var5_4 != false) break block102;
                                                                                                                if (v0 /* !! */  == '\u0000') break block103;
                                                                                                            }
                                                                                                            catch (IllegalArgumentException v1) {
                                                                                                                throw m44.a("m", (Object)v1, (long)2334627634080102789L, (long)var3_2);
                                                                                                            }
                                                                                                            return ".";
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v2) {
                                                                                                            throw m44.a("m", (Object)v2, (long)2334627634080102789L, (long)var3_2);
                                                                                                        }
                                                                                                    }
                                                                                                    v0 /* !! */  = lqx.b("k", (int)19505, (long)(7393766662090193300L ^ var3_2));
                                                                                                }
                                                                                                var7_5 = v0 /* !! */ ;
                                                                                                v3 = var6_6 = var1_1.lastIndexOf((String)m44.a("i", (long)2583820530018985140L, (long)var3_2));
                                                                                                try {
                                                                                                    v4 = -1;
                                                                                                    if (var5_4 != false) break block104;
                                                                                                    if (v3 <= v4) {
                                                                                                    }
                                                                                                    ** GOTO lbl52
                                                                                                }
                                                                                                catch (IllegalArgumentException v5) {
                                                                                                    throw m44.a("m", (Object)v5, (long)2334627634080102789L, (long)var3_2);
                                                                                                }
                                                                                                v3 = var6_6 = var1_1.lastIndexOf("\\");
                                                                                                try {
                                                                                                    v4 = -1;
                                                                                                    if (var5_4 != false) break block104;
                                                                                                    if (v3 <= v4) {
                                                                                                    }
                                                                                                    ** GOTO lbl52
                                                                                                }
                                                                                                catch (IllegalArgumentException v6) {
                                                                                                    throw m44.a("m", (Object)v6, (long)2334627634080102789L, (long)var3_2);
                                                                                                }
                                                                                                v3 = var6_6 = var1_1.lastIndexOf("/");
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v7 /* !! */  = var5_4;
                                                                                                            if (var3_2 >= 0L) {
                                                                                                                if (v7 /* !! */  != false) break block105;
                                                                                                                v7 /* !! */  = (CallSite)-1;
                                                                                                            }
                                                                                                            if (v3 <= v7 /* !! */ ) break block106;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v8) {
                                                                                                            throw m44.a("m", (Object)v8, (long)2334627634080102789L, (long)var3_2);
                                                                                                        }
lbl52:
                                                                                                        // 3 sources

                                                                                                        v3 = var6_6;
                                                                                                        v9 = var5_4;
                                                                                                        if (var3_2 >= 0L) {
                                                                                                            if (v9 != false) break block105;
                                                                                                        }
                                                                                                        ** GOTO lbl72
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v10) {
                                                                                                        throw m44.a("m", (Object)v10, (long)2334627634080102789L, (long)var3_2);
                                                                                                    }
                                                                                                    v4 = -1;
                                                                                                }
                                                                                                catch (IllegalArgumentException v11) {
                                                                                                    throw m44.a("m", (Object)v11, (long)2334627634080102789L, (long)var3_2);
                                                                                                }
                                                                                            }
                                                                                            if (v3 > v4) {
                                                                                                var7_5 = var1_1.charAt(var6_6);
                                                                                            }
                                                                                        }
                                                                                        v3 = var7_5;
                                                                                    }
                                                                                    try {
                                                                                        v9 = var5_4;
lbl72:
                                                                                        // 2 sources

                                                                                        if (v9 != false) break block107;
                                                                                        if (v3 != 0) break block108;
                                                                                    }
                                                                                    catch (IllegalArgumentException v12) {
                                                                                        throw m44.a("m", (Object)v12, (long)2334627634080102789L, (long)var3_2);
                                                                                    }
                                                                                    v3 = var6_6 = var2_3.lastIndexOf((String)m44.a("i", (long)2583820530018985140L, (long)var3_2));
                                                                                    try {
                                                                                        v13 = -1;
                                                                                        if (var5_4 != false) break block109;
                                                                                        if (v3 <= v13) {
                                                                                        }
                                                                                        ** GOTO lbl107
                                                                                    }
                                                                                    catch (IllegalArgumentException v14) {
                                                                                        throw m44.a("m", (Object)v14, (long)2334627634080102789L, (long)var3_2);
                                                                                    }
                                                                                    v3 = var6_6 = var2_3.lastIndexOf("\\");
                                                                                    try {
                                                                                        v13 = -1;
                                                                                        if (var5_4 != false) break block109;
                                                                                        if (v3 <= v13) {
                                                                                        }
                                                                                        ** GOTO lbl107
                                                                                    }
                                                                                    catch (IllegalArgumentException v15) {
                                                                                        throw m44.a("m", (Object)v15, (long)2334627634080102789L, (long)var3_2);
                                                                                    }
                                                                                    v3 = var6_6 = var2_3.lastIndexOf("/");
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v16 /* !! */  = var5_4;
                                                                                                if (var3_2 >= 0L) {
                                                                                                    if (v16 /* !! */  != false) break block107;
                                                                                                    v16 /* !! */  = (CallSite)-1;
                                                                                                }
                                                                                                if (v3 <= v16 /* !! */ ) break block108;
                                                                                            }
                                                                                            catch (IllegalArgumentException v17) {
                                                                                                throw m44.a("m", (Object)v17, (long)2334627634080102789L, (long)var3_2);
                                                                                            }
lbl107:
                                                                                            // 3 sources

                                                                                            v3 = var6_6;
                                                                                            v18 = var5_4;
                                                                                            if (var3_2 >= 0L) {
                                                                                                if (v18 != false) break block107;
                                                                                            }
                                                                                            ** GOTO lbl130
                                                                                        }
                                                                                        catch (IllegalArgumentException v19) {
                                                                                            throw m44.a("m", (Object)v19, (long)2334627634080102789L, (long)var3_2);
                                                                                        }
                                                                                        v13 = -1;
                                                                                    }
                                                                                    catch (IllegalArgumentException v20) {
                                                                                        throw m44.a("m", (Object)v20, (long)2334627634080102789L, (long)var3_2);
                                                                                    }
                                                                                }
                                                                                if (v3 > v13) {
                                                                                    var7_5 = var2_3.charAt(var6_6);
                                                                                }
                                                                            }
                                                                            v3 = var1_1.trim().length();
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v18 = var5_4;
lbl130:
                                                                                        // 2 sources

                                                                                        if (v18 != false) break block110;
                                                                                        if (v3 != 0) break block111;
                                                                                    }
                                                                                    catch (IllegalArgumentException v21) {
                                                                                        throw m44.a("m", (Object)v21, (long)2334627634080102789L, (long)var3_2);
                                                                                    }
                                                                                    v22 = var2_3;
                                                                                    if (var5_4 != false) break block112;
                                                                                }
                                                                                catch (IllegalArgumentException v23) {
                                                                                    throw m44.a("m", (Object)v23, (long)2334627634080102789L, (long)var3_2);
                                                                                }
                                                                                if (v22.charAt(0) != var7_5) break block113;
                                                                            }
                                                                            catch (IllegalArgumentException v24) {
                                                                                throw m44.a("m", (Object)v24, (long)2334627634080102789L, (long)var3_2);
                                                                            }
                                                                            return var2_3.substring(1);
                                                                        }
                                                                        catch (IllegalArgumentException v25) {
                                                                            throw m44.a("m", (Object)v25, (long)2334627634080102789L, (long)var3_2);
                                                                        }
                                                                    }
                                                                    v22 = var2_3;
                                                                }
                                                                return v22;
                                                            }
                                                            v3 = var7_5;
                                                        }
                                                        var8_7 = String.valueOf((char)v3);
                                                        var9_8 = new StringTokenizer(var1_1, var8_7, true);
                                                        var10_9 = new StringTokenizer(var2_3, var8_7, true);
                                                        var11_10 = var9_8.countTokens();
                                                        var12_11 = var10_9.countTokens();
                                                        var13_12 = new StringBuilder();
                                                        for (var14_13 = 0; var14_13 < var11_10 && var14_13 < var12_11; ++var14_13) {
                                                            var15_15 = var9_8.nextToken();
                                                            var16_16 = var10_9.nextToken();
                                                            try {
                                                                try {
                                                                    v26 = var15_15;
                                                                    if (var5_4 != false) break block114;
                                                                    if (!v26.equals(var16_16)) break;
                                                                }
                                                                catch (IllegalArgumentException v27) {
                                                                    throw m44.a("m", (Object)v27, (long)2334627634080102789L, (long)var3_2);
                                                                }
                                                                var13_12.append((String)var15_15);
                                                                if (var5_4 == false) continue;
                                                                if (var3_2 < 0L) break;
                                                                break;
                                                            }
                                                            catch (IllegalArgumentException v28) {
                                                                throw m44.a("m", (Object)v28, (long)2334627634080102789L, (long)var3_2);
                                                            }
                                                        }
                                                        v26 = var13_12.toString();
                                                    }
                                                    if ((var14_14 = v26).length() == 0) {
                                                        block119: {
                                                            block117: {
                                                                var15_15 = new StringTokenizer(var1_1, var8_7);
                                                                var16_17 = var15_15.countTokens();
                                                                var17_19 = new StringBuilder();
                                                                var18_21 = 0;
                                                                while (var18_21 < var16_17) {
                                                                    block115: {
                                                                        block116: {
                                                                            block118: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            var17_19.append((String)lqx.a("j", (int)889, (long)(1988519405662067661L ^ var3_2)));
                                                                                            v29 = var5_4;
                                                                                            if (var3_2 < 0L) break block115;
                                                                                            if (v29 != false) break block116;
                                                                                            v30 = var18_21;
                                                                                            if (var3_2 < 0L || var5_4 != false) break block117;
                                                                                        }
                                                                                        catch (IllegalArgumentException v31) {
                                                                                            throw m44.a("m", (Object)v31, (long)2334627634080102789L, (long)var3_2);
                                                                                        }
                                                                                        if (v30 >= var16_17 - 1) break block118;
                                                                                    }
                                                                                    catch (IllegalArgumentException v32) {
                                                                                        throw m44.a("m", (Object)v32, (long)2334627634080102789L, (long)var3_2);
                                                                                    }
                                                                                    var17_19.append(var8_7);
                                                                                }
                                                                                catch (IllegalArgumentException v33) {
                                                                                    throw m44.a("m", (Object)v33, (long)2334627634080102789L, (long)var3_2);
                                                                                }
                                                                            }
                                                                            ++var18_21;
                                                                        }
                                                                        v29 = var5_4;
                                                                    }
                                                                    if (v29 == false) continue;
                                                                }
                                                                try {
                                                                    v34 = var2_3;
                                                                    if (var3_2 < 0L || var5_4 != false) break block119;
                                                                    v30 = v34.startsWith(var8_7);
                                                                }
                                                                catch (IllegalArgumentException v35) {
                                                                    throw m44.a("m", (Object)v35, (long)2334627634080102789L, (long)var3_2);
                                                                }
                                                            }
                                                            try {
                                                                if (v30 == 0) {
                                                                    var17_19.append(var8_7);
                                                                }
                                                            }
                                                            catch (IllegalArgumentException v36) {
                                                                throw m44.a("m", (Object)v36, (long)2334627634080102789L, (long)var3_2);
                                                            }
                                                            var17_19.append(var2_3);
                                                            v34 = var17_19.toString();
                                                        }
                                                        return v34;
                                                    }
                                                    var15_15 = new StringTokenizer(var14_14, var8_7, true);
                                                    var16_18 = var15_15.countTokens();
                                                    var17_20 = var2_3.substring(var14_14.length());
                                                    var18_22 = new StringBuilder();
                                                    try {
                                                        block122: {
                                                            try {
                                                                try {
                                                                    v37 = var11_10;
                                                                    if (var3_2 < 0L) break block120;
                                                                    v38 = var16_18;
                                                                    if (var5_4 != false) break block121;
                                                                    if (v37 != v38) break block122;
                                                                }
                                                                catch (IllegalArgumentException v39) {
                                                                    throw m44.a("m", (Object)v39, (long)2334627634080102789L, (long)var3_2);
                                                                }
                                                                var18_22.append(".");
                                                                if (var3_2 <= 0L || var5_4 == false) break block123;
                                                            }
                                                            catch (IllegalArgumentException v40) {
                                                                throw m44.a("m", (Object)v40, (long)2334627634080102789L, (long)var3_2);
                                                            }
                                                        }
                                                        v41 = var11_10;
                                                        v38 = var16_18;
                                                    }
                                                    catch (IllegalArgumentException v42) {
                                                        throw m44.a("m", (Object)v42, (long)2334627634080102789L, (long)var3_2);
                                                    }
                                                }
                                                v37 = v41 - v38;
                                            }
                                            var19_23 = v37;
                                            var18_22.append((String)lqx.a("j", (int)20639, (long)(1282253100905891847L ^ var3_2)));
                                            --var19_23;
                                            var20_24 = 0;
                                            block84: while (var20_24 < var19_23 / 2) {
                                                try {
                                                    var18_22.append(var8_7);
                                                    v43 = var18_22.append((String)lqx.a("j", (int)20639, (long)(1282253100905891847L ^ var3_2)));
                                                    if (var3_2 <= 0L) break block124;
                                                    ++var20_24;
                                                    while (var5_4 == false) {
                                                        if (var5_4 == false) continue block84;
                                                        if (var3_2 < 0L) continue;
                                                        break block84;
                                                    }
                                                    break block125;
                                                }
                                                catch (IllegalArgumentException v44) {
                                                    throw m44.a("m", (Object)v44, (long)2334627634080102789L, (long)var3_2);
                                                }
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v45 = var17_20;
                                                                    if (var5_4 != false) break block126;
                                                                    if (v45.length() <= 0) break block125;
                                                                }
                                                                catch (IllegalArgumentException v46) {
                                                                    throw m44.a("m", (Object)v46, (long)2334627634080102789L, (long)var3_2);
                                                                }
                                                                v47 /* !! */  = var18_22.length();
                                                                v48 = 1;
                                                                v49 = var5_4;
                                                                if (var3_2 >= 0L) {
                                                                    if (v49 != false) break block127;
                                                                }
                                                                ** GOTO lbl350
                                                            }
                                                            catch (IllegalArgumentException v50) {
                                                                throw m44.a("m", (Object)v50, (long)2334627634080102789L, (long)var3_2);
                                                            }
                                                            if (v47 /* !! */  == v48) {
                                                            }
                                                            ** GOTO lbl337
                                                        }
                                                        catch (IllegalArgumentException v51) {
                                                            throw m44.a("m", (Object)v51, (long)2334627634080102789L, (long)var3_2);
                                                        }
                                                        v47 /* !! */  = (int)var18_22.toString().equals(".");
                                                        if (var5_4 != false) break block128;
                                                    }
                                                    catch (IllegalArgumentException v52) {
                                                        throw m44.a("m", (Object)v52, (long)2334627634080102789L, (long)var3_2);
                                                    }
                                                    if (var3_2 <= 0L) break block128;
                                                    if (v47 /* !! */  != 0) {
                                                    }
                                                    ** GOTO lbl337
                                                }
                                                catch (IllegalArgumentException v53) {
                                                    throw m44.a("m", (Object)v53, (long)2334627634080102789L, (long)var3_2);
                                                }
                                                v54 = var18_22;
                                                if (var5_4 != false) break block125;
                                            }
                                            catch (IllegalArgumentException v55) {
                                                throw m44.a("m", (Object)v55, (long)2334627634080102789L, (long)var3_2);
                                            }
                                            v54.setLength(0);
                                            if (var17_20.charAt(0) != var7_5) break block129;
                                        }
                                        catch (IllegalArgumentException v56) {
                                            throw m44.a("m", (Object)v56, (long)2334627634080102789L, (long)var3_2);
                                        }
                                        var17_20 = var17_20.substring(1);
                                        try {
                                            v47 /* !! */  = (int)var5_4;
                                            if (var3_2 < 0L) break block128;
                                            if (v47 /* !! */  == 0) break block129;
lbl337:
                                            // 3 sources

                                            v47 /* !! */  = (int)m44.a("r", (Object)var18_22, (int)(var18_22.length() - 1), (long)2700696608840059103L, (long)var3_2);
                                        }
                                        catch (IllegalArgumentException v57) {
                                            throw m44.a("m", (Object)v57, (long)2334627634080102789L, (long)var3_2);
                                        }
                                    }
                                    v48 = var7_5;
                                }
                                try {
                                    block131: {
                                        try {
                                            try {
                                                try {
                                                    if (var3_2 <= 0L) break block130;
                                                    v49 = var5_4;
lbl350:
                                                    // 2 sources

                                                    if (v49 != false) break block130;
                                                    if (v47 /* !! */  != v48) break block131;
                                                }
                                                catch (IllegalArgumentException v58) {
                                                    throw m44.a("m", (Object)v58, (long)2334627634080102789L, (long)var3_2);
                                                }
                                                if (var17_20.charAt(0) != var7_5) break block129;
                                            }
                                            catch (IllegalArgumentException v59) {
                                                throw m44.a("m", (Object)v59, (long)2334627634080102789L, (long)var3_2);
                                            }
                                            v60 = var18_22;
                                            if (var3_2 <= 0L) break block132;
                                            v60.setLength(var18_22.length() - 1);
                                            if (var5_4 == false) break block129;
                                        }
                                        catch (IllegalArgumentException v61) {
                                            throw m44.a("m", (Object)v61, (long)2334627634080102789L, (long)var3_2);
                                        }
                                    }
                                    v47 /* !! */  = var17_20.charAt(0);
                                    v48 = var7_5;
                                }
                                catch (IllegalArgumentException v62) {
                                    throw m44.a("m", (Object)v62, (long)2334627634080102789L, (long)var3_2);
                                }
                            }
                            try {
                                if (v47 /* !! */  != v48) {
                                    var18_22.append(var8_7);
                                }
                            }
                            catch (IllegalArgumentException v63) {
                                throw m44.a("m", (Object)v63, (long)2334627634080102789L, (long)var3_2);
                            }
                        }
                        v60 = var18_22;
                    }
                    v54 = v60.append(var17_20);
                }
                v43 = var18_22;
            }
            v45 = v43.toString();
        }
        return v45;
    }

    public static String i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        File file = (File)objectArray[1];
        String string = (String)objectArray[2];
        yv yv2 = (yv)objectArray[3];
        long l11 = (l10 = b ^ l10) ^ 0x73FD7D75E22AL;
        FileInputStream fileInputStream = new FileInputStream(file);
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = yv2;
        objectArray2[3] = l11;
        objectArray2[2] = (long)(m44.a("r", (Object)fileInputStream, (long)-1708011262801966781L, (long)l10) + lqx.b("k", (int)11060, (long)(0x49903FC992F2D5A0L ^ l10)));
        objectArray2[1] = string;
        objectArray2[0] = fileInputStream;
        return m44.a("m", (Object)objectArray2, (long)-781516489204842229L, (long)l10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static boolean a(Object[] var0) {
        block51: {
            block50: {
                block49: {
                    block44: {
                        block52: {
                            block37: {
                                var2_1 = (Long)var0[0];
                                var1_2 = (String)var0[1];
                                var4_3 = (sz)var0[2];
                                var5_4 = (var2_1 = lqx.b ^ var2_1) ^ 164602738685L;
                                var8_5 = lqx.a("j", (int)8565, (long)(8802162650066678526L ^ var2_1));
                                var7_6 = m44.a("o", (long)3929135680327956159L, (long)var2_1);
                                var9_7 = null;
                                try {
                                    var9_7 = new PrintWriter(new FileWriter(var1_2));
                                    var9_7.println((String)var8_5);
                                    v0 = var9_7;
                                    if (var7_6 != false) break block37;
                                }
                                catch (IOException var10_8) {
                                    block41: {
                                        block40: {
                                            try {
                                                block39: {
                                                    block38: {
                                                        try {
                                                            v1 = var4_3;
                                                            if (var7_6 != false) break block38;
                                                            if (v1 == null) break block39;
                                                        }
                                                        catch (IOException v2) {
                                                            throw m44.a("o", (Object)v2, (long)3128995126472782479L, (long)var2_1);
                                                        }
                                                        v1 = var4_3;
                                                    }
                                                    v1.Z(var5_4, m44.a("p", (Object)var10_8, (long)3504279937949411392L, (long)var2_1));
                                                }
                                                var11_10 = false;
                                            }
                                            catch (Throwable var12_12) {
                                                block43: {
                                                    block42: {
                                                        try {
                                                            v3 = var9_7;
                                                            if (var7_6 != false) break block42;
                                                            if (v3 == null) break block43;
                                                        }
                                                        catch (IOException v4) {
                                                            throw m44.a("o", (Object)v4, (long)3128995126472782479L, (long)var2_1);
                                                        }
                                                        v3 = var9_7;
                                                    }
                                                    m44.a("p", (Object)v3, (long)3612614489794412629L, (long)var2_1);
                                                }
                                                throw var12_12;
                                            }
                                            try {
                                                v5 = var9_7;
                                                if (var7_6 != false) break block40;
                                                if (v5 == null) break block41;
                                            }
                                            catch (IOException v6) {
                                                throw m44.a("o", (Object)v6, (long)3128995126472782479L, (long)var2_1);
                                            }
                                            v5 = var9_7;
                                        }
                                        m44.a("p", (Object)v5, (long)3612614489794412629L, (long)var2_1);
                                    }
                                    return var11_10;
                                }
                                if (v0 == null) break block52;
                                v0 = var9_7;
                            }
                            m44.a("p", (Object)v0, (long)3612614489794412629L, (long)var2_1);
                        }
                        var10_9 = null;
                        var11_11 = null;
                        var10_9 = new BufferedReader(new FileReader(var1_2));
                        var11_11 = var10_9.readLine();
                        try {
                            if (var2_1 < 0L) break block44;
                            v7 = var10_9;
                            if (var7_6 == false) {
                                if (v7 == null) break block44;
                            }
                            ** GOTO lbl78
                        }
                        catch (IOException v8) {
                            throw m44.a("o", (Object)v8, (long)3128995126472782479L, (long)var2_1);
                        }
                        try {
                            v7 = var10_9;
lbl78:
                            // 2 sources

                            m44.a("p", (Object)v7, (long)3315133734893788739L, (long)var2_1);
                        }
                        catch (IOException var12_13) {}
                        break block44;
                        catch (IOException var12_14) {
                            block47: {
                                try {
                                    block46: {
                                        block45: {
                                            try {
                                                v9 = var4_3;
                                                if (var7_6 != false) break block45;
                                                if (v9 == null) break block46;
                                            }
                                            catch (IOException v10) {
                                                throw m44.a("o", (Object)v10, (long)3128995126472782479L, (long)var2_1);
                                            }
                                            v9 = var4_3;
                                        }
                                        v9.Z(var5_4, m44.a("p", (Object)var12_14, (long)3504279937949411392L, (long)var2_1));
                                    }
                                    var13_15 = false;
                                }
                                catch (Throwable var15_17) {
                                    block48: {
                                        try {
                                            if (var2_1 < 0L) break block48;
                                            v11 = var10_9;
                                            if (var7_6 == false) {
                                                if (v11 == null) break block48;
                                            }
                                            ** GOTO lbl109
                                        }
                                        catch (IOException v12) {
                                            throw m44.a("o", (Object)v12, (long)3128995126472782479L, (long)var2_1);
                                        }
                                        try {
                                            v11 = var10_9;
lbl109:
                                            // 2 sources

                                            m44.a("p", (Object)v11, (long)3315133734893788739L, (long)var2_1);
                                        }
                                        catch (IOException var16_18) {
                                            // empty catch block
                                        }
                                    }
                                    throw var15_17;
                                }
                                try {
                                    if (var2_1 < 0L) break block47;
                                    v13 = var10_9;
                                    if (var7_6 == false) {
                                        if (v13 == null) break block47;
                                    }
                                    ** GOTO lbl126
                                }
                                catch (IOException v14) {
                                    throw m44.a("o", (Object)v14, (long)3128995126472782479L, (long)var2_1);
                                }
                                try {
                                    v13 = var10_9;
lbl126:
                                    // 2 sources

                                    m44.a("p", (Object)v13, (long)3315133734893788739L, (long)var2_1);
                                }
                                catch (IOException var14_16) {
                                    // empty catch block
                                }
                            }
                            return var13_15;
                        }
                    }
                    try {
                        v15 = var11_11;
                        if (var2_1 <= 0L || var7_6 != false) break block49;
                        if (v15 == null) break block50;
                    }
                    catch (IOException v16) {
                        throw m44.a("o", (Object)v16, (long)3128995126472782479L, (long)var2_1);
                    }
                    v15 = var8_5;
                }
                try {
                    v17 = v15.equals(var11_11);
                    if (var7_6 != false) break block51;
                    if (!v17) break block50;
                }
                catch (IOException v18) {
                    throw m44.a("o", (Object)v18, (long)3128995126472782479L, (long)var2_1);
                }
                v17 = true;
                break block51;
            }
            v17 = false;
        }
        return v17;
    }

    public static boolean v(ZipFile zipFile, ZipEntry zipEntry, long l10) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                block6: {
                    long l11 = l10 = b ^ l10;
                    long l12 = l11 ^ 0x70BB2F499BC9L;
                    long l13 = l11 ^ 0x3235E0F28D42L;
                    callSite = m44.a("o", (long)2379917980471435583L, (long)l10);
                    try {
                        try {
                            object = m44.a("o", zipEntry.getName(), (long)l13, (long)4567709465842085358L, (long)l10);
                            if (callSite != false) break block6;
                            if (object == false) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("o", (Object)illegalArgumentException, (long)4389987790977541391L, (long)l10);
                        }
                        Object[] objectArray = new Object[3];
                        objectArray[2] = zipEntry;
                        objectArray[1] = zipFile;
                        objectArray[0] = l12;
                        object = m44.a("o", (Object)objectArray, (long)4065435057310683980L, (long)l10);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("o", (Object)illegalArgumentException, (long)4389987790977541391L, (long)l10);
                    }
                }
                try {
                    if (callSite != false) break block8;
                    if (object == false) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)4389987790977541391L, (long)l10);
                }
                object = true;
                break block8;
            }
            object = false;
        }
        return (boolean)object;
    }

    public static String u(Object[] objectArray) {
        Object object;
        block8: {
            String string;
            block9: {
                string = (String)objectArray[0];
                long l10 = (Long)objectArray[1];
                l10 = b ^ l10;
                CallSite callSite = null;
                CallSite callSite2 = m44.a("h", (long)-265624519605715864L, (long)l10);
                try {
                    callSite = m44.a("h", string, (Object)m44.a("l", (long)-41584419677530605L, (long)l10), (long)-159582572258395922L, (long)l10);
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    try {
                        callSite = m44.a("h", string, (Object)lqx.a("j", (int)26184, (long)(0x432570837A98FF1FL ^ l10)), (long)-159582572258395922L, (long)l10);
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException2) {
                        // empty catch block
                    }
                }
                try {
                    try {
                        object = callSite;
                        if (callSite2 != false) break block8;
                        if (object == null) break block9;
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                        throw m44.a("h", (Object)unsupportedEncodingException, (long)-2181084173113984936L, (long)l10);
                    }
                    return callSite;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    throw m44.a("h", (Object)unsupportedEncodingException, (long)-2181084173113984936L, (long)l10);
                }
            }
            object = string;
        }
        return object;
    }

    public static BufferedReader F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        File file = (File)objectArray[1];
        sz sz2 = (sz)objectArray[2];
        long l11 = (l10 = b ^ l10) ^ 0x365ED4A44BDCL;
        sz sz3 = sz2;
        String string = null;
        FileInputStream fileInputStream = new FileInputStream(file);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = sz3;
        objectArray2[2] = string;
        objectArray2[1] = fileInputStream;
        objectArray2[0] = l11;
        return m44.a("k", (Object)objectArray2, (long)-7969396586608723814L, (long)l10);
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x77B4;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqx", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            lqx.d[n11] = lqx.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lqx.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lqx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1ABC;
        if (h[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqx", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lqx.h[n11] = n12;
        }
        return h[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lqx.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lqx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4B54;
        if (k[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = j[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])l.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqx", exception);
            }
            long l13 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            lqx.k[n11] = l13;
        }
        return k[n11];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = lqx.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lqx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lqx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lqx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(lqx.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

