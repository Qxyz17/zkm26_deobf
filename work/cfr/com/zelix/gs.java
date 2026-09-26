/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lb6;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.yu;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Path;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gs {
    String w;
    String P;
    ZipFile v;
    String O;
    File a;
    lqw e;
    s4 D;
    Path B;
    int h;
    ZipEntry s;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] i;
    private static final Map j;

    public static gs s(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = (l10 = b ^ l10) ^ 0x54EBF2A12CA5L;
        return new gs(l11, new StringBuilder(string));
    }

    public gs(long l10, ZipFile zipFile, byte by2, ZipEntry zipEntry) {
        long l11 = (l10 << 8 | (long)by2 << 56 >>> 56) ^ b;
        long l12 = l11 ^ 0x4F8E34032F34L;
        this(zipFile, zipEntry, l12, null);
    }

    public String N(long l10) {
        gs gs2;
        block4: {
            block5: {
                l10 = b ^ l10;
                CallSite callSite = m44.a("o", (long)83142747117158687L, (long)l10);
                try {
                    try {
                        gs2 = this;
                        if (callSite != false) break block4;
                        if (gs2.e == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)532395788754961060L, (long)l10);
                    }
                    return this.e.A();
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)532395788754961060L, (long)l10);
                }
            }
            gs2 = this;
        }
        return m44.a("q", (Object)gs2, (long)195349556663939842L, (long)l10);
    }

    public String toString() {
        return this.n();
    }

    public gs(long l10, File file) {
        long l11 = (l10 = b ^ l10) ^ 0x7DDC8C185BACL;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        this(null, n10, (char)n11, file, (short)n12);
    }

    private String M(Object[] objectArray) {
        long l10;
        long l11;
        block11: {
            gs gs2;
            block10: {
                int n10;
                CallSite callSite;
                block8: {
                    CallSite callSite2;
                    block9: {
                        l11 = (Long)objectArray[0];
                        l10 = (l11 = b ^ l11) ^ 0x5B1DC4B8D171L;
                        callSite2 = m44.a("k", (long)1205595928863674499L, (long)l11);
                        try {
                            try {
                                callSite = m44.a("u", (Object)this, (long)1696623490485042831L, (long)l11);
                                n10 = 1;
                                if (callSite2 != false) break block8;
                                if (callSite != n10) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("k", (Object)runtimeException, (long)1657097997678629688L, (long)l11);
                            }
                            return this.P;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("k", (Object)runtimeException, (long)1657097997678629688L, (long)l11);
                        }
                    }
                    try {
                        gs2 = this;
                        if (callSite2 != false) break block10;
                        callSite = m44.a("u", (Object)gs2, (long)1696623490485042831L, (long)l11);
                        n10 = 3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("k", (Object)runtimeException, (long)1657097997678629688L, (long)l11);
                    }
                }
                if (callSite != n10) break block11;
                gs2 = this;
            }
            return m44.a("u", (Object)gs2, (long)1437992414662022378L, (long)l11).toString();
        }
        return this.N(l10) + (char)gs.b("r", (int)8440, (long)(0x497F0C95EDBE8F0DL ^ l11)) + this.P;
    }

    public int hashCode() {
        long l10 = b ^ 0x6694D5F69205L;
        long l11 = l10 ^ 0x68DAAB3E9029L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return ((String)((Object)m44.a("n", (Object)this, (Object)objectArray, (long)4673220005314241827L, (long)l10))).hashCode();
    }

    /*
     * Exception decompiling
     */
    public File O(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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

    public boolean equals(Object object) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = b ^ 0x6F4F82F90A04L;
                long l11 = l10 ^ 0x6101FC310828L;
                CallSite callSite = m44.a("n", (long)-2846736761880029114L, (long)l10);
                try {
                    try {
                        bl2 = object instanceof gs;
                        if (callSite != false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("n", (Object)runtimeException, (long)-2433552134844802051L, (long)l10);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l11;
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    return ((String)((Object)m44.a("o", (Object)this, (Object)objectArray, (long)-2820496851821740766L, (long)l10))).equals(m44.a("o", (Object)((gs)object), (Object)objectArray2, (long)-2820496851821740766L, (long)l10));
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("n", (Object)runtimeException, (long)-2433552134844802051L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private gs(long l10, StringBuilder stringBuilder) {
        l10 = b ^ l10;
        m44.a("q", (Object)this, null, (long)-4715328955401437635L, (long)l10);
        m44.a("q", (Object)this, (int)gs.b("r", (int)5669, (long)(0x13598C611BDA0A7CL ^ l10)), (long)-6618654757462012639L, (long)l10);
        this.P = stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    public void S(Object[] var1_1) {
        block5: {
            var2_2 = (Long)var1_1[0];
            var2_2 = gs.b ^ var2_2;
            m44.a("q", (Object)this, null, (long)1436585244849427293L, (long)var2_2);
            v0 = m44.a("m", (long)672678610349169285L, (long)var2_2);
            m44.a("q", (Object)this, null, (long)923952190594229853L, (long)var2_2);
            var4_3 = v0;
            try {
                v1 = m44.a("s", (Object)this, (long)1616811857578724219L, (long)var2_2);
                if (var4_3 != false) {
                    if (v1 == null) break block5;
                }
                ** GOTO lbl18
            }
            catch (IOException v2) {
                throw m44.a("m", (Object)v2, (long)590376987410583030L, (long)var2_2);
            }
            try {
                v1 = m44.a("s", (Object)this, (long)1616811857578724219L, (long)var2_2);
lbl18:
                // 2 sources

                m44.a("r", (Object)v1, (long)600403379429606897L, (long)var2_2);
            }
            catch (IOException var5_4) {
                // empty catch block
            }
            m44.a("q", (Object)this, null, (long)1616811857578724219L, (long)var2_2);
        }
    }

    public gs(Path path, long l10, s4 s42) {
        l10 = b ^ l10;
        m44.a("u", (Object)this, (Path)((Object)m44.a("v", (Object)path, (long)-4033017476479433365L, (long)l10)), (long)-3866719628647068344L, (long)l10);
        m44.a("u", (Object)this, (s4)s42, (long)-3345447314798098777L, (long)l10);
        m44.a("u", (Object)this, (int)gs.b("r", (int)30885, (long)(0x2D616F66348EF1L ^ l10)), (long)-3591059315669768403L, (long)l10);
        this.P = path.toString();
    }

    public boolean p(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = b ^ l10;
                CallSite callSite = m44.a("i", (long)-7980085913236532871L, (long)l10);
                try {
                    try {
                        object = m44.a("w", (Object)this, (long)-7606096899785736331L, (long)l10);
                        if (callSite != false) break block4;
                        if (object != true) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("i", (Object)runtimeException, (long)-7564612644061654334L, (long)l10);
                    }
                    object = true;
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("i", (Object)runtimeException, (long)-7564612644061654334L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public lqw A(Object[] objectArray) {
        return this.e;
    }

    public gs(ZipFile zipFile, ZipEntry zipEntry, long l10, lqw lqw2) {
        l10 = b ^ l10;
        m44.a("u", (Object)this, (ZipFile)zipFile, (long)7925341999768989943L, (long)l10);
        m44.a("u", (Object)this, (String)((Object)m44.a("v", (Object)zipFile, (long)8240629560569584479L, (long)l10)), (long)8532192258602600412L, (long)l10);
        m44.a("u", (Object)this, (ZipEntry)zipEntry, (long)8601559456548412881L, (long)l10);
        m44.a("u", (Object)this, (int)gs.b("r", (int)12843, (long)(0x1265E14FB45BF89DL ^ l10)), (long)8271342474636614605L, (long)l10);
        this.P = zipEntry.getName();
        this.e = lqw2;
    }

    public String B(long l10) {
        String string;
        block4: {
            StringBuilder stringBuilder;
            block5: {
                long l11 = (l10 = b ^ l10) ^ 0x31F006A481D4L;
                stringBuilder = new StringBuilder();
                CallSite callSite = m44.a("n", (long)5133820075354674414L, (long)l10);
                String string2 = this.N(l11);
                try {
                    try {
                        string = string2;
                        if (callSite == false) break block4;
                        if (string == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("n", (Object)runtimeException, (long)5069464612269261725L, (long)l10);
                    }
                    stringBuilder.append(string2);
                    stringBuilder.append("!");
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("n", (Object)runtimeException, (long)5069464612269261725L, (long)l10);
                }
            }
            stringBuilder.append(this.n());
            string = stringBuilder.toString();
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    public InputStream C(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (lb6)var1_1[1];
        var2_2 = gs.b ^ var2_2;
        var5_4 = m44.a("h", (long)-8081562619159372792L, (long)var2_2);
        switch (m44.a("v", (Object)this, (long)-8086055575516141876L, (long)var2_2)) {
            case 1: {
                var6_5 = new FileInputStream(this.P);
                try {
                    v0 = var4_3;
                    v1 = var5_4;
                    if (var2_2 < 0L) ** GOTO lbl21
                    if (v1 == false) ** GOTO lbl20
                    if (v0 != null) {
                    }
                    ** GOTO lbl22
                }
                catch (RuntimeException v2) {
                    throw m44.a("h", (Object)v2, (long)-8161612683911640197L, (long)var2_2);
                }
                v0 = var4_3;
lbl20:
                // 2 sources

                v1 = m44.a("w", (Object)var6_5, (long)-8334455963622363245L, (long)var2_2);
lbl21:
                // 2 sources

                v0.P((int)v1);
lbl22:
                // 2 sources

                return var6_5;
            }
            case 2: {
                try {
                    try {
                        v3 = this;
                        v4 = var5_4;
                        if (var2_2 <= 0L) ** GOTO lbl43
                        if (v4 == false) ** GOTO lbl40
                        if (m44.a("v", (Object)v3, (long)-7999164876965736970L, (long)var2_2) == null) {
                        }
                        ** GOTO lbl39
                    }
                    catch (RuntimeException v5) {
                        throw m44.a("h", (Object)v5, (long)-8161612683911640197L, (long)var2_2);
                    }
                    m44.a("t", (Object)this, (ZipFile)new yu((String)m44.a("v", (Object)this, (long)-8401088227347039523L, (long)var2_2)), (long)-7999164876965736970L, (long)var2_2);
                }
                catch (RuntimeException v6) {
                    throw m44.a("h", (Object)v6, (long)-8161612683911640197L, (long)var2_2);
                }
lbl39:
                // 2 sources

                v3 = this;
lbl40:
                // 2 sources

                try {
                    try {
                        v4 = var5_4;
lbl43:
                        // 2 sources

                        if (v4 == false) ** GOTO lbl54
                        if (m44.a("v", (Object)v3, (long)-8475816678328655664L, (long)var2_2) == null) {
                        }
                        ** GOTO lbl53
                    }
                    catch (RuntimeException v7) {
                        throw m44.a("h", (Object)v7, (long)-8161612683911640197L, (long)var2_2);
                    }
                    m44.a("t", (Object)this, (ZipEntry)m44.a("w", (Object)m44.a("v", (Object)this, (long)-7999164876965736970L, (long)var2_2), (Object)this.P, (long)-7816037738769960308L, (long)var2_2), (long)-8475816678328655664L, (long)var2_2);
                }
                catch (RuntimeException v8) {
                    throw m44.a("h", (Object)v8, (long)-8161612683911640197L, (long)var2_2);
                }
lbl53:
                // 2 sources

                v3 = this;
lbl54:
                // 2 sources

                var7_6 = m44.a("w", (Object)m44.a("v", (Object)v3, (long)-7999164876965736970L, (long)var2_2), (Object)m44.a("v", (Object)this, (long)-8475816678328655664L, (long)var2_2), (long)-8492293746394157075L, (long)var2_2);
                try {
                    v9 = var4_3;
                    v10 = var5_4;
                    if (var2_2 <= 0L) ** GOTO lbl67
                    if (v10 == false) ** GOTO lbl66
                    if (v9 != null) {
                    }
                    ** GOTO lbl68
                }
                catch (RuntimeException v11) {
                    throw m44.a("h", (Object)v11, (long)-8161612683911640197L, (long)var2_2);
                }
                v9 = var4_3;
lbl66:
                // 2 sources

                v10 = (int)m44.a("w", (Object)m44.a("v", (Object)this, (long)-8475816678328655664L, (long)var2_2), (long)-7668991652269326692L, (long)var2_2);
lbl67:
                // 2 sources

                v9.P(v10);
lbl68:
                // 2 sources

                return var7_6;
            }
        }
        throw new RuntimeException((String)gs.a("j", (int)2603, (long)(426135936141159961L ^ var2_2)) + (int)m44.a("v", (Object)this, (long)-8086055575516141876L, (long)var2_2) + (String)gs.a("j", (int)14424, (long)(5371286327564754025L ^ var2_2)) + this.getClass().getName());
    }

    public gs(String string, int n10, char c10, File file, short s10) {
        block5: {
            Object object;
            gs gs2;
            long l10;
            block4: {
                l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ b;
                CallSite callSite = m44.a("o", (long)9194037298101283911L, (long)l10);
                m44.a("s", (Object)this, (File)file, (long)7290724435613984159L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        m44.a("s", (Object)this, (int)1, (long)9189527849057506947L, (long)l10);
                        gs2 = this;
                        object = m44.a("p", (Object)file, (long)8657171278953350495L, (long)l10);
                        if (callSite2 == false) break block4;
                        gs2.P = object;
                        if (string == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)9147775294452874036L, (long)l10);
                    }
                    gs2 = this;
                    object = string.toLowerCase();
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)9147775294452874036L, (long)l10);
                }
            }
            m44.a("s", (Object)gs2, (String)object, (long)7044814510305586397L, (long)l10);
        }
    }

    public gs(long l10, String string) {
        l10 = b ^ l10;
        m44.a("s", (Object)this, (File)new File(string), (long)-8841214999309335041L, (long)l10);
        m44.a("s", (Object)this, (int)1, (long)-6924381106998987037L, (long)l10);
        this.P = m44.a("p", (Object)m44.a("q", (Object)this, (long)-8841214999309335041L, (long)l10), (long)-7474821327698959041L, (long)l10);
    }

    public String G(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("r", (Object)this, (long)5341091949094766342L, (long)l10);
    }

    public boolean P(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = b ^ l10;
                CallSite callSite = m44.a("k", (long)-1863505791159146981L, (long)l10);
                try {
                    try {
                        object = m44.a("u", (Object)this, (long)-2228223722564532201L, (long)l10);
                        if (callSite != false) break block4;
                        if (object != 2) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("k", (Object)runtimeException, (long)-2276730559929145952L, (long)l10);
                    }
                    object = true;
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("k", (Object)runtimeException, (long)-2276730559929145952L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public String n() {
        return this.P;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        gs.b = prr.a(-2260495865660087087L, 1507839846251246247L, MethodHandles.lookup().lookupClass()).a(189324408166322L);
                        gs.f = new HashMap<K, V>(13);
                        var11 = gs.b ^ 71799307783555L;
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
                        var20_3 = new String[4];
                        var18_4 = 0;
                        var17_5 = "\u00a6\u00a6\u0082\u0016\u00d5\u00e4\u0094\u00ce\u0095\u001e\u00f5\u00b3y\u00ad\u00c0\r \u0081\u008a\u0004yA\u0011d\u0098\u00e5\u00c8\u00df\u00d0r\u00b1\n\u0086\u001aDe\u00bfF\u00f2>vwm\u00d3\u00fa\u001bY\u00ae\u000f";
                        var19_6 = "\u00a6\u00a6\u0082\u0016\u00d5\u00e4\u0094\u00ce\u0095\u001e\u00f5\u00b3y\u00ad\u00c0\r \u0081\u008a\u0004yA\u0011d\u0098\u00e5\u00c8\u00df\u00d0r\u00b1\n\u0086\u001aDe\u00bfF\u00f2>vwm\u00d3\u00fa\u001bY\u00ae\u000f".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = gs.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "?\u008c\u0090B\u009ar\u00f2\u00db\u00b5&9\u00f16\u00c7m\u00fa \u00c0\u00bd\u00f5\u00c9F\u0018AB\u00b0\u00e8\u00b1\u00d5\u00ae\u00dffG\u00bd*\b\u0098\u00ef\u0017\u0010M\u0097\u00fc\u0084\u00d7s\u0095\u00c3\u001c";
                            var19_6 = "?\u008c\u0090B\u009ar\u00f2\u00db\u00b5&9\u00f16\u00c7m\u00fa \u00c0\u00bd\u00f5\u00c9F\u0018AB\u00b0\u00e8\u00b1\u00d5\u00ae\u00dffG\u00bd*\b\u0098\u00ef\u0017\u0010M\u0097\u00fc\u0084\u00d7s\u0095\u00c3\u001c".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = gs.a(var21_9).intern();
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
                gs.c = var20_3;
                gs.d = new String[4];
                gs.j = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\u0093\u00a0*\u00c8V\u00e1\u00ccw*+\u00ec\u0096\u0096\u00ea\u00ae\u009a";
                var5_15 = "\u0093\u00a0*\u00c8V\u00e1\u00ccw*+\u00ec\u0096\u0096\u00ea\u00ae\u009a".length();
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
                    var4_14 = ".\u00f9\u00c5\u00e6\u0083\u00af\u00c5g_s\u00d6\u00e4%&&K";
                    var5_15 = ".\u00f9\u00c5\u00e6\u0083\u00af\u00c5g_s\u00d6\u00e4%&&K".length();
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
        gs.g = var6_12;
        gs.i = new Integer[4];
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7E5E;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/gs", exception);
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
            gs.d[n11] = gs.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = gs.a(n10, l10);
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
            throw new RuntimeException("com/zelix/gs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2DDB;
        if (i[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = g[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/gs", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gs.i[n11] = n12;
        }
        return i[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = gs.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/gs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gs.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(gs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

