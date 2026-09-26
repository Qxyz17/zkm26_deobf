/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.nn;
import com.zelix.prr;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lk0 {
    static PrintWriter O;
    static PrintWriter E;
    public static final Runtime Y;
    static long n;
    static long i;
    static long L;
    static final long r;
    static long M;
    static Map g;
    static long t;
    public static final String q;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map h;

    public static void h(Object[] objectArray) {
        Object object = objectArray[0];
        String string = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        l10 = a ^ l10;
        try {
            if (object == null) {
                throw new nn((String)((Object)lk0.a("z", (int)1897, (long)(0x70E460D14CC64272L ^ l10))) + string);
            }
        }
        catch (nn nn2) {
            throw m44.a("o", (Object)nn2, (long)6190830267339618419L, (long)l10);
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
                        lk0.a = prr.a(-8642401283290042932L, 123284217530019883L, MethodHandles.lookup().lookupClass()).a(139997457434807L);
                        var20 = lk0.a ^ 134694651029202L;
                        lk0.d = new HashMap<K, V>(13);
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
                        var18_3 = new String[9];
                        var16_4 = 0;
                        var15_5 = "\u0099\u00d7$\u00d8z\u000fED)\u0082\u00bey\u00e0\u0086k\u00060*I\u0095\u0002M\u009b\u00b9\"\u00dbMI\u00dbp\u0011\u00de\u00ac\u00aa\u00a4\u00ad\u00fcb\u00bdT;\u00f44\u008b\u00ba\u00e5thd#WV\u0000Olb\u001e.\u00a1\u00f9\u0090\u001b\u00ed\u00ed/ \u0081\u0086\u00e0\u001d\u0010G3`C,\u009aoh\u008d\u00c1\u00c4/#G#o\u00f9\u00fe\u00ed\f\t5\u0096\u00ac\u00a1ZV\u0010?>8&\u00e5\u00a9l\u009e\u00a5\u00b6 \u000eU\u00acG\u0006 \u0088\u00ed\u00e9gdC\u0099\u0017\u00a0\u009d\u00eb\u00b3\u00a3*c\u000ek$\u000f\t\u0010\u00f4\u00e5\u00fa|\u00e7.\u0013\u0096\u008c\u0097\u00ca\u0010\u00feP\u00dekQ|1k\u0018\u00fa\u001d@\u00d6\u00e7w_\u0010\u00c7?\u00fb\u00a9\u00e7>\u00a2\u008dZ\u00e1\u00e0r\u008d|\u00ea\u00cf";
                        var17_6 = "\u0099\u00d7$\u00d8z\u000fED)\u0082\u00bey\u00e0\u0086k\u00060*I\u0095\u0002M\u009b\u00b9\"\u00dbMI\u00dbp\u0011\u00de\u00ac\u00aa\u00a4\u00ad\u00fcb\u00bdT;\u00f44\u008b\u00ba\u00e5thd#WV\u0000Olb\u001e.\u00a1\u00f9\u0090\u001b\u00ed\u00ed/ \u0081\u0086\u00e0\u001d\u0010G3`C,\u009aoh\u008d\u00c1\u00c4/#G#o\u00f9\u00fe\u00ed\f\t5\u0096\u00ac\u00a1ZV\u0010?>8&\u00e5\u00a9l\u009e\u00a5\u00b6 \u000eU\u00acG\u0006 \u0088\u00ed\u00e9gdC\u0099\u0017\u00a0\u009d\u00eb\u00b3\u00a3*c\u000ek$\u000f\t\u0010\u00f4\u00e5\u00fa|\u00e7.\u0013\u0096\u008c\u0097\u00ca\u0010\u00feP\u00dekQ|1k\u0018\u00fa\u001d@\u00d6\u00e7w_\u0010\u00c7?\u00fb\u00a9\u00e7>\u00a2\u008dZ\u00e1\u00e0r\u008d|\u00ea\u00cf".length();
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
                            var18_3[var16_4++] = lk0.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u000eL>\u00eaoh\"\u009eEr\u00ffoL\u00d5\u00003 0b\u00d44\u0001(\u00df_\u00e7]\u009a\u00f5}h#n\u008c\u0080\u0096\u0094\u0096'\u00b3N\u00a7l2\u00112\u00c0Ym";
                            var17_6 = "\u000eL>\u00eaoh\"\u009eEr\u00ffoL\u00d5\u00003 0b\u00d44\u0001(\u00df_\u00e7]\u009a\u00f5}h#n\u008c\u0080\u0096\u0094\u0096'\u00b3N\u00a7l2\u00112\u00c0Ym".length();
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
                            var18_3[var16_4++] = lk0.a(var19_9).intern();
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
                lk0.b = var18_3;
                lk0.c = new String[9];
                lk0.h = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\u00d5$\u0012\u008eK\u00d2\u0016\u00c3|\u00c4\u000e\u009c*\u00ac\u001d\u00a8";
                var5_15 = "\u00d5$\u0012\u008eK\u00d2\u0016\u00c3|\u00c4\u000e\u009c*\u00ac\u001d\u00a8".length();
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
                    var4_14 = "/\u0010N\u008b\u0091\u00e6\u0011\u00ec\u0011\u00cf\u00d8w1]r\u0095";
                    var5_15 = "/\u0010N\u008b\u0091\u00e6\u0011\u00ec\u0011\u00cf\u00d8w1]r\u0095".length();
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
        lk0.e = var6_12;
        lk0.f = new Integer[4];
        lk0.Y = m44.a("h", (long)-4788844286071627447L, (long)var20);
        lk0.r = (long)m44.a("h", (long)-4879171007462117895L, (long)var20);
        m44.a("k", (long)m44.a("l", (long)-4648091718711325603L, (long)var20), (long)-6559371442833795904L, (long)var20);
        m44.a("k", (long)m44.a("l", (long)-4648091718711325603L, (long)var20), (long)-4692016854408977260L, (long)var20);
        m44.a("k", (long)m44.a("l", (long)-4648091718711325603L, (long)var20), (long)-6686959538130686984L, (long)var20);
        m44.a("k", (long)m44.a("l", (long)-4648091718711325603L, (long)var20), (long)-6502928732286879941L, (long)var20);
        lk0.q = m44.a("l", (long)-6861151425143247891L, (long)var20);
        m44.a("k", new LinkedHashMap<K, V>(), (long)-6665595769929907211L, (long)var20);
        m44.a("k", (long)(m44.a("w", (Object)m44.a("l", (long)-5167364385574188544L, (long)var20), (long)-6617599996065980471L, (long)var20) - m44.a("w", (Object)m44.a("l", (long)-5167364385574188544L, (long)var20), (long)-6724095901416172043L, (long)var20)), (long)-5162393497282808770L, (long)var20);
        m44.a("k", (PrintWriter)new PrintWriter((OutputStream)m44.a("l", (long)-6502060040591834699L, (long)var20), true), (long)-6613264505378789502L, (long)var20);
        m44.a("k", (PrintWriter)new PrintWriter((OutputStream)m44.a("l", (long)-6686432122090776041L, (long)var20), true), (long)-4636464586992342474L, (long)var20);
    }

    public static void M(Object[] objectArray) {
        Object object = objectArray[0];
        String[] stringArray = (String[])objectArray[1];
        long l10 = (Long)objectArray[2];
        l10 = a ^ l10;
        CallSite callSite = m44.a("i", (long)7455460961214626113L, (long)l10);
        if (object == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String string : stringArray) {
                stringBuilder.append(string.toString());
                if (callSite == null) continue;
            }
            throw new nn((String)((Object)lk0.a("z", (int)22229, (long)(0x3E07B8ABED873ECDL ^ l10))) + stringBuilder.toString());
        }
    }

    public static void S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        Object[] objectArray2 = (Object[])objectArray[2];
        l10 = a ^ l10;
        CallSite callSite = m44.a("h", (long)3879355404722973664L, (long)l10);
        if (object == null) {
            Object object2;
            StringBuilder stringBuilder = new StringBuilder();
            Object[] objectArray3 = objectArray2;
            int n10 = objectArray3.length;
            int n11 = 0;
            block4: while (n11 < n10) {
                object2 = objectArray3[n11];
                do {
                    block7: {
                        block8: {
                            StringBuilder stringBuilder2;
                            Object object3;
                            block9: {
                                object3 = object2;
                                try {
                                    try {
                                        if (l10 < 0L) break block7;
                                        stringBuilder2 = stringBuilder;
                                        if (callSite != null) break block8;
                                        if (stringBuilder2.length() <= 0) break block9;
                                    }
                                    catch (nn nn2) {
                                        throw m44.a("h", (Object)nn2, (long)3048211644837644244L, (long)l10);
                                    }
                                    stringBuilder.append((String)((Object)lk0.a("z", (int)16308, (long)(0x5836345414460509L ^ l10))));
                                }
                                catch (nn nn3) {
                                    throw m44.a("h", (Object)nn3, (long)3048211644837644244L, (long)l10);
                                }
                            }
                            stringBuilder2 = stringBuilder.append(object3.toString());
                        }
                        ++n11;
                    }
                    if (callSite == null) continue block4;
                    object2 = new nn((String)((Object)lk0.a("z", (int)22229, (long)(0x3E079BBA607B6C6CL ^ l10))) + stringBuilder.toString());
                } while (l10 < 0L);
            }
            throw object2;
        }
    }

    public static void C(Object[] objectArray) {
        Object object = objectArray[0];
        String string = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        l10 = a ^ l10;
        try {
            if (object != null) {
                throw new nn((String)((Object)lk0.a("z", (int)9080, (long)(0x367F8F05B45BC59EL ^ l10))) + string);
            }
        }
        catch (nn nn2) {
            throw m44.a("k", (Object)nn2, (long)8511271735499791239L, (long)l10);
        }
    }

    public static String s(Object[] objectArray) {
        Object object;
        long l10;
        block7: {
            Object object2;
            block8: {
                l10 = (Long)objectArray[0];
                object2 = objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("l", (long)-7065565589583920188L, (long)l10);
                try {
                    try {
                        object = object2;
                        if (callSite != null) break block7;
                        if (object != null) break block8;
                    }
                    catch (nn nn2) {
                        throw m44.a("l", (Object)nn2, (long)-9049630510562643984L, (long)l10);
                    }
                    return lk0.a("z", (int)7731, (long)(0x593517C71E270CADL ^ l10));
                }
                catch (nn nn3) {
                    throw m44.a("l", (Object)nn3, (long)-9049630510562643984L, (long)l10);
                }
            }
            object = object2;
        }
        String string = object.getClass().getName();
        string = string.replace((char)lk0.b("h", (int)20349, (long)(0x1E202D4097DD00C4L ^ l10)), (char)lk0.b("h", (int)5279, (long)(0x2F3FC3398A255B24L ^ l10)));
        int n10 = string.lastIndexOf(".");
        try {
            if (n10 > -1) {
                return string.substring(n10 + 1);
            }
        }
        catch (nn nn4) {
            throw m44.a("l", (Object)nn4, (long)-9049630510562643984L, (long)l10);
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String t(Object[] objectArray) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        StringBuilder stringBuilder3;
        block13: {
            Object[] objectArray2 = (Object[])objectArray[0];
            long l10 = (Long)objectArray[1];
            boolean bl2 = (Boolean)objectArray[2];
            l10 = a ^ l10;
            CallSite callSite = m44.a("k", (long)7662040337715459171L, (long)l10);
            if (objectArray2 == null) return lk0.a("z", (int)25760, (long)(0x7864134D4640019CL ^ l10));
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("{");
            block6: for (int i10 = 0; i10 < objectArray2.length; ++i10) {
                try {
                    try {
                        stringBuilder3 = stringBuilder4;
                    }
                    catch (nn nn2) {
                        throw m44.a("k", (Object)nn2, (long)8488819581723252823L, (long)l10);
                    }
                }
                catch (nn nn3) {
                    throw m44.a("k", (Object)nn3, (long)8488819581723252823L, (long)l10);
                }
                do {
                    String string;
                    if (l10 < 0L) return stringBuilder3.toString();
                    stringBuilder2 = new StringBuilder().append("#").append(i10).append((String)((Object)lk0.a("z", (int)28843, (long)(0x569E2EAD77511596L ^ l10)))).append(objectArray2[i10]);
                    if (callSite != null) break block13;
                    if (i10 < objectArray2.length - 1) {
                        StringBuilder stringBuilder5 = new StringBuilder();
                        Object object = ",";
                        if (callSite == null) {
                            try {
                                if (l10 > 0L) {
                                    stringBuilder5 = stringBuilder5.append((String)object);
                                    object = bl2 ? m44.a("o", (long)7679233582830972546L, (long)l10) : "";
                                }
                            }
                            catch (nn nn4) {
                                throw m44.a("k", (Object)nn4, (long)8488819581723252823L, (long)l10);
                            }
                        }
                        string = stringBuilder5.append((String)object).toString();
                    } else {
                        string = "";
                    }
                    stringBuilder3.append(stringBuilder2.append(string).toString());
                    if (callSite == null) continue block6;
                    stringBuilder = new StringBuilder();
                } while (l10 < 0L);
            }
            stringBuilder2 = stringBuilder4;
        }
        stringBuilder3 = stringBuilder.append(stringBuilder2.toString()).append("}");
        return stringBuilder3.toString();
    }

    public static void Z(Object[] objectArray) {
        String string = (String)objectArray[0];
    }

    public static String x(Object[] objectArray) {
        Object[] objectArray2 = (Object[])objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x1DB40D14DD38L;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = true;
        objectArray3[1] = l11;
        objectArray3[0] = objectArray2;
        return m44.a("n", (Object)objectArray3, (long)-1992320281692172730L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public static void t(boolean var0, String[] var1_1, long var2_2) {
        block12: {
            block13: {
                var2_2 = lk0.a ^ var2_2;
                try {
                    try {
                        if (var0) break block12;
                        if (var1_1.length != 1) break block13;
                    }
                    catch (nn v0) {
                        throw m44.a("n", (Object)v0, (long)8710945447335335290L, (long)var2_2);
                    }
                    throw new nn((String)lk0.a("z", (int)22229, (long)(4469692159603261122L ^ var2_2)) + var1_1[0]);
                }
                catch (nn v1) {
                    throw m44.a("n", (Object)v1, (long)8710945447335335290L, (long)var2_2);
                }
            }
            var4_3 = new StringBuilder();
            var4_3.append((char)lk0.b("h", (int)16513, (long)(4155976143172367793L ^ var2_2)));
            for (var5_4 = 0; var5_4 < var1_1.length; ++var5_4) {
                var6_5 = var1_1[var5_4];
                try {
                    var4_3.append(var6_5);
                    v2 = var5_4;
                    v3 = var1_1.length - 2;
                    if (var2_2 > 0L) {
                        if (v2 < v3) {
                            var4_3.append((String)lk0.a("z", (int)13501, (long)(2640897338412096683L ^ var2_2)));
                            continue;
                        }
                    }
                    ** GOTO lbl36
                }
                catch (nn v4) {
                    throw m44.a("n", (Object)v4, (long)8710945447335335290L, (long)var2_2);
                }
                try {
                    if (var2_2 <= 0L) continue;
                    v2 = var5_4;
                    v3 = var1_1.length - 2;
lbl36:
                    // 2 sources

                    if (v2 == v3) {
                        var4_3.append((String)lk0.a("z", (int)13233, (long)(2770952069923134372L ^ var2_2)));
                        continue;
                    }
                }
                catch (nn v5) {
                    throw m44.a("n", (Object)v5, (long)8710945447335335290L, (long)var2_2);
                }
                var4_3.append((char)lk0.b("h", (int)1912, (long)(9177038299439510090L ^ var2_2)));
                if (var2_2 >= 0L) continue;
            }
            throw new nn((String)lk0.a("z", (int)22229, (long)(4469692159603261122L ^ var2_2)) + var4_3);
        }
    }

    public static void m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        int n10 = (Integer)objectArray[2];
        l10 = a ^ l10;
        try {
            if (!bl2) {
                throw new nn((String)((Object)lk0.a("z", (int)22229, (long)(0x3E07BA9133093CEBL ^ l10))) + (String)((Object)m44.a("o", (int)n10, (long)7112011437398658877L, (long)l10)));
            }
        }
        catch (nn nn2) {
            throw m44.a("o", (Object)nn2, (long)8847969613191026515L, (long)l10);
        }
    }

    private static nn a(nn nn2) {
        return nn2;
    }

    private static String a(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x12A;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lk0", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            lk0.c[n11] = lk0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lk0.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lk0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5C0B;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lk0", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lk0.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lk0.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lk0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lk0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lk0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

