/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._e;
import com.zelix._f;
import com.zelix.a6;
import com.zelix.ao;
import com.zelix.gp;
import com.zelix.lks;
import com.zelix.lml;
import com.zelix.loe;
import com.zelix.loq;
import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o6;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.uc;
import com.zelix.vq;
import com.zelix.vu;
import com.zelix.y7;
import com.zelix.zh;
import com.zelix.zr;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hn {
    private List S;
    private final int y;
    private final int C;
    private static long m;
    private static int Z;
    private s4 i;
    private loq a;
    private lks d;
    private boolean b;
    private String G;
    private static final long c;
    private static final String[] e;
    private static final String[] f;
    private static final Map g;
    private static final long[] h;
    private static final Integer[] j;
    private static final Map k;
    private static final long[] l;
    private static final Long[] n;
    private static final Map o;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void C(Object[] var1_1) {
        block24: {
            block25: {
                block26: {
                    block18: {
                        var2_2 = (Long)var1_1[0];
                        v0 = var2_2 = hn.c ^ var2_2;
                        var4_3 = v0 ^ 122246342555747L;
                        var6_4 = v0 ^ 12203625402905L;
                        var8_5 = v0 ^ 110300014216183L;
                        var11_6 = new StringWriter();
                        var10_7 = m44.a("k", (long)2990846165217870589L, (long)var2_2);
                        var12_8 = new PrintWriter(var11_6);
                        var13_9 = m44.a("u", (Object)this, (long)2914595115192698169L, (long)var2_2).iterator();
                        while (var13_9.hasNext()) {
                            block23: {
                                block21: {
                                    block22: {
                                        block19: {
                                            block20: {
                                                block27: {
                                                    var14_10 = (String)var13_9.next();
                                                    v1 = new Object[2];
                                                    v1[1] = var4_3;
                                                    v1[0] = var14_10;
                                                    var15_11 = m44.a("j", (Object)this, (Object)v1, (long)3109269837055357474L, (long)var2_2);
                                                    if (var2_2 <= 0L || var10_7 == false) break block18;
                                                    v2 = var15_11;
                                                    v3 = var10_7;
                                                    if (var2_2 < 0L) ** GOTO lbl44
                                                    if (v3 == false) break block19;
                                                    break block27;
                                                    catch (ao v4) {
                                                        throw m44.a("k", (Object)v4, (long)2896228432360077034L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    block28: {
                                                        if (v2 != null) break block20;
                                                        break block28;
                                                        catch (ao v5) {
                                                            throw m44.a("k", (Object)v5, (long)2896228432360077034L, (long)var2_2);
                                                        }
                                                    }
                                                    throw new a6((String)hn.a("x", (int)19259, (long)(6991547315674163772L ^ var2_2)) + var14_10 + (String)hn.a("x", (int)23142, (long)(5260796349016128380L ^ var2_2)));
                                                }
                                                catch (ao v6) {
                                                    throw m44.a("k", (Object)v6, (long)2896228432360077034L, (long)var2_2);
                                                }
                                            }
                                            v2 = m44.a("u", (Object)this, (long)3262608827138781730L, (long)var2_2);
                                        }
                                        v3 = var10_7;
lbl44:
                                        // 2 sources

                                        if (v3 == false) break block21;
                                        try {
                                            block29: {
                                                if (v2 != null) break block22;
                                                break block29;
                                                catch (ao v7) {
                                                    throw m44.a("k", (Object)v7, (long)2896228432360077034L, (long)var2_2);
                                                }
                                            }
                                            m44.a("w", (Object)this, (lks)var15_11, (long)3262608827138781730L, (long)var2_2);
                                            v8 = var10_7;
                                            if (var2_2 < 0L) break block23;
                                            if (v8 != false) break block21;
                                        }
                                        catch (ao v9) {
                                            throw m44.a("k", (Object)v9, (long)2896228432360077034L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        v10 = new Object[3];
                                        v10[2] = var12_8;
                                        v10[1] = var15_11;
                                        v10[0] = var8_5;
                                        v2 = m44.a("t", (Object)m44.a("u", (Object)this, (long)3262608827138781730L, (long)var2_2), (Object)v10, (long)3480885682827292298L, (long)var2_2);
                                    }
                                    catch (ao var16_12) {
                                        throw new a6((String)m44.a("t", (Object)var16_12, (long)3266288640864856179L, (long)var2_2));
                                    }
                                }
                                v8 = var10_7;
                            }
                            if (v8 != false) continue;
                        }
                        m44.a("w", (Object)this, (String)m44.a("t", (Object)var11_6, (long)4028317087272685231L, (long)var2_2), (long)3100518465596809203L, (long)var2_2);
                        if (var2_2 > 0L) {
                            // empty if block
                        }
                    }
                    try {
                        try {
                            v11 = this;
                            v12 /* !! */  = var10_7;
                            if (var2_2 < 0L) break block24;
                            if (v12 /* !! */  == false) break block25;
                            if (m44.a("u", (Object)v11, (long)2952032706720437693L, (long)var2_2) == null) break block26;
                        }
                        catch (ao v13) {
                            throw m44.a("k", (Object)v13, (long)2896228432360077034L, (long)var2_2);
                        }
                        m44.a("w", (Object)this, (loq)new loq((s4)m44.a("u", (Object)this, (long)2952032706720437693L, (long)var2_2), var6_4, (boolean)m44.a("o", (long)4016663644673926258L, (long)var2_2)), (long)2898561262334041275L, (long)var2_2);
                    }
                    catch (ao v14) {
                        throw m44.a("k", (Object)v14, (long)2896228432360077034L, (long)var2_2);
                    }
                }
                v11 = this;
            }
            v12 /* !! */  = (CallSite)true;
        }
        m44.a("w", (Object)v11, (boolean)v12 /* !! */ , (long)3303829563890066745L, (long)var2_2);
    }

    public void f(Object[] objectArray) {
        block4: {
            long l10;
            long l11;
            block5: {
                l11 = (Long)objectArray[0];
                long l12 = l11 = c ^ l11;
                long l13 = l12 ^ 0x6B9FD8DB3797L;
                l10 = l12 ^ 0x122497565E51L;
                CallSite callSite = m44.a("i", (long)3674331991950490491L, (long)l11);
                try {
                    try {
                        if (callSite != false) break block4;
                        if (m44.a("w", (Object)this, (long)3108575348989812641L, (long)l11) == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)3110679718916486640L, (long)l11);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l13;
                    m44.a("v", (Object)m44.a("w", (Object)this, (long)3108575348989812641L, (long)l11), (Object)objectArray2, (long)3596533123311767277L, (long)l11);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)3110679718916486640L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l10;
            m44.a("i", (Object)objectArray3, (long)3394466157372380531L, (long)l11);
        }
    }

    public static int h() {
        return Z;
    }

    public String n(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        boolean bl2 = (Boolean)objectArray[2];
        long l11 = (l10 = c ^ l10) ^ 0x7555BC101C5L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = 2;
        objectArray2[2] = bl2;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("w", (Object)this, (Object)objectArray2, (long)972584258099207087L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    private List B(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[DOLOOP]], but top level block is 5[TRYBLOCK]
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
    private List c(Object[] objectArray) {
        ArrayList<vq> arrayList;
        List list = (List)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = c ^ l10) ^ 0x2F7F749983ABL;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 48);
        int n12 = (int)(l11 << 32 >>> 32);
        ArrayList<vq> arrayList2 = new ArrayList<vq>(list.size());
        CallSite callSite = m44.a("k", (long)8363072612729994633L, (long)l10);
        int n13 = 0;
        block2: while (n13 < list.size()) {
            y7 y72 = (y7)list.get(n13);
            try {
                do {
                    if (l10 >= 0L) {
                        arrayList = arrayList2;
                        if (callSite != false) return arrayList;
                        arrayList.add(new vq(y72, (char)n10, (char)n11, (lks)((Object)m44.a("u", (Object)this, (long)7543385219462952906L, (long)l10)), n12));
                        ++n13;
                    }
                    if (callSite == false) continue block2;
                } while (l10 <= 0L);
                break;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("k", (Object)illegalArgumentException, (long)7915386376774300418L, (long)l10);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public String U(Object[] objectArray) {
        Object object;
        Object object2;
        long l10;
        block21: {
            Object object3;
            block20: {
                String string;
                CallSite callSite;
                long l11;
                String string2;
                block24: {
                    String string3;
                    block23: {
                        block22: {
                            Object object4;
                            block18: {
                                block19: {
                                    block16: {
                                        block17: {
                                            string2 = (String)objectArray[0];
                                            l10 = (Long)objectArray[1];
                                            long l12 = l10 = c ^ l10;
                                            l11 = l12 ^ 0x3BC25B70EF57L;
                                            long l13 = l12 ^ 0x5B72D9C9891EL;
                                            callSite = m44.a("n", (long)843487748458062024L, (long)l10);
                                            try {
                                                try {
                                                    object4 = m44.a("p", (Object)this, (long)1147496948941702924L, (long)l10);
                                                    if (callSite == false) break block16;
                                                    if (object4 != false) break block17;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("n", (Object)illegalArgumentException, (long)721787004247823583L, (long)l10);
                                                }
                                                Object[] objectArray2 = new Object[1];
                                                objectArray2[0] = l13;
                                                m44.a("o", (Object)this, (Object)objectArray2, (long)1354553687342740914L, (long)l10);
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("n", (Object)illegalArgumentException, (long)721787004247823583L, (long)l10);
                                            }
                                        }
                                        object4 = string2.indexOf("/");
                                    }
                                    try {
                                        try {
                                            Object object5 = callSite;
                                            if (l10 >= 0L) {
                                                if (object5 == false) break block18;
                                                object5 = -1;
                                            }
                                            if (object4 <= object5) break block19;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("n", (Object)illegalArgumentException, (long)721787004247823583L, (long)l10);
                                        }
                                        object4 = true;
                                        break block18;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("n", (Object)illegalArgumentException, (long)721787004247823583L, (long)l10);
                                    }
                                }
                                object4 = false;
                            }
                            if ((object2 = object4) == false) break block22;
                            string3 = string2.replace((char)hn.b("c", (int)22647, (long)(0x775A87393A648E31L ^ l10)), (char)hn.b("c", (int)10352, (long)(0x6E2C7B99005D7E3BL ^ l10)));
                            if (l10 <= 0L) break block23;
                            string = string3;
                            if (callSite != false) break block24;
                        }
                        string3 = string2;
                    }
                    string = string3;
                }
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l11;
                objectArray3[0] = string;
                object = m44.a("q", (Object)m44.a("p", (Object)this, (long)1112996518915411991L, (long)l10), (Object)objectArray3, (long)1563498016334654151L, (long)l10);
                try {
                    object3 = object;
                    if (callSite == false) break block20;
                    if (object3 != null) break block21;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)721787004247823583L, (long)l10);
                }
                object3 = string2;
            }
            return object3;
        }
        if (object2 != false) {
            object = ((String)object).replace((char)hn.b("c", (int)10352, (long)(0x6E2C7B99005D7E3BL ^ l10)), (char)hn.b("c", (int)22647, (long)(0x775A87393A648E31L ^ l10)));
        }
        return object;
    }

    public String b(Object[] objectArray) {
        hn hn2;
        long l10;
        String string;
        String[] stringArray;
        String string2;
        long l11;
        String string3;
        block4: {
            block5: {
                string3 = (String)objectArray[0];
                l11 = (Long)objectArray[1];
                string2 = (String)objectArray[2];
                stringArray = (String[])objectArray[3];
                string = (String)objectArray[4];
                long l12 = l11 = c ^ l11;
                long l13 = l12 ^ 0x3844D91F2878L;
                l10 = l12 ^ 0x4402797AF469L;
                CallSite callSite = m44.a("h", (long)-6137622798200602194L, (long)l11);
                try {
                    try {
                        hn2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("v", (Object)hn2, (long)-5869640212906940822L, (long)l11) != false) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-6097260081156852295L, (long)l11);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l13;
                    m44.a("i", (Object)this, (Object)objectArray2, (long)-5500526472859429676L, (long)l11);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)-6097260081156852295L, (long)l11);
                }
            }
            hn2 = this;
        }
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = string;
        objectArray3[3] = stringArray;
        objectArray3[2] = string2;
        objectArray3[1] = l10;
        objectArray3[0] = string3;
        CallSite callSite = m44.a("w", (Object)m44.a("v", (Object)hn2, (long)-5903010362145001103L, (long)l11), (Object)objectArray3, (long)-6176687983359237148L, (long)l11);
        return callSite;
    }

    /*
     * Exception decompiling
     */
    private lks x(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[CATCHBLOCK]], but top level block is 7[TRYBLOCK]
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
    private List L(Object[] var1_1) {
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String J(Object[] var1_1) {
        block49: {
            block47: {
                block48: {
                    block45: {
                        block42: {
                            block39: {
                                block40: {
                                    block37: {
                                        block38: {
                                            var6_2 = (String)var1_1[0];
                                            var3_3 = (Long)var1_1[1];
                                            var2_4 = (Boolean)var1_1[2];
                                            var5_5 = (Integer)var1_1[3];
                                            v0 = var3_3 = hn.c ^ var3_3;
                                            var7_6 = v0 ^ 123927744201958L;
                                            var9_7 = v0 ^ 19962448283631L;
                                            var12_8 = new StringBuilder();
                                            var11_9 = m44.a("n", (long)-4700421117021579848L, (long)var3_3);
                                            var13_10 = new zr();
                                            v1 = new Object[5];
                                            v1[4] = var13_10;
                                            v1[3] = var5_5;
                                            v1[2] = var2_4;
                                            v1[1] = var6_2;
                                            v1[0] = var9_7;
                                            var14_11 = m44.a("o", (Object)this, (Object)v1, (long)-4695110983957571977L, (long)var3_3);
                                            try {
                                                try {
                                                    v2 = var13_10.S();
                                                    if (var11_9 == false) break block37;
                                                    if (v2 != 0) break block38;
                                                }
                                                catch (IllegalArgumentException v3) {
                                                    throw m44.a("n", (Object)v3, (long)-4650994442713636433L, (long)var3_3);
                                                }
                                                var12_8.append((String)hn.a("x", (int)5653, (long)(6931736238971674691L ^ var3_3)));
                                                var12_8.append(_e.n);
                                                var12_8.append(_e.n);
                                            }
                                            catch (IllegalArgumentException v4) {
                                                throw m44.a("n", (Object)v4, (long)-4650994442713636433L, (long)var3_3);
                                            }
                                        }
                                        v2 = ((CallSite)var14_11).length;
                                    }
                                    try {
                                        block41: {
                                            try {
                                                try {
                                                    try {
                                                        v5 /* !! */  = var11_9;
                                                        if (var3_3 > 0L) {
                                                            if (v5 /* !! */  == false) break block39;
                                                            v5 /* !! */  = (reference)true;
                                                        }
                                                        if (v2 == v5 /* !! */ ) {
                                                        }
                                                        ** GOTO lbl80
                                                    }
                                                    catch (IllegalArgumentException v6) {
                                                        throw m44.a("n", (Object)v6, (long)-4650994442713636433L, (long)var3_3);
                                                    }
                                                    if (var3_3 < 0L) break block40;
                                                    if (!var2_4) break block41;
                                                }
                                                catch (IllegalArgumentException v7) {
                                                    throw m44.a("n", (Object)v7, (long)-4650994442713636433L, (long)var3_3);
                                                }
                                                if (var3_3 >= 0L) {
                                                    if (m44.a("p", (Object)this, (long)-4633470352802872584L, (long)var3_3) != null) break block40;
                                                }
                                                ** GOTO lbl79
                                            }
                                            catch (IllegalArgumentException v8) {
                                                throw m44.a("n", (Object)v8, (long)-4650994442713636433L, (long)var3_3);
                                            }
                                        }
                                        var12_8.append((String)hn.a("x", (int)24772, (long)(7551163137587517064L ^ var3_3)));
                                        var12_8.append(_e.n);
                                        var12_8.append(_e.n);
                                    }
                                    catch (IllegalArgumentException v9) {
                                        throw m44.a("n", (Object)v9, (long)-4650994442713636433L, (long)var3_3);
                                    }
                                }
                                try {
                                    var12_8.append((String)var14_11[0]);
lbl79:
                                    // 2 sources

                                    if (var3_3 < 0L || var11_9 != false) break block42;
lbl80:
                                    // 2 sources

                                    var12_8.append((String)hn.a("x", (int)25728, (long)(6394290182147609288L ^ var3_3)) + ((CallSite)var14_11).length + (String)hn.a("x", (int)18178, (long)(7909370631339749701L ^ var3_3)));
                                    var12_8.append(_e.n);
                                    var12_8.append(_e.n);
                                    v2 = 0;
                                }
                                catch (IllegalArgumentException v10) {
                                    throw m44.a("n", (Object)v10, (long)-4650994442713636433L, (long)var3_3);
                                }
                            }
                            var15_12 = v2;
                            while (var15_12 < ((CallSite)var14_11).length) {
                                block43: {
                                    block44: {
                                        block46: {
                                            var16_13 = (String)hn.a("x", (int)31191, (long)(3563962823073763226L ^ var3_3)) + (var15_12 + 1) + (String)hn.a("x", (int)26364, (long)(8490217537470075048L ^ var3_3)) + ((CallSite)var14_11).length + (String)hn.a("x", (int)21555, (long)(7678119552736928362L ^ var3_3));
                                            try {
                                                try {
                                                    try {
                                                        var12_8.append(var16_13 + _e.n);
                                                        v11 = new Object[3];
                                                        v11[2] = (int)hn.b("c", (int)20657, (long)(8328056351189054339L ^ var3_3));
                                                        v11[1] = var7_6;
                                                        v11[0] = var16_13.length();
                                                        var12_8.append((String)m44.a("n", (Object)v11, (long)-6569721942546551589L, (long)var3_3) + _e.n);
                                                        var12_8.append((String)var14_11[var15_12]);
                                                        v12 = var11_9;
                                                        if (var3_3 < 0L) break block43;
                                                        if (v12 == false) break block44;
                                                        v13 = var15_12;
                                                        if (var3_3 < 0L || var11_9 == false) break block45;
                                                    }
                                                    catch (IllegalArgumentException v14) {
                                                        throw m44.a("n", (Object)v14, (long)-4650994442713636433L, (long)var3_3);
                                                    }
                                                    if (v13 >= ((CallSite)var14_11).length - 1) break block46;
                                                }
                                                catch (IllegalArgumentException v15) {
                                                    throw m44.a("n", (Object)v15, (long)-4650994442713636433L, (long)var3_3);
                                                }
                                                var12_8.append(_e.n);
                                            }
                                            catch (IllegalArgumentException v16) {
                                                throw m44.a("n", (Object)v16, (long)-4650994442713636433L, (long)var3_3);
                                            }
                                        }
                                        ++var15_12;
                                    }
                                    v12 = var11_9;
                                }
                                if (v12 != false) continue;
                            }
                        }
                        try {
                            try {
                                try {
                                    v17 = m44.a("p", (Object)this, (long)-4881233190877509450L, (long)var3_3);
                                    v18 = var11_9;
                                    if (var3_3 >= 0L) {
                                        if (v18 == false) break block47;
                                        if (v17 == null) break block48;
                                    }
                                    ** GOTO lbl169
                                }
                                catch (IllegalArgumentException v19) {
                                    throw m44.a("n", (Object)v19, (long)-4650994442713636433L, (long)var3_3);
                                }
                                v17 = m44.a("p", (Object)this, (long)-4881233190877509450L, (long)var3_3);
                                if (var3_3 <= 0L || var11_9 == false) break block47;
                            }
                            catch (IllegalArgumentException v20) {
                                throw m44.a("n", (Object)v20, (long)-4650994442713636433L, (long)var3_3);
                            }
                            v13 = v17.length();
                        }
                        catch (IllegalArgumentException v21) {
                            throw m44.a("n", (Object)v21, (long)-4650994442713636433L, (long)var3_3);
                        }
                    }
                    try {
                        if (v13 > 0) {
                            var12_8.append(_e.n);
                            var12_8.append((String)m44.a("p", (Object)this, (long)-4881233190877509450L, (long)var3_3));
                        }
                    }
                    catch (IllegalArgumentException v22) {
                        throw m44.a("n", (Object)v22, (long)-4650994442713636433L, (long)var3_3);
                    }
                }
                v17 = var12_8.toString();
            }
            try {
                if (var3_3 < 0L || m44.a("n", (long)-6471860349521977578L, (long)var3_3) != null) break block49;
                v18 = ++var11_9;
lbl169:
                // 2 sources

                m44.a("n", (int)v18, (long)-6451434890982427102L, (long)var3_3);
            }
            catch (IllegalArgumentException v23) {
                throw m44.a("n", (Object)v23, (long)-4650994442713636433L, (long)var3_3);
            }
        }
        return v17;
    }

    private lml B(Object[] objectArray) {
        Object object;
        long l10;
        loq loq2;
        o6 o62;
        block7: {
            Object object2;
            block8: {
                block9: {
                    CallSite callSite;
                    long l11;
                    block6: {
                        o62 = (o6)objectArray[0];
                        loq2 = (loq)objectArray[1];
                        l11 = (Long)objectArray[2];
                        lks lks2 = (lks)objectArray[3];
                        long l12 = l11 = c ^ l11;
                        l10 = l12 ^ 0x3F29790C91BBL;
                        long l13 = l12 ^ 0x54328496FE2DL;
                        long l14 = l12 ^ 0x3A5120E60C0BL;
                        long l15 = l12 ^ 0x71A9C1740AB5L;
                        object = false;
                        callSite = m44.a("k", (long)1567717931763285693L, (long)l11);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l13;
                                object2 = m44.a("t", (Object)o62, (Object)objectArray2, (long)1536405076585172479L, (long)l11);
                                if (callSite == false) break block6;
                                if (object2 == false) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)1473031055300709034L, (long)l11);
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l15;
                            Object[] objectArray4 = new Object[2];
                            objectArray4[1] = m44.a("t", (Object)o62, (Object)objectArray3, (long)1095656464725733732L, (long)l11);
                            objectArray4[0] = l14;
                            object2 = m44.a("t", (Object)lks2, (Object)objectArray4, (long)1380872815455075197L, (long)l11);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)1473031055300709034L, (long)l11);
                        }
                    }
                    try {
                        if (callSite == false) break block8;
                        if (object2 != false) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)1473031055300709034L, (long)l11);
                    }
                    object2 = true;
                    break block8;
                }
                object2 = false;
            }
            object = object2;
        }
        lml lml2 = new lml(o62, l10, loq2, (boolean)object);
        return lml2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                hn.c = prr.a(5552363265359190387L, -2241536634193494575L, MethodHandles.lookup().lookupClass()).a(95731246668930L);
                                var31 = hn.c ^ 43438838290357L;
                                hn.g = new HashMap<K, V>(13);
                                m44.a("i", (int)38, (long)3416131588550819645L, (long)var31);
                                var22_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var31 >>> 56);
                                for (var23_2 = 1; var23_2 < 8; ++var23_2) {
                                    v2 = v2;
                                    v2[var23_2] = (byte)(var31 << var23_2 * 8 >>> 56);
                                }
                                var22_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var29_3 = new String[27];
                                var27_4 = 0;
                                var26_5 = "\u00e9|\u00c7\u00b4\u00f1\u00c5\u00fe\u00d6\u00f6\u00e0F\u00b7\u00a5)\u00e5\u00c9\u0120\u0016\u0011l\u0089\u00c1\u00a6+]A5d8\u0097\u00dc\u0014\u00f4\u00ceH\u00d5\u00d7+\u00e3\u00ee\u001e%\u008a)\u00023(\u008d\u00d2\u00b4\u0081\u0083\\\u00cc\u001e\u001a=\u00a1\u00bd\u00f5\u00d9M\u0005M\u0093\u00f2\u00af&\u00e7\u009b\u00a3\u00bb\u0089\u00e6PY\u0097#`M\u00ae\u0010G:\u00d3\u00b5\"\u00b6\u0098\u00a7Y\u0006\u00eaB\u00ff@Y\u00a0\u00b8\u00a9\u0094\u0013\u00c2\u00df\u00caG\u00cf4\u00bef\u0091\u008c\u00ab\u00fc\u00af\u0094%\u00dfUK'qpg\u00f6.^\u00c1\u00f4\u0010\u001b\u000f&\u00bdK-_\u008d\u00ba;|\u0004\u00fc P\u0098x\u00ce\u008f]qY\u008c\u00cfL/\u00a7S\u00d1\u00f7n\u00db\u00c93\u0000#\u000f\u0013y\u00c5>\u00c5\u008f\u001b\u00a2]\fI\u00b128\u00e7\u001e\u008aH\u00a5Ow\u00ea\u00fdD\u00feg\u0010\u00e3;J\u00e6c\u007f\\\fn\u001a\u00982o\u00cb\u00a37\u00b11\u00c5\u008a`\u00a9\u0010\u00ca5\u008d\u008d\u00c87\u0087Z\u00189p3\u00bf\u00c9\u0088W-M\u00eak&\u00d7<5\u00dbi\u0010\u00d6\u001a\u00d4x\u00dcC.\u00f4%]-\u00f8'\u00f1TO4q\n\u0002\u0085\u00bbT\u00f5\u00d4\u00daI\u00d1\u00ee\u00e9\u00ce\f\u0013H\u00f1\u00db\u00f4\"\u0089\u0003s\u00ef/\u009d13b^:v*\u009b\u00d8IG\u009c\u00a3\u0098B\u0001\u00d0\u00a0\u008d\u009f\u00b5\u00f9\u009c\u00e3\u00ad\u0090)\u00fb_U[\u0089\u00e8\u0085\u0011\u001b\u00b9@\u00a4\u00e1\u00cb\u00e7\u00aft&\u0006\u0097\u00ea\u0093u\u00e7?\u00af\u00eeI\u00b2\u0006J\u00dc\u00e6AA\u00edTk\u0011\u00ea0U\u00c3d\u0014\u00d7\u00ef\u001d\u0097@\u00d57\u00cd\u008c\u0096B\u001f\u00a0\u0081`\u0097\u00e9NS\u00a8\u00b7\u00a0\u00d9\u00b2I\u00b6\u00e6\u00ff\u00e3\u00f8U\u00ea\u00cd\u00a1\u00e5U(\u00e3`Z5\u00ea\u0004z\u00ed\u0082\u008f\u0012\u00e0z\u0097\u0095\u00e33\u00cb,\u0092\u0082\u00c6\u000f\u00aa\u00ddv\u00e7\u00ce\u00a8\u00af\u00ac\u00bfNAJG\u00e0|\u00c11A\\\u0005\u00e7tH+b\u007fpa\u00cc\u00c5\u0099\u0083\u00ba-0\u0093\u00ac/b\u00b2\u00e4e\u00ef\u007f-\u0093(\u00ad<m0\u00dc\u00a6S\u00ed\u00b3W\u00dd\u00e8p\u008a_\u00b0\u0010\u00c5N\u0097*\u009f\u0011\u0002\u00a8A\u00b4^_\u00e1'\u0001\u001cP\u00e2\u009c6\u00b2H\u0010`U\u001f\u0088\u00b8'=\u0010\u0002\u00a1\u00d4H1\u00e2w-'\u00a4\u00ec\u0012\u00d3\u00bbTMkt\u0013\u0001\u000ef-\u00daE\u00ccVz\\\u00df+R$\u00d4x=\u0092\u00d3{\u00dbS\u0017P\u009f\u0081mr\u00fe\u0095:09*s2\u001b\u00f9,\f\u00a7\u00bfs\u00b2\u0089\u00c8\u0015\u00a6\u001e\u00809\u0018\u00f92?Xnr\u0087\u0001c\u00afx\u00db\u00ac\u001eB\n\u001f\u00a00\u0086\u0015\u00a7\u00ba\u0086\u00f2\u0099\u00ba\u00ccU\u0088)\u001f\u00f0\u00a0K\u0010\u00c3(\u000f\u009c\u00aeY\u000eV\u00b6k\u00bcd\u0002\u00f2\u00fe!n\u00e2.\u00f2\u00ae\u00cd=\u00ba\u009d\u009f\u001a\u00ae\u00bb\u00a4J\u0010\u00ee\u00f0\u00cd\u00877R{\u00df\u000b\u0015>\u0083\u0099WQ\u00eah\u00d9\u00b3\u00a8\u00dc\u008c\u00e9\u0084\u00d6UY\u00f4O\\\u0011G\u00a2\u00faN{D\u00a7\u00b4\u00a3N)u+\u00c6,M\u00cf\u00db\u009e\u00b3\u00b6q\u0082\u00866\u00ee\u00b4\u001bH\u0085\u00c8\u00fc\u0088.O\u00d7\u00dc\u00d2\u009e:h~J\u00c5\u00fbR\u00d8\u00ae\u009a=\u0010\u0004\u00b0_]m\u00ab\u0012\u0087X\u0019&\u00a0\u00bd\u00d2<Z\u00ec;\\!\u00a4\u00cf~/b\u0006F1\u0087\u00a0^\u00842&\u00c38;\u00ae\u00a4P\u00c3\u00d6\u0012\u00c5\u0084\u00e2\u00d9@y\u00fe\u00a4/\u009c\u0015)\u00b7[2\u00c5\u0089\u00c5M!E\u0010\u00bf`\u00cb\u00ae\u00d9\u009ab\u00de\u0082\u00045w\u00fc\u00c8\u00ccn\u00f1\u00ce\u00f3\u001e\u00a5\u0097l\u00e9\u00db\u008d5\u00ed\u00c5\b\u009a\u001fE\u0082#<\u00fc\u00d9\u00ef\u0006m\u00a4\u008c\u0016\u0006\u00f1\u0086\u0018\u00c3\u00878\u0091q\u00cc\u00e1@h,]\u00b0\u00c2(C\u00b5U\u00de\u00aa$\u009d\u00ee\u00fd\u00f6\u00ee\u008c\u0013\u0084Hv\u00f1s\u00f0\u0001\u00f8\u00f0\u0006Wm\u00ab\u00bb\u00fc\u008c\u001b+\u00a1\u0093\u0086\u00ccl\u00f8\u00b7\u008d.{\u00a3\u0011A/\u00175C+\u007f\u0092\u001caca\u00b1\u00c2\u00d6\u0010\u0003\u00a8\u00e5\u00aba\u00d9\u008d\u00fc{\u00d6\u00daL1z\u00ba)\u0010\u00d68\u001d\u00e9B .\u00e1\u00a5r?\b4\u00bad\\ \u00a5\u0017\u007fX\"\u00fc\u00f4\u000e&\u00f6\u00b0g\u0019\u00cb\rj\u00a2\u00a0W\u00a0\u000fy\u000e\u00ec\u00c2$fO\u00cbII\f\u0010\u00b9\u00ac?$8\u00c9\u00b3\u00a2$\u00c5u \u00af\u00e78\u00de((Af\b\u00d2,6p\u00a4\u009f\u00db\u00c6\u00a6o\u00dem_\u00da\u009d\u00c9.I+\u00fb\u00dc`\u0095Iz\u00c5\u00ca\u00ba\u00ad3y\u00baT\rEd\u0010K\u00be\u00e4\u008a\u00d6\u0099L\u0015\u00ec\u007fL\u00e7\u00c9\u00e0\u00a2*Hd\u00efP1o\u00a9\u00e6\u00d8\u00b7\u00c3\u0000\u00da\u000e\u00d1s\u009c\u00a0DM\u001aZ\u0003\u00bbp\u001d<\u00dd\u00a1\u0000Y?/\u0092~\u00b3\u00eez\u00a6\u00e89]I\u00c5\u0083*\u00e5\u00dc\u008d\u009e4B\u00f2\u0096\u008c6\u001d\u009d\u0088\u00ac\u007f\u0007[\u00d0\u00bf\u00ff\u00a1u9v\u00c1\u00d0\u00d1Pnb\u001dW\u0004\u0099}N\u00af\u009a\u00ffr\u0001\u00c2\u00f1}\u00d3w\u00f38ibC\u00eb~G\u00adJ\u0001V\u00c5V=\u00e9\u00f8V\u00a3\u000f\u00dc\u00d7\u0084\u009c\u00fc\u008ap*/\u00c5\t\u0092\u009ek;b{&hg\u00a9}\u00bd\u00f3\u00b2Ac\u001a\u00cf\u00ff\u001cq\u00e8\u00c5I\u00be\u00ca\u000f\u00cc\u00ffw\u0096H\u00deb\u0093\u00a5\u0087\u00d9\u000e\u00e9\u0003\u00c4\u0085\u009b#\u00c8\u00ce\u0087Ce\u00ee\u00bda;\u00bd\u00a5\u009cF#\u001b4gs\u001a\u00adB\u008e\u00af\u00d6\u00ab\u0090\u00fd\u00dd\u00fd\u00bb\u00a7\u008d\u0015=\u00d4)\u00d9}\t\u001b\u00df=\u00e2S \u0088\u001a\u008c\u00d7\u0000u\u00d3\u0012;\u00b3\u00c6\u001c3\u00b2\u0010\u008b\u00c0\u009b\u00eb\u00b0\u00d4\u00c5\u00f1\f> \u0007Jt\u0004*h;+\u0085/\u00dc\u00b9\u00ff\u00ba\u00f4@f\u0087I\u0017q\u00fezR\u00af/\u00cc\u00c6_\u00b2\u0098\u00dc?M\u0096\u0006\u00bdd\u00b0\u00de\u00017\u009d\u00c1R*\u008c\u00fe\u001c\u00cb\u009d\\\u0002\u008f\u00e0\u009f\u00eeG\u00a6\u00dc!\u00b5f\u0013\u00cf\u00b8.\u0094S],\u0096\u00ffq\u00f6\u0080a\u00c6\u0013n\u008e`Z\u009bB\u009e\u00de\u00fa'8\u00bbp\u00f2'\u00c7\n\u001c\u007f:^say)\u001e\u00ea\u0091,%AX\u00c7\u0096-\u008c\f\u0082\u00d5\u00c7\u0012\u00f9*\u008f\u00d6@\u00c1\u00e5\u001b>\u00d0ws\u00a9\u0088\u0004V\u00a4\u00e0\u00fc\u00c9\u00a3\u00ab\u00e2%\u00ceB\u0013\u00f6\u00e4\u00cd\u00a3\u00c0\u00ae\u00d7\u00b0\u0085SZ\u0011\u0089\u00a7aR\u00e0\u0086\u009e\u009bg\u009c\u00bc\u009ev\u00cb\rO\u0098\n\u00fa\u001al4;F6Qd\u009a(qq&\u009c\u00bd\u0016\u0000\u00c7K(\u00feH\u00e6\u0086\u00c35\u009a~p\n\u0093\u00aaXJ\u0084ZD%\u00cf\u008ayl\u00c3j\u00ed\u00c5\u0087L\u0081\u00da\u00ea\u00eb\u00da\u0017\u008b \u00c1\t\u00ba\u00ab\u008d\u00a8\u00ebe\u0007\u009f\u0092\u0007\u0001\u001e\u00fb>\u00d9\u00e8V\u0093z\u00d0\u0081\u0082\u00dd\u00be{W\u00b4\b$v\u0013\u00fb\u00af\u00dd\u00e2v\u0010\u00ff\u00c3#|\u0084\u00d1\u00cc\u00f4k@=\u00c0nLW\u0096\u0118\u00a1\u00116\u00a9\u009c\u008b\u00b6\r\u0097\u007f\u0087\u008dV\u0090y\u00b7\u00eb\u0012X\fB\u00ab\u00d6\u00a5\u0091\u00b9\u0088\u00a0\u00c3\u00f5~\u00c2L\u00a4\u00f4<\rpd\u00d0WLK\u00a0\u0003\u00d4\u009fXP1U'\u00ee\u0012\u00e8\u009e\u0083\u00c2BS\u000e~\u00ff:Xf|\u0013m\u00bc\u0002\u00a2\u0001\u0096{h\t\u00b7\u00bb\u0097\u0081\u008cm\u0011Z\u00e4K\u00c4\u00fc?8]cR<G\u00a1\u0093ex\u00f5)\u00b7\u00c4x\u008d\u00b1\u008f\u00c3\u001at+].\u00a4`\u0098\u00e3E\u00f7-\u00848D\u0000\u0012l^5r\u00caU\u0006\u00ed|K\u00f8|\u00e8\u00dfIh\u00be!\u00a9\u00fa\u0000\u00f84G\u00dd\u00b2\r\u0097g\u0013\u009f\u00f3\u00b8M\u00bf\u00ec\u00c9Rl\u00f4'\u008d\u00ca\u0082(\u00c1\u0011YY\u00e4F|\rXR6)7X\u00b2z\u00cd\u0096\u00b2\u00db7c\u00f1\u00a9\u00e1\u00b7\u00bf\u00cbs\u00df\u00d2\u00de\u00ac\u00f6\u009f\u008c\r\u0080\u00d8v\u0019\u0000\u00f89\u001c*\u00c0v\u00f6\u0081\u00d8]N\u00ab\u00e5\u00d9\u00ff\u00f2\u00c0\"}7V\u00fd\u0090`r\u0097=\u009f2\u0011\u0005,R\u00b1\u00ca\bucxb!\u00905\u00ef\u00a0\u00f2C\ty\u0097=\u0011\u00b6\u00dc\u00f9\u00e7\u00fd\u0092\u00d0\u001b\u00a2`X\u00eeq$Z";
                                var28_6 = "\u00e9|\u00c7\u00b4\u00f1\u00c5\u00fe\u00d6\u00f6\u00e0F\u00b7\u00a5)\u00e5\u00c9\u0120\u0016\u0011l\u0089\u00c1\u00a6+]A5d8\u0097\u00dc\u0014\u00f4\u00ceH\u00d5\u00d7+\u00e3\u00ee\u001e%\u008a)\u00023(\u008d\u00d2\u00b4\u0081\u0083\\\u00cc\u001e\u001a=\u00a1\u00bd\u00f5\u00d9M\u0005M\u0093\u00f2\u00af&\u00e7\u009b\u00a3\u00bb\u0089\u00e6PY\u0097#`M\u00ae\u0010G:\u00d3\u00b5\"\u00b6\u0098\u00a7Y\u0006\u00eaB\u00ff@Y\u00a0\u00b8\u00a9\u0094\u0013\u00c2\u00df\u00caG\u00cf4\u00bef\u0091\u008c\u00ab\u00fc\u00af\u0094%\u00dfUK'qpg\u00f6.^\u00c1\u00f4\u0010\u001b\u000f&\u00bdK-_\u008d\u00ba;|\u0004\u00fc P\u0098x\u00ce\u008f]qY\u008c\u00cfL/\u00a7S\u00d1\u00f7n\u00db\u00c93\u0000#\u000f\u0013y\u00c5>\u00c5\u008f\u001b\u00a2]\fI\u00b128\u00e7\u001e\u008aH\u00a5Ow\u00ea\u00fdD\u00feg\u0010\u00e3;J\u00e6c\u007f\\\fn\u001a\u00982o\u00cb\u00a37\u00b11\u00c5\u008a`\u00a9\u0010\u00ca5\u008d\u008d\u00c87\u0087Z\u00189p3\u00bf\u00c9\u0088W-M\u00eak&\u00d7<5\u00dbi\u0010\u00d6\u001a\u00d4x\u00dcC.\u00f4%]-\u00f8'\u00f1TO4q\n\u0002\u0085\u00bbT\u00f5\u00d4\u00daI\u00d1\u00ee\u00e9\u00ce\f\u0013H\u00f1\u00db\u00f4\"\u0089\u0003s\u00ef/\u009d13b^:v*\u009b\u00d8IG\u009c\u00a3\u0098B\u0001\u00d0\u00a0\u008d\u009f\u00b5\u00f9\u009c\u00e3\u00ad\u0090)\u00fb_U[\u0089\u00e8\u0085\u0011\u001b\u00b9@\u00a4\u00e1\u00cb\u00e7\u00aft&\u0006\u0097\u00ea\u0093u\u00e7?\u00af\u00eeI\u00b2\u0006J\u00dc\u00e6AA\u00edTk\u0011\u00ea0U\u00c3d\u0014\u00d7\u00ef\u001d\u0097@\u00d57\u00cd\u008c\u0096B\u001f\u00a0\u0081`\u0097\u00e9NS\u00a8\u00b7\u00a0\u00d9\u00b2I\u00b6\u00e6\u00ff\u00e3\u00f8U\u00ea\u00cd\u00a1\u00e5U(\u00e3`Z5\u00ea\u0004z\u00ed\u0082\u008f\u0012\u00e0z\u0097\u0095\u00e33\u00cb,\u0092\u0082\u00c6\u000f\u00aa\u00ddv\u00e7\u00ce\u00a8\u00af\u00ac\u00bfNAJG\u00e0|\u00c11A\\\u0005\u00e7tH+b\u007fpa\u00cc\u00c5\u0099\u0083\u00ba-0\u0093\u00ac/b\u00b2\u00e4e\u00ef\u007f-\u0093(\u00ad<m0\u00dc\u00a6S\u00ed\u00b3W\u00dd\u00e8p\u008a_\u00b0\u0010\u00c5N\u0097*\u009f\u0011\u0002\u00a8A\u00b4^_\u00e1'\u0001\u001cP\u00e2\u009c6\u00b2H\u0010`U\u001f\u0088\u00b8'=\u0010\u0002\u00a1\u00d4H1\u00e2w-'\u00a4\u00ec\u0012\u00d3\u00bbTMkt\u0013\u0001\u000ef-\u00daE\u00ccVz\\\u00df+R$\u00d4x=\u0092\u00d3{\u00dbS\u0017P\u009f\u0081mr\u00fe\u0095:09*s2\u001b\u00f9,\f\u00a7\u00bfs\u00b2\u0089\u00c8\u0015\u00a6\u001e\u00809\u0018\u00f92?Xnr\u0087\u0001c\u00afx\u00db\u00ac\u001eB\n\u001f\u00a00\u0086\u0015\u00a7\u00ba\u0086\u00f2\u0099\u00ba\u00ccU\u0088)\u001f\u00f0\u00a0K\u0010\u00c3(\u000f\u009c\u00aeY\u000eV\u00b6k\u00bcd\u0002\u00f2\u00fe!n\u00e2.\u00f2\u00ae\u00cd=\u00ba\u009d\u009f\u001a\u00ae\u00bb\u00a4J\u0010\u00ee\u00f0\u00cd\u00877R{\u00df\u000b\u0015>\u0083\u0099WQ\u00eah\u00d9\u00b3\u00a8\u00dc\u008c\u00e9\u0084\u00d6UY\u00f4O\\\u0011G\u00a2\u00faN{D\u00a7\u00b4\u00a3N)u+\u00c6,M\u00cf\u00db\u009e\u00b3\u00b6q\u0082\u00866\u00ee\u00b4\u001bH\u0085\u00c8\u00fc\u0088.O\u00d7\u00dc\u00d2\u009e:h~J\u00c5\u00fbR\u00d8\u00ae\u009a=\u0010\u0004\u00b0_]m\u00ab\u0012\u0087X\u0019&\u00a0\u00bd\u00d2<Z\u00ec;\\!\u00a4\u00cf~/b\u0006F1\u0087\u00a0^\u00842&\u00c38;\u00ae\u00a4P\u00c3\u00d6\u0012\u00c5\u0084\u00e2\u00d9@y\u00fe\u00a4/\u009c\u0015)\u00b7[2\u00c5\u0089\u00c5M!E\u0010\u00bf`\u00cb\u00ae\u00d9\u009ab\u00de\u0082\u00045w\u00fc\u00c8\u00ccn\u00f1\u00ce\u00f3\u001e\u00a5\u0097l\u00e9\u00db\u008d5\u00ed\u00c5\b\u009a\u001fE\u0082#<\u00fc\u00d9\u00ef\u0006m\u00a4\u008c\u0016\u0006\u00f1\u0086\u0018\u00c3\u00878\u0091q\u00cc\u00e1@h,]\u00b0\u00c2(C\u00b5U\u00de\u00aa$\u009d\u00ee\u00fd\u00f6\u00ee\u008c\u0013\u0084Hv\u00f1s\u00f0\u0001\u00f8\u00f0\u0006Wm\u00ab\u00bb\u00fc\u008c\u001b+\u00a1\u0093\u0086\u00ccl\u00f8\u00b7\u008d.{\u00a3\u0011A/\u00175C+\u007f\u0092\u001caca\u00b1\u00c2\u00d6\u0010\u0003\u00a8\u00e5\u00aba\u00d9\u008d\u00fc{\u00d6\u00daL1z\u00ba)\u0010\u00d68\u001d\u00e9B .\u00e1\u00a5r?\b4\u00bad\\ \u00a5\u0017\u007fX\"\u00fc\u00f4\u000e&\u00f6\u00b0g\u0019\u00cb\rj\u00a2\u00a0W\u00a0\u000fy\u000e\u00ec\u00c2$fO\u00cbII\f\u0010\u00b9\u00ac?$8\u00c9\u00b3\u00a2$\u00c5u \u00af\u00e78\u00de((Af\b\u00d2,6p\u00a4\u009f\u00db\u00c6\u00a6o\u00dem_\u00da\u009d\u00c9.I+\u00fb\u00dc`\u0095Iz\u00c5\u00ca\u00ba\u00ad3y\u00baT\rEd\u0010K\u00be\u00e4\u008a\u00d6\u0099L\u0015\u00ec\u007fL\u00e7\u00c9\u00e0\u00a2*Hd\u00efP1o\u00a9\u00e6\u00d8\u00b7\u00c3\u0000\u00da\u000e\u00d1s\u009c\u00a0DM\u001aZ\u0003\u00bbp\u001d<\u00dd\u00a1\u0000Y?/\u0092~\u00b3\u00eez\u00a6\u00e89]I\u00c5\u0083*\u00e5\u00dc\u008d\u009e4B\u00f2\u0096\u008c6\u001d\u009d\u0088\u00ac\u007f\u0007[\u00d0\u00bf\u00ff\u00a1u9v\u00c1\u00d0\u00d1Pnb\u001dW\u0004\u0099}N\u00af\u009a\u00ffr\u0001\u00c2\u00f1}\u00d3w\u00f38ibC\u00eb~G\u00adJ\u0001V\u00c5V=\u00e9\u00f8V\u00a3\u000f\u00dc\u00d7\u0084\u009c\u00fc\u008ap*/\u00c5\t\u0092\u009ek;b{&hg\u00a9}\u00bd\u00f3\u00b2Ac\u001a\u00cf\u00ff\u001cq\u00e8\u00c5I\u00be\u00ca\u000f\u00cc\u00ffw\u0096H\u00deb\u0093\u00a5\u0087\u00d9\u000e\u00e9\u0003\u00c4\u0085\u009b#\u00c8\u00ce\u0087Ce\u00ee\u00bda;\u00bd\u00a5\u009cF#\u001b4gs\u001a\u00adB\u008e\u00af\u00d6\u00ab\u0090\u00fd\u00dd\u00fd\u00bb\u00a7\u008d\u0015=\u00d4)\u00d9}\t\u001b\u00df=\u00e2S \u0088\u001a\u008c\u00d7\u0000u\u00d3\u0012;\u00b3\u00c6\u001c3\u00b2\u0010\u008b\u00c0\u009b\u00eb\u00b0\u00d4\u00c5\u00f1\f> \u0007Jt\u0004*h;+\u0085/\u00dc\u00b9\u00ff\u00ba\u00f4@f\u0087I\u0017q\u00fezR\u00af/\u00cc\u00c6_\u00b2\u0098\u00dc?M\u0096\u0006\u00bdd\u00b0\u00de\u00017\u009d\u00c1R*\u008c\u00fe\u001c\u00cb\u009d\\\u0002\u008f\u00e0\u009f\u00eeG\u00a6\u00dc!\u00b5f\u0013\u00cf\u00b8.\u0094S],\u0096\u00ffq\u00f6\u0080a\u00c6\u0013n\u008e`Z\u009bB\u009e\u00de\u00fa'8\u00bbp\u00f2'\u00c7\n\u001c\u007f:^say)\u001e\u00ea\u0091,%AX\u00c7\u0096-\u008c\f\u0082\u00d5\u00c7\u0012\u00f9*\u008f\u00d6@\u00c1\u00e5\u001b>\u00d0ws\u00a9\u0088\u0004V\u00a4\u00e0\u00fc\u00c9\u00a3\u00ab\u00e2%\u00ceB\u0013\u00f6\u00e4\u00cd\u00a3\u00c0\u00ae\u00d7\u00b0\u0085SZ\u0011\u0089\u00a7aR\u00e0\u0086\u009e\u009bg\u009c\u00bc\u009ev\u00cb\rO\u0098\n\u00fa\u001al4;F6Qd\u009a(qq&\u009c\u00bd\u0016\u0000\u00c7K(\u00feH\u00e6\u0086\u00c35\u009a~p\n\u0093\u00aaXJ\u0084ZD%\u00cf\u008ayl\u00c3j\u00ed\u00c5\u0087L\u0081\u00da\u00ea\u00eb\u00da\u0017\u008b \u00c1\t\u00ba\u00ab\u008d\u00a8\u00ebe\u0007\u009f\u0092\u0007\u0001\u001e\u00fb>\u00d9\u00e8V\u0093z\u00d0\u0081\u0082\u00dd\u00be{W\u00b4\b$v\u0013\u00fb\u00af\u00dd\u00e2v\u0010\u00ff\u00c3#|\u0084\u00d1\u00cc\u00f4k@=\u00c0nLW\u0096\u0118\u00a1\u00116\u00a9\u009c\u008b\u00b6\r\u0097\u007f\u0087\u008dV\u0090y\u00b7\u00eb\u0012X\fB\u00ab\u00d6\u00a5\u0091\u00b9\u0088\u00a0\u00c3\u00f5~\u00c2L\u00a4\u00f4<\rpd\u00d0WLK\u00a0\u0003\u00d4\u009fXP1U'\u00ee\u0012\u00e8\u009e\u0083\u00c2BS\u000e~\u00ff:Xf|\u0013m\u00bc\u0002\u00a2\u0001\u0096{h\t\u00b7\u00bb\u0097\u0081\u008cm\u0011Z\u00e4K\u00c4\u00fc?8]cR<G\u00a1\u0093ex\u00f5)\u00b7\u00c4x\u008d\u00b1\u008f\u00c3\u001at+].\u00a4`\u0098\u00e3E\u00f7-\u00848D\u0000\u0012l^5r\u00caU\u0006\u00ed|K\u00f8|\u00e8\u00dfIh\u00be!\u00a9\u00fa\u0000\u00f84G\u00dd\u00b2\r\u0097g\u0013\u009f\u00f3\u00b8M\u00bf\u00ec\u00c9Rl\u00f4'\u008d\u00ca\u0082(\u00c1\u0011YY\u00e4F|\rXR6)7X\u00b2z\u00cd\u0096\u00b2\u00db7c\u00f1\u00a9\u00e1\u00b7\u00bf\u00cbs\u00df\u00d2\u00de\u00ac\u00f6\u009f\u008c\r\u0080\u00d8v\u0019\u0000\u00f89\u001c*\u00c0v\u00f6\u0081\u00d8]N\u00ab\u00e5\u00d9\u00ff\u00f2\u00c0\"}7V\u00fd\u0090`r\u0097=\u009f2\u0011\u0005,R\u00b1\u00ca\bucxb!\u00905\u00ef\u00a0\u00f2C\ty\u0097=\u0011\u00b6\u00dc\u00f9\u00e7\u00fd\u0092\u00d0\u001b\u00a2`X\u00eeq$Z".length();
                                var25_7 = 16;
                                var24_8 = -1;
lbl21:
                                // 2 sources

                                while (true) {
                                    v3 = ++var24_8;
                                    v4 = var26_5.substring(v3, v3 + var25_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl26:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = hn.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    var26_5 = "\u0012k\u0000\u0013t}\u00a5k<\u00c4\u0093\u0018\u00fc\u00eb!i1\u00acd\u00a1ZPo\u001a5\u00f5J\u00f5p\u009fxB\u00a4\u00aa*@\u00e0\u00e0e\u001fQ)\u00f1\u00ac|\u00dc\u009c2\u001b\u00a8!\u00dc\u0007\u0091\u00ed\u00dd\u0010\u00a1\u00ed\u00a5O\u0082\u00d1\u00fb\u00e8\u00faJ\u009d\u009e\u001b\u00aa\u000e\u00b9";
                                    var28_6 = "\u0012k\u0000\u0013t}\u00a5k<\u00c4\u0093\u0018\u00fc\u00eb!i1\u00acd\u00a1ZPo\u001a5\u00f5J\u00f5p\u009fxB\u00a4\u00aa*@\u00e0\u00e0e\u001fQ)\u00f1\u00ac|\u00dc\u009c2\u001b\u00a8!\u00dc\u0007\u0091\u00ed\u00dd\u0010\u00a1\u00ed\u00a5O\u0082\u00d1\u00fb\u00e8\u00faJ\u009d\u009e\u001b\u00aa\u000e\u00b9".length();
                                    var25_7 = 56;
                                    var24_8 = -1;
lbl35:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var24_8;
                                        v4 = var26_5.substring(v6, v6 + var25_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl40:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = hn.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var30_9 = var22_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        hn.e = var29_3;
                        hn.f = new String[27];
                        hn.k = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var31 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var31 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[11];
                        var14_13 = 0;
                        var15_14 = "\u0087$b\u0093\u00a6\u00a82\u00e4\u00dfSl9\u00afe\u0017%-\u00bb\u00fa\u00a5y\u0018J\u00e8\u00a5\u00dfG\t\u0013w\u00bc\u00c1\u00cd\u00e2\u00b1a\u0098\u009eY\u0091\u0081\u0016O\u00ddA\u00bc\u009f@\u008f\u0087o\u00e8_\u0093\u00f0\u00ba\u0093\u00e8\u00e6\u00ef5/\u00c0@z#N\u00e5\u00a0\u009d2\u00ef";
                        var16_15 = "\u0087$b\u0093\u00a6\u00a82\u00e4\u00dfSl9\u00afe\u0017%-\u00bb\u00fa\u00a5y\u0018J\u00e8\u00a5\u00dfG\t\u0013w\u00bc\u00c1\u00cd\u00e2\u00b1a\u0098\u009eY\u0091\u0081\u0016O\u00ddA\u00bc\u009f@\u008f\u0087o\u00e8_\u0093\u00f0\u00ba\u0093\u00e8\u00e6\u00ef5/\u00c0@z#N\u00e5\u00a0\u009d2\u00ef".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl79:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "T\u00cb\u00c7FS/]\u00d4G\u00dc3n\u000f\u00a4\u000e\u00bb";
                            var16_15 = "T\u00cb\u00c7FS/]\u00d4G\u00dc3n\u000f\u00a4\u000e\u00bb".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl92:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
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
                hn.h = var17_12;
                hn.j = new Integer[11];
                hn.o = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var31 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var31 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "\u009bDR\u0006\u00d2\u00b5\u001d\u00da\u00fe\u0096X\u00c9\u008a\u00f2\u0011\u0091";
                var5_25 = "\u009bDR\u0006\u00d2\u00b5\u001d\u00da\u00fe\u0096X\u00c9\u008a\u00f2\u0011\u0091".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl127:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        hn.l = var6_22;
        hn.n = new Long[2];
        m44.a("j", (long)hn.c("f", (int)31652, (long)(3741457578523669947L ^ var31)), (long)3500543505824523282L, (long)var31);
    }

    public static int Z() {
        int n10 = hn.h();
        if (n10 == 0) {
            return 28;
        }
        return 0;
    }

    /*
     * Exception decompiling
     */
    private void j(Object[] var1_1) {
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
    private boolean O(Object[] var1_1) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public hn(long l10, List list, short s10, s4 s42) {
        List list2;
        long l11;
        long l12;
        block5: {
            l12 = (l10 << 16 | (long)s10 << 48 >>> 48) ^ c;
            l11 = l12 ^ 0x44A21E973B5L;
            CallSite callSite = m44.a("k", (long)-1195271926900177899L, (long)l12);
            this.y = (int)hn.b("c", (int)5182, (long)(0x441F8FFC91EFA6A7L ^ l12));
            CallSite callSite2 = callSite;
            try {
                this.C = (int)hn.b("c", (int)214, (long)(0x38B6C059E843B24CL ^ l12));
                list2 = list;
                if (callSite2 == false) break block5;
                if (list2 == null) throw new IllegalArgumentException((String)((Object)hn.a("x", (int)25509, (long)(0x32E55DA366394450L ^ l12))));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("k", (Object)illegalArgumentException, (long)-1235837513368752126L, (long)l12);
            }
            list2 = list;
        }
        try {
            if (list2.size() == 0) {
                throw new IllegalArgumentException((String)((Object)hn.a("x", (int)25509, (long)(0x32E55DA366394450L ^ l12))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("k", (Object)illegalArgumentException, (long)-1235837513368752126L, (long)l12);
        }
        m44.a("w", (Object)this, (List)list, (long)-1253499403946261551L, (long)l12);
        m44.a("w", (Object)this, (s4)s42, (long)-1288119492625247403L, (long)l12);
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("k", (Object)objectArray, (long)-1450795353200095015L, (long)l12);
    }

    static synchronized void e(Object[] objectArray) {
        block10: {
            CallSite callSite;
            long l10;
            block8: {
                CallSite callSite2;
                block9: {
                    l10 = (Long)objectArray[0];
                    long l11 = (l10 = c ^ l10) ^ 0x1A88E71818F1L;
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    callSite2 = m44.a("m", (Object)objectArray2, (long)4013343849165177833L, (long)l10);
                    CallSite callSite3 = m44.a("m", (long)4032938993957248139L, (long)l10);
                    try {
                        try {
                            try {
                                try {
                                    callSite = m44.a("i", (long)3510658391633732670L, (long)l10);
                                    if (callSite3 == false) break block8;
                                    if (callSite == hn.c("f", (int)28023, (long)(0x2F2EF9F5F6012345L ^ l10))) break block9;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("m", (Object)illegalArgumentException, (long)3911101889755179164L, (long)l10);
                                }
                                if (l10 <= 0L) break block10;
                                callSite = callSite2;
                                if (callSite3 == false) break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("m", (Object)illegalArgumentException, (long)3911101889755179164L, (long)l10);
                            }
                            if (callSite == m44.a("i", (long)3510658391633732670L, (long)l10)) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("m", (Object)illegalArgumentException, (long)3911101889755179164L, (long)l10);
                        }
                        throw new n9((String)((Object)hn.a("x", (int)5182, (long)(0x7073943BA62AEB42L ^ l10))));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)3911101889755179164L, (long)l10);
                    }
                }
                callSite = callSite2;
            }
            m44.a("n", (long)callSite, (long)3510658391633732670L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    private gp H(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[UNCONDITIONALDOLOOP]], but top level block is 9[WHILELOOP]
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

    static synchronized void R(Object[] objectArray) {
        block9: {
            reference v32;
            long l10;
            block10: {
                reference v12;
                block8: {
                    l10 = (Long)objectArray[0];
                    long l11 = (l10 = c ^ l10) ^ 0x3A0B362DF0E7L;
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    reference var6_3 = m44.a("k", (Object)objectArray2, (long)-2331630455443903489L, (long)l10);
                    CallSite callSite = m44.a("k", (long)-4069102103249154559L, (long)l10);
                    try {
                        try {
                            try {
                                reference v12 = m44.a("o", (long)-2833188889963312088L, (long)l10) - hn.c("f", (int)28023, (long)(0x2F2ED9762734CB53L ^ l10));
                                v12 = v12 == 0 ? 0 : (v12 < 0 ? -1 : 1);
                                if (callSite != false) break block8;
                                if (v12 == false) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)-2427115904660504438L, (long)l10);
                            }
                            v32 = var6_3;
                            if (callSite != false) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)-2427115904660504438L, (long)l10);
                        }
                        reference v12 = v32 - m44.a("o", (long)-2833188889963312088L, (long)l10);
                        v12 = v12 == 0 ? 0 : (v12 < 0 ? -1 : 1);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-2427115904660504438L, (long)l10);
                    }
                }
                if (v12 != false) break block9;
                v32 = hn.c("f", (int)28023, (long)(0x2F2ED9762734CB53L ^ l10));
            }
            m44.a("h", (long)v32, (long)-2833188889963312088L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String[] z(Object[] var1_1) {
        block23: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block17: {
                                block18: {
                                    var3_2 = (String)var1_1[0];
                                    var4_3 = (Long)var1_1[1];
                                    var2_4 = (String)var1_1[2];
                                    v0 = var4_3 = hn.c ^ var4_3;
                                    var6_5 = v0 ^ 59923459810643L;
                                    var8_6 = v0 ^ 24995907717154L;
                                    var10_7 = m44.a("k", (long)-6342820545784181627L, (long)var4_3);
                                    try {
                                        try {
                                            v1 = this;
                                            if (var10_7 == false) break block17;
                                            if (m44.a("u", (Object)v1, (long)-6655801726781396159L, (long)var4_3) != false) break block18;
                                        }
                                        catch (IllegalArgumentException v2) {
                                            throw m44.a("k", (Object)v2, (long)-6464600029763995502L, (long)var4_3);
                                        }
                                        v3 = new Object[1];
                                        v3[0] = var6_5;
                                        m44.a("j", (Object)this, (Object)v3, (long)-4719426526137624065L, (long)var4_3);
                                    }
                                    catch (IllegalArgumentException v4) {
                                        throw m44.a("k", (Object)v4, (long)-6464600029763995502L, (long)var4_3);
                                    }
                                }
                                var3_2 = var3_2.replace((char)hn.b("c", (int)5667, (long)(3582754739879111719L ^ var4_3)), (char)hn.b("c", (int)28991, (long)(6889343129731468081L ^ var4_3)));
                                v1 = this;
                            }
                            v5 = new Object[3];
                            v5[2] = var2_4;
                            v5[1] = var3_2;
                            v5[0] = var8_6;
                            var12_8 = m44.a("t", (Object)m44.a("u", (Object)v1, (long)-6683546780317795238L, (long)var4_3), (Object)v5, (long)-4798678029168296181L, (long)var4_3);
                            try {
                                v6 = var12_8;
                                if (var4_3 <= 0L || var10_7 == false) break block19;
                                if (v6 == null) break block20;
                            }
                            catch (IllegalArgumentException v7) {
                                throw m44.a("k", (Object)v7, (long)-6464600029763995502L, (long)var4_3);
                            }
                            v6 = var12_8;
                        }
                        try {
                            v8 /* !! */  = v6.size();
                            if (var10_7 == false) break block21;
                            if (v8 /* !! */  == 0) {
                            }
                            ** GOTO lbl59
                        }
                        catch (IllegalArgumentException v9) {
                            throw m44.a("k", (Object)v9, (long)-6464600029763995502L, (long)var4_3);
                        }
                    }
                    var11_9 = new String[1];
                    try {
                        var11_9[0] = var2_4;
                        v8 /* !! */  = (int)var10_7;
                        if (var4_3 < 0L) break block21;
                        if (v8 /* !! */  != 0) break block22;
lbl59:
                        // 2 sources

                        v8 /* !! */  = var12_8.size();
                    }
                    catch (IllegalArgumentException v10) {
                        throw m44.a("k", (Object)v10, (long)-6464600029763995502L, (long)var4_3);
                    }
                }
                var11_9 = new String[v8 /* !! */ ];
                for (var13_10 = 0; var13_10 < var12_8.size(); ++var13_10) {
                    block24: {
                        block25: {
                            var14_11 = (lq0)var12_8.get(var13_10);
                            var15_12 = (String)var14_11.D();
                            try {
                                try {
                                    v11 = var11_9;
                                    v12 /* !! */  = var10_7;
                                    if (var4_3 > 0L) {
                                        if (v12 /* !! */  == false) break block23;
                                        v12 /* !! */  = (CallSite)var13_10;
                                    }
                                    v13 = new StringBuilder().append((String)var14_11.S()).append("(");
                                    v14 = var15_12;
                                    if (var10_7 == false) break block24;
                                }
                                catch (IllegalArgumentException v15) {
                                    throw m44.a("k", (Object)v15, (long)-6464600029763995502L, (long)var4_3);
                                }
                                if (v14 == null) break block25;
                            }
                            catch (IllegalArgumentException v16) {
                                throw m44.a("k", (Object)v16, (long)-6464600029763995502L, (long)var4_3);
                            }
                            v14 = var15_12;
                            break block24;
                        }
                        v14 = "";
                    }
                    v11[v12 /* !! */ ] = v13.append(v14).append(")").toString();
                    if (var10_7 != false) continue;
                }
            }
            v11 = var11_9;
        }
        return v11;
    }

    public static void p(int n10) {
        Z = n10;
    }

    /*
     * WARNING - void declaration
     */
    private void V(Object[] objectArray) {
        block18: {
            long l10;
            long l11;
            long l12;
            lml lml2;
            List list;
            block16: {
                void zh3;
                CallSite callSite;
                CallSite callSite2;
                long l13;
                long l14;
                long l15;
                block17: {
                    Object object;
                    Object object2;
                    block15: {
                        list = (List)objectArray[0];
                        lml2 = (lml)objectArray[1];
                        l12 = (Long)objectArray[2];
                        long l16 = l12 = c ^ l12;
                        long l17 = l16 ^ 0x17EF43C5FB2DL;
                        l11 = l16 ^ 0x74CDE44378C3L;
                        l15 = l16 ^ 0x48A20E7D2A1BL;
                        l10 = l16 ^ 0x716C0CB8D236L;
                        l14 = l16 ^ 0x3E52B0FA434EL;
                        l13 = l16 ^ 0x53C8E19BB6EL;
                        long l18 = l16 ^ 0xB417618D53DL;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l18;
                        callSite2 = m44.a("t", (Object)lml2, (Object)objectArray2, (long)1585784262789815987L, (long)l12);
                        callSite = m44.a("k", (long)1207497941155167165L, (long)l12);
                        try {
                            try {
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l17;
                                object2 = m44.a("t", (Object)lml2, (Object)objectArray3, (long)728597923227981841L, (long)l12);
                                if (callSite == false) break block15;
                                if (object2 == false) break block16;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)1256788165407166378L, (long)l12);
                            }
                            object2 = callSite2.size();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)1256788165407166378L, (long)l12);
                        }
                    }
                    try {
                        if (callSite == false) break block17;
                        if (object2 <= 0) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)1256788165407166378L, (long)l12);
                    }
                    object2 = object = (Object)false;
                }
                while (zh3 < callSite2.size()) {
                    CallSite callSite3;
                    block20: {
                        Object object;
                        block19: {
                            uc uc2 = (uc)callSite2.get((int)zh3);
                            callSite3 = m44.a("u", (Object)uc2, (long)726245946316027454L, (long)l12);
                            try {
                                try {
                                    try {
                                        if (callSite == false) break block18;
                                        object = callSite3;
                                        if (callSite == false) break block19;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("k", (Object)illegalArgumentException, (long)1256788165407166378L, (long)l12);
                                    }
                                    if (object != null) break block20;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("k", (Object)illegalArgumentException, (long)1256788165407166378L, (long)l12);
                                }
                                Object[] objectArray4 = new Object[1];
                                objectArray4[0] = l15;
                                object = ((_f)((Object)m44.a("t", (Object)lml2, (Object)objectArray4, (long)1243864049115388550L, (long)l12))).i(l14, new loe((String)((Object)m44.a("u", (Object)uc2, (long)1701977214327537567L, (long)l12))));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)1256788165407166378L, (long)l12);
                            }
                        }
                        callSite3 = object;
                    }
                    zh zh2 = new zh(l10);
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = callSite3;
                    objectArray5[1] = lml2;
                    objectArray5[0] = l13;
                    m44.a("t", (Object)zh2, (Object)objectArray5, (long)1651086563570437500L, (long)l12);
                    list.add(zh2);
                    ++zh3;
                    if (callSite != false) continue;
                }
                if (l12 <= 0L || callSite != false) break block18;
            }
            zh zh3 = new zh(l10);
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = lml2;
            objectArray6[0] = l11;
            m44.a("t", (Object)zh3, (Object)objectArray6, (long)826903632607272812L, (long)l12);
            list.add(zh3);
        }
    }

    private String[] U(Object[] objectArray) {
        String[] stringArray;
        block9: {
            long l10 = (Long)objectArray[0];
            String string = (String)objectArray[1];
            boolean bl2 = (Boolean)objectArray[2];
            int n10 = (Integer)objectArray[3];
            zr zr2 = (zr)objectArray[4];
            long l11 = l10 = c ^ l10;
            long l12 = l11 ^ 0x740215A8907FL;
            long l13 = l11 ^ 0x4230AFC098CCL;
            long l14 = l11 ^ 0x5FCB0509AD72L;
            zr2.I(false);
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = bl2;
            objectArray2[1] = string;
            objectArray2[0] = l12;
            CallSite callSite = m44.a("k", (Object)this, (Object)objectArray2, (long)-7748623280182964862L, (long)l10);
            CallSite callSite2 = m44.a("j", (long)-7926120191226857092L, (long)l10);
            stringArray = new String[callSite.size()];
            for (int i10 = 0; i10 < stringArray.length; ++i10) {
                CallSite callSite3;
                CallSite callSite4;
                int n11;
                vu vu2;
                vu vu3;
                block10: {
                    vu3 = (vu)callSite.get(i10);
                    try {
                        try {
                            CallSite callSite5 = callSite2;
                            if (l10 >= 0L) {
                                if (callSite5 == false) break block9;
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l14;
                                callSite5 = m44.a("u", (Object)vu3, (Object)objectArray3, (long)-8597657744962921383L, (long)l10);
                            }
                            if (callSite5 == false) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)-7804696950090183317L, (long)l10);
                        }
                        zr2.I(true);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)-7804696950090183317L, (long)l10);
                    }
                }
                try {
                    String[] stringArray2 = stringArray;
                    int n12 = i10;
                    vu2 = vu3;
                    n11 = n10;
                    callSite4 = m44.a("t", (Object)this, (long)-7582302129963890269L, (long)l10);
                    callSite3 = bl2 ? m44.a("t", (Object)this, (long)-7802311463814994118L, (long)l10) : null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-7804696950090183317L, (long)l10);
                }
                CallSite callSite6 = callSite3;
                CallSite callSite7 = callSite4;
                int n13 = n11;
                Object[] objectArray4 = new Object[4];
                objectArray4[3] = callSite6;
                objectArray4[2] = callSite7;
                objectArray4[1] = n13;
                objectArray4[0] = l13;
                stringArray2[n12] = m44.a("u", (Object)vu2, (Object)objectArray4, (long)-7594112813409286244L, (long)l10);
                if (callSite2 != false) continue;
            }
            m44.a("j", (Object)stringArray, (long)-7540638769569080240L, (long)l10);
            if (l10 > 0L) {
                // empty if block
            }
        }
        return stringArray;
    }

    private static Exception a(Exception exception) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x43CF;
        if (f[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hn", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n11].getBytes("ISO-8859-1");
            hn.f[n11] = hn.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = hn.a(n10, l10);
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
            throw new RuntimeException("com/zelix/hn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x56B0;
        if (j[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = h[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hn", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hn.j[n11] = n12;
        }
        return j[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = hn.b(n10, l10);
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
            throw new RuntimeException("com/zelix/hn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7280;
        if (n[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = l[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hn", exception);
            }
            long l13 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            hn.n[n11] = l13;
        }
        return n[n11];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = hn.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/hn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hn.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(hn.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(hn.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

