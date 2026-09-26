/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.i1;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i9
extends i1 {
    private final int S;
    private int T;
    private final int e;
    private String M;
    private char[] k;
    private ArrayList s;
    private static final long a;
    private static final long[] b;
    private static final Integer[] d;
    private static final Map f;

    final char M(Object[] objectArray) {
        Object object;
        Object object2;
        block4: {
            long l10;
            int n10;
            block5: {
                n10 = (Integer)objectArray[0];
                l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("o", (long)-9021179717075475838L, (long)l10);
                try {
                    try {
                        object2 = n10;
                        object = i9.a("e", (int)14090, (long)(0x6FDDFFF5E1655CD9L ^ l10));
                        if (callSite != null) break block4;
                        if (object2 > object) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-8981218795198964226L, (long)l10);
                    }
                    return (char)(i9.a("e", (int)3747, (long)(0x721D225A0E576576L ^ l10)) + n10);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-8981218795198964226L, (long)l10);
                }
            }
            object2 = i9.a("e", (int)9148, (long)(0x59B1E2F9763C4864L ^ l10));
            object = n10;
        }
        return (char)(object2 + object);
    }

    public i9(int n10, int n11, byte by2, int n12) {
        long l10 = ((long)n10 << 32 | (long)n11 << 40 >>> 32 | (long)by2 << 56 >>> 56) ^ a;
        long l11 = l10 ^ 0x7562B6AD50BCL;
        this(l11, n12, null);
    }

    public final String L(Object[] objectArray) {
        CallSite callSite;
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x7E4620A0DF67L;
        CallSite callSite2 = null;
        CallSite callSite3 = m44.a("i", (long)-6275744256548812636L, (long)l10);
        block0: while (true) {
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l11;
            objectArray2[0] = n10;
            callSite = callSite2 = m44.a("v", (Object)this, (Object)objectArray2, (long)-5846391626530437220L, (long)l10);
            do {
                if (callSite == null) continue block0;
                callSite = callSite2;
            } while (callSite3 != null);
            break;
        }
        return callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final char v(Object[] var1_1) {
        block25: {
            block27: {
                block28: {
                    block23: {
                        block26: {
                            block24: {
                                var3_2 = (Long)var1_1[0];
                                var2_3 = (Integer)var1_1[1];
                                var3_2 = i9.a ^ var3_2;
                                var5_4 = m44.a("o", (long)3735206913128420250L, (long)var3_2);
                                try {
                                    try {
                                        try {
                                            v0 = m44.a("q", (Object)this, (long)3929268244421167081L, (long)var3_2);
                                            if (var5_4 != null) break block23;
                                            if (v0 == '\u0000') {
                                            }
                                            ** GOTO lbl65
                                        }
                                        catch (n9 v1) {
                                            throw m44.a("o", (Object)v1, (long)3622027856500042982L, (long)var3_2);
                                        }
                                        v2 = var2_3;
                                        v3 /* !! */  = i9.a("e", (int)9112, (long)(5051868008019065179L ^ var3_2));
                                        v4 = var5_4;
                                        if (var3_2 > 0L) {
                                            if (v4 != null) break block24;
                                        }
                                        ** GOTO lbl43
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("o", (Object)v5, (long)3622027856500042982L, (long)var3_2);
                                    }
                                    if (v2 <= v3 /* !! */ ) {
                                    }
                                    ** GOTO lbl35
                                }
                                catch (n9 v6) {
                                    throw m44.a("o", (Object)v6, (long)3622027856500042982L, (long)var3_2);
                                }
                                v2 = (char)(i9.a("e", (int)28658, (long)(4709409200634311996L ^ var3_2)) + var2_3);
                                if (var3_2 < 0L) ** GOTO lbl36
                                var6_5 /* !! */  = (CallSite)v2;
                                try {
                                    if (var5_4 == null) break block25;
lbl35:
                                    // 2 sources

                                    v2 = var2_3;
lbl36:
                                    // 2 sources

                                    v3 /* !! */  = i9.a("e", (int)7966, (long)(9191485322603939295L ^ var3_2));
                                }
                                catch (n9 v7) {
                                    throw m44.a("o", (Object)v7, (long)3622027856500042982L, (long)var3_2);
                                }
                            }
                            try {
                                v4 = var5_4;
lbl43:
                                // 2 sources

                                if (v4 != null) break block26;
                                if (v2 <= v3 /* !! */ ) {
                                }
                                ** GOTO lbl54
                            }
                            catch (n9 v8) {
                                throw m44.a("o", (Object)v8, (long)3622027856500042982L, (long)var3_2);
                            }
                            v2 = (char)(i9.a("e", (int)7704, (long)(7405609086150853850L ^ var3_2)) + var2_3);
                            if (var3_2 < 0L) ** GOTO lbl55
                            var6_5 /* !! */  = (CallSite)v2;
                            try {
                                if (var5_4 == null) break block25;
lbl54:
                                // 2 sources

                                v2 = var2_3;
lbl55:
                                // 2 sources

                                v3 /* !! */  = (CallSite)4;
                            }
                            catch (n9 v9) {
                                throw m44.a("o", (Object)v9, (long)3622027856500042982L, (long)var3_2);
                            }
                        }
                        v0 = (char)(v2 - v3 /* !! */ );
                        if (var3_2 < 0L) break block23;
                        var6_5 /* !! */  = (CallSite)v0;
                        try {
                            if (var5_4 == null) break block25;
lbl65:
                            // 2 sources

                            v0 = (char)var2_3;
                        }
                        catch (n9 v10) {
                            throw m44.a("o", (Object)v10, (long)3622027856500042982L, (long)var3_2);
                        }
                    }
                    try {
                        if (var3_2 <= 0L) break block27;
                        v11 /* !! */  = i9.a("e", (int)14090, (long)(8060798777960623553L ^ var3_2));
                        if (var5_4 != null) break block28;
                        if (v0 <= v11 /* !! */ ) {
                        }
                        ** GOTO lbl84
                    }
                    catch (n9 v12) {
                        throw m44.a("o", (Object)v12, (long)3622027856500042982L, (long)var3_2);
                    }
                    v13 = (char)(i9.a("e", (int)3747, (long)(8222843291491423342L ^ var3_2)) + var2_3);
                    if (var3_2 <= 0L) ** GOTO lbl85
                    var6_5 /* !! */  = (CallSite)v13;
                    try {
                        if (var5_4 == null) break block25;
lbl84:
                        // 2 sources

                        v13 = i9.a("e", (int)26260, (long)(1968434907160394844L ^ var3_2));
lbl85:
                        // 2 sources

                        v11 /* !! */  = (CallSite)var2_3;
                    }
                    catch (n9 v14) {
                        throw m44.a("o", (Object)v14, (long)3622027856500042982L, (long)var3_2);
                    }
                }
                v0 = (char)(v13 + v11 /* !! */ );
            }
            var6_5 /* !! */  = v0;
        }
        return (char)var6_5 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    public final String y(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[FORLOOP], 15[DOLOOP]], but top level block is 3[TRYBLOCK]
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

    public i9(long l10, int n10, String string) {
        block8: {
            block6: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("j", (long)-2951206757272668345L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    block7: {
                        try {
                            try {
                                this.s = new ArrayList((int)i9.a("e", (int)15072, (long)(0x4AA2EC4C879504F7L ^ l10)));
                                m44.a("v", (Object)this, (char[])new char[i9.a("e", (int)1432, (long)(0x1D38872902BE3B80L ^ l10))], (long)-3844390126414167026L, (long)l10);
                                m44.a("v", (Object)this, (int)n10, (long)-3289110606066506956L, (long)l10);
                                m44.a("v", (Object)this, (String)string, (long)-3301257160870616794L, (long)l10);
                                if (callSite2 != null) break block6;
                                if (n10 != 0) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)-2983303972789630917L, (long)l10);
                            }
                            this.S = (int)i9.a("e", (int)12518, (long)(0x15323E70BFC90EF4L ^ l10));
                            this.e = (int)i9.a("e", (int)19104, (long)(0x31CBCC7BE1ACF4B1L ^ l10));
                            if (callSite2 == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)-2983303972789630917L, (long)l10);
                        }
                    }
                    this.S = (int)i9.a("e", (int)900, (long)(0x27B6CD469D73BD90L ^ l10));
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)n94, (long)-2983303972789630917L, (long)l10);
                }
            }
            this.e = (int)i9.a("e", (int)11546, (long)(0x46665316EB141303L ^ l10));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                i9.a = prr.a(-9142612437613584324L, -3227785121813203858L, MethodHandles.lookup().lookupClass()).a(64636247772085L);
                i9.f = new HashMap<K, V>(13);
                var0 = i9.a ^ 53881288945957L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[14];
                var5_4 = 0;
                var6_5 = "\u00edp\u0098\u00b5\u00a9>\u00fcGg\u00dc.T~z\u00ab\u0000%t\u00edDG\r\u00fa\u0004\b\u00e12\u00c4\u00d2\n\u0084b\u00bc\u00a8\u00a6\u00e4ZZ\u00eb:$\u00d1\u0094\u008e\u00db\u000f\u00fd\u0018\u00b2Z\u00db\u00b2Cy\u0010\u00bb\u00e8\u00ed\u00c2\u00145\u00eay\u00ac\u0004\u0011y\u00e1\t\u00b5\u001f\u009a\u00dc\u00cf\u001a\u001e@\u00dc\u00e2\u00f5b\u0099\u0088\u00ae\u000b\u0091\u00c1\u00b1\u00d9l@\u00a6\u008b\u0017\u00d7\u0001";
                var7_6 = "\u00edp\u0098\u00b5\u00a9>\u00fcGg\u00dc.T~z\u00ab\u0000%t\u00edDG\r\u00fa\u0004\b\u00e12\u00c4\u00d2\n\u0084b\u00bc\u00a8\u00a6\u00e4ZZ\u00eb:$\u00d1\u0094\u008e\u00db\u000f\u00fd\u0018\u00b2Z\u00db\u00b2Cy\u0010\u00bb\u00e8\u00ed\u00c2\u00145\u00eay\u00ac\u0004\u0011y\u00e1\t\u00b5\u001f\u009a\u00dc\u00cf\u001a\u001e@\u00dc\u00e2\u00f5b\u0099\u0088\u00ae\u000b\u0091\u00c1\u00b1\u00d9l@\u00a6\u008b\u0017\u00d7\u0001".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0086W\u008d\u00a1s\u00a5\u00cf\t9\u0002n\u001c!\u0004+T";
                    var7_6 = "\u0086W\u008d\u00a1s\u00a5\u00cf\t9\u0002n\u001c!\u0004+T".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        i9.b = var8_3;
        i9.d = new Integer[14];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6211;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/i9", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            i9.d[n11] = n12;
        }
        return d[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = i9.a(n10, l10);
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
            throw new RuntimeException("com/zelix/i9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(i9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

