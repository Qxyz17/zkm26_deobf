/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.d2;
import com.zelix.f_;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o4;
import com.zelix.prr;
import com.zelix.s3;
import com.zelix.sv;
import com.zelix.us;
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
import javax.swing.DefaultListModel;

public class ft
implements us,
f_ {
    Object X;
    DefaultListModel e;
    s3 V;
    o4 P;
    private static final long a = prr.a(-1921886765359728979L, 4804636410124701869L, MethodHandles.lookup().lookupClass()).a(13316840671636L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     */
    @Override
    public void N(Object[] var1_1) {
        block27: {
            block22: {
                block20: {
                    block24: {
                        block25: {
                            block26: {
                                block23: {
                                    block21: {
                                        var5_2 = (m)var1_1[0];
                                        var2_3 = (Long)var1_1[1];
                                        var7_4 = var1_1[2];
                                        var4_5 = var1_1[3];
                                        var6_6 = var1_1[4];
                                        v0 = var2_3;
                                        var8_7 = v0 ^ 5093510597599L;
                                        var10_8 = v0 ^ 48686831834004L;
                                        var12_9 = v0 ^ 61716301290400L;
                                        var15_10 = m44.a("r", (Object)((s3)var5_2), (Object)new Object[0], (long)2607727820607408170L, (long)var2_3);
                                        var14_11 = m44.a("m", (long)2676264758025536872L, (long)var2_3);
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var14_11 != null) break block20;
                                                        if (var15_10 != null) {
                                                        }
                                                        ** GOTO lbl93
                                                    }
                                                    catch (n9 v1) {
                                                        throw m44.a("m", (Object)v1, (long)4319123621790388756L, (long)var2_3);
                                                    }
                                                    v2 = var15_10;
                                                    v3 = var14_11;
                                                    if (var2_3 > 0L) {
                                                        if (v3 != null) break block21;
                                                    }
                                                    ** GOTO lbl44
                                                }
                                                catch (n9 v4) {
                                                    throw m44.a("m", (Object)v4, (long)4319123621790388756L, (long)var2_3);
                                                }
                                                if (v2 == m44.a("s", (Object)this, (long)4494319399579371528L, (long)var2_3)) break block22;
                                            }
                                            catch (n9 v5) {
                                                throw m44.a("m", (Object)v5, (long)4319123621790388756L, (long)var2_3);
                                            }
                                            v2 = var15_10;
                                        }
                                        catch (n9 v6) {
                                            throw m44.a("m", (Object)v6, (long)4319123621790388756L, (long)var2_3);
                                        }
                                    }
                                    try {
                                        try {
                                            v3 = var14_11;
lbl44:
                                            // 2 sources

                                            if (v3 != null) break block23;
                                            if (!(v2 instanceof _f)) break block24;
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("m", (Object)v7, (long)4319123621790388756L, (long)var2_3);
                                        }
                                        m44.a("q", (Object)this, new DefaultListModel<E>(), (long)2726876752294205647L, (long)var2_3);
                                        v2 = var15_10;
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("m", (Object)v8, (long)4319123621790388756L, (long)var2_3);
                                    }
                                }
                                var16_12 = (_f)v2;
                                v9 = new Object[1];
                                v9[0] = var12_9;
                                var17_13 = m44.a("r", (Object)var16_12, (Object)v9, (long)2441983021127535375L, (long)var2_3);
                                block16: while (var17_13.hasMoreElements()) {
                                    var18_14 = (sv)var17_13.nextElement();
                                    try {
                                        v10 = this;
                                        v11 = 2726876752294205647L;
                                        v12 = var2_3;
                                        if (var2_3 <= 0L) break block25;
                                        v13 = new Object[1];
                                        v13[0] = var8_7;
                                        m44.a("r", (Object)m44.a("s", (Object)v10, (long)v11, (long)v12), (Object)m44.a("r", (Object)var18_14, (Object)v13, (long)2312454283458577888L, (long)var2_3), (long)2420019968882885302L, (long)var2_3);
                                        while (var14_11 == null) {
                                            if (var14_11 == null) continue block16;
                                            if (var2_3 < 0L) continue;
                                            break block16;
                                        }
                                        break block26;
                                    }
                                    catch (n9 v14) {
                                        throw m44.a("m", (Object)v14, (long)4319123621790388756L, (long)var2_3);
                                    }
                                }
                                m44.a("r", (Object)m44.a("s", (Object)this, (long)2704838529288029466L, (long)var2_3), (Object)m44.a("s", (Object)this, (long)2726876752294205647L, (long)var2_3), (long)2420795827531567423L, (long)var2_3);
                            }
                            v10 = this;
                            v11 = 2704838529288029466L;
                            v12 = var2_3;
                        }
                        m44.a("r", (Object)m44.a("s", (Object)v10, (long)v11, (long)v12), (boolean)true, (long)2653861391647974457L, (long)var2_3);
                    }
                    try {
                        v15 = new Object[1];
                        v15[0] = var10_8;
                        m44.a("l", (Object)this, (Object)v15, (long)4318677353534514277L, (long)var2_3);
                        if (var2_3 <= 0L) break block27;
                        if (var14_11 == null) break block22;
lbl93:
                        // 2 sources

                        m44.a("q", (Object)this, new DefaultListModel<E>(), (long)2726876752294205647L, (long)var2_3);
                        m44.a("r", (Object)m44.a("s", (Object)this, (long)2726876752294205647L, (long)var2_3), (Object)ft.a("v", (int)22896, (long)(3310370197852668898L ^ var2_3)), (long)2420019968882885302L, (long)var2_3);
                        m44.a("r", (Object)m44.a("s", (Object)this, (long)2704838529288029466L, (long)var2_3), (Object)m44.a("s", (Object)this, (long)2726876752294205647L, (long)var2_3), (long)2420795827531567423L, (long)var2_3);
                        m44.a("r", (Object)m44.a("s", (Object)this, (long)2704838529288029466L, (long)var2_3), (boolean)false, (long)2653861391647974457L, (long)var2_3);
                    }
                    catch (n9 v16) {
                        throw m44.a("m", (Object)v16, (long)4319123621790388756L, (long)var2_3);
                    }
                }
                v17 = new Object[1];
                v17[0] = var10_8;
                m44.a("l", (Object)this, (Object)v17, (long)4318677353534514277L, (long)var2_3);
            }
            m44.a("q", (Object)this, (Object)var15_10, (long)4494319399579371528L, (long)var2_3);
        }
    }

    public ft(s3 s32, o4 o42, long l10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x1FC03E40D026L;
        long l13 = l11 ^ 0x27450103BA45L;
        m44.a("s", (Object)this, (s3)s32, (long)-2302332591044430319L, (long)l10);
        m44.a("s", (Object)this, (o4)o42, (long)-1856688350831769944L, (long)l10);
        m44.a("s", (Object)this, (DefaultListModel)((DefaultListModel)((Object)m44.a("p", (Object)o42, (long)-124945003272386947L, (long)l10))), (long)-1844790903335183491L, (long)l10);
        m44.a("p", (Object)m44.a("q", (Object)this, (long)-1844790903335183491L, (long)l10), (Object)ft.a("v", (int)12795, (long)(0x232EA54109A3E8DAL ^ l10)), (long)-2150591069898931964L, (long)l10);
        m44.a("p", (Object)m44.a("q", (Object)this, (long)-1856688350831769944L, (long)l10), (boolean)false, (long)-1772628969617823861L, (long)l10);
        Object[] objectArray = new Object[2];
        objectArray[1] = l13;
        objectArray[0] = this;
        m44.a("p", (Object)s32, (Object)objectArray, (long)-2175712085755989298L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        m44.a("n", (Object)this, (Object)objectArray2, (long)-550224566553466921L, (long)l10);
    }

    @Override
    public void x(m m10, Object object, Object object2, Object object3, long l10) {
        long l11 = l10 ^ 0x6DB16FE008E7L;
        new d2(this, m10, object, object2, object3, l11);
    }

    private void Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        CallSite callSite = m44.a("r", (Object)m44.a("s", (Object)this, (long)-4462604749481106814L, (long)l10), (long)-4316826261314075145L, (long)l10);
        m44.a("r", (Object)callSite, (long)-2862227907062553814L, (long)l10);
        m44.a("r", (Object)callSite, (Object)m44.a("s", (Object)this, (long)-4462604749481106814L, (long)l10), (Object)ft.a("v", (int)28322, (long)(0x6C7A22692E5A13AAL ^ l10)), (long)-4425539959665951259L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x1729EFE18A6EL;
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
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "\u0091t\u00efC\u0098\u00e8c\u00b9t\u0004\u00d4\u00ce\u00f5x\u0092l\u00fb\u0081\u00f2?\u0087\u0097G\u00d6\u00c5\u00d8\u0085\u0015\u00fb-\u0005\u0088$\u0098[R\fp\u00a8\u0081(\u00da\u00cd\n\u000f]E\u0094\u00a3\u0081sW\"(\u00f8\u00dc\u00d1\u00f6b\u00ad\u009f`_\f,\u00ca\u0097u2\u00c1\u00d6\u00a3!\u0019\u00c5\u00ad\u00a08\u00d5\u00ca\u00ec\u0018A\u0088%\u00c1wy\u0087s\u0081\u00fd}\u00b0\u00caB\u00d7\r3)>\"\u0011\u008ag+";
        int n11 = "\u0091t\u00efC\u0098\u00e8c\u00b9t\u0004\u00d4\u00ce\u00f5x\u0092l\u00fb\u0081\u00f2?\u0087\u0097G\u00d6\u00c5\u00d8\u0085\u0015\u00fb-\u0005\u0088$\u0098[R\fp\u00a8\u0081(\u00da\u00cd\n\u000f]E\u0094\u00a3\u0081sW\"(\u00f8\u00dc\u00d1\u00f6b\u00ad\u009f`_\f,\u00ca\u0097u2\u00c1\u00d6\u00a3!\u0019\u00c5\u00ad\u00a08\u00d5\u00ca\u00ec\u0018A\u0088%\u00c1wy\u0087s\u0081\u00fd}\u00b0\u00caB\u00d7\r3)>\"\u0011\u008ag+".length();
        int n12 = 40;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = ft.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                b = stringArray;
                c = new String[3];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static n9 a(n9 n92) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x34B8;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ft", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            ft.c[n11] = ft.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ft.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ft" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ft.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

