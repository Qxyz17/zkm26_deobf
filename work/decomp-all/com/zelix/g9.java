/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ah;
import com.zelix.lkp;
import com.zelix.loz;
import com.zelix.m44;
import com.zelix.n9;
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

public class g9
implements lkp,
loz {
    private int Z;
    private ah p;
    private static final long a = prr.a((long)7225161099861007514L, (long)5291792622803041549L, MethodHandles.lookup().lookupClass()).a(1735296259776L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    int i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("s", (Object)this, (long)-5366513962457212703L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public boolean k(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    public boolean P(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public boolean t(Object[] objectArray) {
        Object object;
        block8: {
            block10: {
                long l = (Long)objectArray[0];
                CallSite callSite = m44.a("h", (long)2775822840957895155L, (long)l);
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    object = m44.a("v", (Object)this, (long)4574377722939363868L, (long)l);
                                    if (callSite == null) break block8;
                                    if (object == 5) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)((Object)n92), (long)4331764686065341761L, (long)l);
                                }
                                object = m44.a("v", (Object)this, (long)4574377722939363868L, (long)l);
                                if (callSite == null) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)((Object)n93), (long)4331764686065341761L, (long)l);
                            }
                            if (object != 4) break block10;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)((Object)n94), (long)4331764686065341761L, (long)l);
                        }
                    }
                    object = true;
                    break block8;
                }
                catch (n9 n95) {
                    throw m44.a("h", (Object)((Object)n95), (long)4331764686065341761L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    public boolean m(Object[] objectArray) {
        Object object;
        block18: {
            block19: {
                Object object2;
                block16: {
                    long l = (Long)objectArray[0];
                    CallSite callSite = m44.a("h", (long)3458129054616914059L, (long)l);
                    try {
                        block17: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        object2 = m44.a("v", (Object)this, (long)3892093499546458980L, (long)l);
                                                        if (callSite == null) break block16;
                                                        if (object2 == false) break block17;
                                                    }
                                                    catch (n9 n92) {
                                                        throw m44.a("h", (Object)((Object)n92), (long)3847638889335462969L, (long)l);
                                                    }
                                                    object2 = m44.a("v", (Object)this, (long)3892093499546458980L, (long)l);
                                                    if (callSite == null) break block16;
                                                }
                                                catch (n9 n93) {
                                                    throw m44.a("h", (Object)((Object)n93), (long)3847638889335462969L, (long)l);
                                                }
                                                if (l < 0L) break block16;
                                                if (object2 == true) break block17;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("h", (Object)((Object)n94), (long)3847638889335462969L, (long)l);
                                            }
                                            object2 = m44.a("v", (Object)this, (long)3892093499546458980L, (long)l);
                                            if (callSite == null) break block16;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("h", (Object)((Object)n95), (long)3847638889335462969L, (long)l);
                                        }
                                        if (l <= 0L) break block16;
                                        if (object2 == g9.a("w", (int)14175, (long)(0x68DD941252FB0C32L ^ l))) break block17;
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("h", (Object)((Object)n96), (long)3847638889335462969L, (long)l);
                                    }
                                    object = m44.a("v", (Object)this, (long)3892093499546458980L, (long)l);
                                    if (callSite == null) break block18;
                                }
                                catch (n9 n97) {
                                    throw m44.a("h", (Object)((Object)n97), (long)3847638889335462969L, (long)l);
                                }
                                if (object != g9.a("w", (int)11694, (long)(0x4FE99C95A93E96C2L ^ l))) break block19;
                            }
                            catch (n9 n98) {
                                throw m44.a("h", (Object)((Object)n98), (long)3847638889335462969L, (long)l);
                            }
                        }
                        object2 = true;
                    }
                    catch (n9 n99) {
                        throw m44.a("h", (Object)((Object)n99), (long)3847638889335462969L, (long)l);
                    }
                }
                return (boolean)object2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public String v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    public int u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x199EEE557A16L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (int)m44.a("w", (Object)this, (long)-4212477191579227923L, (long)l);
        return (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)-4213340298381575312L, (long)l), (Object)objectArray2, (long)-2313722706824536902L, (long)l);
    }

    g9(short s, ah ah2, int n, short s2, int n2) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        m44.a("t", (Object)this, (ah)ah2, (long)8862643710577214473L, (long)l);
        m44.a("t", (Object)this, (int)n, (long)8859456219015976852L, (long)l);
    }

    public boolean s(Object[] objectArray) {
        Object object;
        block8: {
            block10: {
                long l = (Long)objectArray[0];
                CallSite callSite = m44.a("i", (long)-190112262786917846L, (long)l);
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    object = m44.a("w", (Object)this, (long)-1971919677318297147L, (long)l);
                                    if (callSite == null) break block8;
                                    if (object == 3) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("i", (Object)((Object)n92), (long)-1746089586207732072L, (long)l);
                                }
                                object = m44.a("w", (Object)this, (long)-1971919677318297147L, (long)l);
                                if (callSite == null) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("i", (Object)((Object)n93), (long)-1746089586207732072L, (long)l);
                            }
                            if (object != 2) break block10;
                        }
                        catch (n9 n94) {
                            throw m44.a("i", (Object)((Object)n94), (long)-1746089586207732072L, (long)l);
                        }
                    }
                    object = true;
                    break block8;
                }
                catch (n9 n95) {
                    throw m44.a("i", (Object)((Object)n95), (long)-1746089586207732072L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x7C1BE3872383L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "~\u00bc\u00c2\u00bb\u0010\u008d\u00fa\u0005\u00ae\u0090\u0007]'fT\u00c3";
        int n2 = "~\u00bc\u00c2\u00bb\u0010\u008d\u00fa\u0005\u00ae\u0090\u0007]'fT\u00c3".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x28A;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/g9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            g9.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = g9.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/g9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
