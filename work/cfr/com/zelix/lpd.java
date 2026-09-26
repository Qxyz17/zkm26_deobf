/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpm;
import com.zelix.lqu;
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

public class lpd
extends lpm {
    private static final long a = prr.a(713588245628386L, 940185487490014058L, MethodHandles.lookup().lookupClass()).a(101499585131369L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x3E0224440141L;
        long l13 = l11 ^ 0x314838977B34L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l13;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4629520340659028549L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpd.b("x", (int)27234, (long)(0x715AEB297B0F7E8BL ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l12;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lpd.b("x", (int)27892, (long)(0x268B6391315FBE53L ^ l10));
    }

    public lpd(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x27A16ADD9F1EL;
        super(n10, l11);
    }

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x6DF7BA9051C2L;
        long l13 = l11 ^ 0x550B0FC6572DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray2, (long)3638594277050117288L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l10)) + (String)((Object)lpd.b("x", (int)12309, (long)(0x1A1C4B0A6A11AD9DL ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l10 = a ^ 0x2015994BAB68L;
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
        String string = "\u00c6|\u00ce\f\u00ab\u008c\u009d\u0007\u0003\u00f7)=\u00f1\u0017\u00cd\u00deU9\u000e\u00e9](\u00a0\u00cc\u00e8\u0081:)\u0017t6Q8\u0017a/\u00e4\u0014\u00b3\u0083>\u00a3\u00c3\u007f<H\u00ce\u00a2|\u0002\n\u00f0\"\u0092\u00e4$\u00d5\u00be\u00f9\u0000J\u00cav\u008b(b\u00f8\u008bX\u0016\u00f7+\u00a7\u0014\u00bbP\u0003\u00c8\u00f46v\u00a7F\u0005Hu+\u00c9\u00b4P3{\u00c2\\\n\u0019\u00d8\u000e\u00e9\u00f9\\g=\u00dd\u008f\u008e\u00c9{/ \u0010\u0081\u00bb@\u00b3\u00b5w\u00fa\u00d0\u009d#\u000b\u00d6\u00e5e\u00ea+\u00b3\u00da\u00c8\u00ff\u00c7\u0093\u009bD\"p\u009d\u00d1\u00c2\u00af\\\u00ea\u008e\u009f\u00e5\u001d\u00be\u009c\u001f\u00f2\u00ea\u00ec\u0097/\u00c0\u00f3Z\u00be\u00e0\u00eaG\u0016\u00b3\u0097\u00d2t\u00e5\u00f4\u00e0";
        int n11 = "\u00c6|\u00ce\f\u00ab\u008c\u009d\u0007\u0003\u00f7)=\u00f1\u0017\u00cd\u00deU9\u000e\u00e9](\u00a0\u00cc\u00e8\u0081:)\u0017t6Q8\u0017a/\u00e4\u0014\u00b3\u0083>\u00a3\u00c3\u007f<H\u00ce\u00a2|\u0002\n\u00f0\"\u0092\u00e4$\u00d5\u00be\u00f9\u0000J\u00cav\u008b(b\u00f8\u008bX\u0016\u00f7+\u00a7\u0014\u00bbP\u0003\u00c8\u00f46v\u00a7F\u0005Hu+\u00c9\u00b4P3{\u00c2\\\n\u0019\u00d8\u000e\u00e9\u00f9\\g=\u00dd\u008f\u008e\u00c9{/ \u0010\u0081\u00bb@\u00b3\u00b5w\u00fa\u00d0\u009d#\u000b\u00d6\u00e5e\u00ea+\u00b3\u00da\u00c8\u00ff\u00c7\u0093\u009bD\"p\u009d\u00d1\u00c2\u00af\\\u00ea\u008e\u009f\u00e5\u001d\u00be\u009c\u001f\u00f2\u00ea\u00ec\u0097/\u00c0\u00f3Z\u00be\u00e0\u00eaG\u0016\u00b3\u0097\u00d2t\u00e5\u00f4\u00e0".length();
        int n12 = 32;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lpd.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                e = stringArray;
                k = new String[3];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3D0B;
        if (k[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])n.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpd", exception);
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
            lpd.k[n11] = lpd.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lpd.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lpd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpd.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

