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
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bu
extends kx
implements ni,
eo {
    jf[] P;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    public int m(Object[] objectArray) {
        Object object;
        block16: {
            CallSite callSite;
            block18: {
                long l10;
                block17: {
                    l10 = (Long)objectArray[0];
                    hf hf2 = (hf)objectArray[1];
                    long l11 = l10 = a ^ l10;
                    long l12 = l11 ^ 0x60655F87CC3FL;
                    long l13 = l11 ^ 0x1EE76ACABFBDL;
                    long l14 = l11 ^ 0x5A8AF5DEF352L;
                    CallSite callSite2 = m44.a("i", (long)58690493599077431L, (long)l10);
                    try {
                        object = m44.a("w", (Object)this, (long)133373131563518735L, (long)l10);
                        if (callSite2 != false) break block16;
                        if (object == false) break block17;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)1884183722631763229L, (long)l10);
                    }
                    ArrayList<CallSite> arrayList = new ArrayList<CallSite>(((CallSite)m44.a("w", (Object)this, (long)310947571868257979L, (long)l10)).length);
                    CallSite callSite3 = m44.a("w", (Object)this, (long)310947571868257979L, (long)l10);
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
                                                    throw m44.a("i", (Object)n93, (long)1884183722631763229L, (long)l10);
                                                }
                                                Object[] objectArray2 = new Object[2];
                                                objectArray2[1] = l12;
                                                objectArray2[0] = _f2;
                                                object2 = m44.a("v", (Object)hf2, (Object)objectArray2, (long)1938504049707023854L, (long)l10);
                                                if (callSite2 != false) break block20;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("i", (Object)n94, (long)1884183722631763229L, (long)l10);
                                            }
                                            if (l10 <= 0L) break block21;
                                            if (!object2) break block20;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("i", (Object)n95, (long)1884183722631763229L, (long)l10);
                                        }
                                    }
                                    object2 = arrayList.add(callSite5);
                                }
                                catch (n9 n96) {
                                    throw m44.a("i", (Object)n96, (long)1884183722631763229L, (long)l10);
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
                            if (l10 <= 0L) break block16;
                            Object object3 = callSite2;
                            if (l10 >= 0L) {
                                if (object3 != false) break block16;
                                object3 = ((CallSite)m44.a("w", (Object)this, (long)310947571868257979L, (long)l10)).length;
                            }
                            if (object >= object3) break block17;
                        }
                        catch (n9 n97) {
                            throw m44.a("i", (Object)n97, (long)1884183722631763229L, (long)l10);
                        }
                        m44.a("u", (Object)this, (jf[])arrayList.toArray(new jf[arrayList.size()]), (long)310947571868257979L, (long)l10);
                    }
                    catch (n9 n98) {
                        throw m44.a("i", (Object)n98, (long)1884183722631763229L, (long)l10);
                    }
                }
                callSite = m44.a("w", (Object)this, (long)310947571868257979L, (long)l10);
            }
            object = ((CallSite)callSite).length;
        }
        return (int)object;
    }

    /*
     * Exception decompiling
     */
    bu(int var1_1, _4 var2_2, int var3_3, String var4_4, short var5_5, h1 var6_6, char var7_7, l6q var8_8, l6q var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 29[DOLOOP]
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
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                var5_4 = var2_2 ^ 0L;
                v0 = m44.a("i", (long)1272493964096652623L, (long)var2_2);
                v1 = new Object[2];
                v1[1] = var4_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    try {
                        v2 = this;
                        if (var7_5 != false) break block14;
                        if (m44.a("w", (Object)v2, (long)1198408428474194551L, (long)var2_2) != false) {
                        }
                        ** GOTO lbl48
                    }
                    catch (n9 v3) {
                        throw m44.a("i", (Object)v3, (long)819016492915819621L, (long)var2_2);
                    }
                    var4_3.writeShort(((CallSite)m44.a("w", (Object)this, (long)1524742383770492867L, (long)var2_2)).length);
                    v2 = this;
                }
                catch (n9 v4) {
                    throw m44.a("i", (Object)v4, (long)819016492915819621L, (long)var2_2);
                }
            }
            var8_6 = m44.a("w", (Object)v2, (long)1524742383770492867L, (long)var2_2);
            var9_7 = ((CallSite)var8_6).length;
            var10_8 = 0;
            block8: while (var10_8 < var9_7) {
                var11_9 = var8_6[var10_8];
                try {
                    var4_3.writeShort(var11_9.E());
                    ++var10_8;
                    do {
                        v5 = var7_5;
                        if (var2_2 >= 0L) {
                            if (v5 != false) break block15;
                            v5 = var7_5;
                        }
                        if (v5 == false) continue block8;
                    } while (var2_2 <= 0L);
                    break;
                }
                catch (n9 v6) {
                    throw m44.a("i", (Object)v6, (long)819016492915819621L, (long)var2_2);
                }
            }
            try {
                if (var2_2 < 0L || var7_5 == false) break block15;
lbl48:
                // 2 sources

                var4_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var2_2));
            }
            catch (n9 v7) {
                throw m44.a("i", (Object)v7, (long)819016492915819621L, (long)var2_2);
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
                var6_2 = (DataOutputStream)var1_1[0];
                var5_3 = (Map)var1_1[1];
                var3_4 = (Long)var1_1[2];
                var2_5 = (lqu)var1_1[3];
                var7_6 = var3_4 ^ 62442288127650L;
                v0 = m44.a("k", (long)1083949478671047661L, (long)var3_4);
                v1 = new Object[2];
                v1[1] = var6_2;
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
                        throw m44.a("k", (Object)v3, (long)1585130606164449991L, (long)var3_4);
                    }
                    var6_2.writeShort(((CallSite)m44.a("u", (Object)this, (long)831690201321980257L, (long)var3_4)).length);
                    v2 = this;
                }
                catch (n9 v4) {
                    throw m44.a("k", (Object)v4, (long)1585130606164449991L, (long)var3_4);
                }
            }
            var10_8 = m44.a("u", (Object)v2, (long)831690201321980257L, (long)var3_4);
            var11_9 = ((CallSite)var10_8).length;
            var12_10 = 0;
            while (var12_10 < var11_9) {
                block25: {
                    block24: {
                        block23: {
                            var13_11 = var10_8[var12_10];
                            var14_12 = (js)var5_3.get(var13_11);
                            try {
                                try {
                                    try {
                                        v5 = var9_7;
                                        if (var3_4 >= 0L) {
                                            if (v5 != false) break block22;
                                            v5 = var9_7;
                                        }
                                        if (var3_4 > 0L) {
                                            if (v5 != false) break block23;
                                        }
                                        ** GOTO lbl62
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("k", (Object)v6, (long)1585130606164449991L, (long)var3_4);
                                    }
                                    if (var3_4 <= 0L) break block24;
                                    if (var14_12 != null) {
                                    }
                                    ** GOTO lbl64
                                }
                                catch (n9 v7) {
                                    throw m44.a("k", (Object)v7, (long)1585130606164449991L, (long)var3_4);
                                }
                                var6_2.writeShort(var14_12.E());
                            }
                            catch (n9 v8) {
                                throw m44.a("k", (Object)v8, (long)1585130606164449991L, (long)var3_4);
                            }
                        }
                        try {
                            v5 = var9_7;
lbl62:
                            // 2 sources

                            if (var3_4 < 0L) break block25;
                            if (v5 == false) break block24;
lbl64:
                            // 2 sources

                            var6_2.writeShort(var13_11.E());
                        }
                        catch (n9 v9) {
                            throw m44.a("k", (Object)v9, (long)1585130606164449991L, (long)var3_4);
                        }
                    }
                    ++var12_10;
                    v5 = var9_7;
                }
                if (v5 == false) continue;
            }
            try {
                if (var3_4 <= 0L || var3_4 <= 0L || var9_7 == false) break block22;
lbl75:
                // 2 sources

                var6_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var3_4));
            }
            catch (n9 v10) {
                throw m44.a("k", (Object)v10, (long)1585130606164449991L, (long)var3_4);
            }
        }
    }

    @Override
    public void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        HashMap hashMap2 = (HashMap)objectArray[4];
    }

    /*
     * Exception decompiling
     */
    @Override
    public void S(Object[] var1_1) {
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
     * WARNING - void declaration
     */
    @Override
    void z(gu gu2, long l10) {
        block4: {
            void var9_7;
            CallSite callSite;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                long l12 = l10;
                l11 = l12 ^ 0x6DE1DADD9981L;
                long l13 = l12 ^ 0x6DE1DADD9981L;
                CallSite callSite3 = m44.a("h", (long)6170399952317654249L, (long)l10);
                this.b.e(l13, gu2, this, this.H());
                callSite = callSite3;
                try {
                    object = m44.a("v", (Object)this, (long)5544088189886891558L, (long)l10);
                    if (callSite == false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)6272581763260962868L, (long)l10);
                }
                object = callSite2 = (Object)false;
            }
            while (var9_7 < ((CallSite)m44.a("v", (Object)this, (long)5294524344158061458L, (long)l10)).length) {
                ((jf)((Object)m44.a("v", (Object)this, (long)5294524344158061458L, (long)l10)[var9_7])).e(l11, gu2, this, this.H());
                ++var9_7;
                if (callSite != false) continue;
            }
        }
    }

    @Override
    int g(int n10, byte by2, int n11) {
        long l10 = (long)n10 << 32 | (long)by2 << 56 >>> 32 | (long)n11 << 40 >>> 40;
        return 2 + ((CallSite)m44.a("p", (Object)this, (long)-2055918158255773284L, (long)l10)).length * 2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                bu.a = prr.a(8706919236456327516L, -3896688386516303879L, MethodHandles.lookup().lookupClass()).a(22444178866826L);
                bu.g = new HashMap<K, V>(13);
                var0 = bu.a ^ 138447321819012L;
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
                var6_5 = "\u00a4\u00b1n\u008eO\u0086\u00fc\u00c2jd\t\u00c9;+\u00f4\u0019\u00ebr\u0090\u00da%0\u0013\\\u00a5Y#x\u00f9W\u0003\u00d7\u0010\u00f1\u00fb\u0095\u0010\u00f9\u009f\u00d8\u001c\u00ae,\u00b4\u0080!Y`\u00d8\u0010|J\u000b1S{\u0085\u008dN\u00acX}\u0013q\u00b4\u00b5 >\u00ca\u00f4pgz\u00d73\u00d4\u00e7\u00b5\u00e9\u001b!\"\u0081/\u00ad\u00b1\u008cR\u00b0\u0085\u008a\u00dcd:\u0001(G\"'\u0010\u00c5\u00c8\u0084\u00ca\u00fa*#\u00ec\u00db\u00ednvdvN\u00f7@\u00b2K\u00be\u00a5\u0080\u008e\u00e4\u0017@\u001b\u00ef!\u000f\u00c7\u00c4\u0096\u00bc\u00de\u00bfLx\u0017\u00c2>b\u00a44\u00d7Y\u00ca\u00a1\u001e\u001d\u00f9V3\u00ee:\u00d8$t\u00c8B\u00a9dk\u008f\u0084\u00e0\u00a3\u000by\rJ\u00da\r\u00e3\u00bb(\u00b6\u00fdS/P \u00b3\b\u00ba\u00ca\u00eb\u00c4\u00ad\u00eb\u008d\u0000f\u009f\u0095\u0089\u00d6\u00ea\u0003i\u009d\u0002\u00b0j-\u00a6 l1\u00f0p\u00a0\u00fb\u00ed@\u0011S|\u00fc\u00ac\u00d5j\u00aa\u001a\u0005\u000b\u00ee\u00e6Te\u0002\u00b9\"\u0080\u0005\n\u0002\u00c0\u00eax\u00a1\u00ad\u00f7\u00a4\u00ae5&]\u00e5\u00c9'\u00f4\u0013s\u00c7\u00b8\r\u00e8\u00fc\u0013\u00fb%u\u00ab\u00ec\u00809\u00deG\u00e7-\u008dJ\u00fdK\u00d32UT\u0018k9\u00ccA\u00af\u0014\u00ab\u00af\u009e\u008e\u00e0sD\u00df\u00e8\u00d2r\u009e\u00e6\u00e5\u00c16fK8R\u0011\u0016\u009e\u001d\u00ec\u0001\u0012#\u00f3+\u0080\u0093W=\u0001\u009c\u00ab\u0003\fb\u00c3K\u001c4\u00df\u00934\u007f7X\u0096\u00bb\u008eYRE5>,\u00e1\u00fe\u00d0\u00a2\u001f\u0003\u001fu\u00d5\u00c2_\u00c3\u00ce\u0099\u00c8\u00cd E\u0010\t3\u0088S\u0080\u0086o\u0006,\u001c\u00b6\u008ed\u0000\n%\u00cbA\b\u00a2b\u00dd\u00d7\u00ae\u008aq\u00c1\u00ac:\u00b0";
                var8_6 = "\u00a4\u00b1n\u008eO\u0086\u00fc\u00c2jd\t\u00c9;+\u00f4\u0019\u00ebr\u0090\u00da%0\u0013\\\u00a5Y#x\u00f9W\u0003\u00d7\u0010\u00f1\u00fb\u0095\u0010\u00f9\u009f\u00d8\u001c\u00ae,\u00b4\u0080!Y`\u00d8\u0010|J\u000b1S{\u0085\u008dN\u00acX}\u0013q\u00b4\u00b5 >\u00ca\u00f4pgz\u00d73\u00d4\u00e7\u00b5\u00e9\u001b!\"\u0081/\u00ad\u00b1\u008cR\u00b0\u0085\u008a\u00dcd:\u0001(G\"'\u0010\u00c5\u00c8\u0084\u00ca\u00fa*#\u00ec\u00db\u00ednvdvN\u00f7@\u00b2K\u00be\u00a5\u0080\u008e\u00e4\u0017@\u001b\u00ef!\u000f\u00c7\u00c4\u0096\u00bc\u00de\u00bfLx\u0017\u00c2>b\u00a44\u00d7Y\u00ca\u00a1\u001e\u001d\u00f9V3\u00ee:\u00d8$t\u00c8B\u00a9dk\u008f\u0084\u00e0\u00a3\u000by\rJ\u00da\r\u00e3\u00bb(\u00b6\u00fdS/P \u00b3\b\u00ba\u00ca\u00eb\u00c4\u00ad\u00eb\u008d\u0000f\u009f\u0095\u0089\u00d6\u00ea\u0003i\u009d\u0002\u00b0j-\u00a6 l1\u00f0p\u00a0\u00fb\u00ed@\u0011S|\u00fc\u00ac\u00d5j\u00aa\u001a\u0005\u000b\u00ee\u00e6Te\u0002\u00b9\"\u0080\u0005\n\u0002\u00c0\u00eax\u00a1\u00ad\u00f7\u00a4\u00ae5&]\u00e5\u00c9'\u00f4\u0013s\u00c7\u00b8\r\u00e8\u00fc\u0013\u00fb%u\u00ab\u00ec\u00809\u00deG\u00e7-\u008dJ\u00fdK\u00d32UT\u0018k9\u00ccA\u00af\u0014\u00ab\u00af\u009e\u008e\u00e0sD\u00df\u00e8\u00d2r\u009e\u00e6\u00e5\u00c16fK8R\u0011\u0016\u009e\u001d\u00ec\u0001\u0012#\u00f3+\u0080\u0093W=\u0001\u009c\u00ab\u0003\fb\u00c3K\u001c4\u00df\u00934\u007f7X\u0096\u00bb\u008eYRE5>,\u00e1\u00fe\u00d0\u00a2\u001f\u0003\u001fu\u00d5\u00c2_\u00c3\u00ce\u0099\u00c8\u00cd E\u0010\t3\u0088S\u0080\u0086o\u0006,\u001c\u00b6\u008ed\u0000\n%\u00cbA\b\u00a2b\u00dd\u00d7\u00ae\u008aq\u00c1\u00ac:\u00b0".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = bu.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c6/\u008aksc\u00ef\u00f1n\u0013)\u0084FY2\u00a7q\u00dd\u00e8\u0015\u0016}F\u00b0 \u00dd\u00e8\u00b6\u00b9\u00a1\u00a9\u008f\u00bb\u00cfEe\u00f1\u0003\\\u00b6\u00a0\u0003\u009fg\u00e8\u00da|\u00f3<\u00cfH\u00d7\u0095\u00f6\u008ae\u00a2\u008b\u0090\u001d\f\u0093\u00f5L\u0091\n\u00d1\"~J\u00e9\u0084\u001d\u0013%\u0098\u0081t`U@2\u00d4\u00ec\u00ce\u00d5\u00992\u0001\u0081aL\u00a3\u0000\u00ef\u008c\u00fa\u0005I\u0019\u008a\u0002)\u00bf\u00c9\u00a9\u00b9\u00d3\u00a7.H\f7\u007f\u0003\u00d8\u00c9^0\u00da\u00f2\u0006\u00be\u0090\u00e44=\u001e\u00ee\u00b4h=}bH\u00979\u000f\u00ef\u00efDv\u0013\u00de\u00c5";
                    var8_6 = "\u00c6/\u008aksc\u00ef\u00f1n\u0013)\u0084FY2\u00a7q\u00dd\u00e8\u0015\u0016}F\u00b0 \u00dd\u00e8\u00b6\u00b9\u00a1\u00a9\u008f\u00bb\u00cfEe\u00f1\u0003\\\u00b6\u00a0\u0003\u009fg\u00e8\u00da|\u00f3<\u00cfH\u00d7\u0095\u00f6\u008ae\u00a2\u008b\u0090\u001d\f\u0093\u00f5L\u0091\n\u00d1\"~J\u00e9\u0084\u001d\u0013%\u0098\u0081t`U@2\u00d4\u00ec\u00ce\u00d5\u00992\u0001\u0081aL\u00a3\u0000\u00ef\u008c\u00fa\u0005I\u0019\u008a\u0002)\u00bf\u00c9\u00a9\u00b9\u00d3\u00a7.H\f7\u007f\u0003\u00d8\u00c9^0\u00da\u00f2\u0006\u00be\u0090\u00e44=\u001e\u00ee\u00b4h=}bH\u00979\u000f\u00ef\u00efDv\u0013\u00de\u00c5".length();
                    var5_7 = 80;
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
                    var9_3[var7_4++] = bu.c(var10_9).intern();
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
        bu.c = var9_3;
        bu.d = new String[13];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1E23;
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
                throw new RuntimeException("com/zelix/bu", exception);
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
            bu.d[n11] = bu.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bu.b(n10, l10);
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
            throw new RuntimeException("com/zelix/bu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bu.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

