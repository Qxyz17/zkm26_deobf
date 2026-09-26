/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.lang.ref.SoftReference;
import java.security.Key;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class nr
implements Map {
    private SoftReference U;
    private PrintWriter[] N;
    private int B;
    private String J;
    private static final long a = prr.a((long)1801558322325492046L, (long)-7845138549360953863L, MethodHandles.lookup().lookupClass()).a(221061677227859L);
    private static final String b;
    private static final long c;

    public synchronized Object put(Object object, Object object2) {
        long l = a ^ 0xF053A66AD8L;
        long l2 = l ^ 0x15E09ACA2667L;
        Object object3 = (Map)this.U.get();
        if (object3 == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            object3 = m44.a("k", (Object)this, (Object)objectArray, (long)7507969734897916167L, (long)l);
        }
        return object3.put(object, object2);
    }

    @Override
    public synchronized int size() {
        Map map;
        block2: {
            Object object;
            block3: {
                long l = a ^ 0x42C09C764FA0L;
                long l2 = l ^ 0x57D0551A031FL;
                object = (Map)this.U.get();
                CallSite callSite = m44.a("j", (long)5655415627130294346L, (long)l);
                try {
                    map = object;
                    if (callSite != null) break block2;
                    if (map != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)5762864954311978989L, (long)l);
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                object = m44.a("k", (Object)this, (Object)objectArray, (long)5569238055625784447L, (long)l);
            }
            map = object;
        }
        return map.size();
    }

    public nr(short s, String string, int n, long l) {
        long l2 = ((long)s << 48 | l << 16 >>> 16) ^ a;
        long l3 = l2 ^ 0xD59B2151470L;
        m44.a("s", (Object)this, (int)n, (long)921342104477537834L, (long)l2);
        m44.a("s", (Object)this, (String)string, (long)847535555625017921L, (long)l2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("n", (Object)this, (Object)objectArray, (long)1488974846328242441L, (long)l2);
    }

    @Override
    public synchronized boolean containsValue(Object object) {
        Map map;
        long l;
        block4: {
            Map map2;
            block5: {
                l = a ^ 0x7214CF5EF1AAL;
                long l2 = l ^ 0x67040632BD15L;
                map2 = (Map)this.U.get();
                CallSite callSite = m44.a("h", (long)-1119669692590199232L, (long)l);
                try {
                    try {
                        map = map2;
                        if (callSite != null) break block4;
                        if (map != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-1012184081590873625L, (long)l);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l2;
                    m44.a("i", (Object)this, (Object)objectArray, (long)-917652037523357067L, (long)l);
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-1012184081590873625L, (long)l);
                }
            }
            map = map2;
        }
        return (boolean)m44.a("w", (Object)map, (Object)object, (long)-1536233427804153307L, (long)l);
    }

    public synchronized Set entrySet() {
        Map map;
        long l;
        block4: {
            Map map2;
            block5: {
                long l2 = l = a ^ 0xF93FD87A3F4L;
                long l3 = l2 ^ 0x1A8334EBEF4BL;
                long l4 = l2 ^ 0x328C350B11D1L;
                map2 = (Map)this.U.get();
                CallSite callSite = m44.a("n", (long)-6762049424924689378L, (long)l);
                try {
                    try {
                        map = map2;
                        if (callSite != null) break block4;
                        if (map != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-6652517622721952839L, (long)l);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    m44.a("o", (Object)this, (Object)objectArray, (long)-6837126336728231893L, (long)l);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l4;
                    return m44.a("n", (Object)m44.a("n", (Object)objectArray2, (long)-4758623211676515210L, (long)l), (long)-6346290266823461439L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-6652517622721952839L, (long)l);
                }
            }
            map = map2;
        }
        return m44.a("n", map.entrySet(), (long)-6346290266823461439L, (long)l);
    }

    public synchronized Collection values() {
        Map map;
        long l;
        block4: {
            Map map2;
            block5: {
                long l2 = l = a ^ 0x966C0E864D2L;
                long l3 = l2 ^ 0x1C760984286DL;
                long l4 = l2 ^ 0x34790864D6F7L;
                map2 = (Map)this.U.get();
                CallSite callSite = m44.a("h", (long)7281855687730494264L, (long)l);
                try {
                    try {
                        map = map2;
                        if (callSite != null) break block4;
                        if (map != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)7245030122771580063L, (long)l);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    m44.a("i", (Object)this, (Object)objectArray, (long)7366661005469243149L, (long)l);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l4;
                    return m44.a("h", (Object)m44.a("h", (Object)objectArray2, (long)8850698701777666896L, (long)l), (long)6974796357963363047L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)7245030122771580063L, (long)l);
                }
            }
            map = map2;
        }
        return m44.a("h", map.values(), (long)9032737011916696345L, (long)l);
    }

    public synchronized void putAll(Map map) {
        Map map2;
        long l;
        block2: {
            Object object;
            block3: {
                l = a ^ 0x665260C66E0AL;
                long l2 = l ^ 0x7342A9AA22B5L;
                object = (Map)this.U.get();
                CallSite callSite = m44.a("h", (long)8058688087397200352L, (long)l);
                try {
                    map2 = object;
                    if (callSite != null) break block2;
                    if (map2 != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)7949956935881592391L, (long)l);
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                object = m44.a("i", (Object)this, (Object)objectArray, (long)7846339361470242261L, (long)l);
            }
            map2 = object;
        }
        m44.a("w", (Object)map2, (Object)map, (long)7735145002870179615L, (long)l);
    }

    public nr(String string, long l) {
        long l2 = (l = a ^ l) ^ 0x5BBC013EC867L;
        int n = (int)(l2 >>> 48);
        long l3 = l2 << 16 >>> 16;
        this((short)n, string, (int)c, l3);
    }

    @Override
    public synchronized boolean isEmpty() {
        Map map;
        long l;
        block2: {
            Object object;
            block3: {
                l = a ^ 0x77A2AAF59297L;
                long l2 = l ^ 0x62B26399DE28L;
                object = (Map)this.U.get();
                CallSite callSite = m44.a("m", (long)-7833123220792767107L, (long)l);
                try {
                    map = object;
                    if (callSite != null) break block2;
                    if (map != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)((Object)n92), (long)-7868076317515451686L, (long)l);
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                object = m44.a("l", (Object)this, (Object)objectArray, (long)-8034740717858676408L, (long)l);
            }
            map = object;
        }
        return (boolean)m44.a("r", (Object)map, (long)-8013781475703638904L, (long)l);
    }

    public synchronized Object get(Object object) {
        long l = a ^ 0x393EC3BF3AF2L;
        long l2 = l ^ 0x2C2E0AD3764DL;
        Object object2 = (Map)this.U.get();
        if (object2 == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            object2 = m44.a("i", (Object)this, (Object)objectArray, (long)4042987266193230125L, (long)l);
        }
        return object2.get(object);
    }

    @Override
    public synchronized void clear() {
        Map map;
        block2: {
            Object object;
            block3: {
                long l = a ^ 0x2894ABCDC709L;
                long l2 = l ^ 0x3D8462A18BB6L;
                object = (Map)this.U.get();
                CallSite callSite = m44.a("k", (long)-4119253412100384541L, (long)l);
                try {
                    map = object;
                    if (callSite != null) break block2;
                    if (map != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)((Object)n92), (long)-4084582958652217532L, (long)l);
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                object = m44.a("j", (Object)this, (Object)objectArray, (long)-4188203801836849962L, (long)l);
            }
            map = object;
        }
        map.clear();
    }

    public synchronized Set keySet() {
        Map map;
        long l;
        block4: {
            Map map2;
            block5: {
                long l2 = l = a ^ 0x62B05AD76EA0L;
                long l3 = l2 ^ 0x77A093BB221FL;
                long l4 = l2 ^ 0x5FAF925BDC85L;
                map2 = (Map)this.U.get();
                CallSite callSite = m44.a("j", (long)8033351894827692362L, (long)l);
                try {
                    try {
                        map = map2;
                        if (callSite != null) break block4;
                        if (map != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)7996685758988619501L, (long)l);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    m44.a("k", (Object)this, (Object)objectArray, (long)7802988770592578943L, (long)l);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l4;
                    return m44.a("j", (Object)m44.a("j", (Object)objectArray2, (long)8115931028096747810L, (long)l), (long)7690212490426661013L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)7996685758988619501L, (long)l);
                }
            }
            map = map2;
        }
        return m44.a("j", map.keySet(), (long)7690212490426661013L, (long)l);
    }

    public synchronized Object remove(Object object) {
        Map map;
        block2: {
            Object object2;
            block3: {
                long l = a ^ 0x33FF19C67D82L;
                long l2 = l ^ 0x26EFD0AA313DL;
                object2 = (Map)this.U.get();
                CallSite callSite = m44.a("h", (long)8961709929467175528L, (long)l);
                try {
                    map = object2;
                    if (callSite != null) break block2;
                    if (map != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)9069051298348801487L, (long)l);
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                object2 = m44.a("i", (Object)this, (Object)objectArray, (long)9181601309375680093L, (long)l);
            }
            map = object2.remove(object);
        }
        return map;
    }

    private Map B(Object[] objectArray) {
        Map map;
        block5: {
            long l = (Long)objectArray[0];
            long l2 = (l = a ^ l) ^ 0x68CB087340FFL;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            m44.a("i", (Object)this, (Object)objectArray2, (long)4622526281278641542L, (long)l);
            Map map2 = (Map)this.U.get();
            if (m44.a("v", (Object)this, (long)5104145023441450881L, (long)l) != null) {
                try {
                    for (int i = 0; i < ((CallSite)m44.a("v", (Object)this, (long)5104145023441450881L, (long)l)).length; ++i) {
                        ((PrintWriter)((Object)m44.a("v", (Object)this, (long)5104145023441450881L, (long)l)[i])).println((String)((Object)m44.a("v", (Object)this, (long)6866978475189515982L, (long)l)) + b);
                        map = this;
                        if (l > 0L) {
                            m44.a("w", (Object)m44.a("v", (Object)map, (long)5104145023441450881L, (long)l)[i], (long)6725401615005913528L, (long)l);
                            continue;
                        }
                        break block5;
                    }
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)4862738449889764207L, (long)l);
                }
            }
            map = map2;
        }
        return map;
    }

    private void H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x491131548B40L;
        long l4 = l2 ^ 0xDF93D68E4A0L;
        int n = (int)(l4 >>> 32);
        int n2 = (int)(l4 << 32 >>> 48);
        int n3 = (int)(l4 << 48 >>> 48);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = cf.x((int)m44.a("t", (Object)this, (long)1667524512233655751L, (long)l), (int)n, (char)((char)n2), (short)((short)n3));
        this.U = new SoftReference<CallSite>(m44.a("j", (Object)objectArray2, (long)1117179924398705249L, (long)l));
    }

    @Override
    public synchronized boolean containsKey(Object object) {
        Map map;
        block4: {
            Map map2;
            block5: {
                long l = a ^ 0x28ED8E0D139DL;
                long l2 = l ^ 0x3DFD47615F22L;
                map2 = (Map)this.U.get();
                CallSite callSite = m44.a("o", (long)1315465201372367991L, (long)l);
                try {
                    try {
                        map = map2;
                        if (callSite != null) break block4;
                        if (map != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)1424444842513757136L, (long)l);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l2;
                    m44.a("n", (Object)this, (Object)objectArray, (long)1257773872083771458L, (long)l);
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)1424444842513757136L, (long)l);
                }
            }
            map = map2;
        }
        return map.containsKey(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x7375B151E0ABL;
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
        byte[] byArray3 = cipher.doFinal("\u00c1+\u00deT,\u00a8\u00d8\u00e5\u00c3I&\u00f6_\t\f\u00b6\u0002h\u008b\u00f4\u00d6c1\u00e0\u008a0\u00d4\u00cd\"\u00a8\u00f2D`\u00denK\u00ffIs^".getBytes("ISO-8859-1"));
        b = nr.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -8725069770927305046L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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
}
