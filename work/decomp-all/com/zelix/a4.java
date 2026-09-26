/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a4
implements lmw {
    private String S;
    private oz i;
    private static final long a = prr.a((long)5277386029841939177L, (long)3076205022135280396L, MethodHandles.lookup().lookupClass()).a(3732710746788L);
    private static final String b;

    public a4(oz oz2, String string, long l) {
        l = a ^ l;
        m44.a("t", (Object)this, (oz)oz2, (long)-2413962377156036219L, (long)l);
        m44.a("t", (Object)this, (String)string, (long)-4127110331530756368L, (long)l);
    }

    public String s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-2189688121479882283L, (long)l);
    }

    public int hashCode() {
        a4 a42;
        int n;
        long l;
        block3: {
            block4: {
                l = a ^ 0x77745AE527ADL;
                n = 0;
                CallSite callSite = m44.a("i", (long)4630720614801126547L, (long)l);
                try {
                    a42 = this;
                    if (callSite != null) break block3;
                    if (m44.a("w", (Object)a42, (long)6872139041457272996L, (long)l) == null) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)((Object)n92), (long)6699134814016346165L, (long)l);
                }
                n = m44.a("w", (Object)this, (long)6872139041457272996L, (long)l).hashCode();
            }
            a42 = this;
        }
        if (m44.a("w", (Object)a42, (long)5159105407168298961L, (long)l) != null) {
            n ^= ((String)((Object)m44.a("w", (Object)this, (long)5159105407168298961L, (long)l))).hashCode();
        }
        return n;
    }

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)8765238276488476003L, (long)l);
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return -1;
    }

    /*
     * Exception decompiling
     */
    public String x(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
    public boolean equals(Object var1_1) {
        block29: {
            block30: {
                block35: {
                    block36: {
                        block37: {
                            block38: {
                                block40: {
                                    block39: {
                                        block34: {
                                            block31: {
                                                block33: {
                                                    block32: {
                                                        var2_2 = a4.a ^ 107037818308261L;
                                                        var4_3 = m44.a("i", (long)2399162893184193947L, (long)var2_2);
                                                        try {
                                                            v0 = var1_1 instanceof a4;
                                                            if (var4_3 != null) break block29;
                                                            if (!v0) break block30;
                                                        }
                                                        catch (n9 v1) {
                                                            throw m44.a("i", (Object)v1, (long)4463082294753884477L, (long)var2_2);
                                                        }
                                                        var6_4 = (a4)var1_1;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v2 = m44.a("w", (Object)this, (long)4491962541137795500L, (long)var2_2);
                                                                        if (var4_3 != null) break block31;
                                                                        if (v2 != null) {
                                                                        }
                                                                        ** GOTO lbl42
                                                                    }
                                                                    catch (n9 v3) {
                                                                        throw m44.a("i", (Object)v3, (long)4463082294753884477L, (long)var2_2);
                                                                    }
                                                                    v4 = m44.a("w", (Object)var6_4, (long)4491962541137795500L, (long)var2_2);
                                                                    if (var4_3 != null) break block32;
                                                                }
                                                                catch (n9 v5) {
                                                                    throw m44.a("i", (Object)v5, (long)4463082294753884477L, (long)var2_2);
                                                                }
                                                                if (v4 == null) break block33;
                                                            }
                                                            catch (n9 v6) {
                                                                throw m44.a("i", (Object)v6, (long)4463082294753884477L, (long)var2_2);
                                                            }
                                                            v4 = m44.a("w", (Object)this, (long)4491962541137795500L, (long)var2_2);
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("i", (Object)v7, (long)4463082294753884477L, (long)var2_2);
                                                        }
                                                    }
                                                    var5_5 = v4.equals(m44.a("w", (Object)var6_4, (long)4491962541137795500L, (long)var2_2));
                                                    if (var4_3 == null) break block34;
                                                }
                                                var5_5 = false;
                                                try {
                                                    if (var4_3 == null) break block34;
lbl42:
                                                    // 2 sources

                                                    v2 = m44.a("w", (Object)var6_4, (long)4491962541137795500L, (long)var2_2);
                                                }
                                                catch (n9 v8) {
                                                    throw m44.a("i", (Object)v8, (long)4463082294753884477L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                v9 = v2 == null;
                                            }
                                            catch (n9 v10) {
                                                throw m44.a("i", (Object)v10, (long)4463082294753884477L, (long)var2_2);
                                            }
                                            var5_5 = v9;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v11 = var5_5;
                                                                if (var4_3 != null) break block35;
                                                                if (!v11) break block36;
                                                            }
                                                            catch (n9 v12) {
                                                                throw m44.a("i", (Object)v12, (long)4463082294753884477L, (long)var2_2);
                                                            }
                                                            v13 = m44.a("w", (Object)this, (long)2778937734215392985L, (long)var2_2);
                                                            if (var4_3 != null) break block37;
                                                        }
                                                        catch (n9 v14) {
                                                            throw m44.a("i", (Object)v14, (long)4463082294753884477L, (long)var2_2);
                                                        }
                                                        if (v13 == null) break block38;
                                                    }
                                                    catch (n9 v15) {
                                                        throw m44.a("i", (Object)v15, (long)4463082294753884477L, (long)var2_2);
                                                    }
                                                    v16 = m44.a("w", (Object)var6_4, (long)2778937734215392985L, (long)var2_2);
                                                    if (var4_3 != null) break block39;
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("i", (Object)v17, (long)4463082294753884477L, (long)var2_2);
                                                }
                                                if (v16 == null) break block40;
                                            }
                                            catch (n9 v18) {
                                                throw m44.a("i", (Object)v18, (long)4463082294753884477L, (long)var2_2);
                                            }
                                            v16 = m44.a("w", (Object)this, (long)2778937734215392985L, (long)var2_2);
                                        }
                                        catch (n9 v19) {
                                            throw m44.a("i", (Object)v19, (long)4463082294753884477L, (long)var2_2);
                                        }
                                    }
                                    return v16.equals(m44.a("w", (Object)var6_4, (long)2778937734215392985L, (long)var2_2));
                                }
                                return false;
                            }
                            v13 = m44.a("w", (Object)var6_4, (long)2778937734215392985L, (long)var2_2);
                        }
                        try {
                            v20 = v13 == null;
                        }
                        catch (n9 v21) {
                            throw m44.a("i", (Object)v21, (long)4463082294753884477L, (long)var2_2);
                        }
                        return v20;
                    }
                    v11 = false;
                }
                return v11;
            }
            v0 = false;
        }
        return v0;
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public String D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    public String U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8316816447495716780L, (long)l);
    }

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x7C7DDAC8CC6FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ca\u00d0L\u00da2\u00e7;\u00b7".getBytes("ISO-8859-1"));
                b = a4.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
}
