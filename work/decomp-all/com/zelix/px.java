/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h3;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v2;
import com.zelix.y6;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class px
extends v2
implements h3 {
    private List h;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    /*
     * Exception decompiling
     */
    public void X(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    protected void O(Object[] objectArray) {
        block13: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            lqq lqq2;
            long l3;
            block11: {
                l3 = (Long)objectArray[0];
                lqq2 = (lqq)objectArray[1];
                int n = (Integer)objectArray[2];
                int n2 = (Integer)objectArray[3];
                int n3 = (Integer)objectArray[4];
                long l4 = l3;
                l2 = l4 ^ 0x4CE45E82C0EEL;
                l = l4 ^ 0x6C5C43100C03L;
                callSite2 = m44.a("j", (long)-2447378320742416373L, (long)l3);
                try {
                    block12: {
                        try {
                            try {
                                callSite = m44.a("t", (Object)((Object)this), (long)-2795638817290267605L, (long)l3);
                                if (callSite2 != null) break block11;
                                if (callSite.size() != 0) break block12;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)((Object)n92), (long)-4435505065980313938L, (long)l3);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = px.b("p", (int)24652, (long)(0x24889AB206275925L ^ l3));
                            m44.a("u", (Object)lqq2, (Object)objectArray2, (long)-2685246405006630961L, (long)l3);
                            if (callSite2 == null) break block13;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)((Object)n93), (long)-4435505065980313938L, (long)l3);
                        }
                    }
                    callSite = m44.a("t", (Object)((Object)this), (long)-2795638817290267605L, (long)l3);
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)((Object)n94), (long)-4435505065980313938L, (long)l3);
                }
            }
            Iterator iterator = callSite.iterator();
            while (iterator.hasNext()) {
                y6 y62 = (y6)iterator.next();
                try {
                    if (l3 >= 0L) {
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l;
                        if (!((String)((Object)m44.a("u", (Object)y62, (Object)objectArray3, (long)-2502878320732185807L, (long)l3))).equals(px.b("p", (int)18449, (long)(0x740AA99D5E95717FL ^ l3)))) {
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l;
                            Object[] objectArray5 = new Object[2];
                            objectArray5[1] = l2;
                            objectArray5[0] = (String)((Object)m44.a("u", (Object)y62, (Object)objectArray4, (long)-2502878320732185807L, (long)l3)) + (String)((Object)px.b("p", (int)19254, (long)(0x4BDBB92FCAD3F254L ^ l3)));
                            m44.a("u", (Object)lqq2, (Object)objectArray5, (long)-2685246405006630961L, (long)l3);
                        }
                    }
                }
                catch (n9 n95) {
                    throw m44.a("j", (Object)((Object)n95), (long)-4435505065980313938L, (long)l3);
                }
                if (callSite2 == null) continue;
            }
        }
    }

    public px(int n, short s, int n2, short s2) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x1D578E226F8BL;
        super(l2, n2);
        m44.a("u", (Object)((Object)this), new ArrayList(), (long)-4998717663755585608L, (long)l);
    }

    public void v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        y6 y62 = (y6)objectArray[1];
        m44.a("t", (Object)((Object)this), (long)-3718872000721141381L, (long)l).add(y62);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return px.b("p", (int)28680, (long)(0x6DA742D4EA39B5C2L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                px.a = prr.a((long)8234365181382175653L, (long)-2255750306108753958L, MethodHandles.lookup().lookupClass()).a(81304881397504L);
                px.e = new HashMap<K, V>(13);
                var0 = px.a ^ 116776540137170L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "o\u0089\u000f\u0082\u00ba\u008e\u008c*\u0096\u00cd\u00b9\u00ff\u00d2*x\u00f0\u0007=\u00d4~\u00e0\u009a\u0096W\u0012\u008f\u00ce\u00c2\u00be\u00b0\u00ce\u00f8\u0010\u001aA\nv\u00a5\u00be\n\u00d4I\u00d8u\u0097P\u00c4:f8\u009a\b\u00a3\u00eb\u0099\u00f17\u0001\u00e1\u00ee\u00ae\u0011\u00c5\u00a1\u00cft\u0006\u00f2\u00d6\tca\u00bc-\u0016ZRm\u008c\u00dcsu\u0091\u00b1\u00b0,\u001as\u001e\u00c7\u00cfe@\u00d2\u00f9;Un\u00dfTX\t\u0007!9: o\u00cfp\u0015\u00ab&\u0005\u00ee\u00f5(\u00f9\u009a\u0098.\u00d4\u00e9\u00e1)\u00d7\u00cb:\u00a5\u00b0\u00e8\u0007\u00dd\\M\u00e3\u000b\u0080\u00c3(J\b\u00e2P%\u00b7:\u00a1\u00f2\u00b6-[\u00b9\u00f0\u0019\u001f\u00da\u00e8\u00cf\u00a1\n\u001a\u0000+\u0088m\u00ff \u0017\u00c7\u00d4\rk.\u0089\u0012:\u00c32\u0097 \u0098#\u00e7\u0013z\u009axP6\u009aw\u00c5\u00973\u00b0\u00b9\u00c34\u00ac\u00af\u0012\u009b\u00b6\u0007^R\u00ac\u00b2\u00fc`>\u00f1 w\u00ad\u00e0\u0096\u00c5\u0096\u009cJ\u0094\u00fb\u00cdF\u009a\u008f3t|\u0012}\n\u00b6T\u00af\u00ab8\u00de\u00e3-\u0007\u00dd\u0091T@\u00a8p\u00b7\u0086vx8\u0006\u00d8\u00cd\u00aa\u00b1\u0019\u00b6\u0093\u009c\u00cc\u00e1J\u008e\u00ae\u001a6\u0084\f\u00e0\u00f5\u00e7\u0013\u00f7~5J\u00b3\u00c7XY`{E\u00ceE\u00dd\u00d20\u0086q@\u0087\u0093\u001e\u00bb\u0004\u00e2\u00b7\u0098\u00c4\u0094?~\u0010s'\u00da\u0018/\u00c1&\u00ad\u00fd\u001a\u00ea=JM\u001b\u00ade\u0084\u00f7A\u00ff8T\u007f\u000bD\u0090\"";
                var8_6 = "o\u0089\u000f\u0082\u00ba\u008e\u008c*\u0096\u00cd\u00b9\u00ff\u00d2*x\u00f0\u0007=\u00d4~\u00e0\u009a\u0096W\u0012\u008f\u00ce\u00c2\u00be\u00b0\u00ce\u00f8\u0010\u001aA\nv\u00a5\u00be\n\u00d4I\u00d8u\u0097P\u00c4:f8\u009a\b\u00a3\u00eb\u0099\u00f17\u0001\u00e1\u00ee\u00ae\u0011\u00c5\u00a1\u00cft\u0006\u00f2\u00d6\tca\u00bc-\u0016ZRm\u008c\u00dcsu\u0091\u00b1\u00b0,\u001as\u001e\u00c7\u00cfe@\u00d2\u00f9;Un\u00dfTX\t\u0007!9: o\u00cfp\u0015\u00ab&\u0005\u00ee\u00f5(\u00f9\u009a\u0098.\u00d4\u00e9\u00e1)\u00d7\u00cb:\u00a5\u00b0\u00e8\u0007\u00dd\\M\u00e3\u000b\u0080\u00c3(J\b\u00e2P%\u00b7:\u00a1\u00f2\u00b6-[\u00b9\u00f0\u0019\u001f\u00da\u00e8\u00cf\u00a1\n\u001a\u0000+\u0088m\u00ff \u0017\u00c7\u00d4\rk.\u0089\u0012:\u00c32\u0097 \u0098#\u00e7\u0013z\u009axP6\u009aw\u00c5\u00973\u00b0\u00b9\u00c34\u00ac\u00af\u0012\u009b\u00b6\u0007^R\u00ac\u00b2\u00fc`>\u00f1 w\u00ad\u00e0\u0096\u00c5\u0096\u009cJ\u0094\u00fb\u00cdF\u009a\u008f3t|\u0012}\n\u00b6T\u00af\u00ab8\u00de\u00e3-\u0007\u00dd\u0091T@\u00a8p\u00b7\u0086vx8\u0006\u00d8\u00cd\u00aa\u00b1\u0019\u00b6\u0093\u009c\u00cc\u00e1J\u008e\u00ae\u001a6\u0084\f\u00e0\u00f5\u00e7\u0013\u00f7~5J\u00b3\u00c7XY`{E\u00ceE\u00dd\u00d20\u0086q@\u0087\u0093\u001e\u00bb\u0004\u00e2\u00b7\u0098\u00c4\u0094?~\u0010s'\u00da\u0018/\u00c1&\u00ad\u00fd\u001a\u00ea=JM\u001b\u00ade\u0084\u00f7A\u00ff8T\u007f\u000bD\u0090\"".length();
                var5_7 = 32;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = px.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00fd\u0080\u00ec\u0000\u00ab\u00f3&\u00da\u00a2\u009b\u0085aQ\u00f4\u00d2\u0083y\u0012\u00af\u00e6\u00f8\u0089\u00a0\u0018/\u00aa\u00da\tY\u0002\u008c\u00be\u00c26\u0001[\u00db\u00b0\u0001\u00f0\u0010a\u00d3E[8\u00c1\u00be\u0014*\u0083\u0015\u0016#\u00e7\u00ffi";
                    var8_6 = "\u00fd\u0080\u00ec\u0000\u00ab\u00f3&\u00da\u00a2\u009b\u0085aQ\u00f4\u00d2\u0083y\u0012\u00af\u00e6\u00f8\u0089\u00a0\u0018/\u00aa\u00da\tY\u0002\u008c\u00be\u00c26\u0001[\u00db\u00b0\u0001\u00f0\u0010a\u00d3E[8\u00c1\u00be\u0014*\u0083\u0015\u0016#\u00e7\u00ffi".length();
                    var5_7 = 40;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = px.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        px.c = var9_3;
        px.d = new String[11];
    }

    private static n9 a(n9 n92) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7625;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/px", exception);
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
            px.d[n2] = px.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = px.b(n, l);
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
            throw new RuntimeException("com/zelix/px" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(px.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
