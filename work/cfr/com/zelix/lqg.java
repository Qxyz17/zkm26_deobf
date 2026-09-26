/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.f9;
import com.zelix.fr;
import com.zelix.l;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lqg
implements f9 {
    private Map I;
    final l e;
    private fr r;
    private List T;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    @Override
    public boolean a(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n12 = (Integer)objectArray[3];
        long l11 = l10;
        long l12 = l11 ^ 0x7693A563CFE2L;
        long l13 = l11 ^ 0x18682C435AD3L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l.k.e(l12, n12);
        objectArray2[2] = l.k.e(l12, n11);
        objectArray2[1] = l.k.e(l12, n10);
        objectArray2[0] = l13;
        CallSite callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)-1378269323550186611L, (long)l10), (Object)objectArray2, (long)-1445747650631850568L, (long)l10);
        return (boolean)callSite;
    }

    List v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("u", (Object)this, (long)5683565656720742713L, (long)l10);
    }

    @Override
    public void O(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n12 = (Integer)objectArray[3];
        long l11 = l10;
        long l12 = l11 ^ 0xE9321341F01L;
        long l13 = l11 ^ 0x4CD95943F835L;
        ((fr)((Object)m44.a("u", (Object)this, (long)4340378615518524270L, (long)l10))).T(l13, l.k.e(l12, n10), l.k.e(l12, n11), l.k.e(l12, n12));
    }

    HashSet n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x4CABB15F9EF1L;
        return (HashSet)m44.a("u", (Object)this, (long)-6895163876845674094L, (long)l10).get(l.k.e(l11, n10));
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean B(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [32[DOLOOP]], but top level block is 11[TRYBLOCK]
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

    lqg(l l10, long l11) {
        long l12 = l11 = a ^ l11;
        long l13 = l12 ^ 0x299E25F44529L;
        long l14 = l12 ^ 0x7C8227BED4FDL;
        this.e = l10;
        Object[] objectArray = new Object[1];
        objectArray[0] = l13;
        m44.a("p", (Object)this, (Map)((Object)m44.a("l", (Object)objectArray, (long)-6823608203636980305L, (long)l11)), (long)-6350022828846406083L, (long)l11);
        m44.a("p", (Object)this, new ArrayList(), (long)-4713276667589760690L, (long)l11);
        m44.a("p", (Object)this, (fr)new fr(5, (int)lqg.b("o", (int)3629, (long)(0x538058BC0D13A76L ^ l11)), l14, (int)lqg.b("o", (int)21981, (long)(0x41576ACDF56C6185L ^ l11))), (long)-5016158414498532047L, (long)l11);
    }

    @Override
    public f9 y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l l11 = (l)objectArray[1];
        long l12 = l10 ^ 0x1CF0CB9BBB98L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        return m44.a("w", (Object)l11, (Object)objectArray2, (long)-7887097634067739144L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        lqg.a = prr.a(4978791708528403578L, -7784352343187736490L, MethodHandles.lookup().lookupClass()).a(238717959194554L);
                        lqg.d = new HashMap<K, V>(13);
                        var11 = lqg.a ^ 31923680256426L;
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
                        var17_5 = "\u00f4\u00dc\u00d3\u00e3\u00d2r;~\u00ec\u001b\u00b4U\u0002Cc\u00b4\u00aa\u00bb2\u00ac\f\u00b1y3\u00b7\\\u00de=G\u00be*\u0082\u00cdm\u00e3}\u00cb\u00bby\u00b0\u00bd-\u00d7D\u00b9V\u0091y\u009e\b\u00a0B\u0000\u00e6\u0013\u00c7\u00e7\u00f8\u009fT\\\u00a8\u0084\u00e5\u00bf\u0096\u00e8\u0086\u00f1\u00ffS\u00e0\u0089H\u008f\bD\u00e4jE\u0014\u00b0 \u0005NG\u00fe[P\u00f0&[\u00e4\u0000\u0018M;\u00d3om\u00b5g\u00d2}\u0012t3vN\u0007\tw\u00d8\u00baj'~\u00b8\u00f1\u001d*-\u00a2\\\u0011s\u00a9\u009e\u0095\\c\u0086\u00d0\u00d1~l\u0085\u0086\u001c\u0086k\u0004\u0085\u00ddF\u00fa~\u00e3\u008e\u009d{\u00c9\u00e8\u0098>\u00aaYJ\u0099\u00a70C\u00cc\u0019\u00f13\u00db\u00a2\u00a1";
                        var19_6 = "\u00f4\u00dc\u00d3\u00e3\u00d2r;~\u00ec\u001b\u00b4U\u0002Cc\u00b4\u00aa\u00bb2\u00ac\f\u00b1y3\u00b7\\\u00de=G\u00be*\u0082\u00cdm\u00e3}\u00cb\u00bby\u00b0\u00bd-\u00d7D\u00b9V\u0091y\u009e\b\u00a0B\u0000\u00e6\u0013\u00c7\u00e7\u00f8\u009fT\\\u00a8\u0084\u00e5\u00bf\u0096\u00e8\u0086\u00f1\u00ffS\u00e0\u0089H\u008f\bD\u00e4jE\u0014\u00b0 \u0005NG\u00fe[P\u00f0&[\u00e4\u0000\u0018M;\u00d3om\u00b5g\u00d2}\u0012t3vN\u0007\tw\u00d8\u00baj'~\u00b8\u00f1\u001d*-\u00a2\\\u0011s\u00a9\u009e\u0095\\c\u0086\u00d0\u00d1~l\u0085\u0086\u001c\u0086k\u0004\u0085\u00ddF\u00fa~\u00e3\u008e\u009d{\u00c9\u00e8\u0098>\u00aaYJ\u0099\u00a70C\u00cc\u0019\u00f13\u00db\u00a2\u00a1".length();
                        var16_7 = 88;
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
                            var20_3[var18_4++] = lqg.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0090\u00b6RM\u00b2\u000b\u00b2\u0083\u00e2\u00a8h\u009fld1FF\u00fc\u001b\u00f4l&\u009cPj}m\u00e4\u00d1!l\f\u00a5\u00d2\u00f8\u00a76\u0010{v\u00dd\f\u001e\u00b6\u0013`\u008d%\u00beL\u00bf;\u00d8\u00a4'\u0015\u00b2c\u00ba\u00b8\u00ca\u00b0Swe\u00ae\u00b3C\u00c1\u0016A\u0003D\u00cdOR\u00d6LOBrB/\u0010\u00deJg\u00e7\u0010\u0091\u0098e\u00fc{\u0099\u00a6\u00a3\u00f3\u00faQ\u0014\u00b5!4\u00cf";
                            var19_6 = "\u0090\u00b6RM\u00b2\u000b\u00b2\u0083\u00e2\u00a8h\u009fld1FF\u00fc\u001b\u00f4l&\u009cPj}m\u00e4\u00d1!l\f\u00a5\u00d2\u00f8\u00a76\u0010{v\u00dd\f\u001e\u00b6\u0013`\u008d%\u00beL\u00bf;\u00d8\u00a4'\u0015\u00b2c\u00ba\u00b8\u00ca\u00b0Swe\u00ae\u00b3C\u00c1\u0016A\u0003D\u00cdOR\u00d6LOBrB/\u0010\u00deJg\u00e7\u0010\u0091\u0098e\u00fc{\u0099\u00a6\u00a3\u00f3\u00faQ\u0014\u00b5!4\u00cf".length();
                            var16_7 = 88;
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
                            var20_3[var18_4++] = lqg.a(var21_9).intern();
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
                lqg.b = var20_3;
                lqg.c = new String[4];
                lqg.h = new HashMap<K, V>(13);
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
                var4_14 = "7A^z\u00fa\u00f8C\u00114j\u00a7\u00a0\u00e7\u00f9\u001aP";
                var5_15 = "7A^z\u00fa\u00f8C\u00114j\u00a7\u00a0\u00e7\u00f9\u001aP".length();
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
                    var4_14 = "\u008f\u00c8\u008efP\u00de\u008f1#\u0093\u0015\u0012\u00db\u0016\f\u00c2";
                    var5_15 = "\u008f\u00c8\u008efP\u00de\u008f1#\u0093\u0015\u0012\u00db\u0016\f\u00c2".length();
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
        lqg.f = var6_12;
        lqg.g = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3F7E;
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
                throw new RuntimeException("com/zelix/lqg", exception);
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
            lqg.c[n11] = lqg.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lqg.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lqg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1A31;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqg", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lqg.g[n11] = n12;
        }
        return g[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lqg.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lqg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lqg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lqg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

