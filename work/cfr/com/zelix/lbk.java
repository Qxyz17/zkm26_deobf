/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.u5;
import com.zelix.ui;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lbk {
    static final char[][] a;
    private static final long b;

    private static boolean q(Object[] objectArray) {
        block8: {
            int n10;
            int n11;
            int n12;
            long l10;
            block9: {
                block10: {
                    u5 u52;
                    CallSite callSite;
                    int n13;
                    List list;
                    block7: {
                        char[] cArray = (char[])objectArray[0];
                        list = (List)objectArray[1];
                        u5 u53 = (u5)objectArray[2];
                        l10 = (Long)objectArray[3];
                        n13 = ((Boolean)objectArray[4]).booleanValue();
                        l10 = b ^ l10;
                        callSite = m44.a("m", (long)-8366163720220175538L, (long)l10);
                        try {
                            u52 = u53;
                            if (callSite == null) break block7;
                            if (u52 == null) break block8;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)n92, (long)-8564694973315713627L, (long)l10);
                        }
                        u52 = u53;
                    }
                    try {
                        n12 = ((ui)((Object)m44.a("r", (Object)u52, (Object)new Object[0], (long)-8408562550497180085L, (long)l10))).R();
                        n11 = list.size();
                        n10 = n13;
                        if (callSite == null) break block9;
                        if (n10 == 0) break block10;
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)n93, (long)-8564694973315713627L, (long)l10);
                    }
                    n10 = 1;
                    break block9;
                }
                n10 = 0;
            }
            try {
                if (n12 >= n11 - n10) {
                    return true;
                }
            }
            catch (n9 n94) {
                throw m44.a("m", (Object)n94, (long)-8564694973315713627L, (long)l10);
            }
            return false;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private static u5 c(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[DOLOOP]], but top level block is 20[SIMPLE_IF_TAKEN]
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

    /*
     * Exception decompiling
     */
    private static u5 Y(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[DOLOOP]], but top level block is 20[SIMPLE_IF_TAKEN]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    u5 H(Object[] var1_1) {
        block34: {
            block33: {
                block32: {
                    block31: {
                        block30: {
                            block28: {
                                block29: {
                                    block27: {
                                        block26: {
                                            block24: {
                                                var7_2 = (String)var1_1[0];
                                                var8_3 = (Long)var1_1[1];
                                                var5_4 = (Boolean)var1_1[2];
                                                var6_5 = (List)var1_1[3];
                                                var2_6 = (String)var1_1[4];
                                                var10_7 = (char[])var1_1[5];
                                                var3_8 = (u5)var1_1[6];
                                                var4_9 = (Boolean)var1_1[7];
                                                v0 = var8_3 = lbk.b ^ var8_3;
                                                var11_10 = v0 ^ 126882976290650L;
                                                var13_11 = v0 ^ 129389403516947L;
                                                var15_12 = v0 ^ 43926289123882L;
                                                var17_13 = v0 ^ 56726644846553L;
                                                var19_14 = m44.a("m", (long)-982495016969016586L, (long)var8_3);
                                                try {
                                                    v1 = var3_8 == null;
                                                }
                                                catch (n9 v2) {
                                                    throw m44.a("m", (Object)v2, (long)-1109006063194272739L, (long)var8_3);
                                                }
                                                var20_15 = v1;
                                                try {
                                                    block25: {
                                                        try {
                                                            try {
                                                                try {
                                                                    v3 = m44.a("i", (long)-909922596217730613L, (long)var8_3);
                                                                    if (var19_14 == null) break block24;
                                                                    if (v3 != false) break block25;
                                                                }
                                                                catch (n9 v4) {
                                                                    throw m44.a("m", (Object)v4, (long)-1109006063194272739L, (long)var8_3);
                                                                }
                                                                v5 /* !! */  = var5_4;
                                                                if (var19_14 == null) break block26;
                                                            }
                                                            catch (n9 v6) {
                                                                throw m44.a("m", (Object)v6, (long)-1109006063194272739L, (long)var8_3);
                                                            }
                                                            if (var8_3 < 0L) break block26;
                                                            if (v5 /* !! */ ) {
                                                            }
                                                            ** GOTO lbl59
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("m", (Object)v7, (long)-1109006063194272739L, (long)var8_3);
                                                        }
                                                    }
                                                    v8 = new Object[5];
                                                    v8[4] = var4_9;
                                                    v8[3] = var17_13;
                                                    v8[2] = var3_8;
                                                    v8[1] = var6_5;
                                                    v8[0] = var10_7;
                                                    v3 = m44.a("m", (Object)v8, (long)-1207160543519566155L, (long)var8_3);
                                                }
                                                catch (n9 v9) {
                                                    throw m44.a("m", (Object)v9, (long)-1109006063194272739L, (long)var8_3);
                                                }
                                            }
                                            var21_16 /* !! */  = v3;
                                            try {
                                                if (var8_3 < 0L || var19_14 != null) break block27;
lbl59:
                                                // 2 sources

                                                v10 = new Object[4];
                                                v10[3] = var3_8;
                                                v10[2] = var6_5;
                                                v10[1] = var11_10;
                                                v10[0] = var10_7;
                                                v5 /* !! */  = m44.a("m", (Object)v10, (long)-925988553391167010L, (long)var8_3);
                                            }
                                            catch (n9 v11) {
                                                throw m44.a("m", (Object)v11, (long)-1109006063194272739L, (long)var8_3);
                                            }
                                        }
                                        var21_16 /* !! */  = (CallSite)v5 /* !! */ ;
                                    }
                                    try {
                                        try {
                                            v12 /* !! */  = var21_16 /* !! */ ;
                                            v13 = var19_14;
                                            if (var8_3 > 0L) {
                                                if (v13 == null) break block28;
                                                if (v12 /* !! */  == false) break block29;
                                            }
                                            ** GOTO lbl91
                                        }
                                        catch (n9 v14) {
                                            throw m44.a("m", (Object)v14, (long)-1109006063194272739L, (long)var8_3);
                                        }
                                        return null;
                                    }
                                    catch (n9 v15) {
                                        throw m44.a("m", (Object)v15, (long)-1109006063194272739L, (long)var8_3);
                                    }
                                }
                                v12 /* !! */  = m44.a("i", (long)-909922596217730613L, (long)var8_3);
                            }
                            try {
                                v13 = var19_14;
lbl91:
                                // 2 sources

                                if (v13 == null) break block30;
                                if (v12 /* !! */  != false) break block31;
                            }
                            catch (n9 v16) {
                                throw m44.a("m", (Object)v16, (long)-1109006063194272739L, (long)var8_3);
                            }
                            v12 /* !! */  = (CallSite)var5_4;
                        }
                        if (v12 /* !! */  == false) break block32;
                    }
                    v17 = new Object[8];
                    v17[7] = var20_15;
                    v17[6] = var4_9;
                    v17[5] = var3_8;
                    v17[4] = var10_7;
                    v17[3] = var2_6;
                    v17[2] = var15_12;
                    v17[1] = var6_5;
                    v17[0] = var7_2;
                    var22_17 = m44.a("m", (Object)v17, (long)-1636703955781688217L, (long)var8_3);
                    v18 /* !! */  = var19_14;
                    if (var8_3 < 0L) break block33;
                    if (v18 /* !! */  != null) break block34;
                }
                v19 = new Object[8];
                v19[7] = var20_15;
                v19[6] = var4_9;
                v19[5] = var13_11;
                v19[4] = var3_8;
                v19[3] = var10_7;
                v19[2] = var2_6;
                v19[1] = var6_5;
                v18 /* !! */  = v19;
                v19[0] = var7_2;
            }
            var22_17 = m44.a("m", (Object)v18 /* !! */ , (long)-1205057690415909239L, (long)var8_3);
        }
        return var22_17;
    }

    private static boolean s(Object[] objectArray) {
        block7: {
            boolean bl2;
            block8: {
                block9: {
                    u5 u52;
                    CallSite callSite;
                    u5 u53;
                    long l10;
                    block6: {
                        char[] cArray = (char[])objectArray[0];
                        l10 = (Long)objectArray[1];
                        List list = (List)objectArray[2];
                        u53 = (u5)objectArray[3];
                        l10 = b ^ l10;
                        callSite = m44.a("n", (long)-5519677436968752179L, (long)l10);
                        try {
                            u52 = u53;
                            if (callSite == null) break block6;
                            if (u52 == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-5645447138008085210L, (long)l10);
                        }
                        u52 = u53;
                    }
                    reference var7_6 = m44.a("q", (Object)u52, (Object)new Object[0], (long)-5900027145620051299L, (long)l10) - true;
                    try {
                        try {
                            bl2 = ((ui)((Object)m44.a("q", (Object)u53, (Object)new Object[0], (long)-5538210722974130663L, (long)l10))).R();
                            if (callSite == null) break block8;
                            if (bl2 != var7_6) break block9;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)-5645447138008085210L, (long)l10);
                        }
                        return true;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)n94, (long)-5645447138008085210L, (long)l10);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                lbk.b = prr.a(-4768971039812668967L, 4186320453620644816L, MethodHandles.lookup().lookupClass()).a(19457051678776L);
                var11 = lbk.b ^ 69519123334102L;
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[37];
                var4_4 = 0;
                var5_5 = "N7]\u00aa\u00ac\u0085\u00eb\u001bCn{\f\u00c1\u00a81\u00b2\u001a\u008e\\g;\u00a0\u00f82m-\u0094%\u00ed\u00afe\"*\u0096d\u000b\u0015\u00ba@\u00deRU\u0089\u00c2\u00e1lV4\u009e\u00ad\u00b38R\u000fu\u0093\u0002\u00af\u00faf9\u00e9\u008aU\u000fZ\u001e\u00df\u00dbg%\u00ff\u0014\u0086\u00b4\u00b7{\u007fT\u00df\u0098\u00b3[\u00d7Z\u001f2\u0006w\u0006c\u0096\u000f\r8\u00d7\u00e6_C\u0093\u001e\u00d3Y\u001e3:\u001fDf\u0015\u0016\u00deW\u00f9\u00b4d\u0084\u0005\u0092iJ\u0006!\u00e38\u00d9D\u00f6\u0015\u0093%wwCg36}\u0083\u0086\u00e4\u0080\u00caI\r \r\u00d4\u00c8\u00ea7\u00f7n\u00dc\u0088\u00f9\t\u0082\u00d2\u00db\u009c\\\u001d5\u00fc\u0097h\u0015\u00ab\u00c3\u0019\u0089\u00f0\u0019\u00e3\u0095b\u00e4\u00fa\u0001TB\u00b8\u001c\u0014\u0014\u00c6O\u00ff\u0082\u00e2\u00fcp%y\u00cd\u00db\u001b\u0085\u00e6\u0019\u001b\u008b\f\u00b4$\u00db=\u00f8\u00a1\u00c3\u00ff\u009e\u0086\u00dd\u00e0\u0003~\u00f4\u0093\u00cb\u008e4`\u00cab\u00b7\u00b7-\u00bc\u0098\u00f8\u00abK\u00e5f\u0088\u00f0O\u00ba\u00b9\u00caL\u00c1\u00ec\u0081\u00849\u00bb#\u00fa\u008d=\u0088\u00b2\u00a5\u0015\u0086\u00e7\u00fd\u00f7\u00f0\u008bU\u0081B\u001e;a\u0097\u0080T\t\u00db\u00a8\u00f2hg_\u0096";
                var6_6 = "N7]\u00aa\u00ac\u0085\u00eb\u001bCn{\f\u00c1\u00a81\u00b2\u001a\u008e\\g;\u00a0\u00f82m-\u0094%\u00ed\u00afe\"*\u0096d\u000b\u0015\u00ba@\u00deRU\u0089\u00c2\u00e1lV4\u009e\u00ad\u00b38R\u000fu\u0093\u0002\u00af\u00faf9\u00e9\u008aU\u000fZ\u001e\u00df\u00dbg%\u00ff\u0014\u0086\u00b4\u00b7{\u007fT\u00df\u0098\u00b3[\u00d7Z\u001f2\u0006w\u0006c\u0096\u000f\r8\u00d7\u00e6_C\u0093\u001e\u00d3Y\u001e3:\u001fDf\u0015\u0016\u00deW\u00f9\u00b4d\u0084\u0005\u0092iJ\u0006!\u00e38\u00d9D\u00f6\u0015\u0093%wwCg36}\u0083\u0086\u00e4\u0080\u00caI\r \r\u00d4\u00c8\u00ea7\u00f7n\u00dc\u0088\u00f9\t\u0082\u00d2\u00db\u009c\\\u001d5\u00fc\u0097h\u0015\u00ab\u00c3\u0019\u0089\u00f0\u0019\u00e3\u0095b\u00e4\u00fa\u0001TB\u00b8\u001c\u0014\u0014\u00c6O\u00ff\u0082\u00e2\u00fcp%y\u00cd\u00db\u001b\u0085\u00e6\u0019\u001b\u008b\f\u00b4$\u00db=\u00f8\u00a1\u00c3\u00ff\u009e\u0086\u00dd\u00e0\u0003~\u00f4\u0093\u00cb\u008e4`\u00cab\u00b7\u00b7-\u00bc\u0098\u00f8\u00abK\u00e5f\u0088\u00f0O\u00ba\u00b9\u00caL\u00c1\u00ec\u0081\u00849\u00bb#\u00fa\u008d=\u0088\u00b2\u00a5\u0015\u0086\u00e7\u00fd\u00f7\u00f0\u008bU\u0081B\u001e;a\u0097\u0080T\t\u00db\u00a8\u00f2hg_\u0096".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u00e6Q\u00be\u008b\u008d\u001e\u00b4\u0005\u00f6\u001c8\u00ae\u00db-)\u00ce";
                    var6_6 = "\u00e6Q\u00be\u008b\u008d\u001e\u00b4\u0005\u00f6\u001c8\u00ae\u00db-)\u00ce".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        v8 = new char[(int)var0_3[13]][];
        v8[0] = new char[]{(char)var0_3[6]};
        v8[1] = new char[]{(char)var0_3[0], (char)var0_3[33]};
        v8[2] = new char[]{(char)var0_3[18], (char)var0_3[8]};
        v8[3] = new char[]{(char)var0_3[8], (char)var0_3[34]};
        v8[4] = new char[]{(char)var0_3[32], (char)var0_3[8]};
        v8[5] = new char[]{(char)var0_3[8], (char)var0_3[19]};
        v8[(int)var0_3[11]] = new char[]{(char)var0_3[16], (char)var0_3[8]};
        v8[(int)var0_3[27]] = new char[]{(char)var0_3[8], (char)var0_3[10]};
        v8[(int)var0_3[7]] = new char[]{(char)var0_3[33], (char)var0_3[8]};
        v8[(int)var0_3[1]] = new char[]{(char)var0_3[8], (char)var0_3[33]};
        v8[(int)var0_3[29]] = new char[]{(char)var0_3[33], (char)var0_3[33], (char)var0_3[34]};
        v8[(int)var0_3[25]] = new char[]{(char)var0_3[33], (char)var0_3[34], (char)var0_3[33]};
        v8[(int)var0_3[4]] = new char[]{(char)var0_3[34], (char)var0_3[33], (char)var0_3[33]};
        v8[(int)var0_3[22]] = new char[]{(char)var0_3[19], (char)var0_3[19], (char)var0_3[33]};
        v8[(int)var0_3[3]] = new char[]{(char)var0_3[19], (char)var0_3[33], (char)var0_3[19]};
        v8[(int)var0_3[17]] = new char[]{(char)var0_3[19], (char)var0_3[33], (char)var0_3[33]};
        v8[(int)var0_3[23]] = new char[]{(char)var0_3[19], (char)var0_3[33], (char)var0_3[10]};
        v8[(int)var0_3[31]] = new char[]{(char)var0_3[19], (char)var0_3[10], (char)var0_3[33]};
        v8[(int)var0_3[20]] = new char[]{(char)var0_3[33], (char)var0_3[19], (char)var0_3[19]};
        v8[(int)var0_3[30]] = new char[]{(char)var0_3[33], (char)var0_3[19], (char)var0_3[33]};
        v8[(int)var0_3[24]] = new char[]{(char)var0_3[33], (char)var0_3[19], (char)var0_3[10]};
        v8[(int)var0_3[26]] = new char[]{(char)var0_3[33], (char)var0_3[33], (char)var0_3[19]};
        v8[(int)var0_3[2]] = new char[]{(char)var0_3[33], (char)var0_3[33], (char)var0_3[33]};
        v8[(int)var0_3[14]] = new char[]{(char)var0_3[33], (char)var0_3[33], (char)var0_3[10]};
        v8[(int)var0_3[35]] = new char[]{(char)var0_3[33], (char)var0_3[10], (char)var0_3[19]};
        v8[(int)var0_3[36]] = new char[]{(char)var0_3[33], (char)var0_3[10], (char)var0_3[33]};
        v8[(int)var0_3[21]] = new char[]{(char)var0_3[33], (char)var0_3[10], (char)var0_3[10]};
        v8[(int)var0_3[9]] = new char[]{(char)var0_3[10], (char)var0_3[19], (char)var0_3[33]};
        v8[(int)var0_3[5]] = new char[]{(char)var0_3[10], (char)var0_3[33], (char)var0_3[19]};
        v8[(int)var0_3[12]] = new char[]{(char)var0_3[10], (char)var0_3[33], (char)var0_3[33]};
        v8[(int)var0_3[15]] = new char[]{(char)var0_3[10], (char)var0_3[33], (char)var0_3[10]};
        v8[(int)var0_3[28]] = new char[]{(char)var0_3[10], (char)var0_3[10], (char)var0_3[33]};
        lbk.a = v8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    u5 T(Object[] var1_1) {
        block40: {
            block39: {
                block38: {
                    block37: {
                        block36: {
                            block32: {
                                block33: {
                                    block34: {
                                        block35: {
                                            block31: {
                                                block30: {
                                                    block28: {
                                                        var2_2 = (String)var1_1[0];
                                                        var5_3 = (Boolean)var1_1[1];
                                                        var9_4 = (List)var1_1[2];
                                                        var10_5 = (String)var1_1[3];
                                                        var8_6 = (lb6)var1_1[4];
                                                        var3_7 = (Long)var1_1[5];
                                                        var7_8 = (u5)var1_1[6];
                                                        var11_9 = (Boolean)var1_1[7];
                                                        var6_10 = (char[][])var1_1[8];
                                                        v0 = var3_7 = lbk.b ^ var3_7;
                                                        var12_11 = v0 ^ 9411544196253L;
                                                        var14_12 = v0 ^ 15687978992596L;
                                                        var16_13 = v0 ^ 63369583158240L;
                                                        var18_14 = v0 ^ 101267139033581L;
                                                        var20_15 = v0 ^ 16420456571940L;
                                                        var22_16 = v0 ^ 79709333789726L;
                                                        var25_17 = var6_10[var8_6.U(var16_13)];
                                                        var24_18 = m44.a("j", (long)-9107965004048688847L, (long)var3_7);
                                                        try {
                                                            v1 = var7_8 == null ? 1 : 0;
                                                        }
                                                        catch (n9 v2) {
                                                            throw m44.a("j", (Object)v2, (long)-8981445166107164710L, (long)var3_7);
                                                        }
                                                        var26_19 = v1;
                                                        try {
                                                            block29: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v3 = m44.a("n", (long)-9180528667383416308L, (long)var3_7);
                                                                            if (var24_18 == null) break block28;
                                                                            if (v3 != false) break block29;
                                                                        }
                                                                        catch (n9 v4) {
                                                                            throw m44.a("j", (Object)v4, (long)-8981445166107164710L, (long)var3_7);
                                                                        }
                                                                        v5 /* !! */  = var5_3;
                                                                        if (var24_18 == null) break block30;
                                                                    }
                                                                    catch (n9 v6) {
                                                                        throw m44.a("j", (Object)v6, (long)-8981445166107164710L, (long)var3_7);
                                                                    }
                                                                    if (var3_7 < 0L) break block30;
                                                                    if (v5 /* !! */ ) {
                                                                    }
                                                                    ** GOTO lbl63
                                                                }
                                                                catch (n9 v7) {
                                                                    throw m44.a("j", (Object)v7, (long)-8981445166107164710L, (long)var3_7);
                                                                }
                                                            }
                                                            v8 = new Object[5];
                                                            v8[4] = var11_9;
                                                            v8[3] = var22_16;
                                                            v8[2] = var7_8;
                                                            v8[1] = var9_4;
                                                            v8[0] = var25_17;
                                                            v3 = m44.a("j", (Object)v8, (long)-7135894197862439566L, (long)var3_7);
                                                        }
                                                        catch (n9 v9) {
                                                            throw m44.a("j", (Object)v9, (long)-8981445166107164710L, (long)var3_7);
                                                        }
                                                    }
                                                    var27_20 /* !! */  = v3;
                                                    try {
                                                        if (var3_7 < 0L || var24_18 != null) break block31;
lbl63:
                                                        // 2 sources

                                                        v10 = new Object[4];
                                                        v10[3] = var7_8;
                                                        v10[2] = var9_4;
                                                        v10[1] = var12_11;
                                                        v10[0] = var25_17;
                                                        v5 /* !! */  = m44.a("j", (Object)v10, (long)-9159967906752112103L, (long)var3_7);
                                                    }
                                                    catch (n9 v11) {
                                                        throw m44.a("j", (Object)v11, (long)-8981445166107164710L, (long)var3_7);
                                                    }
                                                }
                                                var27_20 /* !! */  = (CallSite)v5 /* !! */ ;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v12 /* !! */  = var27_20 /* !! */ ;
                                                            v13 = var24_18;
                                                            if (var3_7 >= 0L) {
                                                                if (v13 == null) break block32;
                                                                if (v12 /* !! */  == false) break block33;
                                                            }
                                                            ** GOTO lbl113
                                                        }
                                                        catch (n9 v14) {
                                                            throw m44.a("j", (Object)v14, (long)-8981445166107164710L, (long)var3_7);
                                                        }
                                                        var8_6.f(var20_15);
                                                        v15 = var8_6.U(var16_13);
                                                        if (var24_18 == null) break block34;
                                                    }
                                                    catch (n9 v16) {
                                                        throw m44.a("j", (Object)v16, (long)-8981445166107164710L, (long)var3_7);
                                                    }
                                                    if (v15 < var6_10.length) break block35;
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("j", (Object)v17, (long)-8981445166107164710L, (long)var3_7);
                                                }
                                                return null;
                                            }
                                            catch (n9 v18) {
                                                throw m44.a("j", (Object)v18, (long)-8981445166107164710L, (long)var3_7);
                                            }
                                        }
                                        var25_17 = var6_10[var8_6.U(var16_13)];
                                        v15 = 1;
                                    }
                                    var26_19 = v15;
                                }
                                v12 /* !! */  = m44.a("n", (long)-9180528667383416308L, (long)var3_7);
                            }
                            try {
                                v13 = var24_18;
lbl113:
                                // 2 sources

                                if (v13 == null) break block36;
                                if (v12 /* !! */  != false) break block37;
                            }
                            catch (n9 v19) {
                                throw m44.a("j", (Object)v19, (long)-8981445166107164710L, (long)var3_7);
                            }
                            v12 /* !! */  = (CallSite)var5_3;
                        }
                        if (v12 /* !! */  == false) break block38;
                    }
                    v20 = new Object[8];
                    v20[7] = (boolean)var26_19;
                    v20[6] = var11_9;
                    v20[5] = var7_8;
                    v20[4] = var25_17;
                    v20[3] = var10_5;
                    v20[2] = var18_14;
                    v20[1] = var9_4;
                    v20[0] = var2_2;
                    var28_21 = m44.a("j", (Object)v20, (long)-7309841897686394976L, (long)var3_7);
                    v21 /* !! */  = var24_18;
                    if (var3_7 < 0L) break block39;
                    if (v21 /* !! */  != null) break block40;
                }
                v22 = new Object[8];
                v22[7] = (boolean)var26_19;
                v22[6] = var11_9;
                v22[5] = var14_12;
                v22[4] = var7_8;
                v22[3] = var25_17;
                v22[2] = var10_5;
                v22[1] = var9_4;
                v21 /* !! */  = v22;
                v22[0] = var2_2;
            }
            var28_21 = m44.a("j", (Object)v21 /* !! */ , (long)-7169240760486902450L, (long)var3_7);
        }
        return var28_21;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

