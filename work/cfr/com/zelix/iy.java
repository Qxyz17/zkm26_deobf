/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.df;
import com.zelix.el;
import com.zelix.h1;
import com.zelix.hz;
import com.zelix.ip;
import com.zelix.iq;
import com.zelix.it;
import com.zelix.l6q;
import com.zelix.lby;
import com.zelix.lk0;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.m7;
import com.zelix.n9;
import com.zelix.nc;
import com.zelix.o9;
import com.zelix.oz;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class iy
extends oz
implements el {
    iq K;
    int i;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map k;

    @Override
    public boolean L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x5A3633FF4E9CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("r", (Object)this, (Object)objectArray2, (long)8517452385825519903L, (long)l10);
    }

    @Override
    public String R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3A32AF8F9793L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 56);
        int n12 = (int)(l11 << 40 >>> 40);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n12;
        objectArray2[1] = (int)((byte)n11);
        objectArray2[0] = n10;
        return m44.a("w", (Object)this, (Object)objectArray2, (long)2829288529623150650L, (long)l10);
    }

    @Override
    public boolean d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
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

    @Override
    public final void X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l11 = l10 ^ 0x6F3E14B71D18L;
        long l12 = l11 >>> 16;
        int n10 = (int)(l11 << 48 >>> 48);
        df2.L(l12, (char)n10, this.K, this);
    }

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3926A82327E7L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 56);
        int n12 = (int)(l11 << 40 >>> 40);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n12;
        objectArray2[1] = (int)((byte)n11);
        objectArray2[0] = n10;
        return m44.a("s", (Object)this, (Object)objectArray2, (long)-7550383759637692338L, (long)l10);
    }

    int J() {
        return this.K.B() - this.i;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean S(Object[] var1_1) {
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

    int a(Object[] objectArray) {
        h1 h12 = (h1)objectArray[0];
        long l10 = (Long)objectArray[1];
        CallSite callSite = m44.a("t", (Object)h12, (long)210846341583948441L, (long)l10);
        return this.i + callSite;
    }

    public iq D() {
        return this.K;
    }

    @Override
    public List N(long l10) {
        block8: {
            long l11;
            long l12;
            block7: {
                CallSite callSite;
                int n10;
                block6: {
                    long l13 = l10;
                    l12 = l13 ^ 0x451E376B170AL;
                    l11 = l13 ^ 0x5C1F3AB2B872L;
                    int n11 = this.J();
                    CallSite callSite2 = m44.a("k", (long)-4988472562570415370L, (long)l10);
                    try {
                        try {
                            n10 = n11;
                            callSite = iy.c("m", (int)29181, (long)(0xB0771DBDDF3E248L ^ l10));
                            if (callSite2 != false) break block6;
                            if (n10 < callSite) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)-4692068789427319768L, (long)l10);
                        }
                        n10 = n11;
                        callSite = iy.c("m", (int)7764, (long)(0x7634622FE6498DE2L ^ l10));
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)-4692068789427319768L, (long)l10);
                    }
                }
                if (n10 <= callSite) break block8;
            }
            ArrayList<oz> arrayList = new ArrayList<oz>(5);
            iq iq2 = this.K;
            iq iq3 = new iq(true, 1, l11);
            iq iq4 = new iq(true, 1, l11);
            m44.a("t", (Object)this, (Object)new Object[]{iq3}, (long)-6855092278335146480L, (long)l10);
            arrayList.add(this);
            arrayList.add(new ip(l12, iq4));
            arrayList.add(iq3);
            arrayList.add(new it((int)iy.c("m", (int)12278, (long)(0x5F809E1742B6BC42L ^ l10)), iq2));
            arrayList.add(iq4);
            return arrayList;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public hz n(hz var1_1, boolean var2_2, char var3_3, int var4_4, boolean var5_5, loj var6_6, char var7_7, String var8_8) {
        block9: {
            v0 = var9_9 = (long)var3_3 << 48 | (long)var4_4 << 32 >>> 16 | (long)var7_7 << 48 >>> 48;
            var11_10 = v0 ^ 6215624408093L;
            var13_11 = v0 ^ 114161761794490L;
            var15_12 = v0 ^ 332116234582L;
            v1 = v0 ^ 65811635556040L;
            var17_13 = v1 >>> 8;
            var19_14 = (int)(v1 << 56 >>> 56);
            var20_15 = v0 ^ 129763427281871L;
            var23_16 = new lby(var17_13, var8_8, (byte)var19_14);
            var22_17 = m44.a("l", (long)-2575428984604371855L, (long)var9_9);
            var24_18 = var1_1.X();
            var25_19 = var1_1.T();
            var26_20 = null;
            var27_21 = var24_18.length;
            var28_22 = var1_1.j();
            var29_23 = var1_1.k(var11_10);
            try {
                v2 = this.X;
                if (var22_17 != false) break block9;
            }
            catch (n9 v3) {
                throw m44.a("l", (Object)v3, (long)-2853819735775073617L, (long)var9_9);
            }
            {
                ** switch (v2)
            }
lbl-1000:
            // 1 sources

            {
                case 153: 
                case 154: 
                case 155: 
                case 156: 
                case 157: 
                case 158: {
                    var26_20 = v7.I(var27_21 - 1, var15_12);
                    System.arraycopy(var24_18, 0, var26_20, 0, var27_21 - 1);
                    return new hz(var26_20, var25_19, var13_11, var28_22, var29_23);
                }
lbl30:
                // 1 sources

                case 159: 
                case 160: 
                case 161: 
                case 162: 
                case 163: 
                case 164: {
                    var26_20 = v7.I(var27_21 - 2, var15_12);
                    System.arraycopy(var24_18, 0, var26_20, 0, var27_21 - 2);
                    return new hz(var26_20, var25_19, var13_11, var28_22, var29_23);
                }
lbl34:
                // 1 sources

                case 165: 
                case 166: {
                    var26_20 = v7.I(var27_21 - 2, var15_12);
                    System.arraycopy(var24_18, 0, var26_20, 0, var27_21 - 2);
                    return new hz(var26_20, var25_19, var13_11, var28_22, var29_23);
                }
lbl38:
                // 1 sources

                case 198: 
                case 199: {
                    var26_20 = v7.I(var27_21 - 1, var15_12);
                    System.arraycopy(var24_18, 0, var26_20, 0, var27_21 - 1);
                    return new hz(var26_20, var25_19, var13_11, var28_22, var29_23);
                }
lbl42:
                // 1 sources

                case 167: 
                case 168: 
                case 200: 
                case 201: {
                    return null;
                }
            }
lbl44:
            // 1 sources

            v2 = false;
        }
        lk0.t(v2, new String[]{(String)iy.b("h", (int)24073, (long)(4733736193005495322L ^ var9_9)) + this.X + " " + var23_16}, var20_15);
        return null;
    }

    @Override
    public void P(long l10, int n10) {
        this.i = n10;
    }

    @Override
    public void h(Object[] objectArray) {
        block4: {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            PrintWriter printWriter;
            block5: {
                long l10 = (Long)objectArray[0];
                printWriter = (PrintWriter)objectArray[1];
                stringBuilder2 = (StringBuilder)objectArray[2];
                long l11 = l10;
                long l12 = l11 ^ 0x5D3C6484BBF6L;
                long l13 = l11 ^ 0x7B7D8DE1E476L;
                long l14 = l11 ^ 0x8A9056647FBL;
                int n10 = (int)(l14 >>> 32);
                int n11 = (int)(l14 << 32 >>> 56);
                int n12 = (int)(l14 << 40 >>> 40);
                long l15 = l11 ^ 0x1958DC7C99DL;
                stringBuilder = new StringBuilder((int)iy.c("m", (int)20222, (long)(0x199CCE3279E817AAL ^ l10)));
                CallSite callSite = m44.a("h", (long)-1142121718372861931L, (long)l10);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = n12;
                objectArray2[1] = (int)((byte)n11);
                objectArray2[0] = n10;
                CallSite callSite2 = m44.a("w", (Object)this, (Object)objectArray2, (long)-636251684499120046L, (long)l10);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l15;
                stringBuilder.append((String)((Object)callSite2) + " " + (String)((Object)m44.a("w", (Object)this.K, (Object)objectArray3, (long)-839484870266077503L, (long)l10)));
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = this.X;
                objectArray4[0] = l13;
                CallSite callSite3 = m44.a("h", (Object)objectArray4, (long)-1509257710096725591L, (long)l10);
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l15;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = m44.a("w", (Object)this.K, (Object)objectArray5, (long)-839484870266077503L, (long)l10);
                objectArray6[1] = callSite3;
                objectArray6[0] = l12;
                callSite3 = m44.a("h", (Object)objectArray6, (long)-1214410100789358428L, (long)l10);
                try {
                    try {
                        if (callSite != false) break block4;
                        if (((String)((Object)callSite3)).length() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-864320932499847477L, (long)l10);
                    }
                    stringBuilder.append("\t" + (String)((Object)callSite3));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-864320932499847477L, (long)l10);
                }
            }
            printWriter.println(stringBuilder2.toString() + stringBuilder2.toString() + stringBuilder);
        }
    }

    @Override
    public final void Q(Map map, l6q l6q2, List list, long l10) {
        nc nc2;
        long l11;
        block3: {
            nc nc3;
            block2: {
                l11 = l10 ^ 0x3CAB7583A160L;
                nc2 = null;
                CallSite callSite = m44.a("o", (long)-3097945099772748067L, (long)l10);
                nc3 = nc2 = (nc)map.get(this.K);
                try {
                    if (callSite == false) break block2;
                    if (nc3 != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)-3533620025567822788L, (long)l10);
                }
                nc2 = new nc();
                nc3 = map.put(this.K, nc2);
            }
            nc nc4 = nc3;
            list.add(nc2);
        }
        l6q2.t(this, nc2, l11);
    }

    iy(int n10, h1 h12, long l10, int n11, l6q l6q2) {
        block4: {
            CallSite callSite;
            long l11;
            long l12;
            block5: {
                long l13 = l10 = a ^ l10;
                l12 = l13 ^ 0x2908911679F2L;
                long l14 = l13 ^ 0x694719DF4323L;
                l11 = l13 ^ 0x50261D6733CFL;
                super(n10);
                this.i = n11;
                CallSite callSite2 = m44.a("h", (long)6376654156882497613L, (long)l10);
                Object[] objectArray = new Object[2];
                objectArray[1] = l14;
                objectArray[0] = h12;
                callSite = m44.a("w", (Object)this, (Object)objectArray, (long)6502084416023804705L, (long)l10);
                try {
                    try {
                        if (callSite2 != false) break block4;
                        if (callSite >= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)6654459611106913939L, (long)l10);
                    }
                    throw new n9((String)((Object)iy.b("h", (int)15179, (long)(0x28E9E067A67CC563L ^ l10))) + n10 + (String)((Object)iy.b("h", (int)16962, (long)(0x3B0DC6FCB16A3C68L ^ l10))) + n11 + (String)((Object)iy.b("h", (int)32256, (long)(0x27F86B81F038802BL ^ l10))) + this.i + (String)((Object)iy.b("h", (int)32256, (long)(0x27F86B81F038802BL ^ l10))) + (int)callSite);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)6654459611106913939L, (long)l10);
                }
            }
            l6q2.t(((o9)((Object)m44.a("l", (long)4700524028773557063L, (long)l10))).e(l12, (int)callSite), this, l11);
        }
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 3;
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

    @Override
    public final boolean T(long l10) {
        return false;
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public void d(Integer n10, iq iq2, long l10) {
        long l11 = l10 ^ 0x66C9424EC537L;
        this.K = iq2;
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = true;
        m44.a("q", (Object)iq2, (Object)objectArray, (long)4953808353644756951L, (long)l10);
    }

    @Override
    public m7 i(long l10) {
        return m44.a("k", (long)-5891862527333598110L, (long)l10);
    }

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
        long l10;
        long l11 = l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l12 = l11 ^ 0x6989D73BAA9EL;
        long l13 = l11 ^ 0L;
        int n12 = (int)(l13 >>> 48);
        int n13 = (int)(l13 << 16 >>> 32);
        int n14 = (int)(l13 << 48 >>> 48);
        super.G((short)n12, n13, dataOutputStream, n14);
        this.U(dataOutputStream, l12);
    }

    void s(Object[] objectArray) {
        iq iq2 = (iq)objectArray[0];
        this.K = iq2;
    }

    public iy(int n10, iq iq2) {
        super(n10);
        this.i = -1;
        this.K = iq2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final boolean b(Object[] var1_1) {
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

    void U(DataOutputStream dataOutputStream, long l10) {
        dataOutputStream.writeShort(this.J());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        iy.a = prr.a(8136639647824093432L, -3087924575379772145L, MethodHandles.lookup().lookupClass()).a(87177218596174L);
                        iy.e = new HashMap<K, V>(13);
                        var11 = iy.a ^ 38949778012730L;
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
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "TD\u0006\u00dd\u0000\u0094\u00ee\u00bel/P'0d\u0088\u0012\u0010-\u00ec\u0003\u00c4A{9\u0097\u00b5t\u000b4\u00e3\u0002\u001dR\u0018\u00de\u00e3vR\u00a7U^\u00c7s'\u00d7\u007f\u00e4ySD#\u00cd_\u001c\u00cf\u0084\u00de,";
                        var19_6 = "TD\u0006\u00dd\u0000\u0094\u00ee\u00bel/P'0d\u0088\u0012\u0010-\u00ec\u0003\u00c4A{9\u0097\u00b5t\u000b4\u00e3\u0002\u001dR\u0018\u00de\u00e3vR\u00a7U^\u00c7s'\u00d7\u007f\u00e4ySD#\u00cd_\u001c\u00cf\u0084\u00de,".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = iy.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00a5\u001d\u001e\u008f\u00e3W\u00a75>\u00d4k=\u00c7\u00c3Z\u0085o5\u00d5\u00d8L\u00d60k\u00c5\u00e6\u00dak\u00ef\u00efl\u0093\u0018\u0095\"\u0003y\u00b7\u0006i\u00a6y^\u00a3\u00fa\u00b9hS1S\u00c5\u0098\u00eaH\u0095\u00c4\u00d0";
                            var19_6 = "\u00a5\u001d\u001e\u008f\u00e3W\u00a75>\u00d4k=\u00c7\u00c3Z\u0085o5\u00d5\u00d8L\u00d60k\u00c5\u00e6\u00dak\u00ef\u00efl\u0093\u0018\u0095\"\u0003y\u00b7\u0006i\u00a6y^\u00a3\u00fa\u00b9hS1S\u00c5\u0098\u00eaH\u0095\u00c4\u00d0".length();
                            var16_7 = 32;
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
                            var20_3[var18_4++] = iy.b(var21_9).intern();
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
                iy.c = var20_3;
                iy.d = new String[5];
                iy.k = new HashMap<K, V>(13);
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
                var4_14 = "\u00af\u0014\u00d9y\u00ba\u00fb\u0016\u00bc\u008e\u00a3\u008e\u00f5\u0095\u00b2w\u001b";
                var5_15 = "\u00af\u0014\u00d9y\u00ba\u00fb\u0016\u00bc\u008e\u00a3\u008e\u00f5\u0095\u00b2w\u001b".length();
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
                    var4_14 = "\u00d2\u00ea \u0006\u00e1\u00ccq\u00f8\u00ce\u00d2X\u00f5\u00b9\u00ad\u00a4\u0091";
                    var5_15 = "\u00d2\u00ea \u0006\u00e1\u00ccq\u00f8\u00ce\u00d2X\u00f5\u00b9\u00ad\u00a4\u0091".length();
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
        iy.g = var6_12;
        iy.h = new Integer[4];
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x30EC;
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
                throw new RuntimeException("com/zelix/iy", exception);
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
            iy.d[n11] = iy.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = iy.b(n10, l10);
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
            throw new RuntimeException("com/zelix/iy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3FC8;
        if (h[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = g[n11];
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
                throw new RuntimeException("com/zelix/iy", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iy.h[n11] = n12;
        }
        return h[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = iy.c(n10, l10);
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
            throw new RuntimeException("com/zelix/iy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(iy.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(iy.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

