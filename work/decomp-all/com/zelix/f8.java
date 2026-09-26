/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.fr;
import com.zelix.l68;
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
    private static final long a = prr.a((long)-6420467980104366242L, (long)-2438172085918633551L, MethodHandles.lookup().lookupClass()).a(264670301851398L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map e;

    public f8(int n, int n2, int n3, long l) {
        long l2 = (l = a ^ l) ^ 0x45EAB98B8851L;
        int n4 = (int)(l2 >>> 48);
        long l3 = l2 << 16 >>> 16;
        this(n, n2, n3, (short)n4, 5, l3);
    }

    public synchronized boolean Q(Object[] objectArray) {
        fr fr2;
        long l;
        long l2;
        Object object;
        Object object2;
        block4: {
            fr fr3;
            block5: {
                Object object3 = objectArray[0];
                object2 = objectArray[1];
                object = objectArray[2];
                l2 = (Long)objectArray[3];
                l = (l2 = a ^ l2) ^ 0x6B87FD635B7L;
                fr3 = (fr)m44.a("q", (Object)m44.a("p", (Object)this, (long)2961287997161429266L, (long)l2), (Object)object3, (long)3886554120281964458L, (long)l2);
                CallSite callSite = m44.a("n", (long)2884685338857977406L, (long)l2);
                try {
                    try {
                        fr2 = fr3;
                        if (callSite != null) break block4;
                        if (fr2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)3660625999432060989L, (long)l2);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)3660625999432060989L, (long)l2);
                }
            }
            fr2 = fr3;
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = object;
        objectArray2[1] = object2;
        objectArray2[0] = l;
        return (boolean)m44.a("q", (Object)fr2, (Object)objectArray2, (long)3160204187626032491L, (long)l2);
    }

    public f8(int n, int n2, int n3, int n4, int n5, int n6, char c, boolean bl) {
        block8: {
            f8 f82;
            int n7;
            int n8;
            int n10;
            long l;
            block6: {
                l = ((long)n5 << 32 | (long)n6 << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
                long l2 = l ^ 0x471E2787C907L;
                n10 = (int)(l2 >>> 32);
                n8 = (int)(l2 << 32 >>> 48);
                n7 = (int)(l2 << 48 >>> 48);
                CallSite callSite = m44.a("m", (long)2322563767328390669L, (long)l);
                m44.a("q", (Object)this, (int)n2, (long)4208955330398934193L, (long)l);
                m44.a("q", (Object)this, (int)n3, (long)4467321110335082720L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    block7: {
                        try {
                            try {
                                f82 = this;
                                if (callSite2 != null) break block6;
                                m44.a("q", (Object)f82, (int)n4, (long)2616199143930527965L, (long)l);
                                if (!bl) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)((Object)n92), (long)4250895070776006670L, (long)l);
                            }
                            m44.a("q", (Object)this, new ConcurrentHashMap(cf.x((int)n, (int)n10, (char)((char)n8), (short)((short)n7))), (long)2390156612888842529L, (long)l);
                            if (callSite2 == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)((Object)n93), (long)4250895070776006670L, (long)l);
                        }
                    }
                    f82 = this;
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)((Object)n94), (long)4250895070776006670L, (long)l);
                }
            }
            m44.a("q", (Object)f82, new LinkedHashMap(cf.x((int)n, (int)n10, (char)((char)n8), (short)((short)n7))), (long)2390156612888842529L, (long)l);
        }
    }

    public f8(int n, int n2, int n3, short s, int n4, long l) {
        long l2 = ((long)s << 48 | l << 16 >>> 16) ^ a;
        long l3 = l2 ^ 0x2B1587EE0211L;
        int n5 = (int)(l3 >>> 32);
        int n6 = (int)(l3 << 32 >>> 48);
        int n7 = (int)(l3 << 48 >>> 48);
        this(n, n2, n3, n4, n5, n6, (char)n7, true);
    }

    public Enumeration c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x4D11549F9163L;
        return new l68(l2, (Collection)((Object)m44.a("p", (Object)m44.a("q", (Object)this, (long)-7239064748035216509L, (long)l), (long)-8873301933482575102L, (long)l)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized Set m(Object[] objectArray) {
        Object object;
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x75997725290AL;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator iterator = m44.a("t", (Object)m44.a("u", (Object)this, (long)3791368021029897367L, (long)l), (long)3990214800610370296L, (long)l).iterator();
        CallSite callSite = m44.a("k", (long)3858820268722236347L, (long)l);
        block2: while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            try {
                do {
                    if (l >= 0L) {
                        object = linkedHashSet;
                        if (callSite != null) return object;
                        object.add(new lol(l2, entry.getKey(), entry.getValue()));
                    }
                    if (callSite == null) continue block2;
                } while (l <= 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("k", (Object)((Object)n92), (long)3407001075551112632L, (long)l);
            }
        }
        object = m44.a("k", linkedHashSet, (long)3479142764829565540L, (long)l);
        return object;
    }

    public f8(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x5A0117B3DAD2L;
        int n2 = (int)(l2 >>> 48);
        long l3 = l2 << 16 >>> 16;
        this(n, (int)f8.a("e", (int)7427, (long)(0x4371CC31ABCB81D3L ^ l)), 5, (short)n2, 5, l3);
    }

    public fr a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        l = a ^ l;
        return (fr)m44.a("w", (Object)m44.a("v", (Object)this, (long)6297894031179982700L, (long)l), (Object)object, (long)5445369406988927444L, (long)l);
    }

    public synchronized boolean l(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)1827020557759572304L, (long)l), (Object)object, (long)2295691853195967255L, (long)l);
    }

    public int g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("s", (Object)m44.a("r", (Object)this, (long)-1753418381172762720L, (long)l), (long)-1894825814526913037L, (long)l);
    }

    public f8(long l) {
        long l2 = (l = a ^ l) ^ 0x57535E07898DL;
        this((int)f8.a("e", (int)7986, (long)(0x69B13084EA19089BL ^ l)), (int)f8.a("e", (int)24937, (long)(0x5DB89A5083A4F6C2L ^ l)), 5, l2);
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
        int n;
        int n2;
        int n3;
        Object object;
        block10: {
            CallSite callSite2;
            block11: {
                fr fr2;
                CallSite callSite3;
                Object object2;
                long l;
                block8: {
                    fr fr3;
                    block9: {
                        l = (Long)objectArray[0];
                        Object object3 = objectArray[1];
                        object2 = objectArray[2];
                        object = objectArray[3];
                        long l2 = (l = a ^ l) ^ 0x7FBCEAFAD634L;
                        n3 = (int)(l2 >>> 48);
                        n2 = (int)(l2 << 16 >>> 32);
                        n = (int)(l2 << 48 >>> 48);
                        fr3 = (fr)m44.a("u", (Object)m44.a("t", (Object)this, (long)4723361801456595334L, (long)l), (Object)object3, (long)6736130875432097598L, (long)l);
                        callSite3 = m44.a("j", (long)4655645859952680618L, (long)l);
                        try {
                            try {
                                fr2 = fr3;
                                if (callSite3 != null) break block8;
                                if (fr2 != null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)((Object)n92), (long)6510371924082849961L, (long)l);
                            }
                            return null;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)((Object)n93), (long)6510371924082849961L, (long)l);
                        }
                    }
                    fr2 = fr3;
                }
                callSite2 = m44.a("u", (Object)fr2, (Object)new Object[]{object2}, (long)6376655491738740813L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block10;
                        if (callSite != null) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)((Object)n94), (long)6510371924082849961L, (long)l);
                    }
                    return null;
                }
                catch (n9 n95) {
                    throw m44.a("j", (Object)((Object)n95), (long)6510371924082849961L, (long)l);
                }
            }
            callSite = callSite2;
        }
        return callSite.t((char)n3, object, n2, (short)n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x47502DE53E15L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\t-\u0081\u00f5&L\u00d8\u00a3\u001f\u0011\u00a8\u009f\u0018\u00f5\u00c0\u00b5\u00e8\u00be\u0001\u00cd\u0098\u00a6Xc";
        int n2 = "\t-\u0081\u00f5&L\u00d8\u00a3\u001f\u0011\u00a8\u009f\u0018\u00f5\u00c0\u00b5\u00e8\u00be\u0001\u00cd\u0098\u00a6Xc".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A68;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f8.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = f8.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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
