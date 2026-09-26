/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.b0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o9;
import com.zelix.prr;
import com.zelix.sr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Vector;

public class s9
extends sr {
    b0[] i;
    int s;
    private static final long a = prr.a((long)6818736354993559190L, (long)-4647210856190452804L, MethodHandles.lookup().lookupClass()).a(249379918386821L);

    public String y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x1501F8CF4973L;
        CallSite callSite = m44.a("r", (Object)((Object)this), (long)379566492047418090L, (long)l);
        s9 s92 = this;
        CallSite callSite2 = m44.a("r", (Object)((Object)s92), (long)1800420404873535212L, (long)l);
        m44.a("p", (Object)((Object)s92), (int)(callSite2 + true), (long)1800420404873535212L, (long)l);
        return callSite[callSite2].d(l2);
    }

    public b0 t(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return m44.a("v", (Object)((Object)this), (long)8119992962311706398L, (long)l)[n];
    }

    public boolean e(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("m", (long)5889717833276666352L, (long)l);
                try {
                    try {
                        object = m44.a("s", (Object)((Object)this), (long)6252531642439979221L, (long)l);
                        if (callSite != null) break block4;
                        if (object >= m44.a("s", (Object)((Object)this), (long)6275327312901536272L, (long)l)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)5447574470048000050L, (long)l);
                    }
                    object = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)5447574470048000050L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public s9(String string, _4 _42, b0[] b0Array, o9 o92, long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x54B97330EBF1L;
        long l4 = l3 >>> 8;
        int n = (int)(l3 << 56 >>> 56);
        long l5 = l2 ^ 0x6881F388DC99L;
        super(string, l4, _42, (byte)n, o92);
        Object[] objectArray = new Object[2];
        objectArray[1] = l5;
        objectArray[0] = b0Array;
        m44.a("v", (Object)((Object)this), (Object)objectArray, (long)-6145714927222027641L, (long)l);
    }

    void w(Object[] objectArray) {
        block7: {
            long l;
            s9 s92;
            long l2;
            block9: {
                Object object;
                long l3;
                block8: {
                    b0[] b0Array = (b0[])objectArray[0];
                    l2 = (Long)objectArray[1];
                    long l4 = l2 = a ^ l2;
                    l3 = l4 ^ 0x168BE958000AL;
                    long l5 = l4 ^ 0x29A50FCB3123L;
                    int n = b0Array.length;
                    CallSite callSite = m44.a("l", (long)3928559512419653321L, (long)l2);
                    Vector<b0> vector = new Vector<b0>(n);
                    for (int i = 0; i < n; ++i) {
                        try {
                            try {
                                if (l2 <= 0L) break block7;
                                object = b0Array;
                                if (callSite != null) break block8;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l5;
                                if (m44.a("s", (Object)object[i], (Object)objectArray2, (long)2931940230725512256L, (long)l2) == false) continue;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)((Object)n92), (long)3215811183912079115L, (long)l2);
                            }
                            vector.addElement(b0Array[i]);
                            continue;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)((Object)n93), (long)3215811183912079115L, (long)l2);
                        }
                    }
                    m44.a("p", (Object)((Object)this), (int)vector.size(), (long)3472002447016271145L, (long)l2);
                    m44.a("p", (Object)((Object)this), (b0[])new b0[m44.a("r", (Object)((Object)this), (long)3472002447016271145L, (long)l2)], (long)3189707576858151914L, (long)l2);
                    m44.a("s", vector, (Object)m44.a("r", (Object)((Object)this), (long)3189707576858151914L, (long)l2), (long)3950525605512649172L, (long)l2);
                    s92 = this;
                    l = 3189707576858151914L;
                    if (l2 <= 0L) break block9;
                    object = m44.a("r", (Object)((Object)s92), (long)l, (long)l2);
                }
                m44.a("l", (Object)object, (long)3716605545042966686L, (long)l2);
                m44.a("p", (Object)((Object)this), null, (long)3701967657950185781L, (long)l2);
                s92 = this;
                l = l3;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l;
            m44.a("s", (Object)((Object)s92), (Object)objectArray3, (long)2889158203972001790L, (long)l2);
        }
    }

    public void V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        b0[] b0Array = (b0[])objectArray[1];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x5500C0C42B73L;
        long l4 = l2 ^ 0x16515F59EA1CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = b0Array;
        m44.a("s", (Object)((Object)this), (Object)objectArray2, (long)-7191274414442497022L, (long)l);
        this.I();
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        m44.a("s", (Object)((Object)this), (Object)objectArray3, (long)-8805523134543441739L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int E(Object[] objectArray) {
        block13: {
            CallSite callSite;
            block12: {
                Object object;
                CallSite callSite2;
                long l;
                block10: {
                    b0 b02;
                    block11: {
                        b02 = (b0)objectArray[0];
                        l = (Long)objectArray[1];
                        long l2 = l = a ^ l;
                        long l3 = l2 ^ 0x4664F23A3811L;
                        long l4 = l2 ^ 0x70E1081287B9L;
                        callSite2 = m44.a("k", (long)300102818629772390L, (long)l);
                        try {
                            object = m44.a("u", (Object)((Object)this), (long)130364811931237274L, (long)l);
                            if (callSite2 != null) break block10;
                            if (object != null) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)((Object)n92), (long)2166225752843550116L, (long)l);
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l4;
                        objectArray2[0] = (int)((double)m44.a("u", (Object)((Object)this), (long)180186002859831174L, (long)l) * 1.5);
                        m44.a("w", (Object)((Object)this), (Map)((Object)m44.a("k", (Object)objectArray2, (long)250016612881368728L, (long)l)), (long)130364811931237274L, (long)l);
                        int n = 0;
                        block6: while (n < m44.a("u", (Object)((Object)this), (long)180186002859831174L, (long)l)) {
                            try {
                                do {
                                    if (l > 0L) {
                                        object = m44.a("u", (Object)((Object)this), (long)130364811931237274L, (long)l).put(m44.a("u", (Object)((Object)this), (long)2227944567620286789L, (long)l)[n], m44.a("u", (Object)((Object)this), (long)315139780778944877L, (long)l).e(l3, n));
                                        if (callSite2 != null) break block10;
                                        ++n;
                                    }
                                    if (callSite2 == null) continue block6;
                                } while (l <= 0L);
                                break;
                            }
                            catch (n9 n93) {
                                throw m44.a("k", (Object)((Object)n93), (long)2166225752843550116L, (long)l);
                            }
                        }
                    }
                    object = m44.a("u", (Object)((Object)this), (long)130364811931237274L, (long)l).get(b02);
                }
                CallSite callSite3 = object;
                try {
                    callSite = callSite3;
                    if (callSite2 != null) break block12;
                    if (callSite == null) break block13;
                }
                catch (n9 n94) {
                    throw m44.a("k", (Object)((Object)n94), (long)2166225752843550116L, (long)l);
                }
                callSite = callSite3;
            }
            return (Integer)((Object)callSite);
        }
        return -1;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
