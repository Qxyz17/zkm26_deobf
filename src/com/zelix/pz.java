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

public class pz
extends v2 {
    private static final long a = prr.a((long)7629435659880375660L, (long)970630540928407533L, MethodHandles.lookup().lookupClass()).a(141032800143643L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public pz(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x330F2B7F29F0L;
        super(l2, n);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return pz.b("c", (int)3694, (long)(0x284F0FE2AF0BC58L ^ l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void O(Object[] var1_1) {
        block9: {
            block8: {
                var3_2 = (Long)var1_1[0];
                var5_3 = (lqq)var1_1[1];
                var7_4 = (Integer)var1_1[2];
                var2_5 = (Integer)var1_1[3];
                var6_6 = (Integer)var1_1[4];
                v0 = var3_2;
                var8_7 = v0 ^ 117400713146342L;
                var10_8 = v0 ^ 89438414467526L;
                var12_9 = v0 ^ 80192226461257L;
                var14_10 = v0 ^ 126172462975526L;
                var16_11 = m44.a("j", (long)-2447378320742416373L, (long)var3_2);
                try {
                    try {
                        v1 /* !! */  = this;
                        if (var16_11 != null) break block8;
                        v2 = new Object[1];
                        v2[0] = var14_10;
                        if (m44.a("u", (Object)v1 /* !! */ , (Object)v2, (long)-2630633816245593429L, (long)var3_2) > 0) {
                        }
                        ** GOTO lbl46
                    }
                    catch (n9 v3) {
                        throw m44.a("j", (Object)v3, (long)-2476791719435366818L, (long)var3_2);
                    }
                    v4 = new Object[2];
                    v4[1] = var12_9;
                    v4[0] = 0;
                    v1 /* !! */  = m44.a("u", (Object)this, (Object)v4, (long)-2419197939025966992L, (long)var3_2);
                }
                catch (n9 v5) {
                    throw m44.a("j", (Object)v5, (long)-2476791719435366818L, (long)var3_2);
                }
            }
            v6 = new Object[1];
            v6[0] = var8_7;
            var17_12 = m44.a("u", (Object)((zl)v1 /* !! */ ), (Object)v6, (long)-2565186629217682125L, (long)var3_2);
            try {
                v7 = new Object[2];
                v7[1] = var17_12;
                v7[0] = var10_8;
                m44.a("u", (Object)var5_3, (Object)v7, (long)-2547636373425346942L, (long)var3_2);
                if (var3_2 < 0L || var16_11 == null) break block9;
lbl46:
                // 2 sources

                v8 = new Object[2];
                v8[1] = pz.b("c", (int)16412, (long)(5242316733727837825L ^ var3_2));
                v8[0] = var10_8;
                m44.a("u", (Object)var5_3, (Object)v8, (long)-2547636373425346942L, (long)var3_2);
            }
            catch (n9 v9) {
                throw m44.a("j", (Object)v9, (long)-2476791719435366818L, (long)var3_2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x5E05C9DBC6D4L;
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
        String string = "\u000f\u00dc_-\u00e6T\u00aa\u0011\u00be9\u00f3\u00caD\u00ad\u00f3\u0017\u00c7\u00b0\u0016\u00c8W\u00af%r\u0018(M\u0001&\u00b2\u00a9N\u00e7\u0086Fr\u00b0\u0017\u00a6\u00b2\u00ad\u00e0\u009a\u00f7=\u0080m\u0090\u0081";
        int n2 = "\u000f\u00dc_-\u00e6T\u00aa\u0011\u00be9\u00f3\u00caD\u00ad\u00f3\u0017\u00c7\u00b0\u0016\u00c8W\u00af%r\u0018(M\u0001&\u00b2\u00a9N\u00e7\u0086Fr\u00b0\u0017\u00a6\u00b2\u00ad\u00e0\u009a\u00f7=\u0080m\u0090\u0081".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = pz.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D0;
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
                throw new RuntimeException("com/zelix/pz", exception);
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
            pz.d[n2] = pz.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = pz.b(n, l);
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
            throw new RuntimeException("com/zelix/pz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(pz.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
