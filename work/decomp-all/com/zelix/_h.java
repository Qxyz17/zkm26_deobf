/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.us;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _h
extends _0 {
    private static String Y;
    public static final String B;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = prr.a((long)-7499572598945369841L, (long)777041493626201452L, MethodHandles.lookup().lookupClass()).a(150385767853695L) ^ 0xAF6D6400897L;
        if (m44.a("o", (long)1324474647341829207L, (long)l) != null) {
            m44.a("o", (Object)"pADXPb", (long)966978461989256087L, (long)l);
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00b2\u00a6\u00ea\u00a6\u009d\u00caaC2\u00f04Sd\u00bc\u00d4\r".getBytes("ISO-8859-1"));
                String string = _h.b(byArray3).intern();
                B = m44.a("o", (Object)string, (long)1368733221952518465L, (long)l);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static String n() {
        return Y;
    }

    public void Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x5BB79E261300L;
        m44.a("p", (Object)((Object)this), (long)l2, null, null, null, (long)-5695851393133682571L, (long)l);
    }

    public static void a(String string) {
        Y = string;
    }

    public synchronized void Y(Object[] objectArray) {
        block9: {
            block8: {
                _h _h2;
                List list;
                long l;
                block6: {
                    CallSite callSite;
                    us us2;
                    block7: {
                        us2 = (us)objectArray[0];
                        l = (Long)objectArray[1];
                        callSite = m44.a("k", (long)-4132884182306858861L, (long)l);
                        try {
                            list = this.e;
                            if (l <= 0L || callSite != null) break block6;
                            if (list != null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)((Object)n92), (long)-2815560495485046609L, (long)l);
                        }
                        return;
                    }
                    try {
                        list = this.e;
                        if (l < 0L) break block6;
                        m44.a("t", (Object)list, (Object)us2, (long)-4289448557524953229L, (long)l);
                        _h2 = this;
                        if (callSite != null) break block8;
                        list = _h2.e;
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)((Object)n93), (long)-2815560495485046609L, (long)l);
                    }
                }
                try {
                    if (!list.isEmpty()) break block9;
                    _h2 = this;
                }
                catch (n9 n94) {
                    throw m44.a("k", (Object)((Object)n94), (long)-2815560495485046609L, (long)l);
                }
            }
            _h2.e = null;
        }
    }

    /*
     * Exception decompiling
     */
    public void T(long var1_1, Object var3_2, Object var4_3, Object var5_4) {
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

    public final synchronized void y(Object[] objectArray) {
        block10: {
            List list;
            CallSite callSite;
            long l;
            us us2;
            block8: {
                block9: {
                    us2 = (us)objectArray[0];
                    l = (Long)objectArray[1];
                    callSite = m44.a("j", (long)6457086368625543082L, (long)l);
                    try {
                        try {
                            list = this.e;
                            if (l <= 0L || callSite != null) break block8;
                            if (list != null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)((Object)n92), (long)5175824309520183190L, (long)l);
                        }
                        this.e = new ArrayList(2);
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)((Object)n93), (long)5175824309520183190L, (long)l);
                    }
                }
                list = this.e;
            }
            try {
                boolean bl;
                try {
                    bl = list.contains(us2);
                    if (callSite != null || bl) break block10;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)((Object)n94), (long)5175824309520183190L, (long)l);
                }
                bl = this.e.add(us2);
            }
            catch (n9 n95) {
                throw m44.a("j", (Object)((Object)n95), (long)5175824309520183190L, (long)l);
            }
        }
    }

    private static n9 c(n9 n92) {
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
}
