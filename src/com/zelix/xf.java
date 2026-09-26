/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.a6;
import com.zelix.bn;
import com.zelix.lks;
import com.zelix.m44;
import com.zelix.m_;
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
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xf
extends xv {
    private static final long a;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    m_[] j(Object[] var1_1) {
        block42: {
            block50: {
                block49: {
                    block45: {
                        block46: {
                            block47: {
                                block44: {
                                    block43: {
                                        block39: {
                                            block40: {
                                                block41: {
                                                    var5_2 = (bn)var1_1[0];
                                                    var4_3 = (lks)var1_1[1];
                                                    var2_4 = (Long)var1_1[2];
                                                    v0 = var2_4 = xf.a ^ var2_4;
                                                    var6_5 = v0 ^ 65737967109637L;
                                                    v1 = v0 ^ 36152624386822L;
                                                    var8_6 = v1 >>> 16;
                                                    var10_7 = (int)(v1 << 48 >>> 48);
                                                    var11_8 = v0 ^ 57783764700677L;
                                                    var13_9 = v0 ^ 30622266655853L;
                                                    var15_10 = v0 ^ 22908588229581L;
                                                    var17_11 = v0 ^ 104599945635218L;
                                                    var19_12 = v0 ^ 106676123822745L;
                                                    var21_13 = v0 ^ 1147522262589L;
                                                    var23_14 = v0 ^ 58149044341064L;
                                                    var25_15 = v0 ^ 107933204611323L;
                                                    var28_16 = new StringBuilder();
                                                    v2 = new Object[1];
                                                    v2[0] = var13_9;
                                                    var29_17 = m44.a("r", (Object)var5_2, (Object)v2, (long)-2085358506955750488L, (long)var2_4);
                                                    v3 = new Object[4];
                                                    v3[3] = var4_3;
                                                    v3[2] = var28_16;
                                                    v3[1] = var29_17;
                                                    v3[0] = var11_8;
                                                    var30_18 = m44.a("r", (Object)this, (Object)v3, (long)-1851464350139687697L, (long)var2_4);
                                                    v4 = new Object[1];
                                                    v4[0] = var6_5;
                                                    var31_19 = m44.a("r", (Object)var5_2, (Object)v4, (long)-1916496612425683783L, (long)var2_4);
                                                    var27_20 = m44.a("m", (long)-398009718687058945L, (long)var2_4);
                                                    v5 = new Object[3];
                                                    v5[2] = var19_12;
                                                    v5[1] = var4_3;
                                                    v5[0] = var31_19;
                                                    var32_21 = m44.a("r", (Object)this, (Object)v5, (long)-372816148417307287L, (long)var2_4);
                                                    try {
                                                        v6 = var5_2.T(var25_15);
                                                        if (var27_20 != false) break block39;
                                                        if (v6) {
                                                        }
                                                        ** GOTO lbl71
                                                    }
                                                    catch (n9 v7) {
                                                        throw m44.a("m", (Object)v7, (long)-2098193617601712792L, (long)var2_4);
                                                    }
                                                    var35_22 = m44.a("s", (Object)this, (long)-416365946372293417L, (long)var2_4).lastIndexOf(".");
                                                    if (var35_22 == -1) {
                                                        var34_24 = m44.a("s", (Object)this, (long)-416365946372293417L, (long)var2_4);
                                                        try {
                                                            v8 /* !! */  = var27_20;
                                                            if (var2_4 < 0L) break block40;
                                                            if (v8 /* !! */  == false) break block41;
                                                            m44.a("m", (Object)"hTyAmb", (long)-231272882347958967L, (long)var2_4);
                                                        }
                                                        catch (n9 v9) {
                                                            throw m44.a("m", (Object)v9, (long)-2098193617601712792L, (long)var2_4);
                                                        }
                                                    }
                                                    var34_24 = m44.a("s", (Object)this, (long)-416365946372293417L, (long)var2_4).substring(var35_22 + 1);
                                                }
                                                v8 /* !! */  = (CallSite)true;
                                            }
                                            var33_25 = new m_[v8 /* !! */ ];
                                            try {
                                                try {
                                                    var33_25[0] = new m_((String)var34_24, var15_10, (String[])var30_18);
                                                    if (var2_4 >= 0L && var27_20 == false) break block42;
lbl71:
                                                    // 2 sources

                                                    v10 = var5_2;
                                                    if (var27_20 != false) break block43;
                                                }
                                                catch (n9 v11) {
                                                    throw m44.a("m", (Object)v11, (long)-2098193617601712792L, (long)var2_4);
                                                }
                                                v6 = v10.C(var21_13);
                                            }
                                            catch (n9 v12) {
                                                throw m44.a("m", (Object)v12, (long)-2098193617601712792L, (long)var2_4);
                                            }
                                        }
                                        if (!v6) ** GOTO lbl86
                                        var33_25 = new m_[1];
                                        try {
                                            var33_25[0] = new m_((String)xf.b("w", (int)12602, (long)(1977904661694692035L ^ var2_4)), var15_10, (String[])var30_18);
                                            if (var27_20 == false) break block42;
lbl86:
                                            // 2 sources

                                            v10 = var5_2;
                                        }
                                        catch (n9 v13) {
                                            throw m44.a("m", (Object)v13, (long)-2098193617601712792L, (long)var2_4);
                                        }
                                    }
                                    var34_24 = v10.Z(var17_11);
                                    v14 = new Object[6];
                                    v14[5] = var28_16.toString();
                                    v14[4] = (int)((char)var10_7);
                                    v14[3] = var8_6;
                                    v14[2] = var32_21;
                                    v14[1] = var34_24;
                                    v14[0] = m44.a("s", (Object)this, (long)-416365946372293417L, (long)var2_4);
                                    var35_23 = m44.a("r", (Object)var4_3, (Object)v14, (long)-225026772083783492L, (long)var2_4);
                                    try {
                                        v15 = var35_23;
                                        if (var2_4 <= 0L || var27_20 != false) break block44;
                                        if (v15 != null) {
                                        }
                                        ** GOTO lbl122
                                    }
                                    catch (n9 v16) {
                                        throw m44.a("m", (Object)v16, (long)-2098193617601712792L, (long)var2_4);
                                    }
                                    v15 = var35_23;
                                }
                                try {
                                    try {
                                        try {
                                            v17 /* !! */  = ((CallSite)v15).length;
                                            if (var27_20 != false) break block45;
                                            if (v17 /* !! */  == 0) {
                                            }
                                            ** GOTO lbl147
                                        }
                                        catch (n9 v18) {
                                            throw m44.a("m", (Object)v18, (long)-2098193617601712792L, (long)var2_4);
                                        }
lbl122:
                                        // 2 sources

                                        v19 = new Object[2];
                                        v19[1] = m44.a("s", (Object)this, (long)-416365946372293417L, (long)var2_4);
                                        v19[0] = var23_14;
                                        v20 /* !! */  = m44.a("r", (Object)var4_3, (Object)v19, (long)-435602307441899485L, (long)var2_4);
                                        if (var27_20 != false) break block46;
                                    }
                                    catch (n9 v21) {
                                        throw m44.a("m", (Object)v21, (long)-2098193617601712792L, (long)var2_4);
                                    }
                                    if (v20 /* !! */  == false) break block47;
                                }
                                catch (n9 v22) {
                                    throw m44.a("m", (Object)v22, (long)-2098193617601712792L, (long)var2_4);
                                }
                                var36_26 = new StringBuilder();
                                var37_28 = 0;
                                break block49;
                            }
                            v20 /* !! */  = (CallSite)true;
                        }
                        var33_25 = new m_[v20 /* !! */ ];
                        try {
                            var33_25[0] = new m_((String)var34_24, var15_10, (String[])var30_18);
                            v17 /* !! */  = (int)var27_20;
                            if (var2_4 <= 0L) break block45;
                            if (v17 /* !! */  == 0) break block42;
lbl147:
                            // 2 sources

                            v17 /* !! */  = ((CallSite)var35_23).length;
                        }
                        catch (n9 v23) {
                            throw m44.a("m", (Object)v23, (long)-2098193617601712792L, (long)var2_4);
                        }
                    }
                    var33_25 = new m_[v17 /* !! */ ];
                    break block50;
                }
                block26: while (var37_28 < var29_17.size()) {
                    try {
                        try {
                            var36_26.append((String)var29_17.get(var37_28));
                        }
                        catch (n9 v24) {
                            throw m44.a("m", (Object)v24, (long)-2098193617601712792L, (long)var2_4);
                        }
                    }
                    catch (n9 v25) {
                        throw m44.a("m", (Object)v25, (long)-2098193617601712792L, (long)var2_4);
                    }
                    do {
                        v26 = var27_20;
                        if (var2_4 >= 0L) {
                            if (v26 == false) {
                                if (var37_28 < var29_17.size() - 1) {
                                    var36_26.append((String)xf.b("w", (int)12848, (long)(2334339544950946248L ^ var2_4)));
                                }
                                ++var37_28;
                            }
                            v26 = var27_20;
                        }
                        if (v26 == false) continue block26;
                    } while (var2_4 < 0L);
                }
                throw new a6((String)xf.b("w", (int)30643, (long)(939368542748376141L ^ var2_4)) + (String)var31_19 + " " + (String)var34_24 + "(" + var36_26.toString() + (String)xf.b("w", (int)12240, (long)(9044534554776773675L ^ var2_4)) + (String)m44.a("s", (Object)this, (long)-416365946372293417L, (long)var2_4) + (String)xf.b("w", (int)4601, (long)(8770424903110892035L ^ var2_4)));
            }
            block28: for (var36_27 = 0; var36_27 < ((CallSite)var35_23).length; ++var36_27) {
                try {
                    do {
                        v27 = var33_25;
                        v28 /* !! */  = var27_20;
                        if (var2_4 > 0L) {
                            if (v28 /* !! */  != false) return v27;
                            v28 /* !! */  = (CallSite)var36_27;
                        }
                        v27[v28 /* !! */ ] = new m_((String)var35_23[var36_27], var15_10, (String[])var30_18);
                        if (var27_20 == false) continue block28;
                    } while (var2_4 < 0L);
                    break;
                }
                catch (n9 v29) {
                    throw m44.a("m", (Object)v29, (long)-2098193617601712792L, (long)var2_4);
                }
            }
        }
        v27 = var33_25;
        return v27;
    }

    /*
     * Exception decompiling
     */
    xf(HashSet var1_1, long var2_2, lks var4_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[DOLOOP]], but top level block is 20[SIMPLE_IF_TAKEN]
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

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                xf.a = prr.a((long)-5503959422473729198L, (long)4522755714558750727L, MethodHandles.lookup().lookupClass()).a(163491747791800L);
                xf.i = new HashMap<K, V>(13);
                var0 = xf.a ^ 52328109176293L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u00d9\u00d7\u00cb\u0095J-\u0082BH}@\u0095,\u00fd\u0080\u008d\u00e2\n\n\u00cbJ\u0086\u00aa\u00a40\u0011\u00a0\u001bt7\u0011\u0011\u000f\u00cd\u0090\u001a\u00f4XI}\u00f0_\u00ff\u00fb\u00e2\u00ed\u0011Y\u00d9\u00b9\u0083s\u0002\u00af\u00b8*\u00ad\u00f86q\u00ad\u00f8\u001b\u00bc(\u00f2yO\u000e\u0019.\u0085\u00d7R@!\u00b1\u001f\u0007\u00b2\u00d1\u00b0\u0083\u00a2\u0080)f\u00b4\u00e5\u0081a\u00b7\u00c7\u00ec\u00d1\u00fd\u0014\u00d0\u009b)-\u001f\u00f0\u00db\u0001\u00d7\u00f6\u00be\u00f4\u00dd\u001e\b\u0099\u008f\u00ad\u00b3S{\u00e9=\u00e4\u00a9\u00f0\u0097\u00e6\u00bf\u0087\u00ef\u00e3/\u00a3&;)A8h\u00a32\u00c3'\u0099\u00875G\u00a8\u00b3E\u0088\u0015<\u001cXY\u00cc\u0019S\u00ab\u009fdD\u00caQ\u0085\u00dabh \u000f\u00d8o\u00f6\u00b5\u00b5r\u00fa}|\u0014&@R\u00d7\u0090\u0095\u00d4f\u00eb\b\u00a00-\u0007\u0093\u00d6\u0017;\u00828\u0094\u0004f\u00ac\u00a0yu\u00be/\u00a5d\u00f6\u00ac\u00b8A\u00c3\u00e9\u008f\u0081\u00fbH\u00a0\n0\u00bb\u00cc`\u00ea\u0007B\u00a10`K=|mV\u00a3;\u0087\u00ad\u0010\u00af-\u00c8y\u00bdQ<\u0004\u00a7j\u00db\\\u00e74\u00e1\u00df";
                var8_6 = "\u00d9\u00d7\u00cb\u0095J-\u0082BH}@\u0095,\u00fd\u0080\u008d\u00e2\n\n\u00cbJ\u0086\u00aa\u00a40\u0011\u00a0\u001bt7\u0011\u0011\u000f\u00cd\u0090\u001a\u00f4XI}\u00f0_\u00ff\u00fb\u00e2\u00ed\u0011Y\u00d9\u00b9\u0083s\u0002\u00af\u00b8*\u00ad\u00f86q\u00ad\u00f8\u001b\u00bc(\u00f2yO\u000e\u0019.\u0085\u00d7R@!\u00b1\u001f\u0007\u00b2\u00d1\u00b0\u0083\u00a2\u0080)f\u00b4\u00e5\u0081a\u00b7\u00c7\u00ec\u00d1\u00fd\u0014\u00d0\u009b)-\u001f\u00f0\u00db\u0001\u00d7\u00f6\u00be\u00f4\u00dd\u001e\b\u0099\u008f\u00ad\u00b3S{\u00e9=\u00e4\u00a9\u00f0\u0097\u00e6\u00bf\u0087\u00ef\u00e3/\u00a3&;)A8h\u00a32\u00c3'\u0099\u00875G\u00a8\u00b3E\u0088\u0015<\u001cXY\u00cc\u0019S\u00ab\u009fdD\u00caQ\u0085\u00dabh \u000f\u00d8o\u00f6\u00b5\u00b5r\u00fa}|\u0014&@R\u00d7\u0090\u0095\u00d4f\u00eb\b\u00a00-\u0007\u0093\u00d6\u0017;\u00828\u0094\u0004f\u00ac\u00a0yu\u00be/\u00a5d\u00f6\u00ac\u00b8A\u00c3\u00e9\u008f\u0081\u00fbH\u00a0\n0\u00bb\u00cc`\u00ea\u0007B\u00a10`K=|mV\u00a3;\u0087\u00ad\u0010\u00af-\u00c8y\u00bdQ<\u0004\u00a7j\u00db\\\u00e74\u00e1\u00df".length();
                var5_7 = 152;
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
                    var9_3[var7_4++] = xf.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00cd\u00efsh\u0089\u00ed\b\u00f6\u0005\u00ec\u00f2\u00d7\u0099rv5\u0018\u00d8\u0095Px\u0098G\u00ee\u0084\u0007\u0080\u0016)n\u00c8E\u009co\u00f4\u00c3\u008e\u00eb#\u00baN";
                    var8_6 = "\u00cd\u00efsh\u0089\u00ed\b\u00f6\u0005\u00ec\u00f2\u00d7\u0099rv5\u0018\u00d8\u0095Px\u0098G\u00ee\u0084\u0007\u0080\u0016)n\u00c8E\u009co\u00f4\u00c3\u008e\u00eb#\u00baN".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = xf.b(var10_9).intern();
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
        xf.g = var9_3;
        xf.h = new String[5];
    }

    private static n9 a(n9 n92) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x62A0;
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
                throw new RuntimeException("com/zelix/xf", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            xf.h[n2] = xf.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xf.b(n, l);
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
            throw new RuntimeException("com/zelix/xf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xf.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
