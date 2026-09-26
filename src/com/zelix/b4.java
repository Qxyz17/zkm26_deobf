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
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x544FC9C39851L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 48);
        int n3 = (int)(l2 << 32 >>> 32);
        return js.E((char)((char)n), (short)((short)n2), (String)this.V(), (int)n3);
    }

    public String M(long l) {
        long l2 = l ^ 0x2D8FFF5F94FCL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 48);
        int n3 = (int)(l2 << 32 >>> 32);
        return js.E((char)((char)n), (short)((short)n2), (String)this.B(), (int)n3) + " " + this.m();
    }

    public boolean r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return this.A.V().equals(b4.b("a", (int)28919, (long)(0x10CE570EFA980737L ^ l)));
    }

    public final void x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x669A5B4A4A7EL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = bl;
        objectArray2[0] = l2;
        m44.a("v", (Object)this.E, (Object)objectArray2, (long)2934191560791019226L, (long)l);
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

    public boolean e() {
        return true;
    }

    public String X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x415985778101L;
        long l4 = l2 ^ 0x6BC7CC4301C9L;
        int n = (int)(l4 >>> 48);
        int n2 = (int)(l4 << 16 >>> 48);
        int n3 = (int)(l4 << 32 >>> 32);
        return js.E((char)((char)n), (short)((short)n2), (String)this.V(), (int)n3) + " " + this.d(l3);
    }

    public final boolean u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x4E9C8C6D0C5DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (boolean)m44.a("v", (Object)this.E, (Object)objectArray2, (long)9067994461425003792L, (long)l);
    }

    public final w Z(long l) {
        long l2 = (l = a ^ l) ^ 0x263204015429L;
        return new w(this.d(l2), this.V());
    }

    b4(int n, _4 _42, int n2, h1 h12, l6q l6q2) {
        long l = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x359EF72BAFC7L;
        super(_42, h12, l2, l6q2);
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

    public final String K(Object[] objectArray) {
        StringBuffer stringBuffer;
        block4: {
            StringBuffer stringBuffer2;
            block5: {
                long l = (Long)objectArray[0];
                long l2 = l;
                long l3 = l2 ^ 0x68CC4028FECAL;
                long l4 = l2 ^ 0x1A1F3B9F4C71L;
                long l5 = l2 ^ 0x512C3445CF27L;
                long l6 = l2 ^ 0x4252091C7E02L;
                int n = (int)(l6 >>> 48);
                int n2 = (int)(l6 << 16 >>> 48);
                int n3 = (int)(l6 << 32 >>> 32);
                stringBuffer2 = new StringBuffer();
                CallSite callSite = m44.a("m", (long)-5751941952930070172L, (long)l);
                Enumeration enumeration = this.D(l5);
                block2: while (enumeration.hasMoreElements()) {
                    try {
                        stringBuffer2.append((String)((Object)b4.b("a", (int)25848, (long)(0x637DF4553293EFE2L ^ l))));
                        m44.a("r", (Object)stringBuffer2, (char)b4.n, (long)-5587499375400100807L, (long)l);
                        stringBuffer2.append(cf.a((String)((String)enumeration.nextElement())));
                        stringBuffer = stringBuffer2.append(_e.n);
                        if (l < 0L) break block4;
                        while (callSite != false) {
                            if (callSite != false) continue block2;
                            if (l < 0L) continue;
                            break block2;
                        }
                        break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)-5330469630024369354L, (long)l);
                    }
                }
                stringBuffer2.append((String)((Object)b4.b("a", (int)29706, (long)(0x47890A93C2BAFF11L ^ l))));
                stringBuffer2.append(this.q(l4));
                stringBuffer2.append(js.E((char)((char)n), (short)((short)n2), (String)this.V(), (int)n3));
                stringBuffer2.append(" ");
                stringBuffer2.append(this.d(l3));
                stringBuffer2.append(_e.n);
            }
            stringBuffer = stringBuffer2;
        }
        return stringBuffer.toString();
    }

    public final w r(Object[] objectArray) {
        return new w(this.m(), this.B());
    }

    public void v(Object[] objectArray) {
        hf hf2 = (hf)objectArray[0];
        qr qr2 = (qr)objectArray[1];
        kw kw2 = (kw)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        PrintWriter printWriter = (PrintWriter)objectArray[4];
        long l = (Long)objectArray[5];
    }

    String g(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x6E532675A633L;
        try {
            stringBuilder = new StringBuilder();
            object = this.D(l2) ? b4.b("a", (int)4918, (long)(0x6A692F989DD8D500L ^ l)) : ":";
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)((Object)n92), (long)-348914902794177000L, (long)l);
        }
        return stringBuilder.append((String)object).append(this.V()).toString();
    }

    b4(_4 _42, h1 h12, l6q l6q2, PrintWriter printWriter, long l) {
        long l2 = (l = a ^ l) ^ 0x15A1187CC594L;
        super(_42, h12, l2, l6q2, printWriter);
    }

    public final l6i R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x39FC1B07C39FL;
        long l4 = l2 ^ 0x759EC6767881L;
        long l5 = l4 >>> 32;
        int n = (int)(l4 << 32 >>> 32);
        return new l6i(this.s(l5, n), this.d(l3), this.V());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    b4.a = prr.a((long)-470689944785943043L, (long)5584862863140707764L, MethodHandles.lookup().lookupClass()).a(47354813514418L);
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x282B;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b4", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            b4.d[n2] = b4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b4.b(n, l);
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
