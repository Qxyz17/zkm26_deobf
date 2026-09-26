/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.gm;
import com.zelix.gu;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.va;
import com.zelix.x0;
import com.zelix.x8;
import java.io.DataOutputStream;
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

public class xl
extends js
implements ni,
gm {
    static final va G;
    x8 B;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public va A(long l) {
        return m44.a("i", (long)-6101424031345896526L, (long)l);
    }

    public void q(x8 x82, long l, x8 x83) {
        block5: {
            xl xl2;
            block4: {
                CallSite callSite = m44.a("n", (long)-5906177365838858378L, (long)l);
                try {
                    try {
                        xl2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("p", (Object)((Object)xl2), (long)-5910329908020669403L, (long)l) != x82) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-5355891293455554988L, (long)l);
                    }
                    xl2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-5355891293455554988L, (long)l);
                }
            }
            m44.a("r", (Object)((Object)xl2), (x8)x83, (long)-5910329908020669403L, (long)l);
        }
    }

    xl(x0 x02, long l, x8 x82, l6q l6q2) {
        long l2 = (l = a ^ l) ^ 0x1E3BF797D9C4L;
        super(x02.t, x02.l);
        m44.a("w", (Object)((Object)this), (x8)x82, (long)-5958475084550138736L, (long)l);
        l6q2.t((Object)x82, (Object)this, l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    xl.a = prr.a((long)-469462589070366854L, (long)-3660242181424048622L, MethodHandles.lookup().lookupClass()).a(33634571344406L);
                    var20 = xl.a ^ 17550385503775L;
                    xl.d = new HashMap<K, V>(13);
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
                    var18_3 = new String[2];
                    var16_4 = 0;
                    var15_5 = "\u0080)\u00cc\u0089L\u00d1\u0080\u00f3\u009e\u00f8\u00f1\u0094B\u008a\u00bb\u00d4\u0085\u00c2 \u00f0\u009e\r\u00dfg\u00ca\u00d1bgy\u0098J\u001f\u0010\u0001|\u00aa\u0098\u0089UW\u00d7\u00ca\u00eb\u00f9\u0012k=\u00c9\t";
                    var17_6 = "\u0080)\u00cc\u0089L\u00d1\u0080\u00f3\u009e\u00f8\u00f1\u0094B\u008a\u00bb\u00d4\u0085\u00c2 \u00f0\u009e\r\u00dfg\u00ca\u00d1bgy\u0098J\u001f\u0010\u0001|\u00aa\u0098\u0089UW\u00d7\u00ca\u00eb\u00f9\u0012k=\u00c9\t".length();
                    var14_7 = 32;
                    var13_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var18_3[var16_4++] = xl.b(var19_9).intern();
                        if ((var13_8 += var14_7) < var17_6) {
                            var14_7 = var15_5.charAt(var13_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var13_8;
                    var19_9 = var11_1.doFinal(var15_5.substring(v3, v3 + var14_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                xl.b = var18_3;
                xl.c = new String[2];
                xl.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "NI\u00e5\u00ae\u00a7\u00c0n\u00bf\u0090\u00cc\u00b8\u00a0\u0012\u00c8\u00b6\u009f";
                var5_15 = "NI\u00e5\u00ae\u00a7\u00c0n\u00bf\u0090\u00cc\u00b8\u00a0\u0012\u00c8\u00b6\u009f".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00df\u00e9\u00c1K\u00d4\u00fb\u0001\u00dfs\u008dt\u00ab\u001a\u00e6\u0013$";
                    var5_15 = "\u00df\u00e9\u00c1K\u00d4\u00fb\u0001\u00dfs\u008dt\u00ab\u001a\u00e6\u0013$".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl84:
                // 1 sources

                ** continue;
            }
        }
        xl.e = var6_12;
        xl.f = new Integer[4];
        xl.G = m44.a("h", (long)-707340880190116141L, (long)var20);
    }

    public String z(char c, int n, short s) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        return m44.a("s", (Object)((Object)this), (long)-639202151101772034L, (long)l).V();
    }

    public boolean e(long l, gu gu2, Object object, Object object2) {
        long l2 = l ^ 0xB1C2A58BC7CL;
        return gu2.K((js)this, object, l2, object2);
    }

    public String J(Object[] objectArray) {
        CallSite callSite;
        block2: {
            Object object;
            block3: {
                long l = (Long)objectArray[0];
                long l2 = l;
                long l3 = l2 ^ 0xFA7441B1117L;
                int n = (int)(l3 >>> 48);
                int n2 = (int)(l3 << 16 >>> 32);
                int n3 = (int)(l3 << 48 >>> 48);
                long l4 = l2 ^ 0x35ADBD43BF30L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = m44.a("u", (Object)((Object)this), (char)((char)n), (int)n2, (short)((short)n3), (long)-2117005741512996437L, (long)l);
                objectArray2[0] = l4;
                object = m44.a("j", (Object)objectArray2, (long)-487202251041244564L, (long)l);
                CallSite callSite2 = m44.a("j", (long)-356177348321305110L, (long)l);
                try {
                    callSite = object;
                    if (callSite2 != false) break block2;
                    if (((String)((Object)callSite)).length() <= xl.c("v", (int)26944, (long)(0x16EB46FF49E6D450L ^ l))) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)-117003578584584808L, (long)l);
                }
                object = ((String)object).substring(0, (int)xl.c("v", (int)30767, (long)(0x53F7E4C41CC8C53EL ^ l))) + (String)((Object)xl.b("o", (int)4352, (long)(0x263B9D913BC37334L ^ l))) + (((String)object).length() - xl.c("v", (int)3004, (long)(0x4F5943E5234836AEL ^ l))) + (String)((Object)xl.b("o", (int)4039, (long)(0x1E335B251B846DF2L ^ l))) + ((String)object).substring(((String)object).length() - xl.c("v", (int)19039, (long)(0x6DCC2A0BF242774CL ^ l)));
            }
            callSite = object;
        }
        return callSite;
    }

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0xD19F7E5A7BBL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        return "\"" + (String)((Object)m44.a("q", (Object)((Object)this), (char)((char)n), (int)n2, (short)((short)n3), (long)6067158763903221511L, (long)l)) + "\"";
    }

    void M(Object[] objectArray) {
        Map map = (Map)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x3CF22DC73C33L;
        String string = m44.a("t", (Object)((Object)this), (long)1251476322891540609L, (long)l).V();
        String string2 = (String)cf.J((long)l2, (Object)string, (Map)map);
        try {
            if (!string.equals(string2)) {
                m44.a("t", (Object)((Object)this), (long)1251476322891540609L, (long)l).A(string2);
            }
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)((Object)n92), (long)650880545138793200L, (long)l);
        }
    }

    public x8 z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("p", (Object)((Object)this), (long)8534944302176358317L, (long)l);
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-2159744544114615578L, (long)l).g());
        dataOutputStream.writeShort(m44.a("w", (Object)((Object)this), (long)-1885574531914867702L, (long)l).E());
    }

    /*
     * Unable to fully structure code
     */
    protected void w(long var1_1, DataOutputStream var3_2, Map var4_3) {
        block9: {
            block8: {
                v0 = m44.a("h", (long)7191396267850401064L, (long)var1_1);
                var3_2.writeByte(m44.a("l", (long)8729780136615363015L, (long)var1_1).g());
                var6_4 = (x8)var4_3.get(m44.a("v", (Object)this, (long)9148065366964782891L, (long)var1_1));
                var5_5 = v0;
                try {
                    try {
                        v1 = var5_5;
                        if (var1_1 < 0L) ** GOTO lbl23
                        if (v1 != false) break block8;
                        if (var6_4 != null) {
                        }
                        ** GOTO lbl24
                    }
                    catch (n9 v2) {
                        throw m44.a("h", (Object)v2, (long)7395530189000389978L, (long)var1_1);
                    }
                    var3_2.writeShort(var6_4.E());
                }
                catch (n9 v3) {
                    throw m44.a("h", (Object)v3, (long)7395530189000389978L, (long)var1_1);
                }
            }
            try {
                if (var1_1 < 0L) break block9;
                v1 = var5_5;
lbl23:
                // 2 sources

                if (v1 == false) break block9;
lbl24:
                // 2 sources

                var3_2.writeShort(m44.a("v", (Object)this, (long)9148065366964782891L, (long)var1_1).E());
            }
            catch (n9 v4) {
                throw m44.a("h", (Object)v4, (long)7395530189000389978L, (long)var1_1);
            }
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xD80;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/xl", exception);
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
            xl.c[n2] = xl.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xl.b(n, l);
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
            throw new RuntimeException("com/zelix/xl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x52A4;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/xl", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xl.f[n2] = n3;
        }
        return f[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = xl.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/xl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xl.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(xl.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
