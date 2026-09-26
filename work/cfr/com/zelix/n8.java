/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.a4;
import com.zelix.g8;
import com.zelix.lb6;
import com.zelix.lmw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class n8
implements lmw {
    private int Q;
    private List K;
    private HashSet[] S;
    private static final long a = prr.a(6474263488831088509L, 4007212443095816706L, MethodHandles.lookup().lookupClass()).a(175328976129873L);
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;

    @Override
    public int n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return -1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean Y(Object[] var1_1) {
        block14: {
            block12: {
                block13: {
                    block11: {
                        var2_2 = (Long)var1_1[0];
                        var4_3 = m44.a("k", (long)3011113651092643097L, (long)var2_2);
                        try {
                            try {
                                try {
                                    v0 /* !! */  = m44.a("u", (Object)this, (long)3896584560228904427L, (long)var2_2);
                                    v1 = true;
                                    if (var2_2 <= 0L || var4_3 != null) break block11;
                                    if (v0 /* !! */  != v1) break block12;
                                }
                                catch (n9 v2) {
                                    throw m44.a("k", (Object)v2, (long)3413362897943117463L, (long)var2_2);
                                }
                                v0 /* !! */  = m44.a("t", (Object)m44.a("u", (Object)this, (long)3025499103588352232L, (long)var2_2)[0], (long)3107524930933619167L, (long)var2_2);
                                v3 = var4_3;
                                if (var2_2 > 0L) {
                                    if (v3 != null) break block13;
                                }
                                ** GOTO lbl36
                            }
                            catch (n9 v4) {
                                throw m44.a("k", (Object)v4, (long)3413362897943117463L, (long)var2_2);
                            }
                            v1 = true;
                        }
                        catch (n9 v5) {
                            throw m44.a("k", (Object)v5, (long)3413362897943117463L, (long)var2_2);
                        }
                    }
                    try {
                        if (v0 /* !! */  != v1) break block12;
                        v0 /* !! */  = (CallSite)(m44.a("t", (Object)m44.a("u", (Object)this, (long)3025499103588352232L, (long)var2_2)[0], (long)3162740588269683101L, (long)var2_2).next() instanceof g8);
                    }
                    catch (n9 v6) {
                        throw m44.a("k", (Object)v6, (long)3413362897943117463L, (long)var2_2);
                    }
                }
                try {
                    v3 = var4_3;
lbl36:
                    // 2 sources

                    if (v3 != null) break block14;
                    if (v0 /* !! */  == false) break block12;
                }
                catch (n9 v7) {
                    throw m44.a("k", (Object)v7, (long)3413362897943117463L, (long)var2_2);
                }
                v0 /* !! */  = (CallSite)true;
                break block14;
            }
            v0 /* !! */  = (CallSite)false;
        }
        return (boolean)v0 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    public boolean i(Object[] var1_1) {
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

    public int hashCode() {
        long l10 = a ^ 0x71B168B3751L;
        return m44.a("p", (Object)this, (long)-8936906884565357843L, (long)l10).hashCode() ^ m44.a("p", (Object)this, (long)-7281023984675803209L, (long)l10).hashCode();
    }

    public ArrayList q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        ArrayList<lmw> arrayList = new ArrayList<lmw>();
        CallSite callSite = m44.a("k", (long)-5806852085432034375L, (long)l10);
        for (int i10 = 0; i10 < ((CallSite)m44.a("u", (Object)this, (long)-5810542621075503544L, (long)l10)).length; ++i10) {
            lmw lmw2;
            block6: {
                CallSite callSite2;
                block5: {
                    lmw2 = null;
                    CallSite callSite3 = m44.a("t", (Object)m44.a("u", (Object)this, (long)-5810542621075503544L, (long)l10)[i10], (long)-5961575218095536323L, (long)l10);
                    try {
                        try {
                            callSite2 = callSite3;
                            if (callSite != null) break block5;
                            if (!callSite2.hasNext()) break block6;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)-6197297944509073353L, (long)l10);
                        }
                        callSite2 = callSite3.next();
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)-6197297944509073353L, (long)l10);
                    }
                }
                lmw2 = (lmw)((Object)callSite2);
            }
            arrayList.add(lmw2);
            if (callSite == null) continue;
        }
        return arrayList;
    }

    public boolean equals(Object object) {
        boolean bl2;
        block8: {
            block9: {
                boolean bl3;
                block12: {
                    block11: {
                        CallSite callSite;
                        long l10;
                        block10: {
                            l10 = a ^ 0x75934F151ADAL;
                            callSite = m44.a("m", (long)-5888477887678227817L, (long)l10);
                            try {
                                bl2 = object instanceof n8;
                                if (callSite != null) break block8;
                                if (!bl2) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)n92, (long)-6282310242015168231L, (long)l10);
                            }
                            n8 n82 = (n8)object;
                            try {
                                try {
                                    bl3 = m44.a("s", (Object)this, (long)-5876414654676007066L, (long)l10).equals(m44.a("s", (Object)n82, (long)-5876414654676007066L, (long)l10));
                                    if (callSite != null) break block10;
                                    if (!bl3) break block11;
                                }
                                catch (n9 n93) {
                                    throw m44.a("m", (Object)n93, (long)-6282310242015168231L, (long)l10);
                                }
                                bl3 = m44.a("s", (Object)this, (long)-5224199982863449540L, (long)l10).equals(m44.a("s", (Object)n82, (long)-5224199982863449540L, (long)l10));
                            }
                            catch (n9 n94) {
                                throw m44.a("m", (Object)n94, (long)-6282310242015168231L, (long)l10);
                            }
                        }
                        try {
                            if (callSite != null) break block12;
                            if (!bl3) break block11;
                        }
                        catch (n9 n95) {
                            throw m44.a("m", (Object)n95, (long)-6282310242015168231L, (long)l10);
                        }
                        bl3 = true;
                        break block12;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public n8(int n10, List list, short s10, char c10, int n11) {
        long l10 = ((long)s10 << 48 | (long)c10 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ a;
        m44.a("u", (Object)this, (int)n10, (long)-8216437888974350847L, (long)l10);
        m44.a("u", (Object)this, (HashSet[])new HashSet[n10], (long)-7919983322278839550L, (long)l10);
        m44.a("u", (Object)this, (List)list, (long)-8422944151976493480L, (long)l10);
    }

    private void O(Object[] objectArray) {
        String[][] stringArray = (String[][])objectArray[0];
        HashSet[] hashSetArray = (HashSet[])objectArray[1];
        lb6 lb62 = (lb6)objectArray[2];
        long l10 = (Long)objectArray[3];
        int n10 = (Integer)objectArray[4];
        String[] stringArray2 = (String[])objectArray[5];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x4E94F777A7E0L;
        long l13 = l11 ^ 0x55681FB6934FL;
        long l14 = l11 ^ 0x622551B3D48BL;
        CallSite callSite = m44.a("r", (Object)hashSetArray[n10], (long)7861631304936916835L, (long)l10);
        String[] stringArray3 = m44.a("m", (long)8014138097105738727L, (long)l10);
        while (callSite.hasNext()) {
            String[] stringArray4;
            block11: {
                block9: {
                    String[] stringArray5 = new String[stringArray2.length];
                    try {
                        int n11;
                        block10: {
                            try {
                                try {
                                    System.arraycopy(stringArray2, 0, stringArray5, 0, n10);
                                    stringArray5[n10] = (String)callSite.next();
                                    n11 = n10 + 1;
                                    String[] stringArray6 = stringArray3;
                                    if (l10 > 0L) {
                                        if (stringArray6 != null) break block9;
                                        stringArray6 = stringArray2;
                                    }
                                    if (n11 < stringArray6.length) {
                                    }
                                    break block10;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)n92, (long)7611326029603862633L, (long)l10);
                                }
                                Object[] objectArray2 = new Object[6];
                                objectArray2[5] = stringArray5;
                                objectArray2[4] = n10 + 1;
                                objectArray2[3] = l12;
                                objectArray2[2] = lb62;
                                objectArray2[1] = hashSetArray;
                                objectArray2[0] = stringArray;
                                m44.a("l", (Object)this, (Object)objectArray2, (long)7624107425964699375L, (long)l10);
                                stringArray4 = stringArray3;
                                if (l10 < 0L) break block11;
                                if (stringArray4 == null) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("m", (Object)n93, (long)7611326029603862633L, (long)l10);
                            }
                        }
                        stringArray[lb62.U((long)l13)] = stringArray5;
                        n11 = lb62.f(l14);
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)n94, (long)7611326029603862633L, (long)l10);
                    }
                }
                stringArray4 = stringArray3;
            }
            if (stringArray4 == null) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public ArrayList z(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 5[SIMPLE_IF_TAKEN]
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

    void U(Object[] objectArray) {
        block4: {
            int n10 = (Integer)objectArray[0];
            long l10 = (Long)objectArray[1];
            lmw lmw2 = (lmw)objectArray[2];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0xA6570DCFB13L;
            long l13 = l11 ^ 0x4F8B1F6FBDBDL;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l12;
            objectArray2[0] = 3;
            CallSite callSite = m44.a("k", (Object)objectArray2, (long)3967692398984831064L, (long)l10);
            CallSite callSite2 = m44.a("k", (long)3416426986972044217L, (long)l10);
            ((HashSet)((Object)callSite)).add(lmw2);
            CallSite callSite3 = callSite2;
            try {
                boolean bl2;
                try {
                    m44.a("u", (Object)this, (long)3412799088932390472L, (long)l10)[n10] = callSite;
                    bl2 = lmw2 instanceof a4;
                    if (callSite3 != null || !bl2) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)3026061263329802295L, (long)l10);
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l13;
                bl2 = m44.a("u", (Object)this, (long)3914071705293030162L, (long)l10).add(m44.a("t", (Object)((a4)lmw2), (Object)objectArray3, (long)3011034110272291189L, (long)l10));
            }
            catch (n9 n93) {
                throw m44.a("k", (Object)n93, (long)3026061263329802295L, (long)l10);
            }
        }
    }

    public n8(int n10, long l10) {
        l10 = a ^ l10;
        m44.a("r", (Object)this, (int)n10, (long)-7388648515005021554L, (long)l10);
        m44.a("r", (Object)this, (HashSet[])new HashSet[n10], (long)-8747688989471133811L, (long)l10);
        m44.a("r", (Object)this, new ArrayList(), (long)-6947691943513314601L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean a(Object[] var1_1) {
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

    HashSet w(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return m44.a("u", (Object)this, (long)-9215326459849070328L, (long)l10)[n10];
    }

    void d(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        HashSet hashSet = (HashSet)objectArray[1];
        long l10 = (Long)objectArray[2];
        l10 = a ^ l10;
        m44.a("t", (Object)this, (long)5876605540520491161L, (long)l10)[n10] = hashSet;
    }

    /*
     * Exception decompiling
     */
    void i(Object[] var1_1) {
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String X(Object[] objectArray) {
        StringBuffer stringBuffer;
        block22: {
            long l10 = (Long)objectArray[0];
            boolean bl2 = (Boolean)objectArray[1];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x75B3FA1A4C93L;
            long l13 = l11 ^ 0x7DE706D334C2L;
            long l14 = l11 ^ 0x1D48CB2541B8L;
            long l15 = l11 ^ 0x13619AC77245L;
            StringBuffer stringBuffer2 = new StringBuffer();
            Object[] objectArray2 = m44.a("n", (long)6596802073783938908L, (long)l10);
            int n10 = 0;
            while (n10 < ((CallSite)m44.a("p", (Object)this, (long)6609498672728306349L, (long)l10)).length) {
                block23: {
                    block24: {
                        StringBuffer stringBuffer3;
                        String string;
                        StringBuffer stringBuffer4;
                        CallSite callSite = m44.a("p", (Object)this, (long)6609498672728306349L, (long)l10)[n10];
                        boolean bl3 = true;
                        do {
                            block32: {
                                block31: {
                                    if (!bl3 || (bl3 = false)) break block31;
                                    if (l10 < 0L) break block32;
                                    stringBuffer4 = stringBuffer2;
                                    string = "[";
                                }
                                stringBuffer = stringBuffer4.append(string);
                                if (objectArray2 != null) break block22;
                            }
                            CallSite callSite2 = m44.a("q", (Object)callSite, (long)6458545249366127576L, (long)l10);
                            while (callSite2.hasNext()) {
                                block30: {
                                    CallSite callSite3;
                                    block29: {
                                        Object[] objectArray3;
                                        lmw lmw2;
                                        block28: {
                                            block27: {
                                                lmw lmw3;
                                                block26: {
                                                    Object object;
                                                    block25: {
                                                        lmw3 = (lmw)callSite2.next();
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (l10 <= 0L) break block23;
                                                                        stringBuffer3 = stringBuffer2;
                                                                        if (objectArray2 != null) break block24;
                                                                        object = bl2;
                                                                        if (l10 < 0L || objectArray2 != null) break block25;
                                                                    }
                                                                    catch (n9 n92) {
                                                                        throw m44.a("n", (Object)n92, (long)6709132099529657554L, (long)l10);
                                                                    }
                                                                    if (!object) break block26;
                                                                }
                                                                catch (n9 n93) {
                                                                    throw m44.a("n", (Object)n93, (long)6709132099529657554L, (long)l10);
                                                                }
                                                                lmw2 = lmw3;
                                                                if (objectArray2 != null) break block27;
                                                            }
                                                            catch (n9 n94) {
                                                                throw m44.a("n", (Object)n94, (long)6709132099529657554L, (long)l10);
                                                            }
                                                            Object[] objectArray4 = new Object[1];
                                                            objectArray4[0] = l12;
                                                            object = m44.a("q", (Object)lmw2, (Object)objectArray4, (long)5177655047643661691L, (long)l10);
                                                        }
                                                        catch (n9 n95) {
                                                            throw m44.a("n", (Object)n95, (long)6709132099529657554L, (long)l10);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (!object) break block26;
                                                                lmw2 = lmw3;
                                                                objectArray3 = objectArray2;
                                                                if (l10 <= 0L) break block28;
                                                                if (objectArray3 != null) break block27;
                                                            }
                                                            catch (n9 n96) {
                                                                throw m44.a("n", (Object)n96, (long)6709132099529657554L, (long)l10);
                                                            }
                                                            Object[] objectArray5 = new Object[1];
                                                            objectArray5[0] = l15;
                                                            if (m44.a("q", (Object)lmw2, (Object)objectArray5, (long)4808186392735209077L, (long)l10) == false) break block26;
                                                        }
                                                        catch (n9 n97) {
                                                            throw m44.a("n", (Object)n97, (long)6709132099529657554L, (long)l10);
                                                        }
                                                        Object[] objectArray6 = new Object[1];
                                                        objectArray6[0] = l13;
                                                        callSite3 = m44.a("q", (Object)lmw3, (Object)objectArray6, (long)6445217923187838999L, (long)l10);
                                                        break block29;
                                                    }
                                                    catch (n9 n98) {
                                                        throw m44.a("n", (Object)n98, (long)6709132099529657554L, (long)l10);
                                                    }
                                                }
                                                lmw2 = lmw3;
                                            }
                                            Object[] objectArray3 = new Object[1];
                                            objectArray3 = objectArray3;
                                            objectArray7[0] = l14;
                                        }
                                        callSite3 = m44.a("q", (Object)lmw2, (Object)objectArray3, (long)6792284727718116072L, (long)l10);
                                    }
                                    try {
                                        StringBuffer stringBuffer5;
                                        try {
                                            stringBuffer5 = stringBuffer3.append((String)((Object)callSite3));
                                            if (objectArray2 != null || !callSite2.hasNext()) break block30;
                                        }
                                        catch (n9 n99) {
                                            throw m44.a("n", (Object)n99, (long)6709132099529657554L, (long)l10);
                                        }
                                        stringBuffer5 = stringBuffer2.append(",");
                                    }
                                    catch (n9 n910) {
                                        throw m44.a("n", (Object)n910, (long)6709132099529657554L, (long)l10);
                                    }
                                }
                                if (objectArray2 == null) continue;
                            }
                            stringBuffer4 = stringBuffer2;
                            string = "]";
                        } while (l10 <= 0L);
                        stringBuffer3 = stringBuffer4.append(string);
                    }
                    ++n10;
                }
                if (objectArray2 == null) continue;
            }
            stringBuffer = stringBuffer2;
        }
        return stringBuffer.toString();
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean S(Object[] var1_1) {
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
    public String U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x2AABF27F19E1L;
        int n10 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        CallSite callSite = m44.a("m", (long)8552295852559794815L, (long)l10);
        CallSite callSite2 = m44.a("s", (Object)this, (long)8546423939533823886L, (long)l10);
        int n11 = ((CallSite)callSite2).length;
        int n12 = 0;
        block12: while (true) {
            int n13 = n12;
            while (n13 < n11) {
                Object object;
                block22: {
                    TreeSet<Object> treeSet;
                    TreeSet<Object> treeSet2;
                    block18: {
                        CallSite callSite3 = callSite2[n12];
                        treeSet2 = new TreeSet<Object>();
                        CallSite callSite4 = m44.a("r", (Object)callSite3, (long)8395285727355412219L, (long)l10);
                        while (callSite4.hasNext()) {
                            CallSite callSite5;
                            block19: {
                                block20: {
                                    lmw lmw2 = (lmw)callSite4.next();
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l11;
                                    CallSite callSite6 = m44.a("r", (Object)lmw2, (Object)objectArray2, (long)8381573571553246516L, (long)l10);
                                    try {
                                        try {
                                            treeSet = treeSet2;
                                            if (callSite != null) break block18;
                                            callSite5 = callSite6;
                                            if (callSite != null) break block19;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("m", (Object)n92, (long)8086485079197409777L, (long)l10);
                                        }
                                        if (callSite5 == null) break block20;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("m", (Object)n93, (long)8086485079197409777L, (long)l10);
                                    }
                                    callSite5 = callSite6;
                                    break block19;
                                }
                                callSite5 = b;
                            }
                            treeSet.add(callSite5);
                            if (callSite == null) continue;
                        }
                        if (l10 <= 0L) continue block12;
                        treeSet = treeSet2;
                    }
                    int n14 = treeSet.size();
                    int n15 = 0;
                    for (String string : treeSet2) {
                        block21: {
                            try {
                                StringBuilder stringBuilder2;
                                try {
                                    try {
                                        if (l10 >= 0L) {
                                            stringBuilder2 = stringBuilder.append(string);
                                            if (callSite != null) break block21;
                                        }
                                        n13 = n15++;
                                        object = n14;
                                        if (l10 <= 0L || callSite != null) break block22;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("m", (Object)n94, (long)8086485079197409777L, (long)l10);
                                    }
                                    if (n13 >= object) break block21;
                                }
                                catch (n9 n95) {
                                    throw m44.a("m", (Object)n95, (long)8086485079197409777L, (long)l10);
                                }
                                stringBuilder2 = stringBuilder.append((char)n8.a("q", (int)21799, (long)(0x22A41971AB6A4822L ^ l10)));
                            }
                            catch (n9 n96) {
                                throw m44.a("m", (Object)n96, (long)8086485079197409777L, (long)l10);
                            }
                        }
                        if (callSite == null) continue;
                    }
                    n13 = n10++;
                    if (l10 < 0L) continue;
                    object = m44.a("s", (Object)this, (long)7599040618506777229L, (long)l10);
                }
                try {
                    if (n13 < object) {
                        stringBuilder.append((char)n8.a("q", (int)26908, (long)(0x7FBCAD84AED6F418L ^ l10)));
                    }
                }
                catch (n9 n97) {
                    throw m44.a("m", (Object)n97, (long)8086485079197409777L, (long)l10);
                }
                ++n12;
                if (callSite != null) break block12;
                continue block12;
            }
            break;
        }
        return stringBuilder.toString();
    }

    public int w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("p", (Object)this, (long)-3632674723083659666L, (long)l10);
    }

    @Override
    public String x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x53DC3C52E658L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = false;
        objectArray2[0] = l11;
        return m44.a("q", (Object)this, (Object)objectArray2, (long)2267743396386901604L, (long)l10);
    }

    @Override
    public String D(Object[] objectArray) {
        block9: {
            long l10;
            lmw lmw2;
            long l11;
            block10: {
                CallSite callSite;
                long l12;
                block11: {
                    boolean bl2;
                    CallSite callSite2;
                    block8: {
                        l11 = (Long)objectArray[0];
                        l12 = l11 ^ 0L;
                        CallSite callSite3 = m44.a("l", (long)8020613449256049566L, (long)l11);
                        try {
                            try {
                                try {
                                    callSite2 = m44.a("r", (Object)this, (long)8112141288715021164L, (long)l11);
                                    bl2 = true;
                                    if (callSite3 != null) break block8;
                                    if (callSite2 != bl2) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("l", (Object)n92, (long)7627371527212759056L, (long)l11);
                                }
                                lmw2 = this;
                                l10 = 8033249523590612591L;
                                if (l11 <= 0L) break block10;
                                callSite = m44.a("r", (Object)lmw2, (long)l10, (long)l11)[0];
                                if (callSite3 != null) break block11;
                            }
                            catch (n9 n93) {
                                throw m44.a("l", (Object)n93, (long)7627371527212759056L, (long)l11);
                            }
                            callSite2 = m44.a("s", (Object)callSite, (long)7901367579550400344L, (long)l11);
                            bl2 = true;
                        }
                        catch (n9 n94) {
                            throw m44.a("l", (Object)n94, (long)7627371527212759056L, (long)l11);
                        }
                    }
                    try {
                        if (callSite2 != bl2) break block9;
                        callSite = m44.a("s", (Object)m44.a("r", (Object)this, (long)8033249523590612591L, (long)l11)[0], (long)7882180368039806746L, (long)l11).next();
                    }
                    catch (n9 n95) {
                        throw m44.a("l", (Object)n95, (long)7627371527212759056L, (long)l11);
                    }
                }
                lmw2 = (lmw)((Object)callSite);
                l10 = l12;
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            return m44.a("s", (Object)lmw2, (Object)objectArray2, (long)7903956342136939733L, (long)l11);
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public String[][] h(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[DOLOOP]], but top level block is 15[SIMPLE_IF_TAKEN]
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
    public String B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)9160079835640562836L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x17B8683BE562L;
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
        byte[] byArray3 = cipher.doFinal("\u00e9\u00a6\u00ea\u00c1\u000fr\u00b2\u00e1".getBytes("ISO-8859-1"));
        b = n8.a(byArray3).intern();
        e = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        for (int i11 = 1; i11 < 8; ++i11) {
            byArray5 = byArray5;
            byArray5[i11] = (byte)(l10 << i11 * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "'>\u00da\u00fa\u00a3C\u00cc$\u00a4=\u00ae\u0011m\u00b98'";
        int n11 = "'>\u00da\u00fa\u00a3C\u00cc$\u00a4=\u00ae\u0011m\u00b98'".length();
        int n12 = 0;
        do {
            byte[] byArray6 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n12 < n11);
        c = lArray;
        d = new Integer[2];
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x78D7;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/n8", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            n8.d[n11] = n12;
        }
        return d[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = n8.a(n10, l10);
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
            throw new RuntimeException("com/zelix/n8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(n8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

