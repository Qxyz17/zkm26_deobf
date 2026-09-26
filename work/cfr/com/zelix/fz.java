/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.cf;
import com.zelix.g1;
import com.zelix.l62;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v8;
import com.zelix.y5;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fz {
    private g1 Z;
    public static final int X;
    private boolean u;
    private String m;
    private ArrayList r;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public boolean T(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("u", (Object)this, (long)8329770795214085545L, (long)l10);
    }

    public String v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("p", (Object)this, (long)-2869987220130045043L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void h(Object[] var1_1) {
        block27: {
            block29: {
                block28: {
                    var3_2 = (Long)var1_1[0];
                    var2_3 = (fz)var1_1[1];
                    var5_4 = (var3_2 = fz.a ^ var3_2) ^ 132229685147806L;
                    var7_5 = m44.a("i", (long)-2929405691100259522L, (long)var3_2);
                    try {
                        try {
                            try {
                                v0 = this;
                                v1 /* !! */  = m44.a("w", (Object)this, (long)-3723538944052944285L, (long)var3_2);
                                if (var7_5 == null) break block27;
                                if (v1 /* !! */  != false) break block28;
                            }
                            catch (n9 v2) {
                                throw m44.a("i", (Object)v2, (long)-3504674201641978295L, (long)var3_2);
                            }
                            v1 /* !! */  = m44.a("w", (Object)var2_3, (long)-3723538944052944285L, (long)var3_2);
                            if (var7_5 == null) break block27;
                        }
                        catch (n9 v3) {
                            throw m44.a("i", (Object)v3, (long)-3504674201641978295L, (long)var3_2);
                        }
                        if (v1 /* !! */  == false) break block29;
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)-3504674201641978295L, (long)var3_2);
                    }
                }
                v1 /* !! */  = (CallSite)true;
                break block27;
            }
            v1 /* !! */  = (CallSite)false;
        }
        m44.a("u", (Object)v0, (boolean)v1 /* !! */ , (long)-3723538944052944285L, (long)var3_2);
        v5 = new Object[1];
        v5[0] = var5_4;
        var8_6 = m44.a("i", (Object)v5, (long)-3117982251112616647L, (long)var3_2);
        var9_7 = m44.a("v", (Object)m44.a("w", (Object)this, (long)-3055659726402471890L, (long)var3_2), (long)-2888778331913262416L, (long)var3_2).iterator();
        block22: while (var9_7.hasNext()) {
            v6 /* !! */  = var9_7.next();
            do {
                block30: {
                    var10_8 = (Map.Entry)v6 /* !! */ ;
                    var11_9 = (String)var10_8.getValue();
                    try {
                        try {
                            v7 = var11_9;
                            if (var7_5 != null) {
                                if (v7 == null) break block30;
                            }
                            ** GOTO lbl66
                        }
                        catch (n9 v8) {
                            throw m44.a("i", (Object)v8, (long)-3504674201641978295L, (long)var3_2);
                        }
                        var8_6.add(var11_9);
                    }
                    catch (n9 v9) {
                        throw m44.a("i", (Object)v9, (long)-3504674201641978295L, (long)var3_2);
                    }
                }
                if (var7_5 != null) continue block22;
                v6 /* !! */  = m44.a("v", (Object)m44.a("w", (Object)var2_3, (long)-3055659726402471890L, (long)var3_2), (long)-2888778331913262416L, (long)var3_2).iterator();
            } while (var3_2 < 0L);
        }
        var9_7 = v6 /* !! */ ;
        while (var9_7.hasNext()) {
            block33: {
                block32: {
                    block34: {
                        block31: {
                            var10_8 = (Map.Entry)var9_7.next();
                            var11_9 = (String)var10_8.getKey();
                            v7 = (String)var10_8.getValue();
lbl66:
                            // 2 sources

                            var12_10 = v7;
                            try {
                                try {
                                    try {
                                        if (var3_2 >= 0L && var12_10 != null) {
                                            v10 = var8_6;
                                            if (var3_2 <= 0L || var7_5 == null) break block31;
                                        }
                                        ** GOTO lbl92
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("i", (Object)v11, (long)-3504674201641978295L, (long)var3_2);
                                    }
                                    if (!v10.add(var12_10)) break block32;
                                }
                                catch (n9 v12) {
                                    throw m44.a("i", (Object)v12, (long)-3504674201641978295L, (long)var3_2);
                                }
                                v10 = m44.a("v", (Object)m44.a("w", (Object)this, (long)-3055659726402471890L, (long)var3_2), (Object)var11_9, (Object)var12_10, (long)-3196539299498506685L, (long)var3_2);
                            }
                            catch (n9 v13) {
                                throw m44.a("i", (Object)v13, (long)-3504674201641978295L, (long)var3_2);
                            }
                        }
                        try {
                            try {
                                try {
                                    v14 = var7_5;
                                    if (var3_2 < 0L) break block33;
                                    if (v14 != null) break block32;
lbl92:
                                    // 2 sources

                                    v15 = m44.a("w", (Object)this, (long)-3055659726402471890L, (long)var3_2);
                                    if (var3_2 <= 0L) break block32;
                                    v16 = var11_9;
                                    if (var7_5 == null) break block34;
                                }
                                catch (n9 v17) {
                                    throw m44.a("i", (Object)v17, (long)-3504674201641978295L, (long)var3_2);
                                }
                                if (m44.a("v", (Object)v15, (Object)v16, (long)-3691577887868357451L, (long)var3_2) != false) break block32;
                            }
                            catch (n9 v18) {
                                throw m44.a("i", (Object)v18, (long)-3504674201641978295L, (long)var3_2);
                            }
                            v19 = m44.a("w", (Object)this, (long)-3055659726402471890L, (long)var3_2);
                            v16 = var11_9;
                        }
                        catch (n9 v20) {
                            throw m44.a("i", (Object)v20, (long)-3504674201641978295L, (long)var3_2);
                        }
                    }
                    v15 = m44.a("v", (Object)v19, (Object)v16, null, (long)-3196539299498506685L, (long)var3_2);
                }
                v14 = var7_5;
            }
            if (v14 != null) continue;
        }
    }

    public void r(Object[] objectArray) {
        CallSite callSite;
        String string;
        long l10;
        long l11;
        Map map;
        block9: {
            String string2 = (String)objectArray[0];
            map = (Map)objectArray[1];
            l11 = (Long)objectArray[2];
            l10 = (l11 = a ^ l11) ^ 0x7524D2E6A8F5L;
            string = (String)((Object)fz.a("s", (int)13071, (long)(0x2FA948E1B1871A80L ^ l11))) + (String)((Object)m44.a("w", (Object)this, (long)1082198748981769378L, (long)l11)) + (String)((Object)fz.a("s", (int)15674, (long)(0x57F4EBF0304D94B3L ^ l11))) + string2 + "'";
            CallSite callSite2 = m44.a("i", (Object)new Object[]{m44.a("w", (Object)this, (long)1082198748981769378L, (long)l11)}, (long)586973755395116259L, (long)l11);
            _f _f2 = l62.B((String)((Object)callSite2), l10);
            callSite = m44.a("i", (long)1054108026714768070L, (long)l11);
            try {
                Object object;
                try {
                    object = _f2;
                    if (callSite == null || object == null) break block9;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)n92, (long)1631637601245573041L, (long)l11);
                }
                object = map.put(_f2, string);
            }
            catch (n9 n93) {
                throw m44.a("i", (Object)n93, (long)1631637601245573041L, (long)l11);
            }
        }
        int n10 = 0;
        while (n10 < ((ArrayList)((Object)m44.a("w", (Object)this, (long)1535472236627312365L, (long)l11))).size()) {
            CallSite callSite3;
            block10: {
                block11: {
                    block12: {
                        CallSite callSite4 = m44.a("i", (Object)new Object[]{(String)((ArrayList)((Object)m44.a("w", (Object)this, (long)1535472236627312365L, (long)l11))).get(n10)}, (long)586973755395116259L, (long)l11);
                        _f _f3 = l62.B((String)((Object)callSite4), l10);
                        try {
                            try {
                                callSite3 = callSite;
                                if (l11 <= 0L) break block10;
                                if (callSite3 == null) break block11;
                                if (_f3 == null) break block12;
                            }
                            catch (n9 n94) {
                                throw m44.a("i", (Object)n94, (long)1631637601245573041L, (long)l11);
                            }
                            map.put(_f3, string);
                        }
                        catch (n9 n95) {
                            throw m44.a("i", (Object)n95, (long)1631637601245573041L, (long)l11);
                        }
                    }
                    ++n10;
                }
                callSite3 = callSite;
            }
            if (callSite3 != null) continue;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fz(ZipFile var1_1, long var2_2, ZipEntry var4_3, byte var5_4) {
        block55: {
            block48: {
                block46: {
                    block47: {
                        v0 = var6_5 = (var2_2 << 8 | (long)var5_4 << 56 >>> 56) ^ fz.a;
                        v1 = v0 ^ 135418505110994L;
                        var8_6 = (int)(v1 >>> 48);
                        var9_7 = (int)(v1 << 16 >>> 48);
                        var10_8 = (int)(v1 << 32 >>> 32);
                        var11_9 = v0 ^ 90491582352453L;
                        v2 = m44.a("j", (long)-3354116043549434603L, (long)var6_5);
                        super();
                        m44.a("v", (Object)this, (g1)new g1((short)var8_6, (char)var9_7, var10_8), (long)-3192069607151485435L, (long)var6_5);
                        m44.a("v", (Object)this, new ArrayList<E>(), (long)-3847147970477563586L, (long)var6_5);
                        var13_10 = v2;
                        v3 = this;
                        v4 /* !! */  = m44.a("u", (Object)var4_3, (long)-3707194922788577491L, (long)var6_5);
                        if (var13_10 == null) break block46;
                        try {
                            block57: {
                                if (v4 /* !! */  != fz.b("r", (int)10821, (long)(4827711667876500648L ^ var6_5))) break block47;
                                break block57;
                                catch (IOException v5) {
                                    throw m44.a("j", (Object)v5, (long)-3929525570951614366L, (long)var6_5);
                                }
                            }
                            v4 /* !! */  = (CallSite)true;
                            break block46;
                        }
                        catch (IOException v6) {
                            throw m44.a("j", (Object)v6, (long)-3929525570951614366L, (long)var6_5);
                        }
                    }
                    v4 /* !! */  = (CallSite)false;
                }
                m44.a("v", (Object)v3, (boolean)v4 /* !! */ , (long)-3857274535499914168L, (long)var6_5);
                m44.a("v", (Object)this, (String)var4_3.getName().substring((int)m44.a("n", (long)-3656571915684748290L, (long)var6_5)).trim(), (long)-3398099407800177807L, (long)var6_5);
                var14_11 = null;
                var15_12 = null;
                try {
                    var14_11 = m44.a("u", (Object)var1_1, (Object)var4_3, (long)-3222598759668975985L, (long)var6_5);
                    v7 = new Object[4];
                    v7[3] = null;
                    v7[2] = fz.a("s", (int)19045, (long)(7240356738153233467L ^ var6_5));
                    v7[1] = var14_11;
                    v7[0] = var11_9;
                    var15_12 = m44.a("j", (Object)v7, (long)-2954818662889767165L, (long)var6_5);
                    while ((var16_13 = var15_12.readLine()) != null) {
                        block54: {
                            block53: {
                                block49: {
                                    block52: {
                                        block50: {
                                            block51: {
                                                block58: {
                                                    var17_16 = var16_13;
                                                    var18_17 = var16_13.indexOf("#");
                                                    if (var2_2 < 0L || var13_10 == null) break block48;
                                                    v8 = var18_17;
                                                    if (var2_2 <= 0L || var13_10 == null) break block49;
                                                    break block58;
                                                    catch (IOException v9) {
                                                        throw m44.a("j", (Object)v9, (long)-3929525570951614366L, (long)var6_5);
                                                    }
                                                }
                                                try {
                                                    block59: {
                                                        if (v8 == -1) break block50;
                                                        break block59;
                                                        catch (IOException v10) {
                                                            throw m44.a("j", (Object)v10, (long)-3929525570951614366L, (long)var6_5);
                                                        }
                                                    }
                                                    if (var18_17 <= 0) break block51;
                                                }
                                                catch (IOException v11) {
                                                    throw m44.a("j", (Object)v11, (long)-3929525570951614366L, (long)var6_5);
                                                }
                                                var17_16 = var16_13.substring(0, var18_17 - 1);
                                                if (var2_2 <= 0L) break block52;
                                                if (var13_10 != null) break block50;
                                            }
                                            var17_16 = "";
                                        }
                                        var17_16 = var17_16.trim();
                                    }
                                    try {
                                        v12 = var17_16;
                                        if (var13_10 == null) break block53;
                                        v8 = v12.length();
                                    }
                                    catch (IOException v13) {
                                        throw m44.a("j", (Object)v13, (long)-3929525570951614366L, (long)var6_5);
                                    }
                                }
                                if (var5_4 < 0) ** GOTO lbl87
                                if (v8 <= 0) ** GOTO lbl95
                                try {
                                    block60: {
                                        v8 = (int)m44.a("t", (Object)this, (long)-3847147970477563586L, (long)var6_5).add(var17_16);
lbl87:
                                        // 2 sources

                                        m44.a("u", (Object)m44.a("t", (Object)this, (long)-3192069607151485435L, (long)var6_5), (Object)var16_13, (Object)var17_16, (long)-3059918591954861976L, (long)var6_5);
                                        v14 = var13_10;
                                        if (var5_4 <= 0) break block54;
                                        if (v14 != null) break block53;
                                        break block60;
                                        catch (IOException v15) {
                                            throw m44.a("j", (Object)v15, (long)-3929525570951614366L, (long)var6_5);
                                        }
                                    }
                                    v12 = m44.a("u", (Object)m44.a("t", (Object)this, (long)-3192069607151485435L, (long)var6_5), (Object)var16_13, null, (long)-3059918591954861976L, (long)var6_5);
                                }
                                catch (IOException v16) {
                                    throw m44.a("j", (Object)v16, (long)-3929525570951614366L, (long)var6_5);
                                }
                            }
                            v14 = var13_10;
                        }
                        if (v14 != null) continue;
                    }
                }
                catch (Throwable var19_18) {
                    block56: {
                        try {
                            if (var5_4 < 0) break block56;
                            v17 = var15_12;
                            if (var13_10 == null) ** GOTO lbl116
                            if (v17 != null) {
                            }
                            ** GOTO lbl122
                        }
                        catch (IOException v18) {
                            throw m44.a("j", (Object)v18, (long)-3929525570951614366L, (long)var6_5);
                        }
                        try {
                            v17 = var15_12;
lbl116:
                            // 2 sources

                            m44.a("u", v17, (long)-3955046040652023458L, (long)var6_5);
                            break block56;
                        }
                        catch (IOException var20_19) {
                            try {
                                try {
                                    if (var2_2 >= 0L && var13_10 != null) break block56;
lbl122:
                                    // 2 sources

                                    if (var5_4 < 0) break block56;
                                    v19 = var14_11;
                                    if (var13_10 != null) {
                                    }
                                    ** GOTO lbl135
                                }
                                catch (IOException v20) {
                                    throw m44.a("j", (Object)v20, (long)-3929525570951614366L, (long)var6_5);
                                }
                                if (v19 == null) break block56;
                            }
                            catch (IOException v21) {
                                throw m44.a("j", (Object)v21, (long)-3929525570951614366L, (long)var6_5);
                            }
                        }
                        try {
                            v19 = var14_11;
lbl135:
                            // 2 sources

                            m44.a("u", (Object)v19, (long)-3987872319574512120L, (long)var6_5);
                        }
                        catch (IOException var20_20) {
                            // empty catch block
                        }
                    }
                    throw var19_18;
                }
                try {
                    if (var5_4 < 0) break block48;
                    if (var2_2 < 0L) break block55;
                    v22 = var15_12;
                    if (var13_10 != null) {
                        if (v22 == null) break block48;
                    }
                    ** GOTO lbl153
                }
                catch (IOException v23) {
                    throw m44.a("j", (Object)v23, (long)-3929525570951614366L, (long)var6_5);
                }
                try {
                    v22 = var15_12;
lbl153:
                    // 2 sources

                    m44.a("u", (Object)v22, (long)-3955046040652023458L, (long)var6_5);
                }
                catch (IOException var16_14) {}
                break block55;
            }
            try {
                if (var2_2 < 0L) break block55;
                v24 = var14_11;
                if (var13_10 != null) {
                    if (v24 == null) break block55;
                }
                ** GOTO lbl169
            }
            catch (IOException v25) {
                throw m44.a("j", (Object)v25, (long)-3929525570951614366L, (long)var6_5);
            }
            try {
                v24 = var14_11;
lbl169:
                // 2 sources

                m44.a("u", (Object)v24, (long)-3987872319574512120L, (long)var6_5);
            }
            catch (IOException var16_15) {}
        }
    }

    public String U(Object[] objectArray) {
        v8 v82 = (v8)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x17125C369FBFL;
        String string = ((String)((Object)m44.a("p", (Object)this, (long)-6301679165772033235L, (long)l10))).replace((char)fz.b("r", (int)26611, (long)(0x1A8537D799552147L ^ l10)), (char)fz.b("r", (int)32210, (long)(0x37D77DF850E2BB60L ^ l10)));
        String string2 = (String)cf.J(l11, string, v82);
        String string3 = string2.replace((char)fz.b("r", (int)32210, (long)(0x37D77DF850E2BB60L ^ l10)), (char)fz.b("r", (int)26611, (long)(0x1A8537D799552147L ^ l10)));
        return (String)((Object)fz.a("s", (int)27790, (long)(0x61E7418A54526289L ^ l10))) + string3;
    }

    public void U(Object[] objectArray) {
        block10: {
            long l10 = (Long)objectArray[0];
            ZipOutputStream zipOutputStream = (ZipOutputStream)objectArray[1];
            Long l11 = (Long)objectArray[2];
            v8 v82 = (v8)objectArray[3];
            boolean bl2 = (Boolean)objectArray[4];
            long l12 = l10 = a ^ l10;
            long l13 = l12 ^ 0x3F3AA55E340L;
            long l14 = l12 ^ 0x6F9FE0CFBADBL;
            long l15 = l12 ^ 0x4EB106E8E202L;
            long l16 = l12 ^ 0x30F1C62689B8L;
            long l17 = l12 ^ 0x36E98FD139B2L;
            long l18 = l12 ^ 0x59BD04677E75L;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l15;
            objectArray2[0] = v82;
            y5 y52 = new y5(l18, zipOutputStream, (String)((Object)m44.a("u", (Object)this, (Object)objectArray2, (long)-8042867102546956423L, (long)l10)), bl2);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l16;
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)((Object)m44.a("u", (Object)y52, (Object)objectArray3, (long)-8030448443423281736L, (long)l10)), (String)((Object)fz.a("s", (int)28013, (long)(0x10838F33C93CC608L ^ l10)))));
            CallSite callSite = m44.a("j", (long)-8337351417488326611L, (long)l10);
            CallSite callSite2 = m44.a("u", (Object)m44.a("t", (Object)this, (long)-8175313501248265411L, (long)l10), (long)-8287870788006923869L, (long)l10);
            Iterator iterator = callSite2.iterator();
            while (iterator.hasNext()) {
                CallSite callSite3;
                block13: {
                    block11: {
                        Object object;
                        block12: {
                            Map.Entry entry = (Map.Entry)iterator.next();
                            object = (String)entry.getKey();
                            String string = (String)entry.getValue();
                            try {
                                try {
                                    CallSite callSite4 = callSite;
                                    if (l10 >= 0L) {
                                        if (callSite4 == null) break block10;
                                        callSite4 = callSite;
                                    }
                                    if (callSite4 == null) break block11;
                                }
                                catch (n9 n92) {
                                    throw m44.a("j", (Object)n92, (long)-7759830364237648550L, (long)l10);
                                }
                                if (string == null) break block12;
                            }
                            catch (n9 n93) {
                                throw m44.a("j", (Object)n93, (long)-7759830364237648550L, (long)l10);
                            }
                            String string2 = string.replace((char)fz.b("r", (int)22247, (long)(0x79E5C1F830F23533L ^ l10)), (char)fz.b("r", (int)7733, (long)(0x46F5B0D0CDC2FDE2L ^ l10)));
                            String string3 = (String)cf.J(l14, string2, v82);
                            try {
                                callSite3 = callSite;
                                if (l10 < 0L) break block13;
                                if (callSite3 == null) break block11;
                                if (!string2.equals(string3)) {
                                }
                                break block12;
                            }
                            catch (n9 n94) {
                                throw m44.a("j", (Object)n94, (long)-7759830364237648550L, (long)l10);
                            }
                            Object[] objectArray4 = new Object[4];
                            objectArray4[3] = string3.replace((char)fz.b("r", (int)32210, (long)(0x37D70575EC1B9E04L ^ l10)), (char)fz.b("r", (int)26611, (long)(0x1A854F5A25AC0423L ^ l10)));
                            objectArray4[2] = l13;
                            objectArray4[1] = string;
                            objectArray4[0] = object;
                            object = m44.a("j", (Object)objectArray4, (long)-8259652012355580789L, (long)l10);
                        }
                        printWriter.println((String)object);
                    }
                    callSite3 = callSite;
                }
                if (callSite3 != null) continue;
            }
            m44.a("u", (Object)printWriter, (long)-8079702624948731086L, (long)l10);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l17;
            objectArray5[0] = l11;
            m44.a("u", (Object)y52, (Object)objectArray5, (long)-8299828321520290217L, (long)l10);
            if (l10 >= 0L) {
                // empty if block
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        fz.a = prr.a(1396205802945032172L, 7820586240721556815L, MethodHandles.lookup().lookupClass()).a(102411057165509L);
                        var20 = fz.a ^ 117923128286052L;
                        fz.d = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[6];
                        var16_4 = 0;
                        var15_5 = "xgi\u00af\u0000w)\u00fa\u008a\u00f4F\u00b5!nGK(&\u0094\u00cce\u00f2\u00cb\u00fc\u0011\u001d\u00ad\u000f\u00cd2|\u00aa8\u0012\u00be\u00f9\u00e1\u00cc\u00f8.\u00e3\u0004\u007f'X\u00b0E\u00aa\u00e9\u00f9j{\u0082\u00bf\u0092\u0002*(\u00ba!\u009d\u0084!->\u00f8\u00bbl\u00ac\u00e1\u00e7\u0096\u0019|\u00c3/\u00e9f\u0017\u00fc\u0000A\u008b\u008f\u001f7\u00ec$4Z'\u00c0k\t\u00ad(t\u00a8\u0010\u00bb\u0018\u001a\u008d\u00d8\u0003U\u00d8\u00a6p\u0087(\u009d\u00f4\u0006\n";
                        var17_6 = "xgi\u00af\u0000w)\u00fa\u008a\u00f4F\u00b5!nGK(&\u0094\u00cce\u00f2\u00cb\u00fc\u0011\u001d\u00ad\u000f\u00cd2|\u00aa8\u0012\u00be\u00f9\u00e1\u00cc\u00f8.\u00e3\u0004\u007f'X\u00b0E\u00aa\u00e9\u00f9j{\u0082\u00bf\u0092\u0002*(\u00ba!\u009d\u0084!->\u00f8\u00bbl\u00ac\u00e1\u00e7\u0096\u0019|\u00c3/\u00e9f\u0017\u00fc\u0000A\u008b\u008f\u001f7\u00ec$4Z'\u00c0k\t\u00ad(t\u00a8\u0010\u00bb\u0018\u001a\u008d\u00d8\u0003U\u00d8\u00a6p\u0087(\u009d\u00f4\u0006\n".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = fz.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00e7\u00b9\u00b6\rZ\u00b6\u00db\u00c8 MO\u00fb\u0016\u0095\u009f=(\u00fa\u00d5c\u0086;\u00d34J\u00f6\"\u0097$W\u00a7\u00e9\u0081y?\u008e\u008c\u00c4\u00e6>\u0081\u00be\u00b9\u00aa\u001c\t\u0098n4\u009e\u00cf\u00e4\"\u00d8\u0094f\u00cb";
                            var17_6 = "\u00e7\u00b9\u00b6\rZ\u00b6\u00db\u00c8 MO\u00fb\u0016\u0095\u009f=(\u00fa\u00d5c\u0086;\u00d34J\u00f6\"\u0097$W\u00a7\u00e9\u0081y?\u008e\u008c\u00c4\u00e6>\u0081\u00be\u00b9\u00aa\u001c\t\u0098n4\u009e\u00cf\u00e4\"\u00d8\u0094f\u00cb".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = fz.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                fz.b = var18_3;
                fz.c = new String[6];
                fz.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u0081\u001eL\u001aV\u0082\u000b\u0012\u00d7\u00a4k\u00f9\u00f4\u00d9\u00d5n\u009a\u00db\u00cf\u00fe\u00dd\ba\u000b";
                var5_15 = "\u0081\u001eL\u001aV\u0082\u000b\u0012\u00d7\u00a4k\u00f9\u00f4\u00d9\u00d5n\u009a\u00db\u00cf\u00fe\u00dd\ba\u000b".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u0084\u00ed\u00ddel\u0012\u00f3\u0088X$\u0015\u00f6\u00d5\u00daB\u00da";
                    var5_15 = "\u0084\u00ed\u00ddel\u0012\u00f3\u0088X$\u0015\u00f6\u00d5\u00daB\u00da".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
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
        fz.e = var6_12;
        fz.f = new Integer[5];
        fz.X = fz.a("s", (int)11128, (long)(1065400531613893160L ^ var20)).length();
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3553;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/fz", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            fz.c[n11] = fz.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = fz.a(n10, l10);
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
            throw new RuntimeException("com/zelix/fz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7DE1;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/fz", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fz.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = fz.b(n10, l10);
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
            throw new RuntimeException("com/zelix/fz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fz.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

