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
        c = prr.a((long)543126487978033234L, (long)-7918286501152881332L, MethodHandles.lookup().lookupClass()).a(28067179675896L);
        long l = c ^ 0x16A1F924AA28L;
        long l2 = l ^ 0x23EF27B9B6CEL;
        f = new HashMap(13);
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "^w\u0010\u00eaCI5P\u0015\u00aa\u0012\u00d3\u00c0\u00e4\u00ba\u00d3\u0010\u0014v\u00ad\u00c7\u00e7w\u00e4\u00deF\u009b\u00f7_\u00e6\u00a5\u00da\u0099";
        int n2 = "^w\u0010\u00eaCI5P\u0015\u00aa\u0012\u00d3\u00c0\u00e4\u00ba\u00d3\u0010\u0014v\u00ad\u00c7\u00e7w\u00e4\u00deF\u009b\u00f7_\u00e6\u00a5\u00da\u0099".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lqv.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                m44.a("j", (lqv)new lqv(l2), (long)8464267508997599912L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private lqv(long l) {
        l = c ^ l;
        m44.a("u", (Object)((Object)this), (String)"", (long)1026659434514344790L, (long)l);
        m44.a("u", (Object)((Object)this), (int)0, (long)580998738994462646L, (long)l);
        m44.a("u", (Object)((Object)this), (boolean)true, (long)1229651153661020813L, (long)l);
    }

    lqv(long l, hz hz2) {
        block37: {
            StringBuilder stringBuilder;
            block38: {
                v7[] v7Array;
                CallSite callSite;
                long l2;
                long l3;
                block27: {
                    block28: {
                        long l4 = l = c ^ l;
                        long l5 = l4 ^ 0x3F0CC8C6E5DCL;
                        l3 = l4 ^ 0x5ACAD7284145L;
                        l2 = l4 ^ 0x47F41167C4F9L;
                        v7[] v7Array2 = hz2.X();
                        CallSite callSite2 = m44.a("m", (long)-2967953699595607521L, (long)l);
                        stringBuilder = new StringBuilder();
                        m44.a("q", (Object)((Object)this), (int)0, (long)-3367487088391411998L, (long)l);
                        callSite = callSite2;
                        int n = v7Array2.length;
                        int n2 = 0;
                        while (n2 < n) {
                            CallSite callSite3;
                            block31: {
                                block32: {
                                    int n3;
                                    block29: {
                                        v7 v72;
                                        block30: {
                                            v7Array = v7Array2;
                                            if (l <= 0L) break block27;
                                            v72 = v7Array[n2];
                                            try {
                                                try {
                                                    try {
                                                        lqv lqv2 = this;
                                                        m44.a("q", (Object)((Object)lqv2), (int)(m44.a("s", (Object)((Object)lqv2), (long)-3367487088391411998L, (long)l) + v72.C(l5)), (long)-3367487088391411998L, (long)l);
                                                        if (callSite != null) break block28;
                                                        n3 = v72.c();
                                                        if (l < 0L || callSite != null) break block29;
                                                    }
                                                    catch (n9 n92) {
                                                        throw m44.a("m", (Object)((Object)n92), (long)-3967718999433770941L, (long)l);
                                                    }
                                                    if (n3 != 0) break block30;
                                                }
                                                catch (n9 n93) {
                                                    throw m44.a("m", (Object)((Object)n93), (long)-3967718999433770941L, (long)l);
                                                }
                                                m44.a("q", (Object)((Object)this), (boolean)true, (long)-4015858303063256103L, (long)l);
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("m", (Object)((Object)n94), (long)-3967718999433770941L, (long)l);
                                            }
                                        }
                                        try {
                                            stringBuilder.append(v72.M(l2));
                                            callSite3 = callSite;
                                            if (l <= 0L) break block31;
                                            if (callSite3 != null) break block32;
                                            n3 = n2;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("m", (Object)((Object)n95), (long)-3967718999433770941L, (long)l);
                                        }
                                    }
                                    try {
                                        if (n3 < n - 1) {
                                            stringBuilder.append("|");
                                        }
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("m", (Object)((Object)n96), (long)-3967718999433770941L, (long)l);
                                    }
                                    ++n2;
                                }
                                callSite3 = callSite;
                            }
                            if (callSite3 == null) continue;
                        }
                        stringBuilder.append((String)((Object)lqv.a("f", (int)1823, (long)(0xBC1D362935727D1L ^ l))));
                        if (l > 0L) {
                            // empty if block
                        }
                    }
                    v7Array = hz2.T();
                }
                v7[] v7Array3 = v7Array;
                int n = v7Array3.length;
                int n4 = 0;
                while (n4 < n) {
                    CallSite callSite4;
                    block35: {
                        block36: {
                            int n5;
                            block33: {
                                v7 v73;
                                block34: {
                                    v73 = v7Array3[n4];
                                    try {
                                        try {
                                            n5 = v73.c();
                                            if (l <= 0L || callSite != null) break block33;
                                            if (n5 != 0) break block34;
                                        }
                                        catch (n9 n97) {
                                            throw m44.a("m", (Object)((Object)n97), (long)-3967718999433770941L, (long)l);
                                        }
                                        m44.a("q", (Object)((Object)this), (boolean)true, (long)-4015858303063256103L, (long)l);
                                    }
                                    catch (n9 n98) {
                                        throw m44.a("m", (Object)((Object)n98), (long)-3967718999433770941L, (long)l);
                                    }
                                }
                                try {
                                    stringBuilder.append(v73.M(l2));
                                    callSite4 = callSite;
                                    if (l < 0L) break block35;
                                    if (callSite4 != null) break block36;
                                    n5 = n4;
                                }
                                catch (n9 n99) {
                                    throw m44.a("m", (Object)((Object)n99), (long)-3967718999433770941L, (long)l);
                                }
                            }
                            try {
                                if (n5 < n - 1) {
                                    stringBuilder.append("|");
                                }
                            }
                            catch (n9 n910) {
                                throw m44.a("m", (Object)((Object)n910), (long)-3967718999433770941L, (long)l);
                            }
                            ++n4;
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
                        throw m44.a("m", (Object)((Object)n911), (long)-3967718999433770941L, (long)l);
                    }
                    stringBuilder.append((String)((Object)lqv.a("f", (int)13687, (long)(0x5D1E0D75902415B8L ^ l))));
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    stringBuilder.append(m44.a("r", (Object)fb2, (Object)objectArray, (long)-3841272151654433587L, (long)l).hashCode());
                }
                catch (n9 n912) {
                    throw m44.a("m", (Object)((Object)n912), (long)-3967718999433770941L, (long)l);
                }
            }
            m44.a("q", (Object)((Object)this), (String)stringBuilder.toString(), (long)-2924179473181560318L, (long)l);
        }
    }

    private static n9 b(n9 n92) {
        return n92;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x657D;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            lqv.e[n2] = lqv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lqv.a(n, l);
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
