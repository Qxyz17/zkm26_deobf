/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.IOException;
import java.io.Reader;
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

public class ax {
    protected static int M;
    static int r;
    protected static Reader O;
    protected static char[] I;
    protected static int E;
    static int k;
    protected static int[] b;
    protected static int F;
    protected static boolean d;
    protected static int[] Y;
    public static int R;
    protected static boolean w;
    protected static int g;
    static int m;
    protected static int y;
    private static final long a;
    private static final String c;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map h;

    /*
     * Exception decompiling
     */
    protected static void Y(int var0, byte var1_1, char var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CASE]], but top level block is 10[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public static int p() {
        return Y[k];
    }

    public void v(Object[] objectArray) {
        int n10;
        block10: {
            int n11;
            int n12;
            block11: {
                int n13;
                int n14;
                block12: {
                    block13: {
                        char[] cArray;
                        int n15;
                        block8: {
                            Reader reader = (Reader)objectArray[0];
                            int n16 = (Integer)objectArray[1];
                            long l10 = (Long)objectArray[2];
                            int n17 = (Integer)objectArray[3];
                            n15 = (Integer)objectArray[4];
                            l10 = a ^ l10;
                            CallSite callSite = m44.a("i", (long)-8138709636921485501L, (long)l10);
                            m44.a("j", (Reader)reader, (long)-8189600396841818353L, (long)l10);
                            CallSite callSite2 = callSite;
                            try {
                                block9: {
                                    try {
                                        try {
                                            try {
                                                E = n16;
                                                g = n17 - 1;
                                                cArray = I;
                                                if (callSite2 != null) break block8;
                                                if (cArray == null) break block9;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("i", (Object)n92, (long)-7822689185178488580L, (long)l10);
                                            }
                                            n10 = n15;
                                            if (l10 <= 0L) break block10;
                                            n12 = I.length;
                                            if (callSite2 != null) break block11;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("i", (Object)n93, (long)-7822689185178488580L, (long)l10);
                                        }
                                        if (l10 <= 0L) break block12;
                                        if (n10 == n12) break block13;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("i", (Object)n94, (long)-7822689185178488580L, (long)l10);
                                    }
                                }
                                m = n15;
                                m44.a("j", (int)m, (long)-8481592109649389784L, (long)l10);
                                cArray = new char[n15];
                            }
                            catch (n9 n95) {
                                throw m44.a("i", (Object)n95, (long)-7822689185178488580L, (long)l10);
                            }
                        }
                        I = cArray;
                        b = new int[n15];
                        Y = new int[n15];
                    }
                    w = false;
                    d = false;
                    n14 = 0;
                    n13 = 0;
                }
                y = n14;
                n12 = n13;
                n11 = n13;
            }
            F = n12;
            k = n11;
            n10 = -1;
        }
        R = n10;
    }

    public static char[] t(Object[] objectArray) {
        char[] cArray;
        block8: {
            char[] cArray2;
            block9: {
                int n10;
                block6: {
                    long l10 = (Long)objectArray[0];
                    n10 = (Integer)objectArray[1];
                    l10 = a ^ l10;
                    cArray2 = new char[n10];
                    CallSite callSite = m44.a("m", (long)5814518369096943871L, (long)l10);
                    try {
                        block7: {
                            try {
                                try {
                                    if (callSite != null) break block6;
                                    if (R + 1 < n10) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)n92, (long)5533823001161346880L, (long)l10);
                                }
                                cArray = I;
                                if (l10 < 0L) break block8;
                                System.arraycopy(cArray, R - n10 + 1, cArray2, 0, n10);
                                if (callSite == null) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("m", (Object)n93, (long)5533823001161346880L, (long)l10);
                            }
                        }
                        System.arraycopy(I, m - (n10 - R - 1), cArray2, 0, n10 - R - 1);
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)n94, (long)5533823001161346880L, (long)l10);
                    }
                }
                System.arraycopy(I, 0, cArray2, n10 - R - 1, R + 1);
            }
            cArray = cArray2;
        }
        return cArray;
    }

    public static int Z() {
        return b[R];
    }

    /*
     * Unable to fully structure code
     */
    protected static void d(Object[] var0) {
        block9: {
            var1_1 = (Long)var0[0];
            var3_2 = ((Boolean)var0[1]).booleanValue();
            var1_1 = ax.a ^ var1_1;
            var5_3 = new char[ax.m + ax.a("a", (int)23577, (long)(8116414767376919721L ^ var1_1))];
            var4_4 = m44.a("h", (long)-5184724760020049854L, (long)var1_1);
            var6_5 = new int[ax.m + ax.a("a", (int)23577, (long)(8116414767376919721L ^ var1_1))];
            var7_6 = new int[ax.m + ax.a("a", (int)23577, (long)(8116414767376919721L ^ var1_1))];
            try {
                block8: {
                    block10: {
                        v0 = var3_2;
                        if (var4_4 != null) break block8;
                        if (v0 == 0) ** GOTO lbl34
                        break block10;
                        catch (Throwable v1) {
                            throw m44.a("h", (Object)v1, (long)-6597369548313245699L, (long)var1_1);
                        }
                    }
                    try {
                        block11: {
                            System.arraycopy(ax.I, ax.k, var5_3, 0, ax.m - ax.k);
                            System.arraycopy(ax.I, 0, var5_3, ax.m - ax.k, ax.R);
                            ax.I = var5_3;
                            System.arraycopy(ax.b, ax.k, var6_5, 0, ax.m - ax.k);
                            System.arraycopy(ax.b, 0, var6_5, ax.m - ax.k, ax.R);
                            ax.b = var6_5;
                            System.arraycopy(ax.Y, ax.k, var7_6, 0, ax.m - ax.k);
                            System.arraycopy(ax.Y, 0, var7_6, ax.m - ax.k, ax.R);
                            ax.Y = var7_6;
                            ax.y = ax.R += ax.m - ax.k;
                            if (var4_4 == null) break block9;
                            break block11;
                            catch (Throwable v2) {
                                throw m44.a("h", (Object)v2, (long)-6597369548313245699L, (long)var1_1);
                            }
                        }
                        System.arraycopy(ax.I, ax.k, var5_3, 0, ax.m - ax.k);
                        ax.I = var5_3;
                        System.arraycopy(ax.b, ax.k, var6_5, 0, ax.m - ax.k);
                        ax.b = var6_5;
                        System.arraycopy(ax.Y, ax.k, var7_6, 0, ax.m - ax.k);
                        ax.Y = var7_6;
                        v0 = ax.R = ax.R - ax.k;
                    }
                    catch (Throwable v3) {
                        throw m44.a("h", (Object)v3, (long)-6597369548313245699L, (long)var1_1);
                    }
                }
                ax.y = v0;
            }
            catch (Throwable var8_7) {
                throw new Error((String)m44.a("w", (Object)var8_7, (long)-4837946476531708579L, (long)var1_1));
            }
        }
        m44.a("k", (int)(ax.m += ax.a("a", (int)23577, (long)(8116414767376919721L ^ var1_1))), (long)-4807027377349746647L, (long)var1_1);
        ax.k = 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    ax.a = prr.a(-588443577899109383L, 4721114780401808612L, MethodHandles.lookup().lookupClass()).a(110729123979455L);
                    var14 = ax.a ^ 78482796568621L;
                    var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                        v2 = v2;
                        v2[var12_2] = (byte)(var14 << var12_2 * 8 >>> 56);
                    }
                    break block12;
lbl13:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var13_3 = var11_1.doFinal("?f1\u0080\u00f5N\u00ff\u00d4\u00e3v\u00e7\u0089\u0094\u007f\u00f8\u00a3vj\u00a3\u00f5\u00e9\u00c5\u00ed{\u00f2=\u00f0\u00f2\u00f5\u00db\u00b6\u001f\u0001'g!\u00fd\u00b7\u00c6D7p\u00b7\u00e8X\u0092\u00f5;D\u00c2\u00day\u009e\u00b9\u00eb\b%u#\u001f\u00e4r7\u0001\u007f\u00b0\u0085yB\u0012\u000fH)D\u00a1\u00cc\u00d2(Kn\u0000\u00f7J\u00d0\u0019\u001bQ\u00f0}\u0003\u0007\u00db\u00ab/i\u0015\u009c\u0016\u00d8\u00ee\u00d4\u0003\u00a3F\u00ff\u00f4\u00b5\u00b4Z\u0086MT\u00ee\u00d6\u0080\u00bf\u00fa\u0081i\u0018\u00c9\u0003\u0095vm\u0011\u00d3^;D\u00f9onV}\u00dc\u0096'1\u0000\u0006\u0004*\u00cc\u0012\u009f\u00bbg\u00f0\u007fx\u00d8\u00c0\u0014>~\u0010WC\u00bd\u001c\u0094\u0011\u00b5\u0087pN\u0005}\u00ab\u0088@b\u00dc\u00ff\u00f01\u0001\u00e7G\u009f\u00998\u0080M\u0000\u009c X\u00aa,\u00ed\u00d6\u00a5&%\u0010\u00fbU_".getBytes("ISO-8859-1"));
                ** while (true)
                ax.c = ax.a(var13_3).intern();
                ax.h = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var14 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var14 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[6];
                var3_7 = 0;
                var4_8 = "\u001e.MS\u00b5\u00bfI\u00af\u00c9\u00bb\u000f\u0000\u0011\u00135_\u00d5C\u00df\u00c6\u00c63\u00c4\u0004\u00a7P\u00b5\u0091F\u00b2\u00ca\u00b2";
                var5_9 = "\u001e.MS\u00b5\u00bfI\u00af\u00c9\u00bb\u000f\u0000\u0011\u00135_\u00d5C\u00df\u00c6\u00c63\u00c4\u0004\u00a7P\u00b5\u0091F\u00b2\u00ca\u00b2".length();
                var2_10 = 0;
                while (true) {
                    var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                    v6 = var6_6;
                    v7 = var3_7++;
                    v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "-\u00b3dU\u00e50GY\u009eUi\u000f\u009b\t\u0004\u00d8";
                    var5_9 = "-\u00b3dU\u00e50GY\u009eUi\u000f\u009b\t\u0004\u00d8".length();
                    var2_10 = 0;
                    while (true) {
                        var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                        v6 = var6_6;
                        v7 = var3_7++;
                        v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl57:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    break block11;
                    break;
                }
            }
            var8_12 = v8;
            var10_13 = var0_4.doFinal(new byte[]{(byte)(var8_12 >>> 56), (byte)(var8_12 >>> 48), (byte)(var8_12 >>> 40), (byte)(var8_12 >>> 32), (byte)(var8_12 >>> 24), (byte)(var8_12 >>> 16), (byte)(var8_12 >>> 8), (byte)var8_12});
            v10 = ((long)var10_13[0] & 255L) << 56 | ((long)var10_13[1] & 255L) << 48 | ((long)var10_13[2] & 255L) << 40 | ((long)var10_13[3] & 255L) << 32 | ((long)var10_13[4] & 255L) << 24 | ((long)var10_13[5] & 255L) << 16 | ((long)var10_13[6] & 255L) << 8 | (long)var10_13[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl70:
                // 1 sources

                ** continue;
            }
        }
        ax.e = var6_6;
        ax.f = new Integer[6];
        ax.R = -1;
        ax.g = 0;
        ax.E = 1;
        ax.w = false;
        ax.d = false;
        ax.y = 0;
        ax.F = 0;
        ax.M = (int)ax.a("a", (int)29493, (long)(3294224382673186104L ^ var14));
    }

    public static char P(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0xC28433B3BF8L;
        k = -1;
        char c10 = ax.U(l11);
        k = R;
        return c10;
    }

    public void E(Object[] objectArray) {
        Reader reader = (Reader)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n10 = (Integer)objectArray[2];
        int n11 = (Integer)objectArray[3];
        long l11 = (l10 = a ^ l10) ^ 0x3A767C77589EL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = (int)ax.a("a", (int)11237, (long)(0x2887BA74FEA78DCAL ^ l10));
        objectArray2[3] = n11;
        objectArray2[2] = l11;
        objectArray2[1] = n10;
        objectArray2[0] = reader;
        m44.a("v", (Object)this, (Object)objectArray2, (long)-5671651220204368778L, (long)l10);
    }

    public static int w() {
        return b[k];
    }

    public ax(Reader reader, int n10, int n11, int n12, long l10) {
        Object object;
        block4: {
            block5: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("m", (long)6589078370744779583L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        object = m44.a("i", (long)6495550478465938291L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (object == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)5119568905331385472L, (long)l10);
                    }
                    throw new Error(c);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)5119568905331385472L, (long)l10);
                }
            }
            object = reader;
        }
        m44.a("n", (Reader)object, (long)6495550478465938291L, (long)l10);
        E = n10;
        g = n11 - 1;
        m = n12;
        m44.a("n", (int)m, (long)6788949404055978836L, (long)l10);
        I = new char[n12];
        b = new int[n12];
        Y = new int[n12];
    }

    public static void c(int n10, long l10) {
        block5: {
            int n11;
            block4: {
                l10 = a ^ l10;
                F += n10;
                CallSite callSite = m44.a("j", (long)-4767599061217499752L, (long)l10);
                try {
                    try {
                        n11 = R = R - n10;
                        if (callSite != null) break block4;
                        if (n11 >= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-6797247967267962329L, (long)l10);
                    }
                    n11 = R + m;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-6797247967267962329L, (long)l10);
                }
            }
            R = n11;
        }
    }

    public static String v(long l10) {
        l10 = a ^ l10;
        try {
            if (R >= k) {
                return new String(I, k, R - k + 1);
            }
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)n92, (long)6233904120249169167L, (long)l10);
        }
        return new String(I, k, m - k) + new String(I, 0, R + 1);
    }

    public ax(Reader reader, long l10, int n10, int n11) {
        long l11 = (l10 = a ^ l10) ^ 0x6B6C89DD7D6BL;
        this(reader, n10, n11, (int)ax.a("a", (int)7326, (long)(0x627DD239D9144B39L ^ l10)), l11);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected static void l(Object[] var0) {
        block46: {
            block51: {
                block52: {
                    block50: {
                        block67: {
                            block66: {
                                block47: {
                                    block49: {
                                        block64: {
                                            block48: {
                                                block62: {
                                                    block61: {
                                                        block60: {
                                                            block59: {
                                                                block58: {
                                                                    var1_1 = (Long)var0[0];
                                                                    v0 = var1_1 = ax.a ^ var1_1;
                                                                    var3_2 = v0 ^ 21919446323825L;
                                                                    var5_3 = v0 ^ 50897858058155L;
                                                                    var7_4 = m44.a("o", (long)1403732511820581685L, (long)var1_1);
                                                                    v1 /* !! */  = ax.y;
                                                                    v2 = m44.a("k", (long)1602477816166943582L, (long)var1_1);
                                                                    if (var7_4 != null) ** GOTO lbl173
                                                                    if (v1 /* !! */  != v2) break block46;
                                                                    break block58;
                                                                    catch (IOException v3) {
                                                                        throw m44.a("o", (Object)v3, (long)1082632326554446986L, (long)var1_1);
                                                                    }
                                                                }
                                                                v4 = m44.a("k", (long)1602477816166943582L, (long)var1_1);
                                                                v5 /* !! */  = ax.m;
                                                                v6 = var7_4;
                                                                if (var1_1 < 0L) ** GOTO lbl111
                                                                if (v6 != null) break block47;
                                                                break block59;
                                                                catch (IOException v7) {
                                                                    throw m44.a("o", (Object)v7, (long)1082632326554446986L, (long)var1_1);
                                                                }
                                                            }
                                                            if (var1_1 < 0L) break block47;
                                                            if (v4 != v5 /* !! */ ) ** GOTO lbl102
                                                            break block60;
                                                            catch (IOException v8) {
                                                                throw m44.a("o", (Object)v8, (long)1082632326554446986L, (long)var1_1);
                                                            }
                                                        }
                                                        v9 /* !! */  = (CallSite)ax.k;
                                                        v10 = var7_4;
                                                        if (var1_1 <= 0L) ** GOTO lbl70
                                                        if (v10 != null) break block48;
                                                        break block61;
                                                        catch (IOException v11) {
                                                            throw m44.a("o", (Object)v11, (long)1082632326554446986L, (long)var1_1);
                                                        }
                                                    }
                                                    if (var1_1 < 0L) break block48;
                                                    if (v9 /* !! */  <= ax.a("a", (int)4525, (long)(6795225254265653864L ^ var1_1))) ** GOTO lbl61
                                                    break block62;
                                                    catch (IOException v12) {
                                                        throw m44.a("o", (Object)v12, (long)1082632326554446986L, (long)var1_1);
                                                    }
                                                }
                                                try {
                                                    block63: {
                                                        ax.y = 0;
                                                        ax.R = 0;
                                                        v9 /* !! */  = (CallSite)ax.k;
                                                        if (var1_1 <= 0L) ** GOTO lbl171
                                                        m44.a("l", (int)v9 /* !! */ , (long)1602477816166943582L, (long)var1_1);
                                                        if (var7_4 == null) break block46;
                                                        break block63;
                                                        catch (IOException v13) {
                                                            throw m44.a("o", (Object)v13, (long)1082632326554446986L, (long)var1_1);
                                                        }
                                                    }
                                                    v9 /* !! */  = (CallSite)ax.k;
                                                }
                                                catch (IOException v14) {
                                                    throw m44.a("o", (Object)v14, (long)1082632326554446986L, (long)var1_1);
                                                }
                                            }
                                            if (var1_1 < 0L) break block49;
                                            v10 = var7_4;
lbl70:
                                            // 2 sources

                                            if (v10 != null) break block49;
                                            if (v9 /* !! */  >= 0) ** GOTO lbl86
                                            break block64;
                                            catch (IOException v15) {
                                                throw m44.a("o", (Object)v15, (long)1082632326554446986L, (long)var1_1);
                                            }
                                        }
                                        try {
                                            block65: {
                                                v9 /* !! */  = (CallSite)0;
                                                ax.y = 0;
                                                if (var1_1 <= 0L) ** GOTO lbl171
                                                ax.R = (int)v9 /* !! */ ;
                                                if (var7_4 == null) break block46;
                                                break block65;
                                                catch (IOException v16) {
                                                    throw m44.a("o", (Object)v16, (long)1082632326554446986L, (long)var1_1);
                                                }
                                            }
                                            v9 /* !! */  = (CallSite)false;
                                        }
                                        catch (IOException v17) {
                                            throw m44.a("o", (Object)v17, (long)1082632326554446986L, (long)var1_1);
                                        }
                                    }
                                    try {
                                        if (var1_1 >= 0L) {
                                            v18 = new Object[2];
                                            v18[1] = (boolean)v9 /* !! */ ;
                                            v18[0] = var3_2;
                                            m44.a("o", (Object)v18, (long)672625394677222099L, (long)var1_1);
                                            if (var7_4 == null) break block46;
                                        }
                                        ** GOTO lbl171
lbl102:
                                        // 2 sources

                                        v4 = m44.a("k", (long)1602477816166943582L, (long)var1_1);
                                        v5 /* !! */  = ax.k;
                                    }
                                    catch (IOException v19) {
                                        throw m44.a("o", (Object)v19, (long)1082632326554446986L, (long)var1_1);
                                    }
                                }
                                if (var1_1 <= 0L) break block50;
                                v6 = var7_4;
lbl111:
                                // 2 sources

                                if (v6 != null) break block50;
                                if (v4 <= v5 /* !! */ ) ** GOTO lbl126
                                break block66;
                                catch (IOException v20) {
                                    throw m44.a("o", (Object)v20, (long)1082632326554446986L, (long)var1_1);
                                }
                            }
                            v9 /* !! */  = (CallSite)ax.m;
                            if (var1_1 < 0L) ** GOTO lbl171
                            m44.a("l", (int)v9 /* !! */ , (long)1602477816166943582L, (long)var1_1);
                            if (var7_4 == null) break block46;
                            break block67;
                            catch (IOException v21) {
                                throw m44.a("o", (Object)v21, (long)1082632326554446986L, (long)var1_1);
                            }
                        }
                        try {
                            block68: {
                                v4 = (reference)ax.k;
                                v22 = 1602477816166943582L;
                                v23 = var1_1;
                                if (var1_1 < 0L) break block51;
                                v4 = v4 - m44.a("k", (long)v22, (long)v23);
                                if (var7_4 != null) break block52;
                                break block68;
                                catch (IOException v24) {
                                    throw m44.a("o", (Object)v24, (long)1082632326554446986L, (long)var1_1);
                                }
                            }
                            v5 /* !! */  = (int)ax.a("a", (int)23577, (long)(8116448870593120222L ^ var1_1));
                        }
                        catch (IOException v25) {
                            throw m44.a("o", (Object)v25, (long)1082632326554446986L, (long)var1_1);
                        }
                    }
                    if (v4 >= v5 /* !! */ ) ** GOTO lbl157
                    try {
                        block69: {
                            v26 = var3_2;
                            if (var1_1 <= 0L) ** GOTO lbl170
                            v27 = new Object[2];
                            v27[1] = true;
                            v27[0] = v26;
                            m44.a("o", (Object)v27, (long)672625394677222099L, (long)var1_1);
                            if (var7_4 == null) break block46;
                            break block69;
                            catch (IOException v28) {
                                throw m44.a("o", (Object)v28, (long)1082632326554446986L, (long)var1_1);
                            }
                        }
                        v4 = (reference)ax.k;
                    }
                    catch (IOException v29) {
                        throw m44.a("o", (Object)v29, (long)1082632326554446986L, (long)var1_1);
                    }
                }
                v22 = 1602477816166943582L;
                v23 = var1_1;
            }
            m44.a("l", (int)v4, (long)v22, (long)v23);
        }
        try {
            block53: {
                block54: {
                    block55: {
                        v26 = 1310195823171926905L;
lbl170:
                        // 2 sources

                        v9 /* !! */  = m44.a("p", (Object)m44.a("k", (long)v26, (long)var1_1), (Object)ax.I, (int)ax.y, (int)(m44.a("k", (long)1602477816166943582L, (long)var1_1) - ax.y), (long)1077746208551262552L, (long)var1_1);
lbl171:
                        // 5 sources

                        v2 = v9 /* !! */ ;
                        v1 /* !! */  = (int)v9 /* !! */ ;
lbl173:
                        // 2 sources

                        var8_5 = v2;
                        if (var1_1 < 0L) break block53;
                        v30 /* !! */  = -1;
                        if (var7_4 != null) break block54;
                        try {
                            block70: {
                                if (v1 /* !! */  != v30 /* !! */ ) break block55;
                                break block70;
                                catch (IOException v31) {
                                    throw m44.a("o", (Object)v31, (long)1082632326554446986L, (long)var1_1);
                                }
                            }
                            m44.a("p", (Object)m44.a("k", (long)1310195823171926905L, (long)var1_1), (long)1431905253698381228L, (long)var1_1);
                            throw new IOException();
                        }
                        catch (IOException v32) {
                            throw m44.a("o", (Object)v32, (long)1082632326554446986L, (long)var1_1);
                        }
                    }
                    v33 = ax.y;
                    v30 /* !! */  = (int)var8_5;
                }
                v1 /* !! */  = v33 + v30 /* !! */ ;
            }
            ax.y = v1 /* !! */ ;
            return;
        }
        catch (IOException var9_6) {
            block57: {
                block56: {
                    try {
                        try {
                            v34 = ax.R;
                            v35 = 1;
                            if (var1_1 > 0L) {
                                ax.R = v34 - v35;
                                ax.c(0, var5_3);
                                v34 = ax.k;
                                if (var7_4 != null) break block56;
                                v35 = -1;
                            }
                            if (v34 != v35) break block57;
                        }
                        catch (IOException v36) {
                            throw m44.a("o", (Object)v36, (long)1082632326554446986L, (long)var1_1);
                        }
                        v34 = ax.R;
                    }
                    catch (IOException v37) {
                        throw m44.a("o", (Object)v37, (long)1082632326554446986L, (long)var1_1);
                    }
                }
                ax.k = v34;
            }
            throw var9_6;
        }
    }

    public static char U(long l10) {
        int n10;
        int n11;
        int n12;
        int n13;
        block16: {
            block17: {
                CallSite callSite;
                long l11;
                block12: {
                    block13: {
                        int n14;
                        block14: {
                            block15: {
                                long l12 = l10 = a ^ l10;
                                l11 = l12 ^ 0x2793911E7D7L;
                                long l13 = l12 ^ 0x38796461C717L;
                                n13 = (int)(l13 >>> 32);
                                n12 = (int)(l13 << 32 >>> 56);
                                n11 = (int)(l13 << 40 >>> 40);
                                callSite = m44.a("n", (long)-8238708958629784092L, (long)l10);
                                try {
                                    try {
                                        try {
                                            try {
                                                n10 = F--;
                                                if (callSite != null) break block12;
                                                if (n10 <= 0) break block13;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("n", (Object)n92, (long)-7937736390273306021L, (long)l10);
                                            }
                                            n14 = R = R + 1;
                                            if (callSite != null) break block14;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("n", (Object)n93, (long)-7937736390273306021L, (long)l10);
                                        }
                                        if (n14 != m) break block15;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("n", (Object)n94, (long)-7937736390273306021L, (long)l10);
                                    }
                                    R = 0;
                                }
                                catch (n9 n95) {
                                    throw m44.a("n", (Object)n95, (long)-7937736390273306021L, (long)l10);
                                }
                            }
                            n14 = I[R];
                        }
                        return (char)n14;
                    }
                    n10 = R = R + 1;
                }
                try {
                    try {
                        if (callSite != null) break block16;
                        if (n10 < y) break block17;
                    }
                    catch (n9 n96) {
                        throw m44.a("n", (Object)n96, (long)-7937736390273306021L, (long)l10);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l11;
                    m44.a("n", (Object)objectArray, (long)-7902343730747322657L, (long)l10);
                }
                catch (n9 n97) {
                    throw m44.a("n", (Object)n97, (long)-7937736390273306021L, (long)l10);
                }
            }
            n10 = I[R];
        }
        int n15 = n10;
        ax.Y(n13, (byte)n12, (char)n15, n11);
        return (char)n15;
    }

    public static int T() {
        return Y[R];
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x724;
        if (f[n11] == null) {
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
                throw new RuntimeException("com/zelix/ax", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ax.f[n11] = n12;
        }
        return f[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ax.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ax" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ax.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

