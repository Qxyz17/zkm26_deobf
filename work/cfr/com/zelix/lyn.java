/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fj;
import com.zelix.lqu;
import com.zelix.ly1;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
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

public abstract class lyn
extends ly1
implements fj {
    protected int d;
    private static final long h;
    private static final String[] j;
    private static final String[] l;
    private static final Map m;
    private static final long w;

    @Override
    public lyn D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this;
    }

    @Override
    public int W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (int)m44.a("q", (Object)this, (long)-8977393841743610296L, (long)l10);
    }

    @Override
    public abstract String N(Object[] var1);

    public void S(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = h ^ l10;
        m44.a("s", (Object)this, (int)n10, (long)-5658250851781276584L, (long)l10);
    }

    public final void i(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        long l10;
        long l11;
        long l12;
        String string;
        long l13;
        block47: {
            block48: {
                CallSite callSite;
                StringBuilder stringBuilder2;
                StringBuilder stringBuilder3;
                block53: {
                    Object object2;
                    block51: {
                        block52: {
                            reference var25_18;
                            block49: {
                                block50: {
                                    reference v13;
                                    CallSite callSite2;
                                    block40: {
                                        long l14;
                                        int n10;
                                        lqu lqu2;
                                        block41: {
                                            CallSite callSite3;
                                            StringBuilder stringBuilder4;
                                            StringBuilder stringBuilder5;
                                            block46: {
                                                Object object3;
                                                block44: {
                                                    block45: {
                                                        reference var24_17;
                                                        block42: {
                                                            block43: {
                                                                reference v22;
                                                                block33: {
                                                                    long l15;
                                                                    int n11;
                                                                    block34: {
                                                                        CallSite callSite4;
                                                                        StringBuilder stringBuilder6;
                                                                        StringBuilder stringBuilder7;
                                                                        block39: {
                                                                            Object object4;
                                                                            block37: {
                                                                                block38: {
                                                                                    reference var23_15;
                                                                                    block35: {
                                                                                        block36: {
                                                                                            lqu2 = (lqu)objectArray[0];
                                                                                            int n12 = (Integer)objectArray[1];
                                                                                            l13 = (Long)objectArray[2];
                                                                                            n11 = (Integer)objectArray[3];
                                                                                            n10 = (Integer)objectArray[4];
                                                                                            string = (String)objectArray[5];
                                                                                            long l16 = l13 = h ^ l13;
                                                                                            l15 = l16 ^ 0x34CEE72D2059L;
                                                                                            l12 = l16 ^ 0x73BD18C5FC17L;
                                                                                            l11 = l16 ^ 0x13D5834F62DDL;
                                                                                            l14 = l16 ^ 0x37A87C59681EL;
                                                                                            long l17 = l16 ^ 0x5B4D4B1A5757L;
                                                                                            l10 = l16 ^ 0x7021C61DFADCL;
                                                                                            stringBuilder = new StringBuilder();
                                                                                            Object[] objectArray2 = new Object[1];
                                                                                            objectArray2[0] = l17;
                                                                                            var23_15 = m44.a("p", (Object)lqu2, (Object)objectArray2, (long)-6922401315423767737L, (long)l13) - n12;
                                                                                            callSite2 = m44.a("o", (long)-7374215839704462703L, (long)l13);
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v22 = var23_15;
                                                                                                            if (callSite2 != false) break block33;
                                                                                                            if (v22 <= 0) break block34;
                                                                                                        }
                                                                                                        catch (n9 n92) {
                                                                                                            throw m44.a("o", (Object)n92, (long)-7258039567306378014L, (long)l13);
                                                                                                        }
                                                                                                        stringBuilder7 = stringBuilder;
                                                                                                        if (l13 < 0L || callSite2 != false) break block35;
                                                                                                    }
                                                                                                    catch (n9 n93) {
                                                                                                        throw m44.a("o", (Object)n93, (long)-7258039567306378014L, (long)l13);
                                                                                                    }
                                                                                                    if (stringBuilder7.length() <= 0) break block36;
                                                                                                }
                                                                                                catch (n9 n94) {
                                                                                                    throw m44.a("o", (Object)n94, (long)-7258039567306378014L, (long)l13);
                                                                                                }
                                                                                                stringBuilder.append((String)((Object)lyn.a("w", (int)25413, (long)(0x240D6592CD3980E9L ^ l13))));
                                                                                            }
                                                                                            catch (n9 n95) {
                                                                                                throw m44.a("o", (Object)n95, (long)-7258039567306378014L, (long)l13);
                                                                                            }
                                                                                        }
                                                                                        stringBuilder7 = stringBuilder;
                                                                                    }
                                                                                    try {
                                                                                        stringBuilder6 = new StringBuilder().append((int)var23_15);
                                                                                        object4 = var23_15;
                                                                                        if (l13 <= 0L) break block37;
                                                                                        if (object4 <= true) break block38;
                                                                                        callSite4 = lyn.a("w", (int)18211, (long)(0x49F0DEFC556BA484L ^ l13));
                                                                                        break block39;
                                                                                    }
                                                                                    catch (n9 n96) {
                                                                                        throw m44.a("o", (Object)n96, (long)-7258039567306378014L, (long)l13);
                                                                                    }
                                                                                }
                                                                                object4 = 13812;
                                                                            }
                                                                            callSite4 = lyn.a("w", (int)object4, (long)(0x5196F1FA3688D657L ^ l13));
                                                                        }
                                                                        stringBuilder7.append(stringBuilder6.append((String)((Object)callSite4)).toString());
                                                                    }
                                                                    Object[] objectArray3 = new Object[1];
                                                                    objectArray3[0] = l15;
                                                                    v22 = m44.a("p", (Object)lqu2, (Object)objectArray3, (long)-9100849219728996861L, (long)l13) - n11;
                                                                }
                                                                var24_17 = v22;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v13 = var24_17;
                                                                                if (callSite2 != false) break block40;
                                                                                if (v13 <= 0) break block41;
                                                                            }
                                                                            catch (n9 n97) {
                                                                                throw m44.a("o", (Object)n97, (long)-7258039567306378014L, (long)l13);
                                                                            }
                                                                            stringBuilder5 = stringBuilder;
                                                                            if (l13 <= 0L || callSite2 != false) break block42;
                                                                        }
                                                                        catch (n9 n98) {
                                                                            throw m44.a("o", (Object)n98, (long)-7258039567306378014L, (long)l13);
                                                                        }
                                                                        if (stringBuilder5.length() <= 0) break block43;
                                                                    }
                                                                    catch (n9 n99) {
                                                                        throw m44.a("o", (Object)n99, (long)-7258039567306378014L, (long)l13);
                                                                    }
                                                                    stringBuilder.append((String)((Object)lyn.a("w", (int)26176, (long)(0x62D82F6FA44C85E2L ^ l13))));
                                                                }
                                                                catch (n9 n910) {
                                                                    throw m44.a("o", (Object)n910, (long)-7258039567306378014L, (long)l13);
                                                                }
                                                            }
                                                            stringBuilder5 = stringBuilder;
                                                        }
                                                        try {
                                                            stringBuilder4 = new StringBuilder().append((int)var24_17);
                                                            object3 = var24_17;
                                                            if (l13 <= 0L) break block44;
                                                            if (object3 <= true) break block45;
                                                            callSite3 = lyn.a("w", (int)30201, (long)(0x7081AFA82771656L ^ l13));
                                                            break block46;
                                                        }
                                                        catch (n9 n911) {
                                                            throw m44.a("o", (Object)n911, (long)-7258039567306378014L, (long)l13);
                                                        }
                                                    }
                                                    object3 = 19217;
                                                }
                                                callSite3 = lyn.a("w", (int)object3, (long)(0x746654A7925FA8BFL ^ l13));
                                            }
                                            stringBuilder5.append(stringBuilder4.append((String)((Object)callSite3)).toString());
                                        }
                                        Object[] objectArray4 = new Object[1];
                                        objectArray4[0] = l14;
                                        v13 = m44.a("p", (Object)lqu2, (Object)objectArray4, (long)-9202075235614093289L, (long)l13) - n10;
                                    }
                                    var25_18 = v13;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    object = var25_18;
                                                    if (l13 < 0L || callSite2 != false) break block47;
                                                    if (object <= 0) break block48;
                                                }
                                                catch (n9 n912) {
                                                    throw m44.a("o", (Object)n912, (long)-7258039567306378014L, (long)l13);
                                                }
                                                stringBuilder3 = stringBuilder;
                                                if (l13 <= 0L || callSite2 != false) break block49;
                                            }
                                            catch (n9 n913) {
                                                throw m44.a("o", (Object)n913, (long)-7258039567306378014L, (long)l13);
                                            }
                                            if (stringBuilder3.length() <= 0) break block50;
                                        }
                                        catch (n9 n914) {
                                            throw m44.a("o", (Object)n914, (long)-7258039567306378014L, (long)l13);
                                        }
                                        stringBuilder.append((String)((Object)lyn.a("w", (int)26176, (long)(0x62D82F6FA44C85E2L ^ l13))));
                                    }
                                    catch (n9 n915) {
                                        throw m44.a("o", (Object)n915, (long)-7258039567306378014L, (long)l13);
                                    }
                                }
                                stringBuilder3 = stringBuilder;
                            }
                            try {
                                stringBuilder2 = new StringBuilder().append((int)var25_18);
                                object2 = var25_18;
                                if (l13 < 0L) break block51;
                                if (object2 <= true) break block52;
                                callSite = lyn.a("w", (int)19864, (long)(0x24569136864F2E39L ^ l13));
                                break block53;
                            }
                            catch (n9 n916) {
                                throw m44.a("o", (Object)n916, (long)-7258039567306378014L, (long)l13);
                            }
                        }
                        object2 = 26446;
                    }
                    callSite = lyn.a("w", (int)object2, (long)(0x73EDEABD46DB84EAL ^ l13));
                }
                stringBuilder3.append(stringBuilder2.append((String)((Object)callSite)).toString());
            }
            object = stringBuilder.length();
        }
        try {
            if (object > 0) {
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l10;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = (int)w;
                objectArray6[1] = l12;
                objectArray6[0] = ((String)((Object)m44.a("o", (Object)objectArray5, (long)-9055232023205676043L, (long)l13))).length() + 1;
                Object[] objectArray7 = new Object[1];
                objectArray7[0] = l11;
                m44.a("p", (Object)m44.a("k", (long)-9179979110362531400L, (long)l13), (Object)((String)((Object)m44.a("o", (Object)objectArray6, (long)-7196000446605798358L, (long)l13)) + stringBuilder.toString() + (String)((Object)lyn.a("w", (int)23796, (long)(0x1323B6292B2D3F51L ^ l13))) + string + (String)((Object)lyn.a("w", (int)15056, (long)(0x1D4F5333D6A05976L ^ l13))) + (String)((Object)m44.a("p", (Object)this, (Object)objectArray7, (long)-7368069939059445882L, (long)l13)) + (String)((Object)lyn.a("w", (int)22935, (long)(0x1BC9A47F680DBA37L ^ l13)))), (long)-7213286649013698064L, (long)l13);
            }
        }
        catch (n9 n917) {
            throw m44.a("o", (Object)n917, (long)-7258039567306378014L, (long)l13);
        }
    }

    protected abstract void m(Object[] var1);

    public lyn(long l10, int n10) {
        long l11 = (l10 = h ^ l10) ^ 0x5582F5CFF5BEL;
        super(l11, n10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    lyn.h = prr.a(-8724050920524713824L, -6481664830290109460L, MethodHandles.lookup().lookupClass()).a(213345172633403L);
                    lyn.m = new HashMap<K, V>(13);
                    var5 = lyn.h ^ 65309517772454L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[11];
                    var12_4 = 0;
                    var11_5 = "\u00144)O\u0012\b\u008eZ\u00fe\u009a2\u00ec\u00a3\u00819W\u0018$Xt\u0007\u00b4`]\u0098%Fb\u00d2\u0011r\u00b7\u008c\u00fd\u0089$\u00c6\u00f3-\u0095T\u0010DWu^#]\u009c_&\u00e4M\u00aa\u008f/h\u0017 \u00af\u00f4\u009b<\u0099\u00cf\u009c\u00f6\u00e0aF\u00e1\u001c-\u00bf\u00e2\u00d9\u00dbV\u0003D\u00ca\u00c3\u00ea\u0088\u00baW\u00dbq\u00ca\u0000\u00cd\u0010Ap8\u0091\u0099\u00a7Js\u00eb\u009b\u0086\u000e\u00ec\u008f\u000e\u0088\u0018{(\u00a03\rQ\u000e\u00af\u0089\u00fd\u00c2\u0015E-^\u0095\u00b2\u00e13h\u0083\u00b5K\u00c6\u0018\u009c\u0092\u0090\u0096;\u00eb\u0096gV@\u00be\u0089\u0017YC\u00b5\u0086\u00e1\u00db|\u00954\u00a3m\u0010\u00b3\u008fLy#\u0013\u00e7\u00ee\u001b\u008dm\u00c49\u00a5\u00b4\u0019\u0018\u00eb\u00b2\u00c1M\u00a9\u0019:\u0087`^\u008b1\u0096\u0094[6\u00e3o\u00fcu\u0000\n\u009dK";
                    var13_6 = "\u00144)O\u0012\b\u008eZ\u00fe\u009a2\u00ec\u00a3\u00819W\u0018$Xt\u0007\u00b4`]\u0098%Fb\u00d2\u0011r\u00b7\u008c\u00fd\u0089$\u00c6\u00f3-\u0095T\u0010DWu^#]\u009c_&\u00e4M\u00aa\u008f/h\u0017 \u00af\u00f4\u009b<\u0099\u00cf\u009c\u00f6\u00e0aF\u00e1\u001c-\u00bf\u00e2\u00d9\u00dbV\u0003D\u00ca\u00c3\u00ea\u0088\u00baW\u00dbq\u00ca\u0000\u00cd\u0010Ap8\u0091\u0099\u00a7Js\u00eb\u009b\u0086\u000e\u00ec\u008f\u000e\u0088\u0018{(\u00a03\rQ\u000e\u00af\u0089\u00fd\u00c2\u0015E-^\u0095\u00b2\u00e13h\u0083\u00b5K\u00c6\u0018\u009c\u0092\u0090\u0096;\u00eb\u0096gV@\u00be\u0089\u0017YC\u00b5\u0086\u00e1\u00db|\u00954\u00a3m\u0010\u00b3\u008fLy#\u0013\u00e7\u00ee\u001b\u008dm\u00c49\u00a5\u00b4\u0019\u0018\u00eb\u00b2\u00c1M\u00a9\u0019:\u0087`^\u008b1\u0096\u0094[6\u00e3o\u00fcu\u0000\n\u009dK".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = lyn.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00aa\u001e\u008bi\u0083<y\u009e+et\u00c7\u00a0j\u0092\u0001 `\u00c3\u0003\u0093\u00c5\u00fb\u00f2\u00f8\u00e6\u00fb\u00d6\u00a9\u0086\u008b\u00eb\u0010u\u00b5\u00b8\u001a#d2\u00f32\u00d2\u008c\u001e\u00f8\u00c9&t";
                        var13_6 = "\u00aa\u001e\u008bi\u0083<y\u009e+et\u00c7\u00a0j\u0092\u0001 `\u00c3\u0003\u0093\u00c5\u00fb\u00f2\u00f8\u00e6\u00fb\u00d6\u00a9\u0086\u008b\u00eb\u0010u\u00b5\u00b8\u001a#d2\u00f32\u00d2\u008c\u001e\u00f8\u00c9&t".length();
                        var10_7 = 32;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = lyn.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            lyn.j = var14_3;
            lyn.l = new String[11];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = -6970462128618836257L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        lyn.w = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static n9 d(n9 n92) {
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6ED6;
        if (l[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])m.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lyn", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = j[n11].getBytes("ISO-8859-1");
            lyn.l[n11] = lyn.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return l[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lyn.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lyn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lyn.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

