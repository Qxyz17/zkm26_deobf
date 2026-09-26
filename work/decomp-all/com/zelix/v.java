/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.awt.Component;
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
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class v
extends JScrollPane
implements ChangeListener {
    private static final String J;
    private static final String O;
    private static final String k;
    private Component m;
    private boolean U;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public v(long l, Component component) {
        long l2 = (l = a ^ l) ^ 0x2258992CEEF8L;
        super(component);
        m44.a("p", (Object)this, (Component)component, (long)6325306990304685220L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("m", (Object)this, (Object)objectArray, (long)5943467426102936250L, (long)l);
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        block5: {
            CallSite callSite;
            long l;
            block4: {
                l = a ^ 0x3FC0C19B0200L;
                CallSite callSite2 = m44.a("o", (long)7752621196925322482L, (long)l);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)7515194331202179879L, (long)l);
                        if (callSite2 == null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("o", (Object)numberFormatException, (long)7910920407624190298L, (long)l);
                    }
                    callSite = m44.a("q", (Object)this, (long)7515194331202179879L, (long)l);
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("o", (Object)numberFormatException, (long)7910920407624190298L, (long)l);
                }
            }
            m44.a("p", (Object)callSite, (long)7574617707318927318L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                v.a = prr.a((long)-2169324129648433000L, (long)-6501638530287004426L, MethodHandles.lookup().lookupClass()).a(246491881811169L);
                var9 = v.a ^ 34544499881649L;
                v.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[6];
                var5_4 = 0;
                var4_5 = "!\u0092+\u0088\u00f3\u00a9\u000e\u00d3\u00dd8\u0097\u0010<\u0080W,\u0095\u00ea\u00d0\u00e2\u00feOq\u009e\u00c5=\u008e^a\u00f2\u00b7\u00e1\u0010\u0000^D\u00bf\u00e3}\u0080\u00e0F\u00c4Q\b\"\u0007\u001d\u00ea\u0010.\u0083;;\u009c\u0089\u0015\u00d8{\u000b\u009c(\u0087l\u00c8Q \u009cX\u00d7.\u00dek:\u000b\u00ec\u00b0}!\u00eb\u001eo\u0006\u009f\u008f\u00d1\u001b\u00a2\u00d9\u0088\u00bc$\u00f3w\u00c1\u00ab\u00e6\u0085\u00ab";
                var6_6 = "!\u0092+\u0088\u00f3\u00a9\u000e\u00d3\u00dd8\u0097\u0010<\u0080W,\u0095\u00ea\u00d0\u00e2\u00feOq\u009e\u00c5=\u008e^a\u00f2\u00b7\u00e1\u0010\u0000^D\u00bf\u00e3}\u0080\u00e0F\u00c4Q\b\"\u0007\u001d\u00ea\u0010.\u0083;;\u009c\u0089\u0015\u00d8{\u000b\u009c(\u0087l\u00c8Q \u009cX\u00d7.\u00dek:\u000b\u00ec\u00b0}!\u00eb\u001eo\u0006\u009f\u008f\u00d1\u001b\u00a2\u00d9\u0088\u00bc$\u00f3w\u00c1\u00ab\u00e6\u0085\u00ab".length();
                var3_7 = 32;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = v.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00c31\u001fb\u00c22\u00f09\u00e3\u00b8\u00be\u00ac5\u0006\u00b5e\u00105\u00cd\u008d\u00beL\u00b4f\u00d2r>\u00bf\u0005\u00a6\u001e$6";
                    var6_6 = "\u00c31\u001fb\u00c22\u00f09\u00e3\u00b8\u00be\u00ac5\u0006\u00b5e\u00105\u00cd\u008d\u00beL\u00b4f\u00d2r>\u00bf\u0005\u00a6\u001e$6".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = v.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        v.b = var7_3;
        v.c = new String[6];
        v.J = m44.a("n", (Object)v.a("v", (int)2596, (long)(2714780755912816466L ^ var9)), (Object)v.a("v", (int)754, (long)(3365047667201048454L ^ var9)), (long)-7236760842440574835L, (long)var9);
        v.O = m44.a("n", (Object)v.a("v", (int)12927, (long)(8403333067065642762L ^ var9)), (long)-7043642028740053632L, (long)var9);
        v.k = m44.a("n", (Object)v.a("v", (int)16345, (long)(490191272020198056L ^ var9)), (long)-7043642028740053632L, (long)var9);
    }

    private void C(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x2F2175C5F662L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("p", (Object)this, (boolean)m44.a("l", (Object)objectArray2, (long)-4534751891969687339L, (long)l), (long)-2823804372957316045L, (long)l);
        m44.a("s", (Object)m44.a("s", (Object)this, (long)-2393688631730392821L, (long)l), (Object)this, (long)-4365169614570333520L, (long)l);
    }

    /*
     * Exception decompiling
     */
    private static boolean Y(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 10[SWITCH]
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

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6D94;
        if (c[n2] == null) {
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
                throw new RuntimeException("com/zelix/v", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            v.c[n2] = v.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = v.a(n, l);
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
            throw new RuntimeException("com/zelix/v" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(v.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
