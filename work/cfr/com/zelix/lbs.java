/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ti;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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

public class lbs
extends KeyAdapter {
    final ti U;
    private static final long a = prr.a(7425678609053017955L, -4951310150521152958L, MethodHandles.lookup().lookupClass()).a(68675674857880L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     */
    @Override
    public void keyPressed(KeyEvent var1_1) {
        block45: {
            block50: {
                block49: {
                    block42: {
                        block48: {
                            block46: {
                                block43: {
                                    v0 = var2_2 = lbs.a ^ 98336349584369L;
                                    var4_3 = v0 ^ 116153829688204L;
                                    var6_4 = v0 ^ 63157143323313L;
                                    var8_5 = v0 ^ 50086120983989L;
                                    var10_6 = v0 ^ 125241556366586L;
                                    var13_7 = m44.a("p", (Object)var1_1, (long)-4966616025457203780L, (long)var2_2);
                                    var12_8 = m44.a("o", (long)-4714650285875345310L, (long)var2_2);
                                    try {
                                        try {
                                            block44: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v1 = m44.a("p", (Object)var1_1, (long)-4990906087647694872L, (long)var2_2);
                                                                v2 = lbs.a("l", (int)1193, (long)(1544528876463462511L ^ var2_2));
                                                                if (var12_8 != null) break block42;
                                                                if (v1 == v2) {
                                                                }
                                                                ** GOTO lbl111
                                                            }
                                                            catch (n9 v3) {
                                                                throw m44.a("o", (Object)v3, (long)-4709116430552336487L, (long)var2_2);
                                                            }
                                                            v4 = var13_7;
                                                            v5 = m44.a("q", (Object)m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2), (long)-5002712574847856901L, (long)var2_2);
                                                            if (var12_8 != null) break block43;
                                                        }
                                                        catch (n9 v6) {
                                                            throw m44.a("o", (Object)v6, (long)-4709116430552336487L, (long)var2_2);
                                                        }
                                                        if (v4 != v5) break block44;
                                                    }
                                                    catch (n9 v7) {
                                                        throw m44.a("o", (Object)v7, (long)-4709116430552336487L, (long)var2_2);
                                                    }
                                                    v8 = new Object[1];
                                                    v8[0] = var10_6;
                                                    m44.a("p", (Object)m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2), (Object)v8, (long)-5039822969183016183L, (long)var2_2);
                                                    if (var12_8 == null) break block45;
                                                }
                                                catch (n9 v9) {
                                                    throw m44.a("o", (Object)v9, (long)-4709116430552336487L, (long)var2_2);
                                                }
                                            }
                                            v4 = var13_7;
                                            v10 = m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2);
                                            if (var12_8 != null) break block46;
                                        }
                                        catch (n9 v11) {
                                            throw m44.a("o", (Object)v11, (long)-4709116430552336487L, (long)var2_2);
                                        }
                                        v5 = m44.a("q", (Object)v10, (long)-6665754256975415005L, (long)var2_2);
                                    }
                                    catch (n9 v12) {
                                        throw m44.a("o", (Object)v12, (long)-4709116430552336487L, (long)var2_2);
                                    }
                                }
                                try {
                                    block47: {
                                        try {
                                            if (v4 != v5) break block47;
                                            v13 = new Object[1];
                                            v13[0] = var4_3;
                                            m44.a("p", (Object)m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2), (Object)v13, (long)-6471261840419434182L, (long)var2_2);
                                            if (var12_8 == null) break block45;
                                        }
                                        catch (n9 v14) {
                                            throw m44.a("o", (Object)v14, (long)-4709116430552336487L, (long)var2_2);
                                        }
                                    }
                                    v4 = var13_7;
                                    v10 = m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2);
                                }
                                catch (n9 v15) {
                                    throw m44.a("o", (Object)v15, (long)-4709116430552336487L, (long)var2_2);
                                }
                            }
                            try {
                                if (var12_8 != null) break block48;
                                if (v4 == m44.a("q", (Object)v10, (long)-4903416662306368243L, (long)var2_2)) {
                                }
                                ** GOTO lbl93
                            }
                            catch (n9 v16) {
                                throw m44.a("o", (Object)v16, (long)-4709116430552336487L, (long)var2_2);
                            }
                            var14_9 = (gj)m44.a("p", (Object)m44.a("q", (Object)m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2), (long)-4903416662306368243L, (long)var2_2), (long)-4958522603797694449L, (long)var2_2);
                            try {
                                v17 = new Object[1];
                                v17[0] = var6_4;
                                if (m44.a("p", (Object)var14_9, (Object)v17, (long)-6716700534104984698L, (long)var2_2) == false) {
                                    v18 = new Object[1];
                                    v18[0] = var4_3;
                                    m44.a("p", (Object)m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2), (Object)v18, (long)-6471261840419434182L, (long)var2_2);
                                }
                            }
                            catch (n9 v19) {
                                throw m44.a("o", (Object)v19, (long)-4709116430552336487L, (long)var2_2);
                            }
                            try {
                                if (var12_8 == null) break block45;
lbl93:
                                // 2 sources

                                v4 = var13_7;
                                v10 = m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2);
                            }
                            catch (n9 v20) {
                                throw m44.a("o", (Object)v20, (long)-4709116430552336487L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (v4 != m44.a("q", (Object)v10, (long)-6624166337248116271L, (long)var2_2)) break block45;
                                    v21 = new Object[1];
                                    v21[0] = var8_5;
                                    m44.a("p", (Object)m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2), (Object)v21, (long)-6692571590940990309L, (long)var2_2);
                                    if (var12_8 == null) break block45;
                                }
                                catch (n9 v22) {
                                    throw m44.a("o", (Object)v22, (long)-4709116430552336487L, (long)var2_2);
                                }
lbl111:
                                // 2 sources

                                v23 = var1_1;
                                if (var12_8 != null) break block49;
                            }
                            catch (n9 v24) {
                                throw m44.a("o", (Object)v24, (long)-4709116430552336487L, (long)var2_2);
                            }
                            v1 = m44.a("p", (Object)v23, (long)-4990906087647694872L, (long)var2_2);
                            v2 = lbs.a("l", (int)14791, (long)(2992432500090112L ^ var2_2));
                        }
                        catch (n9 v25) {
                            throw m44.a("o", (Object)v25, (long)-4709116430552336487L, (long)var2_2);
                        }
                    }
                    if (v1 != v2) break block45;
                    v23 = var13_7;
                }
                try {
                    v26 = m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2);
                    if (var12_8 != null) break block50;
                    if (v23 == m44.a("q", (Object)v26, (long)-4903416662306368243L, (long)var2_2)) {
                    }
                    ** GOTO lbl148
                }
                catch (n9 v27) {
                    throw m44.a("o", (Object)v27, (long)-4709116430552336487L, (long)var2_2);
                }
                var14_9 = (gj)m44.a("p", (Object)m44.a("q", (Object)m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2), (long)-4903416662306368243L, (long)var2_2), (long)-4958522603797694449L, (long)var2_2);
                try {
                    v28 = new Object[1];
                    v28[0] = var6_4;
                    if (m44.a("p", (Object)var14_9, (Object)v28, (long)-6716700534104984698L, (long)var2_2) == false) {
                        v29 = new Object[1];
                        v29[0] = var8_5;
                        m44.a("p", (Object)m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2), (Object)v29, (long)-6692571590940990309L, (long)var2_2);
                    }
                }
                catch (n9 v30) {
                    throw m44.a("o", (Object)v30, (long)-4709116430552336487L, (long)var2_2);
                }
                try {
                    if (var12_8 == null) break block45;
lbl148:
                    // 2 sources

                    v23 = var13_7;
                    v26 = m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2);
                }
                catch (n9 v31) {
                    throw m44.a("o", (Object)v31, (long)-4709116430552336487L, (long)var2_2);
                }
            }
            try {
                if (v23 == m44.a("q", (Object)v26, (long)-6624166337248116271L, (long)var2_2)) {
                    v32 = new Object[1];
                    v32[0] = var8_5;
                    m44.a("p", (Object)m44.a("q", (Object)this, (long)-4771070567074152911L, (long)var2_2), (Object)v32, (long)-6692571590940990309L, (long)var2_2);
                }
            }
            catch (n9 v33) {
                throw m44.a("o", (Object)v33, (long)-4709116430552336487L, (long)var2_2);
            }
        }
    }

    lbs(ti ti2) {
        this.U = ti2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0xE4B466C5CFDL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0086\u00bez\u00b5\u00b3\u00cds\u00e3\u00b4r\u0012\u0093\u0099\u00ab\u00f5\f";
        int n11 = "\u0086\u00bez\u00b5\u00b3\u00cds\u00e3\u00b4r\u0012\u0093\u0099\u00ab\u00f5\f".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2BDE;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lbs", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lbs.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lbs.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lbs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lbs.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

