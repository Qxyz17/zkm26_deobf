/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e_;
import com.zelix.hl6;
import com.zelix.lqu;
import com.zelix.lup;
import com.zelix.luy;
import com.zelix.m44;
import com.zelix.mh;
import com.zelix.n9;
import com.zelix.oq;
import com.zelix.prr;
import com.zelix.sp;
import com.zelix.t3;
import com.zelix.t9;
import com.zelix.wa;
import com.zelix.wc;
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

public class oo
extends oq {
    hl6 V;
    private static final long b;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    void A(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        wa wa2 = (wa)objectArray[2];
        sp sp2 = (sp)objectArray[3];
        e_ e_2 = (e_)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3F09FA3656F9L;
        long l4 = l2 ^ 0x34129E767DDBL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = oo.b("p", (int)20320, (long)(0x11FEA73AC378FE88L ^ l));
        new t3(string, (String)((Object)m44.a("o", (Object)objectArray2, (long)1305427269301848259L, (long)l)), wa2, sp2, (wc)m44.a("q", (Object)((Object)this), (long)1463736035736659418L, (long)l), (lqu)m44.a("q", (Object)((Object)this), (long)1373835105832108140L, (long)l), l4, e_2);
    }

    public oo(long l, wa wa2, mh mh2, lqu lqu2) {
        long l2 = (l = b ^ l) ^ 0x6F9404BC6C5FL;
        super(wa2, mh2, l2, lqu2);
    }

    String L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return oo.b("p", (int)13598, (long)(0x19CD820EE3092550L ^ l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void v(Object[] var1_1) {
        block15: {
            block14: {
                block13: {
                    var5_2 = (sp)var1_1[0];
                    var2_3 = (Integer)var1_1[1];
                    var3_4 = (Long)var1_1[2];
                    v0 = var3_4;
                    var6_5 = v0 ^ 5306884251879L;
                    var8_6 = v0 ^ 68414551188647L;
                    var10_7 = v0 ^ 72095034786736L;
                    var12_8 = v0 ^ 62945987187989L;
                    var14_9 = v0 ^ 28803408300540L;
                    var17_10 = var2_3;
                    var16_11 = m44.a("h", (long)-8920212955863256379L, (long)var3_4);
                    try {
                        try {
                            try {
                                v1 /* !! */  = var17_10;
                                v2 = 1;
                                if (var16_11 != null) break block13;
                                if (v1 /* !! */  == v2) {
                                }
                                ** GOTO lbl75
                            }
                            catch (n9 v3) {
                                throw m44.a("h", (Object)v3, (long)-7168847797692128201L, (long)var3_4);
                            }
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)-7104554076438338393L, (long)var3_4), (Object)m44.a("l", (long)-9005510671784585928L, (long)var3_4), (Object)oo.b("p", (int)15660, (long)(1628141999598274271L ^ var3_4)), (long)-7106722452964058734L, (long)var3_4);
                            v4 = this;
                            if (var3_4 <= 0L || var16_11 != null) break block14;
                        }
                        catch (n9 v5) {
                            throw m44.a("h", (Object)v5, (long)-7168847797692128201L, (long)var3_4);
                        }
                        v1 /* !! */  = (int)m44.a("v", (Object)m44.a("v", (Object)v4, (long)-7104554076438338393L, (long)var3_4), (long)-8776365574995407146L, (long)var3_4);
                        v2 = 1;
                    }
                    catch (n9 v6) {
                        throw m44.a("h", (Object)v6, (long)-7168847797692128201L, (long)var3_4);
                    }
                }
                if (v1 /* !! */  != v2) ** GOTO lbl50
                var18_12 = new luy(this);
                try {
                    block16: {
                        v7 = new Object[4];
                        v7[3] = var18_12;
                        v7[2] = var6_5;
                        v7[1] = m44.a("v", (Object)this, (long)-8669147681923621474L, (long)var3_4);
                        v7[0] = oo.b("p", (int)28910, (long)(6029407200480578330L ^ var3_4));
                        m44.a("w", (Object)this, (Object)v7, (long)-6920102985514655710L, (long)var3_4);
                        if (var3_4 >= 0L) {
                            if (var16_11 == null) break block15;
                        }
                        break block16;
lbl50:
                        // 2 sources

                        m44.a("t", (Object)this, null, (long)-9004103037471920397L, (long)var3_4);
                        v8 = new Object[1];
                        v8[0] = var8_6;
                        m44.a("w", (Object)this, (Object)v8, (long)-8730394178871589131L, (long)var3_4);
                    }
                    v4 = this;
                }
                catch (n9 v9) {
                    throw m44.a("h", (Object)v9, (long)-7168847797692128201L, (long)var3_4);
                }
            }
            try {
                v10 = new Object[1];
                v10[0] = var12_8;
                v11 = new Object[6];
                v11[5] = null;
                v11[4] = var14_9;
                v11[3] = m44.a("v", (Object)this, (long)-7417442015414449549L, (long)var3_4);
                v11[2] = m44.a("v", (Object)this, (long)-7104554076438338393L, (long)var3_4);
                v11[1] = null;
                v11[0] = m44.a("w", (Object)m44.a("v", (Object)this, (long)-7039380900932866107L, (long)var3_4), (Object)v10, (long)-7448067627642248501L, (long)var3_4);
                m44.a("w", (Object)m44.a("v", (Object)v4, (long)-8669147681923621474L, (long)var3_4), (Object)v11, (long)-7437543257256384049L, (long)var3_4);
                if (var3_4 < 0L || var16_11 == null) break block15;
lbl75:
                // 2 sources

                v12 = new Object[1];
                v12[0] = var10_7;
                m44.a("w", (Object)this, (Object)v12, (long)-9035294082523232313L, (long)var3_4);
            }
            catch (n9 v13) {
                throw m44.a("h", (Object)v13, (long)-7168847797692128201L, (long)var3_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void Z(Object[] var1_1) {
        block24: {
            block26: {
                block25: {
                    block19: {
                        block23: {
                            block20: {
                                block21: {
                                    block22: {
                                        var2_2 = (Long)var1_1[0];
                                        var4_3 = (Integer)var1_1[1];
                                        v0 = var2_2 = oo.b ^ var2_2;
                                        var5_4 = v0 ^ 80938445694479L;
                                        var7_5 = v0 ^ 92166986074295L;
                                        var9_6 = v0 ^ 33657097829695L;
                                        var11_7 = v0 ^ 93276158212357L;
                                        var13_8 = v0 ^ 131770093266412L;
                                        var15_9 = v0 ^ 46164846823342L;
                                        var18_10 = var4_3;
                                        v1 = m44.a("h", (long)-1718857208804106539L, (long)var2_2);
                                        v2 = new Object[3];
                                        v2[2] = oo.b("p", (int)14361, (long)(8022065445104578549L ^ var2_2));
                                        v2[1] = m44.a("l", (long)-1218907408232335064L, (long)var2_2);
                                        v2[0] = var9_6;
                                        m44.a("w", (Object)m44.a("v", (Object)this, (long)-1217500134400982301L, (long)var2_2), (Object)v2, (long)-1142215255671861731L, (long)var2_2);
                                        var17_11 = v1;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v3 = var18_10;
                                                        v4 = 1;
                                                        if (var17_11 != null) break block19;
                                                        if (v3 == v4) {
                                                        }
                                                        ** GOTO lbl78
                                                    }
                                                    catch (n9 v5) {
                                                        throw m44.a("h", (Object)v5, (long)-1111457807438559193L, (long)var2_2);
                                                    }
                                                    v6 = new Object[1];
                                                    v6[0] = var7_5;
                                                    m44.a("w", (Object)this, (Object)v6, (long)-1529247682780271899L, (long)var2_2);
                                                    v7 = m44.a("v", (Object)this, (long)-1467771095838297714L, (long)var2_2);
                                                    v8 = new Object[1];
                                                    v8[0] = var11_7;
                                                    v9 = m44.a("w", (Object)m44.a("v", (Object)this, (long)-981936762147814443L, (long)var2_2), (Object)v8, (long)-814227813765853477L, (long)var2_2);
                                                    v10 = m44.a("v", (Object)this, (long)-1217500134400982301L, (long)var2_2);
                                                    v11 = var17_11;
                                                    if (var2_2 < 0L) break block20;
                                                    if (v11 != null) break block21;
                                                }
                                                catch (n9 v12) {
                                                    throw m44.a("h", (Object)v12, (long)-1111457807438559193L, (long)var2_2);
                                                }
                                                if (v10 != null) break block22;
                                            }
                                            catch (n9 v13) {
                                                throw m44.a("h", (Object)v13, (long)-1111457807438559193L, (long)var2_2);
                                            }
                                            v14 = null;
                                            break block23;
                                        }
                                        catch (n9 v15) {
                                            throw m44.a("h", (Object)v15, (long)-1111457807438559193L, (long)var2_2);
                                        }
                                    }
                                    v10 = m44.a("v", (Object)this, (long)-1217500134400982301L, (long)var2_2);
                                }
                                v16 = new Object[1];
                                v11 = v16;
                                v16[0] = var11_7;
                            }
                            v14 = m44.a("w", (Object)v10, (Object)v11, (long)-814227813765853477L, (long)var2_2);
                        }
                        try {
                            v17 = new Object[6];
                            v17[5] = null;
                            v17[4] = var13_8;
                            v17[3] = m44.a("v", (Object)this, (long)-783733936905230749L, (long)var2_2);
                            v17[2] = m44.a("v", (Object)this, (long)-1047121686238558025L, (long)var2_2);
                            v17[1] = v14;
                            v17[0] = v9;
                            m44.a("w", (Object)v7, (Object)v17, (long)-803641593699252769L, (long)var2_2);
                            if (var17_11 == null) break block24;
lbl78:
                            // 2 sources

                            v3 = var18_10;
                            v4 = 2;
                        }
                        catch (n9 v18) {
                            throw m44.a("h", (Object)v18, (long)-1111457807438559193L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            if (var17_11 != null) break block25;
                            if (v3 == v4) break block26;
                        }
                        catch (n9 v19) {
                            throw m44.a("h", (Object)v19, (long)-1111457807438559193L, (long)var2_2);
                        }
                        v3 = var18_10;
                        v4 = 5;
                    }
                    catch (n9 v20) {
                        throw m44.a("h", (Object)v20, (long)-1111457807438559193L, (long)var2_2);
                    }
                }
                if (v3 != v4) break block24;
            }
            var19_12 = new lup(this);
            v21 = new Object[1];
            v21[0] = var15_9;
            v22 = new Object[5];
            v22[4] = var19_12;
            v22[3] = m44.a("v", (Object)this, (long)-1047121686238558025L, (long)var2_2);
            v22[2] = m44.a("v", (Object)this, (long)-1467771095838297714L, (long)var2_2);
            v22[1] = var5_4;
            v22[0] = (String)oo.b("p", (int)2054, (long)(4248159663260688356L ^ var2_2)) + (String)m44.a("w", (Object)this, (Object)v21, (long)-1382729106315569244L, (long)var2_2) + (String)oo.b("p", (int)18490, (long)(2420073128636489691L ^ var2_2));
            m44.a("w", (Object)this, (Object)v22, (long)-772096008105436197L, (long)var2_2);
        }
    }

    void W(Object[] objectArray) {
        String string = (String)objectArray[0];
        wa wa2 = (wa)objectArray[1];
        long l = (Long)objectArray[2];
        e_ e_2 = (e_)objectArray[3];
        long l2 = (l = b ^ l) ^ 0x6B9AA6769FA9L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        m44.a("s", (Object)((Object)this), (hl6)m44.a("o", (Object)m44.a("k", (long)-2460492295877162009L, (long)l), (Object)oo.b("p", (int)18263, (long)(0x4D75732A60C1A27DL ^ l)), (long)-2353146223058527023L, (long)l), (long)-2461899492403040212L, (long)l);
        new t9(string, wa2, (hl6)m44.a("q", (Object)((Object)this), (long)-2461899492403040212L, (long)l), (short)n, n2, (lqu)m44.a("q", (Object)((Object)this), (long)-4048560952314407764L, (long)l), e_2, 3, (char)n3);
    }

    static /* synthetic */ void Q(Object[] objectArray) {
        oo oo2 = (oo)((Object)objectArray[0]);
        long l = (Long)objectArray[1];
        Integer n = (Integer)objectArray[2];
        long l2 = (l = b ^ l) ^ 0xC0CDE337601L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = n;
        objectArray2[0] = l2;
        m44.a("h", (Object)((Object)oo2), (Object)objectArray2, (long)-6420360921935324483L, (long)l);
    }

    String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return oo.b("p", (int)12484, (long)(0x3337B01AFBAC6515L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                oo.b = prr.a((long)-5166084579052951076L, (long)-219207718572766721L, MethodHandles.lookup().lookupClass()).a(140636999684231L);
                oo.i = new HashMap<K, V>(13);
                var0 = oo.b ^ 66168466892084L;
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
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "\u00d5\bt\u0006L\u00de\u00b4\u00d7\u00e3k\u00f0\u00ff\u00e8 ,\u00fe\u0017+\u0007\u00da\u00c7_\f\u009b\u0007/6\n$\u00ba\u00c2\u00f6 G\u00d3\u00ff\u00c3\u00f6\u0087f\u0016\u0097<K\u0080\u00a360\u00fa\u00f1\u00bce\u00e4\u001bV\u00de\u00d58s7\u00d8\u001e\u00d7ql\u00be\u00a1*\u00bd\u00d8\u00193\u009b<+\u00f5a[*\u00a2\u00a8bh\u00a3'\u00cfG\u0093\u0018\u0015g\u00daS\u0082]\u00ade\u0002\u0085\u00ee\u0011p\u0090\u00f3\u009d\u0080\u00f9\u009d&!\u0094\u009bE \u0099\u008f2\u0016\u00be\r\u00c1\u00d3\u00ce\f3\u00d9Z\u00e7\\_-\u00b5\u0013\u0089;\u00a6\u00bf4\u009e0\u0096\u0011\u00dd6\u000f\u00a7(\u0013\u008a\u00ccS\u00ff@\u00c3\u0083v\u0099\u00a5D\u0015\u00e5\u0011\u00f5X\u00f5\u00aa\u0002\u0092\u0001\u009e\u00d1\u00daN\u00c3\u00a0\u008f\u009bBc\u00e2\u0003\u00b6\u00f2\u001e\u00b9\u00ac\u00c8\u00184\u00e0\u00cfz\u0002\t[\u00be2\u00c6\u0092\u00b1\b\u001e\u0000\b5i\u00a2\u00f2\u0099*\u00bb\u00a4 \u00947O\u00c3\u00e7\u00dd\f\u0095\u0016\u00e3rj%\u008b@\u0001G\u00e1-#M\u00eb\u00b1\u00cb\u00e6\u0098\u0090\u00c5\u00a6y\u00972 s\u00da\u009d\u00c4\u00ebY\u008dx\u00e4\u00be\u00f1.p9\u0083\u00ce\u000f?/\u00a6\u00b8\u0006C11!\u00a1\u00cd\u00a0\u00ca_\u00bb";
                var8_6 = "\u00d5\bt\u0006L\u00de\u00b4\u00d7\u00e3k\u00f0\u00ff\u00e8 ,\u00fe\u0017+\u0007\u00da\u00c7_\f\u009b\u0007/6\n$\u00ba\u00c2\u00f6 G\u00d3\u00ff\u00c3\u00f6\u0087f\u0016\u0097<K\u0080\u00a360\u00fa\u00f1\u00bce\u00e4\u001bV\u00de\u00d58s7\u00d8\u001e\u00d7ql\u00be\u00a1*\u00bd\u00d8\u00193\u009b<+\u00f5a[*\u00a2\u00a8bh\u00a3'\u00cfG\u0093\u0018\u0015g\u00daS\u0082]\u00ade\u0002\u0085\u00ee\u0011p\u0090\u00f3\u009d\u0080\u00f9\u009d&!\u0094\u009bE \u0099\u008f2\u0016\u00be\r\u00c1\u00d3\u00ce\f3\u00d9Z\u00e7\\_-\u00b5\u0013\u0089;\u00a6\u00bf4\u009e0\u0096\u0011\u00dd6\u000f\u00a7(\u0013\u008a\u00ccS\u00ff@\u00c3\u0083v\u0099\u00a5D\u0015\u00e5\u0011\u00f5X\u00f5\u00aa\u0002\u0092\u0001\u009e\u00d1\u00daN\u00c3\u00a0\u008f\u009bBc\u00e2\u0003\u00b6\u00f2\u001e\u00b9\u00ac\u00c8\u00184\u00e0\u00cfz\u0002\t[\u00be2\u00c6\u0092\u00b1\b\u001e\u0000\b5i\u00a2\u00f2\u0099*\u00bb\u00a4 \u00947O\u00c3\u00e7\u00dd\f\u0095\u0016\u00e3rj%\u008b@\u0001G\u00e1-#M\u00eb\u00b1\u00cb\u00e6\u0098\u0090\u00c5\u00a6y\u00972 s\u00da\u009d\u00c4\u00ebY\u008dx\u00e4\u00be\u00f1.p9\u0083\u00ce\u000f?/\u00a6\u00b8\u0006C11!\u00a1\u00cd\u00a0\u00ca_\u00bb".length();
                var5_7 = 88;
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
                    var9_3[var7_4++] = oo.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "z\u0010t\u00fe\u00b1.pZ\u00cb\u00be\u0014\u00d5\u00eb\u00de\u00bf\u00f9\u00e2\u00ab\u00bax\u00af\u00ad\u00ba<\u00ec\u00f1\u0016v\u0014\u00a3\u0083T 8J~W.\u00d7\u00ab2@\u009a2\u00c0\u009f\u008b\tOC\u00ca\u0085\\W\u0080\u00b0\u0080\u0099{\u00c4\u00faB(\u00ca\\";
                    var8_6 = "z\u0010t\u00fe\u00b1.pZ\u00cb\u00be\u0014\u00d5\u00eb\u00de\u00bf\u00f9\u00e2\u00ab\u00bax\u00af\u00ad\u00ba<\u00ec\u00f1\u0016v\u0014\u00a3\u0083T 8J~W.\u00d7\u00ab2@\u009a2\u00c0\u009f\u008b\tOC\u00ca\u0085\\W\u0080\u00b0\u0080\u0099{\u00c4\u00faB(\u00ca\\".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = oo.b(var10_9).intern();
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
        oo.g = var9_3;
        oo.h = new String[9];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x364B;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/oo", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            oo.h[n2] = oo.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = oo.b(n, l);
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
            throw new RuntimeException("com/zelix/oo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(oo.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
