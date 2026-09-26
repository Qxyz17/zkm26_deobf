/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._e;
import com.zelix.lks;
import com.zelix.loq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.xv;
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

public abstract class vu {
    xv[] Y;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    String Q(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var6_3 = (Integer)var1_1[1];
        var4_4 = (lks)var1_1[2];
        var5_5 = (loq)var1_1[3];
        v0 = var2_2 = vu.b ^ var2_2;
        var7_6 = v0 ^ 137373780579461L;
        var9_7 = v0 ^ 113314947330807L;
        var11_8 = v0 ^ 46251593843477L;
        var13_9 = v0 ^ 12690885449696L;
        var15_10 = v0 ^ 53209000606954L;
        var17_11 = v0 ^ 111287060705771L;
        var19_12 = v0 ^ 35408582512026L;
        var22_13 = new StringBuffer((int)vu.f);
        var23_14 = false;
        var24_15 = null;
        var25_16 = ((CallSite)m44.a("w", (Object)this, (long)4876832083978467445L, (long)var2_2)).length - 1;
        var21_17 = m44.a("i", (long)6528970768958091751L, (long)var2_2);
        while (var25_16 >= 0) {
            block46: {
                block47: {
                    block48: {
                        block37: {
                            block45: {
                                block38: {
                                    block43: {
                                        block42: {
                                            block40: {
                                                block39: {
                                                    var26_18 = m44.a("w", (Object)this, (long)4876832083978467445L, (long)var2_2)[var25_16];
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v1 /* !! */  = var23_14;
                                                                    v2 = var21_17;
                                                                    if (var2_2 > 0L) {
                                                                        if (v2 == false) break block37;
                                                                        if (!v1 /* !! */ ) break block38;
                                                                    }
                                                                    ** GOTO lbl148
                                                                }
                                                                catch (n9 v3) {
                                                                    throw m44.a("i", (Object)v3, (long)4989186849404102796L, (long)var2_2);
                                                                }
                                                                v4 = var26_18;
                                                                if (var21_17 == false) break block39;
                                                            }
                                                            catch (n9 v5) {
                                                                throw m44.a("i", (Object)v5, (long)4989186849404102796L, (long)var2_2);
                                                            }
                                                            v6 = new Object[1];
                                                            v6[0] = var19_12;
                                                            if (m44.a("v", (Object)v4, (Object)v6, (long)6741303013129244281L, (long)var2_2) != false) {
                                                            }
                                                            ** GOTO lbl124
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("i", (Object)v7, (long)4989186849404102796L, (long)var2_2);
                                                        }
                                                        v4 = var26_18;
                                                    }
                                                    catch (n9 v8) {
                                                        throw m44.a("i", (Object)v8, (long)4989186849404102796L, (long)var2_2);
                                                    }
                                                }
                                                v9 = new Object[1];
                                                v9[0] = var15_10;
                                                var27_19 = m44.a("v", (Object)v4, (Object)v9, (long)6786190290952125694L, (long)var2_2);
                                                try {
                                                    block41: {
                                                        try {
                                                            try {
                                                                try {
                                                                    v10 /* !! */  = var21_17;
                                                                    if (var2_2 > 0L) {
                                                                        if (v10 /* !! */  == false) break block40;
                                                                        if (var27_19.startsWith((String)vu.a("i", (int)6682, (long)(3452208426718634279L ^ var2_2)))) break block41;
                                                                    }
                                                                    ** GOTO lbl89
                                                                }
                                                                catch (n9 v11) {
                                                                    throw m44.a("i", (Object)v11, (long)4989186849404102796L, (long)var2_2);
                                                                }
                                                                v10 /* !! */  = (CallSite)var27_19.startsWith((String)vu.a("i", (int)18770, (long)(2137481219647533675L ^ var2_2)));
                                                                if (var2_2 <= 0L || var21_17 == false) break block42;
                                                            }
                                                            catch (n9 v12) {
                                                                throw m44.a("i", (Object)v12, (long)4989186849404102796L, (long)var2_2);
                                                            }
                                                            if (var2_2 < 0L) break block42;
                                                            if (v10 /* !! */  != false) {
                                                            }
                                                            ** GOTO lbl92
                                                        }
                                                        catch (n9 v13) {
                                                            throw m44.a("i", (Object)v13, (long)4989186849404102796L, (long)var2_2);
                                                        }
                                                    }
                                                    var22_13.append((String)vu.a("i", (int)5100, (long)(3024450107650812118L ^ var2_2)) + _e.n);
                                                }
                                                catch (n9 v14) {
                                                    throw m44.a("i", (Object)v14, (long)4989186849404102796L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                v10 /* !! */  = var21_17;
lbl89:
                                                // 2 sources

                                                if (var2_2 >= 0L) {
                                                    if (v10 /* !! */  != false) break block43;
                                                }
                                                ** GOTO lbl123
lbl92:
                                                // 2 sources

                                                v15 = new Object[1];
                                                v15[0] = var9_7;
                                                v10 /* !! */  = m44.a("v", (Object)var24_15, (Object)v15, (long)5178474764872796915L, (long)var2_2);
                                            }
                                            catch (n9 v16) {
                                                throw m44.a("i", (Object)v16, (long)4989186849404102796L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            block44: {
                                                try {
                                                    if (var2_2 >= 0L) {
                                                        if (v10 /* !! */  == false) break block44;
                                                        var22_13.append((String)vu.a("i", (int)24410, (long)(3328501605801714790L ^ var2_2)) + _e.n);
                                                        v10 /* !! */  = var21_17;
                                                    }
                                                    if (var2_2 > 0L) {
                                                        if (v10 /* !! */  != false) break block43;
                                                    }
                                                    ** GOTO lbl123
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("i", (Object)v17, (long)4989186849404102796L, (long)var2_2);
                                                }
                                            }
                                            var22_13.append((String)vu.a("i", (int)25167, (long)(3540210735446776183L ^ var2_2)) + _e.n);
                                        }
                                        catch (n9 v18) {
                                            throw m44.a("i", (Object)v18, (long)4989186849404102796L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        if (var2_2 <= 0L) break block45;
                                        v10 /* !! */  = var21_17;
lbl123:
                                        // 3 sources

                                        if (v10 /* !! */  != false) break block38;
lbl124:
                                        // 2 sources

                                        var22_13.append((String)vu.a("i", (int)27300, (long)(3690864650258829727L ^ var2_2)) + _e.n);
                                    }
                                    catch (n9 v19) {
                                        throw m44.a("i", (Object)v19, (long)4989186849404102796L, (long)var2_2);
                                    }
                                }
                                v20 = new Object[4];
                                v20[3] = var5_5;
                                v20[2] = var4_4;
                                v20[1] = var11_8;
                                v20[0] = var6_3;
                                var22_13.append((String)m44.a("v", (Object)var26_18, (Object)v20, (long)4732827303236458731L, (long)var2_2));
                            }
                            v21 = new Object[1];
                            v21[0] = var13_9;
                            v1 /* !! */  = m44.a("v", (Object)var26_18, (Object)v21, (long)6835881219197578383L, (long)var2_2);
                        }
                        try {
                            try {
                                if (var2_2 <= 0L) break block46;
                                v2 = var21_17;
lbl148:
                                // 2 sources

                                if (v2 == false) break block47;
                                if (!v1 /* !! */ ) break block48;
                            }
                            catch (n9 v22) {
                                throw m44.a("i", (Object)v22, (long)4989186849404102796L, (long)var2_2);
                            }
                            v23 = new Object[1];
                            v23[0] = var17_11;
                            var22_13.append("<" + (String)m44.a("v", (Object)var26_18, (Object)v23, (long)6624707404189445598L, (long)var2_2) + ">" + _e.n);
                        }
                        catch (n9 v24) {
                            throw m44.a("i", (Object)v24, (long)4989186849404102796L, (long)var2_2);
                        }
                    }
                    v25 = new Object[1];
                    v25[0] = var7_6;
                    v26 = m44.a("v", (Object)var26_18, (Object)v25, (long)4844699708268975827L, (long)var2_2);
                }
                var23_14 = v26;
                var24_15 = var26_18;
                --var25_16;
                v1 /* !! */  = var21_17;
            }
            if (v1 /* !! */ ) continue;
        }
        return var22_13.toString();
    }

    /*
     * Exception decompiling
     */
    boolean a(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrApi.lambda$main$2(CfrApi.java:31)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    vu() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    vu.b = prr.a((long)-7117447527677529855L, (long)-5368130273639216079L, MethodHandles.lookup().lookupClass()).a(225674917048855L);
                    vu.e = new HashMap<K, V>(13);
                    var5 = vu.b ^ 1330308768226L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[6];
                    var12_4 = 0;
                    var11_5 = "\u00cd\u0082e\u00d6k\u00f0\u00d4\u0014U\u001f\u0017)c\u00ef(\u00e9\u0080'a.\u00c7\u0011jl\u00f5/\u0082\u0080\u00a4\u00c2\u00c8\u00f2\u00fc\u0085\u00e9\u00d1\u0006\u00b2\b\u00absh\u009aN}E\u00eeI\u00b0yL\u00af\u0097\u00ea\u00b2\u00eeL,J\u00df\u00d2\u00bd;\u00117\u0081\u00cd(\u00ac\u00d5\u00ca\u00b3\u001fM\u00cb\u009e\u000f\u0000\u00bf\u00a3\u0084P\u00d0\u00b0'\u00de\u0082\u00f0\u00ca\u0096\u00f4\u009ef\u00ea\u00c3\u00c2\u0000\u00d8\u00ea\u0095\u00f0oo-\u00a5\u00cc\u00db\u00df\r\u00c1\u00ca3RC\u00d0\u00c1\u00a11\u00a8\u00ddj\u007f\u00e8s\u00baViQe>(\u00ae~\u00d9Q\u0087\u00ae\u00bc\u00bca\u00d8\u00aaS\u00c7V8\u00ca.>\u00e86\u00c0P\u00bb\u0007\u00ec\u00ff\u00f5\u00d9\u000e\u00d4\u00adzZ1V\u00dc\u000e\u0019h\u00e2\u0084\u000e\u00f9\u00e1FN\u00bc\u00d3,\u00b9m\u00f8\u0015!\u00e3_/y\u00a4\u00e1\u0007'\u0002\u00e9\u00c6\u0011\u00ff\u00d8\u0083\n\u00880\u00da3\u00af\u00ab\u00a9^X\u0004b\u00c7u\u00fe\u009e\u00fe\u00d3s\u00a2>\u00e0/\u00c8\u0095\u00bdO\u00da!E\u00d2\u00aa\u00caN \u0006K\u0087\u00de\u00b5h\u00d2\u00d6\u008a\u001a\u00fe\fx3\u0093-";
                    var13_6 = "\u00cd\u0082e\u00d6k\u00f0\u00d4\u0014U\u001f\u0017)c\u00ef(\u00e9\u0080'a.\u00c7\u0011jl\u00f5/\u0082\u0080\u00a4\u00c2\u00c8\u00f2\u00fc\u0085\u00e9\u00d1\u0006\u00b2\b\u00absh\u009aN}E\u00eeI\u00b0yL\u00af\u0097\u00ea\u00b2\u00eeL,J\u00df\u00d2\u00bd;\u00117\u0081\u00cd(\u00ac\u00d5\u00ca\u00b3\u001fM\u00cb\u009e\u000f\u0000\u00bf\u00a3\u0084P\u00d0\u00b0'\u00de\u0082\u00f0\u00ca\u0096\u00f4\u009ef\u00ea\u00c3\u00c2\u0000\u00d8\u00ea\u0095\u00f0oo-\u00a5\u00cc\u00db\u00df\r\u00c1\u00ca3RC\u00d0\u00c1\u00a11\u00a8\u00ddj\u007f\u00e8s\u00baViQe>(\u00ae~\u00d9Q\u0087\u00ae\u00bc\u00bca\u00d8\u00aaS\u00c7V8\u00ca.>\u00e86\u00c0P\u00bb\u0007\u00ec\u00ff\u00f5\u00d9\u000e\u00d4\u00adzZ1V\u00dc\u000e\u0019h\u00e2\u0084\u000e\u00f9\u00e1FN\u00bc\u00d3,\u00b9m\u00f8\u0015!\u00e3_/y\u00a4\u00e1\u0007'\u0002\u00e9\u00c6\u0011\u00ff\u00d8\u0083\n\u00880\u00da3\u00af\u00ab\u00a9^X\u0004b\u00c7u\u00fe\u009e\u00fe\u00d3s\u00a2>\u00e0/\u00c8\u0095\u00bdO\u00da!E\u00d2\u00aa\u00caN \u0006K\u0087\u00de\u00b5h\u00d2\u00d6\u008a\u001a\u00fe\fx3\u0093-".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = vu.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00eb0\u00aa&@\u009a5\u0014ZR\u00bb\u0014\u00d9\u00d4\u00dd\u00b2hD\u009d\u00c7\u001a[\u0004\u0098q\u001a^\u00c7\u00f6\u00b1\u00d4\u00de0\u00d5\u0010Q\u0018\u0013~\u00b1\u00d1\u00fb\u0081\u000b\u00be(\u00fd;\u0012\u00a3\u00c1\u00eb\u000f\u00ed\u00e7\u000bH\u00b46\u00a9T\u0015\u00f9\u001d\u0093#\u00b1\u00b1\u00e44c\u00ff\u00a7\u008f\u00a87\u009f\u00dc\u0084\u00bb'\u00f85\u00e2\u008cW\u00b9U\u0003\u0006y\u00ae\u00bb\u00e3\u0081\u00b2\u0004l\u008db\u00c4\u00a3%2\u00ebS\u001a\u00d1\u00d9\u00c0\u00046\u00e79\u00fc~_c\u00ae\u00f3\u00af";
                        var13_6 = "\u00eb0\u00aa&@\u009a5\u0014ZR\u00bb\u0014\u00d9\u00d4\u00dd\u00b2hD\u009d\u00c7\u001a[\u0004\u0098q\u001a^\u00c7\u00f6\u00b1\u00d4\u00de0\u00d5\u0010Q\u0018\u0013~\u00b1\u00d1\u00fb\u0081\u000b\u00be(\u00fd;\u0012\u00a3\u00c1\u00eb\u000f\u00ed\u00e7\u000bH\u00b46\u00a9T\u0015\u00f9\u001d\u0093#\u00b1\u00b1\u00e44c\u00ff\u00a7\u008f\u00a87\u009f\u00dc\u0084\u00bb'\u00f85\u00e2\u008cW\u00b9U\u0003\u0006y\u00ae\u00bb\u00e3\u0081\u00b2\u0004l\u008db\u00c4\u00a3%2\u00ebS\u001a\u00d1\u00d9\u00c0\u00046\u00e79\u00fc~_c\u00ae\u00f3\u00af".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = vu.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            vu.c = var14_3;
            vu.d = new String[6];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = -4131031497472191382L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        vu.f = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6AE7;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/vu", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            vu.d[n2] = vu.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = vu.a(n, l);
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
            throw new RuntimeException("com/zelix/vu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(vu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
