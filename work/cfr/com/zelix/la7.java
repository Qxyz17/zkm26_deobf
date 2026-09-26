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

public class la7
extends lpm {
    private static final long a = prr.a(-3614181179581950000L, 1194705581626639902L, MethodHandles.lookup().lookupClass()).a(78345199554547L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    public la7(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x4C9D60D5FBL;
        super(n10, l11);
    }

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x3E0224440141L;
        long l13 = l11 ^ 0x3BB400F63040L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l13;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4888931081688351972L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = la7.b("g", (int)21994, (long)(0x6183279BEC2A2FEL ^ l10));
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
        return la7.b("g", (int)24937, (long)(0x6342D6E4827E5031L ^ l10));
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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l10)) + (String)((Object)la7.b("g", (int)29376, (long)(0x88C5AF0E5EF8CB6L ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l10 = a ^ 0x58D2029AF06EL;
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
        String string = "1\u00ed}\u0089\u00a3\u0087\u00e1b\u00c9\u009b\u000e\u00db@\u00e8\u00b7S&\u0017;\u009c\u0013\u0004\u00ca\u00ae\u00f3\u00c4\u00ab\u00d1=\u0093\u00f0\u000b5\u0096\u009a\u00b4\u00d8\u00ad\u009a\u00f1\u00cfC\u00fa\u00cb\u00caT\bq\u0088\u00abG/&-\u00a2\u00ba\u00dd\u00d9hFs\u00d9\u00a8\u00f9\u00fd\u00a3\u00b2\u008b>[X\u001a\u009c\u00c6\u00e0\u0084\u00c8\u0095\u008f\u00c5\u0018\u00d8\u00bb\u0019bN6T\u00b8\u00f3 \u0098\u0085mKyT\u00b2B'\bw\u009c\u00bc\u000f0\u00c7Y\u001el\u0002)`L\u00ad\u00c6\u0087\u00d0\u00bd\u00d8\u00bb\f+\u00fd\u0006\u0002\u00e7\u00c5rQx\u009e@$\u0010\u0085\u008c\"\u00f1\u00822\u00de\u00a39\u00b2\u0013{C\u00c8\u00dc\u00c6B\u00f0\u00ad";
        int n11 = "1\u00ed}\u0089\u00a3\u0087\u00e1b\u00c9\u009b\u000e\u00db@\u00e8\u00b7S&\u0017;\u009c\u0013\u0004\u00ca\u00ae\u00f3\u00c4\u00ab\u00d1=\u0093\u00f0\u000b5\u0096\u009a\u00b4\u00d8\u00ad\u009a\u00f1\u00cfC\u00fa\u00cb\u00caT\bq\u0088\u00abG/&-\u00a2\u00ba\u00dd\u00d9hFs\u00d9\u00a8\u00f9\u00fd\u00a3\u00b2\u008b>[X\u001a\u009c\u00c6\u00e0\u0084\u00c8\u0095\u008f\u00c5\u0018\u00d8\u00bb\u0019bN6T\u00b8\u00f3 \u0098\u0085mKyT\u00b2B'\bw\u009c\u00bc\u000f0\u00c7Y\u001el\u0002)`L\u00ad\u00c6\u0087\u00d0\u00bd\u00d8\u00bb\f+\u00fd\u0006\u0002\u00e7\u00c5rQx\u009e@$\u0010\u0085\u008c\"\u00f1\u00822\u00de\u00a39\u00b2\u0013{C\u00c8\u00dc\u00c6B\u00f0\u00ad".length();
        int n12 = 80;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = la7.c(byArray3).intern();
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5EF7;
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
                throw new RuntimeException("com/zelix/la7", exception);
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
            la7.k[n11] = la7.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = la7.b(n10, l10);
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
            throw new RuntimeException("com/zelix/la7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(la7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

