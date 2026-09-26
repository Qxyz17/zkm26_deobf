/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class re {
    private Set y;
    private int W;
    private int U;
    private int n;
    private Object[] q;
    private static final long a = prr.a((long)5084930996272871524L, (long)-7383284491558929002L, MethodHandles.lookup().lookupClass()).a(89409425527893L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public re(long l, int n) {
        block4: {
            int n2;
            int n3;
            int n4;
            long l2;
            block5: {
                long l3 = l = a ^ l;
                l2 = l3 ^ 0x21E7A6243FD4L;
                long l4 = l3 ^ 0x683972431FAEL;
                n4 = (int)(l4 >>> 32);
                n3 = (int)(l4 << 32 >>> 48);
                n2 = (int)(l4 << 48 >>> 48);
                CallSite callSite = m44.a("l", (long)-679401052964263772L, (long)l);
                this.W = 0;
                CallSite callSite2 = callSite;
                try {
                    try {
                        this.U = 0;
                        this.n = 0;
                        if (callSite2 != null) break block4;
                        if (n > 1) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-588385373005643321L, (long)l);
                    }
                    throw new IllegalArgumentException((String)((Object)re.a("u", (int)11386, (long)(0x7147702B61051A86L ^ l))) + n);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-588385373005643321L, (long)l);
                }
            }
            this.q = new Object[n];
            Object[] objectArray = new Object[2];
            objectArray[1] = l2;
            objectArray[0] = cf.x((int)n, (int)n4, (char)((char)n3), (short)((short)n2));
            this.y = m44.a("l", (Object)objectArray, (long)-876169249146870625L, (long)l);
        }
    }

    public int F(Object[] objectArray) {
        return this.n;
    }

    private void u(Object[] objectArray) {
        block6: {
            long l = (Long)objectArray[0];
            l = a ^ l;
            int n = this.q.length;
            Object[] objectArray2 = new Object[n * 2];
            CallSite callSite = m44.a("j", (long)4576873330893660594L, (long)l);
            int n2 = 0;
            block2: while (n2 < this.n) {
                int n3 = (this.W + n2) % n;
                try {
                    objectArray2[n2] = this.q[n3];
                    ++n2;
                    do {
                        CallSite callSite2 = callSite;
                        if (l > 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l < 0L);
                    break;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)4522661598017308881L, (long)l);
                }
            }
            this.W = 0;
            this.U = this.n;
            this.q = objectArray2;
        }
    }

    public Object e(int n, char c, short s) {
        int n2;
        block4: {
            block5: {
                long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
                CallSite callSite = m44.a("k", (long)-8023914320101863789L, (long)l);
                try {
                    try {
                        n2 = this.n;
                        if (callSite != null) break block4;
                        if (n2 != 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-7934569890305284112L, (long)l);
                    }
                    throw new n9((String)((Object)re.a("u", (int)14597, (long)(0x72AD6792F9A5E9CFL ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-7934569890305284112L, (long)l);
                }
            }
            n2 = this.q.length;
        }
        int n3 = n2;
        Object object = this.q[this.W];
        this.W = (this.W + 1) % n3;
        --this.n;
        this.y.remove(object);
        return object;
    }

    public boolean f(Object[] objectArray) {
        Object object = objectArray[0];
        return this.y.contains(object);
    }

    public re(byte by, long l) {
        long l2 = ((long)by << 56 | l << 8 >>> 8) ^ a;
        long l3 = l2 ^ 0xE525A61D081L;
        this(l3, (int)re.b("m", (int)1029, (long)(0x3854E533A38ECE2DL ^ l2)));
    }

    /*
     * Unable to fully structure code
     */
    public void n(Object[] var1_1) {
        var4_2 = (Enumeration)var1_1[0];
        var2_3 = (Long)var1_1[1];
        var5_4 = (var2_3 = re.a ^ var2_3) ^ 133291556541137L;
        var7_5 = m44.a("o", (long)734451510341997575L, (long)var2_3);
        while (var4_2.hasMoreElements()) {
            this.I(var4_2.nextElement(), var5_4);
lbl10:
            // 2 sources

            ** while (var7_5 != null)
lbl11:
            // 1 sources

        }
lbl12:
        // 2 sources

        if (var2_3 < 0L) ** GOTO lbl10
    }

    public boolean d(long l) {
        boolean bl;
        block2: {
            block3: {
                l = a ^ l;
                CallSite callSite = m44.a("m", (long)-8242910716706450515L, (long)l);
                try {
                    bl = this.n;
                    if (callSite != null) break block2;
                    if (bl) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-8296573167274755378L, (long)l);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        Object object;
        block2: {
            long l = a ^ 0x2BB64EC3B95EL;
            int n = 1;
            int n2 = this.q.length;
            CallSite callSite = m44.a("i", (long)7881110970340832105L, (long)l);
            for (int i = 0; i < this.n; ++i) {
                int n3 = (this.W + i) % n2;
                object = re.b("m", (int)14009, (long)(0x7739724D75526D9CL ^ l)) * n + this.q[n3].hashCode();
                if (callSite == null) {
                    n = object;
                    if (callSite == null) continue;
                }
                break block2;
            }
            object = n;
        }
        return object;
    }

    public void Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x615D7DFE5B05L;
        Iterator iterator = collection.iterator();
        CallSite callSite = m44.a("k", (long)4892408545937481171L, (long)l);
        while (iterator.hasNext()) {
            Object e = iterator.next();
            this.I(e, l2);
            if (callSite == null) continue;
        }
    }

    public boolean I(Object object, long l) {
        int n;
        block8: {
            int n2;
            block9: {
                int n3;
                CallSite callSite;
                long l2;
                block6: {
                    block7: {
                        l2 = (l = a ^ l) ^ 0x60F034AE2764L;
                        callSite = m44.a("n", (long)-4422412213177557866L, (long)l);
                        try {
                            try {
                                n3 = this.y.add(object);
                                if (callSite != null) break block6;
                                if (n3 != 0) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("n", (Object)illegalArgumentException, (long)-4330345952816876043L, (long)l);
                            }
                            return false;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("n", (Object)illegalArgumentException, (long)-4330345952816876043L, (long)l);
                        }
                    }
                    n3 = this.q.length;
                }
                n2 = n3;
                try {
                    n = this.n;
                    if (callSite != null) break block8;
                    if (n != n2) break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-4330345952816876043L, (long)l);
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                m44.a("o", (Object)this, (Object)objectArray, (long)-4159094154967085147L, (long)l);
                n2 = this.q.length;
            }
            this.q[this.U] = object;
            this.U = (this.U + 1) % n2;
            ++this.n;
            n = 1;
        }
        return n != 0;
    }

    public boolean equals(Object object) {
        boolean bl;
        block19: {
            block20: {
                boolean bl2;
                block24: {
                    int n;
                    re re2;
                    CallSite callSite;
                    long l;
                    block21: {
                        block22: {
                            Object object2;
                            block17: {
                                block18: {
                                    l = a ^ 0x212EA7915B00L;
                                    callSite = m44.a("o", (long)-8142123078042021577L, (long)l);
                                    try {
                                        try {
                                            object2 = object;
                                            if (callSite != null) break block17;
                                            if (object2 != this) break block18;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("o", (Object)illegalArgumentException, (long)-8194663484253472684L, (long)l);
                                        }
                                        return true;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("o", (Object)illegalArgumentException, (long)-8194663484253472684L, (long)l);
                                    }
                                }
                                object2 = object;
                            }
                            try {
                                bl = object2 instanceof re;
                                if (callSite != null) break block19;
                                if (!bl) break block20;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("o", (Object)illegalArgumentException, (long)-8194663484253472684L, (long)l);
                            }
                            re2 = (re)object;
                            try {
                                try {
                                    n = this.n;
                                    if (callSite != null) break block21;
                                    if (n == re2.n) break block22;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("o", (Object)illegalArgumentException, (long)-8194663484253472684L, (long)l);
                                }
                                return false;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("o", (Object)illegalArgumentException, (long)-8194663484253472684L, (long)l);
                            }
                        }
                        n = this.q.length;
                    }
                    int n2 = n;
                    int n3 = re2.q.length;
                    int n4 = 0;
                    while (n4 < this.n) {
                        block23: {
                            block25: {
                                int n5 = (this.W + n4) % n2;
                                int n6 = (re2.W + n4) % n3;
                                try {
                                    try {
                                        try {
                                            if (callSite != null) break block23;
                                            bl2 = this.q[n5].equals(re2.q[n6]);
                                            if (callSite != null) break block24;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("o", (Object)illegalArgumentException, (long)-8194663484253472684L, (long)l);
                                        }
                                        if (bl2) break block25;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("o", (Object)illegalArgumentException, (long)-8194663484253472684L, (long)l);
                                    }
                                    return false;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("o", (Object)illegalArgumentException, (long)-8194663484253472684L, (long)l);
                                }
                            }
                            ++n4;
                        }
                        if (callSite == null) continue;
                    }
                    bl2 = true;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x857C41E964BL;
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
        String string = "r\u00da\u00f9\u00be\u00eb\u008b\u00e9c\u00ca\u001c\u00e5\u00ce\u0016\u00bb8\u00e0N\u00c3^ U\u00d0\rO;kW\u00b9\u009f\u0016\u00b5\u00b9\u00f7\u00f9\u00ec@\u00b7\u00b1r\u00aap\u00d4w_~\u00ce9\u0088\u000f\u00bdgygWx\n\u001e$\t\u00cd\u00d6\u00b3At\u00dc\u00c4'\u0015aW8_\u0018*\u00df\u0013\u0002k;\u0099\u00d5e\u009c\u00daK5@\u00d4\u00e8]\u00e6j\u0019HeT:";
        int n2 = "r\u00da\u00f9\u00be\u00eb\u008b\u00e9c\u00ca\u001c\u00e5\u00ce\u0016\u00bb8\u00e0N\u00c3^ U\u00d0\rO;kW\u00b9\u009f\u0016\u00b5\u00b9\u00f7\u00f9\u00ec@\u00b7\u00b1r\u00aap\u00d4w_~\u00ce9\u0088\u000f\u00bdgygWx\n\u001e$\t\u00cd\u00d6\u00b3At\u00dc\u00c4'\u0015aW8_\u0018*\u00df\u0013\u0002k;\u0099\u00d5e\u009c\u00daK5@\u00d4\u00e8]\u00e6j\u0019HeT:".length();
        int n3 = 72;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = re.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        c = new String[2];
        g = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "$\u00aaD\u00dcc\u00eb\u0002\u0098\u00c2k$\u009cL\u00a3\u0011[";
        int n7 = "$\u00aaD\u00dcc\u00eb\u0002\u0098\u00c2k$\u009cL\u00a3\u0011[".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n10 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n10] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        e = lArray;
        f = new Integer[2];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4E2F;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/re", exception);
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
            re.c[n2] = re.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = re.a(n, l);
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
            throw new RuntimeException("com/zelix/re" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x383A;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/re", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            re.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = re.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/re" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(re.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(re.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
