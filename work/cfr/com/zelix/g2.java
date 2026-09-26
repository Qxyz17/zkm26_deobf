/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g2
implements lmw {
    private HashSet d;
    private HashSet u;
    private HashSet R;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map e;

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public String D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return null;
    }

    @Override
    public int n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return -1;
    }

    @Override
    public boolean Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    public g2(HashSet hashSet, HashSet hashSet2, long l10) {
        l10 = a ^ l10;
        m44.a("u", (Object)this, (HashSet)hashSet, (long)-2398523560613039482L, (long)l10);
        m44.a("u", (Object)this, (HashSet)hashSet2, (long)-2878280609772279757L, (long)l10);
    }

    public boolean equals(Object object) {
        boolean bl2;
        block12: {
            block13: {
                Object object2;
                block17: {
                    block15: {
                        CallSite callSite;
                        long l10;
                        block16: {
                            g2 g22;
                            long l11;
                            block14: {
                                l10 = a ^ 0xFDC1FDED3DEL;
                                l11 = l10 ^ 0x59BEC8F2A44FL;
                                callSite = m44.a("i", (long)476155575031951947L, (long)l10);
                                try {
                                    bl2 = object instanceof g2;
                                    if (callSite != null) break block12;
                                    if (!bl2) break block13;
                                }
                                catch (n9 n92) {
                                    throw m44.a("i", (Object)n92, (long)1933776254337425609L, (long)l10);
                                }
                                g22 = (g2)object;
                                try {
                                    try {
                                        Object[] objectArray = new Object[3];
                                        objectArray[2] = l11;
                                        objectArray[1] = m44.a("w", (Object)g22, (long)1929423656033056502L, (long)l10);
                                        objectArray[0] = m44.a("w", (Object)this, (long)1929423656033056502L, (long)l10);
                                        object2 = m44.a("h", (Object)this, (Object)objectArray, (long)52106069358190033L, (long)l10);
                                        if (callSite != null) break block14;
                                        if (object2 == false) break block15;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("i", (Object)n93, (long)1933776254337425609L, (long)l10);
                                    }
                                    Object[] objectArray = new Object[3];
                                    objectArray[2] = l11;
                                    objectArray[1] = m44.a("w", (Object)g22, (long)440978516478956545L, (long)l10);
                                    objectArray[0] = m44.a("w", (Object)this, (long)440978516478956545L, (long)l10);
                                    object2 = m44.a("h", (Object)this, (Object)objectArray, (long)52106069358190033L, (long)l10);
                                }
                                catch (n9 n94) {
                                    throw m44.a("i", (Object)n94, (long)1933776254337425609L, (long)l10);
                                }
                            }
                            try {
                                try {
                                    if (callSite != null) break block16;
                                    if (object2 == false) break block15;
                                }
                                catch (n9 n95) {
                                    throw m44.a("i", (Object)n95, (long)1933776254337425609L, (long)l10);
                                }
                                Object[] objectArray = new Object[3];
                                objectArray[2] = l11;
                                objectArray[1] = m44.a("w", (Object)g22, (long)2053148956882644035L, (long)l10);
                                objectArray[0] = m44.a("w", (Object)this, (long)2053148956882644035L, (long)l10);
                                object2 = m44.a("h", (Object)this, (Object)objectArray, (long)52106069358190033L, (long)l10);
                            }
                            catch (n9 n96) {
                                throw m44.a("i", (Object)n96, (long)1933776254337425609L, (long)l10);
                            }
                        }
                        try {
                            if (callSite != null) break block17;
                            if (object2 == false) break block15;
                        }
                        catch (n9 n97) {
                            throw m44.a("i", (Object)n97, (long)1933776254337425609L, (long)l10);
                        }
                        object2 = true;
                        break block17;
                    }
                    object2 = false;
                }
                return (boolean)object2;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public String B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)8987491227323068527L, (long)l10);
    }

    private boolean J(Object[] objectArray) {
        boolean bl2;
        HashSet hashSet;
        long l10;
        block8: {
            HashSet hashSet2;
            block9: {
                block11: {
                    HashSet hashSet3;
                    block10: {
                        HashSet hashSet4 = (HashSet)objectArray[0];
                        hashSet2 = (HashSet)objectArray[1];
                        l10 = (Long)objectArray[2];
                        l10 = a ^ l10;
                        CallSite callSite = m44.a("n", (long)7272330341031645244L, (long)l10);
                        try {
                            try {
                                try {
                                    hashSet = hashSet4;
                                    if (callSite != null) break block8;
                                    if (hashSet == null) break block9;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)n92, (long)8692231310556218046L, (long)l10);
                                }
                                hashSet3 = hashSet2;
                                if (callSite != null) break block10;
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)n93, (long)8692231310556218046L, (long)l10);
                            }
                            if (hashSet3 == null) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)n94, (long)8692231310556218046L, (long)l10);
                        }
                        hashSet3 = hashSet4;
                    }
                    return hashSet3.equals(hashSet2);
                }
                return false;
            }
            hashSet = hashSet2;
        }
        try {
            bl2 = hashSet == null;
        }
        catch (n9 n95) {
            throw m44.a("n", (Object)n95, (long)8692231310556218046L, (long)l10);
        }
        return bl2;
    }

    public int hashCode() {
        CallSite callSite;
        int n10;
        long l10;
        block7: {
            block8: {
                CallSite callSite2;
                block5: {
                    block6: {
                        l10 = a ^ 0x6A06D9EA0EDL;
                        n10 = 0;
                        callSite2 = m44.a("j", (long)8478217087177294200L, (long)l10);
                        try {
                            callSite = m44.a("t", (Object)this, (long)7635213165555713477L, (long)l10);
                            if (callSite2 != null) break block5;
                            if (callSite == null) break block6;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)n92, (long)7630555985469133818L, (long)l10);
                        }
                        n10 = ((AbstractSet)((Object)m44.a("t", (Object)this, (long)7635213165555713477L, (long)l10))).hashCode();
                    }
                    callSite = m44.a("t", (Object)this, (long)8443583975016818482L, (long)l10);
                }
                try {
                    if (callSite2 != null) break block7;
                    if (callSite == null) break block8;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)7630555985469133818L, (long)l10);
                }
                n10 ^= ((AbstractSet)((Object)m44.a("t", (Object)this, (long)8443583975016818482L, (long)l10))).hashCode();
            }
            callSite = m44.a("t", (Object)this, (long)8020147211028684656L, (long)l10);
        }
        if (callSite != null) {
            n10 ^= ((AbstractSet)((Object)m44.a("t", (Object)this, (long)8020147211028684656L, (long)l10))).hashCode();
        }
        return n10;
    }

    @Override
    public String x(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        long l10;
        long l11;
        block6: {
            block8: {
                l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x69CD78ADA1FDL;
                CallSite callSite = m44.a("n", (long)1888294398372277988L, (long)l11);
                try {
                    block7: {
                        try {
                            try {
                                stringBuilder = new StringBuilder().append((String)((Object)g2.a("j", (int)13246, (long)(0x1AB03898F01D555BL ^ l11))));
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l10;
                                objectArray2[0] = m44.a("p", (Object)this, (long)462047421751028313L, (long)l11);
                                object = m44.a("o", (Object)this, (Object)objectArray2, (long)2249213211931003915L, (long)l11);
                                if (callSite != null) break block6;
                                stringBuilder = stringBuilder.append((String)object);
                                if (m44.a("p", (Object)this, (long)1923492955851688110L, (long)l11) == null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)466424346623163494L, (long)l11);
                            }
                            if (m44.a("q", (Object)m44.a("p", (Object)this, (long)1923492955851688110L, (long)l11), (long)1791635903166663202L, (long)l11) != false) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)466424346623163494L, (long)l11);
                        }
                    }
                    object = "";
                    break block6;
                }
                catch (n9 n94) {
                    throw m44.a("n", (Object)n94, (long)466424346623163494L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l10;
            objectArray3[0] = m44.a("p", (Object)this, (long)1923492955851688110L, (long)l11);
            object = (String)((Object)g2.a("j", (int)16714, (long)(0x286DA70FFD13A7ADL ^ l11))) + (String)((Object)m44.a("o", (Object)this, (Object)objectArray3, (long)2249213211931003915L, (long)l11));
        }
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l10;
        objectArray4[0] = m44.a("p", (Object)this, (long)58957050570027244L, (long)l11);
        return stringBuilder.append((String)object).append((String)((Object)g2.a("j", (int)8401, (long)(0xCDEE0A886BBC637L ^ l11)))).append((String)((Object)m44.a("o", (Object)this, (Object)objectArray4, (long)2249213211931003915L, (long)l11))).append(">").toString();
    }

    @Override
    public boolean a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    private String L(Object[] objectArray) {
        StringBuffer stringBuffer;
        block10: {
            HashSet hashSet = (HashSet)objectArray[0];
            long l10 = (Long)objectArray[1];
            long l11 = (l10 = a ^ l10) ^ 0x156099BA67C5L;
            stringBuffer = new StringBuffer();
            CallSite callSite = m44.a("k", (long)9075180549943626017L, (long)l10);
            stringBuffer.append("[");
            CallSite callSite2 = m44.a("t", (Object)hashSet, (long)9213331877176153509L, (long)l10);
            while (callSite2.hasNext()) {
                block9: {
                    lmw lmw2 = (lmw)callSite2.next();
                    try {
                        StringBuffer stringBuffer2;
                        try {
                            try {
                                if (l10 > 0L) {
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l11;
                                    stringBuffer2 = stringBuffer.append((String)((Object)m44.a("t", (Object)lmw2, (Object)objectArray2, (long)8664365831295982741L, (long)l10)));
                                    if (callSite != null) break block9;
                                }
                                if (callSite != null) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)n92, (long)7042511718281075619L, (long)l10);
                            }
                            if (!callSite2.hasNext()) break block9;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)n93, (long)7042511718281075619L, (long)l10);
                        }
                        stringBuffer2 = stringBuffer.append((String)((Object)g2.a("j", (int)14071, (long)(0x88706F1B139B7D6L ^ l10))));
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)n94, (long)7042511718281075619L, (long)l10);
                    }
                }
                if (callSite == null) continue;
            }
            stringBuffer.append("]");
            if (l10 > 0L) {
                // empty if block
            }
        }
        return stringBuffer.toString();
    }

    public g2(long l10, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
        l10 = a ^ l10;
        m44.a("u", (Object)this, (HashSet)hashSet, (long)-3405002945384924018L, (long)l10);
        m44.a("u", (Object)this, (HashSet)hashSet2, (long)-3718032839028547975L, (long)l10);
        m44.a("u", (Object)this, (HashSet)hashSet3, (long)-3024713254740040133L, (long)l10);
    }

    @Override
    public String U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8536254357251619488L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                g2.a = prr.a(6973838772026042758L, 332624601802393227L, MethodHandles.lookup().lookupClass()).a(87744889924503L);
                g2.e = new HashMap<K, V>(13);
                var0 = g2.a ^ 91000670959996L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = " \u009e\u00df\u00c0E\u00c6\u00c1\b\\^\u001d\"G\u0015\u00e6c\u00d7?\u0002d\u0099\u0088:\fQ\u00db#\u00aa\u000b/\u00acf\u008b\u00e9\u0090\u00dbUO2\u00bc\u0010\u00c9\u0006\u00e7Y\u0006H\u00cb\u00ffK,N\u00b4\u00bb\u00f9\u009d\u0004";
                var8_6 = " \u009e\u00df\u00c0E\u00c6\u00c1\b\\^\u001d\"G\u0015\u00e6c\u00d7?\u0002d\u0099\u0088:\fQ\u00db#\u00aa\u000b/\u00acf\u008b\u00e9\u0090\u00dbUO2\u00bc\u0010\u00c9\u0006\u00e7Y\u0006H\u00cb\u00ffK,N\u00b4\u00bb\u00f9\u009d\u0004".length();
                var5_7 = 40;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = g2.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "f_\f\u0081\u00f6>re\u00fc%\"Z\u0004\u00d5!:\u00ae(\u00e7\u0080\u00f9\u0010\u00eeE\u0010@\u008d\u00fc\u00d9uY,\u00fd\u00e4\u00f5\u00f4x\u00f1;\u009by";
                    var8_6 = "f_\f\u0081\u00f6>re\u00fc%\"Z\u0004\u00d5!:\u00ae(\u00e7\u0080\u00f9\u0010\u00eeE\u0010@\u008d\u00fc\u00d9uY,\u00fd\u00e4\u00f5\u00f4x\u00f1;\u009by".length();
                    var5_7 = 24;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = g2.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        g2.b = var9_3;
        g2.c = new String[4];
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6FAC;
        if (c[n11] == null) {
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
                throw new RuntimeException("com/zelix/g2", exception);
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
            g2.c[n11] = g2.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = g2.a(n10, l10);
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
            throw new RuntimeException("com/zelix/g2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

