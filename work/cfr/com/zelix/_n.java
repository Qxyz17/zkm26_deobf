/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._9;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hz;
import com.zelix.iq;
import com.zelix.kk;
import com.zelix.ko;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o9;
import com.zelix.prr;
import com.zelix.ss;
import com.zelix.t6;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _n
extends _9 {
    private ss[] N;
    private ss[] D;
    private static final long a = prr.a(9185181857886184722L, -7879706560420934276L, MethodHandles.lookup().lookupClass()).a(222184764607949L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long f;

    public _n(kk kk2, iq iq2, hz hz2, t6 t62, long l10, Set set, List list, boolean bl2, Map map, Map map2) {
        block3: {
            Object object;
            long l11;
            block4: {
                block2: {
                    long l12 = l10 = a ^ l10;
                    l11 = l12 ^ 0x14383AE038DEL;
                    long l13 = l12 ^ 0x231F0EF2C9D6L;
                    super(kk2);
                    this.k = iq2;
                    CallSite callSite = m44.a("n", (long)-6649579432134445232L, (long)l10);
                    if (!bl2) break block2;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l13;
                    object = m44.a("q", (Object)hz2, (Object)objectArray, (long)-6693279449388647483L, (long)l10);
                    if (l10 < 0L) break block3;
                    if (callSite == false) break block4;
                }
                object = hz2.T();
            }
            m44.a("r", (Object)this, (ss[])ss.s(kk2, object, t62, l11, set, list, true, map, map2), (long)-6576383411480941298L, (long)l10);
            m44.a("r", (Object)this, (ss[])ss.s(kk2, hz2.X(), t62, l11, set, list, false, map, map2), (long)-6726107364365281611L, (long)l10);
            this.M = true;
        }
    }

    @Override
    public String R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return _n.a("l", (int)7800, (long)(0xDBD65B765B539A4L ^ l10));
    }

    /*
     * Exception decompiling
     */
    protected void K(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[DOLOOP]], but top level block is 12[SIMPLE_IF_TAKEN]
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
    protected void N(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[DOLOOP]], but top level block is 12[SIMPLE_IF_TAKEN]
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
    @Override
    public int y(char var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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
    @Override
    final void z(gu var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 6[SIMPLE_IF_TAKEN]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    _n(_4 _42, h1 h12, l6q l6q2, l6q l6q3, long l10, PrintWriter printWriter) {
        int n10;
        int n11;
        CallSite callSite;
        o9 o92;
        CallSite callSite2;
        CallSite callSite3;
        long l11;
        block22: {
            Object object;
            long l12 = l10 = a ^ l10;
            long l13 = l12 ^ 0x793A0494C9A7L;
            long l14 = l12 ^ 0x4A724CBBCCB1L;
            long l15 = l12 ^ 0x745A266F10C6L;
            l11 = l12 ^ 0x798BFA32FB76L;
            long l16 = l12 ^ 0x335CC0CA868CL;
            super(_42);
            Object[] objectArray = new Object[1];
            objectArray[0] = l15;
            callSite3 = m44.a("k", (Object)objectArray, (long)-818826401525428160L, (long)l10);
            CallSite callSite4 = m44.a("k", (long)-1098107884514466779L, (long)l10);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l15;
            callSite2 = m44.a("k", (Object)objectArray2, (long)-818826401525428160L, (long)l10);
            o92 = o9.f(l13);
            this.H = h12.readUnsignedShort();
            l6q2.t(o92.e(l14, this.H), this, l16);
            int n12 = h12.readUnsignedShort();
            callSite = callSite4;
            m44.a("w", (Object)this, (ss[])new ss[n12], (long)-590340781596967301L, (long)l10);
            n11 = 0;
            block10: while (n11 < n12) {
                try {
                    try {
                        try {
                            Object[] objectArray3 = new Object[9];
                            objectArray3[8] = o92;
                            objectArray3[7] = l11;
                            objectArray3[6] = callSite2;
                            objectArray3[5] = callSite3;
                            objectArray3[4] = printWriter;
                            objectArray3[3] = l6q3;
                            objectArray3[2] = l6q2;
                            objectArray3[1] = h12;
                            objectArray3[0] = (ko)_42;
                            m44.a("u", (Object)this, (long)-590340781596967301L, (long)l10)[n11] = m44.a("k", (Object)objectArray3, (long)-813677727750318211L, (long)l10);
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)-841785934081788439L, (long)l10);
                        }
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)-841785934081788439L, (long)l10);
                    }
                }
                catch (n9 n94) {
                    throw m44.a("k", (Object)n94, (long)-841785934081788439L, (long)l10);
                }
                do {
                    CallSite callSite5 = callSite;
                    if (l10 >= 0L) {
                        if (callSite5 == false) {
                            object = m44.a("t", (Object)m44.a("u", (Object)this, (long)-590340781596967301L, (long)l10)[n11], (Object)new Object[0], (long)-1580012372010144922L, (long)l10);
                            if (callSite != false) break block22;
                            if (object == 0) {
                                this.M = false;
                            }
                            ++n11;
                        }
                        callSite5 = callSite;
                    }
                    if (callSite5 == false) continue block10;
                    n11 = h12.readUnsignedShort();
                    m44.a("w", (Object)this, (ss[])new ss[n11], (long)-1018553540088822336L, (long)l10);
                } while (l10 <= 0L);
            }
            object = n10 = 0;
        }
        block12: while (n10 < n11) {
            try {
                try {
                    Object[] objectArray = new Object[9];
                    objectArray[8] = o92;
                    objectArray[7] = l11;
                    objectArray[6] = callSite2;
                    objectArray[5] = callSite3;
                    objectArray[4] = printWriter;
                    objectArray[3] = l6q3;
                    objectArray[2] = l6q2;
                    objectArray[1] = h12;
                    objectArray[0] = (ko)_42;
                    m44.a("u", (Object)this, (long)-1018553540088822336L, (long)l10)[n10] = m44.a("k", (Object)objectArray, (long)-813677727750318211L, (long)l10);
                }
                catch (n9 n95) {
                    throw m44.a("k", (Object)n95, (long)-841785934081788439L, (long)l10);
                }
            }
            catch (n9 n96) {
                throw m44.a("k", (Object)n96, (long)-841785934081788439L, (long)l10);
            }
            do {
                CallSite callSite6 = callSite;
                if (l10 > 0L) {
                    if (callSite6 == false) {
                        if (m44.a("t", (Object)m44.a("u", (Object)this, (long)-1018553540088822336L, (long)l10)[n10], (Object)new Object[0], (long)-1580012372010144922L, (long)l10) == false) {
                            this.M = false;
                        }
                        ++n10;
                    }
                    callSite6 = callSite;
                }
                if (callSite6 == false) continue block12;
            } while (l10 <= 0L);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x84F8BD227F4L;
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
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "\u00ba\u0011L\"\u00dbr_\u00ca\u00fd\u00defJ\u00ee\u00f4\u0004q\u009a\u00fd\u00bfC\u00e2\u00ed\u00db-H\u0006\u009a\u00d4\u0083\u00e0\u00da\u00e5\u00fb\u009f\u00ce#'\u008e\u00b3\u009e\u00c9\u0096\u00dc\u008b\u008dEf]8\u0080q\\\u00f7D\u00e0\u00ded)\u00f6wP\u008d\u00f5\u0006tZ\u00b8\u0084\u0095T\u001a\u0006\u00f3\u0085\u0083\u008e~5=\fI\u00be\u009e<l\u0088\u00b9\u00f4G\u00c7\u00e3\u00e1X7\u00cbY]h\u0086o2IO!A\u0018\u00b2\u0019\u00aa\u0096{\u00f8\u00f72l\u0000\u00e1\u0084\u007f\u00e0\u00071~\u0084\u0017\u00a7\u009a\u0014\u00b7:";
        int n11 = "\u00ba\u0011L\"\u00dbr_\u00ca\u00fd\u00defJ\u00ee\u00f4\u0004q\u009a\u00fd\u00bfC\u00e2\u00ed\u00db-H\u0006\u009a\u00d4\u0083\u00e0\u00da\u00e5\u00fb\u009f\u00ce#'\u008e\u00b3\u009e\u00c9\u0096\u00dc\u008b\u008dEf]8\u0080q\\\u00f7D\u00e0\u00ded)\u00f6wP\u008d\u00f5\u0006tZ\u00b8\u0084\u0095T\u001a\u0006\u00f3\u0085\u0083\u008e~5=\fI\u00be\u009e<l\u0088\u00b9\u00f4G\u00c7\u00e3\u00e1X7\u00cbY]h\u0086o2IO!A\u0018\u00b2\u0019\u00aa\u0096{\u00f8\u00f72l\u0000\u00e1\u0084\u007f\u00e0\u00071~\u0084\u0017\u00a7\u009a\u0014\u00b7:".length();
        int n12 = 48;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = _n.a(byArray3).intern();
            if ((n13 += n12) >= n11) break;
            n12 = string.charAt(n13);
        }
        b = stringArray;
        c = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n15 = 1;
        while (true) {
            if (n15 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = -6697556384811867541L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                f = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n15] = (byte)(l10 << n15 * 8 >>> 56);
            ++n15;
        }
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1129;
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
                throw new RuntimeException("com/zelix/_n", exception);
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
            _n.c[n11] = _n.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = _n.a(n10, l10);
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
            throw new RuntimeException("com/zelix/_n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_n.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

