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

    @Override
    public long J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return 0L;
    }

    private f(Random random, int n10, List list, long l10, lku lku2) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x2A31A736854AL;
        long l13 = l11 ^ 0x2F42BF0FB5E8L;
        long l14 = l11 ^ 0x63C3A6A02BA8L;
        long l15 = l11 ^ 0x1F1CA69E53B4L;
        long l16 = l11 ^ 0x4EAC46A60DBBL;
        long l17 = l11 ^ 0xA444A9A625BL;
        int n11 = (int)(l17 >>> 32);
        int n12 = (int)(l17 << 32 >>> 48);
        int n13 = (int)(l17 << 48 >>> 48);
        long l18 = l11 ^ 0x5F87E7BB53D6L;
        CallSite callSite = m44.a("i", (long)-8621788281115569934L, (long)l10);
        this.S = random;
        Object[] objectArray = new Object[2];
        objectArray[1] = l16;
        objectArray[0] = cf.x(n10, n11, (char)n12, (short)n13);
        this.L = m44.a("i", (Object)objectArray, (long)-8540510970281653094L, (long)l10);
        this.U = lku2;
        m44.a("j", (f)this, (long)-8524879920074786127L, (long)l10);
        CallSite callSite2 = callSite;
        int n14 = 0;
        m44.a("u", (Object)this, (lqh)new lqh(l15, n10), (long)-8170511098320475142L, (long)l10);
        zr zr2 = new zr(false);
        int n15 = 0;
        while (!zr2.S()) {
            Object object;
            block9: {
                Object object2;
                f5 f52;
                block10: {
                    block8: {
                        int n16;
                        block7: {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l12;
                            CallSite callSite3 = m44.a("h", (Object)this, (Object)objectArray2, (long)-8040755230922653966L, (long)l10);
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l18;
                            objectArray3[1] = zr2;
                            objectArray3[0] = (long)callSite3;
                            f52 = (f5)((Object)m44.a("v", (Object)lku2, (Object)objectArray3, (long)-8610584667875249405L, (long)l10));
                            try {
                                try {
                                    list.add((long)callSite3);
                                    n16 = n14;
                                    if (callSite2 == null) break block7;
                                    if (n16 != 0) break block8;
                                }
                                catch (n9 n92) {
                                    throw m44.a("i", (Object)n92, (long)-7747062123961308079L, (long)l10);
                                }
                                n16 = random.nextInt(n10 / 2);
                            }
                            catch (n9 n93) {
                                throw m44.a("i", (Object)n93, (long)-7747062123961308079L, (long)l10);
                            }
                        }
                        if (n16 != 0) break block8;
                        object2 = this;
                        n14 = 1;
                        list.add(this);
                        object = callSite2;
                        if (l10 < 0L) break block9;
                        if (object != null) break block10;
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l12;
                    CallSite callSite4 = m44.a("h", (Object)this, (Object)objectArray4, (long)-8040755230922653966L, (long)l10);
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = l18;
                    objectArray5[1] = zr2;
                    objectArray5[0] = (long)callSite4;
                    object2 = m44.a("v", (Object)lku2, (Object)objectArray5, (long)-8610584667875249405L, (long)l10);
                    list.add((long)callSite4);
                }
                Object[] objectArray6 = new Object[1];
                objectArray6[0] = l13;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)-8170511098320475142L, (long)l10), (Object)m44.a("v", (Object)f52, (Object)objectArray6, (long)-8615501475967173658L, (long)l10), (Object)f52, (Object)object2, (long)l14, (long)-7653313965674917370L, (long)l10);
                object = m44.a("w", (Object)this, (long)-7758077326451890405L, (long)l10).put(f52, object2);
            }
            lun lun2 = (lun)object;
            ++n15;
            if (callSite2 != null) continue;
        }
    }

    lqh Y(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        long l10 = ((long)n10 << 32 | (long)n11 << 32 >>> 32) ^ a;
        return m44.a("r", (Object)this, (long)3549307812734637095L, (long)l10);
    }

    @Override
    public long A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (Long)objectArray[1];
        return l10;
    }

    @Override
    public void n(Object[] objectArray) {
        block11: {
            Object[] objectArray2;
            Object object;
            long l10;
            block12: {
                long l11;
                lun lun2;
                block13: {
                    Object[] objectArray3;
                    block10: {
                        lun2 = (lun)objectArray[0];
                        l10 = (Long)objectArray[1];
                        l11 = l10 ^ 0L;
                        objectArray3 = m44.a("h", (long)-5359217087332668149L, (long)l10);
                        try {
                            try {
                                object = this;
                                if (objectArray3 == null) break block10;
                                if (object == lun2) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)-6231410397148540504L, (long)l10);
                            }
                            object = m44.a("v", (Object)this, (long)-5294171783131837107L, (long)l10);
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)-6231410397148540504L, (long)l10);
                        }
                    }
                    try {
                        block14: {
                            try {
                                try {
                                    objectArray2 = objectArray3;
                                    if (l10 <= 0L) break block12;
                                    if (objectArray2 == null) break block13;
                                    if (object != null) break block14;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)n94, (long)-6231410397148540504L, (long)l10);
                                }
                                m44.a("t", (Object)this, (lun)lun2, (long)-5294171783131837107L, (long)l10);
                                if (objectArray3 != null) break block11;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)n95, (long)-6231410397148540504L, (long)l10);
                            }
                        }
                        object = m44.a("v", (Object)this, (long)-5294171783131837107L, (long)l10);
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)n96, (long)-6231410397148540504L, (long)l10);
                    }
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l11;
                objectArray2 = objectArray4;
                objectArray4[0] = lun2;
            }
            m44.a("w", (Object)object, (Object)objectArray2, (long)-5373873608731152303L, (long)l10);
        }
    }

    static f V(Object[] objectArray) {
        Random random = (Random)objectArray[0];
        int n10 = (Integer)objectArray[1];
        List list = (List)objectArray[2];
        long l10 = (Long)objectArray[3];
        lku lku2 = (lku)objectArray[4];
        long l11 = (l10 = a ^ l10) ^ 0x1CB2F4F06872L;
        m44.a("m", null, (long)3994396826080724078L, (long)l10);
        return new f(random, n10, list, l11, lku2);
    }

    @Override
    public long M() {
        return 0L;
    }

    @Override
    public boolean Y(Object[] objectArray) {
        return false;
    }

    public Map A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("j", (Object)m44.a("t", (Object)this, (long)5311647857341922040L, (long)l10), (long)5384547694142570094L, (long)l10);
    }

    @Override
    public boolean Y(int n10, short s10, int n11, lun lun2) {
        boolean bl2;
        block12: {
            block13: {
                boolean bl3;
                block14: {
                    block15: {
                        lun lun3;
                        CallSite callSite;
                        long l10;
                        block10: {
                            block11: {
                                l10 = (long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)n11 << 48 >>> 48;
                                callSite = m44.a("h", (long)1889314222145110675L, (long)l10);
                                try {
                                    try {
                                        lun3 = this;
                                        if (callSite == null) break block10;
                                        if (lun3 != lun2) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)n92, (long)440675946011409968L, (long)l10);
                                    }
                                    return true;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)440675946011409968L, (long)l10);
                                }
                            }
                            lun3 = lun2;
                        }
                        try {
                            try {
                                try {
                                    bl2 = lun3 instanceof f;
                                    if (callSite == null) break block12;
                                    if (!bl2) break block13;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)n94, (long)440675946011409968L, (long)l10);
                                }
                                bl3 = System.identityHashCode(this) - System.identityHashCode(lun2);
                                if (callSite == null) break block14;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)n95, (long)440675946011409968L, (long)l10);
                            }
                            if (bl3 > false) break block15;
                        }
                        catch (n9 n96) {
                            throw m44.a("h", (Object)n96, (long)440675946011409968L, (long)l10);
                        }
                        bl3 = true;
                        break block14;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    private long w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x27F82E01A42DL;
        long l13 = l11 ^ 0x535B7B4A49C7L;
        long l14 = l11 ^ 0x79F010C98BF5L;
        int n10 = ((Random)((Object)m44.a("p", (Object)this, (long)-2645598318929977716L, (long)l10))).nextInt((int)f.a("c", (int)5283, (long)(0x2738D8142916979AL ^ l10)));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l14;
        CallSite callSite = m44.a("q", (Object)m44.a("p", (Object)this, (long)-4454549101197115111L, (long)l10), (Object)objectArray2, (long)-2470649946449684598L, (long)l10);
        int n11 = ((Random)((Object)m44.a("p", (Object)this, (long)-2645598318929977716L, (long)l10))).nextInt((int)f.a("c", (int)28622, (long)(0x4DECE663CA446CF6L ^ l10)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = m44.a("q", (Object)m44.a("p", (Object)this, (long)-4454549101197115111L, (long)l10), (Object)objectArray3, (long)-2604312143017585989L, (long)l10);
        objectArray4[3] = n11;
        objectArray4[2] = l13;
        objectArray4[1] = (long)callSite;
        objectArray4[0] = n10;
        return (long)m44.a("n", (Object)objectArray4, (long)-4547077682292009119L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a(-2329477946324723277L, 5813065597629915355L, MethodHandles.lookup().lookupClass()).a(112149215160217L);
        d = new HashMap(13);
        long l10 = a ^ 0x72A8062C3A01L;
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
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00d0\u0093\u00b9\u0090*O\b\u00c3\u00d2F\u00b27\u0095\u00c9Ff";
        int n11 = "\u00d0\u0093\u00b9\u0090*O\b\u00c3\u00d2F\u00b27\u0095\u00c9Ff".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x55F8;
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
                throw new RuntimeException("com/zelix/f", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = f.a(n10, l10);
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

