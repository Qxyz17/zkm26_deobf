/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._u;
import com.zelix._v;
import com.zelix.ai;
import com.zelix.b0;
import com.zelix.bc;
import com.zelix.be;
import com.zelix.fr;
import com.zelix.i_;
import com.zelix.is;
import com.zelix.js;
import com.zelix.k_;
import com.zelix.l6c;
import com.zelix.lkv;
import com.zelix.lky;
import com.zelix.loj;
import com.zelix.lq0;
import com.zelix.lqu;
import com.zelix.lw2;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r_;
import com.zelix.y_;
import com.zelix.ym;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ev {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public static void Y(Object[] var0) {
        block53: {
            block54: {
                block52: {
                    block51: {
                        block49: {
                            block50: {
                                var9_1 = (_f)var0[0];
                                var14_2 = (Set)var0[1];
                                var1_3 = (fr)var0[2];
                                var11_4 = (Map)var0[3];
                                var5_5 = (lw2)var0[4];
                                var12_6 = (Long)var0[5];
                                var6_7 = (List)var0[6];
                                var2_8 = (loj)var0[7];
                                var10_9 = (ai)var0[8];
                                var8_10 = (y_)var0[9];
                                var7_11 = (ym)var0[10];
                                var3_12 = (_u)var0[11];
                                var4_13 = (lqu)var0[12];
                                v0 = var12_6 = ev.a ^ var12_6;
                                var15_14 = v0 ^ 8467969681065L;
                                v1 = v0 ^ 58457097958882L;
                                var17_15 = (int)(v1 >>> 48);
                                var18_16 = (int)(v1 << 16 >>> 32);
                                var19_17 = (int)(v1 << 48 >>> 48);
                                var20_18 = v0 ^ 85844209975026L;
                                var22_19 = v0 ^ 53974182370337L;
                                var24_20 = v0 ^ 41616591205136L;
                                var26_21 = v0 ^ 45557935662428L;
                                var28_22 = v0 ^ 66645631214549L;
                                var30_23 = v0 ^ 22021695837060L;
                                var32_24 = v0 ^ 117362137790111L;
                                var34_25 = v0 ^ 22681494545002L;
                                var36_26 = v0 ^ 70925282360231L;
                                var38_27 = v0 ^ 100897103694049L;
                                var40_28 = v0 ^ 64045810092360L;
                                var42_29 = m44.a("i", (long)-5940173694046253604L, (long)var12_6);
                                try {
                                    try {
                                        v2 = var4_13;
                                        if (var42_29 != null) break block49;
                                        if (v2 != null) break block50;
                                    }
                                    catch (n9 v3) {
                                        throw m44.a("i", (Object)v3, (long)-6318623010561712782L, (long)var12_6);
                                    }
                                    v4 = null;
                                    break block51;
                                }
                                catch (n9 v5) {
                                    throw m44.a("i", (Object)v5, (long)-6318623010561712782L, (long)var12_6);
                                }
                            }
                            v2 = var4_13;
                        }
                        v6 = new Object[1];
                        v6[0] = var26_21;
                        v4 = m44.a("v", (Object)v2, (Object)v6, (long)-6077115759057603988L, (long)var12_6);
                    }
                    var43_30 = v4;
                    var44_31 = new ArrayList<i_>();
                    var45_32 = null;
                    var46_33 = null;
                    try {
                        v7 = new Object[1];
                        v7[0] = var36_26;
                        v8 = m44.a("v", (Object)var8_10, (Object)v7, (long)-6163941304943369641L, (long)var12_6);
                        if (var42_29 != null) break block52;
                        if (v8 == false) break block53;
                    }
                    catch (n9 v9) {
                        throw m44.a("i", (Object)v9, (long)-6318623010561712782L, (long)var12_6);
                    }
                    v8 = m44.a("m", (long)-5915493895844488854L, (long)var12_6);
                }
                if (v8 != false) break block53;
                var47_34 = null;
                var48_35 = m44.a("v", (Object)var5_5, (long)-5224769568965053405L, (long)var12_6).iterator();
                block32: while (var48_35.hasNext()) {
                    v10 = var48_35.next();
                    do {
                        var49_36 = (Map.Entry)v10;
                        var50_37 = (ArrayList<CallSite>)((lq0)var49_36.getValue()).D();
                        block34: for (CallSite v11 : var50_37) {
                            do {
                                block56: {
                                    block57: {
                                        block59: {
                                            block61: {
                                                block60: {
                                                    block58: {
                                                        block55: {
                                                            var52_42 = (be)v11 /* !! */ ;
                                                            var53_45 = var52_42.i(var24_20);
                                                            try {
                                                                try {
                                                                    try {
                                                                        v12 = var47_34;
                                                                        v13 = var42_29;
                                                                        if (var12_6 >= 0L) {
                                                                            if (v13 != null) break block54;
                                                                            v13 = var42_29;
                                                                        }
                                                                        if (v13 != null) break block55;
                                                                    }
                                                                    catch (n9 v14) {
                                                                        throw m44.a("i", (Object)v14, (long)-6318623010561712782L, (long)var12_6);
                                                                    }
                                                                    if (v12 == null) {
                                                                    }
                                                                    ** GOTO lbl111
                                                                }
                                                                catch (n9 v15) {
                                                                    throw m44.a("i", (Object)v15, (long)-6318623010561712782L, (long)var12_6);
                                                                }
                                                                v16 = (char)ev.b("b", (int)7134, (long)(5884864393707869217L ^ var12_6)) + (String)var53_45 + (char)ev.b("b", (int)18086, (long)(6334183798334753117L ^ var12_6));
                                                            }
                                                            catch (n9 v17) {
                                                                throw m44.a("i", (Object)v17, (long)-6318623010561712782L, (long)var12_6);
                                                            }
                                                        }
                                                        var47_34 = v16;
                                                        try {
                                                            try {
                                                                v18 = var42_29;
                                                                if (var12_6 <= 0L) break block56;
                                                                if (v18 == null) break block57;
lbl111:
                                                                // 2 sources

                                                                v19 = var43_30;
                                                                if (var12_6 < 0L || var42_29 != null) break block58;
                                                            }
                                                            catch (n9 v20) {
                                                                throw m44.a("i", (Object)v20, (long)-6318623010561712782L, (long)var12_6);
                                                            }
                                                            if (v19 == null) break block59;
                                                        }
                                                        catch (n9 v21) {
                                                            throw m44.a("i", (Object)v21, (long)-6318623010561712782L, (long)var12_6);
                                                        }
                                                        v19 = var43_30;
                                                    }
                                                    try {
                                                        try {
                                                            v22 = new Object[2];
                                                            v22[1] = var53_45;
                                                            v22[0] = var20_18;
                                                            v23 = m44.a("v", (Object)v19, (Object)v22, (long)-5416505858487706295L, (long)var12_6);
                                                            if (var42_29 != null) break block60;
                                                            if (v23 == false) {
                                                            }
                                                            break block61;
                                                        }
                                                        catch (n9 v24) {
                                                            throw m44.a("i", (Object)v24, (long)-6318623010561712782L, (long)var12_6);
                                                        }
                                                        v25 = new Object[2];
                                                        v25[1] = var47_34.substring(1, var47_34.length() - 1);
                                                        v25[0] = var20_18;
                                                        v23 = m44.a("v", (Object)var43_30, (Object)v25, (long)-5416505858487706295L, (long)var12_6);
                                                    }
                                                    catch (n9 v26) {
                                                        throw m44.a("i", (Object)v26, (long)-6318623010561712782L, (long)var12_6);
                                                    }
                                                }
                                                if (v23 == false) break block59;
                                            }
                                            var47_34 = ev.a("w", (int)19775, (long)(6598957838952482851L ^ var12_6));
                                            v18 = var42_29;
                                            if (var12_6 <= 0L) break block56;
                                            if (v18 == null) break block57;
                                        }
                                        var47_34 = m44.a("v", (Object)var2_8, (char)((char)var17_15), (int)var18_16, var47_34, (short)((short)var19_17), (Object)((char)ev.b("b", (int)32422, (long)(2973123418762096984L ^ var12_6)) + (String)var53_45 + (char)ev.b("b", (int)15336, (long)(1227030663851635741L ^ var12_6))), (Object)ev.a("w", (int)22578, (long)(7286959920020118831L ^ var12_6)), (long)-5560707480424041554L, (long)var12_6);
                                    }
                                    v18 = var42_29;
                                }
                                if (v18 == null) continue block34;
                                v11 /* !! */  = var42_29;
                            } while (var12_6 <= 0L);
                        }
                        if (v11 /* !! */  == null) continue block32;
                        v10 = new StringBuilder().append((char)ev.b("b", (int)3728, (long)(1882134354646024554L ^ var12_6))).append((String)var47_34).append((char)ev.b("b", (int)28268, (long)(6921125003540144529L ^ var12_6))).append((String)var47_34);
                    } while (var12_6 < 0L);
                }
                v12 = v10.toString();
            }
            var48_35 = v12;
            var49_36 = new lkv(true, var40_28, (String)var48_35, 5);
            var50_37 = new ArrayList<CallSite>();
            v27 = new Object[4];
            v27[3] = (int)ev.b("b", (int)24464, (long)(3345699090593845353L ^ var12_6));
            v27[2] = var34_25;
            v27[1] = var49_36;
            v27[0] = 0;
            var50_37.add(m44.a("i", (Object)v27, (long)-6238693377759929717L, (long)var12_6));
            var50_37.add((CallSite)is.Z((int)ev.b("b", (int)16450, (long)(4327157270118600634L ^ var12_6))));
            var51_39 = 1;
            var52_43 = 1;
            var53_45 = new l6c[]{};
            v28 = new Object[13];
            v28[12] = (int)ev.b("b", (int)7254, (long)(6750202147736703906L ^ var12_6));
            v28[11] = var3_12;
            v28[10] = var7_11;
            v28[9] = var6_7;
            v28[8] = ev.a("w", (int)3537, (long)(6179616238631225551L ^ var12_6));
            v28[7] = var53_45;
            v28[6] = var49_36;
            v28[5] = 1;
            v28[4] = var52_43;
            v28[3] = var51_39;
            v28[2] = var15_14;
            v28[1] = var50_37;
            v28[0] = var48_35;
            var54_46 = m44.a("v", (Object)var9_1, (Object)v28, (long)-6317733704162195084L, (long)var12_6);
            var14_2.add(var54_46);
            v29 = new Object[3];
            v29[2] = var6_7;
            v29[1] = var22_19;
            v29[0] = var54_46;
            var55_47 = m44.a("v", (Object)var9_1, (Object)v29, (long)-5220879584266263197L, (long)var12_6);
            var45_32 = new i_((int)ev.b("b", (int)17345, (long)(188010541318507581L ^ var12_6)), (js)var55_47);
            var44_31.add(var45_32);
            var46_33 = new lky((b0)var54_46, (_v)var9_1);
        }
        var47_34 = m44.a("v", (Object)var5_5, (long)-5224769568965053405L, (long)var12_6).iterator();
        block36: while (var47_34.hasNext()) {
            block64: {
                block65: {
                    block62: {
                        var48_35 = (Map.Entry)var47_34.next();
                        var49_36 = (bc)var48_35.getKey();
                        v30 = ((lq0)var48_35.getValue()).S();
                        do lbl-1000:
                        // 3 sources

                        {
                            block63: {
                                var50_37 = (List)v30;
                                try {
                                    v31 /* !! */  = var44_31;
                                    if (var42_29 != null) break block62;
                                    if (v31 /* !! */ .size() <= 0) break block63;
                                }
                                catch (n9 v32) {
                                    throw m44.a("i", (Object)v32, (long)-6318623010561712782L, (long)var12_6);
                                }
                                for (r_ var52_44 : var50_37) {
                                    v33 = new Object[3];
                                    v33[2] = var44_31;
                                    v33[1] = var28_22;
                                    v33[0] = (int)ev.b("b", (int)12789, (long)(1208271648215924226L ^ var12_6));
                                    m44.a("v", (Object)var52_44, (Object)v33, (long)-6156176185714104677L, (long)var12_6);
                                    if (var42_29 != null) continue block36;
                                    v30 = var42_29;
                                    if (var12_6 < 0L) ** GOTO lbl-1000
                                    if (v30 == null) continue;
                                }
                            }
                            v30 = ((lq0)var48_35.getValue()).D();
                        } while (var12_6 < 0L);
                        v31 /* !! */  = (List)v30;
                    }
                    var51_41 = v31 /* !! */ ;
                    try {
                        try {
                            try {
                                try {
                                    v34 = new Object[3];
                                    v34[2] = ev.a("w", (int)3537, (long)(6179616238631225551L ^ var12_6));
                                    v34[1] = var30_23;
                                    v34[0] = var50_37;
                                    m44.a("v", (Object)var49_36, (Object)v34, (long)-5516204428845274125L, (long)var12_6);
                                    v35 = new Object[6];
                                    v35[5] = var4_13;
                                    v35[4] = var10_9;
                                    v35[3] = var2_8;
                                    v35[2] = var51_41;
                                    v35[1] = var38_27;
                                    v35[0] = true;
                                    m44.a("v", (Object)((k_)var49_36.H()), (Object)v35, (long)-6312482346644677194L, (long)var12_6);
                                    m44.a("v", (Object)var49_36, (Object)new Object[]{true}, (long)-6157922923485928850L, (long)var12_6);
                                    if (var1_3 == null || var46_33 == null) break block64;
                                }
                                catch (n9 v36) {
                                    throw m44.a("i", (Object)v36, (long)-6318623010561712782L, (long)var12_6);
                                }
                                if (var45_32 == null) break block64;
                            }
                            catch (n9 v37) {
                                throw m44.a("i", (Object)v37, (long)-6318623010561712782L, (long)var12_6);
                            }
                            v38 = var11_4;
                            if (var12_6 < 0L || var42_29 != null) break block65;
                        }
                        catch (n9 v39) {
                            throw m44.a("i", (Object)v39, (long)-6318623010561712782L, (long)var12_6);
                        }
                        if (v38 == null) break block64;
                    }
                    catch (n9 v40) {
                        throw m44.a("i", (Object)v40, (long)-6318623010561712782L, (long)var12_6);
                    }
                    v38 = var11_4;
                }
                try {
                    if (v38.containsKey(var49_36.g())) {
                        var1_3.T(var32_24, var46_33, (Object)var49_36, var45_32);
                    }
                }
                catch (n9 v41) {
                    throw m44.a("i", (Object)v41, (long)-6318623010561712782L, (long)var12_6);
                }
            }
            if (var42_29 == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    ev.a = prr.a((long)5858144432052006128L, (long)7977526219034752671L, MethodHandles.lookup().lookupClass()).a(188717909864458L);
                    ev.d = new HashMap<K, V>(13);
                    var11 = ev.a ^ 60725365416558L;
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
                    var20_3 = new String[3];
                    var18_4 = 0;
                    var17_5 = "\u00ba\u000f\u00fft\u0099=\u00e7\u00c0=\u0099\u00d97\u000e\u0094\u009f\u0006\u0016B\u00a9\u00e3\u00be\u00af'Q\u0081\u0002\u00c2}JdSoN\u00e3\u001a\u00ba6\u00fb\u008cb(\u0017\u00d0\u00b0\u00ec\u00ef\u00d0\u000e\u00edY\u00d8\u001a\u000b\u00e7~\u00aa\u00ecZ\u00e9\u000et\r\u00d1\u001dI\u00ed\u001al0<\u00caP\u0005\u00d0\u0090=\u00d2\u00d5Y\u00cd9(\u00cbW!)\u00ac\u00c9\u00d4g\u001fX\u00ee\u00ea\u00bd\u00beKY0\u00db\u0092M\u00f6\u009f\u00bb\u00d0\u0086.\u00df\u0099pCm\u0090\u0002\u009f\u00ae\u00a5v&\u00b0\u00b3";
                    var19_6 = "\u00ba\u000f\u00fft\u0099=\u00e7\u00c0=\u0099\u00d97\u000e\u0094\u009f\u0006\u0016B\u00a9\u00e3\u00be\u00af'Q\u0081\u0002\u00c2}JdSoN\u00e3\u001a\u00ba6\u00fb\u008cb(\u0017\u00d0\u00b0\u00ec\u00ef\u00d0\u000e\u00edY\u00d8\u001a\u000b\u00e7~\u00aa\u00ecZ\u00e9\u000et\r\u00d1\u001dI\u00ed\u001al0<\u00caP\u0005\u00d0\u0090=\u00d2\u00d5Y\u00cd9(\u00cbW!)\u00ac\u00c9\u00d4g\u001fX\u00ee\u00ea\u00bd\u00beKY0\u00db\u0092M\u00f6\u009f\u00bb\u00d0\u0086.\u00df\u0099pCm\u0090\u0002\u009f\u00ae\u00a5v&\u00b0\u00b3".length();
                    var16_7 = 40;
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
                        var20_3[var18_4++] = ev.a(var21_9).intern();
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
                ev.b = var20_3;
                ev.c = new String[3];
                ev.g = new HashMap<K, V>(13);
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
                var6_12 = new long[11];
                var3_13 = 0;
                var4_14 = "\u0017\u00ca\u00b5\u0006/\u000f\u00d5*\u001f\\\u0011?\u00f9\nh2\u00b36I\u00f9\u001b\u007f\u00bb\u00e9#K;\u00d2'\u00ee\u0084\u00a0\u0007\u00db\u001cRg\u00f7\u00910\u001d\u00b3I\u0015\u00c2 1s\u009f\u008b\u00a55\u00c5\u00bf\u00f3\u008b\u000b\u0082\u00d4\u00968\u00cc\u00b0 \u008b\u0088\"\u0014d\u008b\u001cw";
                var5_15 = "\u0017\u00ca\u00b5\u0006/\u000f\u00d5*\u001f\\\u0011?\u00f9\nh2\u00b36I\u00f9\u001b\u007f\u00bb\u00e9#K;\u00d2'\u00ee\u0084\u00a0\u0007\u00db\u001cRg\u00f7\u00910\u001d\u00b3I\u0015\u00c2 1s\u009f\u008b\u00a55\u00c5\u00bf\u00f3\u008b\u000b\u0082\u00d4\u00968\u00cc\u00b0 \u008b\u0088\"\u0014d\u008b\u001cw".length();
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
                    var4_14 = "\u00bd\u00eaV\u00ceH1\u00a4\u00b7\u00f1\u00c2&\u00c0\u00df{\u000ey";
                    var5_15 = "\u00bd\u00eaV\u00ceH1\u00a4\u00b7\u00f1\u00c2&\u00c0\u00df{\u000ey".length();
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
        ev.e = var6_12;
        ev.f = new Integer[11];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2382;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ev", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            ev.c[n2] = ev.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ev.a(n, l);
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
            throw new RuntimeException("com/zelix/ev" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6963;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ev", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ev.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ev.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ev" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ev.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ev.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
