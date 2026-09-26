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
    private static final long a = prr.a(7225161099861007514L, 5291792622803041549L, MethodHandles.lookup().lookupClass()).a(1735296259776L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    int i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("s", (Object)this, (long)-5366513962457212703L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    @Override
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
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public boolean P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public boolean t(Object[] objectArray) {
        Object object;
        block8: {
            block10: {
                long l10 = (Long)objectArray[0];
                CallSite callSite = m44.a("h", (long)2775822840957895155L, (long)l10);
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    object = m44.a("v", (Object)this, (long)4574377722939363868L, (long)l10);
                                    if (callSite == null) break block8;
                                    if (object == 5) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)n92, (long)4331764686065341761L, (long)l10);
                                }
                                object = m44.a("v", (Object)this, (long)4574377722939363868L, (long)l10);
                                if (callSite == null) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)n93, (long)4331764686065341761L, (long)l10);
                            }
                            if (object != 4) break block10;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)n94, (long)4331764686065341761L, (long)l10);
                        }
                    }
                    object = true;
                    break block8;
                }
                catch (n9 n95) {
                    throw m44.a("h", (Object)n95, (long)4331764686065341761L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public void b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
    }

    @Override
    public boolean m(Object[] objectArray) {
        Object object;
        block18: {
            block19: {
                Object object2;
                block16: {
                    long l10 = (Long)objectArray[0];
                    CallSite callSite = m44.a("h", (long)3458129054616914059L, (long)l10);
                    try {
                        block17: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        object2 = m44.a("v", (Object)this, (long)3892093499546458980L, (long)l10);
                                                        if (callSite == null) break block16;
                                                        if (object2 == false) break block17;
                                                    }
                                                    catch (n9 n92) {
                                                        throw m44.a("h", (Object)n92, (long)3847638889335462969L, (long)l10);
                                                    }
                                                    object2 = m44.a("v", (Object)this, (long)3892093499546458980L, (long)l10);
                                                    if (callSite == null) break block16;
                                                }
                                                catch (n9 n93) {
                                                    throw m44.a("h", (Object)n93, (long)3847638889335462969L, (long)l10);
                                                }
                                                if (l10 < 0L) break block16;
                                                if (object2 == true) break block17;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("h", (Object)n94, (long)3847638889335462969L, (long)l10);
                                            }
                                            object2 = m44.a("v", (Object)this, (long)3892093499546458980L, (long)l10);
                                            if (callSite == null) break block16;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("h", (Object)n95, (long)3847638889335462969L, (long)l10);
                                        }
                                        if (l10 <= 0L) break block16;
                                        if (object2 == g9.a("w", (int)14175, (long)(0x68DD941252FB0C32L ^ l10))) break block17;
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("h", (Object)n96, (long)3847638889335462969L, (long)l10);
                                    }
                                    object = m44.a("v", (Object)this, (long)3892093499546458980L, (long)l10);
                                    if (callSite == null) break block18;
                                }
                                catch (n9 n97) {
                                    throw m44.a("h", (Object)n97, (long)3847638889335462969L, (long)l10);
                                }
                                if (object != g9.a("w", (int)11694, (long)(0x4FE99C95A93E96C2L ^ l10))) break block19;
                            }
                            catch (n9 n98) {
                                throw m44.a("h", (Object)n98, (long)3847638889335462969L, (long)l10);
                            }
                        }
                        object2 = true;
                    }
                    catch (n9 n99) {
                        throw m44.a("h", (Object)n99, (long)3847638889335462969L, (long)l10);
                    }
                }
                return (boolean)object2;
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public String v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return null;
    }

    @Override
    public int u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x199EEE557A16L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = (int)m44.a("w", (Object)this, (long)-4212477191579227923L, (long)l10);
        return (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)-4213340298381575312L, (long)l10), (Object)objectArray2, (long)-2313722706824536902L, (long)l10);
    }

    g9(short s10, ah ah2, int n10, short s11, int n11) {
        long l10 = ((long)s10 << 48 | (long)s11 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ a;
        m44.a("t", (Object)this, (ah)ah2, (long)8862643710577214473L, (long)l10);
        m44.a("t", (Object)this, (int)n10, (long)8859456219015976852L, (long)l10);
    }

    @Override
    public boolean s(Object[] objectArray) {
        Object object;
        block8: {
            block10: {
                long l10 = (Long)objectArray[0];
                CallSite callSite = m44.a("i", (long)-190112262786917846L, (long)l10);
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    object = m44.a("w", (Object)this, (long)-1971919677318297147L, (long)l10);
                                    if (callSite == null) break block8;
                                    if (object == 3) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("i", (Object)n92, (long)-1746089586207732072L, (long)l10);
                                }
                                object = m44.a("w", (Object)this, (long)-1971919677318297147L, (long)l10);
                                if (callSite == null) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("i", (Object)n93, (long)-1746089586207732072L, (long)l10);
                            }
                            if (object != 2) break block10;
                        }
                        catch (n9 n94) {
                            throw m44.a("i", (Object)n94, (long)-1746089586207732072L, (long)l10);
                        }
                    }
                    object = true;
                    break block8;
                }
                catch (n9 n95) {
                    throw m44.a("i", (Object)n95, (long)-1746089586207732072L, (long)l10);
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
        long l10 = a ^ 0x7C1BE3872383L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "~\u00bc\u00c2\u00bb\u0010\u008d\u00fa\u0005\u00ae\u0090\u0007]'fT\u00c3";
        int n11 = "~\u00bc\u00c2\u00bb\u0010\u008d\u00fa\u0005\u00ae\u0090\u0007]'fT\u00c3".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x28A;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
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
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            g9.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = g9.a(n10, l10);
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

