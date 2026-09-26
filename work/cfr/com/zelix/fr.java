/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.l68;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fr {
    private final boolean G;
    int X;
    int p;
    Map Z;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public boolean X(Object[] objectArray) {
        Object object = objectArray[0];
        return this.Z.containsKey(object);
    }

    public fr(boolean bl2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x248D058B6D17L;
        this((int)fr.a("l", (int)30977, (long)(0x6C95B6ABC188298EL ^ l10)), (int)fr.a("l", (int)5412, (long)(0x7ED81FFD559345A9L ^ l10)), 5, l11, bl2);
    }

    public synchronized void N(Object[] objectArray) {
        block6: {
            long l10 = (Long)objectArray[0];
            long l11 = (l10 = a ^ l10) ^ 0x3290F37C0BDL;
            Collection collection = this.Z.values();
            CallSite callSite = m44.a("o", (long)-7016284313921355625L, (long)l10);
            block2: for (l6q l6q2 : collection) {
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    m44.a("p", (Object)l6q2, (Object)objectArray2, (long)-9132292130076152593L, (long)l10);
                    do {
                        CallSite callSite2 = callSite;
                        if (l10 > 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)-7283596675247179898L, (long)l10);
                }
            }
            this.Z.clear();
        }
    }

    public l6q h(Object[] objectArray) {
        Object object = objectArray[0];
        return (l6q)this.Z.get(object);
    }

    public l6q t(Object[] objectArray) {
        Object object = objectArray[0];
        l6q l6q2 = (l6q)objectArray[1];
        return this.Z.put(object, l6q2);
    }

    public Set z(Object[] objectArray) {
        return this.Z.entrySet();
    }

    public Enumeration x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x6A55EEACFAD8L;
        return new l68(l11, this.Z.keySet());
    }

    public Set v(Object[] objectArray) {
        return this.Z.keySet();
    }

    public int c(Object[] objectArray) {
        return this.Z.size();
    }

    public boolean D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("u", (Object)this.Z, (long)-3997431584988959545L, (long)l10);
    }

    public synchronized boolean c(Object[] objectArray) {
        block3: {
            l6q l6q2;
            long l10;
            long l11;
            Object object;
            Object object2;
            block2: {
                Object object3 = objectArray[0];
                object2 = objectArray[1];
                object = objectArray[2];
                l11 = (Long)objectArray[3];
                l10 = (l11 = a ^ l11) ^ 0x3273408E6529L;
                l6q l6q3 = (l6q)this.Z.get(object3);
                CallSite callSite = m44.a("l", (long)-6007107006886202732L, (long)l11);
                try {
                    l6q2 = l6q3;
                    if (callSite != null) break block2;
                    if (l6q2 == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)-6275719902125374075L, (long)l11);
                }
                l6q2 = l6q3;
            }
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = object;
            objectArray2[1] = object2;
            objectArray2[0] = l10;
            return (boolean)m44.a("s", (Object)l6q2, (Object)objectArray2, (long)-5823730012929061801L, (long)l11);
        }
        return false;
    }

    public synchronized List C(Object[] objectArray) {
        block3: {
            l6q l6q2;
            long l10;
            Object object;
            long l11;
            block2: {
                l11 = (Long)objectArray[0];
                Object object2 = objectArray[1];
                object = objectArray[2];
                l10 = (l11 = a ^ l11) ^ 0x7083784E7E84L;
                l6q l6q3 = (l6q)this.Z.get(object2);
                CallSite callSite = m44.a("o", (long)7415473467882698975L, (long)l11);
                try {
                    l6q2 = l6q3;
                    if (callSite != null) break block2;
                    if (l6q2 == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)7107625973910409166L, (long)l11);
                }
                l6q2 = l6q3;
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l10;
            objectArray2[0] = object;
            return m44.a("p", (Object)l6q2, (Object)objectArray2, (long)7280004342311867941L, (long)l11);
        }
        return null;
    }

    public fr(int n10, int n11, long l10, int n12) {
        long l11 = (l10 = a ^ l10) ^ 0x2308C94370A5L;
        this(n10, n11, n12, l11, false);
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void T(long var1_1, Object var3_2, Object var4_3, Object var5_4) {
        block6: {
            block5: {
                v0 = var1_1 = fr.a ^ var1_1;
                var6_5 = v0 ^ 124131452414560L;
                var8_6 = v0 ^ 4855015458308L;
                var11_7 = (l6q)this.Z.get(var3_2);
                var10_8 = m44.a("k", (long)-5382593993767408773L, (long)var1_1);
                try {
                    v1 = var11_7;
                    if (var10_8 != null) break block5;
                    if (v1 == null) {
                    }
                    ** GOTO lbl23
                }
                catch (n9 v2) {
                    throw m44.a("k", (Object)v2, (long)-5690440270145266582L, (long)var1_1);
                }
                var11_7 = new l6q(false, (int)m44.a("u", (Object)this, (long)-5949614347925816069L, (long)var1_1), (int)m44.a("u", (Object)this, (long)-5643998374096105139L, (long)var1_1), var6_5, (boolean)m44.a("u", (Object)this, (long)-6320022528687912187L, (long)var1_1));
                try {
                    v1 = var11_7;
                    if (var1_1 <= 0L) break block5;
                    v1.t(var4_3, var5_4, var8_6);
                    this.Z.put(var3_2, var11_7);
                    if (var10_8 == null) break block6;
lbl23:
                    // 2 sources

                    v1 = var11_7;
                }
                catch (n9 v3) {
                    throw m44.a("k", (Object)v3, (long)-5690440270145266582L, (long)var1_1);
                }
            }
            v1.t(var4_3, var5_4, var8_6);
        }
    }

    public l6q b(Object[] objectArray) {
        Object object = objectArray[0];
        return (l6q)this.Z.remove(object);
    }

    public synchronized List f(Object object, long l10, Object object2) {
        l6q l6q2;
        int n10;
        int n11;
        int n12;
        block4: {
            l6q l6q3;
            block5: {
                long l11 = (l10 = a ^ l10) ^ 0x38D1707A06C9L;
                n12 = (int)(l11 >>> 48);
                n11 = (int)(l11 << 16 >>> 32);
                n10 = (int)(l11 << 48 >>> 48);
                l6q3 = (l6q)this.Z.get(object);
                CallSite callSite = m44.a("o", (long)-8043030551956844969L, (long)l10);
                try {
                    try {
                        l6q2 = l6q3;
                        if (callSite != null) break block4;
                        if (l6q2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-7770051115906631354L, (long)l10);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-7770051115906631354L, (long)l10);
                }
            }
            l6q2 = l6q3;
        }
        return l6q2.t((char)n12, object2, n11, (short)n10);
    }

    public fr(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x6A85AC7E6498L;
        this((int)fr.a("l", (int)14395, (long)(0x6FDA198915AD6138L ^ l10)), (int)fr.a("l", (int)5412, (long)(0x7ED851F5FC664C26L ^ l10)), 5, l11, false);
    }

    public synchronized boolean b(Object[] objectArray) {
        l6q l6q2;
        int n10;
        int n11;
        int n12;
        Object object;
        block4: {
            l6q l6q3;
            block5: {
                long l10 = (Long)objectArray[0];
                Object object2 = objectArray[1];
                object = objectArray[2];
                long l11 = (l10 = a ^ l10) ^ 0x4D6FEE4FBC75L;
                n12 = (int)(l11 >>> 48);
                n11 = (int)(l11 << 16 >>> 32);
                n10 = (int)(l11 << 48 >>> 48);
                l6q3 = (l6q)this.Z.get(object2);
                CallSite callSite = m44.a("l", (long)8552986323042986116L, (long)l10);
                try {
                    try {
                        l6q2 = l6q3;
                        if (callSite != null) break block4;
                        if (l6q2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)8284404775261183893L, (long)l10);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)8284404775261183893L, (long)l10);
                }
            }
            l6q2 = l6q3;
        }
        return l6q2.J((short)n12, object, n11, (char)n10);
    }

    public fr(int n10, int n11, int n12, long l10, boolean n13) {
        block8: {
            int n14;
            long l11;
            block6: {
                long l12 = l10 = a ^ l10;
                l11 = l12 ^ 0x7EB95BF582AEL;
                long l13 = l12 ^ 0x3A5157C9ED4EL;
                int n15 = (int)(l13 >>> 32);
                int n16 = (int)(l13 << 32 >>> 48);
                int n17 = (int)(l13 << 48 >>> 48);
                CallSite callSite = m44.a("l", (long)320347384326593092L, (long)l10);
                m44.a("p", (Object)this, (int)n11, (long)2040566302640491972L, (long)l10);
                m44.a("p", (Object)this, (int)n12, (long)41456096200237170L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    fr fr2;
                    block7: {
                        try {
                            try {
                                fr2 = this;
                                n14 = n13;
                                if (callSite2 != null) break block6;
                                fr2.G = n14;
                                if (n13 == 0) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)n92, (long)15845892921584981L, (long)l10);
                            }
                            this.Z = new ConcurrentHashMap(cf.x(n10, n15, (char)n16, (short)n17));
                            if (callSite2 == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)n93, (long)15845892921584981L, (long)l10);
                        }
                    }
                    fr2 = this;
                    n14 = cf.x(n10, n15, (char)n16, (short)n17);
                }
                catch (n9 n94) {
                    throw m44.a("l", (Object)n94, (long)15845892921584981L, (long)l10);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l11;
            objectArray[0] = n14;
            fr2.Z = m44.a("l", (Object)objectArray, (long)463644883741737871L, (long)l10);
        }
    }

    public synchronized boolean d(Object[] objectArray) {
        l6q l6q2;
        long l10;
        Object object;
        Object object2;
        long l11;
        block4: {
            l6q l6q3;
            block5: {
                l11 = (Long)objectArray[0];
                Object object3 = objectArray[1];
                object2 = objectArray[2];
                object = objectArray[3];
                l10 = (l11 = a ^ l11) ^ 0x47452914CEF9L;
                l6q3 = (l6q)this.Z.get(object3);
                CallSite callSite = m44.a("n", (long)-4087012306372732546L, (long)l11);
                try {
                    try {
                        l6q2 = l6q3;
                        if (callSite != null) break block4;
                        if (l6q2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-4394860088637084049L, (long)l11);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-4394860088637084049L, (long)l11);
                }
            }
            l6q2 = l6q3;
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = object;
        objectArray2[1] = l10;
        objectArray2[0] = object2;
        return (boolean)m44.a("q", (Object)l6q2, (Object)objectArray2, (long)-2596421547521389190L, (long)l11);
    }

    public fr(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x2D6E7D6C50DEL;
        this(n10, (int)fr.a("l", (int)5054, (long)(0x47F8E92B61CA7EF9L ^ l10)), 5, l11, false);
    }

    public synchronized void y(Object[] objectArray) {
        CallSite callSite;
        l6q l6q2;
        long l10;
        Collection collection;
        Object object;
        block4: {
            l6q l6q3;
            Object object2 = objectArray[0];
            long l11 = (Long)objectArray[1];
            object = objectArray[2];
            collection = (Collection)objectArray[3];
            long l12 = l11 = a ^ l11;
            long l13 = l12 ^ 0xEBC878B524DL;
            l10 = l12 ^ 0x7A3379D3FE29L;
            l6q2 = (l6q)this.Z.get(object2);
            callSite = m44.a("n", (long)-8259512523078986922L, (long)l11);
            try {
                l6q3 = l6q2;
                if (callSite == null && l6q3 == null) {
                }
                break block4;
            }
            catch (n9 n92) {
                throw m44.a("n", (Object)n92, (long)-8563030778768595897L, (long)l11);
            }
            l6q2 = new l6q(false, (int)m44.a("p", (Object)this, (long)-7691084811284560682L, (long)l11), collection.size(), l13, (boolean)m44.a("p", (Object)this, (long)-8041253380510944472L, (long)l11));
            l6q3 = this.Z.put(object2, l6q2);
        }
        for (Object e10 : collection) {
            l6q2.t(object, e10, l10);
            if (callSite == null) continue;
        }
    }

    public fr(int n10, int n11, long l10, boolean bl2) {
        long l11 = (l10 = a ^ l10) ^ 0x4C8CF58E3863L;
        this(n10, n11, 5, l11, bl2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fr.a = prr.a(2374557085115786803L, 4134823730954332741L, MethodHandles.lookup().lookupClass()).a(1456151227241L);
                fr.d = new HashMap<K, V>(13);
                var0 = fr.a ^ 111937426874800L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u00e6T\u009a\u0012m\u00b2`\u00b6.\r\u00d3\u0087\u00d7\u00f8\u00fe+";
                var7_6 = "\u00e6T\u009a\u0012m\u00b2`\u00b6.\r\u00d3\u0087\u00d7\u00f8\u00fe+".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "~\u00cb'\u00fe\u00c6\u001cR>>\u0017\b\u0087=\t\u00cf\u000b";
                    var7_6 = "~\u00cb'\u00fe\u00c6\u001cR>>\u0017\b\u0087=\t\u00cf\u000b".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        fr.b = var8_3;
        fr.c = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5CA6;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/fr", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fr.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = fr.a(n10, l10);
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
            throw new RuntimeException("com/zelix/fr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fr.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

