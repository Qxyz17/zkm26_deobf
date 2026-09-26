/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fb;
import com.zelix.hz;
import com.zelix.lq4;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v7;
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

public class lqv
extends lq4 {
    private static lqv s;
    private static final long c;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = prr.a(543126487978033234L, -7918286501152881332L, MethodHandles.lookup().lookupClass()).a(28067179675896L);
        long l10 = c ^ 0x16A1F924AA28L;
        long l11 = l10 ^ 0x23EF27B9B6CEL;
        f = new HashMap(13);
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
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "^w\u0010\u00eaCI5P\u0015\u00aa\u0012\u00d3\u00c0\u00e4\u00ba\u00d3\u0010\u0014v\u00ad\u00c7\u00e7w\u00e4\u00deF\u009b\u00f7_\u00e6\u00a5\u00da\u0099";
        int n11 = "^w\u0010\u00eaCI5P\u0015\u00aa\u0012\u00d3\u00c0\u00e4\u00ba\u00d3\u0010\u0014v\u00ad\u00c7\u00e7w\u00e4\u00deF\u009b\u00f7_\u00e6\u00a5\u00da\u0099".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lqv.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                d = stringArray;
                e = new String[2];
                m44.a("j", (lqv)new lqv(l11), (long)8464267508997599912L, (long)l10);
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private lqv(long l10) {
        l10 = c ^ l10;
        m44.a("u", (Object)this, (String)"", (long)1026659434514344790L, (long)l10);
        m44.a("u", (Object)this, (int)0, (long)580998738994462646L, (long)l10);
        m44.a("u", (Object)this, (boolean)true, (long)1229651153661020813L, (long)l10);
    }

    lqv(long l10, hz hz2) {
        block37: {
            StringBuilder stringBuilder;
            block38: {
                v7[] v7Array;
                CallSite callSite;
                long l11;
                long l12;
                block27: {
                    block28: {
                        long l13 = l10 = c ^ l10;
                        long l14 = l13 ^ 0x3F0CC8C6E5DCL;
                        l12 = l13 ^ 0x5ACAD7284145L;
                        l11 = l13 ^ 0x47F41167C4F9L;
                        v7[] v7Array2 = hz2.X();
                        CallSite callSite2 = m44.a("m", (long)-2967953699595607521L, (long)l10);
                        stringBuilder = new StringBuilder();
                        m44.a("q", (Object)this, (int)0, (long)-3367487088391411998L, (long)l10);
                        callSite = callSite2;
                        int n10 = v7Array2.length;
                        int n11 = 0;
                        while (n11 < n10) {
                            CallSite callSite3;
                            block31: {
                                block32: {
                                    int n12;
                                    block29: {
                                        v7 v72;
                                        block30: {
                                            v7Array = v7Array2;
                                            if (l10 <= 0L) break block27;
                                            v72 = v7Array[n11];
                                            try {
                                                try {
                                                    try {
                                                        lqv lqv2 = this;
                                                        m44.a("q", (Object)lqv2, (int)(m44.a("s", (Object)lqv2, (long)-3367487088391411998L, (long)l10) + v72.C(l14)), (long)-3367487088391411998L, (long)l10);
                                                        if (callSite != null) break block28;
                                                        n12 = v72.c();
                                                        if (l10 < 0L || callSite != null) break block29;
                                                    }
                                                    catch (n9 n92) {
                                                        throw m44.a("m", (Object)n92, (long)-3967718999433770941L, (long)l10);
                                                    }
                                                    if (n12 != 0) break block30;
                                                }
                                                catch (n9 n93) {
                                                    throw m44.a("m", (Object)n93, (long)-3967718999433770941L, (long)l10);
                                                }
                                                m44.a("q", (Object)this, (boolean)true, (long)-4015858303063256103L, (long)l10);
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("m", (Object)n94, (long)-3967718999433770941L, (long)l10);
                                            }
                                        }
                                        try {
                                            stringBuilder.append(v72.M(l11));
                                            callSite3 = callSite;
                                            if (l10 <= 0L) break block31;
                                            if (callSite3 != null) break block32;
                                            n12 = n11;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("m", (Object)n95, (long)-3967718999433770941L, (long)l10);
                                        }
                                    }
                                    try {
                                        if (n12 < n10 - 1) {
                                            stringBuilder.append("|");
                                        }
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("m", (Object)n96, (long)-3967718999433770941L, (long)l10);
                                    }
                                    ++n11;
                                }
                                callSite3 = callSite;
                            }
                            if (callSite3 == null) continue;
                        }
                        stringBuilder.append((String)((Object)lqv.a("f", (int)1823, (long)(0xBC1D362935727D1L ^ l10))));
                        if (l10 > 0L) {
                            // empty if block
                        }
                    }
                    v7Array = hz2.T();
                }
                v7[] v7Array3 = v7Array;
                int n13 = v7Array3.length;
                int n14 = 0;
                while (n14 < n13) {
                    CallSite callSite4;
                    block35: {
                        block36: {
                            int n15;
                            block33: {
                                v7 v73;
                                block34: {
                                    v73 = v7Array3[n14];
                                    try {
                                        try {
                                            n15 = v73.c();
                                            if (l10 <= 0L || callSite != null) break block33;
                                            if (n15 != 0) break block34;
                                        }
                                        catch (n9 n97) {
                                            throw m44.a("m", (Object)n97, (long)-3967718999433770941L, (long)l10);
                                        }
                                        m44.a("q", (Object)this, (boolean)true, (long)-4015858303063256103L, (long)l10);
                                    }
                                    catch (n9 n98) {
                                        throw m44.a("m", (Object)n98, (long)-3967718999433770941L, (long)l10);
                                    }
                                }
                                try {
                                    stringBuilder.append(v73.M(l11));
                                    callSite4 = callSite;
                                    if (l10 < 0L) break block35;
                                    if (callSite4 != null) break block36;
                                    n15 = n14;
                                }
                                catch (n9 n99) {
                                    throw m44.a("m", (Object)n99, (long)-3967718999433770941L, (long)l10);
                                }
                            }
                            try {
                                if (n15 < n13 - 1) {
                                    stringBuilder.append("|");
                                }
                            }
                            catch (n9 n910) {
                                throw m44.a("m", (Object)n910, (long)-3967718999433770941L, (long)l10);
                            }
                            ++n14;
                        }
                        callSite4 = callSite;
                    }
                    if (callSite4 == null) continue;
                }
                fb fb2 = hz2.j();
                try {
                    try {
                        if (callSite != null) break block37;
                        if (fb2 == null) break block38;
                    }
                    catch (n9 n911) {
                        throw m44.a("m", (Object)n911, (long)-3967718999433770941L, (long)l10);
                    }
                    stringBuilder.append((String)((Object)lqv.a("f", (int)13687, (long)(0x5D1E0D75902415B8L ^ l10))));
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l12;
                    stringBuilder.append(m44.a("r", (Object)fb2, (Object)objectArray, (long)-3841272151654433587L, (long)l10).hashCode());
                }
                catch (n9 n912) {
                    throw m44.a("m", (Object)n912, (long)-3967718999433770941L, (long)l10);
                }
            }
            m44.a("q", (Object)this, (String)stringBuilder.toString(), (long)-2924179473181560318L, (long)l10);
        }
    }

    private static n9 b(n9 n92) {
        return n92;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x657D;
        if (e[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n11].getBytes("ISO-8859-1");
            lqv.e[n11] = lqv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lqv.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lqv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lqv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

