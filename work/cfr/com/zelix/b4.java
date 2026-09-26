/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._e;
import com.zelix._v;
import com.zelix.b0;
import com.zelix.cf;
import com.zelix.h1;
import com.zelix.hf;
import com.zelix.js;
import com.zelix.kl;
import com.zelix.kw;
import com.zelix.l6i;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.qr;
import com.zelix.w;
import com.zelix.x8;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class b4
extends b0 {
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map j;
    private static final long n;

    public final String I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x544FC9C39851L;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 48);
        int n12 = (int)(l11 << 32 >>> 32);
        return js.E((char)n10, (short)n11, this.V(), n12);
    }

    @Override
    public String M(long l10) {
        long l11 = l10 ^ 0x2D8FFF5F94FCL;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 48);
        int n12 = (int)(l11 << 32 >>> 32);
        return js.E((char)n10, (short)n11, this.B(), n12) + " " + this.m();
    }

    public boolean r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.A.V().equals(b4.b("a", (int)28919, (long)(0x10CE570EFA980737L ^ l10)));
    }

    public final void x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x669A5B4A4A7EL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = bl2;
        objectArray2[0] = l11;
        m44.a("v", (Object)this.E, (Object)objectArray2, (long)2934191560791019226L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    kl D(Object[] var1_1) {
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
    public boolean e() {
        return true;
    }

    @Override
    public String X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10;
        long l12 = l11 ^ 0x415985778101L;
        long l13 = l11 ^ 0x6BC7CC4301C9L;
        int n10 = (int)(l13 >>> 48);
        int n11 = (int)(l13 << 16 >>> 48);
        int n12 = (int)(l13 << 32 >>> 32);
        return js.E((char)n10, (short)n11, this.V(), n12) + " " + this.d(l12);
    }

    public final boolean u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x4E9C8C6D0C5DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("v", (Object)this.E, (Object)objectArray2, (long)9067994461425003792L, (long)l10);
    }

    public final w Z(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x263204015429L;
        return new w(this.d(l11), this.V());
    }

    b4(int n10, _4 _42, int n11, h1 h12, l6q l6q2) {
        long l10 = ((long)n10 << 32 | (long)n11 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x359EF72BAFC7L;
        super(_42, h12, l11, l6q2);
    }

    /*
     * Unable to fully structure code
     */
    b4(_v var1_1, x8 var2_2, long var3_3, x8 var5_4, kw[] var6_5, int var7_6) {
        var3_3 = b4.a ^ var3_3;
        v0 = m44.a("n", (long)-5983168373962056257L, (long)var3_3);
        super(var1_1, var2_2, var5_4, var6_5, var7_6);
        var8_7 = v0;
        var9_8 = 0;
        while (var9_8 < var6_5.length) {
            m44.a("q", (Object)var6_5[var9_8], (Object)new Object[]{this}, (long)-5860641209938163554L, (long)var3_3);
            ++var9_8;
lbl9:
            // 2 sources

            ** while (var8_7 == false)
lbl10:
            // 1 sources

        }
lbl11:
        // 2 sources

        if (var3_3 < 0L) ** GOTO lbl9
    }

    @Override
    public final String K(Object[] objectArray) {
        StringBuffer stringBuffer;
        block4: {
            StringBuffer stringBuffer2;
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = l10;
                long l12 = l11 ^ 0x68CC4028FECAL;
                long l13 = l11 ^ 0x1A1F3B9F4C71L;
                long l14 = l11 ^ 0x512C3445CF27L;
                long l15 = l11 ^ 0x4252091C7E02L;
                int n10 = (int)(l15 >>> 48);
                int n11 = (int)(l15 << 16 >>> 48);
                int n12 = (int)(l15 << 32 >>> 32);
                stringBuffer2 = new StringBuffer();
                CallSite callSite = m44.a("m", (long)-5751941952930070172L, (long)l10);
                Enumeration enumeration = this.D(l14);
                block2: while (enumeration.hasMoreElements()) {
                    try {
                        stringBuffer2.append((String)((Object)b4.b("a", (int)25848, (long)(0x637DF4553293EFE2L ^ l10))));
                        m44.a("r", (Object)stringBuffer2, (char)n, (long)-5587499375400100807L, (long)l10);
                        stringBuffer2.append(cf.a((String)enumeration.nextElement()));
                        stringBuffer = stringBuffer2.append(_e.n);
                        if (l10 < 0L) break block4;
                        while (callSite != false) {
                            if (callSite != false) continue block2;
                            if (l10 < 0L) continue;
                            break block2;
                        }
                        break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-5330469630024369354L, (long)l10);
                    }
                }
                stringBuffer2.append((String)((Object)b4.b("a", (int)29706, (long)(0x47890A93C2BAFF11L ^ l10))));
                stringBuffer2.append(this.q(l13));
                stringBuffer2.append(js.E((char)n10, (short)n11, this.V(), n12));
                stringBuffer2.append(" ");
                stringBuffer2.append(this.d(l12));
                stringBuffer2.append(_e.n);
            }
            stringBuffer = stringBuffer2;
        }
        return stringBuffer.toString();
    }

    public final w r(Object[] objectArray) {
        return new w(this.m(), this.B());
    }

    @Override
    public void v(Object[] objectArray) {
        hf hf2 = (hf)objectArray[0];
        qr qr2 = (qr)objectArray[1];
        kw kw2 = (kw)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        PrintWriter printWriter = (PrintWriter)objectArray[4];
        long l10 = (Long)objectArray[5];
    }

    String g(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x6E532675A633L;
        try {
            stringBuilder = new StringBuilder();
            object = this.D(l11) ? b4.b("a", (int)4918, (long)(0x6A692F989DD8D500L ^ l10)) : ":";
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)n92, (long)-348914902794177000L, (long)l10);
        }
        return stringBuilder.append((String)object).append(this.V()).toString();
    }

    b4(_4 _42, h1 h12, l6q l6q2, PrintWriter printWriter, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x15A1187CC594L;
        super(_42, h12, l11, l6q2, printWriter);
    }

    public final l6i R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x39FC1B07C39FL;
        long l13 = l11 ^ 0x759EC6767881L;
        long l14 = l13 >>> 32;
        int n10 = (int)(l13 << 32 >>> 32);
        return new l6i(this.s(l14, n10), this.d(l12), this.V());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    b4.a = prr.a(-470689944785943043L, 5584862863140707764L, MethodHandles.lookup().lookupClass()).a(47354813514418L);
                    b4.j = new HashMap<K, V>(13);
                    var5 = b4.a ^ 104727993867342L;
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
                    var14_3 = new String[4];
                    var12_4 = 0;
                    var11_5 = "\u00de\u00a0\u008dL\u008d\u00f5\u00cd\u00ca\u00dc_\u00f3\u000e\u00a0\u0092\u0006\u00f6k\u000eQ\u0095\u0002\u00b82\u0005^q\u001bV4\u00137\t\u0010\u00fa\u00cd\u00f9\u00da(9\u0018\u00cc\u0089\u00c7,+\u00e6\u00c3\u00ac)";
                    var13_6 = "\u00de\u00a0\u008dL\u008d\u00f5\u00cd\u00ca\u00dc_\u00f3\u000e\u00a0\u0092\u0006\u00f6k\u000eQ\u0095\u0002\u00b82\u0005^q\u001bV4\u00137\t\u0010\u00fa\u00cd\u00f9\u00da(9\u0018\u00cc\u0089\u00c7,+\u00e6\u00c3\u00ac)".length();
                    var10_7 = 32;
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
                        var14_3[var12_4++] = b4.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u0082\u00dcP\u009d\u00ab\u0002\u0092Sh\u0094\u00f9\u000b\u0086\u00ec{^\u0010\u00e1\u0015/Sd\u00cd<\u00ec\u0002y\u00bf\u00eb<4\u000b\u00a3";
                        var13_6 = "\u0082\u00dcP\u009d\u00ab\u0002\u0092Sh\u0094\u00f9\u000b\u0086\u00ec{^\u0010\u00e1\u0015/Sd\u00cd<\u00ec\u0002y\u00bf\u00eb<4\u000b\u00a3".length();
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
                        var14_3[var12_4++] = b4.a(var15_9).intern();
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
            b4.c = var14_3;
            b4.d = new String[4];
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
        var2_12 = -7113956829134380840L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        b4.n = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static n9 d(n9 n92) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x282B;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b4", exception);
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
            b4.d[n11] = b4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = b4.b(n10, l10);
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
            throw new RuntimeException("com/zelix/b4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

