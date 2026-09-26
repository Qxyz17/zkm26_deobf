/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.f5;
import com.zelix.lku;
import com.zelix.lqh;
import com.zelix.lun;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f
implements lun {
    private final lku U;
    private static f A;
    private lqh R;
    private final Random S;
    private final Map L;
    private lun B;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public long J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return 0L;
    }

    private f(Random random, int n, List list, long l, lku lku2) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x2A31A736854AL;
        long l4 = l2 ^ 0x2F42BF0FB5E8L;
        long l5 = l2 ^ 0x63C3A6A02BA8L;
        long l6 = l2 ^ 0x1F1CA69E53B4L;
        long l7 = l2 ^ 0x4EAC46A60DBBL;
        long l8 = l2 ^ 0xA444A9A625BL;
        int n2 = (int)(l8 >>> 32);
        int n3 = (int)(l8 << 32 >>> 48);
        int n4 = (int)(l8 << 48 >>> 48);
        long l9 = l2 ^ 0x5F87E7BB53D6L;
        CallSite callSite = m44.a("i", (long)-8621788281115569934L, (long)l);
        this.S = random;
        Object[] objectArray = new Object[2];
        objectArray[1] = l7;
        objectArray[0] = cf.x((int)n, (int)n2, (char)((char)n3), (short)((short)n4));
        this.L = m44.a("i", (Object)objectArray, (long)-8540510970281653094L, (long)l);
        this.U = lku2;
        m44.a("j", (f)this, (long)-8524879920074786127L, (long)l);
        CallSite callSite2 = callSite;
        int n5 = 0;
        m44.a("u", (Object)this, (lqh)new lqh(l6, n), (long)-8170511098320475142L, (long)l);
        zr zr2 = new zr(false);
        int n6 = 0;
        while (!zr2.S()) {
            Object object;
            block9: {
                Object object2;
                f5 f52;
                block10: {
                    block8: {
                        int n7;
                        block7: {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l3;
                            CallSite callSite3 = m44.a("h", (Object)this, (Object)objectArray2, (long)-8040755230922653966L, (long)l);
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l9;
                            objectArray3[1] = zr2;
                            objectArray3[0] = (long)callSite3;
                            f52 = (f5)m44.a("v", (Object)lku2, (Object)objectArray3, (long)-8610584667875249405L, (long)l);
                            try {
                                try {
                                    list.add((long)callSite3);
                                    n7 = n5;
                                    if (callSite2 == null) break block7;
                                    if (n7 != 0) break block8;
                                }
                                catch (n9 n92) {
                                    throw m44.a("i", (Object)((Object)n92), (long)-7747062123961308079L, (long)l);
                                }
                                n7 = random.nextInt(n / 2);
                            }
                            catch (n9 n93) {
                                throw m44.a("i", (Object)((Object)n93), (long)-7747062123961308079L, (long)l);
                            }
                        }
                        if (n7 != 0) break block8;
                        object2 = this;
                        n5 = 1;
                        list.add(this);
                        object = callSite2;
                        if (l < 0L) break block9;
                        if (object != null) break block10;
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l3;
                    CallSite callSite4 = m44.a("h", (Object)this, (Object)objectArray4, (long)-8040755230922653966L, (long)l);
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = l9;
                    objectArray5[1] = zr2;
                    objectArray5[0] = (long)callSite4;
                    object2 = m44.a("v", (Object)lku2, (Object)objectArray5, (long)-8610584667875249405L, (long)l);
                    list.add((long)callSite4);
                }
                Object[] objectArray6 = new Object[1];
                objectArray6[0] = l4;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)-8170511098320475142L, (long)l), (Object)m44.a("v", (Object)f52, (Object)objectArray6, (long)-8615501475967173658L, (long)l), (Object)f52, (Object)object2, (long)l5, (long)-7653313965674917370L, (long)l);
                object = m44.a("w", (Object)this, (long)-7758077326451890405L, (long)l).put(f52, object2);
            }
            lun lun2 = (lun)object;
            ++n6;
            if (callSite2 != null) continue;
        }
    }

    lqh Y(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ a;
        return m44.a("r", (Object)this, (long)3549307812734637095L, (long)l);
    }

    public long A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (Long)objectArray[1];
        return l;
    }

    public void n(Object[] objectArray) {
        block11: {
            Object[] objectArray2;
            Object object;
            long l;
            block12: {
                long l2;
                lun lun2;
                block13: {
                    Object[] objectArray3;
                    block10: {
                        lun2 = (lun)objectArray[0];
                        l = (Long)objectArray[1];
                        l2 = l ^ 0L;
                        objectArray3 = m44.a("h", (long)-5359217087332668149L, (long)l);
                        try {
                            try {
                                object = this;
                                if (objectArray3 == null) break block10;
                                if (object == lun2) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-6231410397148540504L, (long)l);
                            }
                            object = m44.a("v", (Object)this, (long)-5294171783131837107L, (long)l);
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-6231410397148540504L, (long)l);
                        }
                    }
                    try {
                        block14: {
                            try {
                                try {
                                    objectArray2 = objectArray3;
                                    if (l <= 0L) break block12;
                                    if (objectArray2 == null) break block13;
                                    if (object != null) break block14;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)((Object)n94), (long)-6231410397148540504L, (long)l);
                                }
                                m44.a("t", (Object)this, (lun)lun2, (long)-5294171783131837107L, (long)l);
                                if (objectArray3 != null) break block11;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)((Object)n95), (long)-6231410397148540504L, (long)l);
                            }
                        }
                        object = m44.a("v", (Object)this, (long)-5294171783131837107L, (long)l);
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)((Object)n96), (long)-6231410397148540504L, (long)l);
                    }
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l2;
                objectArray2 = objectArray4;
                objectArray4[0] = lun2;
            }
            m44.a("w", (Object)object, (Object)objectArray2, (long)-5373873608731152303L, (long)l);
        }
    }

    static f V(Object[] objectArray) {
        Random random = (Random)objectArray[0];
        int n = (Integer)objectArray[1];
        List list = (List)objectArray[2];
        long l = (Long)objectArray[3];
        lku lku2 = (lku)objectArray[4];
        long l2 = (l = a ^ l) ^ 0x1CB2F4F06872L;
        m44.a("m", null, (long)3994396826080724078L, (long)l);
        return new f(random, n, list, l2, lku2);
    }

    public long M() {
        return 0L;
    }

    public boolean Y(Object[] objectArray) {
        return false;
    }

    public Map A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("j", (Object)m44.a("t", (Object)this, (long)5311647857341922040L, (long)l), (long)5384547694142570094L, (long)l);
    }

    public boolean Y(int n, short s, int n2, lun lun2) {
        boolean bl;
        block12: {
            block13: {
                boolean bl2;
                block14: {
                    block15: {
                        f f2;
                        CallSite callSite;
                        long l;
                        block10: {
                            block11: {
                                l = (long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48;
                                callSite = m44.a("h", (long)1889314222145110675L, (long)l);
                                try {
                                    try {
                                        f2 = this;
                                        if (callSite == null) break block10;
                                        if (f2 != lun2) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)((Object)n92), (long)440675946011409968L, (long)l);
                                    }
                                    return true;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)((Object)n93), (long)440675946011409968L, (long)l);
                                }
                            }
                            f2 = lun2;
                        }
                        try {
                            try {
                                try {
                                    bl = f2 instanceof f;
                                    if (callSite == null) break block12;
                                    if (!bl) break block13;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)((Object)n94), (long)440675946011409968L, (long)l);
                                }
                                bl2 = System.identityHashCode(this) - System.identityHashCode(lun2);
                                if (callSite == null) break block14;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)((Object)n95), (long)440675946011409968L, (long)l);
                            }
                            if (bl2 > false) break block15;
                        }
                        catch (n9 n96) {
                            throw m44.a("h", (Object)((Object)n96), (long)440675946011409968L, (long)l);
                        }
                        bl2 = true;
                        break block14;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    private long w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x27F82E01A42DL;
        long l4 = l2 ^ 0x535B7B4A49C7L;
        long l5 = l2 ^ 0x79F010C98BF5L;
        int n = ((Random)((Object)m44.a("p", (Object)this, (long)-2645598318929977716L, (long)l))).nextInt((int)f.a("c", (int)5283, (long)(0x2738D8142916979AL ^ l)));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        CallSite callSite = m44.a("q", (Object)m44.a("p", (Object)this, (long)-4454549101197115111L, (long)l), (Object)objectArray2, (long)-2470649946449684598L, (long)l);
        int n2 = ((Random)((Object)m44.a("p", (Object)this, (long)-2645598318929977716L, (long)l))).nextInt((int)f.a("c", (int)28622, (long)(0x4DECE663CA446CF6L ^ l)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = m44.a("q", (Object)m44.a("p", (Object)this, (long)-4454549101197115111L, (long)l), (Object)objectArray3, (long)-2604312143017585989L, (long)l);
        objectArray4[3] = n2;
        objectArray4[2] = l4;
        objectArray4[1] = (long)callSite;
        objectArray4[0] = n;
        return (long)m44.a("n", (Object)objectArray4, (long)-4547077682292009119L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)-2329477946324723277L, (long)5813065597629915355L, MethodHandles.lookup().lookupClass()).a(112149215160217L);
        d = new HashMap(13);
        long l = a ^ 0x72A8062C3A01L;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00d0\u0093\u00b9\u0090*O\b\u00c3\u00d2F\u00b27\u0095\u00c9Ff";
        int n2 = "\u00d0\u0093\u00b9\u0090*O\b\u00c3\u00d2F\u00b27\u0095\u00c9Ff".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x55F8;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/f", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = f.a(n, l);
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
            throw new RuntimeException("com/zelix/f" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
