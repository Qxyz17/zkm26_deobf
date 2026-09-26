/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
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

public class g_ {
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static long D(Object[] var0) {
        var3_1 = (String)var0[0];
        var1_2 = (Long)var0[1];
        var1_2 = g_.a ^ var1_2;
        var5_3 = var3_1.toCharArray();
        var6_4 = new char[var5_3.length];
        var7_5 = 0;
        var4_6 = m44.a("i", (long)-8649323904207644223L, (long)var1_2);
        while (var7_5 < var5_3.length) {
            block86: {
                block85: {
                    block93: {
                        block92: {
                            block91: {
                                block90: {
                                    block89: {
                                        block88: {
                                            block87: {
                                                block82: {
                                                    block83: {
                                                        block84: {
                                                            var8_7 = var5_3[var7_5];
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v0 = var8_7;
                                                                                    v1 = g_.a("p", (int)10573, (long)(843666935568378059L ^ var1_2));
                                                                                    if (var4_6 != null) break block82;
                                                                                    if (v0 >= v1) {
                                                                                    }
                                                                                    ** GOTO lbl64
                                                                                }
                                                                                catch (n9 v2) {
                                                                                    throw m44.a("i", (Object)v2, (long)-8882264964331993399L, (long)var1_2);
                                                                                }
                                                                                v0 = var8_7;
                                                                                v1 = g_.a("p", (int)21859, (long)(3839290854536566008L ^ var1_2));
                                                                                v3 = var4_6;
                                                                                if (var1_2 >= 0L) {
                                                                                    if (v3 != null) break block82;
                                                                                }
                                                                                ** GOTO lbl74
                                                                            }
                                                                            catch (n9 v4) {
                                                                                throw m44.a("i", (Object)v4, (long)-8882264964331993399L, (long)var1_2);
                                                                            }
                                                                            if (var1_2 <= 0L) break block82;
                                                                            if (v0 <= v1) {
                                                                            }
                                                                            ** GOTO lbl64
                                                                        }
                                                                        catch (n9 v5) {
                                                                            throw m44.a("i", (Object)v5, (long)-8882264964331993399L, (long)var1_2);
                                                                        }
                                                                        v6 = var8_7;
                                                                        if (var1_2 <= 0L) break block83;
                                                                        v7 = g_.a("p", (int)15223, (long)(8869375853982169835L ^ var1_2));
                                                                        if (var4_6 != null) break block84;
                                                                    }
                                                                    catch (n9 v8) {
                                                                        throw m44.a("i", (Object)v8, (long)-8882264964331993399L, (long)var1_2);
                                                                    }
                                                                    if (v6 <= v7) break block85;
                                                                }
                                                                catch (n9 v9) {
                                                                    throw m44.a("i", (Object)v9, (long)-8882264964331993399L, (long)var1_2);
                                                                }
                                                                v10 = g_.a("p", (int)2757, (long)(4995592041562901341L ^ var1_2)) - var8_7;
                                                                v7 = g_.a("p", (int)15223, (long)(8869375853982169835L ^ var1_2));
                                                            }
                                                            catch (n9 v11) {
                                                                throw m44.a("i", (Object)v11, (long)-8882264964331993399L, (long)var1_2);
                                                            }
                                                        }
                                                        v6 = (char)(v10 + v7);
                                                    }
                                                    var8_7 = v6;
                                                    try {
                                                        v12 = var4_6;
                                                        if (var1_2 < 0L) break block86;
                                                        if (v12 == null) break block85;
lbl64:
                                                        // 3 sources

                                                        v0 = var8_7;
                                                        v1 = g_.a("p", (int)2979, (long)(3798766808942184995L ^ var1_2));
                                                    }
                                                    catch (n9 v13) {
                                                        throw m44.a("i", (Object)v13, (long)-8882264964331993399L, (long)var1_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            v3 = var4_6;
lbl74:
                                                            // 2 sources

                                                            if (v3 != null) break block87;
                                                            if (v0 >= v1) {
                                                            }
                                                            ** GOTO lbl99
                                                        }
                                                        catch (n9 v14) {
                                                            throw m44.a("i", (Object)v14, (long)-8882264964331993399L, (long)var1_2);
                                                        }
                                                        v0 = var8_7;
                                                        v1 = g_.a("p", (int)30270, (long)(8698754371637049273L ^ var1_2));
                                                        v15 = var4_6;
                                                        if (var1_2 >= 0L) {
                                                            if (v15 != null) break block87;
                                                        }
                                                        ** GOTO lbl109
                                                    }
                                                    catch (n9 v16) {
                                                        throw m44.a("i", (Object)v16, (long)-8882264964331993399L, (long)var1_2);
                                                    }
                                                    if (v0 <= v1) {
                                                    }
                                                    ** GOTO lbl99
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("i", (Object)v17, (long)-8882264964331993399L, (long)var1_2);
                                                }
                                                var8_7 = (char)(var8_7 - g_.a("p", (int)8152, (long)(1724696630199131717L ^ var1_2)));
                                                try {
                                                    v12 = var4_6;
                                                    if (var1_2 <= 0L) break block86;
                                                    if (v12 == null) break block85;
lbl99:
                                                    // 3 sources

                                                    v0 = var8_7;
                                                    v1 = g_.a("p", (int)535, (long)(2080200732748186517L ^ var1_2));
                                                }
                                                catch (n9 v18) {
                                                    throw m44.a("i", (Object)v18, (long)-8882264964331993399L, (long)var1_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v15 = var4_6;
lbl109:
                                                        // 2 sources

                                                        if (v15 != null) break block88;
                                                        if (v0 >= v1) {
                                                        }
                                                        ** GOTO lbl134
                                                    }
                                                    catch (n9 v19) {
                                                        throw m44.a("i", (Object)v19, (long)-8882264964331993399L, (long)var1_2);
                                                    }
                                                    v0 = var8_7;
                                                    v1 = g_.a("p", (int)11288, (long)(7685892403452947851L ^ var1_2));
                                                    v20 = var4_6;
                                                    if (var1_2 > 0L) {
                                                        if (v20 != null) break block88;
                                                    }
                                                    ** GOTO lbl144
                                                }
                                                catch (n9 v21) {
                                                    throw m44.a("i", (Object)v21, (long)-8882264964331993399L, (long)var1_2);
                                                }
                                                if (v0 <= v1) {
                                                }
                                                ** GOTO lbl134
                                            }
                                            catch (n9 v22) {
                                                throw m44.a("i", (Object)v22, (long)-8882264964331993399L, (long)var1_2);
                                            }
                                            var8_7 = (char)(var8_7 - g_.a("p", (int)18719, (long)(8040799407426488449L ^ var1_2)));
                                            try {
                                                v12 = var4_6;
                                                if (var1_2 < 0L) break block86;
                                                if (v12 == null) break block85;
lbl134:
                                                // 3 sources

                                                v0 = var8_7;
                                                v1 = g_.a("p", (int)22440, (long)(2504153730980435518L ^ var1_2));
                                            }
                                            catch (n9 v23) {
                                                throw m44.a("i", (Object)v23, (long)-8882264964331993399L, (long)var1_2);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    v20 = var4_6;
lbl144:
                                                    // 2 sources

                                                    if (v20 != null) break block89;
                                                    if (v0 >= v1) {
                                                    }
                                                    ** GOTO lbl169
                                                }
                                                catch (n9 v24) {
                                                    throw m44.a("i", (Object)v24, (long)-8882264964331993399L, (long)var1_2);
                                                }
                                                v0 = var8_7;
                                                v1 = g_.a("p", (int)457, (long)(1613680860726296670L ^ var1_2));
                                                v25 = var4_6;
                                                if (var1_2 > 0L) {
                                                    if (v25 != null) break block89;
                                                }
                                                ** GOTO lbl179
                                            }
                                            catch (n9 v26) {
                                                throw m44.a("i", (Object)v26, (long)-8882264964331993399L, (long)var1_2);
                                            }
                                            if (v0 <= v1) {
                                            }
                                            ** GOTO lbl169
                                        }
                                        catch (n9 v27) {
                                            throw m44.a("i", (Object)v27, (long)-8882264964331993399L, (long)var1_2);
                                        }
                                        var8_7 = (char)(var8_7 - g_.a("p", (int)13591, (long)(5806526211203314838L ^ var1_2)));
                                        try {
                                            v12 = var4_6;
                                            if (var1_2 < 0L) break block86;
                                            if (v12 == null) break block85;
lbl169:
                                            // 3 sources

                                            v0 = var8_7;
                                            v1 = g_.a("p", (int)4953, (long)(8418908302004818627L ^ var1_2));
                                        }
                                        catch (n9 v28) {
                                            throw m44.a("i", (Object)v28, (long)-8882264964331993399L, (long)var1_2);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                v25 = var4_6;
lbl179:
                                                // 2 sources

                                                if (v25 != null) break block90;
                                                if (v0 >= v1) {
                                                }
                                                ** GOTO lbl204
                                            }
                                            catch (n9 v29) {
                                                throw m44.a("i", (Object)v29, (long)-8882264964331993399L, (long)var1_2);
                                            }
                                            v0 = var8_7;
                                            v1 = g_.a("p", (int)30915, (long)(2983436253559290193L ^ var1_2));
                                            v30 = var4_6;
                                            if (var1_2 >= 0L) {
                                                if (v30 != null) break block90;
                                            }
                                            ** GOTO lbl214
                                        }
                                        catch (n9 v31) {
                                            throw m44.a("i", (Object)v31, (long)-8882264964331993399L, (long)var1_2);
                                        }
                                        if (v0 <= v1) {
                                        }
                                        ** GOTO lbl204
                                    }
                                    catch (n9 v32) {
                                        throw m44.a("i", (Object)v32, (long)-8882264964331993399L, (long)var1_2);
                                    }
                                    var8_7 = (char)(var8_7 - g_.a("p", (int)10641, (long)(1211714729650235396L ^ var1_2)));
                                    try {
                                        v12 = var4_6;
                                        if (var1_2 <= 0L) break block86;
                                        if (v12 == null) break block85;
lbl204:
                                        // 3 sources

                                        v0 = var8_7;
                                        v1 = g_.a("p", (int)14776, (long)(2160466513814566945L ^ var1_2));
                                    }
                                    catch (n9 v33) {
                                        throw m44.a("i", (Object)v33, (long)-8882264964331993399L, (long)var1_2);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            v30 = var4_6;
lbl214:
                                            // 2 sources

                                            if (v30 != null) break block91;
                                            if (v0 >= v1) {
                                            }
                                            ** GOTO lbl239
                                        }
                                        catch (n9 v34) {
                                            throw m44.a("i", (Object)v34, (long)-8882264964331993399L, (long)var1_2);
                                        }
                                        v0 = var8_7;
                                        v1 = g_.a("p", (int)15106, (long)(2847722707863911041L ^ var1_2));
                                        v35 = var4_6;
                                        if (var1_2 > 0L) {
                                            if (v35 != null) break block91;
                                        }
                                        ** GOTO lbl248
                                    }
                                    catch (n9 v36) {
                                        throw m44.a("i", (Object)v36, (long)-8882264964331993399L, (long)var1_2);
                                    }
                                    if (v0 <= v1) {
                                    }
                                    ** GOTO lbl239
                                }
                                catch (n9 v37) {
                                    throw m44.a("i", (Object)v37, (long)-8882264964331993399L, (long)var1_2);
                                }
                                var8_7 = (char)(var8_7 - g_.a("p", (int)8870, (long)(6859749323808351026L ^ var1_2)));
                                try {
                                    v12 = var4_6;
                                    if (var1_2 < 0L) break block86;
                                    if (v12 == null) break block85;
lbl239:
                                    // 3 sources

                                    v0 = var8_7;
                                    v1 = g_.a("p", (int)31787, (long)(7368833564920905140L ^ var1_2));
                                }
                                catch (n9 v38) {
                                    throw m44.a("i", (Object)v38, (long)-8882264964331993399L, (long)var1_2);
                                }
                            }
                            try {
                                try {
                                    v35 = var4_6;
lbl248:
                                    // 2 sources

                                    if (var1_2 >= 0L) {
                                        if (v35 != null) break block92;
                                        if (v0 < v1) break block85;
                                    }
                                    ** GOTO lbl264
                                }
                                catch (n9 v39) {
                                    throw m44.a("i", (Object)v39, (long)-8882264964331993399L, (long)var1_2);
                                }
                                v0 = var8_7;
                                v1 = g_.a("p", (int)3922, (long)(1750055989924007619L ^ var1_2));
                            }
                            catch (n9 v40) {
                                throw m44.a("i", (Object)v40, (long)-8882264964331993399L, (long)var1_2);
                            }
                        }
                        try {
                            try {
                                v35 = var4_6;
lbl264:
                                // 2 sources

                                if (v35 != null) break block93;
                                if (v0 > v1) break block85;
                            }
                            catch (n9 v41) {
                                throw m44.a("i", (Object)v41, (long)-8882264964331993399L, (long)var1_2);
                            }
                            v0 = var8_7;
                            v1 = g_.a("p", (int)26699, (long)(727370743823526363L ^ var1_2));
                        }
                        catch (n9 v42) {
                            throw m44.a("i", (Object)v42, (long)-8882264964331993399L, (long)var1_2);
                        }
                    }
                    var8_7 = (char)(v0 - v1);
                }
                var6_4[var7_5] = var8_7;
                ++var7_5;
                v12 = var4_6;
            }
            if (v12 == null) continue;
        }
        return (long)m44.a("i", new String(var6_4), (long)-7329301037853356571L, (long)var1_2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                g_.a = prr.a(-8360425305476615208L, 2369010409584372091L, MethodHandles.lookup().lookupClass()).a(141018817662038L);
                g_.d = new HashMap<K, V>(13);
                var0 = g_.a ^ 85464579559486L;
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
                var8_3 = new long[22];
                var5_4 = 0;
                var6_5 = "\u00fa\u0002\u00f11\u00f9o\u009e\u008c\u00abJF\t\u0083OA\u0083a\u00a4\u00ff\u00a8E\u009a\u00ff\u0084\u00ce\u00f4\u00d7\u00b6\u00be\u001eS)\u00ff\u0081\u00ae\u00a5\u00be\u00c9%\u00c4\u009b\u00ff\u00ca%rH\u00ec\u00dd\r\u00ed>\u00d8\u00a6\u00f2\u00f4)H\u00b5\u0093\u000e\u008d\u00ff\u00ce=\u00fb\u008db\u00f8\u000e\u00de\u00b6\u00e7\u00ed\u000e\u00a2\u00e2\f\"h\u000e\u00e1\u0018\u000eP\u0007 \u0098\u001e\r<\u00e6\u00d4N'7\u0005\u00d8\u00a6\u008br\u00cdL.\u009e\u001e\u00fc\u00f2\u00e9|\u0014 \u00f1\u0088\u00b64\u00b8\u00d9\u00f3\u00ba\u0004\u00cde\u00a0\u008f\u0091Q\u000b?C\u00fe\u00f8\u0097\u0099\u0091j3\u00f7\u00bd\u008b\u00ad\u00ad\u009aG*b\u0094\u00b1s8\u00c1\u0094\u009aw\u0003\u00df\u00d3\u00f6Gv\u00b5";
                var7_6 = "\u00fa\u0002\u00f11\u00f9o\u009e\u008c\u00abJF\t\u0083OA\u0083a\u00a4\u00ff\u00a8E\u009a\u00ff\u0084\u00ce\u00f4\u00d7\u00b6\u00be\u001eS)\u00ff\u0081\u00ae\u00a5\u00be\u00c9%\u00c4\u009b\u00ff\u00ca%rH\u00ec\u00dd\r\u00ed>\u00d8\u00a6\u00f2\u00f4)H\u00b5\u0093\u000e\u008d\u00ff\u00ce=\u00fb\u008db\u00f8\u000e\u00de\u00b6\u00e7\u00ed\u000e\u00a2\u00e2\f\"h\u000e\u00e1\u0018\u000eP\u0007 \u0098\u001e\r<\u00e6\u00d4N'7\u0005\u00d8\u00a6\u008br\u00cdL.\u009e\u001e\u00fc\u00f2\u00e9|\u0014 \u00f1\u0088\u00b64\u00b8\u00d9\u00f3\u00ba\u0004\u00cde\u00a0\u008f\u0091Q\u000b?C\u00fe\u00f8\u0097\u0099\u0091j3\u00f7\u00bd\u008b\u00ad\u00ad\u009aG*b\u0094\u00b1s8\u00c1\u0094\u009aw\u0003\u00df\u00d3\u00f6Gv\u00b5".length();
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
                    var6_5 = "\u00e9\u0095~N'\u00f1\u00db\u00f6/\u00c6zB\u0017_\u00a9\u0012";
                    var7_6 = "\u00e9\u0095~N'\u00f1\u00db\u00f6/\u00c6zB\u0017_\u00a9\u0012".length();
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
        g_.b = var8_3;
        g_.c = new Integer[22];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x824;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/g_", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            g_.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = g_.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/g_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

