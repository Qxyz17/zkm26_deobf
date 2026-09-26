/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._g;
import com.zelix._v;
import com.zelix.cf;
import com.zelix.h5;
import com.zelix.l60;
import com.zelix.l6h;
import com.zelix.l6q;
import com.zelix.lke;
import com.zelix.lof;
import com.zelix.lqu;
import com.zelix.m0;
import com.zelix.m4;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.zy;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class mh
extends m0 {
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map j;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String[] f(Object[] objectArray) {
        String[] stringArray;
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = b ^ l10;
        StringTokenizer stringTokenizer = new StringTokenizer(string, "/");
        CallSite callSite = m44.a("n", (long)-448387241804195445L, (long)l10);
        int n10 = stringTokenizer.countTokens();
        String[] stringArray2 = new String[n10];
        int n11 = 0;
        block2: while (n11 < n10) {
            try {
                do {
                    if (l10 > 0L) {
                        stringArray = stringArray2;
                        if (callSite != null) return stringArray;
                        stringArray[n11] = stringTokenizer.nextToken();
                        ++n11;
                    }
                    if (callSite == null) continue block2;
                } while (l10 <= 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("n", (Object)n92, (long)-1954444531131558282L, (long)l10);
            }
        }
        stringArray = stringArray2;
        return stringArray;
    }

    /*
     * Exception decompiling
     */
    private Map T(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [43[DOLOOP]], but top level block is 0[TRYBLOCK]
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

    public HashMap Q(Object[] objectArray) {
        Object object;
        block30: {
            Object object2;
            block27: {
                lke lke2;
                Object object3;
                CallSite callSite;
                long l10;
                long l11;
                long l12;
                lke lke3;
                block26: {
                    Object object4;
                    l6q l6q2;
                    CallSite callSite2;
                    long l13;
                    long l14;
                    List list;
                    boolean bl2;
                    _g _g2;
                    zy zy2;
                    String string;
                    boolean bl3;
                    boolean bl4;
                    boolean bl5;
                    h5 h52;
                    block34: {
                        CallSite callSite3;
                        long l15;
                        lqu lqu2;
                        String string2;
                        block33: {
                            Object object5;
                            block23: {
                                Enumeration enumeration = (Enumeration)objectArray[0];
                                h52 = (h5)objectArray[1];
                                lke3 = (lke)objectArray[2];
                                boolean bl6 = (Boolean)objectArray[3];
                                bl5 = (Boolean)objectArray[4];
                                bl4 = (Boolean)objectArray[5];
                                bl3 = (Boolean)objectArray[6];
                                string = (String)objectArray[7];
                                zy2 = (zy)objectArray[8];
                                _g2 = (_g)objectArray[9];
                                bl2 = (Boolean)objectArray[10];
                                string2 = (String)objectArray[11];
                                Iterator iterator = (Iterator)objectArray[12];
                                list = (List)objectArray[13];
                                l12 = (Long)objectArray[14];
                                lqu2 = (lqu)objectArray[15];
                                long l16 = l12 = b ^ l12;
                                long l17 = l16 ^ 0x46DF3A849B7DL;
                                l11 = l16 ^ 0x39B7191D97A9L;
                                long l18 = l16 ^ 0x7AF8D75956A7L;
                                l14 = l16 ^ 0x2895B0726D2CL;
                                l13 = l16 ^ 0x58C5DFC41C22L;
                                long l19 = l16 ^ 0x497599D2A6F4L;
                                long l20 = l16 ^ 0x5559EFE76EBFL;
                                l15 = l16 ^ 0x3E0234362B36L;
                                long l21 = l16 ^ 0x46DE5ED4ADD8L;
                                int n10 = (int)(l21 >>> 48);
                                int n11 = (int)(l21 << 16 >>> 32);
                                int n12 = (int)(l21 << 48 >>> 48);
                                long l22 = l16 ^ 0x3508994C16C4L;
                                l10 = l16 ^ 0x1FDC1A8FD8B1L;
                                long l23 = l16 ^ 0x68E4B2990A1EL;
                                long l24 = l16 ^ 0x248B13127FD0L;
                                long l25 = l16 ^ 0x2FF378BAFC9CL;
                                CallSite callSite4 = m44.a("o", (long)708813558290082202L, (long)l12);
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l20;
                                objectArray2[0] = iterator;
                                callSite3 = m44.a("n", (Object)this, (Object)objectArray2, (long)1644438406710267398L, (long)l12);
                                Object[] objectArray3 = new Object[4];
                                objectArray3[3] = lke3;
                                objectArray3[2] = h52;
                                objectArray3[1] = callSite3;
                                objectArray3[0] = l17;
                                m44.a("n", (Object)this, (Object)objectArray3, (long)1201667713286888287L, (long)l12);
                                callSite = callSite4;
                                callSite2 = null;
                                Object[] objectArray4 = new Object[1];
                                objectArray4[0] = l23;
                                CallSite callSite5 = m44.a("p", (Object)this, (Object)objectArray4, (long)881059134211149446L, (long)l12);
                                l6q2 = new l6q((short)n10, n11, n12);
                                while (enumeration.hasMoreElements()) {
                                    block24: {
                                        Object object6;
                                        block25: {
                                            _f _f2;
                                            block22: {
                                                object4 = (_f)enumeration.nextElement();
                                                object2 = ((_v)object4).T(l22);
                                                try {
                                                    try {
                                                        try {
                                                            l6q2.t(object2, object4, l24);
                                                            _f2 = object4;
                                                            if (callSite != null) break block22;
                                                            Object[] objectArray5 = new Object[1];
                                                            objectArray5[0] = l25;
                                                            object5 = m44.a("p", (Object)_f2, (Object)objectArray5, (long)1101807542141849530L, (long)l12);
                                                            if (callSite != null) break block23;
                                                        }
                                                        catch (n9 n92) {
                                                            throw m44.a("o", (Object)n92, (long)1509091860509828711L, (long)l12);
                                                        }
                                                        if (!object5) break block24;
                                                    }
                                                    catch (n9 n93) {
                                                        throw m44.a("o", (Object)n93, (long)1509091860509828711L, (long)l12);
                                                    }
                                                    _f2 = callSite5.get(object2);
                                                }
                                                catch (n9 n94) {
                                                    throw m44.a("o", (Object)n94, (long)1509091860509828711L, (long)l12);
                                                }
                                            }
                                            object3 = (m4)((Object)_f2);
                                            try {
                                                try {
                                                    object6 = object3;
                                                    if (callSite != null) break block25;
                                                    if (object6 == null) break block24;
                                                }
                                                catch (n9 n95) {
                                                    throw m44.a("o", (Object)n95, (long)1509091860509828711L, (long)l12);
                                                }
                                                Object[] objectArray6 = new Object[1];
                                                objectArray6[0] = l18;
                                                object6 = m44.a("p", (Object)object3, (Object)objectArray6, (long)1066844487769550589L, (long)l12);
                                            }
                                            catch (n9 n96) {
                                                throw m44.a("o", (Object)n96, (long)1509091860509828711L, (long)l12);
                                            }
                                        }
                                        Object[] objectArray7 = new Object[1];
                                        objectArray7[0] = l19;
                                        m44.a("p", (Object)object6, (Object)objectArray7, (long)1316687445063220258L, (long)l12);
                                    }
                                    if (callSite == null) continue;
                                }
                                if (l12 <= 0L) break block33;
                                object5 = bl2;
                            }
                            if (!object5) break block34;
                        }
                        Object[] objectArray8 = new Object[7];
                        objectArray8[6] = l15;
                        objectArray8[5] = lqu2;
                        objectArray8[4] = callSite3;
                        objectArray8[3] = string2;
                        objectArray8[2] = lke3;
                        objectArray8[1] = h52;
                        objectArray8[0] = l6q2;
                        callSite2 = m44.a("n", (Object)this, (Object)objectArray8, (long)983752690186200779L, (long)l12);
                    }
                    object4 = new l6h(_g2, bl4, bl3, bl5, string, zy2, list, l14);
                    Object[] objectArray9 = new Object[8];
                    objectArray9[7] = bl5;
                    objectArray9[6] = callSite2;
                    objectArray9[5] = bl2;
                    objectArray9[4] = l6q2;
                    objectArray9[3] = object4;
                    objectArray9[2] = lke3;
                    objectArray9[1] = l13;
                    objectArray9[0] = h52;
                    object2 = m44.a("n", (Object)this, (Object)objectArray9, (long)711734391342988098L, (long)l12);
                    try {
                        lke2 = lke3;
                        if (callSite != null) break block26;
                        if (lke2 == null) break block27;
                    }
                    catch (n9 n97) {
                        throw m44.a("o", (Object)n97, (long)1509091860509828711L, (long)l12);
                    }
                    lke2 = lke3;
                }
                Object[] objectArray10 = new Object[1];
                objectArray10[0] = l10;
                object3 = m44.a("p", (Object)lke2, (Object)objectArray10, (long)1423902959249562511L, (long)l12);
                int n13 = 0;
                while (n13 < ((ArrayList)object3).size()) {
                    CallSite callSite6;
                    block28: {
                        block29: {
                            block31: {
                                Object object7;
                                Object object8;
                                String string;
                                block32: {
                                    string = (String)((ArrayList)object3).get(n13);
                                    try {
                                        try {
                                            callSite6 = callSite;
                                            if (l12 <= 0L) break block28;
                                            if (callSite6 != null) break block29;
                                            object = object2;
                                            if (callSite != null) break block30;
                                        }
                                        catch (n9 n98) {
                                            throw m44.a("o", (Object)n98, (long)1509091860509828711L, (long)l12);
                                        }
                                        if (m44.a("p", (Object)object, (Object)string, (long)1696999118457520118L, (long)l12) != false) break block31;
                                    }
                                    catch (n9 n99) {
                                        throw m44.a("o", (Object)n99, (long)1509091860509828711L, (long)l12);
                                    }
                                    Object[] objectArray11 = new Object[2];
                                    objectArray11[1] = l11;
                                    objectArray11[0] = string;
                                    object8 = m44.a("p", (Object)lke3, (Object)objectArray11, (long)1044524216673086677L, (long)l12);
                                    try {
                                        object7 = object8;
                                        if (callSite != null) break block31;
                                        if (object7 != null) break block32;
                                    }
                                    catch (n9 n910) {
                                        throw m44.a("o", (Object)n910, (long)1509091860509828711L, (long)l12);
                                    }
                                    object8 = string;
                                }
                                object7 = ((HashMap)object2).put(string, object8);
                            }
                            ++n13;
                        }
                        callSite6 = callSite;
                    }
                    if (callSite6 == null) continue;
                }
            }
            object = object2;
        }
        return object;
    }

    public List X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = b ^ l10) ^ 0x6F3452C863D8L;
        ArrayList arrayList = new ArrayList();
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = arrayList;
        m44.a("q", (Object)this, (Object)objectArray2, (long)-5822848536495151721L, (long)l10);
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static String[] M(Object[] var0) {
        var1_1 = (Long)var0[0];
        var3_2 = (String)var0[1];
        var4_3 = (var1_1 = mh.b ^ var1_1) ^ 124889440771579L;
        v0 = new Object[2];
        v0[1] = var4_3;
        v0[0] = var3_2;
        var7_4 = m44.a("l", (Object)v0, (long)8005083437170947273L, (long)var1_1);
        var8_5 = Math.max(0, ((CallSite)var7_4).length - 1);
        var9_6 = new String[var8_5];
        var10_7 = new StringBuffer();
        var11_8 = 0;
        var6_9 = m44.a("l", (long)8400732100910781657L, (long)var1_1);
        block2: while (var11_8 < var8_5) {
            try {
                if (var1_1 >= 0L) {
                    if (var11_8 > 0) {
                        m44.a("s", (Object)var10_7, (char)mh.b("y", (int)1801, (long)(3424576845851760497L ^ var1_1)), (long)7988332316580348048L, (long)var1_1);
                    }
                }
                ** GOTO lbl32
            }
            catch (n9 v1) {
                throw m44.a("l", (Object)v1, (long)7616163621030157092L, (long)var1_1);
            }
            var10_7.append((String)var7_4[var11_8]);
            v2 = var9_6;
            do {
                v2[var11_8] = var10_7.toString();
                ++var11_8;
lbl32:
                // 2 sources

                if (var6_9 == null) continue block2;
                v2 = var9_6;
            } while (var1_1 <= 0L);
        }
        return v2;
    }

    /*
     * Exception decompiling
     */
    public void Z(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP], 5[WHILELOOP]], but top level block is 7[WHILELOOP]
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
    public static String f(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[DOLOOP]], but top level block is 9[TRYBLOCK]
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

    public void V(Object[] objectArray) {
        block6: {
            long l10 = (Long)objectArray[0];
            _v[] _vArray = (_v[])objectArray[1];
            long l11 = l10 = b ^ l10;
            long l12 = l11 ^ 0x3FE5DAA18271L;
            long l13 = l11 ^ 0x9A9A0C70710L;
            long l14 = l11 ^ 0x70769FD25F40L;
            int n10 = (int)(l14 >>> 48);
            long l15 = l14 << 16 >>> 16;
            CallSite callSite = m44.a("o", (long)8452695255243166978L, (long)l10);
            m44.a("q", (Object)this, (long)8424741576215229703L, (long)l10).clear();
            int n11 = 0;
            CallSite callSite2 = callSite;
            block2: while (n11 < _vArray.length) {
                try {
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = l15;
                    objectArray2[1] = (int)((char)n10);
                    objectArray2[0] = _vArray[n11].h(l12);
                    m44.a("n", (Object)this, (Object)objectArray2, (long)8017661425208160673L, (long)l10);
                    ++n11;
                    do {
                        CallSite callSite3 = callSite2;
                        if (l10 >= 0L) {
                            if (callSite3 != null) break block6;
                            callSite3 = callSite2;
                        }
                        if (callSite3 == null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)7523659744027171583L, (long)l10);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l13;
            objectArray3[0] = _vArray;
            m44.a("n", (Object)this, (Object)objectArray3, (long)8012446882673379500L, (long)l10);
        }
    }

    public Map t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x1D848B9DB32DL;
        long l13 = l11 ^ 0x4B3810AE401CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("h", (Object)objectArray2, (long)6289725923984880555L, (long)l10);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = callSite;
        objectArray3[0] = l13;
        m44.a("w", (Object)this, (Object)objectArray3, (long)5261385661200570528L, (long)l10);
        return callSite;
    }

    @Override
    void n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Map map = (Map)objectArray[1];
    }

    /*
     * Exception decompiling
     */
    private boolean o(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[DOLOOP]], but top level block is 12[SIMPLE_IF_TAKEN]
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

    @Override
    public String E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return "";
    }

    public boolean H(Object[] objectArray) {
        int n10;
        block8: {
            block9: {
                block7: {
                    CallSite callSite;
                    CallSite callSite2;
                    long l10;
                    block6: {
                        l10 = (Long)objectArray[0];
                        l10 = b ^ l10;
                        callSite2 = m44.a("k", (long)-7792826546430413930L, (long)l10);
                        try {
                            try {
                                callSite = m44.a("u", (Object)this, (long)-7890621194806488173L, (long)l10);
                                if (callSite2 != null) break block6;
                                if (callSite == null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)n92, (long)-8143290242095072149L, (long)l10);
                            }
                            callSite = m44.a("u", (Object)this, (long)-7890621194806488173L, (long)l10);
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)n93, (long)-8143290242095072149L, (long)l10);
                        }
                    }
                    try {
                        n10 = callSite.size();
                        if (callSite2 != null) break block8;
                        if (n10 != 0) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)n94, (long)-8143290242095072149L, (long)l10);
                    }
                }
                n10 = 1;
                break block8;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    HashMap Y(Object[] var1_1) {
        var3_2 = (h5)var1_1[0];
        var4_3 = (Long)var1_1[1];
        var6_4 = (lke)var1_1[2];
        var2_5 = (String)var1_1[3];
        v0 = var4_3 = mh.b ^ var4_3;
        var7_6 = v0 ^ 31151856824154L;
        var9_7 = v0 ^ 49497623042153L;
        var11_8 = v0 ^ 77446715429225L;
        var13_9 = v0 ^ 113504496989121L;
        var15_10 = v0 ^ 125640070473727L;
        var17_11 = v0 ^ 38033652440928L;
        v1 = new Object[1];
        v1[0] = var11_8;
        var20_12 = m44.a("l", (Object)v1, (long)-5400445371182427665L, (long)var4_3);
        var19_13 = m44.a("l", (long)-5682113575018180247L, (long)var4_3);
        var21_14 = m44.a("r", (Object)this, (long)-5728117411392114324L, (long)var4_3).iterator();
        block10: while (var21_14.hasNext()) {
            v2 /* !! */  = var21_14.next();
            do {
                block24: {
                    block25: {
                        block26: {
                            block21: {
                                block23: {
                                    block22: {
                                        block20: {
                                            var22_15 = (m4)v2 /* !! */ ;
                                            v3 = new Object[1];
                                            v3[0] = var15_10;
                                            var23_16 = m44.a("s", (Object)var22_15, (Object)v3, (long)-5905868557235118922L, (long)var4_3);
                                            try {
                                                v4 = var6_4;
                                                if (var4_3 < 0L || var19_13 != null) break block20;
                                                if (v4 != null) {
                                                }
                                                ** GOTO lbl80
                                            }
                                            catch (n9 v5) {
                                                throw m44.a("l", (Object)v5, (long)-6052139781421359468L, (long)var4_3);
                                            }
                                            v4 = var6_4;
                                        }
                                        try {
                                            v6 = new Object[2];
                                            v6[1] = var23_16;
                                            v6[0] = var17_11;
                                            v7 = m44.a("s", (Object)v4, (Object)v6, (long)-5754958592694249361L, (long)var4_3);
                                            if (var19_13 != null) break block21;
                                            if (v7 != false) {
                                            }
                                            ** GOTO lbl80
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("l", (Object)v8, (long)-6052139781421359468L, (long)var4_3);
                                        }
                                        v9 = new Object[2];
                                        v9[1] = var7_6;
                                        v9[0] = var23_16;
                                        var25_18 = m44.a("s", (Object)var6_4, (Object)v9, (long)-5292361920188902362L, (long)var4_3);
                                        try {
                                            v10 = var25_18;
                                            if (var19_13 != null) break block22;
                                            if (v10 != null) {
                                            }
                                            ** GOTO lbl69
                                        }
                                        catch (n9 v11) {
                                            throw m44.a("l", (Object)v11, (long)-6052139781421359468L, (long)var4_3);
                                        }
                                        var24_17 = var25_18;
                                        try {
                                            v12 = var19_13;
                                            if (var4_3 >= 0L) {
                                                if (v12 == null) break block23;
                                            }
                                            ** GOTO lbl78
lbl69:
                                            // 2 sources

                                            v10 = var23_16;
                                        }
                                        catch (n9 v13) {
                                            throw m44.a("l", (Object)v13, (long)-6052139781421359468L, (long)var4_3);
                                        }
                                    }
                                    var24_17 = v10;
                                }
                                try {
                                    v12 = var19_13;
lbl78:
                                    // 2 sources

                                    if (var4_3 <= 0L) break block24;
                                    if (v12 == null) break block25;
lbl80:
                                    // 3 sources

                                    v14 = new Object[2];
                                    v14[1] = var9_7;
                                    v14[0] = var23_16;
                                    v7 = m44.a("s", (Object)var3_2, (Object)v14, (long)-5404761345930349631L, (long)var4_3);
                                }
                                catch (n9 v15) {
                                    throw m44.a("l", (Object)v15, (long)-6052139781421359468L, (long)var4_3);
                                }
                            }
                            if (v7 == false) break block26;
                            var24_17 = var23_16;
                            v12 = var19_13;
                            if (var4_3 < 0L) break block24;
                            if (v12 == null) break block25;
                        }
                        var24_17 = var2_5;
                    }
                    var20_12.put(var23_16, var24_17);
                    v16 = new Object[5];
                    v16[4] = var24_17;
                    v16[3] = var6_4;
                    v16[2] = var3_2;
                    v16[1] = var20_12;
                    v16[0] = var13_9;
                    m44.a("s", (Object)var22_15, (Object)v16, (long)-6322545853148126106L, (long)var4_3);
                    v12 = var19_13;
                }
                if (v12 == null) continue block10;
                v2 /* !! */  = var20_12;
            } while (var4_3 < 0L);
        }
        return v2 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    public void S(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[WHILELOOP]], but top level block is 9[WHILELOOP]
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

    public mh(long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x1FFBC8081702L;
        super(l11);
    }

    /*
     * Exception decompiling
     */
    private void k(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [51[DOLOOP]], but top level block is 20[TRYBLOCK]
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

    @Override
    public boolean W(Object[] objectArray) {
        return true;
    }

    private void I(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = ((long)n10 << 48 | l10 << 16 >>> 16) ^ b;
        long l12 = l11 ^ 0x33FB3E2ED318L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = null;
        objectArray2[1] = l12;
        objectArray2[0] = string;
        m44.a("o", (Object)this, (Object)objectArray2, (long)8652943143391991856L, (long)l11);
    }

    /*
     * Exception decompiling
     */
    private void J(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    private void j(Object[] objectArray) {
        block4: {
            String string = (String)objectArray[0];
            long l10 = (Long)objectArray[1];
            Map map = (Map)objectArray[2];
            long l11 = l10 = b ^ l10;
            long l12 = l11 ^ 0x56C16C585078L;
            long l13 = l11 ^ 0x6B7939EDD8ADL;
            int n10 = string.lastIndexOf((int)mh.b("y", (int)1801, (long)(0x2F86AD28399D1AF2L ^ l10)));
            CallSite callSite = m44.a("o", (long)-498138135598032550L, (long)l10);
            if (n10 != -1) {
                int n11;
                CallSite callSite2;
                block3: {
                    String string2 = string.substring(0, n10);
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l12;
                    objectArray2[0] = string2;
                    callSite2 = m44.a("o", (Object)objectArray2, (long)-2119819186653398710L, (long)l10);
                    try {
                        n11 = ((CallSite)callSite2).length;
                        if (callSite != null) break block3;
                        if (n11 <= 0) break block4;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-2003772936517200217L, (long)l10);
                    }
                    n11 = 0;
                }
                int n12 = n11;
                Object[] objectArray3 = new Object[4];
                objectArray3[3] = map;
                objectArray3[2] = callSite2;
                objectArray3[1] = l13;
                objectArray3[0] = n12;
                m44.a("p", (Object)this, (Object)objectArray3, (long)-1976607770988775899L, (long)l10);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private HashMap M(Object[] var1_1) {
        block108: {
            block106: {
                block107: {
                    block117: {
                        block105: {
                            block103: {
                                block98: {
                                    var2_2 = (h5)var1_1[0];
                                    var8_3 = (Long)var1_1[1];
                                    var7_4 = (lke)var1_1[2];
                                    var3_5 = (l60)var1_1[3];
                                    var5_6 = (l6q)var1_1[4];
                                    var10_7 = ((Boolean)var1_1[5]).booleanValue();
                                    var4_8 = (Map)var1_1[6];
                                    var6_9 = (Boolean)var1_1[7];
                                    v0 = var8_3 = mh.b ^ var8_3;
                                    var11_10 = v0 ^ 118448154392480L;
                                    var13_11 = v0 ^ 495894081016L;
                                    var15_12 = v0 ^ 138518282236594L;
                                    var17_13 = v0 ^ 131524958280482L;
                                    var19_14 = v0 ^ 20893589975716L;
                                    var21_15 = v0 ^ 40718273660622L;
                                    var23_16 = v0 ^ 98832375493851L;
                                    v1 = v0 ^ 107616747432238L;
                                    var25_17 = (int)(v1 >>> 32);
                                    var26_18 = (int)(v1 << 32 >>> 48);
                                    var27_19 = (int)(v1 << 48 >>> 48);
                                    v2 = v0 ^ 81406758706042L;
                                    var28_20 = (int)(v2 >>> 32);
                                    var29_21 = (int)(v2 << 32 >>> 48);
                                    var30_22 = (int)(v2 << 48 >>> 48);
                                    var31_23 = v0 ^ 27579257990004L;
                                    var33_24 = v0 ^ 90361697810695L;
                                    v3 = v0 ^ 49538680842115L;
                                    var35_25 = (int)(v3 >>> 48);
                                    var36_26 = (int)(v3 << 16 >>> 48);
                                    var37_27 = (int)(v3 << 32 >>> 32);
                                    v4 = v0 ^ 20943784105658L;
                                    var38_28 = (int)(v4 >>> 48);
                                    var39_29 = (int)(v4 << 16 >>> 32);
                                    var40_30 = (int)(v4 << 48 >>> 48);
                                    var41_31 = v0 ^ 48190190108279L;
                                    var43_32 = v0 ^ 77852742249489L;
                                    var45_33 = v0 ^ 80665783642904L;
                                    var47_34 = v0 ^ 121130475240235L;
                                    var49_35 = v0 ^ 42660331931285L;
                                    var51_36 = v0 ^ 103975058019622L;
                                    var53_37 = v0 ^ 12540467559082L;
                                    var55_38 = v0 ^ 44079493709721L;
                                    var57_39 = v0 ^ 59830143247861L;
                                    var59_40 = v0 ^ 117248318845787L;
                                    v5 = new Object[1];
                                    v5[0] = var47_34;
                                    var62_41 = m44.a("s", (Object)this, (Object)v5, (long)6658531219112269514L, (long)var8_3);
                                    v6 = new Object[2];
                                    v6[1] = var21_15;
                                    v6[0] = cf.x(var62_41.size(), var25_17, (char)var26_18, (short)var27_19);
                                    var63_42 = m44.a("l", (Object)v6, (long)4760138924168562671L, (long)var8_3);
                                    var64_43 = new l6q(var31_23, var62_41.size());
                                    var61_44 = m44.a("l", (long)4998283124634494225L, (long)var8_3);
                                    var65_45 = 0;
                                    block54: while (var65_45 < var62_41.size()) {
                                        v7 = var62_41.get(var65_45);
                                        do {
                                            block96: {
                                                block97: {
                                                    block87: {
                                                        block94: {
                                                            block95: {
                                                                block93: {
                                                                    block92: {
                                                                        block90: {
                                                                            block89: {
                                                                                block88: {
                                                                                    block86: {
                                                                                        var66_47 = (String)v7;
                                                                                        try {
                                                                                            try {
                                                                                                v8 = var2_2;
                                                                                                if (var8_3 <= 0L || var61_44 != null) break block86;
                                                                                                v9 = new Object[2];
                                                                                                v9[1] = var43_32;
                                                                                                v9[0] = var66_47;
                                                                                                if (m44.a("s", (Object)v8, (Object)v9, (long)4649410241324763065L, (long)var8_3) != false) {
                                                                                                }
                                                                                                ** GOTO lbl90
                                                                                            }
                                                                                            catch (n9 v10) {
                                                                                                throw m44.a("l", (Object)v10, (long)6375427073718643436L, (long)var8_3);
                                                                                            }
                                                                                            v8 = var63_42.put(var66_47, var66_47);
                                                                                        }
                                                                                        catch (n9 v11) {
                                                                                            throw m44.a("l", (Object)v11, (long)6375427073718643436L, (long)var8_3);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            var64_43.t(var66_47, var66_47, var59_40);
                                                                                            if (var8_3 >= 0L && var61_44 == null) break block87;
lbl90:
                                                                                            // 2 sources

                                                                                            v12 = var7_4;
                                                                                            if (var8_3 <= 0L || var61_44 != null) break block88;
                                                                                        }
                                                                                        catch (n9 v13) {
                                                                                            throw m44.a("l", (Object)v13, (long)6375427073718643436L, (long)var8_3);
                                                                                        }
                                                                                        if (v12 != null) {
                                                                                        }
                                                                                        ** GOTO lbl160
                                                                                    }
                                                                                    catch (n9 v14) {
                                                                                        throw m44.a("l", (Object)v14, (long)6375427073718643436L, (long)var8_3);
                                                                                    }
                                                                                    v12 = var7_4;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        v15 = var66_47;
                                                                                        if (var61_44 != null) break block89;
                                                                                        v16 = new Object[2];
                                                                                        v16[1] = v15;
                                                                                        v16[0] = var45_33;
                                                                                        if (m44.a("s", (Object)v12, (Object)v16, (long)4925297987943820311L, (long)var8_3) != false) {
                                                                                        }
                                                                                        ** GOTO lbl160
                                                                                    }
                                                                                    catch (n9 v17) {
                                                                                        throw m44.a("l", (Object)v17, (long)6375427073718643436L, (long)var8_3);
                                                                                    }
                                                                                    v12 = var7_4;
                                                                                    v15 = var66_47;
                                                                                }
                                                                                catch (n9 v18) {
                                                                                    throw m44.a("l", (Object)v18, (long)6375427073718643436L, (long)var8_3);
                                                                                }
                                                                            }
                                                                            v19 = new Object[2];
                                                                            v19[1] = var17_13;
                                                                            v19[0] = v15;
                                                                            var67_48 = m44.a("s", (Object)v12, (Object)v19, (long)4824950685657260126L, (long)var8_3);
                                                                            try {
                                                                                block91: {
                                                                                    try {
                                                                                        try {
                                                                                            if (var8_3 <= 0L) break block90;
                                                                                            v20 = var67_48;
                                                                                            if (var61_44 != null) break block90;
                                                                                            if (v20 == null) break block91;
                                                                                        }
                                                                                        catch (n9 v21) {
                                                                                            throw m44.a("l", (Object)v21, (long)6375427073718643436L, (long)var8_3);
                                                                                        }
                                                                                        var63_42.put(var66_47, var67_48);
                                                                                        var64_43.t(var67_48, var66_47, var59_40);
                                                                                        v22 = var61_44;
                                                                                        if (var8_3 >= 0L) {
                                                                                            if (v22 == null) break block92;
                                                                                        }
                                                                                        ** GOTO lbl159
                                                                                    }
                                                                                    catch (n9 v23) {
                                                                                        throw m44.a("l", (Object)v23, (long)6375427073718643436L, (long)var8_3);
                                                                                    }
                                                                                }
                                                                                v20 = var63_42.put(var66_47, var66_47);
                                                                            }
                                                                            catch (n9 v24) {
                                                                                throw m44.a("l", (Object)v24, (long)6375427073718643436L, (long)var8_3);
                                                                            }
                                                                        }
                                                                        var64_43.t(var66_47, var66_47, var59_40);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            block115: {
                                                                                if (var8_3 < 0L) break block115;
                                                                                v22 = var61_44;
lbl159:
                                                                                // 2 sources

                                                                                if (v22 == null) break block87;
                                                                            }
                                                                            v25 /* !! */  = var4_8;
                                                                            if (var8_3 < 0L || var61_44 != null) break block93;
                                                                        }
                                                                        catch (n9 v26) {
                                                                            throw m44.a("l", (Object)v26, (long)6375427073718643436L, (long)var8_3);
                                                                        }
                                                                        if (v25 /* !! */  == null) break block87;
                                                                    }
                                                                    catch (n9 v27) {
                                                                        throw m44.a("l", (Object)v27, (long)6375427073718643436L, (long)var8_3);
                                                                    }
                                                                    v25 /* !! */  = var4_8;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var8_3 <= 0L) break block94;
                                                                        v28 = var66_47;
                                                                        if (var61_44 != null) break block95;
                                                                        if (!v25 /* !! */ .containsKey(v28)) break block87;
                                                                    }
                                                                    catch (n9 v29) {
                                                                        throw m44.a("l", (Object)v29, (long)6375427073718643436L, (long)var8_3);
                                                                    }
                                                                    v30 = var4_8;
                                                                    v28 = var66_47;
                                                                }
                                                                catch (n9 v31) {
                                                                    throw m44.a("l", (Object)v31, (long)6375427073718643436L, (long)var8_3);
                                                                }
                                                            }
                                                            v25 /* !! */  = v30.get(v28);
                                                        }
                                                        var67_48 = (lof)v25 /* !! */ ;
                                                        try {
                                                            v32 = var61_44;
                                                            if (var8_3 <= 0L) break block96;
                                                            if (v32 != null) break block97;
                                                            v33 = new Object[1];
                                                            v33[0] = var33_24;
                                                            if (m44.a("s", var67_48, (Object)v33, (long)4695398824672683449L, (long)var8_3) != false) break block87;
                                                        }
                                                        catch (n9 v34) {
                                                            throw m44.a("l", (Object)v34, (long)6375427073718643436L, (long)var8_3);
                                                        }
                                                        v35 = new Object[1];
                                                        v35[0] = var13_11;
                                                        var68_50 = m44.a("s", (Object)var67_48, (Object)v35, (long)4926904740116926207L, (long)var8_3);
                                                        var63_42.put(var66_47, var68_50);
                                                        var64_43.t(var68_50, var66_47, var59_40);
                                                    }
                                                    ++var65_45;
                                                }
                                                v32 = var61_44;
                                            }
                                            if (v32 == null) continue block54;
                                            v7 = new ol(var28_20, (short)var29_21, (short)var30_22);
                                        } while (var8_3 <= 0L);
                                    }
                                    var65_46 = v7;
                                    v36 = new Object[1];
                                    v36[0] = var19_14;
                                    var66_47 = m44.a("s", (Object)var64_43, (Object)v36, (long)6354682181400329735L, (long)var8_3);
                                    while (var66_47.hasMoreElements()) {
                                        v37 = var66_47.nextElement();
                                        block57: while (true) {
                                            var67_48 = (String)v37;
                                            v38 = var64_43.t((char)var38_28, var67_48, var39_29, (short)var40_30);
                                            block58: while (true) {
                                                var68_50 = v38;
                                                v39 = 0;
                                                if (var61_44 != null) break block98;
                                                var69_51 = v39;
                                                block59: while (true) {
                                                    v40 /* !! */  = var69_51;
                                                    block60: while (v40 /* !! */  < var68_50.size()) {
                                                        v41 /* !! */  = var68_50.get(var69_51);
                                                        do {
                                                            block116: {
                                                                block99: {
                                                                    block100: {
                                                                        var70_54 = (String)v41 /* !! */ ;
                                                                        var71_55 = var5_6.t((char)var38_28, var70_54, var39_29, (short)var40_30);
                                                                        try {
                                                                            v42 = var61_44;
                                                                            if (var8_3 <= 0L) break block99;
                                                                            if (v42 != null) break block100;
                                                                            v38 = var71_55;
                                                                            if (var61_44 != null) continue block58;
                                                                            if (var8_3 <= 0L) continue block57;
                                                                        }
                                                                        catch (n9 v43) {
                                                                            throw m44.a("l", (Object)v43, (long)6375427073718643436L, (long)var8_3);
                                                                        }
                                                                        if (v38 != null) {
                                                                            var72_56 = 0;
                                                                            while (var72_56 < var71_55.size()) {
                                                                                block101: {
                                                                                    block102: {
                                                                                        var73_59 = (_f)var71_55.get(var72_56);
                                                                                        try {
                                                                                            v44 = var61_44;
                                                                                            if (var8_3 <= 0L) break block101;
                                                                                            if (v44 != null) break block102;
                                                                                            v45 = new Object[2];
                                                                                            v45[1] = var15_12;
                                                                                            v45[0] = var73_59;
                                                                                            v40 /* !! */  = (int)m44.a("s", (Object)var2_2, (Object)v45, (long)4756671404720683182L, (long)var8_3);
                                                                                            if (var61_44 != null || var8_3 <= 0L) continue block60;
                                                                                        }
                                                                                        catch (n9 v46) {
                                                                                            throw m44.a("l", (Object)v46, (long)6375427073718643436L, (long)var8_3);
                                                                                        }
                                                                                        try {
                                                                                            if (v40 /* !! */  != 0) {
                                                                                                var65_46.h((short)var35_25, (char)var36_26, var67_48, var37_27, var73_59.I(var23_16), var73_59);
                                                                                            }
                                                                                        }
                                                                                        catch (n9 v47) {
                                                                                            throw m44.a("l", (Object)v47, (long)6375427073718643436L, (long)var8_3);
                                                                                        }
                                                                                        ++var72_56;
                                                                                    }
                                                                                    v44 = var61_44;
                                                                                }
                                                                                if (v44 == null) continue;
                                                                            }
                                                                        }
                                                                        if (var8_3 <= 0L) break block116;
                                                                        ++var69_51;
                                                                    }
                                                                    v42 = var61_44;
                                                                }
                                                                if (v42 == null) continue block59;
                                                            }
                                                            v41 /* !! */  = var61_44;
                                                        } while (var8_3 <= 0L);
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        if (v41 /* !! */  == null) continue;
                                    }
                                    if (var8_3 <= 0L) break block117;
                                    v39 = var10_7;
                                }
                                if (v39 != 0) break block117;
                                var66_47 = (m4[])m44.a("s", (Object)m44.a("r", (Object)this, (long)4970223953710204180L, (long)var8_3), (Object)new m4[m44.a("r", (Object)this, (long)4970223953710204180L, (long)var8_3).size()], (long)4687543759372813936L, (long)var8_3);
                                try {
                                    block104: {
                                        try {
                                            try {
                                                v48 = var61_44;
                                                if (var8_3 >= 0L) {
                                                    if (v48 != null) break block103;
                                                    if (var6_9) break block104;
                                                }
                                                ** GOTO lbl327
                                            }
                                            catch (n9 v49) {
                                                throw m44.a("l", (Object)v49, (long)6375427073718643436L, (long)var8_3);
                                            }
                                            if (var8_3 <= 0L) break block105;
                                            if (m44.a("h", (long)4693898460914148383L, (long)var8_3) != false) {
                                            }
                                            ** GOTO lbl328
                                        }
                                        catch (n9 v50) {
                                            throw m44.a("l", (Object)v50, (long)6375427073718643436L, (long)var8_3);
                                        }
                                    }
                                    v51 = new Object[2];
                                    v51[1] = var55_38;
                                    v51[0] = (int)mh.b("y", (int)1296, (long)(3375624232644912290L ^ var8_3));
                                    v52 = new Object[3];
                                    v52[2] = var11_10;
                                    v52[1] = m44.a("l", (Object)v51, (long)6878524680545278030L, (long)var8_3);
                                    v52[0] = m44.a("l", (Object)var66_47, (long)4939610875702283577L, (long)var8_3);
                                    m44.a("l", (Object)v52, (long)4955647097597583526L, (long)var8_3);
                                }
                                catch (n9 v53) {
                                    throw m44.a("l", (Object)v53, (long)6375427073718643436L, (long)var8_3);
                                }
                            }
                            try {
                                if (var8_3 < 0L) break block105;
                                v48 = var61_44;
lbl327:
                                // 2 sources

                                if (v48 == null) break block105;
lbl328:
                                // 2 sources

                                m44.a("l", (Object)var66_47, (long)4633215588777462598L, (long)var8_3);
                            }
                            catch (n9 v54) {
                                throw m44.a("l", (Object)v54, (long)6375427073718643436L, (long)var8_3);
                            }
                        }
                        var67_49 = 0;
                        block63: while (var67_49 < var66_47.length) {
                            var68_50 = var66_47[var67_49];
                            try {
                                v55 = new Object[9];
                                v55[8] = var41_31;
                                v55[7] = var6_9;
                                v55[6] = var5_6;
                                v55[5] = var65_46;
                                v55[4] = var64_43;
                                v55[3] = var63_42;
                                v55[2] = var3_5;
                                v55[1] = var7_4;
                                v55[0] = var2_2;
                                m44.a("s", (Object)var68_50, (Object)v55, (long)6736630025576060022L, (long)var8_3);
                                ++var67_49;
                                do {
                                    v56 = var61_44;
                                    if (var8_3 >= 0L) {
                                        if (v56 != null) break block106;
                                        v56 = var61_44;
                                    }
                                    if (v56 == null) continue block63;
                                } while (var8_3 < 0L);
                                break block107;
                            }
                            catch (n9 v57) {
                                throw m44.a("l", (Object)v57, (long)6375427073718643436L, (long)var8_3);
                            }
                        }
                        break block107;
                    }
                    v58 = new Object[1];
                    v58[0] = var49_35;
                    var66_47 = m44.a("s", (Object)this, (Object)v58, (long)4661622217039381005L, (long)var8_3);
                    for (Object var68_50 : var66_47.keySet()) {
                        block110: {
                            block113: {
                                block114: {
                                    block111: {
                                        block112: {
                                            block109: {
                                                v59 = var63_42;
                                                if (var8_3 < 0L) break block108;
                                                var69_53 = (String)v59.get(var68_50);
                                                try {
                                                    try {
                                                        try {
                                                            if (var61_44 != null) break block106;
                                                            v60 /* !! */  = var69_53;
                                                            if (var61_44 != null) break block109;
                                                        }
                                                        catch (n9 v61) {
                                                            throw m44.a("l", (Object)v61, (long)6375427073718643436L, (long)var8_3);
                                                        }
                                                        if (v60 /* !! */  != null) break block110;
                                                    }
                                                    catch (n9 v62) {
                                                        throw m44.a("l", (Object)v62, (long)6375427073718643436L, (long)var8_3);
                                                    }
                                                    v60 /* !! */  = var4_8.get(var68_50);
                                                }
                                                catch (n9 v63) {
                                                    throw m44.a("l", (Object)v63, (long)6375427073718643436L, (long)var8_3);
                                                }
                                            }
                                            var70_54 = (lof)v60 /* !! */ ;
                                            v64 = new Object[1];
                                            v64[0] = var13_11;
                                            var71_55 = m44.a("s", (Object)var70_54, (Object)v64, (long)4926904740116926207L, (long)var8_3);
                                            var72_58 = (m0)var66_47.get(var71_55);
                                            try {
                                                if (var8_3 < 0L || var61_44 != null) break block111;
                                                if (var72_58 != null) break block112;
                                            }
                                            catch (n9 v65) {
                                                throw m44.a("l", (Object)v65, (long)6375427073718643436L, (long)var8_3);
                                            }
                                            var72_58 = this;
                                        }
                                        v66 = new Object[1];
                                        v66[0] = var57_39;
                                        v67 = new Object[9];
                                        v67[8] = var2_2;
                                        v67[7] = var7_4;
                                        v67[6] = null;
                                        v67[5] = var65_46;
                                        v67[4] = var64_43;
                                        v67[3] = false;
                                        v67[2] = (boolean)m44.a("s", (Object)((m4)var66_47.get(var68_50)), (Object)v66, (long)4860248226084829647L, (long)var8_3);
                                        v67[1] = var71_55;
                                        v67[0] = var53_37;
                                        var69_53 = m44.a("s", (Object)var3_5, (Object)v67, (long)6678620164160989677L, (long)var8_3);
                                    }
                                    try {
                                        if (var8_3 <= 0L) break block113;
                                        v68 = var71_55;
                                        if (var61_44 != null) break block113;
                                        if (v68.length() <= 0) break block114;
                                    }
                                    catch (n9 v69) {
                                        throw m44.a("l", (Object)v69, (long)6375427073718643436L, (long)var8_3);
                                    }
                                    var69_53 = (String)var71_55 + "/" + (String)var69_53;
                                }
                                v68 = var63_42.put(var68_50, var69_53);
                            }
                            var64_43.t(var69_53, var68_50, var59_40);
                        }
                        if (var61_44 == null) continue;
                    }
                }
                v70 = new Object[2];
                v70[1] = var64_43;
                v70[0] = var51_36;
                m44.a("s", (Object)this, (Object)v70, (long)5020663013074188835L, (long)var8_3);
                if (var8_3 > 0L) {
                    // empty if block
                }
            }
            v59 = var63_42;
        }
        return v59;
    }

    /*
     * Exception decompiling
     */
    private boolean E(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [45[DOLOOP]], but top level block is 20[TRYBLOCK]
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
     * Unable to fully structure code
     */
    public HashMap U(Object[] var1_1) {
        block19: {
            block16: {
                block15: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = (lke)var1_1[1];
                    v0 = var2_2 = mh.b ^ var2_2;
                    var5_4 = v0 ^ 128564027263366L;
                    var7_5 = v0 ^ 51502186461109L;
                    var9_6 = v0 ^ 90738276648606L;
                    var11_7 = v0 ^ 120226028284303L;
                    v1 = new Object[1];
                    v1[0] = var7_5;
                    var14_8 = m44.a("h", (Object)v1, (long)-7795261237831010509L, (long)var2_2);
                    var13_9 = m44.a("h", (long)-7495824350563731531L, (long)var2_2);
                    try {
                        v2 = var4_3;
                        if (var13_9 != null) break block15;
                        if (v2 == null) break block16;
                    }
                    catch (n9 v3) {
                        throw m44.a("h", (Object)v3, (long)-8440288484439115704L, (long)var2_2);
                    }
                    v2 = var4_3;
                }
                v4 = new Object[1];
                v4[0] = var9_6;
                var15_10 = m44.a("w", (Object)v2, (Object)v4, (long)-8219643916840729184L, (long)var2_2);
                var16_11 = var15_10.iterator();
                while (var16_11.hasNext()) {
                    block17: {
                        block18: {
                            var17_12 = (String)var16_11.next();
                            v5 = new Object[2];
                            v5[1] = var5_4;
                            v5[0] = var17_12;
                            var18_13 = m44.a("w", (Object)var4_3, (Object)v5, (long)-8047465898494708998L, (long)var2_2);
                            try {
                                try {
                                    if (var2_2 <= 0L) ** GOTO lbl65
                                    v6 = var18_13;
                                    if (var13_9 == null) {
                                        if (var13_9 != null) break block17;
                                    }
                                    ** GOTO lbl64
                                }
                                catch (n9 v7) {
                                    throw m44.a("h", (Object)v7, (long)-8440288484439115704L, (long)var2_2);
                                }
                                if (v6 != null) break block18;
                            }
                            catch (n9 v8) {
                                throw m44.a("h", (Object)v8, (long)-8440288484439115704L, (long)var2_2);
                            }
                            var18_13 = var17_12;
                        }
                        var14_8.put(var17_12, var18_13);
                    }
                    if (var13_9 == null) continue;
                }
            }
            v9 = new Object[1];
            v9[0] = var11_7;
            var15_10 = m44.a("w", (Object)this, (Object)v9, (long)-8159438753580006290L, (long)var2_2);
            var16_11 = var15_10.iterator();
            while (var16_11.hasNext()) {
                block21: {
                    block20: {
                        v6 = (String)var16_11.next();
lbl64:
                        // 2 sources

                        var17_12 = v6;
lbl65:
                        // 2 sources

                        try {
                            try {
                                try {
                                    v10 = var14_8;
                                    if (var13_9 != null) break block19;
                                    v11 = var17_12;
                                    if (var13_9 != null) break block20;
                                }
                                catch (n9 v12) {
                                    throw m44.a("h", (Object)v12, (long)-8440288484439115704L, (long)var2_2);
                                }
                                if (m44.a("w", (Object)v10, (Object)v11, (long)-8528763332449066535L, (long)var2_2) != false) break block21;
                            }
                            catch (n9 v13) {
                                throw m44.a("h", (Object)v13, (long)-8440288484439115704L, (long)var2_2);
                            }
                            v14 = var14_8;
                            v11 = var17_12;
                        }
                        catch (n9 v15) {
                            throw m44.a("h", (Object)v15, (long)-8440288484439115704L, (long)var2_2);
                        }
                    }
                    v14.put(v11, var17_12);
                }
                if (var13_9 == null) continue;
            }
            v10 = var14_8;
        }
        return v10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ol m(Object[] var1_1) {
        var4_2 = (Iterator)var1_1[0];
        var2_3 = (Long)var1_1[1];
        v0 = var2_3 = mh.b ^ var2_3;
        v1 = v0 ^ 35812231746846L;
        var5_4 = (int)(v1 >>> 48);
        var6_5 = (int)(v1 << 16 >>> 48);
        var7_6 = (int)(v1 << 32 >>> 32);
        var8_7 = v0 ^ 109636872161718L;
        v2 = v0 ^ 78708711631335L;
        var10_8 = (int)(v2 >>> 32);
        var11_9 = (int)(v2 << 32 >>> 48);
        var12_10 = (int)(v2 << 48 >>> 48);
        var14_11 = new ol(var10_8, (short)var11_9, (short)var12_10);
        v3 = m44.a("i", (long)4017340168184289164L, (long)var2_3);
        v4 = new Object[1];
        v4[0] = var8_7;
        var15_12 = m44.a("v", (Object)this, (Object)v4, (long)3385254747201758295L, (long)var2_3);
        m44.a("i", (Object)var15_12, (Object)m44.a("i", (long)3956457066160399843L, (long)var2_3), (long)3937414318474429263L, (long)var2_3);
        var13_13 = v3;
        block22: while (var4_2.hasNext()) {
            v5 /* !! */  = var4_2.next();
            do {
                block40: {
                    block39: {
                        block35: {
                            var16_14 = (String)v5 /* !! */ ;
                            var16_14 = var16_14.replace((char)m44.a("m", (long)3424745225261884816L, (long)var2_3), (char)mh.b("y", (int)20940, (long)(9222944427883954914L ^ var2_3)));
                            var17_15 = 0;
                            var18_16 = 0;
                            while (var18_16 < var15_12.size()) {
                                block33: {
                                    block34: {
                                        block37: {
                                            block38: {
                                                block36: {
                                                    var19_18 = (String)var15_12.get(var18_16);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v6 = var13_13;
                                                                            if (var2_3 < 0L) break block33;
                                                                            if (v6 != null) break block34;
                                                                            v7 = (int)var16_14.startsWith(var19_18);
                                                                            v8 = var13_13;
                                                                            if (var2_3 > 0L) {
                                                                                if (v8 != null) break block35;
                                                                            }
                                                                            ** GOTO lbl109
                                                                        }
                                                                        catch (n9 v9) {
                                                                            throw m44.a("i", (Object)v9, (long)3091471250448128113L, (long)var2_3);
                                                                        }
                                                                        if (v7 != 0) {
                                                                        }
                                                                        ** GOTO lbl94
                                                                    }
                                                                    catch (n9 v10) {
                                                                        throw m44.a("i", (Object)v10, (long)3091471250448128113L, (long)var2_3);
                                                                    }
                                                                    v11 = var16_14.length();
                                                                    v12 /* !! */  = var19_18.length();
                                                                    if (var2_3 < 0L || var13_13 != null) break block36;
                                                                }
                                                                catch (n9 v13) {
                                                                    throw m44.a("i", (Object)v13, (long)3091471250448128113L, (long)var2_3);
                                                                }
                                                                if (v11 > v12 /* !! */ ) {
                                                                }
                                                                ** GOTO lbl94
                                                            }
                                                            catch (n9 v14) {
                                                                throw m44.a("i", (Object)v14, (long)3091471250448128113L, (long)var2_3);
                                                            }
                                                            if (var2_3 <= 0L) break block37;
                                                            v11 = var16_14.charAt(var19_18.length());
                                                            if (var13_13 != null) break block38;
                                                        }
                                                        catch (n9 v15) {
                                                            throw m44.a("i", (Object)v15, (long)3091471250448128113L, (long)var2_3);
                                                        }
                                                        v12 /* !! */  = (int)mh.b("y", (int)1801, (long)(3424594648869360676L ^ var2_3));
                                                    }
                                                    catch (n9 v16) {
                                                        throw m44.a("i", (Object)v16, (long)3091471250448128113L, (long)var2_3);
                                                    }
                                                }
                                                try {
                                                    if (v11 == v12 /* !! */ ) {
                                                        var14_11.h((short)var5_4, (char)var6_5, var19_18, var7_6, var16_14.substring(var19_18.length()), var16_14);
                                                        v11 = 1;
                                                    }
                                                    ** GOTO lbl94
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("i", (Object)v17, (long)3091471250448128113L, (long)var2_3);
                                                }
                                            }
                                            var17_15 = v11;
                                        }
                                        try {
                                            if (var2_3 >= 0L) {
                                                if (var13_13 == null) break;
                                            }
                                            break block34;
lbl94:
                                            // 4 sources

                                            ++var18_16;
                                        }
                                        catch (n9 v18) {
                                            throw m44.a("i", (Object)v18, (long)3091471250448128113L, (long)var2_3);
                                        }
                                    }
                                    v6 = var13_13;
                                }
                                if (v6 == null) continue;
                            }
                            if (var2_3 < 0L) ** GOTO lbl-1000
                            v7 = var17_15;
                        }
                        try {
                            try {
                                try {
                                    v8 = var13_13;
lbl109:
                                    // 2 sources

                                    if (v8 != null) break block39;
                                    if (v7 != 0) break block40;
                                }
                                catch (n9 v19) {
                                    throw m44.a("i", (Object)v19, (long)3091471250448128113L, (long)var2_3);
                                }
                                v20 = var16_14;
                                if (var13_13 == null) {
                                }
                                ** GOTO lbl129
                            }
                            catch (n9 v21) {
                                throw m44.a("i", (Object)v21, (long)3091471250448128113L, (long)var2_3);
                            }
                            v7 = v20.charAt(0);
                        }
                        catch (n9 v22) {
                            throw m44.a("i", (Object)v22, (long)3091471250448128113L, (long)var2_3);
                        }
                    }
                    if (v7 == mh.b("y", (int)1801, (long)(3424594648869360676L ^ var2_3))) {
                        var18_17 = var16_14;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v20 = (char)mh.b("y", (int)1801, (long)(3424594648869360676L ^ var2_3)) + var16_14;
lbl129:
                        // 2 sources

                        var18_17 = v20;
                    }
                    var14_11.h((short)var5_4, (char)var6_5, "", var7_6, var18_17, var16_14);
                }
                if (var13_13 == null) continue block22;
                v5 /* !! */  = var14_11;
            } while (var2_3 <= 0L);
        }
        return v5 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        mh.b = prr.a(-837715406010584892L, 609494386436613307L, MethodHandles.lookup().lookupClass()).a(212376703266791L);
                        mh.e = new HashMap<K, V>(13);
                        var11 = mh.b ^ 12791053156842L;
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
                        var20_3 = new String[29];
                        var18_4 = 0;
                        var17_5 = "\u0013\u00f7\u00db\n\u001f.3\u00e3{\u001c\u0017\u0096\u00d5\u008e\u001d\u00ba\u0010\u00e8%\u0080\u00d2\u00ed\u009a\u00f3\u009c;\u00adt\u001b\u00c2\u0090\u0092c\u008d\u0000k*\u00d9%\u008b'\u00db\"\u00ab\u00f85\u00a1\u00c3\u00a1g\u0099\u00fe\u0091`\u001c\u00fa{Wg?\u00f6{\u0000/@\u0007\u00ddw\u00c7\u00d2\u00a8\u00e2\u0012/6\u00ea\u00b7\u00e67HH\u009f\u00e5\u0095\u00b6\u00e7*\u0099\u00be\u00a8\u009b\u0000\u00a41\u0086\u00f5Z\u00e8^\u009a[\u00d7\u00b1\u00a5\u0097\u0019lq\u00f1\u00b8<\u00eck\u00e89\u00e3\u0085\u001dX\u0000\u0003#\u00d6\u0002\u00c6\u00ac\u00c6\u0001\u00eb(ez\u008b\u0015\u00cb\u0097\u00f5{\u00bd\u0096x\u0097\u0080~\u00a0\u0088O\u00862\u00d3\"\u00cb^\b\u00c8\u00ea{=\u0007\u00b7\u00d8\u008e\u00b0\u00de\u00f7\u00fe\u0092\u00ef\u0083+(\u00fc\u00d0\u00c9\u0083\u00a4\u00a7\u009e\u0098#\u00cb\fN:\rj\u00b3\u0098\u00fc~\u0011r\u0000C\u00dd\u009d*J\u00a7\u00e9}\u00e6k\u00dcR\u0085w\u00f3\u0006\u0011\u001d(\u00f3\u00ade(Rs_-K\u0096\u009d\u009ds;\u0010e\u00cd\u0081\u0083\t\u00d2.\u0014\u00a7\u00e4\u00a9\u00fdw\u0099\u00a5\u00d3\u008bu\u00b1'\u00a2>\u00ffd= \u009cP\u00e3\u00ae\u000e~\u00bb\u0097\u008a\u00a0\r\u0087\u00d5\u00e7)\u00d3\u00c8\u00ea^)\u00f8\u00c6\u00f7\u00e7RmDv\u009ai\u00a5\u00f9(6\u001cG\u007f\u00d7\u00d2\u00f9\u000b{\u00c1\u00f1\u00e7\u00cf\u0089\u00d9\u0006r@\u00c0\u00e1j\u00e0e\u008d\u0004g\u009c\u0090\u00e4\u00f4\u00f9\u0094\u0085\u007f\u00caI\u000b2\u000b\u00068Y\tA\u00cf\"\u008aY0\u00ec\u00ec\u00b4gUp\u00a1^\u001a\u00ed:\u0007\u00d3\u00da\u00a9\f\u00d63\u00ea\u00cd{\u0090\u008dz\\:\u00a9\u00c8\u0001u\u0088_4\u00e6h\u00b7$\u00f5g\u0087\u0004\u00a1\u00b0\u00b5\u00e6\u0018\u00cc\u00d20)\u00fe\u00f1f6\u00c5\f\u00f0\u00d9i\u00ba\u00a22\u00ef(\u001b\u009f3\u00f59\u00c1\u008c5\u00cb\u00a0\u00a4\u0005\u0090&\u00a0d!\u0087\u000b{\u008a\u00d8\u00e5t)\u0092]?\u00fd\u00ed&6\u0005 \u00d7PN\u008d\u0000\"\n\u001b\u00cc\u00f0\u009cu\u00ea\u009b\u00e1\u008b(%Vs\u00ac]\u00bb<\u000f\u00c3\u00d6\u0087\bg\u00cc% \u0084\u00f0\u00a8\u00d8X\u008e\u00a5\b\u00c3\u00ecN5\u00b6\u008b\u0090\u00fd\u0016\u00bc\u00b7\u00c2M[\u0080\u0011@||\"\u00d1\u000f\u0012\u00a4\u0010\u0015\f\u00d5\u008c\u009fV\\\u00d5\u00e5\u0087\u00b37\u00c8&\u00ec.02\u00a4\u0098\u00822OzmP\u00c1\u00c1\u00f0s\u00e8D{\u00f3\u00fc\r\u008e#8'\u00ed\u00f5{\u0088l:\u0004\u008d\u00ff1\u00e6\u00e5E\u0098\u001c\u0088\r\u00bb2\u00dc\u00b1U+kl \u00feeY6\u0019L\u0018O>\u0091abh\u00b0A@\u00d8\u00efc\u00bdu\u0080\u00b5^O\u00b9\u00ba\u00bb\u00e2;\u00dd10\u0094\u00f9\u0004u\u0015\u00dc#\u00cb<\u00f1@\u00d0\u00d7\u00bdZ[\u00f2\u008c\u00dd\u00ef\u00d4\u00e4\u00b1\u00f1\u0083(\u008dk\u00d0\u00a6G\u00caah\u00a7\u0014\u00e8\u00eeV\u0002VV|\u0002)#)W\u0010\u00bc\u00ab\u00aez\u008f\u0003V\u00f9t\u001b\u00df\u0081\u00bd\u00ab$\u00cf8\u00bd\u00d3k\u009c\u0099\u0086\u00d3)\u0096\u00fa\fZe\u0085\u0081\u0085u\u009a\u009e\u00ef\u00c2o\u00d7e\u00d6\u00a9\u0089\rK*M(g\u00db\u00e2+\u00c6\u00d3\u00af\u00ab\u00e3\u001f\u00a2j\u00cd,\u0018\u000e\u0002J\u00b8 \u0005\u00dd\u0005U@pH\u00fc\u00bbK\u0096\u00eb\u001ff\u00bd\u00bc4\u0014\u009f\u00ffVA\u0083!HM\u00a1\u00aeN6\u0098{\u00c3\u00bc\u0085\u00a86\u0098f/7\u00a9\u00b71\u00c5w\u0012\u0093\u00eb\u0006\u0087\u00aazZeQ\u00db\u0016\u00ceu\u00e5\u00b5h0\u001f\u00dfd\u0083\u00fc *\u009b\u00e5G\u001cr\u0081\u00da\u0088M\u000b\u00d5\u0002c\u00a5\u00b2\u00de\u00ef11\u008cb\u00a4\u00c0?P\u00e5'\r6\u00a6! \u009ae\u00bd\u0094B^.\u00f1\u009c\u007f\u00ff{\u00e0=hT1\u00f3\f\u00d1\u00c5w\r\u00a3>(\u0014o\u000b\u00b8\u0091\u00dd\u0018\u00c3\u00e2\u00cb\u00cc\u0094\u00a7\u0000\u00a2\u0004\u00e7\u00b7\u00b5\u00bf\u00f3?\"\u00a7\u00f5\\`\u00e2{\u00fdE(\u00d1p\u0019\u00dc\u00f5\"\u0096?\u001ai\u00e1o\u00c9\u00b9\u0093-c\u00b0\u00d2\u009c\u00b1\u00bd\u00d7\u00e1\u008b\u00b9\"\u0087W\u0000F\u00eeOG\u0094\u0087\u00c3os\u0082\u0010KJ\u00bd\u008c\u0012\u0090\u0002\u001b\u007f\u00ecn\u00feaX\u0081\u00e1HQ\u00d6`o\u00c0+\u007f\u00d2\u001cY\u00c4\u00fa\u00d4[\u00ff\u00e5\u0096e\u00dd\u00a3\u009b\u00c0{\u00b9\u00ee03n\u00bbM_\u001e\u0014k\u00a1X7\u00d07C\u00b9\u008b\u00f2/\u0007n\u0082\u008e\u00a3Z\u0007,\u00dc>\u00d0G\u0002\u00f3x\u00e7z\u00fe\u0007\u00baXM\u0088\u000e\u00c0\u00d0\u00fc\u00fdX\u009bP\u00cb[\u00d2F\u0010\tp]\u00a6\u00e7\u00c4\u009a^\u00f8:\\\u00d2\u00f8\u0093\u00f7A62$\u008c_\r\u00c7\u0013\u00db'nyW\u009a\u00ed\u00a4\u00f5\u00f7\u00f8U\u00d7\u0080\u00b1\u00cc\u001e\u00cf\u00a0\u0098\u001d\u00a3T\u00cc!\u0005M\u0082\u0084G\u0090\u00ac\u00c1m\u0005\u0000s\u00f0\u0089\u001cH\u00dc\u00fe\u0012\u0017\u00c5\u00b9?;J\u00ce\u0091\u00a5\b\u00d1\u00e7<8\u00f5\u00bb\u00cb\u008bk\u00c4\u00bf\u0081\u00b1\u008c\u00fa\u00d2\u0011[\u008fD\u00fenW\f\u0092\u0000\u00e6\u00b2\u00cf\u00db\u00d6Hy\u0013\u0085\u001e@\u00c2\u009c}\u00b0\u00ba\u008c\u00ae)\u00ad\u00d3to\u0084\u00d6\u001a`\u00fc\u00e3\u00e8Q_\u00c9v \\\u008c\u0093'\u00ecc\u0017ZJ\u00cc\u00c7\u009f\u00e9\u00fc2p^\u00f9\u0005\u00c8\u00bb\u00d6\u008eA\u00e9\u0083B\u0082&*\u0010P";
                        var19_6 = "\u0013\u00f7\u00db\n\u001f.3\u00e3{\u001c\u0017\u0096\u00d5\u008e\u001d\u00ba\u0010\u00e8%\u0080\u00d2\u00ed\u009a\u00f3\u009c;\u00adt\u001b\u00c2\u0090\u0092c\u008d\u0000k*\u00d9%\u008b'\u00db\"\u00ab\u00f85\u00a1\u00c3\u00a1g\u0099\u00fe\u0091`\u001c\u00fa{Wg?\u00f6{\u0000/@\u0007\u00ddw\u00c7\u00d2\u00a8\u00e2\u0012/6\u00ea\u00b7\u00e67HH\u009f\u00e5\u0095\u00b6\u00e7*\u0099\u00be\u00a8\u009b\u0000\u00a41\u0086\u00f5Z\u00e8^\u009a[\u00d7\u00b1\u00a5\u0097\u0019lq\u00f1\u00b8<\u00eck\u00e89\u00e3\u0085\u001dX\u0000\u0003#\u00d6\u0002\u00c6\u00ac\u00c6\u0001\u00eb(ez\u008b\u0015\u00cb\u0097\u00f5{\u00bd\u0096x\u0097\u0080~\u00a0\u0088O\u00862\u00d3\"\u00cb^\b\u00c8\u00ea{=\u0007\u00b7\u00d8\u008e\u00b0\u00de\u00f7\u00fe\u0092\u00ef\u0083+(\u00fc\u00d0\u00c9\u0083\u00a4\u00a7\u009e\u0098#\u00cb\fN:\rj\u00b3\u0098\u00fc~\u0011r\u0000C\u00dd\u009d*J\u00a7\u00e9}\u00e6k\u00dcR\u0085w\u00f3\u0006\u0011\u001d(\u00f3\u00ade(Rs_-K\u0096\u009d\u009ds;\u0010e\u00cd\u0081\u0083\t\u00d2.\u0014\u00a7\u00e4\u00a9\u00fdw\u0099\u00a5\u00d3\u008bu\u00b1'\u00a2>\u00ffd= \u009cP\u00e3\u00ae\u000e~\u00bb\u0097\u008a\u00a0\r\u0087\u00d5\u00e7)\u00d3\u00c8\u00ea^)\u00f8\u00c6\u00f7\u00e7RmDv\u009ai\u00a5\u00f9(6\u001cG\u007f\u00d7\u00d2\u00f9\u000b{\u00c1\u00f1\u00e7\u00cf\u0089\u00d9\u0006r@\u00c0\u00e1j\u00e0e\u008d\u0004g\u009c\u0090\u00e4\u00f4\u00f9\u0094\u0085\u007f\u00caI\u000b2\u000b\u00068Y\tA\u00cf\"\u008aY0\u00ec\u00ec\u00b4gUp\u00a1^\u001a\u00ed:\u0007\u00d3\u00da\u00a9\f\u00d63\u00ea\u00cd{\u0090\u008dz\\:\u00a9\u00c8\u0001u\u0088_4\u00e6h\u00b7$\u00f5g\u0087\u0004\u00a1\u00b0\u00b5\u00e6\u0018\u00cc\u00d20)\u00fe\u00f1f6\u00c5\f\u00f0\u00d9i\u00ba\u00a22\u00ef(\u001b\u009f3\u00f59\u00c1\u008c5\u00cb\u00a0\u00a4\u0005\u0090&\u00a0d!\u0087\u000b{\u008a\u00d8\u00e5t)\u0092]?\u00fd\u00ed&6\u0005 \u00d7PN\u008d\u0000\"\n\u001b\u00cc\u00f0\u009cu\u00ea\u009b\u00e1\u008b(%Vs\u00ac]\u00bb<\u000f\u00c3\u00d6\u0087\bg\u00cc% \u0084\u00f0\u00a8\u00d8X\u008e\u00a5\b\u00c3\u00ecN5\u00b6\u008b\u0090\u00fd\u0016\u00bc\u00b7\u00c2M[\u0080\u0011@||\"\u00d1\u000f\u0012\u00a4\u0010\u0015\f\u00d5\u008c\u009fV\\\u00d5\u00e5\u0087\u00b37\u00c8&\u00ec.02\u00a4\u0098\u00822OzmP\u00c1\u00c1\u00f0s\u00e8D{\u00f3\u00fc\r\u008e#8'\u00ed\u00f5{\u0088l:\u0004\u008d\u00ff1\u00e6\u00e5E\u0098\u001c\u0088\r\u00bb2\u00dc\u00b1U+kl \u00feeY6\u0019L\u0018O>\u0091abh\u00b0A@\u00d8\u00efc\u00bdu\u0080\u00b5^O\u00b9\u00ba\u00bb\u00e2;\u00dd10\u0094\u00f9\u0004u\u0015\u00dc#\u00cb<\u00f1@\u00d0\u00d7\u00bdZ[\u00f2\u008c\u00dd\u00ef\u00d4\u00e4\u00b1\u00f1\u0083(\u008dk\u00d0\u00a6G\u00caah\u00a7\u0014\u00e8\u00eeV\u0002VV|\u0002)#)W\u0010\u00bc\u00ab\u00aez\u008f\u0003V\u00f9t\u001b\u00df\u0081\u00bd\u00ab$\u00cf8\u00bd\u00d3k\u009c\u0099\u0086\u00d3)\u0096\u00fa\fZe\u0085\u0081\u0085u\u009a\u009e\u00ef\u00c2o\u00d7e\u00d6\u00a9\u0089\rK*M(g\u00db\u00e2+\u00c6\u00d3\u00af\u00ab\u00e3\u001f\u00a2j\u00cd,\u0018\u000e\u0002J\u00b8 \u0005\u00dd\u0005U@pH\u00fc\u00bbK\u0096\u00eb\u001ff\u00bd\u00bc4\u0014\u009f\u00ffVA\u0083!HM\u00a1\u00aeN6\u0098{\u00c3\u00bc\u0085\u00a86\u0098f/7\u00a9\u00b71\u00c5w\u0012\u0093\u00eb\u0006\u0087\u00aazZeQ\u00db\u0016\u00ceu\u00e5\u00b5h0\u001f\u00dfd\u0083\u00fc *\u009b\u00e5G\u001cr\u0081\u00da\u0088M\u000b\u00d5\u0002c\u00a5\u00b2\u00de\u00ef11\u008cb\u00a4\u00c0?P\u00e5'\r6\u00a6! \u009ae\u00bd\u0094B^.\u00f1\u009c\u007f\u00ff{\u00e0=hT1\u00f3\f\u00d1\u00c5w\r\u00a3>(\u0014o\u000b\u00b8\u0091\u00dd\u0018\u00c3\u00e2\u00cb\u00cc\u0094\u00a7\u0000\u00a2\u0004\u00e7\u00b7\u00b5\u00bf\u00f3?\"\u00a7\u00f5\\`\u00e2{\u00fdE(\u00d1p\u0019\u00dc\u00f5\"\u0096?\u001ai\u00e1o\u00c9\u00b9\u0093-c\u00b0\u00d2\u009c\u00b1\u00bd\u00d7\u00e1\u008b\u00b9\"\u0087W\u0000F\u00eeOG\u0094\u0087\u00c3os\u0082\u0010KJ\u00bd\u008c\u0012\u0090\u0002\u001b\u007f\u00ecn\u00feaX\u0081\u00e1HQ\u00d6`o\u00c0+\u007f\u00d2\u001cY\u00c4\u00fa\u00d4[\u00ff\u00e5\u0096e\u00dd\u00a3\u009b\u00c0{\u00b9\u00ee03n\u00bbM_\u001e\u0014k\u00a1X7\u00d07C\u00b9\u008b\u00f2/\u0007n\u0082\u008e\u00a3Z\u0007,\u00dc>\u00d0G\u0002\u00f3x\u00e7z\u00fe\u0007\u00baXM\u0088\u000e\u00c0\u00d0\u00fc\u00fdX\u009bP\u00cb[\u00d2F\u0010\tp]\u00a6\u00e7\u00c4\u009a^\u00f8:\\\u00d2\u00f8\u0093\u00f7A62$\u008c_\r\u00c7\u0013\u00db'nyW\u009a\u00ed\u00a4\u00f5\u00f7\u00f8U\u00d7\u0080\u00b1\u00cc\u001e\u00cf\u00a0\u0098\u001d\u00a3T\u00cc!\u0005M\u0082\u0084G\u0090\u00ac\u00c1m\u0005\u0000s\u00f0\u0089\u001cH\u00dc\u00fe\u0012\u0017\u00c5\u00b9?;J\u00ce\u0091\u00a5\b\u00d1\u00e7<8\u00f5\u00bb\u00cb\u008bk\u00c4\u00bf\u0081\u00b1\u008c\u00fa\u00d2\u0011[\u008fD\u00fenW\f\u0092\u0000\u00e6\u00b2\u00cf\u00db\u00d6Hy\u0013\u0085\u001e@\u00c2\u009c}\u00b0\u00ba\u008c\u00ae)\u00ad\u00d3to\u0084\u00d6\u001a`\u00fc\u00e3\u00e8Q_\u00c9v \\\u008c\u0093'\u00ecc\u0017ZJ\u00cc\u00c7\u009f\u00e9\u00fc2p^\u00f9\u0005\u00c8\u00bb\u00d6\u008eA\u00e9\u0083B\u0082&*\u0010P".length();
                        var16_7 = 64;
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
                            var20_3[var18_4++] = mh.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u008d\u00b1\t\u00977\u008f\u008cN9\u00d3\u00e0\u00fb\u009dxJBk\u008dQ0\f\u000e\u00c1\u0002@\u0092\u00ca\u00c3\u001f;\n\u00d6\u00e5\u00ca\u00ef\u00fc\u008f\u00fc(\u00d0\u00b0\u001eoDp\u00d8(\u00fcd\u009d\u00c6\u00e1J\t(\u00ab\u009fX\u00d8`\u00cc\u0017\u008b\u00034\u00a0\u00b4\u0004\u008dh\u000f \u009a\u0017F\u00d7\u00dad\u00c9\u00ebh\u0090\u00e4\u009bq\u00e7\u0085#\u00b0";
                            var19_6 = "\u008d\u00b1\t\u00977\u008f\u008cN9\u00d3\u00e0\u00fb\u009dxJBk\u008dQ0\f\u000e\u00c1\u0002@\u0092\u00ca\u00c3\u001f;\n\u00d6\u00e5\u00ca\u00ef\u00fc\u008f\u00fc(\u00d0\u00b0\u001eoDp\u00d8(\u00fcd\u009d\u00c6\u00e1J\t(\u00ab\u009fX\u00d8`\u00cc\u0017\u008b\u00034\u00a0\u00b4\u0004\u008dh\u000f \u009a\u0017F\u00d7\u00dad\u00c9\u00ebh\u0090\u00e4\u009bq\u00e7\u0085#\u00b0".length();
                            var16_7 = 24;
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
                            var20_3[var18_4++] = mh.a(var21_9).intern();
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
                mh.c = var20_3;
                mh.d = new String[29];
                mh.j = new HashMap<K, V>(13);
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
                var4_14 = "byE\u00a0\u00c1\u00cff\u00f7F\u00e2\u008b\u0092`\u00b7\u0096t";
                var5_15 = "byE\u00a0\u00c1\u00cff\u00f7F\u00e2\u008b\u0092`\u00b7\u0096t".length();
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
                    var4_14 = "0\u0090A\u00d8\u00df\u00eb\u00fa~\u00d8\u00ec\u00e3Is\u008br\u008e";
                    var5_15 = "0\u0090A\u00d8\u00df\u00eb\u00fa~\u00d8\u00ec\u00e3Is\u008br\u008e".length();
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
        mh.f = var6_12;
        mh.h = new Integer[4];
    }

    private static n9 b(n9 n92) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x26DC;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/mh", exception);
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
            mh.d[n11] = mh.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = mh.a(n10, l10);
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
            throw new RuntimeException("com/zelix/mh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6FE1;
        if (h[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/mh", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mh.h[n11] = n12;
        }
        return h[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = mh.b(n10, l10);
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
            throw new RuntimeException("com/zelix/mh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(mh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

