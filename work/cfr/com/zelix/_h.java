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
        long l10 = prr.a(-7499572598945369841L, 777041493626201452L, MethodHandles.lookup().lookupClass()).a(150385767853695L) ^ 0xAF6D6400897L;
        if (m44.a("o", (long)1324474647341829207L, (long)l10) != null) {
            m44.a("o", "pADXPb", (long)966978461989256087L, (long)l10);
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00b2\u00a6\u00ea\u00a6\u009d\u00caaC2\u00f04Sd\u00bc\u00d4\r".getBytes("ISO-8859-1"));
                String string = _h.b(byArray3).intern();
                B = m44.a("o", string, (long)1368733221952518465L, (long)l10);
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    public static String n() {
        return Y;
    }

    @Override
    public void Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x5BB79E261300L;
        m44.a("p", (Object)this, (long)l11, null, null, null, (long)-5695851393133682571L, (long)l10);
    }

    public static void a(String string) {
        Y = string;
    }

    @Override
    public synchronized void Y(Object[] objectArray) {
        block9: {
            block8: {
                _h _h2;
                List list;
                long l10;
                block6: {
                    CallSite callSite;
                    us us2;
                    block7: {
                        us2 = (us)objectArray[0];
                        l10 = (Long)objectArray[1];
                        callSite = m44.a("k", (long)-4132884182306858861L, (long)l10);
                        try {
                            list = this.e;
                            if (l10 <= 0L || callSite != null) break block6;
                            if (list != null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)-2815560495485046609L, (long)l10);
                        }
                        return;
                    }
                    try {
                        list = this.e;
                        if (l10 < 0L) break block6;
                        m44.a("t", (Object)list, (Object)us2, (long)-4289448557524953229L, (long)l10);
                        _h2 = this;
                        if (callSite != null) break block8;
                        list = _h2.e;
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)-2815560495485046609L, (long)l10);
                    }
                }
                try {
                    if (!list.isEmpty()) break block9;
                    _h2 = this;
                }
                catch (n9 n94) {
                    throw m44.a("k", (Object)n94, (long)-2815560495485046609L, (long)l10);
                }
            }
            _h2.e = null;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
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
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public final synchronized void y(Object[] objectArray) {
        block10: {
            List list;
            CallSite callSite;
            long l10;
            us us2;
            block8: {
                block9: {
                    us2 = (us)objectArray[0];
                    l10 = (Long)objectArray[1];
                    callSite = m44.a("j", (long)6457086368625543082L, (long)l10);
                    try {
                        try {
                            list = this.e;
                            if (l10 <= 0L || callSite != null) break block8;
                            if (list != null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)n92, (long)5175824309520183190L, (long)l10);
                        }
                        this.e = new ArrayList(2);
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)n93, (long)5175824309520183190L, (long)l10);
                    }
                }
                list = this.e;
            }
            try {
                boolean bl2;
                try {
                    bl2 = list.contains(us2);
                    if (callSite != null || bl2) break block10;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)n94, (long)5175824309520183190L, (long)l10);
                }
                bl2 = this.e.add(us2);
            }
            catch (n9 n95) {
                throw m44.a("j", (Object)n95, (long)5175824309520183190L, (long)l10);
            }
        }
    }

    private static n9 c(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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
}

