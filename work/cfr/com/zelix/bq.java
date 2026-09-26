/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._f;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hf;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.kx;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.x8;
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
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bq
extends kx
implements ni,
eo {
    private jf[] R;
    private static final long a = prr.a(-3260881381922197030L, 1069913540841542421L, MethodHandles.lookup().lookupClass()).a(275757022163569L);
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    @Override
    int g(int n10, byte by2, int n11) {
        long l10 = (long)n10 << 32 | (long)by2 << 56 >>> 32 | (long)n11 << 40 >>> 40;
        int n12 = 2 + ((CallSite)m44.a("p", (Object)this, (long)-36037003971558893L, (long)l10)).length * 2;
        m44.a("q", (Object)this, (Object)new Object[]{n12}, (long)-2211640850805588452L, (long)l10);
        return n12;
    }

    @Override
    void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        HashMap hashMap2 = (HashMap)objectArray[4];
    }

    /*
     * Exception decompiling
     */
    public bq(_4 var1_1, int var2_2, String var3_3, h1 var4_4, l6q var5_5, long var6_6, l6q var8_7, PrintWriter var9_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 25[DOLOOP]
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
    @Override
    public void c(Object[] var1_1) {
        block15: {
            block14: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (DataOutputStream)var1_1[1];
                var5_4 = var3_2 ^ 0L;
                v0 = m44.a("i", (long)716282175763740856L, (long)var3_2);
                v1 = new Object[2];
                v1[1] = var2_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    try {
                        v2 = this;
                        if (var7_5 == false) break block14;
                        if (m44.a("w", (Object)v2, (long)1198408428474194551L, (long)var3_2) != false) {
                        }
                        ** GOTO lbl48
                    }
                    catch (n9 v3) {
                        throw m44.a("i", (Object)v3, (long)618694140790145652L, (long)var3_2);
                    }
                    var2_3.writeShort(((CallSite)m44.a("w", (Object)this, (long)657781475667440716L, (long)var3_2)).length);
                    v2 = this;
                }
                catch (n9 v4) {
                    throw m44.a("i", (Object)v4, (long)618694140790145652L, (long)var3_2);
                }
            }
            var8_6 = m44.a("w", (Object)v2, (long)657781475667440716L, (long)var3_2);
            var9_7 = ((CallSite)var8_6).length;
            var10_8 = 0;
            block8: while (var10_8 < var9_7) {
                var11_9 = var8_6[var10_8];
                try {
                    var2_3.writeShort(var11_9.E());
                    ++var10_8;
                    do {
                        v5 = var7_5;
                        if (var3_2 > 0L) {
                            if (v5 == false) break block15;
                            v5 = var7_5;
                        }
                        if (v5 != false) continue block8;
                    } while (var3_2 <= 0L);
                    break;
                }
                catch (n9 v6) {
                    throw m44.a("i", (Object)v6, (long)618694140790145652L, (long)var3_2);
                }
            }
            try {
                if (var3_2 < 0L || var7_5 != false) break block15;
lbl48:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var3_2));
            }
            catch (n9 v7) {
                throw m44.a("i", (Object)v7, (long)618694140790145652L, (long)var3_2);
            }
        }
    }

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        long l11 = l10 ^ 0L;
        super.q(x82, l11, x83);
    }

    public void t(Object[] objectArray) {
        block10: {
            bq bq2;
            CallSite callSite;
            long l10;
            long l11;
            HashSet hashSet;
            long l12;
            block9: {
                l12 = (Long)objectArray[0];
                HashSet hashSet2 = (HashSet)objectArray[1];
                hashSet = (HashSet)objectArray[2];
                HashSet hashSet3 = (HashSet)objectArray[3];
                HashSet hashSet4 = (HashSet)objectArray[4];
                long l13 = l12 = a ^ l12;
                l11 = l13 ^ 0x3C0D1B6E48D1L;
                l10 = l13 ^ 0x7860847A043EL;
                callSite = m44.a("m", (long)-1160574072676507988L, (long)l12);
                try {
                    try {
                        bq2 = this;
                        if (callSite == false) break block9;
                        if (m44.a("s", (Object)bq2, (long)-669359853910082461L, (long)l12) == false) break block10;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-1260332981723569056L, (long)l12);
                    }
                    bq2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-1260332981723569056L, (long)l12);
                }
            }
            CallSite callSite2 = m44.a("s", (Object)bq2, (long)-1210194945051422120L, (long)l12);
            int n10 = ((CallSite)callSite2).length;
            int n11 = 0;
            while (n11 < n10) {
                CallSite callSite3;
                block11: {
                    block12: {
                        block13: {
                            CallSite callSite4 = callSite2[n11];
                            _f _f2 = l62.B(((jf)((Object)callSite4)).g(l10), l11);
                            try {
                                try {
                                    callSite3 = callSite;
                                    if (l12 < 0L) break block11;
                                    if (callSite3 == false) break block12;
                                    if (_f2 == null) break block13;
                                }
                                catch (n9 n94) {
                                    throw m44.a("m", (Object)n94, (long)-1260332981723569056L, (long)l12);
                                }
                                hashSet.add(_f2);
                            }
                            catch (n9 n95) {
                                throw m44.a("m", (Object)n95, (long)-1260332981723569056L, (long)l12);
                            }
                        }
                        ++n11;
                    }
                    callSite3 = callSite;
                }
                if (callSite3 != false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void N(Object[] var1_1) {
        block22: {
            block21: {
                var2_2 = (DataOutputStream)var1_1[0];
                var6_3 = (Map)var1_1[1];
                var3_4 = (Long)var1_1[2];
                var5_5 = (lqu)var1_1[3];
                var7_6 = var3_4 ^ 62442288127650L;
                v0 = m44.a("k", (long)1083949478671047661L, (long)var3_4);
                v1 = new Object[2];
                v1[1] = var2_2;
                v1[0] = var7_6;
                super.c(v1);
                var9_7 = v0;
                try {
                    try {
                        v2 = this;
                        if (var9_7 != false) break block21;
                        if (m44.a("u", (Object)v2, (long)1009829788873835733L, (long)var3_4) != false) {
                        }
                        ** GOTO lbl75
                    }
                    catch (n9 v3) {
                        throw m44.a("k", (Object)v3, (long)1599960673726405846L, (long)var3_4);
                    }
                    var2_2.writeShort(((CallSite)m44.a("u", (Object)this, (long)1694145169040501486L, (long)var3_4)).length);
                    v2 = this;
                }
                catch (n9 v4) {
                    throw m44.a("k", (Object)v4, (long)1599960673726405846L, (long)var3_4);
                }
            }
            var10_8 = m44.a("u", (Object)v2, (long)1694145169040501486L, (long)var3_4);
            var11_9 = ((CallSite)var10_8).length;
            var12_10 = 0;
            while (var12_10 < var11_9) {
                block25: {
                    block24: {
                        block23: {
                            var13_11 = var10_8[var12_10];
                            var14_12 = (js)var6_3.get(var13_11);
                            try {
                                try {
                                    try {
                                        v5 = var9_7;
                                        if (var3_4 > 0L) {
                                            if (v5 != false) break block22;
                                            v5 = var9_7;
                                        }
                                        if (var3_4 > 0L) {
                                            if (v5 != false) break block23;
                                        }
                                        ** GOTO lbl62
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("k", (Object)v6, (long)1599960673726405846L, (long)var3_4);
                                    }
                                    if (var3_4 <= 0L) break block24;
                                    if (var14_12 != null) {
                                    }
                                    ** GOTO lbl64
                                }
                                catch (n9 v7) {
                                    throw m44.a("k", (Object)v7, (long)1599960673726405846L, (long)var3_4);
                                }
                                var2_2.writeShort(var14_12.E());
                            }
                            catch (n9 v8) {
                                throw m44.a("k", (Object)v8, (long)1599960673726405846L, (long)var3_4);
                            }
                        }
                        try {
                            v5 = var9_7;
lbl62:
                            // 2 sources

                            if (var3_4 <= 0L) break block25;
                            if (v5 == false) break block24;
lbl64:
                            // 2 sources

                            var2_2.writeShort(var13_11.E());
                        }
                        catch (n9 v9) {
                            throw m44.a("k", (Object)v9, (long)1599960673726405846L, (long)var3_4);
                        }
                    }
                    ++var12_10;
                    v5 = var9_7;
                }
                if (v5 == false) continue;
            }
            try {
                if (var3_4 < 0L || var3_4 < 0L || var9_7 == false) break block22;
lbl75:
                // 2 sources

                var2_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var3_4));
            }
            catch (n9 v10) {
                throw m44.a("k", (Object)v10, (long)1599960673726405846L, (long)var3_4);
            }
        }
    }

    public int r(Object[] objectArray) {
        Object object;
        block16: {
            CallSite callSite;
            block18: {
                long l10;
                block17: {
                    hf hf2 = (hf)objectArray[0];
                    l10 = (Long)objectArray[1];
                    long l11 = l10 = a ^ l10;
                    long l12 = l11 ^ 0xF44C172BE39L;
                    long l13 = l11 ^ 0x71C6F43FCDBBL;
                    long l14 = l11 ^ 0x35AB6B2B8154L;
                    CallSite callSite2 = m44.a("o", (long)8275062572237923889L, (long)l10);
                    try {
                        object = m44.a("q", (Object)this, (long)8349595684883249417L, (long)l10);
                        if (callSite2 != false) break block16;
                        if (object == false) break block17;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)7775508871522148618L, (long)l10);
                    }
                    ArrayList<CallSite> arrayList = new ArrayList<CallSite>(((CallSite)m44.a("q", (Object)this, (long)7664787710320383794L, (long)l10)).length);
                    CallSite callSite3 = m44.a("q", (Object)this, (long)7664787710320383794L, (long)l10);
                    int n10 = ((CallSite)callSite3).length;
                    int n11 = 0;
                    while (n11 < n10) {
                        CallSite callSite4;
                        block21: {
                            block20: {
                                callSite = callSite3;
                                if (l10 <= 0L) break block18;
                                CallSite callSite5 = callSite[n11];
                                _f _f2 = l62.B(((jf)((Object)callSite5)).g(l14), l13);
                                try {
                                    Object object2;
                                    block19: {
                                        try {
                                            try {
                                                try {
                                                    if (callSite2 != false) break block17;
                                                    if (_f2 == null) break block19;
                                                }
                                                catch (n9 n93) {
                                                    throw m44.a("o", (Object)n93, (long)7775508871522148618L, (long)l10);
                                                }
                                                Object[] objectArray2 = new Object[2];
                                                objectArray2[1] = l12;
                                                objectArray2[0] = _f2;
                                                object2 = m44.a("p", (Object)hf2, (Object)objectArray2, (long)7557211732910018536L, (long)l10);
                                                if (callSite2 != false) break block20;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("o", (Object)n94, (long)7775508871522148618L, (long)l10);
                                            }
                                            if (l10 < 0L) break block21;
                                            if (!object2) break block20;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("o", (Object)n95, (long)7775508871522148618L, (long)l10);
                                        }
                                    }
                                    object2 = arrayList.add(callSite5);
                                }
                                catch (n9 n96) {
                                    throw m44.a("o", (Object)n96, (long)7775508871522148618L, (long)l10);
                                }
                            }
                            ++n11;
                            callSite4 = callSite2;
                        }
                        if (callSite4 == false) continue;
                    }
                    try {
                        try {
                            object = arrayList.size();
                            if (l10 < 0L) break block16;
                            Object object3 = callSite2;
                            if (l10 > 0L) {
                                if (object3 != false) break block16;
                                object3 = ((CallSite)m44.a("q", (Object)this, (long)7664787710320383794L, (long)l10)).length;
                            }
                            if (object >= object3) break block17;
                        }
                        catch (n9 n97) {
                            throw m44.a("o", (Object)n97, (long)7775508871522148618L, (long)l10);
                        }
                        m44.a("s", (Object)this, (jf[])arrayList.toArray(new jf[arrayList.size()]), (long)7664787710320383794L, (long)l10);
                    }
                    catch (n9 n98) {
                        throw m44.a("o", (Object)n98, (long)7775508871522148618L, (long)l10);
                    }
                }
                callSite = m44.a("q", (Object)this, (long)7664787710320383794L, (long)l10);
            }
            object = ((CallSite)callSite).length;
        }
        return (int)object;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void S(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 2[TRYBLOCK]
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
    void z(gu gu2, long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0x66FDF08525FDL;
        long l13 = l11 ^ 0x6DE1DADD9981L;
        CallSite callSite = m44.a("h", (long)6170399952317654249L, (long)l10);
        gu2.K(this.b, this, l12, this.H());
        CallSite callSite2 = m44.a("v", (Object)this, (long)6156979294704838685L, (long)l10);
        int n10 = ((CallSite)callSite2).length;
        CallSite callSite3 = callSite;
        for (int i10 = 0; i10 < n10; ++i10) {
            CallSite callSite4 = callSite2[i10];
            ((jf)((Object)callSite4)).e(l13, gu2, this, this);
            if (callSite3 != false) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l10 = a ^ 0x4098B011CED9L;
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
        String string = "\u00e8 %\u0010\u00a1\u00ed\u009a\u00b8\u00fa\f\u0085X\u001bi\u00e8\u00ca\u0010\u008f\u001fn*r.\u00dc\u00bb,\u0090r\u0014\u00d5\u00cd\u0095PHG\u00df\u009e\u0094\u009f\u008a\u00d3`z\u00e2\u009b\u0019`c\u00fe\u00da\u00c48g\u00f4u\\\u009b\u00f4\u00f7;\u0097\u0014\u008dp\u00e24\u000e\u00f8\u00cd%\u00c6\u0005\u00c3\u00ba\u00a4\u00e8\"\u001e(v\u0002S\u00a7{\u00b9X\u00cf\u0014V\u00ac\u00e8H\u00fa\u00a89r<R\u0098\u00b0\u00deA\u0080\u00d97\u0095";
        int n11 = "\u00e8 %\u0010\u00a1\u00ed\u009a\u00b8\u00fa\f\u0085X\u001bi\u00e8\u00ca\u0010\u008f\u001fn*r.\u00dc\u00bb,\u0090r\u0014\u00d5\u00cd\u0095PHG\u00df\u009e\u0094\u009f\u008a\u00d3`z\u00e2\u009b\u0019`c\u00fe\u00da\u00c48g\u00f4u\\\u009b\u00f4\u00f7;\u0097\u0014\u008dp\u00e24\u000e\u00f8\u00cd%\u00c6\u0005\u00c3\u00ba\u00a4\u00e8\"\u001e(v\u0002S\u00a7{\u00b9X\u00cf\u0014V\u00ac\u00e8H\u00fa\u00a89r<R\u0098\u00b0\u00deA\u0080\u00d97\u0095".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = bq.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                c = stringArray;
                d = new String[3];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x60E0;
        if (d[n11] == null) {
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
                throw new RuntimeException("com/zelix/bq", exception);
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
            bq.d[n11] = bq.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bq.b(n10, l10);
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
            throw new RuntimeException("com/zelix/bq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bq.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

