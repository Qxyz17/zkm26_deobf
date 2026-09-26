/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lq1;
import com.zelix.m44;
import com.zelix.prr;
import java.awt.Frame;
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
import javax.swing.Action;
import javax.swing.JDialog;
import javax.swing.JRootPane;

public abstract class lb8
extends JDialog {
    private static final long d = prr.a(4161712381309075496L, 3926331931063614334L, MethodHandles.lookup().lookupClass()).a(82454755142867L);
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

    public lb8(Frame frame, String string, boolean bl2) {
        super(frame, string, bl2);
    }

    public Action A(Object[] objectArray) {
        return new lq1(this);
    }

    protected abstract void O(Object[] var1);

    @Override
    protected JRootPane createRootPane() {
        long l10 = d ^ 0xF0359EEB294L;
        JRootPane jRootPane = new JRootPane();
        CallSite callSite = m44.a("j", (Object)lb8.a("w", (int)28628, (long)(0x41DBB3282AB8FBE5L ^ l10)), (long)-8165728873693687039L, (long)l10);
        CallSite callSite2 = m44.a("u", (Object)this, (Object)new Object[0], (long)-8504942991078315641L, (long)l10);
        CallSite callSite3 = m44.a("u", (Object)jRootPane, (int)2, (long)-7521960062754416074L, (long)l10);
        m44.a("u", (Object)callSite3, (Object)callSite, (Object)lb8.a("w", (int)14045, (long)(0x7F3EAAC9ECD122EDL ^ l10)), (long)-8518180121528509649L, (long)l10);
        m44.a("u", (Object)m44.a("u", (Object)jRootPane, (long)-8014087123402252410L, (long)l10), (Object)lb8.a("w", (int)14045, (long)(0x7F3EAAC9ECD122EDL ^ l10)), (Object)callSite2, (long)-7509771796931134105L, (long)l10);
        return jRootPane;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l10 = d ^ 0x6AC033A23086L;
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
        String string = "f\u00a2\"\u0010\u001f'\u0004\u0094\u00c89\u00b2\u00890\u00b7\u009a\u0005\u0010,''}\u0002\u00bb\u00c2\u0019\u0002\u00e1\u00c4\u00bb\u00b9\u008e\u00f0\u00eb";
        int n11 = "f\u00a2\"\u0010\u001f'\u0004\u0094\u00c89\u00b2\u00890\u00b7\u009a\u0005\u0010,''}\u0002\u00bb\u00c2\u0019\u0002\u00e1\u00c4\u00bb\u00b9\u008e\u00f0\u00eb".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lb8.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                e = stringArray;
                f = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1765;
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
                throw new RuntimeException("com/zelix/lb8", exception);
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
            lb8.f[n11] = lb8.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lb8.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lb8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lb8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

