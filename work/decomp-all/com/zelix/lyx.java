/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.i0;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
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

public abstract class lyx
extends l7t {
    boolean Q;
    private static final long a = prr.a((long)-3809580527135334136L, (long)-3810996899624629212L, MethodHandles.lookup().lookupClass()).a(227300423862136L);
    private static final String e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String e(Object[] var1_1) {
        block31: {
            block28: {
                block30: {
                    block24: {
                        block25: {
                            block23: {
                                var2_2 = (Long)var1_1[0];
                                var4_3 = var2_2 ^ 0L;
                                var7_4 = new StringBuilder();
                                var8_5 = this.r.length;
                                var6_6 = m44.a("n", (long)-6782168670771776808L, (long)var2_2);
                                try {
                                    v0 = m44.a("p", (Object)this, (long)-6689587660582817443L, (long)var2_2);
                                    if (var6_6 != false) break block23;
                                    if (v0 == false) {
                                    }
                                    ** GOTO lbl28
                                }
                                catch (n9 v1) {
                                    throw m44.a("n", (Object)v1, (long)-4702991747888719306L, (long)var2_2);
                                }
                                v0 = (reference)var8_5;
                            }
                            try {
                                try {
                                    v2 /* !! */  = var6_6;
                                    if (var2_2 >= 0L) {
                                        if (v2 /* !! */  != false) break block24;
                                        v2 /* !! */  = (CallSite)true;
                                    }
                                    if (v0 <= v2 /* !! */ ) break block25;
                                }
                                catch (n9 v3) {
                                    throw m44.a("n", (Object)v3, (long)-4702991747888719306L, (long)var2_2);
                                }
lbl28:
                                // 2 sources

                                var7_4.append((char)lyx.a("i", (int)14233, (long)(2650350389549752182L ^ var2_2)));
                            }
                            catch (n9 v4) {
                                throw m44.a("n", (Object)v4, (long)-4702991747888719306L, (long)var2_2);
                            }
                        }
                        v0 = var9_7 = (reference)false;
                    }
                    while (var9_7 < var8_5) {
                        block26: {
                            block27: {
                                block29: {
                                    var10_8 = (i0)this.r[var9_7];
                                    try {
                                        try {
                                            try {
                                                v5 = new Object[1];
                                                v5[0] = var4_3;
                                                var7_4.append((String)m44.a("q", (Object)var10_8, (Object)v5, (long)-6581495104713834516L, (long)var2_2));
                                                v6 = var6_6;
                                                if (var2_2 <= 0L) break block26;
                                                if (v6 != false) break block27;
                                                v7 /* !! */  = var9_7;
                                                v8 /* !! */  = (CallSite)(var8_5 - 1);
                                                if (var2_2 <= 0L || var6_6 != false) break block28;
                                            }
                                            catch (n9 v9) {
                                                throw m44.a("n", (Object)v9, (long)-4702991747888719306L, (long)var2_2);
                                            }
                                            if (v7 /* !! */  >= v8 /* !! */ ) break block29;
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("n", (Object)v10, (long)-4702991747888719306L, (long)var2_2);
                                        }
                                        var7_4.append(lyx.e);
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("n", (Object)v11, (long)-4702991747888719306L, (long)var2_2);
                                    }
                                }
                                ++var9_7;
                            }
                            v6 = var6_6;
                        }
                        if (v6 == false) continue;
                    }
                    try {
                        v7 /* !! */  = m44.a("p", (Object)this, (long)-6689587660582817443L, (long)var2_2);
                        v8 /* !! */  = var6_6;
                        if (var2_2 < 0L) break block28;
                        if (v8 /* !! */  != false) break block30;
                        if (v7 /* !! */  == false) {
                        }
                        ** GOTO lbl86
                    }
                    catch (n9 v12) {
                        throw m44.a("n", (Object)v12, (long)-4702991747888719306L, (long)var2_2);
                    }
                    v7 /* !! */  = (CallSite)var8_5;
                }
                v8 /* !! */  = (CallSite)true;
            }
            try {
                if (v7 /* !! */  <= v8 /* !! */ ) break block31;
lbl86:
                // 2 sources

                var7_4.append((char)lyx.a("i", (int)21358, (long)(7799852155516992384L ^ var2_2)));
            }
            catch (n9 v13) {
                throw m44.a("n", (Object)v13, (long)-4702991747888719306L, (long)var2_2);
            }
        }
        try {
            v14 = new StringBuilder();
            v15 = m44.a("p", (Object)this, (long)-6689587660582817443L, (long)var2_2) != false ? "!" : "";
        }
        catch (n9 v16) {
            throw m44.a("n", (Object)v16, (long)-4702991747888719306L, (long)var2_2);
        }
        return v14.append(v15).append(var7_4.toString()).toString();
    }

    public lyx(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x72D21C499307L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
        m44.a("w", (Object)((Object)this), (boolean)false, (long)-8391156033185064456L, (long)l);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x47526B4E5A06L;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object object = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
        CallSite callSite = m44.a("h", (long)-5113628074367501874L, (long)l);
        for (int i = 0; i < object; ++i) {
            lmu lmu3 = this.V(i);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l4;
            objectArray3[1] = lqu2;
            objectArray3[0] = this;
            m44.a("w", (Object)lmu3, (Object)objectArray3, (long)-6656114929610942631L, (long)l);
            if (callSite != false) continue;
        }
    }

    public void y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("v", (Object)((Object)this), (boolean)true, (long)7398818388127528153L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x30602B23A7B4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("\u0019Z\u0002\u00db\u0015j\u001fv".getBytes("ISO-8859-1"));
        e = lyx.b(byArray3).intern();
        h = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00c5*$\fy;\u009e\u009b\u009a\u00b5\u00fe\u00cc8\u009d\u00b76";
        int n2 = "\u00c5*$\fy;\u009e\u009b\u009a\u00b5\u00fe\u00cc8\u009d\u00b76".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        f = lArray;
        g = new Integer[2];
    }

    private static n9 c(n9 n92) {
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5DD7;
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
                throw new RuntimeException("com/zelix/lyx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lyx.g[n2] = n3;
        }
        return g[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = lyx.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lyx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lyx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
