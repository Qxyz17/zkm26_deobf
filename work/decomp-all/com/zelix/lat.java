/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lwr;
import com.zelix.lyn;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class lat
extends lyn {
    protected Map z;
    protected List x;
    private static final long e;
    private static final String[] g;
    private static final String[] k;
    private static final Map n;

    public lat(int n, long l) {
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x7DF063CA1A6FL;
        long l4 = l2 ^ 0x5AA23C1D1252L;
        super(l4, n);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("v", (Object)((Object)this), (Map)((Object)m44.a("j", (Object)objectArray, (long)-140746200126547223L, (long)l)), (long)-240702196207340383L, (long)l);
        m44.a("v", (Object)((Object)this), new ArrayList(), (long)-397187787584847253L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void M(Object[] var1_1) {
        block26: {
            var3_2 = (lmu)var1_1[0];
            var2_3 = (lqu)var1_1[1];
            var4_4 = (Long)var1_1[2];
            v0 = var4_4;
            var6_5 = v0 ^ 74673965963454L;
            var8_6 = v0 ^ 35290282468871L;
            var10_7 = v0 ^ 118799605427389L;
            var12_8 = v0 ^ 73361623401025L;
            var14_9 = v0 ^ 92627367142236L;
            var16_10 = v0 ^ 110986372930106L;
            var18_11 = v0 ^ 70974204760313L;
            var20_12 = v0 ^ 29166006246517L;
            var22_13 = v0 ^ 48832956100528L;
            var24_14 = v0 ^ 78419313187334L;
            var26_15 = v0 ^ 0L;
            var28_16 = v0 ^ 37188522365585L;
            v1 = new Object[1];
            v1[0] = var24_14;
            var31_17 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var4_4);
            var30_18 = m44.a("h", (long)-5113628074367501874L, (long)var4_4);
            v2 = new Object[1];
            v2[0] = var22_13;
            var32_19 = m44.a("w", (Object)var2_3, (Object)v2, (long)-6410373196425327712L, (long)var4_4);
            v3 = new Object[1];
            v3[0] = var6_5;
            var33_20 = m44.a("w", (Object)var2_3, (Object)v3, (long)-5092376014320582940L, (long)var4_4);
            v4 = new Object[1];
            v4[0] = var18_11;
            var34_21 = m44.a("w", (Object)var2_3, (Object)v4, (long)-5139488470093813520L, (long)var4_4);
            var35_22 = 0;
            while (var35_22 < var31_17) {
                block30: {
                    block31: {
                        block33: {
                            block32: {
                                block27: {
                                    block28: {
                                        var36_23 = this.V(var35_22);
                                        try {
                                            try {
                                                v5 /* !! */  = var30_18;
                                                if (var4_4 >= 0L) {
                                                    if (v5 /* !! */  == false) break block26;
                                                    v5 /* !! */  = (CallSite)(var36_23 instanceof lwr);
                                                }
                                                if (var30_18 == false) break block27;
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("h", (Object)v6, (long)-4746250468400566170L, (long)var4_4);
                                            }
                                            if (v5 /* !! */  != false) {
                                            }
                                            ** GOTO lbl94
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("h", (Object)v7, (long)-4746250468400566170L, (long)var4_4);
                                        }
                                        var37_24 = (lwr)var36_23;
                                        var38_25 /* !! */  = m44.a("w", (Object)var37_24, (Object)new Object[0], (long)-4968184746715213117L, (long)var4_4);
                                        try {
                                            block29: {
                                                try {
                                                    try {
                                                        v8 = m44.a("v", (Object)this, (long)-4699921808767940911L, (long)var4_4).contains(var38_25 /* !! */ );
                                                        if (var30_18 == false) break block28;
                                                        if (!v8) break block29;
                                                    }
                                                    catch (n9 v9) {
                                                        throw m44.a("h", (Object)v9, (long)-4746250468400566170L, (long)var4_4);
                                                    }
                                                    v10 = new Object[1];
                                                    v10[0] = var16_10;
                                                    v11 = new Object[1];
                                                    v11[0] = var8_6;
                                                    v12 = new Object[2];
                                                    v12[1] = var10_7;
                                                    v12[0] = "\"" + (String)var38_25 /* !! */  + (String)lat.b("q", (int)23966, (long)(8336951196216597836L ^ var4_4)) + (String)m44.a("w", (Object)this, (Object)v10, (long)-6820652943101225119L, (long)var4_4) + (String)lat.b("q", (int)27405, (long)(3356000634325674972L ^ var4_4)) + (int)m44.a("w", (Object)this, (Object)v11, (long)-6506608013544322529L, (long)var4_4) + (String)lat.b("q", (int)19521, (long)(6771258360283270289L ^ var4_4));
                                                    m44.a("w", (Object)var2_3, (Object)v12, (long)-4740677980176550228L, (long)var4_4);
                                                    v13 = var30_18;
                                                    if (var4_4 > 0L) {
                                                        if (v13 != false) break block28;
                                                    }
                                                    ** GOTO lbl92
                                                }
                                                catch (n9 v14) {
                                                    throw m44.a("h", (Object)v14, (long)-4746250468400566170L, (long)var4_4);
                                                }
                                            }
                                            v8 = m44.a("v", (Object)this, (long)-4699921808767940911L, (long)var4_4).add(var38_25 /* !! */ );
                                        }
                                        catch (n9 v15) {
                                            throw m44.a("h", (Object)v15, (long)-4746250468400566170L, (long)var4_4);
                                        }
                                    }
                                    try {
                                        try {
                                            v13 = var30_18;
lbl92:
                                            // 2 sources

                                            if (var4_4 <= 0L) break block30;
                                            if (v13 != false) break block31;
lbl94:
                                            // 2 sources

                                            v16 = var36_23;
                                            if (var30_18 == false) break block32;
                                        }
                                        catch (n9 v17) {
                                            throw m44.a("h", (Object)v17, (long)-4746250468400566170L, (long)var4_4);
                                        }
                                        v5 /* !! */  = (CallSite)(v16 instanceof l7e);
                                    }
                                    catch (n9 v18) {
                                        throw m44.a("h", (Object)v18, (long)-4746250468400566170L, (long)var4_4);
                                    }
                                }
                                if (v5 /* !! */  == false) ** GOTO lbl157
                                v16 = var36_23;
                            }
                            var37_24 = (l7e)v16;
                            var38_25 /* !! */  = var37_24.V(0);
                            v19 = new Object[3];
                            v19[2] = var26_15;
                            v19[1] = var2_3;
                            v19[0] = this;
                            m44.a("w", (Object)var38_25 /* !! */ , (Object)v19, (long)-6656114929610942631L, (long)var4_4);
                            var39_26 = (l7e)var38_25 /* !! */ ;
                            v20 = new Object[1];
                            v20[0] = var28_16;
                            v21 = new Object[2];
                            v21[1] = 0;
                            v21[0] = var12_8;
                            var40_27 = (String)m44.a("v", (Object)this, (long)-5182874151341199333L, (long)var4_4).put(m44.a("w", (Object)var39_26, (Object)v20, (long)-6627760212626527868L, (long)var4_4), m44.a("w", (Object)var39_26, (Object)v21, (long)-6447755411168996215L, (long)var4_4));
                            try {
                                try {
                                    v22 = var40_27;
                                    if (var30_18 == false || v22 == null) break block33;
                                }
                                catch (n9 v23) {
                                    throw m44.a("h", (Object)v23, (long)-4746250468400566170L, (long)var4_4);
                                }
                                v24 = new Object[1];
                                v24[0] = var28_16;
                                v25 = new Object[1];
                                v25[0] = var16_10;
                                v26 = new Object[1];
                                v26[0] = var8_6;
                                v27 = new Object[2];
                                v27[1] = var10_7;
                                v27[0] = "\"" + (String)m44.a("w", (Object)var39_26, (Object)v24, (long)-6627760212626527868L, (long)var4_4) + (String)lat.b("q", (int)11226, (long)(6228097701376289545L ^ var4_4)) + (String)m44.a("w", (Object)this, (Object)v25, (long)-6820652943101225119L, (long)var4_4) + (String)lat.b("q", (int)20980, (long)(7075038235950354722L ^ var4_4)) + (int)m44.a("w", (Object)this, (Object)v26, (long)-6506608013544322529L, (long)var4_4) + (String)lat.b("q", (int)29719, (long)(8608990028157564111L ^ var4_4));
                                m44.a("w", (Object)var2_3, (Object)v27, (long)-4740677980176550228L, (long)var4_4);
                                v28 = new Object[1];
                                v28[0] = var28_16;
                                v22 = m44.a("v", (Object)this, (long)-5182874151341199333L, (long)var4_4).put(m44.a("w", (Object)var39_26, (Object)v28, (long)-6627760212626527868L, (long)var4_4), var40_27);
                            }
                            catch (n9 v29) {
                                throw m44.a("h", (Object)v29, (long)-4746250468400566170L, (long)var4_4);
                            }
                        }
                        try {
                            v13 = var30_18;
                            if (var4_4 <= 0L) break block30;
                            if (v13 != false) break block31;
lbl157:
                            // 2 sources

                            v30 = new Object[1];
                            v30[0] = var8_6;
                            v31 = new Object[2];
                            v31[1] = var14_9;
                            v31[0] = this.getClass().getName() + (String)lat.b("q", (int)3467, (long)(6853643812345302366L ^ var4_4)) + var36_23.getClass().getName() + (String)lat.b("q", (int)23097, (long)(5174172296548063981L ^ var4_4)) + var35_22 + (String)lat.b("q", (int)17619, (long)(7867798521334563844L ^ var4_4)) + (int)m44.a("w", (Object)this, (Object)v30, (long)-6506608013544322529L, (long)var4_4) + ".";
                            m44.a("w", (Object)var2_3, (Object)v31, (long)-6841716009027213946L, (long)var4_4);
                        }
                        catch (n9 v32) {
                            throw m44.a("h", (Object)v32, (long)-4746250468400566170L, (long)var4_4);
                        }
                    }
                    ++var35_22;
                    v13 = var30_18;
                }
                if (v13 != false) continue;
            }
            v33 = new Object[5];
            v33[4] = (int)var34_21;
            v33[3] = (int)var33_20;
            v33[2] = var20_12;
            v33[1] = (int)var32_19;
            v33[0] = var2_3;
            m44.a("w", (Object)this, (Object)v33, (long)-5002077808259172358L, (long)var4_4);
            if (var4_4 > 0L) {
                // empty if block
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                lat.e = prr.a((long)5558649406083796708L, (long)7854573397432630130L, MethodHandles.lookup().lookupClass()).a(154094100731096L);
                lat.n = new HashMap<K, V>(13);
                var0 = lat.e ^ 85653493460402L;
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
                var6_5 = "Wy\u001b\u00db\u00ed\u00a4/\u00cb\u00c1\u00d6\"\u00bf\u00b5v\u009d)\u0012\t\u0090\u0019s\u00c8\u0090\u00ba\u0081\n\u00e2\u0087Fz\u0000_\u00c5\u0007\u0011\u00a4j\u009f\u0084\u009b\u00c0r\u00e9\u00d1\u00ef\u0017\u00ec\u0081\u00eb\u00d6r\u0015/\u00d45\u0019\u00a3bm7|Gk\u00f9\u0094\u00c1\u00d4rPY\u00c4L(!\u00d6\u00aa`\u00c6=;\u008a\u0013\u00db\u0087\u0007\u00ae\u0004\u00faJ\u00f7\u00cc\u00afzW3\u0087|\u000e;\u00d2{\u00b0]\u00e7k\u00b6\u00ae\b\u00c9O\u0016\u00ec\b8\u000e\u0012\u00ff\u00b1\u0082\u00f3r\u00ecv\u00a3#\u00eap\u00d1I\u0092u\fb(\u0002r\u00af\u00b12\u00da\u00d0\u00aeA\u00e3+\u0090e\u00f2R]\u0093\u00ed\u00a3\u0004\u0081\u00a3*\u00cb\u00c4Ct$\u0092\u001e\u00df\u00d9\u00c3<\u00b2\u00888\t\u0096\u00c5.7\u009f\t\u009330W\u0091<\u00a6\u00efUP&\u009bJ\u00cb\u009d\u0097\u00ff\u00f23\u00ad\u0000T\u0011\u00cd\u00c3\u0016\u0014\u0014\u00bd\u000e\u0086Dd\u00fd:E\u00dd\u00aeAn#\u00d3\u00ad,\u00df\u00e9/9\u00d2 &\b\u00b8\u0010r}\u00b9~\u00d7\u00be\u00d4\u0013>n\u0012\u00a5Wd\u008e\u0090\u0002\u0085M\u0097U\u001c\u008f\u00bcG)\u007f\u00fb\u0010\u0086\u0083i\u00c8\u00b6\u00ab\u00f9\u00fb\u00cfUQ\u00b5*,{f(Cq3\u00c8XI\r3b\u0091=*\u0097224\u00d9!.\u0092Z\u00ec\u00eaq\u00d62\u00fbpd\u00b0=`e\u00d0\u00d4\u00cd\u00f7\u00dbN\u00c4";
                var8_6 = "Wy\u001b\u00db\u00ed\u00a4/\u00cb\u00c1\u00d6\"\u00bf\u00b5v\u009d)\u0012\t\u0090\u0019s\u00c8\u0090\u00ba\u0081\n\u00e2\u0087Fz\u0000_\u00c5\u0007\u0011\u00a4j\u009f\u0084\u009b\u00c0r\u00e9\u00d1\u00ef\u0017\u00ec\u0081\u00eb\u00d6r\u0015/\u00d45\u0019\u00a3bm7|Gk\u00f9\u0094\u00c1\u00d4rPY\u00c4L(!\u00d6\u00aa`\u00c6=;\u008a\u0013\u00db\u0087\u0007\u00ae\u0004\u00faJ\u00f7\u00cc\u00afzW3\u0087|\u000e;\u00d2{\u00b0]\u00e7k\u00b6\u00ae\b\u00c9O\u0016\u00ec\b8\u000e\u0012\u00ff\u00b1\u0082\u00f3r\u00ecv\u00a3#\u00eap\u00d1I\u0092u\fb(\u0002r\u00af\u00b12\u00da\u00d0\u00aeA\u00e3+\u0090e\u00f2R]\u0093\u00ed\u00a3\u0004\u0081\u00a3*\u00cb\u00c4Ct$\u0092\u001e\u00df\u00d9\u00c3<\u00b2\u00888\t\u0096\u00c5.7\u009f\t\u009330W\u0091<\u00a6\u00efUP&\u009bJ\u00cb\u009d\u0097\u00ff\u00f23\u00ad\u0000T\u0011\u00cd\u00c3\u0016\u0014\u0014\u00bd\u000e\u0086Dd\u00fd:E\u00dd\u00aeAn#\u00d3\u00ad,\u00df\u00e9/9\u00d2 &\b\u00b8\u0010r}\u00b9~\u00d7\u00be\u00d4\u0013>n\u0012\u00a5Wd\u008e\u0090\u0002\u0085M\u0097U\u001c\u008f\u00bcG)\u007f\u00fb\u0010\u0086\u0083i\u00c8\u00b6\u00ab\u00f9\u00fb\u00cfUQ\u00b5*,{f(Cq3\u00c8XI\r3b\u0091=*\u0097224\u00d9!.\u0092Z\u00ec\u00eaq\u00d62\u00fbpd\u00b0=`e\u00d0\u00d4\u00cd\u00f7\u00dbN\u00c4".length();
                var5_7 = 72;
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
                    var9_3[var7_4++] = lat.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "2\u00dc\u00e1<+\u000b\u0080\\\u00b6\u00db\u0006UH\u00e6{\u00b8y2f/~\u00b4\u0084\u00bb\u00d0\u00b0@\u007f\u00c9-l\u00a7H\u0081\u00a1V\u00f2\u001b\u00ea\u008ala\u00c7\u00d8\u0098\u00c3\u00db\u0099\u00d5[\u00b4%9p\u0014^\u009c\u00cfL\u00e5!y\u0089\u0013\u00f7\u00b1\u00a5_\"\u00e4H\u009cd\u008e\u00ea>\u009e\u00b5W\u0087\u00d0\u00ea\u00e1\u0014_\u008dh\u00b3d\u001f?\u00a3\u00df\u00d6-\u0003\u00adLv\u0001T}\u008d\u0099\u00ab";
                    var8_6 = "2\u00dc\u00e1<+\u000b\u0080\\\u00b6\u00db\u0006UH\u00e6{\u00b8y2f/~\u00b4\u0084\u00bb\u00d0\u00b0@\u007f\u00c9-l\u00a7H\u0081\u00a1V\u00f2\u001b\u00ea\u008ala\u00c7\u00d8\u0098\u00c3\u00db\u0099\u00d5[\u00b4%9p\u0014^\u009c\u00cfL\u00e5!y\u0089\u0013\u00f7\u00b1\u00a5_\"\u00e4H\u009cd\u008e\u00ea>\u009e\u00b5W\u0087\u00d0\u00ea\u00e1\u0014_\u008dh\u00b3d\u001f?\u00a3\u00df\u00d6-\u0003\u00adLv\u0001T}\u008d\u0099\u00ab".length();
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
                    var9_3[var7_4++] = lat.c(var10_9).intern();
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
        lat.g = var9_3;
        lat.k = new String[9];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7547;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])lat.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lat.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lat", exception);
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
            lat.k[n2] = lat.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lat.b(n, l);
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
            throw new RuntimeException("com/zelix/lat" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lat.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
