/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.fr;
import com.zelix.l68;
import com.zelix.l6q;
import com.zelix.lol;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f8 {
    int U;
    int R;
    AbstractMap n;
    boolean N;
    int d;
    private static final long a = prr.a(-6420467980104366242L, -2438172085918633551L, MethodHandles.lookup().lookupClass()).a(264670301851398L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map e;

    public f8(int n10, int n11, int n12, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x45EAB98B8851L;
        int n13 = (int)(l11 >>> 48);
        long l12 = l11 << 16 >>> 16;
        this(n10, n11, n12, (short)n13, 5, l12);
    }

    public synchronized boolean Q(Object[] objectArray) {
        fr fr2;
        long l10;
        long l11;
        Object object;
        Object object2;
        block4: {
            fr fr3;
            block5: {
                Object object3 = objectArray[0];
                object2 = objectArray[1];
                object = objectArray[2];
                l11 = (Long)objectArray[3];
                l10 = (l11 = a ^ l11) ^ 0x6B87FD635B7L;
                fr3 = (fr)((Object)m44.a("q", (Object)m44.a("p", (Object)this, (long)2961287997161429266L, (long)l11), (Object)object3, (long)3886554120281964458L, (long)l11));
                CallSite callSite = m44.a("n", (long)2884685338857977406L, (long)l11);
                try {
                    try {
                        fr2 = fr3;
                        if (callSite != null) break block4;
                        if (fr2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)3660625999432060989L, (long)l11);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)3660625999432060989L, (long)l11);
                }
            }
            fr2 = fr3;
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = object;
        objectArray2[1] = object2;
        objectArray2[0] = l10;
        return (boolean)m44.a("q", (Object)fr2, (Object)objectArray2, (long)3160204187626032491L, (long)l11);
    }

    public f8(int n10, int n11, int n12, int n13, int n14, int n15, char c10, boolean bl2) {
        block8: {
            f8 f82;
            int n16;
            int n17;
            int n18;
            long l10;
            block6: {
                l10 = ((long)n14 << 32 | (long)n15 << 48 >>> 32 | (long)c10 << 48 >>> 48) ^ a;
                long l11 = l10 ^ 0x471E2787C907L;
                n18 = (int)(l11 >>> 32);
                n17 = (int)(l11 << 32 >>> 48);
                n16 = (int)(l11 << 48 >>> 48);
                CallSite callSite = m44.a("m", (long)2322563767328390669L, (long)l10);
                m44.a("q", (Object)this, (int)n11, (long)4208955330398934193L, (long)l10);
                m44.a("q", (Object)this, (int)n12, (long)4467321110335082720L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    block7: {
                        try {
                            try {
                                f82 = this;
                                if (callSite2 != null) break block6;
                                m44.a("q", (Object)f82, (int)n13, (long)2616199143930527965L, (long)l10);
                                if (!bl2) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)n92, (long)4250895070776006670L, (long)l10);
                            }
                            m44.a("q", (Object)this, new ConcurrentHashMap(cf.x(n10, n18, (char)n17, (short)n16)), (long)2390156612888842529L, (long)l10);
                            if (callSite2 == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)n93, (long)4250895070776006670L, (long)l10);
                        }
                    }
                    f82 = this;
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)n94, (long)4250895070776006670L, (long)l10);
                }
            }
            m44.a("q", (Object)f82, new LinkedHashMap(cf.x(n10, n18, (char)n17, (short)n16)), (long)2390156612888842529L, (long)l10);
        }
    }

    public f8(int n10, int n11, int n12, short s10, int n13, long l10) {
        long l11 = ((long)s10 << 48 | l10 << 16 >>> 16) ^ a;
        long l12 = l11 ^ 0x2B1587EE0211L;
        int n14 = (int)(l12 >>> 32);
        int n15 = (int)(l12 << 32 >>> 48);
        int n16 = (int)(l12 << 48 >>> 48);
        this(n10, n11, n12, n13, n14, n15, (char)n16, true);
    }

    public Enumeration c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x4D11549F9163L;
        return new l68(l11, (Collection)((Object)m44.a("p", (Object)m44.a("q", (Object)this, (long)-7239064748035216509L, (long)l10), (long)-8873301933482575102L, (long)l10)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized Set m(Object[] objectArray) {
        Object object;
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x75997725290AL;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator iterator = m44.a("t", (Object)m44.a("u", (Object)this, (long)3791368021029897367L, (long)l10), (long)3990214800610370296L, (long)l10).iterator();
        CallSite callSite = m44.a("k", (long)3858820268722236347L, (long)l10);
        block2: while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            try {
                do {
                    if (l10 >= 0L) {
                        object = linkedHashSet;
                        if (callSite != null) return object;
                        object.add(new lol(l11, entry.getKey(), entry.getValue()));
                    }
                    if (callSite == null) continue block2;
                } while (l10 <= 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("k", (Object)n92, (long)3407001075551112632L, (long)l10);
            }
        }
        object = m44.a("k", linkedHashSet, (long)3479142764829565540L, (long)l10);
        return object;
    }

    public f8(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x5A0117B3DAD2L;
        int n11 = (int)(l11 >>> 48);
        long l12 = l11 << 16 >>> 16;
        this(n10, (int)f8.a("e", (int)7427, (long)(0x4371CC31ABCB81D3L ^ l10)), 5, (short)n11, 5, l12);
    }

    public fr a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        l10 = a ^ l10;
        return (fr)((Object)m44.a("w", (Object)m44.a("v", (Object)this, (long)6297894031179982700L, (long)l10), (Object)object, (long)5445369406988927444L, (long)l10));
    }

    public synchronized boolean l(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)1827020557759572304L, (long)l10), (Object)object, (long)2295691853195967255L, (long)l10);
    }

    public int g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("s", (Object)m44.a("r", (Object)this, (long)-1753418381172762720L, (long)l10), (long)-1894825814526913037L, (long)l10);
    }

    public f8(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x57535E07898DL;
        this((int)f8.a("e", (int)7986, (long)(0x69B13084EA19089BL ^ l10)), (int)f8.a("e", (int)24937, (long)(0x5DB89A5083A4F6C2L ^ l10)), 5, l11);
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void k(Object[] var1_1) {
        block6: {
            block5: {
                var4_2 = var1_1[0];
                var2_3 = (Long)var1_1[1];
                var5_4 = var1_1[2];
                var6_5 = var1_1[3];
                var7_6 = var1_1[4];
                v0 = var2_3 = f8.a ^ var2_3;
                var8_7 = v0 ^ 108583336193997L;
                var10_8 = v0 ^ 96455569841906L;
                var13_9 = (fr)m44.a("t", (Object)m44.a("u", (Object)this, (long)8114817195214635159L, (long)var2_3), (Object)var4_2, (long)7812290569510839855L, (long)var2_3);
                var12_10 = m44.a("k", (long)8182322030486974395L, (long)var2_3);
                try {
                    v1 = var13_9;
                    if (var12_10 != null) break block5;
                    if (v1 == null) {
                    }
                    ** GOTO lbl29
                }
                catch (n9 v2) {
                    throw m44.a("k", (Object)v2, (long)7730467738314492344L, (long)var2_3);
                }
                var13_9 = new fr((int)m44.a("u", (Object)this, (long)7772970422204630279L, (long)var2_3), (int)m44.a("u", (Object)this, (long)7802777835225612630L, (long)var2_3), (int)m44.a("u", (Object)this, (long)8500701229220057451L, (long)var2_3), var10_8, (boolean)m44.a("u", (Object)this, (long)8379687892746045315L, (long)var2_3));
                try {
                    v1 = var13_9;
                    if (var2_3 <= 0L) break block5;
                    v1.T(var8_7, var5_4, var6_5, var7_6);
                    m44.a("t", (Object)m44.a("u", (Object)this, (long)8114817195214635159L, (long)var2_3), (Object)var4_2, (Object)var13_9, (long)7798243154973103073L, (long)var2_3);
                    if (var12_10 == null) break block6;
lbl29:
                    // 2 sources

                    v1 = var13_9;
                }
                catch (n9 v3) {
                    throw m44.a("k", (Object)v3, (long)7730467738314492344L, (long)var2_3);
                }
            }
            v1.T(var8_7, var5_4, var6_5, var7_6);
        }
    }

    public synchronized List s(Object[] objectArray) {
        CallSite callSite;
        int n10;
        int n11;
        int n12;
        Object object;
        block10: {
            CallSite callSite2;
            block11: {
                fr fr2;
                CallSite callSite3;
                Object object2;
                long l10;
                block8: {
                    fr fr3;
                    block9: {
                        l10 = (Long)objectArray[0];
                        Object object3 = objectArray[1];
                        object2 = objectArray[2];
                        object = objectArray[3];
                        long l11 = (l10 = a ^ l10) ^ 0x7FBCEAFAD634L;
                        n12 = (int)(l11 >>> 48);
                        n11 = (int)(l11 << 16 >>> 32);
                        n10 = (int)(l11 << 48 >>> 48);
                        fr3 = (fr)((Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)4723361801456595334L, (long)l10), (Object)object3, (long)6736130875432097598L, (long)l10));
                        callSite3 = m44.a("j", (long)4655645859952680618L, (long)l10);
                        try {
                            try {
                                fr2 = fr3;
                                if (callSite3 != null) break block8;
                                if (fr2 != null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)6510371924082849961L, (long)l10);
                            }
                            return null;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)6510371924082849961L, (long)l10);
                        }
                    }
                    fr2 = fr3;
                }
                callSite2 = m44.a("u", (Object)fr2, (Object)new Object[]{object2}, (long)6376655491738740813L, (long)l10);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block10;
                        if (callSite != null) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)n94, (long)6510371924082849961L, (long)l10);
                    }
                    return null;
                }
                catch (n9 n95) {
                    throw m44.a("j", (Object)n95, (long)6510371924082849961L, (long)l10);
                }
            }
            callSite = callSite2;
        }
        return ((l6q)((Object)callSite)).t((char)n12, object, n11, (short)n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l10 = a ^ 0x47502DE53E15L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\t-\u0081\u00f5&L\u00d8\u00a3\u001f\u0011\u00a8\u009f\u0018\u00f5\u00c0\u00b5\u00e8\u00be\u0001\u00cd\u0098\u00a6Xc";
        int n11 = "\t-\u0081\u00f5&L\u00d8\u00a3\u001f\u0011\u00a8\u009f\u0018\u00f5\u00c0\u00b5\u00e8\u00be\u0001\u00cd\u0098\u00a6Xc".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[3];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6A68;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
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
                throw new RuntimeException("com/zelix/f8", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f8.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = f8.a(n10, l10);
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
            throw new RuntimeException("com/zelix/f8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

