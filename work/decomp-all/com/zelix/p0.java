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

public class p0
extends v2 {
    private static final long a = prr.a((long)6243139295444292716L, (long)1139712473249273391L, MethodHandles.lookup().lookupClass()).a(184888855081499L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public p0(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x7752EC2A6E14L;
        super(l2, n);
    }

    protected void O(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        lqq lqq2;
        long l;
        long l2;
        block6: {
            block5: {
                Object object2;
                long l3;
                block4: {
                    l2 = (Long)objectArray[0];
                    lqq lqq3 = (lqq)objectArray[1];
                    int n = (Integer)objectArray[2];
                    int n2 = (Integer)objectArray[3];
                    int n3 = (Integer)objectArray[4];
                    long l4 = l2;
                    l3 = l4 ^ 0x6AC67BCDAFE6L;
                    long l5 = l4 ^ 0x48EF352C0649L;
                    l = l4 ^ 0x1C100213E244L;
                    long l6 = l4 ^ 0x72C0D0D60A26L;
                    long l7 = l4 ^ 0x5E880CC8FCAAL;
                    CallSite callSite = m44.a("j", (long)-2447378320742416373L, (long)l2);
                    try {
                        try {
                            lqq2 = lqq3;
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l7;
                            stringBuilder = new StringBuilder().append((String)((Object)p0.b("t", (int)20459, (long)(0x37F5A3CBE744B126L ^ l2)))).append((String)((Object)m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-2406672409228413735L, (long)l2))).append((String)((Object)p0.b("t", (int)25614, (long)(0x5FC850487B011AC2L ^ l2))));
                            object2 = this;
                            if (callSite != null) break block4;
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l6;
                            if (m44.a("u", (Object)object2, (Object)objectArray3, (long)-2630633816245593429L, (long)l2) <= 0) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)((Object)n92), (long)-2802323446915850492L, (long)l2);
                        }
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = l5;
                        objectArray4[0] = 0;
                        object2 = m44.a("u", (Object)((Object)this), (Object)objectArray4, (long)-2419197939025966992L, (long)l2);
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)((Object)n93), (long)-2802323446915850492L, (long)l2);
                    }
                }
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l3;
                object = m44.a("u", (Object)((zl)object2), (Object)objectArray5, (long)-2565186629217682125L, (long)l2);
                break block6;
            }
            object = "";
        }
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = stringBuilder.append((String)object).append("'").toString();
        objectArray6[0] = l;
        m44.a("u", (Object)lqq2, (Object)objectArray6, (long)-2796704586643430277L, (long)l2);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return p0.b("t", (int)6927, (long)(0x3D7571748CF8996BL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x817FDFDA54L;
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
        String string = "Vj\u00d8\u008dLS\u00e4\u0099\u00f3\u009c\u00dd\u00b1\u00ae\n\u00bb\u0080Q\u001d\nl\u00dd\u00fe\u001c\u00da\u00de\u00e5`7d\tb\u00d7z\u00c6C\u0019G\u00feM\u00b3\u008f\u00de\u0003\u0095\u000b-\u00f0\u0019 \u0081\u0017\u00eaC\u00c4\u00ee\u00e6I\u00b6L} k\u00f8\u0097(\u00afo\u0003D}\u0097\u00eb\u00d5em\u00dcu^\u00d9m\u00ae`\"\u009a\u00d8Q\b\u00afF\u0094\u00b5\u00fa\tu~K\\\u0018\u0015\u00e0.\r\u0007\u0010\u00f5\u0018\u007f\u00e18$\u00a2\u00cb\u0011Y\u008a\u00ce\u0014\u00c7\u0097\u00e9&\u0016\"\u00b8\u001a_\u00cb\u0001\u00f0*";
        int n2 = "Vj\u00d8\u008dLS\u00e4\u0099\u00f3\u009c\u00dd\u00b1\u00ae\n\u00bb\u0080Q\u001d\nl\u00dd\u00fe\u001c\u00da\u00de\u00e5`7d\tb\u00d7z\u00c6C\u0019G\u00feM\u00b3\u008f\u00de\u0003\u0095\u000b-\u00f0\u0019 \u0081\u0017\u00eaC\u00c4\u00ee\u00e6I\u00b6L} k\u00f8\u0097(\u00afo\u0003D}\u0097\u00eb\u00d5em\u00dcu^\u00d9m\u00ae`\"\u009a\u00d8Q\b\u00afF\u0094\u00b5\u00fa\tu~K\\\u0018\u0015\u00e0.\r\u0007\u0010\u00f5\u0018\u007f\u00e18$\u00a2\u00cb\u0011Y\u008a\u00ce\u0014\u00c7\u0097\u00e9&\u0016\"\u00b8\u001a_\u00cb\u0001\u00f0*".length();
        int n3 = 64;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = p0.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3181;
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
                throw new RuntimeException("com/zelix/p0", exception);
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
            p0.d[n2] = p0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = p0.b(n, l);
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
            throw new RuntimeException("com/zelix/p0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(p0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
