/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.df;
import com.zelix.m44;
import com.zelix.o9;
import com.zelix.prr;
import com.zelix.sr;
import com.zelix.x7;
import com.zelix.xt;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class s1
extends sr {
    int M;
    private Map g;
    private df i;
    x7[] a;
    private static final long b = prr.a((long)3690742609797169367L, (long)-8257980252555956965L, MethodHandles.lookup().lookupClass()).a(2951422951099L);
    private static final String h;

    public boolean C(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = b ^ l;
                CallSite callSite = m44.a("m", (long)-3561154798904496424L, (long)l);
                try {
                    try {
                        object = m44.a("s", (Object)((Object)this), (long)-3896401096374628355L, (long)l);
                        if (callSite != null) break block4;
                        if (object >= m44.a("s", (Object)((Object)this), (long)-3805255949173752473L, (long)l)) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)-3379018932362469890L, (long)l);
                    }
                    object = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-3379018932362469890L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public x7 d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = b ^ l;
        return m44.a("r", (Object)((Object)this), (long)-5722932049073843713L, (long)l)[n];
    }

    /*
     * Unable to fully structure code
     */
    void B(Object[] var1_1) {
        block19: {
            var2_2 = (Long)var1_1[0];
            var4_3 = (x7[])var1_1[1];
            v0 = var2_2 = s1.b ^ var2_2;
            var5_4 = v0 ^ 74396892090569L;
            var7_5 = v0 ^ 85399534263832L;
            v1 = v0 ^ 109138062931780L;
            var9_6 = v1 >>> 16;
            var11_7 = (int)(v1 << 48 >>> 48);
            var12_8 = v0 ^ 90801682409763L;
            m44.a("q", (Object)this, (df)new df(var7_5), (long)4801096212145115817L, (long)var2_2);
            var15_9 = new ArrayList<Object>();
            var16_10 = var4_3;
            var17_11 = var16_10.length;
            var18_12 = 0;
            var14_13 = m44.a("m", (long)6893964369254629344L, (long)var2_2);
            while (var18_12 < var17_11) {
                block23: {
                    block20: {
                        block22: {
                            block21: {
                                var19_14 = var16_10[var18_12];
                                try {
                                    try {
                                        if (var14_13 != null) break block19;
                                        v2 = var19_14 instanceof xt;
                                        if (var14_13 != null) break block20;
                                    }
                                    catch (IllegalArgumentException v3) {
                                        throw m44.a("m", (Object)v3, (long)4621577956814654662L, (long)var2_2);
                                    }
                                    if (v2) {
                                    }
                                    ** GOTO lbl70
                                }
                                catch (IllegalArgumentException v4) {
                                    throw m44.a("m", (Object)v4, (long)4621577956814654662L, (long)var2_2);
                                }
                                var20_15 = (xt)var19_14;
                                v5 = new Object[1];
                                v5[0] = var5_4;
                                var21_16 = m44.a("r", (Object)var20_15, (Object)v5, (long)6799758702971657909L, (long)var2_2);
                                try {
                                    try {
                                        v6 = var14_13;
                                        if (var2_2 < 0L) ** GOTO lbl57
                                        if (v6 != null) break block21;
                                        if (var21_16 != null) {
                                        }
                                        ** GOTO lbl60
                                    }
                                    catch (IllegalArgumentException v7) {
                                        throw m44.a("m", (Object)v7, (long)4621577956814654662L, (long)var2_2);
                                    }
                                    m44.a("s", (Object)this, (long)4801096212145115817L, (long)var2_2).L(var9_6, (char)var11_7, var21_16, var20_15);
                                }
                                catch (IllegalArgumentException v8) {
                                    throw m44.a("m", (Object)v8, (long)4621577956814654662L, (long)var2_2);
                                }
                            }
                            try {
                                v6 = var14_13;
lbl57:
                                // 2 sources

                                if (var2_2 >= 0L) {
                                    if (v6 == null) break block22;
                                }
                                ** GOTO lbl68
lbl60:
                                // 2 sources

                                var15_9.add(var20_15);
                            }
                            catch (IllegalArgumentException v9) {
                                throw m44.a("m", (Object)v9, (long)4621577956814654662L, (long)var2_2);
                            }
                        }
                        try {
                            v6 = var14_13;
lbl68:
                            // 2 sources

                            if (var2_2 <= 0L) break block23;
                            if (v6 == null) break block20;
lbl70:
                            // 2 sources

                            v2 = var15_9.add(var19_14);
                        }
                        catch (IllegalArgumentException v10) {
                            throw m44.a("m", (Object)v10, (long)4621577956814654662L, (long)var2_2);
                        }
                    }
                    ++var18_12;
                    v6 = var14_13;
                }
                if (v6 == null) continue;
            }
            m44.a("q", (Object)this, (int)var15_9.size(), (long)6487848015902010463L, (long)var2_2);
            m44.a("q", (Object)this, (x7[])new x7[m44.a("s", (Object)this, (long)6487848015902010463L, (long)var2_2)], (long)6513672070308608782L, (long)var2_2);
            m44.a("q", (Object)this, (x7[])((x7[])var15_9.toArray((T[])m44.a("s", (Object)this, (long)6513672070308608782L, (long)var2_2))), (long)6513672070308608782L, (long)var2_2);
            m44.a("q", (Object)this, null, (long)6505805792191799324L, (long)var2_2);
            v11 = new Object[1];
            v11[0] = var12_8;
            m44.a("r", (Object)this, (Object)v11, (long)4697568917792913111L, (long)var2_2);
            if (var2_2 > 0L) {
                // empty if block
            }
        }
    }

    public df A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("p", (Object)((Object)this), (long)5085676899500103322L, (long)l);
    }

    public int F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (int)m44.a("p", (Object)((Object)this), (long)1795256740584533692L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public int h(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[DOLOOP]], but top level block is 18[SIMPLE_IF_TAKEN]
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

    public void R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        x7[] x7Array = (x7[])objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x4229FC955527L;
        long l4 = l2 ^ 0x747A29BD9225L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = x7Array;
        objectArray2[0] = l3;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)4416711846615616876L, (long)l);
        this.I();
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        m44.a("u", (Object)((Object)this), (Object)objectArray3, (long)4366906306149509603L, (long)l);
    }

    public s1(String string, long l, _4 _42, x7[] x7Array, o9 o92) {
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x46AA47A391A8L;
        long l4 = l2 ^ 0xF908DAEA0ADL;
        long l5 = l4 >>> 8;
        int n = (int)(l4 << 56 >>> 56);
        super(string, l5, _42, (byte)n, o92);
        Object[] objectArray = new Object[2];
        objectArray[1] = x7Array;
        objectArray[0] = l3;
        m44.a("r", (Object)((Object)this), (Object)objectArray, (long)-449141129670145565L, (long)l);
    }

    public String G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x126B838CA183L;
        CallSite callSite = m44.a("v", (Object)((Object)this), (long)1044855971492261867L, (long)l);
        s1 s12 = this;
        CallSite callSite2 = m44.a("v", (Object)((Object)s12), (long)878311437506251296L, (long)l);
        m44.a("t", (Object)((Object)s12), (int)(callSite2 + true), (long)878311437506251296L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("w", (Object)callSite[callSite2], (Object)objectArray2, (long)1149378311573337173L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x8DD938201A8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d2\u00ae\u00b7\u00c7\u0011\u009d\u009aG\u00a6D \u00bb\u009dU{\u00e9\u0084aG\u00b1\u00c8\u00b7\u00d87".getBytes("ISO-8859-1"));
                h = s1.c(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String c(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }
}
