/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyn;
import com.zelix.m44;
import com.zelix.prr;
import java.io.PrintWriter;
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

public class la0
extends lyn {
    private static final long a = prr.a(-69210110235953277L, 8056000191944409306L, MethodHandles.lookup().lookupClass()).a(46422413771958L);
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return la0.b("g", (int)9312, (long)(0x2DEDC77B7DE32F2L ^ l10));
    }

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x731233B27CCL;
        long l13 = l11 ^ 0x257F4A20D8A1L;
        long l14 = l11 ^ 0x1D83FF76DE4EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        CallSite callSite = m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4963623474998811189L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l14;
        String string = (String)((Object)m44.a("m", (Object)objectArray3, (long)-6429108569517432985L, (long)l10)) + (String)((Object)la0.b("g", (int)9567, (long)(0x564D57A5932DF583L ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)l10), (Object)string, (long)-4650195723326610078L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l12;
        m44.a("r", (Object)lqu2, (Object)objectArray4, (long)-6409255990025393468L, (long)l10);
    }

    public la0(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x4F33913AC0E4L;
        super(l11, n10);
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x43EA633718BEL;
        long l13 = l11 ^ 0x1A86BD711C75L;
        long l14 = l11 ^ 0x408CF84350F9L;
        long l15 = l11 ^ 0x2C69CF006FB0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l15;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l14;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = (int)m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5139488470093813520L, (long)l10);
        objectArray5[3] = (int)m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-5092376014320582940L, (long)l10);
        objectArray5[2] = l13;
        objectArray5[1] = (int)m44.a("w", (Object)lqu2, (Object)objectArray2, (long)-6410373196425327712L, (long)l10);
        objectArray5[0] = lqu2;
        m44.a("w", (Object)this, (Object)objectArray5, (long)-4621882251236967000L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l10 = a ^ 0x18F8C5F28228L;
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
        String string = "\u00a3\"75\u00e2\u009f\u00f1\u0081\u00a8\u0091)\u00e6\u00b1f\u00b7\n\u00b7lJ\u00a6\u00efT\u00b1\u00dfm\u00e5F\u0016W\u00b5\u00fe-x\r\u00acg\u0088gI\u00b9\\\u0006\u0017\u00c8>U\u00fd\u00b3D\u00dd|F\u00f1\u0013\u0087\u00cc2\u00c0N\u001d80\u009d\u00d8HEu\u008e\u00b7J6\u00ac\u00fa\u00f0\u001d\u009a|\n\u00c8))\u009b\f\u00a3[\u0011f\u00d7\u00ce\u0013\u009d>s_^mb\u00b5M\u00fd\u00b7\u00e3\u008d\u001e\u00f7\u0085\u00c5\u009e\u00d2~\u0086\u00a6\u001d\u00bc.G\\\u001f\u0013\u00cc\u009b\u00caC\u009d\u00b8\u0089\u00c1}\u00a7!\u00c4P\u00c1\"a\u00c3\"";
        int n11 = "\u00a3\"75\u00e2\u009f\u00f1\u0081\u00a8\u0091)\u00e6\u00b1f\u00b7\n\u00b7lJ\u00a6\u00efT\u00b1\u00dfm\u00e5F\u0016W\u00b5\u00fe-x\r\u00acg\u0088gI\u00b9\\\u0006\u0017\u00c8>U\u00fd\u00b3D\u00dd|F\u00f1\u0013\u0087\u00cc2\u00c0N\u001d80\u009d\u00d8HEu\u008e\u00b7J6\u00ac\u00fa\u00f0\u001d\u009a|\n\u00c8))\u009b\f\u00a3[\u0011f\u00d7\u00ce\u0013\u009d>s_^mb\u00b5M\u00fd\u00b7\u00e3\u008d\u001e\u00f7\u0085\u00c5\u009e\u00d2~\u0086\u00a6\u001d\u00bc.G\\\u001f\u0013\u00cc\u009b\u00caC\u009d\u00b8\u0089\u00c1}\u00a7!\u00c4P\u00c1\"a\u00c3\"".length();
        int n12 = 64;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = la0.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                e = stringArray;
                f = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x793F;
        if (f[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/la0", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n11].getBytes("ISO-8859-1");
            la0.f[n11] = la0.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = la0.b(n10, l10);
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
            throw new RuntimeException("com/zelix/la0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(la0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

