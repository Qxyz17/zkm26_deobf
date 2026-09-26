/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.kw;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.l6x;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.ni;
import com.zelix.nn;
import com.zelix.os;
import com.zelix.prr;
import com.zelix.x8;
import com.zelix.yq;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
public class bk
extends kw
implements ni {
    private x8 d;
    private static char[] w;
    private static char[] y;
    private static char[] j;
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;
    private static final long[] i;
    private static final Integer[] k;
    private static final Map l;

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        block8: {
            bk bk2;
            long l11;
            block6: {
                l11 = l10 ^ 0L;
                CallSite callSite = m44.a("n", (long)-5231047857311529425L, (long)l10);
                try {
                    block7: {
                        try {
                            try {
                                bk2 = this;
                                if (callSite == false) break block6;
                                if (m44.a("p", (Object)bk2, (long)-5658949933422410088L, (long)l10) != x82) break block7;
                            }
                            catch (nn nn2) {
                                throw m44.a("n", (Object)nn2, (long)-6233123289339872530L, (long)l10);
                            }
                            m44.a("r", (Object)this, (x8)x83, (long)-5658949933422410088L, (long)l10);
                            if (callSite != false) break block8;
                        }
                        catch (nn nn3) {
                            throw m44.a("n", (Object)nn3, (long)-6233123289339872530L, (long)l10);
                        }
                    }
                    bk2 = this;
                }
                catch (nn nn4) {
                    throw m44.a("n", (Object)nn4, (long)-6233123289339872530L, (long)l10);
                }
            }
            super.q(x82, l11, x83);
        }
    }

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0x66FDF08525FDL;
        long l13 = l11 ^ 0x6DE1DADD9981L;
        gu2.K(this.b, this, l12, this.H());
        ((x8)((Object)m44.a("v", (Object)this, (long)6030707635709863006L, (long)l10))).e(l13, gu2, this, this.H());
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected final void N(Object[] var1_1) {
        block9: {
            block8: {
                var6_2 = (DataOutputStream)var1_1[0];
                var4_3 = (Map)var1_1[1];
                var2_4 = (Long)var1_1[2];
                var5_5 = (lqu)var1_1[3];
                var7_6 = var2_4 ^ 0L;
                v0 = new Object[4];
                v0[3] = var5_5;
                v0[2] = var7_6;
                v0[1] = var4_3;
                v0[0] = var6_2;
                super.N(v0);
                var10_7 = (x8)var4_3.get(m44.a("u", (Object)this, (long)1243640725144577709L, (long)var2_4));
                var9_8 = m44.a("k", (long)1680553024964027930L, (long)var2_4);
                try {
                    try {
                        if (var9_8 == false) break block8;
                        if (var10_7 != null) {
                        }
                        ** GOTO lbl32
                    }
                    catch (nn v1) {
                        throw m44.a("k", (Object)v1, (long)669467094617561819L, (long)var2_4);
                    }
                    var6_2.writeShort(var10_7.E());
                }
                catch (nn v2) {
                    throw m44.a("k", (Object)v2, (long)669467094617561819L, (long)var2_4);
                }
            }
            try {
                if (var2_4 <= 0L || var9_8 != false) break block9;
lbl32:
                // 2 sources

                var6_2.writeShort(m44.a("u", (Object)this, (long)1243640725144577709L, (long)var2_4).E());
            }
            catch (nn v3) {
                throw m44.a("k", (Object)v3, (long)669467094617561819L, (long)var2_4);
            }
        }
    }

    bk(char c10, _4 _42, int n10, String string, int n11, h1 h12, char c11, l6q l6q2) {
        long l10;
        long l11 = l10 = ((long)c10 << 48 | (long)n11 << 32 >>> 16 | (long)c11 << 48 >>> 48) ^ a;
        long l12 = l11 ^ 0x777546760B50L;
        long l13 = l11 ^ 0x65EA10B2469AL;
        long l14 = l11 ^ 0x291358F12A1EL;
        long l15 = l11 ^ 0x4945F2B34F59L;
        super(_42, n10, string, l13, h12, l6q2);
        int n12 = h12.readUnsignedShort();
        js js2 = this.m(l14, n12);
        Object[] objectArray = new Object[2];
        objectArray[1] = js2;
        objectArray[0] = l12;
        m44.a("q", (Object)this, (Object)objectArray, (long)2580038523733485302L, (long)l10);
        l6q2.t(m44.a("p", (Object)this, (long)2837122917686808752L, (long)l10), this, l15);
    }

    /*
     * Exception decompiling
     */
    public static os q(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [39[DOLOOP]], but top level block is 49[SIMPLE_IF_TAKEN]
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

    private static void n(Object[] objectArray) {
        block7: {
            os os2 = (os)objectArray[0];
            yq yq2 = (yq)objectArray[1];
            l6x l6x2 = (l6x)objectArray[2];
            long l10 = (Long)objectArray[3];
            ArrayList arrayList = (ArrayList)objectArray[4];
            Iterator iterator = (Iterator)objectArray[5];
            String string = (String)objectArray[6];
            l10 = a ^ l10;
            yq yq3 = (yq)arrayList.get(0);
            yq yq4 = (yq)arrayList.get(arrayList.size() - 1);
            int n10 = 0;
            CallSite callSite = m44.a("k", (long)-481094910429525990L, (long)l10);
            while (n10 < arrayList.size() - 1) {
                CallSite callSite2;
                block8: {
                    block9: {
                        block10: {
                            yq yq5 = (yq)arrayList.get(n10);
                            try {
                                try {
                                    iterator.remove();
                                    callSite2 = callSite;
                                    if (l10 >= 0L) {
                                        if (callSite2 == false) break block7;
                                        callSite2 = callSite;
                                    }
                                    if (l10 <= 0L) break block8;
                                    if (callSite2 == false) break block9;
                                }
                                catch (nn nn2) {
                                    throw m44.a("k", (Object)nn2, (long)-1780570644906773285L, (long)l10);
                                }
                                if (n10 >= arrayList.size() - 2) break block10;
                            }
                            catch (nn nn3) {
                                throw m44.a("k", (Object)nn3, (long)-1780570644906773285L, (long)l10);
                            }
                            l6x2 = (l6x)iterator.next();
                            yq2 = (yq)l6x2.W();
                        }
                        ++n10;
                    }
                    callSite2 = callSite;
                }
                if (callSite2 != false) continue;
            }
            m44.a("t", (Object)yq4, (Object)new Object[]{m44.a("t", (Object)yq3, (Object)new Object[0], (long)-126211777497961803L, (long)l10)}, (long)-2212615277226974172L, (long)l10);
            m44.a("t", (Object)yq4, (Object)new Object[]{string}, (long)-1955628010973499299L, (long)l10);
            m44.a("t", (Object)yq4, (Object)new Object[]{false}, (long)-524347638064300397L, (long)l10);
            if (l10 > 0L) {
                // empty if block
            }
        }
    }

    void C(Object[] objectArray) {
        block4: {
            js js2;
            long l10;
            block5: {
                l10 = (Long)objectArray[0];
                js2 = (js)objectArray[1];
                long l11 = (l10 = a ^ l10) ^ 0x379BD0DBAAA5L;
                CallSite callSite = m44.a("k", (long)6760629518453246261L, (long)l10);
                try {
                    try {
                        if (callSite != false) break block4;
                        if (js2 instanceof x8) break block5;
                    }
                    catch (nn nn2) {
                        throw m44.a("k", (Object)nn2, (long)6598352012175951875L, (long)l10);
                    }
                    throw new aw(this.h(l11) + (String)((Object)bk.b("b", (int)207, (long)(0x7A1D063839E3CD56L ^ l10))) + (String)((Object)bk.b("b", (int)24943, (long)(0x15906E97FA28ACF7L ^ l10))));
                }
                catch (nn nn3) {
                    throw m44.a("k", (Object)nn3, (long)6598352012175951875L, (long)l10);
                }
            }
            m44.a("w", (Object)this, (x8)((x8)js2), (long)4871256876772684917L, (long)l10);
        }
    }

    @Override
    public void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        HashMap hashMap2 = (HashMap)objectArray[4];
        long l11 = l10 ^ 0x52829C02B53DL;
        String string = ((x8)((Object)m44.a("p", (Object)this, (long)7806749704917998520L, (long)l10))).V();
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = this;
        objectArray2[4] = hashMap2;
        objectArray2[3] = n11;
        objectArray2[2] = n10;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        CallSite callSite = m44.a("n", (Object)objectArray2, (long)8217991632382811888L, (long)l10);
        try {
            if (!string.equals(callSite)) {
                ((x8)((Object)m44.a("p", (Object)this, (long)7806749704917998520L, (long)l10))).A((String)((Object)callSite));
            }
        }
        catch (nn nn2) {
            throw m44.a("n", (Object)nn2, (long)8385426660497319886L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    public static String W(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [58[DOLOOP]], but top level block is 69[SIMPLE_IF_TAKEN]
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
    protected final void c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[1];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = dataOutputStream;
        objectArray2[0] = l11;
        super.c(objectArray2);
        dataOutputStream.writeShort(((js)((Object)m44.a("w", (Object)this, (long)1144042316719503375L, (long)l10))).E());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void S(Object[] objectArray) {
        block22: {
            CallSite callSite;
            CallSite callSite2;
            long l10;
            long l11;
            long l12;
            long l13;
            Set set;
            block21: {
                set = (Set)objectArray[0];
                l13 = (Long)objectArray[1];
                long l14 = l13 = a ^ l13;
                l12 = l14 ^ 0x5CE127E50618L;
                l11 = l14 ^ 0x38A1230A80DEL;
                l10 = l14 ^ 0x30879B284EB4L;
                long l15 = l14 ^ 0x2DEC03452434L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l15;
                CallSite callSite3 = m44.a("i", (Object)this, (Object)objectArray2, (long)-1603123371080366523L, (long)l13);
                callSite2 = m44.a("h", (long)-1620771892076963639L, (long)l13);
                try {
                    callSite = callSite3;
                    if (callSite2 == false) break block21;
                    if (callSite == null) break block22;
                }
                catch (nn nn2) {
                    throw m44.a("h", (Object)nn2, (long)-605392915491003384L, (long)l13);
                }
                callSite = callSite3;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l12;
            CallSite callSite4 = m44.a("w", (Object)callSite, (Object)objectArray3, (long)-1159681530756426011L, (long)l13);
            block10: while (callSite4.hasMoreElements()) {
                block26: {
                    String string;
                    Comparable<StringBuffer> comparable;
                    block25: {
                        String string2;
                        block23: {
                            yq yq2;
                            block24: {
                                boolean bl2;
                                string2 = null;
                                yq yq3 = (yq)callSite4.nextElement();
                                try {
                                    bl2 = yq3.g(l11);
                                }
                                catch (nn nn3) {
                                    throw m44.a("h", (Object)nn3, (long)-605392915491003384L, (long)l13);
                                }
                                block11: while (callSite2 != false) {
                                    if (bl2) {
                                        comparable = new StringBuffer();
                                        ((StringBuffer)comparable).append(yq3.e());
                                        CallSite callSite5 = m44.a("w", (Object)yq3, (Object)new Object[0], (long)-1175304405637792755L, (long)l13);
                                        while (callSite5 != null) {
                                            ((StringBuffer)comparable).append("$");
                                            ((StringBuffer)comparable).append(((yq)((Object)callSite5)).e());
                                            callSite5 = m44.a("w", (Object)callSite5, (Object)new Object[0], (long)-1175304405637792755L, (long)l13);
                                            if (callSite2 == false) continue block10;
                                            CallSite callSite6 = callSite2;
                                            if (l13 <= 0L) continue block11;
                                            if (callSite6 != false) continue;
                                        }
                                        string2 = ((StringBuffer)comparable).toString();
                                        if (l13 < 0L) continue block10;
                                        break block23;
                                    }
                                    try {
                                        yq2 = yq3;
                                        if (callSite2 != false) {
                                            bl2 = yq2.R();
                                            break;
                                        }
                                        break block24;
                                    }
                                    catch (nn nn4) {
                                        throw m44.a("h", (Object)nn4, (long)-605392915491003384L, (long)l13);
                                    }
                                }
                                if (bl2) break block23;
                                yq2 = yq3;
                            }
                            string2 = yq2.e();
                        }
                        try {
                            string = string2;
                            if (callSite2 == false) break block25;
                            if (string == null) break block26;
                        }
                        catch (nn nn5) {
                            throw m44.a("h", (Object)nn5, (long)-605392915491003384L, (long)l13);
                        }
                        string = string2;
                    }
                    comparable = l62.B(string, l10);
                    try {
                        if (l13 >= 0L && comparable != null) {
                            set.add(comparable);
                        }
                    }
                    catch (nn nn6) {
                        throw m44.a("h", (Object)nn6, (long)-605392915491003384L, (long)l13);
                    }
                }
                if (callSite2 != false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        bk.a = prr.a(-6038672977121614419L, 5561063024032651903L, MethodHandles.lookup().lookupClass()).a(91660279140266L);
                        var20 = bk.a ^ 37120913981176L;
                        bk.h = new HashMap<K, V>(13);
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
                        var18_3 = new String[8];
                        var16_4 = 0;
                        var15_5 = "\u001a\u0016\u001d\r*(\u00b3\u0004\u007f\u000e\u00a4\u00a0\u000f\u008c\u001c{\u0010;\u009b\u0007\u0003)f\u0086!\u00f9\u0093#\u0018\u0012 i\u00e4\u0018\u000b\u00b5Q\u0083w\u00182\u00eb'\u00c5-\u00f5\u00b0^`\u0013\u00a9\u0087=lgx\u00ee\u00cc\u0018bl\u00aa.\u001b~\u00d2i+\u0081Fh\u00ed\u00b7\u00ad 9\u00fe\u00a4\u0016\u0097\u0099ry\u0010\u0086B\u00a5\u0096{\u00b7\u0018\u00b0\u00f6\u00c6N\u0091V_\u0018\u00cc8\u00d8\u00ae\u00a0\u00d9b\u00c1g\u00d5\u00baA\u00c6\u0085 \u00b8\u00d6\u00a0\u00a6l\u00e7\r\u001f\u00bb\\\u0017\u00e06\u009bOZW\u0012\u00ac1\u00f5\u0080\u0018b\u0092]D\u0098D\u00d9Q'\u00c0\u00a4\u009a\u00a4\u00f9B\u00c7\u00a5\u0003\u00f5\u00a0";
                        var17_6 = "\u001a\u0016\u001d\r*(\u00b3\u0004\u007f\u000e\u00a4\u00a0\u000f\u008c\u001c{\u0010;\u009b\u0007\u0003)f\u0086!\u00f9\u0093#\u0018\u0012 i\u00e4\u0018\u000b\u00b5Q\u0083w\u00182\u00eb'\u00c5-\u00f5\u00b0^`\u0013\u00a9\u0087=lgx\u00ee\u00cc\u0018bl\u00aa.\u001b~\u00d2i+\u0081Fh\u00ed\u00b7\u00ad 9\u00fe\u00a4\u0016\u0097\u0099ry\u0010\u0086B\u00a5\u0096{\u00b7\u0018\u00b0\u00f6\u00c6N\u0091V_\u0018\u00cc8\u00d8\u00ae\u00a0\u00d9b\u00c1g\u00d5\u00baA\u00c6\u0085 \u00b8\u00d6\u00a0\u00a6l\u00e7\r\u001f\u00bb\\\u0017\u00e06\u009bOZW\u0012\u00ac1\u00f5\u0080\u0018b\u0092]D\u0098D\u00d9Q'\u00c0\u00a4\u009a\u00a4\u00f9B\u00c7\u00a5\u0003\u00f5\u00a0".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = bk.c(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u001d'8?;\u00906\u009a\u0011\u00a5\u00e5h\u00b36\u00f9y\u0010\u008bx\u0087\u0091\u0014\u00bd\u00d8y\u00cb+\u0096\u00d4^\u0000_\u00dd";
                            var17_6 = "\u001d'8?;\u00906\u009a\u0011\u00a5\u00e5h\u00b36\u00f9y\u0010\u008bx\u0087\u0091\u0014\u00bd\u00d8y\u00cb+\u0096\u00d4^\u0000_\u00dd".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl34:
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
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = bk.c(var19_9).intern();
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
lbl51:
                        // 1 sources

                        ** continue;
                    }
                }
                bk.c = var18_3;
                bk.g = new String[8];
                bk.l = new HashMap<K, V>(13);
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
                var6_12 = new long[12];
                var3_13 = 0;
                var4_14 = "\u00d6\u0012)\u00e6\u0013\t\u00dc\u00ef&\u0082\u0086\"6K\u00a2\u00b2\u00e0$e\u00a7Y|[\u00b8\u0081\u00d8\u00b5\u0084\u00bd\u00a8K\u00e0p6\u009f\u00e4\u00e3]\u0005\u001b\u00f0Y\u00aa,YC\u00a2\u00d4\u00f6@\u00cf\u00fd\u00b6\u00eb\u0090\u001c\u001b)\u0080\u00ebf\u00e1\u00fdK\t<|=@\u009a\u00fa\u001dm0yrr\u009d\u00f1\u00cf";
                var5_15 = "\u00d6\u0012)\u00e6\u0013\t\u00dc\u00ef&\u0082\u0086\"6K\u00a2\u00b2\u00e0$e\u00a7Y|[\u00b8\u0081\u00d8\u00b5\u0084\u00bd\u00a8K\u00e0p6\u009f\u00e4\u00e3]\u0005\u001b\u00f0Y\u00aa,YC\u00a2\u00d4\u00f6@\u00cf\u00fd\u00b6\u00eb\u0090\u001c\u001b)\u0080\u00ebf\u00e1\u00fdK\t<|=@\u009a\u00fa\u001dm0yrr\u009d\u00f1\u00cf".length();
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
                    var4_14 = "\">\u0018\u008a\u008dC\u0019\u008f\u00f4JB9j\u00a9O\u00f4";
                    var5_15 = "\">\u0018\u008a\u008dC\u0019\u008f\u00f4JB9j\u00a9O\u00f4".length();
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
        bk.i = var6_12;
        bk.k = new Integer[12];
        m44.a("i", (char[])new char[]{(char)bk.c("h", (int)21040, (long)(6751711584872194980L ^ var20)), (char)bk.c("h", (int)23700, (long)(7271176469080206602L ^ var20))}, (long)6701566055325503475L, (long)var20);
        m44.a("i", (char[])new char[]{(char)bk.c("h", (int)20346, (long)(4064384987156217579L ^ var20)), (char)bk.c("h", (int)12213, (long)(8388058966558842406L ^ var20)), (char)bk.c("h", (int)11040, (long)(6662078416012483254L ^ var20))}, (long)5172292191225365892L, (long)var20);
        m44.a("i", (char[])new char[]{(char)bk.c("h", (int)21720, (long)(292146382379377994L ^ var20)), (char)bk.c("h", (int)8461, (long)(5062792693977976976L ^ var20)), (char)bk.c("h", (int)9580, (long)(580588703253992697L ^ var20)), (char)bk.c("h", (int)6901, (long)(8793581110227872613L ^ var20))}, (long)5015893194771819345L, (long)var20);
    }

    private os e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x164799679019L;
        String string = ((x8)((Object)m44.a("w", (Object)this, (long)-6615754104503200801L, (long)l10))).V();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = this;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("i", (Object)objectArray2, (long)-4909856458842728386L, (long)l10);
    }

    private static nn a(nn nn2) {
        return nn2;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1B09;
        if (g[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bk", exception);
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
            bk.g[n11] = bk.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bk.b(n10, l10);
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
            throw new RuntimeException("com/zelix/bk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x60F8;
        if (k[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = i[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])l.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bk", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bk.k[n11] = n12;
        }
        return k[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = bk.c(n10, l10);
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
            throw new RuntimeException("com/zelix/bk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bk.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

