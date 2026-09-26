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

public class lpq
extends lpm {
    private static final long a = prr.a(6670285122016862909L, -6250652310752687920L, MethodHandles.lookup().lookupClass()).a(21295118850701L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    public lpq(short s10, int n10, short s11, int n11) {
        long l10 = ((long)s10 << 48 | (long)s11 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x35A7829C1F53L;
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
        long l13 = l11 ^ 0x3FE02C832B6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l13;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6375513765313429617L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpq.b("b", (int)19315, (long)(0x65E1433002DA8374L ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l12;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x550B0FC6572DL;
        long l13 = l11 ^ 0x6DF7BA9051C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        String string = (String)((Object)m44.a("n", (Object)objectArray2, (long)3433008837598041604L, (long)l10)) + (String)((Object)lpq.b("b", (int)12037, (long)(0x7332AB1A94E7EE63L ^ l10)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray3, (long)3638594277050117288L, (long)l10);
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lpq.b("b", (int)10475, (long)(0x5832E5805F98A6A2L ^ l10));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l10 = a ^ 0x54839DC8DDADL;
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
        String string = "\u0098_\u00e7AC\u00c6\u00a1\u00d7r2`\u00abyn\u00e2r2x[\u0011\u00cb\u008aO'\u00b7u\u00a4o2%\u0010'(rS\u0097\u00f6\u009b\u0086\u00f6\u00fe+\u001c\u00b08\u0080\u00c3\u00d1G?h\u0016\u0018[6\u009b4\u00c7\u00ee'.q\u0001\u00a4\u00db\u00bc\u00ea\u0001A\u0006\u00a5\u009d\u00eeX\u008c\u00c4\u0000\u00c0X\u0082\u00943\u00c1n\u00c4\u0094\u00f0\u0098m%\u00cf2F\u00d0\u00d5thT\u0080\u0089\u00c5_\b\u00a3g\u009f\u00db\u00d5\u00c2\u00fd\u00a2\u00d7\u008f\u00b7\u00d5j\u00db\u00db\u00bam\u00bc\u00f4\u00b2\u00d49\u00d3c\u001d\u0098\u009c\u00eb/\u00f3Q(\u00e4>_\u00f5\u00e8\u00d4s\n\u00c7\u00b8\u00b7\u00e6\u00ca\u00aa\u00eaY\u001e\u0085\u008e9\u0091\u00f0\u00f3\u00faV\u00e4>";
        int n11 = "\u0098_\u00e7AC\u00c6\u00a1\u00d7r2`\u00abyn\u00e2r2x[\u0011\u00cb\u008aO'\u00b7u\u00a4o2%\u0010'(rS\u0097\u00f6\u009b\u0086\u00f6\u00fe+\u001c\u00b08\u0080\u00c3\u00d1G?h\u0016\u0018[6\u009b4\u00c7\u00ee'.q\u0001\u00a4\u00db\u00bc\u00ea\u0001A\u0006\u00a5\u009d\u00eeX\u008c\u00c4\u0000\u00c0X\u0082\u00943\u00c1n\u00c4\u0094\u00f0\u0098m%\u00cf2F\u00d0\u00d5thT\u0080\u0089\u00c5_\b\u00a3g\u009f\u00db\u00d5\u00c2\u00fd\u00a2\u00d7\u008f\u00b7\u00d5j\u00db\u00db\u00bam\u00bc\u00f4\u00b2\u00d49\u00d3c\u001d\u0098\u009c\u00eb/\u00f3Q(\u00e4>_\u00f5\u00e8\u00d4s\n\u00c7\u00b8\u00b7\u00e6\u00ca\u00aa\u00eaY\u001e\u0085\u008e9\u0091\u00f0\u00f3\u00faV\u00e4>".length();
        int n12 = 32;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lpq.c(byArray3).intern();
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x61E5;
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
                throw new RuntimeException("com/zelix/lpq", exception);
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
            lpq.k[n11] = lpq.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lpq.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lpq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpq.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

