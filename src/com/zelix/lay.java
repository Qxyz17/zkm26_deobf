/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._e;
import com.zelix.fx;
import com.zelix.lma;
import com.zelix.lpm;
import com.zelix.lqu;
import com.zelix.lty;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.un;
import com.zelix.vg;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lay
extends lpm {
    private static final long a;
    private static final String[] e;
    private static final String[] k;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x5E95758C4C03L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6587799884791622604L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lay.b("w", (int)3602, (long)(0x13E855D34362929L ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    public lay(int n, long l) {
        long l2 = (l = a ^ l) ^ 0xD450B035934L;
        super(n, l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String m(Object[] var0) {
        block23: {
            block17: {
                var2_1 = (Long)var0[0];
                var1_2 = (List)var0[1];
                var4_3 = (Integer)var0[2];
                var5_4 = (var2_1 = lay.a ^ var2_1) ^ 34284114382674L;
                var8_5 = var1_2.size();
                var7_6 = m44.a("h", (long)-711901634748209882L, (long)var2_1);
                if (var8_5 <= 0) break block23;
                v0 = new Object[5];
                v0[4] = (int)lay.c("n", (int)30994, (long)(6546214901276856868L ^ var2_1));
                v0[3] = var5_4;
                v0[2] = var4_3;
                v0[1] = (int)lay.c("n", (int)12709, (long)(7118923930078648977L ^ var2_1));
                v0[0] = "";
                var9_7 = m44.a("h", (Object)v0, (long)-1437346545722143291L, (long)var2_1);
                var10_8 = new StringBuffer((int)lay.c("n", (int)26620, (long)(2895221417162067150L ^ var2_1)));
                v1 = new Object[5];
                v1[4] = (int)lay.c("n", (int)18261, (long)(2865213138137574498L ^ var2_1));
                v1[3] = var5_4;
                v1[2] = var4_3;
                v1[1] = (int)lay.c("n", (int)2662, (long)(5882350571053654355L ^ var2_1));
                v1[0] = lay.b("w", (int)7353, (long)(3619106558078578849L ^ var2_1));
                var10_8.append(_e.n + (String)m44.a("h", (Object)v1, (long)-1437346545722143291L, (long)var2_1));
                var11_9 = 0;
                block10: while (var11_9 < var8_5) {
                    v2 = var1_2.get(var11_9);
                    do {
                        block22: {
                            block20: {
                                block18: {
                                    block19: {
                                        v3 = (String)v2;
                                        if (var7_6 != false) break block17;
                                        var12_10 = v3;
                                        try {
                                            try {
                                                v4 /* !! */  = var11_9;
                                                v5 /* !! */  = var7_6;
                                                if (var2_1 >= 0L) {
                                                    if (v5 /* !! */  != false) break block18;
                                                    if (v4 /* !! */  <= 0) break block19;
                                                }
                                                ** GOTO lbl65
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("h", (Object)v6, (long)-1504785368386869584L, (long)var2_1);
                                            }
                                            var10_8.append((String)var9_7);
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("h", (Object)v7, (long)-1504785368386869584L, (long)var2_1);
                                        }
                                    }
                                    try {
                                        if (var2_1 >= 0L) {
                                            v8 = var10_8.append((String)m44.a("w", (Object)var12_10, (long)-1341009493807364620L, (long)var2_1));
                                            if (var7_6 != false) break block20;
                                        }
                                        v4 /* !! */  = var11_9;
                                    }
                                    catch (n9 v9) {
                                        throw m44.a("h", (Object)v9, (long)-1504785368386869584L, (long)var2_1);
                                    }
                                }
                                try {
                                    block21: {
                                        try {
                                            block24: {
                                                if (var2_1 <= 0L) break block24;
                                                v5 /* !! */  = (CallSite)(var8_5 - 1);
lbl65:
                                                // 2 sources

                                                if (v4 /* !! */  >= v5 /* !! */ ) break block21;
                                                var10_8.append((String)lay.b("w", (int)3992, (long)(5732784378869638021L ^ var2_1)) + _e.n);
                                                v4 /* !! */  = (int)var7_6;
                                            }
                                            if (var2_1 <= 0L) break block22;
                                            if (v4 /* !! */  == 0) break block20;
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("h", (Object)v10, (long)-1504785368386869584L, (long)var2_1);
                                        }
                                    }
                                    v8 = var10_8.append(";" + _e.n);
                                }
                                catch (n9 v11) {
                                    throw m44.a("h", (Object)v11, (long)-1504785368386869584L, (long)var2_1);
                                }
                            }
                            ++var11_9;
                            v4 /* !! */  = (int)var7_6;
                        }
                        if (v4 /* !! */  == 0) continue block10;
                        v2 = var10_8;
                    } while (var2_1 <= 0L);
                }
                v3 = v2.toString();
            }
            return v3;
        }
        return null;
    }

    public static lpm L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        lqu lqu2 = (lqu)objectArray[2];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x3AAF745EBE62L;
        long l4 = l2 ^ 0x1788D76A7D4L;
        long l5 = l2 ^ 0x3A25FE2CF15FL;
        long l6 = l2 ^ 0x2ABF7A9FBAE0L;
        BufferedReader bufferedReader = new BufferedReader(new StringReader(string));
        try {
            fx fx2 = new fx((Reader)bufferedReader, l3);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l6;
            CallSite callSite = m44.a("p", (Object)fx2, (Object)objectArray2, (long)5362522394482123856L, (long)l);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l5;
            objectArray3[1] = lqu2;
            objectArray3[0] = null;
            m44.a("p", (Object)callSite, (Object)objectArray3, (long)6231138401228979704L, (long)l);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l4;
            CallSite callSite2 = m44.a("p", (Object)((lty)callSite), (Object)objectArray4, (long)6299811296417614760L, (long)l);
            return callSite2;
        }
        catch (lma lma2) {
            throw new un((String)((Object)m44.a("p", (Object)((Object)lma2), (long)6230234474342459320L, (long)l)));
        }
        catch (vg vg2) {
            throw new un((String)((Object)m44.a("p", (Object)((Object)vg2), (long)5664891201994749554L, (long)l)));
        }
    }

    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x550B0FC6572DL;
        long l4 = l2 ^ 0x6DF7BA9051C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        String string = (String)((Object)m44.a("n", (Object)objectArray2, (long)3433008837598041604L, (long)l)) + (String)((Object)lay.b("w", (int)2472, (long)(0x173C681AF3FA7F1L ^ l)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray3, (long)3638594277050117288L, (long)l);
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lay.b("w", (int)17797, (long)(0x6E731F1D161FA4F3L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        lay.a = prr.a((long)-7559554612566775055L, (long)-1854129498629797130L, MethodHandles.lookup().lookupClass()).a(38436131566807L);
                        lay.n = new HashMap<K, V>(13);
                        var11 = lay.a ^ 51530762613809L;
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
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "\u00df|\u008a\r\u00f1\u00bdcdT\u00d5\u00ff\u00bc\u009df[\u00b8 \u0087fC\u00a4\u008d5\u0083\u0010\u0099\u00c5\u008e&\u0017\u00d4r\u009d\u00d9\u00df,\u0080P{!6 \u00d9\u00b9\u00bb\r\u0081\u00dao`\u00d3V`W\u0083\u00d0\u00a8\u00a2\u0095v\u0014\u0000\u0019\u00e2R\u00a3\u0013\u00d2s\u0086\u000e~k\u00dc";
                        var19_6 = "\u00df|\u008a\r\u00f1\u00bdcdT\u00d5\u00ff\u00bc\u009df[\u00b8 \u0087fC\u00a4\u008d5\u0083\u0010\u0099\u00c5\u008e&\u0017\u00d4r\u009d\u00d9\u00df,\u0080P{!6 \u00d9\u00b9\u00bb\r\u0081\u00dao`\u00d3V`W\u0083\u00d0\u00a8\u00a2\u0095v\u0014\u0000\u0019\u00e2R\u00a3\u0013\u00d2s\u0086\u000e~k\u00dc".length();
                        var16_7 = 24;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = lay.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "/mi\u00f2\u00f7\u00cb\u0089\u00f6;M\u00deEu(\u00b9?<\u000e\u00a2\u001c#\u00c1\u00cdoF\u001f>\u0096(\u00fcf\u00ff\u00abD\u00db{e\u00d0\u0098?\b\u00c2\u00be\u009c\u009eP\u0088\u00e1 \u00f2v\u00a7\u00d7Xx\u00db\t;\u00a2L7\u0080\u00f3y\tJ\u00980\u0088\u00d9\u001aA\u00cdG\u008d\u008a3\u008ay\u00baG";
                            var19_6 = "/mi\u00f2\u00f7\u00cb\u0089\u00f6;M\u00deEu(\u00b9?<\u000e\u00a2\u001c#\u00c1\u00cdoF\u001f>\u0096(\u00fcf\u00ff\u00abD\u00db{e\u00d0\u0098?\b\u00c2\u00be\u009c\u009eP\u0088\u00e1 \u00f2v\u00a7\u00d7Xx\u00db\t;\u00a2L7\u0080\u00f3y\tJ\u00980\u0088\u00d9\u001aA\u00cdG\u008d\u008a3\u008ay\u00baG".length();
                            var16_7 = 48;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = lay.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                lay.e = var20_3;
                lay.k = new String[5];
                lay.q = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u00c1?K'\u00b9\u0013/?\b\u00b3\u000b\u00d7\u0012\u00dc\u0007c\u008d]\u00dc\u008dV`\u0083\u00be";
                var5_15 = "\u00c1?K'\u00b9\u0013/?\b\u00b3\u000b\u00d7\u0012\u00dc\u0007c\u008d]\u00dc\u008dV`\u0083\u00be".length();
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
                    var4_14 = "#\u0097\u00a6f\u00far\u0016\u0007\u00f5j\u00fcZ\u00da\u00c1\u00a2t";
                    var5_15 = "#\u0097\u00a6f\u00far\u0016\u0007\u00f5j\u00fcZ\u00da\u00c1\u00a2t".length();
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
        lay.o = var6_12;
        lay.p = new Integer[5];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xEDB;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])lay.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lay.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lay", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            lay.k[n2] = lay.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lay.b(n, l);
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
            throw new RuntimeException("com/zelix/lay" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x49F1;
        if (p[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lay", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lay.p[n2] = n3;
        }
        return p[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = lay.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lay" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lay.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lay.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
