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
    private static final long a = prr.a(-3809580527135334136L, -3810996899624629212L, MethodHandles.lookup().lookupClass()).a(227300423862136L);
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

    public lyx(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x72D21C499307L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
        m44.a("w", (Object)this, (boolean)false, (long)-8391156033185064456L, (long)l10);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x47526B4E5A06L;
        long l13 = l11 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        Object object = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
        CallSite callSite = m44.a("h", (long)-5113628074367501874L, (long)l10);
        for (int i10 = 0; i10 < object; ++i10) {
            lmu lmu3 = this.V(i10);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l13;
            objectArray3[1] = lqu2;
            objectArray3[0] = this;
            m44.a("w", (Object)lmu3, (Object)objectArray3, (long)-6656114929610942631L, (long)l10);
            if (callSite != false) continue;
        }
    }

    public void y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        m44.a("v", (Object)this, (boolean)true, (long)7398818388127528153L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x30602B23A7B4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("\u0019Z\u0002\u00db\u0015j\u001fv".getBytes("ISO-8859-1"));
        e = lyx.b(byArray3).intern();
        h = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        for (int i11 = 1; i11 < 8; ++i11) {
            byArray5 = byArray5;
            byArray5[i11] = (byte)(l10 << i11 * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00c5*$\fy;\u009e\u009b\u009a\u00b5\u00fe\u00cc8\u009d\u00b76";
        int n11 = "\u00c5*$\fy;\u009e\u009b\u009a\u00b5\u00fe\u00cc8\u009d\u00b76".length();
        int n12 = 0;
        do {
            byte[] byArray6 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n12 < n11);
        f = lArray;
        g = new Integer[2];
    }

    private static n9 c(n9 n92) {
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5DD7;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
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
                throw new RuntimeException("com/zelix/lyx", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lyx.g[n11] = n12;
        }
        return g[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lyx.a(n10, l10);
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

