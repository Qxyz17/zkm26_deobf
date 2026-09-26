/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gm;
import com.zelix.gu;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.va;
import com.zelix.x5;
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

public class x6
extends js
implements ni,
gm {
    static final va c;
    x8 p;
    private static final long a;
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-193622521003929420L, (long)l).g());
        dataOutputStream.writeShort(m44.a("w", (Object)((Object)this), (long)-1896695577647150274L, (long)l).E());
    }

    public String J(Object[] objectArray) {
        CallSite callSite;
        block2: {
            Object object;
            block3: {
                long l = (Long)objectArray[0];
                long l2 = l;
                long l3 = l2 ^ 0x35ADBD43BF30L;
                long l4 = l2 ^ 0xFA7441B1117L;
                int n = (int)(l4 >>> 48);
                int n2 = (int)(l4 << 16 >>> 32);
                int n3 = (int)(l4 << 48 >>> 48);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = m44.a("u", (Object)((Object)this), (char)((char)n), (int)n2, (short)((short)n3), (long)-1944403841455342515L, (long)l);
                objectArray2[0] = l3;
                object = m44.a("j", (Object)objectArray2, (long)-487202251041244564L, (long)l);
                CallSite callSite2 = m44.a("j", (long)-356177348321305110L, (long)l);
                try {
                    callSite = object;
                    if (callSite2 != false) break block2;
                    if (((String)((Object)callSite)).length() <= x6.c("h", (int)5437, (long)(0x4BC635E25D61D5E6L ^ l))) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)-1857250852958799515L, (long)l);
                }
                object = ((String)object).substring(0, (int)x6.c("h", (int)10321, (long)(0x2088D20DAF89688BL ^ l))) + (String)((Object)x6.b("g", (int)4337, (long)(0xE2A601F37C8DD57L ^ l))) + (((String)object).length() - x6.c("h", (int)31587, (long)(0x477C3EC1F0223BBAL ^ l))) + (String)((Object)x6.b("g", (int)10175, (long)(0x7D053043F3B76A18L ^ l))) + ((String)object).substring(((String)object).length() - x6.c("h", (int)5064, (long)(0x688565DE624ED310L ^ l)));
            }
            callSite = object;
        }
        return callSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    x6.a = prr.a((long)6473034101126297927L, (long)-1702307610719451231L, MethodHandles.lookup().lookupClass()).a(181972006255062L);
                    var20 = x6.a ^ 74695120011736L;
                    x6.e = new HashMap<K, V>(13);
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
                    var15_5 = "\u00ac5 \u00d5\u00fb\u0086\u0092)6\u0088\u00ea\u00b6N\u0007\u00acK R\u009c\u00ab\u00b5#W\u00ac\u00f9\r\u0010\u00ee\u0014U:g\u0012\u009bo\u00c5\u00eaO\u00b5\u0006\u00efA\u009as\n\u0082\u00b1Xd";
                    var17_6 = "\u00ac5 \u00d5\u00fb\u0086\u0092)6\u0088\u00ea\u00b6N\u0007\u00acK R\u009c\u00ab\u00b5#W\u00ac\u00f9\r\u0010\u00ee\u0014U:g\u0012\u009bo\u00c5\u00eaO\u00b5\u0006\u00efA\u009as\n\u0082\u00b1Xd".length();
                    var14_7 = 16;
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
                        var18_3[var16_4++] = x6.b(var19_9).intern();
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
                x6.b = var18_3;
                x6.d = new String[2];
                x6.h = new HashMap<K, V>(13);
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
                var4_14 = "\u001e\u00b2\u00b5\u0007'\u00f9Z\u00fc\u00e3\u009c\u00d9|\u00f3~\u00bf#";
                var5_15 = "\u001e\u00b2\u00b5\u0007'\u00f9Z\u00fc\u00e3\u009c\u00d9|\u00f3~\u00bf#".length();
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
                    var4_14 = "\"t\u001d\f\u00bcqjQ/\u000e\u00b0\u00bb\u00f6R\u00ddj";
                    var5_15 = "\"t\u001d\f\u00bcqjQ/\u000e\u00b0\u00bb\u00f6R\u00ddj".length();
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
        x6.f = var6_12;
        x6.g = new Integer[4];
        x6.c = m44.a("n", (long)6376162263037892796L, (long)var20);
    }

    public void q(x8 x82, long l, x8 x83) {
        block5: {
            x6 x62;
            block4: {
                CallSite callSite = m44.a("n", (long)-5906177365838858378L, (long)l);
                try {
                    try {
                        x62 = this;
                        if (callSite == false) break block4;
                        if (m44.a("p", (Object)((Object)x62), (long)-5943967708609068271L, (long)l) != x82) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-5911567337569111383L, (long)l);
                    }
                    x62 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-5911567337569111383L, (long)l);
                }
            }
            m44.a("r", (Object)((Object)x62), (x8)x83, (long)-5943967708609068271L, (long)l);
        }
    }

    public boolean e(long l, gu gu2, Object object, Object object2) {
        long l2 = l ^ 0xB1C2A58BC7CL;
        return gu2.K((js)this, object, l2, object2);
    }

    public String z(char c, int n, short s) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        return m44.a("s", (Object)((Object)this), (long)-623295994144974390L, (long)l).V();
    }

    /*
     * Unable to fully structure code
     */
    protected void w(long var1_1, DataOutputStream var3_2, Map var4_3) {
        block9: {
            block8: {
                v0 = m44.a("h", (long)7191396267850401064L, (long)var1_1);
                var3_2.writeByte(m44.a("l", (long)7381820181989165973L, (long)var1_1).g());
                var5_4 = v0;
                var6_5 = (x8)var4_3.get(m44.a("v", (Object)this, (long)9118934256335458335L, (long)var1_1));
                try {
                    try {
                        v1 = var5_4;
                        if (var1_1 < 0L) ** GOTO lbl23
                        if (v1 != false) break block8;
                        if (var6_5 != null) {
                        }
                        ** GOTO lbl24
                    }
                    catch (n9 v2) {
                        throw m44.a("h", (Object)v2, (long)9150147221408637351L, (long)var1_1);
                    }
                    var3_2.writeShort(var6_5.E());
                }
                catch (n9 v3) {
                    throw m44.a("h", (Object)v3, (long)9150147221408637351L, (long)var1_1);
                }
            }
            try {
                if (var1_1 <= 0L) break block9;
                v1 = var5_4;
lbl23:
                // 2 sources

                if (v1 == false) break block9;
lbl24:
                // 2 sources

                var3_2.writeShort(m44.a("v", (Object)this, (long)9118934256335458335L, (long)var1_1).E());
            }
            catch (n9 v4) {
                throw m44.a("h", (Object)v4, (long)9150147221408637351L, (long)var1_1);
            }
        }
    }

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0xD19F7E5A7BBL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        return "\"" + (String)((Object)m44.a("q", (Object)((Object)this), (char)((char)n), (int)n2, (short)((short)n3), (long)6028092001148766945L, (long)l)) + "\"";
    }

    public x8 K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)((Object)this), (long)7491168193425574246L, (long)l);
    }

    public va A(long l) {
        return m44.a("i", (long)-5475121796814022176L, (long)l);
    }

    x6(x5 x52, long l, x8 x82, l6q l6q2) {
        long l2 = (l = a ^ l) ^ 0x57B865E86AD7L;
        super(x52.t, x52.l);
        m44.a("t", (Object)((Object)this), (x8)x82, (long)2172130741030842551L, (long)l);
        l6q2.t((Object)x82, (Object)this, l2);
    }

    public String s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)((Object)this), (long)5483108836196295300L, (long)l).V();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2213;
        if (d[n2] == null) {
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
                throw new RuntimeException("com/zelix/x6", exception);
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
            x6.d[n2] = x6.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = x6.b(n, l);
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
            throw new RuntimeException("com/zelix/x6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F6D;
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
                throw new RuntimeException("com/zelix/x6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            x6.g[n2] = n3;
        }
        return g[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = x6.c(n, l);
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
            throw new RuntimeException("com/zelix/x6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(x6.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
