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
    private static final long a = prr.a((long)6670285122016862909L, (long)-6250652310752687920L, MethodHandles.lookup().lookupClass()).a(21295118850701L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    public lpq(short s, int n, short s2, int n2) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x35A7829C1F53L;
        super(n, l2);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x3FE02C832B6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6375513765313429617L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpq.b("b", (int)19315, (long)(0x65E1433002DA8374L ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x550B0FC6572DL;
        long l4 = l2 ^ 0x6DF7BA9051C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        String string = (String)((Object)m44.a("n", (Object)objectArray2, (long)3433008837598041604L, (long)l)) + (String)((Object)lpq.b("b", (int)12037, (long)(0x7332AB1A94E7EE63L ^ l)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray3, (long)3638594277050117288L, (long)l);
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lpq.b("b", (int)10475, (long)(0x5832E5805F98A6A2L ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l = a ^ 0x54839DC8DDADL;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u0098_\u00e7AC\u00c6\u00a1\u00d7r2`\u00abyn\u00e2r2x[\u0011\u00cb\u008aO'\u00b7u\u00a4o2%\u0010'(rS\u0097\u00f6\u009b\u0086\u00f6\u00fe+\u001c\u00b08\u0080\u00c3\u00d1G?h\u0016\u0018[6\u009b4\u00c7\u00ee'.q\u0001\u00a4\u00db\u00bc\u00ea\u0001A\u0006\u00a5\u009d\u00eeX\u008c\u00c4\u0000\u00c0X\u0082\u00943\u00c1n\u00c4\u0094\u00f0\u0098m%\u00cf2F\u00d0\u00d5thT\u0080\u0089\u00c5_\b\u00a3g\u009f\u00db\u00d5\u00c2\u00fd\u00a2\u00d7\u008f\u00b7\u00d5j\u00db\u00db\u00bam\u00bc\u00f4\u00b2\u00d49\u00d3c\u001d\u0098\u009c\u00eb/\u00f3Q(\u00e4>_\u00f5\u00e8\u00d4s\n\u00c7\u00b8\u00b7\u00e6\u00ca\u00aa\u00eaY\u001e\u0085\u008e9\u0091\u00f0\u00f3\u00faV\u00e4>";
        int n2 = "\u0098_\u00e7AC\u00c6\u00a1\u00d7r2`\u00abyn\u00e2r2x[\u0011\u00cb\u008aO'\u00b7u\u00a4o2%\u0010'(rS\u0097\u00f6\u009b\u0086\u00f6\u00fe+\u001c\u00b08\u0080\u00c3\u00d1G?h\u0016\u0018[6\u009b4\u00c7\u00ee'.q\u0001\u00a4\u00db\u00bc\u00ea\u0001A\u0006\u00a5\u009d\u00eeX\u008c\u00c4\u0000\u00c0X\u0082\u00943\u00c1n\u00c4\u0094\u00f0\u0098m%\u00cf2F\u00d0\u00d5thT\u0080\u0089\u00c5_\b\u00a3g\u009f\u00db\u00d5\u00c2\u00fd\u00a2\u00d7\u008f\u00b7\u00d5j\u00db\u00db\u00bam\u00bc\u00f4\u00b2\u00d49\u00d3c\u001d\u0098\u009c\u00eb/\u00f3Q(\u00e4>_\u00f5\u00e8\u00d4s\n\u00c7\u00b8\u00b7\u00e6\u00ca\u00aa\u00eaY\u001e\u0085\u008e9\u0091\u00f0\u00f3\u00faV\u00e4>".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lpq.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = stringArray;
                k = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x61E5;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])lpq.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lpq.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpq", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            lpq.k[n2] = lpq.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lpq.b(n, l);
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
