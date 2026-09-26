/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.gk;
import com.zelix.gv;
import com.zelix.lol;
import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g1
implements Serializable,
Map {
    private List k;
    private Map Q;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     */
    public synchronized Object put(Object var1_1, Object var2_2) {
        block6: {
            block5: {
                var3_3 = g1.a ^ 13180026544799L;
                v0 = var3_3 ^ 116015501861064L;
                var5_4 = (int)(v0 >>> 32);
                var6_5 = v0 << 32 >>> 32;
                var9_6 = null;
                var10_7 = (lq0)m44.a("t", (Object)this, (long)7654307961249076569L, (long)var3_3).get(var1_1);
                var8_8 = m44.a("j", (long)7722614236767024410L, (long)var3_3);
                try {
                    v1 = var10_7;
                    if (var8_8 != null) break block5;
                    if (v1 == null) {
                    }
                    ** GOTO lbl25
                }
                catch (IllegalArgumentException v2) {
                    throw m44.a("j", (Object)v2, (long)8199257650217831755L, (long)var3_3);
                }
                var10_7 = new lq0(var1_1, var5_4, var6_5, var2_2);
                try {
                    m44.a("t", (Object)this, (long)7654307961249076569L, (long)var3_3).put(var1_1, var10_7);
                    m44.a("t", (Object)this, (long)7581299625385343289L, (long)var3_3).add(var10_7);
                    if (var8_8 == null) break block6;
lbl25:
                    // 2 sources

                    v1 = m44.a("u", (Object)var10_7, (Object)new Object[]{var2_2}, (long)7514212301670185227L, (long)var3_3);
                }
                catch (IllegalArgumentException v3) {
                    throw m44.a("j", (Object)v3, (long)8199257650217831755L, (long)var3_3);
                }
            }
            var9_6 = v1;
        }
        return var9_6;
    }

    public synchronized void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        long l10 = a ^ 0x29140008784BL;
        return (boolean)m44.a("q", (Object)m44.a("p", (Object)this, (long)-1086015801662206067L, (long)l10), (long)-974345931530480069L, (long)l10);
    }

    public synchronized Enumeration J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x23B071638330L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return Collections.enumeration(m44.a("j", (Object)this, (Object)objectArray2, (long)-3496969412664618317L, (long)l10));
    }

    public g1(int n10, long l10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0xF9C11015FE6L;
        long l13 = l11 ^ 0x4B741D3D3006L;
        int n11 = (int)(l13 >>> 32);
        int n12 = (int)(l13 << 32 >>> 48);
        int n13 = (int)(l13 << 48 >>> 48);
        Object[] objectArray = new Object[2];
        objectArray[1] = l12;
        objectArray[0] = cf.x(n10, n11, (char)n12, (short)n13);
        m44.a("p", (Object)this, (Map)((Object)m44.a("l", (Object)objectArray, (long)-2655079006353858873L, (long)l10)), (long)-2868855459289585841L, (long)l10);
        m44.a("p", (Object)this, new ArrayList(n10), (long)-2656991331807818961L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public synchronized Object R(Object[] var1_1) {
        block20: {
            block22: {
                block21: {
                    block19: {
                        block17: {
                            block18: {
                                block16: {
                                    var4_2 = (Integer)var1_1[0];
                                    var3_3 = (Integer)var1_1[1];
                                    var2_4 = (Integer)var1_1[2];
                                    var7_5 = (Integer)var1_1[3];
                                    var5_6 = var1_1[4];
                                    var6_7 = var1_1[5];
                                    var8_8 = ((long)var3_3 << 48 | (long)var2_4 << 32 >>> 16 | (long)var7_5 << 48 >>> 48) ^ g1.a;
                                    v0 = var8_8 ^ 84797381612561L;
                                    var10_9 = (int)(v0 >>> 32);
                                    var11_10 = v0 << 32 >>> 32;
                                    var13_11 = m44.a("k", (long)-6920598692494409277L, (long)var8_8);
                                    try {
                                        v1 = var4_2;
                                        if (var13_11 != null) break block16;
                                        if (v1 >= 0) {
                                        }
                                        ** GOTO lbl35
                                    }
                                    catch (IllegalArgumentException v2) {
                                        throw m44.a("k", (Object)v2, (long)-8858375989212038766L, (long)var8_8);
                                    }
                                    v1 = var4_2;
                                }
                                try {
                                    try {
                                        v3 = var13_11;
                                        if (var7_5 >= 0) {
                                            if (v3 != null) break block17;
                                            if (v1 < m44.a("u", (Object)this, (long)-7066416873135616544L, (long)var8_8).size()) break block18;
                                        }
                                        ** GOTO lbl46
                                    }
                                    catch (IllegalArgumentException v4) {
                                        throw m44.a("k", (Object)v4, (long)-8858375989212038766L, (long)var8_8);
                                    }
lbl35:
                                    // 2 sources

                                    throw new IllegalArgumentException((String)g1.a("m", (int)25888, (long)(3149018305710351953L ^ var8_8)) + var4_2 + (String)g1.a("m", (int)21015, (long)(8460751108544024935L ^ var8_8)) + m44.a("u", (Object)this, (long)-7066416873135616544L, (long)var8_8).size());
                                }
                                catch (IllegalArgumentException v5) {
                                    throw m44.a("k", (Object)v5, (long)-8858375989212038766L, (long)var8_8);
                                }
                            }
                            v1 = (int)m44.a("u", (Object)this, (long)-6998395815211572864L, (long)var8_8).containsKey(var5_6);
                        }
                        try {
                            try {
                                try {
                                    if (var7_5 < 0) break block19;
                                    v3 = var13_11;
lbl46:
                                    // 2 sources

                                    if (v3 != null) break block19;
                                    if (v1 == 0) break block20;
                                }
                                catch (IllegalArgumentException v6) {
                                    throw m44.a("k", (Object)v6, (long)-8858375989212038766L, (long)var8_8);
                                }
                                v7 = (lq0)m44.a("u", (Object)this, (long)-6998395815211572864L, (long)var8_8).get(var5_6);
                                if (var13_11 != null) break block21;
                            }
                            catch (IllegalArgumentException v8) {
                                throw m44.a("k", (Object)v8, (long)-8858375989212038766L, (long)var8_8);
                            }
                            v1 = (int)v7.equals(m44.a("u", (Object)this, (long)-7066416873135616544L, (long)var8_8).get(var4_2));
                        }
                        catch (IllegalArgumentException v9) {
                            throw m44.a("k", (Object)v9, (long)-8858375989212038766L, (long)var8_8);
                        }
                    }
                    try {
                        if (v1 == 0) break block22;
                        v7 = ((lq0)m44.a("u", (Object)this, (long)-7066416873135616544L, (long)var8_8).get(var4_2)).D();
                    }
                    catch (IllegalArgumentException v10) {
                        throw m44.a("k", (Object)v10, (long)-8858375989212038766L, (long)var8_8);
                    }
                }
                return v7;
            }
            throw new IllegalArgumentException("'" + var5_6 + (String)g1.a("m", (int)10194, (long)(3995809977050932385L ^ var8_8)));
        }
        var14_12 = new lq0(var5_6, var10_9, var11_10, var6_7);
        var15_13 = m44.a("u", (Object)this, (long)-7066416873135616544L, (long)var8_8).set(var4_2, var14_12);
        var16_14 = (lq0)m44.a("u", (Object)this, (long)-6998395815211572864L, (long)var8_8).remove(var15_13.S());
        m44.a("u", (Object)this, (long)-6998395815211572864L, (long)var8_8).put(var5_6, var14_12);
        return var16_14.D();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List s(Object[] objectArray) {
        ArrayList<Object> arrayList;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int n10 = m44.a("r", (Object)this, (long)698115005809580479L, (long)l10).size();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        CallSite callSite = m44.a("l", (long)840520060901266844L, (long)l10);
        block2: for (int i10 = 0; i10 < n10; ++i10) {
            lq0 lq02 = (lq0)m44.a("r", (Object)this, (long)698115005809580479L, (long)l10).get(i10);
            try {
                do {
                    arrayList = arrayList2;
                    Object object = callSite;
                    if (l10 > 0L) {
                        if (object != null) return arrayList;
                        object = lq02.D();
                    }
                    arrayList.add(object);
                    if (callSite == null) continue block2;
                } while (l10 < 0L);
                break;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("l", (Object)illegalArgumentException, (long)1247357826165124557L, (long)l10);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    @Override
    public synchronized boolean containsKey(Object object) {
        long l10 = a ^ 0x67A619B8CD96L;
        return m44.a("u", (Object)this, (long)4985762774841178704L, (long)l10).containsKey(object);
    }

    @Override
    public synchronized void clear() {
        long l10 = a ^ 0x336DEDFF7122L;
        m44.a("q", (Object)this, (long)-467063640097192220L, (long)l10).clear();
        m44.a("q", (Object)this, (long)-393194949394912636L, (long)l10).clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized Object k(Object[] objectArray) {
        int n10;
        int n11;
        long l10;
        block5: {
            l10 = (Long)objectArray[0];
            n11 = (Integer)objectArray[1];
            l10 = a ^ l10;
            CallSite callSite = m44.a("j", (long)2108859868789474162L, (long)l10);
            try {
                n10 = n11;
                if (callSite != null) break block5;
                if (n10 < 0) throw new IllegalArgumentException((String)((Object)g1.a("m", (int)5350, (long)(0x463B1266BE6B9525L ^ l10))) + n11 + (String)((Object)g1.a("m", (int)2635, (long)(0x7EF1DEBD2ADC0B8DL ^ l10))) + m44.a("t", (Object)this, (long)2260313934814531409L, (long)l10).size());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("j", (Object)illegalArgumentException, (long)549875935008668451L, (long)l10);
            }
            n10 = n11;
        }
        try {
            if (n10 >= m44.a("t", (Object)this, (long)2260313934814531409L, (long)l10).size()) {
                throw new IllegalArgumentException((String)((Object)g1.a("m", (int)5350, (long)(0x463B1266BE6B9525L ^ l10))) + n11 + (String)((Object)g1.a("m", (int)2635, (long)(0x7EF1DEBD2ADC0B8DL ^ l10))) + m44.a("t", (Object)this, (long)2260313934814531409L, (long)l10).size());
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("j", (Object)illegalArgumentException, (long)549875935008668451L, (long)l10);
        }
        lq0 lq02 = (lq0)m44.a("t", (Object)this, (long)2260313934814531409L, (long)l10).get(n11);
        return lq02.S();
    }

    @Override
    public int size() {
        long l10 = a ^ 0x67396A6FB89AL;
        return m44.a("q", (Object)this, (long)3689366265916711740L, (long)l10).size();
    }

    public g1(short s10, char c10, int n10) {
        long l10 = ((long)s10 << 48 | (long)c10 << 48 >>> 16 | (long)n10 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x7707D9B80A6FL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("v", (Object)this, (Map)((Object)m44.a("j", (Object)objectArray, (long)-1293673406410355991L, (long)l10)), (long)-1262776878786178791L, (long)l10);
        m44.a("v", (Object)this, new ArrayList(), (long)-1335871167155094151L, (long)l10);
    }

    public synchronized Set entrySet() {
        long l10;
        long l11 = l10 = a ^ 0x328379B67348L;
        long l12 = l11 ^ 0x20B5AF0F4CC2L;
        long l13 = l11 ^ 0x59DC433EB33L;
        int n10 = (int)(l13 >>> 32);
        int n11 = (int)(l13 << 32 >>> 40);
        int n12 = (int)(l13 << 56 >>> 56);
        long l14 = l11 ^ 0x22AB9706C6BDL;
        ArrayList<lol> arrayList = new ArrayList<lol>();
        Iterator iterator = m44.a("s", (Object)this, (long)-513103970430899986L, (long)l10).iterator();
        CallSite callSite = m44.a("m", (long)-361689003006237491L, (long)l10);
        while (iterator.hasNext()) {
            lq0 lq02 = (lq0)iterator.next();
            arrayList.add(new lol(l12, lq02));
            if (callSite == null) continue;
        }
        gv gv2 = new gv(arrayList, l14);
        return new gk(n10, gv2, n11, (byte)n12);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized Object j(Object[] objectArray) {
        int n10;
        int n11;
        long l10;
        block5: {
            l10 = (Long)objectArray[0];
            n11 = (Integer)objectArray[1];
            l10 = a ^ l10;
            CallSite callSite = m44.a("k", (long)-1205517596938735245L, (long)l10);
            try {
                n10 = n11;
                if (callSite != null) break block5;
                if (n10 < 0) throw new IllegalArgumentException((String)((Object)g1.a("m", (int)25888, (long)(0x2BB3B370FC3C16E1L ^ l10))) + n11 + (String)((Object)g1.a("m", (int)21015, (long)(0x756A9C4866EF21D7L ^ l10))) + m44.a("u", (Object)this, (long)-1342293359632204464L, (long)l10).size());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("k", (Object)illegalArgumentException, (long)-747450209104574174L, (long)l10);
            }
            n10 = n11;
        }
        try {
            if (n10 >= m44.a("u", (Object)this, (long)-1342293359632204464L, (long)l10).size()) {
                throw new IllegalArgumentException((String)((Object)g1.a("m", (int)25888, (long)(0x2BB3B370FC3C16E1L ^ l10))) + n11 + (String)((Object)g1.a("m", (int)21015, (long)(0x756A9C4866EF21D7L ^ l10))) + m44.a("u", (Object)this, (long)-1342293359632204464L, (long)l10).size());
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("k", (Object)illegalArgumentException, (long)-747450209104574174L, (long)l10);
        }
        lq0 lq02 = (lq0)m44.a("u", (Object)this, (long)-1342293359632204464L, (long)l10).remove(n11);
        lq0 lq03 = (lq0)m44.a("u", (Object)this, (long)-1274369075877342928L, (long)l10).remove(lq02.S());
        return lq03.D();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List V(Object[] objectArray) {
        ArrayList<Object> arrayList;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int n10 = m44.a("w", (Object)this, (long)-3664403983875662550L, (long)l10).size();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        CallSite callSite = m44.a("i", (long)-3512956619108724471L, (long)l10);
        block2: for (int i10 = 0; i10 < n10; ++i10) {
            lq0 lq02 = (lq0)m44.a("w", (Object)this, (long)-3664403983875662550L, (long)l10).get(i10);
            try {
                do {
                    arrayList = arrayList2;
                    Object object = callSite;
                    if (l10 >= 0L) {
                        if (object != null) return arrayList;
                        object = lq02.S();
                    }
                    arrayList.add(object);
                    if (callSite == null) continue block2;
                } while (l10 < 0L);
                break;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("i", (Object)illegalArgumentException, (long)-3036876067557676712L, (long)l10);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public synchronized Object clone() {
        long l10 = a ^ 0x2AD33F205971L;
        long l11 = l10 ^ 0x18FD29B11874L;
        int n10 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        return new g1((byte)n10, l12, this);
    }

    @Override
    public synchronized boolean containsValue(Object object) {
        boolean bl2;
        block8: {
            long l10 = a ^ 0x2F02789B5221L;
            int n10 = m44.a("r", (Object)this, (long)-2771953298638206585L, (long)l10).size();
            CallSite callSite = m44.a("l", (long)-2625008945461672540L, (long)l10);
            int n11 = 0;
            while (n11 < n10) {
                block7: {
                    block9: {
                        lq0 lq02 = (lq0)m44.a("r", (Object)this, (long)-2771953298638206585L, (long)l10).get(n11);
                        try {
                            try {
                                try {
                                    if (callSite != null) break block7;
                                    bl2 = lq02.D().equals(object);
                                    if (callSite != null) break block8;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)-4505928827302248971L, (long)l10);
                                }
                                if (!bl2) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)-4505928827302248971L, (long)l10);
                            }
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-4505928827302248971L, (long)l10);
                        }
                    }
                    ++n11;
                }
                if (callSite == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public synchronized Collection values() {
        long l10 = a ^ 0x49923CE6C5A5L;
        long l11 = l10 ^ 0x4B7B0A5DC04EL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return m44.a("i", (Object)this, (Object)objectArray, (long)6051113168937135724L, (long)l10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public g1(byte by2, long l10, g1 g12) {
        long l11;
        long l12 = l11 = ((long)by2 << 56 | l10 << 8 >>> 8) ^ a;
        long l13 = l12 ^ 0x457571AFC4A0L;
        int n10 = (int)(l13 >>> 32);
        long l14 = l13 << 32 >>> 32;
        long l15 = l12 ^ 0x6E732AF5118CL;
        this(g12.size(), l15);
        g1 g13 = g12;
        synchronized (g13) {
            block9: {
                CallSite callSite = m44.a("j", (long)5711708154215420274L, (long)l11);
                CallSite callSite2 = m44.a("u", (Object)g12, (long)5890258965533868510L, (long)l11);
                int n11 = 0;
                block5: while (n11 < callSite2) {
                    lq0 lq02 = (lq0)m44.a("t", (Object)g12, (long)5574896829093125457L, (long)l11).get(n11);
                    Object object = lq02.S();
                    Object object2 = lq02.D();
                    lq0 lq03 = new lq0(object, n10, l14, object2);
                    try {
                        m44.a("t", (Object)this, (long)5643499065222836529L, (long)l11).put(object, lq03);
                        m44.a("t", (Object)this, (long)5574896829093125457L, (long)l11).add(lq03);
                        ++n11;
                        do {
                            CallSite callSite3 = callSite;
                            if (l10 > 0L) {
                                if (callSite3 != null) break block9;
                                callSite3 = callSite;
                            }
                            if (callSite3 == null) continue block5;
                        } while (by2 < 0);
                        break;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)6170408207921080611L, (long)l11);
                    }
                }
            }
            return;
        }
    }

    public synchronized Object remove(Object object) {
        long l10 = a ^ 0x6BBBFCFC7397L;
        Object object2 = null;
        CallSite callSite = m44.a("j", (long)-422110227027991534L, (long)l10);
        lq0 lq02 = (lq0)m44.a("t", (Object)this, (long)-346230928281795503L, (long)l10).remove(object);
        if (lq02 != null) {
            Object object3;
            block11: {
                int n10 = m44.a("t", (Object)this, (long)-558921820484032463L, (long)l10).size();
                int n11 = 0;
                while (n11 < n10) {
                    block10: {
                        lq0 lq03 = (lq0)m44.a("t", (Object)this, (long)-558921820484032463L, (long)l10).get(n11);
                        try {
                            block12: {
                                try {
                                    try {
                                        try {
                                            if (callSite != null) break block10;
                                            object3 = lq03.S();
                                            if (callSite != null) break block11;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("j", (Object)illegalArgumentException, (long)-2251240010247054269L, (long)l10);
                                        }
                                        if (!object3.equals(object)) break block12;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("j", (Object)illegalArgumentException, (long)-2251240010247054269L, (long)l10);
                                    }
                                    m44.a("t", (Object)this, (long)-558921820484032463L, (long)l10).remove(n11);
                                    if (callSite == null) break;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)-2251240010247054269L, (long)l10);
                                }
                            }
                            ++n11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)-2251240010247054269L, (long)l10);
                        }
                    }
                    if (callSite == null) continue;
                }
                object3 = lq02.D();
            }
            object2 = object3;
        }
        return object2;
    }

    public int q(Object[] objectArray) {
        int n10;
        block9: {
            block10: {
                Object object = objectArray[0];
                long l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("l", (long)-8540401843314452660L, (long)l10);
                try {
                    n10 = m44.a("r", (Object)this, (long)-8615445495243081969L, (long)l10).containsKey(object);
                    if (callSite != null) break block9;
                    if (n10 == 0) break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-7809307610693587171L, (long)l10);
                }
                int n11 = m44.a("r", (Object)this, (long)-8403586435661374609L, (long)l10).size();
                int n12 = 0;
                while (n12 < n11) {
                    CallSite callSite2;
                    block11: {
                        block12: {
                            block13: {
                                lq0 lq02 = (lq0)m44.a("r", (Object)this, (long)-8403586435661374609L, (long)l10).get(n12);
                                try {
                                    try {
                                        try {
                                            callSite2 = callSite;
                                            if (l10 < 0L) break block11;
                                            if (callSite2 != null) break block12;
                                            n10 = lq02.S().equals(object) ? 1 : 0;
                                            if (callSite != null) break block9;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("l", (Object)illegalArgumentException, (long)-7809307610693587171L, (long)l10);
                                        }
                                        if (n10 == 0) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("l", (Object)illegalArgumentException, (long)-7809307610693587171L, (long)l10);
                                    }
                                    return n12;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)-7809307610693587171L, (long)l10);
                                }
                            }
                            ++n12;
                        }
                        callSite2 = callSite;
                    }
                    if (callSite2 == null) continue;
                }
            }
            n10 = -1;
        }
        return n10;
    }

    public synchronized Set keySet() {
        long l10 = a ^ 0x390BEB69700BL;
        return m44.a("n", m44.a("p", (Object)this, (long)-527586919113586739L, (long)l10).keySet(), (long)-253007299567178159L, (long)l10);
    }

    public synchronized Object get(Object object) {
        Object object2;
        block4: {
            lq0 lq02;
            block5: {
                long l10 = a ^ 0x65F229BE4871L;
                lq02 = (lq0)m44.a("r", (Object)this, (long)-4550889039292481609L, (long)l10).get(object);
                CallSite callSite = m44.a("l", (long)-4484931337527107596L, (long)l10);
                try {
                    try {
                        object2 = lq02;
                        if (callSite != null) break block4;
                        if (object2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-2654885815761377371L, (long)l10);
                    }
                    return null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-2654885815761377371L, (long)l10);
                }
            }
            object2 = lq02.D();
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                g1.a = prr.a(-3183997363906920569L, -2853850227343628565L, MethodHandles.lookup().lookupClass()).a(221345524546481L);
                g1.d = new HashMap<K, V>(13);
                var0 = g1.a ^ 9512575976081L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u00f2b*E\u00b7\u00d9\u00f1\u00f4\u00193F0\u00e1 \u00c7\u00a6\u00d1C\u0082\u0098\u00da\u00aa\u008fp\u00bd\n\u0013d\u00a9\u00bd\u00c2\u00af\u00e3\u00c0^\u001d\u007f]-\u00ef\u0010\u00d5\u00f0\u0099`\u009c[i\u00b11\u0095\u009b\u00fd,\u00e8\u0093\u0014\u0010\u0097\u008cW\u009c\u00a5\u00ea\u00d0\u00d9\u00eb\u0092\u0084-5\u00baV\u00d5";
                var8_6 = "\u00f2b*E\u00b7\u00d9\u00f1\u00f4\u00193F0\u00e1 \u00c7\u00a6\u00d1C\u0082\u0098\u00da\u00aa\u008fp\u00bd\n\u0013d\u00a9\u00bd\u00c2\u00af\u00e3\u00c0^\u001d\u007f]-\u00ef\u0010\u00d5\u00f0\u0099`\u009c[i\u00b11\u0095\u009b\u00fd,\u00e8\u0093\u0014\u0010\u0097\u008cW\u009c\u00a5\u00ea\u00d0\u00d9\u00eb\u0092\u0084-5\u00baV\u00d5".length();
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
                    var9_3[var7_4++] = g1.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0012\u0098\u00a2\u00df\u00c5\u00cf\u0010-\u00da:\u00bc\u00fcJ\u00e6\u0012\u00c4\u008e\u00bc\u00a1\u00a3\u001c\u00e6\u0081H\u0011q\u00e7S\u00af\u00adS\u00ed\u00a7o\u00e3\u00a5\u0099\u00c5$C(OTo,\u008es,\u00ae\u0084MP\u00ea\u00ae,\u0002\u00ee\u00f7\u00d3\u007fZ2\u00eb\u00dbp\u00ffe\u00b5`\\\u0004\u00a6\u00c9\u00a1\u00b4\b\u00d5\u008e\u00f2Q\u00b9";
                    var8_6 = "\u0012\u0098\u00a2\u00df\u00c5\u00cf\u0010-\u00da:\u00bc\u00fcJ\u00e6\u0012\u00c4\u008e\u00bc\u00a1\u00a3\u001c\u00e6\u0081H\u0011q\u00e7S\u00af\u00adS\u00ed\u00a7o\u00e3\u00a5\u0099\u00c5$C(OTo,\u008es,\u00ae\u0084MP\u00ea\u00ae,\u0002\u00ee\u00f7\u00d3\u007fZ2\u00eb\u00dbp\u00ffe\u00b5`\\\u0004\u00a6\u00c9\u00a1\u00b4\b\u00d5\u008e\u00f2Q\u00b9".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = g1.a(var10_9).intern();
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
        g1.b = var9_3;
        g1.c = new String[5];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x12C7;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/g1", exception);
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
            g1.c[n11] = g1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = g1.a(n10, l10);
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
            throw new RuntimeException("com/zelix/g1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

