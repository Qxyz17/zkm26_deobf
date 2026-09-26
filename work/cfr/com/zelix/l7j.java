/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._v;
import com.zelix.ag;
import com.zelix.l6z;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
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

public class l7j
implements ag {
    private _v I;
    private final String i;
    private final int g;
    private static final long a = prr.a(-2199602754043745691L, -2848140898135623757L, MethodHandles.lookup().lookupClass()).a(201813293018585L);
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;

    @Override
    public String h(long l10) {
        CallSite callSite;
        long l11;
        long l12;
        block4: {
            block5: {
                long l13 = l10;
                l12 = l13 ^ 0x333B4F71ADD7L;
                l11 = l13 ^ 0L;
                CallSite callSite2 = m44.a("n", (long)-630716801146710157L, (long)l10);
                try {
                    try {
                        callSite = m44.a("p", (Object)this, (long)-1092138938633565090L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-972938836802157191L, (long)l10);
                    }
                    return m44.a("p", (Object)this, (long)-771301329387968614L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-972938836802157191L, (long)l10);
                }
            }
            callSite = m44.a("p", (Object)this, (long)-1092138938633565090L, (long)l10);
        }
        Object[] objectArray = new Object[3];
        objectArray[2] = (int)m44.a("p", (Object)this, (long)-1666680591826541422L, (long)l10);
        objectArray[1] = ((_v)((Object)callSite)).h(l11);
        objectArray[0] = l12;
        return ((String)((Object)m44.a("n", (Object)objectArray, (long)-717146748090961750L, (long)l10))).replace((char)l7j.a("f", (int)3259, (long)(0x138471AD4E9AD704L ^ l10)), (char)l7j.a("f", (int)24161, (long)(0x3D60BEA31A5505DFL ^ l10)));
    }

    @Override
    public boolean H(Object[] objectArray) {
        return false;
    }

    public l7j(String string, Integer n10, long l10, _6 _62, l6z l6z2) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0xA835A313061L;
        long l13 = l11 ^ 0x465EA37869D6L;
        this.i = string;
        this.g = string.lastIndexOf("[") + 1;
        String string2 = _v.H((String)((Object)m44.a("w", (Object)this, (long)6470795744179161885L, (long)l10)), l12);
        try {
            if (string2 != null) {
                m44.a("u", (Object)this, (_v)_62.E(string2, n10, l13, b, l6z2), (long)6652057025586684121L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)6843297413279148542L, (long)l10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x341F53FE0C7EL;
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
        byte[] byArray3 = cipher.doFinal("\u0003T\n\u00ea\u000b\u00a2\u000ek\u00a5\u00a2\u0006\u00aaP!\u00b6\u00efY\u00d1\u0098\u0007\u0081\u00d3\t\b".getBytes("ISO-8859-1"));
        b = l7j.a(byArray3).intern();
        e = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        for (int i11 = 1; i11 < 8; ++i11) {
            byArray5 = byArray5;
            byArray5[i11] = (byte)(l10 << i11 * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00d8\u00b8\u0083\u00c9\u00ec\u008a\u00c0\u009b\u0012\u000b\f?!\u00d9\u0015\u009e";
        int n11 = "\u00d8\u00b8\u0083\u00c9\u00ec\u008a\u00c0\u009b\u0012\u000b\f?!\u00d9\u0015\u009e".length();
        int n12 = 0;
        do {
            byte[] byArray6 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n12 < n11);
        c = lArray;
        d = new Integer[2];
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x278E;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/l7j", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            l7j.d[n11] = n12;
        }
        return d[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = l7j.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/l7j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l7j.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

