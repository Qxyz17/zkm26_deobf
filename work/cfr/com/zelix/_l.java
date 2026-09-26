/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
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

public class _l {
    private Object Q;
    private Object s;
    private Object G;
    private static final long a = prr.a(-8367576515552489631L, 8372671740413525149L, MethodHandles.lookup().lookupClass()).a(188293337470509L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public Object u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        l10 = a ^ l10;
        CallSite callSite = m44.a("s", (Object)this, (long)1111721965784930794L, (long)l10);
        m44.a("q", (Object)this, (Object)object, (long)1111721965784930794L, (long)l10);
        return callSite;
    }

    /*
     * Exception decompiling
     */
    public Object r(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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
    public Object M(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[CASE]], but top level block is 0[TRYBLOCK]
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
    public boolean equals(Object var1_1) {
        block62: {
            block63: {
                block80: {
                    block68: {
                        block77: {
                            block79: {
                                block78: {
                                    block75: {
                                        block72: {
                                            block74: {
                                                block73: {
                                                    block70: {
                                                        block66: {
                                                            block69: {
                                                                block67: {
                                                                    block64: {
                                                                        var2_2 = _l.a ^ 123403637583378L;
                                                                        var4_3 = m44.a("n", (long)4591501804736225678L, (long)var2_2);
                                                                        try {
                                                                            v0 = var1_1 instanceof _l;
                                                                            if (var4_3 != null) break block62;
                                                                            if (!v0) break block63;
                                                                        }
                                                                        catch (IllegalArgumentException v1) {
                                                                            throw m44.a("n", (Object)v1, (long)4063010515947553402L, (long)var2_2);
                                                                        }
                                                                        var5_4 = (_l)var1_1;
                                                                        try {
                                                                            block65: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v2 = m44.a("p", (Object)this, (long)2851669256903294556L, (long)var2_2);
                                                                                            if (var4_3 != null) break block64;
                                                                                            if (v2 != null) break block65;
                                                                                        }
                                                                                        catch (IllegalArgumentException v3) {
                                                                                            throw m44.a("n", (Object)v3, (long)4063010515947553402L, (long)var2_2);
                                                                                        }
                                                                                        v2 = m44.a("p", (Object)var5_4, (long)2851669256903294556L, (long)var2_2);
                                                                                        if (var4_3 != null) break block66;
                                                                                    }
                                                                                    catch (IllegalArgumentException v4) {
                                                                                        throw m44.a("n", (Object)v4, (long)4063010515947553402L, (long)var2_2);
                                                                                    }
                                                                                    if (v2 != null) {
                                                                                    }
                                                                                    ** GOTO lbl68
                                                                                }
                                                                                catch (IllegalArgumentException v5) {
                                                                                    throw m44.a("n", (Object)v5, (long)4063010515947553402L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            v2 = m44.a("p", (Object)this, (long)2851669256903294556L, (long)var2_2);
                                                                        }
                                                                        catch (IllegalArgumentException v6) {
                                                                            throw m44.a("n", (Object)v6, (long)4063010515947553402L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var4_3 != null) break block67;
                                                                            if (v2 == null) break block68;
                                                                        }
                                                                        catch (IllegalArgumentException v7) {
                                                                            throw m44.a("n", (Object)v7, (long)4063010515947553402L, (long)var2_2);
                                                                        }
                                                                        v2 = m44.a("p", (Object)var5_4, (long)2851669256903294556L, (long)var2_2);
                                                                    }
                                                                    catch (IllegalArgumentException v8) {
                                                                        throw m44.a("n", (Object)v8, (long)4063010515947553402L, (long)var2_2);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var4_3 != null) break block69;
                                                                        if (v2 == null) break block68;
                                                                    }
                                                                    catch (IllegalArgumentException v9) {
                                                                        throw m44.a("n", (Object)v9, (long)4063010515947553402L, (long)var2_2);
                                                                    }
                                                                    v2 = m44.a("p", (Object)this, (long)2851669256903294556L, (long)var2_2);
                                                                }
                                                                catch (IllegalArgumentException v10) {
                                                                    throw m44.a("n", (Object)v10, (long)4063010515947553402L, (long)var2_2);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var4_3 != null) break block66;
                                                                    if (!v2.equals(m44.a("p", (Object)var5_4, (long)2851669256903294556L, (long)var2_2))) break block68;
                                                                }
                                                                catch (IllegalArgumentException v11) {
                                                                    throw m44.a("n", (Object)v11, (long)4063010515947553402L, (long)var2_2);
                                                                }
lbl68:
                                                                // 2 sources

                                                                v2 = m44.a("p", (Object)this, (long)2566707031701927193L, (long)var2_2);
                                                            }
                                                            catch (IllegalArgumentException v12) {
                                                                throw m44.a("n", (Object)v12, (long)4063010515947553402L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            block71: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var4_3 != null) break block70;
                                                                            if (v2 != null) break block71;
                                                                        }
                                                                        catch (IllegalArgumentException v13) {
                                                                            throw m44.a("n", (Object)v13, (long)4063010515947553402L, (long)var2_2);
                                                                        }
                                                                        v2 = m44.a("p", (Object)var5_4, (long)2566707031701927193L, (long)var2_2);
                                                                        if (var4_3 != null) break block72;
                                                                    }
                                                                    catch (IllegalArgumentException v14) {
                                                                        throw m44.a("n", (Object)v14, (long)4063010515947553402L, (long)var2_2);
                                                                    }
                                                                    if (v2 != null) {
                                                                    }
                                                                    ** GOTO lbl129
                                                                }
                                                                catch (IllegalArgumentException v15) {
                                                                    throw m44.a("n", (Object)v15, (long)4063010515947553402L, (long)var2_2);
                                                                }
                                                            }
                                                            v2 = m44.a("p", (Object)this, (long)2566707031701927193L, (long)var2_2);
                                                        }
                                                        catch (IllegalArgumentException v16) {
                                                            throw m44.a("n", (Object)v16, (long)4063010515947553402L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var4_3 != null) break block73;
                                                            if (v2 == null) break block68;
                                                        }
                                                        catch (IllegalArgumentException v17) {
                                                            throw m44.a("n", (Object)v17, (long)4063010515947553402L, (long)var2_2);
                                                        }
                                                        v2 = m44.a("p", (Object)var5_4, (long)2566707031701927193L, (long)var2_2);
                                                    }
                                                    catch (IllegalArgumentException v18) {
                                                        throw m44.a("n", (Object)v18, (long)4063010515947553402L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var4_3 != null) break block74;
                                                        if (v2 == null) break block68;
                                                    }
                                                    catch (IllegalArgumentException v19) {
                                                        throw m44.a("n", (Object)v19, (long)4063010515947553402L, (long)var2_2);
                                                    }
                                                    v2 = m44.a("p", (Object)this, (long)2566707031701927193L, (long)var2_2);
                                                }
                                                catch (IllegalArgumentException v20) {
                                                    throw m44.a("n", (Object)v20, (long)4063010515947553402L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var4_3 != null) break block72;
                                                    if (!v2.equals(m44.a("p", (Object)var5_4, (long)2566707031701927193L, (long)var2_2))) break block68;
                                                }
                                                catch (IllegalArgumentException v21) {
                                                    throw m44.a("n", (Object)v21, (long)4063010515947553402L, (long)var2_2);
                                                }
lbl129:
                                                // 2 sources

                                                v2 = m44.a("p", (Object)this, (long)2831523569801786094L, (long)var2_2);
                                            }
                                            catch (IllegalArgumentException v22) {
                                                throw m44.a("n", (Object)v22, (long)4063010515947553402L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            block76: {
                                                try {
                                                    try {
                                                        try {
                                                            if (var4_3 != null) break block75;
                                                            if (v2 != null) break block76;
                                                        }
                                                        catch (IllegalArgumentException v23) {
                                                            throw m44.a("n", (Object)v23, (long)4063010515947553402L, (long)var2_2);
                                                        }
                                                        v2 = m44.a("p", (Object)var5_4, (long)2831523569801786094L, (long)var2_2);
                                                        if (var4_3 != null) break block75;
                                                    }
                                                    catch (IllegalArgumentException v24) {
                                                        throw m44.a("n", (Object)v24, (long)4063010515947553402L, (long)var2_2);
                                                    }
                                                    if (v2 == null) break block77;
                                                }
                                                catch (IllegalArgumentException v25) {
                                                    throw m44.a("n", (Object)v25, (long)4063010515947553402L, (long)var2_2);
                                                }
                                            }
                                            v2 = m44.a("p", (Object)this, (long)2831523569801786094L, (long)var2_2);
                                        }
                                        catch (IllegalArgumentException v26) {
                                            throw m44.a("n", (Object)v26, (long)4063010515947553402L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var4_3 != null) break block78;
                                            if (v2 == null) break block68;
                                        }
                                        catch (IllegalArgumentException v27) {
                                            throw m44.a("n", (Object)v27, (long)4063010515947553402L, (long)var2_2);
                                        }
                                        v2 = m44.a("p", (Object)var5_4, (long)2831523569801786094L, (long)var2_2);
                                    }
                                    catch (IllegalArgumentException v28) {
                                        throw m44.a("n", (Object)v28, (long)4063010515947553402L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        if (var4_3 != null) break block79;
                                        if (v2 == null) break block68;
                                    }
                                    catch (IllegalArgumentException v29) {
                                        throw m44.a("n", (Object)v29, (long)4063010515947553402L, (long)var2_2);
                                    }
                                    v2 = m44.a("p", (Object)this, (long)2831523569801786094L, (long)var2_2);
                                }
                                catch (IllegalArgumentException v30) {
                                    throw m44.a("n", (Object)v30, (long)4063010515947553402L, (long)var2_2);
                                }
                            }
                            try {
                                v31 = v2.equals(m44.a("p", (Object)var5_4, (long)2831523569801786094L, (long)var2_2));
                                if (var4_3 != null) break block80;
                                if (!v31) break block68;
                            }
                            catch (IllegalArgumentException v32) {
                                throw m44.a("n", (Object)v32, (long)4063010515947553402L, (long)var2_2);
                            }
                        }
                        v31 = true;
                        break block80;
                    }
                    v31 = false;
                }
                var6_5 = v31;
                return var6_5;
            }
            v0 = false;
        }
        return v0;
    }

    public Object E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("u", (Object)this, (long)-7379565955812176845L, (long)l10);
    }

    public Object G(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        CallSite callSite = m44.a("v", (Object)this, (long)-5242834362121985384L, (long)l10);
        m44.a("t", (Object)this, (Object)object, (long)-5242834362121985384L, (long)l10);
        return callSite;
    }

    public int hashCode() {
        CallSite callSite;
        int n10;
        long l10;
        block7: {
            block8: {
                CallSite callSite2;
                block5: {
                    block6: {
                        l10 = a ^ 0x5D6D346C6BC9L;
                        n10 = 0;
                        callSite2 = m44.a("m", (long)4207320558092231765L, (long)l10);
                        try {
                            callSite = m44.a("s", (Object)this, (long)2470232390745226119L, (long)l10);
                            if (callSite2 != null) break block5;
                            if (callSite == null) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("m", (Object)illegalArgumentException, (long)4447757461304903585L, (long)l10);
                        }
                        n10 ^= m44.a("s", (Object)this, (long)2470232390745226119L, (long)l10).hashCode();
                    }
                    callSite = m44.a("s", (Object)this, (long)2757868883774812354L, (long)l10);
                }
                try {
                    if (callSite2 != null) break block7;
                    if (callSite == null) break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)4447757461304903585L, (long)l10);
                }
                n10 ^= m44.a("s", (Object)this, (long)2757868883774812354L, (long)l10).hashCode();
            }
            callSite = m44.a("s", (Object)this, (long)2490696195475339061L, (long)l10);
        }
        if (callSite != null) {
            n10 ^= m44.a("s", (Object)this, (long)2490696195475339061L, (long)l10).hashCode();
        }
        return n10;
    }

    public _l(int n10, short s10, Object object, int n11, Object object2, Object object3) {
        long l10 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)n11 << 48 >>> 48) ^ a;
        m44.a("r", (Object)this, (Object)object, (long)4310826243723584028L, (long)l10);
        m44.a("r", (Object)this, (Object)object2, (long)4602342127292852569L, (long)l10);
        m44.a("r", (Object)this, (Object)object3, (long)4254665912023674542L, (long)l10);
    }

    public Object t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)5715098924206855839L, (long)l10);
    }

    public Object C(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)6554319857265364082L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x593BE262A564L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "'\u00fe\u00f9\u00d6\u00af\u0095$M\u00e5Z\u00e8hw\u00cfV\u0090\u00fd\u00a8\u009f\u00e4i9\u0017\u009eq\bO\u00fd'#\u0087#\u0011\u00d2\u001c\u00d0\u0007\u00c0{\u00ec\u0018\u00bc~\u0096\u00c6\u0098\u00fb,8Q\u00e4T40h\u001a&\u00ba\b\u00bc4RB\u00a3\u00b2\f-\u00e9!\u00f5\u00a5\u00c0)P?}\u00f1\u001a\u009eRP#\u00e7\u00c5e\u008e\u00be\u00ac\u00e1\u0015^\u008b\u00ee=\u00d0~\u00ea:\u0083\u00e8 \u00a4\u00d3\u0092\u00ce?8$\u00e3\u0084\u00b5\u0092\u0080\u00bak\u00a9\u0082\u0016\r\u00d2\u008e\u00fbtG1\u00f7_\u00fe\u00ea\u00e44Pr\u0010\u0005\u00bf2n\u00cfy\u00c5\u00d4u\u00b3\u00f6l\u0014B\u00f1\u00c7\u00e2-\u00ab\u000e\u0018\u00a9\u00a9\u00c0\u0087\u00c3\u009d";
        int n11 = "'\u00fe\u00f9\u00d6\u00af\u0095$M\u00e5Z\u00e8hw\u00cfV\u0090\u00fd\u00a8\u009f\u00e4i9\u0017\u009eq\bO\u00fd'#\u0087#\u0011\u00d2\u001c\u00d0\u0007\u00c0{\u00ec\u0018\u00bc~\u0096\u00c6\u0098\u00fb,8Q\u00e4T40h\u001a&\u00ba\b\u00bc4RB\u00a3\u00b2\f-\u00e9!\u00f5\u00a5\u00c0)P?}\u00f1\u001a\u009eRP#\u00e7\u00c5e\u008e\u00be\u00ac\u00e1\u0015^\u008b\u00ee=\u00d0~\u00ea:\u0083\u00e8 \u00a4\u00d3\u0092\u00ce?8$\u00e3\u0084\u00b5\u0092\u0080\u00bak\u00a9\u0082\u0016\r\u00d2\u008e\u00fbtG1\u00f7_\u00fe\u00ea\u00e44Pr\u0010\u0005\u00bf2n\u00cfy\u00c5\u00d4u\u00b3\u00f6l\u0014B\u00f1\u00c7\u00e2-\u00ab\u000e\u0018\u00a9\u00a9\u00c0\u0087\u00c3\u009d".length();
        int n12 = 80;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = _l.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0xA8B;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_l", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            _l.c[n11] = _l.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = _l.a(n10, l10);
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
            throw new RuntimeException("com/zelix/_l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_l.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

