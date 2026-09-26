/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._s;
import com.zelix.f33;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s;
import com.zelix.wt;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URL;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lkl {
    private s B;
    private static ResourceBundle F;
    private _s V;
    private String l;
    private static wt A;
    private static final lkl f;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] g;
    private static final Map h;

    public static void v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        m44.a("k", null, (long)-1098366008068704274L, (long)l10);
    }

    public static URL n(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x6C560029EC28L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = null;
        objectArray2[0] = string;
        return m44.a("j", (Object)objectArray2, (long)-7213620924763403736L, (long)l10);
    }

    public static boolean V(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("h", (long)6362915754882621282L, (long)l10) != null;
        }
        catch (n9 n92) {
            throw m44.a("l", (Object)n92, (long)6739867257739513517L, (long)l10);
        }
        return bl2;
    }

    public _s J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)this, (long)1329292576714461583L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    lkl.a = prr.a(-8894092849990376368L, 7053989877339876977L, MethodHandles.lookup().lookupClass()).a(25340653030639L);
                    var20 = lkl.a ^ 35694455552185L;
                    var22_1 = var20 ^ 138733932470963L;
                    lkl.d = new HashMap<K, V>(13);
                    var11_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var20 >>> 56);
                    for (var12_3 = 1; var12_3 < 8; ++var12_3) {
                        v2 = v2;
                        v2[var12_3] = (byte)(var20 << var12_3 * 8 >>> 56);
                    }
                    var11_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var18_4 = new String[2];
                    var16_5 = 0;
                    var15_6 = "\u00c4\u00f6xS\u009e{\r\u00fe#\u00b1\u00e3\u00b8\u00f2\u00be\u00e6j\u0010\n\u00e7\"o-s\u00ed\u00fe\u0092~\u00dc\u00fd\\k<~";
                    var17_7 = "\u00c4\u00f6xS\u009e{\r\u00fe#\u00b1\u00e3\u00b8\u00f2\u00be\u00e6j\u0010\n\u00e7\"o-s\u00ed\u00fe\u0092~\u00dc\u00fd\\k<~".length();
                    var14_8 = 16;
                    var13_9 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var18_4[var16_5++] = lkl.a(var19_10).intern();
                        if ((var13_9 += var14_8) < var17_7) {
                            var14_8 = var15_6.charAt(var13_9);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var13_9;
                    var19_10 = var11_2.doFinal(var15_6.substring(v3, v3 + var14_8).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                lkl.b = var18_4;
                lkl.c = new String[2];
                lkl.h = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v6 = v6;
                    v6[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[6];
                var3_14 = 0;
                var4_15 = "\u00ba\u0098\u00dcM\u0018\u00a2\u00a5\u00b1\u00c8\u00a8\u008aY\u0088\u00a5\u0004\u00b3j\u001cCqW\u00a6\u00e2\u0093\u00f0\u0097\u00b1\u00c5\u00f76\u0084J";
                var5_16 = "\u00ba\u0098\u00dcM\u0018\u00a2\u00a5\u00b1\u00c8\u00a8\u008aY\u0088\u00a5\u0004\u00b3j\u001cCqW\u00a6\u00e2\u0093\u00f0\u0097\u00b1\u00c5\u00f76\u0084J".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v7 = var6_13;
                    v8 = var3_14++;
                    v9 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "K*\u0098;\u00c8\u009b2\u0085\u00026\"\u00f8N7ui";
                    var5_16 = "K*\u0098;\u00c8\u009b2\u0085\u00026\"\u00f8N7ui".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v7 = var6_13;
                        v8 = var3_14++;
                        v9 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var8_19 = v9;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v11 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl86:
                // 1 sources

                ** continue;
            }
        }
        lkl.e = var6_13;
        lkl.g = new Integer[6];
        lkl.f = new lkl(var22_1);
    }

    public static void c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x5E3DFA596DAL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = null;
        objectArray2[1] = string;
        objectArray2[0] = l11;
        m44.a("k", (Object)objectArray2, (long)-5397405293919163607L, (long)l10);
    }

    public s r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)this, (long)-965712749455150847L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public static URL D(Object[] var0) {
        block22: {
            block21: {
                block19: {
                    block20: {
                        var2_1 = (String)var0[0];
                        var1_2 = (String)var0[1];
                        var3_3 = (Long)var0[2];
                        var3_3 = lkl.a ^ var3_3;
                        var6_4 = new StringBuffer();
                        v0 = m44.a("k", (long)-5851200461430496254L, (long)var3_3);
                        var6_4.append((String)m44.a("u", (Object)m44.a("o", (long)-5713532559742383014L, (long)var3_3), (long)-6187804188162082521L, (long)var3_3));
                        var5_5 = v0;
                        try {
                            try {
                                try {
                                    try {
                                        v1 = var2_1;
                                        if (var5_5 == null) break block19;
                                        if (v1 == null) break block20;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("k", (Object)v2, (long)-5435890538945812566L, (long)var3_3);
                                    }
                                    v1 = var2_1.trim();
                                    v3 = var5_5;
                                    if (var3_3 > 0L) {
                                        if (v3 == null) break block19;
                                    }
                                    ** GOTO lbl47
                                }
                                catch (n9 v4) {
                                    throw m44.a("k", (Object)v4, (long)-5435890538945812566L, (long)var3_3);
                                }
                                if (v1.length() <= 0) break block20;
                            }
                            catch (n9 v5) {
                                throw m44.a("k", (Object)v5, (long)-5435890538945812566L, (long)var3_3);
                            }
                            var6_4.append(var2_1.trim());
                            var6_4.append((String)lkl.a("d", (int)9377, (long)(8491271261085508959L ^ var3_3)));
                        }
                        catch (n9 v6) {
                            throw m44.a("k", (Object)v6, (long)-5435890538945812566L, (long)var3_3);
                        }
                    }
                    v1 = var1_2;
                }
                try {
                    try {
                        if (var3_3 < 0L) break block21;
                        v3 = var5_5;
lbl47:
                        // 2 sources

                        if (v3 == null) break block21;
                        if (v1 == null) break block22;
                    }
                    catch (n9 v7) {
                        throw m44.a("k", (Object)v7, (long)-5435890538945812566L, (long)var3_3);
                    }
                    v1 = var1_2.trim();
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)-5435890538945812566L, (long)var3_3);
                }
            }
            try {
                if (v1.length() > 0) {
                    var6_4.append("#");
                    var6_4.append(var1_2.trim());
                }
            }
            catch (n9 v9) {
                throw m44.a("k", (Object)v9, (long)-5435890538945812566L, (long)var3_3);
            }
        }
        var7_6 = m44.a("o", (long)-5713532559742383014L, (long)var3_3).getClass().getResource(var6_4.toString());
        try {
            v10 = var7_6;
            if (var3_3 > 0L && m44.a("k", (long)-6232354514225295173L, (long)var3_3) == null) {
                m44.a("k", (Object)new int[2], (long)-6262501581371585924L, (long)var3_3);
            }
        }
        catch (n9 v11) {
            throw m44.a("k", (Object)v11, (long)-5435890538945812566L, (long)var3_3);
        }
        return v10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private lkl(long var1_1) {
        block22: {
            block21: {
                var1_1 = lkl.a ^ var1_1;
                super();
                var3_2 = this.getClass().getName();
                var4_3 = var3_2.substring(0, var3_2.lastIndexOf(".") + 1);
                m44.a("q", (Object)this, (String)("/" + var4_3.replace((char)lkl.b("a", (int)19202, (long)(6523681943503235574L ^ var1_1)), (char)lkl.b("a", (int)13616, (long)(6238179694368561088L ^ var1_1)))), (long)-8500940961959995135L, (long)var1_1);
                var5_4 = m44.a("i", (long)-7735856747736037222L, (long)var1_1);
                var6_5 = m44.a("r", (Object)m44.a("m", (long)-7755155041200684985L, (long)var1_1), (long)-8357431721218862996L, (long)var1_1);
                m44.a("q", (Object)this, (_s)m44.a("r", (Object)var5_4, (long)-7512108198979230840L, (long)var1_1), (long)-8314241359348330656L, (long)var1_1);
                if ((double)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8314241359348330656L, (long)var1_1), (long)-8156291487265263272L, (long)var1_1) > m44.a("r", (Object)var6_5, (long)-8134313654824554263L, (long)var1_1) - 50.0) ** GOTO lbl19
                try {
                    block23: {
                        cfr_temp_0 = (double)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8314241359348330656L, (long)var1_1), (long)-7560261684715918406L, (long)var1_1) - (m44.a("r", (Object)var6_5, (long)-7959117003101528689L, (long)var1_1) - 50.0);
                        v0 /* !! */  = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        if (var1_1 < 0L) ** GOTO lbl29
                        if (v0 /* !! */  <= 0) break block21;
                        break block23;
                        catch (Throwable v1) {
                            throw m44.a("m", (Object)v1, (long)-7734438100455635060L, (long)var1_1);
                        }
                    }
                    m44.a("q", (Object)this, (_s)new _s(0, 0), (long)-8314241359348330656L, (long)var1_1);
                }
                catch (Throwable v2) {
                    throw m44.a("m", (Object)v2, (long)-7734438100455635060L, (long)var1_1);
                }
            }
            try {
                m44.a("q", (Object)this, (s)m44.a("r", (Object)var5_4, (long)-8446984555665490204L, (long)var1_1), (long)-8557323455032620378L, (long)var1_1);
                cfr_temp_1 = (double)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8557323455032620378L, (long)var1_1), (long)-8530064985460805542L, (long)var1_1) - (m44.a("r", (Object)var6_5, (long)-8134313654824554263L, (long)var1_1) - 25.0);
                v0 /* !! */  = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
lbl29:
                // 2 sources

                if (var1_1 > 0L) {
                    if (v0 /* !! */  >= 0) {
                        m44.a("q", (Object)this, (s)new s((int)m44.a("r", (Object)var6_5, (long)-8134313654824554263L, (long)var1_1) - lkl.b("a", (int)16086, (long)(4724457874321120289L ^ var1_1)), (int)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8557323455032620378L, (long)var1_1), (long)-8179938880762690103L, (long)var1_1)), (long)-8557323455032620378L, (long)var1_1);
                    }
                }
                ** GOTO lbl39
            }
            catch (Throwable v3) {
                throw m44.a("m", (Object)v3, (long)-7734438100455635060L, (long)var1_1);
            }
            try {
                cfr_temp_2 = (double)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8557323455032620378L, (long)var1_1), (long)-8179938880762690103L, (long)var1_1) - (m44.a("r", (Object)var6_5, (long)-7959117003101528689L, (long)var1_1) - 25.0);
                v0 /* !! */  = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
lbl39:
                // 2 sources

                if (var1_1 >= 0L) {
                    if (v0 /* !! */  >= 0) {
                        m44.a("q", (Object)this, (s)new s((int)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8557323455032620378L, (long)var1_1), (long)-8530064985460805542L, (long)var1_1), (int)m44.a("r", (Object)var6_5, (long)-7959117003101528689L, (long)var1_1) - lkl.b("a", (int)19799, (long)(7561172643654725542L ^ var1_1))), (long)-8557323455032620378L, (long)var1_1);
                    }
                }
                ** GOTO lbl48
            }
            catch (Throwable v4) {
                throw m44.a("m", (Object)v4, (long)-7734438100455635060L, (long)var1_1);
            }
            try {
                v0 /* !! */  = (double)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8557323455032620378L, (long)var1_1), (long)-8530064985460805542L, (long)var1_1);
lbl48:
                // 2 sources

                v5 = lkl.b("a", (int)26922, (long)(2793926769711401951L ^ var1_1));
                if (var1_1 >= 0L) {
                    if (v0 /* !! */  < v5) {
                        m44.a("q", (Object)this, (s)new s((int)lkl.b("a", (int)7088, (long)(2549738664026978630L ^ var1_1)), (int)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8557323455032620378L, (long)var1_1), (long)-8179938880762690103L, (long)var1_1)), (long)-8557323455032620378L, (long)var1_1);
                    }
                }
                ** GOTO lbl60
            }
            catch (Throwable v6) {
                throw m44.a("m", (Object)v6, (long)-7734438100455635060L, (long)var1_1);
            }
            try {
                if (var1_1 < 0L) break block22;
                v0 /* !! */  = (double)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8557323455032620378L, (long)var1_1), (long)-8179938880762690103L, (long)var1_1);
                v5 = lkl.b("a", (int)7088, (long)(2549738664026978630L ^ var1_1));
lbl60:
                // 2 sources

                if (v0 /* !! */  < v5) {
                    m44.a("q", (Object)this, (s)new s((int)m44.a("r", (Object)m44.a("s", (Object)this, (long)-8557323455032620378L, (long)var1_1), (long)-8530064985460805542L, (long)var1_1), (int)lkl.b("a", (int)7088, (long)(2549738664026978630L ^ var1_1))), (long)-8557323455032620378L, (long)var1_1);
                }
            }
            catch (Throwable v7) {
                throw m44.a("m", (Object)v7, (long)-7734438100455635060L, (long)var1_1);
            }
            try {
                m44.a("n", (ResourceBundle)m44.a("m", f33.a(var4_3 + (String)lkl.a("d", (int)28847, (long)(4446245369481318774L ^ var1_1))), (long)-8370718497021300553L, (long)var1_1), (long)-8113967652950418247L, (long)var1_1);
            }
            catch (Throwable var7_6) {
                // empty catch block
            }
        }
    }

    public static void J(Object[] objectArray) {
        CallSite callSite;
        long l10;
        long l11;
        String string;
        String string2;
        long l12;
        block4: {
            block5: {
                l12 = (Long)objectArray[0];
                string2 = (String)objectArray[1];
                string = (String)objectArray[2];
                long l13 = l12 = a ^ l12;
                l11 = l13 ^ 0x5234069D8F4AL;
                long l14 = l13 ^ 0x161939B3F25EL;
                l10 = l13 ^ 0x649AFAFFE7D5L;
                CallSite callSite2 = m44.a("h", (long)-1806132170323842015L, (long)l12);
                try {
                    try {
                        callSite = m44.a("l", (long)-474688247985570234L, (long)l12);
                        if (callSite2 == null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-239572413210284151L, (long)l12);
                    }
                    m44.a("k", (wt)new wt((lkl)((Object)m44.a("l", (long)-534103051543706503L, (long)l12)), l14), (long)-474688247985570234L, (long)l12);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-239572413210284151L, (long)l12);
                }
            }
            callSite = m44.a("l", (long)-474688247985570234L, (long)l12);
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = string;
        objectArray2[0] = string2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l10;
        objectArray3[0] = m44.a("h", (Object)objectArray2, (long)-538690745384343222L, (long)l12);
        m44.a("w", (Object)callSite, (Object)objectArray3, (long)-2151968040902117773L, (long)l12);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String A(Object[] objectArray) {
        CallSite callSite;
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        CallSite callSite2 = m44.a("o", (long)-9020586860771522530L, (long)l10);
        try {
            callSite = m44.a("k", (long)-8980355152821202813L, (long)l10);
            if (callSite2 == null) return m44.a("p", (Object)callSite, (Object)string, (long)-8880361537844352263L, (long)l10);
            if (callSite == null) return "";
        }
        catch (Throwable throwable) {
            throw m44.a("o", (Object)throwable, (long)-7452337532772594762L, (long)l10);
        }
        try {
            callSite = m44.a("k", (long)-8980355152821202813L, (long)l10);
            return m44.a("p", (Object)callSite, (Object)string, (long)-8880361537844352263L, (long)l10);
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public static void n(Object[] objectArray) {
        block3: {
            CallSite callSite;
            long l10;
            long l11;
            block2: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = a ^ l11) ^ 0x74C4538A4AD2L;
                CallSite callSite2 = m44.a("l", (long)-3669533033389750307L, (long)l11);
                try {
                    callSite = m44.a("h", (long)-3272438026373212742L, (long)l11);
                    if (callSite2 == null) break block2;
                    if (callSite == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)-2931639597797407627L, (long)l11);
                }
                callSite = m44.a("h", (long)-3272438026373212742L, (long)l11);
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            m44.a("s", (Object)callSite, (Object)objectArray2, (long)-3657279877943476255L, (long)l11);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3BD3;
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
                throw new RuntimeException("com/zelix/lkl", exception);
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
            lkl.c[n11] = lkl.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lkl.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lkl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x38FF;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lkl", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lkl.g[n11] = n12;
        }
        return g[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lkl.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lkl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lkl.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lkl.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

