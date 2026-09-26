/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.az;
import com.zelix.fb;
import com.zelix.fh;
import com.zelix.h1;
import com.zelix.hz;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.p;
import com.zelix.prr;
import com.zelix.v7;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ik
extends oz {
    private final int A;
    protected final fh x;
    protected final az u;
    private static final long a;
    private static final String c;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map g;

    public ik(int n10, fh fh2, int n11, p p10, int n12, int n13, int n14) {
        long l10 = ((long)n11 << 32 | (long)n13 << 48 >>> 32 | (long)n14 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x3C4C59650A48L;
        int n15 = (int)(l11 >>> 48);
        int n16 = (int)(l11 << 16 >>> 32);
        int n17 = (int)(l11 << 48 >>> 48);
        this(n10, (char)n15, n16, fh2, p10, (char)n17, 0, n12);
    }

    @Override
    public void h(Object[] objectArray) {
        Object object;
        CallSite callSite;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        PrintWriter printWriter;
        long l10;
        block11: {
            block12: {
                Object object2;
                CallSite callSite2;
                CallSite callSite3;
                long l11;
                long l12;
                block9: {
                    block10: {
                        l10 = (Long)objectArray[0];
                        printWriter = (PrintWriter)objectArray[1];
                        stringBuilder2 = (StringBuilder)objectArray[2];
                        long l13 = l10;
                        long l14 = l13 ^ 0x8A9056647FBL;
                        int n10 = (int)(l14 >>> 32);
                        int n11 = (int)(l14 << 32 >>> 56);
                        int n12 = (int)(l14 << 40 >>> 40);
                        l12 = l13 ^ 0x5D3C6484BBF6L;
                        l11 = l13 ^ 0x7B7D8DE1E476L;
                        long l15 = l13 ^ 0xA3E14857063L;
                        long l16 = l13 ^ 0x27C7495FC665L;
                        int n13 = (int)(l16 >>> 56);
                        long l17 = l16 << 8 >>> 8;
                        stringBuilder = new StringBuilder((int)ik.b("q", (int)28929, (long)(0x4B6A190566E0D5B7L ^ l10)));
                        CallSite callSite4 = m44.a("h", (long)-1155528826364025814L, (long)l10);
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = n12;
                        objectArray2[1] = (int)((byte)n11);
                        objectArray2[0] = n10;
                        stringBuilder.append((String)((Object)m44.a("w", (Object)this, (Object)objectArray2, (long)-1086957326901150887L, (long)l10)));
                        callSite3 = callSite4;
                        stringBuilder.append((char)ik.b("q", (int)3, (long)(0x50ADBEABBF2F24CFL ^ l10)));
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l15;
                        callSite2 = m44.a("w", (Object)this, (Object)objectArray3, (long)-657212478561287869L, (long)l10);
                        try {
                            try {
                                object2 = this.u.o((byte)n13, l17);
                                if (callSite3 == false) break block9;
                                if (object2 == 0) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)-813205412663543301L, (long)l10);
                            }
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l15;
                            stringBuilder.append((String)((Object)m44.a("l", (long)-1414127496629952734L, (long)l10)[m44.a("w", (Object)this, (Object)objectArray4, (long)-657212478561287869L, (long)l10)]));
                            stringBuilder.append((char)ik.b("q", (int)3, (long)(0x50ADBEABBF2F24CFL ^ l10)));
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)-813205412663543301L, (long)l10);
                        }
                    }
                    stringBuilder.append(this.u.n());
                    object2 = callSite2;
                }
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = object2;
                objectArray5[0] = l11;
                callSite = m44.a("h", (Object)objectArray5, (long)-1509257710096725591L, (long)l10);
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = m44.a("h", (int)this.u.n(), (long)-1207627958331833678L, (long)l10);
                objectArray6[1] = callSite;
                objectArray6[0] = l12;
                callSite = m44.a("h", (Object)objectArray6, (long)-1214410100789358428L, (long)l10);
                try {
                    object = callSite2;
                    if (l10 < 0L || callSite3 == false) break block11;
                    if (object != ik.b("q", (int)15070, (long)(0x48E48E856E4F9E28L ^ l10))) break block12;
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)n94, (long)-813205412663543301L, (long)l10);
                }
                Object[] objectArray7 = new Object[3];
                objectArray7[2] = m44.a("h", (int)this.A, (long)-1207627958331833678L, (long)l10);
                objectArray7[1] = callSite;
                objectArray7[0] = l12;
                callSite = m44.a("h", (Object)objectArray7, (long)-1214410100789358428L, (long)l10);
            }
            object = ((String)((Object)callSite)).length();
        }
        try {
            if (object > 0) {
                stringBuilder.append("\t" + (String)((Object)callSite));
            }
        }
        catch (n9 n95) {
            throw m44.a("h", (Object)n95, (long)-813205412663543301L, (long)l10);
        }
        printWriter.println(stringBuilder2.toString() + stringBuilder2.toString() + stringBuilder);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final boolean e(long var1_1, int var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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
    public final boolean Z(byte var1_1, int var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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
    private static fh w(Object[] var0) {
        block28: {
            block29: {
                var1_1 = (String)var0[0];
                var4_2 = (Boolean)var0[1];
                var2_3 = (Long)var0[2];
                var2_3 = ik.a ^ var2_3;
                var5_4 = m44.a("o", (long)-7067929884304320971L, (long)var2_3);
                try {
                    try {
                        try {
                            v0 = var1_1.length();
                            if (var5_4 == false) break block28;
                            if (v0 != 1) break block29;
                        }
                        catch (n9 v1) {
                            throw m44.a("o", (Object)v1, (long)-8743177459660829724L, (long)var2_3);
                        }
                        v2 = var1_1.charAt(0);
                        if (var2_3 > 0L && var5_4 != false) {
                        }
                        ** GOTO lbl27
                    }
                    catch (n9 v3) {
                        throw m44.a("o", (Object)v3, (long)-8743177459660829724L, (long)var2_3);
                    }
                }
                catch (n9 v4) {
                    throw m44.a("o", (Object)v4, (long)-8743177459660829724L, (long)var2_3);
                }
                {
                    ** switch (v2)
                }
lbl-1000:
                // 1 sources

                {
                    case 'B': 
                    case 'C': 
                    case 'I': 
                    case 'S': 
                    case 'Z': {
                        v2 = (char)var4_2;
lbl27:
                        // 2 sources

                        try {
                            if (v2 != '\u0000') {
                                return m44.a("k", (long)-6956233119092589673L, (long)var2_3);
                            }
                        }
                        catch (n9 v5) {
                            throw m44.a("o", (Object)v5, (long)-8743177459660829724L, (long)var2_3);
                        }
                        return m44.a("k", (long)-7275030749421734586L, (long)var2_3);
                    }
lbl34:
                    // 1 sources

                    case 'J': {
                        try {
                            if (var4_2) {
                                return fh.T;
                            }
                        }
                        catch (n9 v6) {
                            throw m44.a("o", (Object)v6, (long)-8743177459660829724L, (long)var2_3);
                        }
                        return m44.a("k", (long)-7317676611579336348L, (long)var2_3);
                    }
lbl42:
                    // 1 sources

                    case 'F': {
                        try {
                            if (var4_2) {
                                return m44.a("k", (long)-8827705174709402828L, (long)var2_3);
                            }
                        }
                        catch (n9 v7) {
                            throw m44.a("o", (Object)v7, (long)-8743177459660829724L, (long)var2_3);
                        }
                        return m44.a("k", (long)-7297367687332224878L, (long)var2_3);
                    }
lbl50:
                    // 1 sources

                    case 'D': {
                        try {
                            if (var4_2) {
                                return m44.a("k", (long)-9216983540046061350L, (long)var2_3);
                            }
                        }
                        catch (n9 v8) {
                            throw m44.a("o", (Object)v8, (long)-8743177459660829724L, (long)var2_3);
                        }
                        return m44.a("k", (long)-8890099243457834644L, (long)var2_3);
                    }
                }
lbl58:
                // 1 sources

                return null;
            }
            v0 = (int)var4_2;
        }
        try {
            if (v0 != 0) {
                return fh.U;
            }
        }
        catch (n9 v9) {
            throw m44.a("o", (Object)v9, (long)-8743177459660829724L, (long)var2_3);
        }
        return m44.a("k", (long)-7221409565365457603L, (long)var2_3);
    }

    public ik(az az2, fh fh2, long l10) {
        l10 = a ^ l10;
        super((int)ik.b("q", (int)32301, (long)(0x41C48E11A8457B73L ^ l10)));
        this.u = az2;
        this.x = fh2;
        this.A = 0;
    }

    public static ik c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        boolean bl2 = (Boolean)objectArray[2];
        az az2 = (az)objectArray[3];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x1FFBF7785DB8L;
        long l13 = l11 ^ 0x123E22EA8E5FL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l13;
        objectArray2[1] = bl2;
        objectArray2[0] = string;
        CallSite callSite = m44.a("n", (Object)objectArray2, (long)-1466097074878587719L, (long)l10);
        return new ik(az2, (fh)((Object)callSite), l12);
    }

    /*
     * Exception decompiling
     */
    public static ik Z(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [32[CASE]], but top level block is 4[TRYBLOCK]
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
    public final boolean v(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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

    public int y(Object[] objectArray) {
        return this.A;
    }

    @Override
    public boolean r(long l10) {
        boolean bl2;
        try {
            bl2 = this.x == fh.b;
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)n92, (long)2804880299577207713L, (long)l10);
        }
        return bl2;
    }

    public int C(Object[] objectArray) {
        Object object;
        block4: {
            long l10;
            long l11;
            block5: {
                l11 = (Long)objectArray[0];
                long l12 = l11 = a ^ l11;
                l10 = l12 ^ 0x3E53CB1C4683L;
                long l13 = l12 ^ 0x16863269C836L;
                int n10 = (int)(l13 >>> 48);
                long l14 = l13 << 16 >>> 16;
                CallSite callSite = m44.a("h", (long)-2803903315631402294L, (long)l11);
                try {
                    try {
                        object = this.j((short)n10, l14);
                        if (callSite == false) break block4;
                        if (object == 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-4443120365243560165L, (long)l11);
                    }
                    return (int)ik.b("q", (int)30137, (long)(0x729ED8984C6D67FBL ^ l11));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-4443120365243560165L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            object = m44.a("w", (Object)this, (Object)objectArray2, (long)-4611359642671401053L, (long)l11);
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean E(long var1_1, int var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 4[SWITCH]
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
    public int T(char var1_1, int var2_2, char var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CASE]], but top level block is 2[TRYBLOCK]
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
    public final boolean Y(long var1_1, int var3_2, int var4_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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
    public ik(int var1_1, int var2_2, long var3_3, int var5_4, h1 var6_5, p var7_6) {
        block13: {
            block14: {
                block11: {
                    v0 = var3_3 = ik.a ^ var3_3;
                    var8_7 = v0 ^ 49588943580934L;
                    var10_8 = v0 ^ 81564923781873L;
                    v1 = m44.a("o", (long)-7076846906009037291L, (long)var3_3);
                    super((int)ik.b("q", (int)29483, (long)(5000789542696986110L ^ var3_3)));
                    var12_9 = v1;
                    try {
                        try {
                            v2 = var2_2;
                            v3 = ik.b("q", (int)15070, (long)(5252550772290546711L ^ var3_3));
                            if (var12_9 == false) break block11;
                            if (v2 == v3) {
                            }
                            ** GOTO lbl41
                        }
                        catch (n9 v4) {
                            throw m44.a("o", (Object)v4, (long)-8752279270185186364L, (long)var3_3);
                        }
                        v2 = var1_1;
                        v3 = ik.b("q", (int)5531, (long)(1757563344876421967L ^ var3_3));
                    }
                    catch (n9 v5) {
                        throw m44.a("o", (Object)v5, (long)-8752279270185186364L, (long)var3_3);
                    }
                }
                try {
                    try {
                        block12: {
                            try {
                                if (v2 != v3) break block12;
                                this.A = (int)m44.a("p", (Object)var6_5, (long)-7230238893586066467L, (long)var3_3);
                                if (var3_3 <= 0L) break block13;
                                if (var12_9 != false) break block14;
                            }
                            catch (n9 v6) {
                                throw m44.a("o", (Object)v6, (long)-8752279270185186364L, (long)var3_3);
                            }
                        }
                        this.A = (int)m44.a("p", (Object)var6_5, (long)-8819096121781981506L, (long)var3_3);
                        if (var3_3 <= 0L) break block13;
                        if (var12_9 != false) break block14;
                    }
                    catch (n9 v7) {
                        throw m44.a("o", (Object)v7, (long)-8752279270185186364L, (long)var3_3);
                    }
lbl41:
                    // 2 sources

                    this.A = 0;
                }
                catch (n9 v8) {
                    throw m44.a("o", (Object)v8, (long)-8752279270185186364L, (long)var3_3);
                }
            }
            this.x = ik.v(var2_2, var10_8);
            this.u = var7_6.v(var5_4, this.x, var8_7, 0);
        }
    }

    public ik(int n10, char c10, int n11, fh fh2, p p10, char c11, int n12, int n13) {
        long l10 = ((long)c10 << 48 | (long)n11 << 32 >>> 16 | (long)c11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x4524CA5907A0L;
        super((int)ik.b("q", (int)29483, (long)(0x456637A519F5CD58L ^ l10)));
        this.x = fh2;
        this.u = p10.v(n10, fh2, l11, n13);
        this.A = n12;
    }

    @Override
    public final String M(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l10 = (long)n10 << 32 | (long)n11 << 56 >>> 32 | (long)n12 << 40 >>> 40;
        long l11 = l10 ^ 0x4703AB5F918DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("o", (long)-6081255731676047143L, (long)l10)[m44.a("t", (Object)this, (Object)objectArray2, (long)-5962188605701887238L, (long)l10)];
    }

    /*
     * Exception decompiling
     */
    @Override
    public void G(short var1_1, int var2_2, DataOutputStream var3_3, int var4_4) {
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

    /*
     * Exception decompiling
     */
    @Override
    public final boolean d(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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
    public final boolean Y(long var1_1, int var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 4[SWITCH]
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
    public final boolean T(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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
    public String l(Object[] objectArray) {
        StringBuilder stringBuilder;
        block12: {
            Object object;
            StringBuilder stringBuilder2;
            long l10;
            block10: {
                CallSite callSite;
                CallSite callSite2;
                block11: {
                    l10 = (Long)objectArray[0];
                    long l11 = l10;
                    long l12 = l11 ^ 0x3926A82327E7L;
                    int n10 = (int)(l12 >>> 32);
                    int n11 = (int)(l12 << 32 >>> 56);
                    int n12 = (int)(l12 << 40 >>> 40);
                    long l13 = l11 ^ 0x3BB1B9C0107FL;
                    long l14 = l11 ^ 0x136440B59ECAL;
                    int n13 = (int)(l14 >>> 48);
                    long l15 = l14 << 16 >>> 16;
                    CallSite callSite3 = m44.a("l", (long)-8054002016480585719L, (long)l10);
                    stringBuilder2 = new StringBuilder();
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = n12;
                    objectArray2[1] = (int)((byte)n11);
                    objectArray2[0] = n10;
                    stringBuilder2.append((String)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-8001089360130139323L, (long)l10)));
                    callSite2 = callSite3;
                    stringBuilder2.append((char)ik.b("q", (int)3, (long)(0x50AD8F24126A44D3L ^ l10)));
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l13;
                    callSite = m44.a("s", (Object)this, (Object)objectArray3, (long)-7566842096676249249L, (long)l10);
                    try {
                        try {
                            object = this.j((short)n13, l15);
                            if (callSite2 != false) break block10;
                            if (!object) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)n92, (long)-7734131417503311385L, (long)l10);
                        }
                        stringBuilder2.append((String)((Object)m44.a("h", (long)-8323721904300540098L, (long)l10)[callSite]));
                        stringBuilder2.append((char)ik.b("q", (int)3, (long)(0x50AD8F24126A44D3L ^ l10)));
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)n93, (long)-7734131417503311385L, (long)l10);
                    }
                }
                try {
                    if (l10 > 0L) {
                        stringBuilder = stringBuilder2.append(this.u.n());
                        if (callSite2 != false) break block12;
                    }
                    object = callSite;
                }
                catch (n9 n94) {
                    throw m44.a("l", (Object)n94, (long)-7734131417503311385L, (long)l10);
                }
            }
            try {
                if (object == ik.b("q", (int)15070, (long)(0x48E4BF0AC30AFE34L ^ l10))) {
                    stringBuilder2.append((char)ik.b("q", (int)3, (long)(0x50AD8F24126A44D3L ^ l10)));
                    stringBuilder2.append(this.A);
                }
            }
            catch (n9 n95) {
                throw m44.a("l", (Object)n95, (long)-7734131417503311385L, (long)l10);
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean X(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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
    public boolean X(int n10, long l10) {
        int n11;
        block22: {
            block23: {
                int n12;
                block24: {
                    Object object;
                    block20: {
                        Object object2;
                        CallSite callSite;
                        block18: {
                            long l11;
                            block19: {
                                boolean bl2;
                                block16: {
                                    block17: {
                                        long l12 = l10;
                                        l11 = l12 ^ 0x13502AB404EL;
                                        long l13 = l12 ^ 0x9569C3CAF8AL;
                                        long l14 = l12 ^ 0x5E542A4E5CCCL;
                                        callSite = m44.a("m", (long)-2316055631591173113L, (long)l10);
                                        try {
                                            try {
                                                try {
                                                    bl2 = this.Y(l14, n10);
                                                    if (callSite == false) break block16;
                                                    if (bl2) break block17;
                                                }
                                                catch (n9 n92) {
                                                    throw m44.a("m", (Object)n92, (long)-4279577469076534826L, (long)l10);
                                                }
                                                object2 = this.E(l13, n10);
                                                if (callSite == false) break block18;
                                            }
                                            catch (n9 n93) {
                                                throw m44.a("m", (Object)n93, (long)-4279577469076534826L, (long)l10);
                                            }
                                            if (object2 == 0) break block19;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("m", (Object)n94, (long)-4279577469076534826L, (long)l10);
                                        }
                                    }
                                    bl2 = true;
                                }
                                return bl2;
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l11;
                            object2 = m44.a("r", (Object)this, (Object)objectArray, (long)-4121893511865257618L, (long)l10);
                        }
                        int n13 = object2;
                        try {
                            try {
                                block21: {
                                    try {
                                        try {
                                            try {
                                                n12 = n13;
                                                object = ik.b("q", (int)15070, (long)(0x48E4858E7861AE05L ^ l10));
                                                if (callSite == false) break block20;
                                                if (n12 == object) break block21;
                                            }
                                            catch (n9 n95) {
                                                throw m44.a("m", (Object)n95, (long)-4279577469076534826L, (long)l10);
                                            }
                                            n11 = n13;
                                            if (callSite == false) break block22;
                                        }
                                        catch (n9 n96) {
                                            throw m44.a("m", (Object)n96, (long)-4279577469076534826L, (long)l10);
                                        }
                                        if (n11 != ik.b("q", (int)805, (long)(0x41ADF5D9B20517CEL ^ l10))) break block23;
                                    }
                                    catch (n9 n97) {
                                        throw m44.a("m", (Object)n97, (long)-4279577469076534826L, (long)l10);
                                    }
                                }
                                n12 = this.u.n();
                                if (callSite == false) break block24;
                            }
                            catch (n9 n98) {
                                throw m44.a("m", (Object)n98, (long)-4279577469076534826L, (long)l10);
                            }
                            object = n10;
                        }
                        catch (n9 n99) {
                            throw m44.a("m", (Object)n99, (long)-4279577469076534826L, (long)l10);
                        }
                    }
                    n12 = n12 == object ? 1 : 0;
                }
                return n12 != 0;
            }
            n11 = 0;
        }
        return n11 != 0;
    }

    /*
     * Unable to fully structure code
     */
    private hz N(int var1_1, long var2_2, v7[] var4_3, v7[] var5_4, v7 var6_5, fb var7_6, Set var8_7) {
        block39: {
            block37: {
                block38: {
                    block35: {
                        block30: {
                            block34: {
                                block31: {
                                    block32: {
                                        v0 = var2_2 = ik.a ^ var2_2;
                                        var9_8 = v0 ^ 79097403126213L;
                                        var11_9 = v0 ^ 35636492114217L;
                                        var14_10 = this.u.n();
                                        var15_11 = v7.I(var1_1 - 1, var11_9);
                                        System.arraycopy(var4_3, 0, var15_11, 0, var1_1 - 1);
                                        var16_12 = var5_4.length;
                                        v1 = m44.a("k", (long)6070039620152122382L, (long)var2_2);
                                        var17_13 = v7.I(var16_12, var11_9);
                                        System.arraycopy(var5_4, 0, var17_13, 0, var16_12);
                                        var13_14 = v1;
                                        try {
                                            block33: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v2 = var17_13[var14_10].equals(v7.k);
                                                                    if (var13_14 != false) break block30;
                                                                    if (!v2) break block31;
                                                                }
                                                                catch (n9 v3) {
                                                                    throw m44.a("k", (Object)v3, (long)5813491237521792480L, (long)var2_2);
                                                                }
                                                                v4 = var17_13;
                                                                v5 = var14_10 - 1;
                                                                v6 = var13_14;
                                                                if (var2_2 >= 0L) {
                                                                    if (v6 != false) break block32;
                                                                }
                                                                ** GOTO lbl58
                                                            }
                                                            catch (n9 v7) {
                                                                throw m44.a("k", (Object)v7, (long)5813491237521792480L, (long)var2_2);
                                                            }
                                                            if (var2_2 < 0L) break block32;
                                                            if (v4[v5].equals(v7.c)) break block33;
                                                        }
                                                        catch (n9 v8) {
                                                            throw m44.a("k", (Object)v8, (long)5813491237521792480L, (long)var2_2);
                                                        }
                                                        v2 = var17_13[var14_10 - 1].equals(v7.z);
                                                        if (var2_2 < 0L || var13_14 != false) break block30;
                                                    }
                                                    catch (n9 v9) {
                                                        throw m44.a("k", (Object)v9, (long)5813491237521792480L, (long)var2_2);
                                                    }
                                                    if (!v2) break block31;
                                                }
                                                catch (n9 v10) {
                                                    throw m44.a("k", (Object)v10, (long)5813491237521792480L, (long)var2_2);
                                                }
                                            }
                                            v4 = var17_13;
                                            v5 = var14_10 - 1;
                                        }
                                        catch (n9 v11) {
                                            throw m44.a("k", (Object)v11, (long)5813491237521792480L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            v6 = var13_14;
lbl58:
                                            // 2 sources

                                            if (var2_2 >= 0L) {
                                                if (v6 != false) break block34;
                                                v4[v5] = v7.w;
                                                if (var7_6 == null) break block31;
                                            }
                                            ** GOTO lbl77
                                        }
                                        catch (n9 v12) {
                                            throw m44.a("k", (Object)v12, (long)5813491237521792480L, (long)var2_2);
                                        }
                                        var7_6.set(var14_10 - 1);
                                    }
                                    catch (n9 v13) {
                                        throw m44.a("k", (Object)v13, (long)5813491237521792480L, (long)var2_2);
                                    }
                                }
                                v4 = var17_13;
                                v5 = var14_10;
                            }
                            try {
                                if (var2_2 < 0L) break block35;
                                v6 = var13_14;
lbl77:
                                // 2 sources

                                if (v6 != false) break block35;
                                v2 = v4[v5].equals(v7.c);
                            }
                            catch (n9 v14) {
                                throw m44.a("k", (Object)v14, (long)5813491237521792480L, (long)var2_2);
                            }
                        }
                        try {
                            block36: {
                                try {
                                    try {
                                        if (v2) break block36;
                                        v15 = var17_13;
                                        v16 = var14_10;
                                        if (var13_14 != false) break block37;
                                    }
                                    catch (n9 v17) {
                                        throw m44.a("k", (Object)v17, (long)5813491237521792480L, (long)var2_2);
                                    }
                                    if (!v15[v16].equals(v7.z)) break block38;
                                }
                                catch (n9 v18) {
                                    throw m44.a("k", (Object)v18, (long)5813491237521792480L, (long)var2_2);
                                }
                            }
                            v4 = var17_13;
                            v5 = var14_10 + 1;
                        }
                        catch (n9 v19) {
                            throw m44.a("k", (Object)v19, (long)5813491237521792480L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            v4[v5] = v7.w;
                            if (var13_14 != false) break block39;
                            if (var7_6 == null) break block38;
                        }
                        catch (n9 v20) {
                            throw m44.a("k", (Object)v20, (long)5813491237521792480L, (long)var2_2);
                        }
                        var7_6.set(var14_10 + 1);
                    }
                    catch (n9 v21) {
                        throw m44.a("k", (Object)v21, (long)5813491237521792480L, (long)var2_2);
                    }
                }
                v15 = var17_13;
                v16 = var14_10;
            }
            v15[v16] = var6_5;
        }
        return new hz(var15_11, var17_13, var9_8, var7_6, var8_7);
    }

    public int U() {
        return this.u.n();
    }

    @Override
    public boolean L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x5A3633FF4E9CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("r", (Object)this, (Object)objectArray2, (long)7832878753967955900L, (long)l10);
    }

    public fh a(Object[] objectArray) {
        return this.x;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean j(short s10, long l10) {
        ik ik2;
        int n10;
        CallSite callSite;
        long l11;
        block17: {
            l11 = ((long)s10 << 48 | l10 << 16 >>> 16) ^ a;
            long l12 = l11 ^ 0x7EEBD50FD825L;
            int n11 = (int)(l12 >>> 56);
            long l13 = l12 << 8 >>> 8;
            callSite = m44.a("h", (long)-1268318042971937195L, (long)l11);
            try {
                try {
                    try {
                        try {
                            n10 = this.u.o((byte)n11, l13);
                            if (callSite != false) return n10 != 0;
                            if (n10 != 0) return 1 != 0;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)-1515829813865896005L, (long)l11);
                        }
                        ik2 = this;
                        if (l10 <= 0L || callSite != false) break block17;
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)n93, (long)-1515829813865896005L, (long)l11);
                    }
                    if (ik2.x != fh.u) return 0 != 0;
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)n94, (long)-1515829813865896005L, (long)l11);
                }
                ik2 = this;
            }
            catch (n9 n95) {
                throw m44.a("h", (Object)n95, (long)-1515829813865896005L, (long)l11);
            }
        }
        try {
            try {
                try {
                    try {
                        n10 = ik2.A;
                        CallSite callSite2 = callSite;
                        if (s10 >= 0) {
                            if (callSite2 != false) return n10 != 0;
                            callSite2 = ik.b("q", (int)7389, (long)(0x36BA2201C7C72619L ^ l11));
                        }
                        if (n10 < callSite2) return 1 != 0;
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)n96, (long)-1515829813865896005L, (long)l11);
                    }
                    n10 = this.A;
                    if (callSite != false) return n10 != 0;
                }
                catch (n9 n97) {
                    throw m44.a("h", (Object)n97, (long)-1515829813865896005L, (long)l11);
                }
                if (n10 <= ik.b("q", (int)484, (long)(0x3F3110DD8945BB6FL ^ l11))) return 0 != 0;
                return 1 != 0;
            }
            catch (n9 n98) {
                throw m44.a("h", (Object)n98, (long)-1515829813865896005L, (long)l11);
            }
        }
        catch (n9 n99) {
            throw m44.a("h", (Object)n99, (long)-1515829813865896005L, (long)l11);
        }
    }

    /*
     * Exception decompiling
     */
    public fh O(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    private hz D(int n10, v7[] v7Array, long l10, v7[] v7Array2, v7 v72, fb fb2, Set set) {
        v7[] v7Array3;
        v7[] v7Array4;
        long l11;
        block26: {
            Object object;
            fb fb3;
            block27: {
                int n11;
                block28: {
                    CallSite callSite;
                    block24: {
                        v7 v73;
                        block20: {
                            block21: {
                                block22: {
                                    long l12 = l10 = a ^ l10;
                                    l11 = l12 ^ 0x34096C901B75L;
                                    long l13 = l12 ^ 0x53906479B399L;
                                    n11 = this.u.n();
                                    v7Array4 = v7.I(n10 - 1, l13);
                                    System.arraycopy(v7Array, 0, v7Array4, 0, n10 - 1);
                                    int n12 = v7Array2.length;
                                    v7Array3 = v7.I(n12, l13);
                                    callSite = m44.a("k", (long)-2207452282058823039L, (long)l10);
                                    try {
                                        int n13;
                                        v7[] v7Array5;
                                        block23: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                System.arraycopy(v7Array2, 0, v7Array3, 0, n12);
                                                                v73 = v7Array3[n11];
                                                                if (callSite == false) break block20;
                                                                if (!v73.equals(v7.k)) break block21;
                                                            }
                                                            catch (n9 n92) {
                                                                throw m44.a("k", (Object)n92, (long)-423944730245023920L, (long)l10);
                                                            }
                                                            v7Array5 = v7Array3;
                                                            n13 = n11 - 1;
                                                            if (callSite == false) break block22;
                                                        }
                                                        catch (n9 n93) {
                                                            throw m44.a("k", (Object)n93, (long)-423944730245023920L, (long)l10);
                                                        }
                                                        if (l10 < 0L) break block22;
                                                        if (v7Array5[n13].equals(v7.c)) break block23;
                                                    }
                                                    catch (n9 n94) {
                                                        throw m44.a("k", (Object)n94, (long)-423944730245023920L, (long)l10);
                                                    }
                                                    v73 = v7Array3[n11 - 1];
                                                    if (callSite == false) break block20;
                                                }
                                                catch (n9 n95) {
                                                    throw m44.a("k", (Object)n95, (long)-423944730245023920L, (long)l10);
                                                }
                                                if (!v73.equals(v7.z)) break block21;
                                            }
                                            catch (n9 n96) {
                                                throw m44.a("k", (Object)n96, (long)-423944730245023920L, (long)l10);
                                            }
                                        }
                                        v7Array5 = v7Array3;
                                        n13 = n11 - 1;
                                    }
                                    catch (n9 n97) {
                                        throw m44.a("k", (Object)n97, (long)-423944730245023920L, (long)l10);
                                    }
                                }
                                v7Array5[n13] = v7.w;
                            }
                            v7Array3[n11] = v72;
                            v73 = v7Array3[n11 + 1];
                        }
                        v7 v74 = v73;
                        try {
                            block25: {
                                try {
                                    try {
                                        v7Array3[n11 + 1] = v7.k;
                                        if (l10 <= 0L || callSite == false) break block24;
                                        if (v74.equals(v7.c)) break block25;
                                    }
                                    catch (n9 n98) {
                                        throw m44.a("k", (Object)n98, (long)-423944730245023920L, (long)l10);
                                    }
                                    if (!v74.equals(v7.z)) break block26;
                                }
                                catch (n9 n99) {
                                    throw m44.a("k", (Object)n99, (long)-423944730245023920L, (long)l10);
                                }
                            }
                            v7Array3[n11 + 2] = v7.w;
                        }
                        catch (n9 n910) {
                            throw m44.a("k", (Object)n910, (long)-423944730245023920L, (long)l10);
                        }
                    }
                    try {
                        fb3 = fb2;
                        object = callSite;
                        if (l10 < 0L) break block27;
                        if (object == false) break block28;
                        if (fb3 == null) break block26;
                    }
                    catch (n9 n911) {
                        throw m44.a("k", (Object)n911, (long)-423944730245023920L, (long)l10);
                    }
                    fb3 = fb2;
                }
                object = n11 + 2;
            }
            fb3.set((int)object);
        }
        return new hz(v7Array4, v7Array3, l11, fb2, set);
    }

    @Override
    public int q() {
        return super.q();
    }

    /*
     * Exception decompiling
     */
    @Override
    public hz n(hz var1_1, boolean var2_2, char var3_3, int var4_4, boolean var5_5, loj var6_6, char var7_7, String var8_8) {
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

    /*
     * Exception decompiling
     */
    int Z(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 22[SWITCH]
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
    public final boolean S(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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
    private static fh v(int var0, long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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
    static {
        block11: {
            block10: {
                block12: {
                    ik.a = prr.a(-3821087168477283438L, -7672563363166468896L, MethodHandles.lookup().lookupClass()).a(204045837613006L);
                    var11 = ik.a ^ 110659391090964L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    break block12;
lbl13:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("\u0088\u00b4 \t+\u00f2\u00d6\u00d6\u00ea\u00df\u00ac6e\u0090\u00cb!.\u00ce\u00ab4E@B\u00ef\u008b_\u0010\u00c1\u00f7\u0010A\u00b7\u00c3\u00e0\u00913`8&B".getBytes("ISO-8859-1"));
                ** while (true)
                ik.c = ik.b(var15_3).intern();
                ik.g = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var11 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var11 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[111];
                var3_7 = 0;
                var4_8 = "S\u009e\u0013\u00b3CJ~\u00ab'A\u00cc\u00f4\u00bcd\u00d1\u0094\u0013N\u0081\u00f4\u00c4]\u008e%c<\u0082\u001b\u00d8\u008b\u00c5WD!\u00b83{\u00cf\u0092(e\u00d5A\u008c\u00043\"\u0080\u00d1\u00ba\u00fcX\u00a3L\u00b6\u00d1S,\\z\u00bc\u00c7\u00a4eG\t\u0012\u009el\u00d03\b\u0087\u00c3\u00e0<:U\u00e6QP\u00da\f\u00fc\u00b2F|\u00848\u00fb]f\u00fc\u0005Y\u0014\u008a@\u00b8`\u00b3C=`@\u00e3\\/y\u007f5\u0003\u008fa\u001f\u00f8\u008d\u00b1\u001f\u00ae\u008d\u00b5L\u00d5U\u009aD\u00f3\u00b5np\u00a0\u00b48\u0094\u0012\u00cf\u00f3J\u00f3\u00b5\u0014\u0081\u001bf(x\u00bf\u0083I\u00ef\u0092\u001f\u00e3\u0099(( [\u00f1F\u00ab\u008c\u0003\u0090\u00ef\u009f)\u00c2n\u00b5\u00e5\u00d2\u00a5\u00afv\u0000\u0005\u0088\u00dc*`$u\u00ad\u00a1\u00c9[\u00f0r\u00d6cJ\u00cc\u00be\u0098\u0091f\u0007\u0097\u008d\u0019\u00b0\u00c5\u0011*\u0005\u0002\u00c7\u00e0\u0090\u00bf:QN\u00a1\u0098X\u00b0\u001c\u00ebL\u00ea\u0083\u0082D\u000f\u009b\\\u00ff\u00ecy\u0001x\u00aa\u00ff\u001d\u00fa\u0001\u001cK\u00e1m\u0088|i*\u0003`'\u00bcvd( \u001b^Y@\u007fF\u00d3\u0082H\u00f8\u00b8EP\u0094\u0093\u0093i\u00ac\u00ab\u00c8\u00f1J\u009c\u0011\u00e0\u0005\u00e7\u0098 `\u00bd\u00f1\u00dbI<\u0003:\u001e\\\u00d5\u0018\u00ff\u00a4i\u00c8kc\u0083X\u000b\u00da\u00f8h\u00de\u0019\u00e2\u0095\u00d5>\u0082nv\u00e9\u00fb;H\u00c0\u0090\\\u00f008\u0082B\u0090LV\u0014\u00e4u\u0098S\u00e8\u00bd\u00fd\u00c3\u007f\u00036\u0095o\u009cF\u00bfj\u00f1B\u00d4t%\u00e4\u00ce\u00f8[t+\u00c5\u0088\u0006E\u0090h=\u00a3\u00da.#\u0003ztb\u00a8\u00b0@\u00ac\u009cO(2\u00c1\u00c3dy\u00eb!\u001e\u009e\u00f7_\u00b3Jv9\u00da\n\u00d7N\u0089\b\u00bcL!\u00d7\u00e9\u00d9Z\u00d9\u0080\u009e\u0093\u0086\u0095A\rSw\u0016 \u00c2\u00a5%\u00e2\u007f\u0001}\u00fb*\u001cx\u0080\u0013\u009c7V\u00a8\u00d4{o\u00a3\u0004\u0093\u00aa\u001c\u00b8\u00b4M\u001b\u009aH\u008f\u00d6\u00dex\u00b6\u00bf\u00b1\u0083\u00ce5\\\u009b\u00dc\u00c0,l\u00c1\u0094_-L\u00d5\u0004$\u00ac`zH\u001d\u0017\u00b2\u008eP\u00c7\u0003\u0015S\b+\u0081]\u0098&3t\u008a\u009b\u0086\u0018;\u00f23\u00ba|\u0087\u00868\u00e1\u0012\u00b0\u0013\u00be\u00ca\u00e6*\u0012\t\u00eb\u00e3\u008f}t\u0005)\u00cf\u00d2\u00db?t\u00b5\u00c27'\u0083\u00acS\u00a8\u00dc2w\u00d0\rvHVf\u0004\u00c4\u00f6\u00a9\u00b8g\u000b\u00fe\u00da[:\u00c8\u00ef0)\u00e5h\u0001\u00c08\u007fuQ\u00b3\u0098R\u00d4\u00f6\u00f2-\u00af\u0086\u00d4j\u00b1Z$\u00ee2>S\u00ac\u00ccG\u00f1j\u00a1\u00ba\u00b1}\u00e4\u00c8\u001d\u009e\u00ff\u0096\u008f\u0088\u00b2\u0094K\u00c3}\u00ed\u00a95a\u001b\u00b6\u00f3y|\u00c7\u0001\u00b9\u00adk\u0089\u0084\u0088w\u00df\u00f29A!\u00fa\u00e2\u0097G\u0013\u00ed\u00f0k\u00cdE\u00bc\u0015\u00baF\u001dp\u00b8\u00bf\ni{\u00bf\u00b7\u00e6.\u0014Q\u0015J\u0081&\u00fe!?.A)\u00ab\u008bz\n<\u00c5G\u0014\u00b8\u00b2\u0084\u00e0H\u00d9c\u0081L\u008b\u00f7,4\u0003\u00a8\u008d\u00f7\u000e&\u000bJ\u00fb|\u00c2hX\u00e9\u0004\u00f5gLr\u001f\u0012\u00d2\u00c5_?H+\u00de\r'\u008f\r\u0016\u001d|`\b\fh\u009c\u00d2!|d(\u00d4ji\u000e\u00c5\u00b1\u009e\u009a\u00ec\u00b4Q\u0092\u0083\u00b8\u0000gm\u00fbe\u009b\u00afw;\f)\u00841\u00e1je\u0003\u00bbK8_\u0091\t\u00ac\u0092\u009b\u00e4W\u00dd\u00f4k\u009aA=<\u00dcC\u00acn\u0005\u001ce\u00fcJ}\u001a\u0096^\u0084\u0002\u0087_\u00b1\u00a6\u00b1\u009f-LfJ\u00da\u00ed6\u00d6\u00fe<\u0012\u00e2A\u008c\u009a{\u00d6\u00c7\u0085o\u0081\u00c0\u00f9E\u00f9\u00ce\u00d2\u0012AtE6\u008aM\u0004X\u00f4\u00ea\u00ddL\u001fs\u00b2\u00f6lY\u0019\u00ea\u00aeh\u00bbb\u0018\u008e\u00dcd\u0098\u00dc\u00ba\u00f8\u00c09\u00a4";
                var5_9 = "S\u009e\u0013\u00b3CJ~\u00ab'A\u00cc\u00f4\u00bcd\u00d1\u0094\u0013N\u0081\u00f4\u00c4]\u008e%c<\u0082\u001b\u00d8\u008b\u00c5WD!\u00b83{\u00cf\u0092(e\u00d5A\u008c\u00043\"\u0080\u00d1\u00ba\u00fcX\u00a3L\u00b6\u00d1S,\\z\u00bc\u00c7\u00a4eG\t\u0012\u009el\u00d03\b\u0087\u00c3\u00e0<:U\u00e6QP\u00da\f\u00fc\u00b2F|\u00848\u00fb]f\u00fc\u0005Y\u0014\u008a@\u00b8`\u00b3C=`@\u00e3\\/y\u007f5\u0003\u008fa\u001f\u00f8\u008d\u00b1\u001f\u00ae\u008d\u00b5L\u00d5U\u009aD\u00f3\u00b5np\u00a0\u00b48\u0094\u0012\u00cf\u00f3J\u00f3\u00b5\u0014\u0081\u001bf(x\u00bf\u0083I\u00ef\u0092\u001f\u00e3\u0099(( [\u00f1F\u00ab\u008c\u0003\u0090\u00ef\u009f)\u00c2n\u00b5\u00e5\u00d2\u00a5\u00afv\u0000\u0005\u0088\u00dc*`$u\u00ad\u00a1\u00c9[\u00f0r\u00d6cJ\u00cc\u00be\u0098\u0091f\u0007\u0097\u008d\u0019\u00b0\u00c5\u0011*\u0005\u0002\u00c7\u00e0\u0090\u00bf:QN\u00a1\u0098X\u00b0\u001c\u00ebL\u00ea\u0083\u0082D\u000f\u009b\\\u00ff\u00ecy\u0001x\u00aa\u00ff\u001d\u00fa\u0001\u001cK\u00e1m\u0088|i*\u0003`'\u00bcvd( \u001b^Y@\u007fF\u00d3\u0082H\u00f8\u00b8EP\u0094\u0093\u0093i\u00ac\u00ab\u00c8\u00f1J\u009c\u0011\u00e0\u0005\u00e7\u0098 `\u00bd\u00f1\u00dbI<\u0003:\u001e\\\u00d5\u0018\u00ff\u00a4i\u00c8kc\u0083X\u000b\u00da\u00f8h\u00de\u0019\u00e2\u0095\u00d5>\u0082nv\u00e9\u00fb;H\u00c0\u0090\\\u00f008\u0082B\u0090LV\u0014\u00e4u\u0098S\u00e8\u00bd\u00fd\u00c3\u007f\u00036\u0095o\u009cF\u00bfj\u00f1B\u00d4t%\u00e4\u00ce\u00f8[t+\u00c5\u0088\u0006E\u0090h=\u00a3\u00da.#\u0003ztb\u00a8\u00b0@\u00ac\u009cO(2\u00c1\u00c3dy\u00eb!\u001e\u009e\u00f7_\u00b3Jv9\u00da\n\u00d7N\u0089\b\u00bcL!\u00d7\u00e9\u00d9Z\u00d9\u0080\u009e\u0093\u0086\u0095A\rSw\u0016 \u00c2\u00a5%\u00e2\u007f\u0001}\u00fb*\u001cx\u0080\u0013\u009c7V\u00a8\u00d4{o\u00a3\u0004\u0093\u00aa\u001c\u00b8\u00b4M\u001b\u009aH\u008f\u00d6\u00dex\u00b6\u00bf\u00b1\u0083\u00ce5\\\u009b\u00dc\u00c0,l\u00c1\u0094_-L\u00d5\u0004$\u00ac`zH\u001d\u0017\u00b2\u008eP\u00c7\u0003\u0015S\b+\u0081]\u0098&3t\u008a\u009b\u0086\u0018;\u00f23\u00ba|\u0087\u00868\u00e1\u0012\u00b0\u0013\u00be\u00ca\u00e6*\u0012\t\u00eb\u00e3\u008f}t\u0005)\u00cf\u00d2\u00db?t\u00b5\u00c27'\u0083\u00acS\u00a8\u00dc2w\u00d0\rvHVf\u0004\u00c4\u00f6\u00a9\u00b8g\u000b\u00fe\u00da[:\u00c8\u00ef0)\u00e5h\u0001\u00c08\u007fuQ\u00b3\u0098R\u00d4\u00f6\u00f2-\u00af\u0086\u00d4j\u00b1Z$\u00ee2>S\u00ac\u00ccG\u00f1j\u00a1\u00ba\u00b1}\u00e4\u00c8\u001d\u009e\u00ff\u0096\u008f\u0088\u00b2\u0094K\u00c3}\u00ed\u00a95a\u001b\u00b6\u00f3y|\u00c7\u0001\u00b9\u00adk\u0089\u0084\u0088w\u00df\u00f29A!\u00fa\u00e2\u0097G\u0013\u00ed\u00f0k\u00cdE\u00bc\u0015\u00baF\u001dp\u00b8\u00bf\ni{\u00bf\u00b7\u00e6.\u0014Q\u0015J\u0081&\u00fe!?.A)\u00ab\u008bz\n<\u00c5G\u0014\u00b8\u00b2\u0084\u00e0H\u00d9c\u0081L\u008b\u00f7,4\u0003\u00a8\u008d\u00f7\u000e&\u000bJ\u00fb|\u00c2hX\u00e9\u0004\u00f5gLr\u001f\u0012\u00d2\u00c5_?H+\u00de\r'\u008f\r\u0016\u001d|`\b\fh\u009c\u00d2!|d(\u00d4ji\u000e\u00c5\u00b1\u009e\u009a\u00ec\u00b4Q\u0092\u0083\u00b8\u0000gm\u00fbe\u009b\u00afw;\f)\u00841\u00e1je\u0003\u00bbK8_\u0091\t\u00ac\u0092\u009b\u00e4W\u00dd\u00f4k\u009aA=<\u00dcC\u00acn\u0005\u001ce\u00fcJ}\u001a\u0096^\u0084\u0002\u0087_\u00b1\u00a6\u00b1\u009f-LfJ\u00da\u00ed6\u00d6\u00fe<\u0012\u00e2A\u008c\u009a{\u00d6\u00c7\u0085o\u0081\u00c0\u00f9E\u00f9\u00ce\u00d2\u0012AtE6\u008aM\u0004X\u00f4\u00ea\u00ddL\u001fs\u00b2\u00f6lY\u0019\u00ea\u00aeh\u00bbb\u0018\u008e\u00dcd\u0098\u00dc\u00ba\u00f8\u00c09\u00a4".length();
                var2_10 = 0;
                while (true) {
                    var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                    v6 = var6_6;
                    v7 = var3_7++;
                    v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "\u00fc(\u0080\u0080Q\u00cb\u00bb\u0006\u001c\u00c8@\u00c7\u0003&D\u00c8";
                    var5_9 = "\u00fc(\u0080\u0080Q\u00cb\u00bb\u0006\u001c\u00c8@\u00c7\u0003&D\u00c8".length();
                    var2_10 = 0;
                    while (true) {
                        var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                        v6 = var6_6;
                        v7 = var3_7++;
                        v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl57:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    break block11;
                    break;
                }
            }
            var8_12 = v8;
            var10_13 = var0_4.doFinal(new byte[]{(byte)(var8_12 >>> 56), (byte)(var8_12 >>> 48), (byte)(var8_12 >>> 40), (byte)(var8_12 >>> 32), (byte)(var8_12 >>> 24), (byte)(var8_12 >>> 16), (byte)(var8_12 >>> 8), (byte)var8_12});
            v10 = ((long)var10_13[0] & 255L) << 56 | ((long)var10_13[1] & 255L) << 48 | ((long)var10_13[2] & 255L) << 40 | ((long)var10_13[3] & 255L) << 32 | ((long)var10_13[4] & 255L) << 24 | ((long)var10_13[5] & 255L) << 16 | ((long)var10_13[6] & 255L) << 8 | (long)var10_13[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl70:
                // 1 sources

                ** continue;
            }
        }
        ik.d = var6_6;
        ik.e = new Integer[111];
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4231;
        if (e[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ik", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ik.e[n11] = n12;
        }
        return e[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ik.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ik" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ik.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

