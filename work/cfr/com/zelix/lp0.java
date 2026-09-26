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

public class lp0
extends lpm {
    private static final long a = prr.a(-7658209953280912901L, 4501797481658398472L, MethodHandles.lookup().lookupClass()).a(174457838147177L);
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
        long l13 = l11 ^ 0x7CAD96848953L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = this;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6447368269992508806L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lp0.b("g", (int)818, (long)(0x1EE0F53D84B86950L ^ l10));
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
        return lp0.b("g", (int)31352, (long)(0x3379121359D05657L ^ l10));
    }

    public lp0(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x3F2A88EA0B7EL;
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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l10)) + (String)((Object)lp0.b("g", (int)26497, (long)(0x26051FDD2FB40483L ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l10 = a ^ 0x7C9236A8C623L;
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
        String string = "8X\u00f06\u0095G\u001dy\u00c6\u0082\u0088\u00aa\u008e8g\u00b8\u001b09x\u00f3\u0014\u001b#\u00f7\u00ae\u00906\u00b1\u00823q E7\u00a8jq\u0002\u0094e\u0011[X~\u0002\u000b\u00ac\u001d\u009e\u0015\u00d3\u00c1&9\u00baX\u00d3\u00db\u0093\u00db7{\u0097\u00b9\u00e6^\u00e16\u00f6\u0016\u00cd\u00e8\u008e\u00ce\u00e1v\u0089\u0096\u0098\u00f1\u00c3\u0003\u00f1\u00c2\u0092!\u00b7[Z\u00c4\u0005\u00fb\u00e7Bn\u00d3\u0018\u001b\\\u00a2\u00ccg\u00e2\u00b3Iw\u00ca\u00acP\u00e7\u008a\u00ebQ\u009b\u00f5v\u00f70I\fd\u008bu\u0094\u0090\u00a4\u0080\u00fes\u00c2\u00af\u00fdU\u00cb\u00e5|\b\u00ca\u009e\u00b7X\u00cd$\u00bb \u0096\u00ec!\u00fc\u000f\u001c\u00e1\u00cf\u00ab\u00f1\u00fa\u001a\u0004\u009e2\u00a3<\n\u00fd\u00b15\u00c0\u00cfWI2\b\u00aa\u008e|_\u00ea";
        int n11 = "8X\u00f06\u0095G\u001dy\u00c6\u0082\u0088\u00aa\u008e8g\u00b8\u001b09x\u00f3\u0014\u001b#\u00f7\u00ae\u00906\u00b1\u00823q E7\u00a8jq\u0002\u0094e\u0011[X~\u0002\u000b\u00ac\u001d\u009e\u0015\u00d3\u00c1&9\u00baX\u00d3\u00db\u0093\u00db7{\u0097\u00b9\u00e6^\u00e16\u00f6\u0016\u00cd\u00e8\u008e\u00ce\u00e1v\u0089\u0096\u0098\u00f1\u00c3\u0003\u00f1\u00c2\u0092!\u00b7[Z\u00c4\u0005\u00fb\u00e7Bn\u00d3\u0018\u001b\\\u00a2\u00ccg\u00e2\u00b3Iw\u00ca\u00acP\u00e7\u008a\u00ebQ\u009b\u00f5v\u00f70I\fd\u008bu\u0094\u0090\u00a4\u0080\u00fes\u00c2\u00af\u00fdU\u00cb\u00e5|\b\u00ca\u009e\u00b7X\u00cd$\u00bb \u0096\u00ec!\u00fc\u000f\u001c\u00e1\u00cf\u00ab\u00f1\u00fa\u001a\u0004\u009e2\u00a3<\n\u00fd\u00b15\u00c0\u00cfWI2\b\u00aa\u008e|_\u00ea".length();
        int n12 = 56;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lp0.c(byArray3).intern();
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4382;
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
                throw new RuntimeException("com/zelix/lp0", exception);
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
            lp0.k[n11] = lp0.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lp0.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lp0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lp0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

