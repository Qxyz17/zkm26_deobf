/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._6;
import com.zelix._f;
import com.zelix._y;
import com.zelix.ag;
import com.zelix.aw;
import com.zelix.b1;
import com.zelix.b4;
import com.zelix.bs;
import com.zelix.ee;
import com.zelix.gs;
import com.zelix.gv;
import com.zelix.h1;
import com.zelix.ht;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.jv;
import com.zelix.ke;
import com.zelix.kt;
import com.zelix.kw;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.lk0;
import com.zelix.lmm;
import com.zelix.loe;
import com.zelix.lox;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n0;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.y_;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class _v
extends _4
implements Comparable,
ag {
    kw[] w;
    private final byte[] u;
    boolean x;
    jv c;
    List W;
    String d;
    private boolean A;
    kt T;
    Integer P;
    boolean K;
    int n;
    boolean E;
    private bs F;
    int l;
    String I;
    int H;
    jv r;
    final int V;
    int O;
    int h;
    boolean k;
    boolean a;
    boolean Z;
    jv[] o;
    int U;
    int b;
    private List M;
    String G;
    _v C;
    private static int[] y;
    private static final long ab;
    private static final String[] eb;
    private static final String[] fb;
    private static final Map gb;
    private static final long[] kb;
    private static final Integer[] lb;
    private static final Map mb;

    /*
     * Unable to fully structure code
     */
    public final b1[] J(Object[] var1_1) {
        block23: {
            block25: {
                block24: {
                    block19: {
                        var2_2 = (lox)var1_1[0];
                        var3_3 = (Long)var1_1[1];
                        v0 = var3_3 = _v.ab ^ var3_3;
                        var5_4 = v0 ^ 15584738933199L;
                        var7_5 = v0 ^ 121733880676781L;
                        var9_6 = v0 ^ 24232037928742L;
                        var12_7 = this.A(var9_6);
                        var13_8 = new ArrayList<b1>();
                        var11_9 = m44.a("j", (long)-8780972685042920764L, (long)var3_3);
                        var14_10 = 0;
                        while (var14_10 < var12_7.length) {
                            block21: {
                                block22: {
                                    block20: {
                                        try {
                                            try {
                                                try {
                                                    v1 = (int)var12_7[var14_10].Z(var7_5).equals(var2_2.v());
                                                    v2 = var11_9;
                                                    if (var3_3 < 0L) ** GOTO lbl64
                                                    if (v2 != false) break block19;
                                                    v3 = var11_9;
                                                    if (var3_3 > 0L) {
                                                        if (v3 != false) break block20;
                                                    }
                                                    ** GOTO lbl44
                                                }
                                                catch (n9 v4) {
                                                    throw m44.a("j", (Object)v4, (long)-7464603944955948993L, (long)var3_3);
                                                }
                                                if (var3_3 < 0L) break block21;
                                                if (v1 == 0) break block22;
                                            }
                                            catch (n9 v5) {
                                                throw m44.a("j", (Object)v5, (long)-7464603944955948993L, (long)var3_3);
                                            }
                                            v6 = new Object[1];
                                            v6[0] = var5_4;
                                            v7 = m44.a("u", (Object)var12_7[var14_10], (Object)v6, (long)-8995463932522715960L, (long)var3_3).equals(m44.a("u", (Object)var2_2, (Object)new Object[0], (long)-9172116206018697664L, (long)var3_3));
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("j", (Object)v8, (long)-7464603944955948993L, (long)var3_3);
                                        }
                                    }
                                    try {
                                        try {
                                            v3 = var11_9;
lbl44:
                                            // 2 sources

                                            if (v3 != false || !v7) break block22;
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("j", (Object)v9, (long)-7464603944955948993L, (long)var3_3);
                                        }
                                        v7 = var13_8.add(var12_7[var14_10]);
                                    }
                                    catch (n9 v10) {
                                        throw m44.a("j", (Object)v10, (long)-7464603944955948993L, (long)var3_3);
                                    }
                                }
                                ++var14_10;
                                v11 = var11_9;
                            }
                            if (v11 == false) continue;
                        }
                        v12 = var13_8;
                        if (var3_3 < 0L) break block25;
                        v1 = v12.size();
                    }
                    try {
                        try {
                            v2 = var11_9;
lbl64:
                            // 2 sources

                            if (v2 != false) break block23;
                            if (v1 != 0) break block24;
                        }
                        catch (n9 v13) {
                            throw m44.a("j", (Object)v13, (long)-7464603944955948993L, (long)var3_3);
                        }
                        return null;
                    }
                    catch (n9 v14) {
                        throw m44.a("j", (Object)v14, (long)-7464603944955948993L, (long)var3_3);
                    }
                }
                v12 = var13_8;
            }
            v1 = v12.size();
        }
        var14_11 = new b1[v1];
        return var13_8.toArray(var14_11);
    }

    void m(Object[] objectArray) {
        boolean bl2;
        _v _v2;
        long l10;
        block2: {
            block3: {
                boolean bl3 = (Boolean)objectArray[0];
                l10 = (Long)objectArray[1];
                l10 = ab ^ l10;
                CallSite callSite = m44.a("o", (long)6455581370907896030L, (long)l10);
                m44.a("s", (Object)this, (boolean)bl3, (long)5027510211850820814L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    _v2 = this;
                    bl2 = bl3;
                    if (callSite2 == false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)6883036033692211154L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        m44.a("s", (Object)_v2, (boolean)bl2, (long)6568171108026521463L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public Set x(Object[] var1_1) {
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

    /*
     * Exception decompiling
     */
    public final b4 O(Object[] var1_1) {
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
    public final String p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.I.replace((char)_v.c("i", (int)13430, (long)(0x4E26F87FE7A1B444L ^ l10)), (char)_v.c("i", (int)16286, (long)(0x4211D996A9ED3FA1L ^ l10)));
    }

    /*
     * Exception decompiling
     */
    private gv r(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [27[DOLOOP]], but top level block is 39[SIMPLE_IF_TAKEN]
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

    public int compareTo(Object object) {
        long l10 = ab ^ 0x614A3D61E48CL;
        long l11 = l10 ^ 0x575FA834B261L;
        return (int)m44.a("w", (Object)this, (Object)((_v)object), (long)l11, (long)2139663707556783879L, (long)l10);
    }

    void K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        m44.a("v", (Object)this, null, (long)-7781456701126291962L, (long)l10);
        m44.a("v", (Object)this, (boolean)false, (long)-7708003335065640594L, (long)l10);
    }

    public int H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return (int)m44.a("s", (Object)this, (long)-2584719253668224499L, (long)l10);
    }

    public boolean Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x7CA381093B50L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this.b;
        objectArray2[0] = l11;
        return (boolean)m44.a("o", (Object)objectArray2, (long)2906489912127766958L, (long)l10);
    }

    public final Enumeration j(Object[] objectArray) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = ab ^ l10) ^ 0x3B748E5F51ACL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l11;
                callSite2 = m44.a("v", (Object)this, (Object)objectArray2, (long)-1782795121361406861L, (long)l10);
                CallSite callSite3 = m44.a("i", (long)-447950504539345617L, (long)l10);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != false) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-1764462189461524524L, (long)l10);
                    }
                    return new lmm();
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-1764462189461524524L, (long)l10);
                }
            }
            callSite = callSite2;
        }
        return Collections.enumeration(callSite);
    }

    public boolean j(char c10, int n10, short s10) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = ((long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48) ^ ab;
                CallSite callSite = m44.a("o", (long)3305324219683535161L, (long)l10);
                try {
                    bl2 = this.G.equals(this.I);
                    if (callSite != false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)3716893845884730306L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    static String S(String string, long l10) {
        l10 = ab ^ l10;
        return string.replace((char)_v.c("i", (int)24912, (long)(0x5C72C687AA023990L ^ l10)), (char)_v.c("i", (int)4876, (long)(0x7C22407440D14BC9L ^ l10)));
    }

    /*
     * Exception decompiling
     */
    public b1 U(loe var1_1, long var2_2) {
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

    public void c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        m44.a("r", (Object)this, (boolean)true, (long)-8751662870723235102L, (long)l10);
    }

    void P(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = ab ^ l10;
        m44.a("s", (Object)this, (boolean)bl2, (long)-1093874543495523352L, (long)l10);
    }

    public boolean e(Object[] objectArray) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                CallSite callSite2;
                long l10;
                long l11;
                block6: {
                    l11 = (Long)objectArray[0];
                    l10 = (l11 = ab ^ l11) ^ 0x6DE6950DDE52L;
                    callSite2 = m44.a("o", (long)6538866974035807833L, (long)l11);
                    try {
                        try {
                            callSite = m44.a("q", (Object)this, (long)6746284552311736219L, (long)l11);
                            if (callSite2 != false) break block6;
                            if (callSite == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)4968993493352451234L, (long)l11);
                        }
                        callSite = m44.a("q", (Object)this, (long)6746284552311736219L, (long)l11);
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)4968993493352451234L, (long)l11);
                    }
                }
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l10;
                    object = m44.a("p", (Object)callSite, (Object)objectArray2, (long)6702745900788288460L, (long)l11);
                    if (callSite2 != false) break block8;
                    if (!object) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("o", (Object)n94, (long)4968993493352451234L, (long)l11);
                }
                object = 1;
                break block8;
            }
            object = false;
        }
        return object;
    }

    @Override
    public _v G(long l10) {
        return this;
    }

    public static boolean L(Object[] objectArray) {
        boolean bl2;
        block6: {
            block8: {
                block7: {
                    String string = (String)objectArray[0];
                    long l10 = (Long)objectArray[1];
                    l10 = ab ^ l10;
                    CallSite callSite = m44.a("j", (long)9001465058815118755L, (long)l10);
                    try {
                        try {
                            try {
                                bl2 = string.equals(_v.a("u", (int)13975, (long)(0x526B3AD470C67BFL ^ l10)));
                                if (callSite == false) break block6;
                                if (bl2) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)8860833386817401519L, (long)l10);
                            }
                            bl2 = string.equals(_v.a("u", (int)26021, (long)(0x4E9A30E3E5083485L ^ l10)));
                            if (callSite == false) break block6;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)8860833386817401519L, (long)l10);
                        }
                        if (!bl2) break block8;
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)n94, (long)8860833386817401519L, (long)l10);
                    }
                }
                bl2 = true;
                break block6;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final void j(Object[] objectArray) {
        l62 l622 = (l62)objectArray[0];
        long l10 = (Long)objectArray[1];
        n0 n02 = (n0)objectArray[2];
        long l11 = l10 = ab ^ l10;
        long l12 = l11 ^ 0x7AF79E5B94B0L;
        long l13 = l11 ^ 0xCD66F761D8AL;
        long l14 = l11 ^ 0x2A41C6F010AEL;
        b1[] b1Array = this.A(l14);
        int n10 = 0;
        CallSite callSite = m44.a("j", (long)-4470953162916712261L, (long)l10);
        while (n10 < this.O) {
            CallSite callSite2;
            block5: {
                block6: {
                    block7: {
                        b1 b12 = b1Array[n10];
                        try {
                            try {
                                callSite2 = callSite;
                                if (l10 <= 0L) break block5;
                                if (callSite2 == false) break block6;
                                if (b12.C(l13)) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)-4044133462371168329L, (long)l10);
                            }
                            Object[] objectArray2 = new Object[4];
                            objectArray2[3] = l12;
                            objectArray2[2] = b12;
                            objectArray2[1] = this;
                            objectArray2[0] = l622;
                            m44.a("u", (Object)n02, (Object)objectArray2, (long)-4406699533598489536L, (long)l10);
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)-4044133462371168329L, (long)l10);
                        }
                    }
                    ++n10;
                }
                callSite2 = callSite;
            }
            if (callSite2 != false) continue;
        }
    }

    public String d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x2A7ADB2A171FL;
        String string = this.h(l11);
        int n10 = string.lastIndexOf((int)_v.c("i", (int)4876, (long)(0x7C225817CEB2574CL ^ l10)));
        try {
            if (n10 == -1) {
                return "";
            }
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)-134165963830675852L, (long)l10);
        }
        return string.substring(0, n10).replace((char)_v.c("i", (int)4876, (long)(0x7C225817CEB2574CL ^ l10)), (char)_v.c("i", (int)24912, (long)(0x5C72DEE424612515L ^ l10)));
    }

    public void v(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        this.b = n10;
    }

    public byte[] K(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ ab;
        return m44.a("s", (Object)this, (long)-4570945334735776663L, (long)l10);
    }

    @Override
    public String w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.G;
    }

    /*
     * Exception decompiling
     */
    public String R(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 4[SIMPLE_IF_TAKEN]
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

    public gv t(Object[] objectArray) {
        _6 _62 = (_6)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 = ab ^ l10;
        long l12 = l11 ^ 0x23BBC32A7C8EL;
        long l13 = l11 ^ 0x65430616BA22L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        CallSite callSite = m44.a("m", (Object)objectArray2, (long)1587147961900101509L, (long)l10);
        ((HashSet)((Object)callSite)).add(this);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l12;
        objectArray3[2] = n10;
        objectArray3[1] = _62;
        objectArray3[0] = callSite;
        return m44.a("l", (Object)this, (Object)objectArray3, (long)883870644834597448L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public List o(Object[] var1_1) {
        block10: {
            block11: {
                block12: {
                    block9: {
                        var2_2 = (Long)var1_1[0];
                        var2_2 = _v.ab ^ var2_2;
                        var4_3 = m44.a("i", (long)2538041187433861744L, (long)var2_2);
                        try {
                            v0 = this;
                            if (var4_3 == false) break block9;
                            if (v0.W != null) {
                            }
                            ** GOTO lbl22
                        }
                        catch (n9 v1) {
                            throw m44.a("i", (Object)v1, (long)2678320993996795260L, (long)var2_2);
                        }
                        var5_4 = new ArrayList<E>(this.W.size() + 1);
                        try {
                            var5_4.add(this);
                            v2 = var5_4;
                            if (var2_2 <= 0L) break block10;
                            v2.addAll(this.W);
                            if (var4_3 != false) break block11;
lbl22:
                            // 2 sources

                            v0 = this.C;
                        }
                        catch (n9 v3) {
                            throw m44.a("i", (Object)v3, (long)2678320993996795260L, (long)var2_2);
                        }
                    }
                    if (v0 == null) break block12;
                    var5_4 = new ArrayList<E>(this.C.W.size() + 1);
                    var5_4.add(this.C);
                    v2 = var5_4;
                    if (var2_2 < 0L) break block10;
                    v2.addAll(this.C.W);
                    if (var4_3 != false) break block11;
                }
                var5_4 = new ArrayList<_v>(1);
                var5_4.add(this);
            }
            v2 = var5_4;
        }
        return v2;
    }

    /*
     * Unable to fully structure code
     */
    public String V(Object[] var1_1) {
        block38: {
            block45: {
                block44: {
                    block43: {
                        block39: {
                            block40: {
                                block41: {
                                    block42: {
                                        block37: {
                                            var2_2 = (Long)var1_1[0];
                                            v0 = var2_2 = _v.ab ^ var2_2;
                                            var4_3 = v0 ^ 137069455106146L;
                                            var6_4 = v0 ^ 49321603482466L;
                                            var8_5 = v0 ^ 73452898546300L;
                                            var10_6 = m44.a("l", (long)-7559890622625561614L, (long)var2_2);
                                            try {
                                                try {
                                                    v1 = m44.a("r", (Object)this, (long)-8055539674366096848L, (long)var2_2);
                                                    if (var10_6 != false) break block37;
                                                    if (v1 == null) break block38;
                                                }
                                                catch (n9 v2) {
                                                    throw m44.a("l", (Object)v2, (long)-8548379548945170167L, (long)var2_2);
                                                }
                                                v1 = m44.a("r", (Object)this, (long)-8055539674366096848L, (long)var2_2);
                                            }
                                            catch (n9 v3) {
                                                throw m44.a("l", (Object)v3, (long)-8548379548945170167L, (long)var2_2);
                                            }
                                        }
                                        v4 = new Object[1];
                                        v4[0] = var8_5;
                                        var11_7 = m44.a("s", (Object)v1, (Object)v4, (long)-7876971370452750133L, (long)var2_2);
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v5 = var11_7;
                                                        if (var10_6 != false) break block39;
                                                        if (v5 == null) break block40;
                                                    }
                                                    catch (n9 v6) {
                                                        throw m44.a("l", (Object)v6, (long)-8548379548945170167L, (long)var2_2);
                                                    }
                                                    v7 = var11_7;
                                                    if (var10_6 != false) break block41;
                                                }
                                                catch (n9 v8) {
                                                    throw m44.a("l", (Object)v8, (long)-8548379548945170167L, (long)var2_2);
                                                }
                                                if (!v7.equals(this.h(var4_3))) break block42;
                                            }
                                            catch (n9 v9) {
                                                throw m44.a("l", (Object)v9, (long)-8548379548945170167L, (long)var2_2);
                                            }
                                            return null;
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("l", (Object)v10, (long)-8548379548945170167L, (long)var2_2);
                                        }
                                    }
                                    v7 = var11_7;
                                }
                                return v7;
                            }
                            v11 = new Object[1];
                            v11[0] = var6_4;
                            v5 = m44.a("s", (Object)this, (Object)v11, (long)-8321338832792572968L, (long)var2_2);
                        }
                        var12_8 = v5;
                        try {
                            try {
                                v12 = var12_8;
                                if (var10_6 != false) break block43;
                                if (v12 == null) break block38;
                            }
                            catch (n9 v13) {
                                throw m44.a("l", (Object)v13, (long)-8548379548945170167L, (long)var2_2);
                            }
                            v12 = this.h(var4_3);
                        }
                        catch (n9 v14) {
                            throw m44.a("l", (Object)v14, (long)-8548379548945170167L, (long)var2_2);
                        }
                    }
                    var13_9 = v12;
                    try {
                        v15 = var13_9;
                        if (var10_6 != false) break block44;
                        if (v15.startsWith((String)var12_8)) {
                        }
                        ** GOTO lbl86
                    }
                    catch (n9 v16) {
                        throw m44.a("l", (Object)v16, (long)-8548379548945170167L, (long)var2_2);
                    }
                    v15 = var12_8;
                    if (var2_2 <= 0L) break block44;
                    var11_7 = v15;
                    try {
                        if (var10_6 == false) ** GOTO lbl132
lbl86:
                        // 2 sources

                        v15 = var13_9;
                    }
                    catch (n9 v17) {
                        throw m44.a("l", (Object)v17, (long)-8548379548945170167L, (long)var2_2);
                    }
                }
                var11_7 = v15;
                block26: while (var11_7 != null) {
                    try {
                        try {
                            v18 = var12_8;
                            v19 = var10_6;
                            if (var2_2 >= 0L) {
                                if (v19 != false) break block45;
                                v19 = var10_6;
                            }
                            if (v19 != false) break block45;
                        }
                        catch (n9 v20) {
                            throw m44.a("l", (Object)v20, (long)-8548379548945170167L, (long)var2_2);
                        }
                        if (!v18.startsWith((String)var11_7)) {
                        }
                        ** GOTO lbl132
                    }
                    catch (n9 v21) {
                        throw m44.a("l", (Object)v21, (long)-8548379548945170167L, (long)var2_2);
                    }
                    do {
                        block49: {
                            block50: {
                                block48: {
                                    block46: {
                                        block47: {
                                            var14_10 = var11_7.lastIndexOf("$");
                                            try {
                                                v22 = var10_6;
                                                if (var2_2 < 0L) break block46;
                                                if (v22 != false) break block47;
                                                if (var14_10 <= 0) break block48;
                                            }
                                            catch (n9 v23) {
                                                throw m44.a("l", (Object)v23, (long)-8548379548945170167L, (long)var2_2);
                                            }
                                            var11_7 = var11_7.substring(0, var14_10);
                                        }
                                        v22 = var10_6;
                                    }
                                    if (var2_2 <= 0L) break block49;
                                    if (v22 == false) break block50;
                                }
                                var11_7 = null;
                            }
                            v22 = var10_6;
                        }
                        if (v22 == false) continue block26;
lbl132:
                        // 4 sources

                    } while (var2_2 <= 0L);
                }
                v18 = var11_7;
            }
            return v18;
        }
        return null;
    }

    public void C(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        m44.a("s", (Object)this, (boolean)true, (long)-5347122425898949543L, (long)l10);
    }

    public boolean i(long l10) {
        boolean bl2;
        block2: {
            block3: {
                l10 = ab ^ l10;
                CallSite callSite = m44.a("n", (long)-3109769350092118625L, (long)l10);
                try {
                    bl2 = this.V;
                    if (callSite == false) break block2;
                    if (!bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-3259409298359018861L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final String e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return (char)_v.c("i", (int)14283, (long)(0x24EC0E5576C33825L ^ l10)) + this.I + (char)_v.c("i", (int)3845, (long)(0x5BDB1C80146E80E8L ^ l10));
    }

    public boolean X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x3AB227ED843CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = this.b;
        return (boolean)m44.a("k", (Object)objectArray2, (long)7977161997903765457L, (long)l10);
    }

    public final void V(Object[] objectArray) {
        y_ y_2 = (y_)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = ab ^ l10;
        long l12 = l11 ^ 0x774F73FB49A4L;
        long l13 = l11 ^ 0x4B6A01FB7036L;
        long l14 = l11 ^ 0x1A5238CAC92L;
        long l15 = l11 ^ 0x48F668829FFBL;
        long l16 = l11 ^ 0x398FAC80617EL;
        CallSite callSite = m44.a("o", (long)5667385951740116974L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        m44.a("p", (Object)y_2, (Object)objectArray2, (long)6200822615361337229L, (long)l10);
        CallSite callSite2 = callSite;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l14;
        objectArray3[0] = this.T(l12);
        m44.a("p", (Object)y_2, (Object)objectArray3, (long)5711511871424642312L, (long)l10);
        for (b1 b12 : this.A(l15)) {
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = y_2;
            objectArray4[0] = l16;
            m44.a("p", (Object)b12, (Object)objectArray4, (long)6329622284597139517L, (long)l10);
            if (callSite2 != false) continue;
        }
    }

    public _v t(Object[] objectArray) {
        return this.C;
    }

    /*
     * Unable to fully structure code
     */
    public static String o(Object[] var0) {
        block21: {
            block20: {
                block18: {
                    block19: {
                        var1_1 = (Long)var0[0];
                        var3_2 = (String)var0[1];
                        var4_3 = (var1_1 = _v.ab ^ var1_1) ^ 22356748073079L;
                        var7_4 = var3_2.lastIndexOf("[") + 1;
                        var6_5 = m44.a("h", (long)-1080366832090578871L, (long)var1_1);
                        var8_6 = var3_2.substring(var7_4);
                        try {
                            try {
                                try {
                                    try {
                                        v0 = var7_4;
                                        if (var6_5 == false) break block18;
                                        if (v0 <= 0) break block19;
                                    }
                                    catch (n9 v1) {
                                        throw m44.a("h", (Object)v1, (long)-643339832838799547L, (long)var1_1);
                                    }
                                    v0 = var8_6.length();
                                    if (var1_1 <= 0L || var6_5 == false) break block18;
                                }
                                catch (n9 v2) {
                                    throw m44.a("h", (Object)v2, (long)-643339832838799547L, (long)var1_1);
                                }
                                if (v0 != 1) break block19;
                            }
                            catch (n9 v3) {
                                throw m44.a("h", (Object)v3, (long)-643339832838799547L, (long)var1_1);
                            }
                            return null;
                        }
                        catch (n9 v4) {
                            throw m44.a("h", (Object)v4, (long)-643339832838799547L, (long)var1_1);
                        }
                    }
                    try {
                        v5 = var8_6;
                        if (var6_5 == false) break block20;
                        v0 = (int)v5.startsWith("L");
                    }
                    catch (n9 v6) {
                        throw m44.a("h", (Object)v6, (long)-643339832838799547L, (long)var1_1);
                    }
                }
                try {
                    try {
                        if (v0 != 0) {
                            v5 = var8_6;
                            if (var6_5 == false) break block20;
                        }
                        ** GOTO lbl59
                    }
                    catch (n9 v7) {
                        throw m44.a("h", (Object)v7, (long)-643339832838799547L, (long)var1_1);
                    }
                    if (v5.endsWith(";")) {
                    }
                    ** GOTO lbl59
                }
                catch (n9 v8) {
                    throw m44.a("h", (Object)v8, (long)-643339832838799547L, (long)var1_1);
                }
                v5 = var8_6.substring(1, var8_6.length() - 1);
                if (var1_1 < 0L) break block20;
                var9_7 = v5;
                try {
                    if (var6_5 != false) break block21;
lbl59:
                    // 3 sources

                    v5 = var8_6;
                }
                catch (n9 v9) {
                    throw m44.a("h", (Object)v9, (long)-643339832838799547L, (long)var1_1);
                }
            }
            var9_7 = v5;
        }
        return _v.S(var9_7, var4_3);
    }

    /*
     * Exception decompiling
     */
    public final Set F(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[DOLOOP]], but top level block is 12[SIMPLE_IF_TAKEN]
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

    public void a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        m44.a("t", (Object)this, (boolean)true, (long)596264738467198239L, (long)l10);
    }

    public int G(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = ab ^ l11) ^ 0x20D4930A0499L;
                CallSite callSite2 = m44.a("j", (long)3711981557538177739L, (long)l11);
                try {
                    try {
                        callSite = m44.a("t", (Object)this, (long)3241128295530133246L, (long)l11);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)3859648983013359047L, (long)l11);
                    }
                    callSite = m44.a("t", (Object)this, (long)3241128295530133246L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)3859648983013359047L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            return (int)m44.a("u", (Object)callSite, (Object)objectArray2, (long)3956921984851165420L, (long)l11);
        }
        return -1;
    }

    public final int z() {
        return this.T.G();
    }

    public boolean b(long l10) {
        long l11 = (l10 = ab ^ l10) ^ 0x3F73B6B43EA1L;
        return this.T.E(l11);
    }

    /*
     * WARNING - void declaration
     */
    void D(Object[] objectArray) {
        block8: {
            void var7_6;
            CallSite callSite;
            long l10;
            long l11;
            block7: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                l10 = (l11 = ab ^ l11) ^ 0x7C7CDC376DDAL;
                callSite = m44.a("i", (long)-4307429325960858256L, (long)l11);
                try {
                    object = m44.a("w", (Object)this, (long)-2852054879447498400L, (long)l11);
                    if (callSite == false) break block7;
                    if (object == false) break block8;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)n92, (long)-4455381531956311428L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var7_6 < this.H) {
                Object object;
                block10: {
                    block11: {
                        kw kw2;
                        block9: {
                            try {
                                try {
                                    kw2 = this.w[var7_6];
                                    if (callSite == false) break block9;
                                    object = kw2 instanceof ke;
                                    if (l11 <= 0L) break block10;
                                    if (!object) break block11;
                                }
                                catch (n9 n93) {
                                    throw m44.a("i", (Object)n93, (long)-4455381531956311428L, (long)l11);
                                }
                                kw2 = this.w[var7_6];
                            }
                            catch (n9 n94) {
                                throw m44.a("i", (Object)n94, (long)-4455381531956311428L, (long)l11);
                            }
                        }
                        ke ke2 = (ke)kw2;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l10;
                        m44.a("v", (Object)ke2, (Object)objectArray2, (long)-2668622965141696169L, (long)l11);
                    }
                    ++var7_6;
                    object = callSite;
                }
                if (object) continue;
            }
        }
    }

    public boolean P(char c10, short s10, int n10) {
        int n11;
        block8: {
            block7: {
                List list;
                CallSite callSite;
                long l10;
                block6: {
                    l10 = ((long)c10 << 48 | (long)s10 << 48 >>> 16 | (long)n10 << 32 >>> 32) ^ ab;
                    callSite = m44.a("m", (long)5966347526162941483L, (long)l10);
                    try {
                        try {
                            list = this.W;
                            if (callSite != false) break block6;
                            if (list == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)n92, (long)5514491622115050704L, (long)l10);
                        }
                        list = this.W;
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)n93, (long)5514491622115050704L, (long)l10);
                    }
                }
                try {
                    n11 = list.size();
                    if (callSite != false) break block8;
                    if (n11 <= 0) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)n94, (long)5514491622115050704L, (long)l10);
                }
                n11 = 1;
                break block8;
            }
            n11 = 0;
        }
        return n11 != 0;
    }

    /*
     * Unable to fully structure code
     */
    public final void B(Object[] var1_1) {
        var3_2 = (l62)var1_1[0];
        var2_3 = (_y)var1_1[1];
        var4_4 = (Long)var1_1[2];
        v0 = var4_4 = _v.ab ^ var4_4;
        var6_5 = v0 ^ 38645129258133L;
        var8_6 = v0 ^ 30426514710779L;
        var11_7 = this.A(var8_6);
        var12_8 = 0;
        var10_9 = m44.a("o", (long)3026061024634699033L, (long)var4_4);
        while (var12_8 < this.O) {
            v1 = new Object[4];
            v1[3] = var11_7[var12_8];
            v1[2] = this;
            v1[1] = var6_5;
            v1[0] = var3_2;
            m44.a("p", (Object)var2_3, (Object)v1, (long)3673584094190768996L, (long)var4_4);
            ++var12_8;
lbl21:
            // 2 sources

            ** while (var10_9 != false)
lbl22:
            // 1 sources

        }
lbl23:
        // 2 sources

        if (var4_4 <= 0L) ** GOTO lbl21
    }

    public int L(Object[] objectArray) {
        return this.b;
    }

    public int V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return (int)m44.a("p", (Object)this, (long)-8878042684548965127L, (long)l10);
    }

    public boolean R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x54FBE1AA33EL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = this.b;
        return (boolean)m44.a("o", (Object)objectArray2, (long)1234433586619640478L, (long)l10);
    }

    public Integer W(Object[] objectArray) {
        return this.P;
    }

    public boolean d(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l10 = ((long)n10 << 48 | (long)n11 << 48 >>> 16 | (long)n12 << 32 >>> 32) ^ ab;
        return (boolean)m44.a("r", (Object)this, (long)260742438272965269L, (long)l10);
    }

    public abstract b1[] A(long var1);

    public final int X(_v _v2, long l10) {
        long l11 = (l10 = ab ^ l10) ^ 0x1394C254AADCL;
        return this.h(l11).compareTo(_v2.h(l11));
    }

    public abstract b4[] l(Object[] var1);

    public final boolean U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x2D3F8558033CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("r", (Object)this.T, (Object)objectArray2, (long)-263799679211087900L, (long)l10);
    }

    public static String h(String string, long l10, char c10) {
        l10 = ab ^ l10;
        int n10 = string.lastIndexOf(c10);
        try {
            if (n10 == -1) {
                return "";
            }
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)n92, (long)-8094059834864842757L, (long)l10);
        }
        return string.substring(0, n10);
    }

    /*
     * Unable to fully structure code
     */
    private String h(Object[] var1_1) {
        block12: {
            block14: {
                block13: {
                    block11: {
                        var2_2 = (Long)var1_1[0];
                        var4_3 = (String)var1_1[1];
                        var2_2 = _v.ab ^ var2_2;
                        var6_4 = var4_3.lastIndexOf("$");
                        var5_5 = m44.a("n", (long)-8374535508424204512L, (long)var2_2);
                        try {
                            try {
                                v0 = var6_4;
                                v1 = -1;
                                if (var5_5 != false) break block11;
                                if (v0 <= v1) break block12;
                            }
                            catch (n9 v2) {
                                throw m44.a("n", (Object)v2, (long)-7670617748865884709L, (long)var2_2);
                            }
                            v0 = var6_4;
                            v1 = var4_3.length() - 1;
                        }
                        catch (n9 v3) {
                            throw m44.a("n", (Object)v3, (long)-7670617748865884709L, (long)var2_2);
                        }
                    }
                    if (v0 >= v1) break block12;
                    var7_6 = var4_3.substring(var6_4 + 1);
                    try {
                        v4 = var7_6;
                        v5 = var5_5;
                        if (var2_2 > 0L) {
                            if (v5 != false) break block13;
                            if (m44.a("n", (Object)new Object[]{v4}, (long)-8073303955803212562L, (long)var2_2) == false) break block12;
                        }
                        ** GOTO lbl39
                    }
                    catch (n9 v6) {
                        throw m44.a("n", (Object)v6, (long)-7670617748865884709L, (long)var2_2);
                    }
                    v4 = var4_3 = var4_3.substring(0, var6_4);
                }
                try {
                    try {
                        v5 = var5_5;
lbl39:
                        // 2 sources

                        if (v5 != false) break block14;
                        if (l62.t(v4) == null) break block12;
                    }
                    catch (n9 v7) {
                        throw m44.a("n", (Object)v7, (long)-7670617748865884709L, (long)var2_2);
                    }
                    v4 = var4_3;
                }
                catch (n9 v8) {
                    throw m44.a("n", (Object)v8, (long)-7670617748865884709L, (long)var2_2);
                }
            }
            return v4;
        }
        return null;
    }

    public int j(Object[] objectArray) {
        return this.V;
    }

    public final boolean t(long l10) {
        long l11 = (l10 = ab ^ l10) ^ 0x1E8265C611B9L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        return this.T.Y(n10, (char)n11, n12);
    }

    public final void k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        long l11 = (l10 = ab ^ l10) ^ 0x1C6AC1B0378BL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = bl2;
        m44.a("q", (Object)this.T, (Object)objectArray2, (long)940358343126503165L, (long)l10);
    }

    @Override
    public String f(long l10) {
        long l11 = l10 ^ 0x550AA984E462L;
        return ((gs)this.M.get(0)).B(l11);
    }

    public void g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        l10 = ab ^ l10;
        m44.a("t", (Object)this, (int)n10, (long)4074669203726911136L, (long)l10);
    }

    public static int[] t() {
        return y;
    }

    public String B(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = ab ^ l11) ^ 0x34F9475568B3L;
                CallSite callSite2 = m44.a("o", (long)-4053598268726003978L, (long)l11);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)-2826027090499501373L, (long)l11);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-4490906752369653254L, (long)l11);
                    }
                    callSite = m44.a("q", (Object)this, (long)-2826027090499501373L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-4490906752369653254L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            return m44.a("p", (Object)callSite, (Object)objectArray2, (long)-4105870276459750100L, (long)l11);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public final b4[] R(Object[] var1_1) {
        block8: {
            block9: {
                var4_2 = (String)var1_1[0];
                var2_3 = (Long)var1_1[1];
                v0 = var2_3 = _v.ab ^ var2_3;
                var5_4 = v0 ^ 90623774104082L;
                var7_5 = v0 ^ 26848323496557L;
                var10_6 = new ArrayList<b4>();
                v1 = new Object[1];
                v1[0] = var5_4;
                var11_7 = m44.a("u", (Object)this, (Object)v1, (long)-6666525045750483284L, (long)var2_3);
                var9_8 = m44.a("j", (long)-6590015422289947197L, (long)var2_3);
                var12_9 = 0;
                while (var12_9 < var11_7.length) {
                    block11: {
                        block10: {
                            try {
                                try {
                                    try {
                                        v2 = var11_7;
                                        if (var2_3 < 0L) break block8;
                                        v3 = (int)v2[var12_9].d(var7_5).equals(var4_2);
                                        if (var9_8 == false) break block9;
                                        if (var9_8 == false) break block10;
                                    }
                                    catch (n9 v4) {
                                        throw m44.a("j", (Object)v4, (long)-6730578927294092593L, (long)var2_3);
                                    }
                                    if (var2_3 < 0L) break block11;
                                    if (v3 == 0) break block10;
                                }
                                catch (n9 v5) {
                                    throw m44.a("j", (Object)v5, (long)-6730578927294092593L, (long)var2_3);
                                }
                                v6 = var10_6;
lbl33:
                                // 2 sources

                                while (true) {
                                    v6.add(var11_7[var12_9]);
                                    break;
                                }
                            }
                            catch (n9 v7) {
                                throw m44.a("j", (Object)v7, (long)-6730578927294092593L, (long)var2_3);
                            }
                        }
                        ++var12_9;
                        v8 = var9_8;
                    }
                    if (v8 != false) continue;
                }
                v6 = var10_6;
                ** while (var2_3 <= 0L)
lbl45:
                // 1 sources

                v3 = v6.size();
            }
            v2 = new b4[v3];
        }
        var12_10 = v2;
        return var10_6.toArray(var12_10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public gs d(Object[] objectArray) {
        List list;
        block9: {
            CallSite callSite;
            long l10;
            block8: {
                l10 = (Long)objectArray[0];
                l10 = ab ^ l10;
                callSite = m44.a("i", (long)7169953812098585288L, (long)l10);
                try {
                    try {
                        list = this.M;
                        if (callSite == false) break block8;
                        if (list == null) return null;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)7319311203848695236L, (long)l10);
                    }
                    list = this.M;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)7319311203848695236L, (long)l10);
                }
            }
            try {
                try {
                    if (callSite == false) return (gs)((Object)list);
                    if (list.size() != 0) break block9;
                    return null;
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)n94, (long)7319311203848695236L, (long)l10);
                }
            }
            catch (n9 n95) {
                throw m44.a("i", (Object)n95, (long)7319311203848695236L, (long)l10);
            }
        }
        list = this.M.get(0);
        return (gs)((Object)list);
    }

    public static String E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        int n10 = (Integer)objectArray[2];
        long l11 = l10 = ab ^ l10;
        long l12 = l11 ^ 0x1221A38A64DL;
        long l13 = l11 ^ 0x491A6715D1B0L;
        Object object = _v.S(string, l12);
        CallSite callSite = m44.a("j", (long)-5232161059119897724L, (long)l10);
        String string2 = "L" + (String)object + ";";
        if (callSite == false) {
            object = string2;
            if (n10 > 0) {
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = (int)_v.c("i", (int)20142, (long)(0x518DEC862B6C5DE3L ^ l10));
                objectArray2[3] = l13;
                objectArray2[2] = ((String)object).length() + n10;
                objectArray2[1] = (int)_v.c("i", (int)1485, (long)(0xEC22D42DCB11684L ^ l10));
                objectArray2[0] = object;
                object = m44.a("j", (Object)objectArray2, (long)-5552987979221789913L, (long)l10);
            }
            string2 = object;
        }
        return string2;
    }

    public final boolean g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x155C5E0CEDBCL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("t", (Object)this.T, (Object)objectArray2, (long)-8590098021056799519L, (long)l10);
    }

    public final String I(long l10) {
        l10 = ab ^ l10;
        int n10 = this.I.lastIndexOf("/");
        try {
            if (n10 > 0) {
                return this.I.substring(n10 + 1);
            }
        }
        catch (n9 n92) {
            throw m44.a("l", (Object)n92, (long)-9059452343379441135L, (long)l10);
        }
        return this.I;
    }

    public String a(int n10, int n11, int n12) {
        block5: {
            jv jv2;
            long l10;
            block4: {
                long l11 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ ab;
                l10 = l11 ^ 0x589E76D8548DL;
                CallSite callSite = m44.a("n", (long)-6408762294713650200L, (long)l11);
                try {
                    try {
                        jv2 = this.c;
                        if (callSite != false) break block4;
                        if (jv2 == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-5096859564702371565L, (long)l11);
                    }
                    jv2 = this.c;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-5096859564702371565L, (long)l11);
                }
            }
            return jv2.g(l10);
        }
        return null;
    }

    public abstract void i(Object[] var1);

    public List h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = (l10 << 32 | (long)n10 << 32 >>> 32) ^ ab;
        try {
            if (this.W != null) {
                return new ArrayList(this.W);
            }
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)n92, (long)-4474234538767185473L, (long)l11);
        }
        return new ArrayList(0);
    }

    public String g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return m44.a("w", (Object)this, (long)-459153069871281520L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String Q(Object[] var0) {
        block11: {
            block14: {
                block13: {
                    block10: {
                        var1_1 = (Long)var0[0];
                        var3_2 = (String)var0[1];
                        var1_1 = _v.ab ^ var1_1;
                        var6_3 = var3_2.lastIndexOf("$");
                        var4_4 = m44.a("m", (long)-6555917086244809652L, (long)var1_1);
                        try {
                            v0 /* !! */  = var6_3;
                            v1 = var3_2.length() - 1;
                            if (var4_4 == false) break block10;
                            if (v0 /* !! */  == v1) {
                            }
                            ** GOTO lbl22
                        }
                        catch (n9 v2) {
                            throw m44.a("m", (Object)v2, (long)-6694858240613749952L, (long)var1_1);
                        }
                        var5_5 = var3_2;
                        try {
                            block12: {
                                v0 /* !! */  = (int)var4_4;
                                if (var1_1 >= 0L) {
                                    if (v0 /* !! */  != 0) break block11;
                                }
                                break block12;
lbl22:
                                // 2 sources

                                v0 /* !! */  = var6_3;
                            }
                            v1 = -1;
                        }
                        catch (n9 v3) {
                            throw m44.a("m", (Object)v3, (long)-6694858240613749952L, (long)var1_1);
                        }
                    }
                    if (v0 /* !! */  <= v1) break block13;
                    v4 = var3_2.substring(var6_3 + 1);
                    if (var1_1 <= 0L) break block14;
                    var5_5 = v4;
                    if (var4_4 != false) break block11;
                }
                v4 = var3_2;
            }
            var5_5 = v4;
        }
        return var5_5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String X(String var0, lb6 var1_1, long var2_2) {
        block38: {
            block37: {
                block35: {
                    block36: {
                        block33: {
                            block34: {
                                block32: {
                                    block31: {
                                        block30: {
                                            block29: {
                                                block28: {
                                                    var4_3 = (var2_2 = _v.ab ^ var2_2) ^ 104908052431107L;
                                                    var7_4 = var0.lastIndexOf("[") + 1;
                                                    var6_5 = m44.a("l", (long)1165868765973136586L, (long)var2_2);
                                                    try {
                                                        v0 = var1_1;
                                                        if (var6_5 != false) break block28;
                                                        if (v0 == null) break block29;
                                                    }
                                                    catch (n9 v1) {
                                                        throw m44.a("l", (Object)v1, (long)1037568339078891057L, (long)var2_2);
                                                    }
                                                    v0 = var1_1;
                                                }
                                                v0.P(var7_4);
                                            }
                                            var8_6 = var0.substring(var7_4);
                                            try {
                                                try {
                                                    v2 = var7_4;
                                                    v3 /* !! */  = var6_5;
                                                    if (var2_2 > 0L) {
                                                        if (v3 /* !! */  != false) break block30;
                                                        if (v2 <= 0) break block31;
                                                    }
                                                    ** GOTO lbl36
                                                }
                                                catch (n9 v4) {
                                                    throw m44.a("l", (Object)v4, (long)1037568339078891057L, (long)var2_2);
                                                }
                                                v2 = var8_6.length();
                                            }
                                            catch (n9 v5) {
                                                throw m44.a("l", (Object)v5, (long)1037568339078891057L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            try {
                                                v3 /* !! */  = var6_5;
lbl36:
                                                // 2 sources

                                                if (var2_2 > 0L) {
                                                    if (v3 /* !! */  != false) break block32;
                                                    v3 /* !! */  = (CallSite)true;
                                                }
                                                if (v2 != v3 /* !! */ ) break block31;
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("l", (Object)v6, (long)1037568339078891057L, (long)var2_2);
                                            }
                                            v2 = 1;
                                            break block32;
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("l", (Object)v7, (long)1037568339078891057L, (long)var2_2);
                                        }
                                    }
                                    v2 = 0;
                                }
                                var9_7 = v2;
                                try {
                                    try {
                                        v8 = var9_7;
                                        v9 = var6_5;
                                        if (var2_2 > 0L) {
                                            if (v9 != false) break block33;
                                            if (v8 == 0) break block34;
                                        }
                                        ** GOTO lbl72
                                    }
                                    catch (n9 v10) {
                                        throw m44.a("l", (Object)v10, (long)1037568339078891057L, (long)var2_2);
                                    }
                                    return null;
                                }
                                catch (n9 v11) {
                                    throw m44.a("l", (Object)v11, (long)1037568339078891057L, (long)var2_2);
                                }
                            }
                            v8 = (int)var8_6.startsWith("L");
                        }
                        try {
                            try {
                                try {
                                    v9 = var6_5;
lbl72:
                                    // 2 sources

                                    if (v9 != false) break block35;
                                    if (v8 == 0) break block36;
                                }
                                catch (n9 v12) {
                                    throw m44.a("l", (Object)v12, (long)1037568339078891057L, (long)var2_2);
                                }
                                v8 = (int)var8_6.endsWith(";");
                                v13 /* !! */  = (int)var6_5;
                                if (var2_2 >= 0L) {
                                    if (v13 /* !! */  != 0) break block35;
                                }
                                ** GOTO lbl102
                            }
                            catch (n9 v14) {
                                throw m44.a("l", (Object)v14, (long)1037568339078891057L, (long)var2_2);
                            }
                            if (v8 == 0) break block36;
                        }
                        catch (n9 v15) {
                            throw m44.a("l", (Object)v15, (long)1037568339078891057L, (long)var2_2);
                        }
                        var10_8 = var8_6.substring(1, var8_6.length() - 1);
                        return _v.S(var10_8, var4_3);
                    }
                    try {
                        v16 = var8_6;
                        if (var6_5 != false) break block37;
                        v8 = v16.length();
                    }
                    catch (n9 v17) {
                        throw m44.a("l", (Object)v17, (long)1037568339078891057L, (long)var2_2);
                    }
                }
                try {
                    v13 /* !! */  = 1;
lbl102:
                    // 2 sources

                    if (v8 <= v13 /* !! */ ) break block38;
                    v16 = _v.S(var8_6, var4_3);
                }
                catch (n9 v18) {
                    throw m44.a("l", (Object)v18, (long)1037568339078891057L, (long)var2_2);
                }
            }
            return v16;
        }
        return null;
    }

    public boolean N(long l10) {
        boolean bl2;
        block6: {
            block8: {
                block7: {
                    long l11 = l10 = ab ^ l10;
                    long l12 = l11 ^ 0x4B8FA94B195BL;
                    long l13 = l11 ^ 0x47F10794821CL;
                    int n10 = (int)(l13 >>> 48);
                    int n11 = (int)(l13 << 16 >>> 48);
                    int n12 = (int)(l13 << 32 >>> 32);
                    CallSite callSite = m44.a("j", (long)2687452697081435139L, (long)l10);
                    try {
                        try {
                            try {
                                bl2 = this.P((char)n10, (short)n11, n12);
                                if (callSite == false) break block6;
                                if (bl2) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)2546818845140347663L, (long)l10);
                            }
                            bl2 = this.z(l12);
                            if (callSite == false) break block6;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)2546818845140347663L, (long)l10);
                        }
                        if (!bl2) break block8;
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)n94, (long)2546818845140347663L, (long)l10);
                    }
                }
                bl2 = true;
                break block6;
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean z(long l10) {
        boolean bl2;
        l10 = ab ^ l10;
        try {
            bl2 = this.P != null;
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)n92, (long)-2900207558648750185L, (long)l10);
        }
        return bl2;
    }

    @Override
    public final String h(long l10) {
        return this.I;
    }

    /*
     * Unable to fully structure code
     */
    private void X(Object[] var1_1) {
        block35: {
            block34: {
                block32: {
                    block33: {
                        var2_2 = (ee)var1_1[0];
                        var4_3 = (_v)var1_1[1];
                        var8_4 = (loe)var1_1[2];
                        var3_5 = (_v)var1_1[3];
                        var7_6 = (String)var1_1[4];
                        var5_7 = (Long)var1_1[5];
                        v0 = var5_7 = _v.ab ^ var5_7;
                        var9_8 = v0 ^ 111047031073168L;
                        var11_9 = v0 ^ 18685256223284L;
                        var13_10 = v0 ^ 9466613740878L;
                        var15_11 = v0 ^ 135750811351793L;
                        var17_12 = v0 ^ 47113768146246L;
                        var19_13 = v0 ^ 50113236744996L;
                        var21_14 = v0 ^ 35507608725492L;
                        var23_15 = m44.a("o", (long)-8248667797507942047L, (long)var5_7);
                        try {
                            try {
                                v1 = var4_3;
                                if (var23_15 != false) break block32;
                                if (v1 != var3_5) break block33;
                            }
                            catch (n9 v2) {
                                throw m44.a("o", (Object)v2, (long)-7796564623680480358L, (long)var5_7);
                            }
                            return;
                        }
                        catch (n9 v3) {
                            throw m44.a("o", (Object)v3, (long)-7796564623680480358L, (long)var5_7);
                        }
                    }
                    v1 = var4_3;
                }
                var24_16 = v1.h(var15_11);
                v4 = new Object[4];
                v4[3] = var13_10;
                v4[2] = var3_5;
                v4[1] = var8_4;
                v4[0] = var24_16;
                m44.a("p", (Object)var2_2, (Object)v4, (long)-7856103872497085426L, (long)var5_7);
                v5 = new Object[4];
                v5[3] = var3_5;
                v5[2] = var17_12;
                v5[1] = var8_4;
                v5[0] = var24_16;
                var25_17 = m44.a("p", (Object)var2_2, (Object)v5, (long)-8494579624313073366L, (long)var5_7);
                try {
                    try {
                        try {
                            v6 = l62.r(var19_13, var3_5.h(var15_11));
                            if (var23_15 != false) break block34;
                            if (v6) break block35;
                        }
                        catch (n9 v7) {
                            throw m44.a("o", (Object)v7, (long)-7796564623680480358L, (long)var5_7);
                        }
                        v8 = var3_5;
                        if (var5_7 >= 0L && var23_15 == false) {
                        }
                        ** GOTO lbl72
                    }
                    catch (n9 v9) {
                        throw m44.a("o", (Object)v9, (long)-7796564623680480358L, (long)var5_7);
                    }
                    v6 = v8.t(var11_9);
                }
                catch (n9 v10) {
                    throw m44.a("o", (Object)v10, (long)-7796564623680480358L, (long)var5_7);
                }
            }
            if (!v6) break block35;
            do {
                block42: {
                    block44: {
                        block43: {
                            block41: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                block36: {
                                                    v8 = var25_17;
lbl72:
                                                    // 2 sources

                                                    try {
                                                        try {
                                                            try {
                                                                if (var5_7 < 0L) ** GOTO lbl79
                                                                if (v8 == null) break;
lbl77:
                                                                // 2 sources

                                                                while (true) {
                                                                    v8 = var25_17;
lbl79:
                                                                    // 2 sources

                                                                    if (var5_7 < 0L || var23_15 != false) break block36;
                                                                    break;
                                                                }
                                                            }
                                                            catch (n9 v11) {
                                                                throw m44.a("o", (Object)v11, (long)-7796564623680480358L, (long)var5_7);
                                                            }
                                                            if (v8 == var3_5) break;
                                                        }
                                                        catch (n9 v12) {
                                                            throw m44.a("o", (Object)v12, (long)-7796564623680480358L, (long)var5_7);
                                                        }
                                                        v8 = var25_17;
                                                    }
                                                    catch (n9 v13) {
                                                        throw m44.a("o", (Object)v13, (long)-7796564623680480358L, (long)var5_7);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            v14 = l62.r(var19_13, v8.h(var15_11));
                                                            if (var23_15 != false) break block37;
                                                            if (v14) break;
                                                        }
                                                        catch (n9 v15) {
                                                            throw m44.a("o", (Object)v15, (long)-7796564623680480358L, (long)var5_7);
                                                        }
                                                        v16 = var25_17;
                                                        if (var23_15 != false) break block38;
                                                    }
                                                    catch (n9 v17) {
                                                        throw m44.a("o", (Object)v17, (long)-7796564623680480358L, (long)var5_7);
                                                    }
                                                    v14 = v16.t(var11_9);
                                                }
                                                catch (n9 v18) {
                                                    throw m44.a("o", (Object)v18, (long)-7796564623680480358L, (long)var5_7);
                                                }
                                            }
                                            if (!v14) break;
                                            v16 = var25_17;
                                        }
                                        var26_18 = v16.h(var15_11);
                                        v19 = new Object[4];
                                        v19[3] = var13_10;
                                        v19[2] = var3_5;
                                        v19[1] = var8_4;
                                        v19[0] = var26_18;
                                        m44.a("p", (Object)var2_2, (Object)v19, (long)-7856103872497085426L, (long)var5_7);
                                        var27_19 = var25_17;
                                        v20 = new Object[4];
                                        v20[3] = var3_5;
                                        v20[2] = var17_12;
                                        v20[1] = var8_4;
                                        v20[0] = var26_18;
                                        var25_17 = m44.a("p", (Object)var2_2, (Object)v20, (long)-8494579624313073366L, (long)var5_7);
                                        try {
                                            v21 = var25_17;
                                            if (var5_7 < 0L || var23_15 != false) break block39;
                                            if (v21 != null) {
                                            }
                                            ** GOTO lbl144
                                        }
                                        catch (n9 v22) {
                                            throw m44.a("o", (Object)v22, (long)-7796564623680480358L, (long)var5_7);
                                        }
                                        v21 = var25_17;
                                    }
                                    try {
                                        if (v21 == var27_19) break block40;
lbl144:
                                        // 2 sources

                                        v23 = true;
                                        break block41;
                                    }
                                    catch (n9 v24) {
                                        throw m44.a("o", (Object)v24, (long)-7796564623680480358L, (long)var5_7);
                                    }
                                }
                                v23 = false;
                            }
                            try {
                                v25 = new String[1];
                                v26 = v25;
                                v27 = v25;
                                v28 = 0;
                                v29 = new Object[1];
                                v29[0] = var9_8;
                                v30 = new StringBuilder().append((String)_v.a("u", (int)19989, (long)(9203046869708764676L ^ var5_7))).append((String)m44.a("p", (Object)var4_3, (Object)v29, (long)-7814603066768448073L, (long)var5_7));
                                v31 = " ";
                                if (var5_7 < 0L) break block42;
                                v30 = v30.append((String)v31);
                                v32 = var25_17;
                                if (var23_15 != false) break block43;
                                if (v32 == null) break block44;
                            }
                            catch (n9 v33) {
                                throw m44.a("o", (Object)v33, (long)-7796564623680480358L, (long)var5_7);
                            }
                            v32 = var25_17;
                        }
                        v34 = new Object[1];
                        v34[0] = var9_8;
                        v31 = m44.a("p", (Object)v32, (Object)v34, (long)-7814603066768448073L, (long)var5_7);
                        break block42;
                    }
                    v31 = _v.a("u", (int)7860, (long)(2187067706364143291L ^ var5_7));
                }
                v26[v28] = v30.append((String)v31).toString();
                lk0.t(v23, v27, var21_14);
            } while (var23_15 == false);
        }
        ** while (var5_7 <= 0L)
lbl184:
        // 1 sources

    }

    /*
     * Exception decompiling
     */
    public String G(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[DOLOOP]], but top level block is 10[SIMPLE_IF_TAKEN]
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

    public abstract void q(Object[] var1);

    /*
     * Exception decompiling
     */
    public String L(Object[] var1_1) {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List L(Object[] objectArray) {
        ArrayList<b1> arrayList;
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = ab ^ l10;
        long l12 = l11 ^ 0x3171314BB5C8L;
        long l13 = l11 ^ 0x49CFA7FFFB43L;
        ArrayList<b1> arrayList2 = new ArrayList<b1>();
        CallSite callSite = m44.a("o", (long)3035030630510320470L, (long)l10);
        b1[] b1Array = this.A(l13);
        block4: for (int i10 = 0; i10 < b1Array.length; ++i10) {
            boolean bl2;
            try {
                try {
                    bl2 = b1Array[i10].Z(l12).equals(string);
                    if (callSite == false || !bl2) continue;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)3174256553848431706L, (long)l10);
                }
                arrayList = arrayList2;
            }
            catch (n9 n93) {
                throw m44.a("o", (Object)n93, (long)3174256553848431706L, (long)l10);
            }
            do {
                bl2 = arrayList.add(b1Array[i10]);
                if (callSite != false) continue block4;
                arrayList = arrayList2;
            } while (l10 < 0L);
        }
        return arrayList;
    }

    public static void g(int[] nArray) {
        y = nArray;
    }

    public boolean F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return (boolean)m44.a("u", (Object)this, (long)-7282653856252832871L, (long)l10);
    }

    public int k(Object[] objectArray) {
        return this.l;
    }

    @Override
    public abstract js m(long var1, int var3);

    public void p(Object[] objectArray) {
        block11: {
            List list;
            long l10;
            block10: {
                List list2;
                CallSite callSite;
                _v _v4;
                block8: {
                    Integer n10;
                    block9: {
                        _v4 = (_v)objectArray[0];
                        l10 = (Long)objectArray[1];
                        n10 = (Integer)objectArray[2];
                        l10 = ab ^ l10;
                        callSite = m44.a("i", (long)8144960053428299247L, (long)l10);
                        try {
                            try {
                                list2 = this.W;
                                if (callSite != false) break block8;
                                if (list2 != null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)n92, (long)8017365684787291924L, (long)l10);
                            }
                            this.W = new ArrayList();
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)n93, (long)8017365684787291924L, (long)l10);
                        }
                    }
                    _v4.C = this;
                    m44.a("v", (Object)_v4, (Object)new Object[]{n10}, (long)7675774253969902672L, (long)l10);
                    list2 = this.W;
                }
                boolean bl2 = list2.add(_v4);
                try {
                    try {
                        list = this.W;
                        if (callSite != false) break block10;
                        if (list.size() <= 1) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("i", (Object)n94, (long)8017365684787291924L, (long)l10);
                    }
                    list = this.W;
                }
                catch (n9 n95) {
                    throw m44.a("i", (Object)n95, (long)8017365684787291924L, (long)l10);
                }
            }
            m44.a("i", (Object)list, (_v2, _v3) -> _v2.P - _v3.P, (long)8080829528464344527L, (long)l10);
        }
    }

    @Override
    public String u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x30839C81CDD5L;
        String string = this.h(l11);
        int n10 = string.lastIndexOf((int)_v.c("i", (int)4876, (long)(0x7C2242EE89198D86L ^ l10)));
        try {
            if (n10 == -1) {
                return string;
            }
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)n92, (long)2659729884955765950L, (long)l10);
        }
        return string.substring(n10 + 1);
    }

    @Override
    public String T(long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0x3D4CA157E82DL;
        long l13 = l11 ^ 0x61A2E3CF637EL;
        String string = this.h(l12);
        return _v.h(string, l13, (char)_v.c("i", (int)4876, (long)(0x7C224F21B4CFA87EL ^ l10)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void Q(Object[] var1_1) {
        block20: {
            block19: {
                block18: {
                    block16: {
                        block17: {
                            var3_2 = (Long)var1_1[0];
                            var2_3 = (h1)var1_1[1];
                            var5_4 = (var3_2 = _v.ab ^ var3_2) ^ 12951671703977L;
                            var8_5 = var2_3.readInt();
                            var7_6 = m44.a("h", (long)-798925846766706674L, (long)var3_2);
                            try {
                                try {
                                    v0 /* !! */  = var8_5;
                                    v1 /* !! */  = _v.c("i", (int)32685, (long)(7198350224128257903L ^ var3_2));
                                    if (var7_6 != false) break block16;
                                    if (v0 /* !! */  == v1 /* !! */ ) break block17;
                                }
                                catch (n9 v2) {
                                    throw m44.a("h", (Object)v2, (long)-1539539806837038347L, (long)var3_2);
                                }
                                throw new aw("'" + (String)m44.a("w", (Object)this, (long)var5_4, (long)-1228036575316926891L, (long)var3_2) + (String)_v.a("u", (int)26265, (long)(1969232687983929339L ^ var3_2)) + Integer.toHexString(var8_5) + "'");
                            }
                            catch (n9 v3) {
                                throw m44.a("h", (Object)v3, (long)-1539539806837038347L, (long)var3_2);
                            }
                        }
                        m44.a("t", (Object)this, (int)var2_3.readUnsignedShort(), (long)-1331883529831312472L, (long)var3_2);
                        v0 /* !! */  = this.b = var2_3.readUnsignedShort();
                        v1 /* !! */  = _v.c("i", (int)9516, (long)(5258231967011239397L ^ var3_2));
                    }
                    try {
                        try {
                            v4 = var7_6;
                            if (var3_2 <= 0L) ** GOTO lbl45
                            if (v4 != false) break block18;
                            if (v0 /* !! */  >= v1 /* !! */ ) {
                            }
                            ** GOTO lbl58
                        }
                        catch (n9 v5) {
                            throw m44.a("h", (Object)v5, (long)-1539539806837038347L, (long)var3_2);
                        }
                        v0 /* !! */  = this.b;
                        v1 /* !! */  = _v.c("i", (int)30893, (long)(873097617391495271L ^ var3_2));
                    }
                    catch (n9 v6) {
                        throw m44.a("h", (Object)v6, (long)-1539539806837038347L, (long)var3_2);
                    }
                }
                try {
                    try {
                        if (var3_2 < 0L) break block19;
                        v4 = var7_6;
lbl45:
                        // 2 sources

                        if (v4 != false) break block19;
                        if (v0 /* !! */  != v1 /* !! */ ) break block20;
                    }
                    catch (n9 v7) {
                        throw m44.a("h", (Object)v7, (long)-1539539806837038347L, (long)var3_2);
                    }
                    v0 /* !! */  = (int)m44.a("v", (Object)this, (long)-1331883529831312472L, (long)var3_2);
                    v1 /* !! */  = (CallSite)3;
                }
                catch (n9 v8) {
                    throw m44.a("h", (Object)v8, (long)-1539539806837038347L, (long)var3_2);
                }
            }
            try {
                if (v0 /* !! */  >= v1 /* !! */ ) break block20;
lbl58:
                // 2 sources

                throw new aw("'" + (String)m44.a("w", (Object)this, (long)var5_4, (long)-1228036575316926891L, (long)var3_2) + (String)_v.a("u", (int)4427, (long)(6456389780024447034L ^ var3_2)) + this.b + "." + (int)m44.a("v", (Object)this, (long)-1331883529831312472L, (long)var3_2));
            }
            catch (n9 v9) {
                throw m44.a("h", (Object)v9, (long)-1539539806837038347L, (long)var3_2);
            }
        }
    }

    public final void f(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = ab ^ l10) ^ 0x2C2D74A6ED3BL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = bl2;
        m44.a("r", (Object)this.T, (Object)objectArray2, (long)-4918869567962478062L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public final void R(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (l62)var1_1[1];
        var5_4 = (n0)var1_1[2];
        v0 = var2_2 = _v.ab ^ var2_2;
        v1 = v0 ^ 25371098603725L;
        var6_5 = (int)(v1 >>> 32);
        var7_6 = (int)(v1 << 32 >>> 48);
        var8_7 = (int)(v1 << 48 >>> 48);
        var9_8 = v0 ^ 63995233226917L;
        var12_9 = this.A(var9_8);
        var11_10 = m44.a("i", (long)142122583618515120L, (long)var2_2);
        var13_11 = 0;
        while (var13_11 < this.O) {
            v2 = new Object[6];
            v2[5] = var8_7;
            v2[4] = var12_9[var13_11];
            v2[3] = (int)((short)var7_6);
            v2[2] = this;
            v2[1] = var6_5;
            v2[0] = var4_3;
            m44.a("v", (Object)var5_4, (Object)v2, (long)537686759692586814L, (long)var2_2);
            ++var13_11;
lbl26:
            // 2 sources

            ** while (var11_10 == false)
lbl27:
            // 1 sources

        }
lbl28:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl26
    }

    public abstract void J(Object[] var1);

    @Override
    public String z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x67350BC076FL;
        return m44.a("k", (long)l11, (Object)this.G, (long)2878449520880613477L, (long)l10);
    }

    public static String T(Object[] objectArray) {
        String string;
        block4: {
            String string2;
            block3: {
                String string3;
                block2: {
                    string3 = (String)objectArray[0];
                    long l10 = (Long)objectArray[1];
                    l10 = ab ^ l10;
                    int n10 = string3.lastIndexOf("/");
                    CallSite callSite = m44.a("h", (long)7607103771087804633L, (long)l10);
                    if (n10 <= -1) break block2;
                    string2 = string3.substring(n10 + 1);
                    if (l10 <= 0L) break block3;
                    string = string2;
                    if (callSite != false) break block4;
                }
                string2 = string3;
            }
            string = string2;
        }
        return string;
    }

    public final String M(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        int n10 = this.G.lastIndexOf("/");
        try {
            if (n10 > 0) {
                return this.G.substring(n10 + 1);
            }
        }
        catch (n9 n92) {
            throw m44.a("o", (Object)n92, (long)-7064705338150496862L, (long)l10);
        }
        return this.G;
    }

    public boolean M(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return (boolean)m44.a("u", (Object)this, (long)-2475067930849400369L, (long)l10);
    }

    public boolean h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return (boolean)m44.a("r", (Object)this, (long)-8989853172115288212L, (long)l10);
    }

    public final void z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l62 l622 = (l62)objectArray[1];
        _y _y2 = (_y)objectArray[2];
        long l11 = l10 = ab ^ l10;
        long l12 = l11 ^ 0x7566D5B69CAEL;
        long l13 = l11 ^ 0x1683FD9E4C3DL;
        long l14 = l11 ^ 0x75A2F8646AFBL;
        long l15 = l11 ^ 0x301454184119L;
        b1[] b1Array = this.A(l15);
        int n10 = 0;
        CallSite callSite = m44.a("m", (long)-8051062170376937204L, (long)l10);
        while (n10 < this.O) {
            CallSite callSite2;
            block7: {
                block8: {
                    block9: {
                        b1 b12 = b1Array[n10];
                        try {
                            try {
                                try {
                                    callSite2 = callSite;
                                    if (l10 < 0L) break block7;
                                    if (callSite2 == false) break block8;
                                    if (b12.C(l13)) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)n92, (long)-7613545866167525888L, (long)l10);
                                }
                                if (b12.T(l14)) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("m", (Object)n93, (long)-7613545866167525888L, (long)l10);
                            }
                            Object[] objectArray2 = new Object[4];
                            objectArray2[3] = b12;
                            objectArray2[2] = l12;
                            objectArray2[1] = this;
                            objectArray2[0] = l622;
                            m44.a("r", (Object)_y2, (Object)objectArray2, (long)-8092042990511650963L, (long)l10);
                        }
                        catch (n9 n94) {
                            throw m44.a("m", (Object)n94, (long)-7613545866167525888L, (long)l10);
                        }
                    }
                    ++n10;
                }
                callSite2 = callSite;
            }
            if (callSite2 != false) continue;
        }
    }

    public final boolean C(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x7947A29E3241L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("w", (Object)this.T, (Object)objectArray2, (long)-8214369934912120220L, (long)l10);
    }

    _v(long l10, gs gs2, byte[] byArray, int n10) {
        Object object;
        _v _v2;
        block4: {
            block5: {
                AbstractList abstractList;
                long l11 = (l10 = ab ^ l10) ^ 0x22C835B22D0FL;
                CallSite callSite = m44.a("k", (long)7310075554354704789L, (long)l10);
                super(null);
                CallSite callSite2 = callSite;
                try {
                    _v _v3 = this;
                    abstractList = m44.a("o", (long)7460174019715221968L, (long)l10) != false ? new Vector(1) : new ArrayList(1);
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)8879211030805492590L, (long)l10);
                }
                try {
                    _v3.M = abstractList;
                    m44.a("w", (Object)this, (boolean)false, (long)7023770764311558258L, (long)l10);
                    m44.a("w", (Object)this, (boolean)false, (long)9194920523169248203L, (long)l10);
                    m44.a("w", (Object)this, (boolean)false, (long)7142124216879661092L, (long)l10);
                    m44.a("w", (Object)this, (boolean)false, (long)7158086474698659647L, (long)l10);
                    this.M.add(gs2);
                    _v2 = this;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l11;
                    object = m44.a("t", (Object)gs2, (Object)objectArray, (long)9130478123032545199L, (long)l10);
                    if (callSite2 != false) break block4;
                    if (object != false) break block5;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)8879211030805492590L, (long)l10);
                }
                object = true;
                break block4;
            }
            object = false;
        }
        m44.a("w", (Object)_v2, (boolean)object, (long)6941923936487745825L, (long)l10);
        this.u = byArray;
        this.V = n10;
    }

    /*
     * Exception decompiling
     */
    public void E(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    public boolean I(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l10 = ((long)n10 << 48 | (long)n11 << 32 >>> 16 | (long)n12 << 48 >>> 48) ^ ab;
        long l11 = l10 ^ 0x24B565A72196L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = this.b;
        return (boolean)m44.a("k", (Object)objectArray2, (long)-849666987023895397L, (long)l10);
    }

    public boolean n(long l10) {
        boolean bl2;
        l10 = ab ^ l10;
        try {
            bl2 = this.C != null;
        }
        catch (n9 n92) {
            throw m44.a("o", (Object)n92, (long)-854206872799822734L, (long)l10);
        }
        return bl2;
    }

    public boolean w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return (boolean)m44.a("u", (Object)this, (long)-8692188104477665587L, (long)l10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Map f(Object[] var1_1) {
        block163: {
            block148: {
                block170: {
                    block169: {
                        block146: {
                            block147: {
                                block145: {
                                    block132: {
                                        block133: {
                                            block143: {
                                                block144: {
                                                    block134: {
                                                        block135: {
                                                            block136: {
                                                                block164: {
                                                                    var7_2 = (ee)var1_1[0];
                                                                    var2_3 = (sz)var1_1[1];
                                                                    var5_4 = (lqu)var1_1[2];
                                                                    var3_5 = (Long)var1_1[3];
                                                                    var6_6 = (Random)var1_1[4];
                                                                    v0 = var3_5 = _v.ab ^ var3_5;
                                                                    var8_7 = v0 ^ 40243725043020L;
                                                                    var10_8 = v0 ^ 70164608994582L;
                                                                    var12_9 = v0 ^ 7527691135879L;
                                                                    var14_10 = v0 ^ 12173593059760L;
                                                                    var16_11 = v0 ^ 12491022114034L;
                                                                    var18_12 = v0 ^ 106496651998915L;
                                                                    var20_13 = v0 ^ 29076266696581L;
                                                                    var22_14 = v0 ^ 83750841192340L;
                                                                    var24_15 = v0 ^ 163981077281L;
                                                                    var26_16 = v0 ^ 103317417975909L;
                                                                    var28_17 = v0 ^ 43338496880883L;
                                                                    var30_18 = v0 ^ 123437603048318L;
                                                                    v1 = v0 ^ 109621921813220L;
                                                                    var32_19 = (int)(v1 >>> 48);
                                                                    var33_20 = v1 << 16 >>> 16;
                                                                    var35_21 = v0 ^ 10891376369602L;
                                                                    var37_22 = v0 ^ 132176481788245L;
                                                                    var39_23 = v0 ^ 71754425972354L;
                                                                    var41_24 = v0 ^ 52497535885674L;
                                                                    v2 = v0 ^ 28244508875787L;
                                                                    var43_25 = (int)(v2 >>> 32);
                                                                    var44_26 = (int)(v2 << 32 >>> 48);
                                                                    var45_27 = (int)(v2 << 48 >>> 48);
                                                                    var46_28 = v0 ^ 59698156167056L;
                                                                    var48_29 = v0 ^ 99595951532343L;
                                                                    var50_30 = v0 ^ 33313772580769L;
                                                                    var52_31 = v0 ^ 30728188202604L;
                                                                    var54_32 = v0 ^ 138458479599088L;
                                                                    var57_33 = this.h(var14_10);
                                                                    var60_34 = 1;
                                                                    var61_35 = 5679361125738301770L;
                                                                    var63_36 = 5679361125726898330L;
                                                                    var56_37 = m44.a("n", (long)5665484828760227799L, (long)var3_5);
                                                                    v3 /* !! */  = var6_6.nextInt((int)_v.c("i", (int)7148, (long)(3110632205708585244L ^ var3_5)));
                                                                    if (var56_37 == false) break block132;
                                                                    if (v3 /* !! */  != 0) break block133;
                                                                    break block164;
                                                                    catch (IOException v4) {
                                                                        throw m44.a("n", (Object)v4, (long)5227687051162681563L, (long)var3_5);
                                                                    }
                                                                }
                                                                try {
                                                                    block165: {
                                                                        v5 = var2_3.a(var54_32);
                                                                        v6 = var56_37;
                                                                        if (var3_5 <= 0L) ** GOTO lbl227
                                                                        if (v6 == false) break block134;
                                                                        break block165;
                                                                        catch (IOException v7) {
                                                                            throw m44.a("n", (Object)v7, (long)5227687051162681563L, (long)var3_5);
                                                                        }
                                                                    }
                                                                    if (!v5) break block135;
                                                                }
                                                                catch (IOException v8) {
                                                                    throw m44.a("n", (Object)v8, (long)5227687051162681563L, (long)var3_5);
                                                                }
                                                                v9 = new Object[1];
                                                                v9[0] = var24_15;
                                                                v10 = new Object[2];
                                                                v10[1] = m44.a("q", (Object)var5_4, (Object)v9, (long)5788410444911684137L, (long)var3_5);
                                                                v10[0] = var22_14;
                                                                var65_38 = m44.a("n", (Object)v10, (long)5243902749092152619L, (long)var3_5);
                                                                var66_39 = null;
                                                                if (var65_38 == null || m44.a("q", (Object)(var67_42 = new File((String)var65_38)), (long)5760844072993966634L, (long)var3_5) == false) break block136;
                                                                var66_39 = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream((File)var67_42), (String)_v.a("u", (int)2328, (long)(4240181577524079185L ^ var3_5))));
                                                                var68_47 = new ArrayList<Object>();
                                                                var69_48 = false;
                                                                while ((var70_51 = var66_39.readLine()) != null) {
                                                                    block141: {
                                                                        block140: {
                                                                            block139: {
                                                                                block138: {
                                                                                    block137: {
                                                                                        block166: {
                                                                                            v5 = var69_48;
                                                                                            v11 /* !! */  = var56_37;
                                                                                            if (var3_5 <= 0L) ** GOTO lbl89
                                                                                            if (v11 /* !! */  == false) break block134;
                                                                                            v11 /* !! */  = var56_37;
lbl89:
                                                                                            // 2 sources

                                                                                            if (var3_5 <= 0L) ** GOTO lbl110
                                                                                            if (v11 /* !! */  == false) break block137;
                                                                                            break block166;
                                                                                            catch (IOException v12) {
                                                                                                throw m44.a("n", (Object)v12, (long)5227687051162681563L, (long)var3_5);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block167: {
                                                                                                if (v5) break;
                                                                                                break block167;
                                                                                                catch (IOException v13) {
                                                                                                    throw m44.a("n", (Object)v13, (long)5227687051162681563L, (long)var3_5);
                                                                                                }
                                                                                            }
                                                                                            var68_47.add(var70_51);
                                                                                            v14 = var70_51.indexOf((String)_v.a("u", (int)337, (long)(8302425160068194825L ^ var3_5)));
                                                                                        }
                                                                                        catch (IOException v15) {
                                                                                            throw m44.a("n", (Object)v15, (long)5227687051162681563L, (long)var3_5);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        v11 /* !! */  = var56_37;
lbl110:
                                                                                        // 2 sources

                                                                                        if (var3_5 > 0L) {
                                                                                            if (v11 /* !! */  == false) break block138;
                                                                                            v11 /* !! */  = (CallSite)-1;
                                                                                        }
                                                                                        if (v14 <= v11 /* !! */ ) continue;
                                                                                    }
                                                                                    catch (IOException v16) {
                                                                                        throw m44.a("n", (Object)v16, (long)5227687051162681563L, (long)var3_5);
                                                                                    }
                                                                                    v14 = 1;
                                                                                }
                                                                                var69_48 = v14;
                                                                                var71_52 = var61_35;
                                                                                var73_54 = var63_36 ^ var71_52;
                                                                                var75_56 = ((String)var68_47.get(var68_47.size() - 3)).trim();
                                                                                v17 = new Object[2];
                                                                                v17[1] = var16_11;
                                                                                v17[0] = var75_56;
                                                                                var76_57 = m44.a("n", (Object)v17, (long)5950711226091271781L, (long)var3_5);
                                                                                v18 = var56_37;
                                                                                if (var3_5 <= 0L) ** GOTO lbl146
                                                                                if (v18 == false) break block139;
                                                                                try {
                                                                                    block168: {
                                                                                        if (var76_57 == var71_52) ** GOTO lbl147
                                                                                        break block168;
                                                                                        catch (IOException v19) {
                                                                                            throw m44.a("n", (Object)v19, (long)5227687051162681563L, (long)var3_5);
                                                                                        }
                                                                                    }
                                                                                    var2_3.Z(var52_31, m44.a("j", (long)6284716064887466075L, (long)var3_5));
                                                                                }
                                                                                catch (IOException v20) {
                                                                                    throw m44.a("n", (Object)v20, (long)5227687051162681563L, (long)var3_5);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var3_5 <= 0L) break block140;
                                                                                v18 = var56_37;
lbl146:
                                                                                // 2 sources

                                                                                if (v18 != false) break block140;
lbl147:
                                                                                // 2 sources

                                                                                var2_3.Z(var52_31, m44.a("j", (long)5735056432038514627L, (long)var3_5));
                                                                            }
                                                                            catch (IOException v21) {
                                                                                throw m44.a("n", (Object)v21, (long)5227687051162681563L, (long)var3_5);
                                                                            }
                                                                        }
                                                                        var78_59 = ((String)var68_47.get(var68_47.size() - 5)).trim();
                                                                        var79_60 = var78_59.substring(3, (int)_v.c("i", (int)25853, (long)(4136975104887821853L ^ var3_5)));
                                                                        var80_61 = new StringTokenizer(var79_60, ".");
                                                                        var81_62 = (double)Integer.parseInt(var80_61.nextToken()) * 365.25;
                                                                        var81_62 += (double)Integer.parseInt(var80_61.nextToken()) * 30.4;
                                                                        var81_62 += (double)Integer.parseInt(var80_61.nextToken());
                                                                        var83_63 = (long)(var81_62 *= 1440.0);
                                                                        try {
                                                                            v22 /* !! */  = var83_63 == var73_54 ? 0 : (var83_63 < var73_54 ? -1 : 1);
                                                                            if (var3_5 < 0L) break block141;
                                                                            if (v22 /* !! */  > 0) {
                                                                                var2_3.Z(var52_31, m44.a("j", (long)6284716064887466075L, (long)var3_5));
                                                                            }
                                                                        }
                                                                        catch (IOException v23) {
                                                                            throw m44.a("n", (Object)v23, (long)5227687051162681563L, (long)var3_5);
                                                                        }
                                                                        v22 /* !! */  = (long)var56_37;
                                                                    }
                                                                    if (v22 /* !! */  != false) continue;
                                                                }
                                                            }
                                                            try {
                                                                if (var3_5 < 0L) break block135;
                                                                v24 = var66_39;
                                                                if (var3_5 < 0L) ** GOTO lbl233
                                                                if (var56_37 != false) {
                                                                    if (v24 == null) break block135;
                                                                }
                                                                ** GOTO lbl183
                                                            }
                                                            catch (IOException v25) {
                                                                throw m44.a("n", (Object)v25, (long)5227687051162681563L, (long)var3_5);
                                                            }
                                                            try {
                                                                v26 = var66_39;
lbl183:
                                                                // 2 sources

                                                                m44.a("q", v26, (long)6309722596554991570L, (long)var3_5);
                                                            }
                                                            catch (IOException var67_43) {}
                                                            break block135;
                                                            catch (Exception var67_44) {
                                                                try {
                                                                    if (var3_5 <= 0L) break block135;
                                                                    v27 = var66_39;
                                                                    if (var56_37 != false) {
                                                                        if (v27 == null) break block135;
                                                                    }
                                                                    ** GOTO lbl199
                                                                }
                                                                catch (IOException v28) {
                                                                    throw m44.a("n", (Object)v28, (long)5227687051162681563L, (long)var3_5);
                                                                }
                                                                try {
                                                                    v27 = var66_39;
lbl199:
                                                                    // 2 sources

                                                                    m44.a("q", v27, (long)6309722596554991570L, (long)var3_5);
                                                                }
                                                                catch (IOException var67_45) {}
                                                                catch (Throwable var85_64) {
                                                                    block142: {
                                                                        try {
                                                                            if (var3_5 < 0L) break block142;
                                                                            v29 = var66_39;
                                                                            if (var56_37 != false) {
                                                                                if (v29 == null) break block142;
                                                                            }
                                                                            ** GOTO lbl215
                                                                        }
                                                                        catch (IOException v30) {
                                                                            throw m44.a("n", (Object)v30, (long)5227687051162681563L, (long)var3_5);
                                                                        }
                                                                        try {
                                                                            v29 = var66_39;
lbl215:
                                                                            // 2 sources

                                                                            m44.a("q", v29, (long)6309722596554991570L, (long)var3_5);
                                                                        }
                                                                        catch (IOException var86_65) {
                                                                            // empty catch block
                                                                        }
                                                                    }
                                                                    throw var85_64;
                                                                }
                                                            }
                                                        }
                                                        v5 = var2_3.a(var54_32);
                                                    }
                                                    try {
                                                        try {
                                                            v6 = var56_37;
lbl227:
                                                            // 2 sources

                                                            if (v6 == false) break block143;
                                                            if (v5) break block144;
                                                        }
                                                        catch (IOException v31) {
                                                            throw m44.a("n", (Object)v31, (long)5227687051162681563L, (long)var3_5);
                                                        }
                                                        v24 = var2_3.t();
lbl233:
                                                        // 2 sources

                                                        v5 = (Boolean)v24;
                                                        break block143;
                                                    }
                                                    catch (IOException v32) {
                                                        throw m44.a("n", (Object)v32, (long)5227687051162681563L, (long)var3_5);
                                                    }
                                                }
                                                v5 = true;
                                            }
                                            var60_34 = (int)v5;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v3 /* !! */  = var60_34;
                                                            if (var56_37 == false) break block132;
                                                            if (v3 /* !! */  != 0) break block133;
                                                        }
                                                        catch (IOException v33) {
                                                            throw m44.a("n", (Object)v33, (long)5227687051162681563L, (long)var3_5);
                                                        }
                                                        v34 = new Object[1];
                                                        v34[0] = var48_29;
                                                        v3 /* !! */  = (int)m44.a("q", (Object)var5_4, (Object)v34, (long)5292269947778905877L, (long)var3_5);
                                                        v35 = var56_37;
                                                        if (var3_5 > 0L) {
                                                            if (v35 == false) break block132;
                                                        }
                                                        ** GOTO lbl279
                                                    }
                                                    catch (IOException v36) {
                                                        throw m44.a("n", (Object)v36, (long)5227687051162681563L, (long)var3_5);
                                                    }
                                                    if (v3 /* !! */  != 0) break block133;
                                                }
                                                catch (IOException v37) {
                                                    throw m44.a("n", (Object)v37, (long)5227687051162681563L, (long)var3_5);
                                                }
                                                v38 = new Object[1];
                                                v38[0] = var41_24;
                                                m44.a("q", (Object)var5_4, (Object)v38, (long)5563036839225704095L, (long)var3_5);
                                            }
                                            catch (IOException v39) {
                                                throw m44.a("n", (Object)v39, (long)5227687051162681563L, (long)var3_5);
                                            }
                                        }
                                        v3 /* !! */  = (int)var57_33.equals(_v.a("u", (int)11150, (long)(7752181094866962644L ^ var3_5)));
                                    }
                                    try {
                                        try {
                                            v35 = var56_37;
lbl279:
                                            // 2 sources

                                            if (var3_5 > 0L) {
                                                if (v35 == false) break block145;
                                                if (v3 /* !! */  != 0) break block146;
                                            }
                                            ** GOTO lbl296
                                        }
                                        catch (IOException v40) {
                                            throw m44.a("n", (Object)v40, (long)5227687051162681563L, (long)var3_5);
                                        }
                                        v41 = new Object[1];
                                        v41[0] = var46_28;
                                        v3 /* !! */  = (int)m44.a("q", (Object)this, (Object)v41, (long)5879957726751393013L, (long)var3_5);
                                    }
                                    catch (IOException v42) {
                                        throw m44.a("n", (Object)v42, (long)5227687051162681563L, (long)var3_5);
                                    }
                                }
                                try {
                                    v35 = var56_37;
lbl296:
                                    // 2 sources

                                    if (v35 == false) break block147;
                                    if (v3 /* !! */  != 0) break block146;
                                }
                                catch (IOException v43) {
                                    throw m44.a("n", (Object)v43, (long)5227687051162681563L, (long)var3_5);
                                }
                                v3 /* !! */  = var60_34;
                            }
                            if (v3 /* !! */  == 0) break block146;
                            var65_38 = this.a(var43_25, var44_26, var45_27);
                            var66_39 = (String)_v.a("u", (int)7240, (long)(7189925134791212815L ^ var3_5)) + (String)m44.a("q", (Object)this, (long)var12_9, (long)5538070892956728443L, (long)var3_5) + "'";
                            v44 = new Object[6];
                            v44[5] = var66_39;
                            v44[4] = var30_18;
                            v44[3] = var6_6;
                            v44[2] = var5_4;
                            v44[1] = var2_3;
                            v44[0] = var65_38;
                            var67_42 = m44.a("q", (Object)var7_2, (Object)v44, (long)5732514246637527522L, (long)var3_5);
                            v45 = new Object[2];
                            v45[1] = var50_30;
                            v45[0] = var67_42;
                            v46 = m44.a("n", (Object)v45, (long)5212671378055084248L, (long)var3_5);
                            if (var3_5 <= 0L) break block169;
                            var58_66 = v46;
                            if (var56_37 != false) break block170;
                        }
                        v47 = new Object[1];
                        v47[0] = var18_12;
                        v46 = m44.a("n", (Object)v47, (long)5955981062733444677L, (long)var3_5);
                    }
                    var58_66 = v46;
                }
                var65_38 = new Vector<E>();
                var66_40 = 0;
                block95: while (var66_40 < m44.a("p", (Object)this, (long)5880284682800515497L, (long)var3_5)) {
                    v48 = new Object[2];
                    v48[1] = var66_40;
                    v48[0] = var37_22;
                    var67_42 = m44.a("q", (Object)this, (Object)v48, (long)5415419353710266661L, (long)var3_5);
                    var68_47 = (String)_v.a("u", (int)14268, (long)(6335149879647687933L ^ var3_5)) + (String)m44.a("q", (Object)this, (long)var12_9, (long)5538070892956728443L, (long)var3_5) + "'";
                    v49 = new Object[6];
                    v49[5] = var68_47;
                    v49[4] = var30_18;
                    v49[3] = var6_6;
                    v49[2] = var5_4;
                    v49[1] = var2_3;
                    v49[0] = var67_42;
                    var69_49 = m44.a("q", (Object)var7_2, (Object)v49, (long)5732514246637527522L, (long)var3_5);
                    try {
                        m44.a("q", (Object)var65_38, (Object)var69_49, (long)5567448603076305153L, (long)var3_5);
                        ++var66_40;
                        do {
                            v50 = var56_37;
                            if (var3_5 >= 0L) {
                                if (v50 == false) break block148;
                                v50 = var56_37;
                            }
                            if (v50 != false) continue block95;
                        } while (var3_5 < 0L);
                        break;
                    }
                    catch (IOException v51) {
                        throw m44.a("n", (Object)v51, (long)5227687051162681563L, (long)var3_5);
                    }
                }
                var66_40 = 0;
            }
            block97: while (true) {
                v52 /* !! */  = var66_40;
                block98: while (v52 /* !! */  < var65_38.size()) {
                    v53 /* !! */  = var65_38.elementAt(var66_40);
                    do {
                        var67_42 = (Map)v53 /* !! */ ;
                        var68_47 = var67_42.entrySet().iterator();
                        block100: while (true) {
                            v54 /* !! */  = var68_47.hasNext();
                            while (v54 /* !! */ ) {
                                block160: {
                                    block154: {
                                        block161: {
                                            block157: {
                                                block159: {
                                                    block158: {
                                                        block155: {
                                                            block153: {
                                                                block152: {
                                                                    block151: {
                                                                        block149: {
                                                                            block150: {
                                                                                var69_50 = var68_47.next();
                                                                                var70_51 = (loe)var69_50.getKey();
                                                                                var71_53 = (_v)var69_50.getValue();
                                                                                var72_68 = var71_53.h(var14_10);
                                                                                v52 /* !! */  = (int)var72_68.equals(_v.a("u", (int)17300, (long)(3431738013474037965L ^ var3_5)));
                                                                                if (var56_37 == false) continue block98;
                                                                                if (v52 /* !! */  != 0) break block154;
                                                                                v55 = new Object[3];
                                                                                v55[2] = var8_7;
                                                                                v55[1] = var70_51;
                                                                                v55[0] = var71_53;
                                                                                var73_55 = m44.a("q", (Object)var7_2, (Object)v55, (long)5890132258187341122L, (long)var3_5);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v56 = var73_55;
                                                                                            v57 = var56_37;
                                                                                            if (var3_5 > 0L) {
                                                                                                if (v57 == false) break block149;
                                                                                                if (v56 == null) break block150;
                                                                                            }
                                                                                            ** GOTO lbl417
                                                                                        }
                                                                                        catch (IOException v58) {
                                                                                            throw m44.a("n", (Object)v58, (long)5227687051162681563L, (long)var3_5);
                                                                                        }
                                                                                        v56 = var73_55;
                                                                                        v59 = var71_53;
                                                                                        if (var3_5 <= 0L || var56_37 == false) break block151;
                                                                                    }
                                                                                    catch (IOException v60) {
                                                                                        throw m44.a("n", (Object)v60, (long)5227687051162681563L, (long)var3_5);
                                                                                    }
                                                                                    if (v56 == v59) break block150;
                                                                                }
                                                                                catch (IOException v61) {
                                                                                    throw m44.a("n", (Object)v61, (long)5227687051162681563L, (long)var3_5);
                                                                                }
                                                                                var71_53 = var73_55;
                                                                                var72_68 = var73_55.h(var14_10);
                                                                            }
                                                                            v56 = var71_53;
                                                                        }
                                                                        try {
                                                                            v57 = var56_37;
lbl417:
                                                                            // 2 sources

                                                                            if (v57 == false) break block152;
                                                                            v59 = this;
                                                                        }
                                                                        catch (IOException v62) {
                                                                            throw m44.a("n", (Object)v62, (long)5227687051162681563L, (long)var3_5);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v56 == v59) {
                                                                            v54 /* !! */  = var56_37;
                                                                            if (var3_5 < 0L) continue;
                                                                            if (v54 /* !! */ ) continue block100;
                                                                        }
                                                                    }
                                                                    catch (IOException v63) {
                                                                        throw m44.a("n", (Object)v63, (long)5227687051162681563L, (long)var3_5);
                                                                    }
                                                                    v56 = var58_66.put(var70_51, var71_53);
                                                                }
                                                                var74_69 = v56;
                                                                try {
                                                                    v64 = var74_69;
                                                                    if (var56_37 == false) break block153;
                                                                    if (v64 == null) break block154;
                                                                }
                                                                catch (IOException v65) {
                                                                    throw m44.a("n", (Object)v65, (long)5227687051162681563L, (long)var3_5);
                                                                }
                                                                v64 = var71_53;
                                                            }
                                                            if (v64 == var74_69) break block154;
                                                            var75_56 = l62.t(var72_68);
                                                            var76_58 = l62.t(var74_69.h(var14_10));
                                                            try {
                                                                block156: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v66 = var76_58;
                                                                                v67 = var56_37;
                                                                                if (var3_5 > 0L) {
                                                                                    if (v67 == false) break block155;
                                                                                    if (v66 == null) break block156;
                                                                                }
                                                                                ** GOTO lbl481
                                                                            }
                                                                            catch (IOException v68) {
                                                                                throw m44.a("n", (Object)v68, (long)5227687051162681563L, (long)var3_5);
                                                                            }
                                                                            v69 = var76_58;
                                                                            v70 = var56_37;
                                                                            if (var3_5 >= 0L) {
                                                                                if (v70 == false) break block157;
                                                                            }
                                                                            ** GOTO lbl526
                                                                        }
                                                                        catch (IOException v71) {
                                                                            throw m44.a("n", (Object)v71, (long)5227687051162681563L, (long)var3_5);
                                                                        }
                                                                        if (var3_5 < 0L) break block157;
                                                                        if (v69.c((short)var32_19, var33_20)) {
                                                                        }
                                                                        ** GOTO lbl519
                                                                    }
                                                                    catch (IOException v72) {
                                                                        throw m44.a("n", (Object)v72, (long)5227687051162681563L, (long)var3_5);
                                                                    }
                                                                }
                                                                v66 = var75_56;
                                                            }
                                                            catch (IOException v73) {
                                                                throw m44.a("n", (Object)v73, (long)5227687051162681563L, (long)var3_5);
                                                            }
                                                        }
                                                        try {
                                                            v67 = var56_37;
lbl481:
                                                            // 2 sources

                                                            if (var3_5 >= 0L) {
                                                                if (v67 == false) break block158;
                                                                if (v66 == null) break block154;
                                                            }
                                                            ** GOTO lbl494
                                                        }
                                                        catch (IOException v74) {
                                                            throw m44.a("n", (Object)v74, (long)5227687051162681563L, (long)var3_5);
                                                        }
                                                        v66 = var75_56;
                                                    }
                                                    try {
                                                        try {
                                                            if (var3_5 < 0L) break block159;
                                                            v67 = var56_37;
lbl494:
                                                            // 2 sources

                                                            if (v67 == false) break block159;
                                                            v75 /* !! */  = (CallSite)v66.c((short)var32_19, var33_20);
                                                            if (var3_5 < 0L) break block160;
                                                            if (v75 /* !! */  != false) break block154;
                                                        }
                                                        catch (IOException v76) {
                                                            throw m44.a("n", (Object)v76, (long)5227687051162681563L, (long)var3_5);
                                                        }
                                                        v77 = new Object[6];
                                                        v77[5] = var39_23;
                                                        v77[4] = _v.a("u", (int)15068, (long)(5257798746574510486L ^ var3_5));
                                                        v77[3] = var74_69;
                                                        v77[2] = var70_51;
                                                        v77[1] = var71_53;
                                                        v77[0] = var7_2;
                                                        m44.a("o", (Object)this, (Object)v77, (long)6074002884888189271L, (long)var3_5);
                                                        v66 = var58_66.put(var70_51, var74_69);
                                                    }
                                                    catch (IOException v78) {
                                                        throw m44.a("n", (Object)v78, (long)5227687051162681563L, (long)var3_5);
                                                    }
                                                }
                                                try {
                                                    v75 /* !! */  = var56_37;
                                                    if (var3_5 < 0L) break block160;
                                                    if (v75 /* !! */  != false) break block154;
lbl519:
                                                    // 2 sources

                                                    v69 = var75_56;
                                                }
                                                catch (IOException v79) {
                                                    throw m44.a("n", (Object)v79, (long)5227687051162681563L, (long)var3_5);
                                                }
                                            }
                                            try {
                                                v70 = var56_37;
lbl526:
                                                // 2 sources

                                                if (var3_5 <= 0L) ** GOTO lbl538
                                                if (v70 == false) break block161;
                                                if (v69 != null) {
                                                }
                                                ** GOTO lbl542
                                            }
                                            catch (IOException v80) {
                                                throw m44.a("n", (Object)v80, (long)5227687051162681563L, (long)var3_5);
                                            }
                                            v69 = var75_56;
                                        }
                                        try {
                                            block162: {
                                                try {
                                                    block171: {
                                                        v70 = (short)var32_19;
lbl538:
                                                        // 2 sources

                                                        v75 /* !! */  = (CallSite)v69.c(v70, var33_20);
                                                        if (var3_5 > 0L) {
                                                            if (v75 /* !! */  == false) break block162;
                                                        }
                                                        break block171;
lbl542:
                                                        // 2 sources

                                                        v81 = new Object[6];
                                                        v81[5] = var39_23;
                                                        v81[4] = _v.a("u", (int)16749, (long)(2455157884600001058L ^ var3_5));
                                                        v81[3] = var71_53;
                                                        v81[2] = var70_51;
                                                        v81[1] = var74_69;
                                                        v81[0] = var7_2;
                                                        m44.a("o", (Object)this, (Object)v81, (long)6074002884888189271L, (long)var3_5);
                                                        v75 /* !! */  = var56_37;
                                                    }
                                                    if (var3_5 < 0L) break block160;
                                                    if (v75 /* !! */  != false) break block154;
                                                }
                                                catch (IOException v82) {
                                                    throw m44.a("n", (Object)v82, (long)5227687051162681563L, (long)var3_5);
                                                }
                                            }
                                            v83 = new Object[6];
                                            v83[5] = var39_23;
                                            v83[4] = _v.a("u", (int)6035, (long)(2200770696664446152L ^ var3_5));
                                            v83[3] = var71_53;
                                            v83[2] = var70_51;
                                            v83[1] = var74_69;
                                            v83[0] = var7_2;
                                            m44.a("o", (Object)this, (Object)v83, (long)6074002884888189271L, (long)var3_5);
                                        }
                                        catch (IOException v84) {
                                            throw m44.a("n", (Object)v84, (long)5227687051162681563L, (long)var3_5);
                                        }
                                    }
                                    v75 /* !! */  = var56_37;
                                }
                                if (v75 /* !! */  == false) break block100;
                                continue block100;
                            }
                            break;
                        }
                        ++var66_40;
                        v52 /* !! */  = (int)var56_37;
                        if (var3_5 <= 0L) continue block98;
                        if (v52 /* !! */  != 0) continue block97;
                        v85 = new Object[2];
                        v85[1] = var50_30;
                        v85[0] = var58_66;
                        var59_67 = m44.a("n", (Object)v85, (long)5212671378055084248L, (long)var3_5);
                        v53 /* !! */  = this.A(var35_21);
                    } while (var3_5 <= 0L);
                }
                break;
            }
            var66_41 /* !! */  = v53 /* !! */ ;
            var67_46 = 0;
            block102: while (var67_46 < this.O) {
                try {
                    v86 = new Object[5];
                    v86[4] = this;
                    v86[3] = var10_8;
                    v86[2] = l62.r(var26_16, var57_33);
                    v86[1] = var59_67;
                    v86[0] = var7_2;
                    m44.a("q", var66_41 /* !! */ [var67_46], (Object)v86, (long)6118241087480549280L, (long)var3_5);
                    ++var67_46;
                    do {
                        v87 = var56_37;
                        if (var3_5 >= 0L) {
                            if (v87 == false) break block163;
                            v87 = var56_37;
                        }
                        if (v87 != false) continue block102;
                    } while (var3_5 <= 0L);
                    break;
                }
                catch (IOException v88) {
                    throw m44.a("n", (Object)v88, (long)5227687051162681563L, (long)var3_5);
                }
            }
            v89 = new Object[3];
            v89[2] = var58_66;
            v89[1] = var20_13;
            v89[0] = var57_33;
            m44.a("q", (Object)var7_2, (Object)v89, (long)5927673401674380779L, (long)var3_5);
            v90 = new Object[3];
            v90[2] = var28_17;
            v90[1] = var59_67;
            v90[0] = var57_33;
            m44.a("q", (Object)var7_2, (Object)v90, (long)5556047593018423734L, (long)var3_5);
        }
        return var59_67;
    }

    public void L(Object[] objectArray) {
        Integer n10 = (Integer)objectArray[0];
        this.P = n10;
    }

    public abstract boolean G();

    public void G(Object[] objectArray) {
        boolean bl2;
        _v _v2;
        long l10;
        boolean bl3;
        block2: {
            block3: {
                bl3 = (Boolean)objectArray[0];
                l10 = (Long)objectArray[1];
                l10 = ab ^ l10;
                CallSite callSite = m44.a("i", (long)943684696506793040L, (long)l10);
                try {
                    _v2 = this;
                    bl2 = bl3;
                    if (callSite == false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)n92, (long)795736325908743004L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        m44.a("u", (Object)_v2, (boolean)bl2, (long)1246156587808983104L, (long)l10);
        m44.a("u", (Object)this, (boolean)bl3, (long)1128334106422002681L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public final void s(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[DOLOOP]], but top level block is 4[TRYBLOCK]
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

    public final String W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0xA56EF070783L;
        return this.T.D(l11);
    }

    static String B(long l10, String string) {
        l10 = ab ^ l10;
        return string.replace((char)_v.c("i", (int)4876, (long)(0x7C2203BA669162EAL ^ l10)), (char)_v.c("i", (int)24912, (long)(0x5C7285498C4210B3L ^ l10)));
    }

    public boolean x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return (boolean)m44.a("r", (Object)this, (long)-8301561683094589453L, (long)l10);
    }

    public jv f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return m44.a("p", (Object)this, (long)-5820704453844436559L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ArrayList M(Object[] var1_1) {
        block25: {
            var2_2 = (Long)var1_1[0];
            var4_3 = (_6)var1_1[1];
            var5_4 = (Integer)var1_1[2];
            v0 = var2_2 = _v.ab ^ var2_2;
            var6_5 = v0 ^ 54221260904404L;
            var8_6 = v0 ^ 94746785750122L;
            v1 = v0 ^ 50821749203032L;
            var10_7 = (int)(v1 >>> 32);
            var11_8 = (int)(v1 << 32 >>> 48);
            var12_9 = (int)(v1 << 48 >>> 48);
            var13_10 = v0 ^ 29032184336373L;
            var15_11 = v0 ^ 69523397990655L;
            var17_12 = v0 ^ 30328110747356L;
            var20_13 = new ArrayList<String>();
            var21_14 = null;
            var19_15 = m44.a("m", (long)-5562807661185219708L, (long)var2_2);
            var22_16 = this.a(var10_7, var11_8, var12_9);
            var23_17 = 0;
            var24_18 = this;
            var25_19 = null;
            var26_20 = var5_4;
            block18: while (var22_16 != null) {
                v2 = var20_13;
                if (var19_15 == false) break block25;
                v2.add(var22_16);
                do {
                    block30: {
                        block31: {
                            block32: {
                                block33: {
                                    block26: {
                                        block28: {
                                            block29: {
                                                block27: {
                                                    var27_21 = (String)_v.a("u", (int)31011, (long)(2176280924997019173L ^ var2_2)) + (String)m44.a("r", (Object)var24_18, (long)var6_5, (long)-5726298706517934040L, (long)var2_2) + "'";
                                                    var24_18 = var4_3.g(var22_16, var26_20, var15_11, var27_21);
                                                    try {
                                                        try {
                                                            try {
                                                                v3 /* !! */  = m44.a("i", (long)-5920409343140838159L, (long)var2_2);
                                                                if (var19_15 == false) break block26;
                                                                if (v3 /* !! */  == false) break block27;
                                                            }
                                                            catch (n9 v4) {
                                                                throw m44.a("m", (Object)v4, (long)-5413522310502810488L, (long)var2_2);
                                                            }
                                                            v5 = var25_19;
                                                            v6 /* !! */  = var19_15;
                                                            if (var2_2 >= 0L) {
                                                                if (!v6 /* !! */ ) break block28;
                                                            }
                                                            ** GOTO lbl80
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("m", (Object)v7, (long)-5413522310502810488L, (long)var2_2);
                                                        }
                                                        if (v5 == null) break block27;
                                                    }
                                                    catch (n9 v8) {
                                                        throw m44.a("m", (Object)v8, (long)-5413522310502810488L, (long)var2_2);
                                                    }
                                                    v9 = new Object[4];
                                                    v9[3] = 1;
                                                    v9[2] = var24_18;
                                                    v9[1] = var13_10;
                                                    v9[0] = var25_19;
                                                    v10 = m44.a("m", (Object)v9, (long)-5905421345234791375L, (long)var2_2);
                                                    try {
                                                        try {
                                                            if (var19_15 == false) break block29;
                                                            if (v10 == null) break block27;
                                                        }
                                                        catch (n9 v11) {
                                                            throw m44.a("m", (Object)v11, (long)-5413522310502810488L, (long)var2_2);
                                                        }
                                                        throw new n9((String)var28_22);
                                                    }
                                                    catch (n9 v12) {
                                                        throw m44.a("m", (Object)v12, (long)-5413522310502810488L, (long)var2_2);
                                                    }
                                                }
                                                var25_19 = var24_18;
                                                v10 = var24_18.a(var10_7, var11_8, var12_9);
                                            }
                                            var22_16 = v10;
                                            v5 = var24_18;
                                        }
                                        try {
                                            v6 /* !! */  = var19_15;
lbl80:
                                            // 2 sources

                                            if (var2_2 <= 0L) ** GOTO lbl91
                                            if (v6 /* !! */ ) {
                                                v3 /* !! */  = (CallSite)v5.z(var17_12);
                                            }
                                            ** GOTO lbl90
                                        }
                                        catch (n9 v13) {
                                            throw m44.a("m", (Object)v13, (long)-5413522310502810488L, (long)var2_2);
                                        }
                                    }
                                    if (v3 /* !! */  != false) {
                                        v5 = var24_18;
lbl90:
                                        // 2 sources

                                        v6 /* !! */  = false;
lbl91:
                                        // 2 sources

                                        v14 = m44.a("r", (Object)v5, (Object)new Object[v6 /* !! */ ], (long)-6074173935619625171L, (long)var2_2);
                                    } else {
                                        v14 = var5_4;
                                    }
                                    var26_20 = v14;
                                    try {
                                        try {
                                            v15 /* !! */  = var23_17++;
                                            if (var2_2 <= 0L) break block30;
                                            if (v15 /* !! */  <= _v.c("i", (int)3710, (long)(4277291601189372101L ^ var2_2))) break block31;
                                            v16 = var21_14;
                                            if (var2_2 <= 0L || var19_15 == false) break block32;
                                        }
                                        catch (n9 v17) {
                                            throw m44.a("m", (Object)v17, (long)-5413522310502810488L, (long)var2_2);
                                        }
                                        if (v16 != null) break block33;
                                    }
                                    catch (n9 v18) {
                                        throw m44.a("m", (Object)v18, (long)-5413522310502810488L, (long)var2_2);
                                    }
                                    v19 = new Object[1];
                                    v19[0] = var8_6;
                                    var21_14 = m44.a("m", (Object)v19, (long)-5742479020556105267L, (long)var2_2);
                                }
                                v16 = var21_14;
                            }
                            try {
                                v15 /* !! */  = (int)v16.add(var22_16);
                                if (var2_2 <= 0L) break block30;
                                if (v15 /* !! */  == 0) {
                                    throw new n9((String)_v.a("u", (int)13709, (long)(986286371819006595L ^ var2_2)) + (String)m44.a("r", (Object)var24_18, (long)var6_5, (long)-5726298706517934040L, (long)var2_2) + (String)_v.a("u", (int)11267, (long)(5864352294279394055L ^ var2_2)) + (String)m44.a("r", (Object)this, (long)var6_5, (long)-5726298706517934040L, (long)var2_2) + "'");
                                }
                            }
                            catch (n9 v20) {
                                throw m44.a("m", (Object)v20, (long)-5413522310502810488L, (long)var2_2);
                            }
                        }
                        v15 /* !! */  = (int)var19_15;
                    }
                    if (v15 /* !! */  != 0) continue block18;
                } while (var2_2 <= 0L);
            }
            v2 = var20_13;
        }
        return v2;
    }

    @Override
    public String O(long l10, int n10) {
        return ((gs)this.M.get(0)).n();
    }

    public void l(Object[] objectArray) {
        block5: {
            _v _v2;
            long l10;
            block4: {
                l10 = (Long)objectArray[0];
                gs gs2 = (gs)objectArray[1];
                long l11 = (l10 = ab ^ l10) ^ 0x4B0462B39A3EL;
                CallSite callSite = m44.a("j", (long)-3295523114056317276L, (long)l10);
                try {
                    try {
                        _v2 = this;
                        if (callSite != false) break block4;
                        _v2.M.add(gs2);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        if (m44.a("u", (Object)gs2, (Object)objectArray2, (long)-3925853863401934690L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-3744704954474593185L, (long)l10);
                    }
                    _v2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-3744704954474593185L, (long)l10);
                }
            }
            m44.a("v", (Object)_v2, (boolean)false, (long)-2925155277241868784L, (long)l10);
        }
    }

    @Override
    public String j(long l10) {
        String string;
        block2: {
            String string2;
            block3: {
                long l11 = l10;
                long l12 = l11 ^ 0x42F9636F002DL;
                long l13 = l11 ^ 0x498584693DAFL;
                string2 = ((gs)this.M.get(0)).B(l12);
                String string3 = ht.c(string2, l13);
                CallSite callSite = m44.a("n", (long)-7417506545896337944L, (long)l10);
                try {
                    string = string2;
                    if (callSite != false) break block2;
                    if (string.equals(string3)) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-8699713648613470445L, (long)l10);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append((String)((Object)_v.a("u", (int)30651, (long)(0x779161794518DB31L ^ l10))));
                stringBuilder.append(string2);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
            string = string2;
        }
        return string;
    }

    public boolean E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        return (boolean)m44.a("v", (Object)this, (long)1830239924835558463L, (long)l10);
    }

    public final boolean f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x5D27758DAD25L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("v", (Object)this.T, (Object)objectArray2, (long)-3274170669319136995L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void t(Object[] var1_1) {
        block45: {
            block49: {
                block46: {
                    block47: {
                        block48: {
                            block43: {
                                block44: {
                                    block41: {
                                        block42: {
                                            var6_2 = (Integer)var1_1[0];
                                            var2_3 = (Integer)var1_1[1];
                                            var7_4 = (int[])var1_1[2];
                                            var5_5 = (l6q)var1_1[3];
                                            var3_6 = (Long)var1_1[4];
                                            v0 = var3_6 = _v.ab ^ var3_6;
                                            var8_7 = v0 ^ 58721860766324L;
                                            var10_8 = v0 ^ 28461297062044L;
                                            var12_9 = v0 ^ 22163749591723L;
                                            var14_10 = v0 ^ 122262362119774L;
                                            var16_11 = v0 ^ 97521110105813L;
                                            var18_12 = v0 ^ 62566086892434L;
                                            var21_13 = m44.a("r", (Object)this, (long)var16_11, (int)var6_2, (long)3682618696418325384L, (long)var3_6);
                                            var20_14 = m44.a("m", (long)3304717480158394683L, (long)var3_6);
                                            try {
                                                try {
                                                    if (var20_14 != false) break block41;
                                                    if (var21_13 instanceof jv) break block42;
                                                }
                                                catch (n9 v1) {
                                                    throw m44.a("m", (Object)v1, (long)3717552815970548672L, (long)var3_6);
                                                }
                                                throw new aw((String)m44.a("r", (Object)this, (long)var10_8, (long)4017264849435674464L, (long)var3_6) + (String)_v.a("u", (int)13968, (long)(3253371676290559694L ^ var3_6)) + (String)_v.a("u", (int)1376, (long)(4736122654188772659L ^ var3_6)) + (String)_v.a("u", (int)12504, (long)(7128160079143348357L ^ var3_6)));
                                            }
                                            catch (n9 v2) {
                                                throw m44.a("m", (Object)v2, (long)3717552815970548672L, (long)var3_6);
                                            }
                                        }
                                        try {
                                            m44.a("q", (Object)this, (jv)((jv)var21_13), (long)3826806198065619858L, (long)var3_6);
                                            this.I = m44.a("s", (Object)this, (long)3826806198065619858L, (long)var3_6).g(var14_10);
                                            m44.a("q", (Object)this, (String)this.I.toLowerCase(), (long)2957966129564752444L, (long)var3_6);
                                            v3 = this;
                                            if (var3_6 < 0L || var20_14 != false) break block43;
                                            v3.G = this.I;
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("m", (Object)v4, (long)3717552815970548672L, (long)var3_6);
                                        }
                                    }
                                    try {
                                        v5 = var5_5;
                                        if (var3_6 > 0L) {
                                            if (v5 == null) break block44;
                                            v5 = var5_5;
                                        }
                                        v5.t((jf)m44.a("s", (Object)this, (long)3826806198065619858L, (long)var3_6), (_f)this, var18_12);
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("m", (Object)v6, (long)3717552815970548672L, (long)var3_6);
                                    }
                                }
                                v3 = this;
                            }
                            try {
                                v7 = new Object[1];
                                v7[0] = var8_7;
                                v8 = m44.a("r", (Object)v3.T, (Object)v7, (long)3827729560774647468L, (long)var3_6);
                                if (var20_14 != false) break block45;
                                if (v8 != false) break block46;
                            }
                            catch (n9 v9) {
                                throw m44.a("m", (Object)v9, (long)3717552815970548672L, (long)var3_6);
                            }
                            var22_15 = m44.a("r", (Object)this, (long)var16_11, (int)var2_3, (long)3682618696418325384L, (long)var3_6);
                            try {
                                try {
                                    try {
                                        try {
                                            v10 = var20_14;
                                            if (var3_6 > 0L) {
                                                if (v10 != false) break block47;
                                                if (var22_15 instanceof jv) break block48;
                                            }
                                            ** GOTO lbl94
                                        }
                                        catch (n9 v11) {
                                            throw m44.a("m", (Object)v11, (long)3717552815970548672L, (long)var3_6);
                                        }
                                        v8 = (reference)this.h(var12_9).equals(_v.a("u", (int)17300, (long)(3431712887851736022L ^ var3_6)));
                                        if (var20_14 != false) break block45;
                                    }
                                    catch (n9 v12) {
                                        throw m44.a("m", (Object)v12, (long)3717552815970548672L, (long)var3_6);
                                    }
                                    if (v8 != false) break block46;
                                }
                                catch (n9 v13) {
                                    throw m44.a("m", (Object)v13, (long)3717552815970548672L, (long)var3_6);
                                }
                                throw new aw((String)m44.a("r", (Object)this, (long)var10_8, (long)4017264849435674464L, (long)var3_6) + (String)_v.a("u", (int)26217, (long)(6584292344658099761L ^ var3_6)) + (String)_v.a("u", (int)5780, (long)(8264402373496573657L ^ var3_6)) + (String)_v.a("u", (int)26065, (long)(2745947702825418126L ^ var3_6)));
                            }
                            catch (n9 v14) {
                                throw m44.a("m", (Object)v14, (long)3717552815970548672L, (long)var3_6);
                            }
                        }
                        this.c = (jv)var22_15;
                    }
                    try {
                        try {
                            try {
                                try {
                                    v10 = var20_14;
lbl94:
                                    // 2 sources

                                    if (v10 != false) break block49;
                                    if (var5_5 == null) break block46;
                                }
                                catch (n9 v15) {
                                    throw m44.a("m", (Object)v15, (long)3717552815970548672L, (long)var3_6);
                                }
                                v8 = (reference)(this.c instanceof jf);
                                if (var20_14 != false) break block45;
                            }
                            catch (n9 v16) {
                                throw m44.a("m", (Object)v16, (long)3717552815970548672L, (long)var3_6);
                            }
                            if (v8 == false) break block46;
                        }
                        catch (n9 v17) {
                            throw m44.a("m", (Object)v17, (long)3717552815970548672L, (long)var3_6);
                        }
                        var5_5.t((jf)this.c, (_f)this, var18_12);
                    }
                    catch (n9 v18) {
                        throw m44.a("m", (Object)v18, (long)3717552815970548672L, (long)var3_6);
                    }
                }
                m44.a("q", (Object)this, (jv[])new jv[var7_4.length], (long)3240054209397096058L, (long)var3_6);
            }
            v8 = var22_16 = (reference)false;
        }
        while (var22_16 < m44.a("s", (Object)this, (long)3062985380227035826L, (long)var3_6)) {
            block52: {
                block53: {
                    block54: {
                        block50: {
                            block51: {
                                var23_17 = m44.a("r", (Object)this, (long)var16_11, (int)var7_4[var22_16], (long)3682618696418325384L, (long)var3_6);
                                try {
                                    try {
                                        v19 = var20_14;
                                        if (var3_6 > 0L) {
                                            if (v19 != false) break block50;
                                            if (var23_17 instanceof jv) break block51;
                                        }
                                        ** GOTO lbl140
                                    }
                                    catch (n9 v20) {
                                        throw m44.a("m", (Object)v20, (long)3717552815970548672L, (long)var3_6);
                                    }
                                    throw new aw((String)m44.a("r", (Object)this, (long)var10_8, (long)4017264849435674464L, (long)var3_6) + (String)_v.a("u", (int)26217, (long)(6584292344658099761L ^ var3_6)) + (String)_v.a("u", (int)5780, (long)(8264402373496573657L ^ var3_6)) + (String)_v.a("u", (int)5608, (long)(5062802698702523838L ^ var3_6)));
                                }
                                catch (n9 v21) {
                                    throw m44.a("m", (Object)v21, (long)3717552815970548672L, (long)var3_6);
                                }
                            }
                            m44.a("s", (Object)this, (long)3240054209397096058L, (long)var3_6)[var22_16] = (jv)var23_17;
                        }
                        try {
                            try {
                                try {
                                    v19 = var20_14;
lbl140:
                                    // 2 sources

                                    if (var3_6 <= 0L) break block52;
                                    if (v19 != false) break block53;
                                    if (var5_5 == null) break block54;
                                }
                                catch (n9 v22) {
                                    throw m44.a("m", (Object)v22, (long)3717552815970548672L, (long)var3_6);
                                }
                                if (!(m44.a("s", (Object)this, (long)3240054209397096058L, (long)var3_6)[var22_16] instanceof jf)) break block54;
                            }
                            catch (n9 v23) {
                                throw m44.a("m", (Object)v23, (long)3717552815970548672L, (long)var3_6);
                            }
                            var5_5.t((jf)m44.a("s", (Object)this, (long)3240054209397096058L, (long)var3_6)[var22_16], (_f)this, var18_12);
                        }
                        catch (n9 v24) {
                            throw m44.a("m", (Object)v24, (long)3717552815970548672L, (long)var3_6);
                        }
                    }
                    ++var22_16;
                }
                v19 = var20_14;
            }
            if (v19 == false) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean A(Object[] var1_1) {
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

    public void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x55C279012AD8L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("u", (Object)this.T, (Object)objectArray2, (long)2224045252509898233L, (long)l10);
    }

    public static String i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = (l10 = ab ^ l10) ^ 0x337440FDE441L;
        return _v.h(string, l11, (char)_v.c("i", (int)4876, (long)(0x7C221DF717FD2F41L ^ l10)));
    }

    public String y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = (l10 = ab ^ l10) ^ 0x3918E50DE9D3L;
        return ((jv)((Object)m44.a("v", (Object)this, (long)1980363419034536439L, (long)l10)[n10])).g(l11);
    }

    public boolean k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x1E1C598050D7L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = this.b;
        return (boolean)m44.a("j", (Object)objectArray2, (long)246173424245571702L, (long)l10);
    }

    public boolean r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x7910AC780F8CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = this.b;
        return (boolean)m44.a("k", (Object)objectArray2, (long)-2258684492240586237L, (long)l10);
    }

    public static String H(String string, long l10) {
        long l11 = (l10 = ab ^ l10) ^ 0x7D20E7E97BBCL;
        return _v.X(string, null, l11);
    }

    public _v L(Object[] objectArray) {
        _v _v2;
        block10: {
            _v _v3;
            block11: {
                long l10 = (Long)objectArray[0];
                Integer n10 = (Integer)objectArray[1];
                l10 = ab ^ l10;
                _v3 = this;
                CallSite callSite = m44.a("k", (long)-4703220387678793742L, (long)l10);
                try {
                    _v2 = this;
                    if (callSite == false) break block10;
                    if (_v2.W == null) break block11;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)-5140458501693247234L, (long)l10);
                }
                for (_v _v4 : this.W) {
                    Object object;
                    block13: {
                        block14: {
                            _v _v5;
                            block12: {
                                try {
                                    try {
                                        try {
                                            _v2 = _v4;
                                            CallSite callSite2 = callSite;
                                            if (l10 > 0L) {
                                                if (callSite2 == false) break block10;
                                                callSite2 = callSite;
                                            }
                                            if (callSite2 == false) break block12;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("k", (Object)n93, (long)-5140458501693247234L, (long)l10);
                                        }
                                        object = _v2.P;
                                        if (l10 <= 0L) break block13;
                                        if (object > n10) break block14;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("k", (Object)n94, (long)-5140458501693247234L, (long)l10);
                                    }
                                    _v5 = _v4;
                                }
                                catch (n9 n95) {
                                    throw m44.a("k", (Object)n95, (long)-5140458501693247234L, (long)l10);
                                }
                            }
                            _v3 = _v5;
                        }
                        object = callSite;
                    }
                    if (object != false) continue;
                }
            }
            _v2 = _v3;
        }
        return _v2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String[] b(Object[] var1_1) {
        block12: {
            block11: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (var2_2 = _v.ab ^ var2_2) ^ 47314423801637L;
                var6_4 = m44.a("n", (long)-7734946431729352640L, (long)var2_2);
                try {
                    v0 = m44.a("p", (Object)this, (long)-7670272171220220159L, (long)var2_2);
                    if (var6_4 != false) break block11;
                    if (v0 == null) {
                    }
                    ** GOTO lbl17
                }
                catch (n9 v1) {
                    throw m44.a("n", (Object)v1, (long)-8436329877050178885L, (long)var2_2);
                }
                var7_5 = new String[]{};
                try {
                    if (var6_4 == false) break block12;
lbl17:
                    // 2 sources

                    v0 = m44.a("p", (Object)this, (long)-7670272171220220159L, (long)var2_2);
                }
                catch (n9 v2) {
                    throw m44.a("n", (Object)v2, (long)-8436329877050178885L, (long)var2_2);
                }
            }
            var7_5 = new String[((CallSite)v0).length];
            block6: for (var8_6 = 0; var8_6 < ((CallSite)m44.a("p", (Object)this, (long)-7670272171220220159L, (long)var2_2)).length; ++var8_6) {
                try {
                    do {
                        v3 = var7_5;
                        v4 /* !! */  = var6_4;
                        if (var2_2 > 0L) {
                            if (v4 /* !! */  != false) return v3;
                            v4 /* !! */  = (CallSite)var8_6;
                        }
                        v3[v4 /* !! */ ] = m44.a("p", (Object)this, (long)-7670272171220220159L, (long)var2_2)[var8_6].g(var4_3);
                        if (var6_4 == false) continue block6;
                    } while (var2_2 < 0L);
                    break;
                }
                catch (n9 v5) {
                    throw m44.a("n", (Object)v5, (long)-8436329877050178885L, (long)var2_2);
                }
            }
        }
        v3 = var7_5;
        return v3;
    }

    public String U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x27D0DC63D05BL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this.G;
        objectArray2[0] = l11;
        return m44.a("l", (Object)objectArray2, (long)-4730667095926343388L, (long)l10);
    }

    public boolean J(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = ab ^ l10;
        try {
            bl2 = m44.a("q", (Object)this, (long)-2497320755385432237L, (long)l10) != null;
        }
        catch (n9 n92) {
            throw m44.a("o", (Object)n92, (long)-4306202866731348886L, (long)l10);
        }
        return bl2;
    }

    @Override
    public boolean a(Object[] objectArray) {
        return true;
    }

    /*
     * Exception decompiling
     */
    public String x(Object[] var1_1) {
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
    public final boolean H(Object[] objectArray) {
        return false;
    }

    /*
     * Exception decompiling
     */
    public b4 f(Object[] var1_1) {
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

    public int l(Object[] objectArray) {
        return this.M.size();
    }

    public Enumeration l(Object[] objectArray) {
        return Collections.enumeration(this.M);
    }

    public int W(Object[] objectArray) {
        return this.O;
    }

    public final boolean O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = ab ^ l10) ^ 0x5C56B2541F30L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("q", (Object)this.T, (Object)objectArray2, (long)-99577477948226191L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public void O(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 1[TRYBLOCK]
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
    void h(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[DOLOOP]], but top level block is 5[TRYBLOCK]
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

    public boolean y(long l10) {
        long l11 = (l10 = ab ^ l10) ^ 0x28DC3A61DF8EL;
        return (boolean)m44.a("l", (long)l11, (int)this.b, (long)-1574017632474800018L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _v.ab = prr.a(4584488286998218758L, -2228798373645961173L, MethodHandles.lookup().lookupClass()).a(178047915061881L);
                        var20 = _v.ab ^ 52263339502618L;
                        _v.gb = new HashMap<K, V>(13);
                        m44.a("n", (Object)new int[2], (long)-3250955905013370487L, (long)var20);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[29];
                        var16_4 = 0;
                        var15_5 = "\u00b2\u008f2\u00cd&[q*\u00ed\u00db@(\u0000\u00b4G\u00bcMP\u00a5a\u00ee\u00e3\u00b6X\u008a\u00c5;d\u00be\u0002\u00c7\u00b0!Et\u009a\u00ce\u00be\u00bf\u000f\u00d3$r\u00c0K\u00e9\u00ba\u00a4\u0010\u0083\u00ef\u00c1\u000e\u00cb:]\u008a\u00f0\u00eb\u00f5M|t\u00a3\u00c6\u0010\u00b7F\u00d1\u0014\u009dx\u00ed\u00a7\u00d8\u00b6\u008f\u00df\u00f7\u00ef]3\u0010\u00a1\u008d;\u008d\u00a4\u00c5Y\u00a7\u00d0\u00de\u00dem\u00d2\u0016\u0003_8\u00c9I\u0091\u00f7\u0093\u009da4F\u0000\u00a6}C\u0094f\u0016a\u00d2a\u0010F\u00e1u\u00a2A36:\u00e4\u0002\u00b3\u00a0\u00e7I\u0015\u00bf\u0010\u00b7Uh+\u00de#\u00e9\u00d6A\u0084\u00f2\u00be\u00122\\\u008bM\u00fe\u0019\u0010\u0097Y\u00d9\u001a\u0017\u0097N?6I\u00ce\u00ba\u0001\u00f0\u00df\u0012\u0010\u0094\u00fe,\u00db%>\u00c8G\u0006\u00ed\u00a5#Ln\u000bK\u0010\u00f0?\u0017\u008b\u0017N\u0006\u0018@\u00d9\u00d8\u00b0R\u0089\u00b7l\u0010Xh\u00d1\u009c\u00ddz=IXO\u0003\u00d7\u00e8;\u00a9\u00f8\u0010\u0089v\u00c1C\u00ad\u0097\u001a\u00de\u00deJ-C\u008fu`\u0010\u0010\u008b:{W\u001f\u0081\u0012\u00c5>r\u00807%\u00cb\u00a4\u008e0bI)\u00ba\u00e5q\u00bf\u00b6.\u0001\u00ef\u009b\u0087\u00f8\u00d3\u00f3\u00a5\u0080\u00e7\u0092\u00ec\u00d1xp\u0004C\t\u0007\u0002<\u00b2\u00ebp,\u00815\u00e5\u0005\u001bJ\u00df\u00d4\u00dbXW\u00c9{\u00158\u00dd}O\u0087\u00c2\u008d\u001e\u00f0\u008c,l \u00ccO\u00bb\u00e66m\u00b5\u0002\u00ca\u00f3\u00e4Sy\u00f0\u0018B\u0085\u00e8\u0007\u0015\u0007\u00aa\u00b7\u0080\u00b1\u00bf\u0015\u0095ZX\u0017&\u0095\u00b9\u001b\u001c\u00c4UA\u00ee\u0017\u00eb\u000b\u0088@*\u00c7\u00ed1\u0000B\u00a9_O\u00a2v-<'\u00f2\u00ad\u0010\u0085\u00eb(\u00e7\"z\u00c9\u00ec\u0091\u00eb\u00dbJ]\u0002iD~\u00cd\u00b1\u00b0\u001f\u009a\u00bd\u0081\u00bd\u0019\u0094D\u00f4\u00aa)\u00a0\u00dac\u0085\u00ad\u0012\u00d5\u00bfF\u00fb\u00ab\u0016\b\u00a0G\u00b2\u0010\u0010\u00f1\u00b2\u00b2\u00f6i*\u00a8L\u001b\u007f#]7\u001d\u00fa\u0010\u00a8\u00a0,E\u00da\u00efp\u009d\u00a1\u0011\u00a5\u00d4\u0093\u00b4\u00dc\u008f0\u00e5g\u00e9D,\"\u009c\u0082Y\u00aa\u00d6Y\u00ba\u00cbJ\u0086\u00af\u0085\u008e'\u00efI\u0097-D\u0006\u00d1R cNF\u00c2\u0091%QO\u00ff0\u00d0]\u00f9\u008cq\u00baFk\u008a\u0010n\u0090\u00fd\u00d7!\u0090Os\u0089wm\u00e5\u0082d\u008e\\H%[\u00d8K\n\u00ad/\u000e\u009c7\u0011m\u0096\u0080\u0084\u00ae\u00bc\u00c3\u0089\u0084S|\u00d6>E\u00b2\u00ff\u00e5[\u0003\u00f3\u0000c\u009a\">&\u00cbn\u00bb \u00b0\u009c\u00c6\u009a3Y}\u00ff\u0018\u00d5\u0002\u00d2\u00e4\u0097\u00ff\u0095\u00cf\u00ce\u00dc\u008acg\u00dc&zh\u00fe\u001d\u00d5%\u00a5H\u00ffo\u0015xt\u009fA~\u00a7\u00a8\u0089\u00e9x\u00ca\u00fdH\u00d2\u0014\u00dam\u0081\u00b6\u00d4\u00ab\u0013\u00d8\u008et\u00d5p:'=\nC\u000e\u008aP\u00cb1\u0014\u0092\u009a\u00ee\u0099\u000f\u001b\u00bc\n\u0003\u0097\u00bdz\u00cb\u00f4\r\u00ce\u00d7#B4\u008e5P\u00cf\u0013\u00d51U\b2\u000f\u0018\u00da\\\u00f7+y\f\u00be\"@\u00cf\u001b\u00d5W \u0089'~+\u000exjCn[(\u00f0\u0006N:\u00eaI\u0006\u00dd~\u0005\u00df\u007f\f\u0091\u00b7\u00a5\u00f8\u0092\u00ac}m\u00c474\u00b6\u0019dB\tt\u00c7^\u00ce\u00a7v\u00a7 <x\u0081(\u00d0c\b\u00b9\u00e5\u00d1\u000f\f;\u007fs\u0002\u0010\u00e0\u00e3W;\u00cb\u00b5$\u00f0\u00c8\u00e2K\u00b6\u00e6Y\u00e8\u00a7\n?1\u00aff\u0098\u0090Z\u00c3\u008c\u00da\u0010\u00c1\u0013\u0084\u00d13(\u0088\u00c8r<\u00b1|\u00aa\u0015V\u00060Q\u0001G_\u00df\u0003Nv\u00ab\u0007\u00e1h\u00b7\u00af\u00d5\b\u00ff~\u0082\u00ab\u008d\u0087\u0097+Wv+\u00a2=\u00c8j\u0089\u00af\u00d5\u008e\u0003\n\u0084\u0094\u0085\u00c3\u00de\u009d\nk\u00ec}\u00d08\u00a7\u00ec?G\u008b\u00a2QH\u0000\u00c3m\u0001\u00eb\u0013\u00d0\u0003r\u00c78\u00a2\u0014).\u00c5\u00d3\u0094\u00c4\u00a9,\u0093\u0088j\u00d38%'G\u00f7=\u00adA`p)L4\u0090h)3\u0018\u00f1\u0012\u0003\u0088\u00c20\u00ca\u008bm\u001d\u00d0\u0002?g\u00e1\nUA!\u0085\u0094\u00b7\u00c9\u00cf\u0002\u00df/\u0019<\u00bc\u00ba\u00b0Q9sMO\u00ffQ\t\u0099\u0086\u00c2\u00d0\u00a4\u00d0\u009aT\u00e2U\u00cdim\u0081";
                        var17_6 = "\u00b2\u008f2\u00cd&[q*\u00ed\u00db@(\u0000\u00b4G\u00bcMP\u00a5a\u00ee\u00e3\u00b6X\u008a\u00c5;d\u00be\u0002\u00c7\u00b0!Et\u009a\u00ce\u00be\u00bf\u000f\u00d3$r\u00c0K\u00e9\u00ba\u00a4\u0010\u0083\u00ef\u00c1\u000e\u00cb:]\u008a\u00f0\u00eb\u00f5M|t\u00a3\u00c6\u0010\u00b7F\u00d1\u0014\u009dx\u00ed\u00a7\u00d8\u00b6\u008f\u00df\u00f7\u00ef]3\u0010\u00a1\u008d;\u008d\u00a4\u00c5Y\u00a7\u00d0\u00de\u00dem\u00d2\u0016\u0003_8\u00c9I\u0091\u00f7\u0093\u009da4F\u0000\u00a6}C\u0094f\u0016a\u00d2a\u0010F\u00e1u\u00a2A36:\u00e4\u0002\u00b3\u00a0\u00e7I\u0015\u00bf\u0010\u00b7Uh+\u00de#\u00e9\u00d6A\u0084\u00f2\u00be\u00122\\\u008bM\u00fe\u0019\u0010\u0097Y\u00d9\u001a\u0017\u0097N?6I\u00ce\u00ba\u0001\u00f0\u00df\u0012\u0010\u0094\u00fe,\u00db%>\u00c8G\u0006\u00ed\u00a5#Ln\u000bK\u0010\u00f0?\u0017\u008b\u0017N\u0006\u0018@\u00d9\u00d8\u00b0R\u0089\u00b7l\u0010Xh\u00d1\u009c\u00ddz=IXO\u0003\u00d7\u00e8;\u00a9\u00f8\u0010\u0089v\u00c1C\u00ad\u0097\u001a\u00de\u00deJ-C\u008fu`\u0010\u0010\u008b:{W\u001f\u0081\u0012\u00c5>r\u00807%\u00cb\u00a4\u008e0bI)\u00ba\u00e5q\u00bf\u00b6.\u0001\u00ef\u009b\u0087\u00f8\u00d3\u00f3\u00a5\u0080\u00e7\u0092\u00ec\u00d1xp\u0004C\t\u0007\u0002<\u00b2\u00ebp,\u00815\u00e5\u0005\u001bJ\u00df\u00d4\u00dbXW\u00c9{\u00158\u00dd}O\u0087\u00c2\u008d\u001e\u00f0\u008c,l \u00ccO\u00bb\u00e66m\u00b5\u0002\u00ca\u00f3\u00e4Sy\u00f0\u0018B\u0085\u00e8\u0007\u0015\u0007\u00aa\u00b7\u0080\u00b1\u00bf\u0015\u0095ZX\u0017&\u0095\u00b9\u001b\u001c\u00c4UA\u00ee\u0017\u00eb\u000b\u0088@*\u00c7\u00ed1\u0000B\u00a9_O\u00a2v-<'\u00f2\u00ad\u0010\u0085\u00eb(\u00e7\"z\u00c9\u00ec\u0091\u00eb\u00dbJ]\u0002iD~\u00cd\u00b1\u00b0\u001f\u009a\u00bd\u0081\u00bd\u0019\u0094D\u00f4\u00aa)\u00a0\u00dac\u0085\u00ad\u0012\u00d5\u00bfF\u00fb\u00ab\u0016\b\u00a0G\u00b2\u0010\u0010\u00f1\u00b2\u00b2\u00f6i*\u00a8L\u001b\u007f#]7\u001d\u00fa\u0010\u00a8\u00a0,E\u00da\u00efp\u009d\u00a1\u0011\u00a5\u00d4\u0093\u00b4\u00dc\u008f0\u00e5g\u00e9D,\"\u009c\u0082Y\u00aa\u00d6Y\u00ba\u00cbJ\u0086\u00af\u0085\u008e'\u00efI\u0097-D\u0006\u00d1R cNF\u00c2\u0091%QO\u00ff0\u00d0]\u00f9\u008cq\u00baFk\u008a\u0010n\u0090\u00fd\u00d7!\u0090Os\u0089wm\u00e5\u0082d\u008e\\H%[\u00d8K\n\u00ad/\u000e\u009c7\u0011m\u0096\u0080\u0084\u00ae\u00bc\u00c3\u0089\u0084S|\u00d6>E\u00b2\u00ff\u00e5[\u0003\u00f3\u0000c\u009a\">&\u00cbn\u00bb \u00b0\u009c\u00c6\u009a3Y}\u00ff\u0018\u00d5\u0002\u00d2\u00e4\u0097\u00ff\u0095\u00cf\u00ce\u00dc\u008acg\u00dc&zh\u00fe\u001d\u00d5%\u00a5H\u00ffo\u0015xt\u009fA~\u00a7\u00a8\u0089\u00e9x\u00ca\u00fdH\u00d2\u0014\u00dam\u0081\u00b6\u00d4\u00ab\u0013\u00d8\u008et\u00d5p:'=\nC\u000e\u008aP\u00cb1\u0014\u0092\u009a\u00ee\u0099\u000f\u001b\u00bc\n\u0003\u0097\u00bdz\u00cb\u00f4\r\u00ce\u00d7#B4\u008e5P\u00cf\u0013\u00d51U\b2\u000f\u0018\u00da\\\u00f7+y\f\u00be\"@\u00cf\u001b\u00d5W \u0089'~+\u000exjCn[(\u00f0\u0006N:\u00eaI\u0006\u00dd~\u0005\u00df\u007f\f\u0091\u00b7\u00a5\u00f8\u0092\u00ac}m\u00c474\u00b6\u0019dB\tt\u00c7^\u00ce\u00a7v\u00a7 <x\u0081(\u00d0c\b\u00b9\u00e5\u00d1\u000f\f;\u007fs\u0002\u0010\u00e0\u00e3W;\u00cb\u00b5$\u00f0\u00c8\u00e2K\u00b6\u00e6Y\u00e8\u00a7\n?1\u00aff\u0098\u0090Z\u00c3\u008c\u00da\u0010\u00c1\u0013\u0084\u00d13(\u0088\u00c8r<\u00b1|\u00aa\u0015V\u00060Q\u0001G_\u00df\u0003Nv\u00ab\u0007\u00e1h\u00b7\u00af\u00d5\b\u00ff~\u0082\u00ab\u008d\u0087\u0097+Wv+\u00a2=\u00c8j\u0089\u00af\u00d5\u008e\u0003\n\u0084\u0094\u0085\u00c3\u00de\u009d\nk\u00ec}\u00d08\u00a7\u00ec?G\u008b\u00a2QH\u0000\u00c3m\u0001\u00eb\u0013\u00d0\u0003r\u00c78\u00a2\u0014).\u00c5\u00d3\u0094\u00c4\u00a9,\u0093\u0088j\u00d38%'G\u00f7=\u00adA`p)L4\u0090h)3\u0018\u00f1\u0012\u0003\u0088\u00c20\u00ca\u008bm\u001d\u00d0\u0002?g\u00e1\nUA!\u0085\u0094\u00b7\u00c9\u00cf\u0002\u00df/\u0019<\u00bc\u00ba\u00b0Q9sMO\u00ffQ\t\u0099\u0086\u00c2\u00d0\u00a4\u00d0\u009aT\u00e2U\u00cdim\u0081".length();
                        var14_7 = 48;
                        var13_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _v.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "x\u0086\u00d3\u00d4\u000f\u0095\u00b7\u00a3\u00a8\u0006Z\u0001=\u00dc+\u00a6\u008e0\u00ba\u00e3\u0002\u0091F]\u0018\u00ed\u00ceY\u00f9\u0093\u00faq\u00b4\u00eeu\u00fbP\u00f8\u00c5-1\u00ca7\u00f1\u00e7/\u0089\u00c4\u0094\u0002\u000e\u00e8\u00b3\u00b5!=b\u00e8gU\u00e4O\t\u00c0t\u00e9<\t#\u00dd\u00de\u0090\u001fofn\u0089V\u00b1\u00d5\u0082e}\b$\u0013\rF\u001aO\u0016\u0010q*\u0083I\u00e9kX\u00cd\u008e\u00ed\u00c85\u0010\u00b8h|6\u0017\u0016\u00dd\u0004<TR\u000fo\\\u00b0u";
                            var17_6 = "x\u0086\u00d3\u00d4\u000f\u0095\u00b7\u00a3\u00a8\u0006Z\u0001=\u00dc+\u00a6\u008e0\u00ba\u00e3\u0002\u0091F]\u0018\u00ed\u00ceY\u00f9\u0093\u00faq\u00b4\u00eeu\u00fbP\u00f8\u00c5-1\u00ca7\u00f1\u00e7/\u0089\u00c4\u0094\u0002\u000e\u00e8\u00b3\u00b5!=b\u00e8gU\u00e4O\t\u00c0t\u00e9<\t#\u00dd\u00de\u0090\u001fofn\u0089V\u00b1\u00d5\u0082e}\b$\u0013\rF\u001aO\u0016\u0010q*\u0083I\u00e9kX\u00cd\u008e\u00ed\u00c85\u0010\u00b8h|6\u0017\u0016\u00dd\u0004<TR\u000fo\\\u00b0u".length();
                            var14_7 = 104;
                            var13_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _v.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                _v.eb = var18_3;
                _v.fb = new String[29];
                _v.mb = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[18];
                var3_13 = 0;
                var4_14 = "\u00de\u008b-9H&\u00eb\u00c0\u001c\u00d9\u0012\u00f5\u0099\u00dd\u00937D\u00f1\u00d2\u00a1gl\u00c3`\u0010\u00c3>\u00ed\u00e3n\u0089ZE\b-\u00ab\u00a9\u0003]\u0096\t\u00e9\u008e%\u0087\u00b4\u00bd'BI\u00ef\u00c9h1\u0096C\r-\u00e3v\u009c\u00f9\u00a9\u00e1\u00d3\u00a9\u009d\u00be<(2O+\u00a6\u00f2\u00fa\u00833\u00bf\u00b0B\u0093!U\u00f3\u00c7\u00b8\u00c1\u00d3$O\u0097\u00bdu\u00a7\u0012\u00cb\u00dc\u00da\u00a4\u00bca\fM\t\u0011\u008a&\u00c5\u001b\u00c82+\u00ff^R\u00fdX\u0082\u001d\u00a7\u00b3\n\u00e1\u00aa\u00d1`\u00b2";
                var5_15 = "\u00de\u008b-9H&\u00eb\u00c0\u001c\u00d9\u0012\u00f5\u0099\u00dd\u00937D\u00f1\u00d2\u00a1gl\u00c3`\u0010\u00c3>\u00ed\u00e3n\u0089ZE\b-\u00ab\u00a9\u0003]\u0096\t\u00e9\u008e%\u0087\u00b4\u00bd'BI\u00ef\u00c9h1\u0096C\r-\u00e3v\u009c\u00f9\u00a9\u00e1\u00d3\u00a9\u009d\u00be<(2O+\u00a6\u00f2\u00fa\u00833\u00bf\u00b0B\u0093!U\u00f3\u00c7\u00b8\u00c1\u00d3$O\u0097\u00bdu\u00a7\u0012\u00cb\u00dc\u00da\u00a4\u00bca\fM\t\u0011\u008a&\u00c5\u001b\u00c82+\u00ff^R\u00fdX\u0082\u001d\u00a7\u00b3\n\u00e1\u00aa\u00d1`\u00b2".length();
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
lbl79:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00df\u0094\u00e7N\u0098\u007f\u00e2\u008e\u00ee\u00f8\u0094\u00ec\u009a\u00c6J\u00ed";
                    var5_15 = "\u00df\u0094\u00e7N\u0098\u007f\u00e2\u008e\u00ee\u00f8\u0094\u00ec\u009a\u00c6J\u00ed".length();
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
lbl92:
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
lbl105:
                // 1 sources

                ** continue;
            }
        }
        _v.kb = var6_12;
        _v.lb = new Integer[18];
    }

    private static Exception b(Exception exception) {
        return exception;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3ECD;
        if (fb[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])gb.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    gb.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_v", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eb[n11].getBytes("ISO-8859-1");
            _v.fb[n11] = _v.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return fb[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = _v.a(n10, l10);
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
            throw new RuntimeException("com/zelix/_v" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2F61;
        if (lb[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = kb[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_v", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _v.lb[n11] = n12;
        }
        return lb[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = _v.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/_v" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_v.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_v.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

