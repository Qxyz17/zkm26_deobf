/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m9
implements Serializable,
Comparable {
    private r V;
    private r Z;
    private r r;
    private static final long a = prr.a((long)8431004723457639534L, (long)-4657530250111975044L, MethodHandles.lookup().lookupClass()).a(74642649299378L);

    public Set A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("j", (Object)m44.a("t", (Object)this, (long)-1553416928627005992L, (long)l), (long)-1175107703278748259L, (long)l);
    }

    public boolean y(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)-7069106178418211955L, (long)l).contains(object);
    }

    public int hashCode() {
        long l = a ^ 0x5909B6C921F7L;
        return m44.a("t", (Object)this, (long)4085153474023339800L, (long)l).hashCode();
    }

    public boolean equals(Object object) {
        boolean bl;
        block2: {
            block3: {
                long l = a ^ 0x41D506D4C55AL;
                CallSite callSite = m44.a("o", (long)-2586932476405824977L, (long)l);
                try {
                    bl = object instanceof m9;
                    if (callSite != null) break block2;
                    if (!bl) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)((Object)n92), (long)-4419574614256113457L, (long)l);
                }
                m9 m92 = (m9)object;
                return m44.a("q", (Object)this, (long)-2586058304362851403L, (long)l).equals(m44.a("q", (Object)m92, (long)-2586058304362851403L, (long)l));
            }
            bl = false;
        }
        return bl;
    }

    public m9(r r2, long l, r r3) {
        long l2 = (l = a ^ l) ^ 0x1A31DDA7A718L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("v", (Object)this, (r)m44.a("j", (Object)objectArray, (long)8153580591679750010L, (long)l), (long)7958217202757231064L, (long)l);
        m44.a("t", (Object)this, (long)7958217202757231064L, (long)l).addAll((Collection)r2);
        CallSite callSite = m44.a("j", (long)7959095652596019266L, (long)l);
        m44.a("v", (Object)this, (r)r3, (long)7642348256726742119L, (long)l);
        CallSite callSite2 = callSite;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("v", (Object)this, (r)m44.a("j", (Object)objectArray2, (long)8153580591679750010L, (long)l), (long)8519068162711617998L, (long)l);
        Iterator iterator = m44.a("t", (Object)this, (long)7958217202757231064L, (long)l).iterator();
        while (iterator.hasNext()) {
            r r4 = (r)iterator.next();
            m44.a("t", (Object)this, (long)8519068162711617998L, (long)l).addAll((Collection)r4);
            if (callSite2 == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List m(Object[] objectArray) {
        ArrayList<CallSite> arrayList;
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x124CE8FC0E4CL;
        ArrayList<CallSite> arrayList2 = new ArrayList<CallSite>(m44.a("t", (Object)this, (long)3441070048943480936L, (long)l).size());
        Iterator iterator = m44.a("t", (Object)this, (long)3441070048943480936L, (long)l).iterator();
        CallSite callSite = m44.a("j", (long)3441882373101924850L, (long)l);
        block2: while (iterator.hasNext()) {
            r r2 = (r)iterator.next();
            try {
                do {
                    arrayList = arrayList2;
                    CallSite callSite2 = callSite;
                    if (l > 0L) {
                        if (callSite2 != null) return arrayList;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        callSite2 = m44.a("u", (Object)r2, (Object)objectArray2, (long)3118144949864362501L, (long)l);
                    }
                    arrayList.add(callSite2);
                    if (callSite == null) continue block2;
                } while (l <= 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("j", (Object)((Object)n92), (long)3564562940372572946L, (long)l);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public boolean L(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)-2503765829499049289L, (long)l).contains(object);
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)-8277595538137775479L, (long)l).size();
    }

    public m9 F(Object[] objectArray) {
        block6: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            m9 m92;
            long l2;
            block5: {
                l2 = (Long)objectArray[0];
                m92 = (m9)objectArray[1];
                long l3 = l2 = a ^ l2;
                long l4 = l3 ^ 0x20E01A911304L;
                l = l3 ^ 0x3059EB9145EEL;
                callSite2 = m44.a("n", (Object)new Object[]{m44.a("p", (Object)this, (long)4099153409860413067L, (long)l2)}, (long)4269363996200426259L, (long)l2);
                CallSite callSite3 = m44.a("n", (long)4366360934480683694L, (long)l2);
                try {
                    try {
                        m44.a("q", (Object)callSite2, (Object)m44.a("p", (Object)m92, (long)4099153409860413067L, (long)l2), (long)4583745635670732267L, (long)l2);
                        callSite = callSite2;
                        if (callSite3 != null) break block5;
                        if (callSite.size() > 0) {
                        }
                        break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)2462260569606703182L, (long)l2);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = m44.a("p", (Object)this, (long)4367727550331695924L, (long)l2);
                    objectArray2[0] = l4;
                    callSite = m44.a("n", (Object)objectArray2, (long)2396013938167706348L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)2462260569606703182L, (long)l2);
                }
            }
            CallSite callSite4 = callSite;
            callSite4.addAll((Collection)((Object)m44.a("p", (Object)m92, (long)4367727550331695924L, (long)l2)));
            m9 m93 = new m9((r)callSite4, l, (r)callSite2);
            return m93;
        }
        return null;
    }

    public Set i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("m", (Object)m44.a("s", (Object)this, (long)-5271352689765242704L, (long)l), (long)-5231430438011935414L, (long)l);
    }

    public m9(long l, r r2) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x1F10226213D1L;
        long l4 = l2 ^ 0x28B09BDEF521L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("w", (Object)this, (r)m44.a("k", (Object)objectArray, (long)-4184315225676018765L, (long)l), (long)-2686325433108343535L, (long)l);
        m44.a("u", (Object)this, (long)-2686325433108343535L, (long)l).add(r2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = r2;
        objectArray2[0] = l4;
        m44.a("w", (Object)this, (r)m44.a("k", (Object)objectArray2, (long)-4078764088672316215L, (long)l), (long)-2394201832256683858L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = r2;
        objectArray3[0] = l4;
        m44.a("w", (Object)this, (r)m44.a("k", (Object)objectArray3, (long)-4078764088672316215L, (long)l), (long)-4399794209129646841L, (long)l);
    }

    public int g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)5351716095184524333L, (long)l).size();
    }

    public int compareTo(Object object) {
        long l = a ^ 0x63E3E4C8D261L;
        long l2 = l ^ 0x5EEC3D6FAED6L;
        Object[] objectArray = new Object[2];
        objectArray[1] = (m9)object;
        objectArray[0] = l2;
        return (int)m44.a("s", (Object)this, (Object)objectArray, (long)-3847461316411872866L, (long)l);
    }

    public r R(Object[] objectArray) {
        CallSite callSite;
        block7: {
            m9 m92 = (m9)objectArray[0];
            long l = (Long)objectArray[1];
            long l2 = (l = a ^ l) ^ 0x73F23EDDAA57L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            CallSite callSite2 = m44.a("m", (Object)objectArray2, (long)8964484992661795381L, (long)l);
            CallSite callSite3 = m44.a("s", (Object)m92, (long)7151203433272667287L, (long)l);
            CallSite callSite4 = m44.a("m", (long)7150320448334298381L, (long)l);
            Iterator iterator = m44.a("s", (Object)this, (long)7151203433272667287L, (long)l).iterator();
            while (iterator.hasNext()) {
                block8: {
                    r r2 = (r)iterator.next();
                    try {
                        boolean bl;
                        try {
                            try {
                                callSite = callSite3;
                                if (callSite4 != null) break block7;
                                bl = callSite.contains(r2);
                                if (callSite4 != null) break block8;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)((Object)n92), (long)9045708841482426349L, (long)l);
                            }
                            if (bl) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)((Object)n93), (long)9045708841482426349L, (long)l);
                        }
                        bl = callSite2.add(r2);
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)((Object)n94), (long)9045708841482426349L, (long)l);
                    }
                }
                if (callSite4 == null) continue;
            }
            callSite = callSite2;
        }
        return callSite;
    }

    /*
     * Unable to fully structure code
     */
    public r W(Object[] var1_1) {
        block14: {
            block13: {
                block12: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = (m9)var1_1[1];
                    var5_4 = (var2_2 = m9.a ^ var2_2) ^ 80888292874059L;
                    v0 = new Object[1];
                    v0[0] = var5_4;
                    var8_5 = m44.a("i", (Object)v0, (long)4716401279566745385L, (long)var2_2);
                    var7_6 = m44.a("i", (long)6784445184597180433L, (long)var2_2);
                    try {
                        v1 = m44.a("w", (Object)this, (long)6783010107542098315L, (long)var2_2);
                        if (var7_6 != null) break block12;
                        if (v1.size() > m44.a("w", (Object)var4_3, (long)6783010107542098315L, (long)var2_2).size()) {
                        }
                        ** GOTO lbl25
                    }
                    catch (n9 v2) {
                        throw m44.a("i", (Object)v2, (long)4653601740908702449L, (long)var2_2);
                    }
                    var9_7 = m44.a("w", (Object)var4_3, (long)6783010107542098315L, (long)var2_2);
                    v1 = m44.a("w", (Object)this, (long)6783010107542098315L, (long)var2_2);
                    if (var2_2 <= 0L) break block12;
                    var10_8 = v1;
                    try {
                        if (var7_6 == null) break block13;
lbl25:
                        // 2 sources

                        v1 = m44.a("w", (Object)this, (long)6783010107542098315L, (long)var2_2);
                    }
                    catch (n9 v3) {
                        throw m44.a("i", (Object)v3, (long)4653601740908702449L, (long)var2_2);
                    }
                }
                var9_7 = v1;
                var10_8 = m44.a("w", (Object)var4_3, (long)6783010107542098315L, (long)var2_2);
            }
            var11_9 = var9_7.iterator();
            while (var11_9.hasNext()) {
                block15: {
                    var12_10 = (r)var11_9.next();
                    try {
                        try {
                            try {
                                v4 = var10_8;
                                if (var7_6 != null) break block14;
                                v5 = v4.contains(var12_10);
                                if (var7_6 != null) break block15;
                            }
                            catch (n9 v6) {
                                throw m44.a("i", (Object)v6, (long)4653601740908702449L, (long)var2_2);
                            }
                            if (!v5) break block15;
                        }
                        catch (n9 v7) {
                            throw m44.a("i", (Object)v7, (long)4653601740908702449L, (long)var2_2);
                        }
                        v5 = var8_5.add(var12_10);
                    }
                    catch (n9 v8) {
                        throw m44.a("i", (Object)v8, (long)4653601740908702449L, (long)var2_2);
                    }
                }
                if (var7_6 == null) continue;
            }
            v4 = var8_5;
        }
        return v4;
    }

    public int W(Object[] objectArray) {
        Object object;
        block20: {
            block21: {
                Object object2;
                block24: {
                    CallSite callSite;
                    long l;
                    block22: {
                        CallSite callSite2;
                        long l2;
                        m9 m92;
                        block23: {
                            block18: {
                                long l3;
                                block19: {
                                    l = (Long)objectArray[0];
                                    m92 = (m9)objectArray[1];
                                    long l4 = l = a ^ l;
                                    l2 = l4 ^ 0x4F47BCFF2BCAL;
                                    l3 = l4 ^ 0x17C05583E8D1L;
                                    callSite2 = m44.a("h", (long)8283843113974262976L, (long)l);
                                    try {
                                        try {
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l3;
                                            object = m44.a("w", (Object)this, (Object)objectArray2, (long)8171539718254350456L, (long)l);
                                            Object[] objectArray3 = new Object[1];
                                            objectArray3[0] = l3;
                                            callSite = m44.a("w", (Object)m92, (Object)objectArray3, (long)8171539718254350456L, (long)l);
                                            if (callSite2 != null) break block18;
                                            if (object >= callSite) break block19;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("h", (Object)((Object)n92), (long)7801859356446066208L, (long)l);
                                        }
                                        return -1;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)((Object)n93), (long)7801859356446066208L, (long)l);
                                    }
                                }
                                try {
                                    Object[] objectArray4 = new Object[1];
                                    objectArray4[0] = l3;
                                    object = m44.a("w", (Object)this, (Object)objectArray4, (long)8171539718254350456L, (long)l);
                                    if (callSite2 != null) break block20;
                                    Object[] objectArray5 = new Object[1];
                                    objectArray5[0] = l3;
                                    callSite = m44.a("w", (Object)m92, (Object)objectArray5, (long)8171539718254350456L, (long)l);
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)((Object)n94), (long)7801859356446066208L, (long)l);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (l >= 0L) {
                                            if (object != callSite) break block21;
                                            Object[] objectArray6 = new Object[1];
                                            objectArray6[0] = l2;
                                            object2 = m44.a("w", (Object)this, (Object)objectArray6, (long)8013656522706742046L, (long)l);
                                            Object[] objectArray7 = new Object[1];
                                            objectArray7[0] = l2;
                                            callSite = m44.a("w", (Object)m92, (Object)objectArray7, (long)8013656522706742046L, (long)l);
                                        }
                                        if (l < 0L || callSite2 != null) break block22;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("h", (Object)((Object)n95), (long)7801859356446066208L, (long)l);
                                    }
                                    if (object2 >= callSite) break block23;
                                }
                                catch (n9 n96) {
                                    throw m44.a("h", (Object)((Object)n96), (long)7801859356446066208L, (long)l);
                                }
                                return -1;
                            }
                            catch (n9 n97) {
                                throw m44.a("h", (Object)((Object)n97), (long)7801859356446066208L, (long)l);
                            }
                        }
                        try {
                            Object[] objectArray8 = new Object[1];
                            objectArray8[0] = l2;
                            object2 = m44.a("w", (Object)this, (Object)objectArray8, (long)8013656522706742046L, (long)l);
                            if (callSite2 != null) break block24;
                            Object[] objectArray9 = new Object[1];
                            objectArray9[0] = l2;
                            callSite = m44.a("w", (Object)m92, (Object)objectArray9, (long)8013656522706742046L, (long)l);
                        }
                        catch (n9 n98) {
                            throw m44.a("h", (Object)((Object)n98), (long)7801859356446066208L, (long)l);
                        }
                    }
                    try {
                        if (object2 == callSite) {
                            return 0;
                        }
                    }
                    catch (n9 n99) {
                        throw m44.a("h", (Object)((Object)n99), (long)7801859356446066208L, (long)l);
                    }
                    object2 = 1;
                }
                return object2;
            }
            object = true;
        }
        return (int)object;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
