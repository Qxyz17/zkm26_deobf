/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.ki;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s8;
import java.io.PrintWriter;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class k4
extends ki {
    s8[][] k;
    s8[][] O;
    private static final long c;
    private static final String[] g;
    private static final String[] i;
    private static final Map j;

    /*
     * Exception decompiling
     */
    k4(_4 var1_1, int var2_2, char var3_3, int var4_4, String var5_5, h1 var6_6, l6q var7_7, PrintWriter var8_8, String var9_9, int var10_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[DOLOOP], 17[DOLOOP], 16[WHILELOOP]], but top level block is 5[TRYBLOCK]
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
    public void z(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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
    public void z(gu var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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
    public void K(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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
    public void W(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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
    public void J(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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
    protected void N(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[DOLOOP]], but top level block is 13[SIMPLE_IF_TAKEN]
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
    public String[] m(Object[] objectArray) {
        String[] stringArray;
        String[] stringArray2;
        CallSite callSite;
        long l10;
        int n10;
        long l11;
        block21: {
            Object object;
            block16: {
                Object object2;
                k4 k42;
                long l12;
                block17: {
                    block18: {
                        block19: {
                            int n11;
                            block20: {
                                l11 = (Long)objectArray[0];
                                n10 = (Integer)objectArray[1];
                                long l13 = l11 = c ^ l11;
                                l12 = l13 ^ 0x1AC9362287E9L;
                                l10 = l13 ^ 0x258791D7AD2L;
                                callSite = m44.a("i", (long)2650525316727068032L, (long)l11);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    object = m44.a("w", (Object)this, (long)4438766367066093391L, (long)l11);
                                                    if (callSite == false) return new String[object];
                                                    if (object == false) break block16;
                                                }
                                                catch (n9 n92) {
                                                    throw m44.a("i", (Object)n92, (long)2719914896490615624L, (long)l11);
                                                }
                                                k42 = this;
                                                object2 = callSite;
                                                if (l11 <= 0L) break block17;
                                                if (object2 == false) break block18;
                                            }
                                            catch (n9 n93) {
                                                throw m44.a("i", (Object)n93, (long)2719914896490615624L, (long)l11);
                                            }
                                            if (m44.a("w", (Object)k42, (long)4112224273827213834L, (long)l11) == null) break block19;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("i", (Object)n94, (long)2719914896490615624L, (long)l11);
                                        }
                                        n11 = ((CallSite)m44.a("w", (Object)this, (long)4112224273827213834L, (long)l11)).length;
                                        if (callSite == false) return new String[n11];
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("i", (Object)n95, (long)2719914896490615624L, (long)l11);
                                    }
                                    if (n11 <= n10) break block20;
                                }
                                catch (n9 n96) {
                                    throw m44.a("i", (Object)n96, (long)2719914896490615624L, (long)l11);
                                }
                                stringArray2 = new String[((CallSite)m44.a("w", (Object)this, (long)4112224273827213834L, (long)l11)[n10]).length];
                                break block21;
                            }
                            n11 = 0;
                            return new String[n11];
                        }
                        k42 = this;
                    }
                    object2 = n10;
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l12;
                objectArray2[0] = (int)object2;
                return m44.a("v", (Object)k42, (Object)objectArray2, (long)2629700804409430789L, (long)l11);
            }
            object = false;
            return new String[object];
        }
        block12: for (int i10 = 0; i10 < ((CallSite)m44.a("w", (Object)this, (long)4112224273827213834L, (long)l11)[n10]).length; ++i10) {
            try {
                do {
                    stringArray = stringArray2;
                    Object object = callSite;
                    if (l11 > 0L) {
                        if (object == false) return stringArray;
                        object = i10;
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l10;
                    stringArray[object] = m44.a("v", (Object)m44.a("w", (Object)this, (long)4112224273827213834L, (long)l11)[n10][i10], (Object)objectArray3, (long)2414356721793522141L, (long)l11);
                    if (callSite != false) continue block12;
                } while (l11 < 0L);
                break;
            }
            catch (n9 n97) {
                throw m44.a("i", (Object)n97, (long)2719914896490615624L, (long)l11);
            }
        }
        stringArray = stringArray2;
        return stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String[] S(Object[] objectArray) {
        String[] stringArray;
        String[] stringArray2;
        CallSite callSite;
        long l10;
        long l11;
        int n10;
        block13: {
            Object object;
            block12: {
                n10 = (Integer)objectArray[0];
                l11 = (Long)objectArray[1];
                l10 = (l11 = c ^ l11) ^ 0x4990917DFED7L;
                callSite = m44.a("l", (long)-6859609557894508155L, (long)l11);
                try {
                    try {
                        try {
                            object = m44.a("r", (Object)this, (long)-5071930905614060726L, (long)l11);
                            if (callSite == false) return new String[object];
                            if (object == false) break block12;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)n92, (long)-6793011565403744435L, (long)l11);
                        }
                        object = ((CallSite)m44.a("r", (Object)this, (long)-6745888823477394042L, (long)l11)).length;
                        if (callSite == false) return new String[object];
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)n93, (long)-6793011565403744435L, (long)l11);
                    }
                    if (object <= n10) break block12;
                }
                catch (n9 n94) {
                    throw m44.a("l", (Object)n94, (long)-6793011565403744435L, (long)l11);
                }
                stringArray2 = new String[((CallSite)m44.a("r", (Object)this, (long)-6745888823477394042L, (long)l11)[n10]).length];
                break block13;
            }
            object = false;
            return new String[object];
        }
        block8: for (int i10 = 0; i10 < ((CallSite)m44.a("r", (Object)this, (long)-6745888823477394042L, (long)l11)[n10]).length; ++i10) {
            try {
                do {
                    stringArray = stringArray2;
                    Object object = callSite;
                    if (l11 > 0L) {
                        if (object == false) return stringArray;
                        object = i10;
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l10;
                    stringArray[object] = m44.a("s", (Object)m44.a("r", (Object)this, (long)-6745888823477394042L, (long)l11)[n10][i10], (Object)objectArray2, (long)-6519858291790258728L, (long)l11);
                    if (callSite != false) continue block8;
                } while (l11 < 0L);
                break;
            }
            catch (n9 n95) {
                throw m44.a("l", (Object)n95, (long)-6793011565403744435L, (long)l11);
            }
        }
        stringArray = stringArray2;
        return stringArray;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean l(Object[] var1_1) {
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
    @Override
    int g(int var1_1, byte var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 8[SIMPLE_IF_TAKEN]
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
    public void s(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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
    protected void c(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[DOLOOP]], but top level block is 13[SIMPLE_IF_TAKEN]
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
    public void f(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 7[SIMPLE_IF_TAKEN]
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
    public void m(Object[] var1_1) {
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
     * Lifted jumps to return sites
     */
    public s8 w(Object[] objectArray) {
        CallSite callSite;
        Object object;
        CallSite callSite2;
        long l10;
        long l11;
        String string;
        block9: {
            string = (String)objectArray[0];
            l11 = (Long)objectArray[1];
            l10 = (l11 = c ^ l11) ^ 0x3A5D7F420720L;
            callSite2 = m44.a("k", (long)6429652347431757938L, (long)l11);
            try {
                object = m44.a("u", (Object)this, (long)4641964899049900733L, (long)l11);
                if (callSite2 == false) break block9;
                if (object == false) return null;
            }
            catch (n9 n92) {
                throw m44.a("k", (Object)n92, (long)6362790454936907450L, (long)l11);
            }
            object = false;
        }
        reference var8_6 = object;
        do {
            Object object2 = var8_6;
            block5: while (true) {
                int n10;
                if (object2 >= ((CallSite)m44.a("u", (Object)this, (long)6599666911240641649L, (long)l11)).length) return null;
                int n11 = n10 = 0;
                block6: while (n10 < ((CallSite)m44.a("u", (Object)this, (long)6599666911240641649L, (long)l11)[var8_6]).length) {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l10;
                    object2 = string.equals(m44.a("t", (Object)m44.a("u", (Object)this, (long)6599666911240641649L, (long)l11)[var8_6][n10], (Object)objectArray2, (long)6661875671570785327L, (long)l11));
                    do {
                        if (callSite2 == false) continue block5;
                        try {
                            if (l11 <= 0L) continue block6;
                            if (object2 != false) {
                                return m44.a("u", (Object)this, (long)6599666911240641649L, (long)l11)[var8_6][n10];
                            }
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)n93, (long)6362790454936907450L, (long)l11);
                        }
                        ++n10;
                        if (callSite2 != false) continue block6;
                        ++var8_6;
                        callSite = callSite2;
                    } while (l11 <= 0L);
                }
                break;
            }
        } while (callSite != false);
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                k4.c = prr.a(5205248799690140182L, 6435689506755319739L, MethodHandles.lookup().lookupClass()).a(38206175655419L);
                k4.j = new HashMap<K, V>(13);
                var0 = k4.c ^ 137276647532254L;
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
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "$\u00e4\u009a\u00e0\u0099;U\u00bb\u00a7F\u0096zX\u00db\u00a6\u00ee\u0010s\u00d8L)\u00d1Ksk\u00b5C\u00db\u00aa/\u009a\u00aaS\u0010\u0094\u00b9&\u00c65\u00fc\u00d6I2\u008d{\u00d1\u0081\u00ab\u00dd\u00a6\u0010\u008e\n\u0090\u00b1\u00e3\u001f\u00a3\u00df!H$\u0017\u001f\u000b\u009b\u00fe\u0018\u00e6\u009eS{\u0007f\u00e7\t\u00a4FT\u00e3Is\u00bc\u00d5{\u0007\u00b7bNr!m(c\u0018\u00ed\u00dc\u007f3P\u00e8\u00b7\"\u00d2.\u0094/o\u00f5\u00ae\u00ec8]\u00af\u00d4U\u00de\u001a!\n\u0015\u00dd\u00b4B\u00bdZ\u00f1\u007f[Zc\n\u0019\u0010\u00f1wkB\u00a9\u00a0\u00fd\u0099\u0002\u00bf\u00bf\u00b5\u00f1\u00df\u001b\u0015(O-\u00d4u\u00e3-\u00fd\u00c3\t?\u00ec\u00b62\r\b\u00dcX\u00faQ\u0089\u00b8\u00c4\u00c0\u0017_4\u00cf$\u00c6\u00b6\u008d`\u00d5\u0004\u00d3\u00867\u00e2g#\u0010A\u00b0,\u00bf\u0016-4\u00df|\u00ef>N\u00f39o\u0015 '\u007f\u00fc\u00b5\u0089$\u008f\u00a9,\u00bb\u000b\u00e5<m\u0089\u00cc\u00da\u00dd\u001e(Wf}[\u007f\u00d2Y\u001aC\u00f3\u0096 \u0010\u00day\u00c8}Vd$N{\u00b7B\u00dc\u00fb\u0002\u00ce ";
                var8_6 = "$\u00e4\u009a\u00e0\u0099;U\u00bb\u00a7F\u0096zX\u00db\u00a6\u00ee\u0010s\u00d8L)\u00d1Ksk\u00b5C\u00db\u00aa/\u009a\u00aaS\u0010\u0094\u00b9&\u00c65\u00fc\u00d6I2\u008d{\u00d1\u0081\u00ab\u00dd\u00a6\u0010\u008e\n\u0090\u00b1\u00e3\u001f\u00a3\u00df!H$\u0017\u001f\u000b\u009b\u00fe\u0018\u00e6\u009eS{\u0007f\u00e7\t\u00a4FT\u00e3Is\u00bc\u00d5{\u0007\u00b7bNr!m(c\u0018\u00ed\u00dc\u007f3P\u00e8\u00b7\"\u00d2.\u0094/o\u00f5\u00ae\u00ec8]\u00af\u00d4U\u00de\u001a!\n\u0015\u00dd\u00b4B\u00bdZ\u00f1\u007f[Zc\n\u0019\u0010\u00f1wkB\u00a9\u00a0\u00fd\u0099\u0002\u00bf\u00bf\u00b5\u00f1\u00df\u001b\u0015(O-\u00d4u\u00e3-\u00fd\u00c3\t?\u00ec\u00b62\r\b\u00dcX\u00faQ\u0089\u00b8\u00c4\u00c0\u0017_4\u00cf$\u00c6\u00b6\u008d`\u00d5\u0004\u00d3\u00867\u00e2g#\u0010A\u00b0,\u00bf\u0016-4\u00df|\u00ef>N\u00f39o\u0015 '\u007f\u00fc\u00b5\u0089$\u008f\u00a9,\u00bb\u000b\u00e5<m\u0089\u00cc\u00da\u00dd\u001e(Wf}[\u007f\u00d2Y\u001aC\u00f3\u0096 \u0010\u00day\u00c8}Vd$N{\u00b7B\u00dc\u00fb\u0002\u00ce ".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = k4.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "tN\u00e2\u00fc\u001eX\u0013\u0089\u00a7Yf\u0099\u00fa\u00ae\n\u00a4\u00d4\u0088Oe\u00b5\u0016\u001ey\u0002\u00f9V\u0012\u00ea\u00d2(\u00a1~\u009f\u00a8E`r\u0080\b\r\u00ce\u0094\u00da\u00c6\u00f3\u000b^\u00f9\u0092\u00e0v)\u00afF\u00f9\u00bds\u001e\u00cb\u00b9\u00cfFVe\u008cn\u0016lO\nO\u0017E1<y\u00a5N\u0098\u00af\u0000\u008cN\u0017\u00f9w\u0010aO\u00d7\u0096sB\u00b7\u00a7\u0010\u00e6\u00de\u00eb\u00bd\u00e2`\u0091\u00cd'\u00d4\u00ee\u000b\u00f8\u00df\\!";
                    var8_6 = "tN\u00e2\u00fc\u001eX\u0013\u0089\u00a7Yf\u0099\u00fa\u00ae\n\u00a4\u00d4\u0088Oe\u00b5\u0016\u001ey\u0002\u00f9V\u0012\u00ea\u00d2(\u00a1~\u009f\u00a8E`r\u0080\b\r\u00ce\u0094\u00da\u00c6\u00f3\u000b^\u00f9\u0092\u00e0v)\u00afF\u00f9\u00bds\u001e\u00cb\u00b9\u00cfFVe\u008cn\u0016lO\nO\u0017E1<y\u00a5N\u0098\u00af\u0000\u008cN\u0017\u00f9w\u0010aO\u00d7\u0096sB\u00b7\u00a7\u0010\u00e6\u00de\u00eb\u00bd\u00e2`\u0091\u00cd'\u00d4\u00ee\u000b\u00f8\u00df\\!".length();
                    var5_7 = 96;
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
                    var9_3[var7_4++] = k4.c(var10_9).intern();
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
        k4.g = var9_3;
        k4.i = new String[13];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6767;
        if (i[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/k4", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n11].getBytes("ISO-8859-1");
            k4.i[n11] = k4.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = k4.b(n10, l10);
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
            throw new RuntimeException("com/zelix/k4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(k4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

