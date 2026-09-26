/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._f;
import com.zelix._v;
import com.zelix.b0;
import com.zelix.b1;
import com.zelix.bg;
import com.zelix.bn;
import com.zelix.hm;
import com.zelix.ji;
import com.zelix.l62;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.xb;
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

public class jd
extends ji
implements hm {
    static final va Q;
    private b1 z;
    private b1 h;
    private static final long a;
    private static final String[] g;
    private static final String[] i;
    private static final Map j;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;

    public void S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        String string2 = ((xb)((Object)m44.a("s", (Object)this, (long)-1707183864031422258L, (long)l10))).X();
        String string3 = (char)jd.f("k", (int)3189, (long)(0x5EC271C2FD1AF1EFL ^ l10)) + string + string2.substring(string2.indexOf((int)jd.f("k", (int)24067, (long)(0x6D1F7A04E225239EL ^ l10))));
        m44.a("r", (Object)m44.a("s", (Object)this, (long)-1707183864031422258L, (long)l10), (Object)new Object[]{string3}, (long)-606438964506668842L, (long)l10);
    }

    public jd(int n10, to to2, xb xb2, long l10, bg bg2) {
        long l11 = (l10 = a ^ l10) ^ 0x5B273604B591L;
        super(n10, to2, l11, xb2, bg2);
    }

    /*
     * Exception decompiling
     */
    public void y(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [146[DOLOOP]], but top level block is 71[TRYBLOCK]
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
    public va A(long l10) {
        return m44.a("i", (long)-5729597486003170088L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void G(Object[] var1_1) {
        block25: {
            block30: {
                block29: {
                    block28: {
                        block26: {
                            block27: {
                                block24: {
                                    var5_2 = (_v)var1_1[0];
                                    var2_3 = (Set)var1_1[1];
                                    var3_4 = (Long)var1_1[2];
                                    v0 = var3_4 = jd.a ^ var3_4;
                                    var6_5 = v0 ^ 128371180352836L;
                                    var8_6 = v0 ^ 60668324856164L;
                                    var10_7 = v0 ^ 116700077931800L;
                                    var12_8 = v0 ^ 64146559992500L;
                                    var14_9 = v0 ^ 92673258272200L;
                                    var17_10 = m44.a("j", (Object)new Object[]{m44.a("t", (Object)this, (long)3279085295500008705L, (long)var3_4).X()}, (long)3594124139013614024L, (long)var3_4);
                                    var16_11 = m44.a("j", (long)3021554251404168970L, (long)var3_4);
                                    try {
                                        try {
                                            try {
                                                v1 = var17_10.length();
                                                v2 /* !! */  = 2;
                                                if (var16_11 != false) break block24;
                                                if (v1 <= v2 /* !! */ ) break block25;
                                            }
                                            catch (n9 v3) {
                                                throw m44.a("j", (Object)v3, (long)2954169855901864174L, (long)var3_4);
                                            }
                                            v4 = var17_10;
                                            v5 = var17_10.length() - 1;
                                            v6 /* !! */  = var16_11;
                                            if (var3_4 < 0L) break block26;
                                            if (v6 /* !! */  != false) break block27;
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("j", (Object)v7, (long)2954169855901864174L, (long)var3_4);
                                        }
                                        v1 = v4.charAt(v5);
                                        v2 /* !! */  = (int)jd.f("k", (int)16266, (long)(7840883918579992540L ^ var3_4));
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("j", (Object)v8, (long)2954169855901864174L, (long)var3_4);
                                    }
                                }
                                try {
                                    if (v1 != v2 /* !! */ ) break block25;
                                    v4 = var17_10;
                                    v5 = 1;
                                }
                                catch (n9 v9) {
                                    throw m44.a("j", (Object)v9, (long)2954169855901864174L, (long)var3_4);
                                }
                            }
                            v6 /* !! */  = (CallSite)(var17_10.length() - 1);
                        }
                        var18_12 = v4.substring(v5, (int)v6 /* !! */ );
                        try {
                            try {
                                v10 = var18_12;
                                if (var16_11 != false) break block28;
                                if (v10.equals(var5_2.h(var8_6))) break block25;
                            }
                            catch (n9 v11) {
                                throw m44.a("j", (Object)v11, (long)2954169855901864174L, (long)var3_4);
                            }
                            v10 = var18_12;
                        }
                        catch (n9 v12) {
                            throw m44.a("j", (Object)v12, (long)2954169855901864174L, (long)var3_4);
                        }
                    }
                    var19_13 = l62.t(v10);
                    try {
                        v13 = var19_13;
                        v14 = var16_11;
                        if (var3_4 >= 0L) {
                            if (v14 != false) break block29;
                            if (v13 == null) break block25;
                        }
                        ** GOTO lbl78
                    }
                    catch (n9 v15) {
                        throw m44.a("j", (Object)v15, (long)2954169855901864174L, (long)var3_4);
                    }
                    v13 = var19_13;
                }
                try {
                    try {
                        v14 = var16_11;
lbl78:
                        // 2 sources

                        if (v14 != false) break block30;
                        v16 = new Object[1];
                        v16[0] = var6_5;
                        if (m44.a("u", (Object)v13, (Object)v16, (long)3792657299752497229L, (long)var3_4) == false) break block25;
                    }
                    catch (n9 v17) {
                        throw m44.a("j", (Object)v17, (long)2954169855901864174L, (long)var3_4);
                    }
                    v13 = l62.t(var5_2.h(var8_6));
                }
                catch (n9 v18) {
                    throw m44.a("j", (Object)v18, (long)2954169855901864174L, (long)var3_4);
                }
            }
            if ((var20_14 = v13) != null) {
                v19 = new Object[2];
                v19[1] = var14_9;
                v19[0] = (int)jd.f("k", (int)27740, (long)(1174219498868626447L ^ var3_4));
                var21_15 = m44.a("j", (Object)v19, (long)3533382186500404457L, (long)var3_4);
                try {
                    try {
                        v20 = new Object[2];
                        v20[1] = var21_15;
                        v20[0] = var12_8;
                        m44.a("u", (Object)var20_14, (Object)v20, (long)3478100955838148732L, (long)var3_4);
                        v21 = var21_15.containsKey(var19_13);
                        if (var16_11 != false || !v21) break block25;
                    }
                    catch (n9 v22) {
                        throw m44.a("j", (Object)v22, (long)2954169855901864174L, (long)var3_4);
                    }
                    v21 = var2_3.add(var19_13.G(var10_7));
                }
                catch (n9 v23) {
                    throw m44.a("j", (Object)v23, (long)2954169855901864174L, (long)var3_4);
                }
            }
        }
    }

    public jd(int n10, xb xb2, jd jd2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x599DD9233D44L;
        super(n10, l11, xb2, jd2);
        m44.a("s", (Object)this, (b1)((Object)m44.a("q", (Object)jd2, (long)3127456660570945309L, (long)l10)), (long)3127456660570945309L, (long)l10);
        m44.a("s", (Object)this, (b1)((Object)m44.a("q", (Object)jd2, (long)3899662426956922336L, (long)l10)), (long)3899662426956922336L, (long)l10);
    }

    @Override
    public void Z(Object[] objectArray) {
        block15: {
            jd jd2;
            _v _v2;
            long l10;
            long l11;
            Set set;
            block18: {
                block19: {
                    CallSite callSite;
                    CallSite callSite2;
                    long l12;
                    long l13;
                    Set set2;
                    block16: {
                        block17: {
                            Set set3;
                            block14: {
                                set = (Set)objectArray[0];
                                set2 = (Set)objectArray[1];
                                l11 = (Long)objectArray[2];
                                Set set4 = (Set)objectArray[3];
                                set3 = (Set)objectArray[4];
                                long l14 = l11;
                                long l15 = l14 ^ 0L;
                                l13 = l14 ^ 0x34A95E9B95E0L;
                                l10 = l14 ^ 0x15F0690BABA2L;
                                l12 = l14 ^ 0x412C626700A3L;
                                CallSite callSite3 = m44.a("h", (long)-2900595962250096960L, (long)l11);
                                Object[] objectArray2 = new Object[5];
                                objectArray2[4] = set3;
                                objectArray2[3] = set4;
                                objectArray2[2] = l15;
                                objectArray2[1] = set2;
                                objectArray2[0] = set;
                                super.Z(objectArray2);
                                callSite2 = callSite3;
                                try {
                                    try {
                                        callSite = m44.a("v", (Object)this, (long)-3640635574796332798L, (long)l11);
                                        if (callSite2 == false) break block14;
                                        if (callSite == null) break block15;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)n92, (long)-4006750558540959628L, (long)l11);
                                    }
                                    callSite = m44.a("v", (Object)this, (long)-3640635574796332798L, (long)l11);
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)-4006750558540959628L, (long)l11);
                                }
                            }
                            try {
                                boolean bl2;
                                try {
                                    if (l11 <= 0L) break block16;
                                    bl2 = ((b0)((Object)callSite)).J();
                                    if (callSite2 == false) break block17;
                                    if (!bl2) break block15;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)n94, (long)-4006750558540959628L, (long)l11);
                                }
                                bl2 = set3.add((bn)((Object)m44.a("v", (Object)this, (long)-3640635574796332798L, (long)l11)));
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)n95, (long)-4006750558540959628L, (long)l11);
                            }
                        }
                        callSite = m44.a("v", (Object)this, (long)-3640635574796332798L, (long)l11);
                    }
                    _v2 = ((_4)((Object)callSite)).G(l12);
                    try {
                        boolean bl3;
                        block20: {
                            try {
                                try {
                                    jd2 = this;
                                    if (l11 < 0L) break block18;
                                    bl3 = ((b0)((Object)m44.a("v", (Object)jd2, (long)-3640635574796332798L, (long)l11))).D(l13);
                                    if (callSite2 == false) break block19;
                                    if (!bl3) break block20;
                                }
                                catch (n9 n96) {
                                    throw m44.a("h", (Object)n96, (long)-4006750558540959628L, (long)l11);
                                }
                                set2.add((_f)_v2);
                                if (callSite2 != false) break block15;
                            }
                            catch (n9 n97) {
                                throw m44.a("h", (Object)n97, (long)-4006750558540959628L, (long)l11);
                            }
                        }
                        bl3 = set.add((_f)_v2);
                    }
                    catch (n9 n98) {
                        throw m44.a("h", (Object)n98, (long)-4006750558540959628L, (long)l11);
                    }
                }
                jd2 = this;
            }
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l10;
            objectArray3[1] = set;
            objectArray3[0] = _v2;
            m44.a("i", (Object)jd2, (Object)objectArray3, (long)-3953461016395587399L, (long)l11);
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
                        jd.a = prr.a(3108316239056896547L, 6830050963674403565L, MethodHandles.lookup().lookupClass()).a(103703418359824L);
                        var20 = jd.a ^ 87552710320281L;
                        jd.j = new HashMap<K, V>(13);
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
                        var18_3 = new String[19];
                        var16_4 = 0;
                        var15_5 = "C\u00bb\u00d2},\u008d\u0098\u00e9\u0081k.uA\u00e9\u00c3\u00e3\u00e8\u00db\u00daG\u0091\u008e\u00c1\u0010\u00d9\u001f\u0018\u00e5\u0094pYz\u00b5\u0007j\u00ca\u00be\u00fc\u00bb>\u0010\u00e8\u009bxP5\u00dfoH7X\u00a0VTmN0\t\u00b0P\u0002ygk8\u00de\u00f8\u00e8\u0098\u000f5\u00a3R\u00ab\u0096\u001a[\u00a6\u008c\u00faNe\u00d8\u00fa]<\u0082\u00c9\u00ab_\u0092\u00e0\u00c9\u007fg\u0080\u0099\u001e\u00bf\u001e>%u*l\u00a0l\u00a4}\u00bd\u00b2\u0088\u001d\u0082\u0016e\u001c\u00dd\u0080{B\u0088\u00d9\u00af\u0002\u008c\u00cc!K\u00dc\u00bd\u00fd\u0095U\u00aa\u0092\u00b2ir\u001c\u00a9{\u00e2?\u0087S\u00df\u0010\u00c5\u009d\u00cc5\u00a8\u0017\u008a~\u00b5P\u001ak8\u00b0xr\u0011\u0093\u00c9KA\u00ec\u00e1Z\u00cc\u00a7\u00a4Y\u009c\u0089\u00b1\u009c;:1\u00af\u0095/\u00f1\u00a5\u0001P\u00b8\u00da\u00cb\u008e\u00eaG\u00e6D\u00f4\u00aa\u001e\u008f\u009e\t\u00d4\u00bfU,;j\u00b6\u00da]\u00f8\u00d2\u00c9k\u00be;\u00e9(\u00c4\u001b6D\u00b6a\u00b0.\u009c\u000f\u00b2y\u0011\u000b\u00e7\u00ee\u00b0\u0000,2\u00e3n}'\u00b8\u0002:%)\u000e\u00aa0\u00f9\u0005Y\u00aer \u00b7\u00e7\u00ea\u0097\u00c9\u00c0<\u00b7\\\u00e1dV'At\u00c0~\u00be\u00feZ\u0006woP\u00f6\u00a3\u001b8\u009b\u000b\u009a\u0081(3*\u0098\u00a4\u0002R\u00adn*0\u00bc\u0080Q\u008c\u00f4\u0080\u00b4\u007f\u0004\u00d2\u00ba\u00a1\u00bb\u0085\u00e3\u00ce\u00a4l$\u00a2\u0000OQ\u00a5\u001e11C\u00ae\u00b4 \u00beq\u00f5?+\u00fe\u00c8B\u00b6\u00d7-TM\u00af\u00c3\u001aW(\u00f9\u001a<k\u0081\u00f9\u00ee\u00c1\u00a2/\u0005\u009f\u008c>8\u0010\u00b1\u00b4\u00a9#?\u0090\u00b4ejhj\u00f90\u00972\u00eb\u00ec\u00b1\u009e\u00ed\u000b/+\u0088\u00d2\u00bb\u00fb\u007f\u008d%\u009f\u00e4V\u00f6~w\u00a7&\u00c3,$gK\u00b6W\u00d3\u009c\u0012\u009a\u001c\u00af\u001ft\u00d0](\u00f8\u00c0u\u00aa(N\u00ac\u00b1\u00e7\u008e\u00d7\u00db\u0019\u00a1\u008eLI\u0014\u00d5\u00bf&\u00c9\u0092\u00ec\u00f5i6\u00d5\u00e4X\u00d6\u00d2\u007f\u001d\u00ddt\u008f\u008b\u00cf:\u0010\u00a0\u00cfN\u00ee\u00dc\u0004\u00d3*\u00cc4;\u00a0\u0081mQ\u0012HO\u009a;\u0010\u0091\u00bf\u00e6\u001b\u0091\u00d2\u00c9\u0005\u00e2\u0002J$\u00f29*m\u00bc\u00d1Lsov\u00c3\u000f\u00e2\r-\u008c\u00ed\u0001\u00cb\u0084F\u00af\u008c\"\u00cb\u00ddHi&{\u0089\u00817\u00b1T\u00e7\u00da\u00f73\u0083a\u0004\u00barv_\u00c6\u0095\u00a5,D\u00e5\u00d3\u00fd*n\u0010\u00b6h\u00dc\u00e1\u008b\u001adA\u00b9\u0010.\u00b5\u00ba@L\u00c5@-\u00af\u0004\u00b6r\u00b1.9@\u00c4G\u00b4\u0019\u00f5>\u00e2\u00cd\u0018h\u009cfPcU\u001f\u008e\u0083E\u00b4\u0092\u00a3\\\u00c2\u00a3\u00da\u00e5\u00a5\u00ebx\u00a2\u00eb\u00eb\u0086\u00a9\u0080\u00bb\u00c0\u0005\u00f9\u00b3/}\u00e4f\u00f3\u00caK*2\u00ac\u0016\u0095\u00b4C \u0081l\u00ad8t\u00e6\u00e9@\u0081\u00cf&#s\u00b0\u000b\u0082L\u00db\u0098\u00ef\u00f2sW\u00df\u000f\u00f4&\u00ed\u00de\u00b6Y\u00da@\u0080\u00f2+\u00b0\u00f9\u0082\u00ef\u00a8\u00d6F\u00e4\u0085\u0087\u00e8\u008b\u00c08^}wA\u00b60\b~V\u00b2\u00c5\u0088vI\u000f\u00cahM\u008fn\u00c8\u00c5\u00f9\u00ae'a\u00c8\u0015n\u00a5\u00b9\u008c8\u00f8\u00bf\u00ee\u00a2\nU\u0010\u001c\u001f%i9\u00a2\u00ddHl\u008bi\u0001\u0098~\u00c2\u00e0$\f(I\u0002*;\u00f5\u00dd\u008e\u00b1e(gL\u00d3SO\u00e2F\u00be\u0095<\u00b7\u00c1`\u008cC\u00fcV\u00bf\u00a8l\u00d5?4\u00bc=\u0004\u0084w\u00dd\u00e0\u008f~[\u00ca\u00e0\u0088\u00a8\u009f\u00ffm\u0097\u00ff\u00fb\u009b/\u00b7>\u0088\u0017\u00ee\u00ac TF\u00dc\u00e1\u000b\u00ee\u00869\u009c@\u00e6\u0081E\u0010\u00d3\u00ae\u0096\u0083m_\u0091e&\u00e2\u00cd\u00e1\u0082\u00adx/\u00f08(\u0089\u00c4<\u00cbtm\u00b2K\u00ceS\u00e7\u00ffb \u0083\u008e^\u0012\u00fdm\u00e9\u000f\u0099@\u00c0\u00b6\u00da\u00ac]A\u00fbx\u0084:jL\u0016\u0002\u00fd\u0094";
                        var17_6 = "C\u00bb\u00d2},\u008d\u0098\u00e9\u0081k.uA\u00e9\u00c3\u00e3\u00e8\u00db\u00daG\u0091\u008e\u00c1\u0010\u00d9\u001f\u0018\u00e5\u0094pYz\u00b5\u0007j\u00ca\u00be\u00fc\u00bb>\u0010\u00e8\u009bxP5\u00dfoH7X\u00a0VTmN0\t\u00b0P\u0002ygk8\u00de\u00f8\u00e8\u0098\u000f5\u00a3R\u00ab\u0096\u001a[\u00a6\u008c\u00faNe\u00d8\u00fa]<\u0082\u00c9\u00ab_\u0092\u00e0\u00c9\u007fg\u0080\u0099\u001e\u00bf\u001e>%u*l\u00a0l\u00a4}\u00bd\u00b2\u0088\u001d\u0082\u0016e\u001c\u00dd\u0080{B\u0088\u00d9\u00af\u0002\u008c\u00cc!K\u00dc\u00bd\u00fd\u0095U\u00aa\u0092\u00b2ir\u001c\u00a9{\u00e2?\u0087S\u00df\u0010\u00c5\u009d\u00cc5\u00a8\u0017\u008a~\u00b5P\u001ak8\u00b0xr\u0011\u0093\u00c9KA\u00ec\u00e1Z\u00cc\u00a7\u00a4Y\u009c\u0089\u00b1\u009c;:1\u00af\u0095/\u00f1\u00a5\u0001P\u00b8\u00da\u00cb\u008e\u00eaG\u00e6D\u00f4\u00aa\u001e\u008f\u009e\t\u00d4\u00bfU,;j\u00b6\u00da]\u00f8\u00d2\u00c9k\u00be;\u00e9(\u00c4\u001b6D\u00b6a\u00b0.\u009c\u000f\u00b2y\u0011\u000b\u00e7\u00ee\u00b0\u0000,2\u00e3n}'\u00b8\u0002:%)\u000e\u00aa0\u00f9\u0005Y\u00aer \u00b7\u00e7\u00ea\u0097\u00c9\u00c0<\u00b7\\\u00e1dV'At\u00c0~\u00be\u00feZ\u0006woP\u00f6\u00a3\u001b8\u009b\u000b\u009a\u0081(3*\u0098\u00a4\u0002R\u00adn*0\u00bc\u0080Q\u008c\u00f4\u0080\u00b4\u007f\u0004\u00d2\u00ba\u00a1\u00bb\u0085\u00e3\u00ce\u00a4l$\u00a2\u0000OQ\u00a5\u001e11C\u00ae\u00b4 \u00beq\u00f5?+\u00fe\u00c8B\u00b6\u00d7-TM\u00af\u00c3\u001aW(\u00f9\u001a<k\u0081\u00f9\u00ee\u00c1\u00a2/\u0005\u009f\u008c>8\u0010\u00b1\u00b4\u00a9#?\u0090\u00b4ejhj\u00f90\u00972\u00eb\u00ec\u00b1\u009e\u00ed\u000b/+\u0088\u00d2\u00bb\u00fb\u007f\u008d%\u009f\u00e4V\u00f6~w\u00a7&\u00c3,$gK\u00b6W\u00d3\u009c\u0012\u009a\u001c\u00af\u001ft\u00d0](\u00f8\u00c0u\u00aa(N\u00ac\u00b1\u00e7\u008e\u00d7\u00db\u0019\u00a1\u008eLI\u0014\u00d5\u00bf&\u00c9\u0092\u00ec\u00f5i6\u00d5\u00e4X\u00d6\u00d2\u007f\u001d\u00ddt\u008f\u008b\u00cf:\u0010\u00a0\u00cfN\u00ee\u00dc\u0004\u00d3*\u00cc4;\u00a0\u0081mQ\u0012HO\u009a;\u0010\u0091\u00bf\u00e6\u001b\u0091\u00d2\u00c9\u0005\u00e2\u0002J$\u00f29*m\u00bc\u00d1Lsov\u00c3\u000f\u00e2\r-\u008c\u00ed\u0001\u00cb\u0084F\u00af\u008c\"\u00cb\u00ddHi&{\u0089\u00817\u00b1T\u00e7\u00da\u00f73\u0083a\u0004\u00barv_\u00c6\u0095\u00a5,D\u00e5\u00d3\u00fd*n\u0010\u00b6h\u00dc\u00e1\u008b\u001adA\u00b9\u0010.\u00b5\u00ba@L\u00c5@-\u00af\u0004\u00b6r\u00b1.9@\u00c4G\u00b4\u0019\u00f5>\u00e2\u00cd\u0018h\u009cfPcU\u001f\u008e\u0083E\u00b4\u0092\u00a3\\\u00c2\u00a3\u00da\u00e5\u00a5\u00ebx\u00a2\u00eb\u00eb\u0086\u00a9\u0080\u00bb\u00c0\u0005\u00f9\u00b3/}\u00e4f\u00f3\u00caK*2\u00ac\u0016\u0095\u00b4C \u0081l\u00ad8t\u00e6\u00e9@\u0081\u00cf&#s\u00b0\u000b\u0082L\u00db\u0098\u00ef\u00f2sW\u00df\u000f\u00f4&\u00ed\u00de\u00b6Y\u00da@\u0080\u00f2+\u00b0\u00f9\u0082\u00ef\u00a8\u00d6F\u00e4\u0085\u0087\u00e8\u008b\u00c08^}wA\u00b60\b~V\u00b2\u00c5\u0088vI\u000f\u00cahM\u008fn\u00c8\u00c5\u00f9\u00ae'a\u00c8\u0015n\u00a5\u00b9\u008c8\u00f8\u00bf\u00ee\u00a2\nU\u0010\u001c\u001f%i9\u00a2\u00ddHl\u008bi\u0001\u0098~\u00c2\u00e0$\f(I\u0002*;\u00f5\u00dd\u008e\u00b1e(gL\u00d3SO\u00e2F\u00be\u0095<\u00b7\u00c1`\u008cC\u00fcV\u00bf\u00a8l\u00d5?4\u00bc=\u0004\u0084w\u00dd\u00e0\u008f~[\u00ca\u00e0\u0088\u00a8\u009f\u00ffm\u0097\u00ff\u00fb\u009b/\u00b7>\u0088\u0017\u00ee\u00ac TF\u00dc\u00e1\u000b\u00ee\u00869\u009c@\u00e6\u0081E\u0010\u00d3\u00ae\u0096\u0083m_\u0091e&\u00e2\u00cd\u00e1\u0082\u00adx/\u00f08(\u0089\u00c4<\u00cbtm\u00b2K\u00ceS\u00e7\u00ffb \u0083\u008e^\u0012\u00fdm\u00e9\u000f\u0099@\u00c0\u00b6\u00da\u00ac]A\u00fbx\u0084:jL\u0016\u0002\u00fd\u0094".length();
                        var14_7 = 64;
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
                            var18_3[var16_4++] = jd.c(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\nz\u00d8\u00d3\u00a24\u00f9\u00f5\u0090t\u00fa\u00d3:J\u008f\u009d\u00e9fl\n-\t\u00e4\u00d8\u0084&=\u0012\u00c8\u00f8\u00b7.\u0088\u009ezh\u00f5\u0099\u00cc\u00ad\u0081\u00afE^;\u00df$\u00a4\u00e1\u00aa'\u00aab[\u001f#\u00bb\u00b9Q\u0017\u00c1M\u0006G0\u00acp\u00f1$Bl\u00f1\u00ce:[U\u00a1(\u0084\u00c4\u00a3\u00c1>\u00d1\u00e9\u00c2\u00cb\u00c9\u009b\u00ccvM\u007f\u0003(\u00e5\u000b\u0095\u0086\u0005{h\u00c0\u00f5_S*ww9*\u00f7K";
                            var17_6 = "\nz\u00d8\u00d3\u00a24\u00f9\u00f5\u0090t\u00fa\u00d3:J\u008f\u009d\u00e9fl\n-\t\u00e4\u00d8\u0084&=\u0012\u00c8\u00f8\u00b7.\u0088\u009ezh\u00f5\u0099\u00cc\u00ad\u0081\u00afE^;\u00df$\u00a4\u00e1\u00aa'\u00aab[\u001f#\u00bb\u00b9Q\u0017\u00c1M\u0006G0\u00acp\u00f1$Bl\u00f1\u00ce:[U\u00a1(\u0084\u00c4\u00a3\u00c1>\u00d1\u00e9\u00c2\u00cb\u00c9\u009b\u00ccvM\u007f\u0003(\u00e5\u000b\u0095\u0086\u0005{h\u00c0\u00f5_S*ww9*\u00f7K".length();
                            var14_7 = 64;
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
                            var18_3[var16_4++] = jd.c(var19_9).intern();
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
                jd.g = var18_3;
                jd.i = new String[19];
                jd.q = new HashMap<K, V>(13);
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
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "e\u00c4\u00c2\u00dfy\u00c4\u0097\u0083F.<\u00c1\u0092\r\u001a}K\u000e\u00a3R\u00a2\u00b4\u0091o\u0080\u0096\u0002\u00ca\u00cbH\u0095\u00cc";
                var5_15 = "e\u00c4\u00c2\u00dfy\u00c4\u0097\u0083F.<\u00c1\u0092\r\u001a}K\u000e\u00a3R\u00a2\u00b4\u0091o\u0080\u0096\u0002\u00ca\u00cbH\u0095\u00cc".length();
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
                    var4_14 = "z\u0096\u00c3\u00ed\u009e\u00a9\u0093I\u009eJ\u00db{\u00f6P\u00e0\u00d4";
                    var5_15 = "z\u0096\u00c3\u00ed\u009e\u00a9\u0093I\u009eJ\u00db{\u00f6P\u00e0\u00d4".length();
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
        jd.o = var6_12;
        jd.p = new Integer[6];
        jd.Q = m44.a("j", (long)-458801889776261137L, (long)var20);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void E(Object[] var1_1) {
        block16: {
            block18: {
                block17: {
                    block15: {
                        var4_2 = (Set)var1_1[0];
                        var2_3 = (Set)var1_1[1];
                        var7_4 = (Set)var1_1[2];
                        var5_5 = (Long)var1_1[3];
                        var3_6 = (Set)var1_1[4];
                        v0 = var5_5;
                        var8_7 = v0 ^ 16039365994762L;
                        var10_8 = v0 ^ 52567231321928L;
                        var12_9 = v0 ^ 129051528125716L;
                        var14_10 = v0 ^ 135322747468873L;
                        var16_11 = v0 ^ 0L;
                        var18_12 = v0 ^ 39282596256961L;
                        v1 = m44.a("j", (long)3863795904545444730L, (long)var5_5);
                        v2 = new Object[5];
                        v2[4] = var3_6;
                        v2[3] = var16_11;
                        v2[2] = var7_4;
                        v2[1] = var2_3;
                        v2[0] = var4_2;
                        super.E(v2);
                        var20_13 = v1;
                        try {
                            try {
                                v3 = m44.a("t", (Object)this, (long)3572452937654382056L, (long)var5_5);
                                if (var20_13 != false) break block15;
                                if (v3 == null) break block16;
                            }
                            catch (n9 v4) {
                                throw m44.a("j", (Object)v4, (long)3787267421043985566L, (long)var5_5);
                            }
                            var3_6.add(m44.a("t", (Object)this, (long)3572452937654382056L, (long)var5_5));
                            v3 = m44.a("t", (Object)this, (long)3572452937654382056L, (long)var5_5);
                        }
                        catch (n9 v5) {
                            throw m44.a("j", (Object)v5, (long)3787267421043985566L, (long)var5_5);
                        }
                    }
                    var21_14 = v3.G(var14_10);
                    try {
                        try {
                            v6 = l62.r(var18_12, var21_14.h(var12_9));
                            v7 = var20_13;
                            if (var5_5 >= 0L) {
                                if (v7 != false) break block17;
                                if (v6) break block16;
                            }
                            ** GOTO lbl62
                        }
                        catch (n9 v8) {
                            throw m44.a("j", (Object)v8, (long)3787267421043985566L, (long)var5_5);
                        }
                        v6 = m44.a("t", (Object)this, (long)3572452937654382056L, (long)var5_5).D(var8_7);
                    }
                    catch (n9 v9) {
                        throw m44.a("j", (Object)v9, (long)3787267421043985566L, (long)var5_5);
                    }
                }
                try {
                    block19: {
                        try {
                            try {
                                v7 = var20_13;
lbl62:
                                // 2 sources

                                if (v7 != false) break block18;
                                if (!v6) break block19;
                            }
                            catch (n9 v10) {
                                throw m44.a("j", (Object)v10, (long)3787267421043985566L, (long)var5_5);
                            }
                            var2_3.add((_f)var21_14);
                            if (var20_13 == false) break block16;
                        }
                        catch (n9 v11) {
                            throw m44.a("j", (Object)v11, (long)3787267421043985566L, (long)var5_5);
                        }
                    }
                    v6 = var4_2.add(var21_14);
                }
                catch (n9 v12) {
                    throw m44.a("j", (Object)v12, (long)3787267421043985566L, (long)var5_5);
                }
            }
            v13 = new Object[3];
            v13[2] = var10_8;
            v13[1] = var4_2;
            v13[0] = var21_14;
            m44.a("k", (Object)this, (Object)v13, (long)3875424556001729619L, (long)var5_5);
        }
    }

    /*
     * Exception decompiling
     */
    private b1 L(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[UNCONDITIONALDOLOOP]], but top level block is 26[WHILELOOP]
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

    final void c(Object[] objectArray) {
        block12: {
            String string;
            long l10;
            long l11;
            block13: {
                CallSite callSite;
                CallSite callSite2;
                long l12;
                long l13;
                block11: {
                    lqu lqu2 = (lqu)objectArray[0];
                    l11 = (Long)objectArray[1];
                    long l14 = l11 = a ^ l11;
                    l13 = l14 ^ 0x669BACD73458L;
                    l10 = l14 ^ 0x1CD0804D44A1L;
                    l12 = l14 ^ 0x307EBB98F58DL;
                    callSite2 = m44.a("n", (long)-2534710598271190474L, (long)l11);
                    try {
                        try {
                            callSite = m44.a("p", (Object)this, (long)-2819265734375750492L, (long)l11);
                            if (callSite2 != false) break block11;
                            if (callSite == null) break block12;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-2467127741941127726L, (long)l11);
                        }
                        callSite = m44.a("p", (Object)this, (long)-2819265734375750492L, (long)l11);
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)-2467127741941127726L, (long)l11);
                    }
                }
                String string2 = ((_4)((Object)callSite)).h(l13);
                try {
                    try {
                        string = string2;
                        if (callSite2 != false) break block13;
                        if (l62.r(l12, string)) break block12;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)n94, (long)-2467127741941127726L, (long)l11);
                    }
                    string = ((xb)((Object)m44.a("p", (Object)this, (long)-2828833389277550531L, (long)l11))).A();
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)n95, (long)-2467127741941127726L, (long)l11);
                }
            }
            String string3 = string;
            String string4 = ((b1)((Object)m44.a("p", (Object)this, (long)-2819265734375750492L, (long)l11))).Z(l10);
            try {
                if (l11 >= 0L && !string3.equals(string4)) {
                    m44.a("q", (Object)m44.a("p", (Object)this, (long)-2828833389277550531L, (long)l11), (Object)new Object[]{string4}, (long)-4532779464974963683L, (long)l11);
                }
            }
            catch (n9 n96) {
                throw m44.a("n", (Object)n96, (long)-2467127741941127726L, (long)l11);
            }
        }
    }

    public b1 a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)7897447686828140135L, (long)l10);
    }

    @Override
    public String W(long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0x6FA0BD110D4L;
        long l13 = l11 ^ 0L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        return ((xb)((Object)m44.a("v", (Object)this, (long)2041229162158370003L, (long)l10))).W(l13) + (char)jd.f("k", (int)30278, (long)(0x12850BCE6E2CFFC0L ^ l10)) + (String)((Object)m44.a("w", (Object)this.L, (Object)objectArray, (long)117801978142263041L, (long)l10));
    }

    public jd(int n10, to to2, char c10, int n11, short s10, xb xb2, int n12) {
        long l10 = ((long)c10 << 48 | (long)s10 << 48 >>> 16 | (long)n12 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x309F0F171EA6L;
        super(n10, to2, n11, xb2, l11);
    }

    public b1 O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("r", (Object)this, (long)1692775808612469510L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
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

    private static String c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x72A0;
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
                throw new RuntimeException("com/zelix/jd", exception);
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
            jd.i[n11] = jd.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n11];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = jd.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/jd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int f(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x502;
        if (p[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = o[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/jd", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jd.p[n11] = n12;
        }
        return p[n11];
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = jd.f(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/jd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jd.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(jd.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

