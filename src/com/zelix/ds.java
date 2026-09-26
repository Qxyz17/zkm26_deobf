/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._x;
import com.zelix.de;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v8;
import com.zelix.yf;
import com.zelix.zr;
import java.io.BufferedReader;
import java.io.PrintWriter;
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

public class ds
extends de {
    private static final long a;
    private static final String[] b;
    private static final String[] h;
    private static final Map i;

    ds(long l, BufferedReader bufferedReader) {
        long l2 = (l = a ^ l) ^ 0x8B51B92F5DCL;
        super(l2, bufferedReader);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    String y(Object[] var1_1) {
        block19: {
            block20: {
                block17: {
                    block18: {
                        block15: {
                            block16: {
                                var2_2 = (String)var1_1[0];
                                var3_3 = (Long)var1_1[1];
                                var5_4 = m44.a("k", (long)2410152782954818836L, (long)var3_3);
                                try {
                                    try {
                                        v0 /* !! */  = m44.a("t", (Object)var2_2, (Object)ds.b("y", (int)385, (long)(1654753337115849326L ^ var3_3)), (long)4231945477401417126L, (long)var3_3);
                                        v1 = var5_4;
                                        if (var3_3 > 0L) {
                                            if (v1 == null) break block15;
                                            if (v0 /* !! */  == false) break block16;
                                        }
                                        ** GOTO lbl26
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("k", (Object)v2, (long)2380876931359326888L, (long)var3_3);
                                    }
                                    return ds.b("y", (int)11836, (long)(56427423398305237L ^ var3_3));
                                }
                                catch (n9 v3) {
                                    throw m44.a("k", (Object)v3, (long)2380876931359326888L, (long)var3_3);
                                }
                            }
                            v0 /* !! */  = m44.a("t", (Object)var2_2, (Object)ds.b("y", (int)23624, (long)(3345694570212454309L ^ var3_3)), (long)4231945477401417126L, (long)var3_3);
                        }
                        try {
                            try {
                                if (var3_3 <= 0L) break block17;
                                v1 = var5_4;
lbl26:
                                // 2 sources

                                if (v1 == null) break block17;
                                if (v0 /* !! */  == false) break block18;
                            }
                            catch (n9 v4) {
                                throw m44.a("k", (Object)v4, (long)2380876931359326888L, (long)var3_3);
                            }
                            return ds.b("y", (int)30680, (long)(6546599664950625343L ^ var3_3));
                        }
                        catch (n9 v5) {
                            throw m44.a("k", (Object)v5, (long)2380876931359326888L, (long)var3_3);
                        }
                    }
                    try {
                        v6 = var2_2;
                        if (var5_4 == null) break block19;
                        v0 /* !! */  = m44.a("t", (Object)v6, (Object)ds.b("y", (int)28112, (long)(5660666042448436790L ^ var3_3)), (long)4231945477401417126L, (long)var3_3);
                    }
                    catch (n9 v7) {
                        throw m44.a("k", (Object)v7, (long)2380876931359326888L, (long)var3_3);
                    }
                }
                try {
                    if (var3_3 > 0L) {
                        if (v0 /* !! */  == false) break block20;
                        v0 /* !! */  = (CallSite)7008;
                    }
                    return ds.b("y", (int)v0 /* !! */ , (long)(2290405767961684104L ^ var3_3));
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)2380876931359326888L, (long)var3_3);
                }
            }
            v6 = var2_2;
        }
        return v6;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void e(Object[] var1_1) {
        block44: {
            var8_2 = (PrintWriter)var1_1[0];
            var2_3 = (v8)var1_1[1];
            var7_4 = (v8)var1_1[2];
            var5_5 = (_x)var1_1[3];
            var3_6 = (Long)var1_1[4];
            var10_7 = (String)var1_1[5];
            var9_8 = (Boolean)var1_1[6];
            var6_9 = (yf)var1_1[7];
            v0 = var3_6;
            var11_10 = v0 ^ 88221798779897L;
            var13_11 = v0 ^ 24145726917794L;
            var15_12 = v0 ^ 95010075178145L;
            var17_13 = v0 ^ 95978910321007L;
            var19_14 = v0 ^ 98580148073550L;
            var21_15 = v0 ^ 106403255485694L;
            v1 = new Object[1];
            v1[0] = var17_13;
            var24_16 = m44.a("u", (Object)m44.a("t", (Object)this, (long)2000224327337344609L, (long)var3_6), (Object)v1, (long)1972508050807944623L, (long)var3_6);
            var23_17 = m44.a("j", (long)1989409111298791421L, (long)var3_6);
            while (var24_16.hasMoreElements()) {
                block49: {
                    block50: {
                        block55: {
                            block54: {
                                block53: {
                                    block52: {
                                        block51: {
                                            block45: {
                                                block48: {
                                                    block46: {
                                                        var25_18 = (String)var24_16.nextElement();
                                                        try {
                                                            try {
                                                                if (var23_17 == null) break block44;
                                                                v2 = var25_18.equals(ds.b("y", (int)11836, (long)(56330546173454140L ^ var3_6)));
                                                                v3 = var23_17;
                                                                if (var3_6 > 0L) {
                                                                    if (v3 == null) break block45;
                                                                }
                                                                ** GOTO lbl103
                                                            }
                                                            catch (n9 v4) {
                                                                throw m44.a("j", (Object)v4, (long)2009672855554062401L, (long)var3_6);
                                                            }
                                                            if (v2 != 0) {
                                                            }
                                                            ** GOTO lbl96
                                                        }
                                                        catch (n9 v5) {
                                                            throw m44.a("j", (Object)v5, (long)2009672855554062401L, (long)var3_6);
                                                        }
                                                        v6 = new Object[1];
                                                        v6[0] = var13_11;
                                                        var26_19 /* !! */  = m44.a("u", (Object)this, (Object)v6, (long)500966570571192672L, (long)var3_6);
                                                        try {
                                                            block47: {
                                                                try {
                                                                    try {
                                                                        v7 = var23_17;
                                                                        if (var3_6 >= 0L) {
                                                                            if (v7 == null) break block46;
                                                                            if (var26_19 /* !! */  == null) break block47;
                                                                        }
                                                                        ** GOTO lbl80
                                                                    }
                                                                    catch (n9 v8) {
                                                                        throw m44.a("j", (Object)v8, (long)2009672855554062401L, (long)var3_6);
                                                                    }
                                                                    if (var3_6 < 0L) break block48;
                                                                    if (var26_19 /* !! */ .length() > 0) {
                                                                    }
                                                                    ** GOTO lbl83
                                                                }
                                                                catch (n9 v9) {
                                                                    throw m44.a("j", (Object)v9, (long)2009672855554062401L, (long)var3_6);
                                                                }
                                                            }
                                                            v10 = new Object[4];
                                                            v10[3] = var21_15;
                                                            v10[2] = var5_5;
                                                            v10[1] = var7_4;
                                                            v10[0] = var26_19 /* !! */ ;
                                                            v11 = new Object[2];
                                                            v11[1] = var15_12;
                                                            v11[0] = (String)ds.b("y", (int)83, (long)(5857314441918515551L ^ var3_6)) + (String)m44.a("j", (Object)v10, (long)1887349361155750598L, (long)var3_6);
                                                            var8_2.println((String)m44.a("u", (Object)this, (Object)v11, (long)351300521102338507L, (long)var3_6));
                                                        }
                                                        catch (n9 v12) {
                                                            throw m44.a("j", (Object)v12, (long)2009672855554062401L, (long)var3_6);
                                                        }
                                                    }
                                                    try {
                                                        v7 = var23_17;
lbl80:
                                                        // 2 sources

                                                        if (var3_6 >= 0L) {
                                                            if (v7 != null) break block48;
                                                        }
                                                        ** GOTO lbl94
lbl83:
                                                        // 2 sources

                                                        v13 = new Object[2];
                                                        v13[1] = var15_12;
                                                        v13[0] = ds.b("y", (int)7994, (long)(1421309995888449081L ^ var3_6));
                                                        var8_2.println((String)m44.a("u", (Object)this, (Object)v13, (long)351300521102338507L, (long)var3_6));
                                                    }
                                                    catch (n9 v14) {
                                                        throw m44.a("j", (Object)v14, (long)2009672855554062401L, (long)var3_6);
                                                    }
                                                }
                                                try {
                                                    v7 = var23_17;
lbl94:
                                                    // 2 sources

                                                    if (var3_6 < 0L) break block49;
                                                    if (v7 != null) break block50;
lbl96:
                                                    // 2 sources

                                                    v2 = var25_18.equals(ds.b("y", (int)30680, (long)(6546661082537262806L ^ var3_6)));
                                                }
                                                catch (n9 v15) {
                                                    throw m44.a("j", (Object)v15, (long)2009672855554062401L, (long)var3_6);
                                                }
                                            }
                                            try {
                                                v3 = var23_17;
lbl103:
                                                // 2 sources

                                                if (var3_6 < 0L) ** GOTO lbl127
                                                if (v3 == null) break block51;
                                                if (v2 != 0) {
                                                }
                                                ** GOTO lbl120
                                            }
                                            catch (n9 v16) {
                                                throw m44.a("j", (Object)v16, (long)2009672855554062401L, (long)var3_6);
                                            }
                                            v17 = new Object[2];
                                            v17[1] = ds.b("y", (int)30680, (long)(6546661082537262806L ^ var3_6));
                                            v17[0] = var11_10;
                                            var26_19 /* !! */  = m44.a("u", (Object)this, (Object)v17, (long)474588477376924795L, (long)var3_6);
                                            try {
                                                var8_2.println((String)ds.b("y", (int)287, (long)(2523231585039681554L ^ var3_6)) + (String)var26_19 /* !! */ );
                                                v7 = var23_17;
                                                if (var3_6 < 0L) break block49;
                                                if (v7 != null) break block50;
lbl120:
                                                // 2 sources

                                                v2 = (int)var25_18.equals(ds.b("y", (int)7008, (long)(2290502404800483937L ^ var3_6)));
                                            }
                                            catch (n9 v18) {
                                                throw m44.a("j", (Object)v18, (long)2009672855554062401L, (long)var3_6);
                                            }
                                        }
                                        try {
                                            v3 = var23_17;
lbl127:
                                            // 2 sources

                                            if (var3_6 < 0L) ** GOTO lbl153
                                            if (v3 == null) break block52;
                                            if (v2 != 0) {
                                            }
                                            ** GOTO lbl144
                                        }
                                        catch (n9 v19) {
                                            throw m44.a("j", (Object)v19, (long)2009672855554062401L, (long)var3_6);
                                        }
                                        v20 = new Object[2];
                                        v20[1] = ds.b("y", (int)7008, (long)(2290502404800483937L ^ var3_6));
                                        v20[0] = var11_10;
                                        var26_19 /* !! */  = m44.a("u", (Object)this, (Object)v20, (long)474588477376924795L, (long)var3_6);
                                        try {
                                            var8_2.println((String)ds.b("y", (int)14387, (long)(7582306528208335158L ^ var3_6)) + (String)var26_19 /* !! */ );
                                            v7 = var23_17;
                                            if (var3_6 <= 0L) break block49;
                                            if (v7 != null) break block50;
lbl144:
                                            // 2 sources

                                            v2 = (int)var25_18.equals(ds.b("y", (int)14200, (long)(3320463088025190010L ^ var3_6)));
                                        }
                                        catch (n9 v21) {
                                            throw m44.a("j", (Object)v21, (long)2009672855554062401L, (long)var3_6);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var3_6 <= 0L) break block53;
                                            v3 = var23_17;
lbl153:
                                            // 2 sources

                                            if (v3 == null) break block53;
                                            if (v2 != 0) break block50;
                                        }
                                        catch (n9 v22) {
                                            throw m44.a("j", (Object)v22, (long)2009672855554062401L, (long)var3_6);
                                        }
                                        v2 = var25_18.indexOf((String)ds.b("y", (int)1984, (long)(2808724706130726599L ^ var3_6)));
                                    }
                                    catch (n9 v23) {
                                        throw m44.a("j", (Object)v23, (long)2009672855554062401L, (long)var3_6);
                                    }
                                }
                                try {
                                    if (v2 == -1) break block54;
                                    break block50;
                                }
                                catch (n9 v24) {
                                    throw m44.a("j", (Object)v24, (long)2009672855554062401L, (long)var3_6);
                                }
                            }
                            var26_19 /* !! */  = new zr();
                            v25 = new Object[8];
                            v25[7] = var19_14;
                            v25[6] = var6_9;
                            v25[5] = var9_8;
                            v25[4] = var10_7;
                            v25[3] = var26_19 /* !! */ ;
                            v25[2] = var7_4;
                            v25[1] = var2_3;
                            v25[0] = var25_18;
                            var27_20 = m44.a("u", (Object)this, (Object)v25, (long)450395431916180656L, (long)var3_6);
                            try {
                                v26 /* !! */  = var26_19 /* !! */ .S();
                                if (var3_6 <= 0L || var23_17 == null) break block55;
                                if (v26 /* !! */ ) {
                                }
                                ** GOTO lbl193
                            }
                            catch (n9 v27) {
                                throw m44.a("j", (Object)v27, (long)2009672855554062401L, (long)var3_6);
                            }
                            v26 /* !! */  = m44.a("n", (long)52672071666553559L, (long)var3_6);
                        }
                        try {
                            if (!v26 /* !! */ ) break block50;
lbl193:
                            // 2 sources

                            var8_2.println((String)var27_20);
                        }
                        catch (n9 v28) {
                            throw m44.a("j", (Object)v28, (long)2009672855554062401L, (long)var3_6);
                        }
                    }
                    v7 = var23_17;
                }
                if (v7 != null) continue;
            }
            m44.a("u", (Object)var8_2, (long)452840013769707107L, (long)var3_6);
            if (var3_6 >= 0L) {
                // empty if block
            }
        }
    }

    String w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x460EA20BBAE5L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = ds.b("y", (int)11836, (long)(0xC801BC1BED2D7DL ^ l));
        return m44.a("t", (Object)((Object)this), (Object)objectArray2, (long)1296950882375090468L, (long)l);
    }

    void b(Object[] objectArray) {
        String string = (String)objectArray[0];
        Map map = (Map)objectArray[1];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ds.a = prr.a((long)3863834883592172274L, (long)-8417078403214961753L, MethodHandles.lookup().lookupClass()).a(13002636162164L);
                ds.i = new HashMap<K, V>(13);
                var0 = ds.a ^ 36952439389787L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = " \u008aS!\u00b1\u00d4d\u0014,\u00ac\u00b8\u00fd\u0086\u0097W3\u0010_\u00dd\u008b\\>|1Q\u00b6ufl]r\u0092@ \u009f\f}\u00bd\u00de\u00c29\u00d7\u0011\u00e5)\u00d5\u00f7\u00d2\u00db\u00b4%\u0087 \u0080\u0016\u0015\u0097\"T;Qz\u008b\u00dd\u00a0\u001b e\u00a3\u00e0\u00b1\u00dd\u00e8Pa\u00e5\u00f3\b\u00b76\u008cFL\u0086D\b4\u008cK\t\u00e8\u00da\u00183\u00b1\u0006\u00f0\u00aaZ\u0010\u009fI\u0002\u0003 \u000b\u00dd1\u001b2-C>\u00d8\u00c7\u00c7\u0010\u00e1\u00fdW\u00d1\u0090\u00e7\u0015V\u008fECR\u00b2d\u00fe\u00cd\u0010\b\u00b4\u00b5\u00bd\u0085\u00cc\u00c9_\u00b2\u000ef\u00d7\u000e\u0018\u00c5\u0099\u0010\u00ca4$\u0087\u00e1\u00cc\u00ad\u001dt\u00c8\u000eM\u00cb=\u00b7\u00c3\u0010&~\u00afa(*\u008f\u000e\u009b\u008c(i?s\u00c02\u00181\u0089\\*\u00d2\u00d8\"\u00b7v\u00ec^\u0080/\u009b\u00ddrt\u00e3\tE\u00c4RAj";
                var8_6 = " \u008aS!\u00b1\u00d4d\u0014,\u00ac\u00b8\u00fd\u0086\u0097W3\u0010_\u00dd\u008b\\>|1Q\u00b6ufl]r\u0092@ \u009f\f}\u00bd\u00de\u00c29\u00d7\u0011\u00e5)\u00d5\u00f7\u00d2\u00db\u00b4%\u0087 \u0080\u0016\u0015\u0097\"T;Qz\u008b\u00dd\u00a0\u001b e\u00a3\u00e0\u00b1\u00dd\u00e8Pa\u00e5\u00f3\b\u00b76\u008cFL\u0086D\b4\u008cK\t\u00e8\u00da\u00183\u00b1\u0006\u00f0\u00aaZ\u0010\u009fI\u0002\u0003 \u000b\u00dd1\u001b2-C>\u00d8\u00c7\u00c7\u0010\u00e1\u00fdW\u00d1\u0090\u00e7\u0015V\u008fECR\u00b2d\u00fe\u00cd\u0010\b\u00b4\u00b5\u00bd\u0085\u00cc\u00c9_\u00b2\u000ef\u00d7\u000e\u0018\u00c5\u0099\u0010\u00ca4$\u0087\u00e1\u00cc\u00ad\u001dt\u00c8\u000eM\u00cb=\u00b7\u00c3\u0010&~\u00afa(*\u008f\u000e\u009b\u008c(i?s\u00c02\u00181\u0089\\*\u00d2\u00d8\"\u00b7v\u00ec^\u0080/\u009b\u00ddrt\u00e3\tE\u00c4RAj".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ds.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "w\t\u0004}\u00cf\u000b\"\u0014[T\u00c2\u00c1\u00bc\u0085\u00f6S3(Q}=L\u00b1g\u00a3\u00e0o4^-\u001c%\u0010V\u00ea\u00d5\u00d1\u00d2\u00f4\u0006\u0094Yl\u00c6\u00f2\f\u00d7\u009aL";
                    var8_6 = "w\t\u0004}\u00cf\u000b\"\u0014[T\u00c2\u00c1\u00bc\u0085\u00f6S3(Q}=L\u00b1g\u00a3\u00e0o4^-\u001c%\u0010V\u00ea\u00d5\u00d1\u00d2\u00f4\u0006\u0094Yl\u00c6\u00f2\f\u00d7\u009aL".length();
                    var5_7 = 32;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ds.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        ds.b = var9_3;
        ds.h = new String[12];
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xE2;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ds", exception);
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
            ds.h[n2] = ds.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ds.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ds" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ds.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
