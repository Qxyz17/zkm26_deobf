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
    private static final long a = prr.a(-3216182584167955789L, 9097716197704787704L, MethodHandles.lookup().lookupClass()).a(133215153813832L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long f;

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x47526B4E5A06L;
        long l13 = l11 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
        try {
            if (callSite > 0) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = l13;
                objectArray3[1] = lqu2;
                objectArray3[0] = this;
                m44.a("w", (Object)this.V(0), (Object)objectArray3, (long)-6656114929610942631L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)n92, (long)-5159786499211657956L, (long)l10);
        }
        ltv ltv2 = (ltv)lmu2;
        m44.a("w", (Object)ltv2, (Object)new Object[]{this}, (long)-4640257908163720601L, (long)l10);
    }

    public String z(Object[] objectArray) {
        StringBuilder stringBuilder;
        block9: {
            long l10 = (Long)objectArray[0];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x728BE860DFD9L;
            long l13 = l11 ^ 0x22B99DB28571L;
            StringBuilder stringBuilder2 = new StringBuilder();
            CallSite callSite = m44.a("o", (long)9095467004201905409L, (long)l10);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            CallSite callSite2 = m44.a("p", (Object)this, (Object)objectArray2, (long)7317167905339940802L, (long)l10);
            int n10 = 0;
            while (n10 < callSite2) {
                CallSite callSite3;
                block10: {
                    block11: {
                        block12: {
                            i0 i02 = (i0)((Object)this.V(n10));
                            try {
                                try {
                                    try {
                                        if (l10 > 0L) {
                                            Object[] objectArray3 = new Object[1];
                                            objectArray3[0] = l12;
                                            stringBuilder = stringBuilder2.append((String)((Object)m44.a("p", (Object)i02, (Object)objectArray3, (long)8894793541657550901L, (long)l10)));
                                            if (callSite != false) break block9;
                                        }
                                        callSite3 = callSite;
                                        if (l10 < 0L) break block10;
                                        if (callSite3 != false) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("o", (Object)n92, (long)7427461010121630315L, (long)l10);
                                    }
                                    if (n10 >= callSite2 - true) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("o", (Object)n93, (long)7427461010121630315L, (long)l10);
                                }
                                stringBuilder2.append((String)((Object)la2.a("y", (int)21693, (long)(0x221CE11AEBA30493L ^ l10))));
                            }
                            catch (n9 n94) {
                                throw m44.a("o", (Object)n94, (long)7427461010121630315L, (long)l10);
                            }
                        }
                        ++n10;
                    }
                    callSite3 = callSite;
                }
                if (callSite3 == false) continue;
            }
            stringBuilder = new StringBuilder().append((String)((Object)la2.a("y", (int)32630, (long)(0x35E3D60E145BAF59L ^ l10)))).append(stringBuilder2.toString());
            if (l10 >= 0L) {
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
                long l10 = (Long)objectArray[1];
                ai ai2 = (ai)objectArray[2];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0x2E764BDBEC69L;
                long l13 = l11 ^ 0x187765CAF7C2L;
                CallSite callSite = m44.a("l", (long)903725724308201394L, (long)l10);
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l13;
                    object = m44.a("s", (Object)this, (Object)objectArray2, (long)1673359665168477553L, (long)l10);
                    if (callSite != false) break block2;
                    if (object <= 0) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)1558419886657851608L, (long)l10);
                }
                lan lan2 = (lan)this.V(0);
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = ai2;
                objectArray3[1] = l12;
                objectArray3[0] = _v2;
                CallSite callSite2 = m44.a("s", (Object)lan2, (Object)objectArray3, (long)856818899743979710L, (long)l10);
                return (boolean)callSite2;
            }
            object = true;
        }
        return (boolean)object;
    }

    public la2(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0xD5F7A27C0B8L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l10 = a ^ 0x121CE875DA2AL;
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
        String string = "\u00bcZ\u00e5\u00d2\u00e340\u00e8\u008c\u00d7%\u00d4\u00b6\u0080Q\u000f\u0018r56\u0092u\u00b0\u00da\u001b\u008d\u00bd\u00c7\b\u00ec\u00fcK\u00de]\u00c9\u00d460\u00e6\u008b\u00fa";
        int n11 = "\u00bcZ\u00e5\u00d2\u00e340\u00e8\u008c\u00d7%\u00d4\u00b6\u0080Q\u000f\u0018r56\u0092u\u00b0\u00da\u001b\u008d\u00bd\u00c7\b\u00ec\u00fcK\u00de]\u00c9\u00d460\u00e6\u008b\u00fa".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = la2.b(byArray3).intern();
            if ((n13 += n12) >= n11) break;
            n12 = string.charAt(n13);
        }
        b = stringArray;
        d = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n15 = 1;
        while (true) {
            if (n15 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = 6939160158581804573L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                f = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n15] = (byte)(l10 << n15 * 8 >>> 56);
            ++n15;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3ACE;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/la2", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            la2.d[n11] = la2.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = la2.a(n10, l10);
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

