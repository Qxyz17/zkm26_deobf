/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._v;
import com.zelix.ai;
import com.zelix.i0;
import com.zelix.l7t;
import com.zelix.lan;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.ltv;
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

public class la2
extends l7t {
    private static final long a = prr.a((long)-3216182584167955789L, (long)9097716197704787704L, MethodHandles.lookup().lookupClass()).a(133215153813832L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long f;

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x47526B4E5A06L;
        long l4 = l2 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
        try {
            if (callSite > 0) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = l4;
                objectArray3[1] = lqu2;
                objectArray3[0] = this;
                m44.a("w", (Object)this.V(0), (Object)objectArray3, (long)-6656114929610942631L, (long)l);
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)((Object)n92), (long)-5159786499211657956L, (long)l);
        }
        ltv ltv2 = (ltv)lmu2;
        m44.a("w", (Object)ltv2, (Object)new Object[]{this}, (long)-4640257908163720601L, (long)l);
    }

    public String z(Object[] objectArray) {
        StringBuilder stringBuilder;
        block9: {
            long l = (Long)objectArray[0];
            long l2 = l = a ^ l;
            long l3 = l2 ^ 0x728BE860DFD9L;
            long l4 = l2 ^ 0x22B99DB28571L;
            StringBuilder stringBuilder2 = new StringBuilder();
            CallSite callSite = m44.a("o", (long)9095467004201905409L, (long)l);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            CallSite callSite2 = m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)7317167905339940802L, (long)l);
            int n = 0;
            while (n < callSite2) {
                CallSite callSite3;
                block10: {
                    block11: {
                        block12: {
                            i0 i02 = (i0)this.V(n);
                            try {
                                try {
                                    try {
                                        if (l > 0L) {
                                            Object[] objectArray3 = new Object[1];
                                            objectArray3[0] = l3;
                                            stringBuilder = stringBuilder2.append((String)((Object)m44.a("p", (Object)i02, (Object)objectArray3, (long)8894793541657550901L, (long)l)));
                                            if (callSite != false) break block9;
                                        }
                                        callSite3 = callSite;
                                        if (l < 0L) break block10;
                                        if (callSite3 != false) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("o", (Object)((Object)n92), (long)7427461010121630315L, (long)l);
                                    }
                                    if (n >= callSite2 - true) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("o", (Object)((Object)n93), (long)7427461010121630315L, (long)l);
                                }
                                stringBuilder2.append((String)((Object)la2.a("y", (int)21693, (long)(0x221CE11AEBA30493L ^ l))));
                            }
                            catch (n9 n94) {
                                throw m44.a("o", (Object)((Object)n94), (long)7427461010121630315L, (long)l);
                            }
                        }
                        ++n;
                    }
                    callSite3 = callSite;
                }
                if (callSite3 == false) continue;
            }
            stringBuilder = new StringBuilder().append((String)((Object)la2.a("y", (int)32630, (long)(0x35E3D60E145BAF59L ^ l)))).append(stringBuilder2.toString());
            if (l >= 0L) {
                stringBuilder = stringBuilder.append((char)f);
            }
        }
        return stringBuilder.toString();
    }

    public final boolean x(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                _v _v2 = (_v)objectArray[0];
                long l = (Long)objectArray[1];
                ai ai2 = (ai)objectArray[2];
                long l2 = l = a ^ l;
                long l3 = l2 ^ 0x2E764BDBEC69L;
                long l4 = l2 ^ 0x187765CAF7C2L;
                CallSite callSite = m44.a("l", (long)903725724308201394L, (long)l);
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l4;
                    object = m44.a("s", (Object)((Object)this), (Object)objectArray2, (long)1673359665168477553L, (long)l);
                    if (callSite != false) break block2;
                    if (object <= 0) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)((Object)n92), (long)1558419886657851608L, (long)l);
                }
                lan lan2 = (lan)this.V(0);
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = ai2;
                objectArray3[1] = l3;
                objectArray3[0] = _v2;
                CallSite callSite2 = m44.a("s", (Object)lan2, (Object)objectArray3, (long)856818899743979710L, (long)l);
                return (boolean)callSite2;
            }
            object = true;
        }
        return (boolean)object;
    }

    public la2(long l, int n) {
        long l2 = (l = a ^ l) ^ 0xD5F7A27C0B8L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x121CE875DA2AL;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00bcZ\u00e5\u00d2\u00e340\u00e8\u008c\u00d7%\u00d4\u00b6\u0080Q\u000f\u0018r56\u0092u\u00b0\u00da\u001b\u008d\u00bd\u00c7\b\u00ec\u00fcK\u00de]\u00c9\u00d460\u00e6\u008b\u00fa";
        int n2 = "\u00bcZ\u00e5\u00d2\u00e340\u00e8\u008c\u00d7%\u00d4\u00b6\u0080Q\u000f\u0018r56\u0092u\u00b0\u00da\u001b\u008d\u00bd\u00c7\b\u00ec\u00fcK\u00de]\u00c9\u00d460\u00e6\u008b\u00fa".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = la2.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        d = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 6939160158581804573L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                f = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3ACE;
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
                throw new RuntimeException("com/zelix/la2", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            la2.d[n2] = la2.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = la2.a(n, l);
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
            throw new RuntimeException("com/zelix/la2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(la2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
