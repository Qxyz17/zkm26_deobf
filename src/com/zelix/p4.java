/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v2;
import com.zelix.zl;
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

public class p4
extends v2 {
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long g;

    public p4(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x1F50DD256522L;
        super(l2, n);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return p4.b("y", (int)32678, (long)(0x4FD17805C159FD8AL ^ l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void O(Object[] var1_1) {
        block23: {
            block22: {
                var3_2 = (Long)var1_1[0];
                var7_3 = (lqq)var1_1[1];
                var5_4 = (Integer)var1_1[2];
                var2_5 = (Integer)var1_1[3];
                var6_6 = (Integer)var1_1[4];
                v0 = var3_2;
                var8_7 = v0 ^ 23804988921447L;
                var10_8 = v0 ^ 140620489979533L;
                var12_9 = v0 ^ 117400713146342L;
                var14_10 = v0 ^ 103938423061674L;
                var16_11 = v0 ^ 61976653785380L;
                var18_12 = v0 ^ 80192226461257L;
                var20_13 = v0 ^ 126172462975526L;
                v1 = new Object[1];
                v1[0] = var20_13;
                var23_14 = m44.a("u", (Object)this, (Object)v1, (long)-2630633816245593429L, (long)var3_2);
                var22_15 = m44.a("j", (long)-2447378320742416373L, (long)var3_2);
                try {
                    v2 = var23_14;
                    if (var22_15 != null) break block22;
                    if (v2 > 0) {
                    }
                    ** GOTO lbl130
                }
                catch (n9 v3) {
                    throw m44.a("j", (Object)v3, (long)-2421532005628854059L, (long)var3_2);
                }
                v2 = var24_16 = (reference)false;
            }
            while (var24_16 < var23_14) {
                block28: {
                    block29: {
                        block30: {
                            block26: {
                                block24: {
                                    block25: {
                                        v4 = new Object[2];
                                        v4[1] = var18_12;
                                        v4[0] = (int)var24_16;
                                        v5 = new Object[1];
                                        v5[0] = var12_9;
                                        var25_17 = m44.a("u", (Object)((zl)m44.a("u", (Object)this, (Object)v4, (long)-2419197939025966992L, (long)var3_2)), (Object)v5, (long)-2565186629217682125L, (long)var3_2);
                                        var26_18 = "";
                                        var27_19 = "";
                                        var28_20 = -1;
                                        if (var22_15 != null) break block23;
                                        v6 = var28_20 = var25_17.indexOf(":");
                                        try {
                                            v7 = -1;
                                            if (var22_15 != null) break block24;
                                            if (v6 != v7) break block25;
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("j", (Object)v8, (long)-2421532005628854059L, (long)var3_2);
                                        }
                                        v6 = var28_20 = var25_17.indexOf("/");
                                        try {
                                            v7 = -1;
                                            v9 = var22_15;
                                            if (var3_2 > 0L) {
                                                if (v9 != null) break block24;
                                                if (v6 != v7) break block25;
                                            }
                                            ** GOTO lbl75
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("j", (Object)v10, (long)-2421532005628854059L, (long)var3_2);
                                        }
                                        var28_20 = var25_17.indexOf("\\");
                                        if (var28_20 == -1) {
                                            // empty if block
                                        }
                                    }
                                    v6 = var28_20;
                                    v7 = -1;
                                }
                                try {
                                    try {
                                        block27: {
                                            try {
                                                try {
                                                    v9 = var22_15;
lbl75:
                                                    // 2 sources

                                                    if (v9 != null) break block26;
                                                    if (v6 <= v7) break block27;
                                                }
                                                catch (n9 v11) {
                                                    throw m44.a("j", (Object)v11, (long)-2421532005628854059L, (long)var3_2);
                                                }
                                                v12 = new Object[1];
                                                v12[0] = var14_10;
                                                v13 = new Object[2];
                                                v13[1] = var8_7;
                                                v13[0] = (String)p4.b("y", (int)944, (long)(7591568014466350385L ^ var3_2)) + (String)m44.a("u", (Object)this, (Object)v12, (long)-2510085184175232057L, (long)var3_2) + (String)p4.b("y", (int)19710, (long)(356930264923419257L ^ var3_2)) + var25_17.charAt(var28_20) + (String)p4.b("y", (int)19294, (long)(2998396358733477342L ^ var3_2)) + (String)var25_17 + "'";
                                                m44.a("u", (Object)var7_3, (Object)v13, (long)-4255967806691996554L, (long)var3_2);
                                                v14 = var22_15;
                                                if (var3_2 < 0L) break block28;
                                                if (v14 == null) break block29;
                                            }
                                            catch (n9 v15) {
                                                throw m44.a("j", (Object)v15, (long)-2421532005628854059L, (long)var3_2);
                                            }
                                        }
                                        v16 = var25_17;
                                        if (var22_15 != null) break block30;
                                    }
                                    catch (n9 v17) {
                                        throw m44.a("j", (Object)v17, (long)-2421532005628854059L, (long)var3_2);
                                    }
                                    v6 = v16.charAt(0);
                                    v7 = (int)p4.g;
                                }
                                catch (n9 v18) {
                                    throw m44.a("j", (Object)v18, (long)-2421532005628854059L, (long)var3_2);
                                }
                            }
                            if (v6 == v7) {
                                var25_17 = var25_17.substring(1);
                                var26_18 = p4.b("y", (int)20334, (long)(592710189622178283L ^ var3_2));
                                var27_19 = ")";
                            }
                            v19 = new Object[2];
                            v19[1] = var16_11;
                            v19[0] = var25_17;
                            v16 = m44.a("j", (Object)v19, (long)-4520246990041228786L, (long)var3_2);
                        }
                        var29_21 = v16;
                        v20 = new Object[2];
                        v20[1] = (String)var26_18 + (String)var29_21 + var27_19;
                        v20[0] = var10_8;
                        m44.a("u", (Object)var7_3, (Object)v20, (long)-2501267176101833317L, (long)var3_2);
                    }
                    ++var24_16;
                    v14 = var22_15;
                }
                if (v14 == null) continue;
            }
            try {
                if (var3_2 < 0L || var3_2 <= 0L || var22_15 == null) break block23;
lbl130:
                // 2 sources

                v21 = new Object[2];
                v21[1] = p4.b("y", (int)2483, (long)(6286350115517003575L ^ var3_2));
                v21[0] = var10_8;
                m44.a("u", (Object)var7_3, (Object)v21, (long)-2501267176101833317L, (long)var3_2);
            }
            catch (n9 v22) {
                throw m44.a("j", (Object)v22, (long)-2421532005628854059L, (long)var3_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    p4.a = prr.a((long)4586464198102893896L, (long)-5663918487966468651L, MethodHandles.lookup().lookupClass()).a(122339126156835L);
                    p4.e = new HashMap<K, V>(13);
                    var5 = p4.a ^ 46636599044215L;
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
                    var14_3 = new String[6];
                    var12_4 = 0;
                    var11_5 = "k\u00c4\r\u00c7\u00d9\u00b1T\u00dao\u00d8\u00fdhK\u00e4\u00a8\u00f2\u0010\u00c6\u00bf\u00972\u008b\u0003r\u0099r\u001eY\u00dc\u00cb\u00db\u0088\u0083(<\u000f\u0092\u0092\u0000\u00ab\u00e8KY\u00a4n\u00ff\"\u001f4\u00dd\u009f\u001dV\u00fa\u00cb\u00c9<\u00a0\u0014\u00a8\u00b7\u0019[\u00b9{\u009e\u00a8\u0000c\u0095\u0086\u001d\u000fu0/\u0003\u00c23\u009dV\"J\u00f3,r*\u0091q\u008fks\u0084\u00ef\u001a\u0015\u00de\u00ad`Z,\u001f\u0091\u0016\f\u00ba3\u0089\u00da\u001750]\u00dfR\u008e!#'\u00ad}\u00b2\u00c7";
                    var13_6 = "k\u00c4\r\u00c7\u00d9\u00b1T\u00dao\u00d8\u00fdhK\u00e4\u00a8\u00f2\u0010\u00c6\u00bf\u00972\u008b\u0003r\u0099r\u001eY\u00dc\u00cb\u00db\u0088\u0083(<\u000f\u0092\u0092\u0000\u00ab\u00e8KY\u00a4n\u00ff\"\u001f4\u00dd\u009f\u001dV\u00fa\u00cb\u00c9<\u00a0\u0014\u00a8\u00b7\u0019[\u00b9{\u009e\u00a8\u0000c\u0095\u0086\u001d\u000fu0/\u0003\u00c23\u009dV\"J\u00f3,r*\u0091q\u008fks\u0084\u00ef\u001a\u0015\u00de\u00ad`Z,\u001f\u0091\u0016\f\u00ba3\u0089\u00da\u001750]\u00dfR\u008e!#'\u00ad}\u00b2\u00c7".length();
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
                        var14_3[var12_4++] = p4.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00d4e\u007fy\u00ec\u00e6\u00a0\u00ec\u00c7\u000f0\u000e\u00c4\u00efK\u0086t%\u00e5\u00fb\u00dd\u0012\u00d9t\u00dd\u00f5\u00c3Z#f\u0002 8\u001c\u0003\u00ba0\u000e\u00ebx\u00cb\u00c9\u00a9e\u0010\u0010\u000f\u00e0\u00b8\u00b2{\u00fc\u0012/D\u00b6mf*\u001fq\u00cc\u00f4dd\u00f4m\u00c8\\9\u00ba\u00f9\u00bbRldb\u00fb\u0082\u00e3D\u00ad\u0099\u0091C!\u00db\u00ce\u00a9";
                        var13_6 = "\u00d4e\u007fy\u00ec\u00e6\u00a0\u00ec\u00c7\u000f0\u000e\u00c4\u00efK\u0086t%\u00e5\u00fb\u00dd\u0012\u00d9t\u00dd\u00f5\u00c3Z#f\u0002 8\u001c\u0003\u00ba0\u000e\u00ebx\u00cb\u00c9\u00a9e\u0010\u0010\u000f\u00e0\u00b8\u00b2{\u00fc\u0012/D\u00b6mf*\u001fq\u00cc\u00f4dd\u00f4m\u00c8\\9\u00ba\u00f9\u00bbRldb\u00fb\u0082\u00e3D\u00ad\u0099\u0091C!\u00db\u00ce\u00a9".length();
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
                        var14_3[var12_4++] = p4.b(var15_9).intern();
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
            p4.c = var14_3;
            p4.d = new String[6];
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
        var2_12 = 6303026400806912249L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        p4.g = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x31C9;
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
                throw new RuntimeException("com/zelix/p4", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            p4.d[n2] = p4.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = p4.b(n, l);
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
            throw new RuntimeException("com/zelix/p4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(p4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
