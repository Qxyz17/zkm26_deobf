/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._e;
import com.zelix._f;
import com.zelix.bf;
import com.zelix.bn;
import com.zelix.d2;
import com.zelix.f_;
import com.zelix.lb6;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.s3;
import com.zelix.un;
import com.zelix.us;
import com.zelix.v;
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
import javax.swing.JTextArea;

public class z3
implements us,
f_ {
    static final String z;
    JTextArea B;
    static final String u;
    s3 q;
    v d;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public z3(s3 s32, JTextArea jTextArea, long l, v v2) {
        long l2 = (l = a ^ l) ^ 0x74B2C6AE00FEL;
        m44.a("p", (Object)this, (s3)s32, (long)6468512674831195599L, (long)l);
        m44.a("p", (Object)this, (JTextArea)jTextArea, (long)5096115082130039624L, (long)l);
        m44.a("p", (Object)this, (v)v2, (long)5105882156403030228L, (long)l);
        m44.a("s", (Object)m44.a("r", (Object)this, (long)5096115082130039624L, (long)l), (boolean)false, (long)5122191959449639904L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        m44.a("s", (Object)s32, (Object)objectArray, (long)6590176470533982325L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        z3.a = prr.a((long)5284124692630354670L, (long)6565512226680009729L, MethodHandles.lookup().lookupClass()).a(228323676908316L);
                        var20 = z3.a ^ 23821711300576L;
                        z3.e = new HashMap<K, V>(13);
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
                        var18_3 = new String[5];
                        var16_4 = 0;
                        var15_5 = "z\u0090\u000e\u008a3\u0003;\u00b8UBE\u00e4\u00be\u0088\bV\u00e7\u008fb\u00ea-\u00f9\u0017+085'\u0013\u00db\u0080\u00c8\u0082\u00fel\u00a0dg\u00d7L\u00f6\u0096K\u00d04_\u00b6=\u000ff\ff\u00aa\u00e7\u001a\u00e8\u00e5\u008dvS\u00c1\u00ba\u00fc\u00c3\u00d3T\u00b5\u0002\u00d1\u00ba\u00e2\u000f\u00f8(\u00b9\nq\u00c58I\u001e\u00fe\u0005+\u00a1J[\u00e5\u00f0n\u0099\u008e#\u008f\u00e5\u0083\u009d`\u0015\u00e9V\u00d6\u0006\u00a4C\u00e5B\u0004T%\u007f\u0080\u00b1v";
                        var17_6 = "z\u0090\u000e\u008a3\u0003;\u00b8UBE\u00e4\u00be\u0088\bV\u00e7\u008fb\u00ea-\u00f9\u0017+085'\u0013\u00db\u0080\u00c8\u0082\u00fel\u00a0dg\u00d7L\u00f6\u0096K\u00d04_\u00b6=\u000ff\ff\u00aa\u00e7\u001a\u00e8\u00e5\u008dvS\u00c1\u00ba\u00fc\u00c3\u00d3T\u00b5\u0002\u00d1\u00ba\u00e2\u000f\u00f8(\u00b9\nq\u00c58I\u001e\u00fe\u0005+\u00a1J[\u00e5\u00f0n\u0099\u008e#\u008f\u00e5\u0083\u009d`\u0015\u00e9V\u00d6\u0006\u00a4C\u00e5B\u0004T%\u007f\u0080\u00b1v".length();
                        var14_7 = 24;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = z3.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "K\u0018\u00dcv\u0007\u00ccI\u00dc\u00be\u001e\u00d0\u00eb\u0096\u00db\u00f2JPQM`u\u0013\u00ea\u008d\u00acQ\u00e6%\u0006\u0002\u008a\u00c5L\u0011\u00ef\u0004\u00d2C\u00d5\u0096 \u00c2\u001fEY\u007f\u0086\u008c\u00959\u0099\u00d6\u00f5\u00ee\tn_\u00fd\u00a4\u009b\u00af3\"\u0085\u00d8\n\u00b9'\u00b2|\u0086k\u00ac";
                            var17_6 = "K\u0018\u00dcv\u0007\u00ccI\u00dc\u00be\u001e\u00d0\u00eb\u0096\u00db\u00f2JPQM`u\u0013\u00ea\u008d\u00acQ\u00e6%\u0006\u0002\u008a\u00c5L\u0011\u00ef\u0004\u00d2C\u00d5\u0096 \u00c2\u001fEY\u007f\u0086\u008c\u00959\u0099\u00d6\u00f5\u00ee\tn_\u00fd\u00a4\u009b\u00af3\"\u0085\u00d8\n\u00b9'\u00b2|\u0086k\u00ac".length();
                            var14_7 = 40;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = z3.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block14;
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
                z3.b = var18_3;
                z3.c = new String[5];
                z3.h = new HashMap<K, V>(13);
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
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "\t\u009e)F\u0005\u00b7H\u00a9\u00d7!\u00dc\u00f4\u00f7\t\u00da\u0095\u00edkMr\u00b8\u0000j9";
                var5_15 = "\t\u009e)F\u0005\u00b7H\u00a9\u00d7!\u00dc\u00f4\u00f7\t\u00da\u0095\u00edkMr\u00b8\u0000j9".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        z3.f = var6_12;
        z3.g = new Integer[3];
        z3.u = _e.n;
        z3.z = (String)m44.a("m", (long)-3622318491976518699L, (long)var20) + (String)m44.a("m", (long)-3622318491976518699L, (long)var20) + (String)z3.a("t", (int)9343, (long)(7991774777468441503L ^ var20)) + (int)z3.b("m", (int)24187, (long)(3586705206604738581L ^ var20)) + (String)z3.a("t", (int)22440, (long)(3919937291576582220L ^ var20));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void N(Object[] var1_1) {
        block48: {
            block42: {
                block44: {
                    block51: {
                        block43: {
                            block41: {
                                block40: {
                                    var7_2 = (m)var1_1[0];
                                    var3_3 = (Long)var1_1[1];
                                    var2_4 = var1_1[2];
                                    var5_5 = var1_1[3];
                                    var6_6 = var1_1[4];
                                    v0 = var3_3;
                                    var8_7 = v0 ^ 20680066501912L;
                                    var10_8 = v0 ^ 40211425165171L;
                                    var12_9 = v0 ^ 116229428461871L;
                                    var15_10 = (_4)m44.a("r", (Object)((s3)var7_2), (Object)new Object[0], (long)2607727820607408170L, (long)var3_3);
                                    var14_11 = m44.a("m", (long)2676264758025536872L, (long)var3_3);
                                    try {
                                        v1 /* !! */  = var15_10;
                                        if (var14_11 != null) break block40;
                                        if (v1 /* !! */  != null) {
                                        }
                                        ** GOTO lbl167
                                    }
                                    catch (un v2) {
                                        throw m44.a("m", (Object)v2, (long)4252834203052946386L, (long)var3_3);
                                    }
                                    v1 /* !! */  = var2_4;
                                }
                                try {
                                    if (var3_3 < 0L || var14_11 != null) break block41;
                                    if (v1 /* !! */  == null) break block42;
                                }
                                catch (un v3) {
                                    throw m44.a("m", (Object)v3, (long)4252834203052946386L, (long)var3_3);
                                }
                                v1 /* !! */  = var2_4;
                            }
                            v4 = v1 /* !! */  instanceof lb6;
                            v5 = var14_11;
                            if (var3_3 <= 0L) ** GOTO lbl50
                            if (v5 != null) break block43;
                            try {
                                block50: {
                                    if (v4 == 0) break block42;
                                    break block50;
                                    catch (un v6) {
                                        throw m44.a("m", (Object)v6, (long)4252834203052946386L, (long)var3_3);
                                    }
                                }
                                v4 = ((lb6)var2_4).U(var12_9);
                            }
                            catch (un v7) {
                                throw m44.a("m", (Object)v7, (long)4252834203052946386L, (long)var3_3);
                            }
                        }
                        v5 = var14_11;
lbl50:
                        // 2 sources

                        if (v5 != null) break block44;
                        if (v4 != 3) break block42;
                        break block51;
                        catch (un v8) {
                            throw m44.a("m", (Object)v8, (long)4252834203052946386L, (long)var3_3);
                        }
                    }
                    try {
                        block52: {
                            v9 = var15_10;
                            if (var14_11 != null) ** GOTO lbl74
                            break block52;
                            catch (un v10) {
                                throw m44.a("m", (Object)v10, (long)4252834203052946386L, (long)var3_3);
                            }
                        }
                        v4 = v9 instanceof _f;
                    }
                    catch (un v11) {
                        throw m44.a("m", (Object)v11, (long)4252834203052946386L, (long)var3_3);
                    }
                }
                if (v4 != 0) {
                    return;
                }
            }
            try {
                block49: {
                    block55: {
                        block47: {
                            block53: {
                                block45: {
                                    block46: {
                                        v9 = var15_10;
lbl74:
                                        // 2 sources

                                        v12 = new Object[1];
                                        v12[0] = var8_7;
                                        var16_12 = m44.a("r", (Object)v9, (Object)v12, (long)4070880102369079576L, (long)var3_3);
                                        try {
                                            v13 = var16_12.length();
                                            v14 = var14_11;
                                            if (var3_3 >= 0L) {
                                                if (v14 != null) break block45;
                                                if (v13 <= z3.b("m", (int)29452, (long)(8724962021704527508L ^ var3_3))) break block46;
                                            }
                                            ** GOTO lbl97
                                        }
                                        catch (un v15) {
                                            throw m44.a("m", (Object)v15, (long)4252834203052946386L, (long)var3_3);
                                        }
                                        var16_12 = var16_12.substring(0, (int)z3.b("m", (int)24187, (long)(3586807032663294945L ^ var3_3))) + (String)m44.a("i", (long)2602082656140720906L, (long)var3_3);
                                    }
                                    var16_12 = var16_12.replace('\u0000', (char)z3.b("m", (int)25439, (long)(4389466919749713606L ^ var3_3)));
                                    m44.a("r", (Object)m44.a("s", (Object)this, (long)4589284407535426113L, (long)var3_3), (Object)var16_12, (long)2722697472014566395L, (long)var3_3);
                                    m44.a("r", (Object)m44.a("s", (Object)this, (long)4589284407535426113L, (long)var3_3), (int)0, (long)2517516437887732200L, (long)var3_3);
                                    v13 = var15_10 instanceof _f;
                                }
                                v14 = var14_11;
lbl97:
                                // 2 sources

                                if (var3_3 <= 0L) ** GOTO lbl124
                                if (v14 != null) break block47;
                                if (v13 == 0) ** GOTO lbl115
                                break block53;
                                catch (un v16) {
                                    throw m44.a("m", (Object)v16, (long)4252834203052946386L, (long)var3_3);
                                }
                            }
                            try {
                                block54: {
                                    v17 = new Object[2];
                                    v17[1] = var10_8;
                                    v17[0] = z3.a("t", (int)14365, (long)(2813829263411624971L ^ var3_3));
                                    m44.a("r", (Object)m44.a("s", (Object)this, (long)4589284407535426113L, (long)var3_3), (Object)m44.a("m", (Object)v17, (long)4294134642826043721L, (long)var3_3), (long)2439838376118345825L, (long)var3_3);
                                    if (var14_11 == null) break block48;
                                    break block54;
                                    catch (un v18) {
                                        throw m44.a("m", (Object)v18, (long)4252834203052946386L, (long)var3_3);
                                    }
                                }
                                v13 = var15_10 instanceof bf;
                            }
                            catch (un v19) {
                                throw m44.a("m", (Object)v19, (long)4252834203052946386L, (long)var3_3);
                            }
                        }
                        if (var3_3 <= 0L) break block49;
                        v14 = var14_11;
lbl124:
                        // 2 sources

                        if (v14 != null) break block49;
                        if (v13 == 0) ** GOTO lbl141
                        break block55;
                        catch (un v20) {
                            throw m44.a("m", (Object)v20, (long)4252834203052946386L, (long)var3_3);
                        }
                    }
                    try {
                        block56: {
                            v21 = new Object[2];
                            v21[1] = var10_8;
                            v21[0] = z3.a("t", (int)3203, (long)(7634225756344518804L ^ var3_3));
                            m44.a("r", (Object)m44.a("s", (Object)this, (long)4589284407535426113L, (long)var3_3), (Object)m44.a("m", (Object)v21, (long)4294134642826043721L, (long)var3_3), (long)2439838376118345825L, (long)var3_3);
                            if (var14_11 == null) break block48;
                            break block56;
                            catch (un v22) {
                                throw m44.a("m", (Object)v22, (long)4252834203052946386L, (long)var3_3);
                            }
                        }
                        v13 = var15_10 instanceof bn;
                    }
                    catch (un v23) {
                        throw m44.a("m", (Object)v23, (long)4252834203052946386L, (long)var3_3);
                    }
                }
                if (v13 == 0) ** GOTO lbl159
                try {
                    block57: {
                        v24 = new Object[2];
                        v24[1] = var10_8;
                        v24[0] = z3.a("t", (int)16110, (long)(988918386319604475L ^ var3_3));
                        m44.a("r", (Object)m44.a("s", (Object)this, (long)4589284407535426113L, (long)var3_3), (Object)m44.a("m", (Object)v24, (long)4294134642826043721L, (long)var3_3), (long)2439838376118345825L, (long)var3_3);
                        if (var14_11 == null) break block48;
                        break block57;
                        catch (un v25) {
                            throw m44.a("m", (Object)v25, (long)4252834203052946386L, (long)var3_3);
                        }
                    }
                    m44.a("r", (Object)m44.a("s", (Object)this, (long)4589284407535426113L, (long)var3_3), (Object)"", (long)2439838376118345825L, (long)var3_3);
                }
                catch (un v26) {
                    throw m44.a("m", (Object)v26, (long)4252834203052946386L, (long)var3_3);
                }
            }
            catch (un var16_13) {
                try {
                    if (var3_3 <= 0L || var14_11 == null) break block48;
lbl167:
                    // 2 sources

                    m44.a("r", (Object)m44.a("s", (Object)this, (long)4589284407535426113L, (long)var3_3), (Object)"", (long)2722697472014566395L, (long)var3_3);
                }
                catch (un v27) {
                    throw m44.a("m", (Object)v27, (long)4252834203052946386L, (long)var3_3);
                }
            }
        }
    }

    public void x(m m2, Object object, Object object2, Object object3, long l) {
        long l2 = l ^ 0x6DB16FE008E7L;
        new d2((f_)this, m2, object, object2, object3, l2);
    }

    private static un a(un un2) {
        return un2;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2A3E;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/z3", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            z3.c[n2] = z3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = z3.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/z3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x33B2;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/z3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            z3.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = z3.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/z3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(z3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(z3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
