/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._fp;
import com.zelix._s8;
import com.zelix.ax;
import com.zelix.ess;
import com.zelix.x44;
import com.zelix.yg;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class de
implements _fp {
    private ax Q;
    private HashSet p;
    final yg K;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    @Override
    public boolean t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        int n4 = (Integer)objectArray[3];
        long l2 = l;
        long l3 = l2 ^ 0x65C71B549EC7L;
        long l4 = l2 ^ 0x416E582DE591L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = yg.v.R(n4, l3);
        objectArray2[2] = l4;
        objectArray2[1] = yg.v.R(n3, l3);
        objectArray2[0] = yg.v.R(n2, l3);
        CallSite callSite = x44.a("k", (Object)x44.a("o", (Object)this, (long)-5792561780490475373L, (long)l), (Object)objectArray2, (long)-5724660625544819206L, (long)l);
        return (boolean)callSite;
    }

    public HashSet b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return x44.a("j", (Object)this, (long)-3220282013852040366L, (long)l);
    }

    @Override
    public _fp T(Object[] objectArray) {
        long l = (Long)objectArray[0];
        yg yg2 = (yg)objectArray[1];
        long l2 = l ^ 0x7F95C74261C0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return x44.a("l", (Object)yg2, (Object)objectArray2, (long)6590585222015026787L, (long)l);
    }

    @Override
    public void V(Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        int n3 = (Integer)objectArray[1];
        int n4 = (Integer)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l;
        long l3 = l2 ^ 0x7B55D7E7CEDAL;
        long l4 = l2 ^ 0xCF090982EB7L;
        ((ax)((Object)x44.a("j", (Object)this, (long)-35552352221054834L, (long)l))).b(l4, yg.v.R(n2, l3), yg.v.R(n3, l3), yg.v.R(n4, l3));
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean r(Object[] var1_1) {
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    de(long l, yg yg2) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x3BB8C4AD39A8L;
        long l4 = l2 ^ 0x10712DD99C1BL;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 48);
        int n4 = (int)(l4 << 32 >>> 32);
        this.K = yg2;
        x44.a("q", (Object)this, (ax)new ax(5, (int)de.b("j", (int)32000, (long)(0x1BD16FECD682AAAEL ^ l)), (char)n2, (int)de.b("j", (int)960, (long)(0x6BD2F5DC8863D46BL ^ l)), (short)n3, n4), (long)-8183700073628415646L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = (int)de.b("j", (int)30034, (long)(0x452156BE0B21A2FFL ^ l));
        objectArray[0] = l3;
        x44.a("q", (Object)this, (HashSet)((Object)x44.a("r", (Object)objectArray, (long)-8411183416176145839L, (long)l)), (long)-8434349950472004882L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        de.a = ess.a(4825638943453791472L, 925740069321269426L, MethodHandles.lookup().lookupClass()).a(162132719294899L);
                        de.d = new HashMap<K, V>(13);
                        var11 = de.a ^ 131944231196341L;
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
                        var20_3 = new String[10];
                        var18_4 = 0;
                        var17_5 = "x\u0007\u00a6G\u00aa\u00cc\u00b0F&tu\u00ecW\u0085xAU\u008d\u00c0\u00af$\u0081~N\u00cb?\u0096\u00bd\u00c5\u00b9H$\u00b7z\u00ee\u009c\u0012\u0092\u00e2\u00d5\u00f7^z\u00ad<\u00e4\ra(-\u00efZp\u00c6\u00bc\u0000\u00da\u00f9t\u00c8\u00ae\u00f7\u000f\u0010k\u00fc\u0016\u0012\u0099\u00a5gN\u0001H\u00dc]\u008dX\u001f\u0090,\u00c7\u00c0\u00eb\u00a9\u00e1{+\u00cf\u0010\u009e\\5\u00dd\u00e0\u0084\u000f\u0096]0\u008a=<\u009e\u0096a ,k\u0084\u001cA4\u00f2N\u0019~\u0014\u00eb]\u00dc\u00c9\u00eb\u00be^\u00e1\u00c77\u00d45[=I\u0010\u0000j\u00943\u00dd(=\u0005p\u0082\u00df\u001a\u00e8\u00f3\\2\u00e2\u00e7-dV\u0099\u0091<\u00ecUK\u00e0\u009aqf\r\u00ecX\u00feS\u00ae\u000f\u00f2B\u009c\u001a\u00aa\u0012\u00d4\u0018(\u00d5\u00d9\t=\u0092\u0014\u00b1\u001a_U\u00d4\u009a\u0084\u00e3ZE\u00cd\u001c\u00cc\u0005\u00a9\u00cc\u00b0\u0088\u0005^\u00c5\u0002o\u00bcv\u00d0wk\u00f9\u008f\u00a8\u00df\u00de\u00a9(m(WF\u0001}\u00c69\\\u00df\u0011)\u00bd\u0004\u00037\u00b2\u001f\"2\u00a4\u00ea\u00b3\u0082J\u00eb\u0096\u008b\u00902f\u00ef9\u0092\u00d0)\u0082\u009b\u00e5\u0086(P\u00b0R \u00bf\u00d3\u00ff\u00921\u001f\u00a3X\u0015\u0095\u00d4\u00bc\u0084Jv\u00afT?\u0015\u00da\u00d0\u0093\u0006\u00a3x\u00a5\u00a45\u00be\u0018\u0003/\tr\u001f\u00ae";
                        var19_6 = "x\u0007\u00a6G\u00aa\u00cc\u00b0F&tu\u00ecW\u0085xAU\u008d\u00c0\u00af$\u0081~N\u00cb?\u0096\u00bd\u00c5\u00b9H$\u00b7z\u00ee\u009c\u0012\u0092\u00e2\u00d5\u00f7^z\u00ad<\u00e4\ra(-\u00efZp\u00c6\u00bc\u0000\u00da\u00f9t\u00c8\u00ae\u00f7\u000f\u0010k\u00fc\u0016\u0012\u0099\u00a5gN\u0001H\u00dc]\u008dX\u001f\u0090,\u00c7\u00c0\u00eb\u00a9\u00e1{+\u00cf\u0010\u009e\\5\u00dd\u00e0\u0084\u000f\u0096]0\u008a=<\u009e\u0096a ,k\u0084\u001cA4\u00f2N\u0019~\u0014\u00eb]\u00dc\u00c9\u00eb\u00be^\u00e1\u00c77\u00d45[=I\u0010\u0000j\u00943\u00dd(=\u0005p\u0082\u00df\u001a\u00e8\u00f3\\2\u00e2\u00e7-dV\u0099\u0091<\u00ecUK\u00e0\u009aqf\r\u00ecX\u00feS\u00ae\u000f\u00f2B\u009c\u001a\u00aa\u0012\u00d4\u0018(\u00d5\u00d9\t=\u0092\u0014\u00b1\u001a_U\u00d4\u009a\u0084\u00e3ZE\u00cd\u001c\u00cc\u0005\u00a9\u00cc\u00b0\u0088\u0005^\u00c5\u0002o\u00bcv\u00d0wk\u00f9\u008f\u00a8\u00df\u00de\u00a9(m(WF\u0001}\u00c69\\\u00df\u0011)\u00bd\u0004\u00037\u00b2\u001f\"2\u00a4\u00ea\u00b3\u0082J\u00eb\u0096\u008b\u00902f\u00ef9\u0092\u00d0)\u0082\u009b\u00e5\u0086(P\u00b0R \u00bf\u00d3\u00ff\u00921\u001f\u00a3X\u0015\u0095\u00d4\u00bc\u0084Jv\u00afT?\u0015\u00da\u00d0\u0093\u0006\u00a3x\u00a5\u00a45\u00be\u0018\u0003/\tr\u001f\u00ae".length();
                        var16_7 = 48;
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
                            var20_3[var18_4++] = de.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00dcEP\u009e\u00e8J,\u00f2\u00016\n{\u00f0*zy\u0095r\u00c9\u001c\u0004\u0003Q|xY\u001cK\u0016\u00ec{O\u00d7\u00fdW\u0099:\u00f1q\u00c1 \u0096U^I\u008c\u0099\\\u00e4\u00be\u00eaB\u00a5\u00d8\u00ce\u0019,@PW\u00d77\b\u0003\u0090\u00199\u0012QT\u00e4*\u0000";
                            var19_6 = "\u00dcEP\u009e\u00e8J,\u00f2\u00016\n{\u00f0*zy\u0095r\u00c9\u001c\u0004\u0003Q|xY\u001cK\u0016\u00ec{O\u00d7\u00fdW\u0099:\u00f1q\u00c1 \u0096U^I\u008c\u0099\\\u00e4\u00be\u00eaB\u00a5\u00d8\u00ce\u0019,@PW\u00d77\b\u0003\u0090\u00199\u0012QT\u00e4*\u0000".length();
                            var16_7 = 40;
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
                            var20_3[var18_4++] = de.a(var21_9).intern();
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
                de.b = var20_3;
                de.c = new String[10];
                de.g = new HashMap<K, V>(13);
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
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u00b4\u00aa\\\u00b1\u00e5\u00f6\u00aa\u00db=\u000eT\u009d\u0099\u00ee\u00c3\u00b6\u0099\u00f0r\u0096]6\u00c1G";
                var5_15 = "\u00b4\u00aa\\\u00b1\u00e5\u00f6\u00aa\u00db=\u000eT\u009d\u0099\u00ee\u00c3\u00b6\u0099\u00f0r\u0096]6\u00c1G".length();
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
                    var4_14 = "c\u00c1\u008cn\u00c4Hl(\u00b66\u00b0J\u0096\f\u0097(";
                    var5_15 = "c\u00c1\u008cn\u00c4Hl(\u00b66\u00b0J\u0096\f\u0097(".length();
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
        de.e = var6_12;
        de.f = new Integer[5];
    }

    private static _s8 a(_s8 _s82) {
        return _s82;
    }

    private static String a(byte[] byArray) {
        int n2 = 0;
        int n3 = byArray.length;
        char[] cArray = new char[n3];
        for (int i = 0; i < n3; ++i) {
            char c;
            int n4 = 0xFF & byArray[i];
            if (n4 < 192) {
                cArray[n2++] = (char)n4;
                continue;
            }
            if (n4 < 224) {
                c = (char)((char)(n4 & 0x1F) << 6);
                n4 = byArray[++i];
                c = (char)(c | (char)(n4 & 0x3F));
                cArray[n2++] = c;
                continue;
            }
            if (i >= n3 - 2) continue;
            c = (char)((char)(n4 & 0xF) << 12);
            n4 = byArray[++i];
            c = (char)(c | (char)(n4 & 0x3F) << 6);
            n4 = byArray[++i];
            c = (char)(c | (char)(n4 & 0x3F));
            cArray[n2++] = c;
        }
        return new String(cArray, 0, n2);
    }

    private static String a(int n2, long l) {
        int n3 = n2 ^ (int)(l & 0x7FFFL) ^ 0x44DA;
        if (c[n3] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/de", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n3].getBytes("ISO-8859-1");
            de.c[n3] = de.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n3];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = de.a(n2, l);
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
            throw new RuntimeException("com/zelix/de" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n2, long l) {
        int n3 = n2 ^ (int)(l & 0x7FFFL) ^ 0x48EE;
        if (f[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/de", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            de.f[n3] = n4;
        }
        return f[n3];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n3 = de.b(n2, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n3;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/de" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(de.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(de.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
