/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.bz;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.DataOutputStream;
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

public class k3
extends kx {
    private bz[] o;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map g;
    private static final long i;

    @Override
    void z(gu gu2, long l10) {
        block6: {
            Object object;
            CallSite callSite;
            long l11;
            block5: {
                long l12 = l10;
                l11 = l12 ^ 0L;
                long l13 = l12 ^ 0x66FDF08525FDL;
                CallSite callSite2 = m44.a("h", (long)5618762033536375070L, (long)l10);
                gu2.K(this.b, this, l13, this.H());
                callSite = callSite2;
                try {
                    try {
                        object = m44.a("v", (Object)this, (long)5544088189886891558L, (long)l10);
                        if (callSite != false) break block5;
                        if (object == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)6155350523328440613L, (long)l10);
                    }
                    object = this.o.length;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)6155350523328440613L, (long)l10);
                }
            }
            Object object2 = object;
            for (int i10 = 0; i10 < object2; ++i10) {
                m44.a("w", (Object)this.o[i10], (Object)gu2, (long)l11, (long)5822427420561165392L, (long)l10);
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void N(Object[] var1_1) {
        block15: {
            block14: {
                var6_2 = (DataOutputStream)var1_1[0];
                var2_3 = (Map)var1_1[1];
                var4_4 = (Long)var1_1[2];
                var3_5 = (lqu)var1_1[3];
                v0 = var4_4;
                var7_6 = v0 ^ 86058570623411L;
                var9_7 = v0 ^ 0L;
                v1 = m44.a("k", (long)1680553024964027930L, (long)var4_4);
                v2 = new Object[4];
                v2[3] = var3_5;
                v2[2] = var9_7;
                v2[1] = var2_3;
                v2[0] = var6_2;
                super.N(v2);
                var11_8 = v1;
                try {
                    try {
                        v3 /* !! */  = m44.a("u", (Object)this, (long)1009829788873835733L, (long)var4_4);
                        if (var11_8 == false) break block14;
                        if (v3 /* !! */  != false) {
                        }
                        ** GOTO lbl58
                    }
                    catch (n9 v4) {
                        throw m44.a("k", (Object)v4, (long)1702112935159720918L, (long)var4_4);
                    }
                    v3 /* !! */  = (CallSite)this.o.length;
                }
                catch (n9 v5) {
                    throw m44.a("k", (Object)v5, (long)1702112935159720918L, (long)var4_4);
                }
            }
            var12_9 = v3 /* !! */ ;
            var6_2.writeByte((int)var12_9);
            var13_10 = 0;
            block8: while (var13_10 < var12_9) {
                try {
                    v6 = new Object[4];
                    v6[3] = var3_5;
                    v6[2] = var2_3;
                    v6[1] = var6_2;
                    v6[0] = var7_6;
                    m44.a("t", (Object)this.o[var13_10], (Object)v6, (long)857956793085722750L, (long)var4_4);
                    ++var13_10;
                    do {
                        v7 = var11_8;
                        if (var4_4 > 0L) {
                            if (v7 == false) break block15;
                            v7 = var11_8;
                        }
                        if (v7 != false) continue block8;
                    } while (var4_4 <= 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)1702112935159720918L, (long)var4_4);
                }
            }
            try {
                if (var4_4 < 0L || var11_8 != false) break block15;
lbl58:
                // 2 sources

                var6_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var4_4));
            }
            catch (n9 v9) {
                throw m44.a("k", (Object)v9, (long)1702112935159720918L, (long)var4_4);
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    int g(int var1_1, byte var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 6[SIMPLE_IF_TAKEN]
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
    public void M(Object[] var1_1) {
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
    @Override
    protected void c(Object[] var1_1) {
        block15: {
            block14: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                v0 = var2_2;
                var5_4 = v0 ^ 0L;
                var7_5 = v0 ^ 12374223908362L;
                v1 = m44.a("i", (long)1272493964096652623L, (long)var2_2);
                v2 = new Object[2];
                v2[1] = var4_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 /* !! */  = m44.a("w", (Object)this, (long)1198408428474194551L, (long)var2_2);
                        if (var9_6 != false) break block14;
                        if (v3 /* !! */  != false) {
                        }
                        ** GOTO lbl52
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)665730617726334324L, (long)var2_2);
                    }
                    v3 /* !! */  = (CallSite)this.o.length;
                }
                catch (n9 v5) {
                    throw m44.a("i", (Object)v5, (long)665730617726334324L, (long)var2_2);
                }
            }
            var10_7 = v3 /* !! */ ;
            var4_3.writeByte((int)var10_7);
            var11_8 = 0;
            block8: while (var11_8 < var10_7) {
                try {
                    v6 = new Object[2];
                    v6[1] = var7_5;
                    v6[0] = var4_3;
                    m44.a("v", (Object)this.o[var11_8], (Object)v6, (long)1115945276842499428L, (long)var2_2);
                    ++var11_8;
                    do {
                        v7 = var9_6;
                        if (var2_2 > 0L) {
                            if (v7 != false) break block15;
                            v7 = var9_6;
                        }
                        if (v7 == false) continue block8;
                    } while (var2_2 < 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("i", (Object)v8, (long)665730617726334324L, (long)var2_2);
                }
            }
            try {
                if (var2_2 < 0L || var9_6 == false) break block15;
lbl52:
                // 2 sources

                var4_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var2_2));
            }
            catch (n9 v9) {
                throw m44.a("i", (Object)v9, (long)665730617726334324L, (long)var2_2);
            }
        }
    }

    /*
     * Exception decompiling
     */
    k3(_4 var1_1, int var2_2, String var3_3, h1 var4_4, l6q var5_5, PrintWriter var6_6, long var7_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[DOLOOP]], but top level block is 3[TRYBLOCK]
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
     */
    void V(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (var2_2 = k3.a ^ var2_2) ^ 81892369130847L;
        var7_4 = this.o.length;
        var8_5 = 0;
        var6_6 = m44.a("h", (long)7217493869466824910L, (long)var2_2);
        while (var8_5 < var7_4) {
            v0 = new Object[2];
            v0[1] = var8_5;
            v0[0] = var4_3;
            m44.a("w", (Object)this.o[var8_5], (Object)v0, (long)6935720644662819217L, (long)var2_2);
            ++var8_5;
lbl15:
            // 2 sources

            ** while (var6_6 != false)
lbl16:
            // 1 sources

        }
lbl17:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl15
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    k3.a = prr.a(-8118939980381019893L, 8072891312540668765L, MethodHandles.lookup().lookupClass()).a(252649764781910L);
                    k3.g = new HashMap<K, V>(13);
                    var5 = k3.a ^ 6877630629504L;
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
                    var14_3 = new String[7];
                    var12_4 = 0;
                    var11_5 = "\u00a5\u00fc\u0092\u009d\"\u00bd\u001d\u0094\u00b0g\u00a0\u009f\u00c7\u0094q%\u0010&\u00fe\u0081w\u0018Q\u00d0\u009f\u0089\u00a6f\u0096\u00bf\u00cd\u00e5\u0082 \u00e1\u0081\u00f7\u0086\u00a4@\u0011\u000e\u0012l!\u001b\u00c6W\u00b9\u00a0\u008b\u008e\u00aaT\u0014:\u00adG\u00e3d\u00a4L\u008c\u000b\u00e61\u0010.\u00f8a\u0001A-\u001c\u00ff\u009b\"\u00b1@\u00a3\u00d2\u00f9\u0011\u0010\u0090\u0017#u\u00fb`\u00db\u00a2\u00fc\u00fd\u00a6\u0090\u00ee\u0080O\u0005";
                    var13_6 = "\u00a5\u00fc\u0092\u009d\"\u00bd\u001d\u0094\u00b0g\u00a0\u009f\u00c7\u0094q%\u0010&\u00fe\u0081w\u0018Q\u00d0\u009f\u0089\u00a6f\u0096\u00bf\u00cd\u00e5\u0082 \u00e1\u0081\u00f7\u0086\u00a4@\u0011\u000e\u0012l!\u001b\u00c6W\u00b9\u00a0\u008b\u008e\u00aaT\u0014:\u00adG\u00e3d\u00a4L\u008c\u000b\u00e61\u0010.\u00f8a\u0001A-\u001c\u00ff\u009b\"\u00b1@\u00a3\u00d2\u00f9\u0011\u0010\u0090\u0017#u\u00fb`\u00db\u00a2\u00fc\u00fd\u00a6\u0090\u00ee\u0080O\u0005".length();
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
                        var14_3[var12_4++] = k3.c(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u0082\u008dd7\n\u00c24\u00d84\u00c1\u00f9j\u00aa\u0099\u00ada(\u0097\u00de\u00a3c\u001e\u0088s?\u0086\u00fb\u0081\u00ed\u00d1\u0096\u00d9\u007f\u0096\u00f3m\u00a7\u00dd\u00b9\u00af\u00f7\u0082\u000eG\u00b2\u00a7<\u000f0Q\u009et\u00b5\u008eM#\u00ae";
                        var13_6 = "\u0082\u008dd7\n\u00c24\u00d84\u00c1\u00f9j\u00aa\u0099\u00ada(\u0097\u00de\u00a3c\u001e\u0088s?\u0086\u00fb\u0081\u00ed\u00d1\u0096\u00d9\u007f\u0096\u00f3m\u00a7\u00dd\u00b9\u00af\u00f7\u0082\u000eG\u00b2\u00a7<\u000f0Q\u009et\u00b5\u008eM#\u00ae".length();
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
                        var14_3[var12_4++] = k3.c(var15_9).intern();
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
            k3.c = var14_3;
            k3.d = new String[7];
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
        var2_12 = 2481627223177404701L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        k3.i = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1498;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/k3", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            k3.d[n11] = k3.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = k3.b(n10, l10);
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
            throw new RuntimeException("com/zelix/k3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(k3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

