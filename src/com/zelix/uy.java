/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lo1;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.of;
import com.zelix.prr;
import java.awt.Component;
import java.io.File;
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
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class uy
extends DefaultListCellRenderer {
    final of U;
    lo1 P;
    private static final long a = prr.a((long)-6015178091539231505L, (long)8574208584461241199L, MethodHandles.lookup().lookupClass()).a(117093421476137L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    uy(long l, of of2) {
        long l2 = (l = a ^ l) ^ 0x306888202458L;
        this.U = of2;
        m44.a("v", (Object)this, (lo1)new lo1(l2), (long)-7122099279511123060L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Component getListCellRendererComponent(JList var1_1, Object var2_2, int var3_3, boolean var4_4, boolean var5_5) {
        block37: {
            block38: {
                block35: {
                    block34: {
                        block33: {
                            block31: {
                                block32: {
                                    block30: {
                                        var6_6 = uy.a ^ 119042672335051L;
                                        var8_7 = var6_6 ^ 110119137199723L;
                                        v0 = m44.a("o", (long)4149684242648110834L, (long)var6_6);
                                        super.getListCellRendererComponent((JList<?>)var1_1, var2_2, var3_3, var4_4, var5_5);
                                        var11_8 = var2_2.toString();
                                        var10_9 = v0;
                                        var12_10 = var11_8;
                                        try {
                                            v1 = var12_10.equals(".");
                                            if (var10_9 == null) break block30;
                                            if (v1) {
                                            }
                                            ** GOTO lbl22
                                        }
                                        catch (n9 v2) {
                                            throw m44.a("o", (Object)v2, (long)4179273618894033991L, (long)var6_6);
                                        }
                                        var12_10 = m44.a("q", (Object)m44.a("q", (Object)this, (long)2601350669333343769L, (long)var6_6), (long)4267992883823092981L, (long)var6_6);
                                        try {
                                            try {
                                                if (var10_9 != null) break block31;
lbl22:
                                                // 2 sources

                                                v3 = var12_10;
                                                if (var10_9 == null) break block32;
                                            }
                                            catch (n9 v4) {
                                                throw m44.a("o", (Object)v4, (long)4179273618894033991L, (long)var6_6);
                                            }
                                            v1 = v3.equals(uy.a("m", (int)14515, (long)(5235602451023744996L ^ var6_6)));
                                        }
                                        catch (n9 v5) {
                                            throw m44.a("o", (Object)v5, (long)4179273618894033991L, (long)var6_6);
                                        }
                                    }
                                    try {
                                        if (!v1) break block31;
                                        v6 = m44.a("q", (Object)m44.a("q", (Object)this, (long)2601350669333343769L, (long)var6_6), (long)4552488002240027064L, (long)var6_6);
                                        if (var10_9 == null) break block33;
                                    }
                                    catch (n9 v7) {
                                        throw m44.a("o", (Object)v7, (long)4179273618894033991L, (long)var6_6);
                                    }
                                    v3 = var12_10 = m44.a("p", (Object)v6, (long)2593929043762174882L, (long)var6_6);
                                }
                                if (v3 == null) {
                                    var12_10 = m44.a("q", (Object)m44.a("q", (Object)this, (long)2601350669333343769L, (long)var6_6), (long)4267992883823092981L, (long)var6_6);
                                }
                            }
                            v6 = new File((String)var12_10);
                        }
                        var13_11 = v6;
                        v8 = new Object[2];
                        v8[1] = var8_7;
                        v8[0] = var13_11;
                        var14_12 = m44.a("p", (Object)m44.a("q", (Object)this, (long)4241404662930943097L, (long)var6_6), (Object)v8, (long)2879911313994273352L, (long)var6_6);
                        try {
                            if (var14_12 != null) {
                                m44.a("p", (Object)this, (Object)var14_12, (long)2797244844372064175L, (long)var6_6);
                            }
                        }
                        catch (n9 v9) {
                            throw m44.a("o", (Object)v9, (long)4179273618894033991L, (long)var6_6);
                        }
                        try {
                            try {
                                v10 /* !! */  = var11_8.equals(".");
                                if (var10_9 == null) break block34;
                                if (!v10 /* !! */ ) {
                                }
                                ** GOTO lbl81
                            }
                            catch (n9 v11) {
                                throw m44.a("o", (Object)v11, (long)4179273618894033991L, (long)var6_6);
                            }
                            v10 /* !! */  = var11_8.equals(uy.a("m", (int)13774, (long)(3478107390180180632L ^ var6_6)));
                        }
                        catch (n9 v12) {
                            throw m44.a("o", (Object)v12, (long)4179273618894033991L, (long)var6_6);
                        }
                    }
                    try {
                        try {
                            block36: {
                                try {
                                    try {
                                        if (var10_9 == null) break block35;
                                        if (!v10 /* !! */ ) break block36;
                                    }
                                    catch (n9 v13) {
                                        throw m44.a("o", (Object)v13, (long)4179273618894033991L, (long)var6_6);
                                    }
lbl81:
                                    // 2 sources

                                    m44.a("p", (Object)this, (Object)var11_8, (long)2700482493849695926L, (long)var6_6);
                                    if (var10_9 != null) break block37;
                                }
                                catch (n9 v14) {
                                    throw m44.a("o", (Object)v14, (long)4179273618894033991L, (long)var6_6);
                                }
                            }
                            v15 = this;
                            if (var10_9 == null) break block38;
                        }
                        catch (n9 v16) {
                            throw m44.a("o", (Object)v16, (long)4179273618894033991L, (long)var6_6);
                        }
                        v10 /* !! */  = m44.a("q", (Object)m44.a("q", (Object)v15, (long)2601350669333343769L, (long)var6_6), (long)4297059700578899392L, (long)var6_6);
                    }
                    catch (n9 v17) {
                        throw m44.a("o", (Object)v17, (long)4179273618894033991L, (long)var6_6);
                    }
                }
                try {
                    block39: {
                        try {
                            if (!v10 /* !! */ ) break block39;
                            m44.a("p", (Object)this, (Object)m44.a("p", (Object)var13_11, (long)2617839299121436975L, (long)var6_6), (long)2700482493849695926L, (long)var6_6);
                            if (var10_9 != null) break block37;
                        }
                        catch (n9 v18) {
                            throw m44.a("o", (Object)v18, (long)4179273618894033991L, (long)var6_6);
                        }
                    }
                    v15 = this;
                }
                catch (n9 v19) {
                    throw m44.a("o", (Object)v19, (long)4179273618894033991L, (long)var6_6);
                }
            }
            m44.a("p", (Object)v15, (Object)m44.a("p", (Object)var13_11, (long)2551193883511377855L, (long)var6_6), (long)2700482493849695926L, (long)var6_6);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x6A28A7491631L;
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
        String string = "\u00b2\u00b9\u00d9\u00fa\u00ebd\u00e0\u008f4@\u00f0umO.9\u0010\u00dd,qtv.9\u009f\u00fb-\u0014\b\u00024\u00e6 ";
        int n2 = "\u00b2\u00b9\u00d9\u00fa\u00ebd\u00e0\u008f4@\u00f0umO.9\u0010\u00dd,qtv.9\u009f\u00fb-\u0014\b\u00024\u00e6 ".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = uy.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static n9 a(n9 n92) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4107;
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
                throw new RuntimeException("com/zelix/uy", exception);
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
            uy.c[n2] = uy.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = uy.a(n, l);
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
            throw new RuntimeException("com/zelix/uy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(uy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
